# Modelagem e diagramação da representação em UML e Código no que se refere ao componente iPhone

## Introdução

O iPhone é um dispositivo de comunicação móvel que foi lançado pela Apple em 2007. Ele é um smartphone que combina as funções de um telefone celular, um reprodutor de música, um navegador da web e um dispositivo portátil de mídia digital.

**Fonte:** [Lançamento iPhone 2007](https://www.youtube.com/watch?v=vN01eM7_AaA)

## Modelagem em UML

A modelagem em UML é um processo de representação de sistemas de software usando diagramas. Esses diagramas podem ser usados para comunicar a arquitetura e o design de um sistema de software.

**Diagrama de classes:**

```
classDiagram
  class iPhone {
    + tocar()
    + pausar()
    + selecionarMusica()
    + ligar()
    + atender()
    + iniciarCorrerioVoz()
    + exibirPagina()
    + adicionarNovaAba()
    + atualizarPagina()
  }

  interface ReprodutorMusical {
    + tocar()
    + pausar()
    + selecionarMusica()
  }

  interface AparelhoTelefonico {
    + ligar()
    + atender()
    + iniciarCorrerioVoz()
  }

  interface NavegadorNaInternet {
    + exibirPagina()
    + adicionarNovaAba()
    + atualizarPagina()
  }

  iPhone ..|> ReprodutorMusical
  iPhone ..|> AparelhoTelefonico
  iPhone ..|> NavegadorNaInternet


Este diagrama mostra que o iPhone é uma classe que implementa as interfaces ReprodutorMusical, AparelhoTelefônico e NavegadorNaInternet. Isso significa que o iPhone pode realizar as operações definidas em cada interface.

## Código

Para implementar o modelo em UML, podemos criar as seguintes classes Java:

java
public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorNaInternet {

  @Override
  public void tocar() {
    // Implementação do método tocar()
  }

  @Override
  public void pausar() {
    // Implementação do método pausar()
  }

  @Override
  public void selecionarMusica() {
    // Implementação do método selecionarMusica()
  }

  @Override
  public void ligar() {
    // Implementação do método ligar()
  }

  @Override
  public void atender() {
    // Implementação do método atender()
  }

  @Override
  public void iniciarCorrerioVoz() {
    // Implementação do método iniciarCorrerioVoz()
  }

  @Override
  public void exibirPagina() {
    // Implementação do método exibirPagina()
  }

  @Override
  public void adicionarNovaAba() {
    // Implementação do método adicionarNovaAba()
  }

  @Override
  public void atualizarPagina() {
    // Implementação do método atualizarPagina()
  }

}


Essas classes implementam os comportamentos esperados para os papéis de Reprodutor Musical, Aparelho Telefônico e Navegador na Internet.
