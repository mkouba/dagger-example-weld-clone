package coffee;

import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;

public class CoffeeApp {

    public static void main(String[] args) {
        try (WeldContainer container = new Weld().disableDiscovery().packages(CoffeeMaker.class).initialize()) {
            container.select(CoffeeMaker.class).get().brew();
        }
    }
}
