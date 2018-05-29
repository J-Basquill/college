<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>CS230 Assignment 4</title>
    <link rel="stylesheet" href="index.css">
</head>
<body >

<?php
function console_log( $data ){
  echo '<script>';
  echo 'console.log('. json_encode( $data ) .')';
  echo '</script>';
}
    $servername = "localhost";
    $username = "root";
    $password = "";
    $dbname = "CS230_Assignment4";


    try {
        $conn = new PDO("mysql:host=$servername;dbname=$dbname", $username, $password);
        $conn->setAttribute(PDO::ATTR_ERRMODE, PDO::ERRMODE_EXCEPTION);


        $stmt = $conn->prepare("SELECT id, imgPath, answer1, answer2 FROM imageAnswer");


        $stmt->execute();

        $result1 = $stmt->fetchAll(PDO::FETCH_ASSOC);
        console_log($result1);
        $randN = array_rand($result1,5);
        console_log($randN);
        foreach($randN as $q){
                    $img = $result1[$q]['imgPath'];
                    $ans = $result1[$q]['answer2'];
                    echo '<div id="div'.$q.'"><img id = "q" src="'.$img.'" />';
                       foreach($result1 as $row) {
                            $name = $row["answer2"];
                            echo '<input onclick="myFunction'.$q.'(this.value)" name= "q'.$q.'" type="radio" value='.$name.'>'.$name.'';

                       }

                    echo '<script>
                          function myFunction'.$q.'(browser,ans) {
                              console.log(browser);
                              var ans = "'.$ans.'";
                              if(browser==ans){
                                  document.getElementById("demo").innerText++;
                              }
                          }
                          </script></div><br>';
        }

    }
    catch(PDOException $e) {
        echo "Error: " . $e->getMessage();
    }
    $conn = null;
?>

    <h1 id="demo">0<h1>

</body>
</html>
