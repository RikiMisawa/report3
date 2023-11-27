package jp.ac.uryukyu.ie.e235740;

/**
 * 敵クラス。
 *  String name; //敵の名前
 *  int hitPoint; //敵のHP
 *  int attack; //敵の攻撃力
 *  boolean dead; //敵の生死状態。true=死亡。
 * Created by tnal on 2016/11/13.
 */
public class Enemy extends LivingThing{


    public Enemy (String name, int maximumHP, int attack){
        super(name, maximumHP, attack);
    }

    @Override
    public void wounded(int damage){
        super.wounded(damage);
        if(dead == true){
            System.out.printf("モンスター%sは倒れた\n", name);
        }
    }

    public String getName(){
        return this.name;
    }

    public void setName(String sname){
        this.name = sname;
    }


    public int getHitPoint(){
        return this.hitPoint;
    }

    public void setHitPoint(int shitpoint){
        this.hitPoint = shitpoint;
    }

    public int getAttack(){
        return this.attack;
    }

    public void setAttack(int sattack){
        this.attack = sattack;
    }

    public boolean getDead(){
        return this.dead;
    }

    public void setDead(boolean sdead){
        this.dead = sdead;
    }
}