package androidx.compose.ui.platform;

import G1.m0;
import U0.C4910x;
import U0.I0;
import dI.C17164e;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17544u;
import nI.C17631a;
import nI.p;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a8\u0010\u0007\u001a\u00020\u0004*\u00020\u00002\"\u0010\u0006\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0001H@¢\u0006\u0004\b\u0007\u0010\b\u001aB\u0010\r\u001a\u00020\u0004*\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\"\u0010\f\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0001H@¢\u0006\u0004\b\r\u0010\u000e\"\u001c\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u000f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Landroidx/compose/ui/platform/I0;", "Lkotlin/Function2;", "Landroidx/compose/ui/platform/L0;", "LdI/e;", "", "", "block", "b", "(Landroidx/compose/ui/platform/I0;LnI/p;LdI/e;)Ljava/lang/Object;", "LG1/m0;", "Landroidx/compose/ui/platform/c0;", "chainedInterceptor", "session", "c", "(LG1/m0;Landroidx/compose/ui/platform/c0;LnI/p;LdI/e;)Ljava/lang/Object;", "LU0/I0;", "a", "LU0/I0;", "LocalChainedPlatformTextInputInterceptor", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class J0 {

    /* renamed from: a  reason: collision with root package name */
    private static final I0<C5091c0> f19262a = C4910x.f(a.f19263c);

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/platform/c0;", "b", "()Landroidx/compose/ui/platform/c0;"}, k = 3, mv = {1, 8, 0})
    static final class a extends C17544u implements C17631a<C5091c0> {

        /* renamed from: c  reason: collision with root package name */
        public static final a f19263c = new a();

        a() {
            super(0);
        }

        /* renamed from: b */
        public final C5091c0 invoke() {
            return null;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @f(c = "androidx.compose.ui.platform.PlatformTextInputModifierNodeKt", f = "PlatformTextInputModifierNode.kt", l = {143}, m = "establishTextInputSession")
    static final class b extends d {

        /* renamed from: c  reason: collision with root package name */
        /* synthetic */ Object f19264c;

        /* renamed from: d  reason: collision with root package name */
        int f19265d;

        b(C17164e<? super b> eVar) {
            super(eVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.f19264c = obj;
            this.f19265d |= Integer.MIN_VALUE;
            return J0.b((I0) null, (p<? super L0, ? super C17164e<?>, ? extends Object>) null, this);
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @f(c = "androidx.compose.ui.platform.PlatformTextInputModifierNodeKt", f = "PlatformTextInputModifierNode.kt", l = {194, 196}, m = "interceptedTextInputSession")
    static final class c extends d {

        /* renamed from: c  reason: collision with root package name */
        /* synthetic */ Object f19266c;

        /* renamed from: d  reason: collision with root package name */
        int f19267d;

        c(C17164e<? super c> eVar) {
            super(eVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.f19266c = obj;
            this.f19267d |= Integer.MIN_VALUE;
            return J0.c((m0) null, (C5091c0) null, (p<? super L0, ? super C17164e<?>, ? extends Object>) null, this);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object b(androidx.compose.ui.platform.I0 r4, nI.p<? super androidx.compose.ui.platform.L0, ? super dI.C17164e<?>, ? extends java.lang.Object> r5, dI.C17164e<?> r6) {
        /*
            boolean r0 = r6 instanceof androidx.compose.ui.platform.J0.b
            if (r0 == 0) goto L_0x0013
            r0 = r6
            androidx.compose.ui.platform.J0$b r0 = (androidx.compose.ui.platform.J0.b) r0
            int r1 = r0.f19265d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f19265d = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.ui.platform.J0$b r0 = new androidx.compose.ui.platform.J0$b
            r0.<init>(r6)
        L_0x0018:
            java.lang.Object r6 = r0.f19264c
            java.lang.Object r1 = eI.C17187b.f()
            int r2 = r0.f19265d
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 == r3) goto L_0x002d
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x002d:
            XH.y.b(r6)
            goto L_0x005b
        L_0x0031:
            XH.y.b(r6)
            androidx.compose.ui.d$c r6 = r4.E0()
            boolean r6 = r6.j2()
            if (r6 == 0) goto L_0x0061
            G1.m0 r6 = G1.C4508k.n(r4)
            G1.G r4 = G1.C4508k.m(r4)
            U0.y r4 = r4.M()
            U0.I0<androidx.compose.ui.platform.c0> r2 = f19262a
            java.lang.Object r4 = r4.b(r2)
            androidx.compose.ui.platform.c0 r4 = (androidx.compose.ui.platform.C5091c0) r4
            r0.f19265d = r3
            java.lang.Object r4 = c(r6, r4, r5, r0)
            if (r4 != r1) goto L_0x005b
            return r1
        L_0x005b:
            XH.k r4 = new XH.k
            r4.<init>()
            throw r4
        L_0x0061:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "establishTextInputSession called from an unattached node"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.J0.b(androidx.compose.ui.platform.I0, nI.p, dI.e):java.lang.Object");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object c(G1.m0 r5, androidx.compose.ui.platform.C5091c0 r6, nI.p<? super androidx.compose.ui.platform.L0, ? super dI.C17164e<?>, ? extends java.lang.Object> r7, dI.C17164e<?> r8) {
        /*
            boolean r0 = r8 instanceof androidx.compose.ui.platform.J0.c
            if (r0 == 0) goto L_0x0013
            r0 = r8
            androidx.compose.ui.platform.J0$c r0 = (androidx.compose.ui.platform.J0.c) r0
            int r1 = r0.f19267d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f19267d = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.ui.platform.J0$c r0 = new androidx.compose.ui.platform.J0$c
            r0.<init>(r8)
        L_0x0018:
            java.lang.Object r8 = r0.f19266c
            java.lang.Object r1 = eI.C17187b.f()
            int r2 = r0.f19267d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0038
            if (r2 == r4) goto L_0x0034
            if (r2 == r3) goto L_0x0030
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0030:
            XH.y.b(r8)
            goto L_0x0055
        L_0x0034:
            XH.y.b(r8)
            goto L_0x0046
        L_0x0038:
            XH.y.b(r8)
            if (r6 != 0) goto L_0x004c
            r0.f19267d = r4
            java.lang.Object r5 = r5.q(r7, r0)
            if (r5 != r1) goto L_0x0046
            return r1
        L_0x0046:
            XH.k r5 = new XH.k
            r5.<init>()
            throw r5
        L_0x004c:
            r0.f19267d = r3
            java.lang.Object r5 = r6.c(r5, r7, r0)
            if (r5 != r1) goto L_0x0055
            return r1
        L_0x0055:
            XH.k r5 = new XH.k
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.J0.c(G1.m0, androidx.compose.ui.platform.c0, nI.p, dI.e):java.lang.Object");
    }
}
