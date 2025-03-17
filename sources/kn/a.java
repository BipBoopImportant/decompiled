package Kn;

import Ae.b;
import dI.C17164e;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J4\u0010\n\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00062\u001c\u0010\t\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007HB¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\f¨\u0006\r"}, d2 = {"LKn/a;", "", "LAe/b;", "developerAnalytics", "<init>", "(LAe/b;)V", "T", "Lkotlin/Function1;", "LdI/e;", "block", "a", "(LnI/l;LdI/e;)Ljava/lang/Object;", "LAe/b;", "caas-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private final b f82887a;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.ingka.ikea.caas.impl.network.usecase.LogSerializationExceptionUseCase", f = "LogSerializationExceptionUseCase.kt", l = {19}, m = "invoke")
    /* renamed from: Kn.a$a  reason: collision with other inner class name */
    static final class C1641a<T> extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f82888c;

        /* renamed from: d  reason: collision with root package name */
        Object f82889d;

        /* renamed from: e  reason: collision with root package name */
        Object f82890e;

        /* renamed from: f  reason: collision with root package name */
        /* synthetic */ Object f82891f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ a f82892g;

        /* renamed from: h  reason: collision with root package name */
        int f82893h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1641a(a aVar, C17164e<? super C1641a> eVar) {
            super(eVar);
            this.f82892g = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f82891f = obj;
            this.f82893h |= Integer.MIN_VALUE;
            return this.f82892g.a((C17642l) null, this);
        }
    }

    public a(b bVar) {
        C17542s.j(bVar, "developerAnalytics");
        this.f82887a = bVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <T> java.lang.Object a(nI.C17642l<? super dI.C17164e<? super T>, ? extends java.lang.Object> r6, dI.C17164e<? super T> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof Kn.a.C1641a
            if (r0 == 0) goto L_0x0013
            r0 = r7
            Kn.a$a r0 = (Kn.a.C1641a) r0
            int r1 = r0.f82893h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f82893h = r1
            goto L_0x0018
        L_0x0013:
            Kn.a$a r0 = new Kn.a$a
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r1 = r0.f82891f
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f82893h
            r4 = 1
            if (r3 == 0) goto L_0x003f
            if (r3 != r4) goto L_0x0037
            java.lang.Object r6 = r0.f82890e
            dI.e r6 = (dI.C17164e) r6
            java.lang.Object r6 = r0.f82889d
            nI.l r6 = (nI.C17642l) r6
            java.lang.Object r6 = r0.f82888c
            Kn.a r6 = (Kn.a) r6
            XH.y.b(r1)     // Catch:{ q -> 0x0035 }
            goto L_0x0051
        L_0x0035:
            r7 = move-exception
            goto L_0x0054
        L_0x0037:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x003f:
            XH.y.b(r1)
            r0.f82888c = r5     // Catch:{ q -> 0x0052 }
            r0.f82889d = r6     // Catch:{ q -> 0x0052 }
            r0.f82890e = r7     // Catch:{ q -> 0x0052 }
            r0.f82893h = r4     // Catch:{ q -> 0x0052 }
            java.lang.Object r1 = r6.invoke(r0)     // Catch:{ q -> 0x0052 }
            if (r1 != r2) goto L_0x0051
            return r2
        L_0x0051:
            return r1
        L_0x0052:
            r7 = move-exception
            r6 = r5
        L_0x0054:
            Ae.b r6 = r6.f82887a
            r6.a(r7)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: Kn.a.a(nI.l, dI.e):java.lang.Object");
    }
}
