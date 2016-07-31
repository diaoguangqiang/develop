<?php
namespace Student\Controller;
use Think\Controller;

class BaseController extends Controller{
	
	public function _initialize(){
		header('Content-type:text/html;charset=utf-8');
		
		$this->set_assign();
		
	}
	
	/*
     * 登出系统
     * 		退出系统后，跳转至首页 http://127.0.0.1/tzw/student.php/Index/
     */
    public function loginOut(){
    	$this->success("退出成功","../"); //
    }
	
	private function set_assign(){
		
		$this->assign('title', '校园官网');
		$this->assign('eschool_web', '校园官网');
		$this->assign('service', '技术支持');
		$this->assign('mobile_app', '移动APP');
		
		
		$this->assign('web_brief', '以校园为主体的网络考试系统');		
		
		$this->assign('start', '开启之旅');
		$this->assign('web_demo_download', 'Desktop V1.0.1 （敬请期待）');
		$this->assign('Android_App_download', 'Android App V1.0.1 下载');
		$this->assign('IOS_App_download', 'IOS App V1.0.1（敬请期待）');
		
		$this->assign('stu_plat', '|&nbsp;&nbsp;  学生平台');
		$this->assign('tea_plat', '|&nbsp;&nbsp;  教师平台');
		
		
		$this->assign('home', '主页');
		$this->assign('web', '网站');
		$this->assign('app', '移动');
		$this->assign('case', '案例');
		$this->assign('download', '下载');
		
		$this->assign('contact', '联系');
		$this->assign('baifen', '百分网');
		$this->assign('student', '学生');
		$this->assign('teacher', '教师');
		
		$this->assign('gallery', '画廊');
		$this->assign('contact_me', '联系我们');
		$this->assign('publicwelfare', '公益事业');
		$this->assign('oriange_light', '小桔灯');
		$this->assign('create_account', '注册用户');
		
		$this->assign('download_enter', '进入');		
		
		$this->assign('web_exam', '网页考试系统');
		$this->assign('web_desc', '网页版考试系统支持浏览器端进行学习、考试、提交试卷、发布学习资料、批阅试卷、管理学生等功能。');
		
		$this->assign('app_exam', '手机考试系统');
		$this->assign('app_desc', '手机考试系统支持手机端进行学习、考试、提交试卷使用。');
		
		$this->assign('desktop_exam', '桌面考试系统');
		$this->assign('desktop_desc', '桌面版考试系统支持电脑端进行学习、考试、提交试卷、发布学习资料、批阅试卷、管理学生等功能。');
		
		//---- 登录 -----
		$this->assign('login', '登&nbsp;&nbsp;录');
		$this->assign('forget_pwd', '忘记密码?');
		$this->assign('login_fast', '快速登录');
		
		
		//--foot--
		$this->assign('HZ', '杭州');
		$this->assign('copyright', 'Copyright &copy; 2012 杭州');
		
		$this->assign('persion_info', '个人信息');
		$this->assign('passwd', '密码');
		$this->assign('passwd_change', '修改密码');
		$this->assign('account', '账号');
		$this->assign('account_change', '账号信息');
		$this->assign('sys_set', '系统设置');
		$this->assign('school_name', '名称');
		$this->assign('my_school_name', '校园官网');
		
		$this->assign('doc', '操作手册');
		$this->assign('quit', '安全退出');
		
		
		
		$this->assign('bank', '题库');
		$this->assign('practice', '开始练习');
		$this->assign('edit_bank', '编辑题库');
		$this->assign('add_bank', '添加题库');
		$this->assign('view_bank', '查看题库');
		$this->assign('list_bank', '题库列表');
		$this->assign('limit_bank', '题库扩容');
		$this->assign('add_onebyone_bank', '添加');
		$this->assign('import_bank', '批量导入');
		$this->assign('del', '删除');
		
		$this->assign('paper', '试卷');
		$this->assign('paper_do', '开始考试');
		$this->assign('find', '查询');
		$this->assign('his_score', '历史成绩');	
		
		$this->assign('other', '其他');
		$this->assign('school_code', '校园码');			
		$this->assign('problem_count', '问卷调查');
		
		$this->assign('web_map', '网站地图');
		
		$this->assign('wellcome', ',欢迎进入学习系统');
		
		$this->assign('notice', '通知');
		$this->assign('ip', '登录IP:');
		$this->assign('last_time', '上次登录时间:');
		
		
		
		$this->assign('sjlb', "试卷列表");
    	$this->assign('sjmc', "试卷名称");
    	$this->assign('fen', "分");
    	$this->assign('fs', "分数");
    	$this->assign('ti', "题");
    	$this->assign('tm', "题目");
    	$this->assign('num', "数量 /（题）");
    	$this->assign('dxt', "单选题");
    	$this->assign('xzt', "选择题");
    	$this->assign('pdt', "判断题");
    	$this->assign('zgt', "主观题");
    	$this->assign('bj', "编辑");
    	$this->assign('edit', "编辑");
    	$this->assign('xuexi', "练习");
    	
    	$this->assign('choice', "选择题");
    	
    	$this->assign('judge', "判断题");
    	$this->assign('true', "√");
    	$this->assign('false', "X");
    	
    	$this->assign('subject', "主观题");
    	$this->assign('answer', "答:&nbsp;");
		
	}
}