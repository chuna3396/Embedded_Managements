<?php
	if(isset($_REQUEST['User_ID'])){
		$user=$_REQUEST['User_ID'];
		$id = $_REQUEST['STT'];
		$ngaymuon= date("Y-m-d");
		$ngaytra= $_REQUEST['ngaytra'];
		$duan = $_REQUEST['duan'];
		$soluong = $_REQUEST['points'];
		include('connection.php');
		$sql1='INSERT INTO borrow_request( Device_ID, Borrow_Date, Project_Name, User_ID, Expect_Date, Quantity, Confirm) VALUES ("'.$id.'","'.$ngaymuon.'","'.$duan.'","'.$user.'","'.$ngaytra.'","'.$soluong.'",0)';
		$result1 = $conn->query($sql1);
		if($result1===true ){
			header('location: indexLG.php?User_ID='.$user.'');
		}else{
			echo'đéo';
		}
		mysqli_close($conn);
	}

?>