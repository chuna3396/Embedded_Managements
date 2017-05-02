<?php
	include('connection.php');
	$ten = $_REQUEST['ten'];
	$ngaysinh  = $_REQUEST['date'];
	$cmndd = $_REQUEST['cmndd'];
	$gioitinh = $_REQUEST['gender'];
	$sdt = $_REQUEST['sdt'];
	$email = $_REQUEST['email'];
	$sql ='INSERT INTO register_request( Name, BirthDay, Sex, IDCard, Phone, Email, Accept) VALUES ("'.$ten.'","'.$ngaysinh.'","'.$gioitinh.'","'.$cmndd.'","'.$sdt.'","'.$email.'",0)';
	$result = $conn->query($sql);
		if($result===true){
		header('location: index.php');
		}else{
			echo"tb";
		}
		mysqli_close($conn);

?>