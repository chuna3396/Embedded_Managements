<?php
	$local ='https://172.16.199.170';
	$conn = mysqli_connect('172.16.199.170','chuna','','database_embedded') or die('error to connect DB');	
	mysqli_set_charset($conn,'utf8');
?>