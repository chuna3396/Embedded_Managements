<?php
	if(isset($_REQUEST['User_ID'])){
		$name=$_REQUEST['User_ID'];
		$tenduan = $_REQUEST['tenduan'];
		$nguoiquanly = $_REQUEST['nguoiquanly'];
		include('connection.php');
		$sql = 'INSERT INTO project(Project_Name, User_ID, Representative) VALUES ("'.$tenduan.'","'.$name.'","'.$nguoiquanly.'")';
		$result = $conn->query($sql);
		if($result===true){
			header('location: xemduan.php?User_ID='.$name.'');
		}
	}

?>