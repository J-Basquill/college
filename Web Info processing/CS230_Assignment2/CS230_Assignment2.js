function init(){
    sArr = document.getElementsByClassName('score');
    sArrLen = sArr.length;
    nArr = document.getElementsByClassName("name");
    nArrLen = nArr.length;
    table = document.getElementById("table");
    missed = document.getElementById("missing");
    demo = document.getElementById("demo");
    rows = table.rows;
    numRows = 2;
    numCols = 4;
    makeCE();
    rowEL();
    colEL();
}

function makeCE(){
    for(var i = 0; i<sArrLen;i++){
        sArr[i].contentEditable="true";
    }
    for(var i = 0; i<nArrLen;i++){
        nArr[i].contentEditable="true";
    }
}

function rowEL(){
    for (var r = numRows-1; r < rows.length; r++) {
        var cells = table.rows[r].cells;
        cells[0].addEventListener("click", function(e){
            for(var i=1;i<rows.length;i++){
                if(i===r-1){
                    table.rows[i].classList.toggle("highlight");
                }else{
                    table.rows[i].classList.remove("highlight")
                }
            }
        } );
    }
}

function colEL(){
    var cells = table.rows[0].cells;
    for(var c = numCols-2;c<cells.length-1;c++){
        cells[c].addEventListener("click", function(e){
            for(var i=2;i<cells.length-1;i++){
                if(i==c-1){
                    console.log(i+"==c");
                    for(var r = 0; r<rows.length;r++){
                        table.rows[r].cells[i].classList.toggle("highlight2");
                    }
                }else{
                    console.log(i+"!=c")
                    for(var r = 0; r<rows.length;r++){
                        table.rows[r].cells[i].classList.remove("highlight2");
                    }
                }
            }

        });
    }

}

function missingAssign(){
    var missCount = 0;
    for(var r = 1;r<rows.length;r++){
        var cells = table.rows[r].cells;
        for(var c=0;c<cells.length;c++){
            if(cells[c].className.includes("score")){
                var cell = table.rows[r].cells[c];
                if(cell.innerHTML=="-"){
                    missCount++;
                }
            }
        }
    }
    missed.innerHTML="Total Missed Assignments: "+missCount;
}

function rando(){
    for(var r = 1;r<rows.length;r++){
        var cells = table.rows[r].cells;
        for(var c=0;c<cells.length;c++){
            if(cells[c].className.includes("score")){
                var cell = table.rows[r].cells[c];
                var rand = Math.floor((Math.random() * 140) -20);
                cell.innerHTML=rand;
            }else if(cells[c].className.includes("name")){
                var cell = table.rows[r].cells[c];
                var rand = Math.floor((Math.random() * 9000)+1000);
                cell.innerHTML=rand;
            }
        }
    }
    calc();
    missingAssign();
    generateCSV();
}

function calc(){
    for(var r = 1;r<rows.length;r++){
        var cells = table.rows[r].cells;
        var ans =0;
        for(var c=0;c<cells.length;c++){
            if(cells[c].className.includes("score")){
                var cell = table.rows[r].cells[c];
                if(isNaN((cell.innerHTML))){
                    cell.innerHTML="-";
                    cell.classList.add("miss");
                }else if (cell.innerHTML<0||cell.innerHTML>100) {
                    cell.innerHTML="-";
                    cell.classList.add("miss");
                }else{
                    ans+=parseInt(cell.innerHTML);
                    cell.classList.remove("miss");
                }
            }
        }
        var numAssign = numCols-3;
        ans = Math.round(ans/numAssign);
        cells[cells.length-1].innerHTML=ans+"%";
        if(ans<40){
            cells[cells.length-1].classList.add("fail");
        }else{
            cells[cells.length-1].classList.remove("fail");
        }
    }
}

function addRow(){
    var newRow = table.insertRow(numRows);
    numRows++;
    for(var i=0;i<numCols;i++){
        var newCell = newRow.insertCell();
        newCell.innerHTML="-";
        newCell.contentEditable=true;
        if(i==0) {
            newCell.classList.add("name");
            newCell.innerHTML="-";
          //  newCell.addEventListener("click", function(){highlightRow(numRows-1) });
        }else if(i==1){
            newCell.classList.add("name");
            newCell.innerHTML="-";
        }else if(i==numCols-1){
            newCell.classList.add("result");
            newCell.innerHTML="-";
        }else{
            newCell.classList.add("score");
            newCell.innerHTML="-";
        }
    }
    rowEL();
}

