<?php
namespace Home\Controller;
use Think\Controller;

//通过URL请求响应，例如 http://serverName/Index/index
class IndexController extends Controller {
    public function index(){
    	/*echo __MODULE__.'<br>';
    	echo COMMON_PATH.'<br>';
    	echo MODE_PATH.'<br>';
    	echo __MODULE__.'<br>';
    	echo __CONTROLLER__.'<br>';
    	echo __ROOT__.'/Home/Common/Css/layout.css<br>';
    	echo MODULE_NAME.'<br>';
    	echo __SELF__.'<br>';
    	*/
    	
    	//设置顶部
    	$this->getTop();
    	
    	//获取菜单
    	$this->getMenu();
    	
    	$this->theme('default')->display('Index:index');
    	
    	
    	//$this->display('Public:top');
    	//$this->display('Public:head');
    	//$this->display('Public:menu');
    	//$this->display('Public:content');
    	//$this->display('Public:foot');
    }
    
    public function add()
    {
    	echo 'add';
    }
   
    protected  function getMenu()
    {
    	$this->assign('menu_sy', '首页');
    	
    	$this->assign('menu_cjbj', '创建班级');
    	$this->assign('menu_scst', '上传试题');
    	$this->assign('menu_ksks', '开始考试');
    	$this->assign('menu_lxwm', '联系我们');
    }
    
	protected  function getTop()
    {
    	$this->assign('phone','手机客户端');
    }
	
}