package s1;

import XH.C16807N;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.RectF;
import android.os.Build;
import c2.d;
import c2.n;
import c2.r;
import c2.s;
import c2.t;
import j0.O;
import j0.a0;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17642l;
import o1.C5662b;
import o1.C5667g;
import o1.C5669i;
import o1.C5672l;
import o1.C5673m;
import p1.C5702H;
import p1.C5712d0;
import p1.C5732n0;
import p1.C5745u0;
import p1.C5747v0;
import p1.C5749w0;
import p1.Q0;
import p1.S;
import p1.S0;
import p1.T;
import p1.U0;
import p1.Y;
import p1.d1;
import r1.e;
import r1.f;

@Metadata(d1 = {"\u0000È\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00012\u00020\u0001:\u0001AB\u001b\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\"\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0018\u0010\u0010J\u000f\u0010\u0019\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0019\u0010\u0010J\u000f\u0010\u001a\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001a\u0010\u0010J\u000f\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001e\u0010\u0010J\u0019\u0010\"\u001a\u0004\u0018\u00010!2\u0006\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020!H\u0002¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\fH\u0002¢\u0006\u0004\b&\u0010\u0010J\u000f\u0010'\u001a\u00020\fH\u0002¢\u0006\u0004\b'\u0010\u0010J<\u0010/\u001a\u00020\f2\u0006\u0010)\u001a\u00020(2\u0006\u0010+\u001a\u00020*2\u0006\u0010\u000b\u001a\u00020\n2\u0012\u0010.\u001a\u000e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020\f0,ø\u0001\u0000¢\u0006\u0004\b/\u00100J!\u00104\u001a\u00020\f2\u0006\u00102\u001a\u0002012\b\u00103\u001a\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b4\u00105J\u000f\u00106\u001a\u00020\fH\u0000¢\u0006\u0004\b6\u0010\u0010J\u000f\u00107\u001a\u00020\fH\u0000¢\u0006\u0004\b7\u0010\u0010J\u0015\u00108\u001a\u00020\f2\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b8\u00109J.\u0010>\u001a\u00020\f2\b\b\u0002\u0010\t\u001a\u00020:2\b\b\u0002\u0010\u000b\u001a\u00020;2\b\b\u0002\u0010=\u001a\u00020<ø\u0001\u0000¢\u0006\u0004\b>\u0010?J$\u0010@\u001a\u00020\f2\b\b\u0002\u0010\t\u001a\u00020:2\b\b\u0002\u0010\u000b\u001a\u00020;ø\u0001\u0000¢\u0006\u0004\b@\u0010\u000eR\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0004¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010DR\u0016\u0010)\u001a\u00020(8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bE\u0010FR\u0016\u0010+\u001a\u00020*8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bG\u0010HR\"\u0010J\u001a\u000e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020\f0,8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010IR \u0010K\u001a\u000e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020\f0,8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010IR\u0018\u0010M\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b&\u0010LR\u0016\u0010P\u001a\u00020N8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b7\u0010OR\u001c\u0010R\u001a\u00020:8\u0002@\u0002X\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b4\u0010QR\u001c\u0010T\u001a\u00020;8\u0002@\u0002X\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\bS\u0010QR\u0016\u0010V\u001a\u00020<8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bU\u0010\u000fR\u0018\u0010Z\u001a\u0004\u0018\u00010W8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bX\u0010YR\u0018\u0010]\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b[\u0010\\R\u0018\u0010_\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b^\u0010\\R\u0016\u0010a\u001a\u00020N8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b`\u0010OR\u0018\u0010e\u001a\u0004\u0018\u00010b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bc\u0010dR\u0016\u0010h\u001a\u00020f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bg\u0010'R\u0014\u0010l\u001a\u00020i8\u0002X\u0004¢\u0006\u0006\n\u0004\bj\u0010kR$\u0010q\u001a\u00020N2\u0006\u0010m\u001a\u00020N8\u0006@BX\u000e¢\u0006\f\n\u0004\bn\u0010O\u001a\u0004\bo\u0010pR0\u0010\t\u001a\u00020\b2\u0006\u0010r\u001a\u00020\b8\u0006@FX\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\bs\u0010Q\u001a\u0004\bt\u0010u\"\u0004\bv\u0010wR0\u0010\u000b\u001a\u00020\n2\u0006\u0010r\u001a\u00020\n8\u0006@BX\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\bx\u0010Q\u001a\u0004\by\u0010u\"\u0004\bz\u0010wR0\u0010}\u001a\u00020:2\u0006\u0010r\u001a\u00020:8\u0006@FX\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b{\u0010Q\u001a\u0004\bc\u0010u\"\u0004\b|\u0010wR2\u0010\u0001\u001a\u00020N2\u0006\u0010r\u001a\u00020N8F@FX\u000e¢\u0006\u0019\n\u0004\by\u0010O\u0012\u0005\b\u0001\u0010\u0010\u001a\u0004\bX\u0010p\"\u0004\b~\u0010R\u001a\u0010\u0001\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u000e¢\u0006\u0007\n\u0005\bt\u0010\u0001R0\u0010\u0001\u001a\u00030\u00012\u0007\u0010r\u001a\u00030\u00018F@FX\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u000f\u001a\u0005\b^\u0010\u0001\"\u0006\b\u0001\u0010\u0001R'\u0010\u0001\u001a\u00020<2\u0006\u0010r\u001a\u00020<8F@FX\u000e¢\u0006\u000e\u001a\u0005\bS\u0010\u0001\"\u0005\bQ\u0010\u0001R0\u0010\u0001\u001a\u00030\u00012\u0007\u0010r\u001a\u00030\u00018F@FX\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u000f\u001a\u0005\bU\u0010\u0001\"\u0006\b\u0001\u0010\u0001R.\u0010\u0001\u001a\u0005\u0018\u00010\u00012\t\u0010r\u001a\u0005\u0018\u00010\u00018F@FX\u000e¢\u0006\u000f\u001a\u0005\b[\u0010\u0001\"\u0006\b\u0001\u0010\u0001R(\u0010\u0001\u001a\u00020<2\u0006\u0010r\u001a\u00020<8F@FX\u000e¢\u0006\u000f\u001a\u0005\bs\u0010\u0001\"\u0006\b\u0001\u0010\u0001R(\u0010\u0001\u001a\u00020<2\u0006\u0010r\u001a\u00020<8F@FX\u000e¢\u0006\u000f\u001a\u0005\bx\u0010\u0001\"\u0006\b\u0001\u0010\u0001R)\u0010\u0001\u001a\u00020<2\u0006\u0010r\u001a\u00020<8F@FX\u000e¢\u0006\u0010\u001a\u0006\b\u0001\u0010\u0001\"\u0006\b\u0001\u0010\u0001R)\u0010\u0001\u001a\u00020<2\u0006\u0010r\u001a\u00020<8F@FX\u000e¢\u0006\u0010\u001a\u0006\b\u0001\u0010\u0001\"\u0006\b\u0001\u0010\u0001R'\u0010\u0001\u001a\u00020<2\u0006\u0010r\u001a\u00020<8F@FX\u000e¢\u0006\u000e\u001a\u0005\b{\u0010\u0001\"\u0005\bO\u0010\u0001R(\u0010 \u0001\u001a\u00020<2\u0006\u0010r\u001a\u00020<8F@FX\u000e¢\u0006\u000f\u001a\u0005\bg\u0010\u0001\"\u0006\b\u0001\u0010\u0001R(\u0010¢\u0001\u001a\u00020<2\u0006\u0010r\u001a\u00020<8F@FX\u000e¢\u0006\u000f\u001a\u0005\bj\u0010\u0001\"\u0006\b¡\u0001\u0010\u0001R(\u0010¤\u0001\u001a\u00020<2\u0006\u0010r\u001a\u00020<8F@FX\u000e¢\u0006\u000f\u001a\u0005\bn\u0010\u0001\"\u0006\b£\u0001\u0010\u0001R)\u0010§\u0001\u001a\u00020<2\u0006\u0010r\u001a\u00020<8F@FX\u000e¢\u0006\u0010\u001a\u0006\b¥\u0001\u0010\u0001\"\u0006\b¦\u0001\u0010\u0001R/\u0010­\u0001\u001a\u0005\u0018\u00010¨\u00012\t\u0010r\u001a\u0005\u0018\u00010¨\u00018F@FX\u000e¢\u0006\u0010\u001a\u0006\b©\u0001\u0010ª\u0001\"\u0006\b«\u0001\u0010¬\u0001R\u0013\u0010¯\u0001\u001a\u00020W8F¢\u0006\u0007\u001a\u0005\b`\u0010®\u0001R/\u0010³\u0001\u001a\u00030°\u00012\u0007\u0010r\u001a\u00030°\u00018F@FX\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u000e\u001a\u0005\b±\u0001\u0010u\"\u0005\b²\u0001\u0010wR/\u0010¶\u0001\u001a\u00030°\u00012\u0007\u0010r\u001a\u00030°\u00018F@FX\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u000e\u001a\u0005\b´\u0001\u0010u\"\u0005\bµ\u0001\u0010w\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006·\u0001"}, d2 = {"Ls1/c;", "", "Landroidx/compose/ui/graphics/layer/a;", "impl", "Ls1/E;", "layerManager", "<init>", "(Landroidx/compose/ui/graphics/layer/a;Ls1/E;)V", "Lc2/n;", "topLeft", "Lc2/r;", "size", "LXH/N;", "Q", "(JJ)V", "F", "()V", "graphicsLayer", "d", "(Ls1/c;)V", "Landroid/graphics/Canvas;", "androidCanvas", "f0", "(Landroid/graphics/Canvas;)V", "G", "C", "D", "Landroid/graphics/RectF;", "B", "()Landroid/graphics/RectF;", "e", "Lp1/U0;", "path", "Landroid/graphics/Outline;", "g0", "(Lp1/U0;)Landroid/graphics/Outline;", "A", "()Landroid/graphics/Outline;", "f", "I", "Lc2/d;", "density", "Lc2/t;", "layoutDirection", "Lkotlin/Function1;", "Lr1/f;", "block", "E", "(Lc2/d;Lc2/t;JLnI/l;)V", "Lp1/n0;", "canvas", "parentLayer", "h", "(Lp1/n0;Ls1/c;)V", "H", "g", "O", "(Lp1/U0;)V", "Lo1/g;", "Lo1/m;", "", "cornerRadius", "W", "(JJF)V", "R", "a", "Landroidx/compose/ui/graphics/layer/a;", "getImpl$ui_graphics_release", "()Landroidx/compose/ui/graphics/layer/a;", "b", "Lc2/d;", "c", "Lc2/t;", "LnI/l;", "drawBlock", "clipDrawBlock", "Landroid/graphics/Outline;", "androidOutline", "", "Z", "outlineDirty", "J", "roundRectOutlineTopLeft", "i", "roundRectOutlineSize", "j", "roundRectCornerRadius", "Lp1/Q0;", "k", "Lp1/Q0;", "internalOutline", "l", "Lp1/U0;", "outlinePath", "m", "roundRectClipPath", "n", "usePathForClip", "Lp1/S0;", "o", "Lp1/S0;", "softwareLayerPaint", "", "p", "parentLayerUsages", "Ls1/a;", "q", "Ls1/a;", "childDependenciesTracker", "<set-?>", "r", "z", "()Z", "isReleased", "value", "s", "w", "()J", "c0", "(J)V", "t", "v", "a0", "u", "P", "pivotOffset", "M", "(Z)V", "getClip$annotations", "clip", "Landroid/graphics/RectF;", "pathBounds", "Ls1/b;", "()I", "N", "(I)V", "compositingStrategy", "()F", "(F)V", "alpha", "Lp1/d0;", "setBlendMode-s9anfk8", "blendMode", "Lp1/w0;", "()Lp1/w0;", "setColorFilter", "(Lp1/w0;)V", "colorFilter", "X", "scaleX", "Y", "scaleY", "x", "d0", "translationX", "y", "e0", "translationY", "shadowElevation", "T", "rotationX", "U", "rotationY", "V", "rotationZ", "getCameraDistance", "L", "cameraDistance", "Lp1/d1;", "getRenderEffect", "()Lp1/d1;", "S", "(Lp1/d1;)V", "renderEffect", "()Lp1/Q0;", "outline", "Lp1/v0;", "getAmbientShadowColor-0d7_KjU", "K", "ambientShadowColor", "getSpotShadowColor-0d7_KjU", "b0", "spotShadowColor", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: s1.c  reason: case insensitive filesystem */
public final class C5905c {

    /* renamed from: x  reason: collision with root package name */
    public static final a f28943x = new a((DefaultConstructorMarker) null);

    /* renamed from: y  reason: collision with root package name */
    private static final C5886F f28944y = (C5885E.f28922a.a() ? C5887G.f28924a : Build.VERSION.SDK_INT >= 28 ? C5889I.f28926a : C5896P.f28931a.a() ? C5888H.f28925a : C5887G.f28924a);

    /* renamed from: a  reason: collision with root package name */
    private final androidx.compose.ui.graphics.layer.a f28945a;

    /* renamed from: b  reason: collision with root package name */
    private d f28946b = e.a();

    /* renamed from: c  reason: collision with root package name */
    private t f28947c = t.Ltr;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public C17642l<? super f, C16807N> f28948d = C0459c.f28969c;

    /* renamed from: e  reason: collision with root package name */
    private final C17642l<f, C16807N> f28949e = new b(this);

    /* renamed from: f  reason: collision with root package name */
    private Outline f28950f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f28951g = true;

    /* renamed from: h  reason: collision with root package name */
    private long f28952h;

    /* renamed from: i  reason: collision with root package name */
    private long f28953i;

    /* renamed from: j  reason: collision with root package name */
    private float f28954j;

    /* renamed from: k  reason: collision with root package name */
    private Q0 f28955k;
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public U0 f28956l;

    /* renamed from: m  reason: collision with root package name */
    private U0 f28957m;
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public boolean f28958n;

    /* renamed from: o  reason: collision with root package name */
    private S0 f28959o;

    /* renamed from: p  reason: collision with root package name */
    private int f28960p;

    /* renamed from: q  reason: collision with root package name */
    private final C5903a f28961q;

    /* renamed from: r  reason: collision with root package name */
    private boolean f28962r;

    /* renamed from: s  reason: collision with root package name */
    private long f28963s;

    /* renamed from: t  reason: collision with root package name */
    private long f28964t;

    /* renamed from: u  reason: collision with root package name */
    private long f28965u;

    /* renamed from: v  reason: collision with root package name */
    private boolean f28966v;

    /* renamed from: w  reason: collision with root package name */
    private RectF f28967w;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ls1/c$a;", "", "<init>", "()V", "Ls1/F;", "SnapshotImpl", "Ls1/F;", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: s1.c$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lr1/f;", "LXH/N;", "a", "(Lr1/f;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: s1.c$b */
    static final class b extends C17544u implements C17642l<f, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5905c f28968c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(C5905c cVar) {
            super(1);
            this.f28968c = cVar;
        }

        public final void a(f fVar) {
            U0 b10 = this.f28968c.f28956l;
            if (!this.f28968c.f28958n || !this.f28968c.k() || b10 == null) {
                this.f28968c.f28948d.invoke(fVar);
                return;
            }
            C17642l a10 = this.f28968c.f28948d;
            int b11 = C5745u0.f27347a.b();
            r1.d I12 = fVar.I1();
            long b12 = I12.b();
            I12.e().t();
            try {
                I12.c().e(b10, b11);
                a10.invoke(fVar);
            } finally {
                I12.e().n();
                I12.g(b12);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((f) obj);
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lr1/f;", "LXH/N;", "a", "(Lr1/f;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: s1.c$c  reason: collision with other inner class name */
    static final class C0459c extends C17544u implements C17642l<f, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        public static final C0459c f28969c = new C0459c();

        C0459c() {
            super(1);
        }

        public final void a(f fVar) {
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((f) obj);
            return C16807N.f139792a;
        }
    }

    public C5905c(androidx.compose.ui.graphics.layer.a aVar, C5885E e10) {
        this.f28945a = aVar;
        C5667g.a aVar2 = C5667g.f26701b;
        this.f28952h = aVar2.c();
        this.f28953i = C5673m.f26722b.a();
        this.f28961q = new C5903a();
        aVar.A(false);
        this.f28963s = n.f23044b.a();
        this.f28964t = r.f23053b.a();
        this.f28965u = aVar2.b();
    }

    private final Outline A() {
        Outline outline = this.f28950f;
        if (outline != null) {
            return outline;
        }
        Outline outline2 = new Outline();
        this.f28950f = outline2;
        return outline2;
    }

    private final RectF B() {
        RectF rectF = this.f28967w;
        if (rectF != null) {
            return rectF;
        }
        RectF rectF2 = new RectF();
        this.f28967w = rectF2;
        return rectF2;
    }

    private final void C() {
        this.f28960p++;
    }

    private final void D() {
        this.f28960p--;
        f();
    }

    private final void F() {
        C5903a aVar = this.f28961q;
        aVar.f28935b = aVar.f28934a;
        O a10 = aVar.f28936c;
        if (a10 != null && a10.e()) {
            O c10 = aVar.f28937d;
            if (c10 == null) {
                c10 = a0.a();
                aVar.f28937d = c10;
            }
            c10.i(a10);
            a10.m();
        }
        aVar.f28938e = true;
        this.f28945a.z(this.f28946b, this.f28947c, this, this.f28949e);
        aVar.f28938e = false;
        C5905c d10 = aVar.f28935b;
        if (d10 != null) {
            d10.D();
        }
        O c11 = aVar.f28937d;
        if (c11 != null && c11.e()) {
            Object[] objArr = c11.f24576b;
            long[] jArr = c11.f24575a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i10 = 0;
                while (true) {
                    long j10 = jArr[i10];
                    if ((((~j10) << 7) & j10 & -9187201950435737472L) != -9187201950435737472L) {
                        int i11 = 8 - ((~(i10 - length)) >>> 31);
                        for (int i12 = 0; i12 < i11; i12++) {
                            if ((255 & j10) < 128) {
                                ((C5905c) objArr[(i10 << 3) + i12]).D();
                            }
                            j10 >>= 8;
                        }
                        if (i11 != 8) {
                            break;
                        }
                    }
                    if (i10 == length) {
                        break;
                    }
                    i10++;
                }
            }
            c11.m();
        }
    }

    private final void G() {
        if (!this.f28945a.p()) {
            try {
                F();
            } catch (Throwable unused) {
            }
        }
    }

    private final void I() {
        this.f28955k = null;
        this.f28956l = null;
        this.f28953i = C5673m.f26722b.a();
        this.f28952h = C5667g.f26701b.c();
        this.f28954j = 0.0f;
        this.f28951g = true;
        this.f28958n = false;
    }

    private final void Q(long j10, long j11) {
        this.f28945a.w(n.h(j10), n.i(j10), j11);
    }

    private final void a0(long j10) {
        if (!r.f(this.f28964t, j10)) {
            this.f28964t = j10;
            Q(this.f28963s, j10);
            if (this.f28953i == 9205357640488583168L) {
                this.f28951g = true;
                e();
            }
        }
    }

    private final void d(C5905c cVar) {
        if (this.f28961q.i(cVar)) {
            cVar.C();
        }
    }

    private final void e() {
        if (this.f28951g) {
            Outline outline = null;
            if (this.f28966v || u() > 0.0f) {
                U0 u02 = this.f28956l;
                if (u02 != null) {
                    RectF B10 = B();
                    if (u02 instanceof T) {
                        ((T) u02).w().computeBounds(B10, false);
                        Outline g02 = g0(u02);
                        if (g02 != null) {
                            g02.setAlpha(i());
                            outline = g02;
                        }
                        this.f28945a.H(outline, s.a(Math.round(B10.width()), Math.round(B10.height())));
                        if (!this.f28958n || !this.f28966v) {
                            this.f28945a.A(this.f28966v);
                        } else {
                            this.f28945a.A(false);
                            this.f28945a.c();
                        }
                    } else {
                        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
                    }
                } else {
                    this.f28945a.A(this.f28966v);
                    C5673m.f26722b.b();
                    Outline A10 = A();
                    long d10 = s.d(this.f28964t);
                    long j10 = this.f28952h;
                    long j11 = this.f28953i;
                    long j12 = j11 == 9205357640488583168L ? d10 : j11;
                    A10.setRoundRect(Math.round(C5667g.m(j10)), Math.round(C5667g.n(j10)), Math.round(C5667g.m(j10) + C5673m.l(j12)), Math.round(C5667g.n(j10) + C5673m.i(j12)), this.f28954j);
                    A10.setAlpha(i());
                    this.f28945a.H(A10, s.c(j12));
                }
            } else {
                this.f28945a.A(false);
                this.f28945a.H((Outline) null, r.f23053b.a());
            }
        }
        this.f28951g = false;
    }

    private final void f() {
        if (this.f28962r && this.f28960p == 0) {
            g();
        }
    }

    private final void f0(Canvas canvas) {
        float h10 = (float) n.h(this.f28963s);
        float i10 = (float) n.i(this.f28963s);
        float h11 = ((float) n.h(this.f28963s)) + ((float) r.h(this.f28964t));
        float i11 = ((float) n.i(this.f28963s)) + ((float) r.g(this.f28964t));
        float i12 = i();
        C5749w0 l10 = l();
        int j10 = j();
        if (i12 < 1.0f || !C5712d0.E(j10, C5712d0.f27280a.B()) || l10 != null || C5904b.e(m(), C5904b.f28939a.c())) {
            S0 s02 = this.f28959o;
            if (s02 == null) {
                s02 = S.a();
                this.f28959o = s02;
            }
            s02.d(i12);
            s02.e(j10);
            s02.n(l10);
            canvas.saveLayer(h10, i10, h11, i11, s02.o());
        } else {
            canvas.save();
        }
        canvas.translate(h10, i10);
        canvas.concat(this.f28945a.D());
    }

    private final Outline g0(U0 u02) {
        Outline outline;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 > 28 || u02.e()) {
            Outline A10 = A();
            if (i10 >= 30) {
                C5891K.f28927a.a(A10, u02);
            } else if (u02 instanceof T) {
                A10.setConvexPath(((T) u02).w());
            } else {
                throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
            }
            this.f28958n = !A10.canClip();
            outline = A10;
        } else {
            Outline outline2 = this.f28950f;
            if (outline2 != null) {
                outline2.setEmpty();
            }
            this.f28958n = true;
            this.f28945a.E(true);
            outline = null;
        }
        this.f28956l = u02;
        return outline;
    }

    public final void E(d dVar, t tVar, long j10, C17642l<? super f, C16807N> lVar) {
        a0(j10);
        this.f28946b = dVar;
        this.f28947c = tVar;
        this.f28948d = lVar;
        this.f28945a.E(true);
        F();
    }

    public final void H() {
        if (!this.f28962r) {
            this.f28962r = true;
            f();
        }
    }

    public final void J(float f10) {
        if (this.f28945a.a() != f10) {
            this.f28945a.d(f10);
        }
    }

    public final void K(long j10) {
        if (!C5747v0.q(j10, this.f28945a.x())) {
            this.f28945a.v(j10);
        }
    }

    public final void L(float f10) {
        if (this.f28945a.y() != f10) {
            this.f28945a.i(f10);
        }
    }

    public final void M(boolean z10) {
        if (this.f28966v != z10) {
            this.f28966v = z10;
            this.f28951g = true;
            e();
        }
    }

    public final void N(int i10) {
        if (!C5904b.e(this.f28945a.t(), i10)) {
            this.f28945a.J(i10);
        }
    }

    public final void O(U0 u02) {
        I();
        this.f28956l = u02;
        e();
    }

    public final void P(long j10) {
        if (!C5667g.j(this.f28965u, j10)) {
            this.f28965u = j10;
            this.f28945a.I(j10);
        }
    }

    public final void R(long j10, long j11) {
        W(j10, j11, 0.0f);
    }

    public final void S(d1 d1Var) {
        this.f28945a.r();
        if (!C17542s.e((Object) null, d1Var)) {
            this.f28945a.n(d1Var);
        }
    }

    public final void T(float f10) {
        if (this.f28945a.N() != f10) {
            this.f28945a.j(f10);
        }
    }

    public final void U(float f10) {
        if (this.f28945a.s() != f10) {
            this.f28945a.k(f10);
        }
    }

    public final void V(float f10) {
        if (this.f28945a.f() != f10) {
            this.f28945a.l(f10);
        }
    }

    public final void W(long j10, long j11, float f10) {
        if (!C5667g.j(this.f28952h, j10) || !C5673m.h(this.f28953i, j11) || this.f28954j != f10 || this.f28956l != null) {
            I();
            this.f28952h = j10;
            this.f28953i = j11;
            this.f28954j = f10;
            e();
        }
    }

    public final void X(float f10) {
        if (this.f28945a.F() != f10) {
            this.f28945a.g(f10);
        }
    }

    public final void Y(float f10) {
        if (this.f28945a.Q() != f10) {
            this.f28945a.m(f10);
        }
    }

    public final void Z(float f10) {
        if (this.f28945a.K() != f10) {
            this.f28945a.G(f10);
            this.f28951g = true;
            e();
        }
    }

    public final void b0(long j10) {
        if (!C5747v0.q(j10, this.f28945a.B())) {
            this.f28945a.C(j10);
        }
    }

    public final void c0(long j10) {
        if (!n.g(this.f28963s, j10)) {
            this.f28963s = j10;
            Q(j10, this.f28964t);
        }
    }

    public final void d0(float f10) {
        if (this.f28945a.M() != f10) {
            this.f28945a.o(f10);
        }
    }

    public final void e0(float f10) {
        if (this.f28945a.L() != f10) {
            this.f28945a.e(f10);
        }
    }

    public final void g() {
        C5903a aVar = this.f28961q;
        C5905c b10 = aVar.f28934a;
        if (b10 != null) {
            b10.D();
            aVar.f28934a = null;
        }
        O a10 = aVar.f28936c;
        if (a10 != null) {
            Object[] objArr = a10.f24576b;
            long[] jArr = a10.f24575a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i10 = 0;
                while (true) {
                    long j10 = jArr[i10];
                    if ((((~j10) << 7) & j10 & -9187201950435737472L) != -9187201950435737472L) {
                        int i11 = 8 - ((~(i10 - length)) >>> 31);
                        for (int i12 = 0; i12 < i11; i12++) {
                            if ((255 & j10) < 128) {
                                ((C5905c) objArr[(i10 << 3) + i12]).D();
                            }
                            j10 >>= 8;
                        }
                        if (i11 != 8) {
                            break;
                        }
                    }
                    if (i10 == length) {
                        break;
                    }
                    i10++;
                }
            }
            a10.m();
        }
        this.f28945a.c();
    }

    public final void h(C5732n0 n0Var, C5905c cVar) {
        if (!this.f28962r) {
            e();
            G();
            boolean z10 = true;
            boolean z11 = u() > 0.0f;
            if (z11) {
                n0Var.r();
            }
            Canvas d10 = C5702H.d(n0Var);
            boolean isHardwareAccelerated = d10.isHardwareAccelerated();
            if (!isHardwareAccelerated) {
                d10.save();
                f0(d10);
            }
            if (isHardwareAccelerated || !this.f28966v) {
                z10 = false;
            }
            if (z10) {
                n0Var.t();
                Q0 n10 = n();
                if (n10 instanceof Q0.b) {
                    C5732n0.A(n0Var, n10.a(), 0, 2, (Object) null);
                } else if (n10 instanceof Q0.c) {
                    U0 u02 = this.f28957m;
                    if (u02 != null) {
                        u02.D();
                    } else {
                        u02 = Y.a();
                        this.f28957m = u02;
                    }
                    U0.s(u02, ((Q0.c) n10).b(), (U0.b) null, 2, (Object) null);
                    C5732n0.o(n0Var, u02, 0, 2, (Object) null);
                } else if (n10 instanceof Q0.a) {
                    C5732n0.o(n0Var, ((Q0.a) n10).b(), 0, 2, (Object) null);
                }
            }
            if (cVar != null) {
                cVar.d(this);
            }
            this.f28945a.u(n0Var);
            if (z10) {
                n0Var.n();
            }
            if (z11) {
                n0Var.u();
            }
            if (!isHardwareAccelerated) {
                d10.restore();
            }
        }
    }

    public final float i() {
        return this.f28945a.a();
    }

    public final int j() {
        return this.f28945a.q();
    }

    public final boolean k() {
        return this.f28966v;
    }

    public final C5749w0 l() {
        return this.f28945a.h();
    }

    public final int m() {
        return this.f28945a.t();
    }

    public final Q0 n() {
        Q0 q02 = this.f28955k;
        U0 u02 = this.f28956l;
        if (q02 != null) {
            return q02;
        }
        if (u02 != null) {
            Q0.a aVar = new Q0.a(u02);
            this.f28955k = aVar;
            return aVar;
        }
        long d10 = s.d(this.f28964t);
        long j10 = this.f28952h;
        long j11 = this.f28953i;
        if (j11 != 9205357640488583168L) {
            d10 = j11;
        }
        float m10 = C5667g.m(j10);
        float n10 = C5667g.n(j10);
        float l10 = m10 + C5673m.l(d10);
        float i10 = n10 + C5673m.i(d10);
        float f10 = this.f28954j;
        Q0 cVar = f10 > 0.0f ? new Q0.c(C5672l.e(m10, n10, l10, i10, C5662b.b(f10, 0.0f, 2, (Object) null))) : new Q0.b(new C5669i(m10, n10, l10, i10));
        this.f28955k = cVar;
        return cVar;
    }

    public final long o() {
        return this.f28965u;
    }

    public final float p() {
        return this.f28945a.N();
    }

    public final float q() {
        return this.f28945a.s();
    }

    public final float r() {
        return this.f28945a.f();
    }

    public final float s() {
        return this.f28945a.F();
    }

    public final float t() {
        return this.f28945a.Q();
    }

    public final float u() {
        return this.f28945a.K();
    }

    public final long v() {
        return this.f28964t;
    }

    public final long w() {
        return this.f28963s;
    }

    public final float x() {
        return this.f28945a.M();
    }

    public final float y() {
        return this.f28945a.L();
    }

    public final boolean z() {
        return this.f28962r;
    }
}
