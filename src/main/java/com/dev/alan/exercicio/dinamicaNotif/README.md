### Contexto

Você está desenvolvendo o sistema de **gestão de pedidos** de uma loja online.

Toda vez que um pedido é confirmado, o sistema precisa:

- Processar o pagamento, que pode variar (Pix, Cartão, Boleto, etc.);

- Notificar o cliente por diferentes canais (e-mail, SMS, ou push notification).

Hoje, o código tem várias duplicações e `if/else`:

- Para decidir como processar o pagamento;

- Para decidir como enviar a notificação.

O sistema precisa ser **aberto para extensão, mas fechado para modificação** — ou seja, adicionar um novo tipo de pagamento ou de notificação **não deve exigir mudar código existente**.

### Desafio

Você deve projetar um sistema aplicando dois **Design Patterns**:

1. Um para **definir dinamicamente o comportamento de pagamento**
👉 (ex: Strategy ou Factory Method)

2. Outro para **gerenciar o envio de múltiplas notificações** a diferentes canais
👉 (ex: Observer ou Decorator)