
let userName = prompt("Lütfen adınızı giriniz:")

let content = document.querySelector("#myName");

content.innerHTML = userName;

function timer(){

var today = new Date();

var days = ['Pazar', 'Pazartesi', 'Sali', 'Carsamba', 'Persembe', 'Cuma', 'Cumartesi'];

var date = today.getHours()+':'+today.getMinutes()+':'+today.getSeconds()+'   '+days[today.getDay()];

setTimeout(timer, 1000);

let timeContent = document.querySelector("#myClock");

timeContent.innerHTML = date;

}

timer();

