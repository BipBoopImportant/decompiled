package androidx.compose.ui.platform;

import E1.C4492z;
import G1.G;
import L1.a;
import L1.i;
import L1.k;
import L1.l;
import L1.m;
import L1.p;
import L1.r;
import L1.s;
import N1.P;
import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.graphics.Region;
import android.view.View;
import androidx.compose.ui.viewinterop.AndroidViewHolder;
import j0.C5459o;
import j0.C5460p;
import j0.E;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import nI.C17642l;
import o1.C5669i;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a#\u0010\f\u001a\u0004\u0018\u00010\t*\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\f\u0010\r\u001a\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u000f*\u00020\u000eH\u0000ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0013\u0010\u0014\u001a\u00020\u0013*\u00020\u0012H\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u001d\u0010\u0018\u001a\u0004\u0018\u00010\u0017*\u00020\u00162\u0006\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u0019\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b*\u00020\u001aH\u0000¢\u0006\u0004\b\u001d\u0010\u001e\"\u001a\u0010#\u001a\u00020\u001f8\u0000X\u0004¢\u0006\f\n\u0004\b\f\u0010 \u001a\u0004\b!\u0010\"\"\u0018\u0010%\u001a\u00020\u0013*\u00020\u00128@X\u0004¢\u0006\u0006\u001a\u0004\b$\u0010\u0015\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006&"}, d2 = {"LL1/l;", "configuration", "LN1/P;", "e", "(LL1/l;)LN1/P;", "", "d", "(LL1/l;)Ljava/lang/Float;", "", "Landroidx/compose/ui/platform/e1;", "", "id", "a", "(Ljava/util/List;I)Landroidx/compose/ui/platform/e1;", "LL1/i;", "", "i", "(I)Ljava/lang/String;", "LL1/p;", "", "f", "(LL1/p;)Z", "Landroidx/compose/ui/platform/AndroidViewsHandler;", "Landroid/view/View;", "h", "(Landroidx/compose/ui/platform/AndroidViewsHandler;I)Landroid/view/View;", "LL1/r;", "Lj0/o;", "Landroidx/compose/ui/platform/g1;", "b", "(LL1/r;)Lj0/o;", "Lo1/i;", "Lo1/i;", "getDefaultFakeNodeBounds", "()Lo1/i;", "DefaultFakeNodeBounds", "g", "isVisible", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.compose.ui.platform.h1  reason: case insensitive filesystem */
public final class C5107h1 {

    /* renamed from: a  reason: collision with root package name */
    private static final C5669i f19505a = new C5669i(0.0f, 0.0f, 10.0f, 10.0f);

    public static final C5098e1 a(List<C5098e1> list, int i10) {
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            if (list.get(i11).d() == i10) {
                return list.get(i11);
            }
        }
        return null;
    }

    public static final C5459o<C5104g1> b(r rVar) {
        p a10 = rVar.a();
        E b10 = C5460p.b();
        if (a10.q().p() && a10.q().c()) {
            C5669i i10 = a10.i();
            c(new Region(Math.round(i10.o()), Math.round(i10.r()), Math.round(i10.p()), Math.round(i10.j())), a10, b10, a10, new Region());
        }
        return b10;
    }

    private static final void c(Region region, p pVar, E<C5104g1> e10, p pVar2, Region region2) {
        C4492z p10;
        boolean z10 = !pVar2.q().p() || !pVar2.q().c();
        if (region.isEmpty() && pVar2.o() != pVar.o()) {
            return;
        }
        if (!z10 || pVar2.x()) {
            C5669i v10 = pVar2.v();
            int round = Math.round(v10.o());
            int round2 = Math.round(v10.r());
            int round3 = Math.round(v10.p());
            int round4 = Math.round(v10.j());
            region2.set(round, round2, round3, round4);
            int o10 = pVar2.o() == pVar.o() ? -1 : pVar2.o();
            if (region2.op(region, Region.Op.INTERSECT)) {
                e10.t(o10, new C5104g1(pVar2, region2.getBounds()));
                List<p> t10 = pVar2.t();
                for (int size = t10.size() - 1; -1 < size; size--) {
                    c(region, pVar, e10, t10.get(size), region2);
                }
                if (f(pVar2)) {
                    region.op(round, round2, round3, round4, Region.Op.DIFFERENCE);
                }
            } else if (pVar2.x()) {
                p r10 = pVar2.r();
                C5669i i10 = (r10 == null || (p10 = r10.p()) == null || !p10.p()) ? f19505a : r10.i();
                e10.t(o10, new C5104g1(pVar2, new Rect(Math.round(i10.o()), Math.round(i10.r()), Math.round(i10.p()), Math.round(i10.j()))));
            } else if (o10 == -1) {
                e10.t(o10, new C5104g1(pVar2, region2.getBounds()));
            }
        }
    }

    @SuppressLint({"PrimitiveInCollection"})
    public static final Float d(l lVar) {
        C17642l lVar2;
        ArrayList arrayList = new ArrayList();
        a aVar = (a) m.a(lVar, k.f8953a.h());
        if (aVar == null || (lVar2 = (C17642l) aVar.a()) == null || !((Boolean) lVar2.invoke(arrayList)).booleanValue()) {
            return null;
        }
        return (Float) arrayList.get(0);
    }

    public static final P e(l lVar) {
        C17642l lVar2;
        ArrayList arrayList = new ArrayList();
        a aVar = (a) m.a(lVar, k.f8953a.i());
        if (aVar == null || (lVar2 = (C17642l) aVar.a()) == null || !((Boolean) lVar2.invoke(arrayList)).booleanValue()) {
            return null;
        }
        return (P) arrayList.get(0);
    }

    public static final boolean f(p pVar) {
        return g(pVar) && (pVar.w().A() || pVar.w().m());
    }

    public static final boolean g(p pVar) {
        return !pVar.z() && !pVar.w().k(s.f9010a.n());
    }

    public static final View h(AndroidViewsHandler androidViewsHandler, int i10) {
        Object obj;
        Iterator it = androidViewsHandler.getLayoutNodeToHolder().entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((G) ((Map.Entry) obj).getKey()).q() == i10) {
                break;
            }
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry != null) {
            return (AndroidViewHolder) entry.getValue();
        }
        return null;
    }

    public static final String i(int i10) {
        i.a aVar = i.f8936b;
        if (i.k(i10, aVar.a())) {
            return "android.widget.Button";
        }
        if (i.k(i10, aVar.b())) {
            return "android.widget.CheckBox";
        }
        if (i.k(i10, aVar.e())) {
            return "android.widget.RadioButton";
        }
        if (i.k(i10, aVar.d())) {
            return "android.widget.ImageView";
        }
        if (i.k(i10, aVar.c())) {
            return "android.widget.Spinner";
        }
        return null;
    }
}
