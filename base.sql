-- phpMyAdmin SQL Dump
-- version 4.9.0.1
-- https://www.phpmyadmin.net/
--
-- Hôte : localhost:8889
-- Généré le :  jeu. 05 mars 2020 à 21:53
-- Version du serveur :  5.7.26
-- Version de PHP :  7.3.8

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";

--
-- Base de données :  `Projet`
--

-- --------------------------------------------------------

--
-- Structure de la table `Etudiant`
--

CREATE TABLE `Etudiant` (
  `id` int(11) NOT NULL,
  `nom` varchar(64) NOT NULL,
  `prenom` varchar(64) NOT NULL,
  `mail` varchar(64) NOT NULL,
  `adresse` varchar(64) NOT NULL,
  `numero` varchar(20) NOT NULL,
  `dateNaissance` varchar(64) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `Etudiant`
--

INSERT INTO `Etudiant` (`id`, `nom`, `prenom`, `mail`, `adresse`, `numero`, `dateNaissance`) VALUES
(4, 'Simpson', 'Mr.', 'Springfield', '1 rue charles de gaulle', '2001', '2010-04-02'),
(6, 'Eric', 'mr', 'Springfield', 'ok', '2001', '2010-04-02'),
(13, 'Jean', 'Paul', 'jjj@jj.ff', 'Street', '123456789', '12 juillet'),
(90, 'KO', 'OK', 'papa@jj', '7 rue rip', '678593759', '13 janv'),
(123, 'jojo', 'bizarre', 'aventure', 'jeanbaptiste', '127287288', 'janvier'),
(777, 'jean', 'baptiste', 'jb@ensup.fr', 'ici', '904949449', '11 janvier 2019'),
(1001, 'Simpson', 'Mr.', 'Springfield', 'ok', '2001', '2010-04-02');

--
-- Index pour les tables déchargées
--

--
-- Index pour la table `Etudiant`
--
ALTER TABLE `Etudiant`
  ADD PRIMARY KEY (`id`);
