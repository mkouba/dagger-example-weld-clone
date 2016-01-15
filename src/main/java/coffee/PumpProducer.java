package coffee;

import javax.enterprise.inject.Produces;

class PumpProducer {

    @Produces
    Pump providePump(Thermosiphon pump) {
        return pump;
    }
}
