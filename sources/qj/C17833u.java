package qJ;

import DI.C15538I;
import DI.i0;
import XI.l;
import XI.m;
import XI.o;
import XI.p;
import YH.C16877v;
import ZI.C17004a;
import ZI.d;
import cJ.C17065b;
import cJ.C17066c;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.jvm.internal.C17542s;
import nJ.C17656k;
import sJ.C17917M;
import sJ.C17942s;
import tJ.C17994n;

/* renamed from: qJ.u  reason: case insensitive filesystem */
public abstract class C17833u extends C17830r {

    /* renamed from: h  reason: collision with root package name */
    private final C17004a f146603h;

    /* renamed from: i  reason: collision with root package name */
    private final C17942s f146604i;

    /* renamed from: j  reason: collision with root package name */
    private final d f146605j;

    /* renamed from: k  reason: collision with root package name */
    private final C17800M f146606k;

    /* renamed from: l  reason: collision with root package name */
    private m f146607l;

    /* renamed from: m  reason: collision with root package name */
    private C17656k f146608m;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C17833u(C17066c cVar, C17994n nVar, C15538I i10, m mVar, C17004a aVar, C17942s sVar) {
        super(cVar, nVar, i10);
        C17542s.j(cVar, "fqName");
        C17542s.j(nVar, "storageManager");
        C17542s.j(i10, "module");
        C17542s.j(mVar, "proto");
        C17542s.j(aVar, "metadataVersion");
        this.f146603h = aVar;
        this.f146604i = sVar;
        p J10 = mVar.J();
        C17542s.i(J10, "getStrings(...)");
        o I10 = mVar.I();
        C17542s.i(I10, "getQualifiedNames(...)");
        d dVar = new d(J10, I10);
        this.f146605j = dVar;
        this.f146606k = new C17800M(mVar, dVar, aVar, new C17831s(this));
        this.f146607l = mVar;
    }

    /* access modifiers changed from: private */
    public static final i0 O0(C17833u uVar, C17065b bVar) {
        C17542s.j(bVar, "it");
        C17942s sVar = uVar.f146604i;
        if (sVar != null) {
            return sVar;
        }
        i0 i0Var = i0.f133841a;
        C17542s.i(i0Var, "NO_SOURCE");
        return i0Var;
    }

    /* access modifiers changed from: private */
    public static final Collection Q0(C17833u uVar) {
        ArrayList<C17065b> arrayList = new ArrayList<>();
        for (Object next : uVar.H0().b()) {
            C17065b bVar = (C17065b) next;
            if (!bVar.j() && !C17824l.f146559c.a().contains(bVar)) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(C16877v.y(arrayList, 10));
        for (C17065b h10 : arrayList) {
            arrayList2.add(h10.h());
        }
        return arrayList2;
    }

    public void L0(C17826n nVar) {
        C17542s.j(nVar, "components");
        m mVar = this.f146607l;
        if (mVar != null) {
            this.f146607l = null;
            l H10 = mVar.H();
            C17542s.i(H10, "getPackage(...)");
            d dVar = this.f146605j;
            C17004a aVar = this.f146603h;
            C17942s sVar = this.f146604i;
            this.f146608m = new C17917M(this, H10, dVar, aVar, sVar, nVar, "scope of " + this, new C17832t(this));
            return;
        }
        throw new IllegalStateException("Repeated call to DeserializedPackageFragmentImpl::initialize");
    }

    /* renamed from: P0 */
    public C17800M H0() {
        return this.f146606k;
    }

    public C17656k q() {
        C17656k kVar = this.f146608m;
        if (kVar != null) {
            return kVar;
        }
        C17542s.z("_memberScope");
        return null;
    }
}
