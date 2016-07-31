<?php
namespace Student\Controller;
use Think\Controller;
use Think\Model;

/*
 * 题库
 */
class BankController extends BaseController {
    public function index(){
    	//$this->initView();
    }
    
    /*
     * 初始化界面
     */
    public function prePractice(){
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
}