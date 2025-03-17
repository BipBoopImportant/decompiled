package K1;

import K1.d;
import U0.C4899r0;
import U0.o1;
import XH.C16807N;
import kotlin.Metadata;
import kotlin.jvm.internal.C17525a;
import kotlin.jvm.internal.C17544u;
import nI.C17642l;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J5\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0003J\u000f\u0010\u0011\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0011\u0010\u0003R+\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00128F@BX\u0002¢\u0006\u0012\n\u0004\b\u0010\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"LK1/l;", "LK1/d$a;", "<init>", "()V", "Landroid/view/View;", "view", "LL1/r;", "semanticsOwner", "LdI/i;", "coroutineContext", "Ljava/util/function/Consumer;", "Landroid/view/ScrollCaptureTarget;", "targets", "LXH/N;", "d", "(Landroid/view/View;LL1/r;LdI/i;Ljava/util/function/Consumer;)V", "a", "b", "", "<set-?>", "LU0/r0;", "c", "()Z", "e", "(Z)V", "scrollCaptureInProgress", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class l implements d.a {

    /* renamed from: a  reason: collision with root package name */
    private final C4899r0 f8905a = u1.e(Boolean.FALSE, (o1) null, 2, (Object) null);

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* synthetic */ class a extends C17525a implements C17642l<m, C16807N> {
        a(Object obj) {
            super(1, obj, W0.b.class, "add", "add(Ljava/lang/Object;)Z", 8);
        }

        public final void a(m mVar) {
            ((W0.b) this.f144363a).b(mVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((m) obj);
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000f\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LK1/m;", "it", "", "a", "(LK1/m;)Ljava/lang/Comparable;"}, k = 3, mv = {1, 8, 0})
    static final class b extends C17544u implements C17642l<m, Comparable<?>> {

        /* renamed from: c  reason: collision with root package name */
        public static final b f8906c = new b();

        b() {
            super(1);
        }

        /* renamed from: a */
        public final Comparable<?> invoke(m mVar) {
            return Integer.valueOf(mVar.b());
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000f\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LK1/m;", "it", "", "a", "(LK1/m;)Ljava/lang/Comparable;"}, k = 3, mv = {1, 8, 0})
    static final class c extends C17544u implements C17642l<m, Comparable<?>> {

        /* renamed from: c  reason: collision with root package name */
        public static final c f8907c = new c();

        c() {
            super(1);
        }

        /* renamed from: a */
        public final Comparable<?> invoke(m mVar) {
            return Integer.valueOf(mVar.d().i());
        }
    }

    private final void e(boolean z10) {
        this.f8905a.setValue(Boolean.valueOf(z10));
    }

    public void a() {
        e(true);
    }

    public void b() {
        e(false);
    }

    public final boolean c() {
        return ((Boolean) this.f8905a.getValue()).booleanValue();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: K1.m} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void d(android.view.View r6, L1.r r7, dI.C17168i r8, java.util.function.Consumer<android.view.ScrollCaptureTarget> r9) {
        /*
            r5 = this;
            W0.b r0 = new W0.b
            r1 = 16
            K1.m[] r1 = new K1.m[r1]
            r2 = 0
            r0.<init>(r1, r2)
            L1.p r7 = r7.a()
            K1.l$a r1 = new K1.l$a
            r1.<init>(r0)
            r3 = 2
            r4 = 0
            K1.n.e(r7, r2, r1, r3, r4)
            nI.l[] r7 = new nI.C17642l[r3]
            K1.l$b r1 = K1.l.b.f8906c
            r7[r2] = r1
            K1.l$c r1 = K1.l.c.f8907c
            r2 = 1
            r7[r2] = r1
            java.util.Comparator r7 = bI.C17035a.c(r7)
            r0.G(r7)
            boolean r7 = r0.t()
            if (r7 == 0) goto L_0x0031
            goto L_0x003c
        L_0x0031:
            int r7 = r0.r()
            int r7 = r7 - r2
            java.lang.Object[] r0 = r0.q()
            r4 = r0[r7]
        L_0x003c:
            K1.m r4 = (K1.m) r4
            if (r4 != 0) goto L_0x0041
            return
        L_0x0041:
            QJ.Q r7 = QJ.S.a(r8)
            K1.d r8 = new K1.d
            L1.p r0 = r4.c()
            c2.p r1 = r4.d()
            r8.<init>(r0, r1, r7, r5)
            E1.v r7 = r4.a()
            o1.i r7 = E1.C4489w.b(r7)
            c2.p r0 = r4.d()
            long r0 = r0.n()
            c2.p r7 = c2.q.b(r7)
            android.graphics.Rect r7 = p1.b1.a(r7)
            android.graphics.Point r2 = new android.graphics.Point
            int r3 = c2.n.h(r0)
            int r0 = c2.n.i(r0)
            r2.<init>(r3, r0)
            android.view.ScrollCaptureCallback r8 = K1.i.a(r8)
            android.view.ScrollCaptureTarget r6 = K1.k.a(r6, r7, r2, r8)
            c2.p r7 = r4.d()
            android.graphics.Rect r7 = p1.b1.a(r7)
            r6.setScrollBounds(r7)
            r9.accept(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: K1.l.d(android.view.View, L1.r, dI.i, java.util.function.Consumer):void");
    }
}
