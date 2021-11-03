/*
function showScroll(){
    let animacion = document.getElementsByClassName("animacion-scroll");
    let divs = document.getElementsByClassName("lugares-section");
    let positionobj1 = divs[1].getBoundingClientRect().top;
    console.log(positionobj1);
    let tamañoPantalla = window.innerHeight/4;
    var c = tamañoPantalla;
    var aumento = 100;
    for(var i = 0;i<divs.length;i++){
        if(positionobj1 + 100 < c){
            divs[i].style.transition = "1s";
            divs[i].style.opacity = "1";
        }
        aumento += 100;
        
    }
    console.log(tamañoPantalla);
}

window.addEventListener("scroll", showScroll);
*/