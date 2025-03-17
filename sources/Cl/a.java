package Cl;

import androidx.compose.foundation.layout.J;
import androidx.compose.ui.d;
import c2.h;
import c2.r;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import u0.C5974I;
import u0.C5987k;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a)\u0010\u0007\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/compose/ui/d;", "", "key", "Lu0/I;", "lazyGridState", "Lc2/d;", "density", "a", "(Landroidx/compose/ui/d;Ljava/lang/String;Lu0/I;Lc2/d;)Landroidx/compose/ui/d;", "uicomposables_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class a {
    public static final d a(d dVar, String str, C5974I i10, c2.d dVar2) {
        h hVar;
        Object obj;
        Integer num;
        C17542s.j(dVar, "<this>");
        C17542s.j(str, "key");
        C17542s.j(i10, "lazyGridState");
        C17542s.j(dVar2, "density");
        Iterator it = i10.v().i().iterator();
        while (true) {
            hVar = null;
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (C17542s.e(((C5987k) obj).getKey(), str)) {
                break;
            }
        }
        C5987k kVar = (C5987k) obj;
        Integer valueOf = kVar != null ? Integer.valueOf(kVar.g()) : null;
        ArrayList arrayList = new ArrayList();
        for (Object next : i10.v().i()) {
            int g10 = ((C5987k) next).g();
            if (valueOf != null && g10 == valueOf.intValue()) {
                arrayList.add(next);
            }
        }
        if (arrayList.size() == 1 || arrayList.isEmpty()) {
            return dVar;
        }
        Iterator it2 = arrayList.iterator();
        if (!it2.hasNext()) {
            num = null;
        } else {
            num = Integer.valueOf(r.g(((C5987k) it2.next()).a()));
            while (it2.hasNext()) {
                Integer valueOf2 = Integer.valueOf(r.g(((C5987k) it2.next()).a()));
                if (num.compareTo(valueOf2) < 0) {
                    num = valueOf2;
                }
            }
        }
        if (num != null) {
            hVar = h.m(dVar2.H(num.intValue()));
        }
        return J.i(dVar, hVar != null ? hVar.G() : h.f23031b.c());
    }
}
