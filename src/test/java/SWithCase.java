import java.util.Scanner;

public class SWithCase {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println ("Bem vindo a pizzaria Dom Bosco");
		System.out.println ("");
		System.out.println ("Nosso horario de Atendimento é de Segunda a Sexta das 19:00 as 23:00.");
		System.out.println ("");
		System.out.println ("Taxa de entrega: R$5,00.");
		System.out.println ("");
		System.out.println ("Tempo de entrega: 30 minutos.");
		System.out.println ("");
		System.out.println ("Tel: 55555-5555");
		System.out.println ("");
		System.out.println ("Endereço: Avenida Paulista N: 1000.");
		System.out.println ("");
		System.out.println ("Delivery ou Retirada no Local");
		System.out.println ("");
		System.out.println ("Não trabalhamos com Pizza com borda.");
		System.out.println ("");
		System.out.println ("Forma de pagamento: Dinheiro.");
		
		
		System.out.println("Digite o seu pedido :");
		String pedido = scanner.next();
		
		switch (pedido) {
		case "Mussarela":
			System.out.println("Sabores de pizza");
			break;
			
			
			case "Calabresa":
		
		System.out.println("Sabores de pizza");
		break;
		
			case "Atum":
				
				System.out.println("Sabores de pizza");
				break;
				
			case "Portuguesa":
				
				System.out.println("Sabores de pizza");
				break;
		
		}
		
		System.out.println("Tamanho da Pizza :");
		String Tamanho = scanner.next();
		
		switch (Tamanho) {
		case "P":
			System.out.println("Tamanho P");
			break;
			
		
			case "M":
				System.out.println("Tamanho M");
				break;
				
				
				case "G":
					System.out.println("Tamanho G");
					break;		
				}
				
				System.out.println("Qual o preco?:");
				String preco = scanner.next();
				
				switch(preco) {	
				case "R$15,00":	
					System.out.println("Tamanho P");
					break;
					
		
					case "R$20,00":
						System.out.println("Tamanho M");
						break;
						
			
						case "R$100":
							System.out.println("Tamanho G");
							break;		
							
							
				
		
		}
				System.out.println("Qual pedido:");
				String pedido1 = scanner.next();
				
				switch (pedido1) {
				case "pedido":
					System.out.println("Mussarela, P");
					break;
				
				}
				
				System.out.println("Qual endereco da entrega:");
				String endereco = scanner.next();
				
				switch (endereco) {
				case "endereco":
					System.out.println("Rua Abilio Tavares n 91");
					break;
					
				}
				
				System.out.println("Qual o nome do cliente:");
				String Cliente = scanner.next();
				
				switch (Cliente) {
				case "Nome":
					System.out.println("Milena");
					break;
					
				}
				
				System.out.println("Qual o telefone:");
				String Telefone = scanner.next();
				
				switch (Telefone) {
				case "Telefone":
					System.out.println("11 988233481");
					break;
				}
				
				
				System.out.println ("Confirmando o seu pedido: Mussarela P, endereço: Rua Abilio Tavares 91.");
				System.out.println ("");
				System.out.println ("Obrigada.");


				
		// TODO Auto-generated method stub

		
		
	}

}
