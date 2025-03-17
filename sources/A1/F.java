package A1;

import G1.C4517u;
import G1.G;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J-\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\nø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00168\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\u00198\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010\"\u001a\u00020\n8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b \u0010!\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006#"}, d2 = {"LA1/F;", "", "LG1/G;", "root", "<init>", "(LG1/G;)V", "LA1/D;", "pointerEvent", "LA1/Q;", "positionCalculator", "", "isInBounds", "LA1/S;", "b", "(LA1/D;LA1/Q;Z)I", "LXH/N;", "c", "()V", "a", "LG1/G;", "getRoot", "()LG1/G;", "LA1/g;", "LA1/g;", "hitPathTracker", "LA1/C;", "LA1/C;", "pointerInputChangeEventProducer", "LG1/u;", "d", "LG1/u;", "hitResult", "e", "Z", "isProcessing", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class F {

    /* renamed from: a  reason: collision with root package name */
    private final G f4338a;

    /* renamed from: b  reason: collision with root package name */
    private final C4340g f4339b;

    /* renamed from: c  reason: collision with root package name */
    private final C f4340c = new C();

    /* renamed from: d  reason: collision with root package name */
    private final C4517u f4341d = new C4517u();

    /* renamed from: e  reason: collision with root package name */
    private boolean f4342e;

    public F(G g10) {
        this.f4338a = g10;
        this.f4339b = new C4340g(g10.s());
    }

    public final void a() {
        this.f4339b.b();
    }

    public final int b(D d10, Q q10, boolean z10) {
        boolean z11;
        if (this.f4342e) {
            return G.a(false, false);
        }
        boolean z12 = true;
        try {
            this.f4342e = true;
            C4341h b10 = this.f4340c.b(d10, q10);
            int o10 = b10.b().o();
            int i10 = 0;
            while (true) {
                if (i10 >= o10) {
                    z11 = true;
                    break;
                }
                B p10 = b10.b().p(i10);
                if (p10.i()) {
                    break;
                } else if (p10.l()) {
                    break;
                } else {
                    i10++;
                }
            }
            z11 = false;
            int o11 = b10.b().o();
            for (int i11 = 0; i11 < o11; i11++) {
                B p11 = b10.b().p(i11);
                if (z11 || C4350q.b(p11)) {
                    G.z0(this.f4338a, p11.h(), this.f4341d, P.g(p11.n(), P.f4356a.d()), false, 8, (Object) null);
                    if (!this.f4341d.isEmpty()) {
                        this.f4339b.a(p11.f(), this.f4341d, C4350q.b(p11));
                        this.f4341d.clear();
                    }
                }
            }
            this.f4339b.e();
            boolean c10 = this.f4339b.c(b10, z10);
            if (!b10.d()) {
                int o12 = b10.b().o();
                int i12 = 0;
                while (true) {
                    if (i12 >= o12) {
                        break;
                    }
                    B p12 = b10.b().p(i12);
                    if (C4350q.k(p12) && p12.p()) {
                        break;
                    }
                    i12++;
                }
            }
            z12 = false;
            int a10 = G.a(c10, z12);
            this.f4342e = false;
            return a10;
        } catch (Throwable th2) {
            this.f4342e = false;
            throw th2;
        }
    }

    public final void c() {
        if (!this.f4342e) {
            this.f4340c.a();
            this.f4339b.d();
        }
    }
}
