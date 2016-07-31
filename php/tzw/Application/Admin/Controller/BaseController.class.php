<?php
namespace Admin\Controller;
use Think\Controller;
class BaseController extends Controller {
	public function _initialize(){
		header('Content-type:text/html;charset=utf-8');
	}
}