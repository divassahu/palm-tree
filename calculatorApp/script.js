var display = document.getElementById("display");
var buttons = document.querySelectorAll("button");

for (var i = 0; i < buttons.length; i++) {
	buttons[i].addEventListener("click", function() {
		var value = this.innerHTML;
		if (value === "=") {
			display.value = eval(display.value);
		} else if (value === "C") {
			display.value = "";
		} else if (value === "CE") {
			display.value = display.value.substr(0, display.value.length - 1);
		} else {
			display.value += value;
		}
	});
}
