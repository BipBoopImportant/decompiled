package NI;

import AI.C15435p;
import PI.C16201k;
import TI.C16497a;
import TI.C16498b;
import TI.C16501e;
import TI.m;
import XH.C16796C;
import YH.C16877v;
import YH.X;
import cJ.C17069f;
import iJ.C17373g;
import java.util.Map;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.P;
import tJ.C17989i;
import tJ.C17993m;
import uI.C18064m;

public final class n extends C16099c {

    /* renamed from: h  reason: collision with root package name */
    static final /* synthetic */ C18064m<Object>[] f136568h = {P.h(new G(n.class, "allValueArguments", "getAllValueArguments()Ljava/util/Map;", 0))};

    /* renamed from: g  reason: collision with root package name */
    private final C17989i f136569g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public n(C16497a aVar, C16201k kVar) {
        super(kVar, aVar, C15435p.a.f133063H);
        C17542s.j(aVar, "annotation");
        C17542s.j(kVar, "c");
        this.f136569g = kVar.e().d(new m(this));
    }

    /* access modifiers changed from: private */
    public static final Map j(n nVar) {
        C16498b c10 = nVar.c();
        Map<K, V> map = null;
        C17373g<?> d10 = c10 instanceof C16501e ? C16102f.f136556a.d(((C16501e) nVar.c()).c()) : c10 instanceof m ? C16102f.f136556a.d(C16877v.e(nVar.c())) : null;
        if (d10 != null) {
            map = X.f(C16796C.a(C16100d.f136550a.d(), d10));
        }
        return map == null ? X.j() : map;
    }

    public Map<C17069f, C17373g<Object>> a() {
        return (Map) C17993m.a(this.f136569g, this, f136568h[0]);
    }
}
