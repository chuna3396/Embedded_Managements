<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>Document</title>
	<link rel="stylesheet" type="text/css" href="mystyle.css">
	<link rel="stylesheet" type="text/css" href="stylemuon.css">
	
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
			<center><h1>Mượn thiết bị</h1>
			<br/>
			<br/>
			<table >
				<tr>
					<td><div class="body2"><a href="intro1.php"><img src="intro1.jpg" width="240" height="115"/></a><center><br/>Kit RF thu phát Wifi BLE ESP32 NodeMCU LuaNode32<input type="button" name="xem" value="Xem chi tiết"></center></div></td>
					<td>&emsp;&emsp;&emsp;&emsp;&emsp;</td>
					<td><div class="body2"><a href="intro1.php"><img src="intro1.jpg" width="240" height="115"/></a><center><br/>Kit RF thu phát Wifi BLE ESP32 NodeMCU LuaNode32<input type="button" name="xem" value="Xem chi tiết"></center></div></td>
					<td>&emsp;&emsp;&emsp;&emsp;&emsp;</td>
					<td><div class="body2"><a href="intro1.php"><img src="intro1.jpg" width="240" height="115"/></a><center><br/>Kit RF thu phát Wifi BLE ESP32 NodeMCU LuaNode32<input type="button" name="xem" value="Xem chi tiết"></center></div></td>
				</tr>
				<tr>
					<td><div class="body1"></div></td>
					<td><div class="body1"></div></td>
					<td><div class="body1"></div></td>
				</tr>
				<tr>
					<td><div class="body2"><a href="intro1.php"><img src="intro1.jpg" width="240" height="115"/></a><center><br/>Kit RF thu phát Wifi BLE ESP32 NodeMCU LuaNode32<input type="button" name="xem" value="Xem chi tiết"></center></div></td>
					<td>&emsp;&emsp;&emsp;&emsp;&emsp;</td>
					<td><div class="body2"><a href="intro1.php"><img src="intro1.jpg" width="240" height="115"/></a><center><br/>Kit RF thu phát Wifi BLE ESP32 NodeMCU LuaNode32<input type="button" name="xem" value="Xem chi tiết"></center></div></td>
					<td>&emsp;&emsp;&emsp;&emsp;&emsp;</td>
					<td><div class="body2"><a href="intro1.php"><img src="intro1.jpg" width="240" height="115"/></a><center><br/>Kit RF thu phát Wifi BLE ESP32 NodeMCU LuaNode32<input type="button" name="xem" value="Xem chi tiết"></center></div></td>
				</tr>
				<tr>
					<td><div class="body1"></div></td>
					<td><div class="body1"></div></td>
					<td><div class="body1"></div></td>
				</tr>
				<tr>
					<td><div class="body2"><a href="intro1.php"><img src="intro1.jpg" width="240" height="115"/></a><center><br/>Kit RF thu phát Wifi BLE ESP32 NodeMCU LuaNode32<input type="button" name="xem" value="Xem chi tiết"></center></div></td>
					<td>&emsp;&emsp;&emsp;&emsp;&emsp;</td>
					<td><div class="body2"><a href="intro1.php"><img src="intro1.jpg" width="240" height="115"/></a><center><br/>Kit RF thu phát Wifi BLE ESP32 NodeMCU LuaNode32<input type="button" name="xem" value="Xem chi tiết"></center></div></td>
					<td>&emsp;&emsp;&emsp;&emsp;&emsp;</td>
					<td><div class="body2"><a href="intro1.php"><img src="intro1.jpg" width="240" height="115"/></a><center><br/>Kit RF thu phát Wifi BLE ESP32 NodeMCU LuaNode32<input type="button" name="xem" value="Xem chi tiết"></center></div></td>
				</tr>
				<tr>
					<td><div class="body1"></div></td>
					<td><div class="body1"></div></td>
					<td><div class="body1"></div></td>
				</tr>
				<tr>
					<td><div class="body2"><a href="intro1.php"><img src="intro1.jpg" width="240" height="115"/></a><center><br/>Kit RF thu phát Wifi BLE ESP32 NodeMCU LuaNode32<input type="button" name="xem" value="Xem chi tiết"></center></div></td>
					<td>&emsp;&emsp;&emsp;&emsp;&emsp;</td>
					<td><div class="body2"><a href="intro1.php"><img src="intro1.jpg" width="240" height="115"/></a><center><br/>Kit RF thu phát Wifi BLE ESP32 NodeMCU LuaNode32<input type="button" name="xem" value="Xem chi tiết"></center></div></td>
					<td>&emsp;&emsp;&emsp;&emsp;&emsp;</td>
					<td><div class="body2"><a href="intro1.php"><img src="intro1.jpg" width="240" height="115"/></a><center><br/>Kit RF thu phát Wifi BLE ESP32 NodeMCU LuaNode32<input type="button" name="xem" value="Xem chi tiết"></center></div></td>
				</tr>
				<tr>
					<td><div class="body1"></div></td>
					<td><div class="body1"></div></td>
					<td><div class="body1"></div></td>
				</tr>
				<tr>
					<td><div class="body2"><a href="intro1.php"><img src="intro1.jpg" width="240" height="115"/></a><center><br/>Kit RF thu phát Wifi BLE ESP32 NodeMCU LuaNode32<input type="button" name="xem" value="Xem chi tiết"></center></div></td>
					<td>&emsp;&emsp;&emsp;&emsp;&emsp;</td>
					<td><div class="body2"><a href="intro1.php"><img src="intro1.jpg" width="240" height="115"/></a><center><br/>Kit RF thu phát Wifi BLE ESP32 NodeMCU LuaNode32<input type="button" name="xem" value="Xem chi tiết"></center></div></td>
					<td>&emsp;&emsp;&emsp;&emsp;&emsp;</td>
					<td><div class="body2"><a href="intro1.php"><img src="intro1.jpg" width="240" height="115"/></a><center><br/>Kit RF thu phát Wifi BLE ESP32 NodeMCU LuaNode32<input type="button" name="xem" value="Xem chi tiết"></center></div></td>
				</tr>
				
			</table>
			
		
		</center>
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