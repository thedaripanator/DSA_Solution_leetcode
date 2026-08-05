package OOPs;

public class UseProduct {
    static void main() {
        Product p=new Product();
        p.setId(101);
        p.setName("Pen");
        p.setPrice(10);
        System.out.println("Id:"+p.getId()+"\nName:"+p.getName()+"\nPrice:"+p.getPrice());
    }
}
