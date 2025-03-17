package qJ;

import DI.i0;
import XI.C16830c;
import XI.m;
import YH.C16877v;
import YH.X;
import ZI.C17004a;
import ZI.c;
import cJ.C17065b;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;
import tI.C17978n;

/* renamed from: qJ.M  reason: case insensitive filesystem */
public final class C17800M implements C17822j {

    /* renamed from: a  reason: collision with root package name */
    private final c f146499a;

    /* renamed from: b  reason: collision with root package name */
    private final C17004a f146500b;

    /* renamed from: c  reason: collision with root package name */
    private final C17642l<C17065b, i0> f146501c;

    /* renamed from: d  reason: collision with root package name */
    private final Map<C17065b, C16830c> f146502d;

    public C17800M(m mVar, c cVar, C17004a aVar, C17642l<? super C17065b, ? extends i0> lVar) {
        C17542s.j(mVar, "proto");
        C17542s.j(cVar, "nameResolver");
        C17542s.j(aVar, "metadataVersion");
        C17542s.j(lVar, "classSource");
        this.f146499a = cVar;
        this.f146500b = aVar;
        this.f146501c = lVar;
        List<C16830c> E10 = mVar.E();
        C17542s.i(E10, "getClass_List(...)");
        Iterable iterable = E10;
        LinkedHashMap linkedHashMap = new LinkedHashMap(C17978n.e(X.e(C16877v.y(iterable, 10)), 16));
        for (Object next : iterable) {
            linkedHashMap.put(C17799L.a(this.f146499a, ((C16830c) next).z0()), next);
        }
        this.f146502d = linkedHashMap;
    }

    public C17821i a(C17065b bVar) {
        C17542s.j(bVar, "classId");
        C16830c cVar = this.f146502d.get(bVar);
        if (cVar == null) {
            return null;
        }
        return new C17821i(this.f146499a, cVar, this.f146500b, this.f146501c.invoke(bVar));
    }

    public final Collection<C17065b> b() {
        return this.f146502d.keySet();
    }
}
