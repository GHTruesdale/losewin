package br.com.lowin.jogo;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Lowin {

    public static void main(String[] args) {
        Integer pergunta = 0;
        Scanner opcao = new Scanner(System.in);
        JOptionPane.showMessageDialog(null, "Seja Bem-Vindo ao Lowin!");
        JOptionPane.showMessageDialog(null, "Você acorda em um quarto e não consegue se lembrar de nada.");
        pergunta = Integer.parseInt(JOptionPane.showInputDialog("O que fazer agora?\n 1 - Para explorar a casa\n 2 - Voltar a dormir"));

        if (pergunta == 1) {
            JOptionPane.showMessageDialog(null, "Saindo do quarto, você chega a um corredor, ele leva a 3 lugares.");
            pergunta = Integer.parseInt(JOptionPane.showInputDialog("Digite a opcao:\n 1 - Para ir para cozinha.\n 2 - Para ir para sala.\n 3 - Para ir para o banheiro.\n"));
//Cozinha
            if (pergunta == 1) {
                JOptionPane.showMessageDialog(null, "Você encontra a cozinha completamente destruida, com um abertura na parede e seu carro no meio dela. Melhor ir para sala.");
                if (pergunta == 1) {
                    JOptionPane.showMessageDialog(null, "Chegando na sala você encontra um corpo no chão. Aparentemente é um velho e provavelmente está morto. Você nota uma porta no canto direito da sala. Provavelmente é uma garagem.");
                    pergunta = Integer.parseInt(JOptionPane.showInputDialog("1 - Ir para a Garagem.\n2 - Examinar o Corpo."));
                    if (pergunta == 1) {
                        JOptionPane.showMessageDialog(null, "Chegando na garagem você encontra um carro. Porém, ele está fechado.");
                        JOptionPane.showMessageDialog(null, "Você volta para a sala e examina o corpo.  Você encontra a chave de um carro em um dos bolsos. Melhor dar o fora daqui.");
                        JOptionPane.showMessageDialog(null, "Você vai para a garagem entra no carro, da partida, e vai embora.");
                        JOptionPane.showMessageDialog(null, "Obrigado por jogar!!!");
                        System.exit(0);
                    } else if (pergunta == 2) {
                        JOptionPane.showMessageDialog(null, "Você encontra a chave de um carro em um dos bolsos. Melhor dar o fora daqui.");
                        JOptionPane.showMessageDialog(null, "Você vai para a garagem entra no carro, da partida, e vai embora.");
                        JOptionPane.showMessageDialog(null, "Obrigado por jogar!!!");
                        System.exit(0);
                    }
                }
//Sala
            } else if (pergunta == 2) {
                JOptionPane.showMessageDialog(null, "Chegando na sala você encontra um corpo no chão. Aparentemente é um velho e provavelmente está morto. Você nota uma porta no canto direito da sala. Provavelmente é uma garagem.");
                pergunta = Integer.parseInt(JOptionPane.showInputDialog("1 - Ir para a Cozinha.\n2 - Ir para a Garagem.\n3 - Examinar o corpo."));
                if (pergunta == 1) {
                    JOptionPane.showMessageDialog(null, "Você encontra a cozinha completamente destruida com um carro no meio. Você nota manchas de sangue na frente completamente destruida do carro. Melhor voltar para a sala.");
                    pergunta = Integer.parseInt(JOptionPane.showInputDialog("1 -Examinar o corpo.\n2 - Ir para a garagem."));
                    if (pergunta == 1) {
                        JOptionPane.showMessageDialog(null, "Você encontra a chave de um carro em um dos bolsos. Melhor dar o fora daqui.");
                        JOptionPane.showMessageDialog(null, "Você vai para a garagem entra no carro, da partida, e vai embora.");
                        JOptionPane.showMessageDialog(null, "Obrigado por jogar!!!");
                        System.exit(0);
                    } else if (pergunta == 2) {
                        JOptionPane.showMessageDialog(null, "Chegando na garagem você encontra um carro. Porém, ele está fechado.");
                        JOptionPane.showMessageDialog(null, "Você volta para a sala e examina o corpo.  Você encontra a chave de um carro em um dos bolsos. Melhor dar o fora daqui.");
                        JOptionPane.showMessageDialog(null, "Você vai para a garagem entra no carro, da partida, e vai embora.");
                        JOptionPane.showMessageDialog(null, "Obrigado por jogar!!!");
                        System.exit(0);
                    }
                } else if (pergunta == 2) {
                    JOptionPane.showMessageDialog(null, "Chegando na garagem você encontra um carro. Porém, ele está fechado.");
                    JOptionPane.showMessageDialog(null, "Você volta para a sala e examina o corpo.  Você encontra a chave de um carro em um dos bolsos. Melhor dar o fora daqui.");
                    JOptionPane.showMessageDialog(null, "Você vai para a garagem entra no carro, da partida, e vai embora.");
                    JOptionPane.showMessageDialog(null, "Obrigado por jogar!!!");
                    System.exit(0);
                } else if (pergunta == 3) {
                    JOptionPane.showMessageDialog(null, "Você encontra a chave de um carro em um dos bolsos. Melhor dar o fora daqui.");
                    JOptionPane.showMessageDialog(null, "Você vai para a garagem entra no carro, da partida, e vai embora.");
                    JOptionPane.showMessageDialog(null, "Obrigado por jogar!!!");
                    System.exit(0);
                }
//Banheiro
            } else if (pergunta == 3) {
                JOptionPane.showMessageDialog(null, "Aparentemente é um banheiro normal.");
                pergunta = Integer.parseInt(JOptionPane.showInputDialog("1 - Usar o banheiro.\n2 - Continuar a explorar a casa."));
                if (pergunta == 1) {
                    JOptionPane.showMessageDialog(null, "Você passa tanto tempo lá, que esquece quem realmente é.");
                } else if (pergunta == 2) {
                    JOptionPane.showMessageDialog(null, "Você volta para o corredor, para onde quer ir agora?");
                    pergunta = Integer.parseInt(JOptionPane.showInputDialog("1 -Ir para a sala\n2 - Ir para a cozinha."));
                    if (pergunta == 1) {
                        JOptionPane.showMessageDialog(null, "Chegando na sala você encontra um corpo no chão. Aparentemente é um velho e provavelmente está morto. Você nota uma porta no canto direito da sala. Provavelmente é uma garagem.");
                        pergunta = Integer.parseInt(JOptionPane.showInputDialog("1 - Ir para a Cozinha.\n2 - Ir para a Garagem.\n3 - Examinar o corpo."));
                        if (pergunta == 1) {
                            JOptionPane.showMessageDialog(null, "Você encontra a cozinha completamente destruida com um carro no meio. Você nota manchas de sangue na frente completamente destruida do carro. Melhor voltar para a sala.");
                            pergunta = Integer.parseInt(JOptionPane.showInputDialog("1 - Examinar o corpo.\n2 - Ir para a garagem."));
                            if (pergunta == 1) {
                                JOptionPane.showMessageDialog(null, "Você encontra a chave de um carro em um dos bolsos. Melhor dar o fora daqui.");
                                JOptionPane.showMessageDialog(null, "Você vai para a garagem entra no carro, da partida, e vai embora.");
                                JOptionPane.showMessageDialog(null, "Obrigado por jogar!!!");
                                System.exit(0);
                            } else if (pergunta == 2) {
                                JOptionPane.showMessageDialog(null, "Chegando na garagem você encontra um carro. Porém, ele está fechado.");
                                JOptionPane.showMessageDialog(null, "Você volta para a sala e examina o corpo.  Você encontra a chave de um carro em um dos bolsos. Melhor dar o fora daqui.");
                                JOptionPane.showMessageDialog(null, "Você vai para a garagem entra no carro, da partida, e vai embora.");
                                JOptionPane.showMessageDialog(null, "Obrigado por jogar!!!");
                                System.exit(0);
                            }
                        } else if (pergunta == 2) {
                            JOptionPane.showMessageDialog(null, "Chegando na garagem você encontra um carro. Porém, ele está fechado.");
                            JOptionPane.showMessageDialog(null, "Você volta para a sala e examina o corpo.  Você encontra a chave de um carro em um dos bolsos. Melhor dar o fora daqui.");
                            JOptionPane.showMessageDialog(null, "Você vai para a garagem entra no carro, da partida, e vai embora.");
                            JOptionPane.showMessageDialog(null, "Obrigado por jogar!!!");
                            System.exit(0);
                        } else if (pergunta == 3) {
                            JOptionPane.showMessageDialog(null, "Você encontra a chave de um carro em um dos bolsos. Melhor dar o fora daqui.");
                            JOptionPane.showMessageDialog(null, "Você vai para a garagem entra no carro, da partida, e vai embora.");
                            JOptionPane.showMessageDialog(null, "Obrigado por jogar!!!");
                            System.exit(0);
                        }
                    } else if (pergunta == 2) {
                        JOptionPane.showMessageDialog(null, "Você encontra a cozinha completamente destruida, com um abertura na parede e seu carro no meio dela. Melhor ir para sala.");
                        JOptionPane.showMessageDialog(null, "Chegando na sala você encontra um corpo no chão. Aparentemente é um velho e provavelmente está morto. Você nota uma porta no canto direito da sala. Provavelmente é uma garagem.");
                        pergunta = Integer.parseInt(JOptionPane.showInputDialog("1 - Ir para a Garagem.\n2 - Examinar o Corpo."));
                        if (pergunta == 1) {
                            JOptionPane.showMessageDialog(null, "Chegando na garagem você encontra um carro. Porém, ele está fechado.");
                            JOptionPane.showMessageDialog(null, "Você volta para a sala e examina o corpo.  Você encontra a chave de um carro em um dos bolsos. Melhor dar o fora daqui.");
                            JOptionPane.showMessageDialog(null, "Você vai para a garagem entra no carro, da partida, e vai embora.");
                            JOptionPane.showMessageDialog(null, "Obrigado por jogar!!!");
                            System.exit(0);
                        } else if (pergunta == 2) {
                            JOptionPane.showMessageDialog(null, "Você encontra a chave de um carro em um dos bolsos. Melhor dar o fora daqui.");
                            JOptionPane.showMessageDialog(null, "Você vai para a garagem entra no carro, da partida, e vai embora.");
                            JOptionPane.showMessageDialog(null, "Obrigado por jogar!!!");
                            System.exit(0);
                        }
                    }
                }
            }
        } else if (pergunta == 2) {
            JOptionPane.showMessageDialog(null, "Você volta a dormir e nunca saberá o que aconteceu.");
        } else {
            JOptionPane.showMessageDialog(null, "Opção inválida");
        }
    }
}
