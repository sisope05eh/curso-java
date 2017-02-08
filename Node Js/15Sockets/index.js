var app = require('express')();
var http = require('http').Server(app);
var io = require('socket.io')(http);

app.get('/', (req, res) => {
    res.sendFile(__dirname +
        "/index.html");
});

io.on('connection', (socket) => {
    socket.on('mensaje chat', (mensaje) => {
        console.log(mensaje);
        io.emit('mensaje chat', mensaje);
    });
});

http.listen(3001, () => {
    console.log("Servidpr corriendo en puerto 3000");
});