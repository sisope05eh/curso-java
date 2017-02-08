var http = require('http');
var url = require('url');
var fs= require('fs');
http.createServer((req,res)=>{
//	res.end("<h1>Hola mundo</h1>");
	/*var urlParse = url.parse(req.url,true);
	var params = urlParse.query;
	
	console.log(urlParse);
	console.log("------")
	console.log(params);
	res.end(`<h1>Nombre:${params.nombre}</h1`);*/

	var urlParse = url.parse(req.url,true);
	var path = urlParse.path;
	console.log(path);
	switch(path){
		case "/primero/":
			fs.readFile('primero.html',(err,data)=>{
				res.writeHeader(200,{
					"Content-Type":"Text/html"
				});
				res.write(data.toString());
				res.end();
			});
			break;
		case "/segundo/":
			fs.readFile('segundo.html',(err,data)=>{
				res.writeHeader(200,{
					"Content-Type":"Text/html"
				});
				res.write(data.toString());
				res.end();
			});
			break;
		default:
			res.writeHeader(404,{
				"Content-Type":"text/html"
			});
			res.end(`<h1 style="color:red;"> ERROR!!!!!</h1>`);
	}
	
}).listen(3999,'127.0.0.1');

console.log("Servidor corriendo en 127.0.0.1:3999");