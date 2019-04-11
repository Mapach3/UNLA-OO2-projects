-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema bdsistemafrances
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema bdsistemafrances
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `bdsistemafrances` DEFAULT CHARACTER SET utf8 ;
USE `bdsistemafrances` ;

-- -----------------------------------------------------
-- Table `bdsistemafrances`.`Cliente`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `bdsistemafrances`.`Cliente` (
  `idCliente` INT NOT NULL AUTO_INCREMENT,
  `apellido` VARCHAR(45) NOT NULL,
  `nombre` VARCHAR(45) NOT NULL,
  `documento` VARCHAR(45) NOT NULL,
  `fechaDeNacimiento` DATE NULL DEFAULT NULL,
  `baja` BIT NULL DEFAULT b'0',
  PRIMARY KEY (`idCliente`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
