package Zk;

import FB.C12860a;
import FB.C12863d;
import dI.C17164e;
import gp.C11343b;
import gp.C11346e;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17542s;
import lD.C14762d;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH@¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0011R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0018\u001a\u00020\u00148\u0016X\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u000f\u0010\u0017¨\u0006\u0019"}, d2 = {"LZk/d;", "Lgp/b;", "LlD/d;", "getProfile", "LFB/d;", "storeRepository", "LFB/a;", "localStoreSelectionRepository", "<init>", "(LlD/d;LFB/d;LFB/a;)V", "", "param", "", "b", "(Ljava/lang/Object;LdI/e;)Ljava/lang/Object;", "a", "LlD/d;", "LFB/d;", "c", "LFB/a;", "Lgp/e;", "d", "Lgp/e;", "()Lgp/e;", "taskId", "profile-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class d implements C11343b {

    /* renamed from: a  reason: collision with root package name */
    private final C14762d f89930a;

    /* renamed from: b  reason: collision with root package name */
    private final C12863d f89931b;

    /* renamed from: c  reason: collision with root package name */
    private final C12860a f89932c;

    /* renamed from: d  reason: collision with root package name */
    private final C11346e f89933d = C11346e.PROFILE_LOAD;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.ingka.ikea.app.task.ProfileLoadTask", f = "ProfileLoadTask.kt", l = {33, 43}, m = "execute")
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f89934c;

        /* renamed from: d  reason: collision with root package name */
        Object f89935d;

        /* renamed from: e  reason: collision with root package name */
        Object f89936e;

        /* renamed from: f  reason: collision with root package name */
        Object f89937f;

        /* renamed from: g  reason: collision with root package name */
        Object f89938g;

        /* renamed from: h  reason: collision with root package name */
        Object f89939h;

        /* renamed from: i  reason: collision with root package name */
        Object f89940i;

        /* renamed from: j  reason: collision with root package name */
        int f89941j;

        /* renamed from: k  reason: collision with root package name */
        int f89942k;

        /* renamed from: l  reason: collision with root package name */
        /* synthetic */ Object f89943l;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ d f89944m;

        /* renamed from: n  reason: collision with root package name */
        int f89945n;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(d dVar, C17164e<? super a> eVar) {
            super(eVar);
            this.f89944m = dVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f89943l = obj;
            this.f89945n |= Integer.MIN_VALUE;
            return this.f89944m.b((Object) null, this);
        }
    }

    public d(C14762d dVar, C12863d dVar2, C12860a aVar) {
        C17542s.j(dVar, "getProfile");
        C17542s.j(dVar2, "storeRepository");
        C17542s.j(aVar, "localStoreSelectionRepository");
        this.f89930a = dVar;
        this.f89931b = dVar2;
        this.f89932c = aVar;
    }

    public C11346e a() {
        return this.f89933d;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0058, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0195, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0196, code lost:
        r2 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0258, code lost:
        throw r0;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:11:0x0050, B:55:0x0145] */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0058 A[ExcHandler: CancellationException (r0v19 'e' java.util.concurrent.CancellationException A[CUSTOM_DECLARE]), Splitter:B:11:0x0050] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x013a  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x016a A[Catch:{ CancellationException -> 0x0058, all -> 0x0055 }] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x018f A[Catch:{ CancellationException -> 0x0058, all -> 0x0055 }] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x01a7  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0034  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object b(java.lang.Object r27, dI.C17164e<? super java.lang.Boolean> r28) {
        /*
            r26 = this;
            r1 = r26
            r0 = r28
            boolean r2 = r0 instanceof Zk.d.a
            if (r2 == 0) goto L_0x0017
            r2 = r0
            Zk.d$a r2 = (Zk.d.a) r2
            int r3 = r2.f89945n
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.f89945n = r3
            goto L_0x001c
        L_0x0017:
            Zk.d$a r2 = new Zk.d$a
            r2.<init>(r1, r0)
        L_0x001c:
            java.lang.Object r3 = r2.f89943l
            java.lang.Object r4 = eI.C17187b.f()
            int r5 = r2.f89945n
            java.lang.String r6 = "|"
            java.lang.String r7 = "b"
            java.lang.String r8 = "m"
            java.lang.String r9 = "main"
            java.lang.String r10 = "Kt"
            r13 = 0
            r14 = 2
            r15 = 1
            r11 = 0
            if (r5 == 0) goto L_0x0071
            if (r5 == r15) goto L_0x0063
            if (r5 != r14) goto L_0x005b
            java.lang.Object r0 = r2.f89940i
            Zk.d r0 = (Zk.d) r0
            java.lang.Object r4 = r2.f89939h
            Zk.d r4 = (Zk.d) r4
            java.lang.Object r4 = r2.f89938g
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r4 = r2.f89937f
            kD.h r4 = (kD.h) r4
            java.lang.Object r4 = r2.f89936e
            dI.e r4 = (dI.C17164e) r4
            java.lang.Object r2 = r2.f89934c
            Zk.d r2 = (Zk.d) r2
            XH.y.b(r3)     // Catch:{ CancellationException -> 0x0058, all -> 0x0055 }
            goto L_0x0166
        L_0x0055:
            r0 = move-exception
            goto L_0x0197
        L_0x0058:
            r0 = move-exception
            goto L_0x0258
        L_0x005b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x0063:
            java.lang.Object r0 = r2.f89936e
            dI.e r0 = (dI.C17164e) r0
            java.lang.Object r5 = r2.f89935d
            java.lang.Object r12 = r2.f89934c
            Zk.d r12 = (Zk.d) r12
            XH.y.b(r3)
            goto L_0x0088
        L_0x0071:
            XH.y.b(r3)
            lD.d r3 = r1.f89930a
            r2.f89934c = r1
            r5 = r27
            r2.f89935d = r5
            r2.f89936e = r0
            r2.f89945n = r15
            java.lang.Object r3 = lD.C14762d.a.a(r3, r13, r2, r15, r11)
            if (r3 != r4) goto L_0x0087
            return r4
        L_0x0087:
            r12 = r1
        L_0x0088:
            kD.h r3 = (kD.h) r3
            FB.a r15 = r12.f89932c
            EB.d r15 = r15.c()
            if (r15 == 0) goto L_0x013a
            qv.e r0 = qv.e.DEBUG
            qv.d r2 = qv.d.f102012a
            java.util.List r2 = r2.a()
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r2 = r2.iterator()
        L_0x00a5:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x00bc
            java.lang.Object r4 = r2.next()
            r5 = r4
            qv.b r5 = (qv.C11819b) r5
            boolean r5 = r5.b(r0, r13)
            if (r5 == 0) goto L_0x00a5
            r3.add(r4)
            goto L_0x00a5
        L_0x00bc:
            java.util.Iterator r2 = r3.iterator()
            r3 = r11
            r4 = r3
        L_0x00c2:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L_0x00db
            java.lang.Object r5 = r2.next()
            r17 = r5
            qv.b r17 = (qv.C11819b) r17
            r5 = 0
            if (r3 != 0) goto L_0x00e1
            java.lang.String r3 = "Don't override local storage on login, since local already exists"
            java.lang.String r3 = qv.C11818a.a(r3, r5)
            if (r3 != 0) goto L_0x00dd
        L_0x00db:
            r2 = 1
            goto L_0x0135
        L_0x00dd:
            java.lang.String r3 = qv.C11820c.a(r3)
        L_0x00e1:
            if (r4 != 0) goto L_0x0127
            java.lang.Class<Zk.d> r4 = Zk.d.class
            java.lang.String r4 = r4.getName()
            kotlin.jvm.internal.C17542s.g(r4)
            r12 = 36
            java.lang.String r13 = HJ.C15854t.s1(r4, r12, r11, r14, r11)
            r12 = 46
            java.lang.String r13 = HJ.C15854t.o1(r13, r12, r11, r14, r11)
            int r12 = r13.length()
            if (r12 != 0) goto L_0x00ff
            goto L_0x0103
        L_0x00ff:
            java.lang.String r4 = HJ.C15854t.P0(r13, r10)
        L_0x0103:
            java.lang.Thread r12 = java.lang.Thread.currentThread()
            java.lang.String r12 = r12.getName()
            r13 = 1
            boolean r12 = HJ.C15854t.b0(r12, r9, r13)
            if (r12 == 0) goto L_0x0114
            r12 = r8
            goto L_0x0115
        L_0x0114:
            r12 = r7
        L_0x0115:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r12)
            r13.append(r6)
            r13.append(r4)
            java.lang.String r4 = r13.toString()
        L_0x0127:
            r20 = 0
            r18 = r0
            r19 = r4
            r21 = r5
            r22 = r3
            r17.a(r18, r19, r20, r21, r22)
            goto L_0x00c2
        L_0x0135:
            java.lang.Boolean r0 = kotlin.coroutines.jvm.internal.b.a(r2)
            return r0
        L_0x013a:
            if (r3 == 0) goto L_0x0142
            java.lang.String r15 = r3.i()
            if (r15 != 0) goto L_0x0145
        L_0x0142:
            r1 = 1
            goto L_0x0259
        L_0x0145:
            XH.x$a r17 = XH.x.f139812b     // Catch:{ CancellationException -> 0x0058, all -> 0x0195 }
            FB.d r11 = r12.f89931b     // Catch:{ CancellationException -> 0x0058, all -> 0x0195 }
            r2.f89934c = r12     // Catch:{ CancellationException -> 0x0058, all -> 0x0195 }
            r2.f89935d = r5     // Catch:{ CancellationException -> 0x0058, all -> 0x0195 }
            r2.f89936e = r0     // Catch:{ CancellationException -> 0x0058, all -> 0x0195 }
            r2.f89937f = r3     // Catch:{ CancellationException -> 0x0058, all -> 0x0195 }
            r2.f89938g = r15     // Catch:{ CancellationException -> 0x0058, all -> 0x0195 }
            r2.f89939h = r12     // Catch:{ CancellationException -> 0x0058, all -> 0x0195 }
            r2.f89940i = r12     // Catch:{ CancellationException -> 0x0058, all -> 0x0195 }
            r2.f89941j = r13     // Catch:{ CancellationException -> 0x0058, all -> 0x0195 }
            r2.f89942k = r13     // Catch:{ CancellationException -> 0x0058, all -> 0x0195 }
            r2.f89945n = r14     // Catch:{ CancellationException -> 0x0058, all -> 0x0195 }
            java.lang.Object r3 = r11.b(r15, r2)     // Catch:{ CancellationException -> 0x0058, all -> 0x0195 }
            if (r3 != r4) goto L_0x0164
            return r4
        L_0x0164:
            r0 = r12
            r2 = r0
        L_0x0166:
            EB.c r3 = (EB.C12831c) r3     // Catch:{ CancellationException -> 0x0058, all -> 0x0055 }
            if (r3 == 0) goto L_0x018f
            FB.a r0 = r0.f89932c     // Catch:{ CancellationException -> 0x0058, all -> 0x0055 }
            EB.d r4 = new EB.d     // Catch:{ CancellationException -> 0x0058, all -> 0x0055 }
            java.lang.String r19 = r3.g()     // Catch:{ CancellationException -> 0x0058, all -> 0x0055 }
            java.lang.String r20 = r3.h()     // Catch:{ CancellationException -> 0x0058, all -> 0x0055 }
            java.lang.String r21 = r3.f()     // Catch:{ CancellationException -> 0x0058, all -> 0x0055 }
            boolean r22 = r3.i()     // Catch:{ CancellationException -> 0x0058, all -> 0x0055 }
            r24 = 16
            r25 = 0
            r23 = 0
            r18 = r4
            r18.<init>(r19, r20, r21, r22, r23, r24, r25)     // Catch:{ CancellationException -> 0x0058, all -> 0x0055 }
            r0.a(r4)     // Catch:{ CancellationException -> 0x0058, all -> 0x0055 }
            XH.N r0 = XH.C16807N.f139792a     // Catch:{ CancellationException -> 0x0058, all -> 0x0055 }
            goto L_0x0190
        L_0x018f:
            r0 = 0
        L_0x0190:
            java.lang.Object r0 = XH.x.b(r0)     // Catch:{ CancellationException -> 0x0058, all -> 0x0055 }
            goto L_0x01a1
        L_0x0195:
            r0 = move-exception
            r2 = r12
        L_0x0197:
            XH.x$a r3 = XH.x.f139812b
            java.lang.Object r0 = XH.y.a(r0)
            java.lang.Object r0 = XH.x.b(r0)
        L_0x01a1:
            java.lang.Throwable r3 = XH.x.e(r0)
            if (r3 == 0) goto L_0x024f
            qv.e r4 = qv.e.WARN
            qv.d r5 = qv.d.f102012a
            java.util.List r5 = r5.a()
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.util.Iterator r5 = r5.iterator()
        L_0x01ba:
            boolean r12 = r5.hasNext()
            if (r12 == 0) goto L_0x01d1
            java.lang.Object r12 = r5.next()
            r15 = r12
            qv.b r15 = (qv.C11819b) r15
            boolean r15 = r15.b(r4, r13)
            if (r15 == 0) goto L_0x01ba
            r11.add(r12)
            goto L_0x01ba
        L_0x01d1:
            java.util.Iterator r5 = r11.iterator()
            r11 = 0
            r12 = 0
        L_0x01d7:
            boolean r13 = r5.hasNext()
            if (r13 == 0) goto L_0x024f
            java.lang.Object r13 = r5.next()
            r18 = r13
            qv.b r18 = (qv.C11819b) r18
            if (r11 != 0) goto L_0x01f4
            java.lang.String r11 = "Failed to update local store selection"
            java.lang.String r11 = qv.C11818a.a(r11, r3)
            if (r11 != 0) goto L_0x01f0
            goto L_0x024f
        L_0x01f0:
            java.lang.String r11 = qv.C11820c.a(r11)
        L_0x01f4:
            if (r12 != 0) goto L_0x023e
            java.lang.Class r12 = r2.getClass()
            java.lang.String r12 = r12.getName()
            kotlin.jvm.internal.C17542s.g(r12)
            r13 = 36
            r15 = 0
            java.lang.String r1 = HJ.C15854t.s1(r12, r13, r15, r14, r15)
            r13 = 46
            java.lang.String r1 = HJ.C15854t.o1(r1, r13, r15, r14, r15)
            int r16 = r1.length()
            if (r16 != 0) goto L_0x0215
            goto L_0x0219
        L_0x0215:
            java.lang.String r12 = HJ.C15854t.P0(r1, r10)
        L_0x0219:
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            java.lang.String r1 = r1.getName()
            r13 = 1
            boolean r1 = HJ.C15854t.b0(r1, r9, r13)
            if (r1 == 0) goto L_0x022a
            r1 = r8
            goto L_0x022b
        L_0x022a:
            r1 = r7
        L_0x022b:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r1)
            r13.append(r6)
            r13.append(r12)
            java.lang.String r12 = r13.toString()
            goto L_0x023f
        L_0x023e:
            r15 = 0
        L_0x023f:
            r21 = 0
            r19 = r4
            r20 = r12
            r22 = r3
            r23 = r11
            r18.a(r19, r20, r21, r22, r23)
            r1 = r26
            goto L_0x01d7
        L_0x024f:
            boolean r0 = XH.x.h(r0)
            java.lang.Boolean r0 = kotlin.coroutines.jvm.internal.b.a(r0)
            return r0
        L_0x0258:
            throw r0
        L_0x0259:
            java.lang.Boolean r0 = kotlin.coroutines.jvm.internal.b.a(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Zk.d.b(java.lang.Object, dI.e):java.lang.Object");
    }
}
