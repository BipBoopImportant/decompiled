package G1;

import W0.b;
import java.util.Comparator;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\b\u0000\u0018\u0000 \n2\u00020\u0001:\u0001\u0011B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\bJ\u0015\u0010\u000e\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\bJ\u0015\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0004¢\u0006\u0004\b\u0010\u0010\bJ\r\u0010\u0011\u001a\u00020\u0006¢\u0006\u0004\b\u0011\u0010\u0003R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u00128\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0013R \u0010\u0017\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u00158\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u0016¨\u0006\u0018"}, d2 = {"LG1/k0;", "", "<init>", "()V", "LG1/G;", "layoutNode", "LXH/N;", "b", "(LG1/G;)V", "", "c", "()Z", "node", "d", "f", "rootNode", "e", "a", "LW0/b;", "LW0/b;", "layoutNodes", "", "[LG1/G;", "cachedNodes", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class k0 {

    /* renamed from: c  reason: collision with root package name */
    public static final a f6543c = new a((DefaultConstructorMarker) null);

    /* renamed from: d  reason: collision with root package name */
    public static final int f6544d = 8;

    /* renamed from: a  reason: collision with root package name */
    private final b<G> f6545a = new b<>(new G[16], 0);

    /* renamed from: b  reason: collision with root package name */
    private G[] f6546b;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0007B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"LG1/k0$a;", "", "<init>", "()V", "", "MinArraySize", "I", "a", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u0006\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\t¨\u0006\n"}, d2 = {"LG1/k0$a$a;", "Ljava/util/Comparator;", "LG1/G;", "Lkotlin/Comparator;", "<init>", "()V", "a", "b", "", "(LG1/G;LG1/G;)I", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* renamed from: G1.k0$a$a  reason: collision with other inner class name */
        private static final class C0062a implements Comparator<G> {

            /* renamed from: a  reason: collision with root package name */
            public static final C0062a f6547a = new C0062a();

            private C0062a() {
            }

            /* renamed from: a */
            public int compare(G g10, G g11) {
                int l10 = C17542s.l(g11.O(), g10.O());
                return l10 != 0 ? l10 : C17542s.l(g10.hashCode(), g11.hashCode());
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    private final void b(G g10) {
        g10.D();
        int i10 = 0;
        g10.G1(false);
        b<G> x02 = g10.x0();
        int r10 = x02.r();
        if (r10 > 0) {
            Object[] q10 = x02.q();
            do {
                b((G) q10[i10]);
                i10++;
            } while (i10 < r10);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0012, code lost:
        if (r2 < r0) goto L_0x0014;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a() {
        /*
            r4 = this;
            W0.b<G1.G> r0 = r4.f6545a
            G1.k0$a$a r1 = G1.k0.a.C0062a.f6547a
            r0.G(r1)
            W0.b<G1.G> r0 = r4.f6545a
            int r0 = r0.r()
            G1.G[] r1 = r4.f6546b
            if (r1 == 0) goto L_0x0014
            int r2 = r1.length
            if (r2 >= r0) goto L_0x0022
        L_0x0014:
            W0.b<G1.G> r1 = r4.f6545a
            int r1 = r1.r()
            r2 = 16
            int r1 = java.lang.Math.max(r2, r1)
            G1.G[] r1 = new G1.G[r1]
        L_0x0022:
            r2 = 0
            r4.f6546b = r2
            r2 = 0
        L_0x0026:
            if (r2 >= r0) goto L_0x0035
            W0.b<G1.G> r3 = r4.f6545a
            java.lang.Object[] r3 = r3.q()
            r3 = r3[r2]
            r1[r2] = r3
            int r2 = r2 + 1
            goto L_0x0026
        L_0x0035:
            W0.b<G1.G> r2 = r4.f6545a
            r2.k()
            int r0 = r0 + -1
        L_0x003c:
            r2 = -1
            if (r2 >= r0) goto L_0x0050
            r2 = r1[r0]
            kotlin.jvm.internal.C17542s.g(r2)
            boolean r3 = r2.l0()
            if (r3 == 0) goto L_0x004d
            r4.b(r2)
        L_0x004d:
            int r0 = r0 + -1
            goto L_0x003c
        L_0x0050:
            r4.f6546b = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: G1.k0.a():void");
    }

    public final boolean c() {
        return this.f6545a.v();
    }

    public final void d(G g10) {
        this.f6545a.b(g10);
        g10.G1(true);
    }

    public final void e(G g10) {
        this.f6545a.k();
        this.f6545a.b(g10);
        g10.G1(true);
    }

    public final void f(G g10) {
        this.f6545a.y(g10);
    }
}
