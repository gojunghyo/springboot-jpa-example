# springboot-jpa-example

 ```
1. git clone https://github.com/gojunghyo/springboot-jpa-example.git
2. settings your docker
3. run application

```

# settings docker
```
1. docker pull mysql
2. docker run -d -p 3306:3306 --name mysql-container -e MYSQL_ROOT_PASSWORD=${your_password} -e mysql:latest
3. docker exec -it my-mysql-container mysql -u root -p // 접속 및 확인방법

-p 3306:3306: 호스트의 포트 3306을 컨테이너의 포트 3306에 매핑합니다.
--name mysql-container: 컨테이너의 이름을 'mysql-container'로 설정합니다. 원하는 다른 이름을 사용할 수 있습니다.
-e MYSQL_ROOT_PASSWORD=root: MySQL 루트 사용자의 비밀번호를 'root'로 설정합니다. 원하는 다른 비밀번호를 사용할 수 있습니다.
-e MYSQL_DATABASE=db_example: 데이터베이스를 'db_example'로 설정합니다. 이 부분은 원하는 데이터베이스 이름으로 변경할 수 있습니다.
mysql:latest: 사용할 MySQL 이미지를 지정합니다.
```

# create database
```
1. CREATE DATABASE db_example;

```
