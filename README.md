Liferay Spring Portlet MVC
==========================

Resumo do projeto 
================

Resumo: E um projeto de inicio rapido em java 7 utilizando JSP, JPA 2.0 e Spring 4.1. 
um projeto template pre configurado para iniciar o desenvolvimento. 

Requisitos do Sistema
=====================

Windows 10 (8u51 e versões posteriores)
Windows 8.x (Desktop)
Windows 7 SP1
Windows Vista SP2
Windows Server 2008 R2 SP1 (64 bits)
Windows Server 2012 e 2012 R2 (64 bits)
RAM: 4 GB
Espaço em disco: 2 GB
Processador: no mínimo, um processador Pentium 4 
Browsers: Internet Explorer 9 e versão mais recente, Firefox
+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

Prinipais tecnologia do Portlet
=====================
Liferay EE 6.2.
Java 1.7 JDK
Portlet 2.0
Spring Framework 4.1.5
Annotation-based controller configuration
maven 3.1.1
hibernate 4.2.1.Final
maiores informações acessar o arquivo xml POM.xml
++++++++++++++++++++++++++++++++++++++++++


Programas extras recomendados
============================== 

programa que auxilia o donwload de forma simples gitkraken
https://www.gitkraken.com/download/windows64
-----------------------------------------------------------
programa console muito simples e util (fazer download da versão full)
http://cmder.net/  
+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++



Deploy
======
1) para realizar o deploy da aplicação ir em debug configuration (simbolo de inseto e de cor verde) ou run configuration (simbolo verde play)

2) coloca as configurações em Goals : clean compile install 

ou rodar linha de comando 
mvn clean
mvn compile
mvn install

3) na pasta target pegar o arquivo "liferay-spring-mvc-portlet-1.6-RELEASE.war"
e coloar ele na pasta ...\KDI-6.2-EE\jboss-6.2-EE\deploy do seu jboss
++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++



licença 
=======
gratuita
Copyright 2018 

