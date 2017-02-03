# JVM Lambda Template

This project has hello world lambda functions for Scala, Groovy and Java and is all configured with gradle and integration test source sets

This project has a SAM yaml (application.yaml) and a gradle deploy task that will give you 3 runnable 'hello world' lambda functions 1 for each language (Scala, Groovy and Java) by simply running `./gradlew clean deploy -Pregion=[region to run lambda from] -Plambda-bucket=[bucket in region to save fatjar]`

You can easily clone this project and remove the languages you dont want, delete the .git folder and re-run git init, modify application.yaml and be on your way creating jvm based serverless application in AWS.


The deploy tasks relies on the AWS CLI being installed and available on the path and configured with credentials.

## License
released under the [Apache License, Version 2.0](http://www.apache.org/licenses/LICENSE-2.0)
