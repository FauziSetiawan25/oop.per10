public class Main {
    public static void main(String[] args) {
        Potion potion1 = new Potion("Racun","Bad", 100, 30, 90,Potion.type.attack);
        potion1.use("heal");
        potion1.use("attack");
        Potion potion2 = new Potion("Obat", "Good", 130, 20,80 ,Potion.type.heal);
        potion2.use("attack");
        potion2.use("heal");
        Sword sword1 = new Sword("Keris", "Good", 280, 110);
        sword1.attack();
        Shield shield1 = new Shield("Tameng", "Executive", 300, 200);
        shield1.defence();
    }
}
