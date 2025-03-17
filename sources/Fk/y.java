package fK;

import gK.C17294a;
import jK.B0;
import jK.C0;
import jK.C17469o;
import jK.U0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlinx.serialization.KSerializer;
import mK.C17613f;
import uI.C18055d;
import uI.C18057f;
import uI.C18068q;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\u001a/\u0010\u0006\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u00052\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001aC\u0010\f\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u00050\u000b2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\f\u0010\r\"(\u0010\u0015\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u000e8\u0000X\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u0012\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012\"\"\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000e8\u0002X\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0010\u0012\u0004\b\u0017\u0010\u0014\"\"\u0010\u001d\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u00198\u0002X\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u0012\u0004\b\u001c\u0010\u0014\"\"\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00198\u0002X\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u0012\u0004\b\u001f\u0010\u0014¨\u0006!"}, d2 = {"LuI/d;", "", "clazz", "", "isNullable", "Lkotlinx/serialization/KSerializer;", "m", "(LuI/d;Z)Lkotlinx/serialization/KSerializer;", "", "LuI/q;", "types", "LXH/x;", "n", "(LuI/d;Ljava/util/List;Z)Ljava/lang/Object;", "LjK/U0;", "a", "LjK/U0;", "getSERIALIZERS_CACHE", "()LjK/U0;", "getSERIALIZERS_CACHE$annotations", "()V", "SERIALIZERS_CACHE", "b", "getSERIALIZERS_CACHE_NULLABLE$annotations", "SERIALIZERS_CACHE_NULLABLE", "LjK/B0;", "c", "LjK/B0;", "getPARAMETRIZED_SERIALIZERS_CACHE$annotations", "PARAMETRIZED_SERIALIZERS_CACHE", "d", "getPARAMETRIZED_SERIALIZERS_CACHE_NULLABLE$annotations", "PARAMETRIZED_SERIALIZERS_CACHE_NULLABLE", "kotlinx-serialization-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class y {

    /* renamed from: a  reason: collision with root package name */
    private static final U0<? extends Object> f143278a = C17469o.a(new s());

    /* renamed from: b  reason: collision with root package name */
    private static final U0<Object> f143279b = C17469o.a(new t());

    /* renamed from: c  reason: collision with root package name */
    private static final B0<? extends Object> f143280c = C17469o.b(new u());

    /* renamed from: d  reason: collision with root package name */
    private static final B0<Object> f143281d = C17469o.b(new v());

    /* access modifiers changed from: private */
    public static final KSerializer g(C18055d dVar, List list) {
        C17542s.j(dVar, "clazz");
        C17542s.j(list, "types");
        List<KSerializer<Object>> j10 = z.j(C17613f.a(), list, true);
        C17542s.g(j10);
        return z.a(dVar, j10, new w(list));
    }

    /* access modifiers changed from: private */
    public static final C18057f h(List list) {
        return ((C18068q) list.get(0)).e();
    }

    /* access modifiers changed from: private */
    public static final KSerializer i(C18055d dVar, List list) {
        KSerializer<? extends Object> u10;
        C17542s.j(dVar, "clazz");
        C17542s.j(list, "types");
        List<KSerializer<Object>> j10 = z.j(C17613f.a(), list, true);
        C17542s.g(j10);
        KSerializer<? extends Object> a10 = z.a(dVar, j10, new x(list));
        if (a10 == null || (u10 = C17294a.u(a10)) == null) {
            return null;
        }
        return u10;
    }

    /* access modifiers changed from: private */
    public static final C18057f j(List list) {
        return ((C18068q) list.get(0)).e();
    }

    /* access modifiers changed from: private */
    public static final KSerializer k(C18055d dVar) {
        C17542s.j(dVar, "it");
        KSerializer h10 = z.h(dVar);
        if (h10 != null) {
            return h10;
        }
        if (C0.l(dVar)) {
            return new C17256i(dVar);
        }
        return null;
    }

    /* access modifiers changed from: private */
    public static final KSerializer l(C18055d dVar) {
        KSerializer u10;
        C17542s.j(dVar, "it");
        KSerializer h10 = z.h(dVar);
        if (h10 == null) {
            h10 = C0.l(dVar) ? new C17256i(dVar) : null;
        }
        if (h10 == null || (u10 = C17294a.u(h10)) == null) {
            return null;
        }
        return u10;
    }

    public static final KSerializer<Object> m(C18055d<Object> dVar, boolean z10) {
        C17542s.j(dVar, "clazz");
        if (z10) {
            return f143279b.a(dVar);
        }
        KSerializer<? extends Object> a10 = f143278a.a(dVar);
        if (a10 != null) {
            return a10;
        }
        return null;
    }

    public static final Object n(C18055d<Object> dVar, List<? extends C18068q> list, boolean z10) {
        C17542s.j(dVar, "clazz");
        C17542s.j(list, "types");
        return !z10 ? f143280c.a(dVar, list) : f143281d.a(dVar, list);
    }
}
