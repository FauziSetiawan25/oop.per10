package pertemuan10.tugas;

public class Potion extends Item implements IAttack,IDeffence{
    private int duration, effectPoint;
    enum type{
        attack,
        heal
    }
    private type tipe;
    public Potion(String name, String rank, int price, int duration, int effectPoint, type tipe){
        super(name, rank, price);
        this.duration = duration;
        this.effectPoint = effectPoint;
        this.tipe = tipe;
    }

    @Override
    public void attack() {
        System.out.println("Damage dealt by "+ effectPoint);
    }

    @Override
    public void defence() {
        System.out.println("Healed by " + effectPoint);
    }

    public void use(String tipePosison){
        if(tipePosison == tipe.toString()){
            switch (tipe){
                case attack:
                    attack();
                    break;
                case heal:
                    defence();
                    break;
            }
        }else {
            System.out.println("Poison type is not " + tipePosison);
        }

    }
}
