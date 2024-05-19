package pertemuan10.tugas;

public class Shield extends Item implements IDeffence{
    private int damageBlock;
    public Shield(String name, String rank, int price, int damageBlock){
        super(name, rank, price);
        this.damageBlock = damageBlock;
    }

    @Override
    public void defence() {
        System.out.println("Damage Mitigated by " + damageBlock);
    }
}
