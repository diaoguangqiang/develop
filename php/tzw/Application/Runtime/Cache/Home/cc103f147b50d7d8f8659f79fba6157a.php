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
  </head>
  

<body>

    <!-- Header Area -->
    <div id="top" class="header">
      <div class="vert-text">
	  <img class="img-rounded" alt="Company Logo" src="/tzw/PublicHome/img/logo.jpg"/>
        <h2><em><?php echo ($title); ?></em></h2>
		 <ul class="list-inline">
              <li><i class="fa fa-weibo fa-3x"></i></li>
              <li><i class="fa fa-weixin fa-3x"></i></li>
              <li><i class="fa fa-qq fa-3x"></i></li>
			  <li><i class="fa fa-tencent-weibo fa-3x"></i></li>
			   <li><i class="fa fa-renren fa-3x"></i></li>
            </ul>	
			<br>
			<a href="#about" class="btn btn-top"><?php echo ($start); ?></a>
			<br><br>
			<a href="#" class="btn btn-top"><?php echo ($web_demo_download); ?></a>
			&nbsp;&nbsp;
			<a href="/tzw/index.php/app/androidDown" class="btn btn-top"><?php echo ($Android_App_download); ?></a>
			&nbsp;&nbsp;
			<a href="#" class="btn btn-top"><?php echo ($IOS_App_download); ?></a>
      </div>
    </div>
    <!-- /Header Area -->
    
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
	<a href="#" class="navbar-brand"><?php echo ($title); ?></a>
  </div>
  <div class="collapse navbar-collapse" id="mobilemenu">

	  <ul class="nav navbar-nav navbar-right text-center">
	  	<!-- 
	    <li><a href="/tzw/index.php/#top"><i class="service-icon fa fa-home"></i>&nbsp;<?php echo ($home); ?></a></li>
	     -->
	    <li><a href="/tzw/student.php" target="_blank"><i class="service-icon fa fa-mortar-board"></i>&nbsp;<?php echo ($stu_plat); ?></a></li>
	    <li><a href="/tzw/teacher.php" target="_blank"><i class="service-icon fa fa-laptop"></i>&nbsp;<?php echo ($tea_plat); ?></a></li>
        <li><a href="/tzw/index.php/download"><i class="service-icon fa fa-cloud-download"></i>&nbsp;<?php echo ($download_area); ?></a></li>
        <li><a href="/tzw/#" target="_blank"><i class="service-icon fa fa-leaf"></i>&nbsp;<?php echo ($publicwelfare); ?></a></li>          
        <li><a href="#contact"><i class="service-icon fa fa-envelope"></i>&nbsp;<?php echo ($contact_me); ?></a></li>
    </ul>
  </div><!-- /.navbar-collapse -->
  </div>
</nav>
    <!-- /Navigation -->
    
