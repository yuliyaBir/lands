"use strict"
const response = await fetch("landen/number");
if (response.ok){
    const number = await response.text();
    document.getElementById("number").innerText = number;
}else{
    alert("Technishe storing");
}