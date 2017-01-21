-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Versión del servidor:         10.1.20-MariaDB - mariadb.org binary distribution
-- SO del servidor:              Win64
-- HeidiSQL Versión:             9.4.0.5125
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


-- Volcando estructura de base de datos para vehiculos
CREATE DATABASE IF NOT EXISTS `vehiculos` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `vehiculos`;

-- Volcando estructura para tabla vehiculos.automovil
CREATE TABLE IF NOT EXISTS `automovil` (
  `idAutomovil` int(11) NOT NULL AUTO_INCREMENT,
  `idTipoVehiculo` varchar(20) DEFAULT NULL,
  `tipoEncendido` varchar(15) DEFAULT NULL,
  `tipoTraccion` varchar(15) DEFAULT NULL,
  PRIMARY KEY (`idAutomovil`),
  KEY `idTipoVehiculo` (`idTipoVehiculo`),
  CONSTRAINT `automovil_ibfk_1` FOREIGN KEY (`idTipoVehiculo`) REFERENCES `vehiculo` (`idTipo`) ON DELETE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- La exportación de datos fue deseleccionada.
-- Volcando estructura para tabla vehiculos.avion
CREATE TABLE IF NOT EXISTS `avion` (
  `idAvion` int(11) NOT NULL AUTO_INCREMENT,
  `idTipoVehiculo` varchar(20) DEFAULT NULL,
  `tipoAvion` varchar(15) DEFAULT NULL,
  `propulsores` varchar(15) DEFAULT NULL,
  PRIMARY KEY (`idAvion`),
  KEY `idTipoVehiculo` (`idTipoVehiculo`),
  CONSTRAINT `avion_ibfk_1` FOREIGN KEY (`idTipoVehiculo`) REFERENCES `vehiculo` (`idTipo`) ON DELETE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- La exportación de datos fue deseleccionada.
-- Volcando estructura para tabla vehiculos.bicicleta
CREATE TABLE IF NOT EXISTS `bicicleta` (
  `idBicicleta` int(11) NOT NULL AUTO_INCREMENT,
  `idTipoVehiculo` varchar(20) DEFAULT NULL,
  `tipoBicicleta` varchar(15) DEFAULT NULL,
  `tipoFrenos` varchar(15) DEFAULT NULL,
  `Velocimetro` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`idBicicleta`),
  KEY `idTipoVehiculo` (`idTipoVehiculo`),
  CONSTRAINT `bicicleta_ibfk_1` FOREIGN KEY (`idTipoVehiculo`) REFERENCES `vehiculo` (`idTipo`) ON DELETE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- La exportación de datos fue deseleccionada.
-- Volcando estructura para tabla vehiculos.motocicleta
CREATE TABLE IF NOT EXISTS `motocicleta` (
  `idMotocicleta` int(11) NOT NULL AUTO_INCREMENT,
  `idTipoVehiculo` varchar(20) DEFAULT NULL,
  `cascos` int(11) DEFAULT NULL,
  `tipoMotocicleta` varchar(15) DEFAULT NULL,
  `tipoEncendido` varchar(15) DEFAULT NULL,
  PRIMARY KEY (`idMotocicleta`),
  KEY `idTipoVehiculo` (`idTipoVehiculo`),
  CONSTRAINT `motocicleta_ibfk_1` FOREIGN KEY (`idTipoVehiculo`) REFERENCES `vehiculo` (`idTipo`) ON DELETE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- La exportación de datos fue deseleccionada.
-- Volcando estructura para tabla vehiculos.vehiculo
CREATE TABLE IF NOT EXISTS `vehiculo` (
  `idVehiculo` int(11) NOT NULL AUTO_INCREMENT,
  `marca` varchar(30) DEFAULT NULL,
  `color` varchar(30) DEFAULT NULL,
  `modelo` int(11) DEFAULT NULL,
  `idTipo` varchar(10) NOT NULL,
  PRIMARY KEY (`idVehiculo`),
  UNIQUE KEY `idTipo` (`idTipo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- La exportación de datos fue deseleccionada.
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
