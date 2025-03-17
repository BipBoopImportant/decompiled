package uJ;

import AI.C15429j;
import DI.C15561h;
import DI.C15562i;
import DI.C15566m;
import DI.C15579z;
import DI.n0;
import YH.C16877v;
import java.util.ArrayList;
import java.util.List;
import kJ.C17506e;
import kotlin.jvm.internal.C17542s;

/* renamed from: uJ.n0  reason: case insensitive filesystem */
public final class C18129n0 {

    /* renamed from: uJ.n0$a */
    public static final class a extends z0 {

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ List<y0> f147906d;

        a(List<? extends y0> list) {
            this.f147906d = list;
        }

        public E0 k(y0 y0Var) {
            C17542s.j(y0Var, "key");
            if (!this.f147906d.contains(y0Var)) {
                return null;
            }
            C15561h e10 = y0Var.e();
            C17542s.h(e10, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.TypeParameterDescriptor");
            return M0.s((n0) e10);
        }
    }

    private static final C18096U a(List<? extends y0> list, List<? extends C18096U> list2, C15429j jVar) {
        C18096U p10 = J0.g(new a(list)).p((C18096U) C16877v.w0(list2), Q0.OUT_VARIANCE);
        if (p10 != null) {
            return p10;
        }
        C18113f0 z10 = jVar.z();
        C17542s.i(z10, "getDefaultBound(...)");
        return z10;
    }

    public static final C18096U b(n0 n0Var) {
        C17542s.j(n0Var, "<this>");
        C15566m b10 = n0Var.b();
        C17542s.i(b10, "getContainingDeclaration(...)");
        if (b10 instanceof C15562i) {
            List<n0> parameters = ((C15562i) b10).k().getParameters();
            C17542s.i(parameters, "getParameters(...)");
            Iterable<n0> iterable = parameters;
            ArrayList arrayList = new ArrayList(C16877v.y(iterable, 10));
            for (n0 k10 : iterable) {
                y0 k11 = k10.k();
                C17542s.i(k11, "getTypeConstructor(...)");
                arrayList.add(k11);
            }
            List<C18096U> upperBounds = n0Var.getUpperBounds();
            C17542s.i(upperBounds, "getUpperBounds(...)");
            return a(arrayList, upperBounds, C17506e.m(n0Var));
        } else if (b10 instanceof C15579z) {
            List<n0> typeParameters = ((C15579z) b10).getTypeParameters();
            C17542s.i(typeParameters, "getTypeParameters(...)");
            Iterable<n0> iterable2 = typeParameters;
            ArrayList arrayList2 = new ArrayList(C16877v.y(iterable2, 10));
            for (n0 k12 : iterable2) {
                y0 k13 = k12.k();
                C17542s.i(k13, "getTypeConstructor(...)");
                arrayList2.add(k13);
            }
            List<C18096U> upperBounds2 = n0Var.getUpperBounds();
            C17542s.i(upperBounds2, "getUpperBounds(...)");
            return a(arrayList2, upperBounds2, C17506e.m(n0Var));
        } else {
            throw new IllegalArgumentException("Unsupported descriptor type to build star projection type based on type parameters of it");
        }
    }
}
