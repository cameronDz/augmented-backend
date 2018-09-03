-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema workout
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `workout` ;

-- -----------------------------------------------------
-- Schema workout
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `workout` DEFAULT CHARACTER SET utf8 ;
SHOW WARNINGS;
USE `workout` ;

-- -----------------------------------------------------
-- Table `t_session`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `t_session` ;

SHOW WARNINGS;
CREATE TABLE IF NOT EXISTS `t_session` (
  `session_id` INT NOT NULL AUTO_INCREMENT,
  `start_time` TIMESTAMP NULL,
  `end_time` TIMESTAMP NULL,
  `session_comment` VARCHAR(500) NULL,
  PRIMARY KEY (`session_id`))
ENGINE = InnoDB;

SHOW WARNINGS;

-- -----------------------------------------------------
-- Table `t_rountine`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `t_rountine` ;

SHOW WARNINGS;
CREATE TABLE IF NOT EXISTS `t_rountine` (
  `rountine_id` INT NOT NULL AUTO_INCREMENT,
  `session_id` INT NOT NULL,
  `session_order` INT NULL,
  `exercise_id` INT NOT NULL,
  `routine_comment` VARCHAR(500) NULL,
  PRIMARY KEY (`rountine_id`))
ENGINE = InnoDB;

SHOW WARNINGS;

-- -----------------------------------------------------
-- Table `t_exercise`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `t_exercise` ;

SHOW WARNINGS;
CREATE TABLE IF NOT EXISTS `t_exercise` (
  `exercise_id` INT NOT NULL AUTO_INCREMENT,
  `exercise_type` INT NOT NULL,
  `exercise_name` VARCHAR(100) NOT NULL,
  `exercise_description` VARCHAR(500) NULL,
  PRIMARY KEY (`exercise_id`))
ENGINE = InnoDB;

SHOW WARNINGS;
CREATE UNIQUE INDEX `name_UNIQUE` ON `t_exercise` (`exercise_name` ASC);

SHOW WARNINGS;

-- -----------------------------------------------------
-- Table `t_exercise_type`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `t_exercise_type` ;

SHOW WARNINGS;
CREATE TABLE IF NOT EXISTS `t_exercise_type` (
  `exercise_type_id` INT NOT NULL AUTO_INCREMENT,
  `exercise_type` VARCHAR(100) NOT NULL,
  PRIMARY KEY (`exercise_type_id`))
ENGINE = InnoDB;

SHOW WARNINGS;
CREATE UNIQUE INDEX `type_UNIQUE` ON `t_exercise_type` (`exercise_type` ASC);

SHOW WARNINGS;

-- -----------------------------------------------------
-- Table `t_rountine_set`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `t_rountine_set` ;

SHOW WARNINGS;
CREATE TABLE IF NOT EXISTS `t_rountine_set` (
  `rountine_set_id` INT NOT NULL AUTO_INCREMENT,
  `routine_id` INT NOT NULL,
  `routine_order` INT NULL,
  `set_id` INT NOT NULL,
  PRIMARY KEY (`rountine_set_id`))
ENGINE = InnoDB;

SHOW WARNINGS;

-- -----------------------------------------------------
-- Table `t_set`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `t_set` ;

SHOW WARNINGS;
CREATE TABLE IF NOT EXISTS `t_set` (
  `set_id` INT NOT NULL AUTO_INCREMENT,
  `reps` INT NULL,
  `weight` FLOAT NULL,
  `weight_type_id` INT NULL,
  `set_time` TIME NULL,
  `set_comment` VARCHAR(500) NULL,
  PRIMARY KEY (`set_id`))
ENGINE = InnoDB;

SHOW WARNINGS;

-- -----------------------------------------------------
-- Table `t_superset`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `t_superset` ;

SHOW WARNINGS;
CREATE TABLE IF NOT EXISTS `t_superset` (
  `superset_id` INT NOT NULL AUTO_INCREMENT,
  `session_id` INT NOT NULL,
  `session_order` INT NULL,
  `superset_comment` VARCHAR(500) NULL,
  PRIMARY KEY (`superset_id`))
ENGINE = InnoDB;

SHOW WARNINGS;

-- -----------------------------------------------------
-- Table `t_superset_routine`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `t_superset_routine` ;

SHOW WARNINGS;
CREATE TABLE IF NOT EXISTS `t_superset_routine` (
  `superset_routine_id` INT NOT NULL AUTO_INCREMENT,
  `exercise_id` INT NOT NULL,
  `superset_id` INT NOT NULL,
  `superset_order` INT NULL,
  PRIMARY KEY (`superset_routine_id`))
ENGINE = InnoDB;

SHOW WARNINGS;

-- -----------------------------------------------------
-- Table `t_superset_set`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `t_superset_set` ;

SHOW WARNINGS;
CREATE TABLE IF NOT EXISTS `t_superset_set` (
  `superset_set_id` INT NOT NULL AUTO_INCREMENT,
  `superset_routine_id` INT NOT NULL,
  `superset_routine_order` INT NULL,
  `set_id` INT NOT NULL,
  PRIMARY KEY (`superset_set_id`))
ENGINE = InnoDB;

SHOW WARNINGS;

-- -----------------------------------------------------
-- Table `t_weight_type`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `t_weight_type` ;

SHOW WARNINGS;
CREATE TABLE IF NOT EXISTS `t_weight_type` (
  `weight_type_id` INT NOT NULL AUTO_INCREMENT,
  `weight_type` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`weight_type_id`))
ENGINE = InnoDB;

SHOW WARNINGS;
CREATE UNIQUE INDEX `type_UNIQUE` ON `t_weight_type` (`weight_type` ASC);

SHOW WARNINGS;

SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
