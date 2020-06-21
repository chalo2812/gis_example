FROM openjdk:8u252-slim
RUN apt-get -y update
RUN apt-get -y install wget unzip net-tools
RUN mkdir -p /opt/apache-maven-3.6.3
RUN chown root:root /opt
RUN chmod 755 /opt
RUN wget https://downloads.apache.org/maven/maven-3/3.6.3/binaries/apache-maven-3.6.3-bin.zip
RUN unzip apache-maven-3.6.3-bin.zip
RUN mv ./apache-maven-3.6.3/ /opt/
COPY . /opt
WORKDIR /opt
RUN /opt/apache-maven-3.6.3/bin/mvn clean install
EXPOSE 8081/tcp
CMD ["/opt/apache-maven-3.6.3/bin/mvn", "spring-boot:run"]