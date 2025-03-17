package u1;

import XH.C16824o;
import XH.C16825p;
import XH.s;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17631a;
import p1.C5728l0;
import p1.C5749w0;
import p1.U0;
import p1.V0;
import p1.X;
import p1.X0;
import p1.Y;
import r1.f;
import r1.g;
import r1.k;

@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0003J\u0013\u0010\b\u001a\u00020\u0004*\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fR*\u0010\u0013\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\n8\u0006@FX\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u0012R.\u0010\u001b\u001a\u0004\u0018\u00010\u00142\b\u0010\r\u001a\u0004\u0018\u00010\u00148\u0006@FX\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR*\u0010#\u001a\u00020\u001c2\u0006\u0010\r\u001a\u00020\u001c8\u0006@FX\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R6\u0010+\u001a\b\u0012\u0004\u0012\u00020%0$2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020%0$8\u0006@FX\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R0\u00103\u001a\u00020,2\u0006\u0010\r\u001a\u00020,8\u0006@FX\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R*\u00107\u001a\u00020\u001c2\u0006\u0010\r\u001a\u00020\u001c8\u0006@FX\u000e¢\u0006\u0012\n\u0004\b4\u0010\u001e\u001a\u0004\b5\u0010 \"\u0004\b6\u0010\"R*\u0010:\u001a\u00020\u001c2\u0006\u0010\r\u001a\u00020\u001c8\u0006@FX\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001e\u001a\u0004\b8\u0010 \"\u0004\b9\u0010\"R.\u0010<\u001a\u0004\u0018\u00010\u00142\b\u0010\r\u001a\u0004\u0018\u00010\u00148\u0006@FX\u000e¢\u0006\u0012\n\u0004\b!\u0010\u0016\u001a\u0004\b4\u0010\u0018\"\u0004\b;\u0010\u001aR0\u0010@\u001a\u00020=2\u0006\u0010\r\u001a\u00020=8\u0006@FX\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0011\u0010.\u001a\u0004\b>\u00100\"\u0004\b?\u00102R0\u0010D\u001a\u00020A2\u0006\u0010\r\u001a\u00020A8\u0006@FX\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b)\u0010.\u001a\u0004\bB\u00100\"\u0004\bC\u00102R*\u0010G\u001a\u00020\u001c2\u0006\u0010\r\u001a\u00020\u001c8\u0006@FX\u000e¢\u0006\u0012\n\u0004\b1\u0010\u001e\u001a\u0004\bE\u0010 \"\u0004\bF\u0010\"R*\u0010J\u001a\u00020\u001c2\u0006\u0010\r\u001a\u00020\u001c8\u0006@FX\u000e¢\u0006\u0012\n\u0004\b;\u0010\u001e\u001a\u0004\bH\u0010 \"\u0004\bI\u0010\"R*\u0010M\u001a\u00020\u001c2\u0006\u0010\r\u001a\u00020\u001c8\u0006@FX\u000e¢\u0006\u0012\n\u0004\b6\u0010\u001e\u001a\u0004\bK\u0010 \"\u0004\bL\u0010\"R*\u0010P\u001a\u00020\u001c2\u0006\u0010\r\u001a\u00020\u001c8\u0006@FX\u000e¢\u0006\u0012\n\u0004\b?\u0010\u001e\u001a\u0004\bN\u0010 \"\u0004\bO\u0010\"R\u0016\u0010S\u001a\u00020Q8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bC\u0010RR\u0016\u0010T\u001a\u00020Q8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bF\u0010RR\u0016\u0010U\u001a\u00020Q8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b9\u0010RR\u0018\u0010X\u001a\u0004\u0018\u00010V8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bL\u0010WR\u0014\u0010[\u001a\u00020Y8\u0002X\u0004¢\u0006\u0006\n\u0004\bO\u0010ZR\u0016\u0010\\\u001a\u00020Y8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bI\u0010ZR\u001b\u0010`\u001a\u00020]8BX\u0002¢\u0006\f\n\u0004\b\u0005\u0010^\u001a\u0004\b-\u0010_\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006a"}, d2 = {"Lu1/g;", "Lu1/l;", "<init>", "()V", "LXH/N;", "v", "w", "Lr1/f;", "a", "(Lr1/f;)V", "", "toString", "()Ljava/lang/String;", "value", "b", "Ljava/lang/String;", "getName", "j", "(Ljava/lang/String;)V", "name", "Lp1/l0;", "c", "Lp1/l0;", "e", "()Lp1/l0;", "h", "(Lp1/l0;)V", "fill", "", "d", "F", "getFillAlpha", "()F", "i", "(F)V", "fillAlpha", "", "Lu1/h;", "Ljava/util/List;", "getPathData", "()Ljava/util/List;", "k", "(Ljava/util/List;)V", "pathData", "Lp1/W0;", "f", "I", "getPathFillType-Rg-k1Os", "()I", "l", "(I)V", "pathFillType", "g", "getStrokeAlpha", "n", "strokeAlpha", "getStrokeLineWidth", "r", "strokeLineWidth", "m", "stroke", "Lp1/k1;", "getStrokeLineCap-KaPHkGw", "o", "strokeLineCap", "Lp1/l1;", "getStrokeLineJoin-LxFBmk8", "p", "strokeLineJoin", "getStrokeLineMiter", "q", "strokeLineMiter", "getTrimPathStart", "u", "trimPathStart", "getTrimPathEnd", "s", "trimPathEnd", "getTrimPathOffset", "t", "trimPathOffset", "", "Z", "isPathDirty", "isStrokeDirty", "isTrimPathDirty", "Lr1/k;", "Lr1/k;", "strokeStyle", "Lp1/U0;", "Lp1/U0;", "path", "renderPath", "Lp1/X0;", "LXH/o;", "()Lp1/X0;", "pathMeasure", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: u1.g  reason: case insensitive filesystem */
public final class C6009g extends l {

