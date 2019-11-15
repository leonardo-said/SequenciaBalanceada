# SequenciaBalanceada
Projeto para verificar o número mínimo de operações (inversões) para se ter uma sequência balanceada.

A lista de strings devem conter apenas os caracteres "{" e "}".
O programa exibe, para cada sequência da lista inserida pelo usuário, o número mínimo de operações (inversões das chaves) necessário
para tornar a sequência balanceada.
Deve-se notar que, se a sequência contiver um número ímpar de elementos, será impossível balanceá-la, e o retorno da função será -1. 

Dada uma sequência de caracteres que somente contém abre chaves, "{",
fecha chaves, "}", o programa acha o número mínimo de operações (inversões de chaves)
necessárias para que essa sequência seja estável. A definição de sequência estável é a seguinte:
 1. A sequência vazia é estável;
 2. Se S é estável, então {S} também estável;
 3. Se S e T são estáveis, então a concatenação ST também é estável.
