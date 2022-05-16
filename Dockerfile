FROM java:11
EXPOSE 9090
ADD target/SocialTextWeb.jar SocialTextWeb.jar
ENTRYPOINT ["java","-jar","/SocialTextWeb.jar"]