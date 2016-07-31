<?php

//验证函数
function checkPwd(){
	$password=$_POST['password'];
	if( strlen($password) >= 6 )
		return true;
	else{
		return false;
	}
}