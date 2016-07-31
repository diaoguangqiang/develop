<?php
return array(
	//'配置项'=>'配置值'
	'URL_DENY_SUFFIX' => 'pdf|ico|png|gif|jpg', 
	
	'URL_CASE_INSENSITIVE' =>true,
	
	'TMPL_PARSE_STRING' => array(
			 //'__PUBLIC__' => __ROOT__ . '/' . APP_PATH . APP_NAME . '/View/default/Public', // /baifen/./Application/Admin/View/default/Public
			 //'__PUBLIC__' => __ROOT__ . '/' . APP_PATH . APP_NAME . '/Public', // /baifen/./Application/Admin/View/default/Public
		'__PUBLIC_HOME__' =>__ROOT__.'/PublicHome', 
		'__PUBLIC_STUDENT__' =>__ROOT__.'/PublicStudent', 
		'__PUBLIC_TEACHER__' =>__ROOT__.'/PublicTeacher'
	),
		
	'ACTION_BIND_CLASS'    =>    false,

	'APP_DEBUG'=>true,
	
	// 瀛楁缂撳瓨
	'DB_FIELDS_CACHE'=>false,

	'APP_DEBUG'=>true,

	//鏁版嵁搴撻厤缃俊鎭�
	'DB_TYPE'   => 'mysql', 
	
	/*
	'DB_HOST'   => 'hdm-126.hichina.com', 
	'DB_NAME'   => 'hdm1260614_db',
	'DB_USER' => 'hdm1260614',
	'DB_PWD'    => 'diaoguangqiang',
	*/
	
	// 鏁版嵁搴撶被鍨�
	'DB_HOST'   => 'localhost', 
	
	// 鏈嶅姟鍣ㄥ湴鍧�
	'DB_NAME'   => 'db_baifen', 
		
	// 鏁版嵁搴撳悕
	'DB_USER'   => 'root', 
		
	// 鐢ㄦ埛鍚�
	'DB_PWD'    => 'password', 
		
	// 瀵嗙爜
	'DB_PORT'   => 3306, 
	// 绔彛
	'DB_PREFIX' => 'tb_', 
	// 鏁版嵁搴撹〃鍓嶇紑 
	'DB_CHARSET'=> 'utf8', // 瀛楃闆�
	
	'TMPL_L_DELIM'=>'<{',
	'TMPL_R_DELIM'=>'}>',
);