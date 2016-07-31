<?php
namespace Home\Controller\Index;
use Think\Controller;

class index extends Controller{    
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