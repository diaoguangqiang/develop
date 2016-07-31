<?php
namespace Home\Controller\_empty;
use Think\Controller;

//http://localhost:87/baifen/dafaqffasd
class index extends Controller{    
	public function run(){        
		echo '执行'.CONTROLLER_NAME.'控制器的'.ACTION_NAME.'操作';    
	}

}