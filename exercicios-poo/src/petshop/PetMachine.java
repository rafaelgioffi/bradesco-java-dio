package petshop;

public class PetMachine {
    private boolean clean = true;
    private int water = 30;
    private int shampoo = 10;
    private Pet pet;

    public void takeShowerInAPet() {
        if (this.pet == null) {
            System.out.println("Coloque o Pet na máquina para iniciar o banho...");
            return;
        }

        this.water -= 10;
        this.shampoo -= 2;
        pet.setClean(true);
        System.out.println("Pet " + pet.getName() + " limpo!");
    }

    public void addWater() {
        if (water == 30 || water > 28) {
            System.out.println("A capacidade de água está no máximo!");
            return;
        }
        water += 2;
    }

    public void addShampoo() {
        if (shampoo == 10 || shampoo > 8) {
            System.out.println("A capacidade de shampoo está no máximo!");
            return;
        }
        shampoo += 2;
    }

    public int getWater() {
        return water;
    }

    public int getShampoo() {
        return shampoo;
    }

    public boolean isClean() {
        return clean;
    }

    public void setClean(boolean clean) {
        this.clean = clean;
    }

    public boolean hasPet() {
        return pet != null;
    }

    public void setPet(Pet pet) {
        if (!this.clean) {
            System.out.println("É necessário limpar a máquina antes de usá-la!");
            return;
        }

        if (hasPet()) {
            System.out.println(pet.getName() + " adcionado a máquina!");
            return;
        }

        this.pet = pet;
    }

    public void throwPet() {
        this.clean = this.pet.isClean();
            System.out.println("O(a) pet " + this.pet.getName() + " está limpo.");
            this.pet = null;
        }

    public void cleanMachine() {
        this.water -= 10;
        this.shampoo -= 2;
        setClean(true);
        System.out.println("Máquina limpa!");
    }
}
