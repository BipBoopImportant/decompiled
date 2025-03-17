package SJ;

import QJ.C16293K;
import QJ.C16320n;
import QJ.Q;
import QJ.T;
import XH.C16807N;
import XH.x;
import dI.C17164e;
import dI.C17168i;
import dI.C17169j;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import nI.C17631a;
import nI.C17642l;
import nI.p;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a(\u0010\u0004\u001a\u00020\u0002*\u0006\u0012\u0002\b\u00030\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H@¢\u0006\u0004\b\u0004\u0010\u0005\u001a_\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f\"\u0004\b\u0000\u0010\u0006*\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2*\b\u0001\u0010\u0003\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\fH\u0007¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0001\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f\"\u0004\b\u0000\u0010\u0006*\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u00142\u001e\b\u0002\u0010\u0019\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0017\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0016j\u0004\u0018\u0001`\u00182*\b\u0001\u0010\u0003\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\fH\u0000¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"LSJ/y;", "Lkotlin/Function0;", "LXH/N;", "block", "a", "(LSJ/y;LnI/a;LdI/e;)Ljava/lang/Object;", "E", "LQJ/Q;", "LdI/i;", "context", "", "capacity", "Lkotlin/Function2;", "LdI/e;", "", "LSJ/A;", "c", "(LQJ/Q;LdI/i;ILnI/p;)LSJ/A;", "LSJ/d;", "onBufferOverflow", "LQJ/T;", "start", "Lkotlin/Function1;", "", "Lkotlinx/coroutines/CompletionHandler;", "onCompletion", "b", "(LQJ/Q;LdI/i;ILSJ/d;LQJ/T;LnI/l;LnI/p;)LSJ/A;", "kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: SJ.w  reason: case insensitive filesystem */
public final class C16447w {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "kotlinx.coroutines.channels.ProduceKt", f = "Produce.kt", l = {302}, m = "awaitClose")
    /* renamed from: SJ.w$a */
    static final class a extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f138343c;

        /* renamed from: d  reason: collision with root package name */
        Object f138344d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f138345e;

        /* renamed from: f  reason: collision with root package name */
        int f138346f;

        a(C17164e<? super a> eVar) {
            super(eVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.f138345e = obj;
            this.f138346f |= Integer.MIN_VALUE;
            return C16447w.a((C16449y<?>) null, (C17631a<C16807N>) null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: SJ.w$b */
    static final class b implements C17642l<Throwable, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16320n<C16807N> f138347a;

        b(C16320n<? super C16807N> nVar) {
            this.f138347a = nVar;
        }

        public final void a(Throwable th2) {
            C16320n<C16807N> nVar = this.f138347a;
            x.a aVar = x.f139812b;
            nVar.resumeWith(x.b(C16807N.f139792a));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Throwable) obj);
            return C16807N.f139792a;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: nI.a<XH.N>} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object a(SJ.C16449y<?> r4, nI.C17631a<XH.C16807N> r5, dI.C17164e<? super XH.C16807N> r6) {
        /*
            boolean r0 = r6 instanceof SJ.C16447w.a
            if (r0 == 0) goto L_0x0013
            r0 = r6
            SJ.w$a r0 = (SJ.C16447w.a) r0
            int r1 = r0.f138346f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f138346f = r1
            goto L_0x0018
        L_0x0013:
            SJ.w$a r0 = new SJ.w$a
            r0.<init>(r6)
        L_0x0018:
            java.lang.Object r6 = r0.f138345e
            java.lang.Object r1 = eI.C17187b.f()
            int r2 = r0.f138346f
            r3 = 1
            if (r2 == 0) goto L_0x003c
            if (r2 != r3) goto L_0x0034
            java.lang.Object r4 = r0.f138344d
            r5 = r4
            nI.a r5 = (nI.C17631a) r5
            java.lang.Object r4 = r0.f138343c
            SJ.y r4 = (SJ.C16449y) r4
            XH.y.b(r6)     // Catch:{ all -> 0x0032 }
            goto L_0x0075
        L_0x0032:
            r4 = move-exception
            goto L_0x007b
        L_0x0034:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x003c:
            XH.y.b(r6)
            dI.i r6 = r0.getContext()
            QJ.F0$b r2 = QJ.F0.f137562d0
            dI.i$b r6 = r6.get(r2)
            if (r6 != r4) goto L_0x007f
            r0.f138343c = r4     // Catch:{ all -> 0x0032 }
            r0.f138344d = r5     // Catch:{ all -> 0x0032 }
            r0.f138346f = r3     // Catch:{ all -> 0x0032 }
            QJ.p r6 = new QJ.p     // Catch:{ all -> 0x0032 }
            dI.e r2 = eI.C17187b.c(r0)     // Catch:{ all -> 0x0032 }
            r6.<init>(r2, r3)     // Catch:{ all -> 0x0032 }
            r6.C()     // Catch:{ all -> 0x0032 }
            SJ.w$b r2 = new SJ.w$b     // Catch:{ all -> 0x0032 }
            r2.<init>(r6)     // Catch:{ all -> 0x0032 }
            r4.b(r2)     // Catch:{ all -> 0x0032 }
            java.lang.Object r4 = r6.w()     // Catch:{ all -> 0x0032 }
            java.lang.Object r6 = eI.C17187b.f()     // Catch:{ all -> 0x0032 }
            if (r4 != r6) goto L_0x0072
            kotlin.coroutines.jvm.internal.h.c(r0)     // Catch:{ all -> 0x0032 }
        L_0x0072:
            if (r4 != r1) goto L_0x0075
            return r1
        L_0x0075:
            r5.invoke()
            XH.N r4 = XH.C16807N.f139792a
            return r4
        L_0x007b:
            r5.invoke()
            throw r4
        L_0x007f:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "awaitClose() can only be invoked from the producer context"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: SJ.C16447w.a(SJ.y, nI.a, dI.e):java.lang.Object");
    }

    public static final <E> C16422A<E> b(Q q10, C17168i iVar, int i10, C16428d dVar, T t10, C17642l<? super Throwable, C16807N> lVar, p<? super C16449y<? super E>, ? super C17164e<? super C16807N>, ? extends Object> pVar) {
        C16448x xVar = new C16448x(C16293K.j(q10, iVar), C16437m.b(i10, dVar, (C17642l) null, 4, (Object) null));
        if (lVar != null) {
            xVar.s(lVar);
        }
        xVar.e1(t10, xVar, pVar);
        return xVar;
    }

    public static final <E> C16422A<E> c(Q q10, C17168i iVar, int i10, p<? super C16449y<? super E>, ? super C17164e<? super C16807N>, ? extends Object> pVar) {
        return b(q10, iVar, i10, C16428d.SUSPEND, T.DEFAULT, (C17642l<? super Throwable, C16807N>) null, pVar);
    }

    public static /* synthetic */ C16422A d(Q q10, C17168i iVar, int i10, C16428d dVar, T t10, C17642l lVar, p pVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            iVar = C17169j.f142968a;
        }
        C17168i iVar2 = iVar;
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        int i12 = i10;
        if ((i11 & 4) != 0) {
            dVar = C16428d.SUSPEND;
        }
        C16428d dVar2 = dVar;
        if ((i11 & 8) != 0) {
            t10 = T.DEFAULT;
        }
        T t11 = t10;
        if ((i11 & 16) != 0) {
            lVar = null;
        }
        return b(q10, iVar2, i12, dVar2, t11, lVar, pVar);
    }

    public static /* synthetic */ C16422A e(Q q10, C17168i iVar, int i10, p pVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            iVar = C17169j.f142968a;
        }
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        return c(q10, iVar, i10, pVar);
    }
}
