# Numbers in Words

## Description
Ce projet est un **kata** permettant de convertir un nombre entier en toutes lettres en français. Il respecte les règles orthographiques officielles, notamment l'utilisation des tirets et la gestion des pluriels pour "cent" et "vingt".

Le programme prend en charge les nombres de **0** à **1 000 000** et offre une implémentation en **Java** avec des tests unitaires utilisant **JUnit**.

---

## Fonctionnalités
- **Conversion de nombres en toutes lettres** (ex: 95 -> "quatre-vingt-quinze").
- **Gestion des cas particuliers** comme "cent", "mille", "million".
- **Respect des règles orthographiques officielles**.
- **Tests unitaires complets avec JUnit**.
- **Possibilité d'extension pour prendre en charge les nombres décimaux et l'inverse (lettres -> chiffres)**.

---

## Exemples d'utilisation
| Entrée | Sortie |
|--------|--------|
| 0 | "zéro" |
| 5 | "cinq" |
| 19 | "dix-neuf" |
| 61 | "soixante-et-un" |
| 95 | "quatre-vingt-quinze" |
| 100 | "cent" |
| 101 | "cent-un" |
| 1000 | "mille" |
| 3200 | "trois-mille-deux-cents" |
| 7642 | "sept-mille-six-cent-quarante-deux" |
| 1000000 | "un million" |

---

## Installation
### Prérequis
- **Java 21+**
- **Maven ou Gradle** (optionnel pour les tests)

### Cloner le projet
```sh
git clone https://github.com/votre-utilisateur/numbers-in-words.git
cd numbers-in-words
```

### Compiler le projet
```
Si vous utilisez **Gradle** :
```sh
gradle build
```

---

## Structure du projet
```
📂 numbers-in-words
├── 📂 src
│   ├── 📂 main
│   │   ├── 📂 java
│   │   │   ├── 📂 org.example
│   │   │   │   ├── NumbersInWords.java   # Classe principale
│   ├── 📂 test
│   │   ├── 📂 java
│   │   │   ├── 📂 org.example
│   │   │   │   ├── NumbersInWordsTest.java  # Tests unitaires
├── pom.xml  # Fichier Maven (si utilisé)
├── build.gradle  # Fichier Gradle (si utilisé)
└── README.md
```

---

## Améliorations futures
- **Support des nombres décimaux** (ex: "12,34" -> "douze virgule trente-quatre").
- **Conversion inverse** (ex: "soixante-deux" -> `62`).
- **Optimisation des performances**.

---

## Contributeurs
- **Auteur :** [Ulrich Sadou](https://github.com/usadou29)
- RAJOUTEZ VOS NOMS

N'hésitez pas à proposer des améliorations via des **issues** ou des **pull requests** ! 🚀

