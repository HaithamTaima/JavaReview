package q1;

public class Main {
    public static void main(String[] args) {
        /**
         * هذه الخطوة تهدف إلى انشاء كائنين من نوع Product. كل كائن يحتوي على الخصائص التالية: رقم المنتج،
         * اسم المنتج، سعر المنتج، كمية المنتج. يتم تعريف الخصائص الأولية للكائنين عند إنشائهم، و يتم تخصيص القيم الأولية لهم مثلا الخطوة الأولى يتم تعريف الكائن
         * الأول بأنه يحمل الرقم 1 كرقم المنتج و يحمل اسم "Product 1" كاسم المنتج و يحمل 10.5 كسعر المنتج و يحمل 50 ككمية المنتج , الخطوة الثانية
         * يتم تعريف الكائن الثاني بأنه يحمل الرقم 2 كرقم المنتج و يحمل اسم "Product 2" كاسم المنتج و يحمل 15.0 كسعر المنتج و يحمل 30 ككمية المنتج
         */
        // Create 2 product objects
        Product product1 = new Product(1, "Product 1", 10.5, 50);
        Product product2 = new Product(2, "Product 2", 15.0, 30);
/**
 * هذه الخطوة تهدف إلى تغيير القيم الأولية التي تم تعريفها في الخطوة
 * الأولى للكائنين product1 و product2 باستخدام الدوال الخاصة بالإدخال (setter methods). يتم استدعاء الدالة setProduct_name() على
 * الكائن الأول لتغيير اسم المنتج الأصلي "Product 1" إلى "New Product 1"، يتم استدعاء الدالة setPrice() على الكائن الأول
 * لتغيير السعر الأصلي 10.5 إلى 12، يتم استدعاء الدالة setQuantity() على الكائن الأول لتغيير الكمية الأصلية 50 إلى 60.
 * هذه الخطوة تطبق أيضًا على الكائن الثاني يتم استدعاء الدالة setProduct_name() على الكائن الثاني لتغيير اسم المنتج الأصلي
 * "Product 2" إلى "New Product 2"، يتم استدعاء الدالة setPrice() على الكائن الثاني لتغيير السعر الأصلي 15.0 إلى 18،
 * يتم استدعاء الدالة setQuantity() على الكائن الثاني لتغيير الكمية الأصلية 30 إلى 40.
 */
        // Set values for product objects using setter methods
        product1.setProduct_name("New Product 1");
        product1.setPrice(12.0);
        product1.setQuantity(60);

        product2.setProduct_name("New Product 2");
        product2.setPrice(18.0);
        product2.setQuantity(40);

        // Create store object
        /**
         * هذه الخطوة تهدف إلى انشاء كائن من نوع Store الذي يحتوي
         * على الخصائص التالية: رقم المخزن، موقع المخزن، هاتف المخزن. يتم تعريف الخصائص الأولية للكائن عند إنشائه، و يتم تخصيص القيم الأولية
         * له مثلا يتم تعريف الكائن بأنه يحمل الرقم 1 كرقم المخزن و يحمل "Store Location" كموقع المخزن و يحمل "123-456-7890" كهاتف المخزن.
         */
        Store store = new Store(1, "Store Location", "123-456-7890");

        // Add products to store using add_product() method
        /**
         * هذه الخطوة تهدف إلى إضافة الكائنين الذين تم انشاؤهم في الخطوة الأولى (product1 و product2) إلى الكائن الذي تم
         * انشاؤه في الخطوة الثالثة (store). يتم استدعاء الدالة add_product() على الكائن store و تمرير
         * كائن product1 كأول كائن يتم إضافته، و تمرير كائن product2 كثاني كائن يتم إضافته، هذا يعني ان الكائن
         * product1 و product2 ستضاف الى مصفوفة product_arr الخاصة بالكائن store.
         *
         * هذه هي الخطوات الرئيسية التي تشكل البرنامج, لكن يمكن استدعاء الدوال الأخرى كدالة count() لط
         */
        store.add_product(product1);
        store.add_product(product2);

        // Print store information and products in store using print_store() method
        store.print_store();

    }
}

