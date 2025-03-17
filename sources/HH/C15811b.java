package HH;

import fK.C17262o;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"LfK/o;", "format", "", "LHH/e;", "a", "(LfK/o;)Ljava/util/List;", "ktor-serialization-kotlinx"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: HH.b  reason: case insensitive filesystem */
public final class C15811b {
    public static final List<C15814e> a(C17262o oVar) {
        C17542s.j(oVar, "format");
        ArrayList arrayList = new ArrayList();
        for (C15815f a10 : C15810a.a()) {
            C15814e a11 = a10.a(oVar);
            if (a11 != null) {
                arrayList.add(a11);
            }
        }
        return arrayList;
    }
}
