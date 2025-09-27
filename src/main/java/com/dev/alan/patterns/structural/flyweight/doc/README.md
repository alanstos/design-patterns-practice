### O que acontece:

- Mesmo criando 15 árvores, serão instanciados apenas 2 objetos TreeType (um para "Carvalho", outro para "Pinheiro").

- O ganho de memória é significativo quando temos milhares/milhões de objetos.


### Explicação do diagrama

- *Application (cliente)* planta árvores chamando a TreeFactory.

- *TreeFactory* garante o reuso de TreeTypeImpl.

- *Tree* é o contexto: mantém os dados extrínsecos (posição x, y).

-  *TreeType* é o flyweight (compartilhado).