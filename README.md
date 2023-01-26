# DESIGN PATTERNS

Solução comum para um problema recorrente ao utilizar o paradigma de orientação a objetos.

**Comportamentais**

- ***Strategy***
    - Como diminuir a complexidade do nosso código, trocando múltiplas condicionais por classes
- ***Chain Of Responsibility***
    - Diferenciar casos onde padrões semelhantes podem ser aplicados;
    - Como criar uma cadeia de possíveis algoritmos
    - A utilizar o padrão para aplicar um desconto dentro de uma cadeia de possíveis descontos.
- ***Template Method***
    - Reforçamos a ideia de que repetição de código é problemática;
    - Criamos um template de algoritmo que estava sendo replicado em mais de uma classe e utilizamos herança para reaproveitar esse código:
    - Vimos que é possível aplicar mais de um padrão no mesmo código.
- ***State***
    - Muito parecido com o pattern ***Strategy*** porém lida com estados e faz as validações de acordo com a regra de negócio
    - É possível que um objeto se comporte de formas diferentes, dependendo do seu estado;
    - Se o resultado de uma chamada de método depende do estado, podemos delegar esta ação para uma classe específica do estado atual:
- ***Command → Command Handlers***
    - A técnica de extração do caso de uso para uma classe específica pode ser chamada de padrão Command;
    - Um caso de uso em nossa aplicação pode ter várias ações (salvar no banco, enviar e-mail, etc);
    - Um caso de uso deve ser extraído para uma classe específica, ao invés de estar no arquivo da CLI, controller ou algo do tipo;
    - Tem como responsabilidade, normalmente, apenas orquestrar as tarefas a serem executadas, ou seja, chamar as classes necessárias que realizam as tarefas desejadas
- ***Observer***
    - É mais interessante separar cada ação em uma classe separada;
    - Liga um evento ocorrido com suas ações;
    - Dispara uma ação e quem estiver escutando essa ação vai ser executado.
