## State Pattern

- **Objetivo**: permitir que um objeto altere seu comportamento quando seu estado interno muda.

- Parece que o objeto **muda de classe** em tempo de execução.

- Evita condicionais enormes (`if/else` ou `switch`) para tratar estados.

### Desafio – State Pattern

Cenário:
Um **pedido de e-commerce** pode estar em diferentes estados:

- **Novo** → aguardando pagamento

- **Pago** → pronto para envio

- **Enviado** → em transporte

- **Entregue** → finalizado

Cada estado define como o pedido se comporta quando chamamos `next()` e `prev()`.

### O que temos

- ✅ Estados modelados como classes separadas
- ✅ `OrderContext` mantém o estado atual
- ✅ Transições de estado são controladas pelos próprios estados