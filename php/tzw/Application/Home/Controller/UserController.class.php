<?php
namespace Home\Controller;
use Think\Controller;

//UserController负责外部交互响应，通过URL请求响应，例如 http://serverName/User/index
//http://localhost:87/baifen/User/index
//$User = A('User'); 
class UserController extends BaseController{
	public function index(){
		
		/*$user = M('User');////实例化User对象
		$list = $user->select();
		//dump($list);
		$this->assign('title', '用户列表');
		$this->assign('ulist', $list);
		*/
		//$this->theme('User')->display('index');
		$this->display('add');
	}
	
	public function add(){
		echo 'add';
	}
	
	public function delete(){
		echo 'del';
	}
	
	public function insert(){
		echo 'insert';
	}
	
 	public function update(){         
 		if (IS_POST){             
 			$User = M('User');             
 			$User->create();             
 			$User->save();             
 			$this->success('保存完成');         
 		}else{             
 			$this->error('非法请求');         
 		}     
 	}
 	
	public function upload(){    
		$upload = new \Think\Upload();
		// 实例化上传类    
		$upload->maxSize   =     3145728 ;
		// 设置附件上传大小    
		$upload->exts      =     array('jpg', 'gif', 'png', 'jpeg');
		// 设置附件上传类型   
		 $upload->savePath  =      './Public/Uploads/'; 
		 // 设置附件上传目录   
		 // 上传文件    
		 $info   =   $upload->upload();    
		 if(!$info) {
		 	// 上传错误提示错误信息       
		 	$this->error($upload->getError());    
		 }else{
		 	// 上传成功       
		 	$this->success('上传成功！');    
		 }
	} 	
}