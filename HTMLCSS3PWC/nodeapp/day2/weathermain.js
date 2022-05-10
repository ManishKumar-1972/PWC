var weather = require('./weatherapp.js')
var location= require('./location.js')
var argv=require('yargs')
.option('loc',{
    type:'string',
    alias:'l'
}).help('help')
.argv

weather(argv.loc,function(callback){
    console.log(callback);
})

location(function(location){
    console.log(location.data.city);
})