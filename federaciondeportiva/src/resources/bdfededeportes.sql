-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema bdfededeportes
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema bdfededeportes
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `bdfededeportes` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_spanish_ci ;
USE `bdfededeportes` ;

-- -----------------------------------------------------
-- Table `bdfededeportes`.`persona`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `bdfededeportes`.`persona` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(50) NOT NULL,
  `telefono` VARCHAR(50) NOT NULL,
  `fechaNac` DATE NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `bdfededeportes`.`manager`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `bdfededeportes`.`manager` (
  `direccion` VARCHAR(50) NOT NULL,
  `persona_id` bigint(20) NOT NULL,
  PRIMARY KEY (`persona_id`),
  CONSTRAINT `fk_manager_persona1`
    FOREIGN KEY (`persona_id`)
    REFERENCES `bdfededeportes`.`persona` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `bdfededeportes`.`equipo`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `bdfededeportes`.`equipo` (
  `nombre` VARCHAR(50) NOT NULL,
  `anioinscripcion` INT NOT NULL,
  `manager_persona_id` bigint(20) NOT NULL,
  `id`  bigint(20) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`id`),
  CONSTRAINT `fk_equipo_manager1`
    FOREIGN KEY (`manager_persona_id`)
    REFERENCES `bdfededeportes`.`manager` (`persona_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `bdfededeportes`.`atleta`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `bdfededeportes`.`atleta` (
  `altura` FLOAT NOT NULL,
  `peso` FLOAT NOT NULL,
  `persona_id` bigint(20) NOT NULL,
  `equipo_id` bigint(20) NOT NULL,
  PRIMARY KEY (`persona_id`),
  CONSTRAINT `fk_atleta_persona1`
    FOREIGN KEY (`persona_id`)
    REFERENCES `bdfededeportes`.`persona` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_atleta_equipo1`
    FOREIGN KEY (`equipo_id`)
    REFERENCES `bdfededeportes`.`equipo` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

--
-- Volcado de datos para la tabla `persona`
--

INSERT INTO `persona` (`id`, `nombre`, `telefono`, `fechaNac`) VALUES
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

INSERT INTO `persona` (`id`, `nombre`, `telefono`, `fechaNac`) VALUES
(13,'Galia Dvorak','648768921','1988-04-01'),
(14,'Mohamed Katir','981234522','1998-02-17');


--
-- Volcado de datos para la tabla `manager`
--

INSERT INTO `manager`(`direccion`,`persona_id`) VALUES
('Rambla PobleNou 171 BCN',7),
('Avenida Constitución 110 Gijón',9);
INSERT INTO `manager`(`direccion`,`persona_id`) VALUES
('Sanct Olai Gade 34 Elsinor',12);

--
-- Volcado de datos para la tabla `equipo`
--

INSERT INTO `equipo`(`nombre`,`anioinscripcion`,`manager_persona_id`,`id`) VALUES
('POLONIA','1999',7,1),
('FRANCIA','2001',9,2);
INSERT INTO `equipo`(`nombre`,`anioinscripcion`,`manager_persona_id`,`id`) VALUES
('RUSIA','2002',12,3);

--
-- Volcado de datos para la tabla `atleta`
--

INSERT INTO `atleta` (`altura`,`peso`,`persona_id`,`equipo_id`) VALUES
(1.80,77.8,1,1),
(1.63,55.3,2,1),
(1.82,80.1,3,1);
INSERT INTO `atleta` (`altura`,`peso`,`persona_id`,`equipo_id`) VALUES
(1.90,84.5,4,2),
(1.87,83.2,5,2),
(1.77,69.4,6,2);
INSERT INTO `atleta` (`altura`,`peso`,`persona_id`,`equipo_id`) VALUES
(1.80,80.5,8,3),
(1.87,81.9,10,3),
(1.87,79.4,11,3);
INSERT INTO `atleta` (`altura`,`peso`,`persona_id`,`equipo_id`) VALUES
(1.82,60,13,2),
(1.65,65,14,3);

COMMIT;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
