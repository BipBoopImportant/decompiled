package me.saket.telephoto.zoomable;

import E1.C4478k;
import E1.h0;
import E1.i0;
import U0.A1;
import U0.C4899r0;
import U0.o1;
import U0.p1;
import XH.C16796C;
import XH.C16807N;
import XH.v;
import XH.y;
import c2.t;
import dI.C17164e;
import e2.C5295b;
import eI.C17187b;
import f1.C5309k;
import f1.C5310l;
import i1.C5437c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17525a;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import l0.x;
import m0.B0;
import m0.C5544h;
import m0.C5546i;
import m0.C5548j;
import m0.C5550k;
import m0.C5552l;
import m0.C5554m;
import m0.C5556n;
import m0.C5559o0;
import m0.C5562q;
import m0.C5570z;
import m0.r;
import m0.t0;
import me.saket.telephoto.zoomable.a;
import me.saket.telephoto.zoomable.m;
import n0.C5589L;
import nI.C17631a;
import nI.C17642l;
import o1.C5667g;
import o1.C5668h;
import o1.C5669i;
import o1.C5670j;
import o1.C5673m;
import o1.C5674n;
import pK.C17756a;
import pK.C17757b;
import pK.C17758c;
import pK.C17759d;
import pK.C17761f;
import pK.C17762g;
import pK.C17764i;
import pK.C17765j;
import pK.C17769n;
import rK.C17860A;
import rK.C17863D;
import rK.C17864E;
import rK.C17865F;
import rK.C17866a;
import rK.C17867b;
import rK.C17871f;
import rK.u;
import tI.C17978n;

