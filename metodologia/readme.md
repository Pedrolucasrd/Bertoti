<h1>Pedro Lucas dos Santos Rodrigues</h1>
<h2>Projeto 1: 2º Semestre de 2022</h2>
<h3>Parceiro Acadêmico</h3>
<img width="250" src="https://www.iacit.com.br/imgs/meta-image.jpg">

<h3>Descrição do Projeto</h3>
Foi criado um sistema avançado para o manejo eficiente de dados meteorológicos, com recursos de importação, pesquisa e geração de relatórios. Além disso, o sistema integra-se de forma automatizada ao banco de dados desenvolvido para ter a maior eficiencia no gerenciamento do mesmo, permitindo a obtenção e armazenamento dos dados disponibilizados por eles. A interface web do sistema oferece uma ampla gama de opções de filtragem, possibilitando a seleção precisa dos registros com base em datas, regiões, estados, localidades e tipos de dados específicos. A apresentação dos dados é realizada por meio de gráficos visualmente atrativos, e os usuários têm a opção de exportar um relatório personalizado com base na consulta efetuada. Esse sistema oferece uma solução completa para o acompanhamento e análise detalhada das condições meteorológicas, com facilidade de acesso e uso intuitivo.

<h3>Tecnologias Utilizadas</h3>

<h4>PostgreSQL</h4>
<img  width="250" src="https://www.luiztools.com.br/wp-content/uploads/2021/02/postgres.jpg">
O sistema utiliza o PostgreSQL como banco de dados principal para armazenar e gerenciar as informações. O PostgreSQL é uma escolha confiável para lidar com grandes volumes de dados meteorológicos. Ele oferece recursos avançados de consulta e recuperação eficiente dos dados. Além disso, o PostgreSQL possui medidas de segurança abrangentes, como controle de acesso e permissões, para proteger as informações armazenadas, que foi amplamente utilizados no projeto. Sua utilização garante a integridade e consistência dos dados, proporcionando um ambiente confiável para o sistema.
<h4>Java Spring</h4>
<img  width="250" src="https://4.bp.blogspot.com/-ou-a_Aa1t7A/W6IhNc3Q0gI/AAAAAAAAD6Y/pwh44arKiuM_NBqB1H7Pz4-7QhUxAgZkACLcBGAs/s1600/spring-boot-logo.png">
O back end do sistema foi desenvolvido usando o Java Spring. O Java Spring é um framework poderoso que nos permite criar a lógica e manipular os dados do banco de dados de forma centralizada. Ele facilita o processamento das solicitações, o acesso aos dados e a implementação das regras de negócio. Com o Java Spring, podemos importar os dados meteorológicos, realizar pesquisas e filtragens, gerar relatórios e disponibilizar os dados para a interface web. Além disso, ele facilita a integração com o PostgreSQL, garantindo um acesso eficiente aos dados armazenados. O uso do Java Spring torna o desenvolvimento do back end mais organizado e eficiente, permitindo uma manipulação otimizada dos dados.
  
  <h4>JavaScript</h4>

  <img  width="250" src="https://static.javatpoint.com/images/javascript/javascript_logo.png">
  
JavaScript é uma linguagem de programação amplamente utilizada no desenvolvimento web. Ela oferece interatividade e dinamismo às páginas, permitindo a manipulação de elementos HTML, estilos CSS e a interação com o usuário. Uma das vantagens do JavaScript é sua capacidade de ser executado em diferentes plataformas, independentemente do sistema operacional. Além disso, JavaScript evoluiu ao longo dos anos, com a criação de bibliotecas e frameworks que facilitam o desenvolvimento de aplicações web mais complexas. Um exemplo disso é o REST (Representational State Transfer), uma arquitetura para criação de APIs que utiliza os princípios da web e é compatível com JavaScript. Com o uso do REST, é possível construir aplicações web escaláveis, flexíveis e de fácil integração com outros sistemas.


  <h4>Chart.js</h4>
  <img  width="250" src="https://avatars.githubusercontent.com/u/10342521?s=280&v=4">

A biblioteca Chart.js é uma poderosa ferramenta em JavaScript para exibir dados em forma de gráficos em páginas da web. No nosso projeto, essa biblioteca desempenhou um papel fundamental na interface, permitindo que apresentássemos os dados meteorológicos selecionados e filtrados de maneira interativa para os usuários. Além disso, com o Chart.js, tivemos a flexibilidade de personalizar as propriedades de design dos gráficos, possibilitando a exibição personalizada de diferentes tipos de dados.

