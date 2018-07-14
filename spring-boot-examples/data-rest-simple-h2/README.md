= Spring Data REST -  example

This example app shows how to use Spring Data with  h2 local database.


== Top level app

----
$ curl http://localhost:8080/persons
----
[source, javascript]
----
{ "_embedded" : {
    "persons" : [ {
      "firstName" : "Frodo",
      "lastName" : "Baggins",
      "_links" : {
        "self" : {
          "href" : "http://localhost:8080/persons/1"
        }
      }
    }, {
      "firstName" : "Bilbo",
      "lastName" : "Baggins",
      "_links" : {
        "self" : {
          "href" : "http://localhost:8080/persons/2"
        }
      }
    } ]
  }
}
----

You can easily create a new entry:

[source, bash]
----
$ curl -X POST -i -H "Content-Type:application/json" -d '{"firstName":"Greg", "lastName":"Turnquist"}' http://localhost:8080/persons

HTTP/1.1 201 Created
Server: Apache-Coyote/1.1
Location: http://localhost:8080/persons/3
Content-Length: 0
Date: Tue, 22 Jul 2014 22:26:17 GMT
----
[source, bash]
----
$ curl http://localhost:8080/persons/3
----
[source, javascript]
----
{ "firstName" : "Greg",
  "lastName" : "Turnquist",
  "_links" : {
    "self" : {
      "href" : "http://localhost:8080/persons/3"
    }
  }
}
----

Excellent!

