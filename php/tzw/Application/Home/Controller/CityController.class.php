<?php
namespace Home\Controller;
use Think\Controller;

class CityController extends Controller{    
	public function _empty($name){        
		//把所有城市的操作解析到city方法       
		$this->city($name);    
	}    
	
	//注意 city方法 本身是 protected 方法   
	 protected function city($name){        
	 	//和$name这个城市相关的处理         
	 	echo '当前城市' . $name;    
	 }

}