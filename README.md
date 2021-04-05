# aluguefoneAPI
Exercício de Spring REST API.

## Tarefa:
* Criar uma API REST que acesse pelo menos 2 entidades do banco de dados, essas entidades deve ter algum
relacionamento entre elas. Não precisa ter muitos registros uma dezena é o suficiente. (Ex: Cliente, Contato do
Cliente). -> criado aluguefone
* Implementar um método para inserir um registro da entidade principal -> realizar um __post__ na uri: _~/clientes_
* Implementar um método para listar todos os registros da entidade principal -> realizar um __get__ na uri: _~/clientes_
    * Criar pelo menos um filtro para pesquisa
    		-> fazer um __get__ na uri: _~/clientes/buscarPorNome/{nome}_ tambem faz buscas por partes do nome.
    * Criar pelo menos um critério de ordenação 
    * Opcional: Implementar a opção de selecionar os campos que deseja recuperar
* Implementar um método para listar um registro específico da entidade principal -> fazer um _get_ em _~/clientes/{clienteId}_		
* Implementar um método para consultar todos os registros da entidade secundária a partir de um id da entidade
principal -> ao listar todos os registros da entidade principal o metodo já traz todas as entidades secundarias relacionadas pela entidade principal. Neste caso o cliente e seus celulares alugados.
* Implementar um método para consultar um registro específico da entidade secundaria a partir de um id da
entidade principal -> realizar um _get_ na uri _~/clientes/buscarClientesNumSerie/{clienteId}_
* Documentar a API com o um framework de documentação -> foi utilizado o swagger acessar o endereço: _~/swagger-ui.html_
* Implemente o necessário para que sua API possa ser classificada no nível 3 no Modelo de Maturidade de
Richardson -> em andamento...
* Implemente pelo menos um teste unitário para um dos métodos solicitados -> 3 testes unitários implementados no ClienteController.java utilizado o JUNITY

## Respostas Questionario
Para evitar código boilerplate qual framework poderia ser adotado na sua solução? -> Foi adicionado ao projeto o Lombok para realizar a criação de construtores, metodos gets e setters, equals e hascode.
* Qual framework poderia ser utilizado para a validação dos dados, como por exemplo o tamanho dos campos, a
obrigatoriedade de preenchimento entre outras validações? -> Poderia ser utilizado o JPA BeansValidation com as anotações necessárias nas classes e metodos.
* Qual framework poderia ser utilizado para prover a segurança e o nível de acesso aos métodos implementados? -> Spring Security
* Qual outros frameworks foram utilizados para cumprir a tarefa? Justifique a sua utilização. -> Além dos requisitos do projeto também utilizei o lombok para simplificar o código e evitar repetição, também foi utilizado o flyway para gerenciar o conteúdo e scripts do banco de dados local, dessa forma ao subir a aplicação um novo banco será criado e alimentado. 
* As respostas do questionário devem ser incluídas no arquivo README do projeto no GitHub.
