# fernando_roque

TRABALHO PRÁTICO DE GESTÃO DE VERSÕES

Entrega: 06/02/2022 no campus virtual
Trabalho Individual
Objetivo: Propiciar a familiarização prática dos alunos do curso de graduação em Ciência da Computação e Sistemas de Informação da UFLA com a ferramenta de controle de versões o Git e GitHub (GitLab ou similar).
O QUE ENTREGAR: O aluno deverá entregar um relatório provando ter feito a atividade. O relatório deverá conter o enunciado de cada uma das atividades descritas no roteiro (abaixo). Para cada item do roteiro o aluno provará o feitio do trabalho mostrando um ou mais comandos executados e um ou mais printscreens. Nestes printscreens, deverá ser possível ler o comando executado, o resultado do comando retornado pela ferramenta e a identificação de quem fez o trabalho. No caso de usar console e comandos de linha, todo printscreen deve conter nome do usuário ou informação que possibilite identificar o aluno. Se o aluno utilizar interface gráfica, o aluno deverá mostrar um printscreen com o menu aberto e a opção do comando marcada pelo mouse, bem como printscreen de outras interfaces que demonstram o resultado da execução do comando.
Preparação para realizar o trabalho:
- Assista aos 8 vídeos do curso de GIT disponível em: https://www.youtube.com/watch?v=WVLhm1AMeYE&list=PLInBAd9OZCzzHBJjLFZzRl6DgUmOeG3H0
- Ao assistir os vídeos, tome nota dos comandos utilizados e para que eles servem. Faça um pequeno tutorial para você mesmo.
- Assista ao vídeo que faz uma boa introdução sobre o GITHUB: https://www.youtube.com/watch?v=UMhskLXJuq4
- Assista ao vídeo que exemplifica merge sendo feito com o Visual Studio Code. https://www.youtube.com/watch?v=oXMgyQt0ce0

Preparação do ambiente para realizar o trabalho:
    1. Instale a ferramenta de Gerência de Versões GIT do site oficial.
    2. A partir do site oficial do GIT, instale uma GUI (Graphic User Interface), interface do usuário, para ter o recurso de interface gráfica além das linhas do prompt de comando. Exemplos de GUIs são TortoiseGit, Git Extensions, SourceTree etc.
    3. Abra uma conta no GitHub caso não tenha.





ENUNCIADO DO ROTEIRO
Para cada instrução dada abaixo, o aluno deve tirar um ou mais printscreens para mostrar o que fez e o resultado.
Seção criação de projeto e clonagem:
    1. Crie um repositório no GITHUB chamado “Projeto_<primeironome>_<segundoNome>”.  Se fosse eu, professor, criando o repositório, ele se chamaria “Projeto_Antonio_Resende”. 
    2. Crie duas classes na linguagem que preferir, uma chamada A e a outra B. A classe A tem os atributos int A1 e float A2. A classe B tem os atributos int B1, float B2. O aluno pode alterar o tipo de variável para adequar a declaração a linguagem escolhida (int, integer, Integer,... ou float, real, decimal,....). Crie os gets e sets para esses atributos. A classe A deve ter os métodos MA1() e MA2(). A classe B deve ter os métodos MB1() e MB2(). Dentro de cada método coloque uma instrução de comando que manda imprimir o nome do método.  Adicione (upload) dessas duas classes, A e B, no GitHub. Atenção, não se esqueça de apresentar o código das duas classes no relatório e a tela mostrando os dois arquivos inseridos no repositório do Github.
    3. Faça o clone do repositório Criado no GitHub para sua máquina, isto é, o projeto criado no servidor do GitHub será copiado para sua máquina.

