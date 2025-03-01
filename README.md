﻿# TarefadeFixacao
 Aqui está um exemplo de um arquivo README para o código fornecido:

---

# Aplicação de Cálculo de Retângulo e Salário de Funcionário

## Descrição

Esta aplicação em Java realiza duas funções principais:

1. **Cálculo de propriedades de um retângulo**: dados a largura e altura, a aplicação calcula a área, o perímetro e a diagonal do retângulo.
2. **Cálculo de salário líquido de um funcionário**: dados o salário bruto e o imposto, a aplicação calcula o salário líquido após deduções de impostos.

## Estrutura do Projeto

O projeto está dividido em dois pacotes principais:

1. **mediaDoRetangulo**:
    - `Retangulo.java`: Classe que representa um retângulo, contendo atributos para a largura e altura. Ela fornece métodos para calcular a área, o perímetro e a diagonal do retângulo.
    - `Main.java`: Classe principal que recebe os valores da largura e altura do retângulo via entrada do usuário, e exibe os cálculos realizados.
    
2. **SalarioFuncionario**:
    - `Funcionario.java`: Classe que representa um funcionário, contendo atributos para o nome, salário bruto e imposto. Ela fornece métodos para calcular o salário líquido e o valor após um aumento.
    - `Main.java`: Classe principal que recebe os valores do nome do funcionário, salário bruto e imposto via entrada do usuário, e exibe os cálculos do salário bruto e líquido.

## Como Utilizar

### Requisitos

- Java Development Kit (JDK) instalado (versão 8 ou superior).

### Passos para rodar o programa:

1. Clone ou baixe este repositório para sua máquina local.
2. Compile os arquivos `.java` usando o comando:
   ```bash
   javac -d . mediaDoRetangulo/Main.java SalarioFuncionario/Main.java
   ```
3. Execute a classe principal desejada (cálculo do retângulo ou salário do funcionário):

   - Para calcular o retângulo:
     ```bash
     java mediaDoRetangulo.Main
     ```
   
   - Para calcular o salário do funcionário:
     ```bash
     java SalarioFuncionario.Main
     ```

4. Siga as instruções na tela para inserir os valores e visualizar os resultados.

## Exemplo de Entrada e Saída

### Exemplo 1: Cálculo do Retângulo

**Entrada**:
```
Receber Largura: 5
Receber altura: 3
```

**Saída**:
```
Esta é a Área do retângulo:
15.0
Este é o Perímetro do retângulo:
16.0
Este é a Diagonal do retângulo:
5.830951894845301
```

### Exemplo 2: Cálculo do Salário

**Entrada**:
```
Digite o nome: João Silva
Digite o salário bruto: 5000.00
Digite o imposto: 1000.00
```

**Saída**:
```
O salário Bruto é? 
4000.0
O salário líquido é? 
1000.0
```

## Autor

Desenvolvido por [Wellington Oliveira].

## Licença

Este projeto está sob a licença MIT. Consulte o arquivo LICENSE para mais informações.

---

Este README oferece um resumo do projeto, instruções para execução e exemplos de entrada e saída para orientar o uso da aplicação.
