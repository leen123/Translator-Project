<?php
if((int)$_POST['age'] > 17){
	header('Location: p1.html');
}
else {
	header('Location: p0.html');
}

?>
