public class Fighter {

    String name;
    int damage;
    int weight;
    int health;
    int dodge;

    public Fighter(String name, int health, int damage, int weight, int dodge) {

        this.name = name;
        this.health = health;
        this.damage = damage;
        this.weight = weight;
        this.dodge = dodge;
    }

    public int hit(Fighter foe) {

        System.out.println("---------------");
        System.out.println(this.name + "-->" + foe.name + " 'a " + this.damage + " Hasar vurdu!");

        if (foe.dodge()) {
            System.out.println(foe.name + " Hasarı blokladı !");
            return foe.health;
        }
        if (foe.health - this.damage < 0) {
            return 0;
        }
        return foe.health - this.damage;
    }

    public boolean dodge() {
        double randomValue = Math.random() * 100;
        return randomValue <= this.dodge;
    }
}
