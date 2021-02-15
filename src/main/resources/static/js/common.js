function antiHype (element) {
    let active = []
    active = document.getElementsByClassName("buttons");
    for (let i =0; i <active.length; i++){
        active[i].classList.remove("activeButton")
        active[i].classList.add("unActiveButton");
    }
    element.classList.remove("unActiveButton")
    element.classList.add("activeButton")
}