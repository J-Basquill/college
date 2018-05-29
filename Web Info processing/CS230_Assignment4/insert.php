
<body onload="newDoc()">

 <?php
$servername = "localhost";
$username = "root";
$password = "";
$dbname = "CS230_Assignment4";

try {
    $conn = new PDO("mysql:host=$servername;dbname=$dbname", $username, $password);
    $conn->setAttribute(PDO::ATTR_ERRMODE, PDO::ERRMODE_EXCEPTION);

    $sql = "INSERT INTO imageAnswer (imgPath, answer1, answer2)VALUES ('/img/image01.jpg','Downward Facing Pigeon Pose','Adho Muka Kapotasana')";
    $conn -> exec($sql);
    $sql = "INSERT INTO imageAnswer (imgPath, answer1, answer2)VALUES ('/img/image02.jpg','Formation of a Bow','Akarna Dhanurasana')";
    $conn -> exec($sql);
    $sql = "INSERT INTO imageAnswer (imgPath, answer1, answer2)VALUES ('/img/image03.jpg','Serpent Vishnu Slept On','Ardha Padma Anantasana')";
    $conn -> exec($sql);
    $sql = "INSERT INTO imageAnswer (imgPath, answer1, answer2)VALUES ('/img/image04.jpg','Lunge Pose','Anjaneyasana')";
    $conn -> exec($sql);
    $sql = "INSERT INTO imageAnswer (imgPath, answer1, answer2)VALUES ('/img/image05.jpg','Half Revolved Belly Pose','Ardha Jathara Parivarttanas')";
    $conn -> exec($sql);
    $sql = "INSERT INTO imageAnswer (imgPath, answer1, answer2)VALUES ('/img/image06.jpg','Half Lotus Pose','Ardha Padmasana')";
    $conn -> exec($sql);
    $sql = "INSERT INTO imageAnswer (imgPath, answer1, answer2)VALUES ('/img/image07.jpg','Eight Limb Pose','Astangasana')";
    $conn -> exec($sql);
    $sql = "INSERT INTO imageAnswer (imgPath, answer1, answer2)VALUES ('/img/image08.jpg','Ancient Sage Cursed with Crooked Limbs','Astavakrasana')";
    $conn -> exec($sql);
    $sql = "INSERT INTO imageAnswer (imgPath, answer1, answer2)VALUES ('/img/image09.jpg','Bound Angle Pose','Baddha Konasana')";
    $conn -> exec($sql);
    $sql = "INSERT INTO imageAnswer (imgPath, answer1, answer2)VALUES ('/img/image10.jpg','Half Frog Side Shoulderstand Pose','Ardha Bheka Parsva Sarvangasana')";
    $conn -> exec($sql);
    $sql = "INSERT INTO imageAnswer (imgPath, answer1, answer2)VALUES ('/img/image11.jpg','Downward Facing Tree','Adho Mukha Vrksasana')";
    $conn -> exec($sql);
    $sql = "INSERT INTO imageAnswer (imgPath, answer1, answer2)VALUES ('/img/image12.jpg','Arm Balance Scorpion','Bhuja Vrischikasana')";
    $conn -> exec($sql);
    $sql = "INSERT INTO imageAnswer (imgPath, answer1, answer2)VALUES ('/img/image13.jpg','Boat Pose','Navasana')";
    $conn -> exec($sql);
    $sql = "INSERT INTO imageAnswer (imgPath, answer1, answer2)VALUES ('/img/image14.jpg','Bow Pose','Dhanurasana')";
    $conn -> exec($sql);
    $sql = "INSERT INTO imageAnswer (imgPath, answer1, answer2)VALUES ('/img/image15.jpg','Bridge Pose','Setu Bandhasanasana')";
    $conn -> exec($sql);
    $sql = "INSERT INTO imageAnswer (imgPath, answer1, answer2)VALUES ('/img/image16.jpg','Camel','Ustrasana')";
    $conn -> exec($sql);
    $sql = "INSERT INTO imageAnswer (imgPath, answer1, answer2)VALUES ('/img/image17.jpg','Half Moon Pose','Ardha Chandrasana')";
    $conn -> exec($sql);
    $sql = "INSERT INTO imageAnswer (imgPath, answer1, answer2)VALUES ('/img/image18.jpg','Headstand','Sirsasana')";
    $conn -> exec($sql);
    $sql = "INSERT INTO imageAnswer (imgPath, answer1, answer2)VALUES ('/img/image19.jpg','Tree Pose','Vrksasana')";
    $conn -> exec($sql);
    $sql = "INSERT INTO imageAnswer (imgPath, answer1, answer2)VALUES ('/img/image20.jpg','Yogic Sleep Pose','Yoganidrasana')";
    $conn -> exec($sql);
    echo "New row inserted";

}catch(PDOException $e){
    echo "Error: " . $e->getMessage();
}

$conn = null;
?>
</body>

<script>
function newDoc() {
    window.location.assign('/index.html')
}
</script>
