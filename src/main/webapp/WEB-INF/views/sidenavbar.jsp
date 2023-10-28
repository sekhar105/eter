<!DOCTYPE html>
<html>
<head>
    <meta charset='utf-8'>
    <meta http-equiv='X-UA-Compatible' content='IE=edge'>
    <title>Page Title</title>
    <meta name='viewport' content='width=device-width, initial-scale=1'>
    <script src="https://kit.fontawesome.com/a076d05399.js" crossorigin="anonymous"></script>
    <link rel="stylesheet" href="https://fonts.googleapis.com/css2?family=Material+Symbols+Outlined:opsz,wght,FILL,GRAD@24,400,0,0" />
    <link rel='stylesheet' type='text/css' media='screen' href='/sidenavbar.css'>
</head>
<style>

</style>
<body>
<div class="top-bar">

</div>

    <div class="sidebar">
        <header><a href="javascript:add()">Welcome Owner</a></header>
        <ul>
            <li><a href="#"><i class="material-symbols-outlined">home</i>Home</a></li>
            <li><a href="/empControl/allEmp" class="show-employees"><i class="material-symbols-outlined">groups</i>Employees</a></li>
            <li><a href="/salooncontroller/getAllSaloons"><i class="material-symbols-outlined">cut</i>Saollons</a></li>
             <li><a href="#">
                <i class="material-symbols-outlined">settings</i>Settings
                <ul>
                    <li><a href="#">Edit profile</a></li>
                    <li><a href="#"></a></li>
                   
                      <ul>
            </a></li>
        </ul>
    </div>
    <div>

    </div>

<script>
     $(".Employees-table").hide();
    function add(){
        alert("a");
        $('#myDiv').hide();
    }

    $(".show-employees").click(function(){
    $(".Employees-table").show();
  });
</script>

</body>
</html>