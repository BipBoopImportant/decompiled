package zC;

import FB.C12860a;
import XH.x;
import dI.C17164e;
import eI.C17187b;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17542s;
import rz.C15014g;
import xC.C15202a;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bHB¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"LzC/a;", "", "LFB/a;", "storeSelectionRepository", "LxC/a;", "timeslotRepository", "<init>", "(LFB/a;LxC/a;)V", "", "Lrz/g;", "cartItems", "LXH/x;", "LuC/a;", "a", "(Ljava/util/List;LdI/e;)Ljava/lang/Object;", "LFB/a;", "b", "LxC/a;", "timeslot-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: zC.a  reason: case insensitive filesystem */
public final class C15329a {

    /* renamed from: a  reason: collision with root package name */
    private final C12860a f132386a;

    /* renamed from: b  reason: collision with root package name */
    private final C15202a f132387b;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.ingka.ikea.timeslot.impl.feature.domain.GetTimeslotUseCase", f = "GetTimeslotUseCase.kt", l = {30}, m = "invoke-gIAlu-s")
    /* renamed from: zC.a$a  reason: collision with other inner class name */
    static final class C3273a extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f132388c;

        /* renamed from: d  reason: collision with root package name */
        Object f132389d;

        /* renamed from: e  reason: collision with root package name */
        Object f132390e;

        /* renamed from: f  reason: collision with root package name */
        Object f132391f;

        /* renamed from: g  reason: collision with root package name */
        Object f132392g;

        /* renamed from: h  reason: collision with root package name */
        Object f132393h;

        /* renamed from: i  reason: collision with root package name */
        Object f132394i;

        /* renamed from: j  reason: collision with root package name */
        Object f132395j;

        /* renamed from: k  reason: collision with root package name */
        Object f132396k;

        /* renamed from: l  reason: collision with root package name */
        Object f132397l;

        /* renamed from: m  reason: collision with root package name */
        Object f132398m;

        /* renamed from: n  reason: collision with root package name */
        int f132399n;

        /* renamed from: o  reason: collision with root package name */
        int f132400o;

        /* renamed from: p  reason: collision with root package name */
        int f132401p;

        /* renamed from: q  reason: collision with root package name */
        int f132402q;

        /* renamed from: r  reason: collision with root package name */
        /* synthetic */ Object f132403r;

        /* renamed from: s  reason: collision with root package name */
        final /* synthetic */ C15329a f132404s;

