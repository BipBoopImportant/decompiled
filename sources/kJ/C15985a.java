package KJ;

import GJ.C15765h;
import KJ.C15990f;
import KJ.C15991g;
import KJ.C15992h;
import LJ.C16028l;
import NJ.C16108c;
import NJ.C16109d;
import OJ.C16167b;
import OJ.C16168c;
import YH.C16870n;
import YH.C16877v;
import java.util.Collection;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000J\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a4\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a4\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\b\u001a4\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\t2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0002¢\u0006\u0004\b\n\u0010\u000b\u001a-\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\u0012\u0010\u0003\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\f\"\u00028\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\u0019\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0019\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\t\"\u0004\b\u0000\u0010\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a%\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0015\"\u0004\b\u0000\u0010\u0013\"\u0004\b\u0001\u0010\u0014¢\u0006\u0004\b\u0016\u0010\u0017\u001a#\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u0019\"\u0004\b\u0000\u0010\u0018*\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u001a\u0010\u001b\u001a#\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0018*\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u001c\u0010\u001d\u001a#\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0018*\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0004\b\u001e\u0010\u001f\u001a#\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000 \"\u0004\b\u0000\u0010\u0018*\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b!\u0010\"\u001a#\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000\t\"\u0004\b\u0000\u0010\u0018*\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b#\u0010$\u001a5\u0010'\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010&\"\u0004\b\u0000\u0010\u0013\"\u0004\b\u0001\u0010\u0014*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010%¢\u0006\u0004\b'\u0010(\u001a5\u0010)\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0015\"\u0004\b\u0000\u0010\u0013\"\u0004\b\u0001\u0010\u0014*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010%¢\u0006\u0004\b)\u0010*¨\u0006+"}, d2 = {"E", "LKJ/f;", "", "elements", "f", "(LKJ/f;Ljava/lang/Iterable;)LKJ/f;", "LGJ/h;", "e", "(LKJ/f;LGJ/h;)LKJ/f;", "LKJ/h;", "g", "(LKJ/h;Ljava/lang/Iterable;)LKJ/h;", "", "b", "([Ljava/lang/Object;)LKJ/f;", "a", "()LKJ/f;", "d", "()LKJ/h;", "K", "V", "LKJ/g;", "c", "()LKJ/g;", "T", "LKJ/c;", "h", "(Ljava/lang/Iterable;)LKJ/c;", "l", "(Ljava/lang/Iterable;)LKJ/f;", "k", "(LGJ/h;)LKJ/f;", "LKJ/e;", "j", "(Ljava/lang/Iterable;)LKJ/e;", "n", "(Ljava/lang/Iterable;)LKJ/h;", "", "LKJ/d;", "i", "(Ljava/util/Map;)LKJ/d;", "m", "(Ljava/util/Map;)LKJ/g;", "kotlinx-collections-immutable"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: KJ.a  reason: case insensitive filesystem */
public final class C15985a {
    public static final <E> C15990f<E> a() {
        return C16028l.b();
    }

    public static final <E> C15990f<E> b(E... eArr) {
        C17542s.j(eArr, "elements");
        return C16028l.b().addAll(C16870n.f(eArr));
    }

    public static final <K, V> C15991g<K, V> c() {
        return C16108c.f136582e.a();
    }

    public static final <E> C15992h<E> d() {
        return C16167b.f136920e.a();
    }

    public static final <E> C15990f<E> e(C15990f<? extends E> fVar, C15765h<? extends E> hVar) {
        C17542s.j(fVar, "<this>");
        C17542s.j(hVar, "elements");
        C15990f.a<? extends E> e10 = fVar.e();
        C16877v.D(e10, hVar);
        return e10.g();
    }

    public static final <E> C15990f<E> f(C15990f<? extends E> fVar, Iterable<? extends E> iterable) {
        C17542s.j(fVar, "<this>");
        C17542s.j(iterable, "elements");
        if (iterable instanceof Collection) {
            return fVar.addAll((Collection) iterable);
        }
        C15990f.a<? extends E> e10 = fVar.e();
        C16877v.E(e10, iterable);
        return e10.g();
    }

    public static final <E> C15992h<E> g(C15992h<? extends E> hVar, Iterable<? extends E> iterable) {
        C17542s.j(hVar, "<this>");
        C17542s.j(iterable, "elements");
        if (iterable instanceof Collection) {
            return hVar.addAll((Collection) iterable);
        }
        C15992h.a<? extends E> e10 = hVar.e();
        C16877v.E(e10, iterable);
        return e10.g();
    }

    public static final <T> C15987c<T> h(Iterable<? extends T> iterable) {
        C17542s.j(iterable, "<this>");
        C15987c<T> cVar = iterable instanceof C15987c ? (C15987c) iterable : null;
        return cVar == null ? l(iterable) : cVar;
    }

    public static final <K, V> C15988d<K, V> i(Map<K, ? extends V> map) {
        C17542s.j(map, "<this>");
        C15991g gVar = null;
        C15988d<K, V> dVar = map instanceof C15988d ? (C15988d) map : null;
        if (dVar != null) {
            return dVar;
        }
        C15991g.a aVar = map instanceof C15991g.a ? (C15991g.a) map : null;
        if (aVar != null) {
            gVar = aVar.g();
        }
        return gVar != null ? gVar : c().putAll(map);
    }

    public static final <T> C15989e<T> j(Iterable<? extends T> iterable) {
        C17542s.j(iterable, "<this>");
        C15992h hVar = null;
        C15989e<T> eVar = iterable instanceof C15989e ? (C15989e) iterable : null;
        if (eVar != null) {
            return eVar;
        }
        C15992h.a aVar = iterable instanceof C15992h.a ? (C15992h.a) iterable : null;
        if (aVar != null) {
            hVar = aVar.g();
        }
        return hVar != null ? hVar : g(d(), iterable);
    }

    public static final <T> C15990f<T> k(C15765h<? extends T> hVar) {
        C17542s.j(hVar, "<this>");
        return e(a(), hVar);
    }

    public static final <T> C15990f<T> l(Iterable<? extends T> iterable) {
        C17542s.j(iterable, "<this>");
        C15990f<T> fVar = null;
        C15990f<T> fVar2 = iterable instanceof C15990f ? (C15990f) iterable : null;
        if (fVar2 != null) {
            return fVar2;
        }
        C15990f.a aVar = iterable instanceof C15990f.a ? (C15990f.a) iterable : null;
        if (aVar != null) {
            fVar = aVar.g();
        }
        return fVar == null ? f(a(), iterable) : fVar;
    }

    public static final <K, V> C15991g<K, V> m(Map<K, ? extends V> map) {
        C17542s.j(map, "<this>");
        C15991g<K, V> gVar = null;
        C16108c cVar = map instanceof C16108c ? (C16108c) map : null;
        if (cVar != null) {
            return cVar;
        }
        C16109d dVar = map instanceof C16109d ? (C16109d) map : null;
        if (dVar != null) {
            gVar = dVar.g();
        }
        return gVar == null ? C16108c.f136582e.a().putAll(map) : gVar;
    }

    public static final <T> C15992h<T> n(Iterable<? extends T> iterable) {
        C17542s.j(iterable, "<this>");
        C15992h<T> hVar = null;
        C16167b bVar = iterable instanceof C16167b ? (C16167b) iterable : null;
        if (bVar != null) {
            return bVar;
        }
        C16168c cVar = iterable instanceof C16168c ? (C16168c) iterable : null;
        if (cVar != null) {
            hVar = cVar.g();
        }
        return hVar == null ? g(C16167b.f136920e.a(), iterable) : hVar;
    }
}
