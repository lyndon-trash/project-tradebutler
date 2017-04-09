# Developer Notes
Before starting with development, skim through the contents below

## Package Structure
- consistent
- reflects the architecture

## Testing
### Unit Testing
<Insert description and instructions here>

[JUnit5](http://junit.org/junit5/docs/current/user-guide/) + [Spring Test](http://docs.spring.io/spring/docs/current/spring-framework-reference/html/unit-testing.html)

### Spring REST Docs
"The aim of Spring REST Docs is to help you to produce documentation for your RESTful services 
that is accurate and readable" - [Spring REST Docs](http://docs.spring.io/spring-restdocs/docs/current/reference/html5/#getting-started)
```adoc
[[resources-corporations]]
== Corporation
Company whose shares are traded on an official stock exchange. It must adhere to the listing requirements of that exchange,
which may include how many shares are listed and a minimum earnings level.

[[resources-corporations-list]]
=== List Corporations
List all the corporations

[[resources-corporations-list-request-structure]]
==== Request Structure
include::{snippets}/corporations-list/http-request.adoc[]

[[resources-corporations-list-request-example]]
==== Example Request
include::{snippets}/corporations-list/curl-request.adoc[]

[[resources-corporations-list-response-example]]
==== Example Response
include::{snippets}/corporations-list/http-response.adoc[]
```

## Technical Debts
<Insert notes on dealing with technical debts here>

###### Resources
- [Spring REST Docs](http://docs.spring.io/spring-restdocs/docs/current/reference/html5/#getting-started)
- [DZone: Get Your Java Package Structures right](https://dzone.com/articles/package-structure)
