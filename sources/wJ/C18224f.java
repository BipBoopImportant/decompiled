package wJ;

import DI.C15535F;
import DI.C15554a;
import DI.C15555b;
import DI.C15566m;
import DI.C15568o;
import DI.C15573t;
import DI.C15574u;
import DI.C15576w;
import DI.Z;
import DI.a0;
import DI.b0;
import DI.c0;
import DI.d0;
import DI.i0;
import DI.n0;
import DI.u0;
import EI.C15649h;
import GI.C15717K;
import YH.C16877v;
import cJ.C17069f;
import iJ.C17373g;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.C17542s;
import uJ.C18096U;
import uJ.J0;

/* renamed from: wJ.f  reason: case insensitive filesystem */
public final class C18224f implements a0 {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ C15717K f149157a;

    public C18224f() {
        C18230l lVar = C18230l.f149170a;
        C15717K O02 = C15717K.O0(lVar.h(), C15649h.f134231V.b(), C15535F.OPEN, C15573t.f133853e, true, C17069f.D(C18220b.ERROR_PROPERTY.b()), C15555b.a.DECLARATION, i0.f133841a, false, false, false, false, false, false);
        O02.b1(lVar.k(), C16877v.n(), (d0) null, (d0) null, C16877v.n());
        this.f149157a = O02;
    }

    public C15555b C(C15566m mVar, C15535F f10, C15574u uVar, C15555b.a aVar, boolean z10) {
        a0 N02 = this.f149157a.C(mVar, f10, uVar, aVar, z10);
        C17542s.i(N02, "copy(...)");
        return N02;
    }

    public boolean D() {
        return this.f149157a.D();
    }

    public void E0(Collection<? extends C15555b> collection) {
        C17542s.j(collection, "overriddenDescriptors");
        this.f149157a.E0(collection);
    }

    public d0 L() {
        return this.f149157a.L();
    }

    public boolean N() {
        return this.f149157a.N();
    }

    public d0 O() {
        return this.f149157a.O();
    }

    public C15576w P() {
        return this.f149157a.P();
    }

    public <V> V T(C15554a.C3296a<V> aVar) {
        return this.f149157a.T(aVar);
    }

    public boolean Y() {
        return this.f149157a.Y();
    }

    public a0 a() {
        a0 a10 = this.f149157a.a();
        C17542s.i(a10, "getOriginal(...)");
        return a10;
    }

    public <R, D> R a0(C15568o<R, D> oVar, D d10) {
        return this.f149157a.a0(oVar, d10);
    }

    public C15566m b() {
        C15566m b10 = this.f149157a.b();
        C17542s.i(b10, "getContainingDeclaration(...)");
        return b10;
    }

    public a0 c(J0 j02) {
        C17542s.j(j02, "substitutor");
        return this.f149157a.c(j02);
    }

    public boolean c0() {
        return this.f149157a.c0();
    }

    public b0 d() {
        return this.f149157a.d();
    }

    public Collection<? extends a0> e() {
        Collection<? extends a0> e10 = this.f149157a.e();
        C17542s.i(e10, "getOverriddenDescriptors(...)");
        return e10;
    }

    public c0 g() {
        return this.f149157a.g();
    }

    public C15649h getAnnotations() {
        C15649h annotations = this.f149157a.getAnnotations();
        C17542s.i(annotations, "<get-annotations>(...)");
        return annotations;
    }

    public C17069f getName() {
        C17069f name = this.f149157a.getName();
        C17542s.i(name, "getName(...)");
        return name;
    }

    public C18096U getReturnType() {
        return this.f149157a.getReturnType();
    }

    public C18096U getType() {
        C18096U type = this.f149157a.getType();
        C17542s.i(type, "getType(...)");
        return type;
    }

    public List<n0> getTypeParameters() {
        List<n0> typeParameters = this.f149157a.getTypeParameters();
        C17542s.i(typeParameters, "getTypeParameters(...)");
        return typeParameters;
    }

    public C15574u getVisibility() {
        C15574u visibility = this.f149157a.getVisibility();
        C17542s.i(visibility, "getVisibility(...)");
        return visibility;
    }

    public C15555b.a h() {
        C15555b.a h10 = this.f149157a.h();
        C17542s.i(h10, "getKind(...)");
        return h10;
    }

    public i0 i() {
        i0 i10 = this.f149157a.i();
        C17542s.i(i10, "getSource(...)");
        return i10;
    }

    public boolean i0() {
        return this.f149157a.i0();
    }

    public boolean isExternal() {
        return this.f149157a.isExternal();
    }

    public List<u0> j() {
        List<u0> j10 = this.f149157a.j();
        C17542s.i(j10, "getValueParameters(...)");
        return j10;
    }

    public boolean m0() {
        return this.f149157a.m0();
    }

    public C17373g<?> q0() {
        return this.f149157a.q0();
    }

    public C15535F u() {
        C15535F u10 = this.f149157a.u();
        C17542s.i(u10, "getModality(...)");
        return u10;
    }

    public C15576w x0() {
        return this.f149157a.x0();
    }

    public List<Z> y() {
        List<Z> y10 = this.f149157a.y();
        C17542s.i(y10, "getAccessors(...)");
        return y10;
    }

    public List<d0> y0() {
        List<d0> y02 = this.f149157a.y0();
        C17542s.i(y02, "getContextReceiverParameters(...)");
        return y02;
    }

    public boolean z0() {
        return this.f149157a.z0();
    }
}
