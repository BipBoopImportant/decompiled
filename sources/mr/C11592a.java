package mr;

import Jq.c;
import dI.C17164e;
import gp.C11343b;
import gp.C11346e;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H@¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u0010\u001a\u00020\r8\u0016X\u0004¢\u0006\f\n\u0004\b\t\u0010\u000e\u001a\u0004\b\u000b\u0010\u000f¨\u0006\u0011"}, d2 = {"Lmr/a;", "Lgp/b;", "LJq/c;", "repository", "<init>", "(LJq/c;)V", "", "param", "", "b", "(Ljava/lang/Object;LdI/e;)Ljava/lang/Object;", "a", "LJq/c;", "Lgp/e;", "Lgp/e;", "()Lgp/e;", "taskId", "familyrewards-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: mr.a  reason: case insensitive filesystem */
public final class C11592a implements C11343b {

    /* renamed from: a  reason: collision with root package name */
    private final c f99655a;

    /* renamed from: b  reason: collision with root package name */
    private final C11346e f99656b = C11346e.CLEAR_FAMILY_REWARDS_ON_LOGOUT;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.ingka.ikea.familyrewards.implementation.task.ClearFamilyRewardsOnLogoutTask", f = "ClearFamilyRewardsOnLogoutTask.kt", l = {23}, m = "execute")
    /* renamed from: mr.a$a  reason: collision with other inner class name */
    static final class C2295a extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f99657c;

        /* renamed from: d  reason: collision with root package name */
        Object f99658d;

        /* renamed from: e  reason: collision with root package name */
        Object f99659e;

        /* renamed from: f  reason: collision with root package name */
        Object f99660f;

        /* renamed from: g  reason: collision with root package name */
        Object f99661g;

        /* renamed from: h  reason: collision with root package name */
        Object f99662h;

        /* renamed from: i  reason: collision with root package name */
        Object f99663i;

        /* renamed from: j  reason: collision with root package name */
        Object f99664j;

        /* renamed from: k  reason: collision with root package name */
        Object f99665k;

        /* renamed from: l  reason: collision with root package name */
        Object f99666l;

        /* renamed from: m  reason: collision with root package name */
        Object f99667m;

        /* renamed from: n  reason: collision with root package name */
        int f99668n;

        /* renamed from: o  reason: collision with root package name */
        int f99669o;

        /* renamed from: p  reason: collision with root package name */
        int f99670p;

        /* renamed from: q  reason: collision with root package name */
        int f99671q;

        /* renamed from: r  reason: collision with root package name */
        int f99672r;

        /* renamed from: s  reason: collision with root package name */
        /* synthetic */ Object f99673s;

        /* renamed from: t  reason: collision with root package name */
        final /* synthetic */ C11592a f99674t;

