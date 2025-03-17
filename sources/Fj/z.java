package fJ;

import DI.u0;
import EI.C15644c;
import HJ.C15854t;
import YH.g0;
import cJ.C17066c;
import fJ.C17231b;
import fJ.n;
import fJ.w;
import iJ.C17373g;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.A;
import kotlin.jvm.internal.C17527c;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.P;
import nI.C17642l;
import qI.C17784a;
import qI.C17785b;
import qI.C17787d;
import uI.C18055d;
import uI.C18064m;
import uJ.C18096U;

public final class z implements w {

    /* renamed from: Z  reason: collision with root package name */
    static final /* synthetic */ C18064m<Object>[] f143201Z;

    /* renamed from: A  reason: collision with root package name */
    private final C17787d f143202A;

    /* renamed from: B  reason: collision with root package name */
    private final C17787d f143203B;

    /* renamed from: C  reason: collision with root package name */
    private final C17787d f143204C;

    /* renamed from: D  reason: collision with root package name */
    private final C17787d f143205D;

    /* renamed from: E  reason: collision with root package name */
    private final C17787d f143206E;

    /* renamed from: F  reason: collision with root package name */
    private final C17787d f143207F;

    /* renamed from: G  reason: collision with root package name */
    private final C17787d f143208G;

    /* renamed from: H  reason: collision with root package name */
    private final C17787d f143209H;

    /* renamed from: I  reason: collision with root package name */
    private final C17787d f143210I;

    /* renamed from: J  reason: collision with root package name */
    private final C17787d f143211J;

    /* renamed from: K  reason: collision with root package name */
    private final C17787d f143212K;

    /* renamed from: L  reason: collision with root package name */
    private final C17787d f143213L;

    /* renamed from: M  reason: collision with root package name */
    private final C17787d f143214M;

    /* renamed from: N  reason: collision with root package name */
    private final C17787d f143215N;

    /* renamed from: O  reason: collision with root package name */
    private final C17787d f143216O;

    /* renamed from: P  reason: collision with root package name */
    private final C17787d f143217P;

    /* renamed from: Q  reason: collision with root package name */
    private final C17787d f143218Q;

    /* renamed from: R  reason: collision with root package name */
    private final C17787d f143219R;

    /* renamed from: S  reason: collision with root package name */
    private final C17787d f143220S;

    /* renamed from: T  reason: collision with root package name */
    private final C17787d f143221T;

    /* renamed from: U  reason: collision with root package name */
    private final C17787d f143222U;

    /* renamed from: V  reason: collision with root package name */
    private final C17787d f143223V;

    /* renamed from: W  reason: collision with root package name */
    private final C17787d f143224W;

    /* renamed from: X  reason: collision with root package name */
    private final C17787d f143225X;

    /* renamed from: Y  reason: collision with root package name */
    private final C17787d f143226Y;

    /* renamed from: a  reason: collision with root package name */
    private boolean f143227a;

    /* renamed from: b  reason: collision with root package name */
    private final C17787d f143228b = r0(C17231b.c.f143161a);

    /* renamed from: c  reason: collision with root package name */
    private final C17787d f143229c;

    /* renamed from: d  reason: collision with root package name */
    private final C17787d f143230d;

    /* renamed from: e  reason: collision with root package name */
    private final C17787d f143231e;

    /* renamed from: f  reason: collision with root package name */
    private final C17787d f143232f;

    /* renamed from: g  reason: collision with root package name */
    private final C17787d f143233g;

    /* renamed from: h  reason: collision with root package name */
    private final C17787d f143234h;

    /* renamed from: i  reason: collision with root package name */
    private final C17787d f143235i;

    /* renamed from: j  reason: collision with root package name */
    private final C17787d f143236j;

    /* renamed from: k  reason: collision with root package name */
    private final C17787d f143237k;

    /* renamed from: l  reason: collision with root package name */
    private final C17787d f143238l;

