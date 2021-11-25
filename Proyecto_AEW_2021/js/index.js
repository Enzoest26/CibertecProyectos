window.onscroll = function() {navFunction()}


const header = document.getElementById("header");
const head = document.getElementById("head");
const btn_redireccionar = document.getElementById("btn_flotante");

function navFunction() {
    
    if(document.body.scrollTop > 80 || document.documentElement.scrollTop > 80){
        head.classList.add("esconder");
        header.style.height ="60px";
        
        btn_redireccionar.style.visibility ="inherit";
    }
    else{
        
        head.classList.remove("esconder");
        header.style.height = "160px";
        header.style.transition ="0.2s all"
        btn_redireccionar.style.visibility ="hidden";
    }
}
function goInicio() {
    window.location = "./index.html";
}