var mysql = require('mysql');
var conexion = mysql.createConnection({
    host: "localhost",
    user: "root",
    password: "sisope05",
    database: "corridas",
    port: 3306
});

var corridasModel = {};

corridasModel.getCorridas = function(callback) {
    if (conexion) {
        conexion.query(`SELECT * FROM corrida`, (err, rows) => {
            if (err) {
                throw err
            } else {
                callback(err, rows);
            }
        });
    };

};

corridasModel.getCorrida = function(id, callback) {
    if (conexion) {
        conexion.query(`SELECT * FROM corrida where idCorrida=${id}`, (err, row) => {
            if (err) {
                throw err
            } else {
                callback(err, row[0]);
            }
        });
    };
};
corridasModel.insertarCorridas = function(corrida, callback) {
    if (conexion) {
        conexion.query('INSERT INTO corrida SET ? ', corrida, (err, resp) => {
            if (err) {
                throw err
            } else {
                callback(err, resp)
            }
        });
    };
};

module.exports = corridasModel;