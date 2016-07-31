<?php
namespace Teacher\Controller;
use Think\Controller;
use Think\Model;

/*
 * 题库
 */
class PaperController extends BaseController {
    public function index(){
    	
    }
    
    /*
     * 初始化界面
     */
    public function initView(){
    	//$m=M('paper');
    	$m = new Model();
    	//$sql="select * from tb_paper";
    	//$list=$m->field('name, choice, cnum, cscore, judge, jnum, jscore, subject, snum, sscore')->select();
    	$school_id=1;
		$list = $m->query("SELECT 	tb_bank.id as id, tb_bank.pid as pid, tb_bank.`name` as name,
 			tb_bank.choicenum as cnum, tb_bank.judgenum as jnum, tb_bank.subjectnum as snum 
 			FROM tb_bank, tb_school WHERE tb_bank.pid = tb_school.id AND tb_school.id = '".$school_id."';");
		
		//dump($list);
		
    	if ($list) {    		
    		$this->assign('list', $list);
    	    	
    		$this->theme('default')->display('bank:list');
    	}
    	else{
    		$this->error("没有题库");
    		
    	}		
    }
    
    /*
     * 链接：练习
     */
    public function choiceDo(){
    	//题目pid
    	$pid = $_GET['pid'];
    	//$pid = 138;
    	//$id = $_GET['id'];
    	
    	$pageNo = $_GET['p'];
    	if (empty($pageNo) ) {
    		$pageNo = 0;
    	}
    	
    	//sql 从0开始查询
    	$pageNo = $pageNo - 1;
    	
    	//每页的数目
    	$num = 1;
    	
    	//echo $pid.",".$id;
    	
    	$m = new Model();
    	//换行时请注意空格
    	$list = $m->query("select tb_bank.`name`, tb_bank_choice.* from tb_bank, tb_bank_choice ".
    					"WHERE tb_bank_choice.pid = '".$pid."' and tb_bank.id = tb_bank_choice.pid ".
    					"and tb_bank_choice.title<>'' ".
    					"LIMIT ".$pageNo.", ".$num."
    					;");
    	
    	if ( !$list ) {
    		$this->error("没有题目");
    	}
    	
    	//echo $list[0]['name'];
    	//dump($list);
    	
    	$count = $m->query("select COUNT(*) as total from tb_bank, tb_bank_choice WHERE tb_bank_choice.pid = '".$pid."' and tb_bank.id = tb_bank_choice.pid;");
    	//dump($count);
    	if ( !$count ) {
    		$this->error("没有添加题目");
    	}
    	
    	// 字符型转整形
    	$total = intval($count[0]['total']) - 1 ;	//
    	$total = intval($count[0]['total']) ;
    	//echo($total);
    	
    	//$page = new \Think\MyPage(intval($count), $num);
    	$page = new \Think\MyPage($total, $num);
    	
    	$page->setConfig('theme', '<li><a>%totalRow% %header%</a></li> %upPage% %first%  %prePage%  %linkPage% %downPage% %nextPage% %end% ');
    	$show = $page->show();
    	
    	$this->assign('pid', $pid);
    	$this->assign('show', $show);
    	$this->assign('pageNo', $pageNo);
    	$this->assign('num', $num);
    	
    	$this->assign('list', $list);
    	$this->assign('bank_name', $list[0]['name']);    	    	
    	    	
    	$this->theme('default')->display('bank:choice');
    	
    	
    }
  
    /*
     * 判断题
     */
    public function judgeDo(){
    	//题目pid
    	$pid = $_GET['pid'];
    	//$pid = 138;
    	//$id = $_GET['id'];
    	
    	$pageNo = $_GET['p'];
    	if (empty($pageNo) ) {
    		$pageNo = 0;
    	}
    	
    	//sql 从0开始查询
    	$pageNo = $pageNo - 1;
    	
    	//每页的数目
    	$num = 1;
    	
    	//echo $pid.",".$id;
    	
    	$m = new Model();
    	//换行时请注意空格
    	$list = $m->query("select tb_bank.`name`, tb_bank_judge.* from tb_bank, tb_bank_judge ".
    					"WHERE tb_bank_judge.pid = '".$pid."' and tb_bank.id = tb_bank_judge.pid ".
    					"and tb_bank_judge.title<>'' ".
    					"LIMIT ".$pageNo.", ".$num."
    					;");
    	
    	if ( !$list ) {
    		$this->error("没有题目");
    	}
    	
    	//echo $list[0]['name'];
    	//dump($list);
    	
    	$count = $m->query("select COUNT(*) as total from tb_bank, tb_bank_judge WHERE tb_bank_judge.pid = '".$pid."' and tb_bank.id = tb_bank_judge.pid;");
    	//dump($count);
    	if ( !$count ) {
    		$this->error("没有添加题目");
    	}
    	
    	// 字符型转整形
    	$total = intval($count[0]['total']) - 1 ;	//
    	$total = intval($count[0]['total']) ;
    	//echo($total);
    	
    	//$page = new \Think\MyPage(intval($count), $num);
    	$page = new \Think\MyPage($total, $num);
    	
    	$page->setConfig('theme', '<li><a>%totalRow% %header%</a></li> %upPage% %first%  %prePage%  %linkPage% %downPage% %nextPage% %end% ');
    	$show = $page->show();
    	
    	$this->assign('pid', $pid);
    	$this->assign('show', $show);
    	$this->assign('pageNo', $pageNo);
    	$this->assign('num', $num);
    	
    	$this->assign('list', $list);
    	$this->assign('bank_name', $list[0]['name']);    	    	
    	    	
    	$this->theme('default')->display('bank:judge');
    }
    
    /*
     * 主观题
     */
    public function subjectDo(){
    	//题目pid
    	$pid = $_GET['pid'];
    	//$pid = 138;
    	//$id = $_GET['id'];
    	
    	$pageNo = $_GET['p'];
    	if (empty($pageNo) ) {
    		$pageNo = 0;
    	}
    	
    	//sql 从0开始查询
    	$pageNo = $pageNo - 1;
    	
    	//每页的数目
    	$num = 1;
    	
    	//echo $pid.",".$id;
    	
    	$m = new Model();
    	$list = $m->query("select tb_bank.`name`, tb_bank_subject.* from tb_bank, tb_bank_subject ".
    					"WHERE tb_bank_subject.pid = '".$pid."' and tb_bank.id = tb_bank_subject.pid ".
    					"and tb_bank_subject.title<>'' ".
    					"LIMIT ".$pageNo.", ".$num."
    					;");
    	
    	if ( !$list ) {
    		$this->error("没有题目");
    	}
    	
    	//echo $list[0]['name'];
    	//dump($list);
    	
    	$count = $m->query("select COUNT(*) as total from tb_bank, tb_bank_subject WHERE tb_bank_subject.pid = '".$pid."' and tb_bank.id = tb_bank_subject.pid;");
    	//dump($count);
    	if ( !$count ) {
    		$this->error("没有添加题目");
    	}
    	
    	// 字符型转整形
    	$total = intval($count[0]['total']) - 1 ;	//
    	$total = intval($count[0]['total']) ;
    	//echo($total);
    	
    	//$page = new \Think\MyPage(intval($count), $num);
    	$page = new \Think\MyPage($total, $num);
    	
    	$page->setConfig('theme', '<li><a>%totalRow% %header%</a></li> %upPage% %first%  %prePage%  %linkPage% %downPage% %nextPage% %end% ');
    	$show = $page->show();
    	
    	$this->assign('pid', $pid);
    	$this->assign('show', $show);
    	$this->assign('pageNo', $pageNo);
    	$this->assign('num', $num);
    	
    	$this->assign('list', $list);
    	$this->assign('bank_name', $list[0]['name']);    	    	
    	    	
    	$this->theme('default')->display('bank:subject');
    }
    
    /*
     * 教师端：添加试卷
     */
    public function add(){
    	
    	//提取题库信息
    	$m = new Model();
    	
    	$banklist = $m->query("SELECT * from tb_bank WHERE choicenum<>0 or judgenum<>0 or subjectnum<> 0;");
    	
    	$this->assign('list', $banklist);
    	
    	
    	//
    	$this->theme('default')->display('paper:add');
    }
    
    /*
     * 提交题库
     */
    public function addName(){
    	$name = trim( $_POST['name'] );
    	$pid = 1;
    	
    	if ( empty($name) || $name == '' || $name== null ) {
    		$this->error('题库名称不能为空');
    	}
    	
    	if ( empty($pid) || $pid == '' || $pid == null ) {
    		$this->error('参数非法');
    	}
    	    	  	
    	$m = new Model();
    	
    	//判断题库数量上限
    	$limit = 10;
    	$sql = "SELECT count(*) as total FROM tb_bank WHERE pid ='".$pid."';";
		$list = $m->query($sql);
    	
		if ( false != $list ) {
			$num = intval($list[0]['total']);
			if ( $num >= $limit ) {
				$this->error('对不起, 题库数量到达上限, 请删除部分题库!', './viewBank');
			}
		}		

		//插入题库
    	$sql = "INSERT INTO tb_bank (pid, name) VALUES('".$pid."','".$name."');";
    	$result = $m->execute($sql);
    	if ( false == $result ) {
    		$this->error('插入数据库异常');
    	}else{
    		$this->error('执行成功，您可以继续添加题库');
    	}   	
    	
    }
    
    /*
     * 教师端：查看题库
     */
    public function viewBank(){
    	$m = new Model();
    	$school_id=1;
		$list = $m->query("SELECT 	tb_bank.id as id, tb_bank.pid as pid, tb_bank.`name` as name,
 			tb_bank.choicenum as cnum, tb_bank.judgenum as jnum, tb_bank.subjectnum as snum 
 			FROM tb_bank, tb_school WHERE tb_bank.pid = tb_school.id AND tb_school.id = '".$school_id."';");
    	
		//dump($list);
		
		if ($list) {     		
    		$this->assign('list', $list);
    	
    		$this->theme('default')->display('bank:list');
    	}
    	else{
    		$this->error("没有题库", "./addBank");    		  		
    	}
		
    }
}