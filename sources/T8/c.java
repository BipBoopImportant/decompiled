package t8;

import E1.C4488v;
import E1.C4489w;
import E1.C4492z;
import E1.N;
import G1.C4494a0;
import G1.C4502e0;
import G1.C4508k;
import G1.C4510m;
import G1.G;
import G1.V;
import G1.w0;
import L1.p;
import L1.q;
import XH.C16824o;
import XH.C16825p;
import YH.C16877v;
import androidx.compose.ui.d;
import bI.C17035a;
import c2.s;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import m8.C8563d;
import nI.C17631a;
import o1.C5669i;
import o1.C5670j;

public final class c implements C8563d {

    /* renamed from: a  reason: collision with root package name */
    public final G f56662a;

    /* renamed from: b  reason: collision with root package name */
    public final C16824o f56663b = C16825p.b(new a(this));

    /* renamed from: c  reason: collision with root package name */
    public final G f56664c;

    public static final class a extends C17544u implements C17631a<p> {

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ c f56665c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(c cVar) {
            super(0);
            this.f56665c = cVar;
        }

        public final Object invoke() {
            d.c cVar;
            C4494a0 m02 = this.f56665c.f56662a.m0();
            int a10 = C4502e0.a(8);
            if ((m02.i() & a10) != 0) {
                d.c k10 = m02.k();
                loop0:
                while (true) {
                    if (k10 != null) {
                        if ((k10.e2() & a10) != 0) {
                            cVar = k10;
                            W0.b bVar = null;
                            while (true) {
                                if (cVar == null) {
                                    break;
                                } else if (cVar instanceof w0) {
                                    break loop0;
                                } else {
                                    if ((cVar.e2() & a10) != 0 && (cVar instanceof C4510m)) {
                                        int i10 = 0;
                                        for (d.c D22 = ((C4510m) cVar).D2(); D22 != null; D22 = D22.a2()) {
                                            if ((D22.e2() & a10) != 0) {
                                                i10++;
                                                if (i10 == 1) {
                                                    cVar = D22;
                                                } else {
                                                    if (bVar == null) {
                                                        bVar = new W0.b(new d.c[16], 0);
                                                    }
                                                    if (cVar != null) {
                                                        bVar.b(cVar);
                                                        cVar = null;
                                                    }
                                                    bVar.b(D22);
                                                }
                                            }
                                        }
                                        if (i10 == 1) {
                                        }
                                    }
                                    cVar = C4508k.g(bVar);
                                }
                            }
                        }
                        if ((k10.Z1() & a10) == 0) {
                            break;
                        }
                        k10 = k10.a2();
                    } else {
                        break;
                    }
                }
            }
            cVar = null;
            w0 w0Var = (w0) cVar;
            if ((w0Var != null ? w0Var.E0() : null) != null) {
                return q.a(this.f56665c.f56662a, false);
            }
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "kotlin.jvm.PlatformType", "a", "b", "", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class b<T> implements Comparator {
        public final int compare(T t10, T t11) {
            return C17035a.e(Float.valueOf(((C8563d) t10).getBounds().r()), Float.valueOf(((C8563d) t11).getBounds().r()));
        }
    }

    public c(G g10) {
        C17542s.j(g10, "node");
        this.f56662a = g10;
        this.f56664c = g10;
    }

    public static Float f(V v10, String str) {
        try {
            Field declaredField = v10.getClass().getDeclaredField(str);
            declaredField.setAccessible(true);
            return Float.valueOf(declaredField.getFloat(v10));
        } catch (IllegalAccessException | IllegalArgumentException | NoSuchFieldException unused) {
            return null;
        }
    }

    public final float a() {
        Float f10;
        float f11 = 1.0f;
        for (N b10 : this.f56662a.r()) {
            d b11 = b10.b();
            if ((b11 instanceof V) && (f10 = f((V) b11, "alpha")) != null) {
                f11 *= f10.floatValue();
            }
        }
        return f11;
    }

    public final C4492z b() {
        return this.f56664c;
    }

    public final p c() {
        return (p) this.f56663b.getValue();
    }

    public final float d() {
        Float f10;
        float f11 = 0.0f;
        for (N b10 : this.f56662a.r()) {
            d b11 = b10.b();
            if ((b11 instanceof V) && (f10 = f((V) b11, "zIndex")) != null) {
                f11 = f10.floatValue();
            }
        }
        return f11;
    }

    public final List<C8563d> e() {
        List<G> K10 = this.f56662a.K();
        ArrayList<G> arrayList = new ArrayList<>();
        for (T next : K10) {
            if (((G) next).p()) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(C16877v.y(arrayList, 10));
        for (G a10 : arrayList) {
            arrayList2.add(b.a(a10));
        }
        return C16877v.g1(arrayList2, new b());
    }

    public final C5669i getBounds() {
        C4488v vVar;
        N n10 = (N) C16877v.y0(this.f56662a.r());
        if (n10 == null || (vVar = n10.a()) == null) {
            vVar = this.f56662a.s();
        }
        return C5670j.c(C4489w.g(vVar), s.d(vVar.a()));
    }

    public final boolean isVisible() {
        return !getBounds().x();
    }
}
