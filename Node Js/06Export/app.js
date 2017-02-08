var boletos = require('./procesos.js');

var b1={
	folio:49203,
	origen:"GTO",
	destino:"ON",
	costo:60
};
var b2={
	folio:49201,
	origen:"GTO",
	destino:"GLD",
	costo:350
};
var b3={
	folio:66357,
	origen:"GTO",
	destino:"QRO",
	costo:400
};
var b4={
	folio:66357,
	origen:"GTO",
	destino:"QRO",
	costo:400
};
boletos.insertar(b1);
boletos.insertar(b2);
boletos.insertar(b3);
boletos.insertar(b4);


boletos.imprimir();