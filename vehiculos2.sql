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


-- Volcando estructura de base de datos para estadosmexico
CREATE DATABASE IF NOT EXISTS `estadosmexico` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `estadosmexico`;

-- Volcando estructura para tabla estadosmexico.estados
CREATE TABLE IF NOT EXISTS `estados` (
  `idEstado` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(40) NOT NULL,
  `municipios` int(11) DEFAULT NULL,
  `capital` varchar(40) DEFAULT NULL,
  `comidaTipica` varchar(100) DEFAULT NULL,
  `poblacion` int(11) DEFAULT NULL,
  PRIMARY KEY (`idEstado`),
  UNIQUE KEY `nombre` (`nombre`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

-- Volcando datos para la tabla estadosmexico.estados: ~3 rows (aproximadamente)
/*!40000 ALTER TABLE `estados` DISABLE KEYS */;
INSERT INTO `estados` (`idEstado`, `nombre`, `municipios`, `capital`, `comidaTipica`, `poblacion`) VALUES
	(1, 'Guanajuato', 46, 'Guanajuato', 'Guacamayas', 5486000),
	(2, 'Michoacan', 113, 'Morelia', 'Uchepos', 4351000),
	(3, 'Jalisco', 125, 'Guadalajara', 'Tortas Ahogadas', 7351000);
/*!40000 ALTER TABLE `estados` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
