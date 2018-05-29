<body onload="newDoc()">
<?php
$servername = "localhost";
$username = "root";
$password = "";
$dbname = "CS230_Assignment3";

try {
   $conn = new PDO("mysql:host=$servername;dbname=$dbname", $username, $password);
   $conn->setAttribute(PDO::ATTR_ERRMODE, PDO::ERRMODE_EXCEPTION);

   $sql = "DROP TABLE eBook_MetaData";

   $conn->exec($sql);
   echo "Table deleted successfully";
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
