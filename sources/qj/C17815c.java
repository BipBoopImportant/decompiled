package qJ;

import DI.C15538I;
import DI.C15544O;
import DI.C15550V;
import EJ.C15660a;
import XH.C16814e;
import YH.C16877v;
import YH.g0;
import cJ.C17066c;
import cJ.C17069f;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;
import tJ.C17988h;
import tJ.C17994n;

/* renamed from: qJ.c  reason: case insensitive filesystem */
public abstract class C17815c implements C15550V {

    /* renamed from: a  reason: collision with root package name */
    private final C17994n f146545a;

    /* renamed from: b  reason: collision with root package name */
    private final C17788A f146546b;

    /* renamed from: c  reason: collision with root package name */
    private final C15538I f146547c;

    /* renamed from: d  reason: collision with root package name */
    protected C17826n f146548d;

    /* renamed from: e  reason: collision with root package name */
    private final C17988h<C17066c, C15544O> f146549e;

    public C17815c(C17994n nVar, C17788A a10, C15538I i10) {
        C17542s.j(nVar, "storageManager");
        C17542s.j(a10, "finder");
        C17542s.j(i10, "moduleDescriptor");
        this.f146545a = nVar;
        this.f146546b = a10;
        this.f146547c = i10;
        this.f146549e = nVar.e(new C17814b(this));
    }

    /* access modifiers changed from: private */
    public static final C15544O f(C17815c cVar, C17066c cVar2) {
        C17542s.j(cVar2, "fqName");
        C17830r e10 = cVar.e(cVar2);
        if (e10 == null) {
            return null;
        }
        e10.L0(cVar.g());
        return e10;
    }

    public boolean a(C17066c cVar) {
        C17542s.j(cVar, "fqName");
        return (this.f146549e.x(cVar) ? this.f146549e.invoke(cVar) : e(cVar)) == null;
    }

    @C16814e
    public List<C15544O> b(C17066c cVar) {
        C17542s.j(cVar, "fqName");
        return C16877v.r(this.f146549e.invoke(cVar));
    }

    public void c(C17066c cVar, Collection<C15544O> collection) {
        C17542s.j(cVar, "fqName");
        C17542s.j(collection, "packageFragments");
        C15660a.a(collection, this.f146549e.invoke(cVar));
    }

    /* access modifiers changed from: protected */
    public abstract C17830r e(C17066c cVar);

    /* access modifiers changed from: protected */
    public final C17826n g() {
        C17826n nVar = this.f146548d;
        if (nVar != null) {
            return nVar;
        }
        C17542s.z("components");
        return null;
    }

    /* access modifiers changed from: protected */
    public final C17788A h() {
        return this.f146546b;
    }

    /* access modifiers changed from: protected */
    public final C15538I i() {
        return this.f146547c;
    }

    /* access modifiers changed from: protected */
    public final C17994n j() {
        return this.f146545a;
    }

    /* access modifiers changed from: protected */
    public final void k(C17826n nVar) {
        C17542s.j(nVar, "<set-?>");
        this.f146548d = nVar;
    }

    public Collection<C17066c> s(C17066c cVar, C17642l<? super C17069f, Boolean> lVar) {
        C17542s.j(cVar, "fqName");
        C17542s.j(lVar, "nameFilter");
        return g0.d();
    }
}
