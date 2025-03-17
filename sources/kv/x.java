package Kv;

import U0.A1;
import U0.p1;
import c2.h;
import c2.i;
import jC.C14615b;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m0.K;
import nI.C17631a;
import p0.C5685c;
import p1.C5747v0;
import tI.C17978n;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 \u00102\u00020\u0001:\u0001\u000eB\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R!\u0010\u001a\u001a\u00020\u00148FX\u0002¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u0012\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0017\u0010\rR\u001b\u0010\u001e\u001a\u00020\u001b8FX\u0002¢\u0006\f\n\u0004\b\f\u0010\u0016\u001a\u0004\b\u001c\u0010\u001dR\u001b\u0010 \u001a\u00020\u00058FX\u0002¢\u0006\f\n\u0004\b\t\u0010\u0016\u001a\u0004\b\u001f\u0010\nR\u0011\u0010\"\u001a\u00020\u001b8F¢\u0006\u0006\u001a\u0004\b!\u0010\u001dR\u0011\u0010&\u001a\u00020#8F¢\u0006\u0006\u001a\u0004\b$\u0010%¨\u0006'"}, d2 = {"LKv/x;", "", "Lp0/c;", "LKv/d;", "draggableState", "Lp1/v0;", "backgroundColor", "<init>", "(Lp0/c;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "e", "()J", "Lc2/h;", "d", "()F", "a", "Lp0/c;", "f", "()Lp0/c;", "b", "J", "", "c", "LU0/A1;", "h", "getScrollContentProgress$annotations", "()V", "scrollContentProgress", "", "k", "()Z", "isContentDocked", "i", "toolbarColor", "j", "useLightIcons", "LjC/b;", "g", "()LjC/b;", "iconColor", "membership-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class x {

    /* renamed from: f  reason: collision with root package name */
    public static final a f38042f = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final C5685c<d> f38043a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final long f38044b;

    /* renamed from: c  reason: collision with root package name */
    private final A1 f38045c;

    /* renamed from: d  reason: collision with root package name */
    private final A1 f38046d;

    /* renamed from: e  reason: collision with root package name */
    private final A1 f38047e;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"LKv/x$a;", "", "<init>", "()V", "", "contentScrollProgress", "a", "(F)F", "membership-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final float a(float f10) {
            if (f10 < 0.5f) {
                return 0.0f;
            }
            return ((Number) C17978n.q(Float.valueOf((f10 - 0.5f) / 0.39999998f), C17978n.c(0.0f, 1.0f))).floatValue();
        }

        private a() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class b implements C17631a<C5747v0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ x f38048a;

        b(x xVar) {
            this.f38048a = xVar;
        }

        public final long a() {
            return this.f38048a.k() ? this.f38048a.f38044b : C5747v0.f27350b.h();
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            return C5747v0.k(a());
        }
    }

    public /* synthetic */ x(C5685c cVar, long j10, DefaultConstructorMarker defaultConstructorMarker) {
        this(cVar, j10);
    }

    /* access modifiers changed from: private */
    public static final boolean l(x xVar) {
        return xVar.h() >= 0.9f;
    }

    /* access modifiers changed from: private */
    public static final float m(x xVar) {
        return Zv.a.c(xVar.f38043a);
    }

    public final float d() {
        return i.c(B.d(), h.B((float) 0), f38042f.a(h()));
    }

    public final long e() {
        return C5747v0.o(this.f38044b, K.q().a(f38042f.a(h())), 0.0f, 0.0f, 0.0f, 14, (Object) null);
    }

    public final C5685c<d> f() {
        return this.f38043a;
    }

    public final C14615b g() {
        return j() ? C14615b.c.f127858b : C14615b.e.f127859b;
    }

    public final float h() {
        return ((Number) this.f38045c.getValue()).floatValue();
    }

    public final long i() {
        return ((C5747v0) this.f38047e.getValue()).y();
    }

    public final boolean j() {
        return !k();
    }

    public final boolean k() {
        return ((Boolean) this.f38046d.getValue()).booleanValue();
    }

    private x(C5685c<d> cVar, long j10) {
        C17542s.j(cVar, "draggableState");
        this.f38043a = cVar;
        this.f38044b = j10;
        this.f38045c = p1.e(new v(this));
        this.f38046d = p1.e(new w(this));
        this.f38047e = p1.e(new b(this));
    }
}
