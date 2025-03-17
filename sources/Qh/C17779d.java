package qH;

import dI.C17164e;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H@ø\u0001\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u0002\u0004\n\u0002\b\u0019¨\u0006\u0003"}, d2 = {"LqH/b;", "a", "(LqH/b;LdI/e;)Ljava/lang/Object;", "ktor-client-core"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: qH.d  reason: case insensitive filesystem */
public final class C17779d {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @f(c = "io.ktor.client.call.SavedCallKt", f = "SavedCall.kt", l = {73}, m = "save")
    /* renamed from: qH.d$a */
    static final class a extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f146451c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f146452d;

        /* renamed from: e  reason: collision with root package name */
        int f146453e;

        a(C17164e<? super a> eVar) {
            super(eVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.f146452d = obj;
            this.f146453e |= Integer.MIN_VALUE;
            return C17779d.a((C17777b) null, this);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object a(qH.C17777b r8, dI.C17164e<? super qH.C17777b> r9) {
        /*
            boolean r0 = r9 instanceof qH.C17779d.a
            if (r0 == 0) goto L_0x0014
            r0 = r9
            qH.d$a r0 = (qH.C17779d.a) r0
            int r1 = r0.f146453e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0014
            int r1 = r1 - r2
            r0.f146453e = r1
        L_0x0012:
            r4 = r0
            goto L_0x001a
        L_0x0014:
            qH.d$a r0 = new qH.d$a
            r0.<init>(r9)
            goto L_0x0012
        L_0x001a:
            java.lang.Object r9 = r4.f146452d
            java.lang.Object r0 = eI.C17187b.f()
            int r1 = r4.f146453e
            r7 = 1
            if (r1 == 0) goto L_0x0037
            if (r1 != r7) goto L_0x002f
            java.lang.Object r8 = r4.f146451c
            qH.b r8 = (qH.C17777b) r8
            XH.y.b(r9)
            goto L_0x0051
        L_0x002f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0037:
            XH.y.b(r9)
            BH.c r9 = r8.f()
            io.ktor.utils.io.g r1 = r9.b()
            r4.f146451c = r8
            r4.f146453e = r7
            r2 = 0
            r5 = 1
            r6 = 0
            java.lang.Object r9 = io.ktor.utils.io.g.b.a(r1, r2, r4, r5, r6)
            if (r9 != r0) goto L_0x0051
            return r0
        L_0x0051:
            RH.k r9 = (RH.k) r9
            r0 = 0
            r1 = 0
            byte[] r9 = RH.w.c(r9, r0, r7, r1)
            qH.e r0 = new qH.e
            pH.a r1 = r8.c()
            AH.b r2 = r8.e()
            BH.c r8 = r8.f()
            r0.<init>(r1, r2, r8, r9)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: qH.C17779d.a(qH.b, dI.e):java.lang.Object");
    }
}
