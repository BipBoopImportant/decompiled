package vI;

import DI.C15561h;
import DI.n0;
import XH.t;
import YH.C16877v;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17631a;
import uI.C18057f;
import uI.C18068q;
import uI.C18070s;
import uI.C18071t;
import uJ.C18096U;
import uJ.C18099X;
import uJ.C18113f0;
import uJ.C18127m0;
import uJ.G0;
import uJ.Q0;
import uJ.u0;
import uJ.y0;
import vJ.g;
import xI.U0;
import xI.Y;
import xI.Y0;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u001a=\u0010\t\u001a\u00020\b*\u00020\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001H\u0007¢\u0006\u0004\b\t\u0010\n\u001a5\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0010\u0010\u0011\"\u001e\u0010\u0016\u001a\u00020\b*\u00020\u00008FX\u0004¢\u0006\f\u0012\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, d2 = {"LuI/f;", "", "LuI/s;", "arguments", "", "nullable", "", "annotations", "LuI/q;", "b", "(LuI/f;Ljava/util/List;ZLjava/util/List;)LuI/q;", "LuJ/u0;", "attributes", "LuJ/y0;", "typeConstructor", "LuJ/f0;", "a", "(LuJ/u0;LuJ/y0;Ljava/util/List;Z)LuJ/f0;", "d", "(LuI/f;)LuI/q;", "getStarProjectedType$annotations", "(LuI/f;)V", "starProjectedType", "kotlin-reflection"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: vI.f  reason: case insensitive filesystem */
public final class C18193f {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: vI.f$a */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f149041a;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                uI.t[] r0 = uI.C18071t.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                uI.t r1 = uI.C18071t.INVARIANT     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                uI.t r1 = uI.C18071t.IN     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                uI.t r1 = uI.C18071t.OUT     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f149041a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: vI.C18193f.a.<clinit>():void");
        }
    }

    private static final C18113f0 a(u0 u0Var, y0 y0Var, List<C18070s> list, boolean z10) {
        Object obj;
        List<n0> parameters = y0Var.getParameters();
        C17542s.i(parameters, "getParameters(...)");
        Iterable iterable = list;
        ArrayList arrayList = new ArrayList(C16877v.y(iterable, 10));
        int i10 = 0;
        for (Object next : iterable) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                C16877v.x();
            }
            C18070s sVar = (C18070s) next;
            U0 u02 = (U0) sVar.c();
            C18096U F10 = u02 != null ? u02.F() : null;
            C18071t d10 = sVar.d();
            int i12 = d10 == null ? -1 : a.f149041a[d10.ordinal()];
            if (i12 == -1) {
                n0 n0Var = parameters.get(i10);
                C17542s.i(n0Var, "get(...)");
                obj = new C18127m0(n0Var);
            } else if (i12 == 1) {
                Q0 q02 = Q0.INVARIANT;
                C17542s.g(F10);
                obj = new G0(q02, F10);
            } else if (i12 == 2) {
                Q0 q03 = Q0.IN_VARIANCE;
                C17542s.g(F10);
                obj = new G0(q03, F10);
            } else if (i12 == 3) {
                Q0 q04 = Q0.OUT_VARIANCE;
                C17542s.g(F10);
                obj = new G0(q04, F10);
            } else {
                throw new t();
            }
            arrayList.add(obj);
            i10 = i11;
        }
        return C18099X.k(u0Var, y0Var, arrayList, z10, (g) null, 16, (Object) null);
    }

    public static final C18068q b(C18057f fVar, List<C18070s> list, boolean z10, List<? extends Annotation> list2) {
        C15561h descriptor;
        C17542s.j(fVar, "<this>");
        C17542s.j(list, "arguments");
        C17542s.j(list2, "annotations");
        Y y10 = fVar instanceof Y ? (Y) fVar : null;
        if (y10 == null || (descriptor = y10.getDescriptor()) == null) {
            throw new Y0("Cannot create type for an unsupported classifier: " + fVar + " (" + fVar.getClass() + ')');
        }
        y0 k10 = descriptor.k();
        C17542s.i(k10, "getTypeConstructor(...)");
        List<n0> parameters = k10.getParameters();
        C17542s.i(parameters, "getParameters(...)");
        if (parameters.size() == list.size()) {
            return new U0(a(list2.isEmpty() ? u0.f147932b.k() : u0.f147932b.k(), k10, list, z10), (C17631a) null, 2, (DefaultConstructorMarker) null);
        }
        throw new IllegalArgumentException("Class declares " + parameters.size() + " type parameters, but " + list.size() + " were provided.");
    }

    public static /* synthetic */ C18068q c(C18057f fVar, List list, boolean z10, List list2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = C16877v.n();
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        if ((i10 & 4) != 0) {
            list2 = C16877v.n();
        }
        return b(fVar, list, z10, list2);
    }

    public static final C18068q d(C18057f fVar) {
        C15561h descriptor;
        C17542s.j(fVar, "<this>");
        Y y10 = fVar instanceof Y ? (Y) fVar : null;
        if (y10 == null || (descriptor = y10.getDescriptor()) == null) {
            return c(fVar, (List) null, false, (List) null, 7, (Object) null);
        }
        List<n0> parameters = descriptor.k().getParameters();
        C17542s.i(parameters, "getParameters(...)");
        if (parameters.isEmpty()) {
            return c(fVar, (List) null, false, (List) null, 7, (Object) null);
        }
        Iterable<n0> iterable = parameters;
        ArrayList arrayList = new ArrayList(C16877v.y(iterable, 10));
        for (n0 n0Var : iterable) {
            arrayList.add(C18070s.f147781c.c());
        }
        return c(fVar, arrayList, false, (List) null, 6, (Object) null);
    }
}
