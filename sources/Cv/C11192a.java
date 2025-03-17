package cv;

import dI.C17164e;
import ev.C11263a;
import gv.C11364a;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001c\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006HB¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000b¨\u0006\f"}, d2 = {"Lcv/a;", "Lgv/a;", "Lev/a;", "repository", "<init>", "(Lev/a;)V", "LTJ/g;", "LXH/x;", "Lhv/b;", "a", "(LdI/e;)Ljava/lang/Object;", "Lev/a;", "liveshopping-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: cv.a  reason: case insensitive filesystem */
public final class C11192a implements C11364a {

    /* renamed from: a  reason: collision with root package name */
    private final C11263a f96835a;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.ingka.ikea.liveshopping.impl.data.GetEntryPointDataUseCaseImpl", f = "GetEntryPointDataUseCaseImpl.kt", l = {18}, m = "invoke")
    /* renamed from: cv.a$a  reason: collision with other inner class name */
    static final class C2145a extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f96836c;

        /* renamed from: d  reason: collision with root package name */
        Object f96837d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f96838e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C11192a f96839f;

        /* renamed from: g  reason: collision with root package name */
        int f96840g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2145a(C11192a aVar, C17164e<? super C2145a> eVar) {
            super(eVar);
            this.f96839f = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f96838e = obj;
            this.f96840g |= Integer.MIN_VALUE;
            return this.f96839f.a(this);
        }
    }

    public C11192a(C11263a aVar) {
        C17542s.j(aVar, "repository");
        this.f96835a = aVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object a(dI.C17164e<? super TJ.C16532g<XH.x<hv.C11386b>>> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof cv.C11192a.C2145a
            if (r0 == 0) goto L_0x0013
            r0 = r6
            cv.a$a r0 = (cv.C11192a.C2145a) r0
            int r1 = r0.f96840g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f96840g = r1
            goto L_0x0018
        L_0x0013:
            cv.a$a r0 = new cv.a$a
            r0.<init>(r5, r6)
        L_0x0018:
            java.lang.Object r1 = r0.f96838e
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f96840g
            r4 = 1
            if (r3 == 0) goto L_0x003f
            if (r3 != r4) goto L_0x0037
            java.lang.Object r6 = r0.f96837d
            dI.e r6 = (dI.C17164e) r6
            java.lang.Object r6 = r0.f96836c
            cv.a r6 = (cv.C11192a) r6
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
            ev.a r1 = r5.f96835a
            r0.f96836c = r5
            r0.f96837d = r6
            r0.f96840g = r4
            java.lang.Object r6 = r1.a(r0)
            if (r6 != r2) goto L_0x0051
            return r2
        L_0x0051:
            XH.x r6 = XH.x.a(r6)
            TJ.g r6 = TJ.C16534i.J(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: cv.C11192a.a(dI.e):java.lang.Object");
    }
}
