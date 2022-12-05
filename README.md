# My Example Spring Application that Runs in a Container

Build image :

`./mvnw package && docker build -t bilg/my-spring-application .`

Run image in container : 

`docker run -p 8080:8080 bilg/my-spring-application`

Spring boot version of building image

`./mvnw spring-boot:build-image -Dspring-boot.build-image.imageName=myorg/myapp`


#### TODO
- [ ] Set up **github** or **gitlab** repository
- [ ] Set up CI/CD (github workflows, Jenkins pipeline etc)
- 