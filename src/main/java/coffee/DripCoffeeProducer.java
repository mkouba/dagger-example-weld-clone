package coffee;

import javax.enterprise.inject.Produces;
import javax.inject.Singleton;

class DripCoffeeProducer {

    @Produces
    @Singleton
    Heater provideHeater() {
        return new ElectricHeater();
    }
}
