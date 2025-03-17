package uJ;

import DI.C15561h;
import DI.n0;
import java.util.List;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: uJ.O  reason: case insensitive filesystem */
public final class C18091O extends H0 {

    /* renamed from: c  reason: collision with root package name */
    private final n0[] f147838c;

    /* renamed from: d  reason: collision with root package name */
    private final E0[] f147839d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f147840e;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C18091O(n0[] n0VarArr, E0[] e0Arr, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(n0VarArr, e0Arr, (i10 & 4) != 0 ? false : z10);
    }

    public boolean b() {
        return this.f147840e;
    }

    public E0 e(C18096U u10) {
        C17542s.j(u10, "key");
        C15561h e10 = u10.N0().e();
        n0 n0Var = e10 instanceof n0 ? (n0) e10 : null;
        if (n0Var == null) {
            return null;
        }
        int index = n0Var.getIndex();
        n0[] n0VarArr = this.f147838c;
        if (index >= n0VarArr.length || !C17542s.e(n0VarArr[index].k(), n0Var.k())) {
            return null;
        }
        return this.f147839d[index];
    }

    public boolean f() {
        return this.f147839d.length == 0;
    }

    public final E0[] i() {
        return this.f147839d;
    }

    public final n0[] j() {
        return this.f147838c;
    }

    public C18091O(n0[] n0VarArr, E0[] e0Arr, boolean z10) {
        C17542s.j(n0VarArr, "parameters");
        C17542s.j(e0Arr, "arguments");
        this.f147838c = n0VarArr;
        this.f147839d = e0Arr;
        this.f147840e = z10;
        int length = n0VarArr.length;
        int length2 = e0Arr.length;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C18091O(List<? extends n0> list, List<? extends E0> list2) {
        this((n0[]) list.toArray(new n0[0]), (E0[]) list2.toArray(new E0[0]), false, 4, (DefaultConstructorMarker) null);
        C17542s.j(list, "parameters");
        C17542s.j(list2, "argumentsList");
    }
}
