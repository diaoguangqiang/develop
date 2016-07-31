<?php
namespace Student\Controller;
use Think\Controller;

/*
 * 题库
 */
class ErrorController extends BaseController {
    public function index(){
    	
    }
    
    /*
     * 初始化界面
     */
    public static function nodata(){
    	//$this->error('没有页面');
    	error('没有页面');
    }
    
    
  
}