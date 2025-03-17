package I0;

import XH.C16807N;
import dI.C17164e;
import eI.C17187b;
import f1.C5309k;
import f1.C5310l;
import f1.m;
import kotlin.Metadata;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17631a;
import nI.C17642l;
import nI.p;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0007\u0018\u0000 \u00162\u00020\u0001:\u0001\u000fB%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fH@¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\fH@¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\u0011\u0010\u0012R \u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00020\u00138\u0000X\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R$\u0010\u001d\u001a\u0004\u0018\u00010\t8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b\"\u0004\b\u001b\u0010\u001cR\u0011\u0010 \u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010#\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b!\u0010\"¨\u0006$"}, d2 = {"LI0/G;", "", "LI0/H;", "initialValue", "Lkotlin/Function1;", "", "confirmStateChange", "<init>", "(LI0/H;LnI/l;)V", "Lc2/d;", "g", "()Lc2/d;", "LXH/N;", "f", "(LdI/e;)Ljava/lang/Object;", "b", "", "h", "()F", "LI0/d;", "a", "LI0/d;", "c", "()LI0/d;", "anchoredDraggableState", "Lc2/d;", "getDensity$material_release", "i", "(Lc2/d;)V", "density", "e", "()Z", "isOpen", "d", "()LI0/H;", "currentValue", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class G {

    /* renamed from: c  reason: collision with root package name */
    public static final b f7245c = new b((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final C4552d<H> f7246a;

    /* renamed from: b  reason: collision with root package name */
    private c2.d f7247b;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LI0/H;", "it", "", "a", "(LI0/H;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class a extends C17544u implements C17642l<H, Boolean> {

        /* renamed from: c  reason: collision with root package name */
        public static final a f7248c = new a();

        a() {
            super(1);
        }

        /* renamed from: a */
        public final Boolean invoke(H h10) {
            return Boolean.TRUE;
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"LI0/G$b;", "", "<init>", "()V", "Lkotlin/Function1;", "LI0/H;", "", "confirmStateChange", "Lf1/k;", "LI0/G;", "a", "(LnI/l;)Lf1/k;", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b {

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lf1/m;", "LI0/G;", "it", "LI0/H;", "a", "(Lf1/m;LI0/G;)LI0/H;"}, k = 3, mv = {1, 8, 0})
        static final class a extends C17544u implements p<m, G, H> {

            /* renamed from: c  reason: collision with root package name */
            public static final a f7249c = new a();

            a() {
                super(2);
            }

            /* renamed from: a */
            public final H invoke(m mVar, G g10) {
                return g10.d();
            }
        }

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LI0/H;", "it", "LI0/G;", "a", "(LI0/H;)LI0/G;"}, k = 3, mv = {1, 8, 0})
        /* renamed from: I0.G$b$b  reason: collision with other inner class name */
        static final class C0093b extends C17544u implements C17642l<H, G> {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ C17642l<H, Boolean> f7250c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0093b(C17642l<? super H, Boolean> lVar) {
                super(1);
                this.f7250c = lVar;
            }

            /* renamed from: a */
            public final G invoke(H h10) {
                return new G(h10, this.f7250c);
            }
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C5309k<G, H> a(C17642l<? super H, Boolean> lVar) {
            return C5310l.a(a.f7249c, new C0093b(lVar));
        }

        private b() {
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0007\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "it", "a", "(F)Ljava/lang/Float;"}, k = 3, mv = {1, 8, 0})
    static final class c extends C17544u implements C17642l<Float, Float> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ G f7251c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(G g10) {
            super(1);
            this.f7251c = g10;
        }

        public final Float a(float f10) {
            return Float.valueOf(this.f7251c.g().H1(F.f7145b));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).floatValue());
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "b", "()Ljava/lang/Float;"}, k = 3, mv = {1, 8, 0})
    static final class d extends C17544u implements C17631a<Float> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ G f7252c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(G g10) {
            super(0);
            this.f7252c = g10;
        }

        /* renamed from: b */
        public final Float invoke() {
            return Float.valueOf(this.f7252c.g().H1(F.f7146c));
        }
    }

    public G(H h10, C17642l<? super H, Boolean> lVar) {
        H h11 = h10;
        this.f7246a = new C4552d(h11, new c(this), new d(this), F.f7147d, lVar);
    }

    /* access modifiers changed from: private */
    public final c2.d g() {
        c2.d dVar = this.f7247b;
        if (dVar != null) {
            return dVar;
        }
        throw new IllegalArgumentException(("The density on DrawerState (" + this + ") was not set. Did you use DrawerState with the Drawer composable?").toString());
    }

    public final Object b(C17164e<? super C16807N> eVar) {
        Object g10 = androidx.compose.material.a.g(this.f7246a, H.Closed, 0.0f, eVar, 2, (Object) null);
        return g10 == C17187b.f() ? g10 : C16807N.f139792a;
    }

    public final C4552d<H> c() {
        return this.f7246a;
    }

    public final H d() {
        return this.f7246a.s();
    }

    public final boolean e() {
        return d() == H.Open;
    }

    public final Object f(C17164e<? super C16807N> eVar) {
        Object g10 = androidx.compose.material.a.g(this.f7246a, H.Open, 0.0f, eVar, 2, (Object) null);
        return g10 == C17187b.f() ? g10 : C16807N.f139792a;
    }

    public final float h() {
        return this.f7246a.A();
    }

    public final void i(c2.d dVar) {
        this.f7247b = dVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ G(H h10, C17642l lVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(h10, (i10 & 2) != 0 ? a.f7248c : lVar);
    }
}
