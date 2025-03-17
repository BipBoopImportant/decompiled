package NI;

import AI.C15435p;
import PI.C16201k;
import TI.C16497a;
import XH.C16796C;
import YH.X;
import cJ.C17069f;
import iJ.C17373g;
import iJ.C17391y;
import java.util.Map;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.P;
import tJ.C17989i;
import tJ.C17993m;
import uI.C18064m;

/* renamed from: NI.h  reason: case insensitive filesystem */
public final class C16104h extends C16099c {

    /* renamed from: h  reason: collision with root package name */
    static final /* synthetic */ C18064m<Object>[] f136560h = {P.h(new G(C16104h.class, "allValueArguments", "getAllValueArguments()Ljava/util/Map;", 0))};

    /* renamed from: g  reason: collision with root package name */
    private final C17989i f136561g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C16104h(C16497a aVar, C16201k kVar) {
        super(kVar, aVar, C15435p.a.f133138y);
        C17542s.j(kVar, "c");
        this.f136561g = kVar.e().d(C16103g.f136559a);
    }

    /* access modifiers changed from: private */
    public static final Map j() {
        return X.f(C16796C.a(C16100d.f136550a.b(), new C17391y("Deprecated in Java")));
    }

    public Map<C17069f, C17373g<?>> a() {
        return (Map) C17993m.a(this.f136561g, this, f136560h[0]);
    }
}
