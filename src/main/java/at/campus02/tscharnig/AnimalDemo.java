package at.campus02.tscharnig;

public class AnimalDemo {
    public static void main(String[] args) {
        Animal tier1 = new Animal("Mufasa",1,"Löwe","Rawrrr"  );
        Animal tier2 = new Animal("Speedy", 4, "Katze", "Miau");
        Animal tier3 = new Animal("Mamma Afrika", 37, "Elefant", "Tröt");

        tier1.ageCategory();
        tier1.giveAnimalLoud();
        tier1.getNameAndAge();

        tier2.ageCategory();
        tier2.giveAnimalLoud();
        tier2.getNameAndAge();

        tier3.ageCategory();
        tier3.giveAnimalLoud();
        tier3.getNameAndAge();
    }

}
