<?php
namespace Home\Controller;
use Think\Controller\RestController;

Class InfoController extends RestController {   
	Public function rest() {     
		switch ($this->_method){      
			case 'get': 
				// get请求处理代码          
				if ($this->_type == 'html'){           
				}
				elseif($this->_type == 'xml'){ 

				}
				break;      
			
			case 'put': 
				// put请求处理代码           
				break;      
				
			case 'post': 
				// post请求处理代码           
				break;     
		}   
	} 
	
	protected $allowMethod    = array('get','post','put'), 
	// REST允许的请求类型列表    
	protected $allowType      = array('html','xml','json'), 
	// REST允许请求的资源类型列表    
	
	Public function read_get_html(){        
		// 输出id为1的Info的html页面    
	}    
	
	Public function read_get_xml(){        
		// 输出id为1的Info的XML数据   
	}    
	
	Public function read_xml(){        
		// 输出id为1的Info的XML数据    
	
	}    
	
	Public function read_json(){        
		// 输出id为1的Info的json数据    
	}
	
}