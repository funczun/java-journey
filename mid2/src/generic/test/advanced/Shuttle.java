package generic.test.advanced;

import generic.test.advanced.unit.BioUnit;

public class Shuttle<T extends BioUnit> {
    private T unit;

    public void in(T unit) {
        this.unit = unit;
    }

    public void showInfo() {
        System.out.println("이름: " + unit.getName() +", HP: " + unit.getHp());
    }

    public T out() {
        return unit;
    }
}