<h3>Contribuições Individuais</h3>

<details>
  <summary>Desenvolvimento e personalização dos endpoints no back-end.</summary>
  </br>
  Para que tudo isso sejá possivel, criamos um código que implementa uma API REST para manipulação de usuários em um sistema. A classe UsuarioController define os endpoints e os métodos que lidam com as requisições HTTP relacionadas aos usuários, como listar usuários, criar um novo usuário, editar um usuário existente e excluir um usuário.

Através desses endpoints, os clientes podem interagir com o sistema, enviando requisições para obter informações dos usuários, criar novos usuários, atualizar informações existentes e excluir usuários. O controlador utiliza a classe UsuarioService para executar a lógica de negócio relacionada aos usuários, como acessar o banco de dados, realizar validações e manipular os objetos de usuário.

Portanto, o objetivo principal do código é fornecer uma interface para a manipulação de usuários em um sistema, seguindo as práticas e convenções do padrão REST. Isso permite que os clientes interajam com o sistema de forma padronizada e eficiente, através de requisições HTTP bem definidas.

  ```java
      private UsuarioService usuarioService;
      public UsuarioController(UsuarioService usuarioService){
          this.usuarioService = usuarioService;

      }

      @GetMapping
      public ResponseEntity<List<Usuario>> listaUsuarios(){
      return ResponseEntity.status(200).body(usuarioService.listarUsuario());

      }

      @PostMapping
      public ResponseEntity<Usuario> criarUsuario(@RequestBody Usuario usuario){
          return ResponseEntity.status(201).body(usuarioService.criarUsuario(usuario));
      }

      @PutMapping()
      public ResponseEntity<Usuario> editarUsuario(@RequestBody Usuario usuario){
          return ResponseEntity.status(200).body(usuarioService.editarUsuario(usuario));
      }

      @DeleteMapping("/{id}")
      public ResponseEntity<?> excluirUsuario(@PathVariable Integer id){
          usuarioService.excluirUsuario(id);
          return ResponseEntity.status(204).build();
      }
  
  ```

</details>

<details>
  <summary>Consulta e manipulação de endpoints personalizados do backend.</summary>
  </br>
Os modelos de conexão para recuperar dados do backend:
Faz uma solicitação assíncrona para obter dados JSON do servidor.
Armazena os dados recebidos em variáveis.
Realiza iterações e manipulações nos dados para extrair informações específicas.
Atualiza o conteúdo de elementos HTML no documento com os dados processados.
Em resumo, o código está obtendo dados sobre temperaturas máximas de diferentes estações, realizando operações nos dados recebidos e exibindo os resultados no documento HTML.
  
 ```javascript

    $(document).ready(function(){
        $.getJSON("/temperatura_max",function(data){

                 var estacoes = []
                for(var i = 0; i<data.length;i++){
                if(estacoes.indexOf(data[i].estacao) == -1 || estacoes.length == 0)
                    estacoes.push(data[i].estacao)
                }
                    const inventory = data;
                    var tempMin = []
                    for(var i = 0;i<estacoes.length;i++){
                        function isCherries(fruit){
                             return fruit.estacao === estacoes[i];
                                   }
                        var usuario = inventory.find(isCherries);
                        tempMin.push(usuario)
                        }


                        $(document).ready(function(){
                                $.getJSON("/estacoes",function(data2){
                                console.log("SP dado 1: "+data2[0].nome_estacao)
                                for(var i = 0;i<5;i++){
                                    function nomeEstacao(nomear){

                                         return nomear.codigo == estacoes[i];
                                              }
                                         var esta = data2.find(nomeEstacao);
                                         const prec_data = new Date(tempMin[i].temp_data);
                                             prec_data.setDate(prec_data.getDate()+1);

                                         $("#tempMinEstacaoM"+i).prepend(esta.nome_estacao)
                                         $("#tempMinM"+i).prepend("Temperatura Mínima: "+tempMin[i].temp_min+"°C")
                                         $("#tempMaxM"+i).prepend("Temperatura Máxima: "+tempMin[i].temp_max+"°C")
                                         $("#tempMinOrvalhoMinM"+i).prepend("Ponto de Orvalho Mínimo: "+tempMin[i].temp_orvalho_min+"°C")
                                         $("#tempMinOrvalhoM"+i).prepend("Ponto de Orvalho: "+tempMin[i].temp_ponto_orvalho+"°C")
                                         $("#tempMinOrvalhoMaxM"+i).prepend("Ponto de Orvalho Máximo: "+tempMin[i].temp_orvalho_max+"°C")
                                         $("#tempDataM"+i).prepend("DATA: "+prec_data.toLocaleDateString("pt-BR"))

                                        const a = document.querySelector("#verDetalhesM"+i);
                                        a.href = "/charts=temperatura="+tempMin[i].estacao+"="+tempMin[i].temp_data+"="+tempMin[i].temp_data;
                                            }
                                    });
                                });
            });
        });

```

