# Spring Boot + MongoDB exmple

## MongoDB Setup

1. Download Community server release of MongoDB from "https://www.mongodb.com/download-center/v2/community"

2. To run a single server database:

    $ sudo mkdir -p /data/db
    $ ./mongod
    $
    $ # The mongo javascript shell connects to localhost and test database by default:
    $ ./mongo
    > help

3. Run commnand present in [usercreationcommand.mongo](src/test/resource/usercreationcommand.mongo) to create root user

## Importing and running project

1. Import project as Maven project
2. Run application as Spring Boot Application