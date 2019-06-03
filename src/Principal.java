import java.util.Scanner;
import java.util.ArrayList;

class Funcoes
{
	static ArrayList<String> nomes = new ArrayList();
	static ArrayList<String> cpfs = new ArrayList();
	static Scanner scan = new Scanner(System.in);

	public void visualizar() 
    {
    	//método size retorna a quantidade de itens na lista
    	int n = nomes.size();
    	
    	//percorremos o array de dados, para imprimir cada usuário e cada respectivo CPF
    	for(int i=0; i<n; i++)
    	{
    		//método get retorna o que está escrito na lista, como parâmetro, passar a posição desejada
    		System.out.println("Usuário " + (i+1) + ": " + nomes.get(i) + ". CPF: " + cpfs.get(i));
    	}
    }
	
	public void cadastrar() 
    {
    	Scanner scan = new Scanner(System.in);
    	
    	System.out.println("Digite o nome da pessoa");
    	String nome = scan.nextLine();
    	
    	System.out.println("Digite o CPF da pessoa");
    	String cpf = scan.nextLine();
    	
    	//método add adiciona um item à lista
    	nomes.add(nome);
    	cpfs.add(cpf);
    	
    	System.out.println("Usuário " + nome + " adicionado com sucesso!\n");
    }
	
	public void deletar() 
    {
    	Scanner scan = new Scanner(System.in);
    	System.out.println("Digite o número do usuário que deseja deletar");
    	int numero = scan.nextInt();
    			
    	//método remove, remove um item da lista, como parâmetro, passar a posição que se deseja excluir
    	nomes.remove(numero - 1);
    	cpfs.remove(numero - 1);
    	System.out.println("Usuário deletado com sucesso\n");
    	
    }
	
	public void editar() 
	{
    	Scanner scan = new Scanner(System.in);
    	System.out.println("Digite o número do usuário que deseja editar");
    	int numero = scan.nextInt();
    	
    	System.out.println("Selecione o dado a ser editado do usuário " + nomes.get(numero - 1));
    	System.out.println("(1) Nome\n(2) CPF");
    	
    	int dado = scan.nextInt();
    	scan.nextLine();
    	
    	switch(dado)
    	{
    		case 1:
    			
				System.out.println("Favor digitar novo nome");
	    		String nomeNovo = scan.nextLine();
	    		
	    		//método set altera algum dado na lista, o primeiro paãmetro é a posição a ser alterada, e o segundo parâmetro é o novo dado
	    		nomes.set(numero - 1, nomeNovo);
	    		System.out.println("Nome do usuário " + numero + " alterado para " + nomeNovo + "\n");
	    		break;
	    		
    		case 2:
    			
    			System.out.println("Favor digitar novo CPF");
        		String cpf = scan.nextLine();
        		cpfs.set(numero - 1, cpf);
        		System.out.println("CPF do usuário " + numero + " alterado para " + cpf + "\n");
        		break;
    			
    	}
    }
}

public class Principal {
    
    public static void main(String[] args) {
    	
    	Scanner scan = new Scanner(System.in);
    	
    	Funcoes funcoes = new Funcoes();
    	
    	boolean menu = true;
    	while(menu)
    	{
    		System.out.println("Digite a Opção selecionada");
    		System.out.println("(1) Visualizar usuários");
    		System.out.println("(2) Cadastrar novo usuário");
    		System.out.println("(3) Deletar usuário");
    		System.out.println("(4) Editar cadastros");
    		System.out.println("(5) Sair");
    		
    		int opcao = scan.nextInt();
    		
    		switch(opcao)
    		{
	    		case 1:
	    			funcoes.visualizar();
	    			break;
	    		case 2:
	    			funcoes.cadastrar();
	    			break;
	    		case 3:
	    			funcoes.deletar();
	    			break;
	    		case 4:
	    			funcoes.editar();
	    			break;
	    		case 5:
	    			menu = false;
	    			break;
	    		default:
	    			System.out.println("Opção inválida");
    			
    		}
    		
    	}
    }
}


