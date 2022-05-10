const axios= require('axios')


module.exports=function(location,callback){
    var ec=encodeURIComponent(location)
    var url= `https://api.openweathermap.org/data/2.5/weather?q=${ec}&appid=cad711b2c60b090f33b4cccac935b15d&units=metric`

axios.get(url)
.then((res)=>{
    callback('its ' + res.data.main.temp + " in "+ res.data.name);
})}