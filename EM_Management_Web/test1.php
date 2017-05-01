<?php
				include('connection.php');
				$sql = "select * from project";
				$result = $conn->query($sql);
				if($result->num_rows>0){
					echo'<select  name="duan">';
					while ($row=mysqli_fetch_array($result)){
						echo" <option value=".$row['Project_Name'].">".$row['Project_Name']."</option>";
					}echo"		</select>";
				}
				mysqli_close($conn);
				?>
				
			
		
	


<?php echo"muonintro1.php?User_ID=".$name.""; ?>