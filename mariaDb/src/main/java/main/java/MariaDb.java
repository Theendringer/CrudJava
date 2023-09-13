

package main.java;


import main.resources.Crud;
import java.util.Scanner;

public class MariaDb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Crud crud = new Crud();
        
        int variavel = 0;
        
        
        for(;;){
            System.out.println("O que quer fazer?\n 1 - inserir pessoa\n 2 - listar pessoas\n 3 - alterar pessoa\n 4 - excluir pessoa ");
            
            variavel = sc.nextInt();
            switch(variavel){
                case 1:
                    System.out.println("__________________________");
                    System.out.println("Digite o nome: ");
                    String dados = sc.next();
                     crud.inserir(dados);
                     System.out.println("Nome inserido com sucesso!");
                     System.out.println("__________________________");
                    break;
                    
                case 2:
                    System.out.println("__________________________");
                     crud.mostrar();
                     System.out.println("__________________________");
                    break;
                    
                case 3:
                    System.out.println("__________________________");
                    System.out.println("Digite o ID e nome da pessoa que deseja alterar:");
                    int id = sc.nextInt();
                    String nome = sc.next();
                    crud.atualizar(id, nome);
                    System.out.println("Dados Alterados com sucesso!");
                    System.out.println("__________________________");
                    break;
                    
                case 4:
                    System.out.println("__________________________");
                    System.out.println("Digite o ID da pessoa que deseja deletar: ");
                    int idDeletar = sc.nextInt();
                    crud.deletar(idDeletar);
                    System.out.println("Pessoa deletada com sucesso!");
                    System.out.println("__________________________");
                    break;
            }
                
        }
    }
}
