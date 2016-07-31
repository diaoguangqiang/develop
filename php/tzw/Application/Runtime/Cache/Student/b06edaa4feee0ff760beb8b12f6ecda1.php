<?php if (!defined('THINK_PATH')) exit();?><!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">

    <title><?php echo ($title); ?></title>
    <!-- Bootstrap core CSS -->
    <link href="/tzw/PublicHome/css/bootstrap.css" rel="stylesheet">
    <!-- Add custom CSS here -->
    <link href="/tzw/PublicHome/css/slidefolio.css" rel="stylesheet">
	<!-- Font Awesome -->
    <link href="/tzw/PublicHome/font-awesome/css/font-awesome.min.css" rel="stylesheet">
    <!-- 
    <link href="/tzw/PublicHome/css/bootstrap-theme.min.css" rel="stylesheet">    
     -->
    <link href="/tzw/PublicHome/css/templatemo_style.css" rel="stylesheet">
    
    <style type="text/css">
    	.img_bg{
    		width:100%;
		    height:100%;
		    color:#fff;
		    font-size:12px;
		    /*border:10px dotted #333;*/
		    padding:10px;
		    background:#666 url('/tzw/PublicHome/img/stu_bg_1.png') no-repeat;
    	}
    </style>
  </head>
  

<body>

    <!-- Header Area -->
	<div id="nav">
	  
	    <!-- Navigation -->
	    <nav class="navbar navbar-new" role="navigation">
		   <div class="container">
				  <!-- Brand and toggle get grouped for better mobile display -->
				  <div class="navbar-header">
					    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#mobilemenu">
					      <span class="sr-only">Toggle navigation</span>
					      <span class="icon-bar"></span>
					      <span class="icon-bar"></span>
					      <span class="icon-bar"></span>
					    </button>
						<a  class="navbar-brand"><?php echo ($title); ?></a>
				
			  		</div>		  
		  
				  	<!-- header -->
					<div class="collapse navbar-collapse" id="mobilemenu">						
						<a  class="navbar-brand"><?php echo ($stu_plat); ?></a>
						<ul class="nav navbar-nav navbar-left text-center">
						    <li><a href="/tzw/"><i class="service-icon fa fa-home"></i>&nbsp;<?php echo ($home); ?></a></li>
					    </ul>
					  	<ul class="nav navbar-nav navbar-right text-center">
					  		<!-- 
					  		<li><a href="#contact"><i class="service-icon fa fa-leaf"></i>&nbsp;<?php echo ($oriange_light); ?></a></li>
					  		 -->
						    <li><a href="#contact"><i class="service-icon fa fa-paper-plane"></i>&nbsp;<?php echo ($create_account); ?></a></li>
					    </ul>
				  	</div>
				  <!-- /header -->
		  
			  <!-- /.navbar-collapse -->
			  </div>
		</nav>
	    <!-- /Navigation -->
    
	</div>	
	
	<!-- bg pic -->
	<div  class="img_bg templatemo-bg-gray">
		<div class="container ">
			<div class="col-md-4 ">&nbsp;</div>
			<div class="col-md-4 ">
				<h1 class="margin-bottom-10">&nbsp;</h1>			
				<!-- background-color:#000000; -->
			    <div style="height: 160px; width: 160px;  position:relative; top:2px; margin-left:60%; margin-right:5%;">
					<img src="/tzw/PublicHome/img/ych.jpg" class="img-rounded" width="100%" height="100%">
				</div>
			</div>
			
			<div class="col-md-4 ">
				 
				<h1 class="margin-bottom-10">&nbsp;</h1>
				 
				<form class="form-horizontal templatemo-container templatemo-login-form-1 margin-bottom-30" role="form" action="/tzw/student.php/Index/check" method="post">				
			        
			        <div class="form-group">
			          <div class="col-md-12">		            
			            <div class="control-wrapper">
			            	<label for="username" class="control-label fa-label"><i class="service-icon fa fa-user"></i></label>
			            	<input type="text" class="form-control" id="username" placeholder="Username" disabled>
			            </div>		            	            
			          </div>              
			        </div>
			        
			        <div class="form-group">
			          <div class="col-md-12">
			          	<div class="control-wrapper">
			            	<label for="password" class="control-label fa-label"><i class="service-icon fa fa-lock"></i></label>
			            	<input type="password" class="form-control" id="password" placeholder="Password" disabled>
			            </div>
			          </div>
			        </div>
			        
			        <!-- 
			        <div class="form-group">
			          <div class="col-md-12">
		             	<div class="checkbox control-wrapper">
		                	<label>
		                  		<input type="checkbox"> Remember me
	                		</label>
		              	</div>
			          </div>
			        </div>
			         -->
			         
			        <div class="form-group">
			          <div class="col-md-12">
			          	<div class="control-wrapper">
			          		<input type="submit" value="<?php echo ($login); ?>" class="btn btn-success  ">
			          		
			          		<a href="forget-password.html" class="text-right pull-right" > <font color="#dddddd"><?php echo ($forget_pwd); ?></font></a>
			          		
			          	</div>
			          </div>
			        </div>
			        
			        <hr>
			        
			        <!-- 
			        <div class="form-group">
			          <div class="col-md-12">
			          	<div class="control-wrapper">			          		
			          		<a href="forgot-password.html" class="text-right pull-right" > <font color="#ffffff"><?php echo ($forget_pwd); ?></font></a>
			          	</div>
			          </div>
			        </div>
			         -->
			         
			        <!-- 
			        <div class="form-group">
			        	<div class="col-md-12">
			        		<label><?php echo ($login_fast); ?></label>
			        		<div class="inline-block">
			        			<a href="#"><i class="fa fa-facebook-square login-with"></i></a>
				        		<a href="#"><i class="fa fa-twitter-square login-with"></i></a>
				        		<a href="#"><i class="fa fa-google-plus-square login-with"></i></a>
				        		<a href="#"><i class="fa fa-tumblr-square login-with"></i></a>
				        		<a href="#"><i class="fa fa-github-square login-with"></i></a>
			        		</div>		        		
			        	</div>
			        </div>
			         -->
			         
			      </form>
			     
			      <!-- 
			      <div class="text-center">
			      	<a href="create-account.html" class="templatemo-create-new">Create new account <i class="fa fa-arrow-circle-o-right"></i></a>	
			      </div>
			       -->
			       
			     
			</div>
			
			
		</div>
	</div>
	<!-- / bg pic -->
	
    

    
    <!-- Footer -->
    <footer>
      <div class="container">
        <div class="row">
          <div class="col-md-6 col-md-offset-3 text-center">
           <h4><?php echo ($title); ?></h4>
           <em><?php echo ($copyright); ?></em>
          </div>
        </div>
      </div>
    </footer>
    <!-- /Footer -->
    
    
    <!-- Bootstrap core JavaScript -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="/tzw/PublicHome/js/jquery.js"></script>
	<script src="/tzw/PublicHome/js/jquery-scrolltofixed-min.js"></script>
	<script src="/tzw/PublicHome/js/jquery.vegas.js"></script>
	<script src="/tzw/PublicHome/js/jquery.mixitup.min.js"></script>
	<script src="/tzw/PublicHome/js/jquery.validate.min.js"></script>
	<script src="/tzw/PublicHome/js/script.js"></script>
	<script src="/tzw/PublicHome/js/bootstrap.js"></script>
	
    
	<!-- Navbar for fix scrollToFixed  -->
	<script type="text/javascript">
	$(document).ready(function() {
	        $('#nav').scrollToFixed();
	  });
	    </script>
	<!-- /Navbar for fix scrollToFixed -->
	
  </body>

</html>