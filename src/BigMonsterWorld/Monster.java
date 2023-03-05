package BigMonsterWorld;

public class Monster {
    String monsterName;
    int attackDamage;

    public Monster(){}

    public Monster(String name , int power){
        this.monsterName = name;
        this.attackDamage = power;
    }

    void growl(){
        System.out.println("Monster" + monsterName + " growled");
    }

    void attack(){
        System.out.println("Monster " + monsterName + " attacked with damage " + attackDamage);
    }
}
