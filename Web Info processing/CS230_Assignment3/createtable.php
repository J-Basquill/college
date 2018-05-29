<body onload="newDoc()">
<?php
$servername = "localhost";
$username = "root";
$password = "";
$dbname = "CS230_Assignment3";

try {
    $conn = new PDO("mysql:host=$servername;dbname=$dbname", $username, $password);
    $conn->setAttribute(PDO::ATTR_ERRMODE, PDO::ERRMODE_EXCEPTION);

    $sql = "CREATE TABLE eBook_MetaData (id INT(6) UNSIGNED AUTO_INCREMENT PRIMARY KEY,creator VARCHAR(30) NOT NULL,title VARCHAR(30) NOT NULL,type VARCHAR(20) NOT NULL,identifier VARCHAR(50) NOT NULL,date_pub TIMESTAMP NOT NULL,language VARCHAR(20) NOT NULL,description TEXT NOT NULL)";

    $conn->exec($sql);
    echo "Table eBook_MetaData created successfully";

    }catch(PDOException $e){
        echo "failure" . "<br>" . $e->getMessage();
    }

$conn = null;
?>
</body>

<script>
function newDoc() {
    window.location.assign('/index.php')
}
</script>
