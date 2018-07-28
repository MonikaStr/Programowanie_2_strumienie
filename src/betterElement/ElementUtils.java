package betterElement;

import betterString.TwoStringPredicate;

public class ElementUtils {
    public static <T> T betterEntry(T object1, T object2, TwoElementsPredicate<T> twoElementsPredicate) {
        if (twoElementsPredicate.compare(object1, object2)) {
            return object1;
        }
        else {
            return object2;
        }
    }
}
