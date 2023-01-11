package Lesson2.Ex_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Program {
    public static void main (String[] args) {

        int teamCount = 10;
        Random rand = new Random();

        List<BaseHero> teams = new ArrayList<>();
        for (int i = 0; i < teamCount; i++) {
            int val = rand.nextInt(4);
            switch (val) {
                case 0:
                    teams.add(new Priest());
                    break;
                case 1:
                    teams.add(new Magician());
                    break;
                case 2:
                    teams.add(new Druid());
                    break;
               // default:
               //     teams.add(new BaseHero());
              //      break;
            }
            System.out.println(teams.get(i).getInfo());

        }

        System.out.println();

        BaseHero hero = new Druid(); System.out.println(hero);
        Magician magician = new Magician(); System.out.println(magician);
        Priest priest = new Priest(); System.out.println(priest);
        Druid druid = new Druid(); System.out.println(druid);
    }
}