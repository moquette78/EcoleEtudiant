-- phpMyAdmin SQL Dump
-- version 4.9.0.1
-- https://www.phpmyadmin.net/
--
-- Hôte : localhost:8889
-- Généré le :  jeu. 05 mars 2020 à 21:55
-- Version du serveur :  5.7.26
-- Version de PHP :  7.3.8

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";

--
-- Base de données :  `Projet`
--

-- --------------------------------------------------------

--
-- Structure de la table `Cours`
--

CREATE TABLE `Cours` (
  `Theme` varchar(64) NOT NULL,
  `Heures` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `Cours`
--

INSERT INTO `Cours` (`Theme`, `Heures`) VALUES
('Francais', 6);

-- --------------------------------------------------------

--
-- Structure de la table `CoursEtudiant`
--

CREATE TABLE `CoursEtudiant` (
  `Cours` varchar(64) NOT NULL,
  `Etudiant` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `CoursEtudiant`
--

INSERT INTO `CoursEtudiant` (`Cours`, `Etudiant`) VALUES
('Francais', 13);

-- --------------------------------------------------------

--
-- Structure de la table `Ecole`
--

CREATE TABLE `Ecole` (
  `nom` varchar(64) NOT NULL,
  `mail` varchar(64) NOT NULL,
  `adresse` varchar(64) NOT NULL,
  `numero` varchar(11) NOT NULL,
  `directeur` varchar(64) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Structure de la table `Enseignant`
--

CREATE TABLE `Enseignant` (
  `id` int(11) NOT NULL,
  `nom` varchar(64) NOT NULL,
  `prenom` varchar(64) NOT NULL,
  `mail` varchar(64) NOT NULL,
  `adresse` varchar(64) NOT NULL,
  `numero` varchar(64) NOT NULL,
  `matiere` varchar(64) NOT NULL,
  `mdp` varchar(120) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `Enseignant`
--

INSERT INTO `Enseignant` (`id`, `nom`, `prenom`, `mail`, `adresse`, `numero`, `matiere`, `mdp`) VALUES
(555, 'Responsable', 'des Etudes', 'resp@ensup.fr', 'Ensup Guyancourt', '101010101', '23 janvier', 'resp'),
(666, 'Monsieur', 'Le Directeur', 'direct@ensup.fr', 'Ensup Guyancourt', '123456789', '22 janvier', 'admin');

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
-- Index pour la table `Cours`
--
ALTER TABLE `Cours`
  ADD PRIMARY KEY (`Theme`);

--
-- Index pour la table `CoursEtudiant`
--
ALTER TABLE `CoursEtudiant`
  ADD KEY `Cours` (`Cours`),
  ADD KEY `Id` (`Etudiant`);

--
-- Index pour la table `Ecole`
--
ALTER TABLE `Ecole`
  ADD PRIMARY KEY (`nom`);

--
-- Index pour la table `Enseignant`
--
ALTER TABLE `Enseignant`
  ADD PRIMARY KEY (`id`);

--
-- Index pour la table `Etudiant`
--
ALTER TABLE `Etudiant`
  ADD PRIMARY KEY (`id`);

--
-- Contraintes pour les tables déchargées
--

--
-- Contraintes pour la table `CoursEtudiant`
--
ALTER TABLE `CoursEtudiant`
  ADD CONSTRAINT `Cours` FOREIGN KEY (`Cours`) REFERENCES `Cours` (`Theme`),
  ADD CONSTRAINT `Id` FOREIGN KEY (`Etudiant`) REFERENCES `Etudiant` (`id`);
