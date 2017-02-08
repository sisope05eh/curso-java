var fs= require('fs');
var contenido;
fs.readFile('./archivo.txt',function(err,data){
	contenido = data.toString();
	console.log(contenido);
	escribir();
});

function escribir(){
	fs.writeFile('.\recipiente.txt',contenido,err=>{
	console.log("Escritura Realizada.");
});
}

