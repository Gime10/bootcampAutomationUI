FROM gradle:7.6.0-jdk11
RUN echo 'TEST CRUD TICKTICK'
RUN mkdir /tmp/WebSelenium
COPY ./build.gradle /tmp/WebSelenium/build.gradle
COPY ./src /tmp/WebSelenium/src
COPY ./launch.sh /tmp/launch.sh
RUN chmod 777 /tmp/launch.sh
ENTRYPOINT ["/bin/sh","/tmp/launch.sh"]
