package az.edu.turing;

import java.util.Arrays;
import java.util.Objects;

public class Family {
    private Human mother;
    private Human father;
    private Human[] children;
    private Pet pet;

//    Make a constructor in the Family
//– The only condition for creating a new family is the presence of two
//    parents, with the parents being referred to the current new family
//    and the family being created with an empty array of children
    public Family(){

    }

    public Human getMother() {
        return mother;
    }

    public void setMother(Human mother) {
        this.mother = mother;
    }

    public Human getFather() {
        return father;
    }

    public void setFather(Human father) {
        this.father = father;
    }

    public Human[] getChildren() {
        return children;
    }

    public void setChildren(Human[] children) {
        this.children = children;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }


    public void addChild(Human child){

        Human[] newChildren = new Human[children.length+1];
        for (int i = 0; i< children.length; i++){
            newChildren[i]= children[i];
        }
        newChildren[children.length] = child;

        children = newChildren;
        child.setFamily(this);
    }

    public boolean deleteChildren(int index){
        if (index<0|| index> children.length){
            return false;
        }

        Human[] newChildren = new Human[children.length-1];

        for(int i = 0; i< children.length; i++){
            for (int j = 0; j< children.length; j++){
                if (i != index) {
                    newChildren[j++] = children[i];
                }
            }
        }
        children = newChildren;
        return true;
    }


    public int countFamily(){
        return 2 + children.length;
    }

    @Override
    public void finalize() {
        System.out.println("Family object is being garbage collected.");
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Family family = (Family) obj;
        return Objects.equals(mother, family.mother) && Objects.equals(father, family.father) && Objects.deepEquals(children, family.children) && Objects.equals(pet, family.pet);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mother, father, Arrays.hashCode(children), pet);
    }

    @Override
    public String toString() {
        return "Family{" +
                "mother=" + mother +
                ", father=" + father +
                ", children=" + Arrays.toString(children) +
                ", pet=" + pet +
                '}';
    }
}
