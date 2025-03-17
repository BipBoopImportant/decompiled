package nJ;

import DI.C15555b;
import DI.C15558e;
import DI.C15566m;
import DI.C15579z;
import DI.a0;
import DI.h0;
import EJ.C15660a;
import EJ.C15670k;
import LI.C16015b;
import XH.C16807N;
import YH.C16877v;
import cJ.C17069f;
import gJ.C17282m;
import gJ.C17284o;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.P;
import nI.C17642l;
import nJ.C17659n;
import tJ.C17989i;
import tJ.C17993m;
import tJ.C17994n;
import uI.C18064m;
import uJ.C18096U;

/* renamed from: nJ.f  reason: case insensitive filesystem */
public abstract class C17651f extends C17657l {

    /* renamed from: d  reason: collision with root package name */
    static final /* synthetic */ C18064m<Object>[] f144852d = {P.h(new G(C17651f.class, "allDescriptors", "getAllDescriptors()Ljava/util/List;", 0))};

    /* renamed from: b  reason: collision with root package name */
    private final C15558e f144853b;

    /* renamed from: c  reason: collision with root package name */
    private final C17989i f144854c;

    /* renamed from: nJ.f$a */
    public static final class a extends C17282m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ArrayList<C15566m> f144855a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C17651f f144856b;

        a(ArrayList<C15566m> arrayList, C17651f fVar) {
            this.f144855a = arrayList;
            this.f144856b = fVar;
        }

        public void a(C15555b bVar) {
            C17542s.j(bVar, "fakeOverride");
            C17284o.K(bVar, (C17642l<C15555b, C16807N>) null);
            this.f144855a.add(bVar);
        }

        /* access modifiers changed from: protected */
        public void e(C15555b bVar, C15555b bVar2) {
            C17542s.j(bVar, "fromSuper");
            C17542s.j(bVar2, "fromCurrent");
            throw new IllegalStateException(("Conflict in scope of " + this.f144856b.m() + ": " + bVar + " vs " + bVar2).toString());
        }
    }

    public C17651f(C17994n nVar, C15558e eVar) {
        C17542s.j(nVar, "storageManager");
        C17542s.j(eVar, "containingClass");
        this.f144853b = eVar;
        this.f144854c = nVar.d(new C17650e(this));
    }

    /* access modifiers changed from: private */
    public static final List i(C17651f fVar) {
        List<C15579z> j10 = fVar.j();
        return C16877v.V0(j10, fVar.k(j10));
    }

    private final List<C15566m> k(List<? extends C15579z> list) {
        Collection collection;
        ArrayList arrayList = new ArrayList(3);
        Collection<C18096U> a10 = this.f144853b.k().a();
        C17542s.i(a10, "getSupertypes(...)");
        ArrayList arrayList2 = new ArrayList();
        for (C18096U q10 : a10) {
            C16877v.E(arrayList2, C17659n.a.a(q10.q(), (C17649d) null, (C17642l) null, 3, (Object) null));
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object next : arrayList2) {
            if (next instanceof C15555b) {
                arrayList3.add(next);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object next2 : arrayList3) {
            C17069f name = ((C15555b) next2).getName();
            Object obj = linkedHashMap.get(name);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(name, obj);
            }
            ((List) obj).add(next2);
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object key = entry.getKey();
            C17542s.i(key, "component1(...)");
            C17069f fVar = (C17069f) key;
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Object next3 : (List) entry.getValue()) {
                Boolean valueOf = Boolean.valueOf(((C15555b) next3) instanceof C15579z);
                Object obj2 = linkedHashMap2.get(valueOf);
                if (obj2 == null) {
                    obj2 = new ArrayList();
                    linkedHashMap2.put(valueOf, obj2);
                }
                ((List) obj2).add(next3);
            }
            for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                boolean booleanValue = ((Boolean) entry2.getKey()).booleanValue();
                C17284o oVar = C17284o.f143311f;
                Collection collection2 = (List) entry2.getValue();
                if (booleanValue) {
                    collection = new ArrayList();
                    for (Object next4 : list) {
                        if (C17542s.e(((C15579z) next4).getName(), fVar)) {
                            collection.add(next4);
                        }
                    }
                } else {
                    collection = C16877v.n();
                }
                oVar.v(fVar, collection2, collection, this.f144853b, new a(arrayList, this));
            }
        }
        return C15660a.c(arrayList);
    }

    private final List<C15566m> l() {
        return (List) C17993m.a(this.f144854c, this, f144852d[0]);
    }

    public Collection<a0> b(C17069f fVar, C16015b bVar) {
        List list;
        C17542s.j(fVar, "name");
        C17542s.j(bVar, "location");
        Collection l10 = l();
        if (l10.isEmpty()) {
            list = C16877v.n();
        } else {
            C15670k kVar = new C15670k();
            for (Object next : l10) {
                if ((next instanceof a0) && C17542s.e(((a0) next).getName(), fVar)) {
                    kVar.add(next);
                }
            }
            list = kVar;
        }
        return list;
    }

    public Collection<h0> d(C17069f fVar, C16015b bVar) {
        List list;
        C17542s.j(fVar, "name");
        C17542s.j(bVar, "location");
        Collection l10 = l();
        if (l10.isEmpty()) {
            list = C16877v.n();
        } else {
            C15670k kVar = new C15670k();
            for (Object next : l10) {
                if ((next instanceof h0) && C17542s.e(((h0) next).getName(), fVar)) {
                    kVar.add(next);
                }
            }
            list = kVar;
        }
        return list;
    }

    public Collection<C15566m> g(C17649d dVar, C17642l<? super C17069f, Boolean> lVar) {
        C17542s.j(dVar, "kindFilter");
        C17542s.j(lVar, "nameFilter");
        return !dVar.a(C17649d.f144836p.m()) ? C16877v.n() : l();
    }

    /* access modifiers changed from: protected */
    public abstract List<C15579z> j();

    /* access modifiers changed from: protected */
    public final C15558e m() {
        return this.f144853b;
    }
}
