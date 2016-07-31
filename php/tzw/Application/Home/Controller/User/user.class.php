<?php
namespace Home\Controller\User;
use Think\Controller;

//http://localhost:87/baifen/index.php/User/user
class user extends Controller{
	protected $connection = 'DB_CONFIG1';
	
	public function _before_run(){        
		echo 'before_'.ACTION_NAME;    
	}

	public function run(){
		echo '执行Index控制器的index操作';
	}
	
	public function _after_run(){        
		echo 'after_'.ACTION_NAME;    
	}

}