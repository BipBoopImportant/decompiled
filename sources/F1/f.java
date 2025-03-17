package F1;

import G1.C4497c;
import G1.C4502e0;
import G1.C4508k;
import G1.C4510m;
import G1.G;
import G1.m0;
import W0.b;
import XH.C16807N;
import androidx.compose.ui.d;
import java.util.HashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C17544u;
import nI.C17631a;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J1\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\r¢\u0006\u0004\b\u0012\u0010\u0011J!\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u000b2\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\b¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u000b2\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\b¢\u0006\u0004\b\u0015\u0010\u0014J!\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u000b2\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\b¢\u0006\u0004\b\u0016\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u000b0\u001a8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u001bR\u001e\u0010\u001d\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b0\u001a8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u001bR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001a8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u001bR\u001e\u0010 \u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b0\u001a8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u001bR\u0016\u0010#\u001a\u00020!8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\"¨\u0006$"}, d2 = {"LF1/f;", "", "LG1/m0;", "owner", "<init>", "(LG1/m0;)V", "Landroidx/compose/ui/d$c;", "node", "LF1/c;", "key", "", "LG1/c;", "set", "LXH/N;", "c", "(Landroidx/compose/ui/d$c;LF1/c;Ljava/util/Set;)V", "b", "()V", "e", "f", "(LG1/c;LF1/c;)V", "a", "d", "LG1/m0;", "getOwner", "()LG1/m0;", "LW0/b;", "LW0/b;", "inserted", "insertedLocal", "LG1/G;", "removed", "removedLocal", "", "Z", "invalidated", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class f {

    /* renamed from: a  reason: collision with root package name */
    private final m0 f6012a;

    /* renamed from: b  reason: collision with root package name */
    private final b<C4497c> f6013b = new b<>(new C4497c[16], 0);

    /* renamed from: c  reason: collision with root package name */
    private final b<c<?>> f6014c = new b<>(new c[16], 0);

    /* renamed from: d  reason: collision with root package name */
    private final b<G> f6015d = new b<>(new G[16], 0);

    /* renamed from: e  reason: collision with root package name */
    private final b<c<?>> f6016e = new b<>(new c[16], 0);

    /* renamed from: f  reason: collision with root package name */
    private boolean f6017f;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LXH/N;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class a extends C17544u implements C17631a<C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ f f6018c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(f fVar) {
            super(0);
            this.f6018c = fVar;
        }

        public final void invoke() {
            this.f6018c.e();
        }
    }

    public f(m0 m0Var) {
        this.f6012a = m0Var;
    }

    private final void c(d.c cVar, c<?> cVar2, Set<C4497c> set) {
        int a10 = C4502e0.a(32);
        if (!cVar.E0().j2()) {
            D1.a.b("visitSubtreeIf called on an unattached node");
        }
        b bVar = new b(new d.c[16], 0);
        d.c a22 = cVar.E0().a2();
        if (a22 == null) {
            C4508k.c(bVar, cVar.E0());
        } else {
            bVar.b(a22);
        }
        while (bVar.v()) {
            d.c cVar3 = (d.c) bVar.B(bVar.r() - 1);
            if ((cVar3.Z1() & a10) != 0) {
                d.c cVar4 = cVar3;
                while (true) {
                    if (cVar4 == null) {
                        break;
                    }
                    if ((cVar4.e2() & a10) != 0) {
                        d.c cVar5 = cVar4;
                        b bVar2 = null;
                        while (cVar5 != null) {
                            if (cVar5 instanceof h) {
                                h hVar = (h) cVar5;
                                if (hVar instanceof C4497c) {
                                    C4497c cVar6 = (C4497c) hVar;
                                    if ((cVar6.D2() instanceof d) && cVar6.E2().contains(cVar2)) {
                                        set.add(hVar);
                                    }
                                }
                                if (hVar.s0().a(cVar2)) {
                                    break;
                                }
                            } else if ((cVar5.e2() & a10) != 0 && (cVar5 instanceof C4510m)) {
                                int i10 = 0;
                                for (d.c D22 = ((C4510m) cVar5).D2(); D22 != null; D22 = D22.a2()) {
                                    if ((D22.e2() & a10) != 0) {
                                        i10++;
                                        if (i10 == 1) {
                                            cVar5 = D22;
                                        } else {
                                            if (bVar2 == null) {
                                                bVar2 = new b(new d.c[16], 0);
                                            }
                                            if (cVar5 != null) {
                                                bVar2.b(cVar5);
                                                cVar5 = null;
                                            }
                                            bVar2.b(D22);
                                        }
                                    }
                                }
                                if (i10 == 1) {
                                }
                            }
                            cVar5 = C4508k.g(bVar2);
                        }
                        continue;
                    }
                    cVar4 = cVar4.a2();
                }
            }
            C4508k.c(bVar, cVar3);
        }
    }

    public final void a(C4497c cVar, c<?> cVar2) {
        this.f6013b.b(cVar);
        this.f6014c.b(cVar2);
        b();
    }

    public final void b() {
        if (!this.f6017f) {
            this.f6017f = true;
            this.f6012a.g(new a(this));
        }
    }

    public final void d(C4497c cVar, c<?> cVar2) {
        this.f6015d.b(C4508k.m(cVar));
        this.f6016e.b(cVar2);
        b();
    }

    public final void e() {
        int i10 = 0;
        this.f6017f = false;
        HashSet<C4497c> hashSet = new HashSet<>();
        b<G> bVar = this.f6015d;
        int r10 = bVar.r();
        if (r10 > 0) {
            Object[] q10 = bVar.q();
            int i11 = 0;
            do {
                G g10 = (G) q10[i11];
                c cVar = (c) this.f6016e.q()[i11];
                if (g10.m0().k().j2()) {
                    c(g10.m0().k(), cVar, hashSet);
                }
                i11++;
            } while (i11 < r10);
        }
        this.f6015d.k();
        this.f6016e.k();
        b<C4497c> bVar2 = this.f6013b;
        int r11 = bVar2.r();
        if (r11 > 0) {
            Object[] q11 = bVar2.q();
            do {
                C4497c cVar2 = (C4497c) q11[i10];
                c cVar3 = (c) this.f6014c.q()[i10];
                if (cVar2.j2()) {
                    c(cVar2, cVar3, hashSet);
                }
                i10++;
            } while (i10 < r11);
        }
        this.f6013b.k();
        this.f6014c.k();
        for (C4497c K22 : hashSet) {
            K22.K2();
        }
    }

    public final void f(C4497c cVar, c<?> cVar2) {
        this.f6013b.b(cVar);
        this.f6014c.b(cVar2);
        b();
    }
}