</div>	
    <!-- About -->
    <div id="about" class="about_us">
      <div class="container">
        <div class="row">
          <div class="col-md-8 col-md-offset-2 text-center">
          	<br>
            <h2><?php echo ($title); ?></h2>
            <p class="lead"><?php echo ($web_brief); ?></p>
          </div>
        </div>
	  </div>
    </div>
    <!-- /About -->
   
    
    <!-- Services -->
    <div id="services" class="services">
      <div class="container">
        <div class="row">
          <div class="col-md-4 col-md-offset-4 text-center">
            <h2><?php echo ($download); ?></h2>
            <hr>
          </div>
        </div>
        <div class="row">
          <div class="col-md-4 text-center">
            <div class="service-item">
              <i class="service-icon fa fa-camera-retro fa-3x"></i>
              <h3><a href="#"><?php echo ($web_exam); ?></a></h3>
              <p><?php echo ($web_desc); ?></p>
            </div>
          </div>
          <div class="col-md-4 text-center">
            <div class="service-item">
			<i class="service-icon fa fa-camera fa-3x"></i>
              <h3><a href="#"><?php echo ($app_exam); ?></a></h3>
              <p><?php echo ($app_desc); ?></p>
            </div>
          </div>
          <div class="col-md-4 text-center">
            <div class="service-item">
              <i class="service-icon fa fa-globe fa-3x"></i>
              <h3><a href="#"><?php echo ($desktop_exam); ?></a></h3>
              <p><?php echo ($desktop_desc); ?></p>
            </div>
          </div>
        </div>
      </div>
    </div>
    <!-- /Services -->

    <!-- Portfolio -->
    <div id="portfolio" class="portfolio">
    <div class="container">
    <div class="row push50">
          <div class="col-md-4 col-md-offset-4 text-center">
            <h2><?php echo ($gallery); ?></h2>
			<h3>
			<span class="filter label label-default" data-filter="all">ALL</span>
	<span class="filter label label-default" data-filter="bw">B&amp;W</span>
	<span class="filter label label-default" data-filter="nature">Nature</span>
	<span class="filter label label-default" data-filter="portraits">Portraits</span>
	</h3>
            <hr>
          </div>
        </div>
		
		<div class="row">
		
		<div class="gallery">
		
    		  <ul id="Grid" class="gcontainer">
    		    <li class="col-md-4 col-sm-4 col-xs-12 mix bw portraits" data-cat="graphics">
              <a data-toggle="modal" data-target="#portrait1" class="mix-cover">
                <img class="horizontal" src="/tzw/PublicHome/img/portrait1-sm.jpg" alt="placeholder">
      		      <span class="overlay"><span class="valign"></span><span class="title">Portrait 1</span></span>
              </a>                
      		  </li>
    		    <li class="col-md-4 col-sm-4 col-xs-12 mix portraits" data-cat="graphics">
                <a data-toggle="modal" data-target="#portrait2" class="mix-cover">
                  <img class="horizontal" src="/tzw/PublicHome/img/portrait2.jpg" alt="placeholder">
        		      <span class="overlay"><span class="valign"></span><span class="title">Portrait 2</span></span>
                </a>                
      		  </li>
			  <li class="col-md-4 col-sm-4 col-xs-12 mix nature" data-cat="nature">
                <a data-toggle="modal" data-target="#nature1" class="mix-cover">
                  <img class="horizontal" src="/tzw/PublicHome/img/nature1.jpg" alt="placeholder">
        		      <span class="overlay"><span class="valign"></span><span class="title">Nature 1</span></span>
        		    </a>
      		  </li>
      		  <li class="col-md-4 col-sm-4 col-xs-12 mix portraits" data-cat="portraits">
                <a data-toggle="modal" data-target="#portrait3" class="mix-cover">
                  <img class="horizontal" src="/tzw/PublicHome/img/portrait3.jpg" alt="placeholder">
        		      <span class="overlay"><span class="valign"></span><span class="title">Portrait 3</span></span>
        		    </a>
      		  </li>
			  <li class="col-md-4 col-sm-4 col-xs-12 mix portraits" data-cat="portraits">
                <a data-toggle="modal" data-target="#portrait5" class="mix-cover">
                  <img class="horizontal" src="/tzw/PublicHome/img/portrait5.jpg" alt="placeholder">
        		       <span class="overlay"><span class="valign"></span><span class="title">Portrait 5</span></span>
        		    </a>
      		  </li>
			  <li class="col-md-4 col-sm-4 col-xs-12 mix nature" data-cat="nature">
                <a data-toggle="modal" data-target="#nature" class="mix-cover">
                  <img class="horizontal" src="/tzw/PublicHome/img/nature.jpg" alt="placeholder">
        		      <span class="overlay"><span class="valign"></span><span class="title">Nature</span></span>
        		    </a>
      		  </li>
      		  <li class="col-md-4 col-sm-4 col-xs-12 mix portraits" data-cat="portrait">
                <a data-toggle="modal" data-target="#portrait4" class="mix-cover green">
                  <img class="vertical" src="/tzw/PublicHome/img/portrait4.jpg" alt="portrait 4">
                  <span class="overlay"><span class="valign"></span><span class="title">Portrait 4</span></span>           
        		    </a>
      		  </li>
			  <li class="col-md-4 col-sm-4 col-xs-12 mix bw nature all" data-cat="portrait">
                <a data-toggle="modal" data-target="#forest" class="mix-cover green">
                  <img class="vertical" src="/tzw/PublicHome/img/forest.jpg" alt="Forest">
                   <span class="overlay"><span class="valign"></span><span class="title">Forest</span></span>                    
        		    </a>
      		  </li>
			  <li class="col-md-4 col-sm-4 col-xs-12 mix bw nature all" data-cat="bw">
                <a data-toggle="modal" data-target="#bw1" class="mix-cover green">
                  <img class="vertical" src="/tzw/PublicHome/img/bw1.jpg" alt="Black and White">
                   <span class="overlay"><span class="valign"></span><span class="title">Black &amp; White</span></span>                  
        		    </a>
      		  </li>
    		  </ul>   
			  
<!-- Load Photo in Modal -->			  
   <div class="modal fade" id="portrait1" tabindex="-1" role="dialog" aria-hidden="true">
  <div class="modal-dialog">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
        <h4 class="modal-title text-center">Portrait 1</h4>
      </div>
      <div class="modal-body">
       <img class="thumbnail" alt="Portrait1" src="/tzw/PublicHome/img/portrait1.jpg"/>
      </div>
    </div><!-- /.modal-content -->
  </div><!-- /.modal-dialog -->
