# System-for-behandling-av-XML-meldinger
[![Build and run Maven tests](https://github.com/bachelor-kreftregisteret/System-for-behandling-av-XML-meldinger/actions/workflows/spring_test.yaml/badge.svg)](https://github.com/bachelor-kreftregisteret/System-for-behandling-av-XML-meldinger/actions/workflows/spring_test.yaml)

FRONTEND 
gå til http://localhost:8080/api/v1/meldinger for å se en eksempelmelding (av typen utredning) når serveren kjører.



For å starte react dev server:
1. Du trenger Node version >14

fra terminal:
2. cd inn til mappen der “package.json” ligger 
3. kjør 
  npm start

Hvis alt fungerer som det skal vil browseren åpne localhost:3000 og vise React startpage.


BACKEND

For å starte spring boot:
1. Du trenger Java JDK 17

2. Bygg prosjektet i Intellij ved å velge Build-> Build project

3a. Kjør appen ved å starte KreftregisteretAppApplication fra intellij

eller fra kommandolinje:

3b. cd inn til mappen der “pom.xml” ligger og kjør

  mvn spring-boot:run


Hvis alt fungerer skal man kunne besøke backendserveren på localhost:8080 for å se en “Whitelabel Error page”
og man kan besøke “http://localhost:8080/api/v1/hallo” for å se en demo-endpoint

