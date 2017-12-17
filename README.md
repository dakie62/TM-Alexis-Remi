# Projet de Test et Maintenance d'Alexis Ebrard et Remi Coutant

Ce projet a été réalisé sur le site https://www.airbnb.fr/
et nous permet de tester différents scénarios tel que:

-La connexion avec des identifiants valides.
-Une recherche dans le menu d'aide.
-Une vérification sur le fait que le premier restaurant trouvé contient un prix.
-Le changement de langue du site.
-La recherche des coordonnées de l'entreprise.


Les features sont disponibles dans le dossier :
src/test/resources/features

Mise en place du projet:

Etape1:
Importez un projet maven existant dans votre workspace.

Etape2:
Ce projet a été mis en place sous une version JDK récente (JDK 9.0.1 sous windows 64 bit).
Assurez-vous de changer votre JRE en JDK (nous vous avons épargné l'ajout 
de ce JDK de plus de 384 000 ko)
Sur le dossier contenant le projet, cliquez droit, properties, Java Build Path,
dans l'onglet libraries selectionnez votre JRE et editez-le grâce au bouton "edit", selectionnez ensuite
"alternate JRE" et référencez votre JDK.
Faites à nouveau un click droit sur le projet, properties, Java Compiler et verifiez que
celui-ci est supérieur à 1.5 .

Etape3:
Sur le dossier contenant le projet, click droit, run as et effectuez un maven clean et un maven install.
(Eventuellement un maven update afin que la mise en place du JDK soit prise en compte et que le compilateur 
ne fournisse pas d'erreur.
cliquez droit, Maven, updateProject, OK).

Etape4: 
Afin de lancer les tests il est nécessaire d'ajouter en arguments le driver chrome.
Ce driver a été ajouté au projet.
Afin de lancer un test précis allez dans 
src/test/java/fr.ab.testing/
Cliquez droit sur une classe de test, run as, run configurations,
nouveau Junit, dans l'onglet "Arguments" (Vm arguments)
Rajoutez les deux lignes ci-dessous:

-Dwebdriver.driver=chrome
-Dwebdriver.chrome.driver=${workspace_loc:alexis-remi}\chromedriver.exe

Assurez-vous que "working directory:default" soit coché.

Si vous souhaitez lancer tous les test d'un seul coup,
click droit sur une classe de test, run as, run configuration,
cochez "run all test in the selected project".
N'oubliez pas de rajouter les deux lignes ci-dessus dans VM arguments.

Etape5:

Enfin pour générer un rapport serenity sur les tests exécutés se trouvant dans 
"target/site/serenity/summary.txt"

Cliquez droit sur le dossier contenant le projet, maven, maven build, 
dans l'input "goals" ajoutez la commande : 
serenity:aggregate et "Run".
Le rapport doit avoir été généré.









