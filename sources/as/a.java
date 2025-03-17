package As;

import Gs.b;
import dI.C17164e;
import gp.C11343b;
import gp.C11346e;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H@¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u0010\u001a\u00020\r8\u0016X\u0004¢\u0006\f\n\u0004\b\t\u0010\u000e\u001a\u0004\b\u000b\u0010\u000f¨\u0006\u0011"}, d2 = {"LAs/a;", "Lgp/b;", "LGs/b;", "inboxRepository", "<init>", "(LGs/b;)V", "", "param", "", "b", "(Ljava/lang/Object;LdI/e;)Ljava/lang/Object;", "a", "LGs/b;", "Lgp/e;", "Lgp/e;", "()Lgp/e;", "taskId", "inbox-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a implements C11343b {

    /* renamed from: a  reason: collision with root package name */
    private final b f79076a;

    /* renamed from: b  reason: collision with root package name */
    private final C11346e f79077b = C11346e.CLEAR_ALL_NOTIFICATIONS_ON_REGION_CHANGE;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.ingka.ikea.inbox.impl.task.ClearAllNotificationsOnRegionChangeTask", f = "ClearAllNotificationsOnRegionChangeTask.kt", l = {23, 24}, m = "execute")
    /* renamed from: As.a$a  reason: collision with other inner class name */
    static final class C1464a extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f79078c;

        /* renamed from: d  reason: collision with root package name */
        Object f79079d;

        /* renamed from: e  reason: collision with root package name */
        Object f79080e;

        /* renamed from: f  reason: collision with root package name */
        Object f79081f;

        /* renamed from: g  reason: collision with root package name */
        Object f79082g;

        /* renamed from: h  reason: collision with root package name */
        Object f79083h;

        /* renamed from: i  reason: collision with root package name */
        Object f79084i;

        /* renamed from: j  reason: collision with root package name */
        Object f79085j;

        /* renamed from: k  reason: collision with root package name */
        Object f79086k;

        /* renamed from: l  reason: collision with root package name */
        Object f79087l;

        /* renamed from: m  reason: collision with root package name */
        Object f79088m;

        /* renamed from: n  reason: collision with root package name */
        int f79089n;

        /* renamed from: o  reason: collision with root package name */
        int f79090o;

        /* renamed from: p  reason: collision with root package name */
        int f79091p;

        /* renamed from: q  reason: collision with root package name */
        int f79092q;

        /* renamed from: r  reason: collision with root package name */
        int f79093r;

        /* renamed from: s  reason: collision with root package name */
        /* synthetic */ Object f79094s;

        /* renamed from: t  reason: collision with root package name */
        final /* synthetic */ a f79095t;

        /* renamed from: u  reason: collision with root package name */
        int f79096u;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1464a(a aVar, C17164e<? super C1464a> eVar) {
            super(eVar);
            this.f79095t = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f79094s = obj;
            this.f79096u |= Integer.MIN_VALUE;
            return this.f79095t.b((Object) null, this);
        }
    }

    public a(b bVar) {
        C17542s.j(bVar, "inboxRepository");
        this.f79076a = bVar;
    }

    public C11346e a() {
        return this.f79077b;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x01d8 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x01d9  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0028  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object b(java.lang.Object r25, dI.C17164e<? super java.lang.Boolean> r26) {
        /*
            r24 = this;
            r0 = r24
            r1 = r26
            boolean r2 = r1 instanceof As.a.C1464a
            if (r2 == 0) goto L_0x0017
            r2 = r1
            As.a$a r2 = (As.a.C1464a) r2
            int r3 = r2.f79096u
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.f79096u = r3
            goto L_0x001c
        L_0x0017:
            As.a$a r2 = new As.a$a
            r2.<init>(r0, r1)
        L_0x001c:
            java.lang.Object r3 = r2.f79094s
            java.lang.Object r4 = eI.C17187b.f()
            int r5 = r2.f79096u
            r6 = 2
            r7 = 1
            if (r5 == 0) goto L_0x00b4
            if (r5 == r7) goto L_0x005e
            if (r5 != r6) goto L_0x0056
            java.lang.Object r1 = r2.f79087l
            java.util.Iterator r1 = (java.util.Iterator) r1
            java.lang.Object r1 = r2.f79086k
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.lang.Object r1 = r2.f79085j
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r2.f79084i
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r2.f79083h
            qv.e r1 = (qv.e) r1
            java.lang.Object r1 = r2.f79082g
            As.a r1 = (As.a) r1
            java.lang.Object r1 = r2.f79081f
            As.a r1 = (As.a) r1
            java.lang.Object r1 = r2.f79080e
            dI.e r1 = (dI.C17164e) r1
            java.lang.Object r1 = r2.f79078c
            As.a r1 = (As.a) r1
            XH.y.b(r3)
            r0 = r7
            goto L_0x01da
        L_0x0056:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x005e:
            int r1 = r2.f79093r
            int r5 = r2.f79092q
            int r8 = r2.f79091p
            int r9 = r2.f79090o
            int r10 = r2.f79089n
            java.lang.Object r11 = r2.f79088m
            java.lang.Object r12 = r2.f79087l
            java.util.Iterator r12 = (java.util.Iterator) r12
            java.lang.Object r13 = r2.f79086k
            java.lang.Iterable r13 = (java.lang.Iterable) r13
            java.lang.Object r14 = r2.f79085j
            java.lang.String r14 = (java.lang.String) r14
            java.lang.Object r15 = r2.f79084i
            java.lang.String r15 = (java.lang.String) r15
            java.lang.Object r7 = r2.f79083h
            qv.e r7 = (qv.e) r7
            java.lang.Object r6 = r2.f79082g
            As.a r6 = (As.a) r6
            r25 = r1
            java.lang.Object r1 = r2.f79081f
            As.a r1 = (As.a) r1
            r26 = r1
            java.lang.Object r1 = r2.f79080e
            dI.e r1 = (dI.C17164e) r1
            r16 = r1
            java.lang.Object r1 = r2.f79079d
            r17 = r1
            java.lang.Object r1 = r2.f79078c
            As.a r1 = (As.a) r1
            XH.y.b(r3)
            r3 = r1
            r18 = r5
            r0 = r13
            r1 = r16
            r5 = r17
            r17 = r25
            r16 = r4
            r13 = r10
            r4 = r14
            r10 = r7
            r14 = r11
            r7 = r15
            r11 = r8
            r15 = r12
            r12 = r9
            r9 = r6
            r6 = r26
            goto L_0x01a7
        L_0x00b4:
            XH.y.b(r3)
            qv.e r7 = qv.e.DEBUG
            qv.d r3 = qv.d.f102012a
            java.util.List r3 = r3.a()
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            java.util.Iterator r3 = r3.iterator()
        L_0x00ca:
            boolean r5 = r3.hasNext()
            r6 = 0
            if (r5 == 0) goto L_0x00e2
            java.lang.Object r5 = r3.next()
            r8 = r5
            qv.b r8 = (qv.C11819b) r8
            boolean r6 = r8.b(r7, r6)
            if (r6 == 0) goto L_0x00ca
            r13.add(r5)
            goto L_0x00ca
        L_0x00e2:
            java.util.Iterator r12 = r13.iterator()
            r3 = 0
            r14 = r3
            r15 = r14
            r5 = r13
        L_0x00ea:
            boolean r8 = r12.hasNext()
            if (r8 == 0) goto L_0x0103
            java.lang.Object r5 = r12.next()
            r18 = r5
            qv.b r18 = (qv.C11819b) r18
            r8 = 0
            if (r15 != 0) goto L_0x0109
            java.lang.String r9 = "Clearing inbox"
            java.lang.String r9 = qv.C11818a.a(r9, r8)
            if (r9 != 0) goto L_0x0105
        L_0x0103:
            r11 = r5
            goto L_0x0166
        L_0x0105:
            java.lang.String r15 = qv.C11820c.a(r9)
        L_0x0109:
            if (r14 != 0) goto L_0x0158
            java.lang.Class<As.a> r9 = As.a.class
            java.lang.String r9 = r9.getName()
            kotlin.jvm.internal.C17542s.g(r9)
            r10 = 36
            r11 = 2
            java.lang.String r10 = HJ.C15854t.s1(r9, r10, r3, r11, r3)
            r14 = 46
            java.lang.String r10 = HJ.C15854t.o1(r10, r14, r3, r11, r3)
            int r11 = r10.length()
            if (r11 != 0) goto L_0x0128
            goto L_0x012e
        L_0x0128:
            java.lang.String r9 = "Kt"
            java.lang.String r9 = HJ.C15854t.P0(r10, r9)
        L_0x012e:
            java.lang.Thread r10 = java.lang.Thread.currentThread()
            java.lang.String r10 = r10.getName()
            java.lang.String r11 = "main"
            r14 = 1
            boolean r10 = HJ.C15854t.b0(r10, r11, r14)
            if (r10 == 0) goto L_0x0142
            java.lang.String r10 = "m"
            goto L_0x0144
        L_0x0142:
            java.lang.String r10 = "b"
        L_0x0144:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r10)
            java.lang.String r10 = "|"
            r11.append(r10)
            r11.append(r9)
            java.lang.String r14 = r11.toString()
        L_0x0158:
            r21 = 0
            r19 = r7
            r20 = r14
            r22 = r8
            r23 = r15
            r18.a(r19, r20, r21, r22, r23)
            goto L_0x00ea
        L_0x0166:
            Gs.b r3 = r0.f79076a
            r2.f79078c = r0
            r5 = r25
            r2.f79079d = r5
            r2.f79080e = r1
            r2.f79081f = r0
            r2.f79082g = r0
            r2.f79083h = r7
            r2.f79084i = r15
            r2.f79085j = r14
            r2.f79086k = r13
            r2.f79087l = r12
            r2.f79088m = r11
            r2.f79089n = r6
            r2.f79090o = r6
            r2.f79091p = r6
            r2.f79092q = r6
            r2.f79093r = r6
            r8 = 1
            r2.f79096u = r8
            java.lang.Object r3 = r3.g(r2)
            if (r3 != r4) goto L_0x0194
            return r4
        L_0x0194:
            r3 = r0
            r9 = r3
            r16 = r4
            r17 = r6
            r18 = r17
            r10 = r7
            r4 = r14
            r7 = r15
            r14 = r11
            r15 = r12
            r0 = r13
            r11 = r18
            r12 = r11
            r13 = r12
            r6 = r9
        L_0x01a7:
            Gs.b r8 = r3.f79076a
            r2.f79078c = r3
            r2.f79079d = r5
            r2.f79080e = r1
            r2.f79081f = r6
            r2.f79082g = r9
            r2.f79083h = r10
            r2.f79084i = r7
            r2.f79085j = r4
            r2.f79086k = r0
            r2.f79087l = r15
            r2.f79088m = r14
            r2.f79089n = r13
            r2.f79090o = r12
            r2.f79091p = r11
            r5 = r18
            r2.f79092q = r5
            r6 = r17
            r2.f79093r = r6
            r0 = 2
            r2.f79096u = r0
            java.lang.Object r0 = r8.b(r2)
            r1 = r16
            if (r0 != r1) goto L_0x01d9
            return r1
        L_0x01d9:
            r0 = 1
        L_0x01da:
            java.lang.Boolean r0 = kotlin.coroutines.jvm.internal.b.a(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: As.a.b(java.lang.Object, dI.e):java.lang.Object");
    }
}
