

// Transition del Navbar


const header = document.getElementById('header');
const navbar = document.getElementById("navbar");
const superior_header = document.getElementById("superior-header");
const enlace = document.getElementById("logo");
const logo = document.getElementById("imagen");
const buscador = document.getElementById("buscador");
const minilogo = document.getElementById("miniimagen");
const minienlace = document.getElementById("minilogo");


window.onscroll = function() {scrollFunction()};


function scrollFunction() {
    if (document.body.scrollTop > 80 || document.documentElement.scrollTop > 80) {
        logo.classList.add("esconder");
        enlace.classList.add("esconder");
        header.style.marginTop = "-65px"
        navbar.style.padding = "10px 0px";
        navbar.style.margin = "70px auto -10px auto";
        superior_header.classList.add("esconder");
        buscador.classList.add("esconder");
        minilogo.classList.remove("esconder");
        minilogo.classList.add("ver");
    }

    else {
        header.style.marginTop = "0px"
        
        minilogo.classList.add("esconder");
        minilogo.classList.remove("ver");
        logo.classList.remove("esconder");
        buscador.classList.remove("esconder");
        enlace.classList.remove("esconder");
        superior_header.style.visibility = "visible";
        
    }

}
let sections = document.querySelector('.lugares-section');
//console.log(sections.getBoundingClientRect());

function siVisible(element){
    let elementbox = element.getBoundingClientRect();
    let distancia= -350;
    if(elementbox.top - window.innerHeight < distancia){
        return true;
    }
    else{
        return false;
    }
}

function navReducir(){
    let nav = document.querySelector('nav');
    if(siVisibleNav(nav)){
        nav.style.transition = "1s";
        nav.style.position = "fixed";
        nav.style.top = "0";
        nav.style.backgroundColor = "red";
    }
}

function scanDocument(){
    let sectionList = document.querySelectorAll('.hidden');
    
    sectionList.forEach(function(section){
        if(siVisible(section)){
            
            section.classList.remove("hidden");
            section.classList.add("visible");
            section.style.backgroundColor = "transparent";
            
        }
    });
    
}
function cambiarFondo(){
    let sectionList = document.querySelectorAll('.hidden');
    
    

}
document.addEventListener('scroll',scanDocument)

/*! Esperar*/
let tiempo = new Date();
let tiempoMostrar = tiempo.getSeconds();

console.log(tiempoMostrar); 

//tiempomostrar == tiempomostrar + 4;

