package xF;

import QJ.F0;
import QJ.Q;
import QJ.T;
import SJ.C16428d;
import TJ.C16504A;
import TJ.C16505B;
import TJ.C16511H;
import TJ.C16519P;
import TJ.C16521S;
import TJ.C16534i;
import XH.C16807N;
import XH.C16824o;
import XH.C16825p;
import YH.X;
import androidx.lifecycle.C5210m;
import androidx.lifecycle.F;
import androidx.lifecycle.U;
import androidx.lifecycle.f0;
import androidx.lifecycle.g0;
import com.sugarcube.app.base.data.source.CompositionRepository;
import com.sugarcube.app.base.navigation.Kreativ;
import com.sugarcube.app.base.ui.gallery.share.CloneDesignUseCase;
import com.sugarcube.core.network.models.Composition;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.b;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.P;
import nI.p;
import x4.O;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH@¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001b\u0010\u001c\u001a\u00020\u00178FX\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u001d8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020\r0\"8\u0002X\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u001d\u0010+\u001a\b\u0012\u0004\u0012\u00020\r0&8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u001d\u00101\u001a\b\u0012\u0004\u0012\u00020\u001e0,8\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100¨\u00062"}, d2 = {"LxF/J0;", "Landroidx/lifecycle/f0;", "Lcom/sugarcube/app/base/data/source/CompositionRepository;", "compositionRepository", "Lcom/sugarcube/app/base/ui/gallery/share/CloneDesignUseCase;", "cloneDesignUseCase", "Landroidx/lifecycle/U;", "savedStateHandle", "<init>", "(Lcom/sugarcube/app/base/data/source/CompositionRepository;Lcom/sugarcube/app/base/ui/gallery/share/CloneDesignUseCase;Landroidx/lifecycle/U;)V", "LXH/N;", "D", "()V", "", "isBlocking", "H", "(ZLdI/e;)Ljava/lang/Object;", "m", "Lcom/sugarcube/app/base/data/source/CompositionRepository;", "n", "Lcom/sugarcube/app/base/ui/gallery/share/CloneDesignUseCase;", "o", "Landroidx/lifecycle/U;", "Lcom/sugarcube/app/base/navigation/Kreativ$Gallery$OverflowSheet;", "p", "LXH/o;", "E", "()Lcom/sugarcube/app/base/navigation/Kreativ$Gallery$OverflowSheet;", "args", "LTJ/A;", "Lcom/sugarcube/core/network/models/Composition;", "q", "LTJ/A;", "_composition", "LTJ/B;", "r", "LTJ/B;", "_deleteInProgress", "LTJ/P;", "s", "LTJ/P;", "G", "()LTJ/P;", "deleteInProgress", "Landroidx/lifecycle/F;", "t", "Landroidx/lifecycle/F;", "F", "()Landroidx/lifecycle/F;", "composition", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class J0 extends f0 {
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public final CompositionRepository f131949m;
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public final CloneDesignUseCase f131950n;

    /* renamed from: o  reason: collision with root package name */
    private final U f131951o;

    /* renamed from: p  reason: collision with root package name */
    private final C16824o f131952p = C16825p.b(new I0(this));
    /* access modifiers changed from: private */

    /* renamed from: q  reason: collision with root package name */
    public final C16504A<Composition> f131953q;

    /* renamed from: r  reason: collision with root package name */
    private final C16505B<Boolean> f131954r;

    /* renamed from: s  reason: collision with root package name */
    private final C16519P<Boolean> f131955s;

    /* renamed from: t  reason: collision with root package name */
    private final F<Composition> f131956t;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.sugarcube.app.base.ui.gallery.GalleryOverflowSheetViewModel$fetchComposition$1", f = "GalleryOverflowSheetViewModel.kt", l = {47, 49, 57, 59}, m = "invokeSuspend")
    static final class a extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f131957c;

        /* renamed from: d  reason: collision with root package name */
        Object f131958d;

        /* renamed from: e  reason: collision with root package name */
        Object f131959e;

        /* renamed from: f  reason: collision with root package name */
        Object f131960f;

        /* renamed from: g  reason: collision with root package name */
        Object f131961g;

        /* renamed from: h  reason: collision with root package name */
        Object f131962h;

        /* renamed from: i  reason: collision with root package name */
        Object f131963i;

        /* renamed from: j  reason: collision with root package name */
        int f131964j;

        /* renamed from: k  reason: collision with root package name */
        int f131965k;

        /* renamed from: l  reason: collision with root package name */
        int f131966l;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ J0 f131967m;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(J0 j02, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f131967m = j02;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new a(this.f131967m, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:32:0x00f8  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                r10 = this;
                java.lang.Object r0 = eI.C17187b.f()
                int r1 = r10.f131966l
                r2 = 4
                r3 = 3
                r4 = 2
                r5 = 1
                r6 = 0
                if (r1 == 0) goto L_0x0078
                if (r1 == r5) goto L_0x0062
                if (r1 == r4) goto L_0x0041
                if (r1 == r3) goto L_0x002a
                if (r1 != r2) goto L_0x0022
                java.lang.Object r0 = r10.f131963i
                com.sugarcube.core.network.models.CompiledComposition r0 = (com.sugarcube.core.network.models.CompiledComposition) r0
                java.lang.Object r0 = r10.f131962h
                com.sugarcube.core.network.models.CompiledComposition r0 = (com.sugarcube.core.network.models.CompiledComposition) r0
                java.lang.Object r0 = r10.f131961g
                com.sugarcube.core.network.models.CompiledComposition r0 = (com.sugarcube.core.network.models.CompiledComposition) r0
                goto L_0x004d
            L_0x0022:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L_0x002a:
                int r1 = r10.f131964j
                java.lang.Object r3 = r10.f131960f
                java.util.UUID r3 = (java.util.UUID) r3
                java.lang.Object r4 = r10.f131959e
                xF.J0 r4 = (xF.J0) r4
                java.lang.Object r5 = r10.f131958d
                java.util.UUID r5 = (java.util.UUID) r5
                java.lang.Object r7 = r10.f131957c
                java.util.UUID r7 = (java.util.UUID) r7
                XH.y.b(r11)
                goto L_0x00f4
            L_0x0041:
                java.lang.Object r0 = r10.f131963i
                com.sugarcube.core.network.models.Composition r0 = (com.sugarcube.core.network.models.Composition) r0
                java.lang.Object r0 = r10.f131962h
                com.sugarcube.core.network.models.Composition r0 = (com.sugarcube.core.network.models.Composition) r0
                java.lang.Object r0 = r10.f131961g
                com.sugarcube.core.network.models.Composition r0 = (com.sugarcube.core.network.models.Composition) r0
            L_0x004d:
                java.lang.Object r0 = r10.f131960f
                java.util.UUID r0 = (java.util.UUID) r0
                java.lang.Object r0 = r10.f131959e
                xF.J0 r0 = (xF.J0) r0
                java.lang.Object r0 = r10.f131958d
                java.util.UUID r0 = (java.util.UUID) r0
                java.lang.Object r0 = r10.f131957c
                java.util.UUID r0 = (java.util.UUID) r0
                XH.y.b(r11)
                goto L_0x011b
            L_0x0062:
                int r1 = r10.f131964j
                java.lang.Object r2 = r10.f131960f
                java.util.UUID r2 = (java.util.UUID) r2
                java.lang.Object r3 = r10.f131959e
                xF.J0 r3 = (xF.J0) r3
                java.lang.Object r5 = r10.f131958d
                java.util.UUID r5 = (java.util.UUID) r5
                java.lang.Object r7 = r10.f131957c
                java.util.UUID r7 = (java.util.UUID) r7
                XH.y.b(r11)
                goto L_0x00b4
            L_0x0078:
                XH.y.b(r11)
                xF.J0 r11 = r10.f131967m
                com.sugarcube.app.base.navigation.Kreativ$Gallery$OverflowSheet r11 = r11.E()
                java.lang.String r11 = r11.a()
                java.util.UUID r11 = cF.C14046h.e(r11)
                if (r11 == 0) goto L_0x011b
                xF.J0 r1 = r10.f131967m
                com.sugarcube.app.base.navigation.Kreativ$Gallery$OverflowSheet r7 = r1.E()
                boolean r7 = r7.b()
                if (r7 == 0) goto L_0x00d7
                com.sugarcube.app.base.ui.gallery.share.CloneDesignUseCase r2 = r1.f131950n
                r10.f131957c = r11
                r10.f131958d = r11
                r10.f131959e = r1
                r10.f131960f = r11
                r10.f131964j = r6
                r10.f131966l = r5
                java.lang.Object r2 = r2.invoke(r11, r10)
                if (r2 != r0) goto L_0x00ae
                return r0
            L_0x00ae:
                r5 = r11
                r7 = r5
                r3 = r1
                r1 = r6
                r11 = r2
                r2 = r7
            L_0x00b4:
                com.sugarcube.core.network.models.Composition r11 = (com.sugarcube.core.network.models.Composition) r11
                if (r11 == 0) goto L_0x011b
                TJ.A r8 = r3.f131953q
                r10.f131957c = r7
                r10.f131958d = r5
                r10.f131959e = r3
                r10.f131960f = r2
                r10.f131961g = r11
                r10.f131962h = r11
                r10.f131963i = r11
                r10.f131964j = r1
                r10.f131965k = r6
                r10.f131966l = r4
                java.lang.Object r11 = r8.emit(r11, r10)
                if (r11 != r0) goto L_0x011b
                return r0
            L_0x00d7:
                com.sugarcube.app.base.data.source.CompositionRepository r4 = r1.f131949m
                r10.f131957c = r11
                r10.f131958d = r11
                r10.f131959e = r1
                r10.f131960f = r11
                r10.f131964j = r6
                r10.f131966l = r3
                java.lang.Object r3 = r4.fetchCompiledComposition(r11, r10)
                if (r3 != r0) goto L_0x00ee
                return r0
            L_0x00ee:
                r5 = r11
                r7 = r5
                r4 = r1
                r1 = r6
                r11 = r3
                r3 = r7
            L_0x00f4:
                com.sugarcube.core.network.models.CompiledComposition r11 = (com.sugarcube.core.network.models.CompiledComposition) r11
                if (r11 == 0) goto L_0x011b
                TJ.A r8 = r4.f131953q
                com.sugarcube.core.network.models.Composition r9 = r11.getComposition()
                r10.f131957c = r7
                r10.f131958d = r5
                r10.f131959e = r4
                r10.f131960f = r3
                r10.f131961g = r11
                r10.f131962h = r11
                r10.f131963i = r11
                r10.f131964j = r1
                r10.f131965k = r6
                r10.f131966l = r2
                java.lang.Object r11 = r8.emit(r9, r10)
                if (r11 != r0) goto L_0x011b
                return r0
            L_0x011b:
                XH.N r11 = XH.C16807N.f139792a
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: xF.J0.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public J0(CompositionRepository compositionRepository, CloneDesignUseCase cloneDesignUseCase, U u10) {
        C17542s.j(compositionRepository, "compositionRepository");
        C17542s.j(cloneDesignUseCase, "cloneDesignUseCase");
        C17542s.j(u10, "savedStateHandle");
        this.f131949m = compositionRepository;
        this.f131950n = cloneDesignUseCase;
        this.f131951o = u10;
        C16504A<Composition> b10 = C16511H.b(0, 0, (C16428d) null, 7, (Object) null);
        this.f131953q = b10;
        C16505B<Boolean> a10 = C16521S.a(Boolean.FALSE);
        this.f131954r = a10;
        this.f131955s = a10;
        this.f131956t = C5210m.c(C16534i.A(b10), g0.a(this).getCoroutineContext(), 0, 2, (Object) null);
    }

    /* access modifiers changed from: private */
    public static final Kreativ.Gallery.OverflowSheet C(J0 j02) {
        return (Kreativ.Gallery.OverflowSheet) O.a(j02.f131951o, P.b(Kreativ.Gallery.OverflowSheet.class), X.j());
    }

    public final void D() {
        F0 unused = C16314k.d(g0.a(this), (C17168i) null, (T) null, new a(this, (C17164e<? super a>) null), 3, (Object) null);
    }

    public final Kreativ.Gallery.OverflowSheet E() {
        return (Kreativ.Gallery.OverflowSheet) this.f131952p.getValue();
    }

    public final F<Composition> F() {
        return this.f131956t;
    }

    public final C16519P<Boolean> G() {
        return this.f131955s;
    }

    public final Object H(boolean z10, C17164e<? super C16807N> eVar) {
        Object emit = this.f131954r.emit(b.a(z10), eVar);
        return emit == C17187b.f() ? emit : C16807N.f139792a;
    }
}
