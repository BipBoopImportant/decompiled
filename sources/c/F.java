package C;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public final /* synthetic */ class F {
    public static /* synthetic */ List a(Object[] objArr) {
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            Objects.requireNonNull(obj);
            arrayList.add(obj);
        }
        return Collections.unmodifiableList(arrayList);
    }
}