        /* renamed from: u  reason: collision with root package name */
        int f99675u;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2295a(C11592a aVar, C17164e<? super C2295a> eVar) {
            super(eVar);
            this.f99674t = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f99673s = obj;
            this.f99675u |= Integer.MIN_VALUE;
            return this.f99674t.b((Object) null, this);
        }
    }

    public C11592a(c cVar) {
        C17542s.j(cVar, "repository");
        this.f99655a = cVar;
    }

    public C11346e a() {
        return this.f99656b;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v0, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v1, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v2, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: qv.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v6, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v7, resolved type: java.util.ArrayList} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object b(java.lang.Object r20, dI.C17164e<? super java.lang.Boolean> r21) {
        /*
            r19 = this;
            r0 = r19
            r1 = r21
            boolean r2 = r1 instanceof mr.C11592a.C2295a
            if (r2 == 0) goto L_0x0017
            r2 = r1
            mr.a$a r2 = (mr.C11592a.C2295a) r2
            int r3 = r2.f99675u
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.f99675u = r3
            goto L_0x001c
        L_0x0017:
            mr.a$a r2 = new mr.a$a
            r2.<init>(r0, r1)
        L_0x001c:
            java.lang.Object r3 = r2.f99673s
            java.lang.Object r4 = eI.C17187b.f()
            int r5 = r2.f99675u
            r6 = 1
            if (r5 == 0) goto L_0x005a
            if (r5 != r6) goto L_0x0052
            java.lang.Object r1 = r2.f99666l
            java.util.Iterator r1 = (java.util.Iterator) r1
            java.lang.Object r1 = r2.f99665k
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.lang.Object r1 = r2.f99664j
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r2.f99663i
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r2.f99662h
            qv.e r1 = (qv.e) r1
            java.lang.Object r1 = r2.f99661g
            mr.a r1 = (mr.C11592a) r1
            java.lang.Object r1 = r2.f99660f
            mr.a r1 = (mr.C11592a) r1
            java.lang.Object r1 = r2.f99659e
            dI.e r1 = (dI.C17164e) r1
            java.lang.Object r1 = r2.f99657c
            mr.a r1 = (mr.C11592a) r1
            XH.y.b(r3)
            goto L_0x0141
        L_0x0052:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x005a:
            XH.y.b(r3)
            qv.e r3 = qv.e.DEBUG
            qv.d r5 = qv.d.f102012a
            java.util.List r5 = r5.a()
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            java.util.Iterator r5 = r5.iterator()
        L_0x0070:
            boolean r7 = r5.hasNext()
            r14 = 0
            if (r7 == 0) goto L_0x0088
            java.lang.Object r7 = r5.next()
            r8 = r7
            qv.b r8 = (qv.C11819b) r8
            boolean r8 = r8.b(r3, r14)
            if (r8 == 0) goto L_0x0070
            r13.add(r7)
            goto L_0x0070
        L_0x0088:
            java.util.Iterator r5 = r13.iterator()
            r15 = 0
            r9 = r13
            r7 = r15
            r8 = r7
        L_0x0090:
            boolean r10 = r5.hasNext()
            if (r10 == 0) goto L_0x0114
            java.lang.Object r16 = r5.next()
            r9 = r16
            qv.b r9 = (qv.C11819b) r9
            r11 = 0
            if (r7 != 0) goto L_0x00b0
            java.lang.String r10 = "Clearing rewards repository"
            java.lang.String r10 = qv.C11818a.a(r10, r11)
            if (r10 != 0) goto L_0x00ac
            r9 = r16
            goto L_0x0114
        L_0x00ac:
            java.lang.String r7 = qv.C11820c.a(r10)
        L_0x00b0:
            r17 = r7
            if (r8 != 0) goto L_0x0100
            java.lang.Class<mr.a> r7 = mr.C11592a.class
            java.lang.String r7 = r7.getName()
            kotlin.jvm.internal.C17542s.g(r7)
            r8 = 36
            r10 = 2
            java.lang.String r8 = HJ.C15854t.s1(r7, r8, r15, r10, r15)
            r12 = 46
            java.lang.String r8 = HJ.C15854t.o1(r8, r12, r15, r10, r15)
            int r10 = r8.length()
            if (r10 != 0) goto L_0x00d1
            goto L_0x00d7
        L_0x00d1:
            java.lang.String r7 = "Kt"
            java.lang.String r7 = HJ.C15854t.P0(r8, r7)
        L_0x00d7:
            java.lang.Thread r8 = java.lang.Thread.currentThread()
            java.lang.String r8 = r8.getName()
            java.lang.String r10 = "main"
            boolean r8 = HJ.C15854t.b0(r8, r10, r6)
            if (r8 == 0) goto L_0x00ea
            java.lang.String r8 = "m"
            goto L_0x00ec
        L_0x00ea:
            java.lang.String r8 = "b"
        L_0x00ec:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r8)
            java.lang.String r8 = "|"
            r10.append(r8)
            r10.append(r7)
            java.lang.String r8 = r10.toString()
        L_0x0100:
            r18 = r8
            r10 = 0
            r7 = r9
            r8 = r3
            r9 = r18
            r12 = r17
            r7.a(r8, r9, r10, r11, r12)
            r9 = r16
            r7 = r17
            r8 = r18
            goto L_0x0090
        L_0x0114:
            Jq.c r10 = r0.f99655a
            r2.f99657c = r0
            r11 = r20
            r2.f99658d = r11
            r2.f99659e = r1
            r2.f99660f = r0
            r2.f99661g = r0
            r2.f99662h = r3
            r2.f99663i = r7
            r2.f99664j = r8
            r2.f99665k = r13
            r2.f99666l = r5
            r2.f99667m = r9
            r2.f99668n = r14
            r2.f99669o = r14
            r2.f99670p = r14
            r2.f99671q = r14
            r2.f99672r = r14
            r2.f99675u = r6
            java.lang.Object r1 = r10.a(r2)
            if (r1 != r4) goto L_0x0141
            return r4
        L_0x0141:
            java.lang.Boolean r1 = kotlin.coroutines.jvm.internal.b.a(r6)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: mr.C11592a.b(java.lang.Object, dI.e):java.lang.Object");
    }
}
