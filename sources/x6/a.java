package X6;

import GK.C15774B;
import GK.C15775C;
import GK.C15776D;
import GK.C15777E;
import GK.C15786e;
import GK.C15802u;
import GK.C15805x;
import GK.z;
import N6.c;
import N6.d;
import N6.f;
import N6.g;
import N6.i;
import N6.j;
import QJ.C16324p;
import WK.C16771f;
import XH.C16807N;
import XH.x;
import XH.y;
import YH.C16877v;
import YH.U;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import dI.C17164e;
import eI.C17187b;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.h;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17642l;
import tI.C17974j;
import tI.C17978n;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bB\u0013\b\u0016\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000bB\u0019\b\u0016\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000eJ\u001b\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH@ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0017\u0002\u0004\n\u0002\b\u0019¨\u0006\u0018"}, d2 = {"LX6/a;", "LX6/c;", "LGK/e$a;", "httpCallFactory", "<init>", "(LGK/e$a;)V", "LGK/z;", "okHttpClient", "(LGK/z;)V", "", "timeoutMillis", "(J)V", "connectTimeout", "readTimeout", "(JJ)V", "LN6/g;", "request", "LN6/i;", "a", "(LN6/g;LdI/e;)Ljava/lang/Object;", "LXH/N;", "b", "()V", "LGK/e$a;", "apollo-runtime"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class a implements c {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final C15786e.a f40705a;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "LXH/N;", "a", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 5, 1})
    /* renamed from: X6.a$a  reason: collision with other inner class name */
    static final class C0676a extends C17544u implements C17642l<Throwable, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C15786e f40706c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0676a(C15786e eVar) {
            super(1);
            this.f40706c = eVar;
        }

        public final void a(Throwable th2) {
            this.f40706c.cancel();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Throwable) obj);
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000/\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"X6/a$b", "LGK/C;", "LGK/x;", "b", "()LGK/x;", "", "a", "()J", "", "g", "()Z", "LWK/f;", "sink", "LXH/N;", "h", "(LWK/f;)V", "apollo-runtime"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class b extends C15775C {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ c f40707b;

        b(c cVar) {
            this.f40707b = cVar;
        }

        public long a() {
            return this.f40707b.c();
        }

        public C15805x b() {
            return C15805x.f135130e.a(this.f40707b.b());
        }

        public boolean g() {
            return this.f40707b instanceof j;
        }

        public void h(C16771f fVar) {
            C17542s.j(fVar, "sink");
            this.f40707b.a(fVar);
        }
    }

    public a(C15786e.a aVar) {
        C17542s.j(aVar, "httpCallFactory");
        this.f40705a = aVar;
    }

    public Object a(g gVar, C17164e<? super i> eVar) {
        C16324p pVar = new C16324p(C17187b.c(eVar), 1);
        pVar.C();
        C15774B.a f10 = new C15774B.a().n(gVar.d()).f(W6.b.b(gVar.b()));
        if (gVar.c() == f.Get) {
            f10.d();
        } else {
            c a10 = gVar.a();
            if (a10 != null) {
                f10.h(new b(a10));
            } else {
                throw new IllegalStateException("HTTP POST requires a request body");
            }
        }
        C15786e b10 = this.f40705a.b(f10.b());
        pVar.K(new C0676a(b10));
        C15776D d10 = null;
        try {
            d10 = FirebasePerfOkHttpClient.execute(b10);
            e = null;
        } catch (IOException e10) {
            e = e10;
        }
        if (e != null) {
            x.a aVar = x.f139812b;
            pVar.resumeWith(x.b(y.a(new S6.c("Failed to execute GraphQL http network request", e))));
        } else {
            x.a aVar2 = x.f139812b;
            C17542s.g(d10);
            i.a aVar3 = new i.a(d10.g());
            C15777E c10 = d10.c();
            C17542s.g(c10);
            i.a b11 = aVar3.b(c10.k3());
            C15802u q10 = d10.q();
            C17974j w10 = C17978n.w(0, q10.size());
            ArrayList arrayList = new ArrayList(C16877v.y(w10, 10));
            Iterator it = w10.iterator();
            while (it.hasNext()) {
                int c11 = ((U) it).c();
                arrayList.add(new d(q10.k(c11), q10.t(c11)));
            }
            Object b12 = x.b(b11.a(arrayList).c());
            y.b(b12);
            pVar.resumeWith(x.b(b12));
        }
        Object w11 = pVar.w();
        if (w11 == C17187b.f()) {
            h.c(eVar);
        }
        return w11;
    }

    public void b() {
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public a(z zVar) {
        this((C15786e.a) zVar);
        C17542s.j(zVar, "okHttpClient");
    }

    public a(long j10) {
        this(j10, j10);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(long j10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? 60000 : j10);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public a(long r3, long r5) {
        /*
            r2 = this;
            GK.z$a r0 = new GK.z$a
            r0.<init>()
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MILLISECONDS
            GK.z$a r3 = r0.f(r3, r1)
            GK.z$a r3 = r3.R(r5, r1)
            GK.z r3 = r3.c()
            r2.<init>((GK.z) r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X6.a.<init>(long, long):void");
    }
}
