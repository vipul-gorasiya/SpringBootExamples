# Spring Boot + MongoDB exmple

## MongoDB Setup

1. Download Community server release of MongoDB from "https://www.mongodb.com/download-center/v2/community"

2. To run a single server database:

    > mkdir -p /data/db
    > ./mongod
    >
   The mongo javascript shell connects to localhost and test database by default:
    > ./mongo
    >> help
	
	For Windows, 
	1. copy mongod.cfg from [mongod.cfg](src/test/resource/mongod.cfg)
	2. run mongod.exe in one terminal
	3. run mongo.exe in separate window

3. Run commnand present in [usercreationcommand.mongo](src/test/resource/usercreationcommand.mongo) to create root user

## Importing and running project

1. Import project as Maven project
2. Run application as Spring Boot Application
3. Access 'http://localhost:8102/customer/count' to see customer count
4. Access 'http://localhost:8102/customer/createrandom' to add new customer with random name