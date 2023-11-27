package jp.ac.uryukyu.ie.e235740;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;


public class WarriorTest {
    @Test
    void attackWithWeaponTest(){
        Warrior warrior = new Warrior("戦士", 100, 10);
        Enemy enemy = new Enemy("モンスター", 30, 0);

        for(int i=0; i<2; i++){
            warrior.attackWithWeaponSkill(enemy);
        }
        assertEquals(0, enemy.getHitPoint());

    }
}
