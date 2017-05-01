	<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>Document</title>
	
	
	<link rel="stylesheet" type="text/css" href="mystyle.css">
	<link rel="stylesheet" type="text/css" href="stylelogin.css">
	<link rel="stylesheet" type="text/css" href="styletaoduan.css">
	
	
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
  	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
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
		<?php echo '<img src=https://172.16.199.170/image/Logo.png width="199" height="110"/>';?>
		</div>
		<div class="head2">
		
			<div class="tim">
			<div class="container" >			  
			  <form method="post"><div class="input-group">
			 
			  		
				
				  </div>
			  </form>
			</div>	
			</div>
			
			<div class="dangnhap">
			
			<div class="dropdown"  ><form method="post" >
				<button  name="dangxuat" >Đăng xuất</button>
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
					header('location:indexLG.php');}?>	
					</form>				
			</div> 
			<div class="dropdown"  ><form method="post" >
				<button class="dropbtn" name="quanlyduan" >Quản lý dự án</button>
				<?php if(isset($_REQUEST['quanlyduan'])){
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
		<div class="ABCD"></div>
		<form method="post">
		<center><h1>Tạo dự án</h1></center>
		<br/>
		<div class="container1"><table>
			<tr>
				<td><label for="fname">Mã dự án&emsp;</label></td>
				<td><input type="text" id="fname" name="maduan" placeholder="Mã dự án..."></td>
			</tr>
			<tr>
				<td><label for="lname">Tên dự án&emsp;</label></td>
				<td><input type="text" id="lname" name="tenduan" placeholder="Tên dự án..."></td>
			</tr>
			<tr>
				<td><label for="lname">Người quản lý&emsp;</label></td>
				<td><input type="text" id="lname" name="nguoiquanly" placeholder="Tên người quản lý..."></td>
			</tr>
			
			
		</table>
		<center><input type="submit" name="submit" value="Tạo dự án"></center></div>
			
		
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

</body>
</html>
			
		
	
