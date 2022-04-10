<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<!DOCTYPE html>
<jsp:include page="common/head.jsp"></jsp:include>
<body>

	<!-- ============ PAGE LOADER START ============ -->

	<div id="loader">
		<i class="fa fa-cog fa-4x fa-spin"></i>
	</div>

	<!-- ============ PAGE LOADER END ============ -->

	<!-- ============ NAVBAR START ============ -->

	<div class="fm-container">
		<!-- Menu -->
		<div class="menu">
			<div class="button-close text-right">
				<a class="fm-button"><i class="fa fa-close fa-2x"></i></a>
			</div>
			<ul class="nav">
				<li><a href="#home">Home</a></li>
				<li><a href="jobs.html">Jobs</a></li>
				<li><a href="post-a-job.html">Post a job</a></li>
				<li><a href="candidates.html">Candidates</a></li>
				<li><a href="post-a-resume.html">Post a Resume</a></li>
				<li><a href="#">Pages</a>
					<ul>
						<li><a href="job-details.html">Job Details</a></li>
						<li class="active"><a href="resume.html">Resume</a></li>
						<li><a href="company.html">Company</a></li>
						<li><a href="blog.html">Blog</a></li>
						<li><a href="post.html">Single Post</a></li>
						<li><a href="about.html">About Us</a></li>
						<li><a href="testimonials.html">Testimonials</a></li>
						<li><a href="options.html">Options</a></li>
					</ul></li>
				<li><a class="link-register">Register</a></li>
				<li><a class="link-login">Login</a></li>
			</ul>
		</div>
		<!-- end Menu -->
	</div>

	<!-- ============ NAVBAR END ============ -->

	<!-- ============ HEADER START ============ -->

	<header>
		<div id="header-background"></div>
		<div class="container">
			<div class="pull-left">
				<div id="logo">
					<a href="index.html"><img src="images/logo.png"
						alt="Jobseek - Job Board Responsive HTML Template" /></a>
				</div>
			</div>
			<div id="menu-open" class="pull-right">
				<a class="fm-button"><i class="fa fa-bars fa-lg"></i></a>
			</div>
			<div id="searchbox" class="pull-right">
				<form>
					<div class="form-group">
						<label class="sr-only" for="searchfield">Searchbox</label> <input
							type="text" class="form-control" id="searchfield"
							placeholder="Type keywords and press enter">
					</div>
				</form>
			</div>
			<div id="search" class="pull-right">
				<a><i class="fa fa-search fa-lg"></i></a>
			</div>
		</div>
	</header>

	<!-- ============ HEADER END ============ -->

	<!-- ============ TITLE START ============ -->

	<section id="title">
		<div class="container">
			<div class="row">
				<div class="col-sm-12 text-center">
					<h1>Andy Spencer</h1>
					<h4>Senior Web Designer</h4>
				</div>
			</div>
		</div>
	</section>

	<!-- ============ TITLE END ============ -->

	<!-- ============ CONTENT START ============ -->

	<section id="jobs">
		<div class="container">
			<div class="row">
				<div class="col-sm-8">
					<article>
						<h2>Job Details</h2>
						<img src="http://placehold.it/220x273.jpg" alt=""
							class="pull-left" />
						<p>Maecenas mollis dictum lectus quis scelerisque. Nulla at
							rutrum ipsum. Praesent augue quam, facilisis vitae felis vel,
							convallis convallis nisi. Donec maximus accumsan purus vel
							tempus. Aenean pretium luctus velit id fermentum. Aenean non
							velit non nulla interdum venenatis. Integer in libero sagittis,
							consequat est quis, commodo odio. Aliquam eu vulputate neque.
							Nunc et massa leo. Vestibulum a pretium dolor. Proin et fermentum
							sapien. Cras malesuada neque ac purus fermentum, a placerat quam
							malesuada. Quisque sollicitudin tellus a ex eleifend mattis. In
							vitae ipsum in mauris vestibulum imperdiet.</p>
						<p>Maecenas mollis dictum lectus quis scelerisque. Nulla at
							rutrum ipsum. Praesent augue quam, facilisis vitae felis vel,
							convallis convallis nisi. Donec maximus accumsan purus vel
							tempus. Aenean pretium luctus velit id fermentum. Aenean non
							velit non nulla interdum venenatis. Integer in libero sagittis,
							consequat est quis, commodo odio. Aliquam eu vulputate neque.
							Nunc et massa leo. Vestibulum a pretium dolor. Proin et fermentum
							sapien. Cras malesuada neque ac purus fermentum, a placerat quam
							malesuada. Quisque sollicitudin tellus a ex eleifend mattis. In
							vitae ipsum in mauris vestibulum imperdiet.</p>
						<h3>Skills</h3>
						<ul>
							<li>Aliquam rhoncus justo eget tellus scelerisque, at mollis
								mi aliquam.</li>
							<li>Quisque pretium convallis pulvinar.</li>
							<li>Nulla rutrum nisi mi, iaculis commodo nibh lobortis sed.</li>
							<li>Sed pulvinar, nunc vitae molestie dapibus, lacus dolor
								dignissim sapien.</li>
							<li>Pellentesque ipsum ex, imperdiet quis consequat sed,
								consectetur ut ante.</li>
							<li>Aliquam libero felis, mollis vitae elementum vel,
								bibendum eu tortor.</li>
							<li>Morbi rhoncus luctus interdum.</li>
						</ul>
						<h3>Work Experience</h3>
						<div class="row work-experience">
							<div class="col-sm-2">
								<div class="img-circle">
									<i class="fa fa-briefcase"></i>
								</div>
							</div>
							<div class="col-sm-10">
								<h4>April 2014 - Now</h4>
								<h5>Google Inc - Senior Web Designer</h5>
								<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit.
									Morbi vel sapien nibh. Mauris et neque tellus. In tellus felis,
									ornare in urna commodo, volutpat gravida sem. Integer vitae
									lorem sit amet nibh ornare varius. Sed sollicitudin leo quis
									dui dictum.</p>
							</div>
						</div>
						<div class="row work-experience">
							<div class="col-sm-2">
								<div class="img-circle">
									<i class="fa fa-briefcase"></i>
								</div>
							</div>
							<div class="col-sm-10">
								<h4>April 2014 - Now</h4>
								<h5>Google Inc - Senior Web Designer</h5>
								<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit.
									Morbi vel sapien nibh. Mauris et neque tellus. In tellus felis,
									ornare in urna commodo, volutpat gravida sem. Integer vitae
									lorem sit amet nibh ornare varius. Sed sollicitudin leo quis
									dui dictum.</p>
							</div>
						</div>
						<div class="row work-experience">
							<div class="col-sm-2">
								<div class="img-circle">
									<i class="fa fa-briefcase"></i>
								</div>
							</div>
							<div class="col-sm-10">
								<h4>April 2014 - Now</h4>
								<h5>Google Inc - Senior Web Designer</h5>
								<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit.
									Morbi vel sapien nibh. Mauris et neque tellus. In tellus felis,
									ornare in urna commodo, volutpat gravida sem. Integer vitae
									lorem sit amet nibh ornare varius. Sed sollicitudin leo quis
									dui dictum.</p>
							</div>
						</div>
						<h3>Education</h3>
						<div class="row work-experience">
							<div class="col-sm-2">
								<div class="img-circle">
									<i class="fa fa-graduation-cap"></i>
								</div>
							</div>
							<div class="col-sm-10">
								<h4>April 2014 - Now</h4>
								<h5>Google Inc - Senior Web Designer</h5>
								<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit.
									Morbi vel sapien nibh. Mauris et neque tellus. In tellus felis,
									ornare in urna commodo, volutpat gravida sem. Integer vitae
									lorem sit amet nibh ornare varius. Sed sollicitudin leo quis
									dui dictum.</p>
							</div>
						</div>
						<div class="row work-experience">
							<div class="col-sm-2">
								<div class="img-circle">
									<i class="fa fa-graduation-cap"></i>
								</div>
							</div>
							<div class="col-sm-10">
								<h4>April 2014 - Now</h4>
								<h5>Google Inc - Senior Web Designer</h5>
								<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit.
									Morbi vel sapien nibh. Mauris et neque tellus. In tellus felis,
									ornare in urna commodo, volutpat gravida sem. Integer vitae
									lorem sit amet nibh ornare varius. Sed sollicitudin leo quis
									dui dictum.</p>
							</div>
						</div>
						<p>&nbsp;</p>
						<p>
							<a href="#" class="btn btn-primary btn-lg"><i
								class="fa fa-arrow-down"></i> Download Resume</a>
						</p>
					</article>
				</div>
				<div class="col-sm-4" id="sidebar">
					<div class="sidebar-widget" id="share">
						<h2>Share resume</h2>
						<ul>
							<li><a
								href="https://www.facebook.com/sharer/sharer.php?u=http://www.coffeecreamthemes.com/themes/jobseek/site/job-details.html"><i
									class="fa fa-facebook"></i></a></li>
							<li><a
								href="https://twitter.com/home?status=http://www.coffeecreamthemes.com/themes/jobseek/site/job-details.html"><i
									class="fa fa-twitter"></i></a></li>
							<li><a
								href="https://plus.google.com/share?url=http://www.coffeecreamthemes.com/themes/jobseek/site/job-details.html"><i
									class="fa fa-google-plus"></i></a></li>
							<li><a
								href="https://www.linkedin.com/shareArticle?mini=true&amp;url=http://www.coffeecreamthemes.com/themes/jobseek/site/job-details.html&amp;title=Jobseek%20-%20Job%20Board%20Responsive%20HTML%20Template&amp;summary=&amp;source="><i
									class="fa fa-linkedin"></i></a></li>
						</ul>
					</div>
					<hr>
					<div class="sidebar-widget" id="widget-contact">
						<h2>Contact</h2>
						<ul>
							<li><i class="fa fa-user"></i>Andy Spencer</li>
							<li><i class="fa fa-briefcase"></i>Senior Web Designer</li>
							<li><i class="fa fa-birthday-cake"></i>28/08/1983</li>
							<li><i class="fa fa-map-marker"></i>New York City</li>
							<li><i class="fa fa-phone"></i>01.22.987.8392</li>
							<li><i class="fa fa-envelope"></i><a
								href="mailto:andy.spencer@yourdomain.com">Send an email</a></li>
						</ul>
					</div>
					<hr>
					<div class="sidebar-widget" id="skills">
						<h2>Key skills</h2>
						<a class="badge">Photoshop</a> <a class="badge">HTML5</a> <a
							class="badge">CSS3</a> <a class="badge">Javascript</a> <a
							class="badge">jQuery</a> <a class="badge">User Experience</a> <a
							class="badge">User Interface</a> <a class="badge">UX</a> <a
							class="badge">UI</a> <a class="badge">Front End Development</a> <a
							class="badge">Responsive Design</a>
					</div>
				</div>
			</div>
		</div>
	</section>

	<!-- ============ CONTENT END ============ -->

	<!-- ============ CONTACT START ============ -->

	<section id="contact" class="color2">
		<div class="container">
			<div class="row">
				<div class="col-sm-6">
					<h2>Drop us a line</h2>
					<form role="form" name="contact-form" id="contact-form"
						action="process.php">
						<div class="form-group" id="contact-name-group">
							<label for="contact-name" class="sr-only">Name</label> <input
								type="text" class="form-control" id="contact-name"
								placeholder="Name">
						</div>
						<div class="form-group" id="contact-email-group">
							<label for="contact-email" class="sr-only">Email</label> <input
								type="email" class="form-control" id="contact-email"
								placeholder="Email">
						</div>
						<div class="form-group" id="contact-subject-group">
							<label for="contact-subject" class="sr-only">Subject</label> <input
								type="text" class="form-control" id="contact-subject"
								placeholder="Subject">
						</div>
						<div class="form-group" id="contact-message-group">
							<label for="contact-message" class="sr-only">Message</label>
							<textarea class="form-control" rows="3" id="contact-message"></textarea>
						</div>
						<button type="submit" class="btn btn-default">Submit</button>
					</form>
				</div>
				<div class="col-sm-6">
					<h2>Visit our office</h2>
					<div class="row">
						<div class="col-sm-6">
							<h5>New York</h5>
							<p>
								5 Park Avenue<br> New York, NY 10016<br> USA
							</p>
							<p>
								<i class="fa fa-phone"></i>+1 718.242.5555<br> <i
									class="fa fa-fax"></i>+1 718.242.5556<br> <i
									class="fa fa-envelope"></i><a href="mailto:ny@jobseek.com">ny@jobseek.com</a>
							</p>
							<p>
								<i class="fa fa-clock-o"></i>Mon-Fri 9am - 5pm<br> <i
									class="fa fa-clock-o"></i>Sat 10am - 2pm<br> <i
									class="fa fa-clock-o"></i>Sun Closed
							</p>
						</div>
						<div class="col-sm-6">
							<h5>Los Angeles</h5>
							<p>
								8605 Santa Monica Blvd<br> Los Angeles, CA 90069-4109<br>
								USA
							</p>
							<p>
								<i class="fa fa-phone"></i>+1 985.562.5555<br> <i
									class="fa fa-fax"></i>+1 985.562.5556<br> <i
									class="fa fa-envelope"></i><a href="mailto:la@jobseek.com">la@jobseek.com</a>
							</p>
							<p>
								<i class="fa fa-clock-o"></i>Mon-Fri 9am - 5pm<br> <i
									class="fa fa-clock-o"></i>Sat 10am - 2pm<br> <i
									class="fa fa-clock-o"></i>Sun Closed
							</p>
						</div>
					</div>
				</div>
			</div>
		</div>
	</section>

	<!-- ============ CONTACT END ============ -->

	<!-- ============ FOOTER START ============ -->

	<footer>
		<div id="prefooter">
			<div class="container">
				<div class="row">
					<div class="col-sm-6" id="newsletter">
						<h2>Newsletter</h2>
						<form class="form-inline">
							<div class="form-group">
								<label class="sr-only" for="newsletter-email">Email
									address</label> <input type="email" class="form-control"
									id="newsletter-email" placeholder="Email address">
							</div>
							<button type="submit" class="btn btn-primary">Sign up</button>
						</form>
					</div>
					<div class="col-sm-6" id="social-networks">
						<h2>Get in touch</h2>
						<a href="#"><i class="fa fa-2x fa-facebook-square"></i></a> <a
							href="#"><i class="fa fa-2x fa-twitter-square"></i></a> <a
							href="#"><i class="fa fa-2x fa-google-plus-square"></i></a> <a
							href="#"><i class="fa fa-2x fa-youtube-square"></i></a> <a
							href="#"><i class="fa fa-2x fa-vimeo-square"></i></a> <a href="#"><i
							class="fa fa-2x fa-pinterest-square"></i></a> <a href="#"><i
							class="fa fa-2x fa-linkedin-square"></i></a>
					</div>
				</div>
			</div>
		</div>
		<div id="credits">
			<div class="container text-center">
				<div class="row">
					<div class="col-sm-12">
						&copy; 2015 Jobseek - Responsive Job Board HTML Template<br>
						Designed &amp; Developed by <a
							href="http://themeforest.net/user/Coffeecream" target="_blank">Coffeecream
							Themes</a>
					</div>
				</div>
			</div>
		</div>
	</footer>

	<!-- ============ FOOTER END ============ -->

	<!-- ============ LOGIN START ============ -->

	<div class="popup" id="login">
		<div class="popup-form">
			<div class="popup-header">
				<a class="close"><i class="fa fa-remove fa-lg"></i></a>
				<h2>Login</h2>
			</div>
			<form>
				<ul class="social-login">
					<li><a class="btn btn-facebook"><i class="fa fa-facebook"></i>Sign
							In with Facebook</a></li>
					<li><a class="btn btn-google"><i class="fa fa-google-plus"></i>Sign
							In with Google</a></li>
					<li><a class="btn btn-linkedin"><i class="fa fa-linkedin"></i>Sign
							In with LinkedIn</a></li>
				</ul>
				<hr>
				<div class="form-group">
					<label for="login-username">Username</label> <input type="text"
						class="form-control" id="login-username">
				</div>
				<div class="form-group">
					<label for="login-password">Password</label> <input type="password"
						class="form-control" id="login-password">
				</div>
				<button type="submit" class="btn btn-primary">Sign In</button>
			</form>
		</div>
	</div>

	<!-- ============ LOGIN END ============ -->

	<!-- ============ REGISTER START ============ -->

	<div class="popup" id="register">
		<div class="popup-form">
			<div class="popup-header">
				<a class="close"><i class="fa fa-remove fa-lg"></i></a>
				<h2>Register</h2>
			</div>
			<form>
				<ul class="social-login">
					<li><a class="btn btn-facebook"><i class="fa fa-facebook"></i>Register
							with Facebook</a></li>
					<li><a class="btn btn-google"><i class="fa fa-google-plus"></i>Register
							with Google</a></li>
					<li><a class="btn btn-linkedin"><i class="fa fa-linkedin"></i>Register
							with LinkedIn</a></li>
				</ul>
				<hr>
				<div class="form-group">
					<label for="register-name">Name</label> <input type="text"
						class="form-control" id="register-name">
				</div>
				<div class="form-group">
					<label for="register-surname">Surname</label> <input type="text"
						class="form-control" id="register-surname">
				</div>
				<div class="form-group">
					<label for="register-email">Email</label> <input type="email"
						class="form-control" id="register-email">
				</div>
				<hr>
				<div class="form-group">
					<label for="register-username">Username</label> <input type="text"
						class="form-control" id="register-username">
				</div>
				<div class="form-group">
					<label for="register-password1">Password</label> <input
						type="password" class="form-control" id="register-password1">
				</div>
				<div class="form-group">
					<label for="register-password2">Repeat Password</label> <input
						type="password" class="form-control" id="register-password2">
				</div>
				<button type="submit" class="btn btn-primary">Register</button>
			</form>
		</div>
	</div>

	<!-- ============ REGISTER END ============ -->

	<!-- Modernizr Plugin -->
	<script src="js/modernizr.custom.79639.js"></script>

	<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
	<script src="js/jquery-1.11.2.min.js"></script>

	<!-- Bootstrap Plugins -->
	<script src="js/bootstrap.min.js"></script>

	<!-- Retina Plugin -->
	<script src="js/retina.min.js"></script>

	<!-- ScrollReveal Plugin -->
	<script src="js/scrollReveal.min.js"></script>

	<!-- Flex Menu Plugin -->
	<script src="js/jquery.flexmenu.js"></script>

	<!-- Slider Plugin -->
	<script src="js/jquery.ba-cond.min.js"></script>
	<script src="js/jquery.slitslider.js"></script>

	<!-- Carousel Plugin -->
	<script src="js/owl.carousel.min.js"></script>

	<!-- Parallax Plugin -->
	<script src="js/parallax.js"></script>

	<!-- Counterup Plugin -->
	<script src="js/jquery.counterup.min.js"></script>
	<script src="js/waypoints.min.js"></script>

	<!-- No UI Slider Plugin -->
	<script src="js/jquery.nouislider.all.min.js"></script>

	<!-- Bootstrap Wysiwyg Plugin -->
	<script src="js/bootstrap-wysiwyg.js"></script>
	<script src="js/jquery.hotkeys.js"></script>

	<!-- Flickr Plugin -->
	<script src="js/jflickrfeed.min.js"></script>

	<!-- Fancybox Plugin -->
	<script src="js/fancybox.pack.js"></script>

	<!-- Magic Form Processing -->
	<script src="js/magic.js"></script>

	<!-- jQuery Settings -->
	<script src="js/settings.js"></script>


</body>
</html>