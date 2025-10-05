# Design Patterns em Java (com Maven, JUnit e Mockito)

Este projeto contém implementações práticas dos **Design Patterns** (GoF) em **Java**, utilizando **Maven** para gerenciamento de dependências e **JUnit/Mockito** para testes automatizados.

O objetivo é servir como **material de estudo e referência rápida** para consulta futura.

---

## 📚 Padrões Criacionais

### 1. Factory Method
- **Resumo:** Define uma interface para criar objetos, mas permite que subclasses decidam qual classe instanciar.
- **Problema que resolve:** Evita a criação rígida de objetos (`new`) espalhada pelo código, delegando a responsabilidade da criação.

### 2. Abstract Factory
- **Resumo:** Fornece uma interface para criar **famílias de objetos relacionados** sem expor suas implementações concretas.
- **Problema que resolve:** Garante consistência quando múltiplos objetos precisam trabalhar juntos (ex: UI Windows vs. UI MacOS).

---

## 🏗️ Padrões Estruturais

### 3. Adapter
- **Resumo:** Permite que classes com interfaces incompatíveis trabalhem juntas.
- **Problema que resolve:** Integração de sistemas legados ou APIs externas sem alterar o código existente.

### 4. Bridge
- **Resumo:** Separa uma abstração da sua implementação, permitindo que variem independentemente.
- **Problema que resolve:** Evita explosão de subclasses quando abstração e implementação precisam variar em combinações.

### 5. Composite
- **Resumo:** Permite tratar objetos individuais e composições de forma uniforme (árvore de objetos).
- **Problema que resolve:** Facilita a manipulação de hierarquias (ex: diretórios/arquivos, menus).

### 6. Decorator
- **Resumo:** Adiciona responsabilidades dinamicamente a um objeto sem alterar sua classe.
- **Problema que resolve:** Evita herança rígida para extensão de funcionalidades.

### 7. Facade
- **Resumo:** Fornece uma interface simplificada para um subsistema complexo.
- **Problema que resolve:** Reduz a complexidade de integração de bibliotecas ou sistemas grandes.

### 8. Flyweight
- **Resumo:** Reutiliza objetos compartilhados para economizar memória.
- **Problema que resolve:** Reduz consumo de recursos quando existem muitos objetos semelhantes.

### 9. Proxy
- **Resumo:** Fornece um substituto ou marcador para controlar o acesso a um objeto real.
- **Problema que resolve:** Adiciona funcionalidades como cache, lazy loading ou segurança sem modificar o objeto real.

---

## 🤝 Padrões Comportamentais

### 10. Chain of Responsibility
- **Resumo:** Passa uma solicitação por uma cadeia de manipuladores até que alguém a trate.
- **Problema que resolve:** Desacopla remetente de receptor, permitindo que múltiplos handlers coexistam.

### 11. Command
- **Resumo:** Encapsula uma requisição como objeto, permitindo desfazer/refazer e filas de comandos.
- **Problema que resolve:** Desacopla quem emite uma ação de quem a executa.

### 12. Interpreter
- **Resumo:** Define uma gramática e um interpretador para avaliar sentenças nessa gramática.
- **Problema que resolve:** Facilita criação de interpretadores para DSLs ou regras simples.

### 13. Iterator
- **Resumo:** Fornece uma forma uniforme de percorrer elementos de uma coleção.
- **Problema que resolve:** Evita expor a estrutura interna de coleções.

### 14. Mediator
- **Resumo:** Centraliza a comunicação entre objetos, reduzindo acoplamento direto.
- **Problema que resolve:** Evita dependências complexas de muitos-para-muitos.

### 15. Memento
- **Resumo:** Captura e restaura o estado interno de um objeto sem violar o encapsulamento.
- **Problema que resolve:** Implementa histórico/undo em aplicações.

### 16. Observer
- **Resumo:** Define uma dependência 1-para-muitos; quando o estado muda, todos os observadores são notificados.
- **Problema que resolve:** Implementa sistemas de eventos/assinaturas.

### 17. State
- **Resumo:** Permite que um objeto altere seu comportamento quando seu estado interno muda.
- **Problema que resolve:** Evita condicionais complexas baseadas em estado.

### 18. Strategy
- **Resumo:** Define uma família de algoritmos, encapsula-os e os torna intercambiáveis.
- **Problema que resolve:** Facilita troca de algoritmos em tempo de execução.

### 19. Template Method
- **Resumo:** Define o esqueleto de um algoritmo, deixando etapas específicas para subclasses.
- **Problema que resolve:** Reutiliza lógica comum sem duplicação.

### 20. Visitor
- **Resumo:** Permite adicionar operações a objetos sem modificar suas classes.
- **Problema que resolve:** Facilita criação de operações em estruturas complexas (ex: árvores, documentos).

---

## 🚀 Como rodar

```bash
# Compilar
mvn clean install

# Executar uma classe (exemplo: Observer Application)
mvn exec:java -Dexec.mainClass="com.dev.alan.patterns.behavioral.observer.Application"

# Rodar testes
mvn test
```

## Observações

- Cada padrão possui:

  - Implementação Java

  - Teste unitário com **JUnit/Mockito**

  - Em alguns casos, diagramas **PlantUML**

- Objetivo: aprendizado prático e consulta rápida.
