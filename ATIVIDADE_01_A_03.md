# 1) O que é e para que serve o throw no Java?

O throw é o que entrega a instância de exceção criado pelo programa para uma Máquina Virtual Java que é executada por um aplicativo java manualmente. Ele serve para entregar uma exceção, onde interrompe sequências de execuções, mandando a exceção enviado para o método que foi chamado.
Aí se em algum ponto o monte de execução essa exceção for chamada, a execução continua a partir deste ponto. Caso isso não ocorra, o programa falha.

# 2) Em que situações deve-se usar o finally?

O finally serve para manter algo que necessita obrigatoriamente fazer, mesmo que tenha um erro no seu programa.
Como por exemplo quando você quer abrir uma conexão ao banco de dados que por segurança deve ser encerrado quando terminar de usar, mesmo que tenha um erro de leitura de um arquivo. Por esse motivo o finally sempre será executado mesmo se tiver uma exceção.

# 3) Quando devemos usar o throws? Qual a sua finalidade?

O throws é usado quando quer enviar possível exceção do método que está utilizando para outras classes, para quando esse procedimento não é fundamental naquela classe, aí vai precisar da exceção em outra classe.
A finalidade do throws é na assinatura do método que é uma participação de que o método pode criar uma exceção. Também podemos considerar que throws é uma exceção que será lançada por esse método, para quando for possível chamar o método.
Quando ocorre isso significa que ao chamar esse método será informado de que essa exceção conseguiu ser apresentada.
