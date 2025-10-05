### Exemplo: Impostos sobre Produtos (E-commerce)

Imagina que você tem diferentes produtos (`Livro`, `Eletrônico`, `Comida`) e precisa calcular:

- Imposto normal (ICMS, ISS, etc.)

- Desconto promocional

- Exportação

Se não usarmos Visitor, teríamos que alterar as classes de `Livro`, `Eletrônico`, `Comida` toda vez que criássemos uma nova regra de negócio.
Com Visitor, apenas criamos um novo visitante.

Estrutura

- `Produto` (Element) → interface comum com `accept(Visitor)`.

- `Livro`, `Eletronico`, `Comida` → elementos concretos.

- `Visitor` → interface para visitantes (ex: cálculo de imposto, desconto, exportação).

- `ImpostoVisitor`, `DescontoVisitor` → implementações concretas.

### Exemplo
Esse exemplo fica bem mais prático: um e-commerce que precisa de várias regras de negócio sobre produtos.
Se amanhã precisar de um DescontoVisitor, você cria a classe sem mexer em Livro, Eletronico, Comida.
