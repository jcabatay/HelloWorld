# cat Dockerfile
#FROM mysql:8.0.33
FROM alpine:3.18.2

MAINTAINER ascii274@gmail.com
RUN chown -R mysql:root /var/lib/mysql/

# CODE BELOW FOR FILE .ENV

ARG MYSQL_DATABASE
ARG MYSQL_USER
ARG MYSQL_PASSWORD
ARG MYSQL_ROOT_PASSWORD
#
ENV MYSQL_DATABASE = $MYSQL_DATABASE
ENV MYSQL_USER = $MYSQL_USER
ENV MYSQL_PASSWORD = $MYSQL_PASSWORD
ENV MYSQL_ROOT_PASSWORD = $MYSQL_ROOT_PASSWORD

ADD customer_data.sql /etc/mysql/customer_data.sql

RUN sed -i 's/MYSQL_DATABASE/'$MYSQL_DATABASE'/g' /etc/mysql/customer_data.sql
RUN cp /etc/mysql/customer_data.sql /docker-entrypoint-initdb.d
EXPOSE 3306