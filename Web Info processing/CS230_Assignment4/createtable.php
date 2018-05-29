<body onload="newDoc()">
<?php
$servername = "localhost";
$username = "root";
$password = "";
$dbname = "CS230_Assignment4";

try {
    $conn = new PDO("mysql:host=$servername;dbname=$dbname", $username, $password);
    $conn->setAttribute(PDO::ATTR_ERRMODE, PDO::ERRMODE_EXCEPTION);

    $sql = "CREATE TABLE imageAnswer (id INT(6) UNSIGNED AUTO_INCREMENT PRIMARY KEY,imgPath TEXT NOT NULL,answer1 TEXT NOT NULL,answer2 TEXT NOT NULL)";

    $conn->exec($sql);
    echo "Table imageAnswer created successfully";

    }catch(PDOException $e){
        echo "failure" . "<br>" . $e->getMessage();
    }

$conn = null;
?>
</body>

<script>
function newDoc() {
    window.location.assign('/insert.php')
}
</script>
