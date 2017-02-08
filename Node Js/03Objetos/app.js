var boletos = [
	{
		folio: 4,
		destino:"GTO",
		precio:62
	
	},
	{
		folio:6,
		destino:"GDL",
		precio:300
	},
	{
		folio:5,
		destino:"SILAO",
		precio:40
	},
	
	{
		folio:7,
		destino:"QRO",
		precio:430
	}
	

];

boletos.sort(function(a,b){
	if(a.precio>b.precio)
		return 1;
	else if(a.precio <b.precio)
		return -1;
	else	
		return 0;
});

console.log(boletos)


