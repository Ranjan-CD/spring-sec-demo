"# spring-sec-demo" 
git init
git add README.md
git commit -m "first commit"
git branch -M main
git remote add origin https://github.com/Ranjan-CD/spring-sec-demo.git
git push -u origin main


select * from users;

ALTER TABLE users DROP COLUMN id;

ALTER TABLE users ADD COLUMN id INT GENERATED BY DEFAULT AS IDENTITY PRIMARY KEY;
________________________________________________________________________________
create spring security project
go to spring.io
choose project maven language java and spring boot version 3.2.2
fill project metadata
packaging jar
java 21/17

add dependencies
spring web
spring security
spring boot devtool

In spring 6 there are certain thing that change in spring security 

The JWTFilter class is used to handle servlet requests on the server side."

or even better:

"The JWTFilter class intercepts HTTP requests on the server side to validate JWT tokens before allowing access to protected resources.

JWT service class is responsible for generating token.
