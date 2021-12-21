package org.example.ds.operation;

public class OperationTreat implements IOperationTreat {
    @Override
    public boolean found(int[] tab, int n) {
        int inf = 0;
        int sup = tab.length - 1;
        int middle = 0;
        while (inf < sup) {
            middle = (inf + sup) / 2;
            if (n < tab[middle])
                sup = middle;
            else
                inf = middle + 1;
        }
        return n == tab[middle];
    }

    @Override
    public int sumTwoPositiveNumbers(int a, int b) {
        if (a < 0 || b < 0)
            throw new IllegalArgumentException("Les nombres doivent être positifs.");

        return a + b;
    }
}
