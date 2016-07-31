<?php
namespace Home\Controller;
use Think\Controller;

class BlogController extends Controller{    
	public function read($id){        
		echo 'id='.$id;    
	}    
	
	public function archive($year='2013',$month='01'){ 
	 	echo 'year='.$year.'&month='.$month;    
	}

}