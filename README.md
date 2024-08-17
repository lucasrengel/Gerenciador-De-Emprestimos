<h1 name="portuguese">Gerenciador de Emprestimos</h1>

> App projetado para gerenciamento de emprestimos de amigos.

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![MySQL](https://img.shields.io/badge/MySQL-00000F?style=for-the-badge&logo=mysql&logoColor=white)

Gerenciador de Emprestimos é um App desenvolvido e projetado especificamente para gerenciar emprestimos. Este App oferece os principais métodos para realizar operações CRUD (Create, Read, Update, Delete).

## Tecnologias utilizadas

- Java
- Maven
- MySQL

IDE: Apache Netbeans

### Requisitos Funcionais:
> RF001 – O sistema deve permitir o cadastro de ferramentas, com nome, marca e o custo de aquisição. </br>
> RF002 – O sistema deve permitir o cadastro de amigos, com nome e telefone.</br>
> RF003 - O sistema deve permitir a edição dos cadastros, podendo alterar e apagar ferramentas e amigos.</br>
> RF004 – O sistema deve permitir o cadastro de emprestimos, selecionando o amigo e a ferramenta.</br>
> RF005 – O sistema deve gerar relatórios de controle de estoque, mostrando as ferramentas e o valor total gasto.</br>
> RF006 – O sistema deve gerar relatórios de empréstimos ativos e empréstimos já realizados.</br>
> RF007 – O sistema deve contabilizar a quantidade de empréstimos realizado por cada um dos amigos cadastrados.</br>
> RF008 - O sistema deve integrar o cadastro dos amigos com o google, de forma que recebam mensagens e convites no email.</br>

### Requisitos Não-Funcionais:
> RNF001 - Linguagem de Desenvolvimento: O sistema deve ser desenvolvido na linguagem de programação Java.</br>
> RNF002 - Versões: O sistema deve ser desenvolvido utilizando Java 21 ou superior e MySQL Workbench 8.0 ou superior.</br>
> RNF003 - Sistema Operacional: O ambiente de desenvolvimento deve utilizar Windows 10 ou 11.</br>
> RNF004 – Localização: O sistema deve rodar localmente no aparelho do usuário.</br>
> RNF005 – Segurança: O sistema deve garantir a confidencialidade dos dados cadastrados.

### Regras de Negócio
> RN001 – Empréstimos devem ser feitos apenas para amigos cadastrados</br>
> RN002 - Os dados de amigos e ferramentas não podem ser deixados em branco.</br>
> RN003 - A quantidade em estoque de uma ferramenta deve ser um valor positivo.
