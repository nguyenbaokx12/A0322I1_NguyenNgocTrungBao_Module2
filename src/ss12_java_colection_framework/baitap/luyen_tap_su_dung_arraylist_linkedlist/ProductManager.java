package ss12_java_colection_framework.baitap.luyen_tap_su_dung_arraylist_linkedlist;

import java.util.ArrayList;

public class ProductManager<E> {
    private ArrayList<Product> listProduct = new ArrayList<>();

    public void addProduct(int id, String nameProduct, double price) {
        for(Product product : listProduct){
            if(product.getId() == id){
                System.out.print("ID này đã tồn tại");
                return;
            }
        }
        listProduct.add(new Product(id, nameProduct, price));
    }

    public void showProduct(){
        System.out.print("->List product: ");
        for(Product product : listProduct){
            System.out.print("\t" +product);
        }
    }

    public int getIndex(int id){
        for (int i = 0; i < listProduct.size(); i++) {
            if (id == listProduct.get(i).getId())
                return i;
        }
        return -1;
    }

    public Product findProduct(int id) {
        int index = getIndex(id);
        return listProduct.get(index);
    }

    public void removeProduct(int id) {
        int index = getIndex(id); // TÌm vị trí index của id truyền vào
        if (index < 0 || index > listProduct.size()) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size " + listProduct.size());
        }
        listProduct.remove(index);
    }

    public void editId(int id, int newId) {
        int index = getIndex(id);
        if (index < 0 || index > listProduct.size()) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size " + listProduct.size());
        }
        listProduct.set(index, new Product(newId, listProduct.get(index).getNameProduct(), listProduct.get(index).getPrice()));
    }

    public void editName(int id, String newName) {
        int index = getIndex(id);
        if (index < 0 || index > listProduct.size()) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size " + listProduct.size());
        }
        listProduct.set(index, new Product(id, newName, listProduct.get(index).getPrice()));
    }

    public void editPrice(int id, double newPrice) {
        int index = getIndex(id);
        if (index < 0 || index > listProduct.size()) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size " + listProduct.size());
        }
        listProduct.set(index, new Product(id, listProduct.get(index).getNameProduct(), newPrice));
    }

    public int size() {
        return listProduct.size();
    }

}
