<?php if (!defined('THINK_PATH')) exit();?><!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<title><?php echo ($title); ?></title>
	<link href="/tzw/PublicStudent/css/bootstrap.min.css" rel="stylesheet">
	
	<!-- Font Awesome -->
	<link href="/tzw/PublicStudent/font-awesome/css/font-awesome.min.css" rel="stylesheet">
	
	<!--[if lt IE 9]>
	<script src="/tzw/PublicStudent/js/html5shiv.js"></script>
	<script src="/tzw/PublicStudent/js/respond.min.js"></script>
	<![endif]-->
<style>
        body {
            padding-top: 50px;
            padding-bottom: 40px;
            color: #5a5a5a;
        }

		/* 下面是左侧导航栏的代码 */
		.sidebar {
            position: fixed;
            top: 51px;
            bottom: 0;
            left: 0;
            z-index: 1000;
            display: block;
            padding: 20px;
            overflow-x: hidden;
            overflow-y: auto;
            background-color: #ddd;
            border-right: 1px solid #eee;
        }

        .nav-sidebar {
            margin-right: -21px;
            margin-bottom: 20px;
            margin-left: -20px;
        }

        .nav-sidebar > li > a {
            padding-right: 20px;
            padding-left: 20px;
        }

        .nav-sidebar > .active > a,
        .nav-sidebar > .active > a:hover,
        .nav-sidebar > .active > a:focus {
            color: #fff;
            background-color: #428bca;
        }

        .main {
            padding: 20px;
        }

        .main .page-header {
            margin-top: 0;
        }
</style>

</head>

<body>

<!---->
<nav class="navbar navbar-default navbar-inverse navbar-fixed-top" role="navigation">
	<div class="container-fluid">
	
		<div class="navbar-header">
			<button type="button" class="navbar-toggle collapsed" data-toggle="collapse"
			                    data-target="#bs-example-navbar-collapse-1">
				<span class="sr-only">Toggle navigation</span>
				<span class="icon-bar"></span>
				<span class="icon-bar"></span>
				<span class="icon-bar"></span>
			</button>
			<a class="navbar-brand active" href="#"><?php echo ($title); ?></a>
		</div>
	
		<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
			<ul class="nav navbar-nav">
				<!--
				<li class="active"><a href="#">��ҳ</a></li>
				-->
				
				<li class="dropdown active">
					<a href="#" class="dropdown-toggle " data-toggle="dropdown"><?php echo ($persion_info); ?><span class="caret"></span></a>
					<ul class="dropdown-menu" role="menu">
						<li class="dropdown-header"><?php echo ($account); ?></li>
						<li><a href="#"><?php echo ($account_change); ?></a></li>			
						<li class="divider"></li>
						<li class="dropdown-header"><?php echo ($passwd); ?></li>
						<li><a href="#"><?php echo ($passwd_change); ?></a></li>
						
					</ul>
				</li>
				
				<li class="dropdown active">
					<a href="#" class="dropdown-toggle " data-toggle="dropdown"><?php echo ($sys_set); ?><span class="caret"></span></a>
					<ul class="dropdown-menu" role="menu">
						<li class="dropdown-header"><?php echo ($school_name); ?></li>
						<li><a href="#"><?php echo ($my_school_name); ?></a></li>
					</ul>
				</li>
				
				<li><a href="#" ><?php echo ($doc); ?></a></li>
				
				<li><a href="/tzw/student.php/Index/loginout" ><?php echo ($quit); ?></a></li>
			
			</ul>
		
			<ul class="nav navbar-nav navbar-right">
				<li><a href="#"><?php echo ($contact_me); ?></a></li>
			</ul>
			
			<!--
			<form class="navbar-form navbar-right" role="search">
			<div class="form-group">
			<input type="text" class="form-control" placeholder="�û���...">
			<input type="text" class="form-control" placeholder="����...">
			</div>
			<button type="submit" class="btn btn-default">��¼</button>
			</form>
			-->
		
		</div>
	</div>
</nav>



<!--right content-->
<div class="container-fluid">
<div class="row">

	<!--锟斤拷嗟硷拷锟�8-->
	<div class="col-sm-3 col-md-2 sidebar">

		<ul class="nav nav-sidebar">
			<li class="active"><a href="#"><?php echo ($bank); ?></a></li>
		</ul>
			
		<ul class="nav nav-sidebar">
			<li><a href="/tzw/student.php/Index/../bank"><?php echo ($practice); ?></a></li>
		</ul>
		
		 
		<ul class="nav nav-sidebar">
			<li class="active"><a href="#"><?php echo ($paper); ?></a></li>
		</ul>
		
		<ul class="nav nav-sidebar">
			<li><a href="#"><?php echo ($paper_do); ?></a></li>
		</ul>
		
		<ul class="nav nav-sidebar">
			<li class="active"><a href="#"><?php echo ($find); ?></a></li>
		</ul>
		
		<ul class="nav nav-sidebar">
			<li><a href="#"><?php echo ($his_score); ?></a></li>
		</ul>
		 
		<ul class="nav nav-sidebar">
			<li class="active"><a href="#"><?php echo ($other); ?></a></li>
		</ul>
		
		<ul class="nav nav-sidebar">
			<li><a href="#"><?php echo ($problem_count); ?></a></li>
			
		</ul>
	
	</div>

	<!--锟揭诧拷锟斤拷锟斤拷锟斤拷台-->
	<div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
	<br>
	
	<h1 class="page-header"><?php echo ($name); echo ($wellcome); ?></h1>
	
		<div class="row">	
			<div class="col-md-12">
			
				<!--panel锟斤拷澹拷锟斤拷锟斤拷锟斤拷一些锟截硷拷锟斤拷锟斤拷同-->
				<div class="panel panel-primary">
				
					<!--panel锟斤拷锟侥憋拷锟解，锟斤拷同-->
					<div class="panel-heading">
					<h3 class="panel-title"><?php echo ($notice); ?></h3>
					</div>
				
					<!--panel锟斤拷锟斤拷锟斤拷锟捷ｏ拷锟斤拷同-->
					<div class="panel-body">
					
						<div class="alert alert-success" role="alert">
							<p><strong>1. &nbsp;</strong><?php echo ($ip); ?><br>
							<p><strong>2. &nbsp;</strong><?php echo ($last_time); ?><br>
						</div>
					
					</div>
				
				</div>
			
			</div>
		</div>
	
	</div>

</div>
</div>
<!-- / right content-->



<script src="/tzw/PublicStudent/js/jquery-1.11.1.min.js"></script>
<script src="/tzw/PublicStudent/js/bootstrap.min.js"></script>

</body>

</html>