	<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>Document</title>
	
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
		<div id="id01" class="modal">
			  <form class="modal-content animate" method="post" action="luuduan.php"  >
				<div class="container12">
				  <label><b>Mã dự án</b></label>
				  <input type="text" placeholder="Mã dự án..." name="maduan" required>

				  <label><b>Tên dự án</b></label>
				  <input type="text" placeholder="Tên dự án..." name="tenduan" required>
				  
				  <label><b>Người quản lý</b></label>
				  <input type="text" placeholder="Người quản lý..." name="nguoiquanly" required>

				  <button type="submit" name="submit1">Submit</button>

				<br/><br/>
			 <button type="button" onclick="document.getElementById('id01').style.display='none'" class="cancelbtn">Cancel</button>
			 </div>
			  </form>
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
			
			<div class="dropdown"  >
				<button onclick="document.getElementById('id01').style.display='block' " class="dropbtn" name="taoduan" >New Project</button>

			</div> 
			<div class="dropdown"  ><form method="post" >
				<button class="dropbtn" name="update" >Update Project</button>
				<?php if(isset($_REQUEST['update'])){
					header('location:#.php');}?>	
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
		
		<center><h2>Dự án</h2></center>
		<br/><br/>
		<center>
			<?php
				include('connection.php');
				$sql = 'select * from project where User_ID="'.$name.'"';
				$result = $conn->query($sql);
				if($result->num_rows>0){
					echo"<table>
					<tr>
						<td>Mã dự án</td>
						<td>Tên dự án</td>
						<td>Tài khoản người đăng ký</td>
						<td>Người quản lý</td>
						
					</tr>";
					while ($row=mysqli_fetch_array($result)){
						echo"<tr>
							<td>".$row['Project_ID']."</td>
							<td>".$row['Project_Name']."</td>
							<td>".$row['User_ID']."</td>
							<td>".$row['Representative']."</td>
							
							
							</tr>";
					}echo"		</table>";
				}
				mysqli_close($conn);
				?>

		</center>
		
		<style>table {
					
					border-collapse: collapse;
					border-spacing: 0;
					width: 70%;
					border: 2px solid #ddd;
				}

				th, td {
					
					text-align: left;
					padding: 8px;
				}
				tr:nth-child(even){background-color: #f2f2f2}
			</style>
		
			</div>
		
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
			
		
	
