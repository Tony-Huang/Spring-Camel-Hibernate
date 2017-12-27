
window.onload=init();

function init() {
    console.log("...init...");
    var menu = document.getElementById("leftMenu");
    var links = menu.getElementsByTagName("a");
    for (var i = 0; i < links.length; i++) {
        console.log("link="+links[i] +"  , link.href="+links[i].href);
        var link=links[i];
        link.addEventListener("click",fillFrame, false);
    }
}

function fillFrame(event) {
    var content = document.getElementById("content");
    console.log("event=" + event);
    content.src = event.target.href;
    console.log("content src=" + content.src);
    event.preventDefault();
}
