# try-spring-boot-pac4j-oauth

Based on merging code from:

* <https://github.com/pconrad-webapps/spring-boot-freemarker-zetcode>
   * Originally based on: <http://zetcode.com/articles/springbootfreemarker/>

with code from:
* <https://github.com/pac4j/spring-webmvc-pac4j>


# Step-by-step

## Adding required dependencies

Step 1 from [spring-webmvc-pac4j README](https://github.com/pac4j/spring-webmvc-pac4j/blob/master/README.md) says to add dependencies according to [this wiki article](https://github.com/pac4j/spring-webmvc-pac4j/wiki/Dependencies).

I had to look those up at <https://search.maven.org/>.  Here's what I found, and
added to the `pom.xml`:

From Maven Central, the dependency was:

```
<dependency>
  <groupId>org.pac4j</groupId>
  <artifactId>spring-webmvc-pac4j</artifactId>
  <version>3.1.0</version>
</dependency>
```

But, the README suggested instead:
* groupId: org.pac4j
* version: 4.0.0-SNAPSHOT

From the [Development section of the spring-webmvc-pac4j README](https://github.com/pac4j/spring-webmvc-pac4j/blob/master/README.md#development) I learned that:

The version 4.0.0-SNAPSHOT is under development.

Maven artifacts are built via Travis: [![Build Status](https://travis-ci.org/pac4j/spring-webmvc-pac4j.png?branch=master)](https://travis-ci.org/pac4j/spring-webmvc-pac4j) and available in the [Sonatype snapshots repository](https://oss.sonatype.org/content/repositories/snapshots/org/pac4j). This repository must be added in the Maven `pom.xml` file for example:

```xml
<repositories>
  <repository>
    <id>sonatype-nexus-snapshots</id>
    <name>Sonatype Nexus Snapshots</name>
    <url>https://oss.sonatype.org/content/repositories/snapshots</url>
    <releases>
      <enabled>false</enabled>
    </releases>
    <snapshots>
      <enabled>true</enabled>
    </snapshots>
  </repository>
</repositories>
```

So, I added that, and then I also added

```xml
<dependency>
  <groupId>org.pac4j</groupId>
  <artifactId>spring-webmvc-pac4j</artifactId>
  <version>4.0.0-SNAPSHOT</version>
</dependency>
```

And then also:

```xml
<dependency>
  <groupId>org.pac4j</groupId>
  <artifactId>pac4j-oauth</artifactId>
  <version>4.0.0-SNAPSHOT</version>
</dependency>
```

On this second one, not sure whether I should be using version 3.3.0 or 4.0.0-SNAPSHOT.  We'll find out, I guess.
