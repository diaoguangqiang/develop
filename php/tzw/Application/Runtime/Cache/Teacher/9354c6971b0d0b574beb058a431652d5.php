<?php if (!defined('THINK_PATH')) exit();?><!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<title><?php echo ($title); ?></title>
	<link href="/tzw/PublicStudent/css/bootstrap.min.css" rel="stylesheet" type="text/css" >
	
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
			
			<a class="navbar-brand active" href="#"><font color="#ffffff"><?php echo ($title); ?></font></a>
		</div>
	
		<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
			<ul class="nav navbar-nav">
				<!--
				<li class="active"><a href="#"><?php echo ($title); ?></a></li>
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
				
				<li class="active"><a href="#" ><?php echo ($doc); ?></a></li>
				
				<li class="active"><a href="/tzw/teacher.php/Bank/loginout" ><?php echo ($quit); ?></a></li>
			
			</ul>
		
			<ul class="nav navbar-nav navbar-right">
				<li class="active"><a href="#"><?php echo ($service); ?></a></li>
				
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



<!--right -->
<div class="container-fluid">
	<div class="row">
	
		<!--left menu-->
		

<!-- menu left-->
<div class="col-sm-3 col-md-2 sidebar">
		<ul class="nav nav-sidebar">
			<li class="active"><a href="#"><?php echo ($bank); ?></a></li>
		</ul>
		
		<ul class="nav nav-sidebar">
			<li><a href="/tzw/teacher.php/Bank/../bank/addBank"><?php echo ($add_bank); ?></a></li>
			<li><a href="/tzw/teacher.php/Bank/../bank/viewBank"><?php echo ($view_bank); ?></a></li>
		</ul>
				 
		<ul class="nav nav-sidebar">
			<li class="active"><a href="#"><?php echo ($paper); ?></a></li>
		</ul>
		
		<ul class="nav nav-sidebar">
			<li><a href="/tzw/teacher.php/Bank/../paper/add"><?php echo ($paper_add); ?></a></li>
		</ul>
		
		<!-- 
		<ul class="nav nav-sidebar">
			<li class="active"><a href="#"><?php echo ($find); ?></a></li>
		</ul>		
		<ul class="nav nav-sidebar">
			<li><a href="#"><?php echo ($his_score); ?></a></li>
		</ul>
		-->
		
		<ul class="nav nav-sidebar">
			<li class="active"><a href="#"><?php echo ($other); ?></a></li>
		</ul>
		
		<ul class="nav nav-sidebar">
			<li><a href="#"><?php echo ($web_map); ?></a></li>			
		</ul>
	 
</div>
<!-- / menu left-->
		<!-- /left menu -->
	
		<!--rigt content-->
		<div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
			
			<!-- head -->
			<h3 class="page-header"><?php echo ($bank); ?>&nbsp;<i class="service-icon fa fa-angle-right"></i>&nbsp;<?php echo ($view_bank); ?></h3>
			<!-- / head -->
			
			<!-- row -->
			<div class="row">	
				<div class="col-md-12">
					<!-- A -->
					<div class="panel panel-primary">
						<div class="panel-heading">
							<h3 class="panel-title">
								<!-- <span class="badge pull-right"><a href="/tzw" ><?php echo ($limit_bank); ?></a></span> --><?php echo ($list_bank); ?>
							</h3>					
						</div>
						
						<!-- B -->
						<div class="panel-body">
							<table class="table table-striped">
								<thead>
									<tr>
									<th>#</th>
									<th><?php echo ($bank); ?></th>
									<th><?php echo ($xzt); ?></th>
									<th><?php echo ($pdt); ?></th>
									<th><?php echo ($zgt); ?></th>
									<th><?php echo ($edit); ?></th>
									</tr>
								</thead>
								
								<tbody>
									<?php if(is_array($list)): $k = 0; $__LIST__ = $list;if( count($__LIST__)==0 ) : echo "" ;else: foreach($__LIST__ as $key=>$vo): $mod = ($k % 2 );++$k;?><tr>
											<td><?php echo ($k); ?></td>
											<td><?php echo ($vo["name"]); ?></td>
											<td><?php echo ($vo["cnum"]); ?></td>
											<td><?php echo ($vo["jnum"]); ?></td>
											<td><?php echo ($vo["snum"]); ?></td>
											<td>
												<a class="btn btn-primary" href="#" role="button"><?php echo ($add_onebyone_bank); ?></a>
												<a class="btn btn-danger" href="#" role="button"><?php echo ($del); ?></a>
											</td>
										</tr><?php endforeach; endif; else: echo "" ;endif; ?>
								</tbody>
								
							</table>
						
							<p class="navbar-right">
								<a class="btn btn-success" href="#" role="button" ><?php echo ($import_bank); ?>&raquo;</a>					
							</p>
						</div>
						<!-- / B -->
						
					</div>
					<!-- / A -->
				</div>
			</div>
			<!-- / row -->
			
			<!-- 
			<div class="row">
				ss
			</div>
			 -->
			 
		</div>
		<!-- / rigt content-->
	</div>
</div>
<!-- / right -->



<script src="/tzw/PublicStudent/js/jquery-1.11.1.min.js"></script>
<script src="/tzw/PublicStudent/js/bootstrap.min.js"></script>

</body>

</html>