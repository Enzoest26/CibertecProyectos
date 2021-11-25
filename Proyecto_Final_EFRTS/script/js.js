
let imgCarrusel = [
    "../img/CarruselIndex/Cuzco.jpg",
    "../img/CarruselIndex/Lima.jpg",
    "../img/CarruselIndex/Arequipa.jpg"];
let tituloCarrusel = [
    "Cuzco",
    "Lima",
    "Arequipa"
];
let descriCarrusel = [
    "Maravillas mundial",
    "Ciudad de la gastronimía",
    "La ciudad Blanca"
];
console.log(imgCarrusel[0]);
var i = 0;
var imgs = document.getElementById("banner");

var tituloCarru = document.getElementById("titulobanner");
var descriCarru = document.getElementsByClassName("ban-descri");
function indexCarrusel() {
    
    imgs.setAttribute("src",imgCarrusel[i]);
    contenidoCarrusel(tituloCarru,descriCarru,tituloCarrusel,descriCarrusel);
    i++;
    if(i > imgCarrusel.length - 1){
        i = 0;
    }
    
    imgs.style.opacity = "1";
    imgs.style.transition = "1s";
    setTimeout("ocultar(imgs)",2000);
    
}
function ocultar(variable) {
    
    variable.style.opacity = "0";
    variable.style.transition = "all 1s ease";
    setTimeout("indexCarrusel()",700);
    
}
function contenidoCarrusel(div1,div2,array1,array2) {
    div1.innerHTML = array1[i];
    div2.innerHTML = array2[i];   
    
}
window.document.onload(indexCarrusel());

//Efecto del scroll

function goArequipa(){
    window.location = "lugares.html#arequipa";
}
function goPuno(){
    window.location = "lugares.html#puno";
}
function goLima(){
    window.location = "lugares.html#lima";
}
function goTacna(){
    window.location = "lugares.html#tacna";
}