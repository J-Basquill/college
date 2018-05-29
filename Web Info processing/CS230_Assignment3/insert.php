
<body onload="newDoc()">

 <?php
$servername = "localhost";
$username = "root";
$password = "";
$dbname = "CS230_Assignment3";

try {
    $conn = new PDO("mysql:host=$servername;dbname=$dbname", $username, $password);
    $conn->setAttribute(PDO::ATTR_ERRMODE, PDO::ERRMODE_EXCEPTION);

    $stmt = $conn->prepare("INSERT INTO eBook_MetaData (creator, title, type, identifier, date_pub, language, description)
    VALUES (:cre, :title, :type, :iden, :dPub, :lang, :desc)");
    $stmt->bindParam(":cre", $cre);
    $stmt->bindParam(":title", $title);
    $stmt->bindParam(":type", $type);
    $stmt->bindParam(":iden", $iden);
    $stmt->bindParam(":dPub", $dPub);
    $stmt->bindParam(":lang", $lang);
    $stmt->bindParam(":desc", $desc);

    $cre = $_POST["creator"];
    $title = $_POST["title"];
    $type = $_POST["type"];
    $iden = $_POST["identifier"];
    $dPub = $_POST["date"];
    $lang = $_POST["language"];
    $desc = $_POST["description"];

    $stmt -> execute();

    echo "New row inserted";

}catch(PDOException $e){
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
