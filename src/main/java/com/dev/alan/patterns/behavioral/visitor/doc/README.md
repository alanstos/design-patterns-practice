## Ideia do Visitor

- Permite adicionar **novas operações** a uma estrutura de objetos sem modificar as classes desses objetos.

- Usa **duplo despacho**: o objeto aceita o visitante (`accept`), que decide qual operação aplicar.

- Muito útil em **compiladores, análise de documentos, árvores de objetos complexos**.

### Exemplo prático: Documento (Elementos: Texto e Imagem)

- Temos elementos de um documento (`TextElement`, `ImageElement`).

- Queremos aplicar diferentes operações:

  - `RenderVisitor` (renderiza o documento).

  - `ExportVisitor` (exporta o documento em JSON).

Assim mostramos como o Visitor evita que tenhamos que modificar as classes dos elementos toda vez que surge uma nova operação.

### Exemplo
Esse exemplo mostra como **novas operações (Visitors)** podem ser adicionadas sem alterar `TextElement` ou `ImageElement`.