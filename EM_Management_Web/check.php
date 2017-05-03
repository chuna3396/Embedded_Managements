<?php
				if(isset($_REQUEST['submit'])){
				include('connection.php');
				$user=$_REQUEST['username'];
				$pass=$_REQUEST['password'];
				$SQL = "SELECT * FROM user";				
				$result = mysqli_query($conn,$SQL);
				$SQL1 = "SELECT Activated FROM user_info where User_ID ='".$user."' ";				
				$result1 = mysqli_query($conn,$SQL1);
				$kt = 0;
				$password= md5( $pass);
					if($user==='admin'){
						echo '<script language="javascript">';
							echo 'alert("Bạn đã đăng nhập với quyền quản trị! Xin mời mở hoặc tải ứng dụng Embedded Management để sử dụng")';
							
							echo '</script>';
							Header( "Location: index.php" );
					}else{
				while ($row = mysqli_fetch_array($result) ){
					if (($row["User_ID"]===$user)&&($row["Password"]===$password)){
						while($row1 = mysqli_fetch_array($result1)){
							$id=$row1["Activated"];
							
							if($id==='1'){
								$kt = 1;
							}
							echo '<script language="javascript">';
							echo 'alert("Tài khoản đã bị khóa, hãy liên hệ quản trị viên để biết thêm thông tin!")';
							
							echo '</script>';
						}
					}
				}
				if($kt>0){
					header('location: indexLG.php?User_ID='.$user.'');
					
				}else{
							echo '<script language="javascript">';
							echo 'alert("Tài khoản hoặc mật khẩu không đúng!")';
								
							Header( "Tài khoản hoặc mật khẩu không đúng!" );
 							Header( "Location: index.php" );
							echo '</script>';
				}
					}
				mysqli_close($conn);
				}
		?>