@Metadata(d1 = {"\u0000Ü\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u0000 \u00012\u00020\u0001:\u0001MB\u001f\b\u0000\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J8\u0010\u000f\u001a\u00020\b*\u00020\b2\u0006\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0002ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0014\u001a\u00020\b*\u00020\b2\u0006\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0013\u0010\u0017\u001a\u00020\u0016*\u00020\u0016H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J9\u0010 \u001a\u00020\u001f2\u0006\u0010\u0019\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u001a2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cH@ø\u0001\u0000¢\u0006\u0004\b \u0010!J\u0011\u0010\"\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b\"\u0010#J\u0011\u0010%\u001a\u0004\u0018\u00010$H\u0002¢\u0006\u0004\b%\u0010&J;\u0010,\u001a\u00020)2*\u0010+\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020*0(0'\"\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020*0(H\u0002¢\u0006\u0004\b,\u0010-J\u001a\u0010.\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\tH\u0000ø\u0001\u0000¢\u0006\u0004\b.\u0010/J\u0017\u00102\u001a\u00020\u001f2\u0006\u00101\u001a\u000200H\u0016¢\u0006\u0004\b2\u00103J\u001e\u00104\u001a\u00020\u001f2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cH@¢\u0006\u0004\b4\u00105J1\u00107\u001a\u00020\u001f2\u0006\u00106\u001a\u00020\u001d2\u0006\u0010\n\u001a\u00020\t2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cH@ø\u0001\u0000¢\u0006\u0004\b7\u00108J1\u00109\u001a\u00020\u001f2\u0006\u00106\u001a\u00020\u001d2\u0006\u0010\n\u001a\u00020\t2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cH@ø\u0001\u0000¢\u0006\u0004\b9\u00108J)\u0010;\u001a\u00020\u001f2\u0006\u0010:\u001a\u00020\t2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\t0\u001cH@ø\u0001\u0000¢\u0006\u0004\b;\u0010<J\u000f\u0010=\u001a\u00020\u0004H\u0000¢\u0006\u0004\b=\u0010>J\u0010\u0010?\u001a\u00020\u001fH@¢\u0006\u0004\b?\u0010@J#\u0010E\u001a\u00020\u001f2\u0006\u0010B\u001a\u00020A2\u0006\u0010D\u001a\u00020CH@ø\u0001\u0000¢\u0006\u0004\bE\u0010FR\u001b\u0010L\u001a\u00020G8VX\u0002¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010KR\u001d\u0010P\u001a\u0004\u0018\u00010\u001d8WX\u0002¢\u0006\f\n\u0004\bM\u0010I\u001a\u0004\bN\u0010OR+\u0010\u0005\u001a\u00020\u00042\u0006\u0010Q\u001a\u00020\u00048V@VX\u0002¢\u0006\u0012\n\u0004\bR\u0010S\u001a\u0004\bT\u0010>\"\u0004\bM\u0010UR+\u0010\\\u001a\u00020V2\u0006\u0010Q\u001a\u00020V8V@VX\u0002¢\u0006\u0012\n\u0004\bW\u0010S\u001a\u0004\bX\u0010Y\"\u0004\bZ\u0010[R+\u0010a\u001a\u00020]2\u0006\u0010Q\u001a\u00020]8V@VX\u0002¢\u0006\u0012\n\u0004\bJ\u0010S\u001a\u0004\b^\u0010_\"\u0004\bW\u0010`R+\u0010f\u001a\u00020b2\u0006\u0010Q\u001a\u00020b8V@VX\u0002¢\u0006\u0012\n\u0004\bZ\u0010S\u001a\u0004\bR\u0010c\"\u0004\bd\u0010eR+\u0010l\u001a\u00020g2\u0006\u0010Q\u001a\u00020g8@@@X\u0002¢\u0006\u0012\n\u0004\b9\u0010S\u001a\u0004\bh\u0010i\"\u0004\bj\u0010kR+\u0010r\u001a\u00020m2\u0006\u0010Q\u001a\u00020m8@@@X\u0002¢\u0006\u0012\n\u0004\b4\u0010S\u001a\u0004\bn\u0010o\"\u0004\bp\u0010qR+\u0010v\u001a\u0002002\u0006\u0010Q\u001a\u0002008B@BX\u0002¢\u0006\u0012\n\u0004\b;\u0010S\u001a\u0004\bs\u0010t\"\u0004\bu\u00103R1\u0010|\u001a\u00020w2\u0006\u0010Q\u001a\u00020w8@@@X\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\bN\u0010S\u001a\u0004\bx\u0010y\"\u0004\bz\u0010{R.\u0010\u0001\u001a\u00020}2\u0006\u0010Q\u001a\u00020}8B@BX\u0002¢\u0006\u0014\n\u0004\b7\u0010S\u001a\u0004\b~\u0010\"\u0006\b\u0001\u0010\u0001R\u001f\u0010\u0001\u001a\u00030\u00018BX\u0002¢\u0006\u000e\n\u0004\bT\u0010I\u001a\u0006\b\u0001\u0010\u0001R6\u0010\u0001\u001a\u0005\u0018\u00010\u00012\t\u0010Q\u001a\u0005\u0018\u00010\u00018@@@X\u0002¢\u0006\u0016\n\u0004\b2\u0010S\u001a\u0006\b\u0001\u0010\u0001\"\u0006\b\u0001\u0010\u0001R\u001f\u0010\u0001\u001a\u00020\u00168VX\u0002¢\u0006\u000f\n\u0005\b\u0001\u0010I\u001a\u0006\b\u0001\u0010\u0001R\u001e\u0010\u0001\u001a\u00020\u00048@X\u0002¢\u0006\u000e\n\u0005\b\u0001\u0010I\u001a\u0005\b\u0001\u0010>R(\u0010\u0001\u001a\u00030\u00018\u0000X\u0004¢\u0006\u0018\n\u0006\b\u0001\u0010\u0001\u0012\u0006\b\u0001\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0001"}, d2 = {"Lme/saket/telephoto/zoomable/j;", "LpK/n;", "LrK/F;", "savedState", "", "autoApplyTransformations", "<init>", "(LrK/F;Z)V", "LpK/b;", "Lo1/g;", "centroid", "panDelta", "Lme/saket/telephoto/zoomable/a;", "oldZoom", "newZoom", "U", "(LpK/b;JJLme/saket/telephoto/zoomable/a;Lme/saket/telephoto/zoomable/a;)LpK/b;", "proposedZoom", "LpK/d;", "inputs", "E", "(LpK/b;Lme/saket/telephoto/zoomable/a;LpK/d;)LpK/b;", "Lo1/i;", "d0", "(Lo1/i;)Lo1/i;", "targetZoom", "Ln0/L;", "mutatePriority", "Lm0/i;", "", "animationSpec", "LXH/N;", "A", "(Lme/saket/telephoto/zoomable/a;JLn0/L;Lm0/i;LdI/e;)Ljava/lang/Object;", "C", "()LpK/d;", "LpK/c;", "B", "()LpK/c;", "", "LXH/v;", "", "", "extras", "F", "([LXH/v;)Ljava/lang/String;", "D", "(J)Z", "Lme/saket/telephoto/zoomable/m;", "location", "n", "(Lme/saket/telephoto/zoomable/m;)V", "i", "(Lm0/i;LdI/e;)Ljava/lang/Object;", "zoomFactor", "l", "(FJLm0/i;LdI/e;)Ljava/lang/Object;", "h", "offset", "j", "(JLm0/i;LdI/e;)Ljava/lang/Object;", "T", "()Z", "z", "(LdI/e;)Ljava/lang/Object;", "Lc2/y;", "velocity", "Lc2/d;", "density", "G", "(JLc2/d;LdI/e;)Ljava/lang/Object;", "LpK/j;", "b", "LU0/A1;", "f", "()LpK/j;", "contentTransformation", "c", "k", "()Ljava/lang/Float;", "zoomFraction", "<set-?>", "d", "LU0/r0;", "m", "(Z)V", "LE1/k;", "e", "J", "()LE1/k;", "g", "(LE1/k;)V", "contentScale", "Li1/c;", "I", "()Li1/c;", "(Li1/c;)V", "contentAlignment", "LpK/i;", "()LpK/i;", "c0", "(LpK/i;)V", "zoomSpec", "Lme/saket/telephoto/zoomable/h;", "M", "()Lme/saket/telephoto/zoomable/h;", "X", "(Lme/saket/telephoto/zoomable/h;)V", "hardwareShortcutsSpec", "Lc2/t;", "N", "()Lc2/t;", "Y", "(Lc2/t;)V", "layoutDirection", "Q", "()Lme/saket/telephoto/zoomable/m;", "a0", "unscaledContentLocation", "Lo1/m;", "R", "()J", "b0", "(J)V", "viewportSize", "Lme/saket/telephoto/zoomable/e;", "K", "()Lme/saket/telephoto/zoomable/e;", "W", "(Lme/saket/telephoto/zoomable/e;)V", "gestureState", "Lme/saket/telephoto/zoomable/f;", "L", "()Lme/saket/telephoto/zoomable/f;", "gestureStateInputs", "LrK/r;", "O", "()LrK/r;", "Z", "(LrK/r;)V", "placeholderBoundsProvider", "o", "getTransformedContentBounds", "()Lo1/i;", "transformedContentBounds", "p", "S", "isReadyToInteract", "LrK/D;", "q", "LrK/D;", "P", "()LrK/D;", "getTransformableState$zoomable_release$annotations", "()V", "transformableState", "r", "zoomable_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class j implements C17769n {

    /* renamed from: r  reason: collision with root package name */
    public static final c f144630r = new c((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: s  reason: collision with root package name */
    public static final C5309k<j, C17865F> f144631s = C5310l.a(a.f144648c, b.f144649h);

    /* renamed from: b  reason: collision with root package name */
    private final A1 f144632b;

    /* renamed from: c  reason: collision with root package name */
    private final A1 f144633c;

    /* renamed from: d  reason: collision with root package name */
    private final C4899r0 f144634d;

    /* renamed from: e  reason: collision with root package name */
    private final C4899r0 f144635e;

    /* renamed from: f  reason: collision with root package name */
    private final C4899r0 f144636f;

    /* renamed from: g  reason: collision with root package name */
    private final C4899r0 f144637g;

    /* renamed from: h  reason: collision with root package name */
    private final C4899r0 f144638h;

    /* renamed from: i  reason: collision with root package name */
    private final C4899r0 f144639i;

    /* renamed from: j  reason: collision with root package name */
    private final C4899r0 f144640j;

    /* renamed from: k  reason: collision with root package name */
    private final C4899r0 f144641k;

    /* renamed from: l  reason: collision with root package name */
    private final C4899r0 f144642l;

    /* renamed from: m  reason: collision with root package name */
    private final A1 f144643m;

    /* renamed from: n  reason: collision with root package name */
    private final C4899r0 f144644n;

    /* renamed from: o  reason: collision with root package name */
    private final A1 f144645o;

    /* renamed from: p  reason: collision with root package name */
    private final A1 f144646p;

    /* renamed from: q  reason: collision with root package name */
    private final C17863D f144647q;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lf1/m;", "Lme/saket/telephoto/zoomable/j;", "state", "LrK/F;", "a", "(Lf1/m;Lme/saket/telephoto/zoomable/j;)LrK/F;"}, k = 3, mv = {1, 9, 0})
    static final class a extends C17544u implements nI.p<f1.m, j, C17865F> {

        /* renamed from: c  reason: collision with root package name */
        public static final a f144648c = new a();

        a() {
            super(2);
        }

        /* renamed from: a */
        public final C17865F invoke(f1.m mVar, j jVar) {
            C17542s.j(mVar, "$this$Saver");
            C17542s.j(jVar, "state");
            C17759d q10 = jVar.C();
            if (q10 != null) {
                return C17865F.f146732e.a(jVar.K().a(q10), q10);
            }
            return null;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* synthetic */ class b extends C17525a implements C17642l<C17865F, j> {

        /* renamed from: h  reason: collision with root package name */
        public static final b f144649h = new b();

        b() {
            super(1, j.class, "<init>", "<init>(Lme/saket/telephoto/zoomable/internal/ZoomableSavedState;Z)V", 0);
        }

        /* renamed from: a */
        public final j invoke(C17865F f10) {
            return new j(f10, false, 2, (DefaultConstructorMarker) null);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R&\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0000X\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lme/saket/telephoto/zoomable/j$c;", "", "<init>", "()V", "Lf1/k;", "Lme/saket/telephoto/zoomable/j;", "LrK/F;", "Saver", "Lf1/k;", "a", "()Lf1/k;", "zoomable_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C5309k<j, C17865F> a() {
            return j.f144631s;
        }

        private c() {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LrK/A;", "LXH/N;", "<anonymous>", "(LrK/A;)V"}, k = 3, mv = {1, 9, 0})
    @kotlin.coroutines.jvm.internal.f(c = "me.saket.telephoto.zoomable.RealZoomableState$animateSettlingOfZoomOnGestureEnd$2", f = "RealZoomableState.kt", l = {543}, m = "invokeSuspend")
    static final class d extends kotlin.coroutines.jvm.internal.l implements nI.p<C17860A, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f144650c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f144651d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C17758c f144652e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ float f144653f;

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lm0/h;", "", "Lm0/m;", "LXH/N;", "a", "(Lm0/h;)V"}, k = 3, mv = {1, 9, 0})
        static final class a extends C17544u implements C17642l<C5544h<Float, C5554m>, C16807N> {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ C17758c f144654c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ L f144655d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ C17860A f144656e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(C17758c cVar, L l10, C17860A a10) {
                super(1);
                this.f144654c = cVar;
                this.f144655d = l10;
                this.f144656e = a10;
            }

            public final void a(C5544h<Float, C5554m> hVar) {
                C17542s.j(hVar, "$this$animateTo");
                C17860A.a(this.f144656e, this.f144655d.f144345a == 0.0f ? 1.0f : hVar.e().floatValue() / this.f144655d.f144345a, 0, 0.0f, this.f144654c.b(), 6, (Object) null);
                this.f144655d.f144345a = hVar.e().floatValue();
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((C5544h) obj);
                return C16807N.f139792a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(C17758c cVar, float f10, C17164e<? super d> eVar) {
            super(2, eVar);
            this.f144652e = cVar;
            this.f144653f = f10;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            d dVar = new d(this.f144652e, this.f144653f, eVar);
            dVar.f144651d = obj;
            return dVar;
        }

        /* renamed from: i */
        public final Object invoke(C17860A a10, C17164e<? super C16807N> eVar) {
            return ((d) create(a10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f144650c;
            if (i10 == 0) {
                y.b(obj);
                L l10 = new L();
                float d10 = this.f144652e.d();
                l10.f144345a = d10;
                C5550k c10 = C5552l.c(d10, 0.0f, 0, 0, false, 30, (Object) null);
                Float d11 = kotlin.coroutines.jvm.internal.b.d(this.f144653f);
                C5559o0 h10 = C5548j.h(0.0f, 0.0f, (Object) null, 7, (Object) null);
                a aVar = new a(this.f144652e, l10, (C17860A) this.f144651d);
                this.f144650c = 1;
                if (t0.j(c10, d11, h10, false, aVar, this, 4, (Object) null) == f10) {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LrK/A;", "LXH/N;", "<anonymous>", "(LrK/A;)V"}, k = 3, mv = {1, 9, 0})
    @kotlin.coroutines.jvm.internal.f(c = "me.saket.telephoto.zoomable.RealZoomableState$animateZoomTo$2", f = "RealZoomableState.kt", l = {482}, m = "invokeSuspend")
    static final class e extends kotlin.coroutines.jvm.internal.l implements nI.p<C17860A, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f144657c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C5546i<Float> f144658d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ a f144659e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ a f144660f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ C17757b f144661g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ C17758c f144662h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ C17757b f144663i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ j f144664j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ long f144665k;

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lm0/h;", "", "Lm0/m;", "LXH/N;", "b", "(Lm0/h;)V"}, k = 3, mv = {1, 9, 0})
        static final class a extends C17544u implements C17642l<C5544h<Float, C5554m>, C16807N> {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ a f144666c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ a f144667d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ C17757b f144668e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ C17758c f144669f;

            /* renamed from: g  reason: collision with root package name */
            final /* synthetic */ C17757b f144670g;

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ j f144671h;

            /* renamed from: i  reason: collision with root package name */
            final /* synthetic */ long f144672i;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(a aVar, a aVar2, C17757b bVar, C17758c cVar, C17757b bVar2, j jVar, long j10) {
                super(1);
                this.f144666c = aVar;
                this.f144667d = aVar2;
                this.f144668e = bVar;
                this.f144669f = cVar;
                this.f144670g = bVar2;
                this.f144671h = jVar;
                this.f144672i = j10;
            }

            /* access modifiers changed from: private */
            public static final C17758c c(C17758c cVar, C17757b bVar, a aVar, long j10, C17759d dVar) {
                C17542s.j(cVar, "$startGestureState");
                C17542s.j(bVar, "$animatedOffsetForUi");
                C17542s.j(aVar, "$animatedZoom");
                C17542s.j(dVar, "it");
                return cVar.a(bVar.d(), aVar.g(), j10);
            }

            public final void b(C5544h<Float, C5554m> hVar) {
                C17542s.j(hVar, "$this$animateTo");
                a aVar = this.f144666c;
                a d10 = a.d(aVar, 0, C17762g.a(C5295b.b(aVar.g(), this.f144667d.g(), hVar.e().floatValue())), 1, (Object) null);
                this.f144671h.W(new k(this.f144669f, C17757b.b(this.f144668e, 0, C17761f.a(C17871f.c(C5667g.u(C5668h.e(C17871f.q(C5667g.u(this.f144669f.c()), this.f144666c), C17871f.q(C5667g.u(this.f144670g.d()), this.f144667d), hVar.e().floatValue())), d10)), 1, (Object) null), d10, this.f144672i));
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((C5544h) obj);
                return C16807N.f139792a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(C5546i<Float> iVar, a aVar, a aVar2, C17757b bVar, C17758c cVar, C17757b bVar2, j jVar, long j10, C17164e<? super e> eVar) {
            super(2, eVar);
            this.f144658d = iVar;
            this.f144659e = aVar;
            this.f144660f = aVar2;
            this.f144661g = bVar;
            this.f144662h = cVar;
            this.f144663i = bVar2;
            this.f144664j = jVar;
            this.f144665k = j10;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new e(this.f144658d, this.f144659e, this.f144660f, this.f144661g, this.f144662h, this.f144663i, this.f144664j, this.f144665k, eVar);
        }

        /* renamed from: i */
        public final Object invoke(C17860A a10, C17164e<? super C16807N> eVar) {
            return ((e) create(a10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f144657c;
            if (i10 == 0) {
                y.b(obj);
                C5550k c10 = C5552l.c(0.0f, 0.0f, 0, 0, false, 30, (Object) null);
                Float d10 = kotlin.coroutines.jvm.internal.b.d(1.0f);
                C5546i iVar = this.f144658d;
                if (iVar instanceof C5559o0) {
                    iVar = C17866a.a((C5559o0) iVar, kotlin.coroutines.jvm.internal.b.d(1.0E-4f));
                }
                a aVar = new a(this.f144659e, this.f144660f, this.f144661g, this.f144662h, this.f144663i, this.f144664j, this.f144665k);
                this.f144657c = 1;
                if (t0.j(c10, d10, iVar, false, aVar, this, 4, (Object) null) == f10) {
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

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo1/g;", "finalOffset", "a", "(J)J"}, k = 3, mv = {1, 9, 0})
    static final class f extends C17544u implements C17642l<C5667g, C5667g> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ a f144673c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ long f144674d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ j f144675e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C5669i f144676f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ C17759d f144677g;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo1/g;", "it", "a", "(J)J"}, k = 3, mv = {1, 9, 0})
        static final class a extends C17544u implements C17642l<C5667g, C5667g> {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ j f144678c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ C5669i f144679d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ a f144680e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ C17759d f144681f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(j jVar, C5669i iVar, a aVar, C17759d dVar) {
                super(1);
                this.f144678c = jVar;
                this.f144679d = iVar;
                this.f144680e = aVar;
                this.f144681f = dVar;
            }

            public final long a(long j10) {
                return C17867b.a(this.f144678c.d0(C5670j.c(j10, C17871f.t(this.f144679d.q(), this.f144680e))), this.f144681f.f(), this.f144681f.c(), this.f144681f.d());
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return C5667g.d(a(((C5667g) obj).v()));
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(a aVar, long j10, j jVar, C5669i iVar, C17759d dVar) {
            super(1);
            this.f144673c = aVar;
            this.f144674d = j10;
            this.f144675e = jVar;
            this.f144676f = iVar;
            this.f144677g = dVar;
        }

        public final long a(long j10) {
            return C17871f.z(j10, C17871f.w(this.f144673c.f()), this.f144674d, new a(this.f144675e, this.f144676f, this.f144673c, this.f144677g));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return C5667g.d(a(((C5667g) obj).v()));
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LpK/j;", "b", "()LpK/j;"}, k = 3, mv = {1, 9, 0})
    static final class g extends C17544u implements C17631a<C17765j> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ j f144682c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(j jVar) {
            super(0);
            this.f144682c = jVar;
        }

        /* renamed from: b */
        public final C17765j invoke() {
            C17759d q10 = this.f144682c.C();
            if (q10 != null) {
                return u.f146802h.a(q10, this.f144682c.K().a(q10));
            }
            long b10 = C5673m.f26722b.b();
            h0.a aVar = h0.f5906a;
            return new u(false, C17871f.h(aVar), new u.b(C17871f.h(aVar), 0.0f, (DefaultConstructorMarker) null), C5667g.f26701b.c(), (C5667g) null, b10, 0.0f, 64, (DefaultConstructorMarker) null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LrK/A;", "LXH/N;", "<anonymous>", "(LrK/A;)V"}, k = 3, mv = {1, 9, 0})
    @kotlin.coroutines.jvm.internal.f(c = "me.saket.telephoto.zoomable.RealZoomableState$fling$3", f = "RealZoomableState.kt", l = {566}, m = "invokeSuspend")
    static final class h extends kotlin.coroutines.jvm.internal.l implements nI.p<C17860A, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f144683c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f144684d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C17758c f144685e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ long f144686f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ c2.d f144687g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ j f144688h;

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lm0/h;", "Lo1/g;", "Lm0/n;", "LXH/N;", "a", "(Lm0/h;)V"}, k = 3, mv = {1, 9, 0})
        static final class a extends C17544u implements C17642l<C5544h<C5667g, C5556n>, C16807N> {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ C17758c f144689c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ N f144690d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ C17860A f144691e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ j f144692f;

            /* renamed from: g  reason: collision with root package name */
            final /* synthetic */ long f144693g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(C17758c cVar, N n10, C17860A a10, j jVar, long j10) {
                super(1);
                this.f144689c = cVar;
                this.f144690d = n10;
                this.f144691e = a10;
                this.f144692f = jVar;
                this.f144693g = j10;
            }

            public final void a(C5544h<C5667g, C5556n> hVar) {
                C17542s.j(hVar, "$this$animateDecay");
                long b10 = this.f144689c.b();
                long q10 = C5667g.q(hVar.e().v(), this.f144690d.f144347a);
                j jVar = this.f144692f;
                N n10 = this.f144690d;
                long j10 = this.f144693g;
                if (C5668h.b(q10)) {
                    C17860A.a(this.f144691e, 0.0f, q10, 0.0f, b10, 5, (Object) null);
                    this.f144690d.f144347a = hVar.e().v();
                    return;
                }
                String s10 = jVar.F(C16796C.a("value", hVar.e()), C16796C.a("previous", C5667g.d(n10.f144347a)), C16796C.a("velocity", c2.y.b(j10)));
                String t10 = C5667g.t(q10);
                throw new IllegalStateException(("Can't fling with an invalid pan = " + t10 + ". " + s10).toString());
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((C5544h) obj);
                return C16807N.f139792a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(C17758c cVar, long j10, c2.d dVar, j jVar, C17164e<? super h> eVar) {
            super(2, eVar);
            this.f144685e = cVar;
            this.f144686f = j10;
            this.f144687g = dVar;
            this.f144688h = jVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            h hVar = new h(this.f144685e, this.f144686f, this.f144687g, this.f144688h, eVar);
            hVar.f144684d = obj;
            return hVar;
        }

        /* renamed from: i */
        public final Object invoke(C17860A a10, C17164e<? super C16807N> eVar) {
            return ((h) create(a10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f144683c;
            if (i10 == 0) {
                y.b(obj);
                N n10 = new N();
                n10.f144347a = this.f144685e.c();
                C5550k kVar = new C5550k(B0.h(C5667g.f26701b), C5667g.d(n10.f144347a), r.b(c2.y.h(this.f144686f), c2.y.i(this.f144686f)), 0, 0, false, 56, (DefaultConstructorMarker) null);
                C5570z c10 = x.c(this.f144687g);
                a aVar = new a(this.f144685e, n10, (C17860A) this.f144684d, this.f144688h, this.f144686f);
                this.f144683c = 1;
                if (t0.h(kVar, c10, false, aVar, this, 2, (Object) null) == f10) {
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

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LpK/b;", "contentOffset", "Lme/saket/telephoto/zoomable/a;", "contentZoom", "a", "(LpK/b;Lme/saket/telephoto/zoomable/a;)LpK/b;"}, k = 3, mv = {1, 9, 0})
    static final class i extends C17544u implements nI.p<C17757b, a, C17757b> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ j f144694c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C17759d f144695d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(j jVar, C17759d dVar) {
            super(2);
            this.f144694c = jVar;
            this.f144695d = dVar;
        }

        /* renamed from: a */
        public final C17757b invoke(C17757b bVar, a aVar) {
            C17542s.j(bVar, "contentOffset");
            C17542s.j(aVar, "contentZoom");
            return this.f144694c.E(bVar, aVar, this.f144695d);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lme/saket/telephoto/zoomable/f;", "b", "()Lme/saket/telephoto/zoomable/f;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: me.saket.telephoto.zoomable.j$j  reason: collision with other inner class name */
    static final class C3529j extends C17544u implements C17631a<f> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ j f144696c;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo1/m;", "viewportSize", "LpK/d;", "a", "(J)LpK/d;"}, k = 3, mv = {1, 9, 0})
        /* renamed from: me.saket.telephoto.zoomable.j$j$a */
        static final class a implements f {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ j f144697a;

            a(j jVar) {
                this.f144697a = jVar;
            }

            public final C17759d a(long j10) {
                long j11 = j10;
                if (!this.f144697a.S()) {
                    return null;
                }
                C5669i a10 = this.f144697a.Q().a(j11, this.f144697a.N());
                long a11 = this.f144697a.J().a(a10.q(), j11);
                if (!h0.b(a11, C17871f.h(h0.f5906a))) {
                    j jVar = this.f144697a;
                    long a12 = jVar.I().a(C17871f.o(i0.d(a10.q(), a11)), C17871f.o(j10), jVar.N());
                    return new C17759d(j10, C17756a.a(a11), C5667g.r(a10.s(), C17871f.e(C5667g.u(C5668h.a((float) c2.n.h(a12), (float) c2.n.i(a12))), a11)), a10, this.f144697a.I(), this.f144697a.N(), (DefaultConstructorMarker) null);
                }
                String p10 = C5673m.p(j10);
                throw new IllegalStateException(("Base zoom shouldn't be zero. content bounds = " + a10 + ", viewport size = " + p10).toString());
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3529j(j jVar) {
            super(0);
            this.f144696c = jVar;
        }

        /* renamed from: b */
        public final f invoke() {
            return new a(this.f144696c);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    static final class k extends C17544u implements C17631a<Boolean> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ j f144698c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(j jVar) {
            super(0);
            this.f144698c = jVar;
        }

        public final Boolean invoke() {
            return Boolean.valueOf(C17871f.m(this.f144698c.R()) && !C17542s.e(this.f144698c.Q(), m.c.f144730b) && C17871f.m(this.f144698c.Q().a(this.f144698c.R(), this.f144698c.N()).q()));
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LrK/A;", "LXH/N;", "<anonymous>", "(LrK/A;)V"}, k = 3, mv = {1, 9, 0})
    @kotlin.coroutines.jvm.internal.f(c = "me.saket.telephoto.zoomable.RealZoomableState$panBy$2", f = "RealZoomableState.kt", l = {449}, m = "invokeSuspend")
    static final class l extends kotlin.coroutines.jvm.internal.l implements nI.p<C17860A, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f144699c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f144700d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ long f144701e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C5546i<C5667g> f144702f;

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lm0/h;", "Lo1/g;", "Lm0/n;", "LXH/N;", "a", "(Lm0/h;)V"}, k = 3, mv = {1, 9, 0})
        static final class a extends C17544u implements C17642l<C5544h<C5667g, C5556n>, C16807N> {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ C17860A f144703c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ N f144704d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(C17860A a10, N n10) {
                super(1);
                this.f144703c = a10;
                this.f144704d = n10;
            }

            public final void a(C5544h<C5667g, C5556n> hVar) {
                C17542s.j(hVar, "$this$animateTo");
                C17860A.a(this.f144703c, 0.0f, C5667g.q(hVar.e().v(), this.f144704d.f144347a), 0.0f, 0, 13, (Object) null);
                this.f144704d.f144347a = hVar.e().v();
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((C5544h) obj);
                return C16807N.f139792a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(long j10, C5546i<C5667g> iVar, C17164e<? super l> eVar) {
            super(2, eVar);
            this.f144701e = j10;
            this.f144702f = iVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            l lVar = new l(this.f144701e, this.f144702f, eVar);
            lVar.f144700d = obj;
            return lVar;
        }

        /* renamed from: i */
        public final Object invoke(C17860A a10, C17164e<? super C16807N> eVar) {
            return ((l) create(a10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f144699c;
            if (i10 == 0) {
                y.b(obj);
                N n10 = new N();
                C5667g.a aVar = C5667g.f26701b;
                n10.f144347a = aVar.c();
                C5550k kVar = new C5550k(B0.h(aVar), C5667g.d(aVar.c()), (C5562q) null, 0, 0, false, 60, (DefaultConstructorMarker) null);
                C5667g d10 = C5667g.d(this.f144701e);
                C5546i<C5667g> iVar = this.f144702f;
                a aVar2 = new a((C17860A) this.f144700d, n10);
                this.f144699c = 1;
                if (t0.j(kVar, d10, iVar, false, aVar2, this, 4, (Object) null) == f10) {
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

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo1/g;", "finalOffset", "a", "(J)J"}, k = 3, mv = {1, 9, 0})
    static final class m extends C17544u implements C17642l<C5667g, C5667g> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ long f144705c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ a f144706d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ a f144707e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ long f144708f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ j f144709g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        m(long j10, a aVar, a aVar2, long j11, j jVar) {
            super(1);
            this.f144705c = j10;
            this.f144706d = aVar;
            this.f144707e = aVar2;
            this.f144708f = j11;
            this.f144709g = jVar;
        }

        public final long a(long j10) {
            long q10 = C5667g.q(C5667g.r(j10, C17871f.c(this.f144705c, this.f144706d)), C5667g.r(C17871f.c(this.f144705c, this.f144707e), C17871f.c(this.f144708f, this.f144706d)));
            j jVar = this.f144709g;
            long j11 = this.f144705c;
            long j12 = this.f144708f;
            a aVar = this.f144706d;
            a aVar2 = this.f144707e;
            if (C5668h.b(q10)) {
                return q10;
            }
            String s10 = jVar.F(C16796C.a("centroid", C5667g.d(j11)), C16796C.a("panDelta", C5667g.d(j12)), C16796C.a("oldZoom", aVar), C16796C.a("newZoom", aVar2));
            throw new IllegalStateException(("retainCentroidPositionAfterZoom() generated an infinite value. " + s10).toString());
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return C5667g.d(a(((C5667g) obj).v()));
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "zoomDelta", "Lo1/g;", "panDelta", "<anonymous parameter 2>", "centroid", "LXH/N;", "b", "(FJFJ)V"}, k = 3, mv = {1, 9, 0})
    static final class n extends C17544u implements nI.r<Float, C5667g, Float, C5667g, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ j f144710c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        n(j jVar) {
            super(4);
            this.f144710c = jVar;
        }

        /* access modifiers changed from: private */
        /* JADX WARNING: Removed duplicated region for block: B:28:0x00bb  */
        /* JADX WARNING: Removed duplicated region for block: B:30:0x00ef  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static final pK.C17758c c(pK.C17758c r24, float r25, me.saket.telephoto.zoomable.j r26, long r27, long r29, pK.C17759d r31) {
            /*
                r8 = r26
                r9 = r31
                java.lang.String r0 = "$lastGestureState"
                r1 = r24
                kotlin.jvm.internal.C17542s.j(r1, r0)
                java.lang.String r0 = "this$0"
                kotlin.jvm.internal.C17542s.j(r8, r0)
                java.lang.String r0 = "inputs"
                kotlin.jvm.internal.C17542s.j(r9, r0)
                me.saket.telephoto.zoomable.a r6 = new me.saket.telephoto.zoomable.a
                long r2 = r31.b()
                float r0 = r24.d()
                r4 = 0
                r6.<init>(r2, r0, r4)
                long r2 = r6.f()
                boolean r0 = rK.C17871f.k(r2)
                r2 = 0
                if (r0 == 0) goto L_0x0124
                r0 = 1065353216(0x3f800000, float:1.0)
                int r3 = (r25 > r0 ? 1 : (r25 == r0 ? 0 : -1))
                r5 = 1
                if (r3 >= 0) goto L_0x0037
                r3 = r5
                goto L_0x0038
            L_0x0037:
                r3 = r2
            L_0x0038:
                int r7 = (r25 > r0 ? 1 : (r25 == r0 ? 0 : -1))
                if (r7 <= 0) goto L_0x003d
                r2 = r5
            L_0x003d:
                pK.i r5 = r26.d()
                pK.h r5 = r5.c()
                boolean r5 = r6.h(r5)
                pK.i r7 = r26.d()
                pK.h r7 = r7.c()
                boolean r7 = r6.i(r7)
                pK.i r10 = r26.d()
                boolean r10 = r10.b()
                if (r10 != 0) goto L_0x0060
                goto L_0x0074
            L_0x0060:
                r10 = 250(0xfa, float:3.5E-43)
                if (r2 == 0) goto L_0x006b
                if (r5 == 0) goto L_0x006b
                float r2 = (float) r10
                float r2 = r25 / r2
                float r0 = r0 + r2
                goto L_0x0076
            L_0x006b:
                if (r3 == 0) goto L_0x0074
                if (r7 == 0) goto L_0x0074
                float r2 = (float) r10
                float r2 = r25 / r2
                float r0 = r0 - r2
                goto L_0x0076
            L_0x0074:
                r0 = r25
            L_0x0076:
                me.saket.telephoto.zoomable.a r2 = new me.saket.telephoto.zoomable.a
                long r10 = r31.b()
                float r3 = r6.g()
                float r3 = rK.C17871f.s(r3, r0)
                r2.<init>(r10, r3, r4)
                pK.i r3 = r26.d()
                boolean r3 = r3.b()
                if (r3 == 0) goto L_0x00a7
                if (r7 != 0) goto L_0x0095
                if (r5 == 0) goto L_0x00a7
            L_0x0095:
                pK.i r3 = r26.d()
                pK.h r3 = r3.c()
                r4 = 1036831949(0x3dcccccd, float:0.1)
                r5 = 1053609165(0x3ecccccd, float:0.4)
                me.saket.telephoto.zoomable.a r2 = r2.a(r3, r4, r5)
            L_0x00a7:
                r10 = r2
                long r2 = r10.f()
                boolean r4 = rK.C17871f.k(r2)
                if (r4 == 0) goto L_0x00ef
                float r2 = rK.C17871f.g(r2)
                r3 = 0
                int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
                if (r2 <= 0) goto L_0x00ef
                pK.b r2 = new pK.b
                long r12 = r31.a()
                long r14 = r24.c()
                r16 = 0
                r11 = r2
                r11.<init>(r12, r14, r16)
                pK.c r11 = new pK.c
                r0 = r26
                r1 = r2
                r2 = r27
                r4 = r29
                r7 = r10
                pK.b r0 = r0.U(r1, r2, r4, r6, r7)
                pK.b r0 = r8.E(r0, r10, r9)
                long r18 = r0.d()
                float r20 = r10.g()
                r23 = 0
                r17 = r11
                r21 = r27
                r17.<init>(r18, r20, r21, r23)
                return r11
            L_0x00ef:
                java.lang.Float r0 = java.lang.Float.valueOf(r0)
                java.lang.String r1 = "zoomDelta"
                XH.v r0 = XH.C16796C.a(r1, r0)
                XH.v[] r0 = new XH.v[]{r0}
                java.lang.String r0 = r8.F(r0)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "New zoom is invalid/infinite = "
                r1.append(r2)
                r1.append(r10)
                java.lang.String r2 = ". "
                r1.append(r2)
                r1.append(r0)
                java.lang.String r0 = r1.toString()
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r0 = r0.toString()
                r1.<init>(r0)
                throw r1
            L_0x0124:
                XH.v[] r0 = new XH.v[r2]
                java.lang.String r0 = r8.F(r0)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Old zoom is invalid/infinite. "
                r1.append(r2)
                r1.append(r0)
                java.lang.String r0 = r1.toString()
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r0 = r0.toString()
                r1.<init>(r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: me.saket.telephoto.zoomable.j.n.c(pK.c, float, me.saket.telephoto.zoomable.j, long, long, pK.d):pK.c");
        }

        public final void b(float f10, long j10, float f11, long j11) {
            boolean z10 = C17871f.l(j10) && !Float.isInfinite(f10) && !Float.isNaN(f10) && C17871f.l(j11);
            j jVar = this.f144710c;
            if (z10) {
                C17758c p10 = jVar.B();
                if (p10 != null) {
                    j jVar2 = this.f144710c;
                    jVar2.W(new l(p10, f10, jVar2, j11, j10));
                    return;
                }
                return;
            }
            String t10 = C5667g.t(j10);
            String t11 = C5667g.t(j11);
            String s10 = jVar.F(new v[0]);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Can't transform with zoomDelta=");
            float f12 = f10;
            sb2.append(f10);
            sb2.append(", panDelta=");
            sb2.append(t10);
            sb2.append(", centroid=");
            sb2.append(t11);
            sb2.append(". ");
            sb2.append(s10);
            throw new IllegalStateException(sb2.toString().toString());
        }

        public /* bridge */ /* synthetic */ Object l(Object obj, Object obj2, Object obj3, Object obj4) {
            b(((Number) obj).floatValue(), ((C5667g) obj2).v(), ((Number) obj3).floatValue(), ((C5667g) obj4).v());
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lo1/i;", "b", "()Lo1/i;"}, k = 3, mv = {1, 9, 0})
    static final class o extends C17544u implements C17631a<C5669i> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ j f144711c;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lo1/i;", "a", "(Lo1/i;)Lo1/i;"}, k = 3, mv = {1, 9, 0})
        static final class a extends C17544u implements C17642l<C5669i, C5669i> {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ C17765j f144712c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(C17765j jVar) {
                super(1);
                this.f144712c = jVar;
            }

            /* renamed from: a */
            public final C5669i invoke(C5669i iVar) {
                C17542s.j(iVar, "$this$withOrigin");
                return C17871f.r(iVar, this.f144712c.e()).A(this.f144712c.c());
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        o(j jVar) {
            super(0);
            this.f144711c = jVar;
        }

        /* renamed from: b */
        public final C5669i invoke() {
            C17765j f10 = this.f144711c.f();
            j jVar = this.f144711c;
            C17759d q10 = jVar.C();
            C5669i iVar = null;
            C5669i x10 = q10 != null ? C17871f.x(q10.e(), f10.B(), new a(f10)) : null;
            if (x10 != null) {
                return x10;
            }
            rK.r O10 = jVar.O();
            if (O10 != null) {
                iVar = O10.a(jVar);
            }
            return iVar == null ? C5669i.f26706e.a() : iVar;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "b", "()Ljava/lang/Float;"}, k = 3, mv = {1, 9, 0})
    static final class p extends C17544u implements C17631a<Float> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ j f144713c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        p(j jVar) {
            super(0);
            this.f144713c = jVar;
        }

        /* renamed from: b */
        public final Float invoke() {
            C17759d q10 = this.f144713c.C();
            if (q10 == null) {
                return null;
            }
            C17758c a10 = this.f144713c.K().a(q10);
            long b10 = q10.b();
            a.C3526a aVar = a.f144586c;
            float g10 = aVar.d(b10, this.f144713c.d().c()).g();
            float g11 = aVar.c(b10, this.f144713c.d().c()).g();
            float a11 = C17871f.a(a10.d(), g10, g11);
            float f10 = 1.0f;
            if (!C17762g.b(a11, g10) || !C17762g.b(g10, g11)) {
                f10 = C17978n.l(C17871f.d(C17871f.n(a11, g10), C17871f.n(g11, g10)), 0.0f, 1.0f);
            }
            return Float.valueOf(f10);
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "me.saket.telephoto.zoomable.RealZoomableState", f = "RealZoomableState.kt", l = {428, 439}, m = "zoomTo-ubNVwUQ")
    static final class q extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f144714c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f144715d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ j f144716e;

        /* renamed from: f  reason: collision with root package name */
        int f144717f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        q(j jVar, C17164e<? super q> eVar) {
            super(eVar);
            this.f144716e = jVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f144715d = obj;
            this.f144717f |= Integer.MIN_VALUE;
            return this.f144716e.h(0.0f, 0, (C5546i<Float>) null, this);
        }
    }

    public j() {
        this((C17865F) null, false, 3, (DefaultConstructorMarker) null);
    }

    private final Object A(a aVar, long j10, C5589L l10, C5546i<Float> iVar, C17164e<? super C16807N> eVar) {
        C17759d C10 = C();
        if (C10 == null) {
            return C16807N.f139792a;
        }
        C17758c a10 = K().a(C10);
        a aVar2 = new a(C10.b(), a10.d(), (DefaultConstructorMarker) null);
        C17757b bVar = new C17757b(C10.a(), a10.c(), (DefaultConstructorMarker) null);
        a aVar3 = aVar;
        C17757b E10 = E(V(this, bVar, j10, 0, aVar2, aVar, 2, (Object) null), aVar3, C10);
        C17863D d10 = this.f144647q;
        e eVar2 = r0;
        e eVar3 = new e(iVar, aVar2, aVar3, bVar, a10, E10, this, j10, (C17164e<? super e>) null);
        Object a11 = d10.a(l10, eVar2, eVar);
        return a11 == C17187b.f() ? a11 : C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public final C17758c B() {
        C17759d C10 = C();
        if (C10 != null) {
            return K().a(C10);
        }
        return null;
    }

    /* access modifiers changed from: private */
    public final C17759d C() {
        return L().a(R());
    }

    /* access modifiers changed from: private */
    public final C17757b E(C17757b bVar, a aVar, C17759d dVar) {
        if (bVar.e()) {
            C5669i e10 = dVar.e();
            return bVar.f(new f(aVar, C17871f.q(e10.s(), aVar), this, e10, dVar));
        }
        String F10 = F(C16796C.a("proposedZoom", aVar));
        throw new IllegalStateException(("Can't coerce an infinite offset " + F10).toString());
    }

    /* access modifiers changed from: private */
    public final String F(v<String, ? extends Object>... vVarArr) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(10);
        C17542s.i(sb2, "append(...)");
        for (v<String, ? extends Object> vVar : vVarArr) {
            sb2.append(vVar.a() + " = " + vVar.b());
            C17542s.i(sb2, "append(...)");
            sb2.append(10);
            C17542s.i(sb2, "append(...)");
        }
        C17759d C10 = C();
        sb2.append("gestureStateInputs = " + C10);
        C17542s.i(sb2, "append(...)");
        sb2.append(10);
        C17542s.i(sb2, "append(...)");
        sb2.append("gestureState = " + B());
        C17542s.i(sb2, "append(...)");
        sb2.append(10);
        C17542s.i(sb2, "append(...)");
        sb2.append("contentTransformation = " + f());
        C17542s.i(sb2, "append(...)");
        sb2.append(10);
        C17542s.i(sb2, "append(...)");
        sb2.append("contentScale = " + J());
        C17542s.i(sb2, "append(...)");
        sb2.append(10);
        C17542s.i(sb2, "append(...)");
        sb2.append("contentAlignment = " + I());
        C17542s.i(sb2, "append(...)");
        sb2.append(10);
        C17542s.i(sb2, "append(...)");
        sb2.append("isReadyToInteract = " + S());
        C17542s.i(sb2, "append(...)");
        sb2.append(10);
        C17542s.i(sb2, "append(...)");
        sb2.append("unscaledContentLocation = " + Q());
        C17542s.i(sb2, "append(...)");
        sb2.append(10);
        C17542s.i(sb2, "append(...)");
        sb2.append("unscaledContentBounds = " + (C10 != null ? C10.e() : null));
        C17542s.i(sb2, "append(...)");
        sb2.append(10);
        C17542s.i(sb2, "append(...)");
        sb2.append("zoomSpec = " + d());
        C17542s.i(sb2, "append(...)");
        sb2.append(10);
        C17542s.i(sb2, "append(...)");
        sb2.append("Please share this error message to https://github.com/saket/telephoto/issues/41?");
        C17542s.i(sb2, "append(...)");
        sb2.append(10);
        C17542s.i(sb2, "append(...)");
        String sb3 = sb2.toString();
        C17542s.i(sb3, "toString(...)");
        return sb3;
    }

    /* access modifiers changed from: private */
    public static final C17758c H(C17865F f10, j jVar, C17759d dVar) {
        C17758c a10;
        C17542s.j(jVar, "this$0");
        C17542s.j(dVar, "inputs");
        if (f10 != null && (a10 = f10.a(dVar, new i(jVar, dVar))) != null) {
            return a10;
        }
        return new C17758c(C17761f.a(C5667g.f26701b.c()), C17762g.a(1.0f), C5674n.b(dVar.f()), (DefaultConstructorMarker) null);
    }

    /* access modifiers changed from: private */
    public final e K() {
        return (e) this.f144642l.getValue();
    }

    private final f L() {
        return (f) this.f144643m.getValue();
    }

    /* access modifiers changed from: private */
    public final m Q() {
        return (m) this.f144640j.getValue();
    }

    /* access modifiers changed from: private */
    public final C17757b U(C17757b bVar, long j10, long j11, a aVar, a aVar2) {
        if (bVar.e()) {
            C17757b bVar2 = bVar;
            return bVar.f(new m(j10, aVar, aVar2, j11, this));
        }
        String F10 = F(new v[0]);
        throw new IllegalStateException(("Can't center around an infinite offset " + F10).toString());
    }

    static /* synthetic */ C17757b V(j jVar, C17757b bVar, long j10, long j11, a aVar, a aVar2, int i10, Object obj) {
        return jVar.U(bVar, j10, (i10 & 2) != 0 ? C5667g.f26701b.c() : j11, aVar, aVar2);
    }

    /* access modifiers changed from: private */
    public final void W(e eVar) {
        this.f144642l.setValue(eVar);
    }

    private final void a0(m mVar) {
        this.f144640j.setValue(mVar);
    }

    /* access modifiers changed from: private */
    public final C5669i d0(C5669i iVar) {
        if (iVar.q() != C5673m.f26722b.a()) {
            return iVar;
        }
        throw new IllegalStateException("The zoomable content is too large to safely calculate its draw region. This can happen if you're using an unusually large value for ZoomSpec#maxZoomFactor (for e.g., Float.MAX_VALUE). Please file an issue on https://github.com/saket/telephoto/issues if you think this is a mistake.");
    }

    public final boolean D(long j10) {
        C17759d C10 = C();
        if (C10 == null) {
            return false;
        }
        C17758c a10 = K().a(C10);
        a aVar = new a(C10.b(), a10.d(), (DefaultConstructorMarker) null);
        long c10 = C17871f.c(j10, aVar);
        C17757b bVar = new C17757b(C10.a(), C17761f.d(a10.c(), c10), (DefaultConstructorMarker) null);
        if (bVar.e()) {
            long q10 = C5667g.q(c10, C5667g.q(E(bVar, aVar, C10).d(), bVar.d()));
            return Math.abs((Math.abs(C5667g.m(c10)) > Math.abs(C5667g.n(c10)) ? 1 : (Math.abs(C5667g.m(c10)) == Math.abs(C5667g.n(c10)) ? 0 : -1)) > 0 ? C5667g.m(q10) : C5667g.n(q10)) > 0.001f;
        }
        String F10 = F(C16796C.a("panDelta", C5667g.d(j10)));
        throw new IllegalStateException(("Offset can't be infinite " + F10).toString());
    }

    public final Object G(long j10, c2.d dVar, C17164e<? super C16807N> eVar) {
        float h10 = c2.y.h(j10);
        if (!Float.isInfinite(h10) && !Float.isNaN(h10)) {
            float i10 = c2.y.i(j10);
            if (!Float.isInfinite(i10) && !Float.isNaN(i10)) {
                C17758c B10 = B();
                if (B10 != null) {
                    Object a10 = this.f144647q.a(rK.q.f146796a.a(), new h(B10, j10, dVar, this, (C17164e<? super h>) null), eVar);
                    return a10 == C17187b.f() ? a10 : C16807N.f139792a;
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append("called too early? ");
                sb2.append(!S());
                throw new IllegalStateException(sb2.toString().toString());
            }
        }
        String n10 = c2.y.n(j10);
        throw new IllegalStateException(("Invalid velocity = " + n10).toString());
    }

    public C5437c I() {
        return (C5437c) this.f144636f.getValue();
    }

    public C4478k J() {
        return (C4478k) this.f144635e.getValue();
    }

    public final h M() {
        return (h) this.f144638h.getValue();
    }

    public final t N() {
        return (t) this.f144639i.getValue();
    }

    public final rK.r O() {
        return (rK.r) this.f144644n.getValue();
    }

    public final C17863D P() {
        return this.f144647q;
    }

    public final long R() {
        return ((C5673m) this.f144641k.getValue()).q();
    }

    public final boolean S() {
        return ((Boolean) this.f144646p.getValue()).booleanValue();
    }

    public final boolean T() {
        C17759d C10 = C();
        if (C10 == null) {
            return false;
        }
        a aVar = new a(C10.b(), K().a(C10).d(), (DefaultConstructorMarker) null);
        return Math.abs(aVar.g() - a.b(aVar, d().c(), 0.0f, 0.0f, 6, (Object) null).g()) > 0.001f;
    }

    public final void X(h hVar) {
        C17542s.j(hVar, "<set-?>");
        this.f144638h.setValue(hVar);
    }

    public final void Y(t tVar) {
        C17542s.j(tVar, "<set-?>");
        this.f144639i.setValue(tVar);
    }

    public final void Z(rK.r rVar) {
        this.f144644n.setValue(rVar);
    }

    public final void b0(long j10) {
        this.f144641k.setValue(C5673m.c(j10));
    }

    public void c(boolean z10) {
        this.f144634d.setValue(Boolean.valueOf(z10));
    }

    public void c0(C17764i iVar) {
        C17542s.j(iVar, "<set-?>");
        this.f144637g.setValue(iVar);
    }

    public C17764i d() {
        return (C17764i) this.f144637g.getValue();
    }

    public void e(C5437c cVar) {
        C17542s.j(cVar, "<set-?>");
        this.f144636f.setValue(cVar);
    }

    public C17765j f() {
        return (C17765j) this.f144632b.getValue();
    }

    public void g(C4478k kVar) {
        C17542s.j(kVar, "<set-?>");
        this.f144635e.setValue(kVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object h(float r11, long r12, m0.C5546i<java.lang.Float> r14, dI.C17164e<? super XH.C16807N> r15) {
        /*
            r10 = this;
            boolean r0 = r15 instanceof me.saket.telephoto.zoomable.j.q
            if (r0 == 0) goto L_0x0013
            r0 = r15
            me.saket.telephoto.zoomable.j$q r0 = (me.saket.telephoto.zoomable.j.q) r0
            int r1 = r0.f144717f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f144717f = r1
            goto L_0x0018
        L_0x0013:
            me.saket.telephoto.zoomable.j$q r0 = new me.saket.telephoto.zoomable.j$q
            r0.<init>(r10, r15)
        L_0x0018:
            java.lang.Object r15 = r0.f144715d
            java.lang.Object r8 = eI.C17187b.f()
            int r1 = r0.f144717f
            r9 = 2
            r2 = 1
            if (r1 == 0) goto L_0x003d
            if (r1 == r2) goto L_0x0035
            if (r1 != r9) goto L_0x002d
            XH.y.b(r15)
            goto L_0x0092
        L_0x002d:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x0035:
            java.lang.Object r11 = r0.f144714c
            me.saket.telephoto.zoomable.j r11 = (me.saket.telephoto.zoomable.j) r11
            XH.y.b(r15)
            goto L_0x0076
        L_0x003d:
            XH.y.b(r15)
            pK.d r15 = r10.C()
            if (r15 != 0) goto L_0x0049
            XH.N r11 = XH.C16807N.f139792a
            return r11
        L_0x0049:
            me.saket.telephoto.zoomable.a$a r1 = me.saket.telephoto.zoomable.a.f144586c
            long r3 = r15.b()
            me.saket.telephoto.zoomable.a r11 = r1.a(r3, r11)
            boolean r1 = o1.C5668h.c(r12)
            if (r1 == 0) goto L_0x005b
        L_0x0059:
            r3 = r12
            goto L_0x0064
        L_0x005b:
            long r12 = r15.f()
            long r12 = o1.C5674n.b(r12)
            goto L_0x0059
        L_0x0064:
            n0.L r5 = n0.C5589L.UserInput
            r0.f144714c = r10
            r0.f144717f = r2
            r1 = r10
            r2 = r11
            r6 = r14
            r7 = r0
            java.lang.Object r11 = r1.A(r2, r3, r5, r6, r7)
            if (r11 != r8) goto L_0x0075
            return r8
        L_0x0075:
            r11 = r10
        L_0x0076:
            pK.i r12 = r11.d()
            boolean r12 = r12.b()
            if (r12 == 0) goto L_0x0095
            boolean r12 = r11.T()
            if (r12 == 0) goto L_0x0095
            r12 = 0
            r0.f144714c = r12
            r0.f144717f = r9
            java.lang.Object r11 = r11.z(r0)
            if (r11 != r8) goto L_0x0092
            return r8
        L_0x0092:
            XH.N r11 = XH.C16807N.f139792a
            return r11
        L_0x0095:
            XH.N r11 = XH.C16807N.f139792a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: me.saket.telephoto.zoomable.j.h(float, long, m0.i, dI.e):java.lang.Object");
    }

    public Object i(C5546i<Float> iVar, C17164e<? super C16807N> eVar) {
        C17759d C10 = C();
        if (C10 == null) {
            return C16807N.f139792a;
        }
        Object a10 = C17769n.a(this, C17756a.c(C10.b()), 0, iVar, eVar, 2, (Object) null);
        return a10 == C17187b.f() ? a10 : C16807N.f139792a;
    }

    public Object j(long j10, C5546i<C5667g> iVar, C17164e<? super C16807N> eVar) {
        Object a10 = this.f144647q.a(C5589L.UserInput, new l(j10, iVar, (C17164e<? super l>) null), eVar);
        return a10 == C17187b.f() ? a10 : C16807N.f139792a;
    }

    public Float k() {
        return (Float) this.f144633c.getValue();
    }

    public Object l(float f10, long j10, C5546i<Float> iVar, C17164e<? super C16807N> eVar) {
        C17758c B10 = B();
        if (B10 == null) {
            return C16807N.f139792a;
        }
        Object h10 = h(B10.d() * f10, j10, iVar, eVar);
        return h10 == C17187b.f() ? h10 : C16807N.f139792a;
    }

    public boolean m() {
        return ((Boolean) this.f144634d.getValue()).booleanValue();
    }

    public void n(m mVar) {
        C17542s.j(mVar, "location");
        a0(mVar);
    }

    public final Object z(C17164e<? super C16807N> eVar) {
        C17759d C10 = C();
        if (C10 != null) {
            C17758c a10 = K().a(C10);
            Object a11 = this.f144647q.a(C5589L.Default, new d(a10, a.b(new a(C10.b(), a10.d(), (DefaultConstructorMarker) null), d().c(), 0.0f, 0.0f, 6, (Object) null).g(), (C17164e<? super d>) null), eVar);
            return a11 == C17187b.f() ? a11 : C16807N.f139792a;
        }
        throw new IllegalStateException("shouldn't have gotten called");
    }

    public j(C17865F f10, boolean z10) {
        this.f144632b = p1.e(new g(this));
        this.f144633c = p1.e(new p(this));
        this.f144634d = u1.e(Boolean.valueOf(z10), (o1) null, 2, (Object) null);
        this.f144635e = u1.e(C4478k.f5915a.e(), (o1) null, 2, (Object) null);
        this.f144636f = u1.e(C5437c.f24302a.e(), (o1) null, 2, (Object) null);
        this.f144637g = u1.e(new C17764i(0.0f, false, 3, (DefaultConstructorMarker) null), (o1) null, 2, (Object) null);
        this.f144638h = u1.e(new h(false, (g) null, 3, (DefaultConstructorMarker) null), (o1) null, 2, (Object) null);
        this.f144639i = u1.e(t.Ltr, (o1) null, 2, (Object) null);
        this.f144640j = u1.e(m.b.f144729b, (o1) null, 2, (Object) null);
        this.f144641k = u1.e(C5673m.c(C5673m.f26722b.a()), (o1) null, 2, (Object) null);
        this.f144642l = u1.e(new i(f10, this), (o1) null, 2, (Object) null);
        this.f144643m = p1.e(new C3529j(this));
        this.f144644n = u1.e((Object) null, (o1) null, 2, (Object) null);
        this.f144645o = p1.e(new o(this));
        this.f144646p = p1.e(new k(this));
        this.f144647q = C17864E.a(new n(this));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(C17865F f10, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : f10, (i10 & 2) != 0 ? true : z10);
    }
}
