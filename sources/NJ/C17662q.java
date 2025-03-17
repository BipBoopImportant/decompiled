package nJ;

import DI.C15555b;
import DI.C15558e;
import DI.C15559f;
import DI.C15561h;
import DI.a0;
import DI.h0;
import EJ.C15670k;
import LI.C16015b;
import YH.C16877v;
import cJ.C17069f;
import gJ.C17277h;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.P;
import nI.C17642l;
import tJ.C17989i;
import tJ.C17993m;
import tJ.C17994n;
import uI.C18064m;

/* renamed from: nJ.q  reason: case insensitive filesystem */
public final class C17662q extends C17657l {

    /* renamed from: f  reason: collision with root package name */
    static final /* synthetic */ C18064m<Object>[] f144867f;

    /* renamed from: b  reason: collision with root package name */
    private final C15558e f144868b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f144869c;

    /* renamed from: d  reason: collision with root package name */
    private final C17989i f144870d;

    /* renamed from: e  reason: collision with root package name */
    private final C17989i f144871e;

    static {
        Class<C17662q> cls = C17662q.class;
        f144867f = new C18064m[]{P.h(new G(cls, "functions", "getFunctions()Ljava/util/List;", 0)), P.h(new G(cls, "properties", "getProperties()Ljava/util/List;", 0))};
    }

    public C17662q(C17994n nVar, C15558e eVar, boolean z10) {
        C17542s.j(nVar, "storageManager");
        C17542s.j(eVar, "containingClass");
        this.f144868b = eVar;
        this.f144869c = z10;
        eVar.h();
        C15559f fVar = C15559f.CLASS;
        this.f144870d = nVar.d(new C17660o(this));
        this.f144871e = nVar.d(new C17661p(this));
    }

    /* access modifiers changed from: private */
    public static final List j(C17662q qVar) {
        return C16877v.q(C17277h.g(qVar.f144868b), C17277h.h(qVar.f144868b));
    }

    private final List<h0> n() {
        return (List) C17993m.a(this.f144870d, this, f144867f[0]);
    }

    private final List<a0> o() {
        return (List) C17993m.a(this.f144871e, this, f144867f[1]);
    }

    /* access modifiers changed from: private */
    public static final List p(C17662q qVar) {
        return qVar.f144869c ? C16877v.r(C17277h.f(qVar.f144868b)) : C16877v.n();
    }

    public Collection<a0> b(C17069f fVar, C16015b bVar) {
        C17542s.j(fVar, "name");
        C17542s.j(bVar, "location");
        C15670k kVar = new C15670k();
        for (Object next : o()) {
            if (C17542s.e(((a0) next).getName(), fVar)) {
                kVar.add(next);
            }
        }
        return kVar;
    }

    public /* bridge */ /* synthetic */ C15561h e(C17069f fVar, C16015b bVar) {
        return (C15561h) k(fVar, bVar);
    }

    public Void k(C17069f fVar, C16015b bVar) {
        C17542s.j(fVar, "name");
        C17542s.j(bVar, "location");
        return null;
    }

    /* renamed from: l */
    public List<C15555b> g(C17649d dVar, C17642l<? super C17069f, Boolean> lVar) {
        C17542s.j(dVar, "kindFilter");
        C17542s.j(lVar, "nameFilter");
        return C16877v.V0(n(), o());
    }

    /* renamed from: m */
    public C15670k<h0> d(C17069f fVar, C16015b bVar) {
        C17542s.j(fVar, "name");
        C17542s.j(bVar, "location");
        C15670k<h0> kVar = new C15670k<>();
        for (Object next : n()) {
            if (C17542s.e(((h0) next).getName(), fVar)) {
                kVar.add(next);
            }
        }
        return kVar;
    }
}
