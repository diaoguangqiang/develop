<?php
namespace Home\Model;
use Think\Model;

class NewsModel extends Model { 
	    
	protected $_scope = array(         
		
		// 命名范围normal         
		'normal'=>array(             
			'where'=>array('status'=>1),
		),         
	
		// 命名范围latest         
		'latest'=>array(             
			'order'=>'create_time DESC',             
			'limit'=>10,         
		),     
	);

}