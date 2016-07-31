<?php if (!defined('THINK_PATH')) exit();?><!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="/tzw/Application/Home/View/default/Public/Css/display.css">

<title><?php echo ($title); ?></title>
</head>
<body>

<div id="container">
	<div id="header">
		<img src='<?php echo ($image_dis_head); ?>' width="960" height="120" border="0"/>
	</div>
	<div class="nav"></div>
	
	<div id="main">
		<div class="leftbox">			
			<div class="up">				
				<a href="/tzw/index.php" target="_blank"><img src='<?php echo ($image_bf); ?>' width="250" height="170" border="0"/></a>
			</div>
			<div class="down">
				<a href="/tzw/index.php" target="_blank"><?php echo ($title_bf); ?></a>
			</div>
		</div>
		<div class="rightbox">
			<div class="up">
				<a href="/tzw/index.php" target="_blank"><img src='<?php echo ($image_ych); ?>' width="250" height="170" border="0"/></a>
			</div>
			<div class="down">
				<a href="/tzw/index.php" target="_blank"><?php echo ($title_ych); ?></a>
			</div>			
		</div>
		<div class="nav"></div>
		
		<div class="leftbox">
			<div class="up">
				<a href="/tzw/index.php" target="_blank"><img src='<?php echo ($image_tzw); ?>' width="250" height="170" border="0"/></a>
			</div>
			<div class="down">
				<a href="/tzw/index.php" target="_blank"><?php echo ($title_tzw); ?></a>
			</div>			
		</div>
		<div class="rightbox">
			<div class="up">
				<a href="/tzw/index.php" target="_blank"><img src='<?php echo ($image_gz); ?>' width="250" height="170" border="0"/></a>
			</div>
			<div class="down">
				<a href="/tzw/index.php" target="_blank"><?php echo ($title_gz); ?></a>
			</div>			
		</div>
		<div class="nav"></div>		
	</div>
</div>

</body>
</html>