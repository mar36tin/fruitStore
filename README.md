Fruit store
===========

# Project Description
The fruit store service is a web checkout system for buying apples and oranges. The store also offers when buying multiple fruits.

## pre-requisites
    Java 8+
    Scala 2.11.7
    sbt 0.13.12

# Running the app

## Setup
1. clone the repository to your local disk: git clone https://github.com/mar36tin/fruitStore.git

2. change directory to the root of the project: cd to/the/root/of/the/project

## Compiling:
    sbt compile

### Run tests:

    sbt test

### Running:
    sbt run

By default this will run on port 9000. However, If you wish to run the app on a different port run e.g. 7700

    sbt "run 7700"


### Config
----------
application.conf