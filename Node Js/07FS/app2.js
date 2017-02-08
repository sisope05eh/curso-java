var fs= require('fs');

var contenido= fs.readFileSync('./archivo.txt');
console.log(contenido.toString());