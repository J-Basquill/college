<?php
$servername = "localhost";
$username = "root";
$password = "";
$dbname = "test";

$json = json_decode($_POST["q"]) ;
$del = $json->id;

try {
   $conn = new PDO("mysql:host=$servername;dbname=$dbname", $username, $password);
   $conn->setAttribute(PDO::ATTR_ERRMODE, PDO::ERRMODE_EXCEPTION);

   $stmt = $conn->prepare("DELETE FROM reading_list_item WHERE id=:del");
   $stmt->bindParam(":del", $del);
   $stmt ->execute();
   
   echo "Record deleted successfully";
   }
catch(PDOException $e)
   {
   echo $sql . "<br>" . $e->getMessage();
   }

$conn = null;
?>
