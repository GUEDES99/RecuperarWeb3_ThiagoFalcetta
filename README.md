## Getting Started

Welcome to the VS Code Java world. Here is a guideline to help you get started to write Java code in Visual Studio Code.

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).

## Parte Teórica

1 - Responda ou complete as questões:
     
O que é e qual a função de: "import java.util.Scanner;" ? 
	
    
         RESPOSTA: Ele importa a classe Scanner do pacote java.util, isso possibilita que possamos utilizar os métodos da classe, como o "nextInt()", "doubleNext()" e entre outros. 


Qual a função de: import java.io.IOException; ? 	

    
        RESPOSTA: Esta função é importada quando algum sinal de entrada("Input") ou saída("Output") dá erro ou é interrompido. 


Qual a função da classe Scanner? Como ela funciona?

        
            RESPOSTA: A classe tem como função separar as entradas dos textos em blocos, formando os tokens, que são caracteres separados por delimitadores, que correspondem aos espaços em branco, tabulações e mudança de linha. 


Quais os tipos de dados que a classe Scanner lê? 

        
        RESPOSTA: A classe consegue ler os dados, como por exemplo: Idade, nome, endereço e etc. 



Qual a sintaxe da Scanner para leitura de um String? De um valor inteiro? De um valor decimal?

        
            RESPOSTA: A sintaxe que podemos usar é "String nome = entrada.nextLine();" De um valor inteiro: "Int = nextInt(); ou long = nextLong();" De um valor decimal: "double = nextDouble(); ou boolean = hasNextDouble();"


Quanto aos métodos de saída de dados, quais são?

        
        RESPOSTA: Podemos usar o atributo "Out" ou também o método "System.out.printf();".


Leia atentamente o método System.out.print e,  a respeito dos métodos de saída de dados  e descreva o que cada sintaxe abaixo imprime na tela:


System.out.printf("Olá senhora, digite aqui um valor desejado. \"%s\".\n", nome); :


        RESPOSTA: Essa sintaxe imprime uma saudação com o nome do suposto usuário.



System.out.println("Informe o sexo (M/F): "); :

            
            RESPOSTA: Essa imprime um bloco para o usuário preencher com o seu sexo. 


System.out.printf(" %0,2d- %s\n",  nomeMes); :


                RESPOSTA: Essa imprime a data cadastrada. 


System.out.println("O atleta tem " + idade + " anos, ele está na categoria Adulto"); :

        
        RESPOSTA: Essa sintaxe imprime a idade e a categoria que o atleta se encontra. 


Observe a imagem abaixo e explique


O que é a classe Main?

        
        RESPOSTA: É um método associado à classe e não a um objeto específico da mesma.


Qual a principal função da classe Main?

        
        RESPOSTA: A classe Main determina o ponto de início de qualquer aplicação java. 


Explique cada componente da sintaxe da classe Main:




Observe os códigos abaixo e responda as questões:

Qual o nome da classe?

        RESPOSTA: Veículo. 


Existe classe Main neste código?

        
        RESPOSTA: Sim. 


Quais são os atributos da classe?

        RESPOSTA: String, int, double.


Quais as variáveis da classe? E os tipos de dados?

        
            RESPOSTA: Tipo, cor, id e valor. 
		    Código do veículo,  tipo do veículo, cor do veículo e valor do veículo.


Quais os métodos da classe?

        
        RESPOSTA:  Public e void. 


Qual a instância do objeto da classe?

        
        RESPOSTA: Mostrar detalhes.
