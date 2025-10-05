## Ideia do Template Method

- Define o **esqueleto de um algoritmo** em uma classe base, deixando que subclasses personalizem algumas etapas específicas.

- Muito usado quando temos **passos fixos**, mas alguns variam dependendo do tipo de implementação.

### Desafio: Processamento de Pedido de Compra

Você vai implementar um fluxo para processar pedidos em um sistema de e-commerce:

1. **Validar pedido** (ex.: verificar estoque, dados do cliente).

2. **Efetuar pagamento** (cada método terá sua regra: cartão, boleto, pix).

3. **Emitir nota fiscal**.

4. **Enviar confirmação ao cliente**.

O fluxo **não muda**, mas cada forma de pagamento vai variar no passo 2.

### Estrutura sugerida

```aidl
src/
 └── main/java/com/dev/alan/patterns/behavioral/template/
     ├── PedidoProcessor.java     # Classe abstrata (Template Method)
     ├── CartaoProcessor.java     # Subclasse
     ├── BoletoProcessor.java     # Subclasse
     ├── PixProcessor.java        # Subclasse
     └── Application.java
 └── test/java/com/dev/alan/patterns/behavioral/template/
     └── PedidoProcessorTest.java
```

### Desafio proposto:

1. Criar as classes do **Template Method** como acima.

2. Implementar no mínimo 3 processadores de pagamento.

3. Criar **teste unitário** validando se `efetuarPagamento()` é chamado.