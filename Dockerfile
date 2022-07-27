FROM openjdk:11
EXPOSE 8080
ADD target/fashion-api.jar fashion-api.jar
ENTRYPOINT ["java", "-jar", "/fashion-api.jar"]


#RUN apk add --no-cache bash
#echo "# week-nine-ci-cd-project" >> README.md
#git init
#git add README.md
#git commit -m "first commit"
#git branch -M main
#git remote add origin https://github.com/SuleimanIbrahiminuwa/week-nine-ci-cd-project.git
#git push -u origin main