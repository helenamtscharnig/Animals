package at.campus02.tscharnig;

import java.util.Objects;

public class Animal {

    public String name;
    public int age;
    public String species;
    public String animalLoud;

    public Animal(String name, int age, String species, String animalLoud) {
        this.name = name;
        this.age = age;
        this.species = species;
        this.animalLoud = animalLoud;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getAnimalLoud() {
        return animalLoud;
    }

    public void setAnimalLoud() {
        this.animalLoud = animalLoud;
    }

    public String giveAnimalLoud() {
        setAnimalLoud();
        System.out.println("Animal loud " + getAnimalLoud());
        return animalLoud;

    }

    public String getNameAndAge() {
        String result = "The name of the animal is "+name+" and it is "+age+" years old.";
        System.out.println("The name of the animal is "+name+" and it is "+age+" years old.");
        return result;
    }

    public String ageCategory() {
        String cat = "";
        if(getAge()<=2){
            cat = "baby animal";
        }
        else if (getAge()<=4){
            cat = "young animal";
        }
        else if (getAge()>4){
            cat = "old animal";
        }
        System.out.println("The age categorie is " + cat);
        return cat;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return age == animal.age && Objects.equals(name, animal.name) && Objects.equals(species, animal.species) && Objects.equals(animalLoud, animal.animalLoud);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, species, animalLoud);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", species='" + species + '\'' +
                ", animalLoud='" + animalLoud + '\'' +
                '}';
    }
    //
}
