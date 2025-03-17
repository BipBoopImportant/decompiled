package vJ;

import YH.C16877v;
import fI.C17221b;
import iJ.C17383q;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.C17540p;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17642l;
import nI.p;
import uJ.C18090N;
import uJ.C18095T;
import uJ.C18096U;
import uJ.C18113f0;
import uJ.C18121j0;
import uJ.C18131o0;
import uJ.C18145z;
import uJ.P0;
import uJ.u0;

/* renamed from: vJ.B  reason: case insensitive filesystem */
public final class C18196B {

    /* renamed from: a  reason: collision with root package name */
    public static final C18196B f149043a = new C18196B();

    /* renamed from: vJ.B$a */
    private enum a {
        ;

        /* renamed from: vJ.B$a$a  reason: collision with other inner class name */
        static final class C4300a extends a {
            C4300a(String str, int i10) {
                super(str, i10, (DefaultConstructorMarker) null);
            }

            public a b(P0 p02) {
                C17542s.j(p02, "nextType");
                return j(p02);
            }
        }

        /* renamed from: vJ.B$a$b */
        static final class b extends a {
            b(String str, int i10) {
                super(str, i10, (DefaultConstructorMarker) null);
            }

            /* renamed from: m */
            public b b(P0 p02) {
                C17542s.j(p02, "nextType");
                return this;
            }
        }

        /* renamed from: vJ.B$a$c */
        static final class c extends a {
            c(String str, int i10) {
                super(str, i10, (DefaultConstructorMarker) null);
            }

            public a b(P0 p02) {
                C17542s.j(p02, "nextType");
                return j(p02);
            }
        }

        /* renamed from: vJ.B$a$d */
        static final class d extends a {
            d(String str, int i10) {
                super(str, i10, (DefaultConstructorMarker) null);
            }

            public a b(P0 p02) {
                C17542s.j(p02, "nextType");
                a j10 = j(p02);
                return j10 == a.ACCEPT_NULL ? this : j10;
            }
        }

        static {
            a[] a10;
            $ENTRIES = C17221b.a(a10);
        }

        public abstract a b(P0 p02);

        /* access modifiers changed from: protected */
        public final a j(P0 p02) {
            C17542s.j(p02, "<this>");
            return p02.O0() ? ACCEPT_NULL : (!(p02 instanceof C18145z) || !(((C18145z) p02).Z0() instanceof C18131o0)) ? p02 instanceof C18131o0 ? UNKNOWN : s.f149074a.a(p02) ? NOT_NULL : UNKNOWN : NOT_NULL;
        }
    }

    /* renamed from: vJ.B$b */
    /* synthetic */ class b extends C17540p implements p<C18096U, C18096U, Boolean> {
        b(Object obj) {
            super(2, obj, C18196B.class, "isStrictSupertype", "isStrictSupertype(Lorg/jetbrains/kotlin/types/KotlinType;Lorg/jetbrains/kotlin/types/KotlinType;)Z", 0);
        }

        /* renamed from: t */
        public final Boolean invoke(C18096U u10, C18096U u11) {
            C17542s.j(u10, "p0");
            C17542s.j(u11, "p1");
            return Boolean.valueOf(((C18196B) this.receiver).g(u10, u11));
        }
    }

    /* renamed from: vJ.B$c */
    /* synthetic */ class c extends C17540p implements p<C18096U, C18096U, Boolean> {
        c(Object obj) {
            super(2, obj, q.class, "equalTypes", "equalTypes(Lorg/jetbrains/kotlin/types/KotlinType;Lorg/jetbrains/kotlin/types/KotlinType;)Z", 0);
        }

        /* renamed from: t */
        public final Boolean invoke(C18096U u10, C18096U u11) {
            C17542s.j(u10, "p0");
            C17542s.j(u11, "p1");
            return Boolean.valueOf(((q) this.receiver).b(u10, u11));
        }
    }

