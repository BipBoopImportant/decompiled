package zC;

import Dw.b;
import XH.x;
import dI.C17164e;
import eI.C17187b;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17542s;
import rz.C15014g;
import uC.C15115c;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J,\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bHB¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000f¨\u0006\u0010"}, d2 = {"LzC/b;", "", "LDw/b;", "onGoingOrderRepository", "<init>", "(LDw/b;)V", "LuC/c;", "timeslotItem", "", "Lrz/g;", "timeslotCartItems", "LXH/x;", "", "a", "(LuC/c;Ljava/util/List;LdI/e;)Ljava/lang/Object;", "LDw/b;", "timeslot-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: zC.b  reason: case insensitive filesystem */
public final class C15330b {

    /* renamed from: a  reason: collision with root package name */
    private final b f132406a;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.ingka.ikea.timeslot.impl.feature.domain.SaveSelectedTimeSlotUseCase", f = "SaveSelectedTimeSlotUseCase.kt", l = {28}, m = "invoke-0E7RQCE")
    /* renamed from: zC.b$a */
    static final class a extends d {

        /* renamed from: A  reason: collision with root package name */
        final /* synthetic */ C15330b f132407A;

        /* renamed from: B  reason: collision with root package name */
        int f132408B;

        /* renamed from: c  reason: collision with root package name */
        Object f132409c;

        /* renamed from: d  reason: collision with root package name */
        Object f132410d;

        /* renamed from: e  reason: collision with root package name */
        Object f132411e;

        /* renamed from: f  reason: collision with root package name */
        Object f132412f;

        /* renamed from: g  reason: collision with root package name */
        Object f132413g;

        /* renamed from: h  reason: collision with root package name */
        Object f132414h;

        /* renamed from: i  reason: collision with root package name */
        Object f132415i;

        /* renamed from: j  reason: collision with root package name */
        Object f132416j;

        /* renamed from: k  reason: collision with root package name */
        Object f132417k;

        /* renamed from: l  reason: collision with root package name */
        Object f132418l;

        /* renamed from: m  reason: collision with root package name */
        Object f132419m;

        /* renamed from: n  reason: collision with root package name */
        Object f132420n;

        /* renamed from: o  reason: collision with root package name */
        Object f132421o;

        /* renamed from: p  reason: collision with root package name */
        Object f132422p;

        /* renamed from: q  reason: collision with root package name */
        Object f132423q;

        /* renamed from: r  reason: collision with root package name */
        Object f132424r;

        /* renamed from: s  reason: collision with root package name */
        Object f132425s;

        /* renamed from: t  reason: collision with root package name */
        Object f132426t;

        /* renamed from: u  reason: collision with root package name */
        Object f132427u;

        /* renamed from: v  reason: collision with root package name */
        int f132428v;

        /* renamed from: w  reason: collision with root package name */
        int f132429w;

        /* renamed from: x  reason: collision with root package name */
        int f132430x;

        /* renamed from: y  reason: collision with root package name */
        int f132431y;

