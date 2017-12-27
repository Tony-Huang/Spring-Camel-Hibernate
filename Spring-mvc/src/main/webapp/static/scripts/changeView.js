/**
 * Created by 44010467 on 12/20/2017.
 */

window.onload=init();

function init() {
    console.log("...init...")
    var menu = document.getElementById("leftMenu");
    var links = menu.getElementsByTagName("a");
    for (var i = 0; i < links.length; i++) {
        links[i].onclick = fillFrame;

    }
}

function fillFrame(event) {
    var content = document.getElementById("content");

    console.log("set content src...")
    content.src = event.target.href;
    console.log("content src="+content.src);
    if(event.preventDefault) {
        event.preventDefault();
    }
    else {
        return false;
    }

}

