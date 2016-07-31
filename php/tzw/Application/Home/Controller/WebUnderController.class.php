<?php
namespace Home\Controller;
use Think\Controller;
use Org\Net\Http;
/*
 * 本科区
 */
class WebUnderController extends WebController {
    public function index(){
        //$this->show('<style type="text/css">*{ padding: 0; margin: 0; } div{ padding: 4px 48px;} body{ background: #fff; font-family: "寰蒋闆呴粦"; color: #333;font-size:24px} h1{ font-size: 100px; font-weight: normal; margin-bottom: 12px; } p{ line-height: 1.8em; font-size: 36px }</style><div style="padding: 24px 48px;"> <h1>:)</h1><p>娆㈣繋浣跨敤 <b>ThinkPHP</b>锛�</p><br/>[ 鎮ㄧ幇鍦ㄨ闂殑鏄疕ome妯″潡鐨処ndex鎺у埗鍣� ]</div><script type="text/javascript" src="http://tajs.qq.com/stats?sId=9347272" charset="UTF-8"></script>','utf-8');
    	
    	$this->theme('default')->display('index:index');
    
    }
    
    public function DownZjlgBV101(){
    	//$name="ESchool_ZLG_B_V1.0.1_2013.07.zip"
    	$filename="PublicHome/download/web/ESchool_ZLG_B_V1.0.1_2013.07.zip";        
        $showname="ESchool_ZLG_B_V1.0.1_2013.07.zip";
        Http::download($filename, $showname);
    }
    
	public function DownZjlgBV102(){
    	$filename="PublicHome/download/web/ESchool_ZLG_B_V1.0.2_2013.09.zip";        
        $showname="ESchool_ZLG_B_V1.0.2_2013.09.zip";
        Http::download($filename, $showname);
    }
    
	public function DownZjsfBV101(){
    	
    }
    
    
}