        /* renamed from: t  reason: collision with root package name */
        int f132405t;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3273a(C15329a aVar, C17164e<? super C3273a> eVar) {
            super(eVar);
            this.f132404s = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f132403r = obj;
            this.f132405t |= Integer.MIN_VALUE;
            Object a10 = this.f132404s.a((List<C15014g>) null, this);
            return a10 == C17187b.f() ? a10 : x.a(a10);
        }
    }

    public C15329a(C12860a aVar, C15202a aVar2) {
        C17542s.j(aVar, "storeSelectionRepository");
        C17542s.j(aVar2, "timeslotRepository");
        this.f132386a = aVar;
        this.f132387b = aVar2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x008c A[Catch:{ CancellationException -> 0x005f, all -> 0x005c }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00f6 A[Catch:{ CancellationException -> 0x005f, all -> 0x005c }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(java.util.List<rz.C15014g> r12, dI.C17164e<? super XH.x<uC.C15113a>> r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof zC.C15329a.C3273a
            if (r0 == 0) goto L_0x0013
            r0 = r13
            zC.a$a r0 = (zC.C15329a.C3273a) r0
            int r1 = r0.f132405t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f132405t = r1
            goto L_0x0018
        L_0x0013:
            zC.a$a r0 = new zC.a$a
            r0.<init>(r11, r13)
        L_0x0018:
            java.lang.Object r1 = r0.f132403r
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f132405t
            r4 = 1
            if (r3 == 0) goto L_0x006a
            if (r3 != r4) goto L_0x0062
            java.lang.Object r12 = r0.f132398m
            java.util.Iterator r12 = (java.util.Iterator) r12
            java.lang.Object r12 = r0.f132397l
            java.util.Collection r12 = (java.util.Collection) r12
            java.lang.Object r12 = r0.f132396k
            java.lang.Iterable r12 = (java.lang.Iterable) r12
            java.lang.Object r12 = r0.f132395j
            java.lang.Iterable r12 = (java.lang.Iterable) r12
            java.lang.Object r12 = r0.f132394i
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r12 = r0.f132393h
            java.util.List r12 = (java.util.List) r12
            java.lang.Object r12 = r0.f132392g
            zC.a r12 = (zC.C15329a) r12
            java.lang.Object r12 = r0.f132391f
            zC.a r12 = (zC.C15329a) r12
            java.lang.Object r12 = r0.f132390e
            dI.e r12 = (dI.C17164e) r12
            java.lang.Object r12 = r0.f132389d
            java.util.List r12 = (java.util.List) r12
            java.lang.Object r12 = r0.f132388c
            zC.a r12 = (zC.C15329a) r12
            XH.y.b(r1)     // Catch:{ CancellationException -> 0x005f, all -> 0x005c }
            XH.x r1 = (XH.x) r1     // Catch:{ CancellationException -> 0x005f, all -> 0x005c }
            java.lang.Object r12 = r1.j()     // Catch:{ CancellationException -> 0x005f, all -> 0x005c }
            goto L_0x00ec
        L_0x005c:
            r12 = move-exception
            goto L_0x00fe
        L_0x005f:
            r12 = move-exception
            goto L_0x0109
        L_0x0062:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L_0x006a:
            XH.y.b(r1)
            XH.x$a r1 = XH.x.f139812b     // Catch:{ CancellationException -> 0x005f, all -> 0x005c }
            FB.a r1 = r11.f132386a     // Catch:{ CancellationException -> 0x005f, all -> 0x005c }
            EB.d r1 = FB.C12861b.a(r1)     // Catch:{ CancellationException -> 0x005f, all -> 0x005c }
            if (r1 == 0) goto L_0x007c
            java.lang.String r1 = r1.e()     // Catch:{ CancellationException -> 0x005f, all -> 0x005c }
            goto L_0x007d
        L_0x007c:
            r1 = 0
        L_0x007d:
            r3 = 0
            if (r1 == 0) goto L_0x0089
            boolean r5 = HJ.C15854t.v0(r1)     // Catch:{ CancellationException -> 0x005f, all -> 0x005c }
            if (r5 == 0) goto L_0x0087
            goto L_0x0089
        L_0x0087:
            r5 = r3
            goto L_0x008a
        L_0x0089:
            r5 = r4
        L_0x008a:
            if (r5 != 0) goto L_0x00f6
            r5 = r12
            java.lang.Iterable r5 = (java.lang.Iterable) r5     // Catch:{ CancellationException -> 0x005f, all -> 0x005c }
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ CancellationException -> 0x005f, all -> 0x005c }
            r7 = 10
            int r7 = YH.C16877v.y(r5, r7)     // Catch:{ CancellationException -> 0x005f, all -> 0x005c }
            r6.<init>(r7)     // Catch:{ CancellationException -> 0x005f, all -> 0x005c }
            java.util.Iterator r7 = r5.iterator()     // Catch:{ CancellationException -> 0x005f, all -> 0x005c }
        L_0x009e:
            boolean r8 = r7.hasNext()     // Catch:{ CancellationException -> 0x005f, all -> 0x005c }
            if (r8 == 0) goto L_0x00c3
            java.lang.Object r8 = r7.next()     // Catch:{ CancellationException -> 0x005f, all -> 0x005c }
            rz.g r8 = (rz.C15014g) r8     // Catch:{ CancellationException -> 0x005f, all -> 0x005c }
            uC.b r9 = new uC.b     // Catch:{ CancellationException -> 0x005f, all -> 0x005c }
            com.ingka.ikea.core.model.product.ProductItem r10 = r8.g()     // Catch:{ CancellationException -> 0x005f, all -> 0x005c }
            java.lang.String r10 = r10.f()     // Catch:{ CancellationException -> 0x005f, all -> 0x005c }
            rz.U r8 = r8.h()     // Catch:{ CancellationException -> 0x005f, all -> 0x005c }
            int r8 = r8.c()     // Catch:{ CancellationException -> 0x005f, all -> 0x005c }
            r9.<init>(r10, r8)     // Catch:{ CancellationException -> 0x005f, all -> 0x005c }
            r6.add(r9)     // Catch:{ CancellationException -> 0x005f, all -> 0x005c }
            goto L_0x009e
        L_0x00c3:
            xC.a r8 = r11.f132387b     // Catch:{ CancellationException -> 0x005f, all -> 0x005c }
            r0.f132388c = r11     // Catch:{ CancellationException -> 0x005f, all -> 0x005c }
            r0.f132389d = r12     // Catch:{ CancellationException -> 0x005f, all -> 0x005c }
            r0.f132390e = r13     // Catch:{ CancellationException -> 0x005f, all -> 0x005c }
            r0.f132391f = r11     // Catch:{ CancellationException -> 0x005f, all -> 0x005c }
            r0.f132392g = r11     // Catch:{ CancellationException -> 0x005f, all -> 0x005c }
            r0.f132393h = r6     // Catch:{ CancellationException -> 0x005f, all -> 0x005c }
            r0.f132394i = r1     // Catch:{ CancellationException -> 0x005f, all -> 0x005c }
            r0.f132395j = r5     // Catch:{ CancellationException -> 0x005f, all -> 0x005c }
            r0.f132396k = r5     // Catch:{ CancellationException -> 0x005f, all -> 0x005c }
            r0.f132397l = r6     // Catch:{ CancellationException -> 0x005f, all -> 0x005c }
            r0.f132398m = r7     // Catch:{ CancellationException -> 0x005f, all -> 0x005c }
            r0.f132399n = r3     // Catch:{ CancellationException -> 0x005f, all -> 0x005c }
            r0.f132400o = r3     // Catch:{ CancellationException -> 0x005f, all -> 0x005c }
            r0.f132401p = r3     // Catch:{ CancellationException -> 0x005f, all -> 0x005c }
            r0.f132402q = r3     // Catch:{ CancellationException -> 0x005f, all -> 0x005c }
            r0.f132405t = r4     // Catch:{ CancellationException -> 0x005f, all -> 0x005c }
            java.lang.Object r12 = r8.a(r1, r6, r0)     // Catch:{ CancellationException -> 0x005f, all -> 0x005c }
            if (r12 != r2) goto L_0x00ec
            return r2
        L_0x00ec:
            XH.y.b(r12)     // Catch:{ CancellationException -> 0x005f, all -> 0x005c }
            uC.a r12 = (uC.C15113a) r12     // Catch:{ CancellationException -> 0x005f, all -> 0x005c }
            java.lang.Object r12 = XH.x.b(r12)     // Catch:{ CancellationException -> 0x005f, all -> 0x005c }
            goto L_0x0108
        L_0x00f6:
            java.lang.String r12 = "Store id is missing, cannot fetch timeslots"
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException     // Catch:{ CancellationException -> 0x005f, all -> 0x005c }
            r13.<init>(r12)     // Catch:{ CancellationException -> 0x005f, all -> 0x005c }
            throw r13     // Catch:{ CancellationException -> 0x005f, all -> 0x005c }
        L_0x00fe:
            XH.x$a r13 = XH.x.f139812b
            java.lang.Object r12 = XH.y.a(r12)
            java.lang.Object r12 = XH.x.b(r12)
        L_0x0108:
            return r12
        L_0x0109:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: zC.C15329a.a(java.util.List, dI.e):java.lang.Object");
    }
}
