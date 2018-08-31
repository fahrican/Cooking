package helper;

import model.Condiment;

import java.util.Comparator;

public class UnitComparator implements Comparator<Condiment> {

    public static final int TEASPOON = 1;
    public static final int GRAM = 2;
    public static final int DEKAGRAM = 3;
    public static final int KILOGRAM = 4;
    public static final int DEFAULT = 5;

    @Override
    public int compare(Condiment o1, Condiment o2) {

        return getUnitFromCondiment(o1) - getUnitFromCondiment(o2);
    }

    private int getUnitFromCondiment(Condiment condiment){

        switch (condiment.getAmount().getUnit()){

            case "teaspoon": return TEASPOON;
            case "gram": return GRAM;
            case "dekagram": return DEKAGRAM;
            case "kilogram": return KILOGRAM;
            default: return DEFAULT;
        }
    }
}
