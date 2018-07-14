= Spring Data REST -  example

This example app shows how to use Spring Data with  h2 local database(使用h2 database ,领域驱动生成schema).

POM加入以下依赖：
        <dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-data-rest</artifactId>
		</dependency>
对象的Respository继承自JpaRepository.

即可暴露对象的增删查改方法，查询方法包括排序和分页。
http://localhost:8080/persons?page=0&size=3&sort=firstName,asc （排序的基础上分页）

仍有以下待改善：
1.批量修改
2.暴露id
3.事务
4.cache 


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

