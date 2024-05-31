package entities;

public class Champion {

    private int armor;
    private int attack;
    private int life;
    private String name;

    public Champion(int armor, int attack, int life, String name) {
        this.armor = armor;
        this.attack = attack;
        this.life = life;
        this.name = name;
    }

    public int getAttack() {
        return this.attack;
    }

    public int getLife() {
        return this.life;
    }

    public String status() {
        String status = this.name +
                        ": " +
                        this.life +
                        " de vida";
        
        if (this.life == 0) {
            return status + " (morreu)";
        }

        return status;
    }

    public void takeDamage(Champion other) {
        int damageTaken = other.getAttack() - this.armor;

        if (damageTaken <= 0) {
            damageTaken = 1;
        }

        if (this.life - damageTaken < 0) {
            this.life = 0;
        } else {
            this.life -= damageTaken;
        }
    }

}
