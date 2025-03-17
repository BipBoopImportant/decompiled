package g2;

import c2.h;
import g2.C5402z;
import kotlin.Metadata;
import kotlin.jvm.internal.A;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.P;
import l2.f;
import qI.C17785b;
import uI.C18064m;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b&\b\u0007\u0018\u00002\u00020\u0001:\u0003\u0007\u000b\u000fB\u0019\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0002\u001a\u00020\u00018\u0000X\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00038\u0000X\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\rR\u0017\u0010\u0013\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0018\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u001a\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017R\u0017\u0010\u001f\u001a\u00020\u001b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u001eR\u0017\u0010!\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b \u0010\u0015\u001a\u0004\b\u000f\u0010\u0017R\u0017\u0010$\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\"\u0010\u0015\u001a\u0004\b#\u0010\u0017R\u0017\u0010&\u001a\u00020\u001b8\u0006¢\u0006\f\n\u0004\b%\u0010\u001d\u001a\u0004\b\u0007\u0010\u001eR\u0017\u0010,\u001a\u00020'8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R+\u00104\u001a\u00020-2\u0006\u0010.\u001a\u00020-8F@FX\u0002¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b%\u00103R+\u00107\u001a\u00020-2\u0006\u0010.\u001a\u00020-8F@FX\u0002¢\u0006\u0012\n\u0004\b5\u00100\u001a\u0004\b6\u00102\"\u0004\b \u00103R+\u0010>\u001a\u0002082\u0006\u0010.\u001a\u0002088F@FX\u0002¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b\"\u0010=R*\u0010G\u001a\u00020?2\u0006\u0010@\u001a\u00020?8\u0006@FX\u000e¢\u0006\u0012\n\u0004\bA\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR+\u0010L\u001a\u00020?2\u0006\u0010.\u001a\u00020?8F@FX\u0002¢\u0006\u0012\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010D\"\u0004\bK\u0010FR+\u0010P\u001a\u00020?2\u0006\u0010.\u001a\u00020?8F@FX\u0002¢\u0006\u0012\n\u0004\bM\u0010I\u001a\u0004\bN\u0010D\"\u0004\bO\u0010FR+\u0010T\u001a\u00020?2\u0006\u0010.\u001a\u00020?8F@FX\u0002¢\u0006\u0012\n\u0004\bQ\u0010I\u001a\u0004\bR\u0010D\"\u0004\bS\u0010FR+\u0010X\u001a\u00020?2\u0006\u0010.\u001a\u00020?8F@FX\u0002¢\u0006\u0012\n\u0004\bU\u0010I\u001a\u0004\bV\u0010D\"\u0004\bW\u0010FR+\u0010\\\u001a\u00020?2\u0006\u0010.\u001a\u00020?8F@FX\u0002¢\u0006\u0012\n\u0004\bY\u0010I\u001a\u0004\bZ\u0010D\"\u0004\b[\u0010FR1\u0010b\u001a\u00020]2\u0006\u0010.\u001a\u00020]8F@FX\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b^\u0010_\u001a\u0004\b`\u0010D\"\u0004\ba\u0010FR1\u0010f\u001a\u00020]2\u0006\u0010.\u001a\u00020]8F@FX\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\bc\u0010_\u001a\u0004\bd\u0010D\"\u0004\be\u0010FR1\u0010j\u001a\u00020]2\u0006\u0010.\u001a\u00020]8F@FX\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\bg\u0010_\u001a\u0004\bh\u0010D\"\u0004\bi\u0010FR+\u0010n\u001a\u00020?2\u0006\u0010.\u001a\u00020?8F@FX\u0002¢\u0006\u0012\n\u0004\bk\u0010I\u001a\u0004\bl\u0010D\"\u0004\bm\u0010FR+\u0010r\u001a\u00020?2\u0006\u0010.\u001a\u00020?8F@FX\u0002¢\u0006\u0012\n\u0004\bo\u0010I\u001a\u0004\bp\u0010D\"\u0004\bq\u0010FR+\u0010v\u001a\u00020?2\u0006\u0010.\u001a\u00020?8F@FX\u0002¢\u0006\u0012\n\u0004\bs\u0010I\u001a\u0004\bt\u0010D\"\u0004\bu\u0010FR+\u0010z\u001a\u00020?2\u0006\u0010.\u001a\u00020?8F@FX\u0002¢\u0006\u0012\n\u0004\bw\u0010I\u001a\u0004\bx\u0010D\"\u0004\by\u0010FR*\u0010~\u001a\u00020?2\u0006\u0010@\u001a\u00020?8\u0006@FX\u000e¢\u0006\u0012\n\u0004\b{\u0010B\u001a\u0004\b|\u0010D\"\u0004\b}\u0010FR-\u0010\u0001\u001a\u00020?2\u0006\u0010@\u001a\u00020?8\u0006@FX\u000e¢\u0006\u0014\n\u0004\b\u0010B\u001a\u0005\b\u0001\u0010D\"\u0005\b\u0001\u0010F\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0001"}, d2 = {"Lg2/g;", "", "id", "Ll2/f;", "containerObject", "<init>", "(Ljava/lang/Object;Ll2/f;)V", "a", "Ljava/lang/Object;", "getId$constraintlayout_compose_release", "()Ljava/lang/Object;", "b", "Ll2/f;", "()Ll2/f;", "Lg2/h;", "c", "Lg2/h;", "d", "()Lg2/h;", "parent", "Lg2/c0;", "Lg2/c0;", "e", "()Lg2/c0;", "start", "getAbsoluteLeft", "absoluteLeft", "Lg2/E;", "f", "Lg2/E;", "()Lg2/E;", "top", "g", "end", "h", "getAbsoluteRight", "absoluteRight", "i", "bottom", "Lg2/e;", "j", "Lg2/e;", "getBaseline", "()Lg2/e;", "baseline", "Lg2/z;", "<set-?>", "k", "Lg2/g$a;", "getWidth", "()Lg2/z;", "(Lg2/z;)V", "width", "l", "getHeight", "height", "Lg2/d0;", "m", "Lg2/g$d;", "getVisibility", "()Lg2/d0;", "(Lg2/d0;)V", "visibility", "", "value", "n", "F", "getAlpha", "()F", "setAlpha", "(F)V", "alpha", "o", "Lg2/g$c;", "getScaleX", "setScaleX", "scaleX", "p", "getScaleY", "setScaleY", "scaleY", "q", "getRotationX", "setRotationX", "rotationX", "r", "getRotationY", "setRotationY", "rotationY", "s", "getRotationZ", "setRotationZ", "rotationZ", "Lc2/h;", "t", "Lg2/g$b;", "getTranslationX-D9Ej5fM", "setTranslationX-0680j_4", "translationX", "u", "getTranslationY-D9Ej5fM", "setTranslationY-0680j_4", "translationY", "v", "getTranslationZ-D9Ej5fM", "setTranslationZ-0680j_4", "translationZ", "w", "getPivotX", "setPivotX", "pivotX", "x", "getPivotY", "setPivotY", "pivotY", "y", "getHorizontalChainWeight", "setHorizontalChainWeight", "horizontalChainWeight", "z", "getVerticalChainWeight", "setVerticalChainWeight", "verticalChainWeight", "A", "getHorizontalBias", "setHorizontalBias", "horizontalBias", "B", "getVerticalBias", "setVerticalBias", "verticalBias", "constraintlayout-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: g2.g  reason: case insensitive filesystem */
public final class C5383g {

    /* renamed from: C  reason: collision with root package name */
    static final /* synthetic */ C18064m<Object>[] f23673C;

    /* renamed from: A  reason: collision with root package name */
    private float f23674A;

    /* renamed from: B  reason: collision with root package name */
    private float f23675B;

    /* renamed from: a  reason: collision with root package name */
    private final Object f23676a;

    /* renamed from: b  reason: collision with root package name */
    private final f f23677b;

    /* renamed from: c  reason: collision with root package name */
    private final C5384h f23678c = new C5384h("parent");

    /* renamed from: d  reason: collision with root package name */
    private final c0 f23679d;

    /* renamed from: e  reason: collision with root package name */
    private final c0 f23680e;

    /* renamed from: f  reason: collision with root package name */
    private final C5362E f23681f;

    /* renamed from: g  reason: collision with root package name */
    private final c0 f23682g;

    /* renamed from: h  reason: collision with root package name */
    private final c0 f23683h;

    /* renamed from: i  reason: collision with root package name */
    private final C5362E f23684i;

    /* renamed from: j  reason: collision with root package name */
    private final C5381e f23685j;

    /* renamed from: k  reason: collision with root package name */
    private final a f23686k;

    /* renamed from: l  reason: collision with root package name */
    private final a f23687l;

    /* renamed from: m  reason: collision with root package name */
    private final d f23688m;

    /* renamed from: n  reason: collision with root package name */
    private float f23689n;

    /* renamed from: o  reason: collision with root package name */
    private final c f23690o;

    /* renamed from: p  reason: collision with root package name */
    private final c f23691p;

    /* renamed from: q  reason: collision with root package name */
    private final c f23692q;

    /* renamed from: r  reason: collision with root package name */
    private final c f23693r;

    /* renamed from: s  reason: collision with root package name */
    private final c f23694s;

    /* renamed from: t  reason: collision with root package name */
    private final b f23695t;

    /* renamed from: u  reason: collision with root package name */
    private final b f23696u;

    /* renamed from: v  reason: collision with root package name */
    private final b f23697v;

    /* renamed from: w  reason: collision with root package name */
    private final c f23698w;

    /* renamed from: x  reason: collision with root package name */
    private final c f23699x;

    /* renamed from: y  reason: collision with root package name */
    private final c f23700y;

    /* renamed from: z  reason: collision with root package name */
    private final c f23701z;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J+\u0010\u000b\u001a\u00020\n2\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00062\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lg2/g$a;", "LqI/b;", "Lg2/z;", "initialValue", "<init>", "(Lg2/g;Lg2/z;)V", "LuI/m;", "property", "oldValue", "newValue", "LXH/N;", "e", "(LuI/m;Lg2/z;Lg2/z;)V", "constraintlayout-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: g2.g$a */
    private final class a extends C17785b<C5402z> {
        public a(C5402z zVar) {
            super(zVar);
        }

        /* access modifiers changed from: protected */
        /* renamed from: e */
        public void c(C18064m<?> mVar, C5402z zVar, C5402z zVar2) {
            f b10 = C5383g.this.b();
            String name = mVar.getName();
            C17542s.h(zVar2, "null cannot be cast to non-null type androidx.constraintlayout.compose.DimensionDescription");
            b10.j0(name, ((C5358A) zVar2).a());
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J.\u0010\r\u001a\u00020\f2\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\b2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0002H\u0014ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0011"}, d2 = {"Lg2/g$b;", "LqI/b;", "Lc2/h;", "initialValue", "", "nameOverride", "<init>", "(Lg2/g;FLjava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "LuI/m;", "property", "oldValue", "newValue", "LXH/N;", "e", "(LuI/m;FF)V", "b", "Ljava/lang/String;", "constraintlayout-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: g2.g$b */
    private final class b extends C17785b<h> {

        /* renamed from: b  reason: collision with root package name */
        private final String f23703b;

        public /* synthetic */ b(C5383g gVar, float f10, String str, DefaultConstructorMarker defaultConstructorMarker) {
            this(f10, str);
        }

        public /* bridge */ /* synthetic */ void c(C18064m mVar, Object obj, Object obj2) {
            e(mVar, ((h) obj).G(), ((h) obj2).G());
        }

        /* access modifiers changed from: protected */
        public void e(C18064m<?> mVar, float f10, float f11) {
            if (!Float.isNaN(f11)) {
                f b10 = C5383g.this.b();
                String str = this.f23703b;
                if (str == null) {
                    str = mVar.getName();
                }
                b10.k0(str, f11);
            }
        }

        private b(float f10, String str) {
            super(h.m(f10));
            this.f23703b = str;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ b(C5383g gVar, float f10, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(gVar, f10, (i10 & 2) != 0 ? null : str, (DefaultConstructorMarker) null);
        }
    }

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J+\u0010\b\u001a\u00020\u00072\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"g2/g$d", "LqI/b;", "Lg2/d0;", "LuI/m;", "property", "oldValue", "newValue", "LXH/N;", "e", "(LuI/m;Lg2/d0;Lg2/d0;)V", "constraintlayout-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: g2.g$d */
    public static final class d extends C17785b<d0> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C5383g f23707b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(C5383g gVar, d0 d0Var) {
            super(d0Var);
            this.f23707b = gVar;
        }

        /* access modifiers changed from: protected */
        /* renamed from: e */
        public void c(C18064m<?> mVar, d0 d0Var, d0 d0Var2) {
            this.f23707b.b().l0(mVar.getName(), d0Var2.c());
        }
    }

    static {
        Class<C5383g> cls = C5383g.class;
        f23673C = new C18064m[]{P.e(new A(cls, "width", "getWidth()Landroidx/constraintlayout/compose/Dimension;", 0)), P.e(new A(cls, "height", "getHeight()Landroidx/constraintlayout/compose/Dimension;", 0)), P.e(new A(cls, "visibility", "getVisibility()Landroidx/constraintlayout/compose/Visibility;", 0)), P.e(new A(cls, "scaleX", "getScaleX()F", 0)), P.e(new A(cls, "scaleY", "getScaleY()F", 0)), P.e(new A(cls, "rotationX", "getRotationX()F", 0)), P.e(new A(cls, "rotationY", "getRotationY()F", 0)), P.e(new A(cls, "rotationZ", "getRotationZ()F", 0)), P.e(new A(cls, "translationX", "getTranslationX-D9Ej5fM()F", 0)), P.e(new A(cls, "translationY", "getTranslationY-D9Ej5fM()F", 0)), P.e(new A(cls, "translationZ", "getTranslationZ-D9Ej5fM()F", 0)), P.e(new A(cls, "pivotX", "getPivotX()F", 0)), P.e(new A(cls, "pivotY", "getPivotY()F", 0)), P.e(new A(cls, "horizontalChainWeight", "getHorizontalChainWeight()F", 0)), P.e(new A(cls, "verticalChainWeight", "getVerticalChainWeight()F", 0))};
    }

    public C5383g(Object obj, f fVar) {
        this.f23676a = obj;
        this.f23677b = fVar;
        this.f23679d = new C5397u(-2, fVar);
        this.f23680e = new C5397u(0, fVar);
        this.f23681f = new C5386j(0, fVar);
        this.f23682g = new C5397u(-1, fVar);
        this.f23683h = new C5397u(1, fVar);
        this.f23684i = new C5386j(1, fVar);
        this.f23685j = new C5385i(fVar);
        C5402z.b bVar = C5402z.f23763a;
        this.f23686k = new a(bVar.b());
        this.f23687l = new a(bVar.b());
        this.f23688m = new d(this, d0.f23668b.b());
        this.f23689n = 1.0f;
        this.f23690o = new c(this, 1.0f, (String) null, 2, (DefaultConstructorMarker) null);
        this.f23691p = new c(this, 1.0f, (String) null, 2, (DefaultConstructorMarker) null);
        this.f23692q = new c(this, 0.0f, (String) null, 2, (DefaultConstructorMarker) null);
        this.f23693r = new c(this, 0.0f, (String) null, 2, (DefaultConstructorMarker) null);
        this.f23694s = new c(this, 0.0f, (String) null, 2, (DefaultConstructorMarker) null);
        float f10 = (float) 0;
        this.f23695t = new b(this, h.B(f10), (String) null, 2, (DefaultConstructorMarker) null);
        this.f23696u = new b(this, h.B(f10), (String) null, 2, (DefaultConstructorMarker) null);
        this.f23697v = new b(this, h.B(f10), (String) null, 2, (DefaultConstructorMarker) null);
        this.f23698w = new c(this, 0.5f, (String) null, 2, (DefaultConstructorMarker) null);
        this.f23699x = new c(this, 0.5f, (String) null, 2, (DefaultConstructorMarker) null);
        this.f23700y = new c(Float.NaN, "hWeight");
        this.f23701z = new c(Float.NaN, "vWeight");
        this.f23674A = 0.5f;
        this.f23675B = 0.5f;
    }

    public final C5362E a() {
        return this.f23684i;
    }

    public final f b() {
        return this.f23677b;
    }

    public final c0 c() {
        return this.f23682g;
    }

    public final C5384h d() {
        return this.f23678c;
    }

    public final c0 e() {
        return this.f23679d;
    }

    public final C5362E f() {
        return this.f23681f;
    }

    public final void g(C5402z zVar) {
        this.f23687l.b(this, f23673C[1], zVar);
    }

    public final void h(d0 d0Var) {
        this.f23688m.b(this, f23673C[2], d0Var);
    }

    public final void i(C5402z zVar) {
        this.f23686k.b(this, f23673C[0], zVar);
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J+\u0010\r\u001a\u00020\f2\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\b2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\r\u0010\u000eR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lg2/g$c;", "LqI/b;", "", "initialValue", "", "nameOverride", "<init>", "(Lg2/g;FLjava/lang/String;)V", "LuI/m;", "property", "oldValue", "newValue", "LXH/N;", "e", "(LuI/m;FF)V", "b", "Ljava/lang/String;", "constraintlayout-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: g2.g$c */
    private final class c extends C17785b<Float> {

        /* renamed from: b  reason: collision with root package name */
        private final String f23705b;

        public c(float f10, String str) {
            super(Float.valueOf(f10));
            this.f23705b = str;
        }

        public /* bridge */ /* synthetic */ void c(C18064m mVar, Object obj, Object obj2) {
            e(mVar, ((Number) obj).floatValue(), ((Number) obj2).floatValue());
        }

        /* access modifiers changed from: protected */
        public void e(C18064m<?> mVar, float f10, float f11) {
            if (!Float.isNaN(f11)) {
                f b10 = C5383g.this.b();
                String str = this.f23705b;
                if (str == null) {
                    str = mVar.getName();
                }
                b10.k0(str, f11);
            }
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ c(C5383g gVar, float f10, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(f10, (i10 & 2) != 0 ? null : str);
        }
    }
}
