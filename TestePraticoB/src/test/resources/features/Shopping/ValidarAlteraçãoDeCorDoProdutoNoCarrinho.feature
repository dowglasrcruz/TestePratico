#language:pt
@ValidarCorDoProdutoNoCarrinho

Funcionalidade: Validar cor do produto no carrinho

  Cenario: Validar especificações do produto
    Dado que eu Logo no o sistema pela URl
    Quando acesso a opção Special Offer
    E clico no botão See Offer
    E altero a cor do produto
    E clico jo botão ADD to cart
    Então valido a cor selecionada no carrinho
   







