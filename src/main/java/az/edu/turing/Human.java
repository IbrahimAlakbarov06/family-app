package az.edu.turing;

import org.w3c.dom.ls.LSOutput;

import java.time.DayOfWeek;
import java.util.Arrays;
import java.util.Objects;
import java.util.Random;

public class Human {
    private String name;
    private String surname;
    private int birthdayYear;
    private int IQ;
    private String[][] schedule;
    private Family family;

    // Constructors
    public Human() {}

    public Human(String name, String surname, int birthdayYear) {
        this.name = name;
        this.surname = surname;
        this.birthdayYear = birthdayYear;
    }

    public Human(String name, String surname, int birthdayYear, int IQ, Pet pet, Human father, Human mother, String[][] schedule) {
        this(name, surname, birthdayYear);
        this.IQ =IQ;
        this.schedule = schedule;
    }

    // Getters and Setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getSurname() { return surname; }
    public void setSurname(String surname) { this.surname = surname; }

    public int getBirthdayYear() { return birthdayYear; }
    public void setBirthdayYear(int year) { this.birthdayYear = year; }

    public int getIq() { return IQ; }
    public void setIq(int iq) { this.IQ = iq; }

    public String[][] getSchedule() { return schedule; }
    public void setSchedule(String[][] schedule) { this.schedule = schedule; }

    public Family getFamily() { return family; }
    public void setFamily(Family family) { this.family = family; }


    DayOfWeek days = DayOfWeek.FRIDAY;



    @Override
    public void finalize() {
        System.out.println("Human object is being garbage collected.");
    }


//    public void greetPet() {
//        if (pet != null) {
//            System.out.println("Hello " + pet.getNickname());
//        } else {
//            System.out.println("I don't have a pet to greet.");
//        }
//    }

//    public void describePet() {
//        if (pet != null) {
//            String sly = pet.getTrickLevel() > 50 ? "very sly" : "almost not sly";
//            System.out.println("I have a " + pet.getSpecies() + " who is " + pet.getAge() + " years old, and is " + sly);
//        } else {
//            System.out.println("I don't have a pet to describe.");
//        }
//    }
//
//    public boolean feedPet(boolean time) {
//        if (pet == null) {
//            System.out.println("I don't have a pet to feed.");
//            return false;
//        }
//
//        if (time) {
//            System.out.println("Hm... I will feed " + name + "'s " + pet.getSpecies());
//            return true;
//        } else {
//            Random random = new Random();
//            int randomValue = random.nextInt(101); // Generate a random number between 0-100
//            if (pet.getTrickLevel() > randomValue) {
//                System.out.println("Hm... I will feed " + name + "'s " + pet.getSpecies());
//                return true;
//            } else {
//                System.out.println("I think " + name + "'s " + pet.getSpecies() + " is not hungry.");
//                return false;
//            }
//        }
//    }

    // Overridden toString
    @Override
    public String toString() {
        return "Human{name='" + name + "', " +
                "surname='" + surname + "', birthdayYear=" + birthdayYear + ", IQ=" + IQ +", schedule=" + Arrays.toString(schedule) +
                '}';
    }

    // Overriding equals() and hashCode() for comparison
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return birthdayYear == human.birthdayYear && IQ == human.IQ &&
                name.equals(human.name) && surname.equals(human.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, birthdayYear, IQ, Arrays.deepHashCode(schedule), family);
    }
}
