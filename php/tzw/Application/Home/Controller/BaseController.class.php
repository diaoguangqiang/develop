<?php
namespace Home\Controller;
use Think\Controller;

class BaseController extends Controller{
	
	public function _initialize(){
		header('Content-type:text/html;charset=utf-8');
		
		$this->set_assign();
		
	}
	
	private function set_assign(){
		
		$this->assign('title', '校园官网');
		
		$this->assign('web_brief', '以校园为主体的网络考试系统');		
		
		$this->assign('start', '开启之旅');
		$this->assign('web_demo_download', 'Desktop V1.0.1 （敬请期待）');
		$this->assign('Android_App_download', 'Android App V1.0.1 下载');
		$this->assign('IOS_App_download', 'IOS App V1.0.1（敬请期待）');
		
		$this->assign('home', '主页');
		$this->assign('web', '网站');
		$this->assign('app', '移动');
		$this->assign('case', '案例');
		$this->assign('download', '下载');
		$this->assign('download_area', '下载专区');
		$this->assign('contact', '联系');
		$this->assign('baifen', '百分网');
		$this->assign('student', '学生');
		$this->assign('teacher', '教师');
		$this->assign('stu_plat', '学生平台');
		$this->assign('tea_plat', '教师平台');
		$this->assign('publicwelfare', '公益平台');
		
		$this->assign('gallery', '画廊');
		$this->assign('contact_me', '联系我们');
		
		$this->assign('download_enter', '进入');		
		
		$this->assign('web_exam', '网页考试系统');
		$this->assign('web_desc', '网页版考试系统支持浏览器端进行学习、考试、提交试卷、发布学习资料、批阅试卷、管理学生等功能。');
		
		$this->assign('app_exam', '手机考试系统');
		$this->assign('app_desc', '手机考试系统支持手机端进行学习、考试、提交试卷使用。');
		
		$this->assign('desktop_exam', '桌面考试系统');
		$this->assign('desktop_desc', '桌面版考试系统支持电脑端进行学习、考试、提交试卷、发布学习资料、批阅试卷、管理学生等功能。');
		
		$this->assign('title', '校园官网');
		
		
		
		
		//--foot--
		$this->assign('HZ', '杭州');
	}
}