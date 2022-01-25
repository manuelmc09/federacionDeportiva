-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema bdfederaciondeportiva
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema bdfederaciondeportiva
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `bdfederaciondeportiva` DEFAULT CHARACTER SET utf8 ;
USE `bdfederaciondeportiva` ;

--
-- Base de datos: `bdfederaciondeportiva`
--
-- CREATE DATABASE IF NOT EXISTS `bdfederaciondeportiva` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
-- USE `bdfederaciondeportiva`;

-- --------------------------------------------------------
-- -----------------------------------------------------
-- Table `bdfederaciondeportiva`.`persona`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `bdfederaciondeportiva`.`persona`;
CREATE TABLE IF NOT EXISTS `bdfederaciondeportiva`.`persona` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(50) NOT NULL,
  `telefono` VARCHAR(15) NOT NULL,
  `fechanac` DATE NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


--
-- Volcado de datos para la tabla `persona`
--

INSERT INTO `persona` (`id`, `nombre`, `telefono`, `fechanac`) VALUES
(1,'Eli Pinedo' , '648342199','1981-05-13'),
(2,'Gisela Pulido','677212341','1994-01-14'),
(3,'Ana Peleteiro','+64622455621','1995-12-01'),
(4,'Raúl Entrerrios','984562313','1981-02-12'),
(5,'Nina Khivanevskaya','+6458623221','1978-06-24'),
(6,'Mireia Belmonte','648234567','1990-11-10'),
(7,'Mikkel Hansen','+64456342101','1987-10-22');
-- -----------------------------------------------------
-- Table `bdfederaciondeportiva`.`manager`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `bdfederaciondeportiva`.`manager`;
CREATE TABLE IF NOT EXISTS `bdfederaciondeportiva`.`manager` (
  `email` VARCHAR(50) NOT NULL,
  `id` INT NOT NULL,
  UNIQUE INDEX `email_UNIQUE` (`email` ASC) VISIBLE,
  PRIMARY KEY (`id`),
  CONSTRAINT `fk_manager_persona`
    FOREIGN KEY (`id`)
    REFERENCES `bdfederaciondeportiva`.`persona` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


--
-- Volcado de datos para la tabla `manager`
--

INSERT INTO `manager` (`id`, `email`) VALUES
(1,'elipinedo@gmail.com'),
(7,'mikkelhansen@gmail.com');

-- -----------------------------------------------------
-- Table `bdfederaciondeportiva`.`atleta`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `bdfederaciondeportiva`.`atleta`;
CREATE TABLE IF NOT EXISTS `bdfederaciondeportiva`.`atleta` (
  `altura` FLOAT NOT NULL,
  `peso` FLOAT NOT NULL,
  `id` INT NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_atleta_persona1_idx` (`id` ASC) VISIBLE,
  CONSTRAINT `fk_atleta_persona1`
    FOREIGN KEY (`id`)
    REFERENCES `bdfederaciondeportiva`.`persona` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


--
-- Volcado de datos para la tabla `atleta`
--

INSERT INTO `atleta` (`id`, `altura`, `peso`) VALUES
(1,,1.66,51),
(2,1.71,52),
(3,1.93,88);

-- -----------------------------------------------------
-- Table `bdfederaciondeportiva`.`equipo`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `bdfederaciondeportiva`.`equipo`;
CREATE TABLE IF NOT EXISTS `bdfederaciondeportiva`.`equipo` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `añoinscripcion` DATE NOT NULL,
  `manager_id` INT NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_equipo_manager1_idx` (`manager_id` ASC) VISIBLE,
  CONSTRAINT `fk_equipo_manager1`
    FOREIGN KEY (`manager_id`)
    REFERENCES `bdfederaciondeportiva`.`manager` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


--
-- Volcado de datos para la tabla `equipo`
--

INSERT INTO `equipo` (`id`, `añoinscripcion`, `manager_id`) VALUES
(1,'2018-02-03',1),
(2,'2017-12-04',7);

COMMIT;

SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