function deleteSelectRow(){
  for(var r=0; r<rows.length;r++){
    if(table.rows[r].classList.contains("highlight")){
      table.deleteRow(r);
      numRows--;
    }
  }
  for(var r=1;r<rows.length;r++){
      var cells = table.rows[r].cells;
      cells[0].removeEventListener();
  }
}

function deleteRow(){
    table.deleteRow(numRows-1);
    numRows--;
}

function deleteCol(){
    for(var r = 0;r<rows.length;r++){
        rows[r].deleteCell(numCols-2);
    }
    numCols--;
}

function addCol(){
    for(var r = 0;r<rows.length;r++){
        if(r==0){
            var newCell = document.createElement("th");
            newCell.innerHTML="Assignment " +(numCols-2);
            rows[r].insertBefore(newCell, rows[r].cells[numCols-1])
        }else{
            var newCell = rows[r].insertCell(numCols-1);
            newCell.contentEditable=true;
            newCell.classList.add("score");
            newCell.innerHTML="-";
        }
    }
    numCols++;
    colEL();
}

// function generateCSV(){
//     var tData = table.innerHTML;
//     var text = document.getElementById("text");
//     tData=tData.replace(/\n/g, "");
//     while(tData.charAt(tData.length-1)==">"){
//   //  for(var i=0;i<100;i++){
//         var tag1 = tData.indexOf("<");
//         var tag2 = tData.indexOf(">");
//         var tag = tData.slice(tag1,tag2+1);
//         var replace = new RegExp(tag, "g");
//         if(tag=="</tr>"){
//             tData = tData.replace(replace,"\n");
//
//         }else if(tag=="</td>"||tag=="</th>"){
//             tData = tData.replace(replace,";");
//         }else{
//             tData = tData.replace(replace,"");
//         }
//     }
//
//     text.innerHTML=tData.trim();
//     text.style.display="block";
//}

function setCookie(cname, cvalue, exdays) {
    var d = new Date();
    d.setTime(d.getTime() + (exdays*24*60*60*1000));
    var expires = "expires="+ d.toUTCString();
    document.cookie = cname + "=" + cvalue + ";" + expires + ";path=/";
}

function setSizeCookie(){
    setCookie("tRows", numRows, 5);
    setCookie("tCols", numCols, 5);
    storeData();
}

function getCookie(cname) {
    var name = cname + "=";
    var decodedCookie = decodeURIComponent(document.cookie);
    var ca = decodedCookie.split(';');
    for(var i = 0; i <ca.length; i++) {
        var c = ca[i];
        while (c.charAt(0) == ' ') {
            c = c.substring(1);
        }
        if (c.indexOf(name) == 0) {
            return c.substring(name.length, c.length);
        }
    }
    return "";
}

function restoreTable(){
    if(numRows<getCookie("tRows")){
        for(; numRows<(getCookie("tRows"));){
            addRow();
        }
    }else if(numRows>getCookie("tRows")){
        for(; numRows>(getCookie("tRows"));){
            deleteRow();
        }
    }
    if(numCols<getCookie("tCols")){
        for(; numCols<(getCookie("tCols"));){
            addCol();
        }
    }else if(numCols>getCookie("tCols")){
        for(; numCols>(getCookie("tCols"));){
            deleteCol();
        }
    }
    restoreData();
}

function storeData(){
    var cookieCounter = 0;
    for(var r = 0;r<rows.length;r++){
        var cells = table.rows[r].cells;
        for(var c=0;c<cells.length-1;c++){
            var cell = table.rows[r].cells[c].innerHTML;
            setCookie(cookieCounter,cell, 5);
            cookieCounter++;
        }
    }
    setCookie("dRows",rows.length,5);
    setCookie("dCols", cells.length, 5);
}

function restoreData(){
    var cookieCounter = 0;
    for(var r = 0;r<getCookie("dRows");r++){
        var cells = table.rows[r].cells;
        for(var c=0;c<getCookie("dCols")-1;c++){
            var cell = table.rows[r].cells[c];
            cell.innerHTML= getCookie(cookieCounter);
            cookieCounter++;
        }
    }
    calc();
    missingAssign();
    generateCSV();
}



