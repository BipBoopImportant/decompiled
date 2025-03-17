package Eg;

import Cg.a;
import Eg.b;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0001¢\u0006\u0004\b\u0002\u0010\u0003\u001a'\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004*\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"LCg/a;", "", "c", "(LCg/a;)I", "", "LEg/b$a;", "rating", "b", "(Ljava/util/List;I)Ljava/util/List;", "inappfeedback_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class d {
    /* access modifiers changed from: private */
    public static final List<b.a> b(List<b.a> list, int i10) {
        ArrayList arrayList = new ArrayList();
        for (Object next : list) {
            b.a aVar = (b.a) next;
            int c10 = aVar.c();
            if (i10 <= aVar.b() && c10 <= i10) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public static final int c(a aVar) {
        C17542s.j(aVar, "<this>");
        return aVar.c() + 1;
    }
}
