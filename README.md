# fabsoftb_Alicia_Jose

## Nome da Equipe:
- Alicia Schiochet e Souza
- Jose Willian Silva Alves 

## Sistema para escola de musica-  Nota certa- Para um gerenciamento sem erros
Controle de entradas e saídas 

### Administrador
* Gerenciar acervo (cadastrar, atualizar e consultar instrumentos).
*  Controlar empréstimos (liberar, monitorar devoluções e bloqueios).
* Histórico de empréstimos (buscar por aluno, instrumento ou data).
* Gerenciar alunos (cadastrar, editar e visualizar perfis).

### Aluno
* Solicitar empréstimo (apenas um por vez).
* Ver tempo restante e histórico de empréstimos.
* Receber alertas e bloqueios por atraso.
* Consultar regras e suporte.

## Livro Eng Software Moderna
[Eng. Soft Moderna - Requisitos](https://engsoftmoderna.info/cap3.html)

# Histórias de Usuário Adm do sistema

## Gerenciamento do Acervo
- Como administrador da escola de música, eu gostaria de inserir e atualizar os dados dos instrumentos no acervo, para que o estoque esteja sempre atualizado e reflita a disponibilidade real dos instrumentos.
- Campos: Código do instrumento, Nome, Tipo (família), Sobressalentes (sim/não)


## Empréstimo de Instrumentos
- Como administrador da escola de música, eu gostaria de disponibilizar instrumentos para os alunos, para que eles possam utilizá-los conforme necessário.


## Consulta de Históricos
- Como administrador da escola de música, eu gostaria de visualizar o histórico de empréstimos dos alunos, para que possa acompanhar o uso dos instrumentos.
- Filtros de pesquisa: Nome do aluno, Nome do instrumento, Data do empréstimo.

## Acompanhamento de Empréstimos
- Como administrador da escola de música, eu gostaria de ver quais alunos estão excedendo o tempo de empréstimo, para que possa tomar as providências necessárias para devolução.


## Visualização e Atualização de Alunos
- Como administrador da escola de música, eu gostaria de consultar e editar os dados dos alunos, para que possa manter as informações sempre atualizadas.
- Campos: Nome, Instrumento emprestado, Data de início, Data final.

## Navegação no Sistema
Como administrador da escola de música, eu gostaria de ter uma barra de navegação, para que possa acessar rapidamente as principais seções do sistema.
Itens da NAVBAR: Home, Acervo, Alunos

# Histórias de Usuário Aluno

## Empréstimo de Instrumentos
- Como aluno da escola de música, eu gostaria de emprestar um instrumento, para que possa utilizá-lo durante meus estudos e práticas.
- Critérios de aceite: Só é permitido um instrumento por vez.

## Consulta do Histórico de Empréstimos e Devoluções
- Como aluno da escola de música, eu gostaria de visualizar meu histórico de empréstimos e devoluções, para que possa acompanhar meu uso dos instrumentos.

## Consulta do Tempo Restante do Empréstimo
Como aluno da escola de música, eu gostaria de ver o tempo restante do meu empréstimo, para que possa me organizar para devolver o instrumento no prazo.

## Bloqueio e Alerta de Atraso
- Como aluno da escola de música, eu gostaria de receber um alerta caso eu não devolva o instrumento no prazo, para que eu saiba que estou em atraso.
- Como aluno da escola de música, eu gostaria de ser bloqueado de pegar outro instrumento caso não devolva o anterior no prazo, para que eu cumpra as regras do sistema.

## Livro Eng Software Moderna cap 4- 06/10/2025
Definição das características da arquitetura

##-Auditoria, Desempenho, Segurança, Requisitos, Dados, Legalidade e Escalabilidade- uma solução de software consiste nos requisitos do domínio e nas características da arquitetura.

- Definição dos requisitos
- Cada característica precisa atender esses três critérios.
	-Especifica 
	-Deve ter influência estrutural
	-Essencial ou importante

Recursos diferenciais
- Explícita: Especifica uma consideração do design fora do domínio

- Implícita: Influencia um aspecto estrutural do design

Características operacionais
- Disponibilidade: (24/7)
- Continuidade: Capacidade de recuperação de desastres.
- Desempenho: Testes de estresse.
- Recuperabilidade: Requisitos de continuidade
- Confiabilidade/Segurança: Avalia se o sistema precisa ser à prova de falhas ou se tem uma missão crítica no modo como afeta a vida das pessoas.
- Robustez: Capacidade de lidar com condições de erro.
- Escalabilidade: A capacidade de o sistema rodar e operar quando o número de usuários ou requisições aumenta.

Características estruturais
- Configuração
- Extensão
- Instabilidade
- Aproveitamento/ reutilização
- Localização
- Manutenção
- Portabilidade: transferir um sistema para outro produto ou componente
- Suporte
- Atualização

Características transversais da arquitetura
- Acessibilidade
- Armazenamento
- Autenticação
- Autorização
- Legalidade
- Privacidade
- Segurança: usar o sistema com eficiência e satisfação.
- Suporte
- Usabilidade/ viabilidade: usar o sistema com eficiência.

Adequação funcional: 
- Representa o grau no qual um produto ou um sistema fornece funções que atendem as necessidades declaradas e implícitas quando usados sob certas condições.

Totalidade funcional:
- O grau no qual o conjunto de funções cobre todas as tarefas especificas e objetivos do usuário.

Correção funcional:
- O grau no qual um produto ou um sistema fornece resultados corretos com o grau de precisão necessário.

Adequação funcional: 
- O grau no qual as funções facilitam a realização de tarefas e objetivos específicos.

Trade-offs  arquitetura menos pior
- Numa mire na melhor arquitetura, mas na arquitetura menos pior.

