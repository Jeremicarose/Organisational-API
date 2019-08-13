# Organisation-API

## Author
  Jeremic Arose.

#### Application.
   This application is an api for an organisation.



## Description
 *  Users are able to create the following objects:-
    Departments

  * News:

  * General News (Information affecting the whole company)

  *  Department news (Objects within Object)

  Users:

  One to many relationships between department and users.

  User can see individual users, their details, i.e position in the company, their roles, which department(s) they are associated with etc
  User can see specific information such as the Departments name, description, number of employees in the department. As a user, I want to see all users from a specific Department, the news relating to that department or a link to a page with said news (for tidiness).
  User is able to Post some news relating to a department.


## Setup and Installation requirements
* Go to the projects [repository]
* Clone the project
```
git clone
```
* Install gradle
```
sdk install gradle 5.3.1
```
* Install java
```
sdk install java
```
* Open the directory in terminal
* move to main
```
cd build/classes/java/main
```
* Run the following command to execute the Terminal-java application
```
java App
```
* In PSQL:
  * CREATE DATABASE org_api_test;
  * CREATE TABLE IF NOT EXISTS news(id SERIAL PRIMARY KEY, news VARCHAR, departmentId int);
  * CREATE TABLE IF NOT EXISTS departments(id SERIAL PRIMARY KEY,departmentid int,departmentname VARCHAR


## Technologies used
   * Java.
   * Gradle(for unit testing).
   * Bootstrap.
   * Spark.
   * Material Design Bootstrap.



## Technologies
  * Junit
  * Java
  * Spark

## Contact details
   For more information reach out to arosejeremic5@gmail.com

## Licence
   MIT License

   Copyright (c) [2019] [Jeremic Arose]

   Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:

   The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.

   THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE. Copyright ©2019

