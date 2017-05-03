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
				<button class="dropbtn" name="thongtin" >Thông tin tài khoản</button>
				<?php if(isset($_REQUEST['thongtin'])){
					header('location: thongtin.php?User_ID='.$name.'');}?>	
					</form>				
			</div> 
			<div class="dropdown"  ><form method="post" >
				<button class="dropbtn" name="quanlyduan" >Quản lý dự án</button>
				<?php if(isset($_REQUEST['quanlyduan'])){
					header('location: xemduan.php?User_ID='.$name.'');}?>	
					</form>				
			</div> 
			<div class="dropdown"  >
				<button onclick="document.getElementById('id01').style.display='block' " class="dropbtn" name="taoduan" >Quản lý đơn yêu cầu đã gửi</button>
	
			</div> 
			<div class="dropdown"  >
				<button onclick="document.getElementById('id02').style.display='block' " class="dropbtn" name="taoduan" >Quản lý thiết bị đã mượn</button>
	
			</div> 
			
			<div id="id01" class="modal">
			  <form class="modal-content animate" method="post" action="<?php echo"xemmuonthietbi.php?User_ID=".$name.""; ?>" >
				<div class="container12">
						<h2><center>Chọn dự án</center></h2>
						<center>	<?php
								include('connection.php');
								$sql = 'select * from project where User_ID="'.$name.'"';
								$result = $conn->query($sql);
								if($result->num_rows>0){
									echo'<form method="post" > <select name="duan">';
									while ($row=mysqli_fetch_array($result)){
										echo" <option value=".$row['Project_Name'].">".$row['Project_Name']."</option>";
									}echo"		</select></form>";
								}
								mysqli_close($conn);
							?></center>
				

				<br/><br/>
				<button type="submit" name="submit1">Select</button><br/><br/>
			 <button type="button" onclick="document.getElementById('id01').style.display='none'" class="cancelbtn">Cancel</button>
			 </div>
			  </form>
			</div>
			<div id="id02" class="modal">
			  <form class="modal-content animate" method="post" action="<?php echo"quanly.php?User_ID=".$name.""; ?>" >
				<div class="container12">
						<h2><center>Chọn dự án</center></h2>
						<center>	<?php
								include('connection.php');
								$sql = 'select * from project where User_ID="'.$name.'"';
								$result = $conn->query($sql);
								if($result->num_rows>0){
									echo'<form method="post" > <select name="duan">';
									while ($row=mysqli_fetch_array($result)){
										echo" <option value=".$row['Project_Name'].">".$row['Project_Name']."</option>";
									}echo"		</select></form>";
								}
								mysqli_close($conn);
							?></center>
				

				<br/><br/>
				<button type="submit" name="submit1">Select</button><br/><br/>
			 <button type="button" onclick="document.getElementById('id01').style.display='none'" class="cancelbtn">Cancel</button>
			 </div>
			  </form>
			</div>
			</div>
			<div class="ABCDE">
			<div class="chuchay">
					<td><marquee width="100%">N8Plus sẽ nghỉ Lễ vào 3 ngày 30/4, 1/5 và 2/5, kính chúc Quý Khách 1 kỳ nghỉ Lễ vui vẻ !!! >>>>></marquee></td>	
			</div>	</div>
			</div>	
				
		<div class="body">
		
		<div class="ABCD"><h4>&emsp;Sản phẩm nổi bật</h4></div>
		<div class="khoaanh">
				<center><div class="container">
					  <br>
					  <div id="myCarousel" class="carousel slide" data-ride="carousel">
						<!-- Indicators -->
						<ol class="carousel-indicators">
						  <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
						  <li data-target="#myCarousel" data-slide-to="1"></li>
						  <li data-target="#myCarousel" data-slide-to="2"></li>
						  <li data-target="#myCarousel" data-slide-to="3"></li>
						</ol>

						<!-- Wrapper for slides -->
						<div class="carousel-inner" role="listbox">

						  <div class="item active">
						  <a href='<?php echo"intro9LG.php?User_ID=".$name.""; ?>'>
							<?php
							  include('connection.php');
								$imgID = 9;
								$sql = "SELECT * FROM device_image WHERE Device_ID=" . $imgID;
								$result = $conn->query($sql);
								if ( $result->num_rows  < 1 ) {
								} else {
									$row = mysqli_fetch_assoc($result);
									$imgData ="".$local."".$row['Image_Url']."";

									echo '<img src='.$imgData.' width="280" height="280"/>';
								} 
							  mysqli_close($conn);
								?></a>
							<div class="carousel-caption">
							  <h3><?php
							include('connection.php');
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
							?></h3>
							</div>
						  </div>

						  <div class="item">
						  <a href="<?php echo"intro12LG.php?User_ID=".$name.""; ?>">
							<?php
							  include('connection.php');
								$imgID = 12;
								$sql = "SELECT * FROM device_image WHERE Device_ID=" . $imgID;
								$result = $conn->query($sql);
								if ( $result->num_rows  < 1 ) {
								} else {
									$row = mysqli_fetch_assoc($result);
									$imgData ="".$local."".$row['Image_Url']."";

									echo '<img src='.$imgData.' width="280" height="280"/>';
								} 
							  mysqli_close($conn);
								?></a>
							<div class="carousel-caption">
							    <h3><?php
							include('connection.php');
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
							?></h3>
							  
							</div>
						  </div>

						  <div class="item">
						  	<a href="<?php echo"intro7LG.php?User_ID=".$name.""; ?>"><?php
							  include('connection.php');
								$imgID = 7;
								$sql = "SELECT * FROM device_image WHERE Device_ID=" . $imgID;
								$result = $conn->query($sql);
								if ( $result->num_rows  < 1 ) {
								} else {
									$row = mysqli_fetch_assoc($result);
									$imgData ="".$local."".$row['Image_Url']."";

									echo '<img src='.$imgData.' width="280" height="280"/>';
								} 
							  mysqli_close($conn);
								?></a>
							
							<div class="carousel-caption">
							   <h3><?php
							include('connection.php');
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
							?></h3>
							 
							</div>
						  </div>

						  <div class="item">
						  <a href="<?php echo"intro3LG.php?User_ID=".$name.""; ?>">
							<?php
							  include('connection.php');
								$imgID = 3;
								$sql = "SELECT * FROM device_image WHERE Device_ID=" . $imgID;
								$result = $conn->query($sql);
								if ( $result->num_rows  < 1 ) {
								} else {
									$row = mysqli_fetch_assoc($result);
									$imgData ="".$local."".$row['Image_Url']."";

									echo '<img src='.$imgData.' width="280" height="280"/>';
								} 
							  mysqli_close($conn);
								?></a>
							<div class="carousel-caption">
							   <h3><?php
							include('connection.php');
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
							?></h3>
							</div>
						  </div>

						</div>

						<!-- Left and right controls -->
						<a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
						  <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
						  <span class="sr-only">Previous</span>
						</a>
						<a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
						  <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
						  <span class="sr-only">Next</span>
						</a>
					  </div>
					</div></center>
				</div>
			
		
		<div class="khoasanpham">
		<div class="ABCD"><h5>&emsp;Sản phẩm</h5></div>
		<br/>
		<br/>
		<center><table ><center>
				<tr>
					<td><div class="body2"><a href="<?php echo"intro1LG.php?User_ID=".$name.""; ?>"><?php
							  include('connection.php');
								$imgID = 1;
								$sql = "SELECT Image_Url FROM device_image WHERE Device_ID=" . $imgID;
								$result = $conn->query($sql);
								if ( $result->num_rows  < 1 ) {
								} else {
									$row = mysqli_fetch_assoc($result);
									$imgData ="".$local."".$row['Image_Url']."";

									echo '<img src='.$imgData.' width="240" height="115"/>';
								} 
							  mysqli_close($conn);
								?></a><center><br/><a href="<?php echo"intro1LG.php?User_ID=".$name.""; ?>"><?php
							include('connection.php');
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
						?><input type="button" onclick="<?php echo"intro1LG.php?User_ID=".$name.""; ?>" name="xem" value="Mượn"></a></center></div></td>
					<td>&emsp;&emsp;&emsp;&emsp;</td>
					<td><div class="body2"><a href="<?php echo"intro2LG.php?User_ID=".$name.""; ?>"><?php
							  include('connection.php');
								$imgID = 2;
								$sql = "SELECT Image_Url FROM device_image WHERE Device_ID=" . $imgID;
								$result = $conn->query($sql);
								if ( $result->num_rows  < 1 ) {
								} else {
									$row = mysqli_fetch_assoc($result);
									$imgData ="".$local."".$row['Image_Url']."";

									echo '<img src='.$imgData.' width="240" height="115"/>';
								} 
							  mysqli_close($conn);
								?></a><center><br/><a href="<?php echo"intro2LG.php?User_ID=".$name.""; ?>"><?php
							include('connection.php');
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
						?><input type="button" onclick="<?php echo"intro2LG.php?User_ID=".$name.""; ?>" name="xem" value="Mượn"></a></center></div></td>
					<td>&emsp;&emsp;&emsp;&emsp;</td>
					<td><div class="body2"><a href="<?php echo"intro3LG.php?User_ID=".$name.""; ?>"><?php
							  include('connection.php');
								$imgID = 3;
								$sql = "SELECT Image_Url FROM device_image WHERE Device_ID=" . $imgID;
								$result = $conn->query($sql);
								if ( $result->num_rows  < 1 ) {
								} else {
									$row = mysqli_fetch_assoc($result);
									$imgData ="".$local."".$row['Image_Url']."";

									echo '<img src='.$imgData.' width="240" height="115"/>';
								} 
							  mysqli_close($conn);
								?></a><center><br/><a href="<?php echo"intro3LG.php?User_ID=".$name.""; ?>"><?php
							include('connection.php');
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
						?><input type="button" onclick="<?php echo"intro3LG.php?User_ID=".$name.""; ?>" name="xem" value="Mượn"></a></center></div></td>
				</tr>
				<tr>
					<td><div class="body1"></div></td>
					<td><div class="body1"></div></td>
					<td><div class="body1"></div></td>
				</tr>
				<tr>
					<td><div class="body2"><a href="<?php echo"intro4LG.php?User_ID=".$name.""; ?>"><?php
							  include('connection.php');
								$imgID = 4;
								$sql = "SELECT Image_Url FROM device_image WHERE Device_ID=" . $imgID;
								$result = $conn->query($sql);
								if ( $result->num_rows  < 1 ) {
								} else {
									$row = mysqli_fetch_assoc($result);
									$imgData ="".$local."".$row['Image_Url']."";

									echo '<img src='.$imgData.' width="240" height="115"/>';
								} 
							  mysqli_close($conn);
								?></a><center><br/><a href="<?php echo"intro4LG.php?User_ID=".$name.""; ?>"><?php
							include('connection.php');
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
						?><input type="button" onclick="<?php echo"intro4LG.php?User_ID=".$name.""; ?>" name="xem" value="Mượn"></a></center></div></td>
					<td>&emsp;&emsp;&emsp;&emsp;</td>
					<td><div class="body2"><a href="<?php echo"intro5LG.php?User_ID=".$name.""; ?>"><?php
							  include('connection.php');
								$imgID = 5;
								$sql = "SELECT Image_Url FROM device_image WHERE Device_ID=" . $imgID;
								$result = $conn->query($sql);
								if ( $result->num_rows  < 1 ) {
								} else {
									$row = mysqli_fetch_assoc($result);
									$imgData ="".$local."".$row['Image_Url']."";

									echo '<img src='.$imgData.' width="240" height="115"/>';
								} 
							  mysqli_close($conn);
								?></a><center><br/><a href="<?php echo"intro5LG.php?User_ID=".$name.""; ?>"><?php
							include('connection.php');
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
						?><input type="button" onclick="<?php echo"intro5LG.php?User_ID=".$name.""; ?>" name="xem" value="Mượn"></a></center></div></td>
					<td>&emsp;&emsp;&emsp;&emsp;</td>
					<td><div class="body2"><a href="<?php echo"intro6LG.php?User_ID=".$name.""; ?>"><?php
							  include('connection.php');
								$imgID = 6;
								$sql = "SELECT Image_Url FROM device_image WHERE Device_ID=" . $imgID;
								$result = $conn->query($sql);
								if ( $result->num_rows  < 1 ) {
								} else {
									$row = mysqli_fetch_assoc($result);
									$imgData ="".$local."".$row['Image_Url']."";

									echo '<img src='.$imgData.' width="240" height="115"/>';
								} 
							  mysqli_close($conn);
								?></a><center><br/><a href="<?php echo"intro6LG.php?User_ID=".$name.""; ?>"><?php
							include('connection.php');
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
						?><input type="button" onclick="<?php echo"intro6LG.php?User_ID=".$name.""; ?>" name="xem" value="Mượn"></a></center></div></td>
				</tr>
				<tr>
					<td><div class="body1"></div></td>
					<td><div class="body1"></div></td>
					<td><div class="body1"></div></td>
				</tr>
				<tr>
					<td><div class="body2"><a href="<?php echo"intro7LG.php?User_ID=".$name.""; ?>"><?php
							  include('connection.php');
								$imgID = 7;
								$sql = "SELECT Image_Url FROM device_image WHERE Device_ID=" . $imgID;
								$result = $conn->query($sql);
								if ( $result->num_rows  < 1 ) {
								} else {
									$row = mysqli_fetch_assoc($result);
									$imgData ="".$local."".$row['Image_Url']."";

									echo '<img src='.$imgData.' width="240" height="115"/>';
								} 
							  mysqli_close($conn);
								?></a><center><br/><a href="<?php echo"intro7LG.php?User_ID=".$name.""; ?>"><?php
							include('connection.php');
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
						?><input type="button" onclick="<?php echo"intro7LG.php?User_ID=".$name.""; ?>" name="xem" value="Mượn"></a></center></div></td>
					<td>&emsp;&emsp;&emsp;&emsp;</td>
					<td><div class="body2"><a href="<?php echo"intro8LG.php?User_ID=".$name.""; ?>"><?php
							  include('connection.php');
								$imgID = 8;
								$sql = "SELECT Image_Url FROM device_image WHERE Device_ID=" . $imgID;
								$result = $conn->query($sql);
								if ( $result->num_rows  < 1 ) {
								} else {
									$row = mysqli_fetch_assoc($result);
									$imgData ="".$local."".$row['Image_Url']."";

									echo '<img src='.$imgData.' width="240" height="115"/>';
								} 
							  mysqli_close($conn);
								?></a><center><br/><a href="<?php echo"intro8LG.php?User_ID=".$name.""; ?>"><?php
							include('connection.php');
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
						?><input type="button" onclick="<?php echo"intro8LG.php?User_ID=".$name.""; ?>" name="xem" value="Mượn"></a></center></div></td>
					<td>&emsp;&emsp;&emsp;&emsp;</td>
					<td><div class="body2"><a href="<?php echo"intro9LG.php?User_ID=".$name.""; ?>"><?php
							  include('connection.php');
								$imgID = 9;
								$sql = "SELECT Image_Url FROM device_image WHERE Device_ID=" . $imgID;
								$result = $conn->query($sql);
								if ( $result->num_rows  < 1 ) {
								} else {
									$row = mysqli_fetch_assoc($result);
									$imgData ="".$local."".$row['Image_Url']."";

									echo '<img src='.$imgData.' width="240" height="115"/>';
								} 
							  mysqli_close($conn);
								?></a><center><br/><a href="<?php echo"intro9LG.php?User_ID=".$name.""; ?>"><?php
							include('connection.php');
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
						?><input type="button" onclick="<?php echo"intro9LG.php?User_ID=".$name.""; ?>" name="xem" value="Mượn"></a></center></div></td>
				</tr>
				<tr>
					<td><div class="body1"></div></td>
					<td><div class="body1"></div></td>
					<td><div class="body1"></div></td>
				</tr>
				<tr>
					<td><div class="body2"><a href="<?php echo"intro10LG.php?User_ID=".$name.""; ?>"><?php
							  include('connection.php');
								$imgID = 10;
								$sql = "SELECT Image_Url FROM device_image WHERE Device_ID=" . $imgID;
								$result = $conn->query($sql);
								if ( $result->num_rows  < 1 ) {
								} else {
									$row = mysqli_fetch_assoc($result);
									$imgData ="".$local."".$row['Image_Url']."";

									echo '<img src='.$imgData.' width="240" height="115"/>';
								} 
							  mysqli_close($conn);
								?></a><center><br/><a href="<?php echo"intro10LG.php?User_ID=".$name.""; ?>"><?php
							include('connection.php');
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
						?><input type="button" onclick="<?php echo"intro10LG.php?User_ID=".$name.""; ?>" name="xem" value="Mượn"></a></center></div></td>
					<td>&emsp;&emsp;&emsp;&emsp;</td>
						<td><div class="body2"><a href="<?php echo"intro11LG.php?User_ID=".$name.""; ?>"><?php
							  include('connection.php');
								$imgID = 11;
								$sql = "SELECT Image_Url FROM device_image WHERE Device_ID=" . $imgID;
								$result = $conn->query($sql);
								if ( $result->num_rows  < 1 ) {
								} else {
									$row = mysqli_fetch_assoc($result);
									$imgData ="".$local."".$row['Image_Url']."";

									echo '<img src='.$imgData.' width="240" height="115"/>';
								} 
							  mysqli_close($conn);
								?></a><center><br/><a href="<?php echo"intro11LG.php?User_ID=".$name.""; ?>"><?php
							include('connection.php');
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
						?><input type="button" onclick="<?php echo"intro11LG.php?User_ID=".$name.""; ?>" name="xem" value="Mượn"></a></center></div></td>
					<td>&emsp;&emsp;&emsp;&emsp;</td>
					<td><div class="body2"><a href="<?php echo"intro12LG.php?User_ID=".$name.""; ?>"><?php
							  include('connection.php');
								$imgID = 12;
								$sql = "SELECT Image_Url FROM device_image WHERE Device_ID=" . $imgID;
								$result = $conn->query($sql);
								if ( $result->num_rows  < 1 ) {
								} else {
									$row = mysqli_fetch_assoc($result);
									$imgData ="".$local."".$row['Image_Url']."";

									echo '<img src='.$imgData.' width="240" height="115"/>';
								} 
							  mysqli_close($conn);
								?></a><center><br/><a href="<?php echo"intro12LG.php?User_ID=".$name.""; ?>"><?php
							include('connection.php');
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
						?><input type="button" onclick="<?php echo"intro12LG.php?User_ID=".$name.""; ?>" name="xem" value="Mượn"></a></center></div></td>
				</tr>
				<tr>
					<td><div class="body1"></div></td>
					<td><div class="body1"></div></td>
					<td><div class="body1"></div></td>
				</tr>
			<tr>
					<td><div class="body2"><a href="<?php echo"intro13LG.php?User_ID=".$name.""; ?>"><?php
							  include('connection.php');
								$imgID = 13;
								$sql = "SELECT Image_Url FROM device_image WHERE Device_ID=" . $imgID;
								$result = $conn->query($sql);
								if ( $result->num_rows  < 1 ) {
								} else {
									$row = mysqli_fetch_assoc($result);
									$imgData ="".$local."".$row['Image_Url']."";

									echo '<img src='.$imgData.' width="240" height="115"/>';
								} 
							  mysqli_close($conn);
								?></a><center><br/><a href="<?php echo"intro13LG.php?User_ID=".$name.""; ?>"><?php
							include('connection.php');
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
						?><input type="button" onclick="<?php echo"intro13LG.php?User_ID=".$name.""; ?>" name="xem" value="Mượn"></a></center></div></td>
					<td>&emsp;&emsp;&emsp;&emsp;</td>
					<td><div class="body2"><a href="<?php echo"intro14LG.php?User_ID=".$name.""; ?>"><?php
							  include('connection.php');
								$imgID = 14;
								$sql = "SELECT Image_Url FROM device_image WHERE Device_ID=" . $imgID;
								$result = $conn->query($sql);
								if ( $result->num_rows  < 1 ) {
								} else {
									$row = mysqli_fetch_assoc($result);
									$imgData ="".$local."".$row['Image_Url']."";

									echo '<img src='.$imgData.' width="240" height="115"/>';
								} 
							  mysqli_close($conn);
								?></a><center><br/><a href="<?php echo"intro14LG.php?User_ID=".$name.""; ?>"><?php
							include('connection.php');
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
						?><input type="button" onclick="<?php echo"intro14LG.php?User_ID=".$name.""; ?>" name="xem" value="Mượn"></a></center></div></td>
					<td>&emsp;&emsp;&emsp;&emsp;</td>
					<td><div class="body2"><a href="<?php echo"intro15LG.php?User_ID=".$name.""; ?>"><?php
							  include('connection.php');
								$imgID = 15;
								$sql = "SELECT Image_Url FROM device_image WHERE Device_ID=" . $imgID;
								$result = $conn->query($sql);
								if ( $result->num_rows  < 1 ) {
								} else {
									$row = mysqli_fetch_assoc($result);
									$imgData ="".$local."".$row['Image_Url']."";

									echo '<img src='.$imgData.' width="240" height="115"/>';
								} 
							  mysqli_close($conn);
								?></a><center><br/><a href="<?php echo"intro15LG.php?User_ID=".$name.""; ?>"><?php
							include('connection.php');
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
						?><input type="button" onclick="<?php echo"intro15LG.php?User_ID=".$name.""; ?>" name="xem" value="Mượn"></a></center></div></td>
				</tr>
				
			</center></table></center>
			</div>
		<div class="main0">
			<center><h5>Thành viên trong nhóm thiết kế</h5>
		<table >
				<tr>
					<td><div class="container1">
						  <img src="duy.jpg" alt="Avatar" class="image">
						  <div class="overlay">
						  <div class="text">Designer</div>
						  </div>
						</div>
					</td>
					<td><div class="container1">
						  <img src="chuna.jpg" alt="Avatar" class="image">
						  <div class="overlay">
						  <div class="text">Coder</div>
						  </div>
						</div>
					</td>
					<td><div class="container1">
						  <img src="phuc.jpg" alt="Avatar" class="image">
						  <div class="overlay">
						  <div class="text">Collector</div>
						  </div>
						</div>
					</td>
					<td><div class="container1">
						  <img src="phi.jpg" alt="Avatar" class="image">
						  <div class="overlay">
						  <div class="text">Analyst</div>
						  </div>
						</div>
					</td>
				
			
					<td><div class="container1">
						  <img src="nhut.jpg" alt="Avatar" class="image">
						  <div class="overlay">
						  <div class="text">Tester</div>
						  </div>
						</div>
					</td>
					<td><div class="container1">
						  <img src="phong.jpg" alt="Avatar" class="image">
						  <div class="overlay">
						  <div class="text">Installer</div>
						  </div>
						</div>
					</td>
					<td><div class="container1">
						  <img src="hiep.jpg" alt="Avatar" class="image">
						  <div class="overlay">
						  <div class="text">Team Leader</div>
						  </div>
						</div>
					</td>
					<td><div class="container1">
						  <img src="oai.jpg" alt="Avatar" class="image">
						  <div class="overlay">
						  <div class="text">Coder</div>
						  </div>
						</div>
					</td>
					
				</tr>
			</table></center>
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
			
		
	
