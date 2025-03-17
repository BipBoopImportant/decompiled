package G1;

import E1.I;
import U0.C4912y;
import XH.C16807N;
import androidx.compose.ui.platform.w1;
import c2.d;
import c2.t;
import kotlin.Metadata;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17631a;
import nI.p;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\t\ba\u0018\u0000 .2\u00020\u0001:\u0001\u0011R\u001c\u0010\u0007\u001a\u00020\u00028&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0003\u0010\u0004\"\u0004\b\u0005\u0010\u0006R\u001c\u0010\r\u001a\u00020\b8&@&X¦\u000e¢\u0006\f\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001c\u0010\u0013\u001a\u00020\u000e8&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0019\u001a\u00020\u00148&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001c\u0010\u001f\u001a\u00020\u001a8&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001c\u0010%\u001a\u00020 8&@&X¦\u000e¢\u0006\f\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\"\u0010-\u001a\u00020&8&@&X§\u000e¢\u0006\u0012\u0012\u0004\b+\u0010,\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006/À\u0006\u0001"}, d2 = {"LG1/g;", "", "LE1/I;", "getMeasurePolicy", "()LE1/I;", "m", "(LE1/I;)V", "measurePolicy", "Lc2/t;", "getLayoutDirection", "()Lc2/t;", "d", "(Lc2/t;)V", "layoutDirection", "Lc2/d;", "getDensity", "()Lc2/d;", "a", "(Lc2/d;)V", "density", "Landroidx/compose/ui/d;", "getModifier", "()Landroidx/compose/ui/d;", "j", "(Landroidx/compose/ui/d;)V", "modifier", "Landroidx/compose/ui/platform/w1;", "getViewConfiguration", "()Landroidx/compose/ui/platform/w1;", "h", "(Landroidx/compose/ui/platform/w1;)V", "viewConfiguration", "LU0/y;", "getCompositionLocalMap", "()LU0/y;", "k", "(LU0/y;)V", "compositionLocalMap", "", "getCompositeKeyHash", "()I", "e", "(I)V", "getCompositeKeyHash$annotations", "()V", "compositeKeyHash", "W", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: G1.g  reason: case insensitive filesystem */
public interface C4504g {

    /* renamed from: W  reason: collision with root package name */
    public static final a f6515W = a.f6516a;

    @Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\f\u0010\tR)\u0010\u0014\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e8\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R)\u0010\u0018\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00100\u000e8\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0012\u001a\u0004\b\u0017\u0010\u0013R)\u0010\u001a\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00100\u000e8\u0006¢\u0006\f\n\u0004\b\f\u0010\u0012\u001a\u0004\b\u0016\u0010\u0013R)\u0010\u001d\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00100\u000e8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0012\u001a\u0004\b\u000b\u0010\u0013R)\u0010!\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u00100\u000e8\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0012\u001a\u0004\b \u0010\u0013R)\u0010%\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u00100\u000e8\u0006¢\u0006\f\n\u0004\b#\u0010\u0012\u001a\u0004\b$\u0010\u0013R2\u0010)\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u00100\u000e8GX\u0004¢\u0006\u0012\n\u0004\b'\u0010\u0012\u0012\u0004\b(\u0010\u0003\u001a\u0004\b\u0006\u0010\u0013¨\u0006*"}, d2 = {"LG1/g$a;", "", "<init>", "()V", "Lkotlin/Function0;", "LG1/g;", "b", "LnI/a;", "a", "()LnI/a;", "Constructor", "c", "f", "VirtualConstructor", "Lkotlin/Function2;", "Landroidx/compose/ui/d;", "LXH/N;", "d", "LnI/p;", "()LnI/p;", "SetModifier", "Lc2/d;", "e", "getSetDensity", "SetDensity", "LU0/y;", "SetResolvedCompositionLocals", "LE1/I;", "g", "SetMeasurePolicy", "Lc2/t;", "h", "getSetLayoutDirection", "SetLayoutDirection", "Landroidx/compose/ui/platform/w1;", "i", "getSetViewConfiguration", "SetViewConfiguration", "", "j", "getSetCompositeKeyHash$annotations", "SetCompositeKeyHash", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: G1.g$a */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f6516a = new a();

        /* renamed from: b  reason: collision with root package name */
        private static final C17631a<C4504g> f6517b = G.f6213L.a();

        /* renamed from: c  reason: collision with root package name */
        private static final C17631a<C4504g> f6518c = h.f6533c;

        /* renamed from: d  reason: collision with root package name */
        private static final p<C4504g, androidx.compose.ui.d, C16807N> f6519d = e.f6530c;

        /* renamed from: e  reason: collision with root package name */
        private static final p<C4504g, c2.d, C16807N> f6520e = b.f6527c;

        /* renamed from: f  reason: collision with root package name */
        private static final p<C4504g, C4912y, C16807N> f6521f = f.f6531c;

        /* renamed from: g  reason: collision with root package name */
        private static final p<C4504g, I, C16807N> f6522g = d.f6529c;

        /* renamed from: h  reason: collision with root package name */
        private static final p<C4504g, t, C16807N> f6523h = c.f6528c;

        /* renamed from: i  reason: collision with root package name */
        private static final p<C4504g, w1, C16807N> f6524i = C0061g.f6532c;

        /* renamed from: j  reason: collision with root package name */
        private static final p<C4504g, Integer, C16807N> f6525j = C0060a.f6526c;

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LG1/g;", "", "it", "LXH/N;", "a", "(LG1/g;I)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: G1.g$a$a  reason: collision with other inner class name */
        static final class C0060a extends C17544u implements p<C4504g, Integer, C16807N> {

            /* renamed from: c  reason: collision with root package name */
            public static final C0060a f6526c = new C0060a();

            C0060a() {
                super(2);
            }

            public final void a(C4504g gVar, int i10) {
                gVar.e(i10);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                a((C4504g) obj, ((Number) obj2).intValue());
                return C16807N.f139792a;
            }
        }

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LG1/g;", "Lc2/d;", "it", "LXH/N;", "a", "(LG1/g;Lc2/d;)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: G1.g$a$b */
        static final class b extends C17544u implements p<C4504g, c2.d, C16807N> {

            /* renamed from: c  reason: collision with root package name */
            public static final b f6527c = new b();

            b() {
                super(2);
            }

            public final void a(C4504g gVar, c2.d dVar) {
                gVar.a(dVar);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                a((C4504g) obj, (c2.d) obj2);
                return C16807N.f139792a;
            }
        }

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LG1/g;", "Lc2/t;", "it", "LXH/N;", "a", "(LG1/g;Lc2/t;)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: G1.g$a$c */
        static final class c extends C17544u implements p<C4504g, t, C16807N> {

            /* renamed from: c  reason: collision with root package name */
            public static final c f6528c = new c();

            c() {
                super(2);
            }

            public final void a(C4504g gVar, t tVar) {
                gVar.d(tVar);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                a((C4504g) obj, (t) obj2);
                return C16807N.f139792a;
            }
        }

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LG1/g;", "LE1/I;", "it", "LXH/N;", "a", "(LG1/g;LE1/I;)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: G1.g$a$d */
        static final class d extends C17544u implements p<C4504g, I, C16807N> {

            /* renamed from: c  reason: collision with root package name */
            public static final d f6529c = new d();

            d() {
                super(2);
            }

            public final void a(C4504g gVar, I i10) {
                gVar.m(i10);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                a((C4504g) obj, (I) obj2);
                return C16807N.f139792a;
            }
        }

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LG1/g;", "Landroidx/compose/ui/d;", "it", "LXH/N;", "a", "(LG1/g;Landroidx/compose/ui/d;)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: G1.g$a$e */
        static final class e extends C17544u implements p<C4504g, androidx.compose.ui.d, C16807N> {

            /* renamed from: c  reason: collision with root package name */
            public static final e f6530c = new e();

            e() {
                super(2);
            }

            public final void a(C4504g gVar, androidx.compose.ui.d dVar) {
                gVar.j(dVar);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                a((C4504g) obj, (androidx.compose.ui.d) obj2);
                return C16807N.f139792a;
            }
        }

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LG1/g;", "LU0/y;", "it", "LXH/N;", "a", "(LG1/g;LU0/y;)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: G1.g$a$f */
        static final class f extends C17544u implements p<C4504g, C4912y, C16807N> {

            /* renamed from: c  reason: collision with root package name */
            public static final f f6531c = new f();

            f() {
                super(2);
            }

            public final void a(C4504g gVar, C4912y yVar) {
                gVar.k(yVar);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                a((C4504g) obj, (C4912y) obj2);
                return C16807N.f139792a;
            }
        }

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LG1/g;", "Landroidx/compose/ui/platform/w1;", "it", "LXH/N;", "a", "(LG1/g;Landroidx/compose/ui/platform/w1;)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: G1.g$a$g  reason: collision with other inner class name */
        static final class C0061g extends C17544u implements p<C4504g, w1, C16807N> {

            /* renamed from: c  reason: collision with root package name */
            public static final C0061g f6532c = new C0061g();

            C0061g() {
                super(2);
            }

            public final void a(C4504g gVar, w1 w1Var) {
                gVar.h(w1Var);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                a((C4504g) obj, (w1) obj2);
                return C16807N.f139792a;
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LG1/G;", "b", "()LG1/G;"}, k = 3, mv = {1, 8, 0})
        /* renamed from: G1.g$a$h */
        static final class h extends C17544u implements C17631a<G> {

            /* renamed from: c  reason: collision with root package name */
            public static final h f6533c = new h();

            h() {
                super(0);
            }

            /* renamed from: b */
            public final G invoke() {
                return new G(true, 0, 2, (DefaultConstructorMarker) null);
            }
        }

        private a() {
        }

        public final C17631a<C4504g> a() {
            return f6517b;
        }

        public final p<C4504g, Integer, C16807N> b() {
            return f6525j;
        }

        public final p<C4504g, I, C16807N> c() {
            return f6522g;
        }

        public final p<C4504g, androidx.compose.ui.d, C16807N> d() {
            return f6519d;
        }

        public final p<C4504g, C4912y, C16807N> e() {
            return f6521f;
        }

        public final C17631a<C4504g> f() {
            return f6518c;
        }
    }

    void a(d dVar);

    void d(t tVar);

    void e(int i10);

    void h(w1 w1Var);

    void j(androidx.compose.ui.d dVar);

    void k(C4912y yVar);

    void m(I i10);
}
