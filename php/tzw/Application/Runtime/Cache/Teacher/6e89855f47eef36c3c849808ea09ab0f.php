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
				
				<li class="active"><a href="/tzw/teacher.php/Paper/loginout" ><?php echo ($quit); ?></a></li>
			
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
			<li><a href="/tzw/teacher.php/Paper/../bank/addBank"><?php echo ($add_bank); ?></a></li>
			<li><a href="/tzw/teacher.php/Paper/../bank/viewBank"><?php echo ($view_bank); ?></a></li>
		</ul>
				 
		<ul class="nav nav-sidebar">
			<li class="active"><a href="#"><?php echo ($paper); ?></a></li>
		</ul>
		
		<ul class="nav nav-sidebar">
			<li><a href="/tzw/teacher.php/Paper/../paper/add"><?php echo ($paper_add); ?></a></li>
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
			<h3 class="page-header"><?php echo ($paper); ?>&nbsp;<i class="service-icon fa fa-angle-right"></i>&nbsp;<?php echo ($paper_add); ?></h3>
			<!-- / head -->
			
			<!-- row -->
			<div class="row">	
				<div class="col-md-12">
					<!-- A -->
					<div class="panel panel-primary">
						<div class="panel-heading">
							<h3 class="panel-title">
								<span class="badge pull-right"> <!-- <a href="/tzw" > --><?php echo ($num_paper_limit_info); ?><!-- </a>  --> </span><?php echo ($add_info); ?>
							</h3>					
						</div>
						
						<!-- B -->
						<div class="panel-body">
							<div class="row">
								<div class="col-md-3">&nbsp;</div>
								<div class="col-md-6">
									
									<form class="form-horizontal" role="form" action="/tzw/teacher.php/Paper/addName" method="post">
										
										<div class="control-group">											
											<label class="control-label" ><?php echo ($paper_name); ?></label>
											<input type="text" class="form-control" name="name" id="inputSuccess1" placeholder="<?php echo ($paper_name_input_please); ?>">
											<h6><?php echo ($paper_name_input_tips); ?></h6>
										</div>
										
										<div class="control-group">
								            <label class="control-label" for="multiSelect"><?php echo ($paper_name_select); ?></label>
								            <select multiple="multiple" id="multiSelect" class="form-control">
								                <?php if(is_array($list)): $k = 0; $__LIST__ = $list;if( count($__LIST__)==0 ) : echo "" ;else: foreach($__LIST__ as $key=>$vo): $mod = ($k % 2 );++$k; if($k == 1): ?><option value="<?php echo ($vo["id"]); ?>" selected><?php echo ($vo["name"]); ?></option>
								                	<?php else: ?>
								                		<option value="<?php echo ($vo["id"]); ?>" ><?php echo ($vo["name"]); ?></option><?php endif; endforeach; endif; else: echo "" ;endif; ?>
								            </select>
								            <h6><?php echo ($paper_name_limit_tips); ?></h6>
							          	</div>
          
          								<!-- 
										<div class="control-group">
								            <label class="control-label" ><?php echo ($paper_name_select); ?></label>
								            <select class="form-control">
										         <option selected><?php echo ($paper_name); ?></option>
										         <option>2</option>
										         <option>3</option>
										         <option>4</option>
										         <option>5</option>
									        </select>								            
								        </div>
										 -->
										 
										<div class="control-group">											
											<label class="control-label" ><?php echo ($xzt); ?></label>
											<input type="text" class="span1" name="name" id="inputSuccess1" placeholder="<?php echo ($num_tips); ?>">
											
										</div>
										<br>
										
										<div class="control-group">											
											<label class="control-label" ><?php echo ($pdt); ?></label>
											<input type="text" class="span1" name="name" id="inputSuccess1" placeholder="<?php echo ($num_tips); ?>">
											
										</div>
										<br>
										
										<div class="control-group">											
											<label class="control-label" ><?php echo ($zgt); ?></label>
											<input type="text" class="span1" name="name" id="inputSuccess1" placeholder="<?php echo ($num_tips); ?>">
											
										</div>
										 <hr>
																				
										<div class="control-group pull-right">											
											<button type="submit" class="btn btn-success"><?php echo ($submit); ?></button>
										</div>										
									</form>	
								</div>
								<div class="col-md-3">&nbsp;</div>
							</div>
							
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