    /* renamed from: m  reason: collision with root package name */
    private final C17787d f143239m;

    /* renamed from: n  reason: collision with root package name */
    private final C17787d f143240n;

    /* renamed from: o  reason: collision with root package name */
    private final C17787d f143241o;

    /* renamed from: p  reason: collision with root package name */
    private final C17787d f143242p;

    /* renamed from: q  reason: collision with root package name */
    private final C17787d f143243q;

    /* renamed from: r  reason: collision with root package name */
    private final C17787d f143244r;

    /* renamed from: s  reason: collision with root package name */
    private final C17787d f143245s;

    /* renamed from: t  reason: collision with root package name */
    private final C17787d f143246t;

    /* renamed from: u  reason: collision with root package name */
    private final C17787d f143247u;

    /* renamed from: v  reason: collision with root package name */
    private final C17787d f143248v;

    /* renamed from: w  reason: collision with root package name */
    private final C17787d f143249w;

    /* renamed from: x  reason: collision with root package name */
    private final C17787d f143250x;

    /* renamed from: y  reason: collision with root package name */
    private final C17787d f143251y;

    /* renamed from: z  reason: collision with root package name */
    private final C17787d f143252z;

    public static final class a extends C17785b<T> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ z f143253b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(Object obj, z zVar) {
            super(obj);
            this.f143253b = zVar;
        }

