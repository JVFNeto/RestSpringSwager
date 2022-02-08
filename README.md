# RestSpringSwager

Implementei os metodos HTTP em 12 passos.

Passo 1: criei a classe Produto @Entity (Models).

Passo 2.0: Criei a database no Mysql.

Passo 2.1: nas propriedades, fiz a conexão com meu banco de dados.

Passo 3: Criei uma interface que extends o JpaRepository (Repository).

Passo 4: Criei uma classe Classeresouces (resources). Essa classe que receberá as requisições HTTP da API REST.

Passo 4.1: Implementei o metodo Get.

Passo 5:Testar no Postman se o Get ta subindo.

Passo 6:Criei metodo para seleção Get de um unico produto (não sendo find all).

Passo 6.1: Testei o metodo unico no Postman.

Passo 7: Implementar o metodo Post.

Passo 8: Testei no Postman, colocando no Headers >>> Content-Type >>> application/jason.

Passo 9 Implementei o metodo Delete.

Passo 10: testei o metodo Delete no Postman.

Passo 11: Implementei o metodo Put.

Passo 12: Testei o metodo Put no Postman.



Passo 1: Inseri as 2 dependencias do Swager no pom.xml

<!-- https://mvnrepository.com/artifact/io.springfox/springfox-boot-starter -->

		<dependency>
			<groupId>io.springfox</groupId>
			<artifactId>springfox-boot-starter</artifactId>
			<version>3.0.0</version>
		</dependency>


Passo 2: Implementei a Configuration do Swagger (Config)
Passo 3: Implementei a classe do swagger
Passo 4: Implementei os comentarios do swagger no ProdutoResources 
