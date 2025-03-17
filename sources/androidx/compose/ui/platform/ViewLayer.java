package androidx.compose.ui.platform;

import G1.l0;
import XH.C16807N;
import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.compose.ui.graphics.a;
import androidx.compose.ui.graphics.f;
import androidx.recyclerview.widget.RecyclerView;
import c2.n;
import c2.r;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17631a;
import nI.p;
import o1.C5665e;
import o1.C5667g;
import p1.C5701G;
import p1.C5732n0;
import p1.C5734o0;
import p1.C5751x0;
import p1.O0;
import p1.U0;
import p1.c1;
import p1.d1;
import s1.C5905c;

@Metadata(d1 = {"\u0000¾\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 {2\u00020\u00012\u00020\u00022\u00020\u0003:\u0002\u001e\u001aBA\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u001a\u0010\f\u001a\u0016\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\u000b0\b\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u0018H\u0016ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010!\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020 H\u0016ø\u0001\u0000¢\u0006\u0004\b!\u0010\u001fJ!\u0010$\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020\t2\b\u0010#\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b$\u0010%J\u0017\u0010'\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020&H\u0014¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\u000bH\u0016¢\u0006\u0004\b)\u0010*J7\u00101\u001a\u00020\u000b2\u0006\u0010+\u001a\u00020\u00152\u0006\u0010-\u001a\u00020,2\u0006\u0010.\u001a\u00020,2\u0006\u0010/\u001a\u00020,2\u0006\u00100\u001a\u00020,H\u0014¢\u0006\u0004\b1\u00102J\u000f\u00103\u001a\u00020\u000bH\u0016¢\u0006\u0004\b3\u0010*J\u000f\u00104\u001a\u00020\u000bH\u0016¢\u0006\u0004\b4\u0010*J\u000f\u00105\u001a\u00020\u000bH\u0016¢\u0006\u0004\b5\u0010*J\"\u00100\u001a\u00020\u00182\u0006\u00106\u001a\u00020\u00182\u0006\u00107\u001a\u00020\u0015H\u0016ø\u0001\u0000¢\u0006\u0004\b0\u00108J\u001f\u0010;\u001a\u00020\u000b2\u0006\u0010:\u001a\u0002092\u0006\u00107\u001a\u00020\u0015H\u0016¢\u0006\u0004\b;\u0010<J9\u0010=\u001a\u00020\u000b2\u001a\u0010\f\u001a\u0016\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\u000b0\b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\rH\u0016¢\u0006\u0004\b=\u0010>J\u001a\u0010A\u001a\u00020\u000b2\u0006\u0010@\u001a\u00020?H\u0016ø\u0001\u0000¢\u0006\u0004\bA\u0010BJ\u001a\u0010C\u001a\u00020\u000b2\u0006\u0010@\u001a\u00020?H\u0016ø\u0001\u0000¢\u0006\u0004\bC\u0010BJ\u000f\u0010D\u001a\u00020\u000bH\u0002¢\u0006\u0004\bD\u0010*J\u000f\u0010E\u001a\u00020\u000bH\u0002¢\u0006\u0004\bE\u0010*R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bA\u0010F\u001a\u0004\bG\u0010HR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b0\u0010I\u001a\u0004\bJ\u0010KR,\u0010\f\u001a\u0018\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010LR\u001e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\r8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010MR\u0014\u0010P\u001a\u00020N8\u0002X\u0004¢\u0006\u0006\n\u0004\b;\u0010OR\u0016\u0010R\u001a\u00020\u00158\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010QR\u0018\u0010U\u001a\u0004\u0018\u00010S8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b=\u0010TR*\u0010Z\u001a\u00020\u00152\u0006\u0010V\u001a\u00020\u00158\u0006@BX\u000e¢\u0006\u0012\n\u0004\bC\u0010Q\u001a\u0004\bW\u0010\u0017\"\u0004\bX\u0010YR\u0016\u0010[\u001a\u00020\u00158\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b!\u0010QR\u0014\u0010^\u001a\u00020\\8\u0002X\u0004¢\u0006\u0006\n\u0004\b4\u0010]R\u001a\u0010a\u001a\b\u0012\u0004\u0012\u00020\u00010_8\u0002X\u0004¢\u0006\u0006\n\u0004\b$\u0010`R\u001c\u0010d\u001a\u00020b8\u0002@\u0002X\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b-\u0010cR\u0016\u0010f\u001a\u00020\u00158\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\be\u0010QR\u001a\u0010k\u001a\u00020g8\u0016X\u0004¢\u0006\f\n\u0004\bh\u0010c\u001a\u0004\bi\u0010jR\u0016\u0010n\u001a\u00020,8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bl\u0010mR\u0014\u0010p\u001a\u00020g8VX\u0004¢\u0006\u0006\u001a\u0004\bo\u0010jR$\u0010v\u001a\u00020q2\u0006\u0010V\u001a\u00020q8F@FX\u000e¢\u0006\f\u001a\u0004\br\u0010s\"\u0004\bt\u0010uR\u0016\u0010z\u001a\u0004\u0018\u00010w8BX\u0004¢\u0006\u0006\u001a\u0004\bx\u0010y\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006|"}, d2 = {"Landroidx/compose/ui/platform/ViewLayer;", "Landroid/view/View;", "LG1/l0;", "", "Landroidx/compose/ui/platform/AndroidComposeView;", "ownerView", "Landroidx/compose/ui/platform/DrawChildContainer;", "container", "Lkotlin/Function2;", "Lp1/n0;", "Ls1/c;", "LXH/N;", "drawBlock", "Lkotlin/Function0;", "invalidateParentLayer", "<init>", "(Landroidx/compose/ui/platform/AndroidComposeView;Landroidx/compose/ui/platform/DrawChildContainer;LnI/p;LnI/a;)V", "Landroidx/compose/ui/graphics/d;", "scope", "f", "(Landroidx/compose/ui/graphics/d;)V", "", "hasOverlappingRendering", "()Z", "Lo1/g;", "position", "d", "(J)Z", "Lc2/r;", "size", "c", "(J)V", "Lc2/n;", "i", "canvas", "parentLayer", "k", "(Lp1/n0;Ls1/c;)V", "Landroid/graphics/Canvas;", "dispatchDraw", "(Landroid/graphics/Canvas;)V", "invalidate", "()V", "changed", "", "l", "t", "r", "b", "onLayout", "(ZIIII)V", "destroy", "j", "forceLayout", "point", "inverse", "(JZ)J", "Lo1/e;", "rect", "e", "(Lo1/e;Z)V", "g", "(LnI/p;LnI/a;)V", "Lp1/O0;", "matrix", "a", "([F)V", "h", "w", "v", "Landroidx/compose/ui/platform/AndroidComposeView;", "getOwnerView", "()Landroidx/compose/ui/platform/AndroidComposeView;", "Landroidx/compose/ui/platform/DrawChildContainer;", "getContainer", "()Landroidx/compose/ui/platform/DrawChildContainer;", "LnI/p;", "LnI/a;", "Landroidx/compose/ui/platform/F0;", "Landroidx/compose/ui/platform/F0;", "outlineResolver", "Z", "clipToBounds", "Landroid/graphics/Rect;", "Landroid/graphics/Rect;", "clipBoundsCache", "value", "u", "setInvalidated", "(Z)V", "isInvalidated", "drawnWithZ", "Lp1/o0;", "Lp1/o0;", "canvasHolder", "Landroidx/compose/ui/platform/z0;", "Landroidx/compose/ui/platform/z0;", "matrixCache", "Landroidx/compose/ui/graphics/f;", "J", "mTransformOrigin", "m", "mHasOverlappingRendering", "", "n", "getLayerId", "()J", "layerId", "o", "I", "mutatedFields", "getOwnerViewId", "ownerViewId", "", "getCameraDistancePx", "()F", "setCameraDistancePx", "(F)V", "cameraDistancePx", "Lp1/U0;", "getManualClipPath", "()Lp1/U0;", "manualClipPath", "p", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ViewLayer extends View implements l0 {

    /* renamed from: p  reason: collision with root package name */
    public static final c f19335p = new c((DefaultConstructorMarker) null);

    /* renamed from: q  reason: collision with root package name */
    public static final int f19336q = 8;

    /* renamed from: r  reason: collision with root package name */
    private static final p<View, Matrix, C16807N> f19337r = b.f19358c;

    /* renamed from: s  reason: collision with root package name */
    private static final ViewOutlineProvider f19338s = new a();
    /* access modifiers changed from: private */

    /* renamed from: t  reason: collision with root package name */
    public static Method f19339t;
    /* access modifiers changed from: private */

    /* renamed from: u  reason: collision with root package name */
    public static Field f19340u;
    /* access modifiers changed from: private */

    /* renamed from: v  reason: collision with root package name */
    public static boolean f19341v;
    /* access modifiers changed from: private */

    /* renamed from: w  reason: collision with root package name */
    public static boolean f19342w;

    /* renamed from: a  reason: collision with root package name */
    private final AndroidComposeView f19343a;

    /* renamed from: b  reason: collision with root package name */
    private final DrawChildContainer f19344b;

    /* renamed from: c  reason: collision with root package name */
    private p<? super C5732n0, ? super C5905c, C16807N> f19345c;

    /* renamed from: d  reason: collision with root package name */
    private C17631a<C16807N> f19346d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final F0 f19347e = new F0();

    /* renamed from: f  reason: collision with root package name */
    private boolean f19348f;

    /* renamed from: g  reason: collision with root package name */
    private Rect f19349g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f19350h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f19351i;

    /* renamed from: j  reason: collision with root package name */
    private final C5734o0 f19352j = new C5734o0();

    /* renamed from: k  reason: collision with root package name */
    private final C5145z0<View> f19353k = new C5145z0<>(f19337r);

    /* renamed from: l  reason: collision with root package name */
    private long f19354l = f.f18947b.a();

    /* renamed from: m  reason: collision with root package name */
    private boolean f19355m = true;

    /* renamed from: n  reason: collision with root package name */
    private final long f19356n;

    /* renamed from: o  reason: collision with root package name */
    private int f19357o;

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"androidx/compose/ui/platform/ViewLayer$a", "Landroid/view/ViewOutlineProvider;", "Landroid/view/View;", "view", "Landroid/graphics/Outline;", "outline", "LXH/N;", "getOutline", "(Landroid/view/View;Landroid/graphics/Outline;)V", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a extends ViewOutlineProvider {
        a() {
        }

        public void getOutline(View view, Outline outline) {
            C17542s.h(view, "null cannot be cast to non-null type androidx.compose.ui.platform.ViewLayer");
            Outline b10 = ((ViewLayer) view).f19347e.b();
            C17542s.g(b10);
            outline.set(b10);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/View;", "view", "Landroid/graphics/Matrix;", "matrix", "LXH/N;", "a", "(Landroid/view/View;Landroid/graphics/Matrix;)V"}, k = 3, mv = {1, 8, 0})
    static final class b extends C17544u implements p<View, Matrix, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        public static final b f19358c = new b();

        b() {
            super(2);
        }

        public final void a(View view, Matrix matrix) {
            matrix.set(view.getMatrix());
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((View) obj, (Matrix) obj2);
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR$\u0010\u000b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t8\u0006@BX\u000e¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR*\u0010\u000f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t8\u0006@@X\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\f\u001a\u0004\b\u0010\u0010\u000e\"\u0004\b\u0011\u0010\u0012R&\u0010\u0015\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00060\u00138\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Landroidx/compose/ui/platform/ViewLayer$c;", "", "<init>", "()V", "Landroid/view/View;", "view", "LXH/N;", "d", "(Landroid/view/View;)V", "", "<set-?>", "hasRetrievedMethod", "Z", "a", "()Z", "shouldUseDispatchDraw", "b", "c", "(Z)V", "Lkotlin/Function2;", "Landroid/graphics/Matrix;", "getMatrix", "LnI/p;", "Ljava/lang/reflect/Field;", "recreateDisplayList", "Ljava/lang/reflect/Field;", "Ljava/lang/reflect/Method;", "updateDisplayListIfDirtyMethod", "Ljava/lang/reflect/Method;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean a() {
            return ViewLayer.f19341v;
        }

        public final boolean b() {
            return ViewLayer.f19342w;
        }

        public final void c(boolean z10) {
            ViewLayer.f19342w = z10;
        }

        @SuppressLint({"BanUncheckedReflection"})
        public final void d(View view) {
            Class<String> cls = String.class;
            Class<Class> cls2 = Class.class;
            try {
                if (!a()) {
                    ViewLayer.f19341v = true;
                    Class<View> cls3 = View.class;
                    if (Build.VERSION.SDK_INT < 28) {
                        ViewLayer.f19339t = cls3.getDeclaredMethod("updateDisplayListIfDirty", (Class[]) null);
                        ViewLayer.f19340u = cls3.getDeclaredField("mRecreateDisplayList");
                    } else {
                        ViewLayer.f19339t = (Method) cls2.getDeclaredMethod("getDeclaredMethod", new Class[]{cls, new Class[0].getClass()}).invoke(cls3, new Object[]{"updateDisplayListIfDirty", new Class[0]});
                        ViewLayer.f19340u = (Field) cls2.getDeclaredMethod("getDeclaredField", new Class[]{cls}).invoke(cls3, new Object[]{"mRecreateDisplayList"});
                    }
                    Method p10 = ViewLayer.f19339t;
                    if (p10 != null) {
                        p10.setAccessible(true);
                    }
                    Field n10 = ViewLayer.f19340u;
                    if (n10 != null) {
                        n10.setAccessible(true);
                    }
                }
                Field n11 = ViewLayer.f19340u;
                if (n11 != null) {
                    n11.setBoolean(view, true);
                }
                Method p11 = ViewLayer.f19339t;
                if (p11 != null) {
                    p11.invoke(view, (Object[]) null);
                }
            } catch (Throwable unused) {
                c(true);
            }
        }

        private c() {
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/compose/ui/platform/ViewLayer$d;", "", "<init>", "()V", "Landroid/view/View;", "view", "", "a", "(Landroid/view/View;)J", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class d {

        /* renamed from: a  reason: collision with root package name */
        public static final d f19359a = new d();

        private d() {
        }

        public static final long a(View view) {
            return view.getUniqueDrawingId();
        }
    }

    public ViewLayer(AndroidComposeView androidComposeView, DrawChildContainer drawChildContainer, p<? super C5732n0, ? super C5905c, C16807N> pVar, C17631a<C16807N> aVar) {
        super(androidComposeView.getContext());
        this.f19343a = androidComposeView;
        this.f19344b = drawChildContainer;
        this.f19345c = pVar;
        this.f19346d = aVar;
        setWillNotDraw(false);
        drawChildContainer.addView(this);
        this.f19356n = (long) View.generateViewId();
    }

    private final U0 getManualClipPath() {
        if (!getClipToOutline() || this.f19347e.e()) {
            return null;
        }
        return this.f19347e.d();
    }

    private final void setInvalidated(boolean z10) {
        if (z10 != this.f19350h) {
            this.f19350h = z10;
            this.f19343a.A0(this, z10);
        }
    }

    private final void v() {
        Rect rect;
        if (this.f19348f) {
            Rect rect2 = this.f19349g;
            if (rect2 == null) {
                this.f19349g = new Rect(0, 0, getWidth(), getHeight());
            } else {
                C17542s.g(rect2);
                rect2.set(0, 0, getWidth(), getHeight());
            }
            rect = this.f19349g;
        } else {
            rect = null;
        }
        setClipBounds(rect);
    }

    private final void w() {
        setOutlineProvider(this.f19347e.b() != null ? f19338s : null);
    }

    public void a(float[] fArr) {
        O0.n(fArr, this.f19353k.b(this));
    }

    public long b(long j10, boolean z10) {
        if (!z10) {
            return O0.f(this.f19353k.b(this), j10);
        }
        float[] a10 = this.f19353k.a(this);
        return a10 != null ? O0.f(a10, j10) : C5667g.f26701b.a();
    }

    public void c(long j10) {
        int h10 = r.h(j10);
        int g10 = r.g(j10);
        if (h10 != getWidth() || g10 != getHeight()) {
            setPivotX(f.f(this.f19354l) * ((float) h10));
            setPivotY(f.g(this.f19354l) * ((float) g10));
            w();
            layout(getLeft(), getTop(), getLeft() + h10, getTop() + g10);
            v();
            this.f19353k.c();
        }
    }

    public boolean d(long j10) {
        float m10 = C5667g.m(j10);
        float n10 = C5667g.n(j10);
        if (this.f19348f) {
            return 0.0f <= m10 && m10 < ((float) getWidth()) && 0.0f <= n10 && n10 < ((float) getHeight());
        }
        if (getClipToOutline()) {
            return this.f19347e.f(j10);
        }
        return true;
    }

    public void destroy() {
        setInvalidated(false);
        this.f19343a.L0();
        this.f19345c = null;
        this.f19346d = null;
        this.f19343a.J0(this);
        this.f19344b.removeViewInLayout(this);
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        boolean z10;
        C5734o0 o0Var = this.f19352j;
        Canvas a10 = o0Var.a().a();
        o0Var.a().b(canvas);
        C5701G a11 = o0Var.a();
        if (getManualClipPath() != null || !canvas.isHardwareAccelerated()) {
            a11.t();
            this.f19347e.a(a11);
            z10 = true;
        } else {
            z10 = false;
        }
        p<? super C5732n0, ? super C5905c, C16807N> pVar = this.f19345c;
        if (pVar != null) {
            pVar.invoke(a11, null);
        }
        if (z10) {
            a11.n();
        }
        o0Var.a().b(a10);
        setInvalidated(false);
    }

    public void e(C5665e eVar, boolean z10) {
        if (z10) {
            float[] a10 = this.f19353k.a(this);
            if (a10 != null) {
                O0.g(a10, eVar);
            } else {
                eVar.g(0.0f, 0.0f, 0.0f, 0.0f);
            }
        } else {
            O0.g(this.f19353k.b(this), eVar);
        }
    }

    public void f(androidx.compose.ui.graphics.d dVar) {
        C17631a<C16807N> aVar;
        int z10 = dVar.z() | this.f19357o;
        if ((z10 & RecyclerView.n.FLAG_APPEARED_IN_PRE_LAYOUT) != 0) {
            long B10 = dVar.B();
            this.f19354l = B10;
            setPivotX(f.f(B10) * ((float) getWidth()));
            setPivotY(f.g(this.f19354l) * ((float) getHeight()));
        }
        if ((z10 & 1) != 0) {
            setScaleX(dVar.F());
        }
        if ((z10 & 2) != 0) {
            setScaleY(dVar.Q());
        }
        if ((z10 & 4) != 0) {
            setAlpha(dVar.c());
        }
        if ((z10 & 8) != 0) {
            setTranslationX(dVar.M());
        }
        if ((z10 & 16) != 0) {
            setTranslationY(dVar.L());
        }
        if ((z10 & 32) != 0) {
            setElevation(dVar.I());
        }
        if ((z10 & 1024) != 0) {
            setRotation(dVar.f());
        }
        if ((z10 & 256) != 0) {
            setRotationX(dVar.N());
        }
        if ((z10 & 512) != 0) {
            setRotationY(dVar.s());
        }
        if ((z10 & RecyclerView.n.FLAG_MOVED) != 0) {
            setCameraDistancePx(dVar.y());
        }
        boolean z11 = false;
        boolean z12 = getManualClipPath() != null;
        boolean z13 = dVar.p() && dVar.J() != c1.a();
        if ((z10 & 24576) != 0) {
            this.f19348f = dVar.p() && dVar.J() == c1.a();
            v();
            setClipToOutline(z13);
        }
        boolean h10 = this.f19347e.h(dVar.D(), dVar.c(), z13, dVar.I(), dVar.b());
        if (this.f19347e.c()) {
            w();
        }
        boolean z14 = getManualClipPath() != null;
        if (z12 != z14 || (z14 && h10)) {
            invalidate();
        }
        if (!this.f19351i && getElevation() > 0.0f && (aVar = this.f19346d) != null) {
            aVar.invoke();
        }
        if ((z10 & 7963) != 0) {
            this.f19353k.c();
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 28) {
            if ((z10 & 64) != 0) {
                x1.f19675a.a(this, C5751x0.k(dVar.h()));
            }
            if ((z10 & 128) != 0) {
                x1.f19675a.b(this, C5751x0.k(dVar.K()));
            }
        }
        if (i10 >= 31 && (131072 & z10) != 0) {
            y1 y1Var = y1.f19677a;
            dVar.E();
            y1Var.a(this, (d1) null);
        }
        if ((z10 & 32768) != 0) {
            int u10 = dVar.u();
            a.C0292a aVar2 = androidx.compose.ui.graphics.a.f18902a;
            if (androidx.compose.ui.graphics.a.e(u10, aVar2.c())) {
                setLayerType(2, (Paint) null);
            } else if (androidx.compose.ui.graphics.a.e(u10, aVar2.b())) {
                setLayerType(0, (Paint) null);
                this.f19355m = z11;
            } else {
                setLayerType(0, (Paint) null);
            }
            z11 = true;
            this.f19355m = z11;
        }
        this.f19357o = dVar.z();
    }

    public void forceLayout() {
    }

    public void g(p<? super C5732n0, ? super C5905c, C16807N> pVar, C17631a<C16807N> aVar) {
        this.f19344b.addView(this);
        this.f19348f = false;
        this.f19351i = false;
        this.f19354l = f.f18947b.a();
        this.f19345c = pVar;
        this.f19346d = aVar;
    }

    public final float getCameraDistancePx() {
        return getCameraDistance() / ((float) getResources().getDisplayMetrics().densityDpi);
    }

    public final DrawChildContainer getContainer() {
        return this.f19344b;
    }

    public long getLayerId() {
        return this.f19356n;
    }

    public final AndroidComposeView getOwnerView() {
        return this.f19343a;
    }

    public long getOwnerViewId() {
        if (Build.VERSION.SDK_INT >= 29) {
            return d.a(this.f19343a);
        }
        return -1;
    }

    public void h(float[] fArr) {
        float[] a10 = this.f19353k.a(this);
        if (a10 != null) {
            O0.n(fArr, a10);
        }
    }

    public boolean hasOverlappingRendering() {
        return this.f19355m;
    }

    public void i(long j10) {
        int h10 = n.h(j10);
        if (h10 != getLeft()) {
            offsetLeftAndRight(h10 - getLeft());
            this.f19353k.c();
        }
        int i10 = n.i(j10);
        if (i10 != getTop()) {
            offsetTopAndBottom(i10 - getTop());
            this.f19353k.c();
        }
    }

    public void invalidate() {
        if (!this.f19350h) {
            setInvalidated(true);
            super.invalidate();
            this.f19343a.invalidate();
        }
    }

    public void j() {
        if (this.f19350h && !f19342w) {
            f19335p.d(this);
            setInvalidated(false);
        }
    }

    public void k(C5732n0 n0Var, C5905c cVar) {
        boolean z10 = getElevation() > 0.0f;
        this.f19351i = z10;
        if (z10) {
            n0Var.r();
        }
        this.f19344b.a(n0Var, this, getDrawingTime());
        if (this.f19351i) {
            n0Var.u();
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
    }

    public final void setCameraDistancePx(float f10) {
        setCameraDistance(f10 * ((float) getResources().getDisplayMetrics().densityDpi));
    }

    public final boolean u() {
        return this.f19350h;
    }
}
