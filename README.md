#ParaBank-Assesment
##Introduction
This is simple selenium project for ParaBank web application with page object model.

##Technologoes -
Maven
Selenium
Java
TestNG
Extent Report

##General Notes
base.java - intializing browser's driver and data properties(we already added in resource folder in git project)
pageObject (package) - we have create different classes for the multiple pages and then save the web elements on the pages in them.
testCases.pages-package- we are using objects or webelements in test cases
src/main/resources-drivers for browsers and data.properties file with all input data
pom.xml- main unit of maven framework-contains dependencies of all integrated tools
Extent reports will be generated after excution.

##IMPORTANT NOTE
1.Open NEw Account and 
2.Accounts Overview these 2 fucntionalities shows error -Error!An internal error has occurred and has been logged.

##Installation
A little intro about the installation.
$ git clone https://github.com/bharatshinde7/
$ import the maven project in eclipse/STS/IDE tool
$ testng.xml -> right click -> Run As -> TestNG test
