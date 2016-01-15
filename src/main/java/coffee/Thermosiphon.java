package coffee;

import javax.enterprise.inject.Typed;
import javax.inject.Inject;

@Typed(Thermosiphon.class) // Restrict the bean types - PumpProducer also consumes Pump
class Thermosiphon implements Pump {

    private final Heater heater;

    @Inject
    Thermosiphon(Heater heater) {
        this.heater = heater;
    }

    @Override
    public void pump() {
        if (heater.isHot()) {
            System.out.println("=> => pumping => =>");
        }
    }
}
