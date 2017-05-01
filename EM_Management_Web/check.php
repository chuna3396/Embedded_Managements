<?php
	
		include('connection.php');
		$user=$_REQUEST['username'];
		$pass=$_REQUEST['password'];
		$SQL = "SELECT * FROM user";				
		$result = mysqli_query($conn,$SQL);
		$kt = 0;
		$password= md5( $pass);
		while ($row = mysqli_fetch_array($result)){
			if (($row["User_ID"]===$user)&&($row["Password"]===$password)){
				$kt = 1;
			}
		}
		if($kt>0){
			header('location: indexLG.php');
			
			
		}else{
			echo "ERROR";
		}
		mysqli_close($conn);
	
?>