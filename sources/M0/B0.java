package m0;

import c2.h;
import c2.j;
import c2.n;
import c2.r;
import c2.s;
import kotlin.Metadata;
import kotlin.jvm.internal.C17536l;
import kotlin.jvm.internal.C17544u;
import nI.C17642l;
import o1.C5667g;
import o1.C5668h;
import o1.C5669i;
import o1.C5673m;
import o1.C5674n;
import tI.C17978n;

@Metadata(d1 = {"\u0000¬\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aQ\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0007\u0010\b\u001a'\u0010\r\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\tH\u0000¢\u0006\u0004\b\r\u0010\u000e\" \u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000f0\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0010\" \u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u000f0\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0010\" \u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u000f0\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0010\" \u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0010\" \u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u00190\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0010\" \u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u00190\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b \u0010\u0010\" \u0010$\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u00190\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0010\" \u0010'\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u00190\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b&\u0010\u0010\" \u0010+\u001a\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020)0\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b*\u0010\u0010\"!\u0010.\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000f0\u0006*\u00020,8F¢\u0006\u0006\u001a\u0004\b \u0010-\"!\u0010.\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u000f0\u0006*\u00020/8F¢\u0006\u0006\u001a\u0004\b#\u00100\"!\u0010.\u001a\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020)0\u0006*\u0002018F¢\u0006\u0006\u001a\u0004\b*\u00102\"!\u0010.\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u000f0\u0006*\u0002038F¢\u0006\u0006\u001a\u0004\b\u0013\u00104\"!\u0010.\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u0006*\u0002058F¢\u0006\u0006\u001a\u0004\b\u0016\u00106\"!\u0010.\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u00190\u0006*\u0002078F¢\u0006\u0006\u001a\u0004\b8\u00109\"!\u0010.\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u00190\u0006*\u00020:8F¢\u0006\u0006\u001a\u0004\b&\u0010;\"!\u0010.\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u00190\u0006*\u00020<8F¢\u0006\u0006\u001a\u0004\b\u001a\u0010=\"!\u0010.\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u00190\u0006*\u00020>8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010?¨\u0006@"}, d2 = {"T", "Lm0/q;", "V", "Lkotlin/Function1;", "convertToVector", "convertFromVector", "Lm0/z0;", "a", "(LnI/l;LnI/l;)Lm0/z0;", "", "start", "stop", "fraction", "k", "(FFF)F", "Lm0/m;", "Lm0/z0;", "FloatToVector", "", "b", "IntToVector", "Lc2/h;", "c", "DpToVector", "Lc2/j;", "Lm0/n;", "d", "DpOffsetToVector", "Lo1/m;", "e", "SizeToVector", "Lo1/g;", "f", "OffsetToVector", "Lc2/n;", "g", "IntOffsetToVector", "Lc2/r;", "h", "IntSizeToVector", "Lo1/i;", "Lm0/p;", "i", "RectToVector", "Lkotlin/Float$Companion;", "(Lkotlin/jvm/internal/l;)Lm0/z0;", "VectorConverter", "Lkotlin/Int$Companion;", "(Lkotlin/jvm/internal/r;)Lm0/z0;", "Lo1/i$a;", "(Lo1/i$a;)Lm0/z0;", "Lc2/h$a;", "(Lc2/h$a;)Lm0/z0;", "Lc2/j$a;", "(Lc2/j$a;)Lm0/z0;", "Lo1/m$a;", "j", "(Lo1/m$a;)Lm0/z0;", "Lo1/g$a;", "(Lo1/g$a;)Lm0/z0;", "Lc2/n$a;", "(Lc2/n$a;)Lm0/z0;", "Lc2/r$a;", "(Lc2/r$a;)Lm0/z0;", "animation-core_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class B0 {

    /* renamed from: a  reason: collision with root package name */
    private static final z0<Float, C5554m> f25505a = a(e.f25518c, f.f25519c);

    /* renamed from: b  reason: collision with root package name */
    private static final z0<Integer, C5554m> f25506b = a(k.f25524c, l.f25525c);

    /* renamed from: c  reason: collision with root package name */
    private static final z0<c2.h, C5554m> f25507c = a(c.f25516c, d.f25517c);

    /* renamed from: d  reason: collision with root package name */
    private static final z0<c2.j, C5556n> f25508d = a(a.f25514c, b.f25515c);

    /* renamed from: e  reason: collision with root package name */
    private static final z0<C5673m, C5556n> f25509e = a(q.f25530c, r.f25531c);

    /* renamed from: f  reason: collision with root package name */
    private static final z0<C5667g, C5556n> f25510f = a(m.f25526c, n.f25527c);

    /* renamed from: g  reason: collision with root package name */
    private static final z0<c2.n, C5556n> f25511g = a(g.f25520c, h.f25521c);

    /* renamed from: h  reason: collision with root package name */
    private static final z0<c2.r, C5556n> f25512h = a(i.f25522c, j.f25523c);

    /* renamed from: i  reason: collision with root package name */
    private static final z0<C5669i, C5560p> f25513i = a(o.f25528c, p.f25529c);

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lc2/j;", "it", "Lm0/n;", "a", "(J)Lm0/n;"}, k = 3, mv = {1, 8, 0})
    static final class a extends C17544u implements C17642l<c2.j, C5556n> {

        /* renamed from: c  reason: collision with root package name */
        public static final a f25514c = new a();

        a() {
            super(1);
        }

        public final C5556n a(long j10) {
            return new C5556n(c2.j.e(j10), c2.j.f(j10));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((c2.j) obj).i());
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm0/n;", "it", "Lc2/j;", "a", "(Lm0/n;)J"}, k = 3, mv = {1, 8, 0})
    static final class b extends C17544u implements C17642l<C5556n, c2.j> {

        /* renamed from: c  reason: collision with root package name */
        public static final b f25515c = new b();

        b() {
            super(1);
        }

        public final long a(C5556n nVar) {
            return c2.i.a(c2.h.B(nVar.f()), c2.h.B(nVar.g()));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return c2.j.a(a((C5556n) obj));
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lc2/h;", "it", "Lm0/m;", "a", "(F)Lm0/m;"}, k = 3, mv = {1, 8, 0})
    static final class c extends C17544u implements C17642l<c2.h, C5554m> {

        /* renamed from: c  reason: collision with root package name */
        public static final c f25516c = new c();

        c() {
            super(1);
        }

        public final C5554m a(float f10) {
            return new C5554m(f10);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((c2.h) obj).G());
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm0/m;", "it", "Lc2/h;", "a", "(Lm0/m;)F"}, k = 3, mv = {1, 8, 0})
    static final class d extends C17544u implements C17642l<C5554m, c2.h> {

        /* renamed from: c  reason: collision with root package name */
        public static final d f25517c = new d();

        d() {
            super(1);
        }

        public final float a(C5554m mVar) {
            return c2.h.B(mVar.f());
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return c2.h.m(a((C5554m) obj));
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lm0/m;", "a", "(F)Lm0/m;"}, k = 3, mv = {1, 8, 0})
    static final class e extends C17544u implements C17642l<Float, C5554m> {

        /* renamed from: c  reason: collision with root package name */
        public static final e f25518c = new e();

        e() {
            super(1);
        }

        public final C5554m a(float f10) {
            return new C5554m(f10);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).floatValue());
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm0/m;", "it", "", "a", "(Lm0/m;)Ljava/lang/Float;"}, k = 3, mv = {1, 8, 0})
    static final class f extends C17544u implements C17642l<C5554m, Float> {

        /* renamed from: c  reason: collision with root package name */
        public static final f f25519c = new f();

        f() {
            super(1);
        }

        /* renamed from: a */
        public final Float invoke(C5554m mVar) {
            return Float.valueOf(mVar.f());
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lc2/n;", "it", "Lm0/n;", "a", "(J)Lm0/n;"}, k = 3, mv = {1, 8, 0})
    static final class g extends C17544u implements C17642l<c2.n, C5556n> {

        /* renamed from: c  reason: collision with root package name */
        public static final g f25520c = new g();

        g() {
            super(1);
        }

        public final C5556n a(long j10) {
            return new C5556n((float) c2.n.h(j10), (float) c2.n.i(j10));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((c2.n) obj).n());
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm0/n;", "it", "Lc2/n;", "a", "(Lm0/n;)J"}, k = 3, mv = {1, 8, 0})
    static final class h extends C17544u implements C17642l<C5556n, c2.n> {

        /* renamed from: c  reason: collision with root package name */
        public static final h f25521c = new h();

        h() {
            super(1);
        }

        public final long a(C5556n nVar) {
            return c2.o.a(Math.round(nVar.f()), Math.round(nVar.g()));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return c2.n.b(a((C5556n) obj));
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lc2/r;", "it", "Lm0/n;", "a", "(J)Lm0/n;"}, k = 3, mv = {1, 8, 0})
    static final class i extends C17544u implements C17642l<c2.r, C5556n> {

        /* renamed from: c  reason: collision with root package name */
        public static final i f25522c = new i();

        i() {
            super(1);
        }

        public final C5556n a(long j10) {
            return new C5556n((float) c2.r.h(j10), (float) c2.r.g(j10));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((c2.r) obj).k());
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm0/n;", "it", "Lc2/r;", "a", "(Lm0/n;)J"}, k = 3, mv = {1, 8, 0})
    static final class j extends C17544u implements C17642l<C5556n, c2.r> {

        /* renamed from: c  reason: collision with root package name */
        public static final j f25523c = new j();

        j() {
            super(1);
        }

        public final long a(C5556n nVar) {
            return s.a(C17978n.e(Math.round(nVar.f()), 0), C17978n.e(Math.round(nVar.g()), 0));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return c2.r.b(a((C5556n) obj));
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lm0/m;", "a", "(I)Lm0/m;"}, k = 3, mv = {1, 8, 0})
    static final class k extends C17544u implements C17642l<Integer, C5554m> {

        /* renamed from: c  reason: collision with root package name */
        public static final k f25524c = new k();

        k() {
            super(1);
        }

        public final C5554m a(int i10) {
            return new C5554m((float) i10);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).intValue());
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm0/m;", "it", "", "a", "(Lm0/m;)Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0})
    static final class l extends C17544u implements C17642l<C5554m, Integer> {

        /* renamed from: c  reason: collision with root package name */
        public static final l f25525c = new l();

        l() {
            super(1);
        }

        /* renamed from: a */
        public final Integer invoke(C5554m mVar) {
            return Integer.valueOf((int) mVar.f());
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo1/g;", "it", "Lm0/n;", "a", "(J)Lm0/n;"}, k = 3, mv = {1, 8, 0})
    static final class m extends C17544u implements C17642l<C5667g, C5556n> {

        /* renamed from: c  reason: collision with root package name */
        public static final m f25526c = new m();

        m() {
            super(1);
        }

        public final C5556n a(long j10) {
            return new C5556n(C5667g.m(j10), C5667g.n(j10));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((C5667g) obj).v());
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm0/n;", "it", "Lo1/g;", "a", "(Lm0/n;)J"}, k = 3, mv = {1, 8, 0})
    static final class n extends C17544u implements C17642l<C5556n, C5667g> {

        /* renamed from: c  reason: collision with root package name */
        public static final n f25527c = new n();

        n() {
            super(1);
        }

        public final long a(C5556n nVar) {
            return C5668h.a(nVar.f(), nVar.g());
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return C5667g.d(a((C5556n) obj));
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo1/i;", "it", "Lm0/p;", "a", "(Lo1/i;)Lm0/p;"}, k = 3, mv = {1, 8, 0})
    static final class o extends C17544u implements C17642l<C5669i, C5560p> {

        /* renamed from: c  reason: collision with root package name */
        public static final o f25528c = new o();

        o() {
            super(1);
        }

        /* renamed from: a */
        public final C5560p invoke(C5669i iVar) {
            return new C5560p(iVar.o(), iVar.r(), iVar.p(), iVar.j());
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm0/p;", "it", "Lo1/i;", "a", "(Lm0/p;)Lo1/i;"}, k = 3, mv = {1, 8, 0})
    static final class p extends C17544u implements C17642l<C5560p, C5669i> {

        /* renamed from: c  reason: collision with root package name */
        public static final p f25529c = new p();

        p() {
            super(1);
        }

        /* renamed from: a */
        public final C5669i invoke(C5560p pVar) {
            return new C5669i(pVar.f(), pVar.g(), pVar.h(), pVar.i());
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo1/m;", "it", "Lm0/n;", "a", "(J)Lm0/n;"}, k = 3, mv = {1, 8, 0})
    static final class q extends C17544u implements C17642l<C5673m, C5556n> {

        /* renamed from: c  reason: collision with root package name */
        public static final q f25530c = new q();

        q() {
            super(1);
        }

        public final C5556n a(long j10) {
            return new C5556n(C5673m.l(j10), C5673m.i(j10));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((C5673m) obj).q());
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm0/n;", "it", "Lo1/m;", "a", "(Lm0/n;)J"}, k = 3, mv = {1, 8, 0})
    static final class r extends C17544u implements C17642l<C5556n, C5673m> {

        /* renamed from: c  reason: collision with root package name */
        public static final r f25531c = new r();

        r() {
            super(1);
        }

        public final long a(C5556n nVar) {
            return C5674n.a(nVar.f(), nVar.g());
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return C5673m.c(a((C5556n) obj));
        }
    }

    public static final <T, V extends C5562q> z0<T, V> a(C17642l<? super T, ? extends V> lVar, C17642l<? super V, ? extends T> lVar2) {
        return new A0(lVar, lVar2);
    }

    public static final z0<c2.h, C5554m> b(h.a aVar) {
        return f25507c;
    }

    public static final z0<c2.j, C5556n> c(j.a aVar) {
        return f25508d;
    }

    public static final z0<c2.n, C5556n> d(n.a aVar) {
        return f25511g;
    }

    public static final z0<c2.r, C5556n> e(r.a aVar) {
        return f25512h;
    }

    public static final z0<Float, C5554m> f(C17536l lVar) {
        return f25505a;
    }

    public static final z0<Integer, C5554m> g(kotlin.jvm.internal.r rVar) {
        return f25506b;
    }

    public static final z0<C5667g, C5556n> h(C5667g.a aVar) {
        return f25510f;
    }

    public static final z0<C5669i, C5560p> i(C5669i.a aVar) {
        return f25513i;
    }

    public static final z0<C5673m, C5556n> j(C5673m.a aVar) {
        return f25509e;
    }

    public static final float k(float f10, float f11, float f12) {
        return (f10 * (((float) 1) - f12)) + (f11 * f12);
    }
}
