<?php
namespace Home\Controller;
use Think\Controller\RpcController;

class ServerController extends RpcController{    
	public function test1(){        
		return 'test1';    
	}    
	
	public function test2(){        
		return 'test2';    
	}    
	
	private function test3(){        
		return 'test3';    
	}    
	
	protected function test4(){        
		return 'test3';    
	}

}