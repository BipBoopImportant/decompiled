package Sz;

import XH.x;
import dI.C17164e;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H@¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\n¨\u0006\u000b"}, d2 = {"LSz/a;", "LPz/a;", "LTz/a;", "remoteDataSource", "<init>", "(LTz/a;)V", "LXH/x;", "LQz/a;", "a", "(LdI/e;)Ljava/lang/Object;", "LTz/a;", "seasonability-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a implements Pz.a {

    /* renamed from: a  reason: collision with root package name */
    private final Tz.a f116643a;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.ingka.ikea.seasonability.impl.data.PromoImageRepositoryImpl", f = "PromoImageRepositoryImpl.kt", l = {16}, m = "getPromoImages-IoAF18A")
    /* renamed from: Sz.a$a  reason: collision with other inner class name */
    static final class C2853a extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f116644c;

        /* renamed from: d  reason: collision with root package name */
        Object f116645d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f116646e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ a f116647f;

        /* renamed from: g  reason: collision with root package name */
        int f116648g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2853a(a aVar, C17164e<? super C2853a> eVar) {
            super(eVar);
            this.f116647f = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f116646e = obj;
            this.f116648g |= Integer.MIN_VALUE;
            Object a10 = this.f116647f.a(this);
            return a10 == C17187b.f() ? a10 : x.a(a10);
        }
    }

    public a(Tz.a aVar) {
        C17542s.j(aVar, "remoteDataSource");
        this.f116643a = aVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object a(dI.C17164e<? super XH.x<Qz.a>> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof Sz.a.C2853a
            if (r0 == 0) goto L_0x0013
            r0 = r6
            Sz.a$a r0 = (Sz.a.C2853a) r0
            int r1 = r0.f116648g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f116648g = r1
            goto L_0x0018
        L_0x0013:
            Sz.a$a r0 = new Sz.a$a
            r0.<init>(r5, r6)
        L_0x0018:
            java.lang.Object r1 = r0.f116646e
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f116648g
            r4 = 1
            if (r3 == 0) goto L_0x003f
            if (r3 != r4) goto L_0x0037
            java.lang.Object r6 = r0.f116645d
            dI.e r6 = (dI.C17164e) r6
            java.lang.Object r6 = r0.f116644c
            Sz.a r6 = (Sz.a) r6
            XH.y.b(r1)
            XH.x r1 = (XH.x) r1
            java.lang.Object r6 = r1.j()
            goto L_0x0051
        L_0x0037:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x003f:
            XH.y.b(r1)
            Tz.a r1 = r5.f116643a
            r0.f116644c = r5
            r0.f116645d = r6
            r0.f116648g = r4
            java.lang.Object r6 = r1.a(r0)
            if (r6 != r2) goto L_0x0051
            return r2
        L_0x0051:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: Sz.a.a(dI.e):java.lang.Object");
    }
}
