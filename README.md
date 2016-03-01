# Programa 3

A barebones Java app, which can easily be deployed to Heroku.

This application support the [Getting Started with Java on Heroku](https://devcenter.heroku.com/articles/getting-started-with-java) article - check it out.

[![Deploy to Heroku](https://www.herokucdn.com/deploy/button.png)](https://heroku.com/deploy)

## Correr Local

Tener istalado [Heroku Toolbelt](https://toolbelt.heroku.com/).

```sh
$ git clone https://github.com/leonfloch/RegresionLineal.git
$ cd RegresionLineal
$ mvn install
$ heroku local web
```

Para correr la aplicación: [localhost:5000](http://localhost:5000/).

## Correr en Heroku

[correr](programa3-49766.herokuapp.com)



## Clonar desde Heroku

```sh
$ heroku git:clone -a programa3-49766
$ cd programa3-49766
```

## Deploying to Heroku

```sh
$ heroku create
$ git push heroku master
$ heroku open
```

## Documentación

- [Java on Heroku](https://devcenter.heroku.com/categories/java)
