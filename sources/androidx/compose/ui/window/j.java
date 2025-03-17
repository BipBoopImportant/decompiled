package androidx.compose.ui.window;

import U0.C4889m;
import XH.C16807N;
import android.graphics.Outline;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.Window;
import androidx.activity.r;
import androidx.activity.v;
import androidx.compose.ui.platform.z1;
import c2.t;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import nI.C17631a;
import nI.C17642l;
import nI.p;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B=\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J#\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00182\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ+\u0010\u001d\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010\u001f\u001a\u00020\u0004¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010$\u001a\u00020#2\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u0004H\u0016¢\u0006\u0004\b&\u0010 R\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u00100\u001a\u00020-8\u0002X\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u001a\u00103\u001a\u0002018\u0002X\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u001f\u00102R\u0014\u00106\u001a\u0002048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u00105\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00067"}, d2 = {"Landroidx/compose/ui/window/j;", "Landroidx/activity/r;", "Landroidx/compose/ui/platform/z1;", "Lkotlin/Function0;", "LXH/N;", "onDismissRequest", "Landroidx/compose/ui/window/h;", "properties", "Landroid/view/View;", "composeView", "Lc2/t;", "layoutDirection", "Lc2/d;", "density", "Ljava/util/UUID;", "dialogId", "<init>", "(LnI/a;Landroidx/compose/ui/window/h;Landroid/view/View;Lc2/t;Lc2/d;Ljava/util/UUID;)V", "j", "(Lc2/t;)V", "Landroidx/compose/ui/window/r;", "securePolicy", "k", "(Landroidx/compose/ui/window/r;)V", "LU0/r;", "parentComposition", "children", "i", "(LU0/r;LnI/p;)V", "l", "(LnI/a;Landroidx/compose/ui/window/h;Lc2/t;)V", "h", "()V", "Landroid/view/MotionEvent;", "event", "", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "cancel", "d", "LnI/a;", "e", "Landroidx/compose/ui/window/h;", "f", "Landroid/view/View;", "Landroidx/compose/ui/window/DialogLayout;", "g", "Landroidx/compose/ui/window/DialogLayout;", "dialogLayout", "Lc2/h;", "F", "maxSupportedElevation", "", "I", "defaultSoftInputMode", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class j extends r implements z1 {
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public C17631a<C16807N> f19950d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public h f19951e;

    /* renamed from: f  reason: collision with root package name */
    private final View f19952f;

    /* renamed from: g  reason: collision with root package name */
    private final DialogLayout f19953g;

    /* renamed from: h  reason: collision with root package name */
    private final float f19954h;

    /* renamed from: i  reason: collision with root package name */
    private final int f19955i;

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"androidx/compose/ui/window/j$a", "Landroid/view/ViewOutlineProvider;", "Landroid/view/View;", "view", "Landroid/graphics/Outline;", "result", "LXH/N;", "getOutline", "(Landroid/view/View;Landroid/graphics/Outline;)V", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a extends ViewOutlineProvider {
        a() {
        }

        public void getOutline(View view, Outline outline) {
            outline.setRect(0, 0, view.getWidth(), view.getHeight());
            outline.setAlpha(0.0f);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/activity/v;", "LXH/N;", "a", "(Landroidx/activity/v;)V"}, k = 3, mv = {1, 8, 0})
    static final class b extends C17544u implements C17642l<v, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ j f19956c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(j jVar) {
            super(1);
            this.f19956c = jVar;
        }

        public final void a(v vVar) {
            if (this.f19956c.f19951e.b()) {
                this.f19956c.f19950d.invoke();
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
        public static final /* synthetic */ int[] f19957a;

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
                f19957a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.window.j.c.<clinit>():void");
        }
    }

    /* JADX WARNING: type inference failed for: r7v7, types: [android.view.View] */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public j(nI.C17631a<XH.C16807N> r7, androidx.compose.ui.window.h r8, android.view.View r9, c2.t r10, c2.d r11, java.util.UUID r12) {
        /*
            r6 = this;
            android.view.ContextThemeWrapper r0 = new android.view.ContextThemeWrapper
            android.content.Context r1 = r9.getContext()
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 31
            if (r2 >= r3) goto L_0x0016
            boolean r2 = r8.a()
            if (r2 == 0) goto L_0x0013
            goto L_0x0016
        L_0x0013:
            int r2 = i1.k.f24386b
            goto L_0x0018
        L_0x0016:
            int r2 = i1.k.f24385a
        L_0x0018:
            r0.<init>(r1, r2)
            r1 = 2
            r2 = 0
            r3 = 0
            r6.<init>(r0, r2, r1, r3)
            r6.f19950d = r7
            r6.f19951e = r8
            r6.f19952f = r9
            r7 = 8
            float r7 = (float) r7
            float r7 = c2.h.B(r7)
            r6.f19954h = r7
            android.view.Window r8 = r6.getWindow()
            if (r8 == 0) goto L_0x00c6
            android.view.WindowManager$LayoutParams r0 = r8.getAttributes()
            int r0 = r0.softInputMode
            r0 = r0 & 240(0xf0, float:3.36E-43)
            r6.f19955i = r0
            r0 = 1
            r8.requestFeature(r0)
            r0 = 17170445(0x106000d, float:2.461195E-38)
            r8.setBackgroundDrawableResource(r0)
            androidx.compose.ui.window.h r0 = r6.f19951e
            boolean r0 = r0.a()
            I2.C4626o0.b(r8, r0)
            androidx.compose.ui.window.DialogLayout r0 = new androidx.compose.ui.window.DialogLayout
            android.content.Context r1 = r6.getContext()
            r0.<init>(r1, r8)
            int r1 = i1.i.f24336H
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Dialog:"
            r4.append(r5)
            r4.append(r12)
            java.lang.String r12 = r4.toString()
            r0.setTag(r1, r12)
            r0.setClipChildren(r2)
            float r7 = r11.H1(r7)
            r0.setElevation(r7)
            androidx.compose.ui.window.j$a r7 = new androidx.compose.ui.window.j$a
            r7.<init>()
            r0.setOutlineProvider(r7)
            r6.f19953g = r0
            android.view.View r7 = r8.getDecorView()
            boolean r8 = r7 instanceof android.view.ViewGroup
            if (r8 == 0) goto L_0x0091
            r3 = r7
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
        L_0x0091:
            if (r3 == 0) goto L_0x0096
            e(r3)
        L_0x0096:
            r6.setContentView((android.view.View) r0)
            androidx.lifecycle.y r7 = androidx.lifecycle.l0.a(r9)
            androidx.lifecycle.l0.b(r0, r7)
            androidx.lifecycle.k0 r7 = androidx.lifecycle.m0.a(r9)
            androidx.lifecycle.m0.b(r0, r7)
            P4.f r7 = P4.g.a(r9)
            P4.g.b(r0, r7)
            nI.a<XH.N> r7 = r6.f19950d
            androidx.compose.ui.window.h r8 = r6.f19951e
            r6.l(r7, r8, r10)
            androidx.activity.w r0 = r6.getOnBackPressedDispatcher()
            androidx.compose.ui.window.j$b r3 = new androidx.compose.ui.window.j$b
            r3.<init>(r6)
            r4 = 2
            r5 = 0
            r2 = 0
            r1 = r6
            androidx.activity.y.b(r0, r1, r2, r3, r4, r5)
            return
        L_0x00c6:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "Dialog has no window"
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.window.j.<init>(nI.a, androidx.compose.ui.window.h, android.view.View, c2.t, c2.d, java.util.UUID):void");
    }

    private static final void e(ViewGroup viewGroup) {
        viewGroup.setClipChildren(false);
        if (!(viewGroup instanceof DialogLayout)) {
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = viewGroup.getChildAt(i10);
                ViewGroup viewGroup2 = childAt instanceof ViewGroup ? (ViewGroup) childAt : null;
                if (viewGroup2 != null) {
                    e(viewGroup2);
                }
            }
        }
    }

    private final void j(t tVar) {
        DialogLayout dialogLayout = this.f19953g;
        int i10 = c.f19957a[tVar.ordinal()];
        int i11 = 1;
        if (i10 == 1) {
            i11 = 0;
        } else if (i10 != 2) {
            throw new XH.t();
        }
        dialogLayout.setLayoutDirection(i11);
    }

    private final void k(r rVar) {
        boolean a10 = s.a(rVar, b.i(this.f19952f));
        Window window = getWindow();
        C17542s.g(window);
        window.setFlags(a10 ? 8192 : -8193, 8192);
    }

    public void cancel() {
    }

    public final void h() {
        this.f19953g.e();
    }

    public final void i(U0.r rVar, p<? super C4889m, ? super Integer, C16807N> pVar) {
        this.f19953g.l(rVar, pVar);
    }

    public final void l(C17631a<C16807N> aVar, h hVar, t tVar) {
        Window window;
        this.f19950d = aVar;
        this.f19951e = hVar;
        k(hVar.d());
        j(tVar);
        if (hVar.e() && !this.f19953g.k() && (window = getWindow()) != null) {
            window.setLayout(-2, -2);
        }
        this.f19953g.m(hVar.e());
        if (Build.VERSION.SDK_INT >= 31) {
            return;
        }
        if (hVar.a()) {
            Window window2 = getWindow();
            if (window2 != null) {
                window2.setSoftInputMode(this.f19955i);
                return;
            }
            return;
        }
        Window window3 = getWindow();
        if (window3 != null) {
            window3.setSoftInputMode(16);
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        if (onTouchEvent && this.f19951e.c()) {
            this.f19950d.invoke();
        }
        return onTouchEvent;
    }
}
