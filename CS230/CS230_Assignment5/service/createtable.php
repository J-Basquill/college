<?php
$servername = "localhost";
$username = "root";
$password = "";
$dbname = "test";

try {
    $conn = new PDO("mysql:host=$servername;dbname=$dbname", $username, $password);
    $conn->setAttribute(PDO::ATTR_ERRMODE, PDO::ERRMODE_EXCEPTION);

    $sql = "CREATE TABLE reading_list_item (id INT(6) UNSIGNED AUTO_INCREMENT PRIMARY KEY,name VARCHAR(30) NOT NULL,dateCre DATE NOT NULL,url TEXT NOT NULL,description TEXT NOT NULL)";

    $conn->exec($sql);
    echo "Table reading_list_item created successfully";

    }catch(PDOException $e){
        echo "failure" . "<br>" . $e->getMessage();
    }

$conn = null;
?>
