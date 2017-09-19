# software-engineering-track

## Basis Java & programming

* Online tutorial: http://www.learnjavaonline.org/en/Welcome
 * Alternatief: CodeCademy: https://www.codecademy.com/learn/learn-java
* Java language specification: http://docs.oracle.com/javase/specs/jls/se8/html/index.html
* Java Community Process: https://jcp.org/en/home/index
* Coding standards: http://www.oracle.com/technetwork/java/codeconventions-150003.pdf
* In de uitwerking de Java Date API gebruiken: LocalDate, LocalDateTime en Duration.
* Exception handling: https://docs.oracle.com/javase/tutorial/essential/exceptions/

## Agile & Scrum

Kernwaardes Agile:

* http://agilemanifesto.org/

Scrum: een agile framework

* Korte introductie: https://www.scrumalliance.org/why-scrum
* Scrum rollen: https://www.scrumalliance.org/why-scrum/core-scrum-values-roles
* Scrum guide: https://www.scrumalliance.org/why-scrum/scrum-guide
* Definition of Done: https://agilescrumgroup.nl/wat-is-definition-of-done/
* Daily stand-up: http://scrumguide.nl/daily-standup-meeting/

### User stories

Wat zijn user stories

* https://www.mountaingoatsoftware.com/agile/user-stories
* http://scrumguide.nl/user-story/

De user stories voor week 1 staan in de map: docs/week1/user-stories.

## Collaboration tools

- Planning/tasks: Trello, Jira, etc.
- Communication: Slack, HipChat, Skype
- Code sharing: Git (distributed), Subversion (centralized)

## Trello

Maak een trello Scrum board aan voor je team

Meer details:

* https://mattbrictson.com/trello-board-organization
* https://mattbrictson.com/trello-themes-and-checklists
* https://mattbrictson.com/trello-labels-and-estimates

Voorbeeld trello board voor een schilder project:

* https://trello.com/b/PTWUO4A4/schilderen-huis

## Git

* Tutorial: https://try.github.io/levels/1/challenges/1
* Tools:
  * Local: git client (git-scm.org), IntelliJ
  * Shared: github.com, bitbucket.org, gitlab, Stash

## Build tools

* Maven: https://maven.apache.org/guides/introduction/introduction-to-the-standard-directory-layout.html

Sample pom.xml

```xml
<project xmlns="http://maven.apache.org/POM/4.0.0">

    <modelVersion>4.0.0</modelVersion>
    <groupId>com.capgemini.se</groupId>
    <artifactId>boat-trip-app</artifactId>
    <version>0.1-SNAPSHOT</version>

    <dependencies>
        <dependency>
            <groupId>junit</groupId>
            <artifactId>junit</artifactId>
            <version>4.12</version>
        </dependency>
    </dependencies>

    <build>
        <plugins>
            <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-compiler-plugin</artifactId>
                <configuration>
                    <source>1.8</source>
                    <target>1.8</target>
                </configuration>
            </plugin>
        </plugins>
    </build>
</project>
```

## Unit testing

* JUnit: 4.x

## Object Oriented Modeling and Design

### Designing a class model
* [SE Track presentation: Class model basics](https://docs.google.com/presentation/d/1im8rDymEy4yp1dQqzIjfubXlk5z3nlBDQjOYLAFYtwc/edit?usp=sharing)

### UML
* [UML Diagram Types](http://creately.com/blog/diagrams/uml-diagram-types-examples/)
* [UML Quick reference/Cheat Sheet](https://holub.com/uml/)

### Intellij Support
* [Generating (reverse engineering) Diagrams from Source](https://www.jetbrains.com/help/idea/viewing-class-hierarchy-as-a-class-diagram.html)

## Spring Boot

* [Spring Boot - Josh Long introduction video](https://www.youtube.com/watch?v=sbPSjI4tt10)
* (Spring Boot project bootstrap site)[http://start.spring.io/]
* [Spring Boot tutorial site](https://spring.io/guides/gs/actuator-service)
