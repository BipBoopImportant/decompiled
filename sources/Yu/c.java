package Yu;

import dI.C17164e;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17542s;
import tw.h;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0013\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J.\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\u0006H@¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\r¨\u0006\u000e"}, d2 = {"LYu/c;", "LYu/b;", "Ltw/h;", "networkService", "<init>", "(Ltw/h;)V", "", "retailCode", "languageCode", "version", "Lcom/ingka/ikea/killswitch/model/KillSwitchConfig;", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "Ltw/h;", "killswitch-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c implements b {

    /* renamed from: a  reason: collision with root package name */
    private final h f89770a;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.ingka.ikea.killswitch.impl.data.KillSwitchRemoteDataSourceImpl", f = "KillSwitchRemoteDataSourceImpl.kt", l = {38}, m = "getKillSwitchConfig")
    static final class a extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f89771c;

        /* renamed from: d  reason: collision with root package name */
        Object f89772d;

        /* renamed from: e  reason: collision with root package name */
        Object f89773e;

        /* renamed from: f  reason: collision with root package name */
        Object f89774f;

        /* renamed from: g  reason: collision with root package name */
        Object f89775g;

        /* renamed from: h  reason: collision with root package name */
        Object f89776h;

        /* renamed from: i  reason: collision with root package name */
        /* synthetic */ Object f89777i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ c f89778j;

        /* renamed from: k  reason: collision with root package name */
        int f89779k;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(c cVar, C17164e<? super a> eVar) {
            super(eVar);
            this.f89778j = cVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f89777i = obj;
            this.f89779k |= Integer.MIN_VALUE;
            return this.f89778j.a((String) null, (String) null, (String) null, this);
        }
    }

    public c(h hVar) {
        C17542s.j(hVar, "networkService");
        this.f89770a = hVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v3, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object a(java.lang.String r12, java.lang.String r13, java.lang.String r14, dI.C17164e<? super com.ingka.ikea.killswitch.model.KillSwitchConfig> r15) {
        /*
            r11 = this;
            boolean r0 = r15 instanceof Yu.c.a
            if (r0 == 0) goto L_0x0013
            r0 = r15
            Yu.c$a r0 = (Yu.c.a) r0
            int r1 = r0.f89779k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f89779k = r1
            goto L_0x0018
        L_0x0013:
            Yu.c$a r0 = new Yu.c$a
            r0.<init>(r11, r15)
        L_0x0018:
            java.lang.Object r1 = r0.f89777i
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f89779k
            r4 = 1
            if (r3 == 0) goto L_0x004b
            if (r3 != r4) goto L_0x0043
            java.lang.Object r12 = r0.f89776h
            java.lang.CharSequence r12 = (java.lang.CharSequence) r12
            java.lang.Object r12 = r0.f89775g
            dI.e r12 = (dI.C17164e) r12
            java.lang.Object r12 = r0.f89774f
            r14 = r12
            java.lang.String r14 = (java.lang.String) r14
            java.lang.Object r12 = r0.f89773e
            r13 = r12
            java.lang.String r13 = (java.lang.String) r13
            java.lang.Object r12 = r0.f89772d
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r15 = r0.f89771c
            Yu.c r15 = (Yu.c) r15
            XH.y.b(r1)
            goto L_0x007f
        L_0x0043:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L_0x004b:
            XH.y.b(r1)
            if (r12 == 0) goto L_0x0086
            boolean r1 = HJ.C15854t.v0(r12)
            if (r1 == 0) goto L_0x0057
            goto L_0x0086
        L_0x0057:
            if (r13 == 0) goto L_0x0086
            boolean r1 = HJ.C15854t.v0(r13)
            if (r1 == 0) goto L_0x0060
            goto L_0x0086
        L_0x0060:
            tw.h r1 = r11.f89770a
            java.lang.Class<Yu.a> r3 = Yu.a.class
            java.lang.Object r1 = r1.b(r3)
            Yu.a r1 = (Yu.a) r1
            r0.f89771c = r11
            r0.f89772d = r12
            r0.f89773e = r13
            r0.f89774f = r14
            r0.f89775g = r15
            r0.f89776h = r13
            r0.f89779k = r4
            java.lang.Object r1 = r1.a(r12, r13, r0)
            if (r1 != r2) goto L_0x007f
            return r2
        L_0x007f:
            com.ingka.ikea.killswitch.model.KillSwitchConfig$Remote r1 = (com.ingka.ikea.killswitch.model.KillSwitchConfig.Remote) r1
            com.ingka.ikea.killswitch.model.KillSwitchConfig r12 = r1.a(r12, r13, r14)
            return r12
        L_0x0086:
            qv.e r14 = qv.e.WARN
            qv.d r15 = qv.d.f102012a
            java.util.List r15 = r15.a()
            java.lang.Iterable r15 = (java.lang.Iterable) r15
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r15 = r15.iterator()
        L_0x0099:
            boolean r1 = r15.hasNext()
            if (r1 == 0) goto L_0x00b1
            java.lang.Object r1 = r15.next()
            r2 = r1
            qv.b r2 = (qv.C11819b) r2
            r3 = 0
            boolean r2 = r2.b(r14, r3)
            if (r2 == 0) goto L_0x0099
            r0.add(r1)
            goto L_0x0099
        L_0x00b1:
            java.util.Iterator r15 = r0.iterator()
            r0 = 0
            r1 = r0
            r2 = r1
        L_0x00b8:
            boolean r3 = r15.hasNext()
            if (r3 == 0) goto L_0x0148
            java.lang.Object r3 = r15.next()
            r5 = r3
            qv.b r5 = (qv.C11819b) r5
            r9 = 0
            if (r1 != 0) goto L_0x00f1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "Invalid market params, unable to fetch kill switch ("
            r1.append(r3)
            r1.append(r12)
            java.lang.String r3 = ", "
            r1.append(r3)
            r1.append(r13)
            java.lang.String r3 = ")"
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            java.lang.String r1 = qv.C11818a.a(r1, r9)
            if (r1 != 0) goto L_0x00ed
            goto L_0x0148
        L_0x00ed:
            java.lang.String r1 = qv.C11820c.a(r1)
        L_0x00f1:
            if (r2 != 0) goto L_0x013f
            java.lang.Class<Yu.c> r2 = Yu.c.class
            java.lang.String r2 = r2.getName()
            kotlin.jvm.internal.C17542s.g(r2)
            r3 = 36
            r6 = 2
            java.lang.String r3 = HJ.C15854t.s1(r2, r3, r0, r6, r0)
            r7 = 46
            java.lang.String r3 = HJ.C15854t.o1(r3, r7, r0, r6, r0)
            int r6 = r3.length()
            if (r6 != 0) goto L_0x0110
            goto L_0x0116
        L_0x0110:
            java.lang.String r2 = "Kt"
            java.lang.String r2 = HJ.C15854t.P0(r3, r2)
        L_0x0116:
            java.lang.Thread r3 = java.lang.Thread.currentThread()
            java.lang.String r3 = r3.getName()
            java.lang.String r6 = "main"
            boolean r3 = HJ.C15854t.b0(r3, r6, r4)
            if (r3 == 0) goto L_0x0129
            java.lang.String r3 = "m"
            goto L_0x012b
        L_0x0129:
            java.lang.String r3 = "b"
        L_0x012b:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r3)
            java.lang.String r3 = "|"
            r6.append(r3)
            r6.append(r2)
            java.lang.String r2 = r6.toString()
        L_0x013f:
            r8 = 0
            r6 = r14
            r7 = r2
            r10 = r1
            r5.a(r6, r7, r8, r9, r10)
            goto L_0x00b8
        L_0x0148:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Yu.c.a(java.lang.String, java.lang.String, java.lang.String, dI.e):java.lang.Object");
    }
}
