package Part4;

import java.util.Random;

public class Priest extends BaseHero{
    
    private int elixir;
    private int maxElixir;

    static {
        Priest.number = 0;
        Priest.r = new Random();
    }

    public Priest() {
        super(String.format("Hero_Priest #%d", ++Priest.number),
            Priest.r.nextInt(100, 200));
        this.maxElixir = Priest.r.nextInt(50, 150);
        this.elixir = maxElixir;
    }

    /* public int Attack() {
        int damage = BaseHero.r.nextInt(20, 30);
        this.elixir -= (int) (damage * 0.8);
        if(elixir < 0) return 0;
        else return damage;
    } */
    
    public String getInfo(){
        return String.format("%s Elixir: %d", super.getInfo(), 
        this.elixir);
    }

    public void healed(int Hp){
        this.hp = Hp + this.hp > this.maxHp ? this.maxHp : Hp + this.maxHp;
    }

    public void GetDamage(int damage){
        if(this.hp - damage > 0){
            this.hp -=damage;
        }
    }

}
