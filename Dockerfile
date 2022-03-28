FROM meisterplan/jdk-base:11
#EXPOSE 8081

ADD /target/Charting_library-0.0.1.jar Charting_library-0.0.1.jar
ENTRYPOINT ["java", "-Djava.security.egd=file:dev/./urandom", "-jar", "Charting_library-0.0.1.jar"]