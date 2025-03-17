package Sk;

import dI.C17164e;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.jvm.internal.C17542s;
import sf.C10242c;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nH@¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\nHB¢\u0006\u0004\b\r\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0011¨\u0006\u0012"}, d2 = {"LSk/f;", "LSk/e;", "Lsf/c;", "appUserDataRepository", "LPk/a;", "getValidMarketConfigUseCase", "LSk/c;", "isKillSwitchValidUseCase", "<init>", "(Lsf/c;LPk/a;LSk/c;)V", "", "c", "(LdI/e;)Ljava/lang/Object;", "a", "Lsf/c;", "b", "LPk/a;", "LSk/c;", "splash_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class f implements e {

    /* renamed from: a  reason: collision with root package name */
    private final C10242c f87200a;

    /* renamed from: b  reason: collision with root package name */
    private final Pk.a f87201b;

    /* renamed from: c  reason: collision with root package name */
    private final c f87202c;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.splash.viewmodel.splash.usecase.IsRegionSelectedUseCaseImpl", f = "IsRegionSelectedUseCase.kt", l = {28, 29}, m = "isRegionSelected")
    static final class a extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f87203c;

        /* renamed from: d  reason: collision with root package name */
        Object f87204d;

        /* renamed from: e  reason: collision with root package name */
        Object f87205e;

        /* renamed from: f  reason: collision with root package name */
        Object f87206f;

        /* renamed from: g  reason: collision with root package name */
        Object f87207g;

        /* renamed from: h  reason: collision with root package name */
        /* synthetic */ Object f87208h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ f f87209i;

        /* renamed from: j  reason: collision with root package name */
        int f87210j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(f fVar, C17164e<? super a> eVar) {
            super(eVar);
            this.f87209i = fVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f87208h = obj;
            this.f87210j |= Integer.MIN_VALUE;
            return this.f87209i.c(this);
        }
    }

    public f(C10242c cVar, Pk.a aVar, c cVar2) {
        C17542s.j(cVar, "appUserDataRepository");
        C17542s.j(aVar, "getValidMarketConfigUseCase");
        C17542s.j(cVar2, "isKillSwitchValidUseCase");
        this.f87200a = cVar;
        this.f87201b = aVar;
        this.f87202c = cVar2;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00ca, code lost:
        if (r11.f87200a.v() != false) goto L_0x00ce;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object c(dI.C17164e<? super java.lang.Boolean> r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof Sk.f.a
            if (r0 == 0) goto L_0x0013
            r0 = r11
            Sk.f$a r0 = (Sk.f.a) r0
            int r1 = r0.f87210j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f87210j = r1
            goto L_0x0018
        L_0x0013:
            Sk.f$a r0 = new Sk.f$a
            r0.<init>(r10, r11)
        L_0x0018:
            java.lang.Object r1 = r0.f87208h
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f87210j
            r4 = 2
            r5 = 1
            if (r3 == 0) goto L_0x0066
            if (r3 == r5) goto L_0x0049
            if (r3 != r4) goto L_0x0041
            java.lang.Object r11 = r0.f87207g
            java.lang.CharSequence r11 = (java.lang.CharSequence) r11
            java.lang.Object r11 = r0.f87206f
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r11 = r0.f87205e
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r11 = r0.f87204d
            dI.e r11 = (dI.C17164e) r11
            java.lang.Object r11 = r0.f87203c
            Sk.f r11 = (Sk.f) r11
            XH.y.b(r1)
            goto L_0x00bc
        L_0x0041:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L_0x0049:
            java.lang.Object r11 = r0.f87207g
            java.lang.CharSequence r11 = (java.lang.CharSequence) r11
            java.lang.Object r3 = r0.f87206f
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r6 = r0.f87205e
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r7 = r0.f87204d
            dI.e r7 = (dI.C17164e) r7
            java.lang.Object r8 = r0.f87203c
            Sk.f r8 = (Sk.f) r8
            XH.y.b(r1)
            r9 = r1
            r1 = r11
            r11 = r8
            r8 = r6
            r6 = r9
            goto L_0x009f
        L_0x0066:
            XH.y.b(r1)
            sf.c r1 = r10.f87200a
            java.lang.String r1 = r1.a()
            sf.c r3 = r10.f87200a
            java.lang.String r3 = r3.c()
            if (r3 == 0) goto L_0x00cd
            boolean r6 = HJ.C15854t.v0(r3)
            if (r6 == 0) goto L_0x007e
            goto L_0x00cd
        L_0x007e:
            if (r1 == 0) goto L_0x00cd
            boolean r6 = HJ.C15854t.v0(r1)
            if (r6 == 0) goto L_0x0087
            goto L_0x00cd
        L_0x0087:
            Pk.a r6 = r10.f87201b
            r0.f87203c = r10
            r0.f87204d = r11
            r0.f87205e = r1
            r0.f87206f = r3
            r0.f87207g = r1
            r0.f87210j = r5
            java.lang.Object r6 = r6.a(r0)
            if (r6 != r2) goto L_0x009c
            return r2
        L_0x009c:
            r7 = r11
            r8 = r1
            r11 = r10
        L_0x009f:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L_0x00cd
            Sk.c r6 = r11.f87202c
            r0.f87203c = r11
            r0.f87204d = r7
            r0.f87205e = r8
            r0.f87206f = r3
            r0.f87207g = r1
            r0.f87210j = r4
            java.lang.Object r1 = r6.a(r0)
            if (r1 != r2) goto L_0x00bc
            return r2
        L_0x00bc:
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r0 = r1.booleanValue()
            if (r0 == 0) goto L_0x00cd
            sf.c r11 = r11.f87200a
            boolean r11 = r11.v()
            if (r11 == 0) goto L_0x00cd
            goto L_0x00ce
        L_0x00cd:
            r5 = 0
        L_0x00ce:
            java.lang.Boolean r11 = kotlin.coroutines.jvm.internal.b.a(r5)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: Sk.f.c(dI.e):java.lang.Object");
    }

    public Object a(C17164e<? super Boolean> eVar) {
        return c(eVar);
    }
}
