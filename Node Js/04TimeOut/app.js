setTimeout(()=>{
	console.log("Hola Eduardo");
},2000);

setTimeout(()=>{
	console.log("TercerMensaje");
},3000)

var functionX = ()=>{
	console.log("Mensaje repetitivo")
}
setInterval(functionX,1000);
console.log("Segundo Mensaje");