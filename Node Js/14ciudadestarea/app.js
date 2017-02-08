var http = require('http');
var fs = require('fs');
var soap = require('soap');
var xml2js = require('xml2js');

var url = "http://www.webservicex.net/globalweather.asmx?wsdl";
var params = { CountryName: 'Mexico' }
var parse = xml2js.parseString;
//http.createServer((req, res) => {
soap.createClient(url, (err1, cliente) => {
    cliente.GetCitiesByCountry(params, (err2, response) => {
        //console.log(response.GetCitiesByCountryResult);
        parse(response.GetCitiesByCountryResult, (err3, result) => {
            //console.log(result.NewDataSet.Table);
            var arr = [];
            var contenido;
            arr = result.NewDataSet.Table;
            arr.forEach(function(element) {
                console.log((element.City.toString()));
                contenido += (element.City.toString()) + "\n";
            }, this);
            if (contenido != "") {
                fs.writeFile('./ciudades.txt', contenido, err => {
                    console.log("Guardado!");
                });
            }
        });
    })
});
//}).listen(3991, '127.0.0.1');