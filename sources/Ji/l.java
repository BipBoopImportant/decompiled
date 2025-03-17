package JI;

import JI.C15967h;
import TI.C16501e;
import cJ.C17069f;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class l extends C15967h implements C16501e {

    /* renamed from: c  reason: collision with root package name */
    private final Object[] f135784c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public l(C17069f fVar, Object[] objArr) {
        super(fVar, (DefaultConstructorMarker) null);
        C17542s.j(objArr, "values");
        this.f135784c = objArr;
    }

    public List<C15967h> c() {
        Object[] objArr = this.f135784c;
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            C15967h.a aVar = C15967h.f135781b;
            C17542s.g(obj);
            arrayList.add(aVar.a(obj, (C17069f) null));
        }
        return arrayList;
    }
}
