import java.util.Scanner;

public class AppLivro {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        Scanner entradaString = new Scanner(System.in);
        Scanner in = new Scanner(System.in);

        System.out.println("Digite seu login: ");
        String login = in.nextLine();

        System.out.println("Digite sua senha: ");
        String senha = in.nextLine();

        if(login.equals("aluno") && senha.equals("qitecnico123")){
            System.out.println("Usuário Logado com sucesso! ");
        } else {
            System.out.println("Login ou senha inválidos!");
        }

        int menu;
        double vInicial, vFinal;
        //Referencia para classe EmprestimoDeLivros
        EmprestimoDeLivros objLivro;

        String titulo, autor, genero;
        float preco;
        

        do{
            exibirMenu();
            menu = entrada.nextInt();

            switch(menu) {
                case 1: //Cadastro do Livro
                    System.out.println("Cadastrar Livro:");
                    System.out.println("Digite o título:");
                        titulo = entradaString.nextLine();
                    System.out.println("Digite o autor:");
                        autor = entradaString.nextLine();
                    System.out.println("Digite o gênero:");
                        genero = entradaString.nextLine();
                    System.out.println("Digite o preço:");
                        preco = entrada.nextFloat();

                    //Criar objeto da classe
                    objLivro = new EmprestimoDeLivros(titulo, autor, genero, preco);

                    //Guardar no ArrayList
                    Acervo.adicionar(objLivro);
                    break;

                
                case 2:
                    System.out.println("===< Listagem de Livros");
                    System.out.println(Acervo.Listar() );
                    break;


                case 3:
                    System.out.println("Emprestimo de Livro:");
                    System.out.println("Digite o título do livro");
                    titulo = entradaString.nextLine();

                    if( ! (Acervo.getListaLivros().isEmpty())){ //Acervo cheio
                        if( Acervo.emprestar(titulo) ){
                            System.out.println("Emprestimo de livro realizado com sucesso!");
                        }else{
                            System.out.println("Título não foi encontrado!");
                        }
                    }else{
                        System.out.println(titulo + ": Este livro está emprestado!");

                    }
                    break;

                case 4:
                    System.out.println("Devolver livro:");
                    System.out.println("Digite o título:");
                        titulo = entradaString.nextLine();
                    System.out.println("Livro devolvido com sucesso!");

                    break;

                case 5:
                    System.out.println("====> Pesquisar pelo gênero:");
                    System.out.println("Digite o gênero:");
                        genero = entradaString.nextLine();
                    System.out.println("Existem" + Acervo.pesquisar(genero) + "Livro(s) do gênero" + genero);
                    
                    break;


                case 6:
                    System.out.println("===> Pesquisar por faixa de preço");
                    System.out.println("Digite a faixa inicial e a final");
                    vInicial = entrada.nextDouble();
                    vFinal = entrada.nextDouble();
                    
                    System.out.println("Existem" + Acervo.pesquisar(vInicial, vFinal)
                                        + "Livro(s) com preço entre" 
                                        + String.format("R$ %.2f e R$ %.2f \n" , vInicial, vFinal));

                    break;


                case 7:
                    System.out.println("===> Total em R$ de Livros no Acervo");
                    System.out.println("O total é:" + String.format("R$ %.2f \n",
                     Acervo.calcularTotalAcervo()));

                    break;


                case 8:
                    System.out.println("Saindo....");
                    break;
               
                default:
                    System.out.println("Opção de menu inválida!!!");
            }

        }while(menu != 7);

    }//Fim do Main
    
    static void exibirMenu(){
        System.out.println("=========== EMPRÉSTIMO DE LIVROS ============ ");
        System.out.println("1 - CADASTRAR");
        System.out.println("2 - LISTAR");
        System.out.println("3 - EMPRESTAR LIVRO");
        System.out.println("4 - DEVOLVER LIVRO");
        System.out.println("5 - PESQUISAR POR GENERO");
        System.out.println("6 - PESQUISAR POR FAIXA DE PREÇO");
        System.out.println("7 - CALCULAR TOTAL DO ACERVO");
        System.out.println("8 - SAIR");
        System.out.println("===> ESCOLHA UMA OPÇÃO:");
    }


}      