var express = require('express');
var bodyParser = require('body-parser');
var methodOverride = require('method-override');
var app = express();

app.use(bodyParser.json())
    .use(methodOverride()).use(bodyParser.urlencoded());

app.get("/hola", (req, res) => {
    res.send(`<h1>Hola mundo</h1>`);
});

app.post("/hola/post",(req,res)=>{
    console.log(req);
    res.send("Peticion recibida"+req.body.nombre+" "+ req.body.apellido);
   
});
app.listen(3000, () => {
    console.log("Corriendo en http://localhost:3000");
});