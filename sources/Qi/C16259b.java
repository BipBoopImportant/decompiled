package QI;

import GJ.C15765h;
import GJ.C15768k;
import TI.C16503g;
import TI.n;
import TI.p;
import TI.q;
import TI.r;
import TI.w;
import YH.C16877v;
import YH.X;
import cJ.C17069f;
import com.sugarcube.core.logger.DslKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;
import tI.C17978n;

/* renamed from: QI.b  reason: case insensitive filesystem */
public class C16259b implements C16260c {

    /* renamed from: a  reason: collision with root package name */
    private final C16503g f137475a;

    /* renamed from: b  reason: collision with root package name */
    private final C17642l<q, Boolean> f137476b;

    /* renamed from: c  reason: collision with root package name */
    private final C17642l<r, Boolean> f137477c;

    /* renamed from: d  reason: collision with root package name */
    private final Map<C17069f, List<r>> f137478d;

    /* renamed from: e  reason: collision with root package name */
    private final Map<C17069f, n> f137479e;

    /* renamed from: f  reason: collision with root package name */
    private final Map<C17069f, w> f137480f;

    public C16259b(C16503g gVar, C17642l<? super q, Boolean> lVar) {
        C17542s.j(gVar, "jClass");
        C17542s.j(lVar, "memberFilter");
        this.f137475a = gVar;
        this.f137476b = lVar;
        C16258a aVar = new C16258a(this);
        this.f137477c = aVar;
        C15765h H10 = C15768k.H(C16877v.h0(gVar.C()), aVar);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object next : H10) {
            C17069f name = ((r) next).getName();
            Object obj = linkedHashMap.get(name);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(name, obj);
            }
            ((List) obj).add(next);
        }
        this.f137478d = linkedHashMap;
        C15765h<T> H11 = C15768k.H(C16877v.h0(this.f137475a.z()), this.f137476b);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (T next2 : H11) {
            linkedHashMap2.put(((n) next2).getName(), next2);
        }
        this.f137479e = linkedHashMap2;
        C17642l<q, Boolean> lVar2 = this.f137476b;
        ArrayList arrayList = new ArrayList();
        for (Object next3 : this.f137475a.m()) {
            if (lVar2.invoke(next3).booleanValue()) {
                arrayList.add(next3);
            }
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(C17978n.e(X.e(C16877v.y(arrayList, 10)), 16));
        for (Object next4 : arrayList) {
            linkedHashMap3.put(((w) next4).getName(), next4);
        }
        this.f137480f = linkedHashMap3;
    }

    /* access modifiers changed from: private */
    public static final boolean h(C16259b bVar, r rVar) {
        C17542s.j(rVar, DslKt.INDICATOR_MAIN);
        return bVar.f137476b.invoke(rVar).booleanValue() && !p.c(rVar);
    }

    public Set<C17069f> a() {
        C15765h<T> H10 = C15768k.H(C16877v.h0(this.f137475a.C()), this.f137477c);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (T name : H10) {
            linkedHashSet.add(name.getName());
        }
        return linkedHashSet;
    }

    public Set<C17069f> b() {
        return this.f137480f.keySet();
    }

    public Collection<r> c(C17069f fVar) {
        C17542s.j(fVar, "name");
        List list = this.f137478d.get(fVar);
        if (list == null) {
            list = C16877v.n();
        }
        return list;
    }

    public Set<C17069f> d() {
        C15765h<T> H10 = C15768k.H(C16877v.h0(this.f137475a.z()), this.f137476b);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (T name : H10) {
            linkedHashSet.add(name.getName());
        }
        return linkedHashSet;
    }

    public w e(C17069f fVar) {
        C17542s.j(fVar, "name");
        return this.f137480f.get(fVar);
    }

    public n f(C17069f fVar) {
        C17542s.j(fVar, "name");
        return this.f137479e.get(fVar);
    }
}
