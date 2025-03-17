package P0;

import f5.C7847c;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import p1.b1;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001d\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"", "Lf5/c;", "foldingFeatures", "LP0/d;", "a", "(Ljava/util/List;)LP0/d;", "adaptive_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class a {
    public static final d a(List<? extends C7847c> list) {
        ArrayList arrayList = new ArrayList();
        boolean z10 = false;
        for (C7847c cVar : list) {
            if (C17542s.e(cVar.a(), C7847c.b.f51119d) && C17542s.e(cVar.getState(), C7847c.C0840c.f51123d)) {
                z10 = true;
            }
            arrayList.add(new c(b1.e(cVar.getBounds()), C17542s.e(cVar.getState(), C7847c.C0840c.f51122c), C17542s.e(cVar.a(), C7847c.b.f51118c), cVar.b(), C17542s.e(cVar.c(), C7847c.a.f51115d)));
        }
        return new d(z10, arrayList);
    }
}
