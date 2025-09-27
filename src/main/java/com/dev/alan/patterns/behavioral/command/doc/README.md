### O que acontece

- Cada ação é encapsulada em um comando.

- O Invoker (`RemoteControl`) não precisa saber detalhes do Receiver (`Light` ou `Fan`).

- É possível adicionar `undo`, `log` ou `fila` de execução facilmente.


### Explicação do diagrama

- `Command` é a interface comum para todos os comandos.

- `LightOnCommand`, `LightOffCommand`, `FanOnCommand`, `FanOffCommand` são os ConcreteCommands, que encapsulam as chamadas aos Receivers (`Light` e `Fan`).

- `RemoteControl` é o Invoker que chama `execute()` no comando.

- `Application` é o cliente, que configura comandos no invoker.