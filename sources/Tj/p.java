package Tj;

import Ry.f;
import dI.C17164e;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006HB¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000b¨\u0006\f"}, d2 = {"LTj/p;", "LTj/o;", "LRy/f;", "scanAndGoCartRepositoryFactory", "<init>", "(LRy/f;)V", "", "barcode", "LTj/o$a;", "a", "(Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "LRy/f;", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class p implements o {

    /* renamed from: a  reason: collision with root package name */
    private final f f87667a;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.scanandgoonlineredesign.usecase.GetQuantityForItemInCartUseCaseImpl", f = "GetQuantityForItemInCartUseCase.kt", l = {44}, m = "invoke")
    static final class a extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f87668c;

        /* renamed from: d  reason: collision with root package name */
        Object f87669d;

        /* renamed from: e  reason: collision with root package name */
        Object f87670e;

        /* renamed from: f  reason: collision with root package name */
        /* synthetic */ Object f87671f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ p f87672g;

        /* renamed from: h  reason: collision with root package name */
        int f87673h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(p pVar, C17164e<? super a> eVar) {
            super(eVar);
            this.f87672g = pVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f87671f = obj;
            this.f87673h |= Integer.MIN_VALUE;
            return this.f87672g.a((String) null, this);
        }
    }

    public p(f fVar) {
        C17542s.j(fVar, "scanAndGoCartRepositoryFactory");
        this.f87667a = fVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object a(java.lang.String r6, dI.C17164e<? super Tj.o.a> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof Tj.p.a
            if (r0 == 0) goto L_0x0013
            r0 = r7
            Tj.p$a r0 = (Tj.p.a) r0
            int r1 = r0.f87673h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f87673h = r1
            goto L_0x0018
        L_0x0013:
            Tj.p$a r0 = new Tj.p$a
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r1 = r0.f87671f
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f87673h
            r4 = 1
            if (r3 == 0) goto L_0x003d
            if (r3 != r4) goto L_0x0035
            java.lang.Object r6 = r0.f87670e
            dI.e r6 = (dI.C17164e) r6
            java.lang.Object r6 = r0.f87669d
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r6 = r0.f87668c
            Tj.p r6 = (Tj.p) r6
            XH.y.b(r1)
            goto L_0x0055
        L_0x0035:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x003d:
            XH.y.b(r1)
            Ry.f r1 = r5.f87667a
            Ry.e r1 = r1.invoke()
            r0.f87668c = r5
            r0.f87669d = r6
            r0.f87670e = r7
            r0.f87673h = r4
            java.lang.Object r1 = r1.b(r6, r0)
            if (r1 != r2) goto L_0x0055
            return r2
        L_0x0055:
            rz.g r1 = (rz.C15014g) r1
            r6 = 0
            r7 = 0
            if (r1 == 0) goto L_0x0076
            rz.U r0 = r1.h()
            int r0 = r0.c()
            boolean r1 = r1.b()
            if (r1 == 0) goto L_0x0070
            Tj.o$a r1 = new Tj.o$a
            r2 = 2
            r1.<init>(r0, r7, r2, r6)
            goto L_0x007c
        L_0x0070:
            Tj.o$a r1 = new Tj.o$a
            r1.<init>(r7, r0, r4, r6)
            goto L_0x007c
        L_0x0076:
            Tj.o$a r1 = new Tj.o$a
            r0 = 3
            r1.<init>(r7, r7, r0, r6)
        L_0x007c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Tj.p.a(java.lang.String, dI.e):java.lang.Object");
    }
}
