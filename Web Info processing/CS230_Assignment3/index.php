<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>CS230 Assignment 3</title>
    <link rel="stylesheet" href="index.css">
</head>
<body >

    <div>
        <h1>CS230 Assignment 3</h1>
        <h2>Student Name: James Paul Basquill</h2>
        <h3>Student ID: 17186285</h3>
        <form action="droptable.php" method="post">
          <input type="submit" value="Drop Table">
        </form>
        <form action="createtable.php" method="post">
          <input type="submit" value="Create Table">
        </form>

        <div id="cDiv" class="db">
            <h4>Create Database Entry</h4>
            <form action="insert.php" method="post">
                Creator: <input type="text" name="creator" required><br>
                Title: <input type="text" name="title" required><br>
                Type: <input type="text" name="type" required><br>
                Identifier: <input type="text" name="identifier" required><br>
                Date: <input type="date" name="date" required><br>
                Language: <input type="text" name="language" required><br>
                Description: <input type="text" name="description" required><br>
                <input type="submit" value="Insert Values">
            </form>
        </div>

        <div id="rDiv" class="db">
          <h4>Retrieve Database</h4>
          <?php include "retrieve.php" ?>
        </div>

        <div id="uDiv" class="db">
          <h4>Update Database Entry</h4>
            <form id="for" action="./update/creator.php" method="post">
              Update Creator of id: <input type="number" name="upd" required class="input"> with:  <input type="text" name="newValue" required><input type="submit" value="Update"><br>
            </form>
            <form id="for" action="./update/title.php" method="post">
              Update Title of id: <input type="number" name="upd" required class="input"> with:  <input type="text" name="newValue" required><input type="submit" value="Update"><br>
            </form>
            <form id="for" action="./update/type.php" method="post">
              Update Type of id: <input type="number" name="upd" required class="input"> with:  <input type="text" name="newValue" required><input type="submit" value="Update"><br>
            </form>
            <form id="for" action="./update/identifier.php" method="post">
              Update Identifier of id: <input type="number" name="upd" required class="input"> with:  <input type="text" name="newValue" required><input type="submit" value="Update"><br>
            </form>
            <form id="for" action="./update/date.php" method="post">
              Update Date of id: <input type="number" name="upd" required class="input"> with:  <input type="date" name="newValue" required><input type="submit" value="Update"><br>
            </form>
            <form id="for" action="./update/language.php" method="post">
              Update Language of id: <input type="number" name="upd" required class="input"> with:  <input type="text" name="newValue" required><input type="submit" value="Update"><br>
            </form>
            <form id="for" action="./update/description.php" method="post">
              Update Description of id: <input type="number" name="upd" required class="input"> with:  <input type="text" name="newValue" required><input type="submit" value="Update"><br>
            </form>

        </div>

        <div id="dDiv" class="db">
          <h4>Create Database Entry</h4>
            <form action="delete.php" method="post">
              Select id for the row you wish to delete:  <input type="number" name="del"><br>
              <input type="submit" value="Delete Row">
            </form>
        </div>
    </div>
</body>
</html>
