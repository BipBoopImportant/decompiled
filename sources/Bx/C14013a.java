package bx;

import HB.C12961a;
import TJ.C16532g;
import TJ.C16533h;
import TJ.C16534i;
import XH.C16807N;
import ax.C13990b;
import dI.C17164e;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import nI.p;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\f¨\u0006\r"}, d2 = {"Lbx/a;", "Lax/b;", "LHB/a;", "popularTimesRepository", "<init>", "(LHB/a;)V", "", "storeId", "LTJ/g;", "", "a", "(Ljava/lang/String;)LTJ/g;", "LHB/a;", "populartimes-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: bx.a  reason: case insensitive filesystem */
public final class C14013a implements C13990b {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final C12961a f118973a;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LTJ/h;", "", "LXH/N;", "<anonymous>", "(LTJ/h;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.populartimes.impl.PopularTimesIntegrationImpl$isEnabled$1", f = "PopularTimesIntegrationImpl.kt", l = {21, 30}, m = "invokeSuspend")
    /* renamed from: bx.a$a  reason: collision with other inner class name */
    static final class C2975a extends l implements p<C16533h<? super Boolean>, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f118974c;

        /* renamed from: d  reason: collision with root package name */
        Object f118975d;

        /* renamed from: e  reason: collision with root package name */
        Object f118976e;

        /* renamed from: f  reason: collision with root package name */
        Object f118977f;

        /* renamed from: g  reason: collision with root package name */
        int f118978g;

        /* renamed from: h  reason: collision with root package name */
        int f118979h;

        /* renamed from: i  reason: collision with root package name */
        boolean f118980i;

        /* renamed from: j  reason: collision with root package name */
        int f118981j;

        /* renamed from: k  reason: collision with root package name */
        private /* synthetic */ Object f118982k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ C14013a f118983l;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ String f118984m;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2975a(C14013a aVar, String str, C17164e<? super C2975a> eVar) {
            super(2, eVar);
            this.f118983l = aVar;
            this.f118984m = str;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            C2975a aVar = new C2975a(this.f118983l, this.f118984m, eVar);
            aVar.f118982k = obj;
            return aVar;
        }

        public final Object invoke(C16533h<? super Boolean> hVar, C17164e<? super C16807N> eVar) {
            return ((C2975a) create(hVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: TJ.h} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v22, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: TJ.h} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r20) {
            /*
                r19 = this;
                r1 = r19
                java.lang.Object r2 = eI.C17187b.f()
                int r0 = r1.f118981j
                r3 = 2
                r4 = 1
                r5 = 0
                if (r0 == 0) goto L_0x0042
                if (r0 == r4) goto L_0x0022
                if (r0 != r3) goto L_0x001a
                java.lang.Object r0 = r1.f118982k
                TJ.h r0 = (TJ.C16533h) r0
                XH.y.b(r20)
                goto L_0x0154
            L_0x001a:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r2)
                throw r0
            L_0x0022:
                java.lang.Object r0 = r1.f118977f
                TJ.h r0 = (TJ.C16533h) r0
                java.lang.Object r0 = r1.f118976e
                java.lang.String r0 = (java.lang.String) r0
                java.lang.Object r0 = r1.f118975d
                bx.a r0 = (bx.C14013a) r0
                java.lang.Object r0 = r1.f118974c
                TJ.h r0 = (TJ.C16533h) r0
                java.lang.Object r0 = r1.f118982k
                r6 = r0
                TJ.h r6 = (TJ.C16533h) r6
                XH.y.b(r20)     // Catch:{ CancellationException -> 0x003f, all -> 0x003d }
                r0 = r20
                goto L_0x006b
            L_0x003d:
                r0 = move-exception
                goto L_0x0072
            L_0x003f:
                r0 = move-exception
                goto L_0x0157
            L_0x0042:
                XH.y.b(r20)
                java.lang.Object r0 = r1.f118982k
                r6 = r0
                TJ.h r6 = (TJ.C16533h) r6
                bx.a r0 = r1.f118983l
                java.lang.String r7 = r1.f118984m
                XH.x$a r8 = XH.x.f139812b     // Catch:{ CancellationException -> 0x003f, all -> 0x003d }
                HB.a r8 = r0.f118973a     // Catch:{ CancellationException -> 0x003f, all -> 0x003d }
                r1.f118982k = r6     // Catch:{ CancellationException -> 0x003f, all -> 0x003d }
                r1.f118974c = r6     // Catch:{ CancellationException -> 0x003f, all -> 0x003d }
                r1.f118975d = r0     // Catch:{ CancellationException -> 0x003f, all -> 0x003d }
                r1.f118976e = r7     // Catch:{ CancellationException -> 0x003f, all -> 0x003d }
                r1.f118977f = r6     // Catch:{ CancellationException -> 0x003f, all -> 0x003d }
                r1.f118978g = r5     // Catch:{ CancellationException -> 0x003f, all -> 0x003d }
                r1.f118979h = r5     // Catch:{ CancellationException -> 0x003f, all -> 0x003d }
                r1.f118981j = r4     // Catch:{ CancellationException -> 0x003f, all -> 0x003d }
                java.lang.Object r0 = r8.a(r7, r1)     // Catch:{ CancellationException -> 0x003f, all -> 0x003d }
                if (r0 != r2) goto L_0x006b
                return r2
            L_0x006b:
                GB.f r0 = (GB.f) r0     // Catch:{ CancellationException -> 0x003f, all -> 0x003d }
                java.lang.Object r0 = XH.x.b(r0)     // Catch:{ CancellationException -> 0x003f, all -> 0x003d }
                goto L_0x007c
            L_0x0072:
                XH.x$a r7 = XH.x.f139812b
                java.lang.Object r0 = XH.y.a(r0)
                java.lang.Object r0 = XH.x.b(r0)
            L_0x007c:
                java.lang.Throwable r13 = XH.x.e(r0)
                if (r13 != 0) goto L_0x0087
                r13 = r0
                GB.f r13 = (GB.f) r13
                goto L_0x013d
            L_0x0087:
                qv.e r14 = qv.e.WARN
                qv.d r7 = qv.d.f102012a
                java.util.List r7 = r7.a()
                java.lang.Iterable r7 = (java.lang.Iterable) r7
                java.util.ArrayList r8 = new java.util.ArrayList
                r8.<init>()
                java.util.Iterator r7 = r7.iterator()
            L_0x009a:
                boolean r9 = r7.hasNext()
                if (r9 == 0) goto L_0x00b1
                java.lang.Object r9 = r7.next()
                r10 = r9
                qv.b r10 = (qv.C11819b) r10
                boolean r10 = r10.b(r14, r5)
                if (r10 == 0) goto L_0x009a
                r8.add(r9)
                goto L_0x009a
            L_0x00b1:
                java.util.Iterator r15 = r8.iterator()
                r12 = 0
                r7 = r12
                r8 = r7
            L_0x00b8:
                boolean r9 = r15.hasNext()
                if (r9 == 0) goto L_0x013c
                java.lang.Object r9 = r15.next()
                qv.b r9 = (qv.C11819b) r9
                if (r7 != 0) goto L_0x00d4
                java.lang.String r7 = "Failed getting Popular Times trend data"
                java.lang.String r7 = qv.C11818a.a(r7, r13)
                if (r7 != 0) goto L_0x00d0
                goto L_0x013c
            L_0x00d0:
                java.lang.String r7 = qv.C11820c.a(r7)
            L_0x00d4:
                r16 = r7
                if (r8 != 0) goto L_0x0125
                java.lang.Class r7 = r6.getClass()
                java.lang.String r7 = r7.getName()
                kotlin.jvm.internal.C17542s.g(r7)
                r8 = 36
                java.lang.String r8 = HJ.C15854t.s1(r7, r8, r12, r3, r12)
                r10 = 46
                java.lang.String r8 = HJ.C15854t.o1(r8, r10, r12, r3, r12)
                int r10 = r8.length()
                if (r10 != 0) goto L_0x00f6
                goto L_0x00fc
            L_0x00f6:
                java.lang.String r7 = "Kt"
                java.lang.String r7 = HJ.C15854t.P0(r8, r7)
            L_0x00fc:
                java.lang.Thread r8 = java.lang.Thread.currentThread()
                java.lang.String r8 = r8.getName()
                java.lang.String r10 = "main"
                boolean r8 = HJ.C15854t.b0(r8, r10, r4)
                if (r8 == 0) goto L_0x010f
                java.lang.String r8 = "m"
                goto L_0x0111
            L_0x010f:
                java.lang.String r8 = "b"
            L_0x0111:
                java.lang.StringBuilder r10 = new java.lang.StringBuilder
                r10.<init>()
                r10.append(r8)
                java.lang.String r8 = "|"
                r10.append(r8)
                r10.append(r7)
                java.lang.String r8 = r10.toString()
            L_0x0125:
                r17 = r8
                r10 = 0
                r7 = r9
                r8 = r14
                r9 = r17
                r11 = r13
                r18 = r12
                r12 = r16
                r7.a(r8, r9, r10, r11, r12)
                r7 = r16
                r8 = r17
                r12 = r18
                goto L_0x00b8
            L_0x013c:
                r4 = r5
            L_0x013d:
                java.lang.Boolean r7 = kotlin.coroutines.jvm.internal.b.a(r4)
                r1.f118982k = r6
                r1.f118974c = r0
                r1.f118975d = r13
                r1.f118980i = r4
                r1.f118978g = r5
                r1.f118981j = r3
                java.lang.Object r0 = r6.emit(r7, r1)
                if (r0 != r2) goto L_0x0154
                return r2
            L_0x0154:
                XH.N r0 = XH.C16807N.f139792a
                return r0
            L_0x0157:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: bx.C14013a.C2975a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public C14013a(C12961a aVar) {
        C17542s.j(aVar, "popularTimesRepository");
        this.f118973a = aVar;
    }

    public C16532g<Boolean> a(String str) {
        C17542s.j(str, "storeId");
        return C16534i.H(new C2975a(this, str, (C17164e<? super C2975a>) null));
    }
}
