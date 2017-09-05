/**
 * 
 */

var dato = new Date();
var julaften = ((dato.getFullYear()*365)+(12*30)+24);

function SjekkDato(){
	var res1 = document.getElementById("resultat1");
	var dagensdato = ((dato.getFullYear()*365)+((dato.getMonth()+1)*30)+dato.getDay());
	var dagertiljul = (julaften-dagensdato);
	if (dagertiljul <= 30){
		var red = "Dager til jul: "+dagertiljul;
		res1.className = 'red';
		res1.innerHTML = red;
	} else  if (dagertiljul > 30 && dagertiljul <= 90){
		var green = "Dager til jul: "+dagertiljul;
		res1.className = 'green';
		res1.innerHTML = green;
	} else {
		var black = "Dager til jul: "+dagertiljul;
		res1.className = 'black';
		res1.innerHTML = black;
	}
}

function SjekkValgfriDato(){
	var res2 = document.getElementById("resultat2");
	//input for antall dager
	var dager = document.getElementById("dd").value;
	//input for antall måneder
	var maned = document.getElementById("mm").value*30;
	var testdato = ((dato.getFullYear()*365)+(+maned)+(+dager));
	var dagertiljul = (julaften-testdato);
	if (dagertiljul <= 30){
		var red = "Dager til jul: "+dagertiljul;
		res2.className = 'red';
		res2.innerHTML = red;
	} else  if (dagertiljul > 30 && dagertiljul <= 90){
		var green = "Dager til jul: "+dagertiljul;
		res2.className = 'green';
		res2.innerHTML = green;
	} else {
		var black = "Dager til jul: "+dagertiljul;
		res2.className = 'black';
		res2.innerHTML = black;
	}
}