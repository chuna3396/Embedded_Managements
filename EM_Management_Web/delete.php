<?php

						if(isset($_REQUEST['STT'])){
						$id = $_REQUEST['STT'];
						include('connection.php');
						$sql1 = "DELETE FROM borrow_request WHERE Project_Name = '$id'";	
						$result1 = $conn->query($sql1);
						if($result1===true){
							echo 'ok';
						}else{
							echo"tb ".$row['Project_Name'];
						}
						mysqli_close($conn);
					}
				
				?>

?>