console.log('welcome to javascipt');

var users=[]
var allusers='<hr/>'

function addUser(){
    var data = document.getElementById('uname').value
    users.push(data) 
    console.log(data);
    for(var a=0;a<users.length;a++){
        allusers+= users[a] + "<br/>"
    }
    document.getElementById('show').innerHTML=users
}