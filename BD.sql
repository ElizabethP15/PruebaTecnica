-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema konecta
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema konecta
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `konecta` DEFAULT CHARACTER SET utf8mb3 ;
USE `konecta` ;

-- -----------------------------------------------------
-- Table `konecta`.`hibernate_sequence`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `konecta`.`hibernate_sequence` (
  `next_val` BIGINT NULL DEFAULT NULL)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb3;


-- -----------------------------------------------------
-- Table `konecta`.`producto`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `konecta`.`producto` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `categoria` VARCHAR(255) NULL DEFAULT NULL,
  `fecha` DATETIME(6) NULL DEFAULT NULL,
  `nombre` VARCHAR(255) NULL DEFAULT NULL,
  `peso` FLOAT NOT NULL,
  `precio` FLOAT NOT NULL,
  `referencia` VARCHAR(255) NULL DEFAULT NULL,
  `stock` INT NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB
AUTO_INCREMENT = 8
DEFAULT CHARACTER SET = utf8mb3;


-- -----------------------------------------------------
-- Table `konecta`.`venta`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `konecta`.`venta` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `cantidad` INT NOT NULL,
  `nombre` VARCHAR(255) NULL DEFAULT NULL,
  `precio` FLOAT NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB
AUTO_INCREMENT = 5
DEFAULT CHARACTER SET = utf8mb3;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
