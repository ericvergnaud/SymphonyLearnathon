# SymphonyLearnathon

Dependencies
- Heroku Account (For deploying)
- Heroku CLI (For deploying)
- Maven
- Java 8
- Git 

Generating PKCS12 Certificates from PEM
1. Copy the three PEM files into one PEM file and name it ```bot.userXX-combined.pem```
2. Use OpenSSL to convert ```openssl pkcs12 -export -out bot.userXX-combined.p12 -inkey bot.userXX-combined.pem -in bot.userXX-combined.pem -certfile bot.userXX-combined.pem``` 

Deploying
https://devcenter.heroku.com/articles/getting-started-with-java#introduction