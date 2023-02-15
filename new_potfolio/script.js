// $(document).ready(function () {
//   $("nav a").on("click", function (event) {
//     event.preventDefault();
//     var hash = this.hash;
//     $("html, body").animate(
//       {
//         scrollTop: $(hash).offset().top,
//       },
//       800
//     );
//   });

//   $("form").on("submit", function (event) {
//     event.preventDefault();
//     alert("Form submitted!");
//   });
// });

$(document).ready(function() {
	$('nav .hamburger').on('click', function() {
		$(this).toggleClass('open');
		$('nav ul.menu').slideToggle();
	});

	$('nav a').on('click', function() {
		$('nav ul.menu').slideUp();
		$('nav .hamburger').removeClass('open');
	});
});

