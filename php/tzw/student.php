<?php
// +----------------------------------------------------------------------
// | ThinkPHP [ WE CAN DO IT JUST THINK ]
// +----------------------------------------------------------------------
// | Copyright (c) 2006-2014 http://thinkphp.cn All rights reserved.
// +----------------------------------------------------------------------
// | Licensed ( http://www.apache.org/licenses/LICENSE-2.0 )
// +----------------------------------------------------------------------
// | Author: liu21st <liu21st@gmail.com>
// +----------------------------------------------------------------------

// 搴旂敤鍏ュ彛鏂囦欢

// 妫�娴婸HP鐜
if(version_compare(PHP_VERSION,'5.3.0','<'))  die('require PHP > 5.3.0 !');

// 寮�鍚皟璇曟ā寮� 寤鸿寮�鍙戦樁娈靛紑鍚� 閮ㄧ讲闃舵娉ㄩ噴鎴栬�呰涓篺alse
define('APP_DEBUG',true);

define('APP_NAME', 'Student');

// 绑定访问Admin模块
define('BIND_MODULE','Student');

//生成更多的控制器类
//define('BUILD_CONTROLLER_LIST','Index,User,Menu');

// 瀹氫箟搴旂敤鐩綍
define('APP_PATH','./Application/');

//define('BUILD_LITE_FILE',true);

// 寮曞叆ThinkPHP鍏ュ彛鏂囦欢
require './ThinkPHP/ThinkPHP.php';

// 浜瞊_^ 鍚庨潰涓嶉渶瑕佷换浣曚唬鐮佷簡 灏辨槸濡傛绠�鍗