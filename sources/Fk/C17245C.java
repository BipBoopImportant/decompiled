package fK;

import XH.C16795B;
import XH.C16820k;
import XH.v;
import YH.C16877v;
import gK.C17294a;
import jK.C0;
import jK.C17446c0;
import jK.C17450e0;
import jK.C17451f;
import jK.D0;
import jK.Q0;
import jK.S;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.P;
import kotlinx.serialization.KSerializer;
import mK.C17611d;
import mK.C17613f;
import nI.C17631a;
import uI.C18055d;
import uI.C18057f;
import uI.C18068q;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u001a\u001f\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a!\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002*\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a#\u0010\t\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0002*\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\t\u0010\b\u001a-\u0010\f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0002*\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\r\u001a9\u0010\u0010\u001a\u0012\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0018\u00010\u000e*\u00020\u00062\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00000\u000e2\u0006\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a)\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\b\b\u0000\u0010\u0012*\u00020\u0003*\b\u0012\u0004\u0012\u00028\u00000\u0013H\u0007¢\u0006\u0004\b\u0014\u0010\u0015\u001a+\u0010\u0016\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0002\"\b\b\u0000\u0010\u0012*\u00020\u0003*\b\u0012\u0004\u0012\u00028\u00000\u0013H\u0007¢\u0006\u0004\b\u0016\u0010\u0015\u001aI\u0010\u001b\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0003\u0018\u00010\u0002*\b\u0012\u0004\u0012\u00020\u00030\u00132\u0014\u0010\u0017\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00020\u000e2\u000e\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u0018H\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001a9\u0010\u001d\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0003\u0018\u00010\u0002*\b\u0012\u0004\u0012\u00020\u00030\u00132\u0014\u0010\u0017\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00020\u000eH\u0002¢\u0006\u0004\b\u001d\u0010\u001e\u001aI\u0010\u001f\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0003\u0018\u00010\u0002*\b\u0012\u0004\u0012\u00020\u00030\u00132\u0014\u0010\u0017\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00020\u000e2\u000e\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u0018H\u0002¢\u0006\u0004\b\u001f\u0010\u001c\u001a3\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0002\"\b\b\u0000\u0010\u0012*\u00020\u0003*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010 \u001a\u00020\nH\u0002¢\u0006\u0004\b!\u0010\"¨\u0006#"}, d2 = {"LuI/q;", "type", "Lkotlinx/serialization/KSerializer;", "", "l", "(LuI/q;)Lkotlinx/serialization/KSerializer;", "LmK/d;", "f", "(LmK/d;LuI/q;)Lkotlinx/serialization/KSerializer;", "j", "", "failOnMissingTypeArgSerializer", "h", "(LmK/d;LuI/q;Z)Lkotlinx/serialization/KSerializer;", "", "typeArguments", "m", "(LmK/d;Ljava/util/List;Z)Ljava/util/List;", "T", "LuI/d;", "g", "(LuI/d;)Lkotlinx/serialization/KSerializer;", "k", "serializers", "Lkotlin/Function0;", "LuI/f;", "elementClassifierIfArray", "e", "(LuI/d;Ljava/util/List;LnI/a;)Lkotlinx/serialization/KSerializer;", "c", "(LuI/d;Ljava/util/List;)Lkotlinx/serialization/KSerializer;", "b", "shouldBeNullable", "d", "(Lkotlinx/serialization/KSerializer;Z)Lkotlinx/serialization/KSerializer;", "kotlinx-serialization-core"}, k = 5, mv = {2, 1, 0}, xi = 48, xs = "kotlinx/serialization/SerializersKt")
/* renamed from: fK.C  reason: case insensitive filesystem */
final /* synthetic */ class C17245C {
    private static final KSerializer<? extends Object> b(C18055d<Object> dVar, List<? extends KSerializer<Object>> list, C17631a<? extends C18057f> aVar) {
        if (!C17542s.e(dVar, P.b(Collection.class))) {
            Class<List> cls = List.class;
            if (!C17542s.e(dVar, P.b(cls)) && !C17542s.e(dVar, P.b(cls)) && !C17542s.e(dVar, P.b(ArrayList.class))) {
                if (C17542s.e(dVar, P.b(HashSet.class))) {
                    return new S((KSerializer) list.get(0));
                }
                Class<Set> cls2 = Set.class;
                if (C17542s.e(dVar, P.b(cls2)) || C17542s.e(dVar, P.b(cls2)) || C17542s.e(dVar, P.b(LinkedHashSet.class))) {
                    return new C17450e0((KSerializer) list.get(0));
                }
                if (C17542s.e(dVar, P.b(HashMap.class))) {
                    return new jK.P((KSerializer) list.get(0), (KSerializer) list.get(1));
                }
                Class<Map> cls3 = Map.class;
                if (C17542s.e(dVar, P.b(cls3)) || C17542s.e(dVar, P.b(cls3)) || C17542s.e(dVar, P.b(LinkedHashMap.class))) {
                    return new C17446c0((KSerializer) list.get(0), (KSerializer) list.get(1));
                }
                if (C17542s.e(dVar, P.b(Map.Entry.class))) {
                    return C17294a.j((KSerializer) list.get(0), (KSerializer) list.get(1));
                }
                if (C17542s.e(dVar, P.b(v.class))) {
                    return C17294a.m((KSerializer) list.get(0), (KSerializer) list.get(1));
                }
                if (C17542s.e(dVar, P.b(C16795B.class))) {
                    return C17294a.p((KSerializer) list.get(0), (KSerializer) list.get(1), (KSerializer) list.get(2));
                }
                if (!C0.o(dVar)) {
                    return null;
                }
                Object invoke = aVar.invoke();
                C17542s.h(invoke, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
                return C17294a.a((C18055d) invoke, (KSerializer) list.get(0));
            }
        }
        return new C17451f((KSerializer) list.get(0));
    }

    private static final KSerializer<? extends Object> c(C18055d<Object> dVar, List<? extends KSerializer<Object>> list) {
        KSerializer[] kSerializerArr = (KSerializer[]) list.toArray(new KSerializer[0]);
        return C0.d(dVar, (KSerializer[]) Arrays.copyOf(kSerializerArr, kSerializerArr.length));
    }

    private static final <T> KSerializer<T> d(KSerializer<T> kSerializer, boolean z10) {
        if (z10) {
            return C17294a.u(kSerializer);
        }
        C17542s.h(kSerializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.SerializersKt__SerializersKt.nullable?>");
        return kSerializer;
    }

    public static final KSerializer<? extends Object> e(C18055d<Object> dVar, List<? extends KSerializer<Object>> list, C17631a<? extends C18057f> aVar) {
        C17542s.j(dVar, "<this>");
        C17542s.j(list, "serializers");
        C17542s.j(aVar, "elementClassifierIfArray");
        KSerializer<? extends Object> b10 = b(dVar, list, aVar);
        return b10 == null ? c(dVar, list) : b10;
    }

    public static final KSerializer<Object> f(C17611d dVar, C18068q qVar) {
        C17542s.j(dVar, "<this>");
        C17542s.j(qVar, "type");
        KSerializer<Object> h10 = h(dVar, qVar, true);
        if (h10 != null) {
            return h10;
        }
        C0.p(D0.c(qVar));
        throw new C16820k();
    }

    public static final <T> KSerializer<T> g(C18055d<T> dVar) {
        C17542s.j(dVar, "<this>");
        KSerializer<T> h10 = z.h(dVar);
        if (h10 != null) {
            return h10;
        }
        D0.f(dVar);
        throw new C16820k();
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0062 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final kotlinx.serialization.KSerializer<java.lang.Object> h(mK.C17611d r6, uI.C18068q r7, boolean r8) {
        /*
            uI.d r0 = jK.D0.c(r7)
            boolean r1 = r7.k()
            java.util.List r7 = r7.i()
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 10
            int r3 = YH.C16877v.y(r7, r3)
            r2.<init>(r3)
            java.util.Iterator r7 = r7.iterator()
        L_0x001d:
            boolean r3 = r7.hasNext()
            if (r3 == 0) goto L_0x0031
            java.lang.Object r3 = r7.next()
            uI.s r3 = (uI.C18070s) r3
            uI.q r3 = jK.D0.g(r3)
            r2.add(r3)
            goto L_0x001d
        L_0x0031:
            boolean r7 = r2.isEmpty()
            r3 = 2
            r4 = 0
            if (r7 == 0) goto L_0x004c
            boolean r7 = jK.C0.l(r0)
            if (r7 == 0) goto L_0x0047
            kotlinx.serialization.KSerializer r7 = mK.C17611d.c(r6, r0, r4, r3, r4)
            if (r7 == 0) goto L_0x0047
        L_0x0045:
            r7 = r4
            goto L_0x0060
        L_0x0047:
            kotlinx.serialization.KSerializer r7 = fK.y.m(r0, r1)
            goto L_0x0060
        L_0x004c:
            boolean r7 = r6.d()
            if (r7 == 0) goto L_0x0053
            goto L_0x0045
        L_0x0053:
            java.lang.Object r7 = fK.y.n(r0, r2, r1)
            boolean r5 = XH.x.g(r7)
            if (r5 == 0) goto L_0x005e
            r7 = r4
        L_0x005e:
            kotlinx.serialization.KSerializer r7 = (kotlinx.serialization.KSerializer) r7
        L_0x0060:
            if (r7 == 0) goto L_0x0063
            return r7
        L_0x0063:
            boolean r7 = r2.isEmpty()
            if (r7 == 0) goto L_0x0084
            kotlinx.serialization.KSerializer r7 = fK.z.h(r0)
            if (r7 != 0) goto L_0x00a9
            kotlinx.serialization.KSerializer r7 = mK.C17611d.c(r6, r0, r4, r3, r4)
            if (r7 != 0) goto L_0x00a9
            boolean r6 = jK.C0.l(r0)
            if (r6 == 0) goto L_0x0082
            fK.i r6 = new fK.i
            r6.<init>(r0)
        L_0x0080:
            r7 = r6
            goto L_0x00a9
        L_0x0082:
            r7 = r4
            goto L_0x00a9
        L_0x0084:
            java.util.List r7 = fK.z.j(r6, r2, r8)
            if (r7 != 0) goto L_0x008b
            return r4
        L_0x008b:
            fK.B r8 = new fK.B
            r8.<init>(r2)
            kotlinx.serialization.KSerializer r8 = fK.z.a(r0, r7, r8)
            if (r8 != 0) goto L_0x00a8
            kotlinx.serialization.KSerializer r7 = r6.b(r0, r7)
            if (r7 != 0) goto L_0x00a9
            boolean r6 = jK.C0.l(r0)
            if (r6 == 0) goto L_0x0082
            fK.i r6 = new fK.i
            r6.<init>(r0)
            goto L_0x0080
        L_0x00a8:
            r7 = r8
        L_0x00a9:
            if (r7 == 0) goto L_0x00af
            kotlinx.serialization.KSerializer r4 = d(r7, r1)
        L_0x00af:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: fK.C17245C.h(mK.d, uI.q, boolean):kotlinx.serialization.KSerializer");
    }

    /* access modifiers changed from: private */
    public static final C18057f i(List list) {
        return ((C18068q) list.get(0)).e();
    }

    public static final KSerializer<Object> j(C17611d dVar, C18068q qVar) {
        C17542s.j(dVar, "<this>");
        C17542s.j(qVar, "type");
        return h(dVar, qVar, false);
    }

    public static final <T> KSerializer<T> k(C18055d<T> dVar) {
        C17542s.j(dVar, "<this>");
        KSerializer<T> b10 = C0.b(dVar);
        return b10 == null ? Q0.b(dVar) : b10;
    }

    public static final KSerializer<Object> l(C18068q qVar) {
        C17542s.j(qVar, "type");
        return z.g(C17613f.a(), qVar);
    }

    public static final List<KSerializer<Object>> m(C17611d dVar, List<? extends C18068q> list, boolean z10) {
        ArrayList arrayList;
        C17542s.j(dVar, "<this>");
        C17542s.j(list, "typeArguments");
        if (z10) {
            Iterable<C18068q> iterable = list;
            arrayList = new ArrayList(C16877v.y(iterable, 10));
            for (C18068q d10 : iterable) {
                arrayList.add(z.d(dVar, d10));
            }
        } else {
            Iterable<C18068q> iterable2 = list;
            arrayList = new ArrayList(C16877v.y(iterable2, 10));
            for (C18068q g10 : iterable2) {
                KSerializer<Object> g11 = z.g(dVar, g10);
                if (g11 == null) {
                    return null;
                }
                arrayList.add(g11);
            }
        }
        return arrayList;
    }
}
