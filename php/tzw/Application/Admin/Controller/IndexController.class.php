<?php
namespace Admin\Controller;
use Think\Controller;
class IndexController extends BaseController {
    public function index(){
    	$this->theme('default')->display('Index:index');
		//$this->display('Public:index');		 
    }
    
    
}