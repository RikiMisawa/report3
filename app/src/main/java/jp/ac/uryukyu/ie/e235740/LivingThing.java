package jp.ac.uryukyu.ie.e235740;

public class LivingThing {
    protected String name;
    protected int hitPoint;
    protected int attack;
    protected boolean dead;

    public LivingThing(String name, int hitPoint, int attack){
        this.setName(name);
        this.setHitPoint(hitPoint);
        this.setAttack(attack);
        this.setDead(false);
        System.out.printf("%sのHPは%dです。攻撃力は%dです。\n", name, hitPoint, attack);
    }

    public void attack(LivingThing opponent){
        if(this.dead == false){
        int damage = (int)(Math.random() * this.attack);
        System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", this.name, opponent.getName(), damage);
        opponent.wounded(damage);
        }
    }

    public void wounded(int damage){
        this.hitPoint -= damage;
        if( this.hitPoint <= 0 ) {
            this.dead = true;
            System.out.printf("勇者%sは道半ばで力尽きてしまった。\n", name);
        }
    }

    

    public boolean isDead(){
        return dead;
    }

    public String getName(){
        return name;
    }

    public int getHitPoint(){
        return hitPoint;
    }

    public int getAttack(){
        return attack;
    }

    public void setName(String sname){
        this.name = sname;
    }

    public void setAttack(int sattack){
        this.attack = sattack;
    }

    public void setDead(boolean sdead){
        this.dead = sdead;
    }

    public void setHitPoint(int shitpoint){
        this.hitPoint = shitpoint;
    }


}