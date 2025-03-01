package generic.test.advanced;

import generic.test.advanced.unit.BioUnit;

public class UnitUtil {
    public static <T extends BioUnit> T maxHp(T m1, T m2) {
        if (m1.getHp() > m2.getHp()) {
            return m1;
        } else if (m1.getHp() < m2.getHp()) {
            return m2;
        }
        return m1;
    }
}
