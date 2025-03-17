package HH;

import OH.C16158a;
import YH.C16870n;
import YH.C16877v;
import fK.z;
import gK.C17294a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.P;
import kotlin.jvm.internal.V;
import kotlinx.serialization.KSerializer;
import mK.C17611d;
import uI.C18068q;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0010\u001e\n\u0002\b\u0003\u001a\u001f\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a/\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0003\"\b\b\u0000\u0010\u0007*\u00020\u0006*\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\b\u0010\t\u001a'\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000b\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\f\u0010\r\u001a#\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u0003*\u0006\u0012\u0002\b\u00030\u000e2\u0006\u0010\u000b\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"LmK/d;", "LOH/a;", "typeInfo", "Lkotlinx/serialization/KSerializer;", "d", "(LmK/d;LOH/a;)Lkotlinx/serialization/KSerializer;", "", "T", "c", "(Lkotlinx/serialization/KSerializer;LOH/a;)Lkotlinx/serialization/KSerializer;", "value", "module", "b", "(Ljava/lang/Object;LmK/d;)Lkotlinx/serialization/KSerializer;", "", "a", "(Ljava/util/Collection;LmK/d;)Lkotlinx/serialization/KSerializer;", "ktor-serialization-kotlinx"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: HH.g  reason: case insensitive filesystem */
public final class C15816g {
    private static final KSerializer<?> a(Collection<?> collection, C17611d dVar) {
        Iterable<Object> iterable = collection;
        Iterable<Object> t02 = C16877v.t0(iterable);
        ArrayList arrayList = new ArrayList(C16877v.y(t02, 10));
        for (Object b10 : t02) {
            arrayList.add(b(b10, dVar));
        }
        HashSet hashSet = new HashSet();
        ArrayList<KSerializer> arrayList2 = new ArrayList<>();
        for (Object next : arrayList) {
            if (hashSet.add(((KSerializer) next).getDescriptor().i())) {
                arrayList2.add(next);
            }
        }
        if (arrayList2.size() > 1) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Serializing collections of different element types is not yet supported. Selected serializers: ");
            ArrayList arrayList3 = new ArrayList(C16877v.y(arrayList2, 10));
            for (KSerializer descriptor : arrayList2) {
                arrayList3.add(descriptor.getDescriptor().i());
            }
            sb2.append(arrayList3);
            throw new IllegalStateException(sb2.toString().toString());
        }
        KSerializer<String> kSerializer = (KSerializer) C16877v.d1(arrayList2);
        if (kSerializer == null) {
            kSerializer = C17294a.K(V.f144353a);
        }
        if (kSerializer.getDescriptor().b()) {
            return kSerializer;
        }
        C17542s.h(kSerializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
        if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
            for (Object obj : iterable) {
                if (obj == null) {
                    return C17294a.u(kSerializer);
                }
            }
        }
        return kSerializer;
    }

    public static final KSerializer<Object> b(Object obj, C17611d dVar) {
        KSerializer<Object> kSerializer;
        C17542s.j(dVar, "module");
        if (obj == null) {
            kSerializer = C17294a.u(C17294a.K(V.f144353a));
        } else if (obj instanceof List) {
            kSerializer = C17294a.h(a((Collection) obj, dVar));
        } else if (obj instanceof Object[]) {
            Object h02 = C16870n.h0((Object[]) obj);
            if (h02 == null || (kSerializer = b(h02, dVar)) == null) {
                kSerializer = C17294a.h(C17294a.K(V.f144353a));
            }
        } else if (obj instanceof Set) {
            kSerializer = C17294a.n(a((Collection) obj, dVar));
        } else if (obj instanceof Map) {
            Map map = (Map) obj;
            kSerializer = C17294a.k(a(map.keySet(), dVar), a(map.values(), dVar));
        } else {
            KSerializer<Object> c10 = C17611d.c(dVar, P.b(obj.getClass()), (List) null, 2, (Object) null);
            kSerializer = c10 == null ? z.e(P.b(obj.getClass())) : c10;
        }
        C17542s.h(kSerializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
        return kSerializer;
    }

    private static final <T> KSerializer<?> c(KSerializer<T> kSerializer, C16158a aVar) {
        C18068q a10 = aVar.a();
        return (a10 == null || !a10.k()) ? kSerializer : C17294a.u(kSerializer);
    }

    public static final KSerializer<?> d(C17611d dVar, C16158a aVar) {
        C17542s.j(dVar, "<this>");
        C17542s.j(aVar, "typeInfo");
        C18068q a10 = aVar.a();
        if (a10 != null) {
            KSerializer<Object> g10 = a10.i().isEmpty() ? null : z.g(dVar, a10);
            if (g10 != null) {
                return g10;
            }
        }
        KSerializer c10 = C17611d.c(dVar, aVar.b(), (List) null, 2, (Object) null);
        return c10 != null ? c(c10, aVar) : c(z.e(aVar.b()), aVar);
    }
}
