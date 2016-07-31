<?php
namespace Home\Controller;
use Think\Controller;

//通过URL请求响应，例如 http://serverName/Index/index
class DisplayController extends Controller {
	private $imageDir ='';
	public  $imageEntDir='';
	
    public function index(){
    	$this->setImageDir();
    	
    	//$this->dealImage();
    	    	    	
    	$this->setSubject();   	
    	
    	$this->theme('default')->display('Display:display');
    	
    }
    
    private function setSubject(){
    	$this->assign('image_dis_head', $this->imageDir.'/Display/dis_head.jpg');
    	
    	$this->assign('image_bf', $this->imageDir.'/Display/bf.jpg');
    	$this->assign('title_bf', "百分网");
    	
    	$this->assign('image_ych', $this->imageDir.'/Display/ych.jpg');
    	$this->assign('title_ych', "迎春花");
    	
    	$this->assign('image_tzw', $this->imageDir.'/Display/tzw.jpg');
    	$this->assign('title_tzw', "滕州湾");
    	
    	$this->assign('image_gz', $this->imageDir.'/Display/gz.jpg');
    	$this->assign('title_gz', "关注");
    	
    	$this->assign('title', "时代");
    	$this->assign('path', $this->imageDir);
    }
    
    private function dealImage()
    {
    	$image = new \Think\Image();    		
    	
    	//$image->open($this->imageEntDir.'/dis_head.jpg');// 按照原图的比例生成一个最大为150*150的缩略图并保存为thumb.jpg
    	//$image->thumb(960, 100)->save($this->imageEntDir.'/Display/dis_head.jpg');
    	
    	$image->open($this->imageEntDir.'/bf.jpg');// 按照原图的比例生成一个最大为150*150的缩略图并保存为thumb.jpg
    	$image->thumb(200, 200)->save($this->imageEntDir.'/Display/bf.jpg');
    	
    	$image->open($this->imageEntDir.'/ych.jpg');// 按照原图的比例生成一个最大为150*150的缩略图并保存为thumb.jpg
    	$image->thumb(200, 200)->save($this->imageEntDir.'/Display/ych.jpg');
    	
    	$image->open($this->imageEntDir.'/tzw.jpg');// 按照原图的比例生成一个最大为150*150的缩略图并保存为thumb.jpg
    	$image->thumb(200, 200)->save($this->imageEntDir.'/Display/tzw.jpg');
    	
    	$image->open($this->imageEntDir.'/gz.jpg');// 按照原图的比例生成一个最大为150*150的缩略图并保存为thumb.jpg
    	$image->thumb(200, 200)->save($this->imageEntDir.'/Display/gz.jpg');
    }
    
    private function setImageDir(){
    	$this->imageDir = __ROOT__.'/Application/Home/View/default/Public/Images';//返回给网页端
    	$this->imageEntDir = './Application/Home/View/default/Public/Images';//php内部使用
    }
}