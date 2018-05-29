<?php

$servername = "localhost";
$username = "root";
$password = "";
$dbname = "test";

$json = json_decode($_POST["q"]) ;

$name = $json->name;
$url = $json->url;
$desc = $json->description;



try {
    $conn = new PDO("mysql:host=$servername;dbname=$dbname", $username, $password);
    $conn->setAttribute(PDO::ATTR_ERRMODE, PDO::ERRMODE_EXCEPTION);



    $stmt = $conn->prepare("INSERT INTO reading_list_item (name, url, description)
    VALUES (:name, :url, :desc)");
    $stmt->bindParam(":name", $name);
    $stmt->bindParam(":url", $url);
    $stmt->bindParam(":desc", $desc);

    $stmt -> execute();

    echo "New row inserted";

}catch(PDOException $e){
    echo "Error: " . $e->getMessage();
}

$conn = null;
?>
