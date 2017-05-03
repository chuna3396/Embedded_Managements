<?php
				include('connection.php');
				$user=$_REQUEST['username'];
				$pass1=$_REQUEST['password1'];
				$pass2=$_REQUEST['password2'];
				$sql =  "SELECT * FROM user";		
				$result = mysqli_query($conn,$sql);
			
		
				$kt = 0;
				$password1= md5( $pass1);
				while ($row = mysqli_fetch_array($result) ){
					if (($row["User_ID"]===$user)&&($row["Password"]===$password1)){
						$kt =1;
					}
				}
				if($kt>0){
					$password2= md5( $pass2);
					$sql1 = "UPDATE user SET Password='".$password2."' WHERE User_ID = '".$user."'";
					$result1 = mysqli_query($conn,$sql1);
					Header( "Location: index.php" );
				}else{
							echo'Đéo!!';
				}
				mysqli_close($conn);


?>