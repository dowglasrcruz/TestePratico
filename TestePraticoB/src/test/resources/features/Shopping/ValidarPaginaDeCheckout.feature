#language:pt
@ValidarPaginaDeCheckout

Funcionalidade: Validar pagina de Checkout

  Esquema do Cenario: Cenario: VValidar pagina de Checkout
    Dado que eu Logo no o sistema pela URl
    Quando pesquiso o produto usando a lupa
    E seleciono o produto selecionado
    E escolho a cor do produto<cor>
    E altero a quantidade do produto<quantidade>
    E clico jo botão ADD to cart
    E acesso o carrinho
    E clico no botao checkout
    E valido a soma do preço dos produtos selecionados
    Então realizo um update da cor no banco de dados<cor>

    Exemplos:
    |cor|quantidade|
    |"BLACK"|"5"   |
   







