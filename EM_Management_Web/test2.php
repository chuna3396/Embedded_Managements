<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>Document</title>
	

	<link rel="stylesheet" type="text/css" href="mystyle.css">
	
	<link rel="stylesheet" type="text/css" href="styletaoduan.css">
	
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
  	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<style>
/* Full-width input fields */
input[type=text], input[type=password] {
    width: 100%;
    padding: 12px 20px;
    margin: 8px 0;
    display: inline-block;
    border: 1px solid #ccc;
    box-sizing: border-box;
}

/* Set a style for all buttons */
button {
    background-color: #4CAF50;
    color: white;
    padding: 14px 20px;
    margin: 8px 0;
    border: none;
    cursor: pointer;
    width: 100%;
}

button:hover {
    opacity: 0.8;
}

/* Extra styles for the cancel button */
.cancelbtn {
    width: auto;
    padding: 10px 18px;
    background-color: #f44336;
}

/* Center the image and position the close button */
.imgcontainer {
    text-align: center;
    margin: 24px 0 12px 0;
    position: relative;
}

img.avatar {
    width: 40%;
    border-radius: 50%;
}

.container {
    padding: 16px;
	width: 40%;
	margin-left: 30%;
    border-radius: 5px;
    background-color: white;
    
}

span.psw {
    float: right;
    padding-top: 16px;
}

/* The Modal (background) */
.modal {
    display: none; /* Hidden by default */
    position: fixed; /* Stay in place */
    z-index: 1; /* Sit on top */
    left: 0;
    top: 0;
    width: 100%; /* Full width */
    height: 100%; /* Full height */
    overflow: auto; /* Enable scroll if needed */
    background-color: rgb(0,0,0); /* Fallback color */
    background-color: rgba(0,0,0,0.4); /* Black w/ opacity */
    padding-top: 60px;
}

/* Modal Content/Box */
.modal-content {
    background-color: #fefefe;
    margin: 5% auto 15% auto; /* 5% from the top, 15% from the bottom and centered */
    border: 1px solid #888;
    width: 40%; /* Could be more or less, depending on screen size */
}

/* The Close Button (x) */
.close {
    position: absolute;
    right: 25px;
    top: 0;
    color: #000;
    font-size: 35px;
    font-weight: bold;
}

.close:hover,
.close:focus {
    color: red;
    cursor: pointer;
}

/* Add Zoom Animation */
.animate {
    -webkit-animation: animatezoom 0.6s;
    animation: animatezoom 0.6s
}

@-webkit-keyframes animatezoom {
    from {-webkit-transform: scale(0)} 
    to {-webkit-transform: scale(1)}
}
    
@keyframes animatezoom {
    from {transform: scale(0)} 
    to {transform: scale(1)}
}

/* Change styles for span and cancel button on extra small screens */
@media screen and (max-width: 300px) {
    span.psw {
       display: block;
       float: none;
    }
    .cancelbtn {
       width: 70%;
    }
}
</style>
</head>
<body>

	<script>
	function myFunction() {
		document.getElementById("myDropdown").classList.toggle("show");
	}
	window.onclick = function(event) {
	  if (!event.target.matches('.dropbtn')) {

		var dropdowns = document.getElementsByClassName("dropdown-content");
		var i;
		for (i = 0; i < dropdowns.length; i++) {
		  var openDropdown = dropdowns[i];
		  if (openDropdown.classList.contains('show')) {
			openDropdown.classList.remove('show');
		  }
		}
	  }
	}
	</script>
	<div class="main">
		
		<div class="head1">
		
		</div>
		<div class="head2">
		
		
			<div class="dangnhap"  >
			<form method="post" >
			<button class="dropbtn1" name="dangnhap" > Đăng nhập </button> 
			<?php if(isset($_REQUEST['dangnhap'])){
					header('location:dangnhap.php');}?>
				</form>
			</div>
				
			
	
		</div>
		<div class="abc">
		<div class="congcu">
			<div class="maunen">
			<div class="dropdown"  ><form method="post" >
				<button class="dropbtn" name="trangchu" >Trang chủ</button>
				<?php if(isset($_REQUEST['trangchu'])){
					header('location:index.php');}?>	
					</form>				
			</div> 
			<div class="dropdown"  ><form method="post" >
				<button class="dropbtn" name="taoduan" >Tạo dự án</button>
				<?php if(isset($_REQUEST['taoduan'])){
					header('location:taoduan.php');}?>	
					</form>	
			
				
			</div>
			</div>
			<div class="ABCDE">
			<div class="chuchay">
					<td><marquee width="100%">N8Plus sẽ nghỉ Lễ vào 3 ngày 30/4, 1/5 và 2/5, kính chúc Quý Khách 1 kỳ nghỉ Lễ vui vẻ !!!</marquee></td>	
			</div>	</div>
			</div>	
				
		<div class="body">
		<div class="ABCD"><h4></h4></div>
		<form method="post">
		<center><h1>Quản lý dự án</h1></center>
		<br/>
		<div id="id01" class="modal">
  
		  <form class="modal-content animate" action="/action_page.php">
		

			<div class="container">
			  <label><b>Tài khoản</b></label>
			  <input type="text" placeholder="Enter Username" name="uname" required>

			  <label><b>Mật khẩu</b></label>
			  <input type="password" placeholder="Enter Password" name="psw" required>

			  <button type="submit">Login</button>
			  <input type="checkbox" checked="checked" value="Remember me"> 
			  <span class="psw">Forgot <a href="#">password?</a></span>
			</div>
		  </form>
		</div>
		
			<button onclick="document.getElementById('id01').style.display='block'" style="width:auto;">Login</button>
		
			
		
			<?php
				if(isset($_REQUEST['submit'])){
					$id=$_REQUEST['maduan'];
					$tenduan=$_REQUEST['tenduan'];
					$nguoiquanly=$_REQUEST['nguoiquanly'];
					$con=mysqli_connect('localhost','phantich','123','phantich');
					mysqli_set_charset($con,'utf8');
					$sql="INSERT INTO bangduan(Maduan, Tenduan, Nguoiquanly) VALUES ('".$id."',N'".$tenduan."',N'".$nguoiquanly."')";
					$result=$con->query($sql);
					if($result===true){
						header('location:taoduan.php');
					}else{
						echo"tb";
					}
					mysqli_close($con);
				}
			
			
			?>
		
		
		
		</form>
		
		</div>
		
		<div class="ass">
			
			<center>
			<br/>
			© Copyright - N8+<br/>
			<a href="https://www.facebook.com/groups/n8plus/">https://www.facebook.com/groups/n8plus/</a>
			</center>
			
		</div>
		
		<script>
		// Get the modal
		var modal = document.getElementById('id01');

		// When the user clicks anywhere outside of the modal, close it
		window.onclick = function(event) {
			if (event.target == modal) {
				modal.style.display = "none";
			}
		}
</script>
		
		
		

</body>
</html>