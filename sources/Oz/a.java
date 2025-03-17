package Oz;

import FB.C12863d;
import XH.x;
import dI.C17164e;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HB¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\n¨\u0006\u000b"}, d2 = {"LOz/a;", "", "LFB/d;", "storeRepository", "<init>", "(LFB/d;)V", "LXH/x;", "", "a", "(LdI/e;)Ljava/lang/Object;", "LFB/d;", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private final C12863d f113750a;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.ingka.ikea.scanandgo.usecase.ResolveFallBackStoreIdForCleanUp", f = "ResolveFallBackStoreIdForCleanUp.kt", l = {27}, m = "invoke-IoAF18A")
    /* renamed from: Oz.a$a  reason: collision with other inner class name */
    static final class C2793a extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f113751c;

        /* renamed from: d  reason: collision with root package name */
        Object f113752d;

        /* renamed from: e  reason: collision with root package name */
        Object f113753e;

        /* renamed from: f  reason: collision with root package name */
        Object f113754f;

        /* renamed from: g  reason: collision with root package name */
        int f113755g;

        /* renamed from: h  reason: collision with root package name */
        int f113756h;

        /* renamed from: i  reason: collision with root package name */
        /* synthetic */ Object f113757i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ a f113758j;

        /* renamed from: k  reason: collision with root package name */
        int f113759k;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2793a(a aVar, C17164e<? super C2793a> eVar) {
            super(eVar);
            this.f113758j = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f113757i = obj;
            this.f113759k |= Integer.MIN_VALUE;
            Object a10 = this.f113758j.a(this);
            return a10 == C17187b.f() ? a10 : x.a(a10);
        }
    }

    public a(C12863d dVar) {
        C17542s.j(dVar, "storeRepository");
        this.f113750a = dVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0072 A[Catch:{ CancellationException -> 0x003d, all -> 0x003a }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00a4 A[Catch:{ CancellationException -> 0x003d, all -> 0x003a }] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00c1 A[Catch:{ CancellationException -> 0x003d, all -> 0x003a }] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x014a A[Catch:{ CancellationException -> 0x003d, all -> 0x003a }] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x014f A[Catch:{ CancellationException -> 0x003d, all -> 0x003a }] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0080 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0147 A[EDGE_INSN: B:73:0x0147->B:59:0x0147 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(dI.C17164e<? super XH.x<java.lang.String>> r14) {
        /*
            r13 = this;
            boolean r0 = r14 instanceof Oz.a.C2793a
            if (r0 == 0) goto L_0x0013
            r0 = r14
            Oz.a$a r0 = (Oz.a.C2793a) r0
            int r1 = r0.f113759k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f113759k = r1
            goto L_0x0018
        L_0x0013:
            Oz.a$a r0 = new Oz.a$a
            r0.<init>(r13, r14)
        L_0x0018:
            java.lang.Object r1 = r0.f113757i
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f113759k
            r4 = 0
            r5 = 1
            if (r3 == 0) goto L_0x0048
            if (r3 != r5) goto L_0x0040
            java.lang.Object r14 = r0.f113754f
            Oz.a r14 = (Oz.a) r14
            java.lang.Object r2 = r0.f113753e
            Oz.a r2 = (Oz.a) r2
            java.lang.Object r2 = r0.f113752d
            dI.e r2 = (dI.C17164e) r2
            java.lang.Object r0 = r0.f113751c
            Oz.a r0 = (Oz.a) r0
            XH.y.b(r1)     // Catch:{ CancellationException -> 0x003d, all -> 0x003a }
            goto L_0x0065
        L_0x003a:
            r14 = move-exception
            goto L_0x0157
        L_0x003d:
            r14 = move-exception
            goto L_0x0162
        L_0x0040:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L_0x0048:
            XH.y.b(r1)
            XH.x$a r1 = XH.x.f139812b     // Catch:{ CancellationException -> 0x003d, all -> 0x003a }
            FB.d r1 = r13.f113750a     // Catch:{ CancellationException -> 0x003d, all -> 0x003a }
            r0.f113751c = r13     // Catch:{ CancellationException -> 0x003d, all -> 0x003a }
            r0.f113752d = r14     // Catch:{ CancellationException -> 0x003d, all -> 0x003a }
            r0.f113753e = r13     // Catch:{ CancellationException -> 0x003d, all -> 0x003a }
            r0.f113754f = r13     // Catch:{ CancellationException -> 0x003d, all -> 0x003a }
            r0.f113755g = r4     // Catch:{ CancellationException -> 0x003d, all -> 0x003a }
            r0.f113756h = r4     // Catch:{ CancellationException -> 0x003d, all -> 0x003a }
            r0.f113759k = r5     // Catch:{ CancellationException -> 0x003d, all -> 0x003a }
            java.lang.Object r1 = r1.c(r0)     // Catch:{ CancellationException -> 0x003d, all -> 0x003a }
            if (r1 != r2) goto L_0x0064
            return r2
        L_0x0064:
            r14 = r13
        L_0x0065:
            java.lang.Iterable r1 = (java.lang.Iterable) r1     // Catch:{ CancellationException -> 0x003d, all -> 0x003a }
            java.util.Iterator r0 = r1.iterator()     // Catch:{ CancellationException -> 0x003d, all -> 0x003a }
        L_0x006b:
            boolean r1 = r0.hasNext()     // Catch:{ CancellationException -> 0x003d, all -> 0x003a }
            r2 = 0
            if (r1 == 0) goto L_0x0080
            java.lang.Object r1 = r0.next()     // Catch:{ CancellationException -> 0x003d, all -> 0x003a }
            r3 = r1
            EB.c r3 = (EB.C12831c) r3     // Catch:{ CancellationException -> 0x003d, all -> 0x003a }
            boolean r3 = r3.i()     // Catch:{ CancellationException -> 0x003d, all -> 0x003a }
            if (r3 == 0) goto L_0x006b
            goto L_0x0081
        L_0x0080:
            r1 = r2
        L_0x0081:
            EB.c r1 = (EB.C12831c) r1     // Catch:{ CancellationException -> 0x003d, all -> 0x003a }
            if (r1 == 0) goto L_0x0148
            java.lang.String r0 = r1.g()     // Catch:{ CancellationException -> 0x003d, all -> 0x003a }
            if (r0 == 0) goto L_0x0148
            qv.e r1 = qv.e.DEBUG     // Catch:{ CancellationException -> 0x003d, all -> 0x003a }
            qv.d r3 = qv.d.f102012a     // Catch:{ CancellationException -> 0x003d, all -> 0x003a }
            java.util.List r3 = r3.a()     // Catch:{ CancellationException -> 0x003d, all -> 0x003a }
            java.lang.Iterable r3 = (java.lang.Iterable) r3     // Catch:{ CancellationException -> 0x003d, all -> 0x003a }
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ CancellationException -> 0x003d, all -> 0x003a }
            r6.<init>()     // Catch:{ CancellationException -> 0x003d, all -> 0x003a }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ CancellationException -> 0x003d, all -> 0x003a }
        L_0x009e:
            boolean r7 = r3.hasNext()     // Catch:{ CancellationException -> 0x003d, all -> 0x003a }
            if (r7 == 0) goto L_0x00b5
            java.lang.Object r7 = r3.next()     // Catch:{ CancellationException -> 0x003d, all -> 0x003a }
            r8 = r7
            qv.b r8 = (qv.C11819b) r8     // Catch:{ CancellationException -> 0x003d, all -> 0x003a }
            boolean r8 = r8.b(r1, r4)     // Catch:{ CancellationException -> 0x003d, all -> 0x003a }
            if (r8 == 0) goto L_0x009e
            r6.add(r7)     // Catch:{ CancellationException -> 0x003d, all -> 0x003a }
            goto L_0x009e
        L_0x00b5:
            java.util.Iterator r3 = r6.iterator()     // Catch:{ CancellationException -> 0x003d, all -> 0x003a }
            r4 = r2
            r6 = r4
        L_0x00bb:
            boolean r7 = r3.hasNext()     // Catch:{ CancellationException -> 0x003d, all -> 0x003a }
            if (r7 == 0) goto L_0x0147
            java.lang.Object r7 = r3.next()     // Catch:{ CancellationException -> 0x003d, all -> 0x003a }
            qv.b r7 = (qv.C11819b) r7     // Catch:{ CancellationException -> 0x003d, all -> 0x003a }
            r10 = 0
            if (r4 != 0) goto L_0x00eb
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ CancellationException -> 0x003d, all -> 0x003a }
            r4.<init>()     // Catch:{ CancellationException -> 0x003d, all -> 0x003a }
            java.lang.String r8 = "Using fallback storeId: ("
            r4.append(r8)     // Catch:{ CancellationException -> 0x003d, all -> 0x003a }
            r4.append(r0)     // Catch:{ CancellationException -> 0x003d, all -> 0x003a }
            java.lang.String r8 = ") from storeRepository"
            r4.append(r8)     // Catch:{ CancellationException -> 0x003d, all -> 0x003a }
            java.lang.String r4 = r4.toString()     // Catch:{ CancellationException -> 0x003d, all -> 0x003a }
            java.lang.String r4 = qv.C11818a.a(r4, r10)     // Catch:{ CancellationException -> 0x003d, all -> 0x003a }
            if (r4 != 0) goto L_0x00e7
            goto L_0x0147
        L_0x00e7:
            java.lang.String r4 = qv.C11820c.a(r4)     // Catch:{ CancellationException -> 0x003d, all -> 0x003a }
        L_0x00eb:
            if (r6 != 0) goto L_0x013b
            java.lang.Class r6 = r14.getClass()     // Catch:{ CancellationException -> 0x003d, all -> 0x003a }
            java.lang.String r6 = r6.getName()     // Catch:{ CancellationException -> 0x003d, all -> 0x003a }
            kotlin.jvm.internal.C17542s.g(r6)     // Catch:{ CancellationException -> 0x003d, all -> 0x003a }
            r8 = 36
            r9 = 2
            java.lang.String r8 = HJ.C15854t.s1(r6, r8, r2, r9, r2)     // Catch:{ CancellationException -> 0x003d, all -> 0x003a }
            r11 = 46
            java.lang.String r8 = HJ.C15854t.o1(r8, r11, r2, r9, r2)     // Catch:{ CancellationException -> 0x003d, all -> 0x003a }
            int r9 = r8.length()     // Catch:{ CancellationException -> 0x003d, all -> 0x003a }
            if (r9 != 0) goto L_0x010c
            goto L_0x0112
        L_0x010c:
            java.lang.String r6 = "Kt"
            java.lang.String r6 = HJ.C15854t.P0(r8, r6)     // Catch:{ CancellationException -> 0x003d, all -> 0x003a }
        L_0x0112:
            java.lang.Thread r8 = java.lang.Thread.currentThread()     // Catch:{ CancellationException -> 0x003d, all -> 0x003a }
            java.lang.String r8 = r8.getName()     // Catch:{ CancellationException -> 0x003d, all -> 0x003a }
            java.lang.String r9 = "main"
            boolean r8 = HJ.C15854t.b0(r8, r9, r5)     // Catch:{ CancellationException -> 0x003d, all -> 0x003a }
            if (r8 == 0) goto L_0x0125
            java.lang.String r8 = "m"
            goto L_0x0127
        L_0x0125:
            java.lang.String r8 = "b"
        L_0x0127:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ CancellationException -> 0x003d, all -> 0x003a }
            r9.<init>()     // Catch:{ CancellationException -> 0x003d, all -> 0x003a }
            r9.append(r8)     // Catch:{ CancellationException -> 0x003d, all -> 0x003a }
            java.lang.String r8 = "|"
            r9.append(r8)     // Catch:{ CancellationException -> 0x003d, all -> 0x003a }
            r9.append(r6)     // Catch:{ CancellationException -> 0x003d, all -> 0x003a }
            java.lang.String r6 = r9.toString()     // Catch:{ CancellationException -> 0x003d, all -> 0x003a }
        L_0x013b:
            r12 = r6
            r9 = 0
            r6 = r7
            r7 = r1
            r8 = r12
            r11 = r4
            r6.a(r7, r8, r9, r10, r11)     // Catch:{ CancellationException -> 0x003d, all -> 0x003a }
            r6 = r12
            goto L_0x00bb
        L_0x0147:
            r2 = r0
        L_0x0148:
            if (r2 == 0) goto L_0x014f
            java.lang.Object r14 = XH.x.b(r2)     // Catch:{ CancellationException -> 0x003d, all -> 0x003a }
            goto L_0x0161
        L_0x014f:
            java.lang.String r14 = "Required value was null."
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ CancellationException -> 0x003d, all -> 0x003a }
            r0.<init>(r14)     // Catch:{ CancellationException -> 0x003d, all -> 0x003a }
            throw r0     // Catch:{ CancellationException -> 0x003d, all -> 0x003a }
        L_0x0157:
            XH.x$a r0 = XH.x.f139812b
            java.lang.Object r14 = XH.y.a(r14)
            java.lang.Object r14 = XH.x.b(r14)
        L_0x0161:
            return r14
        L_0x0162:
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: Oz.a.a(dI.e):java.lang.Object");
    }
}
