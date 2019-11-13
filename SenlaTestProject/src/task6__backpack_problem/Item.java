package task6__backpack_problem;

class Item {
    private String name;
    private int weigth;
    private int price;
    public Item(String name, int weigth, int price){
        this.name=name;
        this.weigth=weigth;
        this.price=price;
    }
    public double pricePerUnitOfWeigth(){
        return price/(double)weigth;
    }
    public int getWeigth(){
        return weigth;
    }
    public int getPrice(){
        return price;
    }
    public String getName(){
        return name;
    }
    public String toString(){
        return "{Name: "+name+", weigth: "+weigth+", price: "+price+"}";
    }
}
