package c6;

import T5.j;
import c6.C7095a;
import dI.C17164e;
import k6.C8441h;
import k6.C8450q;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import r6.s;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a:\u0010\n\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH@¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lc6/a$b;", "result", "Lk6/h;", "request", "Lk6/q;", "options", "LT5/j;", "eventListener", "Lr6/s;", "logger", "a", "(Lc6/a$b;Lk6/h;Lk6/q;LT5/j;Lr6/s;LdI/e;)Ljava/lang/Object;", "coil-core_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: c6.b  reason: case insensitive filesystem */
public final class C7096b {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "coil3.intercept.EngineInterceptorKt", f = "EngineInterceptor.kt", l = {259}, m = "transform")
    /* renamed from: c6.b$a */
    static final class a extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f45727c;

        /* renamed from: d  reason: collision with root package name */
        Object f45728d;

        /* renamed from: e  reason: collision with root package name */
        Object f45729e;

        /* renamed from: f  reason: collision with root package name */
        Object f45730f;

        /* renamed from: g  reason: collision with root package name */
        Object f45731g;

        /* renamed from: h  reason: collision with root package name */
        int f45732h;

        /* renamed from: i  reason: collision with root package name */
        int f45733i;

        /* renamed from: j  reason: collision with root package name */
        /* synthetic */ Object f45734j;

        /* renamed from: k  reason: collision with root package name */
        int f45735k;

        a(C17164e<? super a> eVar) {
            super(eVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.f45734j = obj;
            this.f45735k |= Integer.MIN_VALUE;
            return C7096b.a((C7095a.b) null, (C8441h) null, (C8450q) null, (j) null, (s) null, this);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0029  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object a(c6.C7095a.b r19, k6.C8441h r20, k6.C8450q r21, T5.j r22, r6.s r23, dI.C17164e<? super c6.C7095a.b> r24) {
        /*
            r0 = r23
            r1 = r24
            boolean r2 = r1 instanceof c6.C7096b.a
            if (r2 == 0) goto L_0x0017
            r2 = r1
            c6.b$a r2 = (c6.C7096b.a) r2
            int r3 = r2.f45735k
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.f45735k = r3
            goto L_0x001c
        L_0x0017:
            c6.b$a r2 = new c6.b$a
            r2.<init>(r1)
        L_0x001c:
            java.lang.Object r1 = r2.f45734j
            java.lang.Object r3 = eI.C17187b.f()
            int r4 = r2.f45735k
            r5 = 0
            r6 = 0
            r7 = 1
            if (r4 == 0) goto L_0x0055
            if (r4 != r7) goto L_0x004d
            int r0 = r2.f45733i
            int r4 = r2.f45732h
            java.lang.Object r8 = r2.f45731g
            java.util.List r8 = (java.util.List) r8
            java.lang.Object r9 = r2.f45730f
            T5.j r9 = (T5.j) r9
            java.lang.Object r10 = r2.f45729e
            k6.q r10 = (k6.C8450q) r10
            java.lang.Object r11 = r2.f45728d
            k6.h r11 = (k6.C8441h) r11
            java.lang.Object r12 = r2.f45727c
            c6.a$b r12 = (c6.C7095a.b) r12
            XH.y.b(r1)
            r18 = r10
            r10 = r8
            r8 = r18
            goto L_0x00ef
        L_0x004d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0055:
            XH.y.b(r1)
            java.util.List r1 = k6.C8442i.f(r20)
            boolean r4 = r1.isEmpty()
            if (r4 == 0) goto L_0x0063
            return r19
        L_0x0063:
            T5.n r4 = r19.e()
            boolean r8 = r4 instanceof T5.C6697a
            if (r8 != 0) goto L_0x00ab
            boolean r8 = k6.C8442i.c(r20)
            if (r8 != 0) goto L_0x00ab
            if (r0 == 0) goto L_0x00aa
            r6.s$a r1 = r6.s.a.Info
            r6.s$a r2 = r23.a()
            int r2 = r2.compareTo(r1)
            if (r2 > 0) goto L_0x00aa
            T5.n r2 = r19.e()
            java.lang.Class r2 = r2.getClass()
            uI.d r2 = kotlin.jvm.internal.P.b(r2)
            java.lang.String r2 = r2.f()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "allowConversionToBitmap=false, skipping transformations for type "
            r3.append(r4)
            r3.append(r2)
            r2 = 46
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            java.lang.String r3 = "EngineInterceptor"
            r0.b(r3, r1, r2, r6)
        L_0x00aa:
            return r19
        L_0x00ab:
            r8 = r21
            android.graphics.Bitmap r0 = c6.C7097c.a(r4, r8, r1, r0)
            r4 = r20
            r9 = r22
            r9.p(r4, r0)
            r10 = r1
            java.util.Collection r10 = (java.util.Collection) r10
            int r10 = r10.size()
            r11 = r19
            r12 = r1
            r1 = r0
            r0 = r10
            r10 = r5
        L_0x00c5:
            if (r10 >= r0) goto L_0x0101
            java.lang.Object r13 = r12.get(r10)
            p6.a r13 = (p6.C8627a) r13
            l6.h r14 = r8.k()
            r2.f45727c = r11
            r2.f45728d = r4
            r2.f45729e = r8
            r2.f45730f = r9
            r2.f45731g = r12
            r2.f45732h = r10
            r2.f45733i = r0
            r2.f45735k = r7
            java.lang.Object r1 = r13.b(r1, r14, r2)
            if (r1 != r3) goto L_0x00e8
            return r3
        L_0x00e8:
            r18 = r11
            r11 = r4
            r4 = r10
            r10 = r12
            r12 = r18
        L_0x00ef:
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
            dI.i r13 = r2.getContext()
            QJ.I0.l(r13)
            int r4 = r4 + r7
            r18 = r10
            r10 = r4
            r4 = r11
            r11 = r12
            r12 = r18
            goto L_0x00c5
        L_0x0101:
            r9.o(r4, r1)
            T5.a r12 = T5.u.d(r1, r5, r7, r6)
            r16 = 14
            r17 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            c6.a$b r0 = c6.C7095a.b.b(r11, r12, r13, r14, r15, r16, r17)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: c6.C7096b.a(c6.a$b, k6.h, k6.q, T5.j, r6.s, dI.e):java.lang.Object");
    }
}
