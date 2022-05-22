package jojopose;
import java.util.Scanner;
public class censo_demograficoo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				Scanner ler = new Scanner(System.in); // Scanner que ira ler as informacoes do codigo

				int genero, idade = 0, i, igp = 0; // Variaveis do codigo
				double ip=0, porcentagem; // Variaveis do codigo
				float outros = 0; // Variaveis do codigo
				float altura, midh = 0, maml= 0, migp = 0, contMidh = 0, contMaml = 0, contMigp = 0, contOutros = 0, contIdade = 0; // Variaveis do codigo

				for (i = 0; i < 1000; i++) { // sistema de repeticao para a porcentagem
					
					System.out.println("Qual seu genero? Mulher - 0, Homem - 1, Outro - 2: "); // Interface que ira aparecer para o usuario imputar os dados
					genero = ler.nextInt();// fara a leitura da nossa string
					
					if (genero > 2 || genero < 0) { //Estrutura de decisao caso comando sugerido for inexistente
						System.out.print("Comando inexistente! Reinicie o codigo!"); // interface que ira aparecer para o usuario
						break;// forcar parada da repeticao
						
						
					} else { // a decisao caso a informacao for verdadeira
						System.out.println("Qual sua idade?"); // Interface que ira aparecer para o usuario imputar os dados
						idade = ler.nextInt(); // fara a leitura da string
						igp = igp + idade; // Somatoria da idade
						contIdade++; // contdor
						System.out.println("Qual sua altura?"); // Interface que ira aparecer para o usuario imputar os dados
						altura = ler.nextFloat(); // fara a leitura da nossa string
						
						if (idade > 18 && idade < 35) { // Sistema de decisao 
							ip++; // somatoria da porcentagem
						}
						
						
						if (genero == 1) { // estrutura de decisao
							midh = midh + idade; // Somatoria da idade genero 
							contMidh++; // contador
							
						} else if (genero == 0) { // Eestrutura de decisao
							maml = maml + altura; // Somatoria da altura genero 
							contMaml++;// contador
							
							
						} else if (genero == 2) { // Estrutura de decisao 
							outros = outros + 0; // Somatoria do valor total do genero 
							contOutros++; // contador
						}
					}
				}
					 
				midh = igp / contIdade; // media das variaveis
				maml = maml / contMaml; // media das variaveis 
				midh = midh / contMidh; // media das variaveis
				ip = ip; // media das variaveis
				porcentagem = (ip * 0.1); // media das variaveis 
				outros = contOutros + 0; // Variavel recebendo valor da soma
				
				System.out.printf("Media idade do grupo: %f\n", +migp);  // Interface que ira aparecer para o usuario
				System.out.printf("Media altura das mulheres: %f\n", +maml);  // Interface que ira aparecer para o usuario
				System.out.printf("Media idade dos homens: %f\n", +midh);  // Interface que ira aparecer para o usuario
				System.out.printf("Pessoas identificadas como 'outros': %f\n", + outros);  // Interface que ira aparecer para o usuario
				System.out.printf("Pessoas entre 18 e 35 anos: %f\n", + ip);
				System.out.printf("Porcentagem da idade entre 18 e 35 anos: %f\n", + porcentagem);  // Interface que ira aparecer para o usuario

			}

		

	}


