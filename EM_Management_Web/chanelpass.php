	<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>Embedded Management</title>
	
	<link rel="stylesheet" type="text/css" href="styleanhdong.css">
	<link rel="stylesheet" type="text/css" href="mystyle.css">
	<link rel="stylesheet" type="text/css" href="stylethanhvien.css">
	<link rel="stylesheet" type="text/css" href="stylelogin.css">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
  	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
	<style>
		.tim{
		margin-left: 400px;
		margin-top: 10px;
			
		}
		.taotaikhoan{
			float: left;
			margin-left: 72%;
			margin-top: 5px;
		}
		.but{
			float: right;
			width: 50%;
			height: 100px;
			margin-right: 25%;
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
		// Get the modal
		var modal = document.getElementById('id01');

		// When the user clicks anywhere outside of the modal, close it
		window.onclick = function(event) {
			if (event.target == modal) {
				modal.style.display = "none";
			}
		}
	</script>
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
		<?php echo '<img src='.$local.'/image/Logo.png width="199" height="110"/>';?>
		</div>
		<div class="head2">
		
			<div class="tim">
			<div class="container" >			  
			  <form method="post"  action='search.php'><div class="input-group">
			 <input type="text" size="45"  placeholder="Search">
			  		
				
				  </div>
			  </form>
			</div>	
			</div>
			<div class="taotaikhoan"><button onclick="document.getElementById('id02').style.display='block' "  style="width:100%;" >Tạo tài khoản</button></div>
			<div class="dangnhap">
			
			
			<button onclick="document.getElementById('id01').style.display='block' "  style="width:100%;" >Đăng nhập</button>
			</div>
			<div id="id01" class="modal">
			  <form class="modal-content animate" method="post"  action="check.php" >
				<div class="container12">
				  <label><b>Tài khoản</b></label>
				  <input type="text" placeholder="Enter Username" name="username" required>

				  <label><b>Mật khẩu</b></label>
				  <input type="password" placeholder="Enter Password" name="password" required>

				  <button type="submit" name="submit">Login</button>

				<br/><br/>
			 <button type="button" onclick="document.getElementById('id01').style.display='none'" class="cancelbtn">Cancel</button>
			<span class="psw">Chanel <a href="chanelpass.php">password?</a></span> </div>
			  </form>
			</div>
				<div id="id02" class="modal">
			  <form class="modal-content animate" method="post" action="taotaikhoan.php" >
				<div class="container12">
				  <label><b>Họ và tên: </b></label>
				  <input type="text" placeholder="Nhập tên" name="ten" required>
				<label><b>Ngày sinh: </b></label>
				  <input type="date" placeholder="Nhập tên" name="date" required>
				    <label><b>Giới tính: </b></label>
				  <left><table><tr><td><input type="radio" name="gender" value="Nam"> Nam<br>
  				 </td><td>&emsp;&emsp;&emsp;&emsp;&emsp;</td><td> <input type="radio" name="gender" value="Nữ"> Nữ<br></td></tr></table></left>
				  <label><b>Chứng minh nhân dân:</b></label>
				  <input type="number" placeholder="Chứng minh nhân dân" name="cmndd" required>
				  <label><b>Số điện thoại:</b></label>
				  <input type="number" placeholder="Số điện thoại" name="sdt" required>
				 <label><b>Email:</b></label>
				  <input type="text" placeholder="Email" name="email" required>
				  <button type="submit" name="submit12">Xác Nhận</button>

				<br/><br/>
			 <button type="button" onclick="document.getElementById('id02').style.display='none'" class="cancelbtn">Cancel</button>
			 </div>
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
			
			<div class="dropdown"  >
				<button onclick="document.getElementById('id01').style.display='block' " class="dropbtn" name="taoduan" >Quản lý dự án</button>
				
					
			
				
			</div>
			<div class="dropdown"  >
				<button onclick="document.getElementById('id01').style.display='block' " class="dropbtn"  >Quản lý mượn thiết bị</button>
				
					
			
				
			</div>
			</div>
			<div class="ABCDE">
			<div class="chuchay">
					<td><marquee width="100%">N8Plus sẽ nghỉ Lễ vào 3 ngày 30/4, 1/5 và 2/5, kính chúc Quý Khách 1 kỳ nghỉ Lễ vui vẻ !!! >>>>></marquee></td>	
			</div>	</div>
			</div>	
				
		<div class="body">
		
		<div class="ABCD"><h4>Thay đổi mật khẩu</h4></div>
		<form method="post" action="chanel.php">
		<div class="but">
				  <label><b>Tài khoản</b></label>
				  <input type="text" placeholder="Enter Username" name="username" required>

				  <label><b>Nhập lại mật khẩu cũ</b></label>
				  <input type="password" placeholder="Enter Password" name="password1" required>
				  
				  <label><b>Nhập mật khẩu mới</b></label>
				  <input type="password" placeholder="Enter Password" name="password2" required>

				  <button type="submit" name="submit">Submit</button>

				<br/><br/>
			 <button type="button" onclick="document.getElementById('id01').style.display='none'" class="cancelbtn">Cancel</button>
			 </div></form>
		
		

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
			
		
	
