package UI;

import YH.C16877v;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class g0 {

    /* renamed from: a  reason: collision with root package name */
    private final r0 f139032a;

    /* renamed from: b  reason: collision with root package name */
    private final List<r0> f139033b;

    /* renamed from: c  reason: collision with root package name */
    private final String f139034c;

    /* renamed from: d  reason: collision with root package name */
    private final g0 f139035d;

    public g0() {
        this((r0) null, (List) null, (String) null, 7, (DefaultConstructorMarker) null);
    }

    public final String a() {
        return this.f139034c;
    }

    public final List<r0> b() {
        return this.f139033b;
    }

    public final r0 c() {
        return this.f139032a;
    }

    public final g0 d() {
        return this.f139035d;
    }

    public g0(r0 r0Var, List<r0> list, String str) {
        C17542s.j(list, "parametersInfo");
        this.f139032a = r0Var;
        this.f139033b = list;
        this.f139034c = str;
        g0 g0Var = null;
        if (str != null) {
            r0 a10 = r0Var != null ? r0Var.a() : null;
            Iterable<r0> iterable = list;
            ArrayList arrayList = new ArrayList(C16877v.y(iterable, 10));
            for (r0 r0Var2 : iterable) {
                arrayList.add(r0Var2 != null ? r0Var2.a() : null);
            }
            g0Var = new g0(a10, arrayList, (String) null);
        }
        this.f139035d = g0Var;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g0(r0 r0Var, List list, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : r0Var, (i10 & 2) != 0 ? C16877v.n() : list, (i10 & 4) != 0 ? null : str);
    }
}
