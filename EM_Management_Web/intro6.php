<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>Document</title>
	<link rel="stylesheet" type="text/css" href="mystyle.css">
	<link rel="stylesheet" type="text/css" href="stylemuon.css">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
	<script> 
	$(document).ready(function(){
		$("#flip").click(function(){
			$("#panel").slideToggle("slow");
		});
	});
	</script>
	
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
		<div class="body">
		<div class="congcu">
			<div class="maunen">
			<div class="dropdown"  ><form method="post" >
				<button class="dropbtn" name="trangchu" >Trang chủ</button>
				<?php if(isset($_REQUEST['trangchu'])){
					header('location:index.php');}?>	
					</form>				
			</div> 
			<div class="dropdown">
			  <button onclick="myFunction()" class="dropbtn">Chức năng</button>
			  <div id="myDropdown" class="dropdown-content">
				
				<a href="muonthietbi.php">Mượn thiết bị</a>
			  </div>
			</div>
			
				
			</div>
			</div>
			<table>
				<tr>
					<td><div class="hinhlon"><?php
									
					include('connection.php');		
					$imgID = 6;
					$sql = "SELECT * FROM device_image WHERE Device_ID=" . $imgID;
					$result = $conn->query($sql);
					if ( $result->num_rows  < 1 ) {
					} else {
						$row = mysqli_fetch_assoc($result);
						$imgData ="https://172.16.199.170".$row['Image_Url']."";
						
						echo '<img src='.$imgData.' width="280" height="280"/>';
					} 
					
					?></div></td>
					<td colspan="2"><div class="hinhlon1">
						<center><h2><?php
					
					
					
					$sql="select * from device where Device_ID='".$imgID."'";
					$result =$conn->query($sql);
					if($result->num_rows>0){
						
						while ($row=mysqli_fetch_array($result)){
							echo"<table><tr>
								
								<td>".$row['Device_Name']."</td>
								
							</tr>";
						}echo"</table>";
					}else{
						echo "0 result";
					}
					mysqli_close($conn);
			
					?></h2>
						<hr>
							
							<br/>
							<br/>
							<form>
							   <div id="flip">Mượn</div>
								<div id="panel"><input type="number" size="20" name="points" min="1" max="10"  value="">
  									<input type="submit"  value="Save" /><br/><br/><u>Ngày mượn:</u> &emsp;
  									<?php
									echo date("Y-m-d ", strtotime("tomorrow")) . "<br>";?>
 									<br/>
 									<u>Ngày trả:</u> &emsp;&emsp;
 									<input type="date" >
  									</div>
							</form>
						</center>
					</div></td>
				</tr>
				<tr>
					<td colspan="3"><div class="hinhlon2">
					<hr>
					<?php					
					include('connection.php');
					$sql="select * from device where Device_ID='".$imgID."'";
					$result =$conn->query($sql);
					if($result->num_rows>0){
						echo"<table>
						<tr>						
							<td><h2>Mô tả tổng quan</h2></td>
						</tr>";
						while ($row=mysqli_fetch_array($result)){
							echo"<tr>							
								<td>".$row['Details_Decribe']."</td>		
							</tr>";
						}echo"</table>";
					}else{
						echo "0 result";
					}
					mysqli_close($conn);
			
					?>	
					<?php					
					include('connection.php');
					$sql="select * from device where Device_ID='".$imgID."'";
					$result =$conn->query($sql);
					if($result->num_rows>0){
						echo"<table>
						<tr>						
							<td><h2>Thông số kĩ thuật</h2></td>
						</tr>";
						while ($row=mysqli_fetch_array($result)){
							echo"<tr>							
								<td> ".$row['Specification']."</td>		
							</tr>";
						}echo"</table>";
					}else{
						echo "0 result";
					}
					mysqli_close($conn);
			
					?>							
					</div>
				</tr>
			</table>
			<br/>
			<h3>Thiết bị phổ biến</h3>
			<table>
				<tr>
					<td><div class="hinhnhonho"><a href="intro1.php"><?php
									
					include('connection.php');		
					$imgID = 1;
					$sql = "SELECT * FROM device_image WHERE Device_ID=" . $imgID;
					$result = $conn->query($sql);
					if ( $result->num_rows  < 1 ) {
					} else {
						$row = mysqli_fetch_assoc($result);
						$imgData ="https://172.16.199.170".$row['Image_Url']."";
						
						echo '<img src='.$imgData.' width="190" height="190"/>';
					} 
					mysqli_close($conn);
					?></a></div></td>
					<td><div class="hinhnhonho"><a href="intro2.php"><?php
									
					include('connection.php');		
					$imgID = 2;
					$sql = "SELECT * FROM device_image WHERE Device_ID=" . $imgID;
					$result = $conn->query($sql);
					if ( $result->num_rows  < 1 ) {
					} else {
						$row = mysqli_fetch_assoc($result);
						$imgData ="https://172.16.199.170".$row['Image_Url']."";
						
						echo '<img src='.$imgData.' width="190" height="190"/>';
					} 
					mysqli_close($conn);
					?></a></div></td>
					<td><div class="hinhnhonho"><a href="intro4.php"><?php
									
					include('connection.php');		
					$imgID = 4;
					$sql = "SELECT * FROM device_image WHERE Device_ID=" . $imgID;
					$result = $conn->query($sql);
					if ( $result->num_rows  < 1 ) {
					} else {
						$row = mysqli_fetch_assoc($result);
						$imgData ="https://172.16.199.170".$row['Image_Url']."";
						
						echo '<img src='.$imgData.' width="190" height="190"/>';
					} 
					mysqli_close($conn);
					?></a></div></td>
					<td><div class="hinhnhonho"><a href="intro10.php"><?php
									
					include('connection.php');		
					$imgID = 10;
					$sql = "SELECT * FROM device_image WHERE Device_ID=" . $imgID;
					$result = $conn->query($sql);
					if ( $result->num_rows  < 1 ) {
					} else {
						$row = mysqli_fetch_assoc($result);
						$imgData ="https://172.16.199.170".$row['Image_Url']."";
						
						echo '<img src='.$imgData.' width="190" height="190"/>';
					} 
					mysqli_close($conn);
					?></a></div></td>
					<td><div class="hinhnhonho"><a href="intro11.php"><?php
									
					include('connection.php');		
					$imgID = 11;
					$sql = "SELECT * FROM device_image WHERE Device_ID=" . $imgID;
					$result = $conn->query($sql);
					if ( $result->num_rows  < 1 ) {
					} else {
						$row = mysqli_fetch_assoc($result);
						$imgData ="https://172.16.199.170".$row['Image_Url']."";
						
						echo '<img src='.$imgData.' width="190" height="190"/>';
					} 
					mysqli_close($conn);
					?></a></div></td>
				</tr>
			</table>		
		</div>
		<div class="ass">
			<center>
			<br/>
			© Copyright - N8+<br/>
			<a href="https://www.facebook.com/groups/n8plus/">https://www.facebook.com/groups/n8plus/</a>
			</center>	
		</div>
	</div>
</body>
</html>