    /* renamed from: b  reason: collision with root package name */
    private String f29861b = "";

    /* renamed from: c  reason: collision with root package name */
    private C5728l0 f29862c;

    /* renamed from: d  reason: collision with root package name */
    private float f29863d = 1.0f;

    /* renamed from: e  reason: collision with root package name */
    private List<? extends C6010h> f29864e = q.d();

    /* renamed from: f  reason: collision with root package name */
    private int f29865f = q.a();

    /* renamed from: g  reason: collision with root package name */
    private float f29866g = 1.0f;

    /* renamed from: h  reason: collision with root package name */
    private float f29867h;

    /* renamed from: i  reason: collision with root package name */
    private C5728l0 f29868i;

    /* renamed from: j  reason: collision with root package name */
    private int f29869j = q.b();

    /* renamed from: k  reason: collision with root package name */
    private int f29870k = q.c();

    /* renamed from: l  reason: collision with root package name */
    private float f29871l = 4.0f;

    /* renamed from: m  reason: collision with root package name */
    private float f29872m;

    /* renamed from: n  reason: collision with root package name */
    private float f29873n = 1.0f;

    /* renamed from: o  reason: collision with root package name */
    private float f29874o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f29875p = true;

    /* renamed from: q  reason: collision with root package name */
    private boolean f29876q = true;

    /* renamed from: r  reason: collision with root package name */
    private boolean f29877r;

    /* renamed from: s  reason: collision with root package name */
    private k f29878s;

    /* renamed from: t  reason: collision with root package name */
    private final U0 f29879t;

    /* renamed from: u  reason: collision with root package name */
    private U0 f29880u;

    /* renamed from: v  reason: collision with root package name */
    private final C16824o f29881v;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lp1/X0;", "b", "()Lp1/X0;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: u1.g$a */
    static final class a extends C17544u implements C17631a<X0> {

        /* renamed from: c  reason: collision with root package name */
        public static final a f29882c = new a();

        a() {
            super(0);
        }

