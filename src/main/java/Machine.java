import java.util.List;

public class Machine {
    private List<Product> list;

    public Machine(List<Product> list){
        this.list = list;

    }

    public Product getProductByName(String name){
        for (Product item: list){
            if (name.equals(item.getName())){
                return item;
            }
        }
        throw new IllegalStateException("Product not found");
    }
}
