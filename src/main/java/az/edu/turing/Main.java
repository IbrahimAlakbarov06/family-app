package az.edu.turing;

public class Main {
    public static void main(String[] args) {
        Pet rocky = new Pet(Species.Dog, "Rocky", 5, 74 , new String[]{"eat", "sleep", "play"} );
        Human mother = new Human("sara","scofield", 1995);
        Human father = new Human("micheal", "scofield", 1990);

        String[][] childSchedule = {
                {"Monday", "Go to school"},
                {"Tuesday", "Play soccer"}
        };
        Human child = new Human("Michael", "Karleone", 1977, 90, rocky, mother, father, childSchedule);

        System.out.println(mother);
        System.out.println(father);
        System.out.println(child);

        child.greetPet();
        child.describePet();
        rocky.eat();
        rocky.respond();
        rocky.foul();

        boolean fed = child.feedPet(false);
        System.out.println("Pet was fed: " + fed);


    }
}
