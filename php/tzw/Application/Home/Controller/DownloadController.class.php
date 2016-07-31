<?php
namespace Home\Controller;
use Think\Controller;

class DownloadController extends BaseController {
    public function index(){
        //$this->show('<style type="text/css">*{ padding: 0; margin: 0; } div{ padding: 4px 48px;} body{ background: #fff; font-family: "寰蒋闆呴粦"; color: #333;font-size:24px} h1{ font-size: 100px; font-weight: normal; margin-bottom: 12px; } p{ line-height: 1.8em; font-size: 36px }</style><div style="padding: 24px 48px;"> <h1>:)</h1><p>娆㈣繋浣跨敤 <b>ThinkPHP</b>锛�</p><br/>[ 鎮ㄧ幇鍦ㄨ闂殑鏄疕ome妯″潡鐨処ndex鎺у埗鍣� ]</div><script type="text/javascript" src="http://tajs.qq.com/stats?sId=9347272" charset="UTF-8"></script>','utf-8');
    	
    	$this->title();
    	
    	$this->theme('default')->display('download:download');
    
    }
    
    
    
    public function title(){
    	
    	$this->assign('download_area', '下载区');
    	
    	$this->assign('download_public', '通用版本');
    	
    	$this->assign('download_private', '定制版本');
    	
    	$this->assign('version_list', '历史版');
    	$this->assign('version_web_list', '网页版');
    	$this->assign('version_web_under_list', '本科生网页版');
    	$this->assign('version_web_post_list', '研究生网页版');
    	$this->assign('version_app_list', '手机版');
    	$this->assign('version_desktop_list', '桌面版');
    	
    	$this->assign('web_zlg_ben_v101', 'ESchool_ZLG_B_V1.0.1_2013.07');
    	$this->assign('web_zlg_ben_v102', 'ESchool_ZLG_B_V1.0.2_2013.09');
    	
    	$this->assign('web_zlg_yan_v101', 'ESchool_ZLG_Y_V1.0.1_2012.06');
    	$this->assign('web_zlg_yan_v102', 'ESchool_ZLG_Y_V1.0.2_2013.06');
    	
    	$this->assign('web_zsd_yan_v101', 'ESchool_ZJSF_Y_V1.0.1_2012.11');
    	$this->assign('web_zsd_yan_v1', 'ESchool_ZJSF_Y_V1.0.1_2012.11');
    	
    	$this->assign('web_v', 'ESchool_PHP_V2.0.1');
    	$this->assign('app_android_v', 'ESchool_Android_V1.0.1');
    	$this->assign('app_ios_v', 'ESchool_IOS_V1.0.1');
    	$this->assign('desktop_v', 'ESchool_Desktop_V1.0.1');
    	
    	$this->assign('app_android_v1', '手机考试系统  Android V1.0.1_2016.06');
    	$this->assign('app_zjsf_android_v101', 'ESchool_Zjsf_Android_V1.0.1_2016.06');
    	$this->assign('app_zjsf_ios_v101', 'ESchool_Zjsf_IOS_V1.0.1_2016.07');
    	
    	$this->assign('desktop_v1', '桌面版考试系统 V1.0.1');
    }
}













