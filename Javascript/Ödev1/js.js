let fullName = prompt("Kullanıcı adınızı giriniz: ")
let info = document.querySelector("#info")
info.innerHTML = `${fullName.charAt(0).toUpperCase()+fullName.slice(1)}`
//Aşağıdaki yöntem ile fonksiyon kullanmayınca anlık olarak saat ve günü çekebiliyor fakat ilerlemesini saglayamıyordum. Bu nedenle fonksiyon kullanmam gerekti.

function showTime(){
    var date = new Date();
    var h = date.getHours(); 
    var m = date.getMinutes(); 
    var s = date.getSeconds();
    var i = date.getDay();
    
    let days = ["Pazar","Pazartesi","Salı","Çarşamba","Perşembe","Cuma","Cumartesi"];
    if (h<10) {
        h = "0"+ h
    }    
    if (m<10){
        m = "0" + m
    }
    if (s<10) {
        s = "0" + s
    }


    var time = h + ":" + m + ":" + s +"  "+ days[i];
    document.getElementById("myClock").innerText = time;
    
    setTimeout(showTime, 1000); //sn de bir yeniler
    
}
    
    showTime();
