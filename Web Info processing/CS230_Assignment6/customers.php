<?php

$servername = "localhost";
$username = "root";
$password = "";
$dbname = "test";

try {
   $conn = new PDO("mysql:host=$servername;dbname=$dbname", $username, $password);
   $conn->setAttribute(PDO::ATTR_ERRMODE, PDO::ERRMODE_EXCEPTION);
   $stmt = $conn->prepare("SELECT * FROM customer_address");
   $stmt->execute();

   // set the resulting array to associative
   $result = $stmt->fetchAll(PDO::FETCH_ASSOC);
   echo json_encode($result);
}
catch(PDOException $e) {
   echo "Error: " . $e->getMessage();
}
$conn = null;
?>
