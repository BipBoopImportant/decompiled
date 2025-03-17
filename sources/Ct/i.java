package Ct;

import FB.C12860a;
import HJ.C15854t;
import XH.x;
import am.h;
import bt.e;
import com.sugarcube.core.logger.DslKt;
import dI.C17164e;
import dt.C11240a;
import eI.C17187b;
import java.time.LocalDateTime;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17542s;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ-\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J*\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\b\u0010\f\u001a\u0004\u0018\u00010\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHB¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0017R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"LCt/i;", "LCt/h;", "LFB/a;", "localStoreSelectionRepository", "Lbt/e;", "repository", "Lam/h;", "timeProvider", "<init>", "(LFB/a;Lbt/e;Lam/h;)V", "", "storeId", "orderId", "", "expireDuration", "Ldt/a;", "b", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)Ldt/a;", "LXH/x;", "LXH/N;", "a", "(Ljava/lang/String;Ljava/lang/Long;LdI/e;)Ljava/lang/Object;", "LFB/a;", "Lbt/e;", "c", "Lam/h;", "getTimeProvider", "()Lam/h;", "instore-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class i implements h {

    /* renamed from: a  reason: collision with root package name */
    private final C12860a f79754a;

    /* renamed from: b  reason: collision with root package name */
    private final e f79755b;

    /* renamed from: c  reason: collision with root package name */
    private final h f79756c;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.ingka.ikea.instore.impl.foodmobile.usecase.SaveMobileFoodOrderUseCaseImpl", f = "SaveMobileFoodOrderUseCase.kt", l = {44, 47}, m = "invoke-0E7RQCE")
    static final class a extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f79757c;

        /* renamed from: d  reason: collision with root package name */
        Object f79758d;

        /* renamed from: e  reason: collision with root package name */
        Object f79759e;

        /* renamed from: f  reason: collision with root package name */
        Object f79760f;

        /* renamed from: g  reason: collision with root package name */
        Object f79761g;

        /* renamed from: h  reason: collision with root package name */
        Object f79762h;

        /* renamed from: i  reason: collision with root package name */
        Object f79763i;

        /* renamed from: j  reason: collision with root package name */
        Object f79764j;

        /* renamed from: k  reason: collision with root package name */
        int f79765k;

        /* renamed from: l  reason: collision with root package name */
        int f79766l;

        /* renamed from: m  reason: collision with root package name */
        /* synthetic */ Object f79767m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ i f79768n;

        /* renamed from: o  reason: collision with root package name */
        int f79769o;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(i iVar, C17164e<? super a> eVar) {
            super(eVar);
            this.f79768n = iVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f79767m = obj;
            this.f79769o |= Integer.MIN_VALUE;
            Object a10 = this.f79768n.a((String) null, (Long) null, this);
            return a10 == C17187b.f() ? a10 : x.a(a10);
        }
    }

    public i(C12860a aVar, e eVar, h hVar) {
        C17542s.j(aVar, "localStoreSelectionRepository");
        C17542s.j(eVar, "repository");
        C17542s.j(hVar, "timeProvider");
        this.f79754a = aVar;
        this.f79755b = eVar;
        this.f79756c = hVar;
    }

    private final C11240a b(String str, String str2, Long l10) {
        if (str.length() <= 0 || str2 == null || l10 == null) {
            return null;
        }
        qv.e eVar = qv.e.DEBUG;
        ArrayList<C11819b> arrayList = new ArrayList<>();
        for (Object next : qv.d.f102012a.a()) {
            if (((C11819b) next).b(eVar, false)) {
                arrayList.add(next);
            }
        }
        String str3 = null;
        String str4 = null;
        for (C11819b bVar : arrayList) {
            if (str3 == null) {
                String a10 = C11818a.a("Creating a Food Mobile order with an expire time of " + l10 + " seconds", (Throwable) null);
                if (a10 == null) {
                    break;
                }
                str3 = C11820c.a(a10);
            }
            String str5 = str3;
            if (str4 == null) {
                String name = i.class.getName();
                C17542s.g(name);
                String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o12.length() != 0) {
                    name = C15854t.P0(o12, "Kt");
                }
                str4 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
            }
            String str6 = str4;
            bVar.a(eVar, str6, false, (Throwable) null, str5);
            str3 = str5;
            str4 = str6;
        }
        LocalDateTime plusSeconds = this.f79756c.d().plusSeconds(l10.longValue());
        C17542s.i(plusSeconds, "plusSeconds(...)");
        return new C11240a(str, str2, plusSeconds);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v44, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v11, resolved type: Ct.i} */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x008d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0182, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0183, code lost:
        r2 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0245, code lost:
        throw r0;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:14:0x0085, B:51:0x0158] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x008d A[ExcHandler: CancellationException (r0v28 'e' java.util.concurrent.CancellationException A[CUSTOM_DECLARE]), Splitter:B:14:0x0085] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0194  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0037  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object a(java.lang.String r24, java.lang.Long r25, dI.C17164e<? super XH.x<XH.C16807N>> r26) {
        /*
            r23 = this;
            r1 = r23
            r0 = r24
            r2 = r25
            r3 = r26
            boolean r4 = r3 instanceof Ct.i.a
            if (r4 == 0) goto L_0x001b
            r4 = r3
            Ct.i$a r4 = (Ct.i.a) r4
            int r5 = r4.f79769o
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = r5 & r6
            if (r7 == 0) goto L_0x001b
            int r5 = r5 - r6
            r4.f79769o = r5
            goto L_0x0020
        L_0x001b:
            Ct.i$a r4 = new Ct.i$a
            r4.<init>(r1, r3)
        L_0x0020:
            java.lang.Object r5 = r4.f79767m
            java.lang.Object r6 = eI.C17187b.f()
            int r7 = r4.f79769o
            java.lang.String r8 = "|"
            java.lang.String r9 = "b"
            java.lang.String r10 = "m"
            java.lang.String r11 = "main"
            java.lang.String r12 = "Kt"
            r13 = 1
            r14 = 2
            r15 = 0
            if (r7 == 0) goto L_0x0090
            if (r7 == r13) goto L_0x0064
            if (r7 != r14) goto L_0x005c
            java.lang.Object r0 = r4.f79763i
            XH.x$a r0 = (XH.x.a) r0
            java.lang.Object r0 = r4.f79762h
            dt.a r0 = (dt.C11240a) r0
            java.lang.Object r0 = r4.f79761g
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r0 = r4.f79760f
            dI.e r0 = (dI.C17164e) r0
            java.lang.Object r0 = r4.f79759e
            java.lang.Long r0 = (java.lang.Long) r0
            java.lang.Object r0 = r4.f79758d
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r0 = r4.f79757c
            Ct.i r0 = (Ct.i) r0
            XH.y.b(r5)
            goto L_0x0262
        L_0x005c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x0064:
            java.lang.Object r0 = r4.f79764j
            Ct.i r0 = (Ct.i) r0
            java.lang.Object r0 = r4.f79763i
            Ct.i r0 = (Ct.i) r0
            java.lang.Object r0 = r4.f79762h
            dt.a r0 = (dt.C11240a) r0
            java.lang.Object r0 = r4.f79761g
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r0 = r4.f79760f
            dI.e r0 = (dI.C17164e) r0
            java.lang.Object r0 = r4.f79759e
            java.lang.Long r0 = (java.lang.Long) r0
            java.lang.Object r0 = r4.f79758d
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r0 = r4.f79757c
            r2 = r0
            Ct.i r2 = (Ct.i) r2
            XH.y.b(r5)     // Catch:{ CancellationException -> 0x008d, all -> 0x008a }
            goto L_0x017b
        L_0x008a:
            r0 = move-exception
            goto L_0x0184
        L_0x008d:
            r0 = move-exception
            goto L_0x0245
        L_0x0090:
            XH.y.b(r5)
            FB.a r5 = r1.f79754a
            EB.d r5 = r5.c()
            if (r5 == 0) goto L_0x00a0
            java.lang.String r5 = r5.e()
            goto L_0x00a1
        L_0x00a0:
            r5 = r15
        L_0x00a1:
            if (r5 != 0) goto L_0x0152
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "store id is null, unexpected scenario"
            r0.<init>(r2)
            qv.e r2 = qv.e.ERROR
            qv.d r3 = qv.d.f102012a
            java.util.List r3 = r3.a()
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r3 = r3.iterator()
        L_0x00bd:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x00d5
            java.lang.Object r5 = r3.next()
            r6 = r5
            qv.b r6 = (qv.C11819b) r6
            r7 = 0
            boolean r6 = r6.b(r2, r7)
            if (r6 == 0) goto L_0x00bd
            r4.add(r5)
            goto L_0x00bd
        L_0x00d5:
            java.util.Iterator r3 = r4.iterator()
            r4 = r15
            r5 = r4
        L_0x00db:
            boolean r6 = r3.hasNext()
            if (r6 == 0) goto L_0x0149
            java.lang.Object r6 = r3.next()
            r16 = r6
            qv.b r16 = (qv.C11819b) r16
            if (r4 != 0) goto L_0x00f6
            java.lang.String r4 = qv.C11818a.a(r15, r0)
            if (r4 != 0) goto L_0x00f2
            goto L_0x0149
        L_0x00f2:
            java.lang.String r4 = qv.C11820c.a(r4)
        L_0x00f6:
            if (r5 != 0) goto L_0x013b
            java.lang.Class<Ct.i> r5 = Ct.i.class
            java.lang.String r5 = r5.getName()
            kotlin.jvm.internal.C17542s.g(r5)
            r6 = 36
            java.lang.String r7 = HJ.C15854t.s1(r5, r6, r15, r14, r15)
            r6 = 46
            java.lang.String r7 = HJ.C15854t.o1(r7, r6, r15, r14, r15)
            int r6 = r7.length()
            if (r6 != 0) goto L_0x0114
            goto L_0x0118
        L_0x0114:
            java.lang.String r5 = HJ.C15854t.P0(r7, r12)
        L_0x0118:
            java.lang.Thread r6 = java.lang.Thread.currentThread()
            java.lang.String r6 = r6.getName()
            boolean r6 = HJ.C15854t.b0(r6, r11, r13)
            if (r6 == 0) goto L_0x0128
            r6 = r10
            goto L_0x0129
        L_0x0128:
            r6 = r9
        L_0x0129:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r6)
            r7.append(r8)
            r7.append(r5)
            java.lang.String r5 = r7.toString()
        L_0x013b:
            r19 = 0
            r17 = r2
            r18 = r5
            r20 = r0
            r21 = r4
            r16.a(r17, r18, r19, r20, r21)
            goto L_0x00db
        L_0x0149:
            XH.x$a r0 = XH.x.f139812b
            XH.N r0 = XH.C16807N.f139792a
            java.lang.Object r0 = XH.x.b(r0)
            return r0
        L_0x0152:
            dt.a r7 = r1.b(r5, r0, r2)
            if (r7 == 0) goto L_0x0246
            XH.x$a r16 = XH.x.f139812b     // Catch:{ CancellationException -> 0x008d, all -> 0x0182 }
            bt.e r14 = r1.f79755b     // Catch:{ CancellationException -> 0x008d, all -> 0x0182 }
            r4.f79757c = r1     // Catch:{ CancellationException -> 0x008d, all -> 0x0182 }
            r4.f79758d = r0     // Catch:{ CancellationException -> 0x008d, all -> 0x0182 }
            r4.f79759e = r2     // Catch:{ CancellationException -> 0x008d, all -> 0x0182 }
            r4.f79760f = r3     // Catch:{ CancellationException -> 0x008d, all -> 0x0182 }
            r4.f79761g = r5     // Catch:{ CancellationException -> 0x008d, all -> 0x0182 }
            r4.f79762h = r7     // Catch:{ CancellationException -> 0x008d, all -> 0x0182 }
            r4.f79763i = r1     // Catch:{ CancellationException -> 0x008d, all -> 0x0182 }
            r4.f79764j = r1     // Catch:{ CancellationException -> 0x008d, all -> 0x0182 }
            r2 = 0
            r4.f79765k = r2     // Catch:{ CancellationException -> 0x008d, all -> 0x0182 }
            r4.f79766l = r2     // Catch:{ CancellationException -> 0x008d, all -> 0x0182 }
            r4.f79769o = r13     // Catch:{ CancellationException -> 0x008d, all -> 0x0182 }
            java.lang.Object r0 = r14.d(r7, r4)     // Catch:{ CancellationException -> 0x008d, all -> 0x0182 }
            if (r0 != r6) goto L_0x017a
            return r6
        L_0x017a:
            r2 = r1
        L_0x017b:
            XH.N r0 = XH.C16807N.f139792a     // Catch:{ CancellationException -> 0x008d, all -> 0x008a }
            java.lang.Object r0 = XH.x.b(r0)     // Catch:{ CancellationException -> 0x008d, all -> 0x008a }
            goto L_0x018e
        L_0x0182:
            r0 = move-exception
            r2 = r1
        L_0x0184:
            XH.x$a r3 = XH.x.f139812b
            java.lang.Object r0 = XH.y.a(r0)
            java.lang.Object r0 = XH.x.b(r0)
        L_0x018e:
            java.lang.Throwable r3 = XH.x.e(r0)
            if (r3 == 0) goto L_0x0240
            qv.e r4 = qv.e.DEBUG
            qv.d r5 = qv.d.f102012a
            java.util.List r5 = r5.a()
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r5 = r5.iterator()
        L_0x01a7:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L_0x01c0
            java.lang.Object r7 = r5.next()
            r14 = r7
            qv.b r14 = (qv.C11819b) r14
            r13 = 0
            boolean r14 = r14.b(r4, r13)
            if (r14 == 0) goto L_0x01be
            r6.add(r7)
        L_0x01be:
            r13 = 1
            goto L_0x01a7
        L_0x01c0:
            java.util.Iterator r5 = r6.iterator()
            r6 = r15
            r7 = r6
        L_0x01c6:
            boolean r13 = r5.hasNext()
            if (r13 == 0) goto L_0x0240
            java.lang.Object r13 = r5.next()
            r17 = r13
            qv.b r17 = (qv.C11819b) r17
            if (r6 != 0) goto L_0x01e1
            java.lang.String r6 = qv.C11818a.a(r15, r3)
            if (r6 != 0) goto L_0x01dd
            goto L_0x0240
        L_0x01dd:
            java.lang.String r6 = qv.C11820c.a(r6)
        L_0x01e1:
            if (r7 != 0) goto L_0x022d
            java.lang.Class r7 = r2.getClass()
            java.lang.String r7 = r7.getName()
            kotlin.jvm.internal.C17542s.g(r7)
            r24 = r0
            r13 = 36
            r14 = 2
            java.lang.String r0 = HJ.C15854t.s1(r7, r13, r15, r14, r15)
            r13 = 46
            java.lang.String r0 = HJ.C15854t.o1(r0, r13, r15, r14, r15)
            int r14 = r0.length()
            if (r14 != 0) goto L_0x0204
            goto L_0x0208
        L_0x0204:
            java.lang.String r7 = HJ.C15854t.P0(r0, r12)
        L_0x0208:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            java.lang.String r0 = r0.getName()
            r14 = 1
            boolean r0 = HJ.C15854t.b0(r0, r11, r14)
            if (r0 == 0) goto L_0x0219
            r0 = r10
            goto L_0x021a
        L_0x0219:
            r0 = r9
        L_0x021a:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r0)
            r13.append(r8)
            r13.append(r7)
            java.lang.String r7 = r13.toString()
            goto L_0x0230
        L_0x022d:
            r24 = r0
            r14 = 1
        L_0x0230:
            r20 = 0
            r18 = r4
            r19 = r7
            r21 = r3
            r22 = r6
            r17.a(r18, r19, r20, r21, r22)
            r0 = r24
            goto L_0x01c6
        L_0x0240:
            r24 = r0
            r0 = r24
            goto L_0x0268
        L_0x0245:
            throw r0
        L_0x0246:
            XH.x$a r8 = XH.x.f139812b
            bt.e r9 = r1.f79755b
            r4.f79757c = r1
            r4.f79758d = r0
            r4.f79759e = r2
            r4.f79760f = r3
            r4.f79761g = r5
            r4.f79762h = r7
            r4.f79763i = r8
            r2 = 2
            r4.f79769o = r2
            java.lang.Object r0 = r9.c(r4)
            if (r0 != r6) goto L_0x0262
            return r6
        L_0x0262:
            XH.N r0 = XH.C16807N.f139792a
            java.lang.Object r0 = XH.x.b(r0)
        L_0x0268:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Ct.i.a(java.lang.String, java.lang.Long, dI.e):java.lang.Object");
    }
}
