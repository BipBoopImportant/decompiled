package androidx.compose.ui.viewinterop;

import A1.M;
import E1.C4484q;
import E1.C4488v;
import E1.I;
import E1.J;
import E1.K;
import E1.a0;
import E1.r;
import G1.m0;
import G1.n0;
import G1.o0;
import I2.G;
import I2.H;
import L1.x;
import QJ.F0;
import QJ.Q;
import QJ.T;
import U0.C4885k;
import XH.C16807N;
import XH.y;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.Region;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.platform.E0;
import androidx.compose.ui.platform.H1;
import androidx.lifecycle.C5221y;
import androidx.lifecycle.l0;
import c2.C5267b;
import c2.z;
import com.sugarcube.app.base.data.source.CatalogRepository;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17631a;
import nI.C17642l;
import o1.C5667g;
import o1.C5668h;
import p1.C5702H;
import p1.C5732n0;
import tI.C17978n;
import z1.C6272b;

@Metadata(d1 = {"\u0000Î\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\u0007\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0010\u0018\u0000 Æ\u00012\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001\"B9\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0019\u001a\n\u0018\u00010\rj\u0004\u0018\u0001`\u0018¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u001eH\u0016¢\u0006\u0004\b!\u0010 J\u000f\u0010\"\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\"\u0010 J\u001f\u0010%\u001a\u00020\u001e2\u0006\u0010#\u001a\u00020\t2\u0006\u0010$\u001a\u00020\tH\u0014¢\u0006\u0004\b%\u0010&J\r\u0010'\u001a\u00020\u001e¢\u0006\u0004\b'\u0010 J7\u0010,\u001a\u00020\u001e2\u0006\u0010)\u001a\u00020(2\u0006\u0010\u001f\u001a\u00020\t2\u0006\u0010*\u001a\u00020\t2\u0006\u0010+\u001a\u00020\t2\u0006\u0010\"\u001a\u00020\tH\u0014¢\u0006\u0004\b,\u0010-J\u0011\u0010/\u001a\u0004\u0018\u00010.H\u0016¢\u0006\u0004\b/\u00100J\u0017\u00102\u001a\u00020\u001e2\u0006\u00101\u001a\u00020(H\u0016¢\u0006\u0004\b2\u00103J\u000f\u00104\u001a\u00020\u001eH\u0014¢\u0006\u0004\b4\u0010 J\u000f\u00105\u001a\u00020\u001eH\u0014¢\u0006\u0004\b5\u0010 J%\u0010;\u001a\u0004\u0018\u00010:2\b\u00107\u001a\u0004\u0018\u0001062\b\u00109\u001a\u0004\u0018\u000108H\u0016¢\u0006\u0004\b;\u0010<J\u001f\u0010?\u001a\u00020\u001e2\u0006\u0010=\u001a\u00020\r2\u0006\u0010>\u001a\u00020\rH\u0016¢\u0006\u0004\b?\u0010@J\r\u0010A\u001a\u00020\u001e¢\u0006\u0004\bA\u0010 J\u0017\u0010C\u001a\u00020\u001e2\u0006\u0010B\u001a\u00020\tH\u0014¢\u0006\u0004\bC\u0010DJ\u0019\u0010G\u001a\u00020(2\b\u0010F\u001a\u0004\u0018\u00010EH\u0016¢\u0006\u0004\bG\u0010HJ\u000f\u0010I\u001a\u00020(H\u0016¢\u0006\u0004\bI\u0010JJ/\u0010M\u001a\u00020(2\u0006\u0010=\u001a\u00020\r2\u0006\u0010>\u001a\u00020\r2\u0006\u0010K\u001a\u00020\t2\u0006\u0010L\u001a\u00020\tH\u0016¢\u0006\u0004\bM\u0010NJ\u000f\u0010O\u001a\u00020\tH\u0016¢\u0006\u0004\bO\u0010PJ/\u0010Q\u001a\u00020\u001e2\u0006\u0010=\u001a\u00020\r2\u0006\u0010>\u001a\u00020\r2\u0006\u0010K\u001a\u00020\t2\u0006\u0010L\u001a\u00020\tH\u0016¢\u0006\u0004\bQ\u0010RJ\u001f\u0010S\u001a\u00020\u001e2\u0006\u0010>\u001a\u00020\r2\u0006\u0010L\u001a\u00020\tH\u0016¢\u0006\u0004\bS\u0010TJG\u0010Z\u001a\u00020\u001e2\u0006\u0010>\u001a\u00020\r2\u0006\u0010U\u001a\u00020\t2\u0006\u0010V\u001a\u00020\t2\u0006\u0010W\u001a\u00020\t2\u0006\u0010X\u001a\u00020\t2\u0006\u0010L\u001a\u00020\t2\u0006\u0010Y\u001a\u000206H\u0016¢\u0006\u0004\bZ\u0010[J?\u0010\\\u001a\u00020\u001e2\u0006\u0010>\u001a\u00020\r2\u0006\u0010U\u001a\u00020\t2\u0006\u0010V\u001a\u00020\t2\u0006\u0010W\u001a\u00020\t2\u0006\u0010X\u001a\u00020\t2\u0006\u0010L\u001a\u00020\tH\u0016¢\u0006\u0004\b\\\u0010]J7\u0010`\u001a\u00020\u001e2\u0006\u0010>\u001a\u00020\r2\u0006\u0010^\u001a\u00020\t2\u0006\u0010_\u001a\u00020\t2\u0006\u0010Y\u001a\u0002062\u0006\u0010L\u001a\u00020\tH\u0016¢\u0006\u0004\b`\u0010aJ/\u0010e\u001a\u00020(2\u0006\u0010>\u001a\u00020\r2\u0006\u0010c\u001a\u00020b2\u0006\u0010d\u001a\u00020b2\u0006\u0010Y\u001a\u00020(H\u0016¢\u0006\u0004\be\u0010fJ'\u0010g\u001a\u00020(2\u0006\u0010>\u001a\u00020\r2\u0006\u0010c\u001a\u00020b2\u0006\u0010d\u001a\u00020bH\u0016¢\u0006\u0004\bg\u0010hJ\u000f\u0010i\u001a\u00020(H\u0016¢\u0006\u0004\bi\u0010JR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0004¢\u0006\u0006\n\u0004\bj\u0010kR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\"\u0010lR\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\bm\u0010n\u001a\u0004\bo\u0010\u001aR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0004¢\u0006\u0006\n\u0004\bp\u0010qR6\u0010z\u001a\b\u0012\u0004\u0012\u00020\u001e0r2\f\u0010s\u001a\b\u0012\u0004\u0012\u00020\u001e0r8\u0006@DX\u000e¢\u0006\u0012\n\u0004\bt\u0010u\u001a\u0004\bv\u0010w\"\u0004\bx\u0010yR\u0016\u0010|\u001a\u00020(8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b!\u0010{R8\u0010\u0001\u001a\b\u0012\u0004\u0012\u00020\u001e0r2\f\u0010}\u001a\b\u0012\u0004\u0012\u00020\u001e0r8\u0006@DX\u000e¢\u0006\u0013\n\u0004\b~\u0010u\u001a\u0004\b\u0010w\"\u0005\b\u0001\u0010yR:\u0010\u0001\u001a\b\u0012\u0004\u0012\u00020\u001e0r2\f\u0010}\u001a\b\u0012\u0004\u0012\u00020\u001e0r8\u0006@DX\u000e¢\u0006\u0015\n\u0005\b\u0001\u0010u\u001a\u0005\b\u0001\u0010w\"\u0005\b\u0001\u0010yR2\u0010\u0001\u001a\u00030\u00012\u0007\u0010s\u001a\u00030\u00018\u0006@FX\u000e¢\u0006\u0017\n\u0005\bQ\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001\"\u0006\b\u0001\u0010\u0001R8\u0010\u0001\u001a\u0012\u0012\u0005\u0012\u00030\u0001\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u00018\u0000@\u0000X\u000e¢\u0006\u0017\n\u0005\bS\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001\"\u0006\b\u0001\u0010\u0001R2\u0010\u0001\u001a\u00030\u00012\u0007\u0010s\u001a\u00030\u00018\u0006@FX\u000e¢\u0006\u0017\n\u0005\b`\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001\"\u0006\b\u0001\u0010\u0001R8\u0010\u0001\u001a\u0012\u0012\u0005\u0012\u00030\u0001\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u00018\u0000@\u0000X\u000e¢\u0006\u0017\n\u0005\b\u001f\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001\"\u0006\b\u0001\u0010\u0001R6\u0010¤\u0001\u001a\u0005\u0018\u00010\u00012\t\u0010s\u001a\u0005\u0018\u00010\u00018\u0006@FX\u000e¢\u0006\u0017\n\u0005\bZ\u0010\u0001\u001a\u0006\b \u0001\u0010¡\u0001\"\u0006\b¢\u0001\u0010£\u0001R6\u0010«\u0001\u001a\u0005\u0018\u00010¥\u00012\t\u0010s\u001a\u0005\u0018\u00010¥\u00018\u0006@FX\u000e¢\u0006\u0017\n\u0005\b\\\u0010¦\u0001\u001a\u0006\b§\u0001\u0010¨\u0001\"\u0006\b©\u0001\u0010ª\u0001R\u001b\u0010¬\u0001\u001a\b\u0012\u0004\u0012\u00020\u001e0r8\u0002X\u0004¢\u0006\u0006\n\u0004\bM\u0010uR\u001c\u0010®\u0001\u001a\b\u0012\u0004\u0012\u00020\u001e0r8\u0002X\u0004¢\u0006\u0007\n\u0005\b­\u0001\u0010uR8\u0010²\u0001\u001a\u0011\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u00018\u0000@\u0000X\u000e¢\u0006\u0018\n\u0006\b¯\u0001\u0010\u0001\u001a\u0006\b°\u0001\u0010\u0001\"\u0006\b±\u0001\u0010\u0001R\u0015\u00107\u001a\u0002068\u0002X\u0004¢\u0006\u0007\n\u0005\b+\u0010³\u0001R\u0017\u0010´\u0001\u001a\u00020\t8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bA\u0010kR\u0017\u0010µ\u0001\u001a\u00020\t8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b*\u0010kR\u0017\u0010¸\u0001\u001a\u00030¶\u00018\u0002X\u0004¢\u0006\u0007\n\u0005\b\u0016\u0010·\u0001R\u0017\u0010¹\u0001\u001a\u00020(8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b'\u0010{R\u001d\u0010¿\u0001\u001a\u00030º\u00018\u0006¢\u0006\u0010\n\u0006\b»\u0001\u0010¼\u0001\u001a\u0006\b½\u0001\u0010¾\u0001R\u0018\u0010Ã\u0001\u001a\u00030À\u00018BX\u0004¢\u0006\b\u001a\u0006\bÁ\u0001\u0010Â\u0001R\u0016\u0010Å\u0001\u001a\u00020(8VX\u0004¢\u0006\u0007\u001a\u0005\bÄ\u0001\u0010J¨\u0006Ç\u0001"}, d2 = {"Landroidx/compose/ui/viewinterop/AndroidViewHolder;", "Landroid/view/ViewGroup;", "LI2/G;", "LU0/k;", "LG1/n0;", "Landroid/content/Context;", "context", "LU0/r;", "parentContext", "", "compositeKeyHash", "Lz1/b;", "dispatcher", "Landroid/view/View;", "view", "LG1/m0;", "owner", "<init>", "(Landroid/content/Context;LU0/r;ILz1/b;Landroid/view/View;LG1/m0;)V", "min", "max", "preferred", "u", "(III)I", "Landroidx/compose/ui/viewinterop/InteropView;", "getInteropView", "()Landroid/view/View;", "", "getAccessibilityClassName", "()Ljava/lang/CharSequence;", "LXH/N;", "l", "()V", "f", "b", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "v", "", "changed", "t", "r", "onLayout", "(ZIIII)V", "Landroid/view/ViewGroup$LayoutParams;", "getLayoutParams", "()Landroid/view/ViewGroup$LayoutParams;", "disallowIntercept", "requestDisallowInterceptTouchEvent", "(Z)V", "onAttachedToWindow", "onDetachedFromWindow", "", "location", "Landroid/graphics/Rect;", "dirty", "Landroid/view/ViewParent;", "invalidateChildInParent", "([ILandroid/graphics/Rect;)Landroid/view/ViewParent;", "child", "target", "onDescendantInvalidated", "(Landroid/view/View;Landroid/view/View;)V", "s", "visibility", "onWindowVisibilityChanged", "(I)V", "Landroid/graphics/Region;", "region", "gatherTransparentRegion", "(Landroid/graphics/Region;)Z", "shouldDelayChildPressedState", "()Z", "axes", "type", "o", "(Landroid/view/View;Landroid/view/View;II)Z", "getNestedScrollAxes", "()I", "i", "(Landroid/view/View;Landroid/view/View;II)V", "j", "(Landroid/view/View;I)V", "dxConsumed", "dyConsumed", "dxUnconsumed", "dyUnconsumed", "consumed", "m", "(Landroid/view/View;IIIII[I)V", "n", "(Landroid/view/View;IIIII)V", "dx", "dy", "k", "(Landroid/view/View;II[II)V", "", "velocityX", "velocityY", "onNestedFling", "(Landroid/view/View;FFZ)Z", "onNestedPreFling", "(Landroid/view/View;FF)Z", "isNestedScrollingEnabled", "a", "I", "Lz1/b;", "c", "Landroid/view/View;", "getView", "d", "LG1/m0;", "Lkotlin/Function0;", "value", "e", "LnI/a;", "getUpdate", "()LnI/a;", "setUpdate", "(LnI/a;)V", "update", "Z", "hasUpdateBlock", "<set-?>", "g", "getReset", "setReset", "reset", "h", "getRelease", "setRelease", "release", "Landroidx/compose/ui/d;", "Landroidx/compose/ui/d;", "getModifier", "()Landroidx/compose/ui/d;", "setModifier", "(Landroidx/compose/ui/d;)V", "modifier", "Lkotlin/Function1;", "LnI/l;", "getOnModifierChanged$ui_release", "()LnI/l;", "setOnModifierChanged$ui_release", "(LnI/l;)V", "onModifierChanged", "Lc2/d;", "Lc2/d;", "getDensity", "()Lc2/d;", "setDensity", "(Lc2/d;)V", "density", "getOnDensityChanged$ui_release", "setOnDensityChanged$ui_release", "onDensityChanged", "Landroidx/lifecycle/y;", "Landroidx/lifecycle/y;", "getLifecycleOwner", "()Landroidx/lifecycle/y;", "setLifecycleOwner", "(Landroidx/lifecycle/y;)V", "lifecycleOwner", "LP4/f;", "LP4/f;", "getSavedStateRegistryOwner", "()LP4/f;", "setSavedStateRegistryOwner", "(LP4/f;)V", "savedStateRegistryOwner", "runUpdate", "p", "runInvalidate", "q", "getOnRequestDisallowInterceptTouchEvent$ui_release", "setOnRequestDisallowInterceptTouchEvent$ui_release", "onRequestDisallowInterceptTouchEvent", "[I", "lastWidthMeasureSpec", "lastHeightMeasureSpec", "LI2/H;", "LI2/H;", "nestedScrollingParentHelper", "isDrawing", "LG1/G;", "w", "LG1/G;", "getLayoutNode", "()LG1/G;", "layoutNode", "LG1/o0;", "getSnapshotObserver", "()LG1/o0;", "snapshotObserver", "f1", "isValidOwnerScope", "x", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class AndroidViewHolder extends ViewGroup implements G, C4885k, n0 {

    /* renamed from: x  reason: collision with root package name */
    public static final b f19708x = new b((DefaultConstructorMarker) null);

    /* renamed from: y  reason: collision with root package name */
    public static final int f19709y = 8;
    /* access modifiers changed from: private */

    /* renamed from: z  reason: collision with root package name */
    public static final C17642l<AndroidViewHolder, C16807N> f19710z = a.f19734c;

    /* renamed from: a  reason: collision with root package name */
    private final int f19711a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final C6272b f19712b;

    /* renamed from: c  reason: collision with root package name */
    private final View f19713c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final m0 f19714d;

    /* renamed from: e  reason: collision with root package name */
    private C17631a<C16807N> f19715e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public boolean f19716f;

    /* renamed from: g  reason: collision with root package name */
    private C17631a<C16807N> f19717g;

    /* renamed from: h  reason: collision with root package name */
    private C17631a<C16807N> f19718h;

    /* renamed from: i  reason: collision with root package name */
    private androidx.compose.ui.d f19719i;

    /* renamed from: j  reason: collision with root package name */
    private C17642l<? super androidx.compose.ui.d, C16807N> f19720j;

    /* renamed from: k  reason: collision with root package name */
    private c2.d f19721k;

    /* renamed from: l  reason: collision with root package name */
    private C17642l<? super c2.d, C16807N> f19722l;

    /* renamed from: m  reason: collision with root package name */
    private C5221y f19723m;

    /* renamed from: n  reason: collision with root package name */
    private P4.f f19724n;
    /* access modifiers changed from: private */

    /* renamed from: o  reason: collision with root package name */
    public final C17631a<C16807N> f19725o;

    /* renamed from: p  reason: collision with root package name */
    private final C17631a<C16807N> f19726p;

    /* renamed from: q  reason: collision with root package name */
    private C17642l<? super Boolean, C16807N> f19727q;

    /* renamed from: r  reason: collision with root package name */
    private final int[] f19728r;

    /* renamed from: s  reason: collision with root package name */
    private int f19729s;

    /* renamed from: t  reason: collision with root package name */
    private int f19730t;

    /* renamed from: u  reason: collision with root package name */
    private final H f19731u;
    /* access modifiers changed from: private */

    /* renamed from: v  reason: collision with root package name */
    public boolean f19732v;

    /* renamed from: w  reason: collision with root package name */
    private final G1.G f19733w;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/viewinterop/AndroidViewHolder;", "it", "LXH/N;", "b", "(Landroidx/compose/ui/viewinterop/AndroidViewHolder;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends C17544u implements C17642l<AndroidViewHolder, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        public static final a f19734c = new a();

        a() {
            super(1);
        }

        /* access modifiers changed from: private */
        public static final void c(C17631a aVar) {
            aVar.invoke();
        }

        public final void b(AndroidViewHolder androidViewHolder) {
            androidViewHolder.getHandler().post(new c(androidViewHolder.f19725o));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((AndroidViewHolder) obj);
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/compose/ui/viewinterop/AndroidViewHolder$b;", "", "<init>", "()V", "Lkotlin/Function1;", "Landroidx/compose/ui/viewinterop/AndroidViewHolder;", "LXH/N;", "OnCommitAffectingUpdate", "LnI/l;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/d;", "it", "LXH/N;", "a", "(Landroidx/compose/ui/d;)V"}, k = 3, mv = {1, 8, 0})
    static final class c extends C17544u implements C17642l<androidx.compose.ui.d, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ G1.G f19735c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f19736d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(G1.G g10, androidx.compose.ui.d dVar) {
            super(1);
            this.f19735c = g10;
            this.f19736d = dVar;
        }

        public final void a(androidx.compose.ui.d dVar) {
            this.f19735c.j(dVar.s(this.f19736d));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((androidx.compose.ui.d) obj);
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lc2/d;", "it", "LXH/N;", "a", "(Lc2/d;)V"}, k = 3, mv = {1, 8, 0})
    static final class d extends C17544u implements C17642l<c2.d, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ G1.G f19737c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(G1.G g10) {
            super(1);
            this.f19737c = g10;
        }

        public final void a(c2.d dVar) {
            this.f19737c.a(dVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((c2.d) obj);
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LG1/m0;", "owner", "LXH/N;", "a", "(LG1/m0;)V"}, k = 3, mv = {1, 8, 0})
    static final class e extends C17544u implements C17642l<m0, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ AndroidViewHolder f19738c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ G1.G f19739d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(AndroidViewHolder androidViewHolder, G1.G g10) {
            super(1);
            this.f19738c = androidViewHolder;
            this.f19739d = g10;
        }

        public final void a(m0 m0Var) {
            AndroidComposeView androidComposeView = m0Var instanceof AndroidComposeView ? (AndroidComposeView) m0Var : null;
            if (androidComposeView != null) {
                androidComposeView.b0(this.f19738c, this.f19739d);
            }
            ViewParent parent = this.f19738c.getView().getParent();
            AndroidViewHolder androidViewHolder = this.f19738c;
            if (parent != androidViewHolder) {
                androidViewHolder.addView(androidViewHolder.getView());
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((m0) obj);
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LG1/m0;", "owner", "LXH/N;", "a", "(LG1/m0;)V"}, k = 3, mv = {1, 8, 0})
    static final class f extends C17544u implements C17642l<m0, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ AndroidViewHolder f19740c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(AndroidViewHolder androidViewHolder) {
            super(1);
            this.f19740c = androidViewHolder;
        }

        public final void a(m0 m0Var) {
            AndroidComposeView androidComposeView = m0Var instanceof AndroidComposeView ? (AndroidComposeView) m0Var : null;
            if (androidComposeView != null) {
                androidComposeView.K0(this.f19740c);
            }
            this.f19740c.removeAllViewsInLayout();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((m0) obj);
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u00009\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0007\u0010\u0005J,\u0010\u000f\u001a\u00020\u000e*\u00020\b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\r\u001a\u00020\fH\u0016ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J)\u0010\u0013\u001a\u00020\u0002*\u00020\u00112\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00120\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J)\u0010\u0015\u001a\u00020\u0002*\u00020\u00112\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00120\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0015\u0010\u0014J)\u0010\u0016\u001a\u00020\u0002*\u00020\u00112\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00120\t2\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0016\u0010\u0014J)\u0010\u0017\u001a\u00020\u0002*\u00020\u00112\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00120\t2\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0017\u0010\u0014\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0018"}, d2 = {"androidx/compose/ui/viewinterop/AndroidViewHolder$g", "LE1/I;", "", "height", "c", "(I)I", "width", "b", "LE1/K;", "", "LE1/H;", "measurables", "Lc2/b;", "constraints", "LE1/J;", "i", "(LE1/K;Ljava/util/List;J)LE1/J;", "LE1/r;", "LE1/q;", "a", "(LE1/r;Ljava/util/List;I)I", "d", "j", "h", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class g implements I {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AndroidViewHolder f19741a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ G1.G f19742b;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LE1/a0$a;", "LXH/N;", "a", "(LE1/a0$a;)V"}, k = 3, mv = {1, 8, 0})
        static final class a extends C17544u implements C17642l<a0.a, C16807N> {

            /* renamed from: c  reason: collision with root package name */
            public static final a f19743c = new a();

            a() {
                super(1);
            }

            public final void a(a0.a aVar) {
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((a0.a) obj);
                return C16807N.f139792a;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LE1/a0$a;", "LXH/N;", "a", "(LE1/a0$a;)V"}, k = 3, mv = {1, 8, 0})
        static final class b extends C17544u implements C17642l<a0.a, C16807N> {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ AndroidViewHolder f19744c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ G1.G f19745d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            b(AndroidViewHolder androidViewHolder, G1.G g10) {
                super(1);
                this.f19744c = androidViewHolder;
                this.f19745d = g10;
            }

            public final void a(a0.a aVar) {
                d.f(this.f19744c, this.f19745d);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((a0.a) obj);
                return C16807N.f139792a;
            }
        }

        g(AndroidViewHolder androidViewHolder, G1.G g10) {
            this.f19741a = androidViewHolder;
            this.f19742b = g10;
        }

        private final int b(int i10) {
            AndroidViewHolder androidViewHolder = this.f19741a;
            ViewGroup.LayoutParams layoutParams = androidViewHolder.getLayoutParams();
            C17542s.g(layoutParams);
            androidViewHolder.measure(androidViewHolder.u(0, i10, layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
            return this.f19741a.getMeasuredHeight();
        }

        private final int c(int i10) {
            AndroidViewHolder androidViewHolder = this.f19741a;
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            AndroidViewHolder androidViewHolder2 = this.f19741a;
            ViewGroup.LayoutParams layoutParams = androidViewHolder2.getLayoutParams();
            C17542s.g(layoutParams);
            androidViewHolder.measure(makeMeasureSpec, androidViewHolder2.u(0, i10, layoutParams.height));
            return this.f19741a.getMeasuredWidth();
        }

        public int a(r rVar, List<? extends C4484q> list, int i10) {
            return c(i10);
        }

        public int d(r rVar, List<? extends C4484q> list, int i10) {
            return c(i10);
        }

        public int h(r rVar, List<? extends C4484q> list, int i10) {
            return b(i10);
        }

        public J i(K k10, List<? extends E1.H> list, long j10) {
            if (this.f19741a.getChildCount() == 0) {
                return K.v0(k10, C5267b.n(j10), C5267b.m(j10), (Map) null, a.f19743c, 4, (Object) null);
            }
            if (C5267b.n(j10) != 0) {
                this.f19741a.getChildAt(0).setMinimumWidth(C5267b.n(j10));
            }
            if (C5267b.m(j10) != 0) {
                this.f19741a.getChildAt(0).setMinimumHeight(C5267b.m(j10));
            }
            AndroidViewHolder androidViewHolder = this.f19741a;
            int n10 = C5267b.n(j10);
            int l10 = C5267b.l(j10);
            ViewGroup.LayoutParams layoutParams = this.f19741a.getLayoutParams();
            C17542s.g(layoutParams);
            int q10 = androidViewHolder.u(n10, l10, layoutParams.width);
            AndroidViewHolder androidViewHolder2 = this.f19741a;
            int m10 = C5267b.m(j10);
            int k11 = C5267b.k(j10);
            ViewGroup.LayoutParams layoutParams2 = this.f19741a.getLayoutParams();
            C17542s.g(layoutParams2);
            androidViewHolder.measure(q10, androidViewHolder2.u(m10, k11, layoutParams2.height));
            return K.v0(k10, this.f19741a.getMeasuredWidth(), this.f19741a.getMeasuredHeight(), (Map) null, new b(this.f19741a, this.f19742b), 4, (Object) null);
        }

        public int j(r rVar, List<? extends C4484q> list, int i10) {
            return b(i10);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LL1/x;", "LXH/N;", "a", "(LL1/x;)V"}, k = 3, mv = {1, 8, 0})
    static final class h extends C17544u implements C17642l<x, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        public static final h f19746c = new h();

        h() {
            super(1);
        }

        public final void a(x xVar) {
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((x) obj);
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lr1/f;", "LXH/N;", "a", "(Lr1/f;)V"}, k = 3, mv = {1, 8, 0})
    static final class i extends C17544u implements C17642l<r1.f, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ AndroidViewHolder f19747c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ G1.G f19748d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ AndroidViewHolder f19749e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(AndroidViewHolder androidViewHolder, G1.G g10, AndroidViewHolder androidViewHolder2) {
            super(1);
            this.f19747c = androidViewHolder;
            this.f19748d = g10;
            this.f19749e = androidViewHolder2;
        }

        public final void a(r1.f fVar) {
            AndroidViewHolder androidViewHolder = this.f19747c;
            G1.G g10 = this.f19748d;
            AndroidViewHolder androidViewHolder2 = this.f19749e;
            C5732n0 e10 = fVar.I1().e();
            if (androidViewHolder.getView().getVisibility() != 8) {
                androidViewHolder.f19732v = true;
                m0 p02 = g10.p0();
                AndroidComposeView androidComposeView = p02 instanceof AndroidComposeView ? (AndroidComposeView) p02 : null;
                if (androidComposeView != null) {
                    androidComposeView.k0(androidViewHolder2, C5702H.d(e10));
                }
                androidViewHolder.f19732v = false;
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((r1.f) obj);
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LE1/v;", "it", "LXH/N;", "a", "(LE1/v;)V"}, k = 3, mv = {1, 8, 0})
    static final class j extends C17544u implements C17642l<C4488v, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ AndroidViewHolder f19750c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ G1.G f19751d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(AndroidViewHolder androidViewHolder, G1.G g10) {
            super(1);
            this.f19750c = androidViewHolder;
            this.f19751d = g10;
        }

        public final void a(C4488v vVar) {
            d.f(this.f19750c, this.f19751d);
            this.f19750c.f19714d.h(this.f19750c);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C4488v) obj);
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {1, 8, 0})
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.ui.viewinterop.AndroidViewHolder$onNestedFling$1", f = "AndroidViewHolder.android.kt", l = {565, 570}, m = "invokeSuspend")
    static final class k extends kotlin.coroutines.jvm.internal.l implements nI.p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f19752c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ boolean f19753d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ AndroidViewHolder f19754e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ long f19755f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(boolean z10, AndroidViewHolder androidViewHolder, long j10, C17164e<? super k> eVar) {
            super(2, eVar);
            this.f19753d = z10;
            this.f19754e = androidViewHolder;
            this.f19755f = j10;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new k(this.f19753d, this.f19754e, this.f19755f, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((k) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f19752c;
            if (i10 == 0) {
                y.b(obj);
                if (!this.f19753d) {
                    C6272b c10 = this.f19754e.f19712b;
                    long a10 = c2.y.f23066b.a();
                    long j10 = this.f19755f;
                    this.f19752c = 1;
                    if (c10.a(a10, j10, this) == f10) {
                        return f10;
                    }
                } else {
                    C6272b c11 = this.f19754e.f19712b;
                    long j11 = this.f19755f;
                    long a11 = c2.y.f23066b.a();
                    this.f19752c = 2;
                    if (c11.a(j11, a11, this) == f10) {
                        return f10;
                    }
                }
            } else if (i10 == 1 || i10 == 2) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {1, 8, 0})
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.ui.viewinterop.AndroidViewHolder$onNestedPreFling$1", f = "AndroidViewHolder.android.kt", l = {583}, m = "invokeSuspend")
    static final class l extends kotlin.coroutines.jvm.internal.l implements nI.p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f19756c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ AndroidViewHolder f19757d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ long f19758e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(AndroidViewHolder androidViewHolder, long j10, C17164e<? super l> eVar) {
            super(2, eVar);
            this.f19757d = androidViewHolder;
            this.f19758e = j10;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new l(this.f19757d, this.f19758e, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((l) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f19756c;
            if (i10 == 0) {
                y.b(obj);
                C6272b c10 = this.f19757d.f19712b;
                long j10 = this.f19758e;
                this.f19756c = 1;
                if (c10.c(j10, this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LXH/N;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class m extends C17544u implements C17631a<C16807N> {

        /* renamed from: c  reason: collision with root package name */
        public static final m f19759c = new m();

        m() {
            super(0);
        }

        public final void invoke() {
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LXH/N;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class n extends C17544u implements C17631a<C16807N> {

        /* renamed from: c  reason: collision with root package name */
        public static final n f19760c = new n();

        n() {
            super(0);
        }

        public final void invoke() {
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LXH/N;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class o extends C17544u implements C17631a<C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ AndroidViewHolder f19761c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        o(AndroidViewHolder androidViewHolder) {
            super(0);
            this.f19761c = androidViewHolder;
        }

        public final void invoke() {
            this.f19761c.getLayoutNode().E0();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LXH/N;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class p extends C17544u implements C17631a<C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ AndroidViewHolder f19762c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        p(AndroidViewHolder androidViewHolder) {
            super(0);
            this.f19762c = androidViewHolder;
        }

        public final void invoke() {
            AndroidViewHolder androidViewHolder;
            if (this.f19762c.f19716f && this.f19762c.isAttachedToWindow() && this.f19762c.getView().getParent() == (androidViewHolder = this.f19762c)) {
                androidViewHolder.getSnapshotObserver().i(this.f19762c, AndroidViewHolder.f19710z, this.f19762c.getUpdate());
            }
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LXH/N;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class q extends C17544u implements C17631a<C16807N> {

        /* renamed from: c  reason: collision with root package name */
        public static final q f19763c = new q();

        q() {
            super(0);
        }

        public final void invoke() {
        }
    }

    public AndroidViewHolder(Context context, U0.r rVar, int i10, C6272b bVar, View view, m0 m0Var) {
        super(context);
        this.f19711a = i10;
        this.f19712b = bVar;
        this.f19713c = view;
        this.f19714d = m0Var;
        if (rVar != null) {
            H1.i(this, rVar);
        }
        setSaveFromParentEnabled(false);
        addView(view);
        this.f19715e = q.f19763c;
        this.f19717g = n.f19760c;
        this.f19718h = m.f19759c;
        d.a aVar = androidx.compose.ui.d.f18749a;
        this.f19719i = aVar;
        this.f19721k = c2.f.b(1.0f, 0.0f, 2, (Object) null);
        this.f19725o = new p(this);
        this.f19726p = new o(this);
        this.f19728r = new int[2];
        this.f19729s = Integer.MIN_VALUE;
        this.f19730t = Integer.MIN_VALUE;
        this.f19731u = new H(this);
        G1.G g10 = new G1.G(false, 0, 3, (DefaultConstructorMarker) null);
        g10.D1(this);
        androidx.compose.ui.d a10 = androidx.compose.ui.layout.c.a(androidx.compose.ui.draw.b.b(M.a(L1.o.c(androidx.compose.ui.input.nestedscroll.a.a(aVar, d.f19804a, bVar), true, h.f19746c), this), new i(this, g10, this)), new j(this, g10));
        g10.e(i10);
        g10.j(this.f19719i.s(a10));
        this.f19720j = new c(g10, a10);
        g10.a(this.f19721k);
        this.f19722l = new d(g10);
        g10.H1(new e(this, g10));
        g10.I1(new f(this));
        g10.m(new g(this, g10));
        this.f19733w = g10;
    }

    /* access modifiers changed from: private */
    public final o0 getSnapshotObserver() {
        if (!isAttachedToWindow()) {
            D1.a.b("Expected AndroidViewHolder to be attached when observing reads.");
        }
        return this.f19714d.getSnapshotObserver();
    }

    /* access modifiers changed from: private */
    public static final void t(C17631a aVar) {
        aVar.invoke();
    }

    /* access modifiers changed from: private */
    public final int u(int i10, int i11, int i12) {
        return (i12 >= 0 || i10 == i11) ? View.MeasureSpec.makeMeasureSpec(C17978n.m(i12, i10, i11), CatalogRepository.FETCH_FLAG_SDB) : (i12 != -2 || i11 == Integer.MAX_VALUE) ? (i12 != -1 || i11 == Integer.MAX_VALUE) ? View.MeasureSpec.makeMeasureSpec(0, 0) : View.MeasureSpec.makeMeasureSpec(i11, CatalogRepository.FETCH_FLAG_SDB) : View.MeasureSpec.makeMeasureSpec(i11, Integer.MIN_VALUE);
    }

    public void b() {
        this.f19718h.invoke();
    }

    public void f() {
        this.f19717g.invoke();
        removeAllViewsInLayout();
    }

    public boolean f1() {
        return isAttachedToWindow();
    }

    public boolean gatherTransparentRegion(Region region) {
        if (region == null) {
            return true;
        }
        getLocationInWindow(this.f19728r);
        int[] iArr = this.f19728r;
        int i10 = iArr[0];
        region.op(i10, iArr[1], i10 + getWidth(), this.f19728r[1] + getHeight(), Region.Op.DIFFERENCE);
        return true;
    }

    public CharSequence getAccessibilityClassName() {
        return getClass().getName();
    }

    public final c2.d getDensity() {
        return this.f19721k;
    }

    public final View getInteropView() {
        return this.f19713c;
    }

    public final G1.G getLayoutNode() {
        return this.f19733w;
    }

    public ViewGroup.LayoutParams getLayoutParams() {
        ViewGroup.LayoutParams layoutParams = this.f19713c.getLayoutParams();
        return layoutParams == null ? new ViewGroup.LayoutParams(-1, -1) : layoutParams;
    }

    public final C5221y getLifecycleOwner() {
        return this.f19723m;
    }

    public final androidx.compose.ui.d getModifier() {
        return this.f19719i;
    }

    public int getNestedScrollAxes() {
        return this.f19731u.a();
    }

    public final C17642l<c2.d, C16807N> getOnDensityChanged$ui_release() {
        return this.f19722l;
    }

    public final C17642l<androidx.compose.ui.d, C16807N> getOnModifierChanged$ui_release() {
        return this.f19720j;
    }

    public final C17642l<Boolean, C16807N> getOnRequestDisallowInterceptTouchEvent$ui_release() {
        return this.f19727q;
    }

    public final C17631a<C16807N> getRelease() {
        return this.f19718h;
    }

    public final C17631a<C16807N> getReset() {
        return this.f19717g;
    }

    public final P4.f getSavedStateRegistryOwner() {
        return this.f19724n;
    }

    public final C17631a<C16807N> getUpdate() {
        return this.f19715e;
    }

    public final View getView() {
        return this.f19713c;
    }

    public void i(View view, View view2, int i10, int i11) {
        this.f19731u.c(view, view2, i10, i11);
    }

    public ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        super.invalidateChildInParent(iArr, rect);
        s();
        return null;
    }

    public boolean isNestedScrollingEnabled() {
        return this.f19713c.isNestedScrollingEnabled();
    }

    public void j(View view, int i10) {
        this.f19731u.e(view, i10);
    }

    public void k(View view, int i10, int i11, int[] iArr, int i12) {
        if (isNestedScrollingEnabled()) {
            long d10 = this.f19712b.d(C5668h.a(d.g(i10), d.g(i11)), d.i(i12));
            iArr[0] = E0.f(C5667g.m(d10));
            iArr[1] = E0.f(C5667g.n(d10));
        }
    }

    public void l() {
        if (this.f19713c.getParent() != this) {
            addView(this.f19713c);
        } else {
            this.f19717g.invoke();
        }
    }

    public void m(View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        if (isNestedScrollingEnabled()) {
            long b10 = this.f19712b.b(C5668h.a(d.g(i10), d.g(i11)), C5668h.a(d.g(i12), d.g(i13)), d.i(i14));
            iArr[0] = E0.f(C5667g.m(b10));
            iArr[1] = E0.f(C5667g.n(b10));
        }
    }

    public void n(View view, int i10, int i11, int i12, int i13, int i14) {
        if (isNestedScrollingEnabled()) {
            this.f19712b.b(C5668h.a(d.g(i10), d.g(i11)), C5668h.a(d.g(i12), d.g(i13)), d.i(i14));
        }
    }

    public boolean o(View view, View view2, int i10, int i11) {
        return ((i10 & 2) == 0 && (i10 & 1) == 0) ? false : true;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f19725o.invoke();
    }

    public void onDescendantInvalidated(View view, View view2) {
        super.onDescendantInvalidated(view, view2);
        s();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getSnapshotObserver().a(this);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        this.f19713c.layout(0, 0, i12 - i10, i13 - i11);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i10, int i11) {
        if (this.f19713c.getParent() != this) {
            setMeasuredDimension(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
        } else if (this.f19713c.getVisibility() == 8) {
            setMeasuredDimension(0, 0);
        } else {
            this.f19713c.measure(i10, i11);
            setMeasuredDimension(this.f19713c.getMeasuredWidth(), this.f19713c.getMeasuredHeight());
            this.f19729s = i10;
            this.f19730t = i11;
        }
    }

    public boolean onNestedFling(View view, float f10, float f11, boolean z10) {
        if (!isNestedScrollingEnabled()) {
            return false;
        }
        long a10 = z.a(d.h(f10), d.h(f11));
        F0 unused = C16314k.d(this.f19712b.e(), (C17168i) null, (T) null, new k(z10, this, a10, (C17164e<? super k>) null), 3, (Object) null);
        return false;
    }

    public boolean onNestedPreFling(View view, float f10, float f11) {
        if (!isNestedScrollingEnabled()) {
            return false;
        }
        F0 unused = C16314k.d(this.f19712b.e(), (C17168i) null, (T) null, new l(this, z.a(d.h(f10), d.h(f11)), (C17164e<? super l>) null), 3, (Object) null);
        return false;
    }

    /* access modifiers changed from: protected */
    public void onWindowVisibilityChanged(int i10) {
        super.onWindowVisibilityChanged(i10);
    }

    public void requestDisallowInterceptTouchEvent(boolean z10) {
        C17642l<? super Boolean, C16807N> lVar = this.f19727q;
        if (lVar != null) {
            lVar.invoke(Boolean.valueOf(z10));
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }

    public final void s() {
        if (this.f19732v) {
            this.f19713c.postOnAnimation(new b(this.f19726p));
        } else {
            this.f19733w.E0();
        }
    }

    public final void setDensity(c2.d dVar) {
        if (dVar != this.f19721k) {
            this.f19721k = dVar;
            C17642l<? super c2.d, C16807N> lVar = this.f19722l;
            if (lVar != null) {
                lVar.invoke(dVar);
            }
        }
    }

    public final void setLifecycleOwner(C5221y yVar) {
        if (yVar != this.f19723m) {
            this.f19723m = yVar;
            l0.b(this, yVar);
        }
    }

    public final void setModifier(androidx.compose.ui.d dVar) {
        if (dVar != this.f19719i) {
            this.f19719i = dVar;
            C17642l<? super androidx.compose.ui.d, C16807N> lVar = this.f19720j;
            if (lVar != null) {
                lVar.invoke(dVar);
            }
        }
    }

    public final void setOnDensityChanged$ui_release(C17642l<? super c2.d, C16807N> lVar) {
        this.f19722l = lVar;
    }

    public final void setOnModifierChanged$ui_release(C17642l<? super androidx.compose.ui.d, C16807N> lVar) {
        this.f19720j = lVar;
    }

    public final void setOnRequestDisallowInterceptTouchEvent$ui_release(C17642l<? super Boolean, C16807N> lVar) {
        this.f19727q = lVar;
    }

    /* access modifiers changed from: protected */
    public final void setRelease(C17631a<C16807N> aVar) {
        this.f19718h = aVar;
    }

    /* access modifiers changed from: protected */
    public final void setReset(C17631a<C16807N> aVar) {
        this.f19717g = aVar;
    }

    public final void setSavedStateRegistryOwner(P4.f fVar) {
        if (fVar != this.f19724n) {
            this.f19724n = fVar;
            P4.g.b(this, fVar);
        }
    }

    /* access modifiers changed from: protected */
    public final void setUpdate(C17631a<C16807N> aVar) {
        this.f19715e = aVar;
        this.f19716f = true;
        this.f19725o.invoke();
    }

    public boolean shouldDelayChildPressedState() {
        return true;
    }

    public final void v() {
        int i10;
        int i11 = this.f19729s;
        if (i11 != Integer.MIN_VALUE && (i10 = this.f19730t) != Integer.MIN_VALUE) {
            measure(i11, i10);
        }
    }
}
