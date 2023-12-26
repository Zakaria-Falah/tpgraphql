@echo off

echo Initialisation du dépôt Git...
git init

echo Ajout des fichiers au dépôt...
git add .

echo Commit initial...
git commit -m "Premier commit"

REM Remplacez ces valeurs par vos informations GitHub
set USERNAME=Zakaria-Falah
set REPO=tpgraphql

echo Ajout du repository distant...
git remote add origin https://github.com/Zakaria-Falah/tpgraphql

echo Push vers GitHub...
git push -u origin master

echo Terminé. Votre projet a été initialisé et poussé vers GitHub.
pause
