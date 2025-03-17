package QB;

import EB.C12829a;
import IC.C13023e;
import IC.C13026h;
import KJ.C15985a;
import KJ.C15987c;
import KJ.C15990f;
import PB.C13333b;
import PB.C13334c;
import PB.d;
import PB.e;
import PB.f;
import PB.g;
import PB.h;
import YH.C16877v;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0013\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0005\u0010\u0018¨\u0006\u001a"}, d2 = {"LQB/B;", "", "<init>", "()V", "LPB/g;", "b", "LPB/g;", "currentStore", "LKJ/f;", "c", "LKJ/f;", "getStores", "()LKJ/f;", "stores", "LPB/f;", "d", "LPB/f;", "a", "()LPB/f;", "state", "", "LPB/g$b;", "e", "Ljava/util/List;", "()Ljava/util/List;", "stockStatusList", "storepicker-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: QB.B  reason: case insensitive filesystem */
public final class C13355B {

    /* renamed from: a  reason: collision with root package name */
    public static final C13355B f114059a = new C13355B();

    /* renamed from: b  reason: collision with root package name */
    private static final g f114060b;

    /* renamed from: c  reason: collision with root package name */
    private static final C15990f<g> f114061c;

    /* renamed from: d  reason: collision with root package name */
    private static final f f114062d;

    /* renamed from: e  reason: collision with root package name */
    private static final List<g.b> f114063e = C16877v.q(new g.b.a("Stock label", g.b.a.C2801a.LOW_STOCK), new g.b.c(C13026h.c("Online stock label"), true));

    /* renamed from: f  reason: collision with root package name */
    public static final int f114064f = 8;

    static {
        g gVar = new g("0", "Ikea Malmö", "Svågertorp, Malmö, Sweden", C13026h.c("1.2 km away"), false, false, (C15987c) null, (C15987c) null, (C12829a) null, 480, (DefaultConstructorMarker) null);
        f114060b = gVar;
        C15990f<g> b10 = C15985a.b(new g("1", "Store 1", "Address 1", C13026h.c("10 m away"), false, false, C15985a.b(new g.a("Store 1.1"), new g.a("Store 1.2")), (C15987c) null, (C12829a) null, 416, (DefaultConstructorMarker) null), new g("2", "Store 2", "Address 2", C13026h.c("120 m away"), false, false, (C15987c) null, (C15987c) null, (C12829a) null, 480, (DefaultConstructorMarker) null));
        f114061c = b10;
        f114062d = new f((C13023e) null, (h) null, (C13334c) null, false, true, false, false, false, false, false, new C13333b.c(gVar, b10), (d) null, (e) null, 7151, (DefaultConstructorMarker) null);
    }

    private C13355B() {
    }

    public final f a() {
        return f114062d;
    }

    public final List<g.b> b() {
        return f114063e;
    }
}