    private C18196B() {
    }

    private final Collection<C18113f0> c(Collection<? extends C18113f0> collection, p<? super C18113f0, ? super C18113f0, Boolean> pVar) {
        ArrayList arrayList = new ArrayList(collection);
        Iterator it = arrayList.iterator();
        C17542s.i(it, "iterator(...)");
        while (it.hasNext()) {
            C18113f0 f0Var = (C18113f0) it.next();
            if (!arrayList.isEmpty()) {
                Iterator it2 = arrayList.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    C18113f0 f0Var2 = (C18113f0) it2.next();
                    if (f0Var2 != f0Var) {
                        C17542s.g(f0Var2);
                        C17542s.g(f0Var);
                        if (pVar.invoke(f0Var2, f0Var).booleanValue()) {
                            it.remove();
                            break;
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    private final C18113f0 e(Set<? extends C18113f0> set) {
        if (set.size() == 1) {
            return (C18113f0) C16877v.a1(set);
        }
        new C18195A(set);
        Collection collection = set;
        Collection<C18113f0> c10 = c(collection, new b(this));
        c10.isEmpty();
        C18113f0 b10 = C17383q.f143511f.b(c10);
        if (b10 != null) {
            return b10;
        }
        Collection<C18113f0> c11 = c(c10, new c(p.f149068b.a()));
        c11.isEmpty();
        return c11.size() < 2 ? (C18113f0) C16877v.a1(c11) : new C18095T(collection).k();
    }

    /* access modifiers changed from: private */
    public static final String f(Set set) {
        return "This collections cannot be empty! input types: " + C16877v.G0(set, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C17642l) null, 63, (Object) null);
    }

    /* access modifiers changed from: private */
    public final boolean g(C18096U u10, C18096U u11) {
        q a10 = p.f149068b.a();
        return a10.d(u10, u11) && !a10.d(u11, u10);
    }

    public final C18113f0 d(List<? extends C18113f0> list) {
        C17542s.j(list, "types");
        list.size();
        ArrayList<P0> arrayList = new ArrayList<>();
        for (C18113f0 f0Var : list) {
            if (f0Var.N0() instanceof C18095T) {
                Collection<C18096U> a10 = f0Var.N0().a();
                C17542s.i(a10, "getSupertypes(...)");
                Iterable<C18096U> iterable = a10;
                ArrayList arrayList2 = new ArrayList(C16877v.y(iterable, 10));
                for (C18096U u10 : iterable) {
                    C17542s.g(u10);
                    C18113f0 d10 = C18090N.d(u10);
                    if (f0Var.O0()) {
                        d10 = d10.U0(true);
                    }
                    arrayList2.add(d10);
                }
                arrayList.addAll(arrayList2);
            } else {
                arrayList.add(f0Var);
            }
        }
        a aVar = a.START;
        for (P0 b10 : arrayList) {
            aVar = aVar.b(b10);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C18113f0 f0Var2 = (C18113f0) it.next();
            if (aVar == a.NOT_NULL) {
                if (f0Var2 instanceof i) {
                    f0Var2 = C18121j0.k((i) f0Var2);
                }
                f0Var2 = C18121j0.i(f0Var2, false, 1, (Object) null);
            }
            linkedHashSet.add(f0Var2);
        }
        Iterable<C18113f0> iterable2 = list;
        ArrayList arrayList3 = new ArrayList(C16877v.y(iterable2, 10));
        for (C18113f0 M02 : iterable2) {
            arrayList3.add(M02.M0());
        }
        Iterator it2 = arrayList3.iterator();
        if (it2.hasNext()) {
            Object next = it2.next();
            while (it2.hasNext()) {
                next = ((u0) next).x((u0) it2.next());
            }
            return e(linkedHashSet).V0((u0) next);
        }
        throw new UnsupportedOperationException("Empty collection can't be reduced.");
    }
}
