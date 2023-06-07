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
  <summary>Criação e personalização dos endpoints back-end</summary>
  </br>
  ```JAVA
  
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
