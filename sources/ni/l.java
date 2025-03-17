package NI;

import AI.C15435p;
import PI.C16201k;
import TI.C16497a;
import XH.C16796C;
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

public final class l extends C16099c {

    /* renamed from: h  reason: collision with root package name */
    static final /* synthetic */ C18064m<Object>[] f136565h = {P.h(new G(l.class, "allValueArguments", "getAllValueArguments()Ljava/util/Map;", 0))};

    /* renamed from: g  reason: collision with root package name */
    private final C17989i f136566g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public l(C16497a aVar, C16201k kVar) {
        super(kVar, aVar, C15435p.a.f133071L);
        C17542s.j(aVar, "annotation");
        C17542s.j(kVar, "c");
        this.f136566g = kVar.e().d(new k(this));
    }

    /* access modifiers changed from: private */
    public static final Map j(l lVar) {
        C17373g<?> b10 = C16102f.f136556a.b(lVar.c());
        Map<K, V> f10 = b10 != null ? X.f(C16796C.a(C16100d.f136550a.c(), b10)) : null;
        return f10 == null ? X.j() : f10;
    }

    public Map<C17069f, C17373g<?>> a() {
        return (Map) C17993m.a(this.f136566g, this, f136565h[0]);
    }
}
