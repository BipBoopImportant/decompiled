package s1;

import XH.C16807N;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Picture;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import androidx.compose.ui.graphics.layer.ViewLayer;
import androidx.compose.ui.graphics.layer.view.DrawChildContainer;
import c2.d;
import c2.r;
import c2.s;
import c2.t;
import kotlin.Metadata;
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

@Metadata(d1 = {"\u0000Ö\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 92\u00020\u0001:\u0001\u000fB+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0017\u0010\u0012J\u000f\u0010\u0018\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0018\u0010\u0012J*\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u001cH\u0016ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ$\u0010#\u001a\u00020\u000e2\b\u0010!\u001a\u0004\u0018\u00010 2\u0006\u0010\"\u001a\u00020\u001cH\u0016ø\u0001\u0000¢\u0006\u0004\b#\u0010$J;\u0010.\u001a\u00020\u000e2\u0006\u0010&\u001a\u00020%2\u0006\u0010(\u001a\u00020'2\u0006\u0010*\u001a\u00020)2\u0012\u0010-\u001a\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020\u000e0+H\u0016¢\u0006\u0004\b.\u0010/J\u0017\u00102\u001a\u00020\u000e2\u0006\u00101\u001a\u000200H\u0016¢\u0006\u0004\b2\u00103J\u000f\u00105\u001a\u000204H\u0016¢\u0006\u0004\b5\u00106J\u000f\u00107\u001a\u00020\u000eH\u0016¢\u0006\u0004\b7\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u00108R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0004¢\u0006\f\n\u0004\b7\u00109\u001a\u0004\b:\u0010;R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R\u0014\u0010C\u001a\u00020@8\u0002X\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u001c\u0010H\u001a\n E*\u0004\u0018\u00010D0D8\u0002X\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010L\u001a\u00020I8\u0002X\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u0018\u0010P\u001a\u0004\u0018\u00010M8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bN\u0010OR\u0016\u0010T\u001a\u0004\u0018\u00010Q8\u0002X\u0004¢\u0006\u0006\n\u0004\bR\u0010SR\u0016\u0010W\u001a\u0004\u0018\u00010\b8\u0002X\u0004¢\u0006\u0006\n\u0004\bU\u0010VR\u0016\u0010Y\u001a\u0004\u0018\u00010\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\bX\u0010=R\u0016\u0010\u001a\u001a\u00020\u00198\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bZ\u0010[R\u0016\u0010\u001b\u001a\u00020\u00198\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\\\u0010[R\u001c\u0010\u001d\u001a\u00020\u001c8\u0002@\u0002X\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b]\u00109R\u0016\u0010`\u001a\u00020\u00138\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b^\u0010_R\"\u0010b\u001a\u00020\u00138\u0016@\u0016X\u000e¢\u0006\u0012\n\u0004\ba\u0010_\u001a\u0004\bb\u0010\u0015\"\u0004\bc\u0010dR\u0016\u0010f\u001a\u00020\u00138\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\be\u0010_R\u0016\u0010h\u001a\u00020\u00138\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bg\u0010_R\u001a\u0010k\u001a\u00020\u00048\u0016X\u0004¢\u0006\f\n\u0004\bi\u00109\u001a\u0004\bj\u0010;R0\u0010q\u001a\u00020l2\u0006\u0010m\u001a\u00020l8\u0016@VX\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\bn\u0010[\u001a\u0004\be\u0010o\"\u0004\bp\u0010\u0010R.\u0010w\u001a\u0004\u0018\u00010r2\b\u0010m\u001a\u0004\u0018\u00010r8\u0016@VX\u000e¢\u0006\u0012\n\u0004\b2\u0010s\u001a\u0004\bN\u0010t\"\u0004\bu\u0010vR0\u0010\r\u001a\u00020\f2\u0006\u0010m\u001a\u00020\f8\u0016@VX\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\bx\u0010[\u001a\u0004\bn\u0010o\"\u0004\b9\u0010\u0010R*\u0010~\u001a\u00020y2\u0006\u0010m\u001a\u00020y8\u0016@VX\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010z\u001a\u0004\b{\u0010|\"\u0004\b<\u0010}R\u0016\u0010\u001a\u00020\u00138\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010_R5\u0010\u0001\u001a\u00030\u00012\u0007\u0010m\u001a\u00030\u00018\u0016@VX\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0014\n\u0004\b\u001b\u00109\u001a\u0005\b\u0001\u0010;\"\u0005\b[\u0010\u0001R+\u0010\u0001\u001a\u00020y2\u0006\u0010m\u001a\u00020y8\u0016@VX\u000e¢\u0006\u0012\n\u0004\b.\u0010z\u001a\u0004\bz\u0010|\"\u0004\bJ\u0010}R-\u0010\u0001\u001a\u00020y2\u0006\u0010m\u001a\u00020y8\u0016@VX\u000e¢\u0006\u0014\n\u0005\b\u0001\u0010z\u001a\u0005\b\u0001\u0010|\"\u0004\b\\\u0010}R-\u0010\u0001\u001a\u00020y2\u0006\u0010m\u001a\u00020y8\u0016@VX\u000e¢\u0006\u0014\n\u0005\b\u0001\u0010z\u001a\u0005\b\u0001\u0010|\"\u0004\b^\u0010}R-\u0010\u0001\u001a\u00020y2\u0006\u0010m\u001a\u00020y8\u0016@VX\u000e¢\u0006\u0014\n\u0005\b\u0001\u0010z\u001a\u0005\b\u0001\u0010|\"\u0004\bA\u0010}R-\u0010\u0001\u001a\u00020y2\u0006\u0010m\u001a\u00020y8\u0016@VX\u000e¢\u0006\u0014\n\u0004\b5\u0010z\u001a\u0005\b\u0001\u0010|\"\u0005\b\u0001\u0010}R4\u0010\u0001\u001a\u00030\u00012\u0007\u0010m\u001a\u00030\u00018\u0016@VX\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0013\n\u0004\bc\u00109\u001a\u0004\b\u001a\u0010;\"\u0005\bx\u0010\u0001R6\u0010\u0001\u001a\u00030\u00012\u0007\u0010m\u001a\u00030\u00018\u0016@VX\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0015\n\u0004\bz\u00109\u001a\u0005\b\u0001\u0010;\"\u0006\b\u0001\u0010\u0001R-\u0010\u0001\u001a\u00020y2\u0006\u0010m\u001a\u00020y8\u0016@VX\u000e¢\u0006\u0014\n\u0005\b\u0001\u0010z\u001a\u0005\b\u0001\u0010|\"\u0004\bU\u0010}R+\u0010\u0001\u001a\u00020y2\u0006\u0010m\u001a\u00020y8\u0016@VX\u000e¢\u0006\u0012\n\u0004\b#\u0010z\u001a\u0004\bi\u0010|\"\u0004\bX\u0010}R+\u0010\u0001\u001a\u00020y2\u0006\u0010m\u001a\u00020y8\u0016@VX\u000e¢\u0006\u0012\n\u0004\b[\u0010z\u001a\u0004\bF\u0010|\"\u0004\bZ\u0010}R%\u0010\u0001\u001a\u00020y2\u0006\u0010m\u001a\u00020y8V@VX\u000e¢\u0006\f\u001a\u0004\b\u001b\u0010|\"\u0004\bR\u0010}R'\u0010\u0001\u001a\u00020\u00132\u0006\u0010m\u001a\u00020\u00138V@VX\u000e¢\u0006\u000e\u001a\u0005\b\u0001\u0010\u0015\"\u0005\b\u0001\u0010dR5\u0010\u0001\u001a\u0005\u0018\u00010\u00012\t\u0010m\u001a\u0005\u0018\u00010\u00018\u0016@VX\u000e¢\u0006\u0016\n\u0006\b\u0001\u0010\u0001\u001a\u0005\bg\u0010\u0001\"\u0005\b]\u0010\u0001\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006 \u0001"}, d2 = {"Ls1/D;", "Landroidx/compose/ui/graphics/layer/a;", "Landroidx/compose/ui/graphics/layer/view/DrawChildContainer;", "layerContainer", "", "ownerId", "Lp1/o0;", "canvasHolder", "Lr1/a;", "canvasDrawScope", "<init>", "(Landroidx/compose/ui/graphics/layer/view/DrawChildContainer;JLp1/o0;Lr1/a;)V", "Ls1/b;", "compositingStrategy", "LXH/N;", "b", "(I)V", "U", "()V", "", "R", "()Z", "S", "P", "T", "", "x", "y", "Lc2/r;", "size", "w", "(IIJ)V", "Landroid/graphics/Outline;", "outline", "outlineSize", "H", "(Landroid/graphics/Outline;J)V", "Lc2/d;", "density", "Lc2/t;", "layoutDirection", "Ls1/c;", "layer", "Lkotlin/Function1;", "Lr1/f;", "block", "z", "(Lc2/d;Lc2/t;Ls1/c;LnI/l;)V", "Lp1/n0;", "canvas", "u", "(Lp1/n0;)V", "Landroid/graphics/Matrix;", "D", "()Landroid/graphics/Matrix;", "c", "Landroidx/compose/ui/graphics/layer/view/DrawChildContainer;", "J", "getOwnerId", "()J", "d", "Lp1/o0;", "getCanvasHolder", "()Lp1/o0;", "Landroidx/compose/ui/graphics/layer/ViewLayer;", "e", "Landroidx/compose/ui/graphics/layer/ViewLayer;", "viewLayer", "Landroid/content/res/Resources;", "kotlin.jvm.PlatformType", "f", "Landroid/content/res/Resources;", "resources", "Landroid/graphics/Rect;", "g", "Landroid/graphics/Rect;", "clipRect", "Landroid/graphics/Paint;", "h", "Landroid/graphics/Paint;", "layerPaint", "Landroid/graphics/Picture;", "i", "Landroid/graphics/Picture;", "picture", "j", "Lr1/a;", "pictureDrawScope", "k", "pictureCanvasHolder", "l", "I", "m", "n", "o", "Z", "clipBoundsInvalidated", "p", "isInvalidated", "E", "(Z)V", "q", "outlineIsProvided", "r", "clipToBounds", "s", "getLayerId", "layerId", "Lp1/d0;", "value", "t", "()I", "setBlendMode-s9anfk8", "blendMode", "Lp1/w0;", "Lp1/w0;", "()Lp1/w0;", "setColorFilter", "(Lp1/w0;)V", "colorFilter", "v", "", "F", "a", "()F", "(F)V", "alpha", "shouldManuallySetCenterPivot", "Lo1/g;", "getPivotOffset-F1C5BW0", "(J)V", "pivotOffset", "scaleX", "A", "Q", "scaleY", "B", "M", "translationX", "C", "L", "translationY", "K", "G", "shadowElevation", "Lp1/v0;", "ambientShadowColor", "spotShadowColor", "N", "rotationX", "rotationY", "rotationZ", "cameraDistance", "O", "clip", "Lp1/d1;", "renderEffect", "Lp1/d1;", "()Lp1/d1;", "(Lp1/d1;)V", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: s1.D  reason: case insensitive filesystem */
public final class C5884D implements androidx.compose.ui.graphics.layer.a {

    /* renamed from: J  reason: collision with root package name */
    public static final b f28885J = new b((DefaultConstructorMarker) null);

    /* renamed from: K  reason: collision with root package name */
    private static final boolean f28886K = (!C5896P.f28931a.a());

    /* renamed from: L  reason: collision with root package name */
    private static final Canvas f28887L = new a();

    /* renamed from: A  reason: collision with root package name */
    private float f28888A;

    /* renamed from: B  reason: collision with root package name */
    private float f28889B;

    /* renamed from: C  reason: collision with root package name */
    private float f28890C;

    /* renamed from: D  reason: collision with root package name */
    private float f28891D;

    /* renamed from: E  reason: collision with root package name */
    private long f28892E;

    /* renamed from: F  reason: collision with root package name */
    private long f28893F;

    /* renamed from: G  reason: collision with root package name */
    private float f28894G;

    /* renamed from: H  reason: collision with root package name */
    private float f28895H;

    /* renamed from: I  reason: collision with root package name */
    private float f28896I;

    /* renamed from: b  reason: collision with root package name */
    private final DrawChildContainer f28897b;

    /* renamed from: c  reason: collision with root package name */
    private final long f28898c;

    /* renamed from: d  reason: collision with root package name */
    private final C5734o0 f28899d;

    /* renamed from: e  reason: collision with root package name */
    private final ViewLayer f28900e;

    /* renamed from: f  reason: collision with root package name */
    private final Resources f28901f;

    /* renamed from: g  reason: collision with root package name */
    private final Rect f28902g;

    /* renamed from: h  reason: collision with root package name */
    private Paint f28903h;

    /* renamed from: i  reason: collision with root package name */
    private final Picture f28904i;

    /* renamed from: j  reason: collision with root package name */
    private final C5815a f28905j;

    /* renamed from: k  reason: collision with root package name */
    private final C5734o0 f28906k;

    /* renamed from: l  reason: collision with root package name */
    private int f28907l;

    /* renamed from: m  reason: collision with root package name */
    private int f28908m;

    /* renamed from: n  reason: collision with root package name */
    private long f28909n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f28910o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f28911p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f28912q;

    /* renamed from: r  reason: collision with root package name */
    private boolean f28913r;

    /* renamed from: s  reason: collision with root package name */
    private final long f28914s;

    /* renamed from: t  reason: collision with root package name */
    private int f28915t;

    /* renamed from: u  reason: collision with root package name */
    private C5749w0 f28916u;

    /* renamed from: v  reason: collision with root package name */
    private int f28917v;

    /* renamed from: w  reason: collision with root package name */
    private float f28918w;

    /* renamed from: x  reason: collision with root package name */
    private boolean f28919x;

    /* renamed from: y  reason: collision with root package name */
    private long f28920y;

    /* renamed from: z  reason: collision with root package name */
    private float f28921z;

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"s1/D$a", "Landroid/graphics/Canvas;", "", "isHardwareAccelerated", "()Z", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: s1.D$a */
    public static final class a extends Canvas {
        a() {
        }

        public boolean isHardwareAccelerated() {
            return true;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ls1/D$b;", "", "<init>", "()V", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: s1.D$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    public C5884D(DrawChildContainer drawChildContainer, long j10, C5734o0 o0Var, C5815a aVar) {
        this.f28897b = drawChildContainer;
        this.f28898c = j10;
        this.f28899d = o0Var;
        ViewLayer viewLayer = new ViewLayer(drawChildContainer, o0Var, aVar);
        this.f28900e = viewLayer;
        this.f28901f = drawChildContainer.getResources();
        this.f28902g = new Rect();
        boolean z10 = f28886K;
        this.f28904i = z10 ? new Picture() : null;
        this.f28905j = z10 ? new C5815a() : null;
        this.f28906k = z10 ? new C5734o0() : null;
        drawChildContainer.addView(viewLayer);
        viewLayer.setClipBounds((Rect) null);
        this.f28909n = r.f23053b.a();
        this.f28911p = true;
        this.f28914s = (long) View.generateViewId();
        this.f28915t = C5712d0.f27280a.B();
        this.f28917v = C5904b.f28939a.a();
        this.f28918w = 1.0f;
        this.f28920y = C5667g.f26701b.c();
        this.f28921z = 1.0f;
        this.f28888A = 1.0f;
        C5747v0.a aVar2 = C5747v0.f27350b;
        this.f28892E = aVar2.a();
        this.f28893F = aVar2.a();
    }

    private final void P() {
        try {
            C5734o0 o0Var = this.f28899d;
            Canvas canvas = f28887L;
            Canvas a10 = o0Var.a().a();
            o0Var.a().b(canvas);
            C5701G a11 = o0Var.a();
            DrawChildContainer drawChildContainer = this.f28897b;
            ViewLayer viewLayer = this.f28900e;
            drawChildContainer.a(a11, viewLayer, viewLayer.getDrawingTime());
            o0Var.a().b(a10);
        } catch (Throwable unused) {
        }
    }

    private final boolean R() {
        return C5904b.e(t(), C5904b.f28939a.c()) || S();
    }

    private final boolean S() {
        return !C5712d0.E(q(), C5712d0.f27280a.B()) || h() != null;
    }

    private final void T() {
        Rect rect;
        if (this.f28910o) {
            ViewLayer viewLayer = this.f28900e;
            if (!O() || this.f28912q) {
                rect = null;
            } else {
                rect = this.f28902g;
                rect.left = 0;
                rect.top = 0;
                rect.right = this.f28900e.getWidth();
                rect.bottom = this.f28900e.getHeight();
            }
            viewLayer.setClipBounds(rect);
        }
    }

    private final void U() {
        if (R()) {
            b(C5904b.f28939a.c());
        } else {
            b(t());
        }
    }

    private final void b(int i10) {
        ViewLayer viewLayer = this.f28900e;
        C5904b.a aVar = C5904b.f28939a;
        boolean z10 = true;
        if (C5904b.e(i10, aVar.c())) {
            this.f28900e.setLayerType(2, this.f28903h);
        } else if (C5904b.e(i10, aVar.b())) {
            this.f28900e.setLayerType(0, this.f28903h);
            z10 = false;
        } else {
            this.f28900e.setLayerType(0, this.f28903h);
        }
        viewLayer.setCanUseCompositingLayer$ui_graphics_release(z10);
    }

    public void A(boolean z10) {
        boolean z11 = false;
        this.f28913r = z10 && !this.f28912q;
        this.f28910o = true;
        ViewLayer viewLayer = this.f28900e;
        if (z10 && this.f28912q) {
            z11 = true;
        }
        viewLayer.setClipToOutline(z11);
    }

    public long B() {
        return this.f28893F;
    }

    public void C(long j10) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f28893F = j10;
            C5900U.f28932a.c(this.f28900e, C5751x0.k(j10));
        }
    }

    public Matrix D() {
        return this.f28900e.getMatrix();
    }

    public void E(boolean z10) {
        this.f28911p = z10;
    }

    public float F() {
        return this.f28921z;
    }

    public void G(float f10) {
        this.f28891D = f10;
        this.f28900e.setElevation(f10);
    }

    public void H(Outline outline, long j10) {
        boolean d10 = this.f28900e.d(outline);
        boolean z10 = false;
        if (O() && outline != null) {
            this.f28900e.setClipToOutline(true);
            if (this.f28913r) {
                this.f28913r = false;
                this.f28910o = true;
            }
        }
        if (outline != null) {
            z10 = true;
        }
        this.f28912q = z10;
        if (!d10) {
            this.f28900e.invalidate();
            P();
        }
    }

    public void I(long j10) {
        this.f28920y = j10;
        if (!C5668h.d(j10)) {
            this.f28919x = false;
            this.f28900e.setPivotX(C5667g.m(j10));
            this.f28900e.setPivotY(C5667g.n(j10));
        } else if (Build.VERSION.SDK_INT >= 28) {
            C5900U.f28932a.a(this.f28900e);
        } else {
            this.f28919x = true;
            this.f28900e.setPivotX(((float) r.h(this.f28909n)) / 2.0f);
            this.f28900e.setPivotY(((float) r.g(this.f28909n)) / 2.0f);
        }
    }

    public void J(int i10) {
        this.f28917v = i10;
        U();
    }

    public float K() {
        return this.f28891D;
    }

    public float L() {
        return this.f28890C;
    }

    public float M() {
        return this.f28889B;
    }

    public float N() {
        return this.f28894G;
    }

    public boolean O() {
        return this.f28913r || this.f28900e.getClipToOutline();
    }

    public float Q() {
        return this.f28888A;
    }

    public float a() {
        return this.f28918w;
    }

    public void c() {
        this.f28897b.removeViewInLayout(this.f28900e);
    }

    public void d(float f10) {
        this.f28918w = f10;
        this.f28900e.setAlpha(f10);
    }

    public void e(float f10) {
        this.f28890C = f10;
        this.f28900e.setTranslationY(f10);
    }

    public float f() {
        return this.f28896I;
    }

    public void g(float f10) {
        this.f28921z = f10;
        this.f28900e.setScaleX(f10);
    }

    public C5749w0 h() {
        return this.f28916u;
    }

    public void i(float f10) {
        this.f28900e.setCameraDistance(f10 * ((float) this.f28901f.getDisplayMetrics().densityDpi));
    }

    public void j(float f10) {
        this.f28894G = f10;
        this.f28900e.setRotationX(f10);
    }

    public void k(float f10) {
        this.f28895H = f10;
        this.f28900e.setRotationY(f10);
    }

    public void l(float f10) {
        this.f28896I = f10;
        this.f28900e.setRotation(f10);
    }

    public void m(float f10) {
        this.f28888A = f10;
        this.f28900e.setScaleY(f10);
    }

    public void n(d1 d1Var) {
        if (Build.VERSION.SDK_INT >= 31) {
            C5902W.f28933a.a(this.f28900e, d1Var);
        }
    }

    public void o(float f10) {
        this.f28889B = f10;
        this.f28900e.setTranslationX(f10);
    }

    public int q() {
        return this.f28915t;
    }

    public d1 r() {
        return null;
    }

    public float s() {
        return this.f28895H;
    }

    public int t() {
        return this.f28917v;
    }

    public void u(C5732n0 n0Var) {
        T();
        Canvas d10 = C5702H.d(n0Var);
        if (d10.isHardwareAccelerated()) {
            DrawChildContainer drawChildContainer = this.f28897b;
            ViewLayer viewLayer = this.f28900e;
            drawChildContainer.a(n0Var, viewLayer, viewLayer.getDrawingTime());
            return;
        }
        Picture picture = this.f28904i;
        if (picture != null) {
            d10.drawPicture(picture);
        }
    }

    public void v(long j10) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f28892E = j10;
            C5900U.f28932a.b(this.f28900e, C5751x0.k(j10));
        }
    }

    public void w(int i10, int i11, long j10) {
        if (!r.f(this.f28909n, j10)) {
            if (O()) {
                this.f28910o = true;
            }
            this.f28900e.layout(i10, i11, r.h(j10) + i10, r.g(j10) + i11);
            this.f28909n = j10;
            if (this.f28919x) {
                this.f28900e.setPivotX(((float) r.h(j10)) / 2.0f);
                this.f28900e.setPivotY(((float) r.g(j10)) / 2.0f);
            }
        } else {
            int i12 = this.f28907l;
            if (i12 != i10) {
                this.f28900e.offsetLeftAndRight(i10 - i12);
            }
            int i13 = this.f28908m;
            if (i13 != i11) {
                this.f28900e.offsetTopAndBottom(i11 - i13);
            }
        }
        this.f28907l = i10;
        this.f28908m = i11;
    }

    public long x() {
        return this.f28892E;
    }

    public float y() {
        return this.f28900e.getCameraDistance() / ((float) this.f28901f.getDisplayMetrics().densityDpi);
    }

    public void z(d dVar, t tVar, C5905c cVar, C17642l<? super f, C16807N> lVar) {
        C5734o0 o0Var;
        Canvas canvas;
        d dVar2 = dVar;
        t tVar2 = tVar;
        C17642l<? super f, C16807N> lVar2 = lVar;
        if (this.f28900e.getParent() == null) {
            this.f28897b.addView(this.f28900e);
        }
        this.f28900e.c(dVar2, tVar2, cVar, lVar2);
        if (this.f28900e.isAttachedToWindow()) {
            this.f28900e.setVisibility(4);
            this.f28900e.setVisibility(0);
            P();
            Picture picture = this.f28904i;
            if (picture != null) {
                Canvas beginRecording = picture.beginRecording(r.h(this.f28909n), r.g(this.f28909n));
                try {
                    C5734o0 o0Var2 = this.f28906k;
                    if (o0Var2 != null) {
                        Canvas a10 = o0Var2.a().a();
                        o0Var2.a().b(beginRecording);
                        C5701G a11 = o0Var2.a();
                        C5815a aVar = this.f28905j;
                        if (aVar != null) {
                            long d10 = s.d(this.f28909n);
                            C5815a.C0452a E10 = aVar.E();
                            d a12 = E10.a();
                            t b10 = E10.b();
                            C5732n0 c10 = E10.c();
                            o0Var = o0Var2;
                            canvas = a10;
                            long d11 = E10.d();
                            C5815a.C0452a E11 = aVar.E();
                            E11.j(dVar2);
                            E11.k(tVar2);
                            E11.i(a11);
                            E11.l(d10);
                            a11.t();
                            lVar2.invoke(aVar);
                            a11.n();
                            C5815a.C0452a E12 = aVar.E();
                            E12.j(a12);
                            E12.k(b10);
                            E12.i(c10);
                            E12.l(d11);
                        } else {
                            o0Var = o0Var2;
                            canvas = a10;
                        }
                        o0Var.a().b(canvas);
                        C16807N n10 = C16807N.f139792a;
                    }
                    picture.endRecording();
                } catch (Throwable th2) {
                    picture.endRecording();
                    throw th2;
                }
            }
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5884D(DrawChildContainer drawChildContainer, long j10, C5734o0 o0Var, C5815a aVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(drawChildContainer, j10, (i10 & 4) != 0 ? new C5734o0() : o0Var, (i10 & 8) != 0 ? new C5815a() : aVar);
    }
}
