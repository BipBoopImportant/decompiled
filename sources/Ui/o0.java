package UI;

import AI.C15429j;
import DI.C15558e;
import DI.u0;
import EI.C15642a;
import EI.C15644c;
import MI.C16044E;
import MI.C16059c;
import MI.C16060d;
import MI.w;
import OI.C16165g;
import PI.C16201k;
import QI.C16267j;
import QI.c0;
import cJ.C17067d;
import gJ.C17278i;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import uJ.C18096U;
import uJ.M0;
import uJ.O0;
import vJ.u;
import yJ.C18740i;
import yJ.o;
import yJ.r;

final class o0 extends C16583d<C15644c> {

    /* renamed from: a  reason: collision with root package name */
    private final C15642a f139062a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f139063b;

    /* renamed from: c  reason: collision with root package name */
    private final C16201k f139064c;

    /* renamed from: d  reason: collision with root package name */
    private final C16059c f139065d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f139066e;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o0(C15642a aVar, boolean z10, C16201k kVar, C16059c cVar, boolean z11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar, z10, kVar, cVar, (i10 & 16) != 0 ? false : z11);
    }

    public boolean B(C18740i iVar) {
        C17542s.j(iVar, "<this>");
        return C15429j.f0((C18096U) iVar);
    }

    public boolean C() {
        return this.f139063b;
    }

    public boolean D(C18740i iVar, C18740i iVar2) {
        C17542s.j(iVar, "<this>");
        C17542s.j(iVar2, "other");
        return this.f139064c.a().k().b((C18096U) iVar, (C18096U) iVar2);
    }

    public boolean E(o oVar) {
        C17542s.j(oVar, "<this>");
        return oVar instanceof c0;
    }

    public boolean F(C18740i iVar) {
        C17542s.j(iVar, "<this>");
        return ((C18096U) iVar).Q0() instanceof C16589j;
    }

    /* renamed from: J */
    public boolean l(C15644c cVar, C18740i iVar) {
        C17542s.j(cVar, "<this>");
        return ((cVar instanceof C16165g) && ((C16165g) cVar).d()) || ((cVar instanceof C16267j) && !u() && (((C16267j) cVar).m() || q() == C16059c.TYPE_PARAMETER_BOUNDS)) || (iVar != null && C15429j.r0((C18096U) iVar) && m().p(cVar) && !this.f139064c.a().q().d());
    }

    /* renamed from: K */
    public C16060d m() {
        return this.f139064c.a().a();
    }

    /* renamed from: L */
    public C18096U v(C18740i iVar) {
        C17542s.j(iVar, "<this>");
        return O0.a((C18096U) iVar);
    }

    /* renamed from: M */
    public r A() {
        return u.f149076a;
    }

    public Iterable<C15644c> n(C18740i iVar) {
        C17542s.j(iVar, "<this>");
        return ((C18096U) iVar).getAnnotations();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r0.getAnnotations();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Iterable<EI.C15644c> p() {
        /*
            r1 = this;
            EI.a r0 = r1.f139062a
            if (r0 == 0) goto L_0x000b
            EI.h r0 = r0.getAnnotations()
            if (r0 == 0) goto L_0x000b
            goto L_0x0011
        L_0x000b:
            java.util.List r0 = YH.C16877v.n()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
        L_0x0011:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: UI.o0.p():java.lang.Iterable");
    }

    public C16059c q() {
        return this.f139065d;
    }

    public C16044E r() {
        return this.f139064c.b();
    }

    public boolean s() {
        C15642a aVar = this.f139062a;
        return (aVar instanceof u0) && ((u0) aVar).w0() != null;
    }

    /* access modifiers changed from: protected */
    public C16591l t(C16591l lVar, w wVar) {
        C16591l b10;
        if (lVar != null && (b10 = C16591l.b(lVar, C16590k.NOT_NULL, false, 2, (Object) null)) != null) {
            return b10;
        }
        if (wVar != null) {
            return wVar.d();
        }
        return null;
    }

    public boolean u() {
        return this.f139064c.a().q().c();
    }

    public C17067d x(C18740i iVar) {
        C17542s.j(iVar, "<this>");
        C15558e f10 = M0.f((C18096U) iVar);
        if (f10 != null) {
            return C17278i.m(f10);
        }
        return null;
    }

    public boolean z() {
        return this.f139066e;
    }

    public o0(C15642a aVar, boolean z10, C16201k kVar, C16059c cVar, boolean z11) {
        C17542s.j(kVar, "containerContext");
        C17542s.j(cVar, "containerApplicabilityType");
        this.f139062a = aVar;
        this.f139063b = z10;
        this.f139064c = kVar;
        this.f139065d = cVar;
        this.f139066e = z11;
    }
}
