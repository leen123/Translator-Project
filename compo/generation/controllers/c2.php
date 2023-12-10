<?php
$values = [$_POST['name'],$_POST['email'],$_POST['password'],$_POST['country'],$_POST['married'],$_POST['gender'],$_POST['age'],$_POST['number_1A'],$_POST['profile_image'],5];
$numbers = [1,3,44,5,6,7];
for($i = 0 ;$i <= 5 ;$i++){
	$_SESSION["values"][$i] = strtoupper($_SESSION["values"][$i]);
	if(1 == "syria"){
			$_SESSION["name"] = $name;
			$_SESSION["email"] = $email;
		header('Location: p0.html');
	}
	else if($_SESSION["values"][$i] == 1){
		$_SESSION["values"][$i][8] = strtoupper($_SESSION["values"][$i][8]);
			$_SESSION["email"] = $email;
		header('Location: p0.html');
	}
	else if($_SESSION["values"][$i] == 5){
		for($j = 0 ;$j <= $_SESSION["values"][$i] ;$j++){
			$_SESSION["numbers"][$j] = $_SESSION["numbers"][$j] + 1;
		}
	}
	else {
		$_SESSION["values"][$i] = strtolower($_SESSION["values"][$i]);
	}
		$_SESSION["email"] = $email;
	header('Location: p0.html');
}

?>
