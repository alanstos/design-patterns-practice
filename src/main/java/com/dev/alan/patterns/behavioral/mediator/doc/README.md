## Ideia do Mediator

- O **Mediator Pattern** define um objeto que encapsula como um conjunto de objetos interagem.

- Em vez de os objetos se comunicarem diretamente (forte acoplamento), eles usam o **mediador**.

- Muito usado em *chats*, sistemas de controle de *tráfego aéreo*, *interfaces gráficas*.

### Exemplo prático: Chat Room

Um ChatRoom (Mediator) que gerencia a comunicação entre usuários.

- `User` → envia mensagens via `ChatRoom`.

- `ChatRoom` → repassa a mensagem para os outros usuários.