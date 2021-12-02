# Dockerfile

FROM openjdk:11
COPY src/main/java /var/jenkins_home/workspace/jenkins-sieve-of-eratosthenes
WORKDIR /var/jenkins_home/workspace/jenkins-sieve-of-eratosthenes
RUN javac SieveOfEratosthenes.java
CMD ["java", "SieveOfEratosthenes"]