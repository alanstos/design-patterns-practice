## Observer Pattern

- **Objetivo**: permitir que um objeto (Subject) notifique automaticamente outros objetos (Observers) quando seu estado muda.

- **Quando usar**: sistemas de eventos, UI, notificações, monitoramento, etc.

### Explicação do diagrama

- `Observer` é a **interface comum** para todos os observadores.

- `TemperatureSensor` é o **Subject concreto** que mantém a lista de observers e notifica alterações.

- `Display`, `Logger` e `Alarm` são os **Observers concretos** que reagem à mudança de estado.

- `Application` monta a relação Subject → Observers e simula mudanças de temperatura.