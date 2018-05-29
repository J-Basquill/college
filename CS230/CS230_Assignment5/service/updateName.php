<?php
$servername = "localhost";
$username = "root";
$password = "";
$dbname = "test";

$json = json_decode($_POST["q"]) ;

$upd = $json->id;
$newValue = $json->name;

try {
    $conn = new PDO("mysql:host=$servername;dbname=$dbname", $username, $password);
    $conn->setAttribute(PDO::ATTR_ERRMODE, PDO::ERRMODE_EXCEPTION);

    $stmt= $conn->prepare("UPDATE reading_list_item SET name =:newValue WHERE id=:upd");

    $stmt->bindParam(":upd", $upd);
    $stmt->bindParam(":newValue", $newValue);

    // execute the query
    $stmt->execute();

    // echo a message to say the UPDATE succeeded
    echo $stmt->rowCount() . " records UPDATED successfully";
    }
catch(PDOException $e)
    {
    echo "Error: " . $e->getMessage();
    }

$conn = null;
?>
