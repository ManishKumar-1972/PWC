const axios= require('axios')
var url='https://api.openweathermap.org/data/2.5/weather?q=patna&appid=cad711b2c60b090f33b4cccac935b15d&units=metric'
module.exports=function(callback){

axios.get(url)
.then((res)=>{
    callback(res.data.main.temp + " "+ res.data.name);
})}