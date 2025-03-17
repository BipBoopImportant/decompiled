package Lz;

import FB.C12860a;
import Ry.f;
import dI.C17164e;
import gp.C11343b;
import gp.C11346e;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.jvm.internal.C17542s;
import tz.C15100a;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH@¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0011R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0018\u001a\u00020\u00148\u0016X\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u000f\u0010\u0017¨\u0006\u0019"}, d2 = {"LLz/b;", "Lgp/b;", "LFB/a;", "localStoreSelectionRepository", "Ltz/a;", "getProfileState", "LRy/f;", "scanAndGoCartRepositoryFactory", "<init>", "(LFB/a;Ltz/a;LRy/f;)V", "", "param", "", "b", "(Ljava/lang/Object;LdI/e;)Ljava/lang/Object;", "a", "LFB/a;", "Ltz/a;", "c", "LRy/f;", "Lgp/e;", "d", "Lgp/e;", "()Lgp/e;", "taskId", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b implements C11343b {

    /* renamed from: a  reason: collision with root package name */
    private final C12860a f111954a;

    /* renamed from: b  reason: collision with root package name */
    private final C15100a f111955b;

    /* renamed from: c  reason: collision with root package name */
    private final f f111956c;

    /* renamed from: d  reason: collision with root package name */
    private final C11346e f111957d = C11346e.SCAN_AND_GO_USER_LOGIN;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.scanandgo.task.ScanAndGoUserLoginTask", f = "ScanAndGoUserLoginTask.kt", l = {42, 43}, m = "execute")
    static final class a extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f111958c;

        /* renamed from: d  reason: collision with root package name */
        Object f111959d;

        /* renamed from: e  reason: collision with root package name */
        Object f111960e;

        /* renamed from: f  reason: collision with root package name */
        Object f111961f;

        /* renamed from: g  reason: collision with root package name */
        Object f111962g;

        /* renamed from: h  reason: collision with root package name */
        Object f111963h;

        /* renamed from: i  reason: collision with root package name */
        /* synthetic */ Object f111964i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ b f111965j;

        /* renamed from: k  reason: collision with root package name */
        int f111966k;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(b bVar, C17164e<? super a> eVar) {
            super(eVar);
            this.f111965j = bVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f111964i = obj;
            this.f111966k |= Integer.MIN_VALUE;
            return this.f111965j.b((Object) null, this);
        }
    }

    public b(C12860a aVar, C15100a aVar2, f fVar) {
        C17542s.j(aVar, "localStoreSelectionRepository");
        C17542s.j(aVar2, "getProfileState");
        C17542s.j(fVar, "scanAndGoCartRepositoryFactory");
        this.f111954a = aVar;
        this.f111955b = aVar2;
        this.f111956c = fVar;
    }

    public C11346e a() {
        return this.f111957d;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x017a  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x017d  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x01c6 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x01cd  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0038  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object b(java.lang.Object r27, dI.C17164e<? super java.lang.Boolean> r28) {
        /*
            r26 = this;
            r0 = r26
            r1 = r27
            r2 = r28
            boolean r3 = r2 instanceof Lz.b.a
            if (r3 == 0) goto L_0x001a
            r3 = r2
            Lz.b$a r3 = (Lz.b.a) r3
            int r4 = r3.f111966k
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x001a
            int r4 = r4 - r5
            r3.f111966k = r4
        L_0x0018:
            r9 = r3
            goto L_0x0020
        L_0x001a:
            Lz.b$a r3 = new Lz.b$a
            r3.<init>(r0, r2)
            goto L_0x0018
        L_0x0020:
            java.lang.Object r3 = r9.f111964i
            java.lang.Object r10 = eI.C17187b.f()
            int r4 = r9.f111966k
            java.lang.String r11 = "|"
            java.lang.String r12 = "b"
            java.lang.String r13 = "m"
            java.lang.String r14 = "main"
            java.lang.String r15 = "Kt"
            r6 = 0
            r5 = 1
            r8 = 2
            r7 = 0
            if (r4 == 0) goto L_0x008c
            if (r4 == r5) goto L_0x0067
            if (r4 != r8) goto L_0x005f
            java.lang.Object r1 = r9.f111963h
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r9.f111962g
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r9.f111961f
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r9.f111960e
            dI.e r1 = (dI.C17164e) r1
            java.lang.Object r1 = r9.f111958c
            Lz.b r1 = (Lz.b) r1
            XH.y.b(r3)
            XH.x r3 = (XH.x) r3
            java.lang.Object r2 = r3.j()
            r3 = r1
            r4 = r2
            r1 = r6
            r2 = r8
            goto L_0x01c7
        L_0x005f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0067:
            java.lang.Object r1 = r9.f111963h
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            java.lang.Object r1 = r9.f111962g
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r2 = r9.f111961f
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r4 = r9.f111960e
            dI.e r4 = (dI.C17164e) r4
            java.lang.Object r5 = r9.f111959d
            java.lang.Object r8 = r9.f111958c
            Lz.b r8 = (Lz.b) r8
            XH.y.b(r3)
            r6 = 1
            r25 = r4
            r4 = r1
            r1 = r5
            r5 = r3
            r3 = r8
            r8 = r2
            r2 = r25
            goto L_0x0197
        L_0x008c:
            XH.y.b(r3)
            boolean r3 = r1 instanceof java.lang.String
            if (r3 == 0) goto L_0x0097
            r3 = r1
            java.lang.String r3 = (java.lang.String) r3
            goto L_0x0098
        L_0x0097:
            r3 = r7
        L_0x0098:
            if (r3 != 0) goto L_0x0158
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Guest token is not a String when logging in: "
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1)
            qv.e r1 = qv.e.WARN
            qv.d r3 = qv.d.f102012a
            java.util.List r3 = r3.a()
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r3 = r3.iterator()
        L_0x00c3:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x00da
            java.lang.Object r5 = r3.next()
            r8 = r5
            qv.b r8 = (qv.C11819b) r8
            boolean r8 = r8.b(r1, r6)
            if (r8 == 0) goto L_0x00c3
            r4.add(r5)
            goto L_0x00c3
        L_0x00da:
            java.util.Iterator r3 = r4.iterator()
            r4 = r7
            r5 = r4
        L_0x00e0:
            boolean r8 = r3.hasNext()
            if (r8 == 0) goto L_0x0153
            java.lang.Object r8 = r3.next()
            r19 = r8
            qv.b r19 = (qv.C11819b) r19
            if (r4 != 0) goto L_0x00fb
            java.lang.String r4 = qv.C11818a.a(r7, r2)
            if (r4 != 0) goto L_0x00f7
            goto L_0x0153
        L_0x00f7:
            java.lang.String r4 = qv.C11820c.a(r4)
        L_0x00fb:
            if (r5 != 0) goto L_0x0143
            java.lang.Class<Lz.b> r5 = Lz.b.class
            java.lang.String r5 = r5.getName()
            kotlin.jvm.internal.C17542s.g(r5)
            r8 = 36
            r9 = 2
            java.lang.String r10 = HJ.C15854t.s1(r5, r8, r7, r9, r7)
            r8 = 46
            java.lang.String r10 = HJ.C15854t.o1(r10, r8, r7, r9, r7)
            int r9 = r10.length()
            if (r9 != 0) goto L_0x011a
            goto L_0x011e
        L_0x011a:
            java.lang.String r5 = HJ.C15854t.P0(r10, r15)
        L_0x011e:
            java.lang.Thread r9 = java.lang.Thread.currentThread()
            java.lang.String r9 = r9.getName()
            r10 = 1
            boolean r9 = HJ.C15854t.b0(r9, r14, r10)
            if (r9 == 0) goto L_0x012f
            r9 = r13
            goto L_0x0130
        L_0x012f:
            r9 = r12
        L_0x0130:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r9)
            r10.append(r11)
            r10.append(r5)
            java.lang.String r5 = r10.toString()
            goto L_0x0145
        L_0x0143:
            r8 = 46
        L_0x0145:
            r22 = 0
            r20 = r1
            r21 = r5
            r23 = r2
            r24 = r4
            r19.a(r20, r21, r22, r23, r24)
            goto L_0x00e0
        L_0x0153:
            java.lang.Boolean r1 = kotlin.coroutines.jvm.internal.b.a(r6)
            return r1
        L_0x0158:
            r8 = 46
            FB.a r4 = r0.f111954a
            EB.d r4 = r4.c()
            if (r4 == 0) goto L_0x0171
            boolean r5 = r4.f()
            if (r5 == 0) goto L_0x0169
            goto L_0x016a
        L_0x0169:
            r4 = r7
        L_0x016a:
            if (r4 == 0) goto L_0x0171
            java.lang.String r4 = r4.e()
            goto L_0x0172
        L_0x0171:
            r4 = r7
        L_0x0172:
            if (r4 == 0) goto L_0x017a
            int r5 = r4.length()
            if (r5 != 0) goto L_0x017d
        L_0x017a:
            r1 = r6
            goto L_0x0291
        L_0x017d:
            tz.a r5 = r0.f111955b
            r9.f111958c = r0
            r9.f111959d = r1
            r9.f111960e = r2
            r9.f111961f = r3
            r9.f111962g = r4
            r9.f111963h = r4
            r6 = 1
            r9.f111966k = r6
            java.lang.Object r5 = r5.a(r9)
            if (r5 != r10) goto L_0x0195
            return r10
        L_0x0195:
            r8 = r3
            r3 = r0
        L_0x0197:
            rz.K r5 = (rz.K) r5
            java.lang.String r5 = r5.a()
            Ry.f r6 = r3.f111956c
            Ry.e r6 = r6.invoke()
            r9.f111958c = r3
            r9.f111959d = r1
            r9.f111960e = r2
            r9.f111961f = r8
            r9.f111962g = r4
            r9.f111963h = r5
            r1 = 2
            r9.f111966k = r1
            r2 = 1
            r18 = r4
            r4 = r6
            r19 = r5
            r6 = 1
            r5 = r18
            r1 = 0
            r6 = r19
            r7 = r2
            r2 = 2
            java.lang.Object r4 = r4.q(r5, r6, r7, r8, r9)
            if (r4 != r10) goto L_0x01c7
            return r10
        L_0x01c7:
            java.lang.Throwable r10 = XH.x.e(r4)
            if (r10 == 0) goto L_0x0288
            qv.e r9 = qv.e.WARN
            qv.d r5 = qv.d.f102012a
            java.util.List r5 = r5.a()
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r5 = r5.iterator()
        L_0x01e0:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L_0x01f7
            java.lang.Object r7 = r5.next()
            r8 = r7
            qv.b r8 = (qv.C11819b) r8
            boolean r8 = r8.b(r9, r1)
            if (r8 == 0) goto L_0x01e0
            r6.add(r7)
            goto L_0x01e0
        L_0x01f7:
            java.util.Iterator r1 = r6.iterator()
            r5 = 0
            r7 = 0
        L_0x01fd:
            boolean r6 = r1.hasNext()
            if (r6 == 0) goto L_0x0288
            java.lang.Object r6 = r1.next()
            qv.b r6 = (qv.C11819b) r6
            r8 = 0
            if (r7 != 0) goto L_0x0218
            java.lang.String r7 = qv.C11818a.a(r8, r10)
            if (r7 != 0) goto L_0x0214
            goto L_0x0288
        L_0x0214:
            java.lang.String r7 = qv.C11820c.a(r7)
        L_0x0218:
            r17 = r7
            if (r5 != 0) goto L_0x0265
            java.lang.Class r5 = r3.getClass()
            java.lang.String r5 = r5.getName()
            kotlin.jvm.internal.C17542s.g(r5)
            r7 = 36
            java.lang.String r0 = HJ.C15854t.s1(r5, r7, r8, r2, r8)
            r27 = r1
            r1 = 46
            java.lang.String r0 = HJ.C15854t.o1(r0, r1, r8, r2, r8)
            int r16 = r0.length()
            if (r16 != 0) goto L_0x023c
            goto L_0x0240
        L_0x023c:
            java.lang.String r5 = HJ.C15854t.P0(r0, r15)
        L_0x0240:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            java.lang.String r0 = r0.getName()
            r1 = 1
            boolean r0 = HJ.C15854t.b0(r0, r14, r1)
            if (r0 == 0) goto L_0x0251
            r0 = r13
            goto L_0x0252
        L_0x0251:
            r0 = r12
        L_0x0252:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r11)
            r1.append(r5)
            java.lang.String r0 = r1.toString()
            goto L_0x026a
        L_0x0265:
            r27 = r1
            r7 = 36
            r0 = r5
        L_0x026a:
            r1 = 0
            r5 = r6
            r6 = r9
            r18 = r7
            r7 = r0
            r19 = r8
            r8 = r1
            r1 = r9
            r9 = r10
            r20 = r10
            r10 = r17
            r5.a(r6, r7, r8, r9, r10)
            r5 = r0
            r9 = r1
            r7 = r17
            r10 = r20
            r0 = r26
            r1 = r27
            goto L_0x01fd
        L_0x0288:
            boolean r0 = XH.x.h(r4)
            java.lang.Boolean r0 = kotlin.coroutines.jvm.internal.b.a(r0)
            return r0
        L_0x0291:
            java.lang.Boolean r0 = kotlin.coroutines.jvm.internal.b.a(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Lz.b.b(java.lang.Object, dI.e):java.lang.Object");
    }
}
