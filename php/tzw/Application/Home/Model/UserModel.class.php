<?php
namespace Home\Model;
use Think\Model;

class UserModel extends BaseModel{
	//protected $tableName="user";
	
	//表单映射
	protected $_map = array(
		'uname'=>'username',
		'pwd'=>'password',
		'mail'=>'email',
	);
	
		
	//自动验证
	protected $_validate = array(     
		array('verify','require','验证码必须！'), 
		
		//默认情况下用正则进行验证     
		array('uname','require','用户名必须填写！',Model::MUST_VALIDATE, 'regex', Model::MODEL_BOTH), 
		
		//下面语句实现不了
		//array('uname','','用户名已经存在！',Model::MUST_VALIDATE, 'unique', Model::MODEL_INSERT), 

		array('pwd','require','密码必须填写！'), 
		array('email','email','邮箱格式错误！'), 
		
		
		// 在新增的时候验证   
		array('active',array(0,1),'数据错误！',0,'in'), 
		
		// 当值不为空的时候判断是否在一个范围内     
		array('repassword','password','确认密码不正确',0,'confirm'), 
		
		// 验证确认密码是否和密码一致    
		array('password','checkPwd','密码长度不足6位!',1,'callback'), 
		
		// 自定义函数验证密码格式  
	);
	
	//数据自动完成
	protected $_auto=array(
		//字段，内容，条件，附加规则
		array('reg_date','getDate','1','callback'),
		array('password', 'md5', 1, 'function'),
	);
	
	private function getDate(){
		return date('Y-m-d H:i:s');
	}
	
	private function checkPwd(){
		$password=$_POST['password'];
		if( strlen($password) >= 6 )
			return true;
		else{
			return false;
		}
	}
	
}




















