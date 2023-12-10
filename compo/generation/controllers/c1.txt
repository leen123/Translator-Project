<?php
$numbers1 = [1,3,44,5,6,7];
for($i = 0 ;$i <= 5 ;$i++){
	if($_SESSION["numbers1"][$i] == 6){
		header('Location: p0.html');
	}
	else {
		header('Location: p2.html');
	}
}

?>
