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

   // sql to delete a record
   $stmt = $conn->prepare("DELETE FROM eBook_MetaData WHERE id=:del");
   $stmt->bindParam(":del", $del);
   $del = $_POST["del"];
   // use exec() because no results are returned
   $stmt ->execute();
   echo "Record deleted successfully";
   }
catch(PDOException $e)
   {
   echo $sql . "<br>" . $e->getMessage();
   }

$conn = null;
?>
</body>

<script>
function newDoc() {
    window.location.assign('/index.php')
}
</script>
