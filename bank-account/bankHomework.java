import java.util.Scanner;

public class bankHomework {

    public static void main(String[] args) {
   		Scanner read = new Scanner(System.in);

		String name = "";
		int numberCc = 0, numberCp = 0, i = 0, opcao = 0, accountChosen = 0;
		float saldoCc = 0, saldoCp = 0, newValueCc = 0, trySaldoCp = 0, newValueCp = 0;
		boolean trueOption = true;

   		System.out.println("Bem vindo! Digite suas informações iniciais para iniciar o programa.");

		while(trueOption == true){ // validar se tem números no nome

   			System.out.print("Entre com o nome do cliente: ");
   			name = read.nextLine();

   			if(name.matches("[^\\d]+") == false) { // se ter números na String nome, irá retornar false
   				// isso é um regex, achei na internet. o \d significa que não irá aceitar números inteiros [0,9] e o + significa para bloquear 1 ou mais vezes
   				System.out.println("Você não pode inserir números no nome.");
   			}else {
   				break;
   			}
		}

   		System.out.print("Entre com o número da Conta Corrente: ");
   		numberCc = read.nextInt();
   		System.out.print("Entre com o saldo inicial da Conta Corrente " + numberCc + ": ");
   		saldoCc =  read.nextFloat();

   		while(trueOption == true) {
   			System.out.print("Entre com o número da Conta Poupança: ");
   			numberCp = read.nextInt();

   			if(numberCp == numberCc) {
   				System.out.println("Número igual ao da Conta Corrente, digite outro.");
   			}else {
   				break;
   			}
   		}

		while(trueOption == true) {
   			System.out.print("Entre com seu saldo inicial da Conta Poupança " + numberCp + ": ");
   			saldoCp = read.nextFloat();

   			if(saldoCp < 0) {
   				System.out.println("Saldo da Conta Poupança não pode ser negativo");
   			}else {
   				break;
   			}
		}

   		System.out.println("Dados cadastrados. Pressione ENTER para iniciar o programa.");
   		read.nextLine(); // Para evitar o problema do nextLine salvar o /n.
   		read.nextLine(); // Aguarda o ENTER do usuário

   		System.out.println("");

		do {
			while(trueOption == true) {
				System.out.println(" Qual operação deseja realizar? ");
   				System.out.println(" 1 - Creditar");
   				System.out.println(" 2 - Debitar");
   				System.out.println(" 3 - Transferir");
   				System.out.println(" 4 - Saldo");
   				System.out.println(" 5 - Sair");

				System.out.print("Sua opção: ");
				opcao = read.nextInt();

				if(opcao < 1 || opcao > 5){ // Opção escolhida inválida, erro.
					System.out.println("Número inválido, tente novamente.");
				}else {
					System.out.println("");
					break;
				}
			}

			if(opcao == 5) { // Opção escolhida == 5. Já finaliza o programa.
				System.out.println("Obrigado por trabalhar no nosso banco!");
			} else if(opcao == 3) { // Transferir
				System.out.println(" Entre: ");
				System.out.println(" 1 - Conta Corrente e Poupança");
	   			System.out.println(" 2 - Conta Poupança e Conta Corrente");

				while(trueOption == true) {
					System.out.print("Sua opção: ");
					accountChosen = read.nextInt();

					if(accountChosen > 2 || accountChosen < 1) {
						System.out.println("Número inválido, tente novamente.");
					}else {
						System.out.println("");
						break; // fez oq eu queria, passa
					}
				}
			}else if(opcao == 4) {
				System.out.println("Senhor(a) " + name);
				System.out.printf("Saldo atual da Conta Corrente %d -> R$ %.2f\n", numberCc, saldoCc);
				System.out.printf("Saldo atual da Conta Poupança %d -> R$ %.2f\n\n", numberCp, saldoCp);
			}else { // Creditar, debitar e saldo
				while(trueOption == true) {
					System.out.println(" Qual conta? ");
					System.out.println(" 1 - Conta Corrente");
		   			System.out.println(" 2 - Conta Poupança");

						System.out.print("Sua opção: ");
						accountChosen = read.nextInt();

						if(accountChosen > 2 || accountChosen < 1) {
							System.out.println("Número inválido, tente novamente.");
						}else {
							System.out.println("");
							break; // fez oq eu queria, passa
						}
				}
			}

				switch(opcao) { // Creditar, debitar e saldo. Deixei tudo em um switch pois são mensagens iguais.
					case 1:
	   					if(accountChosen == 1) {
	   						System.out.println("Qual o valor a creditar na Conta Corrente " + numberCc + " ?");
	   						System.out.print("Valor: R$ ");
							newValueCc = read.nextFloat();
							saldoCc = saldoCc + newValueCc;
							System.out.printf("Saldo atual da Conta corrente %d: R$ %.2f.\n\n", numberCc, saldoCc);

	   					} else if(accountChosen == 2) {
	   						System.out.println("Qual o valor a creditar na Conta Poupança " + numberCp + " ?");
							System.out.print("Valor: R$ ");
							newValueCp = read.nextFloat();
							saldoCp = saldoCp + newValueCp;
							System.out.printf("Saldo atual da Conta Poupança %d: R$ %.2f.\n\n", numberCp, saldoCp);
	   					}
						break;

					case 2:
						if(accountChosen == 1) {
	   						System.out.println("Qual o valor a debitar na Conta Corrente " + numberCc + " ?");
	   						System.out.print("Valor: R$ ");
							newValueCc = read.nextFloat();
							saldoCc = saldoCc - newValueCc;
							System.out.printf("Saldo atual da Conta corrente %d: R$ %.2f.\n\n", numberCc, saldoCc);

	   					} else if(accountChosen == 2) {
	   						System.out.println("Qual o valor a debitar na Conta Poupança " + numberCp + " ?");
							System.out.print("Valor: R$ ");
							newValueCp = read.nextFloat();
							trySaldoCp = saldoCp - newValueCp;

							// Se o valor da Variável trySaldoCp for negativo, não atribuo esse valor a saldoCp e retorna.
							if(trySaldoCp < 0) {
								System.out.println("Desculpe, o saldo da Conta Poupança não pode ser negativo.");
							} else { // Caso o valor de trySaldoCp for maior que 0, o saldoCp recebe esse novo valor
								saldoCp = trySaldoCp;
							}
							System.out.printf("Saldo atual da Conta Poupança %d: R$ %.2f.\n\n", numberCp, saldoCp);
	   					}
						break;

					case 3:
						if(accountChosen == 1) {
							System.out.println("Qual o valor a transferir da CC " + numberCc + " para a CP " + numberCp + " ?");
	   						System.out.print("Valor: R$ ");
	   						newValueCp = read.nextFloat();

	   						if(newValueCp > saldoCc) {
	   							System.out.println("Saldo insuficiente!");
	   						} else {
	   							saldoCc = saldoCc - newValueCp;
	   							saldoCp += newValueCp;
	   						}
						} else if(accountChosen == 2) {
							System.out.println("Qual o valor a transferir da CP " + numberCp + " para a CC " + numberCc + " ?");
	   						System.out.print("Valor: R$ ");
	   						newValueCc = read.nextFloat();

	   						if(newValueCc > saldoCp) {
	   							System.out.println("Saldo insuficiente!");
	   						} else {
	   							saldoCp = saldoCp - newValueCc;
	   							saldoCc += newValueCc;
	   						}
						}

						System.out.printf("Saldo atual da Conta Corrente %d -> R$ %.2f\n", numberCc, saldoCc);
						System.out.printf("Saldo atual da Conta Poupança %d -> R$ %.2f\n\n", numberCp, saldoCp);
						break;
				}
		} while(opcao != 5);
    }
}