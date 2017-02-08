var exports = module.exports={}; 

exports.boletos = [];

exports.insertar = (boleto)=>{
	var repetido = false;
	exports.boletos.forEach((b)=>{
		
		if(boleto.folio == b.folio){
			repetido=true;
			return;
		}
	});
	if(!repetido){
		exports.boletos.push(boleto);
	}
	
};

exports.imprimir = ()=>{
	console.log(exports.boletos)
};

exports.eliminar = folio=>{
	exports.boletos.forEach(boleto=>{
		if(boleto.folio==folio){
			exports.boletos.splice(exports.boletos.indexOf(boleto),1);
		}
	});
};