FROM openjdk:11
ADD out/artifacts/FashionBlog_API_jar/FashionBlog_API.jar FashionBlog_API.jar
EXPOSE 8085
ENTRYPOINT ["java", "-jar", "/out/artifacts/FashionBlog_API_jar/FashionBlog_API.jar"]
#CMD ["-start"]
CMD ls -lah /deployments && whoami