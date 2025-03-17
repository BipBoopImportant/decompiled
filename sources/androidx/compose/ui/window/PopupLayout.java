package androidx.compose.ui.window;

import E1.C4488v;
import E1.C4489w;
import U0.A1;
import U0.C4889m;
import U0.C4895p;
import U0.C4899r0;
import U0.M0;
import U0.Y0;
import U0.o1;
import U0.p1;
import XH.C16807N;
import android.annotation.SuppressLint;
import android.graphics.Outline;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.WindowManager;
import androidx.compose.ui.platform.AbstractComposeView;
import androidx.compose.ui.platform.z1;
import androidx.lifecycle.C5221y;
import androidx.lifecycle.l0;
import androidx.lifecycle.m0;
import c2.n;
import c2.o;
import c2.p;
import c2.q;
import c2.r;
import c2.s;
import c2.t;
import com.oppwa.mobile.connect.payment.processor.cashapppay.CashAppPayProcessorActivity;
import g1.C5357z;
import i1.i;
import i1.j;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.N;
import nI.C17631a;
import nI.C17642l;
import o1.C5667g;

@Metadata(d1 = {"\u0000Â\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\f\n\u0002\u0010\u0015\n\u0002\b\u000e\b\u0001\u0018\u0000 \u00012\u00020\u00012\u00020\u0002:\u0002\u0001BQ\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0018\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b \u0010!J\r\u0010\"\u001a\u00020\u0004¢\u0006\u0004\b\"\u0010\u0017J#\u0010&\u001a\u00020\u00042\u0006\u0010$\u001a\u00020#2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u0004H\u0017¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\u0004H\u0014¢\u0006\u0004\b*\u0010\u0017J\u000f\u0010+\u001a\u00020\u0004H\u0014¢\u0006\u0004\b+\u0010\u0017J\u001f\u0010/\u001a\u00020\u00042\u0006\u0010-\u001a\u00020,2\u0006\u0010.\u001a\u00020,H\u0010¢\u0006\u0004\b/\u00100J7\u00107\u001a\u00020\u00042\u0006\u00102\u001a\u0002012\u0006\u00103\u001a\u00020,2\u0006\u00104\u001a\u00020,2\u0006\u00105\u001a\u00020,2\u0006\u00106\u001a\u00020,H\u0010¢\u0006\u0004\b7\u00108J\u0017\u0010;\u001a\u0002012\u0006\u0010:\u001a\u000209H\u0016¢\u0006\u0004\b;\u0010<J5\u0010=\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b=\u0010>J\u0015\u0010A\u001a\u00020\u00042\u0006\u0010@\u001a\u00020?¢\u0006\u0004\bA\u0010BJ\r\u0010C\u001a\u00020\u0004¢\u0006\u0004\bC\u0010\u0017J\u000f\u0010D\u001a\u00020\u0004H\u0001¢\u0006\u0004\bD\u0010\u0017J\r\u0010E\u001a\u00020\u0004¢\u0006\u0004\bE\u0010\u0017J\r\u0010F\u001a\u00020\u0004¢\u0006\u0004\bF\u0010\u0017J\u0019\u0010H\u001a\u0002012\b\u0010:\u001a\u0004\u0018\u00010GH\u0016¢\u0006\u0004\bH\u0010IJ\u0017\u0010J\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020,H\u0016¢\u0006\u0004\bJ\u0010KR\u001e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bL\u0010MR\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bN\u0010OR\"\u0010\t\u001a\u00020\b8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010S\"\u0004\bT\u0010UR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b \u0010VR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0004¢\u0006\u0006\n\u0004\bF\u0010WR\u0014\u0010Z\u001a\u00020X8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010YR \u0010^\u001a\u00020\u001f8\u0000X\u0004¢\u0006\u0012\n\u0004\b\u0018\u0010[\u0012\u0004\b]\u0010\u0017\u001a\u0004\b\\\u0010!R\"\u0010d\u001a\u00020\u000e8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bC\u0010_\u001a\u0004\b`\u0010a\"\u0004\bb\u0010cR\"\u0010i\u001a\u00020\u001b8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b&\u0010e\u001a\u0004\bf\u0010g\"\u0004\bh\u0010\u001eR5\u0010q\u001a\u0004\u0018\u00010j2\b\u0010k\u001a\u0004\u0018\u00010j8F@FX\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\"\u0010l\u001a\u0004\bm\u0010n\"\u0004\bo\u0010pR/\u0010@\u001a\u0004\u0018\u00010?2\b\u0010k\u001a\u0004\u0018\u00010?8B@BX\u0002¢\u0006\u0012\n\u0004\b\u001d\u0010l\u001a\u0004\br\u0010s\"\u0004\bt\u0010BR\u0018\u0010w\u001a\u0004\u0018\u00010u8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b=\u0010vR\u001b\u0010{\u001a\u0002018FX\u0002¢\u0006\f\n\u0004\bD\u0010x\u001a\u0004\by\u0010zR\u001a\u0010~\u001a\u00020|8\u0002X\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\bA\u0010}R\u0016\u0010\u0001\u001a\u000208\u0002X\u0004¢\u0006\u0007\n\u0005\b\u0019\u0010\u0001R\u0017\u0010\u0001\u001a\u00030\u00018\u0002X\u0004¢\u0006\u0007\n\u0005\bE\u0010\u0001R\u001c\u0010\u0001\u001a\u0005\u0018\u00010\u00018\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b\u0001\u0010\u0001R<\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010k\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038B@BX\u0002¢\u0006\u0017\n\u0005\b\u0001\u0010l\u001a\u0006\b\u0001\u0010\u0001\"\u0006\b\u0001\u0010\u0001R(\u0010\u0001\u001a\u0002012\u0006\u0010k\u001a\u0002018\u0014@RX\u000e¢\u0006\u000f\n\u0006\b\u0001\u0010\u0001\u001a\u0005\b\u0001\u0010zR\u0018\u0010\u0001\u001a\u00030\u00018\u0002X\u0004¢\u0006\b\n\u0006\b\u0001\u0010\u0001R\u0017\u0010\u0001\u001a\u00020,8BX\u0004¢\u0006\b\u001a\u0006\b\u0001\u0010\u0001R\u0017\u0010\u0001\u001a\u00020,8BX\u0004¢\u0006\b\u001a\u0006\b\u0001\u0010\u0001R\u0017\u0010\u0001\u001a\u00020\u00018VX\u0004¢\u0006\b\u001a\u0006\b\u0001\u0010\u0001\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006 \u0001"}, d2 = {"Landroidx/compose/ui/window/PopupLayout;", "Landroidx/compose/ui/platform/AbstractComposeView;", "Landroidx/compose/ui/platform/z1;", "Lkotlin/Function0;", "LXH/N;", "onDismissRequest", "Landroidx/compose/ui/window/q;", "properties", "", "testTag", "Landroid/view/View;", "composeView", "Lc2/d;", "density", "Landroidx/compose/ui/window/p;", "initialPositionProvider", "Ljava/util/UUID;", "popupId", "Landroidx/compose/ui/window/l;", "popupLayoutHelper", "<init>", "(LnI/a;Landroidx/compose/ui/window/q;Ljava/lang/String;Landroid/view/View;Lc2/d;Landroidx/compose/ui/window/p;Ljava/util/UUID;Landroidx/compose/ui/window/l;)V", "n", "()V", "o", "w", "(Landroidx/compose/ui/window/q;)V", "Lc2/t;", "layoutDirection", "s", "(Lc2/t;)V", "Landroid/view/WindowManager$LayoutParams;", "l", "()Landroid/view/WindowManager$LayoutParams;", "r", "LU0/r;", "parent", "content", "q", "(LU0/r;LnI/p;)V", "a", "(LU0/m;I)V", "onAttachedToWindow", "onDetachedFromWindow", "", "widthMeasureSpec", "heightMeasureSpec", "h", "(II)V", "", "changed", "left", "top", "right", "bottom", "g", "(ZIIII)V", "Landroid/view/KeyEvent;", "event", "dispatchKeyEvent", "(Landroid/view/KeyEvent;)Z", "t", "(LnI/a;Landroidx/compose/ui/window/q;Ljava/lang/String;Lc2/t;)V", "LE1/v;", "parentLayoutCoordinates", "v", "(LE1/v;)V", "p", "u", "x", "m", "Landroid/view/MotionEvent;", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "setLayoutDirection", "(I)V", "i", "LnI/a;", "j", "Landroidx/compose/ui/window/q;", "k", "Ljava/lang/String;", "getTestTag", "()Ljava/lang/String;", "setTestTag", "(Ljava/lang/String;)V", "Landroid/view/View;", "Landroidx/compose/ui/window/l;", "Landroid/view/WindowManager;", "Landroid/view/WindowManager;", "windowManager", "Landroid/view/WindowManager$LayoutParams;", "getParams$ui_release", "getParams$ui_release$annotations", "params", "Landroidx/compose/ui/window/p;", "getPositionProvider", "()Landroidx/compose/ui/window/p;", "setPositionProvider", "(Landroidx/compose/ui/window/p;)V", "positionProvider", "Lc2/t;", "getParentLayoutDirection", "()Lc2/t;", "setParentLayoutDirection", "parentLayoutDirection", "Lc2/r;", "<set-?>", "LU0/r0;", "getPopupContentSize-bOM6tXw", "()Lc2/r;", "setPopupContentSize-fhxjrPA", "(Lc2/r;)V", "popupContentSize", "getParentLayoutCoordinates", "()LE1/v;", "setParentLayoutCoordinates", "Lc2/p;", "Lc2/p;", "parentBounds", "LU0/A1;", "getCanCalculatePosition", "()Z", "canCalculatePosition", "Lc2/h;", "F", "maxSupportedElevation", "Landroid/graphics/Rect;", "Landroid/graphics/Rect;", "previousWindowVisibleFrame", "Lg1/z;", "Lg1/z;", "snapshotStateObserver", "", "y", "Ljava/lang/Object;", "backCallback", "z", "getContent", "()LnI/p;", "setContent", "(LnI/p;)V", "A", "Z", "getShouldCreateCompositionOnAttachedToWindow", "shouldCreateCompositionOnAttachedToWindow", "", "B", "[I", "locationOnScreen", "getDisplayWidth", "()I", "displayWidth", "getDisplayHeight", "displayHeight", "getSubCompositionView", "()Landroidx/compose/ui/platform/AbstractComposeView;", "subCompositionView", "C", "c", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SuppressLint({"ViewConstructor"})
public final class PopupLayout extends AbstractComposeView implements z1 {

    /* renamed from: C  reason: collision with root package name */
    private static final c f19843C = new c((DefaultConstructorMarker) null);

    /* renamed from: D  reason: collision with root package name */
    public static final int f19844D = 8;

    /* renamed from: E  reason: collision with root package name */
    private static final C17642l<PopupLayout, C16807N> f19845E = b.f19866c;

    /* renamed from: A  reason: collision with root package name */
    private boolean f19846A;

    /* renamed from: B  reason: collision with root package name */
    private final int[] f19847B;

    /* renamed from: i  reason: collision with root package name */
    private C17631a<C16807N> f19848i;

    /* renamed from: j  reason: collision with root package name */
    private q f19849j;

    /* renamed from: k  reason: collision with root package name */
    private String f19850k;

    /* renamed from: l  reason: collision with root package name */
    private final View f19851l;

    /* renamed from: m  reason: collision with root package name */
    private final l f19852m;

    /* renamed from: n  reason: collision with root package name */
    private final WindowManager f19853n;

    /* renamed from: o  reason: collision with root package name */
    private final WindowManager.LayoutParams f19854o;

    /* renamed from: p  reason: collision with root package name */
    private p f19855p;

    /* renamed from: q  reason: collision with root package name */
    private t f19856q;

    /* renamed from: r  reason: collision with root package name */
    private final C4899r0 f19857r;

    /* renamed from: s  reason: collision with root package name */
    private final C4899r0 f19858s;

    /* renamed from: t  reason: collision with root package name */
    private p f19859t;

    /* renamed from: u  reason: collision with root package name */
    private final A1 f19860u;

    /* renamed from: v  reason: collision with root package name */
    private final float f19861v;

    /* renamed from: w  reason: collision with root package name */
    private final Rect f19862w;

    /* renamed from: x  reason: collision with root package name */
    private final C5357z f19863x;

    /* renamed from: y  reason: collision with root package name */
    private Object f19864y;

    /* renamed from: z  reason: collision with root package name */
    private final C4899r0 f19865z;

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"androidx/compose/ui/window/PopupLayout$a", "Landroid/view/ViewOutlineProvider;", "Landroid/view/View;", "view", "Landroid/graphics/Outline;", "result", "LXH/N;", "getOutline", "(Landroid/view/View;Landroid/graphics/Outline;)V", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a extends ViewOutlineProvider {
        a() {
        }

        public void getOutline(View view, Outline outline) {
            outline.setRect(0, 0, view.getWidth(), view.getHeight());
            outline.setAlpha(0.0f);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/window/PopupLayout;", "popupLayout", "LXH/N;", "a", "(Landroidx/compose/ui/window/PopupLayout;)V"}, k = 3, mv = {1, 8, 0})
    static final class b extends C17544u implements C17642l<PopupLayout, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        public static final b f19866c = new b();

        b() {
            super(1);
        }

        public final void a(PopupLayout popupLayout) {
            if (popupLayout.isAttachedToWindow()) {
                popupLayout.x();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((PopupLayout) obj);
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/compose/ui/window/PopupLayout$c;", "", "<init>", "()V", "Lkotlin/Function1;", "Landroidx/compose/ui/window/PopupLayout;", "LXH/N;", "onCommitAffectingPopupPosition", "LnI/l;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private c() {
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class d extends C17544u implements nI.p<C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ PopupLayout f19867c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f19868d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(PopupLayout popupLayout, int i10) {
            super(2);
            this.f19867c = popupLayout;
            this.f19868d = i10;
        }

        public final void a(C4889m mVar, int i10) {
            this.f19867c.a(mVar, M0.a(this.f19868d | 1));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class e {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f19869a;

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
                f19869a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.window.PopupLayout.e.<clinit>():void");
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class f extends C17544u implements C17631a<Boolean> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ PopupLayout f19870c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(PopupLayout popupLayout) {
            super(0);
            this.f19870c = popupLayout;
        }

        public final Boolean invoke() {
            C4488v k10 = this.f19870c.getParentLayoutCoordinates();
            if (k10 == null || !k10.c()) {
                k10 = null;
            }
            return Boolean.valueOf((k10 == null || this.f19870c.m0getPopupContentSizebOM6tXw() == null) ? false : true);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/Function0;", "LXH/N;", "command", "b", "(LnI/a;)V"}, k = 3, mv = {1, 8, 0})
    static final class g extends C17544u implements C17642l<C17631a<? extends C16807N>, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ PopupLayout f19871c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(PopupLayout popupLayout) {
            super(1);
            this.f19871c = popupLayout;
        }

        /* access modifiers changed from: private */
        public static final void c(C17631a aVar) {
            aVar.invoke();
        }

        public final void b(C17631a<C16807N> aVar) {
            Handler handler = this.f19871c.getHandler();
            if ((handler != null ? handler.getLooper() : null) == Looper.myLooper()) {
                aVar.invoke();
                return;
            }
            Handler handler2 = this.f19871c.getHandler();
            if (handler2 != null) {
                handler2.post(new k(aVar));
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((C17631a) obj);
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LXH/N;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class h extends C17544u implements C17631a<C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ N f19872c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ PopupLayout f19873d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ p f19874e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ long f19875f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ long f19876g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(N n10, PopupLayout popupLayout, p pVar, long j10, long j11) {
            super(0);
            this.f19872c = n10;
            this.f19873d = popupLayout;
            this.f19874e = pVar;
            this.f19875f = j10;
            this.f19876g = j11;
        }

        public final void invoke() {
            this.f19872c.f144347a = this.f19873d.getPositionProvider().a(this.f19874e, this.f19875f, this.f19873d.getParentLayoutDirection(), this.f19876g);
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ PopupLayout(nI.C17631a r11, androidx.compose.ui.window.q r12, java.lang.String r13, android.view.View r14, c2.d r15, androidx.compose.ui.window.p r16, java.util.UUID r17, androidx.compose.ui.window.l r18, int r19, kotlin.jvm.internal.DefaultConstructorMarker r20) {
        /*
            r10 = this;
            r0 = r19
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0019
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto L_0x0012
            androidx.compose.ui.window.n r0 = new androidx.compose.ui.window.n
            r0.<init>()
            goto L_0x0017
        L_0x0012:
            androidx.compose.ui.window.o r0 = new androidx.compose.ui.window.o
            r0.<init>()
        L_0x0017:
            r9 = r0
            goto L_0x001b
        L_0x0019:
            r9 = r18
        L_0x001b:
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            r7 = r16
            r8 = r17
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.window.PopupLayout.<init>(nI.a, androidx.compose.ui.window.q, java.lang.String, android.view.View, c2.d, androidx.compose.ui.window.p, java.util.UUID, androidx.compose.ui.window.l, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    private final nI.p<C4889m, Integer, C16807N> getContent() {
        return (nI.p) this.f19865z.getValue();
    }

    private final int getDisplayHeight() {
        return Math.round(((float) getContext().getResources().getConfiguration().screenHeightDp) * getContext().getResources().getDisplayMetrics().density);
    }

    private final int getDisplayWidth() {
        return Math.round(((float) getContext().getResources().getConfiguration().screenWidthDp) * getContext().getResources().getDisplayMetrics().density);
    }

    public static /* synthetic */ void getParams$ui_release$annotations() {
    }

    /* access modifiers changed from: private */
    public final C4488v getParentLayoutCoordinates() {
        return (C4488v) this.f19858s.getValue();
    }

    private final WindowManager.LayoutParams l() {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.gravity = 8388659;
        layoutParams.flags = b.h(this.f19849j, b.i(this.f19851l));
        layoutParams.type = CashAppPayProcessorActivity.RESULT_ERROR;
        layoutParams.token = this.f19851l.getApplicationWindowToken();
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.setTitle(this.f19851l.getContext().getResources().getString(j.f24370d));
        return layoutParams;
    }

    private final void n() {
        if (this.f19849j.a() && Build.VERSION.SDK_INT >= 33) {
            if (this.f19864y == null) {
                this.f19864y = e.b(this.f19848i);
            }
            e.d(this, this.f19864y);
        }
    }

    private final void o() {
        if (Build.VERSION.SDK_INT >= 33) {
            e.e(this, this.f19864y);
        }
        this.f19864y = null;
    }

    private final void s(t tVar) {
        int i10 = e.f19869a[tVar.ordinal()];
        int i11 = 1;
        if (i10 == 1) {
            i11 = 0;
        } else if (i10 != 2) {
            throw new XH.t();
        }
        super.setLayoutDirection(i11);
    }

    private final void setContent(nI.p<? super C4889m, ? super Integer, C16807N> pVar) {
        this.f19865z.setValue(pVar);
    }

    private final void setParentLayoutCoordinates(C4488v vVar) {
        this.f19858s.setValue(vVar);
    }

    private final void w(q qVar) {
        if (!C17542s.e(this.f19849j, qVar)) {
            if (qVar.f() && !this.f19849j.f()) {
                WindowManager.LayoutParams layoutParams = this.f19854o;
                layoutParams.width = -2;
                layoutParams.height = -2;
            }
            this.f19849j = qVar;
            this.f19854o.flags = b.h(qVar, b.i(this.f19851l));
            this.f19852m.b(this.f19853n, this, this.f19854o);
        }
    }

    public void a(C4889m mVar, int i10) {
        int i11;
        C4889m k10 = mVar.k(-857613600);
        if ((i10 & 6) == 0) {
            i11 = (k10.F(this) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) != 2 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(-857613600, i11, -1, "androidx.compose.ui.window.PopupLayout.Content (AndroidPopup.android.kt:572)");
            }
            getContent().invoke(k10, 0);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new d(this, i10));
        }
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        KeyEvent.DispatcherState keyDispatcherState;
        if (keyEvent.getKeyCode() == 4 && this.f19849j.a()) {
            if (getKeyDispatcherState() == null) {
                return super.dispatchKeyEvent(keyEvent);
            }
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                if (keyDispatcherState2 != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                }
                return true;
            } else if (keyEvent.getAction() == 1 && (keyDispatcherState = getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent) && !keyEvent.isCanceled()) {
                C17631a<C16807N> aVar = this.f19848i;
                if (aVar != null) {
                    aVar.invoke();
                }
                return true;
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    public void g(boolean z10, int i10, int i11, int i12, int i13) {
        View childAt;
        super.g(z10, i10, i11, i12, i13);
        if (!this.f19849j.f() && (childAt = getChildAt(0)) != null) {
            this.f19854o.width = childAt.getMeasuredWidth();
            this.f19854o.height = childAt.getMeasuredHeight();
            this.f19852m.b(this.f19853n, this, this.f19854o);
        }
    }

    public final boolean getCanCalculatePosition() {
        return ((Boolean) this.f19860u.getValue()).booleanValue();
    }

    public final WindowManager.LayoutParams getParams$ui_release() {
        return this.f19854o;
    }

    public final t getParentLayoutDirection() {
        return this.f19856q;
    }

    /* renamed from: getPopupContentSize-bOM6tXw  reason: not valid java name */
    public final r m0getPopupContentSizebOM6tXw() {
        return (r) this.f19857r.getValue();
    }

    public final p getPositionProvider() {
        return this.f19855p;
    }

    /* access modifiers changed from: protected */
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.f19846A;
    }

    public AbstractComposeView getSubCompositionView() {
        return this;
    }

    public final String getTestTag() {
        return this.f19850k;
    }

    public /* bridge */ /* synthetic */ View getViewRoot() {
        return super.getViewRoot();
    }

    public void h(int i10, int i11) {
        if (this.f19849j.f()) {
            super.h(i10, i11);
        } else {
            super.h(View.MeasureSpec.makeMeasureSpec(getDisplayWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(getDisplayHeight(), Integer.MIN_VALUE));
        }
    }

    public final void m() {
        l0.b(this, (C5221y) null);
        this.f19853n.removeViewImmediate(this);
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f19863x.s();
        n();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f19863x.t();
        this.f19863x.j();
        o();
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f19849j.b()) {
            return super.onTouchEvent(motionEvent);
        }
        if (motionEvent != null && motionEvent.getAction() == 0 && (motionEvent.getX() < 0.0f || motionEvent.getX() >= ((float) getWidth()) || motionEvent.getY() < 0.0f || motionEvent.getY() >= ((float) getHeight()))) {
            C17631a<C16807N> aVar = this.f19848i;
            if (aVar != null) {
                aVar.invoke();
            }
            return true;
        } else if (motionEvent == null || motionEvent.getAction() != 4) {
            return super.onTouchEvent(motionEvent);
        } else {
            C17631a<C16807N> aVar2 = this.f19848i;
            if (aVar2 != null) {
                aVar2.invoke();
            }
            return true;
        }
    }

    public final void p() {
        int[] iArr = this.f19847B;
        int i10 = iArr[0];
        int i11 = iArr[1];
        this.f19851l.getLocationOnScreen(iArr);
        int[] iArr2 = this.f19847B;
        if (i10 != iArr2[0] || i11 != iArr2[1]) {
            u();
        }
    }

    public final void q(U0.r rVar, nI.p<? super C4889m, ? super Integer, C16807N> pVar) {
        setParentCompositionContext(rVar);
        setContent(pVar);
        this.f19846A = true;
    }

    public final void r() {
        this.f19853n.addView(this, this.f19854o);
    }

    public void setLayoutDirection(int i10) {
    }

    public final void setParentLayoutDirection(t tVar) {
        this.f19856q = tVar;
    }

    /* renamed from: setPopupContentSize-fhxjrPA  reason: not valid java name */
    public final void m1setPopupContentSizefhxjrPA(r rVar) {
        this.f19857r.setValue(rVar);
    }

    public final void setPositionProvider(p pVar) {
        this.f19855p = pVar;
    }

    public final void setTestTag(String str) {
        this.f19850k = str;
    }

    public final void t(C17631a<C16807N> aVar, q qVar, String str, t tVar) {
        this.f19848i = aVar;
        this.f19850k = str;
        w(qVar);
        s(tVar);
    }

    public final void u() {
        C4488v parentLayoutCoordinates = getParentLayoutCoordinates();
        if (parentLayoutCoordinates != null) {
            if (!parentLayoutCoordinates.c()) {
                parentLayoutCoordinates = null;
            }
            if (parentLayoutCoordinates != null) {
                long a10 = parentLayoutCoordinates.a();
                long g10 = C4489w.g(parentLayoutCoordinates);
                p a11 = q.a(o.a(Math.round(C5667g.m(g10)), Math.round(C5667g.n(g10))), a10);
                if (!C17542s.e(a11, this.f19859t)) {
                    this.f19859t = a11;
                    x();
                }
            }
        }
    }

    public final void v(C4488v vVar) {
        setParentLayoutCoordinates(vVar);
        u();
    }

    public final void x() {
        r r02;
        p pVar = this.f19859t;
        if (pVar != null && (r02 = m0getPopupContentSizebOM6tXw()) != null) {
            long k10 = r02.k();
            Rect rect = this.f19862w;
            this.f19852m.a(this.f19851l, rect);
            p f10 = b.j(rect);
            long a10 = s.a(f10.p(), f10.i());
            N n10 = new N();
            n10.f144347a = n.f23044b.a();
            this.f19863x.o(this, f19845E, new h(n10, this, pVar, a10, k10));
            this.f19854o.x = n.h(n10.f144347a);
            this.f19854o.y = n.i(n10.f144347a);
            if (this.f19849j.c()) {
                this.f19852m.c(this, r.h(a10), r.g(a10));
            }
            this.f19852m.b(this.f19853n, this, this.f19854o);
        }
    }

    public PopupLayout(C17631a<C16807N> aVar, q qVar, String str, View view, c2.d dVar, p pVar, UUID uuid, l lVar) {
        super(view.getContext(), (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        this.f19848i = aVar;
        this.f19849j = qVar;
        this.f19850k = str;
        this.f19851l = view;
        this.f19852m = lVar;
        Object systemService = view.getContext().getSystemService("window");
        C17542s.h(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        this.f19853n = (WindowManager) systemService;
        this.f19854o = l();
        this.f19855p = pVar;
        this.f19856q = t.Ltr;
        this.f19857r = u1.e((Object) null, (o1) null, 2, (Object) null);
        this.f19858s = u1.e((Object) null, (o1) null, 2, (Object) null);
        this.f19860u = p1.e(new f(this));
        float B10 = c2.h.B((float) 8);
        this.f19861v = B10;
        this.f19862w = new Rect();
        this.f19863x = new C5357z(new g(this));
        setId(16908290);
        l0.b(this, l0.a(view));
        m0.b(this, m0.a(view));
        P4.g.b(this, P4.g.a(view));
        int i10 = i.f24336H;
        setTag(i10, "Popup:" + uuid);
        setClipChildren(false);
        setElevation(dVar.H1(B10));
        setOutlineProvider(new a());
        this.f19865z = u1.e(g.f19942a.a(), (o1) null, 2, (Object) null);
        this.f19847B = new int[2];
    }
}
