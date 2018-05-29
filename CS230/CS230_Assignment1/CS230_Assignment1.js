function init(){
  sArr = document.getElementsByClassName('score');
  sArrLen = sArr.length;
  table = document.getElementById("table");
  missed = document.getElementById("missing");
  demo = document.getElementById("demo");
  rows = table.rows;
  for(var i = 0; i<sArrLen;i++){
    sArr[i].contentEditable="true";
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
      }
    }
  }
  calc();
  missingAssign();
  generateCSV();
}

function showResults(){
    for(var i = 0; i<sArrLen;i++){
      sArr[i].innerHTML = 100;
    }
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
    ans = Math.round(ans/5);
    cells[cells.length-1].innerHTML=ans+"%";
    if(ans<40){
      cells[cells.length-1].classList.add("fail");
    }else{
      cells[cells.length-1].classList.remove("fail");
    }
  }
}

function generateCSV(){
  var tData = table.innerHTML;
  var text = document.getElementById("text");
  tData=tData.replace(/\n/g, "");
  while(tData.charAt(tData.length-1)==">"){
    var tag1 = tData.indexOf("<");
    var tag2 = tData.indexOf(">");
    var tag = tData.slice(tag1,tag2+1);
    var replace = new RegExp(tag, "g");
    if(tag=="</tr>"){
      tData = tData.replace(replace,"\n");

    }else if(tag=="</td>"||tag=="</th>"){
      tData = tData.replace(replace,";");
    }else{
      tData = tData.replace(replace,"");
    }
  }

  text.innerHTML=tData.trim();
  text.style.display="block";
}