</details>
No projeto desenvolvido, foi implementada uma solução para armazenar dados climáticos em um banco de dados e apresentá-los por meio de gráficos interativos. Você criou o backend utilizando Java Spring Boot, responsável por gerenciar as comunicações com o banco de dados e fornecer os endpoints necessários para acessar os dados.

Além disso, você também realizou as comunicações no frontend, utilizando JavaScript para fazer requisições assíncronas para o backend e obter os dados climáticos. Por meio de filtros, os usuários têm a possibilidade de personalizar a visualização dos registros por datas, localidade e tipo de dado, permitindo uma análise mais precisa e específica.

No aspecto visual, você desenvolveu os gráficos que apresentam os dados climáticos de forma clara e compreensível. Utilizando HTML e CSS, você criou a interface necessária para exibir os gráficos e as informações relevantes relacionadas aos dados climáticos.

Em resumo, o projeto consiste em uma solução completa que engloba o desenvolvimento do backend, as comunicações no frontend e a criação dos gráficos para análise dos dados climáticos.

<h4>Aprendizados Efetivos</h4>
<details>
  <summary>Spring Framework</summary>
  <ul>
  <li>Arquitetura REST: Implementação da arquitetura REST (Representational State Transfer) para criação de APIs web.</li>
  <li>Integração com Banco de Dados: Integração da aplicação com banco de dados para armazenamento e recuperação de dados.</li>
  <li>Injeção de Dependências: Utilização do recurso de injeção de dependências do Spring para facilitar o gerenciamento de componentes e suas dependências.</li>
  <li>Desenvolvimento Orientado a Interfaces: Desenvolvimento de código seguindo o princípio de programação orientada a interfaces, que promove a modularidade e flexibilidade do sistema.</li>
  <li>Integração com Banco de Dados: Realização da integração da aplicação com banco de dados para armazenamento e recuperação de dados.</li>
  </ul>
</details>

<details>
  <summary>Banco de dados</summary>
  <ul>
  <li>Linguagem SQL: Familiarizei-me com a linguagem SQL (Structured Query Language) utilizada para manipulação e consulta de dados em bancos de dados relacionais. Aprendi a escrever consultas eficientes para recuperar e manipular informações.</li>
  <li>Bancos de Dados Relacionais: Entendi os fundamentos e características dos bancos de dados relacionais, como tabelas, chaves primárias, chaves estrangeiras, índices e normalização.</li>
  <li>Consultas com Condições: Entender como adicionar condições às consultas SQL para filtrar os resultados com base em critérios específicos.</li>
  <li>Backup e Restauração de Banco de Dados: Compreender a importância de fazer backups regulares de bancos de dados e como restaurar um backup em caso de falha.</li>
</details>

<details>
  <summary>JavaScript</summary>
  <ul>
  <li>Manipulação do DOM: Aprender a interagir com o Document Object Model (DOM) para manipular elementos HTML, como adicionar ou remover elementos, alterar conteúdo e estilos.</li>
  <li>Manipulação de Arrays: Compreender as operações básicas de manipulação de arrays, como adicionar elementos, remover elementos, percorrer e realizar transformações nos dados.</li>
  <li>AJAX e Requisições Assíncronas: Aprender a fazer requisições assíncronas usando a técnica AJAX (Asynchronous JavaScript and XML) para interagir com servidores e atualizar o conteúdo da página sem recarregá-la.</li>
  <li>Manipulação de Dados JSON: Aprender a trabalhar com dados JSON (JavaScript Object Notation), incluindo a serialização e desserialização de dados, e a interação com APIs que retornam dados nesse formato.</li>
  </ul>
</details>
