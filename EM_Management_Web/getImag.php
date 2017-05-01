<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>Document</title>
	
</head>
<body>
<script>
								function getImg(){
								<?php 
								include('connection.php');
								$imgData;
								$imgID = 1;
								$sql = "SELECT Image_Url FROM device_image where Image_Url='1'  " ;
								$result = $conn->query($sql);
								$i = 0;
								while ( $result->num_rows  > 0 ) {
									$row = mysqli_fetch_assoc($result);
									$imgData[$i] ="https://172.16.199.170".$row['Image_Url']."";
									echo ''.$imgData[$i];
									$i++;
								} 
									
							  	mysqli_close($conn);
															
								?>
								}
		</script>
	<button onclick="getImg()">Nhấn vào đây</button>
</body>
</html>

