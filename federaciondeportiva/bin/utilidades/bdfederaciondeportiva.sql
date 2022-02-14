SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `bdfederacion`
--
CREATE DATABASE IF NOT EXISTS `bdfederacion` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
USE `bdfederacion`;


-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `persona`
--

DROP TABLE IF EXISTS `persona`;
CREATE TABLE IF NOT EXISTS `persona` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(50) NOT NULL,
  `telefono` varchar(15) NOT NULL,
  `fechanac` date NOT NULL,
  PRIMARY KEY (`id`)
  ) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
  
  
--
-- Volcado de datos para la tabla `persona`
--

INSERT INTO `persona` (`id`, `nombre`, `telefono`, `fechanac`) VALUES
(1, 'Adrian Valdes Garcia','622567011','2001-01-01'),
(2,'Mónica García Solís','648454561','2000-02-08'),
(3,'Fernando Vallejo Najera','983452331','1992-04-10'),
(4,'Martina Villa Vivanco','921345488','1983-01-11'),
(5,'Marta Etxebarria Ruiz','674563211','1988-05-09'),
(6,'Eli Pinedo Saénz' , '648342199','1981-05-13'),
(7,'Gisela Pulido Borrell','677212341','1994-01-14'),
(8,'Ana Peleteiro Brión','622455621','1995-12-01'),
(9,'Raúl Entrerrios Rodriguez','984562313','1981-02-12'),
(10,'Nina Khivanevskaya','645862322','1978-06-24'),
(11,'Mireia Belmonte García','648234567','1990-11-10'),
(12,'Mikkel Hansen','656342101','1987-10-22');


--
-- Estructura de tabla para la tabla `manager`
--

DROP TABLE IF EXISTS `manager`;
CREATE TABLE IF NOT EXISTS `manager` (
`id` int(11) NOT NULL,
`direccion` varchar(50) NOT NULL,
`idpersona`int(11) NOT NULL,
PRIMARY KEY (`id`),
KEY `FK_PERSONA` (`idpersona`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `manager`
--

INSERT INTO `manager`(`id`,`direccion`,`idpersona`) VALUES
(1,'Rambla PobleNou 171 BCN',7),
(2,'Avenida Constitución 110 Gijón',9);
INSERT INTO `manager`(`id`,`direccion`,`idpersona`) VALUES
(3,'Sanct Olai Gade 34 Elsinor',12);

--
-- Filtros para la tabla `manager`
--

ALTER TABLE `manager`
ADD CONSTRAINT `FK_PERSONA` FOREIGN KEY (`idpersona`) REFERENCES `persona` (`id`);

--
-- Estructura de tabla para la tabla `manager`
--

DROP TABLE IF EXISTS `atleta`;
CREATE TABLE IF NOT EXISTS `atleta` (
`id` int(11) NOT NULL,
`altura` float NOT NULL,
`peso` float NOT NULL,
`idpersona`int(11) NOT NULL,
`idequipo` int(11) NOT NULL,
PRIMARY KEY (`id`),
KEY `FKPERSONA` (`idpersona`),
KEY `FKEQUIPO` (`idequipo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `atleta`
--

INSERT INTO `atleta` (`id`,`altura`,`peso`,`idpersona`,`idequipo`) VALUES
(1,1.80,77.8,1,1),
(2,1.63,55.3,2,1),
(3,1.82,80.1,3,2);
INSERT INTO `atleta` (`id`,`altura`,`peso`,`idpersona`,`idequipo`) VALUES
(4,1.90,84.5,4,3);

--
-- Filtros para la tabla `atleta`
--

ALTER TABLE `atleta`
ADD CONSTRAINT `FKPERSONA` FOREIGN KEY (`idpersona`) REFERENCES `persona` (`id`),
ADD CONSTRAINT `FKEQUIPO` FOREIGN KEY (`idequipo`) REFERENCES `equipo` (`id`);


--
-- Estructura de tabla para la tabla `equipo`
--

DROP TABLE IF EXISTS `equipo`;
CREATE TABLE IF NOT EXISTS `equipo` (
`id` int(11) NOT NULL AUTO_INCREMENT,
`anioincripcion` YEAR NOT NULL,
`idmanager` int(11) NOT NULL,
PRIMARY KEY (`id`),
KEY `FKMANAGER` (`idmanager`)
) ENGINE=InnoDB DEFAULT CHARSET= utf8mb4;

--
-- Volcado de datos para la tabla `equipo`
--

INSERT INTO `equipo`(`id`,`anioincripcion`,`idmanager`) VALUES
(1,1999,1),
(2,2001,2);
INSERT INTO `equipo`(`id`,`anioincripcion`,`idmanager`) VALUES
(3,2004,3);
--
-- Filtros para la tabla `equipo`
--

ALTER TABLE `equipo`
ADD CONSTRAINT `FKMANAGER` FOREIGN KEY (`idmanager`) REFERENCES `manager` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION;