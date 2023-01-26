package q1;

public class Product {
    private int product_id;
    private String product_name;
    private double price;
    private int quantity;

    public Product(int product_id, String product_name, double price, int quantity) {
        this.product_id = product_id;
        this.product_name = product_name;
        this.price = price;
        this.quantity = quantity;
    }

    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void print_product() {
        System.out.println("Product ID: " + product_id);
        System.out.println("Product Name: " + product_name);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
    }
}
/**
 * كلاس Product هو كلاس يحتوي على الخصائص الخاصة بالمنتج، كالآتي:
 *
 * product_id: هذا الخاصية يحمل رقم يمثل المنتج
 * product_name: هذا الخاصية يحمل اسم المنتج
 * price: هذا الخاصية يحمل السعر الخاص بالمنتج
 * quantity: هذا الخاصية يحمل الكمية الخاصة بالمنتج المتاحة
 * كذلك كلاس Product يحتوي على الدوال الخاصة بالإدخال و الإخراج للخصائص الأعلاه
 *
 * getter methods : هذه الدوال تستخدم للحصول على الخصائص الخاصة بالمنتج
 * setter methods : هذه الدوال تستخدم للإدخال أو تغيير الخصائص الخاصة بالمنتج
 * print_product : هذه الدالة تستخدم لطباعة الخصائص الخاصة بالمنتج.
 */
