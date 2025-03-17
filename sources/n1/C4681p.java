package N1;

import N1.C4669d;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\u001a;\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"", "LN1/d$c;", "LN1/A;", "", "start", "end", "b", "(Ljava/util/List;II)Ljava/util/List;", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: N1.p  reason: case insensitive filesystem */
public final class C4681p {
    /* access modifiers changed from: private */
    public static final List<C4669d.c<A>> b(List<C4669d.c<A>> list, int i10, int i11) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i12 = 0; i12 < size; i12++) {
            C4669d.c<A> cVar = list.get(i12);
            C4669d.c cVar2 = cVar;
            if (C4670e.n(i10, i11, cVar2.h(), cVar2.f())) {
                arrayList.add(cVar);
            }
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i13 = 0; i13 < size2; i13++) {
            C4669d.c cVar3 = (C4669d.c) arrayList.get(i13);
            if (i10 > cVar3.h() || cVar3.f() > i11) {
                throw new IllegalArgumentException("placeholder can not overlap with paragraph.");
            }
            arrayList2.add(new C4669d.c(cVar3.g(), cVar3.h() - i10, cVar3.f() - i10));
        }
        return arrayList2;
    }
}
