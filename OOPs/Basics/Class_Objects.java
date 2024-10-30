import java.util.Scanner;

class Product {
    int id;
    String name;
    double price;

    void setProduct(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    void getProduct() {
        // System.out.println("Id: " + id + "\nName: " + name + "\nPrice: " + price);
        System.out.println("( id=" + id + ", name=\"" + name + "\", price=" + price + " )");
    }
}

public class Class_Objects {
    public static void main(String[] args) {
        // Product p = new Product();

        // p.setProduct(101, "Hair Dryer", 2300);
        // p.getProduct();

        System.out.print("Enter the size of the array: ");
        Product[] p = new Product[Integer.parseInt(System.console().readLine())];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < p.length; i++) {
            System.out.print("Enter id: ");
            int id = sc.nextInt();
            
            sc.nextLine();
            System.out.print("Enter name: ");
            String name = sc.nextLine();
            
            System.out.print("Enter price: ");
            double price = sc.nextDouble();

            p[i] = new Product();
            p[i].setProduct(id, name, price);
        }

        for (Product product : p) {
            product.getProduct();
        }
    }
}
