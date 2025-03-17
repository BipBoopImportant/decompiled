package Aq;

import AH.C15412c;
import AH.C15414e;
import BH.C15462g;
import EH.C15636u;
import FH.c;
import XH.C16807N;
import dI.C17164e;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.P;
import pH.C17746a;
import uI.C18068q;
import uI.C18075x;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH@¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\bH@¢\u0006\u0004\b\u000e\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0010¨\u0006\u0011"}, d2 = {"LAq/b;", "LAq/a;", "LpH/a;", "httpClient", "LDq/a;", "endpointFactory", "<init>", "(LpH/a;LDq/a;)V", "", "payload", "Lcom/ingka/ikea/episod/datalayer/network/models/EpisodResponse;", "a", "(Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "LXH/N;", "b", "LpH/a;", "LDq/a;", "episod-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class b implements a {

    /* renamed from: a  reason: collision with root package name */
    private final C17746a f79071a;

    /* renamed from: b  reason: collision with root package name */
    private final Dq.a f79072b;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @f(c = "com.ingka.ikea.episod.datalayer.datasource.remote.RemoteDataSourceImpl", f = "RemoteDataSource.kt", l = {53, 54}, m = "sendSingleEvent")
    static final class a extends d {

        /* renamed from: c  reason: collision with root package name */
        /* synthetic */ Object f79073c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ b f79074d;

        /* renamed from: e  reason: collision with root package name */
        int f79075e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(b bVar, C17164e<? super a> eVar) {
            super(eVar);
            this.f79074d = bVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f79073c = obj;
            this.f79075e |= Integer.MIN_VALUE;
            return this.f79074d.a((String) null, this);
        }
    }

    public b(C17746a aVar, Dq.a aVar2) {
        C17542s.j(aVar, "httpClient");
        C17542s.j(aVar2, "endpointFactory");
        this.f79071a = aVar;
        this.f79072b = aVar2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00b6 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object a(java.lang.String r8, dI.C17164e<? super com.ingka.ikea.episod.datalayer.network.models.EpisodResponse> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof Aq.b.a
            if (r0 == 0) goto L_0x0013
            r0 = r9
            Aq.b$a r0 = (Aq.b.a) r0
            int r1 = r0.f79075e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f79075e = r1
            goto L_0x0018
        L_0x0013:
            Aq.b$a r0 = new Aq.b$a
            r0.<init>(r7, r9)
        L_0x0018:
            java.lang.Object r9 = r0.f79073c
            java.lang.Object r1 = eI.C17187b.f()
            int r2 = r0.f79075e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0039
            if (r2 == r4) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            XH.y.b(r9)
            goto L_0x00b7
        L_0x002d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0035:
            XH.y.b(r9)
            goto L_0x0096
        L_0x0039:
            XH.y.b(r9)
            pH.a r9 = r7.f79071a
            Dq.a r2 = r7.f79072b
            java.lang.String r2 = r2.b()
            AH.c r5 = new AH.c
            r5.<init>()
            AH.C15414e.b(r5, r2)
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            if (r8 != 0) goto L_0x0069
            FH.c r8 = FH.c.f134396a
            r5.j(r8)
            uI.q r8 = kotlin.jvm.internal.P.l(r2)
            java.lang.reflect.Type r6 = uI.C18075x.f(r8)
            uI.d r2 = kotlin.jvm.internal.P.b(r2)
            OH.a r8 = OH.b.c(r6, r2, r8)
            r5.k(r8)
            goto L_0x007f
        L_0x0069:
            r5.j(r8)
            uI.q r8 = kotlin.jvm.internal.P.l(r2)
            java.lang.reflect.Type r6 = uI.C18075x.f(r8)
            uI.d r2 = kotlin.jvm.internal.P.b(r2)
            OH.a r8 = OH.b.c(r6, r2, r8)
            r5.k(r8)
        L_0x007f:
            EH.u$a r8 = EH.C15636u.f134140b
            EH.u r8 = r8.c()
            r5.n(r8)
            BH.g r8 = new BH.g
            r8.<init>(r5, r9)
            r0.f79075e = r4
            java.lang.Object r9 = r8.c(r0)
            if (r9 != r1) goto L_0x0096
            return r1
        L_0x0096:
            BH.c r9 = (BH.C15458c) r9
            qH.b r8 = r9.h0()
            java.lang.Class<com.ingka.ikea.episod.datalayer.network.models.EpisodResponse> r9 = com.ingka.ikea.episod.datalayer.network.models.EpisodResponse.class
            uI.q r2 = kotlin.jvm.internal.P.l(r9)
            java.lang.reflect.Type r4 = uI.C18075x.f(r2)
            uI.d r9 = kotlin.jvm.internal.P.b(r9)
            OH.a r9 = OH.b.c(r4, r9, r2)
            r0.f79075e = r3
            java.lang.Object r9 = r8.a(r9, r0)
            if (r9 != r1) goto L_0x00b7
            return r1
        L_0x00b7:
            if (r9 == 0) goto L_0x00bc
            com.ingka.ikea.episod.datalayer.network.models.EpisodResponse r9 = (com.ingka.ikea.episod.datalayer.network.models.EpisodResponse) r9
            return r9
        L_0x00bc:
            java.lang.NullPointerException r8 = new java.lang.NullPointerException
            java.lang.String r9 = "null cannot be cast to non-null type com.ingka.ikea.episod.datalayer.network.models.EpisodResponse"
            r8.<init>(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: Aq.b.a(java.lang.String, dI.e):java.lang.Object");
    }

    public Object b(String str, C17164e<? super C16807N> eVar) {
        C17746a aVar = this.f79071a;
        String a10 = this.f79072b.a();
        C15412c cVar = new C15412c();
        C15414e.b(cVar, a10);
        Class<String> cls = String.class;
        if (str == null) {
            cVar.j(c.f134396a);
            C18068q l10 = P.l(cls);
            cVar.k(OH.b.c(C18075x.f(l10), P.b(cls), l10));
        } else {
            cVar.j(str);
            C18068q l11 = P.l(cls);
            cVar.k(OH.b.c(C18075x.f(l11), P.b(cls), l11));
        }
        cVar.n(C15636u.f134140b.c());
        Object c10 = new C15462g(cVar, aVar).c(eVar);
        return c10 == C17187b.f() ? c10 : C16807N.f139792a;
    }
}
