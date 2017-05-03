<?php
	if(isset($_REQUEST['User_ID'])){
		include('connection.php');
		$user=$_REQUEST['User_ID'];
		$id = $_REQUEST['STT'];
		$ngaymuon= date("Y-m-d");
		$ngaytra= $_REQUEST['ngaytra'];
		$duan = $_REQUEST['duan'];
		$soluong = $_REQUEST['points'];
		$ID12 = phpAlert()+1;
		echo '<br/>'.$ID12 ;
		echo '<br/>'.$user ;
		echo '<br/>'.$id ;
		echo '<br/>'.$ngaymuon ;
		echo '<br/>'.$ngaytra ;
		echo '<br/>'.$duan ;
		echo '<br/>'.$soluong ;
		
		
		$sql="INSERT INTO borrow_request (Confirm_ID, Device_ID, User_ID, Project_Name, Borrow_Date, Expect_Date, Quantity,Confirm) VALUES (".$ID12.", ".$id.", '".$user."', N'".$duan."', '".$ngaymuon."', '".$ngaytra."', ".$soluong.",0)";
		if(mysqli_query($conn, $sql)){
			header('location: indexLG.php?User_ID='.$user.'');
		}else{
			echo'đéo';
		}
		mysqli_close($conn);
	}

?>
<?php
	function phpAlert() {
	include('connection.php');
    $sql1= "select MAX(Confirm_ID) from borrow_request ";
	$maxID=0;
	$result1 = mysqli_query($conn,$sql1);
    $row = mysqli_fetch_row($result1);
    $maxID  = $row[0];
	return $maxID ;
		
}

?>