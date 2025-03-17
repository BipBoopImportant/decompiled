package eD;

import cD.C14032d;
import dI.C17164e;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006H@¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\t¨\u0006\n"}, d2 = {"LeD/v;", "LcD/d;", "LeD/u;", "publisherAccountEndpoint", "<init>", "(LeD/u;)V", "", "a", "(LdI/e;)Ljava/lang/Object;", "LeD/u;", "useraccount-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class v implements C14032d {

    /* renamed from: a  reason: collision with root package name */
    private final u f126603a;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.ingka.ikea.useraccount.impl.PublisherAccountRepositoryImpl", f = "PublisherAccountRepositoryImpl.kt", l = {14}, m = "checkPublisherAccount")
    static final class a extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f126604c;

        /* renamed from: d  reason: collision with root package name */
        Object f126605d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f126606e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ v f126607f;

        /* renamed from: g  reason: collision with root package name */
        int f126608g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(v vVar, C17164e<? super a> eVar) {
            super(eVar);
            this.f126607f = vVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f126606e = obj;
            this.f126608g |= Integer.MIN_VALUE;
            return this.f126607f.a(this);
        }
    }

    public v(u uVar) {
        C17542s.j(uVar, "publisherAccountEndpoint");
        this.f126603a = uVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object a(dI.C17164e<? super java.lang.Boolean> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof eD.v.a
            if (r0 == 0) goto L_0x0013
            r0 = r6
            eD.v$a r0 = (eD.v.a) r0
            int r1 = r0.f126608g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f126608g = r1
            goto L_0x0018
        L_0x0013:
            eD.v$a r0 = new eD.v$a
            r0.<init>(r5, r6)
        L_0x0018:
            java.lang.Object r1 = r0.f126606e
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f126608g
            r4 = 1
            if (r3 == 0) goto L_0x0039
            if (r3 != r4) goto L_0x0031
            java.lang.Object r6 = r0.f126605d
            dI.e r6 = (dI.C17164e) r6
            java.lang.Object r6 = r0.f126604c
            eD.v r6 = (eD.v) r6
            XH.y.b(r1)
            goto L_0x004b
        L_0x0031:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x0039:
            XH.y.b(r1)
            eD.u r1 = r5.f126603a
            r0.f126604c = r5
            r0.f126605d = r6
            r0.f126608g = r4
            java.lang.Object r1 = r1.a(r0)
            if (r1 != r2) goto L_0x004b
            return r2
        L_0x004b:
            QL.x r1 = (QL.x) r1
            boolean r6 = r1.e()
            java.lang.Boolean r6 = kotlin.coroutines.jvm.internal.b.a(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: eD.v.a(dI.e):java.lang.Object");
    }
}
