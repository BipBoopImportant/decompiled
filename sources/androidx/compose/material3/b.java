package androidx.compose.material3;

import I2.C4626o0;
import I2.b1;
import O0.C4727f0;
import O0.C4750r0;
import P4.g;
import QJ.Q;
import U0.C4889m;
import XH.C16807N;
import android.graphics.Outline;
import android.os.Build;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.Window;
import androidx.activity.r;
import androidx.activity.v;
import androidx.activity.y;
import androidx.compose.ui.platform.z1;
import androidx.lifecycle.l0;
import androidx.lifecycle.m0;
import c2.d;
import c2.h;
import c2.t;
import i1.i;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m0.C5530a;
import m0.C5554m;
import nI.C17631a;
import nI.C17642l;
import nI.p;

@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002Ba\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u0010\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ#\u0010#\u001a\u00020\u00042\u0006\u0010!\u001a\u00020 2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b#\u0010$J+\u0010%\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b%\u0010&J\r\u0010'\u001a\u00020\u0004¢\u0006\u0004\b'\u0010(J\u0017\u0010+\u001a\u00020\u00162\u0006\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\u0004H\u0016¢\u0006\u0004\b-\u0010(R\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u00106\u001a\u0002048\u0002X\u0004¢\u0006\u0006\n\u0004\b'\u00105R\u001a\u00109\u001a\u0002078\u0002X\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b#\u00108\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006:"}, d2 = {"Landroidx/compose/material3/b;", "Landroidx/activity/r;", "Landroidx/compose/ui/platform/z1;", "Lkotlin/Function0;", "LXH/N;", "onDismissRequest", "LO0/f0;", "properties", "Landroid/view/View;", "composeView", "Lc2/t;", "layoutDirection", "Lc2/d;", "density", "Ljava/util/UUID;", "dialogId", "Lm0/a;", "", "Lm0/m;", "predictiveBackProgress", "LQJ/Q;", "scope", "", "darkThemeEnabled", "<init>", "(LnI/a;LO0/f0;Landroid/view/View;Lc2/t;Lc2/d;Ljava/util/UUID;Lm0/a;LQJ/Q;Z)V", "i", "(Lc2/t;)V", "Landroidx/compose/ui/window/r;", "securePolicy", "j", "(Landroidx/compose/ui/window/r;)V", "LU0/r;", "parentComposition", "children", "h", "(LU0/r;LnI/p;)V", "k", "(LnI/a;LO0/f0;Lc2/t;)V", "g", "()V", "Landroid/view/MotionEvent;", "event", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "cancel", "d", "LnI/a;", "e", "LO0/f0;", "f", "Landroid/view/View;", "Landroidx/compose/material3/ModalBottomSheetDialogLayout;", "Landroidx/compose/material3/ModalBottomSheetDialogLayout;", "dialogLayout", "Lc2/h;", "F", "maxSupportedElevation", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class b extends r implements z1 {
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public C17631a<C16807N> f18667d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public C4727f0 f18668e;

    /* renamed from: f  reason: collision with root package name */
    private final View f18669f;

    /* renamed from: g  reason: collision with root package name */
    private final ModalBottomSheetDialogLayout f18670g;

    /* renamed from: h  reason: collision with root package name */
    private final float f18671h;

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"androidx/compose/material3/b$a", "Landroid/view/ViewOutlineProvider;", "Landroid/view/View;", "view", "Landroid/graphics/Outline;", "result", "LXH/N;", "getOutline", "(Landroid/view/View;Landroid/graphics/Outline;)V", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a extends ViewOutlineProvider {
        a() {
        }

        public void getOutline(View view, Outline outline) {
            outline.setRect(0, 0, view.getWidth(), view.getHeight());
            outline.setAlpha(0.0f);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/activity/v;", "LXH/N;", "a", "(Landroidx/activity/v;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.material3.b$b  reason: collision with other inner class name */
    static final class C0282b extends C17544u implements C17642l<v, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ b f18672c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0282b(b bVar) {
            super(1);
            this.f18672c = bVar;
        }

        public final void a(v vVar) {
            if (this.f18672c.f18668e.b()) {
                this.f18672c.f18667d.invoke();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((v) obj);
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class c {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f18673a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                c2.t[] r0 = c2.t.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                c2.t r1 = c2.t.Ltr     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                c2.t r1 = c2.t.Rtl     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                f18673a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.b.c.<clinit>():void");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(C17631a<C16807N> aVar, C4727f0 f0Var, View view, t tVar, d dVar, UUID uuid, C5530a<Float, C5554m> aVar2, Q q10, boolean z10) {
        super(new ContextThemeWrapper(view.getContext(), C4750r0.f11466a), 0, 2, (DefaultConstructorMarker) null);
        this.f18667d = aVar;
        this.f18668e = f0Var;
        this.f18669f = view;
        float B10 = h.B((float) 8);
        this.f18671h = B10;
        Window window = getWindow();
        if (window != null) {
            window.requestFeature(1);
            window.setBackgroundDrawableResource(17170445);
            C4626o0.b(window, false);
            ModalBottomSheetDialogLayout modalBottomSheetDialogLayout = new ModalBottomSheetDialogLayout(getContext(), window, this.f18668e.b(), this.f18667d, aVar2, q10);
            int i10 = i.f24336H;
            modalBottomSheetDialogLayout.setTag(i10, "Dialog:" + uuid);
            modalBottomSheetDialogLayout.setClipChildren(false);
            modalBottomSheetDialogLayout.setElevation(dVar.H1(B10));
            modalBottomSheetDialogLayout.setOutlineProvider(new a());
            this.f18670g = modalBottomSheetDialogLayout;
            setContentView((View) modalBottomSheetDialogLayout);
            l0.b(modalBottomSheetDialogLayout, l0.a(view));
            m0.b(modalBottomSheetDialogLayout, m0.a(view));
            g.b(modalBottomSheetDialogLayout, g.a(view));
            k(this.f18667d, this.f18668e, tVar);
            b1 a10 = C4626o0.a(window, window.getDecorView());
            a10.d(!z10);
            a10.c(!z10);
            y.b(getOnBackPressedDispatcher(), this, false, new C0282b(this), 2, (Object) null);
            return;
        }
        throw new IllegalStateException("Dialog has no window");
    }

    private final void i(t tVar) {
        ModalBottomSheetDialogLayout modalBottomSheetDialogLayout = this.f18670g;
        int i10 = c.f18673a[tVar.ordinal()];
        int i11 = 1;
        if (i10 == 1) {
            i11 = 0;
        } else if (i10 != 2) {
            throw new XH.t();
        }
        modalBottomSheetDialogLayout.setLayoutDirection(i11);
    }

    private final void j(androidx.compose.ui.window.r rVar) {
        boolean d10 = c.f(rVar, c.e(this.f18669f));
        Window window = getWindow();
        C17542s.g(window);
        window.setFlags(d10 ? 8192 : -8193, 8192);
    }

    public void cancel() {
    }

    public final void g() {
        this.f18670g.e();
    }

    public final void h(U0.r rVar, p<? super C4889m, ? super Integer, C16807N> pVar) {
        this.f18670g.m(rVar, pVar);
    }

    public final void k(C17631a<C16807N> aVar, C4727f0 f0Var, t tVar) {
        this.f18667d = aVar;
        this.f18668e = f0Var;
        j(f0Var.a());
        i(tVar);
        Window window = getWindow();
        if (window != null) {
            window.setLayout(-1, -1);
        }
        Window window2 = getWindow();
        if (window2 != null) {
            window2.setSoftInputMode(Build.VERSION.SDK_INT >= 30 ? 48 : 16);
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        if (onTouchEvent) {
            this.f18667d.invoke();
        }
        return onTouchEvent;
    }
}
