package coffee;

import javax.enterprise.inject.Vetoed;

@Vetoed // See also DripCoffeeProducer
class ElectricHeater implements Heater {

    boolean heating;

  @Override public void on() {
    System.out.println("~ ~ ~ heating ~ ~ ~");
    this.heating = true;
  }

  @Override public void off() {
    this.heating = false;
  }

  @Override public boolean isHot() {
    return heating;
  }
}