Seção alteração e atualização do projeto:
    4. Edite a Classe A clonada no seu computador, inserindo o método MA3() com uma linha de comando imprimindo na tela a string ”Alteração a classe A partir do clone”. Crie uma classe C com os atributos String C1 e Int C2, os métodos MC1() e MC2(), cada um deles com um comando que imprime na tela o nome do método. 
    5. Verifique o Status do repositório explicando a mensagem enviada pelo comando de quais arquivos estão desatualizados, atualizados, sob controle, sem controle etc.
    6. Garanta que todas as classes estejam sob controle de versão, adicionando as que não estiverem.
    7. Aplique um commit na classe C enviando a mensagem “Criação da Classe C”
    8. Aplique um commit na classe A enviando a mensagem “Criado o Método MA3()”
    9. Se houver algum arquivo desatualizado faça atualização com commit e descarregue todos os arquivos no servidor.

Seção de rotulação (tag) de versões liberadas (releases) do projeto e uso de tags:
    10. Crie uma Tag chamada “Versão 1.0”. Esta tag deve ser usada para rotular a última versão das classes A, B e C.
    11. Altere localmente a Classe B e C, criando, respectivamente, os métodos MB3() e MC3() para aquelas classes. Os métodos deverão ter o comando para imprimir na tela o nome do método.
    12. Crie uma classe D com os atributos D1 e D2, e os 2 métodos MD1() e MD2(). As assinaturas dos métodos e tipos de dado são de sua escolha. 
    13. Atualize o servidor com as alterações feitas, fazendo commit com mensagem adequada para cada classe.
    14. Crie uma nova Tag chamada “Versao 2.0”. Esta tag deve ser usada para rotular o contendo a última versão das classes A, B, C e D, solicitadas anteriormente.
    15. Faça um clone para usa máquina do software cuja Tag é “Versão 1.0”. Isto é possível? Caso não seja possível, como um desenvolvedor deve proceder para clonar uma versão de software que corresponda a uma Tag desejada?

Seção de resolução de conflitos (merge): Aqui, devemos simular dois programadores alterando ao mesmo tempo um arquivo.  O aluno pode usar duas contas de email ou ele pode fazer 1 (uma) alteração via interface web do GITHUB e uma segunda alteração na pasta local do projeto que está na sua máquina. Ao tentar dar um commit e push, o sistema acusará conflito. Assim o segundo usuário a retornar o arquivo para o servidor terá um conflito e deverá unir suas alterações com as alterações feitas pelo outro programador. 
    16. Clone a última versão do projeto na sua máquina local.
    17. Abra a classe D e inclua o novo método MD3() nela, imprimindo o nome do método.
    18. Salve localmente, SEM atualizar o servidor. (isto simula um usuário que está alterando um arquivo numa máquina)
    19. Acesse a classe D da última versão pelo github (browser). Crie o método MD4(), imprimindo o nome do método. Salve essa alteração no github. (isto é para simular outro usuário alterando o mesmo arquivo em outra máquina)
    20. Volte para o terminal ou interface gráfica que você está utilizando para trabalhar no repositório local. Atualize o servidor com as alterações feitas localmente na classe D (foi criado o método MD3() ). Mostre a mensagem retornada ao tentar atualizar o servidor.
    21. Faça o merge e verifique se os métodos MD3 e MD4 estão presentes na classe D ou se houve alguma perda de informação.

Seção de verificar diferença do mesmo mesmo arquivo em versões diferentes e também a diferença entre duas versões utilizando as tags de diferentes versões:
    22. Mostre a diferença entre as duas últimas versões salvas da classe B e D
    23. Mostre a diferença entre as versões 1 e 2.

Outras ferramentas e relatórios:
    24. A ferramenta disponibiliza um relatório que mostra todas as alterações já feitas no repositório? 
    25. A ferramenta disponibiliza um relatório que mostra todas as versões/alterações de um único componente?
    26. A ferramenta disponibiliza um relatório contendo as diferenças entre as versões?
    27. Quais são os outros relatórios a ferramenta disponibilizam?
    28. A ferramenta disponibiliza uma interface gráfica para gerenciar a árvore de versões?
    29. Mostre uma interface gráfica que apresente como está a evolução do seu projeto. Imagem exemplo de uma interface gráfica está abaixo.
