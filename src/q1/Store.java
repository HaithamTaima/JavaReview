package q1;

import java.util.ArrayList;

public class Store {
    private int store_id;
    private String store_location;
    private String store_tel;
    private ArrayList<Product> product_arr;

    public Store(int store_id, String store_location, String store_tel) {
        this.store_id = store_id;
        this.store_location = store_location;
        this.store_tel = store_tel;
        this.product_arr = new ArrayList<Product>();
    }

    public int getStore_id() {
        return store_id;
    }

    public void setStore_id(int store_id) {
        this.store_id = store_id;
    }

    public String getStore_location() {
        return store_location;
    }

    public void setStore_location(String store_location) {
        this.store_location = store_location;
    }

    public String getStore_tel() {
        return store_tel;
    }

    public void setStore_tel(String store_tel) {
        this.store_tel = store_tel;
    }

    public ArrayList<Product> getProduct_arr() {
        return product_arr;
    }

    public void setProduct_arr(ArrayList<Product> product_arr) {
        this.product_arr = product_arr;
    }

    public void add_product(Product product) {
        product_arr.add(product);
    }

    /**
     * دالة supply() هي دالة تطبيقية تستخدم لزيادة كمية المنتج في المخزن. يتطلب الدالة مدخلين، الأول هو المنتج الذي تريد زيادة كميته، و الثاني هو الكمية التي تريد زيادتها.
     *
     * الخطوة الأولى في الدالة هي التحقق من عدد المنتجات في المصفوفة product_arr الخاصة بالمخزن.
     * يتم التحقق من المنتج الذي تريد زيادة كميته، يتم التحقق من كل المنتجات
     * في المصفوفة المخزن باستخدام الحلقة for، الحلقة for هي الحلقة التي تستخدم للتصفح
     * في كل العناصر الموجودة في المصفوفة، يتم التحقق من العناصر بترتيبها الأصلي.
     *
     * الخطوة الثانية هي التحقق من المنتج الذي تريد زيادة كميته.
     * الشرط if يتأكد من أن المنتج الذي تريد زيادة كميته هو الذي يوجد في المصفوفة product_arr الخاصة بالمخزن. يتم التحقق من كل المنتجات في المصفوفة المخزن،
     * باستخدام الشرط if، يتم التحقق من المنتج الذي تريد زيادة كميته. الشرط if يتأكد من أن المنتج الذي تريد زيادة كميته هو الذي يوجد
     * @param product
     * @param quantity
     */
    public void supply(Product product, int quantity) {
        for (int i = 0; i < product_arr.size(); i++) {
            if (product_arr.get(i).getProduct_id() == product.getProduct_id()) {
                int new_quantity = product_arr.get(i).getQuantity() + quantity;
                product_arr.get(i).setQuantity(new_quantity);
                break;
            }
        }
    }

    public void count() {
        int count = product_arr.size();
        System.out.println("Number of products in store: " + count);
    }

    public void print_store() {
        System.out.println("Store ID: " + store_id);
        System.out.println("Store Location: " + store_location);
        System.out.println("Store Telephone: " + store_tel);
        for (int i = 0; i < product_arr.size(); i++) {
            product_arr.get(i).print_product();
            System.out.println("-------------------");
        }
    }
}