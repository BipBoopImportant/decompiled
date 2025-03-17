package JD;

import dI.C17164e;
import hx.C14544b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006HB¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000b¨\u0006\f"}, d2 = {"LJD/d;", "LJD/c;", "Lhx/b;", "prepaidCardRepository", "<init>", "(Lhx/b;)V", "", "prepaidCardNumber", "", "a", "(Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "Lhx/b;", "wallet-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: JD.d  reason: case insensitive filesystem */
public final class C13072d implements C13071c {

    /* renamed from: a  reason: collision with root package name */
    private final C14544b f111223a;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.ingka.ikea.wallet.impl.usecase.DetachPrepaidCardUseCaseImpl", f = "DetachPrepaidCardUseCase.kt", l = {20}, m = "invoke")
    /* renamed from: JD.d$a */
    static final class a extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f111224c;

        /* renamed from: d  reason: collision with root package name */
        Object f111225d;

        /* renamed from: e  reason: collision with root package name */
        Object f111226e;

        /* renamed from: f  reason: collision with root package name */
        Object f111227f;

        /* renamed from: g  reason: collision with root package name */
        Object f111228g;

        /* renamed from: h  reason: collision with root package name */
        int f111229h;

        /* renamed from: i  reason: collision with root package name */
        int f111230i;

        /* renamed from: j  reason: collision with root package name */
        /* synthetic */ Object f111231j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ C13072d f111232k;

        /* renamed from: l  reason: collision with root package name */
        int f111233l;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C13072d dVar, C17164e<? super a> eVar) {
            super(eVar);
            this.f111232k = dVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f111231j = obj;
            this.f111233l |= Integer.MIN_VALUE;
            return this.f111232k.a((String) null, this);
        }
    }

    public C13072d(C14544b bVar) {
        C17542s.j(bVar, "prepaidCardRepository");
        this.f111223a = bVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v22, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v23, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v8, resolved type: JD.d} */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0048, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0079, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x007a, code lost:
        r3 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0166, code lost:
        throw r0;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:10:0x0042, B:17:0x0056] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0048 A[ExcHandler: CancellationException (r0v13 'e' java.util.concurrent.CancellationException A[CUSTOM_DECLARE]), Splitter:B:10:0x0042] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object a(java.lang.String r18, dI.C17164e<? super java.lang.Boolean> r19) {
        /*
            r17 = this;
            r1 = r17
            r2 = r18
            r0 = r19
            boolean r3 = r0 instanceof JD.C13072d.a
            if (r3 == 0) goto L_0x0019
            r3 = r0
            JD.d$a r3 = (JD.C13072d.a) r3
            int r4 = r3.f111233l
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x0019
            int r4 = r4 - r5
            r3.f111233l = r4
            goto L_0x001e
        L_0x0019:
            JD.d$a r3 = new JD.d$a
            r3.<init>(r1, r0)
        L_0x001e:
            java.lang.Object r4 = r3.f111231j
            java.lang.Object r5 = eI.C17187b.f()
            int r6 = r3.f111233l
            r7 = 1
            r8 = 0
            if (r6 == 0) goto L_0x0053
            if (r6 != r7) goto L_0x004b
            java.lang.Object r0 = r3.f111228g
            JD.d r0 = (JD.C13072d) r0
            java.lang.Object r0 = r3.f111227f
            JD.d r0 = (JD.C13072d) r0
            java.lang.Object r0 = r3.f111226e
            dI.e r0 = (dI.C17164e) r0
            java.lang.Object r0 = r3.f111225d
            r2 = r0
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r0 = r3.f111224c
            r3 = r0
            JD.d r3 = (JD.C13072d) r3
            XH.y.b(r4)     // Catch:{ CancellationException -> 0x0048, all -> 0x0046 }
            goto L_0x0072
        L_0x0046:
            r0 = move-exception
            goto L_0x007b
        L_0x0048:
            r0 = move-exception
            goto L_0x0166
        L_0x004b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x0053:
            XH.y.b(r4)
            XH.x$a r4 = XH.x.f139812b     // Catch:{ CancellationException -> 0x0048, all -> 0x0079 }
            hx.b r4 = r1.f111223a     // Catch:{ CancellationException -> 0x0048, all -> 0x0079 }
            r3.f111224c = r1     // Catch:{ CancellationException -> 0x0048, all -> 0x0079 }
            r3.f111225d = r2     // Catch:{ CancellationException -> 0x0048, all -> 0x0079 }
            r3.f111226e = r0     // Catch:{ CancellationException -> 0x0048, all -> 0x0079 }
            r3.f111227f = r1     // Catch:{ CancellationException -> 0x0048, all -> 0x0079 }
            r3.f111228g = r1     // Catch:{ CancellationException -> 0x0048, all -> 0x0079 }
            r3.f111229h = r8     // Catch:{ CancellationException -> 0x0048, all -> 0x0079 }
            r3.f111230i = r8     // Catch:{ CancellationException -> 0x0048, all -> 0x0079 }
            r3.f111233l = r7     // Catch:{ CancellationException -> 0x0048, all -> 0x0079 }
            java.lang.Object r4 = r4.d(r2, r3)     // Catch:{ CancellationException -> 0x0048, all -> 0x0079 }
            if (r4 != r5) goto L_0x0071
            return r5
        L_0x0071:
            r3 = r1
        L_0x0072:
            hx.a r4 = (hx.C14543a) r4     // Catch:{ CancellationException -> 0x0048, all -> 0x0046 }
            java.lang.Object r0 = XH.x.b(r4)     // Catch:{ CancellationException -> 0x0048, all -> 0x0046 }
            goto L_0x0085
        L_0x0079:
            r0 = move-exception
            r3 = r1
        L_0x007b:
            XH.x$a r4 = XH.x.f139812b
            java.lang.Object r0 = XH.y.a(r0)
            java.lang.Object r0 = XH.x.b(r0)
        L_0x0085:
            java.lang.Throwable r4 = XH.x.e(r0)
            if (r4 != 0) goto L_0x00a3
            hx.a r0 = (hx.C14543a) r0
            boolean r2 = r0 instanceof hx.C14543a.b
            if (r2 == 0) goto L_0x0092
            goto L_0x0097
        L_0x0092:
            boolean r0 = r0 instanceof hx.C14543a.C3140a
            if (r0 == 0) goto L_0x009d
            r7 = r8
        L_0x0097:
            java.lang.Boolean r0 = kotlin.coroutines.jvm.internal.b.a(r7)
            goto L_0x0165
        L_0x009d:
            XH.t r0 = new XH.t
            r0.<init>()
            throw r0
        L_0x00a3:
            qv.e r0 = qv.e.WARN
            qv.d r5 = qv.d.f102012a
            java.util.List r5 = r5.a()
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r5 = r5.iterator()
        L_0x00b6:
            boolean r9 = r5.hasNext()
            if (r9 == 0) goto L_0x00cd
            java.lang.Object r9 = r5.next()
            r10 = r9
            qv.b r10 = (qv.C11819b) r10
            boolean r10 = r10.b(r0, r8)
            if (r10 == 0) goto L_0x00b6
            r6.add(r9)
            goto L_0x00b6
        L_0x00cd:
            java.util.Iterator r5 = r6.iterator()
            r6 = 0
            r9 = r6
            r10 = r9
        L_0x00d4:
            boolean r11 = r5.hasNext()
            if (r11 == 0) goto L_0x0161
            java.lang.Object r11 = r5.next()
            qv.b r11 = (qv.C11819b) r11
            if (r9 != 0) goto L_0x00ff
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r12 = "Detach prepaid card failed: "
            r9.append(r12)
            r9.append(r2)
            java.lang.String r9 = r9.toString()
            java.lang.String r9 = qv.C11818a.a(r9, r4)
            if (r9 != 0) goto L_0x00fb
            goto L_0x0161
        L_0x00fb:
            java.lang.String r9 = qv.C11820c.a(r9)
        L_0x00ff:
            r15 = r9
            if (r10 != 0) goto L_0x0150
            java.lang.Class r9 = r3.getClass()
            java.lang.String r9 = r9.getName()
            kotlin.jvm.internal.C17542s.g(r9)
            r10 = 36
            r12 = 2
            java.lang.String r10 = HJ.C15854t.s1(r9, r10, r6, r12, r6)
            r13 = 46
            java.lang.String r10 = HJ.C15854t.o1(r10, r13, r6, r12, r6)
            int r12 = r10.length()
            if (r12 != 0) goto L_0x0121
            goto L_0x0127
        L_0x0121:
            java.lang.String r9 = "Kt"
            java.lang.String r9 = HJ.C15854t.P0(r10, r9)
        L_0x0127:
            java.lang.Thread r10 = java.lang.Thread.currentThread()
            java.lang.String r10 = r10.getName()
            java.lang.String r12 = "main"
            boolean r10 = HJ.C15854t.b0(r10, r12, r7)
            if (r10 == 0) goto L_0x013a
            java.lang.String r10 = "m"
            goto L_0x013c
        L_0x013a:
            java.lang.String r10 = "b"
        L_0x013c:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r10)
            java.lang.String r10 = "|"
            r12.append(r10)
            r12.append(r9)
            java.lang.String r10 = r12.toString()
        L_0x0150:
            r16 = r10
            r12 = 0
            r9 = r11
            r10 = r0
            r11 = r16
            r13 = r4
            r14 = r15
            r9.a(r10, r11, r12, r13, r14)
            r9 = r15
            r10 = r16
            goto L_0x00d4
        L_0x0161:
            java.lang.Boolean r0 = kotlin.coroutines.jvm.internal.b.a(r8)
        L_0x0165:
            return r0
        L_0x0166:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: JD.C13072d.a(java.lang.String, dI.e):java.lang.Object");
    }
}
