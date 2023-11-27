package jp.ac.uryukyu.ie.e235740;

public class Warrior extends Hero{

    public Warrior(String name, int hitPoint, int attack){
        super(name, hitPoint, attack);
    }

    public void attackWithWeaponSkill(LivingThing opponent){
        if(dead == false){
        int weaponAttack = (int)(getAttack() * 1.5);
        System.out.printf("%sの攻撃！ウェポンスキルを発動！%sに%dのダメージを与えた！！", getName(), opponent.getName(), weaponAttack);
        opponent.wounded(weaponAttack);
        }
    }
}
