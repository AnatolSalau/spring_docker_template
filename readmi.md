run jar from console

D:\JAVA\Projects\spring_docker_template\build\libs>java -jar spring_docker_templ
ate-0.0.1-SNAPSHOT.jar

build docker image
docker build -t boot .  

check images
docker images

run image with remote debug
D:\JAVA\Projects\spring_docker_template>docker run -d --rm -p 8086:8080 -p 8087:8087 --name boot boot 

