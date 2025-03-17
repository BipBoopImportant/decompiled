package nJ;

import DI.C15554a;
import DI.C15566m;
import DI.a0;
import DI.h0;
import DJ.C15580a;
import EJ.C15670k;
import LI.C16015b;
import XH.v;
import YH.C16877v;
import cJ.C17069f;
import gJ.C17287r;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17642l;
import uJ.C18096U;

/* renamed from: nJ.x  reason: case insensitive filesystem */
public final class C17669x extends C17646a {

    /* renamed from: d  reason: collision with root package name */
    public static final a f144882d = new a((DefaultConstructorMarker) null);

    /* renamed from: b  reason: collision with root package name */
    private final String f144883b;

    /* renamed from: c  reason: collision with root package name */
    private final C17656k f144884c;

    /* renamed from: nJ.x$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C17656k a(String str, Collection<? extends C18096U> collection) {
            C17542s.j(str, "message");
            C17542s.j(collection, "types");
            Iterable<C18096U> iterable = collection;
            ArrayList arrayList = new ArrayList(C16877v.y(iterable, 10));
            for (C18096U q10 : iterable) {
                arrayList.add(q10.q());
            }
            C15670k<C17656k> b10 = C15580a.b(arrayList);
            C17656k b11 = C17647b.f144817d.b(str, b10);
            return b10.size() <= 1 ? b11 : new C17669x(str, b11, (DefaultConstructorMarker) null);
        }

        private a() {
        }
    }

    public /* synthetic */ C17669x(String str, C17656k kVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, kVar);
    }

    public static final C17656k m(String str, Collection<? extends C18096U> collection) {
        return f144882d.a(str, collection);
    }

    /* access modifiers changed from: private */
    public static final C15554a n(C15554a aVar) {
        C17542s.j(aVar, "$this$selectMostSpecificInEachOverridableGroup");
        return aVar;
    }

    /* access modifiers changed from: private */
    public static final C15554a o(h0 h0Var) {
        C17542s.j(h0Var, "$this$selectMostSpecificInEachOverridableGroup");
        return h0Var;
    }

    /* access modifiers changed from: private */
    public static final C15554a p(a0 a0Var) {
        C17542s.j(a0Var, "$this$selectMostSpecificInEachOverridableGroup");
        return a0Var;
    }

    public Collection<a0> b(C17069f fVar, C16015b bVar) {
        C17542s.j(fVar, "name");
        C17542s.j(bVar, "location");
        return C17287r.b(super.b(fVar, bVar), C17667v.f144880a);
    }

    public Collection<h0> d(C17069f fVar, C16015b bVar) {
        C17542s.j(fVar, "name");
        C17542s.j(bVar, "location");
        return C17287r.b(super.d(fVar, bVar), C17666u.f144879a);
    }

    public Collection<C15566m> g(C17649d dVar, C17642l<? super C17069f, Boolean> lVar) {
        C17542s.j(dVar, "kindFilter");
        C17542s.j(lVar, "nameFilter");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object next : super.g(dVar, lVar)) {
            if (((C15566m) next) instanceof C15554a) {
                arrayList.add(next);
            } else {
                arrayList2.add(next);
            }
        }
        v vVar = new v(arrayList, arrayList2);
        List list = (List) vVar.a();
        C17542s.h(list, "null cannot be cast to non-null type kotlin.collections.Collection<org.jetbrains.kotlin.descriptors.CallableDescriptor>");
        return C16877v.V0(C17287r.b(list, C17668w.f144881a), (List) vVar.b());
    }

    /* access modifiers changed from: protected */
    public C17656k i() {
        return this.f144884c;
    }

    private C17669x(String str, C17656k kVar) {
        this.f144883b = str;
        this.f144884c = kVar;
    }
}
