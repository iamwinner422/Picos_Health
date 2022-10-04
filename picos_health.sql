-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Hôte : localhost:3306
-- Généré le : mar. 08 sep. 2020 à 20:09
-- Version du serveur :  5.7.24
-- Version de PHP : 7.2.19

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données : `picos_health`
--

-- --------------------------------------------------------

--
-- Structure de la table `consultation`
--

CREATE TABLE `consultation` (
  `numConsult` int(11) NOT NULL,
  `dateConsult` varchar(20) NOT NULL,
  `numMedecin` int(11) NOT NULL,
  `numPatient` int(11) NOT NULL,
  `motifConsult` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `consultation`
--

INSERT INTO `consultation` (`numConsult`, `dateConsult`, `numMedecin`, `numPatient`, `motifConsult`) VALUES
(1, '31/07/2020', 2, 1, 'Toux sévère de niveau corona'),
(2, '12/08/2020', 2, 1, 'Test rapide de covid 19 (^_^)'),
(3, '17/08/2020', 1, 1, 'AH..Un nouveau test ..pioff'),
(4, '19/08/2020', 1, 1, 'Testa'),
(5, '10/09/2020', 1, 1, 'Fièvre Jaune très grave'),
(6, '10/09/2020', 3, 3, 'Sympthomes du Covid-19'),
(7, '07/09/2020', 4, 4, 'Test '),
(8, '08/09/2020', 3, 1, 'Doutes'),
(9, '08/09/2020', 5, 5, 'Fièvre');

-- --------------------------------------------------------

--
-- Structure de la table `medecin`
--

CREATE TABLE `medecin` (
  `numMedecin` int(11) NOT NULL,
  `nomMedecin` varchar(50) NOT NULL,
  `prenomMedecin` varchar(100) NOT NULL,
  `numTelMedecin` varchar(8) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `medecin`
--

INSERT INTO `medecin` (`numMedecin`, `nomMedecin`, `prenomMedecin`, `numTelMedecin`) VALUES
(1, 'Keke', 'Edem', '98023036'),
(2, 'Banawai', 'Xavier Radja', '91733760'),
(3, 'Aoudou', 'Chadad', '93602900'),
(4, 'Gbekou', 'Kossi Vianney', '92106315'),
(5, 'Toto', 'toto', '90023038');

-- --------------------------------------------------------

--
-- Structure de la table `medicament`
--

CREATE TABLE `medicament` (
  `codeMedoc` int(11) NOT NULL,
  `nomMedoc` varchar(255) NOT NULL,
  `typeMedoc` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `medicament`
--

INSERT INTO `medicament` (`codeMedoc`, `nomMedoc`, `typeMedoc`) VALUES
(1, 'Paracétamol', 'Comprimés'),
(2, 'Litacold', 'Comprimés'),
(3, 'Ca C1000', 'Effervéssant'),
(4, 'Malabase', 'Comprimés');

-- --------------------------------------------------------

--
-- Structure de la table `patient`
--

CREATE TABLE `patient` (
  `numPatient` int(11) NOT NULL,
  `nomPatient` varchar(50) NOT NULL,
  `prenomPatient` varchar(100) NOT NULL,
  `grpSanguin` varchar(3) NOT NULL,
  `numTelPatient` varchar(8) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `patient`
--

INSERT INTO `patient` (`numPatient`, `nomPatient`, `prenomPatient`, `grpSanguin`, `numTelPatient`) VALUES
(1, 'Dzegle', 'Kwadzo Winner', 'B+', '98023036'),
(2, 'Segbe', 'Koffi Matthieu', 'B+', '91716303'),
(3, 'TRAORE', 'Fadila', 'O+', '93910239'),
(4, 'Igodo', 'Saddat', 'B+', '97432505'),
(5, 'Toto', 'toto', 'A+', '98023038');

-- --------------------------------------------------------

--
-- Structure de la table `prescription`
--

CREATE TABLE `prescription` (
  `num_pres` int(11) NOT NULL,
  `numConsult` int(11) NOT NULL,
  `codeMedoc` varchar(50) NOT NULL,
  `posologie` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `prescription`
--

INSERT INTO `prescription` (`num_pres`, `numConsult`, `codeMedoc`, `posologie`) VALUES
(1, 1, '1', '3 fois par jour(matin, midi et soir)'),
(2, 4, '3', 'Un comprimé matin et soir..');

-- --------------------------------------------------------

--
-- Structure de la table `utilisateur`
--

CREATE TABLE `utilisateur` (
  `numUser` int(11) NOT NULL,
  `login` varchar(255) NOT NULL,
  `pass` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `utilisateur`
--

INSERT INTO `utilisateur` (`numUser`, `login`, `pass`) VALUES
(1, 'Admin', '@dmin');

--
-- Index pour les tables déchargées
--

--
-- Index pour la table `consultation`
--
ALTER TABLE `consultation`
  ADD PRIMARY KEY (`numConsult`);

--
-- Index pour la table `medecin`
--
ALTER TABLE `medecin`
  ADD PRIMARY KEY (`numMedecin`);

--
-- Index pour la table `medicament`
--
ALTER TABLE `medicament`
  ADD PRIMARY KEY (`codeMedoc`);

--
-- Index pour la table `patient`
--
ALTER TABLE `patient`
  ADD PRIMARY KEY (`numPatient`);

--
-- Index pour la table `prescription`
--
ALTER TABLE `prescription`
  ADD PRIMARY KEY (`num_pres`);

--
-- Index pour la table `utilisateur`
--
ALTER TABLE `utilisateur`
  ADD PRIMARY KEY (`numUser`);

--
-- AUTO_INCREMENT pour les tables déchargées
--

--
-- AUTO_INCREMENT pour la table `consultation`
--
ALTER TABLE `consultation`
  MODIFY `numConsult` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- AUTO_INCREMENT pour la table `medecin`
--
ALTER TABLE `medecin`
  MODIFY `numMedecin` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT pour la table `medicament`
--
ALTER TABLE `medicament`
  MODIFY `codeMedoc` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT pour la table `patient`
--
ALTER TABLE `patient`
  MODIFY `numPatient` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT pour la table `prescription`
--
ALTER TABLE `prescription`
  MODIFY `num_pres` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT pour la table `utilisateur`
--
ALTER TABLE `utilisateur`
  MODIFY `numUser` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
