#### Esse exemplo é bem próximo da vida real:

- O caixa tem estados (`NoCard`, `HasCard`, `Authenticated`, `OutOfMoney`).

- Cada estado define **comportamentos diferentes** para as mesmas ações (`insertCard`, `withdrawCash`).

- O **ATMContext** mantém o estado atual e delega.