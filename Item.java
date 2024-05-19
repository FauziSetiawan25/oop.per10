package pertemuan10.tugas;

public abstract class Item {
    private String name, rank;
    private int price;

    public Item(String name, String rank, int price){
        this.name = name;
        this.rank = rank;
        this.price = price;
    }
}
