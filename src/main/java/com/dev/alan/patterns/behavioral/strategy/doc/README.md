## 📌 Strategy Pattern

- **Objetivo**: definir uma família de algoritmos, encapsulá-los e torná-los intercambiáveis.

- O cliente pode **escolher dinamicamente** qual estratégia usar.

- Evita muitos `if/else` espalhados pelo código.

### Desafio – Strategy Pattern

Cenário:
Um sistema de **processamento de pagamentos**.

- Pode pagar via Cartão de Crédito, PayPal ou PIX.

- O cliente (`ShoppingCart`) não precisa saber como cada forma de pagamento funciona.

- Apenas chama o método `pay()` da estratégia selecionada.

### Estrutura de pasta

```aidl
src/main/java/com/dev/alan/patterns/behavioral/strategy/
    ├── PaymentStrategy.java
    ├── CreditCardPayment.java
    ├── PayPalPayment.java
    ├── PixPayment.java
    ├── ShoppingCart.java
    └── Application.java

```

### O que temos

- ✅ Estratégias intercambiáveis (`CreditCardPayment`, `PayPalPayment`, `PixPayment`)
- ✅ `ShoppingCart` desacoplado da forma de pagamento