<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>Embedded Management</title>
	<link rel="stylesheet" type="text/css" href="mystyle.css">
	<link rel="stylesheet" type="text/css" href="styledangnhap.css">
	
	
	<style>
		.tim{
		margin-left: 400px;
		margin-top: 10px;
		}
	
	</style>
	<style>
	.dropbtn1 {
    background-color: #014590;
    color: white;
    padding: 3px;
    font-size: 14px;
    border: 0;
    cursor: pointer;
	margin-top: 49px;
	margin-right: -5px;
}
	</style>
</head>
<body>
	<?php
	include('connection.php');
	?>
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
		<?php echo '<img src=https://172.16.199.170/image/Logo.png width="199" height="110"/>';?>
		</div>
		<div class="head2">
		
		
		
				
			
	
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
					<td><marquee width="100%">N8Plus sẽ nghỉ Lễ vào 3 ngày 30/4, 1/5 và 2/5, kính chúc Quý Khách 1 kỳ nghỉ Lễ vui vẻ !!! >>>>></marquee></td>	
			</div>	</div>
			</div>	
				
		<div class="body">
		<div class="ABCD"><h4></h4></div>
		<form method="post" action="check.php">
		<br/>
		<center><h1>Đăng nhập</h1></center>
		<br/>
		<div class="main0">
			<div class="container">
					  <form action="/action_page.php" style="border:1px solid #ccc" >
					  <center><table>
					  	<tr>
					  		<td><label for="fname">Tài Khoản</label></td>
						  </tr>
						  <tr>
					  		<td><input type="text" id="fname" name="username" placeholder="Username..."></td>
					  	</tr>
					  	<tr>
					  		<td><label for="lname">Mật khẩu</label></td>
						  </tr>
						  <tr>
					  		<td><input type="password" placeholder="Password..." name="password" required></td>
					  	</tr>
					  </table></center>

						<center><input type="submit" name="submit" value="Submit"></center>
					  </form>
					</div>
				<br/>
				
			
			</div>
			</form>

		</div>
		
		<div class="ass">
			
			<center>
			<br/>
			© Copyright - N8+<br/>
			<a href="https://www.facebook.com/groups/n8plus/">https://www.facebook.com/groups/n8plus/</a>
			</center>
			
		</div>

</body>
</html>