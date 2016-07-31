<?php
namespace Home\Behavior;
use Think\Behavior;

class AuthCheckBehavior extends Behavior {     
	// 行为扩展的执行入口必须是run     
	public function run(&$return){         
		if(C('USER_AUTH_ON')) {
  			// 进行权限认证逻辑 如果认证通过 $return = true;             
  			// 否则用halt输出错误信息         
		}     
	}

}