# PlayerInformation

# Description
Hit the url from Postman with the Id of the player 

# API

1. (http://127.0.0.1:8890/api/v1/getInfo/{playerId}) 
eg. (http://127.0.0.1:8890/api/v1/getInfo/1)

Requirement- Java 1.8, Mysql version-5.7

Usage- It will provide you the Player Information in the following format.

Positive Scenario:

```
{
    "total": 180,
    "Matches": [
        {
            "score": 100,
            "series name": "Asia Cup",
            "location": "India",
            "id": 3
        },
        {
            "score": 80,
            "series name": "Odi Series",
            "location": "England",
            "id": 4
        }
    ],
    "cricketTeam": "india",
    "name": "Sachin",
    "id": 1
}
```


Negative Scenario:

```
{
    "message": "Id is not present"
}
```


I have attached the images for Positive Scenario and Negative Scenario.
