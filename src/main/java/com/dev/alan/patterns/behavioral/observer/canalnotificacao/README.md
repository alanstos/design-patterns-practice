## O que é o Observer?

- É um padrão de comportamento que **define uma dependência um-para-muitos**.

- Quando o **Subject** (observado) muda de estado, **todos os Observers** (observadores) são notificados automaticamente.

- Muito usado em eventos de GUI, sistemas de notificação, mensagens entre microservices.

### Exemplo: Sistema de Notificações

Imagina um sistema onde:

- O **Subject** é um `CanalNoticias`.

- Os **Observers** são `Usuario` que querem receber atualizações.