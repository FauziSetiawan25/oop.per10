package pertemuan10.tugas;

public class Sword extends Item implements IAttack{
    private int damage;
    public Sword(String name, String rank, int price, int damage){
        super(name, rank, price);
        this.damage = damage;
    }
    @Override
    public void attack() {
        System.out.println("Damage dealt by "+ damage);
    }
}
