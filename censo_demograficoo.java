package jojopose;
import java.util.Scanner;
public class censo_demograficoo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Scanner para entrada de informacoes 
				Scanner ler = new Scanner(System.in);

				// Declaracao das variaveis
				int genero, idade = 0, i, igp = 0;
				double ip=0, porcentagem;
				float outros = 0;
				float altura, midh = 0, maml= 0, migp = 0, contMidh = 0, contMaml = 0, contMigp = 0, contOutros = 0, contIdade = 0;

				// For para repeticao e contagem
				for (i = 0; i < 1000; i++) {
					
					// Entrada de dados com comando sugerido: generos
					System.out.println("Qual seu genero? Mulher - 0, Homem - 1, Outro - 2: ");
					// Leitura do valor referente ao genero
					genero = ler.nextInt();
					
					//Estrutura de decisao caso comando sugerido for inexistente
					if (genero > 2 || genero < 0) {
						// Exibir dados de saida 
						System.out.print("Comando inexistente! Reinicie o codigo!");
						// Parar o laco de repeticao
						break;
						
						// Decisao caso comando seja aprovado 
					} else {
						// Entrada de dados idade
						System.out.println("Qual sua idade?");
						// Leitura de dados idade 
						idade = ler.nextInt();
						// Somatoria da idade
						igp = igp + idade;
						// Contador idade
						contIdade++;
						// Entrada de dados altura
						System.out.println("Qual sua altura?");
						// Leitura de dados altura
						altura = ler.nextFloat();
						
						if (idade > 18 && idade < 35) {
							ip++;
						}
						
						// Estrutura de decisao genero 1
						if (genero == 1) {
							// Somatoria da idade genero 1
							midh = midh + idade;
							// Contagem
							contMidh++;
							
							// Eestrutura de decisao genero 0
						} else if (genero == 0) {
							// Somatoria da altura genero 0
							maml = maml + altura;
							// Contagem
							contMaml++;
							
							// Estrutura de decisao genero 2
						} else if (genero == 2) {
							// Somatoria do valor total do genero 2
							outros = outros + 0;
							// Contagem
							contOutros++;
						}
					}
				}
					
				// Media das variaveis 
				midh = igp / contIdade;
				maml = maml / contMaml;
				midh = midh / contMidh;
				ip = ip; 
				porcentagem = (ip * 0.1);
				// Variavel recebendo valor de contagem 
				outros = contOutros + 0;
				
				// Exibir os valores dos dados pedidos
				System.out.printf("Media idade do grupo: %f\n", +migp);
				System.out.printf("Media altura das mulheres: %f\n", +maml);
				System.out.printf("Media idade dos homens: %f\n", +midh);
				System.out.printf("Pessoas identificadas como 'outros': %f\n", + outros);
				System.out.printf("Pessoas entre 18 e 35 anos: %f\n", + ip);
				System.out.printf("Porcentagem da idade entre 18 e 35 anos: %f\n", + porcentagem);

			}

		

	}


