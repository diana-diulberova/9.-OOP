package v1;

import java.util.ArrayList;
import java.util.List;

import v1.Healers.*;
import v1.Warriors.*;

public class Program {
    public static void main(String[] args) {
        
        List<Hero> team1 = new ArrayList<>();
        team1.add(new Druid());
        team1.add(new Shaman());
        team1.add(new Paladin());
        team1.add(new Druid());

        // team1.get(0).attack

        var h = team1.get(0);

        if (h instanceof Warrior) {
            ((Warrior) h).attack(null);
        }
        else if (h instanceof Healer) {
            ((Healer) h).healing(null);
        } else {
            //....
        }

        List<Warrior> team2 = new ArrayList<>();
        //team2.add(new Druid());
        team2.add(new Paladin());
        team2.add(new Knight());

        team2.get(0).attack(null);

        List<Healer> team3 = new ArrayList<>();
        //team2.add(new Paladin());
        team3.add(new Druid());
        team3.add(new Shaman());

        team3.get(0).healing(null);
    }
}