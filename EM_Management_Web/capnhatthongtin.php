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
	.but{
			float: right;
			width: 55.3%;
			height: 100px;
			margin-right:22.3% ;
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
			  <form method="post"><div class="input-group">
			 <input type="text" size="45"  placeholder="Search">
			  		
				
				  </div>
			  </form>
			</div>	
			
			</div>
			
			<div class="dangnhap">
			
			<div class="dropdown"  ><form method="post" >
				<button  name="dangxuat" >Đăng xuất [<?php
					if(isset($_REQUEST['User_ID']))
			$name=$_REQUEST['User_ID'];
			echo ''.$name;
			?>]</button>
				<?php if(isset($_REQUEST['dangxuat'])){
					header('location:index.php');}?>	
					</form>				
			</div> 
			</div>
			
	
		</div>
		<div class="abc">
		<div class="congcu">
			<div class="maunen">
			<div class="dropdown"  ><form method="post" >
				<button class="dropbtn" name="trangchu" >Trang chủ</button>
				<?php if(isset($_REQUEST['trangchu'])){
					header('location:indexLG.php?User_ID='.$name.'');}?>	
					</form>				
			</div> 
			<div class="dropdown"  ><form method="post" >
				<button class="dropbtn" name="capnhatthongtin" >Thông tin tài khoản</button>
				<?php if(isset($_REQUEST['capnhatthongtin'])){
					header('location: thongtin.php?User_ID='.$name.'');}?>	
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
		<br/><br/><br/><br/><br/>
			<center>
					<form method="post" ><?php
						if(isset($_REQUEST['User_ID'])){
						$user = $_REQUEST['User_ID'];
						include('connection.php');
						$sql="select * from user_info where User_ID ='".$user."'";
						$result =$conn->query($sql);
						if($result->num_rows>0){
							echo"<table>
							";
							while ($row=mysqli_fetch_array($result)){
								echo"		
									
									<tr><td><b>Tên người dùng</b></td><td><input type='text'size='7'  name='ten' value='$row[User_Name]'></td></tr>
									<tr><td><b>Ngày sinh</b></td><td><input type='text'size='3'  name='ngaysinh' value='$row[Birthday]'></td></tr>
									
  				 					<tr><td><b>Giới tính</b></td><td><select name='gioitinh'>
																			<option value='Nam'>Nam</option>
																			<option value='Nữ'>Nữ</option> </select></td></tr>
									<tr><td><b>CMND</b></td><td><input type='text'size='2'  name='cmnd' value='$row[IDCard]'></td></tr>
									<tr><td><b>Số điện thoại</b></td><td><input type='text'size='2'  name='sdt' value='$row[Phone]'></td></tr>
									<tr><td><b>Email</b></td><td><input type='text'size='2'  name='email' value='$row[Email]'></td></tr>
									<tr><td colspan='2'><button  name='ok' >Thay đổi</button></td></tr>
								";
							}echo"</table>";
						}else{
							echo "0 result";
						}
						
							}
						if(isset($_REQUEST['ok'])){
							$ten = $_REQUEST['ten'];
							$ngaysinh  = $_REQUEST['ngaysinh'];
							$gioitinh = $_REQUEST['gioitinh'];
							$cmnd = $_REQUEST['cmnd'];
							$sdt = $_REQUEST['sdt'];
							$email = $_REQUEST['email'];
						
						
							$sql2 = "UPDATE user_info SET User_Name='".$ten."',Birthday='".$ngaysinh."',Sex='".$gioitinh."',IDCard='".$cmnd."',Phone='".$sdt."',Email='".$email."'  WHERE User_ID='$user'";
							$result2 = $conn->query($sql2);
							if($result2===true){
								header('location: thongtin.php?User_ID='.$name.'');
							}else{
							echo"tb";
							}
						mysqli_close($conn);
					}
					?></form>
						
						<div class="but"> <form method="post" >
					<button  name="capnhatthongtin" >Cancel</button>
					<?php if(isset($_REQUEST['capnhatthongtin'])){
						header('location: thongtin.php?User_ID='.$name.'');}?>	
						</form>		</div>		
			
						
				  		
							<br/>
						
						</center>
		
		
		
		</div>
		<style>table {
					
					border-collapse: collapse;
					border-spacing: 0;
					width:57%;
					border: 2px solid #ddd;
				}

				th, td {
					
					text-align: left;
					padding: 8px;
				}
				tr:nth-child(even){background-color: #f2f2f2}
			</style>
		<div class="ass">
			
			<center>
			<br/>
			© Copyright - N8+<br/>
			<a href="https://www.facebook.com/groups/n8plus/">https://www.facebook.com/groups/n8plus/</a>
			</center>
			
		</div>

</body>
</html>
			
		
	
