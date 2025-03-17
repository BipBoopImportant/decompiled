package ej;

import XH.x;
import XH.y;
import androidx.work.C7037f;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001b\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0019\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\u0006*\u00020\u0005H\u0000¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/work/f$a;", "", "storeId", "a", "(Landroidx/work/f$a;Ljava/lang/String;)Landroidx/work/f$a;", "Landroidx/work/f;", "LXH/x;", "b", "(Landroidx/work/f;)Ljava/lang/Object;", "scanandgo-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: ej.a  reason: case insensitive filesystem */
public final class C11243a {
    public static final C7037f.a a(C7037f.a aVar, String str) {
        C17542s.j(aVar, "<this>");
        C17542s.j(str, "storeId");
        return aVar.i("store_id", str);
    }

    public static final Object b(C7037f fVar) {
        C17542s.j(fVar, "<this>");
        try {
            x.a aVar = x.f139812b;
            String g10 = fVar.g("store_id");
            if (g10 != null) {
                return x.b(g10);
            }
            throw new IllegalArgumentException("Required value was null.");
        } catch (Throwable th2) {
            x.a aVar2 = x.f139812b;
            return x.b(y.a(th2));
        }
    }
}
