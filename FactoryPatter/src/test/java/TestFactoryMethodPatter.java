import com.huaxin.product.Pizza;
import com.huaxin.product_.Pizza_;
import com.huaxin.store.ChicagoPizzaStore;
import com.huaxin.store.NYPizzaStore;
import com.huaxin.store.PizzaStore;
import org.junit.Test;

public class TestFactoryMethodPatter {

    @Test
    public void testPizzaStore() {
        PizzaStore nyPizzaStore = new NYPizzaStore();
        PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();

        Pizza nyPizza= nyPizzaStore.orderPizza("clam");
        System.out.println("Jone order a pizza named "+nyPizza.getName()+"\n");

        Pizza chPizza = chicagoPizzaStore.orderPizza("cheese");
        System.out.println("Yohn order a pizza named "+chPizza.getName()+"\n");
    }

    @Test
    public void testPizzaStore_(){
        com.huaxin.store_.PizzaStore nyPizzaStore =new com.huaxin.store_.NYPizzaStore();
        Pizza_ nyPizza = nyPizzaStore.orderPizza("cheese");
        System.out.println("Jone order a pizza named "+nyPizza.getName()+"\n");

    }
}
