# laboratorio-mcsinos

Importante! Regras a serem seguidas
1) Todo e qualquer código deve ter seu teste equivalente (classe para testar o código)
Exemplo: Classe Conta tem que ter uma ContaTeste que realize os testes nela
2) Respeite as convenções de código
(https://www.oracle.com/technetwork/java/codeconventions-150003.pdf)
3) Estruture o projeto com pacotes, conforme exemplo
Nome do Projeto: Laboratorio2_Cinema
pacote1\
Classe1
Classe2
pacote2\
Classe3
Classe4
Importante:
• Atividade desenvolvida em duplas
• Atividade a ser entregue no ambiente EAD
• Formato de entrega: Arquivo ZIP dos códigos (sugestão de nome:
Lab5_NomeAluno1_NomeAluno2.zip)
• Implementar testes unitários automatizados com JUnit (ignore testes na UI)
Enunciado
Vamos implementar um KDS (Kitchen Display System) para o McSinos 😋🍔
Considere a existência de um menu de produtos (sanduíches e bebidas). Você pode usar sua criatividade
para definir o cardápio.
O sistema deve ter as seguintes opções:
• mostrar a fila de pedidos (o pedido mais antigo deve ser o primeiro a ser entregue);
• solicitar o pedido (envolve a escolha de mais de um produto);
• entregar o pedido (remove o pedido mais antigo da fila)
• sair do app.
