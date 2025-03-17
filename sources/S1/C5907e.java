package s1;

import XH.C16807N;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.os.Build;
import android.view.DisplayListCanvas;
import android.view.RenderNode;
import android.view.View;
import c2.d;
import c2.r;
import c2.s;
import c2.t;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17642l;
import o1.C5667g;
import o1.C5668h;
import p1.C5701G;
import p1.C5702H;
import p1.C5712d0;
import p1.C5732n0;
import p1.C5734o0;
import p1.C5747v0;
import p1.C5749w0;
import p1.C5751x0;
import p1.d1;
import r1.C5815a;
import r1.f;
import s1.C5904b;

@Metadata(d1 = {"\u0000¾\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 b2\u00020\u0001:\u0001cB+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0016\u0010\u0015J\u0017\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ*\u0010 \u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016ø\u0001\u0000¢\u0006\u0004\b \u0010!J$\u0010%\u001a\u00020\u000e2\b\u0010#\u001a\u0004\u0018\u00010\"2\u0006\u0010$\u001a\u00020\u001eH\u0016ø\u0001\u0000¢\u0006\u0004\b%\u0010&J;\u00100\u001a\u00020\u000e2\u0006\u0010(\u001a\u00020'2\u0006\u0010*\u001a\u00020)2\u0006\u0010,\u001a\u00020+2\u0012\u0010/\u001a\u000e\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020\u000e0-H\u0016¢\u0006\u0004\b0\u00101J\u0017\u00104\u001a\u00020\u000e2\u0006\u00103\u001a\u000202H\u0016¢\u0006\u0004\b4\u00105J\u000f\u00107\u001a\u000206H\u0016¢\u0006\u0004\b7\u00108J\u000f\u00109\u001a\u00020\u000eH\u0016¢\u0006\u0004\b9\u0010\u0015J\u000f\u0010:\u001a\u00020\u000eH\u0000¢\u0006\u0004\b:\u0010\u0015R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0004¢\u0006\f\n\u0004\b\u0016\u0010;\u001a\u0004\b<\u0010=R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b9\u0010>R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u001c\u0010\u001f\u001a\u00020\u001e8\u0002@\u0002X\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\bC\u0010;R\u0018\u0010G\u001a\u0004\u0018\u00010D8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bE\u0010FR\u0018\u0010J\u001a\u0004\u0018\u0001068\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bH\u0010IR\u0016\u0010M\u001a\u00020\u00118\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bK\u0010LR\u001c\u0010$\u001a\u00020\u001e8\u0002@\u0002X\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\bN\u0010;R0\u0010\r\u001a\u00020\f2\u0006\u0010O\u001a\u00020\f8\u0016@VX\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010S\"\u0004\b;\u0010\u0010R0\u0010X\u001a\u00020T2\u0006\u0010O\u001a\u00020T8\u0016@VX\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\bU\u0010Q\u001a\u0004\bV\u0010S\"\u0004\bW\u0010\u0010R.\u0010_\u001a\u0004\u0018\u00010Y2\b\u0010O\u001a\u0004\u0018\u00010Y8\u0016@VX\u000e¢\u0006\u0012\n\u0004\bZ\u0010[\u001a\u0004\bH\u0010\\\"\u0004\b]\u0010^R*\u0010f\u001a\u00020`2\u0006\u0010O\u001a\u00020`8\u0016@VX\u000e¢\u0006\u0012\n\u0004\ba\u0010b\u001a\u0004\bc\u0010d\"\u0004\b?\u0010eR\u0016\u0010h\u001a\u00020\u00118\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bg\u0010LR0\u0010m\u001a\u00020i2\u0006\u0010O\u001a\u00020i8\u0016@VX\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\bj\u0010;\u001a\u0004\bk\u0010=\"\u0004\bQ\u0010lR*\u0010n\u001a\u00020`2\u0006\u0010O\u001a\u00020`8\u0016@VX\u000e¢\u0006\u0012\n\u0004\bV\u0010b\u001a\u0004\bb\u0010d\"\u0004\bE\u0010eR*\u0010q\u001a\u00020`2\u0006\u0010O\u001a\u00020`8\u0016@VX\u000e¢\u0006\u0012\n\u0004\bo\u0010b\u001a\u0004\bp\u0010d\"\u0004\bZ\u0010eR*\u0010t\u001a\u00020`2\u0006\u0010O\u001a\u00020`8\u0016@VX\u000e¢\u0006\u0012\n\u0004\br\u0010b\u001a\u0004\bs\u0010d\"\u0004\bg\u0010eR*\u0010v\u001a\u00020`2\u0006\u0010O\u001a\u00020`8\u0016@VX\u000e¢\u0006\u0012\n\u0004\bR\u0010b\u001a\u0004\bu\u0010d\"\u0004\bA\u0010eR*\u0010y\u001a\u00020`2\u0006\u0010O\u001a\u00020`8\u0016@VX\u000e¢\u0006\u0012\n\u0004\b4\u0010b\u001a\u0004\bw\u0010d\"\u0004\bx\u0010eR0\u0010|\u001a\u00020z2\u0006\u0010O\u001a\u00020z8\u0016@VX\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b{\u0010;\u001a\u0004\b\u001c\u0010=\"\u0004\b{\u0010lR0\u0010\u001a\u00020z2\u0006\u0010O\u001a\u00020z8\u0016@VX\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b \u0010;\u001a\u0004\b}\u0010=\"\u0004\b~\u0010lR,\u0010\u0001\u001a\u00020`2\u0006\u0010O\u001a\u00020`8\u0016@VX\u000e¢\u0006\u0013\n\u0004\b\u001c\u0010b\u001a\u0005\b\u0001\u0010d\"\u0004\bN\u0010eR+\u0010\u0001\u001a\u00020`2\u0006\u0010O\u001a\u00020`8\u0016@VX\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010b\u001a\u0004\br\u0010d\"\u0004\bP\u0010eR+\u0010\u0001\u001a\u00020`2\u0006\u0010O\u001a\u00020`8\u0016@VX\u000e¢\u0006\u0012\n\u0004\b0\u0010b\u001a\u0004\bC\u0010d\"\u0004\bU\u0010eR,\u0010\u0001\u001a\u00020`2\u0006\u0010O\u001a\u00020`8\u0016@VX\u000e¢\u0006\u0013\n\u0005\b\u0001\u0010b\u001a\u0004\b\u001d\u0010d\"\u0004\bK\u0010eR.\u0010\u0001\u001a\u00020\u00112\u0006\u0010O\u001a\u00020\u00118\u0016@VX\u000e¢\u0006\u0015\n\u0004\b}\u0010L\u001a\u0005\b\u0001\u0010\u0013\"\u0006\b\u0001\u0010\u0001R\u0017\u0010\u0001\u001a\u00020\u00118\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b~\u0010LR\u0017\u0010\u0001\u001a\u00020\u00118\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b7\u0010LR'\u0010\u0001\u001a\u00020\u00118\u0016@\u0016X\u000e¢\u0006\u0016\n\u0005\b\u0001\u0010L\u001a\u0005\b\u0001\u0010\u0013\"\u0006\b\u0001\u0010\u0001R*\u0010\u0001\u001a\u0005\u0018\u00010\u00018\u0016@\u0016X\u000e¢\u0006\u0016\n\u0006\b\u0001\u0010\u0001\u001a\u0005\bo\u0010\u0001\"\u0005\ba\u0010\u0001R\u0015\u0010\u0001\u001a\u00020\u00118VX\u0004¢\u0006\u0006\u001a\u0004\bj\u0010\u0013\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0001"}, d2 = {"Ls1/e;", "Landroidx/compose/ui/graphics/layer/a;", "Landroid/view/View;", "ownerView", "", "ownerId", "Lp1/o0;", "canvasHolder", "Lr1/a;", "canvasDrawScope", "<init>", "(Landroid/view/View;JLp1/o0;Lr1/a;)V", "Ls1/b;", "compositingStrategy", "LXH/N;", "O", "(I)V", "", "S", "()Z", "T", "()V", "b", "Landroid/view/RenderNode;", "renderNode", "U", "(Landroid/view/RenderNode;)V", "", "x", "y", "Lc2/r;", "size", "w", "(IIJ)V", "Landroid/graphics/Outline;", "outline", "outlineSize", "H", "(Landroid/graphics/Outline;J)V", "Lc2/d;", "density", "Lc2/t;", "layoutDirection", "Ls1/c;", "layer", "Lkotlin/Function1;", "Lr1/f;", "block", "z", "(Lc2/d;Lc2/t;Ls1/c;LnI/l;)V", "Lp1/n0;", "canvas", "u", "(Lp1/n0;)V", "Landroid/graphics/Matrix;", "D", "()Landroid/graphics/Matrix;", "c", "P", "J", "getOwnerId", "()J", "Lp1/o0;", "d", "Lr1/a;", "e", "Landroid/view/RenderNode;", "f", "Landroid/graphics/Paint;", "g", "Landroid/graphics/Paint;", "layerPaint", "h", "Landroid/graphics/Matrix;", "matrix", "i", "Z", "outlineIsProvided", "j", "value", "k", "I", "t", "()I", "Lp1/d0;", "l", "q", "setBlendMode-s9anfk8", "blendMode", "Lp1/w0;", "m", "Lp1/w0;", "()Lp1/w0;", "setColorFilter", "(Lp1/w0;)V", "colorFilter", "", "n", "F", "a", "()F", "(F)V", "alpha", "o", "shouldManuallySetCenterPivot", "Lo1/g;", "p", "getPivotOffset-F1C5BW0", "(J)V", "pivotOffset", "scaleX", "r", "Q", "scaleY", "s", "M", "translationX", "L", "translationY", "K", "G", "shadowElevation", "Lp1/v0;", "v", "ambientShadowColor", "B", "C", "spotShadowColor", "N", "rotationX", "rotationY", "rotationZ", "A", "cameraDistance", "R", "(Z)V", "clip", "clipToBounds", "clipToOutline", "E", "isInvalidated", "Lp1/d1;", "renderEffect", "Lp1/d1;", "()Lp1/d1;", "(Lp1/d1;)V", "hasDisplayList", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: s1.e  reason: case insensitive filesystem */
public final class C5907e implements androidx.compose.ui.graphics.layer.a {

    /* renamed from: F  reason: collision with root package name */
    public static final a f28970F = new a((DefaultConstructorMarker) null);

    /* renamed from: G  reason: collision with root package name */
    private static boolean f28971G;

    /* renamed from: H  reason: collision with root package name */
    private static final AtomicBoolean f28972H = new AtomicBoolean(true);

    /* renamed from: A  reason: collision with root package name */
    private float f28973A;

    /* renamed from: B  reason: collision with root package name */
    private boolean f28974B;

    /* renamed from: C  reason: collision with root package name */
    private boolean f28975C;

    /* renamed from: D  reason: collision with root package name */
    private boolean f28976D;

    /* renamed from: E  reason: collision with root package name */
    private boolean f28977E;

    /* renamed from: b  reason: collision with root package name */
    private final long f28978b;

    /* renamed from: c  reason: collision with root package name */
    private final C5734o0 f28979c;

    /* renamed from: d  reason: collision with root package name */
    private final C5815a f28980d;

    /* renamed from: e  reason: collision with root package name */
    private final RenderNode f28981e;

    /* renamed from: f  reason: collision with root package name */
    private long f28982f;

    /* renamed from: g  reason: collision with root package name */
    private Paint f28983g;

    /* renamed from: h  reason: collision with root package name */
    private Matrix f28984h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f28985i;

    /* renamed from: j  reason: collision with root package name */
    private long f28986j;

    /* renamed from: k  reason: collision with root package name */
    private int f28987k;

    /* renamed from: l  reason: collision with root package name */
    private int f28988l;

    /* renamed from: m  reason: collision with root package name */
    private C5749w0 f28989m;

    /* renamed from: n  reason: collision with root package name */
    private float f28990n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f28991o;

    /* renamed from: p  reason: collision with root package name */
    private long f28992p;

    /* renamed from: q  reason: collision with root package name */
    private float f28993q;

    /* renamed from: r  reason: collision with root package name */
    private float f28994r;

    /* renamed from: s  reason: collision with root package name */
    private float f28995s;

    /* renamed from: t  reason: collision with root package name */
    private float f28996t;

    /* renamed from: u  reason: collision with root package name */
    private float f28997u;

    /* renamed from: v  reason: collision with root package name */
    private long f28998v;

    /* renamed from: w  reason: collision with root package name */
    private long f28999w;

    /* renamed from: x  reason: collision with root package name */
    private float f29000x;

    /* renamed from: y  reason: collision with root package name */
    private float f29001y;

    /* renamed from: z  reason: collision with root package name */
    private float f29002z;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ls1/e$a;", "", "<init>", "()V", "Ljava/util/concurrent/atomic/AtomicBoolean;", "needToValidateAccess", "Ljava/util/concurrent/atomic/AtomicBoolean;", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: s1.e$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public C5907e(View view, long j10, C5734o0 o0Var, C5815a aVar) {
        this.f28978b = j10;
        this.f28979c = o0Var;
        this.f28980d = aVar;
        RenderNode create = RenderNode.create("Compose", view);
        this.f28981e = create;
        r.a aVar2 = r.f23053b;
        this.f28982f = aVar2.a();
        this.f28986j = aVar2.a();
        if (f28972H.getAndSet(false)) {
            create.setScaleX(create.getScaleX());
            create.setScaleY(create.getScaleY());
            create.setTranslationX(create.getTranslationX());
            create.setTranslationY(create.getTranslationY());
            create.setElevation(create.getElevation());
            create.setRotation(create.getRotation());
            create.setRotationX(create.getRotationX());
            create.setRotationY(create.getRotationY());
            create.setCameraDistance(create.getCameraDistance());
            create.setPivotX(create.getPivotX());
            create.setPivotY(create.getPivotY());
            create.setClipToOutline(create.getClipToOutline());
            create.setClipToBounds(false);
            create.setAlpha(create.getAlpha());
            create.isValid();
            create.setLeftTopRightBottom(0, 0, 0, 0);
            create.offsetLeftAndRight(0);
            create.offsetTopAndBottom(0);
            U(create);
            P();
            create.setLayerType(0);
            create.setHasOverlappingRendering(create.hasOverlappingRendering());
        }
        if (!f28971G) {
            create.setClipToBounds(false);
            C5904b.a aVar3 = C5904b.f28939a;
            O(aVar3.a());
            this.f28987k = aVar3.a();
            this.f28988l = C5712d0.f27280a.B();
            this.f28990n = 1.0f;
            this.f28992p = C5667g.f26701b.b();
            this.f28993q = 1.0f;
            this.f28994r = 1.0f;
            C5747v0.a aVar4 = C5747v0.f27350b;
            this.f28998v = aVar4.a();
            this.f28999w = aVar4.a();
            this.f28973A = 8.0f;
            this.f28977E = true;
            return;
        }
        throw new NoClassDefFoundError();
    }

    private final void O(int i10) {
        RenderNode renderNode = this.f28981e;
        C5904b.a aVar = C5904b.f28939a;
        if (C5904b.e(i10, aVar.c())) {
            renderNode.setLayerType(2);
            renderNode.setLayerPaint(this.f28983g);
            renderNode.setHasOverlappingRendering(true);
        } else if (C5904b.e(i10, aVar.b())) {
            renderNode.setLayerType(0);
            renderNode.setLayerPaint(this.f28983g);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setLayerType(0);
            renderNode.setLayerPaint(this.f28983g);
            renderNode.setHasOverlappingRendering(true);
        }
    }

    private final boolean S() {
        return C5904b.e(t(), C5904b.f28939a.c()) || !C5712d0.E(q(), C5712d0.f27280a.B()) || h() != null;
    }

    private final void T() {
        if (S()) {
            O(C5904b.f28939a.c());
        } else {
            O(t());
        }
    }

    private final void U(RenderNode renderNode) {
        if (Build.VERSION.SDK_INT >= 28) {
            C5894N n10 = C5894N.f28929a;
            n10.c(renderNode, n10.a(renderNode));
            n10.d(renderNode, n10.b(renderNode));
        }
    }

    private final void b() {
        boolean z10 = false;
        boolean z11 = R() && !this.f28985i;
        if (R() && this.f28985i) {
            z10 = true;
        }
        if (z11 != this.f28975C) {
            this.f28975C = z11;
            this.f28981e.setClipToBounds(z11);
        }
        if (z10 != this.f28976D) {
            this.f28976D = z10;
            this.f28981e.setClipToOutline(z10);
        }
    }

    public void A(boolean z10) {
        this.f28974B = z10;
        b();
    }

    public long B() {
        return this.f28999w;
    }

    public void C(long j10) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f28999w = j10;
            C5894N.f28929a.d(this.f28981e, C5751x0.k(j10));
        }
    }

    public Matrix D() {
        Matrix matrix = this.f28984h;
        if (matrix == null) {
            matrix = new Matrix();
            this.f28984h = matrix;
        }
        this.f28981e.getMatrix(matrix);
        return matrix;
    }

    public void E(boolean z10) {
        this.f28977E = z10;
    }

    public float F() {
        return this.f28993q;
    }

    public void G(float f10) {
        this.f28997u = f10;
        this.f28981e.setElevation(f10);
    }

    public void H(Outline outline, long j10) {
        this.f28986j = j10;
        this.f28981e.setOutline(outline);
        this.f28985i = outline != null;
        b();
    }

    public void I(long j10) {
        this.f28992p = j10;
        if (C5668h.d(j10)) {
            this.f28991o = true;
            this.f28981e.setPivotX(((float) r.h(this.f28982f)) / 2.0f);
            this.f28981e.setPivotY(((float) r.g(this.f28982f)) / 2.0f);
            return;
        }
        this.f28991o = false;
        this.f28981e.setPivotX(C5667g.m(j10));
        this.f28981e.setPivotY(C5667g.n(j10));
    }

    public void J(int i10) {
        this.f28987k = i10;
        T();
    }

    public float K() {
        return this.f28997u;
    }

    public float L() {
        return this.f28996t;
    }

    public float M() {
        return this.f28995s;
    }

    public float N() {
        return this.f29000x;
    }

    public final void P() {
        C5893M.f28928a.a(this.f28981e);
    }

    public float Q() {
        return this.f28994r;
    }

    public boolean R() {
        return this.f28974B;
    }

    public float a() {
        return this.f28990n;
    }

    public void c() {
        P();
    }

    public void d(float f10) {
        this.f28990n = f10;
        this.f28981e.setAlpha(f10);
    }

    public void e(float f10) {
        this.f28996t = f10;
        this.f28981e.setTranslationY(f10);
    }

    public float f() {
        return this.f29002z;
    }

    public void g(float f10) {
        this.f28993q = f10;
        this.f28981e.setScaleX(f10);
    }

    public C5749w0 h() {
        return this.f28989m;
    }

    public void i(float f10) {
        this.f28973A = f10;
        this.f28981e.setCameraDistance(-f10);
    }

    public void j(float f10) {
        this.f29000x = f10;
        this.f28981e.setRotationX(f10);
    }

    public void k(float f10) {
        this.f29001y = f10;
        this.f28981e.setRotationY(f10);
    }

    public void l(float f10) {
        this.f29002z = f10;
        this.f28981e.setRotation(f10);
    }

    public void m(float f10) {
        this.f28994r = f10;
        this.f28981e.setScaleY(f10);
    }

    public void n(d1 d1Var) {
    }

    public void o(float f10) {
        this.f28995s = f10;
        this.f28981e.setTranslationX(f10);
    }

    public boolean p() {
        return this.f28981e.isValid();
    }

    public int q() {
        return this.f28988l;
    }

    public d1 r() {
        return null;
    }

    public float s() {
        return this.f29001y;
    }

    public int t() {
        return this.f28987k;
    }

    public void u(C5732n0 n0Var) {
        DisplayListCanvas d10 = C5702H.d(n0Var);
        C17542s.h(d10, "null cannot be cast to non-null type android.view.DisplayListCanvas");
        d10.drawRenderNode(this.f28981e);
    }

    public void v(long j10) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f28998v = j10;
            C5894N.f28929a.c(this.f28981e, C5751x0.k(j10));
        }
    }

    public void w(int i10, int i11, long j10) {
        this.f28981e.setLeftTopRightBottom(i10, i11, r.h(j10) + i10, r.g(j10) + i11);
        if (!r.f(this.f28982f, j10)) {
            if (this.f28991o) {
                this.f28981e.setPivotX(((float) r.h(j10)) / 2.0f);
                this.f28981e.setPivotY(((float) r.g(j10)) / 2.0f);
            }
            this.f28982f = j10;
        }
    }

    public long x() {
        return this.f28998v;
    }

    public float y() {
        return this.f28973A;
    }

    public void z(d dVar, t tVar, C5905c cVar, C17642l<? super f, C16807N> lVar) {
        C5701G a10;
        C5815a aVar;
        d density;
        t layoutDirection;
        C5732n0 e10;
        long b10;
        C5905c h10;
        Canvas start = this.f28981e.start(Math.max(r.h(this.f28982f), r.h(this.f28986j)), Math.max(r.g(this.f28982f), r.g(this.f28986j)));
        try {
            C5734o0 o0Var = this.f28979c;
            Canvas a11 = o0Var.a().a();
            o0Var.a().b(start);
            a10 = o0Var.a();
            aVar = this.f28980d;
            long d10 = s.d(this.f28982f);
            density = aVar.I1().getDensity();
            layoutDirection = aVar.I1().getLayoutDirection();
            e10 = aVar.I1().e();
            b10 = aVar.I1().b();
            h10 = aVar.I1().h();
            r1.d I12 = aVar.I1();
            I12.a(dVar);
            I12.d(tVar);
            I12.f(a10);
            I12.g(d10);
            I12.i(cVar);
            a10.t();
            lVar.invoke(aVar);
            a10.n();
            r1.d I13 = aVar.I1();
            I13.a(density);
            I13.d(layoutDirection);
            I13.f(e10);
            I13.g(b10);
            I13.i(h10);
            o0Var.a().b(a11);
            this.f28981e.end(start);
            E(false);
        } catch (Throwable th2) {
            this.f28981e.end(start);
            throw th2;
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5907e(View view, long j10, C5734o0 o0Var, C5815a aVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(view, j10, (i10 & 4) != 0 ? new C5734o0() : o0Var, (i10 & 8) != 0 ? new C5815a() : aVar);
    }
}
