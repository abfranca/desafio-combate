package app;

import java.util.Scanner;

import entities.Champion;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int armor;
        int attack;
        int life;
        String name;
        int turn = 1;
        int turns;

        System.out.println("Digite os dados do primeiro campeão:");
        System.out.print("Nome: ");
        name = sc.nextLine();

        System.out.print("Vida inicial: ");
        life = sc.nextInt();

        System.out.print("Ataque: ");
        attack = sc.nextInt();

        System.out.print("Armadura: ");
        armor = sc.nextInt();
        sc.nextLine();

        Champion championA = new Champion(armor, attack, life, name);

        System.out.println("\nDigite os dados do segundo campeão:");
        System.out.print("Nome: ");
        name = sc.nextLine();

        System.out.print("Vida inicial: ");
        life = sc.nextInt();

        System.out.print("Ataque: ");
        attack = sc.nextInt();

        System.out.print("Armadura: ");
        armor = sc.nextInt();

        Champion championB = new Champion(armor, attack, life, name);

        System.out.print("\nQuantos turnos você deseja executar? ");
        turns = sc.nextInt();

        while (turns > 0 && championA.getLife() > 0 && championB.getLife() > 0) {
            championA.takeDamage(championB);
            championB.takeDamage(championA);

            System.out.printf("\nResultado do turno %d:\n", turn);
            System.out.println(championA.status());
            System.out.println(championB.status());

            turn++;
            turns--;
        }

        System.out.print("\nFIM DO COMBATE");

        sc.close();
    }
}