        /* access modifiers changed from: protected */
        public boolean d(C18064m<?> mVar, T t10, T t11) {
            C17542s.j(mVar, "property");
            if (!this.f143253b.p0()) {
                return true;
            }
            throw new IllegalStateException("Cannot modify readonly DescriptorRendererOptions");
        }
    }

    static {
        Class<z> cls = z.class;
        f143201Z = new C18064m[]{P.e(new A(cls, "classifierNamePolicy", "getClassifierNamePolicy()Lorg/jetbrains/kotlin/renderer/ClassifierNamePolicy;", 0)), P.e(new A(cls, "withDefinedIn", "getWithDefinedIn()Z", 0)), P.e(new A(cls, "withSourceFileForTopLevel", "getWithSourceFileForTopLevel()Z", 0)), P.e(new A(cls, "modifiers", "getModifiers()Ljava/util/Set;", 0)), P.e(new A(cls, "startFromName", "getStartFromName()Z", 0)), P.e(new A(cls, "startFromDeclarationKeyword", "getStartFromDeclarationKeyword()Z", 0)), P.e(new A(cls, "debugMode", "getDebugMode()Z", 0)), P.e(new A(cls, "classWithPrimaryConstructor", "getClassWithPrimaryConstructor()Z", 0)), P.e(new A(cls, "verbose", "getVerbose()Z", 0)), P.e(new A(cls, "unitReturnType", "getUnitReturnType()Z", 0)), P.e(new A(cls, "withoutReturnType", "getWithoutReturnType()Z", 0)), P.e(new A(cls, "enhancedTypes", "getEnhancedTypes()Z", 0)), P.e(new A(cls, "normalizedVisibilities", "getNormalizedVisibilities()Z", 0)), P.e(new A(cls, "renderDefaultVisibility", "getRenderDefaultVisibility()Z", 0)), P.e(new A(cls, "renderDefaultModality", "getRenderDefaultModality()Z", 0)), P.e(new A(cls, "renderConstructorDelegation", "getRenderConstructorDelegation()Z", 0)), P.e(new A(cls, "renderPrimaryConstructorParametersAsProperties", "getRenderPrimaryConstructorParametersAsProperties()Z", 0)), P.e(new A(cls, "actualPropertiesInPrimaryConstructor", "getActualPropertiesInPrimaryConstructor()Z", 0)), P.e(new A(cls, "uninferredTypeParameterAsName", "getUninferredTypeParameterAsName()Z", 0)), P.e(new A(cls, "includePropertyConstant", "getIncludePropertyConstant()Z", 0)), P.e(new A(cls, "propertyConstantRenderer", "getPropertyConstantRenderer()Lkotlin/jvm/functions/Function1;", 0)), P.e(new A(cls, "withoutTypeParameters", "getWithoutTypeParameters()Z", 0)), P.e(new A(cls, "withoutSuperTypes", "getWithoutSuperTypes()Z", 0)), P.e(new A(cls, "typeNormalizer", "getTypeNormalizer()Lkotlin/jvm/functions/Function1;", 0)), P.e(new A(cls, "defaultParameterValueRenderer", "getDefaultParameterValueRenderer()Lkotlin/jvm/functions/Function1;", 0)), P.e(new A(cls, "secondaryConstructorsAsPrimary", "getSecondaryConstructorsAsPrimary()Z", 0)), P.e(new A(cls, "overrideRenderingPolicy", "getOverrideRenderingPolicy()Lorg/jetbrains/kotlin/renderer/OverrideRenderingPolicy;", 0)), P.e(new A(cls, "valueParametersHandler", "getValueParametersHandler()Lorg/jetbrains/kotlin/renderer/DescriptorRenderer$ValueParametersHandler;", 0)), P.e(new A(cls, "textFormat", "getTextFormat()Lorg/jetbrains/kotlin/renderer/RenderingFormat;", 0)), P.e(new A(cls, "parameterNameRenderingPolicy", "getParameterNameRenderingPolicy()Lorg/jetbrains/kotlin/renderer/ParameterNameRenderingPolicy;", 0)), P.e(new A(cls, "receiverAfterName", "getReceiverAfterName()Z", 0)), P.e(new A(cls, "renderCompanionObjectName", "getRenderCompanionObjectName()Z", 0)), P.e(new A(cls, "propertyAccessorRenderingPolicy", "getPropertyAccessorRenderingPolicy()Lorg/jetbrains/kotlin/renderer/PropertyAccessorRenderingPolicy;", 0)), P.e(new A(cls, "renderDefaultAnnotationArguments", "getRenderDefaultAnnotationArguments()Z", 0)), P.e(new A(cls, "eachAnnotationOnNewLine", "getEachAnnotationOnNewLine()Z", 0)), P.e(new A(cls, "excludedAnnotationClasses", "getExcludedAnnotationClasses()Ljava/util/Set;", 0)), P.e(new A(cls, "excludedTypeAnnotationClasses", "getExcludedTypeAnnotationClasses()Ljava/util/Set;", 0)), P.e(new A(cls, "annotationFilter", "getAnnotationFilter()Lkotlin/jvm/functions/Function1;", 0)), P.e(new A(cls, "annotationArgumentsRenderingPolicy", "getAnnotationArgumentsRenderingPolicy()Lorg/jetbrains/kotlin/renderer/AnnotationArgumentsRenderingPolicy;", 0)), P.e(new A(cls, "alwaysRenderModifiers", "getAlwaysRenderModifiers()Z", 0)), P.e(new A(cls, "renderConstructorKeyword", "getRenderConstructorKeyword()Z", 0)), P.e(new A(cls, "renderUnabbreviatedType", "getRenderUnabbreviatedType()Z", 0)), P.e(new A(cls, "renderTypeExpansions", "getRenderTypeExpansions()Z", 0)), P.e(new A(cls, "renderAbbreviatedTypeComments", "getRenderAbbreviatedTypeComments()Z", 0)), P.e(new A(cls, "includeAdditionalModifiers", "getIncludeAdditionalModifiers()Z", 0)), P.e(new A(cls, "parameterNamesInFunctionalTypes", "getParameterNamesInFunctionalTypes()Z", 0)), P.e(new A(cls, "renderFunctionContracts", "getRenderFunctionContracts()Z", 0)), P.e(new A(cls, "presentableUnresolvedTypes", "getPresentableUnresolvedTypes()Z", 0)), P.e(new A(cls, "boldOnlyForNamesInHtml", "getBoldOnlyForNamesInHtml()Z", 0)), P.e(new A(cls, "informativeErrorType", "getInformativeErrorType()Z", 0))};
    }

    public z() {
        Boolean bool = Boolean.TRUE;
        this.f143229c = r0(bool);
        this.f143230d = r0(bool);
        this.f143231e = r0(v.ALL_EXCEPT_ANNOTATIONS);
        Boolean bool2 = Boolean.FALSE;
        this.f143232f = r0(bool2);
        this.f143233g = r0(bool2);
        this.f143234h = r0(bool2);
        this.f143235i = r0(bool2);
        this.f143236j = r0(bool2);
        this.f143237k = r0(bool);
        this.f143238l = r0(bool2);
        this.f143239m = r0(bool2);
        this.f143240n = r0(bool2);
        this.f143241o = r0(bool);
        this.f143242p = r0(bool);
        this.f143243q = r0(bool2);
        this.f143244r = r0(bool2);
        this.f143245s = r0(bool2);
        this.f143246t = r0(bool2);
        this.f143247u = r0(bool2);
        this.f143248v = r0((Object) null);
        this.f143249w = r0(bool2);
        this.f143250x = r0(bool2);
        this.f143251y = r0(x.f143199a);
        this.f143252z = r0(y.f143200a);
        this.f143202A = r0(bool);
        this.f143203B = r0(C17225C.RENDER_OPEN);
        this.f143204C = r0(n.b.a.f143186a);
        this.f143205D = r0(C17228F.PLAIN);
        this.f143206E = r0(C17226D.ALL);
        this.f143207F = r0(bool2);
        this.f143208G = r0(bool2);
        this.f143209H = r0(C17227E.DEBUG);
        this.f143210I = r0(bool2);
        this.f143211J = r0(bool2);
        this.f143212K = r0(g0.d());
        this.f143213L = r0(C17223A.f143156a.a());
        this.f143214M = r0((Object) null);
        this.f143215N = r0(C17230a.NO_ARGUMENTS);
        this.f143216O = r0(bool2);
        this.f143217P = r0(bool);
        this.f143218Q = r0(bool);
        this.f143219R = r0(bool2);
        this.f143220S = r0(bool2);
        this.f143221T = r0(bool);
        this.f143222U = r0(bool);
        this.f143223V = r0(bool2);
        this.f143224W = r0(bool2);
        this.f143225X = r0(bool2);
        this.f143226Y = r0(bool);
    }

    private final <T> C17787d<z, T> r0(T t10) {
        C17784a aVar = C17784a.f146467a;
        return new a(t10, this);
    }

    /* access modifiers changed from: private */
    public static final C18096U s0(C18096U u10) {
        C17542s.j(u10, "it");
        return u10;
    }

    /* access modifiers changed from: private */
    public static final String t(u0 u0Var) {
        C17542s.j(u0Var, "it");
        return "...";
    }

    public C17642l<u0, String> A() {
        return (C17642l) this.f143252z.a(this, f143201Z[24]);
    }

    public boolean B() {
        return ((Boolean) this.f143211J.a(this, f143201Z[34])).booleanValue();
    }

    public Set<C17066c> C() {
        return (Set) this.f143212K.a(this, f143201Z[35]);
    }

    public boolean D() {
        return ((Boolean) this.f143221T.a(this, f143201Z[44])).booleanValue();
    }

    public boolean E() {
        return w.a.a(this);
    }

    public boolean F() {
        return w.a.b(this);
    }

    public boolean G() {
        return ((Boolean) this.f143247u.a(this, f143201Z[19])).booleanValue();
    }

    public boolean H() {
        return ((Boolean) this.f143226Y.a(this, f143201Z[49])).booleanValue();
    }

    public Set<v> I() {
        return (Set) this.f143231e.a(this, f143201Z[3]);
    }

    public boolean J() {
        return ((Boolean) this.f143240n.a(this, f143201Z[12])).booleanValue();
    }

    public C17225C K() {
        return (C17225C) this.f143203B.a(this, f143201Z[26]);
    }

    public C17226D L() {
        return (C17226D) this.f143206E.a(this, f143201Z[29]);
    }

    public boolean M() {
        return ((Boolean) this.f143222U.a(this, f143201Z[45])).booleanValue();
    }

    public boolean N() {
        return ((Boolean) this.f143224W.a(this, f143201Z[47])).booleanValue();
    }

    public C17227E O() {
        return (C17227E) this.f143209H.a(this, f143201Z[32]);
    }

    public C17642l<C17373g<?>, String> P() {
        return (C17642l) this.f143248v.a(this, f143201Z[20]);
    }

    public boolean Q() {
        return ((Boolean) this.f143207F.a(this, f143201Z[30])).booleanValue();
    }

    public boolean R() {
        return ((Boolean) this.f143220S.a(this, f143201Z[43])).booleanValue();
    }

    public boolean S() {
        return ((Boolean) this.f143208G.a(this, f143201Z[31])).booleanValue();
    }

    public boolean T() {
        return ((Boolean) this.f143243q.a(this, f143201Z[15])).booleanValue();
    }

    public boolean U() {
        return ((Boolean) this.f143217P.a(this, f143201Z[40])).booleanValue();
    }

    public boolean V() {
        return ((Boolean) this.f143210I.a(this, f143201Z[33])).booleanValue();
    }

    public boolean W() {
        return ((Boolean) this.f143242p.a(this, f143201Z[14])).booleanValue();
    }

    public boolean X() {
        return ((Boolean) this.f143241o.a(this, f143201Z[13])).booleanValue();
    }

    public boolean Y() {
        return ((Boolean) this.f143244r.a(this, f143201Z[16])).booleanValue();
    }

    public boolean Z() {
        return ((Boolean) this.f143219R.a(this, f143201Z[42])).booleanValue();
    }

    public void a(C17228F f10) {
        C17542s.j(f10, "<set-?>");
        this.f143205D.b(this, f143201Z[28], f10);
    }

    public boolean a0() {
        return ((Boolean) this.f143218Q.a(this, f143201Z[41])).booleanValue();
    }

    public void b(boolean z10) {
        this.f143232f.b(this, f143201Z[4], Boolean.valueOf(z10));
    }

    public boolean b0() {
        return ((Boolean) this.f143202A.a(this, f143201Z[25])).booleanValue();
    }

    public void c(boolean z10) {
        this.f143229c.b(this, f143201Z[1], Boolean.valueOf(z10));
    }

    public boolean c0() {
        return ((Boolean) this.f143233g.a(this, f143201Z[5])).booleanValue();
    }

    public boolean d() {
        return ((Boolean) this.f143239m.a(this, f143201Z[11])).booleanValue();
    }

    public boolean d0() {
        return ((Boolean) this.f143232f.a(this, f143201Z[4])).booleanValue();
    }

    public void e(boolean z10) {
        this.f143250x.b(this, f143201Z[22], Boolean.valueOf(z10));
    }

    public C17228F e0() {
        return (C17228F) this.f143205D.a(this, f143201Z[28]);
    }

    public void f(boolean z10) {
        this.f143207F.b(this, f143201Z[30], Boolean.valueOf(z10));
    }

    public C17642l<C18096U, C18096U> f0() {
        return (C17642l) this.f143251y.a(this, f143201Z[23]);
    }

    public void g(C17226D d10) {
        C17542s.j(d10, "<set-?>");
        this.f143206E.b(this, f143201Z[29], d10);
    }

    public boolean g0() {
        return ((Boolean) this.f143246t.a(this, f143201Z[18])).booleanValue();
    }

    public Set<C17066c> h() {
        return (Set) this.f143213L.a(this, f143201Z[36]);
    }

    public boolean h0() {
        return ((Boolean) this.f143237k.a(this, f143201Z[9])).booleanValue();
    }

    public boolean i() {
        return ((Boolean) this.f143234h.a(this, f143201Z[6])).booleanValue();
    }

    public n.b i0() {
        return (n.b) this.f143204C.a(this, f143201Z[27]);
    }

    public C17230a j() {
        return (C17230a) this.f143215N.a(this, f143201Z[38]);
    }

    public boolean j0() {
        return ((Boolean) this.f143236j.a(this, f143201Z[8])).booleanValue();
    }

    public void k(Set<C17066c> set) {
        C17542s.j(set, "<set-?>");
        this.f143213L.b(this, f143201Z[36], set);
    }

    public boolean k0() {
        return ((Boolean) this.f143229c.a(this, f143201Z[1])).booleanValue();
    }

    public void l(Set<? extends v> set) {
        C17542s.j(set, "<set-?>");
        this.f143231e.b(this, f143201Z[3], set);
    }

    public boolean l0() {
        return ((Boolean) this.f143230d.a(this, f143201Z[2])).booleanValue();
    }

    public void m(boolean z10) {
        this.f143234h.b(this, f143201Z[6], Boolean.valueOf(z10));
    }

    public boolean m0() {
        return ((Boolean) this.f143238l.a(this, f143201Z[10])).booleanValue();
    }

    public void n(boolean z10) {
        this.f143208G.b(this, f143201Z[31], Boolean.valueOf(z10));
    }

    public boolean n0() {
        return ((Boolean) this.f143250x.a(this, f143201Z[22])).booleanValue();
    }

    public void o(C17231b bVar) {
        C17542s.j(bVar, "<set-?>");
        this.f143228b.b(this, f143201Z[0], bVar);
    }

    public boolean o0() {
        return ((Boolean) this.f143249w.a(this, f143201Z[21])).booleanValue();
    }

    public void p(boolean z10) {
        this.f143249w.b(this, f143201Z[21], Boolean.valueOf(z10));
    }

    public final boolean p0() {
        return this.f143227a;
    }

    public final void q0() {
        this.f143227a = true;
    }

    public final z s() {
        z zVar = new z();
        Class<z> cls = z.class;
        Iterator a10 = C17527c.a(cls.getDeclaredFields());
        while (a10.hasNext()) {
            Field field = (Field) a10.next();
            if ((field.getModifiers() & 8) == 0) {
                field.setAccessible(true);
                Object obj = field.get(this);
                C17785b bVar = obj instanceof C17785b ? (C17785b) obj : null;
                if (bVar != null) {
                    String name = field.getName();
                    C17542s.i(name, "getName(...)");
                    C15854t.W(name, "is", false, 2, (Object) null);
                    C18055d b10 = P.b(cls);
                    String name2 = field.getName();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("get");
                    String name3 = field.getName();
                    C17542s.i(name3, "getName(...)");
                    if (name3.length() > 0) {
                        char upperCase = Character.toUpperCase(name3.charAt(0));
                        String substring = name3.substring(1);
                        C17542s.i(substring, "substring(...)");
                        name3 = upperCase + substring;
                    }
                    sb2.append(name3);
                    field.set(zVar, zVar.r0(bVar.a(this, new G(b10, name2, sb2.toString()))));
                }
            }
        }
        return zVar;
    }

    public boolean u() {
        return ((Boolean) this.f143245s.a(this, f143201Z[17])).booleanValue();
    }

    public boolean v() {
        return ((Boolean) this.f143216O.a(this, f143201Z[39])).booleanValue();
    }

    public C17642l<C15644c, Boolean> w() {
        return (C17642l) this.f143214M.a(this, f143201Z[37]);
    }

    public boolean x() {
        return ((Boolean) this.f143225X.a(this, f143201Z[48])).booleanValue();
    }

    public boolean y() {
        return ((Boolean) this.f143235i.a(this, f143201Z[7])).booleanValue();
    }

    public C17231b z() {
        return (C17231b) this.f143228b.a(this, f143201Z[0]);
    }
}
