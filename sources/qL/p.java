package QL;

import QJ.C16320n;
import QJ.C16324p;
import XH.C16807N;
import XH.C16821l;
import XH.x;
import XH.y;
import dI.C17164e;
import eI.C17187b;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import nI.C17642l;

@Metadata(d1 = {"\u0000&\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\u0010\u0001\n\u0002\b\u0003\u001a$\u0010\u0003\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004\u001a(\u0010\u0005\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000*\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0004\u001a\u001a\u0010\u0007\u001a\u00020\u0006*\b\u0012\u0004\u0012\u00020\u00060\u0002H@¢\u0006\u0004\b\u0007\u0010\u0004\u001a&\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\t\u0010\u0004\u001a\u0014\u0010\f\u001a\u00020\u000b*\u00020\nH@¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"", "T", "LQL/d;", "a", "(LQL/d;LdI/e;)Ljava/lang/Object;", "b", "LXH/N;", "d", "LQL/x;", "c", "", "", "e", "(Ljava/lang/Throwable;LdI/e;)Ljava/lang/Object;", "retrofit"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class p {

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "T", "", "it", "LXH/N;", "a", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
    static final class a extends C17544u implements C17642l<Throwable, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C16361d<T> f137775c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C16361d<T> dVar) {
            super(1);
            this.f137775c = dVar;
        }

        public final void a(Throwable th2) {
            this.f137775c.cancel();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Throwable) obj);
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J+\u0010\u0007\u001a\u00020\u00062\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\u000b\u001a\u00020\u00062\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"QL/p$b", "LQL/f;", "LQL/d;", "call", "LQL/x;", "response", "LXH/N;", "b", "(LQL/d;LQL/x;)V", "", "t", "a", "(LQL/d;Ljava/lang/Throwable;)V", "retrofit"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements f<T> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16320n<T> f137776a;

        b(C16320n<? super T> nVar) {
            this.f137776a = nVar;
        }

        public void a(C16361d<T> dVar, Throwable th2) {
            C17542s.j(dVar, "call");
            C17542s.j(th2, "t");
            C16320n<T> nVar = this.f137776a;
            x.a aVar = x.f139812b;
            nVar.resumeWith(x.b(y.a(th2)));
        }

        public void b(C16361d<T> dVar, x<T> xVar) {
            C17542s.j(dVar, "call");
            C17542s.j(xVar, "response");
            if (xVar.e()) {
                T a10 = xVar.a();
                if (a10 == null) {
                    Object j10 = dVar.t().j(o.class);
                    C17542s.g(j10);
                    o oVar = (o) j10;
                    Class<?> b10 = oVar.b();
                    Method a11 = oVar.a();
                    C16821l lVar = new C16821l("Response from " + b10.getName() + '.' + a11.getName() + " was null but response body type was declared as non-null");
                    C16320n<T> nVar = this.f137776a;
                    x.a aVar = x.f139812b;
                    nVar.resumeWith(x.b(y.a(lVar)));
                    return;
                }
                this.f137776a.resumeWith(x.b(a10));
                return;
            }
            C16320n<T> nVar2 = this.f137776a;
            x.a aVar2 = x.f139812b;
            nVar2.resumeWith(x.b(y.a(new m(xVar))));
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "T", "", "it", "LXH/N;", "a", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
    static final class c extends C17544u implements C17642l<Throwable, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C16361d<T> f137777c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(C16361d<T> dVar) {
            super(1);
            this.f137777c = dVar;
        }

        public final void a(Throwable th2) {
            this.f137777c.cancel();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Throwable) obj);
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0001J/\u0010\u0007\u001a\u00020\u00062\u000e\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00022\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\u000b\u001a\u00020\u00062\u000e\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00022\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"QL/p$d", "LQL/f;", "LQL/d;", "call", "LQL/x;", "response", "LXH/N;", "b", "(LQL/d;LQL/x;)V", "", "t", "a", "(LQL/d;Ljava/lang/Throwable;)V", "retrofit"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class d implements f<T> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16320n<T> f137778a;

        d(C16320n<? super T> nVar) {
            this.f137778a = nVar;
        }

        public void a(C16361d<T> dVar, Throwable th2) {
            C17542s.j(dVar, "call");
            C17542s.j(th2, "t");
            C16320n<T> nVar = this.f137778a;
            x.a aVar = x.f139812b;
            nVar.resumeWith(x.b(y.a(th2)));
        }

        public void b(C16361d<T> dVar, x<T> xVar) {
            C17542s.j(dVar, "call");
            C17542s.j(xVar, "response");
            if (xVar.e()) {
                C16320n<T> nVar = this.f137778a;
                x.a aVar = x.f139812b;
                nVar.resumeWith(x.b(xVar.a()));
                return;
            }
            C16320n<T> nVar2 = this.f137778a;
            x.a aVar2 = x.f139812b;
            nVar2.resumeWith(x.b(y.a(new m(xVar))));
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "it", "LXH/N;", "a", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
    static final class e extends C17544u implements C17642l<Throwable, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C16361d<T> f137779c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(C16361d<T> dVar) {
            super(1);
            this.f137779c = dVar;
        }

        public final void a(Throwable th2) {
            this.f137779c.cancel();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Throwable) obj);
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J+\u0010\u0007\u001a\u00020\u00062\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\u000b\u001a\u00020\u00062\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"QL/p$f", "LQL/f;", "LQL/d;", "call", "LQL/x;", "response", "LXH/N;", "b", "(LQL/d;LQL/x;)V", "", "t", "a", "(LQL/d;Ljava/lang/Throwable;)V", "retrofit"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class f implements f<T> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16320n<x<T>> f137780a;

        f(C16320n<? super x<T>> nVar) {
            this.f137780a = nVar;
        }

        public void a(C16361d<T> dVar, Throwable th2) {
            C17542s.j(dVar, "call");
            C17542s.j(th2, "t");
            C16320n<x<T>> nVar = this.f137780a;
            x.a aVar = x.f139812b;
            nVar.resumeWith(x.b(y.a(th2)));
        }

        public void b(C16361d<T> dVar, x<T> xVar) {
            C17542s.j(dVar, "call");
            C17542s.j(xVar, "response");
            this.f137780a.resumeWith(x.b(xVar));
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "retrofit2.KotlinExtensions", f = "KotlinExtensions.kt", l = {119}, m = "suspendAndThrow")
    static final class g extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f137781c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f137782d;

        /* renamed from: e  reason: collision with root package name */
        int f137783e;

        g(C17164e<? super g> eVar) {
            super(eVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.f137782d = obj;
            this.f137783e |= Integer.MIN_VALUE;
            return p.e((Throwable) null, this);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LXH/N;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    static final class h implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C17164e<?> f137784a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Throwable f137785b;

        h(C17164e<?> eVar, Throwable th2) {
            this.f137784a = eVar;
            this.f137785b = th2;
        }

        public final void run() {
            C17164e<?> c10 = C17187b.c(this.f137784a);
            x.a aVar = x.f139812b;
            c10.resumeWith(x.b(y.a(this.f137785b)));
        }
    }

    public static final <T> Object a(C16361d<T> dVar, C17164e<? super T> eVar) {
        C16324p pVar = new C16324p(C17187b.c(eVar), 1);
        pVar.C();
        pVar.K(new a(dVar));
        dVar.E0(new b(pVar));
        Object w10 = pVar.w();
        if (w10 == C17187b.f()) {
            kotlin.coroutines.jvm.internal.h.c(eVar);
        }
        return w10;
    }

    public static final <T> Object b(C16361d<T> dVar, C17164e<? super T> eVar) {
        C16324p pVar = new C16324p(C17187b.c(eVar), 1);
        pVar.C();
        pVar.K(new c(dVar));
        dVar.E0(new d(pVar));
        Object w10 = pVar.w();
        if (w10 == C17187b.f()) {
            kotlin.coroutines.jvm.internal.h.c(eVar);
        }
        return w10;
    }

    public static final <T> Object c(C16361d<T> dVar, C17164e<? super x<T>> eVar) {
        C16324p pVar = new C16324p(C17187b.c(eVar), 1);
        pVar.C();
        pVar.K(new e(dVar));
        dVar.E0(new f(pVar));
        Object w10 = pVar.w();
        if (w10 == C17187b.f()) {
            kotlin.coroutines.jvm.internal.h.c(eVar);
        }
        return w10;
    }

    public static final Object d(C16361d<C16807N> dVar, C17164e<? super C16807N> eVar) {
        C17542s.h(dVar, "null cannot be cast to non-null type retrofit2.Call<kotlin.Unit?>");
        return b(dVar, eVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object e(java.lang.Throwable r4, dI.C17164e<?> r5) {
        /*
            boolean r0 = r5 instanceof QL.p.g
            if (r0 == 0) goto L_0x0013
            r0 = r5
            QL.p$g r0 = (QL.p.g) r0
            int r1 = r0.f137783e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f137783e = r1
            goto L_0x0018
        L_0x0013:
            QL.p$g r0 = new QL.p$g
            r0.<init>(r5)
        L_0x0018:
            java.lang.Object r5 = r0.f137782d
            java.lang.Object r1 = eI.C17187b.f()
            int r2 = r0.f137783e
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 == r3) goto L_0x002d
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x002d:
            java.lang.Object r4 = r0.f137781c
            java.lang.Throwable r4 = (java.lang.Throwable) r4
            XH.y.b(r5)
            goto L_0x005c
        L_0x0035:
            XH.y.b(r5)
            r0.f137781c = r4
            r0.f137783e = r3
            QJ.M r5 = QJ.C16311i0.a()
            dI.i r2 = r0.getContext()
            QL.p$h r3 = new QL.p$h
            r3.<init>(r0, r4)
            r5.E0(r2, r3)
            java.lang.Object r4 = eI.C17187b.f()
            java.lang.Object r5 = eI.C17187b.f()
            if (r4 != r5) goto L_0x0059
            kotlin.coroutines.jvm.internal.h.c(r0)
        L_0x0059:
            if (r4 != r1) goto L_0x005c
            return r1
        L_0x005c:
            XH.k r4 = new XH.k
            r4.<init>()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: QL.p.e(java.lang.Throwable, dI.e):java.lang.Object");
    }
}