        /* renamed from: z  reason: collision with root package name */
        /* synthetic */ Object f132432z;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C15330b bVar, C17164e<? super a> eVar) {
            super(eVar);
            this.f132407A = bVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f132432z = obj;
            this.f132408B |= Integer.MIN_VALUE;
            Object a10 = this.f132407A.a((C15115c) null, (List<C15014g>) null, this);
            return a10 == C17187b.f() ? a10 : x.a(a10);
        }
    }

    public C15330b(b bVar) {
        C17542s.j(bVar, "onGoingOrderRepository");
        this.f132406a = bVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(uC.C15115c r12, java.util.List<rz.C15014g> r13, dI.C17164e<? super XH.x<java.lang.String>> r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof zC.C15330b.a
            if (r0 == 0) goto L_0x0013
            r0 = r14
            zC.b$a r0 = (zC.C15330b.a) r0
            int r1 = r0.f132408B
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f132408B = r1
            goto L_0x0018
        L_0x0013:
            zC.b$a r0 = new zC.b$a
            r0.<init>(r11, r14)
        L_0x0018:
            java.lang.Object r1 = r0.f132432z
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f132408B
            r4 = 1
            if (r3 == 0) goto L_0x0084
            if (r3 != r4) goto L_0x007c
            java.lang.Object r12 = r0.f132427u
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r12 = r0.f132426t
            Dw.c r12 = (Dw.c) r12
            java.lang.Object r12 = r0.f132425s
            Dw.e$a r12 = (Dw.e.a) r12
            java.lang.Object r12 = r0.f132424r
            java.util.List r12 = (java.util.List) r12
            java.lang.Object r12 = r0.f132423q
            java.util.List r12 = (java.util.List) r12
            java.lang.Object r12 = r0.f132422p
            java.util.Iterator r12 = (java.util.Iterator) r12
            java.lang.Object r12 = r0.f132421o
            java.util.Collection r12 = (java.util.Collection) r12
            java.lang.Object r12 = r0.f132420n
            java.lang.Iterable r12 = (java.lang.Iterable) r12
            java.lang.Object r12 = r0.f132419m
            Dw.b r12 = (Dw.b) r12
            java.lang.Object r12 = r0.f132418l
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r12 = r0.f132417k
            Dw.c r12 = (Dw.c) r12
            java.lang.Object r12 = r0.f132416j
            Dw.e$a r12 = (Dw.e.a) r12
            java.lang.Object r12 = r0.f132415i
            java.lang.Iterable r12 = (java.lang.Iterable) r12
            java.lang.Object r12 = r0.f132414h
            zC.b r12 = (zC.C15330b) r12
            java.lang.Object r12 = r0.f132413g
            zC.b r12 = (zC.C15330b) r12
            java.lang.Object r12 = r0.f132412f
            dI.e r12 = (dI.C17164e) r12
            java.lang.Object r12 = r0.f132411e
            java.util.List r12 = (java.util.List) r12
            java.lang.Object r12 = r0.f132410d
            uC.c r12 = (uC.C15115c) r12
            java.lang.Object r13 = r0.f132409c
            zC.b r13 = (zC.C15330b) r13
            XH.y.b(r1)     // Catch:{ CancellationException -> 0x0079, all -> 0x0076 }
            goto L_0x010a
        L_0x0076:
            r12 = move-exception
            goto L_0x011b
        L_0x0079:
            r12 = move-exception
            goto L_0x0126
        L_0x007c:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L_0x0084:
            XH.y.b(r1)
            XH.x$a r1 = XH.x.f139812b     // Catch:{ CancellationException -> 0x0079, all -> 0x0076 }
            r1 = r13
            java.util.Collection r1 = (java.util.Collection) r1     // Catch:{ CancellationException -> 0x0079, all -> 0x0076 }
            boolean r1 = r1.isEmpty()     // Catch:{ CancellationException -> 0x0079, all -> 0x0076 }
            if (r1 != 0) goto L_0x0113
            Dw.b r1 = r11.f132406a     // Catch:{ CancellationException -> 0x0079, all -> 0x0076 }
            java.lang.String r3 = r12.getId()     // Catch:{ CancellationException -> 0x0079, all -> 0x0076 }
            Dw.c r5 = Dw.c.UNKNOWN     // Catch:{ CancellationException -> 0x0079, all -> 0x0076 }
            Dw.e$a r6 = new Dw.e$a     // Catch:{ CancellationException -> 0x0079, all -> 0x0076 }
            java.lang.String r7 = r12.i()     // Catch:{ CancellationException -> 0x0079, all -> 0x0076 }
            java.lang.String r8 = r12.g()     // Catch:{ CancellationException -> 0x0079, all -> 0x0076 }
            r6.<init>(r7, r8)     // Catch:{ CancellationException -> 0x0079, all -> 0x0076 }
            r7 = r13
            java.lang.Iterable r7 = (java.lang.Iterable) r7     // Catch:{ CancellationException -> 0x0079, all -> 0x0076 }
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch:{ CancellationException -> 0x0079, all -> 0x0076 }
            r9 = 10
            int r9 = YH.C16877v.y(r7, r9)     // Catch:{ CancellationException -> 0x0079, all -> 0x0076 }
            r8.<init>(r9)     // Catch:{ CancellationException -> 0x0079, all -> 0x0076 }
            java.util.Iterator r9 = r7.iterator()     // Catch:{ CancellationException -> 0x0079, all -> 0x0076 }
        L_0x00b9:
            boolean r10 = r9.hasNext()     // Catch:{ CancellationException -> 0x0079, all -> 0x0076 }
            if (r10 == 0) goto L_0x00cd
            java.lang.Object r10 = r9.next()     // Catch:{ CancellationException -> 0x0079, all -> 0x0076 }
            rz.g r10 = (rz.C15014g) r10     // Catch:{ CancellationException -> 0x0079, all -> 0x0076 }
            com.ingka.ikea.core.model.product.ProductItem r10 = r10.g()     // Catch:{ CancellationException -> 0x0079, all -> 0x0076 }
            r8.add(r10)     // Catch:{ CancellationException -> 0x0079, all -> 0x0076 }
            goto L_0x00b9
        L_0x00cd:
            Dw.e r10 = new Dw.e     // Catch:{ CancellationException -> 0x0079, all -> 0x0076 }
            r10.<init>(r3, r5, r6, r8)     // Catch:{ CancellationException -> 0x0079, all -> 0x0076 }
            r0.f132409c = r11     // Catch:{ CancellationException -> 0x0079, all -> 0x0076 }
            r0.f132410d = r12     // Catch:{ CancellationException -> 0x0079, all -> 0x0076 }
            r0.f132411e = r13     // Catch:{ CancellationException -> 0x0079, all -> 0x0076 }
            r0.f132412f = r14     // Catch:{ CancellationException -> 0x0079, all -> 0x0076 }
            r0.f132413g = r11     // Catch:{ CancellationException -> 0x0079, all -> 0x0076 }
            r0.f132414h = r11     // Catch:{ CancellationException -> 0x0079, all -> 0x0076 }
            r0.f132415i = r7     // Catch:{ CancellationException -> 0x0079, all -> 0x0076 }
            r0.f132416j = r6     // Catch:{ CancellationException -> 0x0079, all -> 0x0076 }
            r0.f132417k = r5     // Catch:{ CancellationException -> 0x0079, all -> 0x0076 }
            r0.f132418l = r3     // Catch:{ CancellationException -> 0x0079, all -> 0x0076 }
            r0.f132419m = r1     // Catch:{ CancellationException -> 0x0079, all -> 0x0076 }
            r0.f132420n = r7     // Catch:{ CancellationException -> 0x0079, all -> 0x0076 }
            r0.f132421o = r8     // Catch:{ CancellationException -> 0x0079, all -> 0x0076 }
            r0.f132422p = r9     // Catch:{ CancellationException -> 0x0079, all -> 0x0076 }
            r0.f132423q = r8     // Catch:{ CancellationException -> 0x0079, all -> 0x0076 }
            r0.f132424r = r8     // Catch:{ CancellationException -> 0x0079, all -> 0x0076 }
            r0.f132425s = r6     // Catch:{ CancellationException -> 0x0079, all -> 0x0076 }
            r0.f132426t = r5     // Catch:{ CancellationException -> 0x0079, all -> 0x0076 }
            r0.f132427u = r3     // Catch:{ CancellationException -> 0x0079, all -> 0x0076 }
            r13 = 0
            r0.f132428v = r13     // Catch:{ CancellationException -> 0x0079, all -> 0x0076 }
            r0.f132429w = r13     // Catch:{ CancellationException -> 0x0079, all -> 0x0076 }
            r0.f132430x = r13     // Catch:{ CancellationException -> 0x0079, all -> 0x0076 }
            r0.f132431y = r13     // Catch:{ CancellationException -> 0x0079, all -> 0x0076 }
            r0.f132408B = r4     // Catch:{ CancellationException -> 0x0079, all -> 0x0076 }
            java.lang.Object r13 = r1.b(r10, r0)     // Catch:{ CancellationException -> 0x0079, all -> 0x0076 }
            if (r13 != r2) goto L_0x010a
            return r2
        L_0x010a:
            java.lang.String r12 = r12.getId()     // Catch:{ CancellationException -> 0x0079, all -> 0x0076 }
            java.lang.Object r12 = XH.x.b(r12)     // Catch:{ CancellationException -> 0x0079, all -> 0x0076 }
            goto L_0x0125
        L_0x0113:
            java.lang.String r12 = "There needs to be items to persist a timeslot"
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException     // Catch:{ CancellationException -> 0x0079, all -> 0x0076 }
            r13.<init>(r12)     // Catch:{ CancellationException -> 0x0079, all -> 0x0076 }
            throw r13     // Catch:{ CancellationException -> 0x0079, all -> 0x0076 }
        L_0x011b:
            XH.x$a r13 = XH.x.f139812b
            java.lang.Object r12 = XH.y.a(r12)
            java.lang.Object r12 = XH.x.b(r12)
        L_0x0125:
            return r12
        L_0x0126:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: zC.C15330b.a(uC.c, java.util.List, dI.e):java.lang.Object");
    }
}
