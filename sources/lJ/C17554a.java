package lJ;

import DI.C15557d;
import DI.C15558e;
import DI.h0;
import GI.C15717K;
import PI.C16201k;
import YH.C16877v;
import cJ.C17069f;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.C17542s;

/* renamed from: lJ.a  reason: case insensitive filesystem */
public final class C17554a implements C17559f {

    /* renamed from: b  reason: collision with root package name */
    private final List<C17559f> f144404b;

    public C17554a(List<? extends C17559f> list) {
        C17542s.j(list, "inner");
        this.f144404b = list;
    }

    public List<C17069f> a(C15558e eVar, C16201k kVar) {
        C17542s.j(eVar, "thisDescriptor");
        C17542s.j(kVar, "c");
        ArrayList arrayList = new ArrayList();
        for (C17559f a10 : this.f144404b) {
            C16877v.E(arrayList, a10.a(eVar, kVar));
        }
        return arrayList;
    }

    public void b(C15558e eVar, C17069f fVar, Collection<h0> collection, C16201k kVar) {
        C17542s.j(eVar, "thisDescriptor");
        C17542s.j(fVar, "name");
        C17542s.j(collection, "result");
        C17542s.j(kVar, "c");
        for (C17559f b10 : this.f144404b) {
            b10.b(eVar, fVar, collection, kVar);
        }
    }

    public void c(C15558e eVar, C17069f fVar, Collection<h0> collection, C16201k kVar) {
        C17542s.j(eVar, "thisDescriptor");
        C17542s.j(fVar, "name");
        C17542s.j(collection, "result");
        C17542s.j(kVar, "c");
        for (C17559f c10 : this.f144404b) {
            c10.c(eVar, fVar, collection, kVar);
        }
    }

    public List<C17069f> d(C15558e eVar, C16201k kVar) {
        C17542s.j(eVar, "thisDescriptor");
        C17542s.j(kVar, "c");
        ArrayList arrayList = new ArrayList();
        for (C17559f d10 : this.f144404b) {
            C16877v.E(arrayList, d10.d(eVar, kVar));
        }
        return arrayList;
    }

    public C15717K e(C15558e eVar, C15717K k10, C16201k kVar) {
        C17542s.j(eVar, "thisDescriptor");
        C17542s.j(k10, "propertyDescriptor");
        C17542s.j(kVar, "c");
        for (C17559f e10 : this.f144404b) {
            k10 = e10.e(eVar, k10, kVar);
        }
        return k10;
    }

    public void f(C15558e eVar, List<C15557d> list, C16201k kVar) {
        C17542s.j(eVar, "thisDescriptor");
        C17542s.j(list, "result");
        C17542s.j(kVar, "c");
        for (C17559f f10 : this.f144404b) {
            f10.f(eVar, list, kVar);
        }
    }

    public List<C17069f> g(C15558e eVar, C16201k kVar) {
        C17542s.j(eVar, "thisDescriptor");
        C17542s.j(kVar, "c");
        ArrayList arrayList = new ArrayList();
        for (C17559f g10 : this.f144404b) {
            C16877v.E(arrayList, g10.g(eVar, kVar));
        }
        return arrayList;
    }

    public void h(C15558e eVar, C17069f fVar, List<C15558e> list, C16201k kVar) {
        C17542s.j(eVar, "thisDescriptor");
        C17542s.j(fVar, "name");
        C17542s.j(list, "result");
        C17542s.j(kVar, "c");
        for (C17559f h10 : this.f144404b) {
            h10.h(eVar, fVar, list, kVar);
        }
    }
}
