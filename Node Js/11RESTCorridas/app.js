var Cliente = require('node-rest-client').Client;
var cliente = new Cliente();

cliente.get("http://localhost:8080/09RESTCorridas/rest/Consulta/3",(data,response)=>{
	console.log(data);
});

cliente.post("http://localhost:8080/09RESTCorridas/rest/Insertar",{
	parameters:{
		origen:"ON",
		destino:"MOR",
		fechaSalida:"2017-02-02",
		horaSalida:"17:08:00",
		fechaLlegada:"2017-02-02",
		horaLlegada:"20:00:00",
		escalas:2
	}
	
},(data,response)=>{
	console.log(data);
	
})