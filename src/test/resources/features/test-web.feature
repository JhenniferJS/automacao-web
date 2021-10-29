# language: pt
Funcionalidade: teste website

  Cenário: adicionar produto no carrinho
    Dado que estou no site de compras
    Quando clicar em T-shirt
    E clicar no botão para adicionar ao carrinho
    Então um modal de confirmação deverá abrir


  Cenário: pesquisar produto
    Dado que estou no site de compras
    Quando buscar pelo produto "dress"
    Então deverá exibir uma lista de produtos

  Cenário: pesquisar produto invalido
    Dado que estou no site de compras
    Quando buscar pelo produto "teste"
    Então deverá exibir uma mensagem de erro

  Cenário: acessar pagina inicial
    Dado que tenha um browser aberto
    E entrar no site de compras
    Então deverá ser carregada a pagina inicial do site

  Cenário: acessar tela para entrar em contato
    Dado que estou no site de compras
    Quando clicar no botão contact us
    Então deverá abrir a tela para envio de mensagem

  # cenario que ira falhar no teste
  Cenário: fazer sign in
    Dado que estou no site de compras
    E cliquei no menu sign in
    Quando colocar usuario e senha
    E clicar no botão sign in
    Então deverá ser exibida a tela da minha conta



