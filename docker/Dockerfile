#<!--FROM ubuntu:22.04
#ENV DEBIAN_FRONTEND=noninteractive
#RUN rm -f /etc/apt/apt.conf.d/docker-clean || true \
   # && apt-get update \
  #  && apt-get install -y --no-install-recommends apache2 \
 #   && rm -rf /var/lib/apt/lists/*
#COPY index.html /var/www/html/
#EXPOSE 80
#CMD ["apache2ctl", "-D", "FOREGROUND"]


FROM amazoncorretto:17
WORKDIR /app
COPY Hello.java /app/
RUN javac Hello.java
CMD ["java", "Hello"]

