package Part4;

import java.util.Random;


public class BaseHero {
    protected static int number;
    protected static Random r;

    protected  String name;
    protected int hp;
    protected int maxHp;

    static {
        BaseHero.number = 0;
        BaseHero.r = new Random();
    }
        
        public BaseHero(String name, int hp){
            this.name = name;
            this.hp = hp;
            this.maxHp = hp;
        }
    
        public BaseHero() {
            this(String.format("Hero_Priest #%d", ++BaseHero.number),
            BaseHero.r.nextInt(100, 200));
        }

        public String getInfo(){
            return String.format("Name: %s Hp: %d Type: %s",
            this.name, this.hp, this.getClass().getSimpleName());
        }

        public void healed(int Hp){
            this.hp = Hp + this.hp > this.maxHp ? this.maxHp : Hp + this.maxHp;
        }

        public void GetDamage(int damage){
            if(this.hp - damage > 0){
                this.hp -=damage;
            }
        }  
        
        public void Attack(BaseHero target){ // 1) выносим метод атаки в базовый класс. В качестве аргумента методу будет передоваться переменная 
                                             //    базового типа tartget
            int damage = BaseHero.r.nextInt(10, 20); // 2) с помощью рандомных числа определяем урон атакуемого
            target.GetDamage(damage);
        }
}
