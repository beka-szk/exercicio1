# 🎟️ Sistema de Venda de Ingressos de Cinema (POO)

![Linguagem](https://img.shields.io/badge/Linguagem-Java-blue.svg)
![Status](https://img.shields.io/badge/Status-Concluído-green.svg)

## 📄 Sobre o Projeto

Este projeto é um exercício prático de **Programação Orientada a Objetos** focado em **Herança e Polimorfismo**, desenvolvido como parte do **Bootcamp de Java e IA da DIO com a NTT DATA**.

O programa simula um sistema de venda de ingressos para um cinema. Diferentes tipos de ingressos (Comum, Meia-Entrada e Família) são modelados como classes que herdam de uma classe base (`Tickets`), cada uma com sua própria regra de cálculo de preço, demonstrando um cenário clássico de aplicação de POO.

---

## ✨ Funcionalidades

* 🔹 **Menu Interativo:** Permite ao usuário escolher entre 3 tipos de ingresso para a compra.
* 🔹 **Coleta de Dados:** Solicita informações essenciais como nome do filme, preço base por ingresso, tipo de áudio e quantidade desejada.
* 🔹 **Cálculo Polimórfico de Preços:**
    * **Ingresso Comum:** Preço base multiplicado pela quantidade.
    * **Meia-Entrada:** 50% do valor de cada ingresso.
    * **Ingresso Família:** Desconto de 5% no valor total para compras de mais de 3 ingressos.
* 🔹 **Resumo da Compra:** Exibe um resumo claro e formatado do pedido, com a descrição do tipo de ingresso e o valor total a ser pago.

---

## 🏛️ Conceitos de POO em Ação

O foco deste projeto foi a aplicação prática dos pilares da Programação Orientada a Objetos:

* **Herança:** As classes `HalfEntry` e `FamilyEntry` herdam atributos e métodos da classe base `Tickets`, evitando a repetição de código e estabelecendo uma relação "é um tipo de".
* **Polimorfismo:** A classe `Main` utiliza uma variável do tipo `Tickets` para armazenar qualquer um dos três tipos de ingresso. Ao chamar o método `getTotalPrice()`, o Java executa a versão correta do método (da classe-filha específica) em tempo de execução, sem a necessidade de `if/else` para verificar o tipo.
* **Sobrescrita (`@Override`):** As classes `HalfEntry` e `FamilyEntry` sobrescrevem o método `getTotalPrice()` para implementar suas regras de negócio específicas, o que é a essência do polimorfismo em ação.
* **Encapsulamento:** Os atributos das classes são `private`, e o acesso é feito de forma controlada através de métodos `public` (getters e setters).

---

## 🚀 Como Executar

**Pré-requisitos:**
* Ter o **JDK (Java Development Kit) 17 ou superior** instalado.

**Passos:**
1.  Clone o repositório:
    ```bash
    git clone https://github.com/beka-szk/exercicio-1-classes-e-encapsulamento-DIO
    ```
2.  Abra o projeto na sua IDE de preferência (IntelliJ, Eclipse, VS Code).
3.  Localize e execute o método `main` no arquivo `Main.java`.
4.  Siga as instruções exibidas no console para simular a compra de um ingresso.

---

## ✒️ Autora

Feito com ❤️ por **Beka S.**

[![LinkedIn](https://img.shields.io/badge/linkedin-%230077B5.svg?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/beka-szk/)