</div><!-- /.modal -->

  <div class="modal fade" id="portrait2" tabindex="-1" role="dialog"  aria-hidden="true">
  <div class="modal-dialog">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
        <h4 class="modal-title text-center">Portrait 2</h4>
      </div>
      <div class="modal-body">
       <img class="thumbnail" alt="Portrait1" src="/tzw/PublicHome/img/portrait2.jpg"/>
      </div>
    </div><!-- /.modal-content -->
  </div><!-- /.modal-dialog -->
</div><!-- /.modal -->

<div class="modal fade" id="portrait3" tabindex="-1" role="dialog" aria-hidden="true">
  <div class="modal-dialog">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
        <h4 class="modal-title text-center">Portrait 3</h4>
      </div>
      <div class="modal-body">
       <img class="thumbnail" alt="Portrait1" src="/tzw/PublicHome/img/portrait3.jpg"/>
      </div>
    </div><!-- /.modal-content -->
  </div><!-- /.modal-dialog -->
</div><!-- /.modal -->

<div class="modal fade" id="portrait4" tabindex="-1" role="dialog"  aria-hidden="true">
  <div class="modal-dialog">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
        <h4 class="modal-title text-center">Portrait 4</h4>
      </div>
      <div class="modal-body">
       <img class="thumbnail" alt="Portrait1" src="/tzw/PublicHome/img/portrait4.jpg"/>
      </div>
    </div><!-- /.modal-content -->
  </div><!-- /.modal-dialog -->
</div><!-- /.modal -->

<div class="modal fade" id="portrait5" tabindex="-1" role="dialog"  aria-hidden="true">
  <div class="modal-dialog">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
        <h4 class="modal-title text-center">Portrait 5</h4>
      </div>
      <div class="modal-body">
       <img class="thumbnail" alt="Portrait1" src="/tzw/PublicHome/img/portrait5.jpg"/>
      </div>
    </div><!-- /.modal-content -->
  </div><!-- /.modal-dialog -->
</div><!-- /.modal -->

<div class="modal fade" id="nature" tabindex="-1" role="dialog"  aria-hidden="true">
  <div class="modal-dialog">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
        <h4 class="modal-title text-center">Nature</h4>
      </div>
      <div class="modal-body">
       <img class="thumbnail" alt="nature" src="/tzw/PublicHome/img/nature.jpg"/>
      </div>
    </div><!-- /.modal-content -->
  </div><!-- /.modal-dialog -->
</div><!-- /.modal -->

<div class="modal fade" id="nature1" tabindex="-1" role="dialog" aria-hidden="true">
  <div class="modal-dialog">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
        <h4 class="modal-title text-center">Nature 1</h4>
      </div>
      <div class="modal-body">
       <img class="thumbnail" alt="nature" src="/tzw/PublicHome/img/nature1.jpg"/>
      </div>
    </div><!-- /.modal-content -->
  </div><!-- /.modal-dialog -->
</div><!-- /.modal -->


<div class="modal fade" id="forest" tabindex="-1" role="dialog" aria-hidden="true">
  <div class="modal-dialog">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
        <h4 class="modal-title text-center">Forest</h4>
      </div>
      <div class="modal-body">
       <img class="thumbnail" alt="forest" src="/tzw/PublicHome/img/forest.jpg"/>
      </div>
    </div><!-- /.modal-content -->
  </div><!-- /.modal-dialog -->
</div><!-- /.modal -->

<div class="modal fade" id="bw1" tabindex="-1" role="dialog" aria-hidden="true">
  <div class="modal-dialog">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
        <h4 class="modal-title text-center">Black and White</h4>
      </div>
      <div class="modal-body">
       <img class="thumbnail" alt="forest" src="/tzw/PublicHome/img/bw1.jpg"/>
      </div>
    </div><!-- /.modal-content -->
  </div><!-- /.modal-dialog -->
</div><!-- /.modal -->


