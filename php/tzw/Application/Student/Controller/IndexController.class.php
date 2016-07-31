<?php
namespace Student\Controller;
use Think\Controller;
class IndexController extends BaseController {
    public function index(){
        //$this->show('<style type="text/css">*{ padding: 0; margin: 0; } div{ padding: 4px 48px;} body{ background: #fff; font-family: "微软雅黑"; color: #333;font-size:24px} h1{ font-size: 100px; font-weight: normal; margin-bottom: 12px; } p{ line-height: 1.8em; font-size: 36px }</style><div style="padding: 24px 48px;"> <h1>:)</h1><p>欢迎使用 <b>ThinkPHP</b>！</p><br/>[ 您现在访问的是Student模块的Index控制器 ]</div><script type="text/javascript" src="http://tajs.qq.com/stats?sId=9347272" charset="UTF-8"></script>','utf-8');
   		
    	$this->theme('default')->display('index:index');
    
    }
    
    /*
     * 检查是否允许登录
     * 		失败：返回当前页
     * 		成功：跳转至后台页面
     */
    public function check(){
    	//echo "yes";
    	//$this->error("登录失败, IP已录入 ... "); //查询失败后返回上一页
    	$this->success("登录成功","./main");
    }
    
    /*
     * 用户登录后的主页
     * 		
     */
	public function main(){
    	$this->theme('default')->display('index:main');
    	
    	//$this->success("登录成功","./main");
    }
    
    
    
}