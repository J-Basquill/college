<body onload="newDoc()">
<?php
$servername = "localhost";
$username = "root";
$password = "";
$dbname = "CS230_Assignment3";

try {
    $conn = new PDO("mysql:host=$servername;dbname=$dbname", $username, $password);
    // set the PDO error mode to exception
    $conn->setAttribute(PDO::ATTR_ERRMODE, PDO::ERRMODE_EXCEPTION);

    $stmt= $conn->prepare("UPDATE eBook_MetaData SET identifier =:newValue WHERE id=:upd");

    $stmt->bindParam(":upd", $upd);
    $stmt->bindParam(":newValue", $newValue);

    $upd = $_POST["upd"];
    $newValue = $_POST["newValue"];


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
</body>

<script>
function newDoc() {
    window.location.assign('/index.php')
}
</script>