<!-- /Load Photo in Modal -->	
		</div>	
      </div>
		</div>
      </div>
    <!-- /Portfolio -->
    <!-- Contact -->
    <div id="contact">
      <div class="container">
        <div class="row">
		<div class="col-md-4 col-md-offset-4 text-center">
            <h2><?php echo ($contact_me); ?></h2>
			<hr>
          </div>
          <div class="col-md-5 col-md-offset-3">
		  <!-- contact form starts -->
            <form action="contact" id="contact-form" class="form-horizontal">
			<fieldset>
						    <div class="form-group">
						      <label class="col-sm-4 control-label" for="name">Your Name</label>
						      <div class="col-sm-8">
						        <input type="text"  placeholder="Your Name" class="form-control" name="name" id="name">
						      </div>
						    </div>
						    <div class="form-group">
						      <label class="col-sm-4 control-label" for="email">Email Address</label>
						      <div class="col-sm-8">
						        <input type="text" placeholder="Enter Your Email Address" class="form-control" name="email" id="email">
						      </div>
						    </div>
						    <div class="form-group">
						      <label class="col-sm-4 control-label" for="subject">Subject</label>
						      <div class="col-sm-8">
						        <input type="text" placeholder="Subject" class="form-control" name="subject" id="subject">
						      </div>
						    </div>
						    <div class="form-group">
						      <label class="col-sm-4 control-label" for="message">Your Message</label>
						      <div class="col-sm-8">
						        <textarea placeholder="Please Type Your Message" class="form-control" name="message" id="message" rows="3"></textarea>
						      </div>
						    </div>
	              <div class="col-sm-offset-4 col-sm-8">
			            <button type="submit" class="btn btn-success">Submit</button>
	    			      <button type="reset" class="btn btn-primary">Cancel</button>
	        			</div>
						</fieldset>
						</form>
				
				<!-- contact form ends -->		
          </div>
        </div>
      </div>
    </div>
    <!-- /Contact -->
    <!-- Footer -->
    <footer>
      <div class="container">
        <div class="row">
          <div class="col-md-6 col-md-offset-3 text-center">
           <h2>Thank You</h2>
           <em>Copyright &copy; Company 2012 杭州</em>
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
	
<!-- Slideshow Background  -->
	<script>
$.vegas('slideshow', {
  delay:5000,
  backgrounds:[
     { src:'/tzw/PublicHome/img/home_pic_1.jpg', fade:2000 },
	 { src:'/tzw/PublicHome/img/home_pic_2.jpg', fade:2000 },
     { src:'/tzw/PublicHome/img/home_pic_3.jpg', fade:2000 },
	 { src:'/tzw/PublicHome/img/home_pic_4.jpg', fade:2000 },
     { src:'/tzw/PublicHome/img/home_pic_5.jpg', fade:2000 },
     { src:'/tzw/PublicHome/img/home_pic_6.jpg', fade:2000 },
	 { src:'/tzw/PublicHome/img/home_pic_7.jpg', fade:2000 },
	 { src:'/tzw/PublicHome/img/home_pic_8.jpg', fade:2000 },
	 { src:'/tzw/PublicHome/img/home_pic_9.jpg', fade:2000 },
	 { src:'/tzw/PublicHome/img/home_pic_10.jpg', fade:2000 },
	 { src:'/tzw/PublicHome/img/home_pic_11.jpg', fade:2000 },
	 { src:'/tzw/PublicHome/img/home_pic_12.jpg', fade:2000 },
     { src:'/tzw/PublicHome/img/home_pic_13.jpg', fade:2000 },
	 { src:'/tzw/PublicHome/img/home_pic_14.jpg', fade:2000 },
     { src:'/tzw/PublicHome/img/home_pic_15.jpg', fade:2000 },
     { src:'/tzw/PublicHome/img/home_pic_16.jpg', fade:2000 },
	 { src:'/tzw/PublicHome/img/home_pic_17.jpg', fade:2000 },
	 { src:'/tzw/PublicHome/img/home_pic_18.jpg', fade:2000 },
	 { src:'/tzw/PublicHome/img/home_pic_19.jpg', fade:2000 },
	 { src:'/tzw/PublicHome/img/home_pic_20.jpg', fade:2000 }
  ]
})('overlay', {
src:'/tzw/PublicHome/img/overlay.png'
});

	</script>
<!-- /Slideshow Background -->

<!-- Mixitup : Grid -->
    <script>
		$(function(){
    $('#Grid').mixitup();
      });
    </script>
<!-- /Mixitup : Grid -->	

    <!-- Custom JavaScript for Smooth Scrolling - Put in a custom JavaScript file to clean this up -->
    <script>
      $(function() {
        $('a[href*=#]:not([href=#])').click(function() {
          if (location.pathname.replace(/^\//,'') == this.pathname.replace(/^\//,'') 
            || location.hostname == this.hostname) {

            var target = $(this.hash);
            target = target.length ? target : $('[name=' + this.hash.slice(1) +']');
            if (target.length) {
              $('html,body').animate({
                scrollTop: target.offset().top
              }, 1000);
              return false;
            }
          }
        });
      });
    </script>
<!-- Navbar -->
<script type="text/javascript">
$(document).ready(function() {
        $('#nav').scrollToFixed();
  });
    </script>
<!-- /Navbar-->
	
  </body>

</html>