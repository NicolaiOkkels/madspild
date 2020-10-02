window.addEventListener("load", sidenVises);

var burger = document.getElementById("myTopnav");
var timer = 0;
var i;
var current, next;
var moveSlideAnimClass = {
    forCurrent: "",
    forNext: ""
}
var slideIndex, slides, captionText;

function sidenVises() {
    console.log("sidenVises");
}

function burgerMenu() {

    if (burger.className === "topnav") {
        burger.className += " responsive";
    } else {
        burger.className = "topnav";
    }
}

function initGallery() {
    slideIndex = 0;
    slides = document.getElementsByClassName("imageHolder");
    slides[slideIndex].style.opacity = 1;

    captionText = document.querySelector(".captionTextHolder .captionText");
    captionText.innerText = slides[slideIndex].querySelector(".captionText").innerText;
}
initGallery();

function plusSlides(n) {
    moveSlide(slideIndex + n);
}

function moveSlide(n) {

    if (n > slideIndex) {
        if (n >= slides.length) {
            n = 0;
        }
        moveSlideAnimClass.forCurrent = "moveLeftCurrentSlide";
        moveSlideAnimClass.forNext = "moveLeftNextSlide";
        slideTextAnimClass = "slideTextFromTop";
    } else if (n < slideIndex) {
        if (n < 0) {
            n = slides.length - 1;
        }
        moveSlideAnimClass.forCurrent = "moveRightCurrentSlide";
        moveSlideAnimClass.forNext = "moveRightPrevSlide";
        slideTextAnimClass = "slideTextFromBottom";
    }

    if (n != slideIndex) {
        next = slides[n];
        current = slides[slideIndex];
        for (i = 0; i < slides.length; i++) {
            slides[i].className = "imageHolder";
            slides[i].style.opacity = 0;
        }
        current.classList.add(moveSlideAnimClass.forCurrent);
        next.classList.add(moveSlideAnimClass.forNext);

        slideIndex = n;
    }

}


function setTimer() {
    timer = setInterval(function () {
        plusSlides(1);
    }, 5000);
}
setTimer();
