var express = require('express');
var router = express.Router();
var corridasModel = require("../models/corridas")

router.get("/corridas", function(req, res) {
    corridasModel.getCorridas((err, rows) => {
        if (req.accepts("html")) {
            res.render("corridas", { corridas: rows });
        } else {
            res.json(200, rows);
        }
    });
});

router.get("/:id", function(req, res) {
    corridasModel.getCorrida(req.params.id, function(err, row) {
        if (row) {
            if (req.accepts("html")) {
                res.render("corrida", { corridas: row });
            } else {
                res.json(200, row);
            }
        } else {
            var err = new Error('Not Found');
            err.status = 404;
            res.render("error", { error: err })
        }

    });
});
router.post('/insertar', (req, res) => {
    var corrida = {};
    corrida.origen = req.body.origen;
    corrida.destino = req.body.destino;
    corrida.fechaSalida = req.body.fechaSalida;
    corrida.horaSalida = req.body.horaSalida;
    corrida.fechaLlegada = req.body.fechaLlegada;
    corrida.horaLlegada = req.body.horaLlegada;
    corrida.escalas = req.body.escalas;
    corridasModel.insertarCorridas(corrida, (err, resp) => {
        if (resp && resp.insertId) {
            res.json(200, { "success": "true" });
        } else {
            res.json(400, { "success": "false" });
        }
    });
});
module.exports = router;