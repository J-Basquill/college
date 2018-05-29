<?php
$servername = "localhost";
$username = "root";
$password = "";
$dbname = "test";

try {
   $conn = new PDO("mysql:host=$servername;dbname=$dbname", $username, $password);
   $conn->setAttribute(PDO::ATTR_ERRMODE, PDO::ERRMODE_EXCEPTION);

   $sql = "DROP TABLE reading_list_item";

   $conn->exec($sql);
   echo "Table deleted successfully";
   }catch(PDOException $e){
       echo "failure" . "<br>" . $e->getMessage();
   }

$conn = null;
?>
