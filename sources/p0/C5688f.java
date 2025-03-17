package p0;

import QJ.C16320n;
import W0.b;
import XH.C16807N;
import XH.x;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import nI.C17642l;
import o1.C5669i;
import p0.C5691i;
import tI.C17974j;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u0003J\u0017\u0010\r\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u000f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lp0/f;", "", "<init>", "()V", "Lp0/i$a;", "request", "", "c", "(Lp0/i$a;)Z", "LXH/N;", "d", "", "cause", "b", "(Ljava/lang/Throwable;)V", "LW0/b;", "a", "LW0/b;", "requests", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: p0.f  reason: case insensitive filesystem */
public final class C5688f {

    /* renamed from: b  reason: collision with root package name */
    public static final int f26995b = b.f14622d;
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final b<C5691i.a> f26996a = new b<>(new C5691i.a[16], 0);

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "LXH/N;", "a", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: p0.f$a */
    static final class a extends C17544u implements C17642l<Throwable, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5688f f26997c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C5691i.a f26998d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C5688f fVar, C5691i.a aVar) {
            super(1);
            this.f26997c = fVar;
            this.f26998d = aVar;
        }

        public final void a(Throwable th2) {
            this.f26997c.f26996a.y(this.f26998d);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Throwable) obj);
            return C16807N.f139792a;
        }
    }

    public final void b(Throwable th2) {
        b<C5691i.a> bVar = this.f26996a;
        int r10 = bVar.r();
        C16320n[] nVarArr = new C16320n[r10];
        for (int i10 = 0; i10 < r10; i10++) {
            nVarArr[i10] = ((C5691i.a) bVar.q()[i10]).a();
        }
        for (int i11 = 0; i11 < r10; i11++) {
            nVarArr[i11].p(th2);
        }
        if (!this.f26996a.t()) {
            throw new IllegalStateException("uncancelled requests present");
        }
    }

    public final boolean c(C5691i.a aVar) {
        C5669i invoke = aVar.b().invoke();
        if (invoke == null) {
            C16320n<C16807N> a10 = aVar.a();
            x.a aVar2 = x.f139812b;
            a10.resumeWith(x.b(C16807N.f139792a));
            return false;
        }
        aVar.a().K(new a(this, aVar));
        C17974j jVar = new C17974j(0, this.f26996a.r() - 1);
        int p10 = jVar.p();
        int q10 = jVar.q();
        if (p10 <= q10) {
            while (true) {
                C5669i invoke2 = ((C5691i.a) this.f26996a.q()[q10]).b().invoke();
                if (invoke2 != null) {
                    C5669i w10 = invoke.w(invoke2);
                    if (C17542s.e(w10, invoke)) {
                        this.f26996a.a(q10 + 1, aVar);
                        return true;
                    } else if (!C17542s.e(w10, invoke2)) {
                        CancellationException cancellationException = new CancellationException("bringIntoView call interrupted by a newer, non-overlapping call");
                        int r10 = this.f26996a.r() - 1;
                        if (r10 <= q10) {
                            while (true) {
                                ((C5691i.a) this.f26996a.q()[q10]).a().p(cancellationException);
                                if (r10 == q10) {
                                    break;
                                }
                                r10++;
                            }
                        }
                    }
                }
                if (q10 == p10) {
                    break;
                }
                q10--;
            }
        }
        this.f26996a.a(0, aVar);
        return true;
    }

    public final void d() {
        C17974j jVar = new C17974j(0, this.f26996a.r() - 1);
        int p10 = jVar.p();
        int q10 = jVar.q();
        if (p10 <= q10) {
            while (true) {
                ((C5691i.a) this.f26996a.q()[p10]).a().resumeWith(x.b(C16807N.f139792a));
                if (p10 == q10) {
                    break;
                }
                p10++;
            }
        }
        this.f26996a.k();
    }
}
