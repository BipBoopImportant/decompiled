package O;

import H2.i;
import com.sugarcube.core.logger.DslKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Locale;

public class a0 {
    public static void a(Collection<Integer> collection, int i10) {
        i.b(collection.contains(Integer.valueOf(i10)), String.format(Locale.US, "Effects target %s is not in the supported list %s.", new Object[]{b(i10), c(collection)}));
    }

    public static String b(int i10) {
        ArrayList arrayList = new ArrayList();
        if ((i10 & 4) != 0) {
            arrayList.add("IMAGE_CAPTURE");
        }
        if ((i10 & 1) != 0) {
            arrayList.add("PREVIEW");
        }
        if ((i10 & 2) != 0) {
            arrayList.add("VIDEO_CAPTURE");
        }
        return String.join(DslKt.INDICATOR_SEPARATOR, arrayList);
    }

    private static String c(Collection<Integer> collection) {
        ArrayList arrayList = new ArrayList();
        for (Integer intValue : collection) {
            arrayList.add(b(intValue.intValue()));
        }
        return "[" + String.join(", ", arrayList) + "]";
    }

    public static int d(int i10) {
        int i11 = 0;
        while (i10 != 0) {
            i11 += i10 & 1;
            i10 >>= 1;
        }
        return i11;
    }

    public static boolean e(int i10, int i11) {
        return (i10 & i11) == i11;
    }
}
