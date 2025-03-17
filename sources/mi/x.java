package MI;

import UI.C16590k;
import UI.C16591l;
import XH.C16796C;
import YH.C16877v;
import YH.X;
import cJ.C17066c;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class x {

    /* renamed from: a  reason: collision with root package name */
    private static final List<C16059c> f136397a;

    /* renamed from: b  reason: collision with root package name */
    private static final List<C16059c> f136398b;

    /* renamed from: c  reason: collision with root package name */
    private static final Map<C17066c, w> f136399c;

    /* renamed from: d  reason: collision with root package name */
    private static final Map<C17066c, w> f136400d;

    /* renamed from: e  reason: collision with root package name */
    private static final Map<C17066c, w> f136401e;

    static {
        C16059c cVar = C16059c.FIELD;
        C16059c cVar2 = C16059c.METHOD_RETURN_TYPE;
        C16059c cVar3 = C16059c.VALUE_PARAMETER;
        List<C16059c> q10 = C16877v.q(cVar, cVar2, cVar3, C16059c.TYPE_PARAMETER_BOUNDS, C16059c.TYPE_USE);
        f136397a = q10;
        List<C16059c> e10 = C16877v.e(cVar3);
        f136398b = e10;
        C17066c k10 = C16049J.k();
        C16590k kVar = C16590k.NOT_NULL;
        Map<C17066c, w> m10 = X.m(C16796C.a(k10, new w(new C16591l(kVar, false, 2, (DefaultConstructorMarker) null), q10, false)), C16796C.a(C16049J.i(), new w(new C16591l(kVar, false, 2, (DefaultConstructorMarker) null), q10, false)), C16796C.a(C16049J.j(), new w(new C16591l(C16590k.FORCE_FLEXIBILITY, false, 2, (DefaultConstructorMarker) null), q10, false, 4, (DefaultConstructorMarker) null)));
        f136399c = m10;
        Map<C17066c, w> m11 = X.m(C16796C.a(C16049J.d(), new w(new C16591l(kVar, false, 2, (DefaultConstructorMarker) null), e10, false, 4, (DefaultConstructorMarker) null)), C16796C.a(C16049J.e(), new w(new C16591l(C16590k.NULLABLE, false, 2, (DefaultConstructorMarker) null), e10, false, 4, (DefaultConstructorMarker) null)));
        f136400d = m11;
        f136401e = X.s(m10, m11);
    }

    public static final Map<C17066c, w> a() {
        return f136401e;
    }

    public static final Map<C17066c, w> b() {
        return f136399c;
    }
}
