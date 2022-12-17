package aincorp.yamock.competition;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CollectUniquesTest {

    public final CollectUniques collectUniques = new CollectUniques();

    @Test
    public void test() {
        assertEquals(Arrays.asList(2, 4, 8), collectUniques.uniques(Arrays.asList(2, 4, 8, 8, 8)));
    }

}