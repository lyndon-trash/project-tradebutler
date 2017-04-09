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

## Source Control
- use the following format when writing a commit message
```
<type>-<issue>: <short description>

#valid types:
DEVOPS
BUG
ENHANCEMENT
FEATURE
```
- sample commit message
```
DEVOPS-2: Added a proper git commit

More detailed explanatory text, if necessary. Wrap it to about 72
characters or so. In some contexts, the first line is treated as the
subject of the commit and the rest of the text as the body. The
blank line separating the summary from the body is critical (unless
you omit the body entirely); various tools like `log`, `shortlog`
and `rebase` can get confused if you run the two together.

Explain the problem that this commit is solving. Focus on why you
are making this change as opposed to how (the code explains that).
Are there side effects or other unintuitive consequences of this
change? Here's the place to explain them.

Further paragraphs come after blank lines.

 - Bullet points are okay, too

 - Typically a hyphen or asterisk is used for the bullet, preceded
   by a single space, with blank lines in between, but conventions
   vary here

If you use an issue tracker, put references to them at the bottom,
like this:

Resolves: #2
See also: #7, #3, #6
```

###### Resources
- [Spring REST Docs](http://docs.spring.io/spring-restdocs/docs/current/reference/html5/#getting-started)
- [DZone: Get Your Java Package Structures right](https://dzone.com/articles/package-structure)
- [How to Write a Commit Message](https://chris.beams.io/posts/git-commit/)