        /* renamed from: b */
        public final X0 invoke() {
            return X.a();
        }
    }

    public C6009g() {
        super((DefaultConstructorMarker) null);
        U0 a10 = Y.a();
        this.f29879t = a10;
        this.f29880u = a10;
        this.f29881v = C16825p.a(s.NONE, a.f29882c);
    }

    private final X0 f() {
        return (X0) this.f29881v.getValue();
    }

    private final void v() {
        k.c(this.f29864e, this.f29879t);
        w();
    }

    private final void w() {
        if (this.f29872m == 0.0f && this.f29873n == 1.0f) {
            this.f29880u = this.f29879t;
            return;
        }
        if (C17542s.e(this.f29880u, this.f29879t)) {
            this.f29880u = Y.a();
        } else {
            int r10 = this.f29880u.r();
            this.f29880u.D();
            this.f29880u.k(r10);
        }
        f().b(this.f29879t, false);
        float length = f().getLength();
        float f10 = this.f29872m;
        float f11 = this.f29874o;
        float f12 = ((f10 + f11) % 1.0f) * length;
        float f13 = ((this.f29873n + f11) % 1.0f) * length;
        if (f12 > f13) {
            f().a(f12, length, this.f29880u, true);
            f().a(0.0f, f13, this.f29880u, true);
            return;
        }
        f().a(f12, f13, this.f29880u, true);
    }

    public void a(f fVar) {
        if (this.f29875p) {
            v();
        } else if (this.f29877r) {
            w();
        }
        this.f29875p = false;
        this.f29877r = false;
        C5728l0 l0Var = this.f29862c;
        if (l0Var != null) {
            f.R(fVar, this.f29880u, l0Var, this.f29863d, (g) null, (C5749w0) null, 0, 56, (Object) null);
        }
        C5728l0 l0Var2 = this.f29868i;
        if (l0Var2 != null) {
            k kVar = this.f29878s;
            if (this.f29876q || kVar == null) {
                kVar = new k(this.f29867h, this.f29871l, this.f29869j, this.f29870k, (V0) null, 16, (DefaultConstructorMarker) null);
                this.f29878s = kVar;
                this.f29876q = false;
            }
            f.R(fVar, this.f29880u, l0Var2, this.f29866g, kVar, (C5749w0) null, 0, 48, (Object) null);
        }
    }

    public final C5728l0 e() {
        return this.f29862c;
    }

    public final C5728l0 g() {
        return this.f29868i;
    }

    public final void h(C5728l0 l0Var) {
        this.f29862c = l0Var;
        c();
    }

    public final void i(float f10) {
        this.f29863d = f10;
        c();
    }

    public final void j(String str) {
        this.f29861b = str;
        c();
    }

    public final void k(List<? extends C6010h> list) {
        this.f29864e = list;
        this.f29875p = true;
        c();
    }

    public final void l(int i10) {
        this.f29865f = i10;
        this.f29880u.k(i10);
        c();
    }

    public final void m(C5728l0 l0Var) {
        this.f29868i = l0Var;
        c();
    }

    public final void n(float f10) {
        this.f29866g = f10;
        c();
    }

    public final void o(int i10) {
        this.f29869j = i10;
        this.f29876q = true;
        c();
    }

    public final void p(int i10) {
        this.f29870k = i10;
        this.f29876q = true;
        c();
    }

    public final void q(float f10) {
        this.f29871l = f10;
        this.f29876q = true;
        c();
    }

    public final void r(float f10) {
        this.f29867h = f10;
        this.f29876q = true;
        c();
    }

    public final void s(float f10) {
        this.f29873n = f10;
        this.f29877r = true;
        c();
    }

    public final void t(float f10) {
        this.f29874o = f10;
        this.f29877r = true;
        c();
    }

    public String toString() {
        return this.f29879t.toString();
    }

    public final void u(float f10) {
        this.f29872m = f10;
        this.f29877r = true;
        c();
    }
}
