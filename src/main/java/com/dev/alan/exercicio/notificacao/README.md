## Enunciado do Exercício – Sistema de Notificações Flexível
### Contexto

Uma empresa precisa de um sistema de notificações para avisar seus clientes sobre eventos importantes, como:

- confirmação de compra,

- atualização de entrega,

- promoções.

Atualmente, o sistema só envia e-mail. Porém, novos canais de notificação podem surgir (SMS, WhatsApp, Slack, etc.), e o código precisa estar preparado para se adaptar sem grandes modificações.

### Problema

Se cada vez que a empresa precisar adicionar um novo canal de comunicação (ex: WhatsApp), o código principal for alterado, isso gera alto acoplamento e baixa flexibilidade.
Você precisa resolver o problema usando um design pattern que aprendeu.

### Missão

Escolha um Design Pattern adequado entre os que estudamos (Decorator, Strategy, Observer, etc.).

#### Dica: O problema pode ser resolvido de diferentes formas.

- Se pensar em compor vários canais ao mesmo tempo, o Decorator é uma boa escolha.

- Se pensar em escolher um canal entre vários disponíveis, o Strategy pode se encaixar.

- Se quiser avisar múltiplos canais ao mesmo tempo, o Observer pode ser aplicado.