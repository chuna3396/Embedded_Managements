<?php

						if(isset($_REQUEST['STT'])){
						$id = $_REQUEST['STT'];
						$name = $_REQUEST['User_ID'];
						include('connection.php');
						$sql1 = "DELETE FROM borrow_request WHERE Confirm_ID = '$id'";	
						$result1 = $conn->query($sql1);
						if($result1===true){
							header('location: indexLG.php?User_ID='.$name.'');
						}else{
							echo"tb ".$row['Project_Name'];
						}
						mysqli_close($conn);
					}
				
				?>

