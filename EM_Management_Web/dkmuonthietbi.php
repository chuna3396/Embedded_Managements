<?php
	if(isset($_REQUEST['User_ID'])){
		$user=$_REQUEST['User_ID'];
		$ngaymuon= date("Y-m-d");
		$ngaytra= $_REQUEST['ngaytra'];
		$duan = $_REQUEST['duan'];
		$soluong = $_REQUEST['points'];
		echo '<br/>'.$user;
		echo '<br/>'.$ngaymuon;
		echo '<br/>'.$ngaytra;
		echo '<br/>'.$duan;
		echo '<br/>'.$soluong;
	}

?>