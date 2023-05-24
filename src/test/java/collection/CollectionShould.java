package collection;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionShould {
    @Test
    void be_created_easily_and_be_immutable() {
        Set<Integer> integers = Set.of(1, 2, 3); // from JAVA 9 (not null)
        //integers.add(4);

        Set<Integer> oldSet = new HashSet<>();   // until JAVA 8
        oldSet.add(1);
        oldSet.add(2);
        oldSet.add(3);

        Assertions.assertThat(integers).isEqualTo(oldSet);

        Map.of("Key1",1,"Key2",2);
        List.of(1,2,3);
    }
}
