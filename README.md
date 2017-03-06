# JVM Lambda Template

This project has hello world lambda functions for Scala, Groovy and Java and is all configured with gradle and integration test source sets

This project has a SAM yaml (application.yaml) and is configured with the [gradle-aws-sam-deployer-plugin] that will give you 3 runnable 'hello world' lambda functions 1 for each language (Scala, Groovy and Java) by simply running `./gradlew clean shadowJar deploySam`

You can easily clone this project and remove the languages you don't want, delete the .git folder and re-run git init, modify [application.yaml](https://github.com/fieldju/jvm-lambda-template/blob/master/application.yaml), [profile/default.properties](https://github.com/fieldju/jvm-lambda-template/blob/master/profile/default.properties) and be on your way creating jvm based serverless application in AWS.

## License
released under the [Apache License, Version 2.0](http://www.apache.org/licenses/LICENSE-2.0)
