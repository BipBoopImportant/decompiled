package uu;

import XH.x;
import dI.C17164e;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17542s;
import tu.C11995a;
import yu.C12517b;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J \u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H@¢\u0006\u0004\b\n\u0010\u000bJ\u001e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0007\u001a\u00020\u0006H@¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0010¨\u0006\u0011"}, d2 = {"Luu/b;", "Ltu/a;", "Luu/a;", "wayfindingRemoteDataSource", "<init>", "(Luu/a;)V", "", "storeId", "productNumber", "Lyu/b;", "a", "(Ljava/lang/String;Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "LXH/x;", "Lyu/a;", "b", "(Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "Luu/a;", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b implements C11995a {

    /* renamed from: a  reason: collision with root package name */
    private final C12125a f104425a;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.ingka.ikea.instore.wayfinding.datalayer.impl.WayfindingRepositoryImpl", f = "WayfindingRepositoryImpl.kt", l = {25}, m = "getWayfindingDetails-gIAlu-s")
    static final class a extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f104426c;

        /* renamed from: d  reason: collision with root package name */
        Object f104427d;

        /* renamed from: e  reason: collision with root package name */
        Object f104428e;

        /* renamed from: f  reason: collision with root package name */
        /* synthetic */ Object f104429f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ b f104430g;

        /* renamed from: h  reason: collision with root package name */
        int f104431h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(b bVar, C17164e<? super a> eVar) {
            super(eVar);
            this.f104430g = bVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f104429f = obj;
            this.f104431h |= Integer.MIN_VALUE;
            Object b10 = this.f104430g.b((String) null, this);
            return b10 == C17187b.f() ? b10 : x.a(b10);
        }
    }

    public b(C12125a aVar) {
        C17542s.j(aVar, "wayfindingRemoteDataSource");
        this.f104425a = aVar;
    }

    public Object a(String str, String str2, C17164e<? super C12517b> eVar) {
        return this.f104425a.a(str, str2, eVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object b(java.lang.String r6, dI.C17164e<? super XH.x<yu.C12516a>> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof uu.b.a
            if (r0 == 0) goto L_0x0013
            r0 = r7
            uu.b$a r0 = (uu.b.a) r0
            int r1 = r0.f104431h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f104431h = r1
            goto L_0x0018
        L_0x0013:
            uu.b$a r0 = new uu.b$a
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r1 = r0.f104429f
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f104431h
            r4 = 1
            if (r3 == 0) goto L_0x0043
            if (r3 != r4) goto L_0x003b
            java.lang.Object r6 = r0.f104428e
            dI.e r6 = (dI.C17164e) r6
            java.lang.Object r6 = r0.f104427d
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r6 = r0.f104426c
            uu.b r6 = (uu.b) r6
            XH.y.b(r1)
            XH.x r1 = (XH.x) r1
            java.lang.Object r6 = r1.j()
            goto L_0x0057
        L_0x003b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0043:
            XH.y.b(r1)
            uu.a r1 = r5.f104425a
            r0.f104426c = r5
            r0.f104427d = r6
            r0.f104428e = r7
            r0.f104431h = r4
            java.lang.Object r6 = r1.b(r6, r0)
            if (r6 != r2) goto L_0x0057
            return r2
        L_0x0057:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: uu.b.b(java.lang.String, dI.e):java.lang.Object");
    }
}
