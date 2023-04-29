# Jujutsu-Kaisen

Jujutsu Kaisen is a simple RESTful API that allows you to perform CRUD (Create, Read, Update, Delete) operations on a database. This API is built using Java and the Spring Boot framework.

<h3>Getting Started</h3>

<h4>Prerequisites</h4>

`-`Java 8 or later<br>
`-`Maven<br>
`-`MySQL

<h4>
Installing</h4>

1.Clone the repository:
```git clone https://github.com/vstanojevic0/jujutsukaisen.git```

2.Create a MySQL database and update the application.properties file with your database details:
```
spring.datasource.url=jdbc:mysql://localhost:3306/{your_database_name}
spring.datasource.username={your_database_username}
spring.datasource.password={your_database_password}
```

3.Build the project using Maven:<br>
``mvn clean install``

4.Run the project:<br>
``mvn spring-boot:run``

The API will now be available at <b>http://localhost:8080</b>.

<h3>API Endpoints</h3>
The following endpoints are available:

<b>Get all episodes<b><br>
``GET /episodes``

Example response body:
<br>
```
{
    "name": "Ryomen Sukuna ",
    "description": "Yuji Itadori, a normal high school student with incredible athleticism would rather hang out with his senpai in the Occult Club than run on the track. However, after losing his grandfather, Yuji's club comes face to face with the grim reality of curses. In order to save his friends, Yuji teams up with jujutsu student, Megumi Fushiguro, to exorcise the curses and recover the cursed object: Ryomen Sukuna.",
    "characterName": [
      "Yuji Itadori",
      "Satoru Gojo",
      "Nobara Kugisaki",
      "Megumi Fushiguro",
      "Setsuko Sasaki",
      "Takeshi Iguchi",
      "Takagi",
      "Sukuna"
    ]
  }
```

<b>Get episode by id<b><br>
``GET /episodes{id}``

Example response body:
<br>
```
{
  "name": "Ryomen Sukuna ",
  "description": "Yuji Itadori, a normal high school student with incredible athleticism would rather hang out with his senpai in the Occult Club than run on the track. However, after losing his grandfather, Yuji's club comes face to face with the grim reality of curses. In order to save his friends, Yuji teams up with jujutsu student, Megumi Fushiguro, to exorcise the curses and recover the cursed object: Ryomen Sukuna.",
  "characterName": [
    "Yuji Itadori",
    "Satoru Gojo",
    "Nobara Kugisaki",
    "Megumi Fushiguro",
    "Setsuko Sasaki",
    "Takeshi Iguchi",
    "Takagi",
    "Sukuna"
  ]
}
```
<b>Create new episode</b><br>
``POST /newepisode``

Example request body:
```
{
  "id": 0,
  "name": "string",
  "description": "string"
}
```
<b>Delete episode</b><br>
``DELETE /deleteEpisode/{id}``

<h3>Builth With</h3>

`-`Java<br>
`-`Maven<br>
`-`MySQL<br>
`-`Spring Boot


