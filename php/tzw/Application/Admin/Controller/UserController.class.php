<?php
namespace Admin\Controller;
use Think\Controller;

//UserController负责外部交互响应，通过URL请求响应，例如 http://serverName/User/index
//$User = A('Admin/User'); 
class UserController extends BaseController{
	public function index(){
		$this->show("User");
	}
}