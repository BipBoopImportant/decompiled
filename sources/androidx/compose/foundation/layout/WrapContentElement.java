package androidx.compose.foundation.layout;

import G1.V;
import c2.n;
import c2.o;
import c2.r;
import c2.t;
import i1.C5437c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.p;
import s0.C5866l;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000e\b\u0002\u0018\u0000 '2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001(BA\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0007\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u0019\u001a\u00020\u00052\b\u0010\u0018\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b \u0010!R&\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\"R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0004¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006)"}, d2 = {"Landroidx/compose/foundation/layout/WrapContentElement;", "LG1/V;", "Landroidx/compose/foundation/layout/N;", "Ls0/l;", "direction", "", "unbounded", "Lkotlin/Function2;", "Lc2/r;", "Lc2/t;", "Lc2/n;", "alignmentCallback", "", "align", "", "inspectorName", "<init>", "(Ls0/l;ZLnI/p;Ljava/lang/Object;Ljava/lang/String;)V", "c", "()Landroidx/compose/foundation/layout/N;", "node", "LXH/N;", "f", "(Landroidx/compose/foundation/layout/N;)V", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "d", "Ls0/l;", "e", "Z", "LnI/p;", "g", "Ljava/lang/Object;", "h", "Ljava/lang/String;", "i", "a", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class WrapContentElement extends V<N> {

    /* renamed from: i  reason: collision with root package name */
    public static final a f18044i = new a((DefaultConstructorMarker) null);

    /* renamed from: d  reason: collision with root package name */
    private final C5866l f18045d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f18046e;

    /* renamed from: f  reason: collision with root package name */
    private final p<r, t, n> f18047f;

    /* renamed from: g  reason: collision with root package name */
    private final Object f18048g;

    /* renamed from: h  reason: collision with root package name */
    private final String f18049h;

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\f\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Landroidx/compose/foundation/layout/WrapContentElement$a;", "", "<init>", "()V", "Li1/c$b;", "align", "", "unbounded", "Landroidx/compose/foundation/layout/WrapContentElement;", "c", "(Li1/c$b;Z)Landroidx/compose/foundation/layout/WrapContentElement;", "Li1/c$c;", "a", "(Li1/c$c;Z)Landroidx/compose/foundation/layout/WrapContentElement;", "Li1/c;", "b", "(Li1/c;Z)Landroidx/compose/foundation/layout/WrapContentElement;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lc2/r;", "size", "Lc2/t;", "<anonymous parameter 1>", "Lc2/n;", "a", "(JLc2/t;)J"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.compose.foundation.layout.WrapContentElement$a$a  reason: collision with other inner class name */
        static final class C0262a extends C17544u implements p<r, t, n> {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ C5437c.C0386c f18050c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0262a(C5437c.C0386c cVar) {
                super(2);
                this.f18050c = cVar;
            }

            public final long a(long j10, t tVar) {
                return o.a(0, this.f18050c.a(0, r.g(j10)));
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return n.b(a(((r) obj).k(), (t) obj2));
            }
        }

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lc2/r;", "size", "Lc2/t;", "layoutDirection", "Lc2/n;", "a", "(JLc2/t;)J"}, k = 3, mv = {1, 8, 0})
        static final class b extends C17544u implements p<r, t, n> {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ C5437c f18051c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            b(C5437c cVar) {
                super(2);
                this.f18051c = cVar;
            }

            public final long a(long j10, t tVar) {
                return this.f18051c.a(r.f23053b.a(), j10, tVar);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return n.b(a(((r) obj).k(), (t) obj2));
            }
        }

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lc2/r;", "size", "Lc2/t;", "layoutDirection", "Lc2/n;", "a", "(JLc2/t;)J"}, k = 3, mv = {1, 8, 0})
        static final class c extends C17544u implements p<r, t, n> {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ C5437c.b f18052c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            c(C5437c.b bVar) {
                super(2);
                this.f18052c = bVar;
            }

            public final long a(long j10, t tVar) {
                return o.a(this.f18052c.a(0, r.h(j10), tVar), 0);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return n.b(a(((r) obj).k(), (t) obj2));
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final WrapContentElement a(C5437c.C0386c cVar, boolean z10) {
            return new WrapContentElement(C5866l.Vertical, z10, new C0262a(cVar), cVar, "wrapContentHeight");
        }

        public final WrapContentElement b(C5437c cVar, boolean z10) {
            return new WrapContentElement(C5866l.Both, z10, new b(cVar), cVar, "wrapContentSize");
        }

        public final WrapContentElement c(C5437c.b bVar, boolean z10) {
            return new WrapContentElement(C5866l.Horizontal, z10, new c(bVar), bVar, "wrapContentWidth");
        }

        private a() {
        }
    }

    public WrapContentElement(C5866l lVar, boolean z10, p<? super r, ? super t, n> pVar, Object obj, String str) {
        this.f18045d = lVar;
        this.f18046e = z10;
        this.f18047f = pVar;
        this.f18048g = obj;
        this.f18049h = str;
    }

    /* renamed from: c */
    public N a() {
        return new N(this.f18045d, this.f18046e, this.f18047f);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || WrapContentElement.class != obj.getClass()) {
            return false;
        }
        WrapContentElement wrapContentElement = (WrapContentElement) obj;
        return this.f18045d == wrapContentElement.f18045d && this.f18046e == wrapContentElement.f18046e && C17542s.e(this.f18048g, wrapContentElement.f18048g);
    }

    /* renamed from: f */
    public void b(N n10) {
        n10.E2(this.f18045d);
        n10.F2(this.f18046e);
        n10.D2(this.f18047f);
    }

    public int hashCode() {
        return (((this.f18045d.hashCode() * 31) + Boolean.hashCode(this.f18046e)) * 31) + this.f18048g.hashCode();
    }
}
