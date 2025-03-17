package androidx.transition;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.C5187o;
import androidx.fragment.app.U;
import androidx.transition.C7026l;
import java.util.ArrayList;
import java.util.List;

public class FragmentTransitionSupport extends U {

    class a extends C7026l.e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Rect f44589a;

        a(Rect rect) {
            this.f44589a = rect;
        }

        public Rect a(C7026l lVar) {
            return this.f44589a;
        }
    }

    class b implements C7026l.h {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f44591a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ArrayList f44592b;

        b(View view, ArrayList arrayList) {
            this.f44591a = view;
            this.f44592b = arrayList;
        }

        public void d(C7026l lVar) {
        }

        public void e(C7026l lVar) {
            lVar.k0(this);
            lVar.c(this);
        }

        public void g(C7026l lVar) {
        }

        public void j(C7026l lVar) {
            lVar.k0(this);
            this.f44591a.setVisibility(8);
            int size = this.f44592b.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((View) this.f44592b.get(i10)).setVisibility(0);
            }
        }

        public void l(C7026l lVar) {
        }
    }

    class c extends s {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Object f44594a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ArrayList f44595b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Object f44596c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ArrayList f44597d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Object f44598e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ ArrayList f44599f;

        c(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            this.f44594a = obj;
            this.f44595b = arrayList;
            this.f44596c = obj2;
            this.f44597d = arrayList2;
            this.f44598e = obj3;
            this.f44599f = arrayList3;
        }

        public void e(C7026l lVar) {
            Object obj = this.f44594a;
            if (obj != null) {
                FragmentTransitionSupport.this.F(obj, this.f44595b, (ArrayList<View>) null);
            }
            Object obj2 = this.f44596c;
            if (obj2 != null) {
                FragmentTransitionSupport.this.F(obj2, this.f44597d, (ArrayList<View>) null);
            }
            Object obj3 = this.f44598e;
            if (obj3 != null) {
                FragmentTransitionSupport.this.F(obj3, this.f44599f, (ArrayList<View>) null);
            }
        }

        public void j(C7026l lVar) {
            lVar.k0(this);
        }
    }

    class d implements C7026l.h {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Runnable f44601a;

        d(Runnable runnable) {
            this.f44601a = runnable;
        }

        public void d(C7026l lVar) {
        }

        public void e(C7026l lVar) {
        }

        public void g(C7026l lVar) {
        }

        public void j(C7026l lVar) {
            this.f44601a.run();
        }

        public void l(C7026l lVar) {
        }
    }

    class e extends C7026l.e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Rect f44603a;

        e(Rect rect) {
            this.f44603a = rect;
        }

        public Rect a(C7026l lVar) {
            Rect rect = this.f44603a;
            if (rect == null || rect.isEmpty()) {
                return null;
            }
            return this.f44603a;
        }
    }

    private static boolean D(C7026l lVar) {
        return !U.l(lVar.N()) || !U.l(lVar.O()) || !U.l(lVar.P());
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void E(Runnable runnable, C7026l lVar, Runnable runnable2) {
        if (runnable == null) {
            lVar.cancel();
            runnable2.run();
            return;
        }
        runnable.run();
    }

    public void A(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        w wVar = (w) obj;
        if (wVar != null) {
            wVar.Q().clear();
            wVar.Q().addAll(arrayList2);
            F(wVar, arrayList, arrayList2);
        }
    }

    public Object B(Object obj) {
        if (obj == null) {
            return null;
        }
        w wVar = new w();
        wVar.B0((C7026l) obj);
        return wVar;
    }

    public void F(Object obj, @SuppressLint({"UnknownNullness"}) ArrayList<View> arrayList, @SuppressLint({"UnknownNullness"}) ArrayList<View> arrayList2) {
        C7026l lVar = (C7026l) obj;
        int i10 = 0;
        if (lVar instanceof w) {
            w wVar = (w) lVar;
            int F02 = wVar.F0();
            while (i10 < F02) {
                F(wVar.D0(i10), arrayList, arrayList2);
                i10++;
            }
        } else if (!D(lVar)) {
            List<View> Q10 = lVar.Q();
            if (Q10.size() == arrayList.size() && Q10.containsAll(arrayList)) {
                int size = arrayList2 == null ? 0 : arrayList2.size();
                while (i10 < size) {
                    lVar.d(arrayList2.get(i10));
                    i10++;
                }
                for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                    lVar.l0(arrayList.get(size2));
                }
            }
        }
    }

    public void a(Object obj, View view) {
        if (obj != null) {
            ((C7026l) obj).d(view);
        }
    }

    public void b(Object obj, ArrayList<View> arrayList) {
        C7026l lVar = (C7026l) obj;
        if (lVar != null) {
            int i10 = 0;
            if (lVar instanceof w) {
                w wVar = (w) lVar;
                int F02 = wVar.F0();
                while (i10 < F02) {
                    b(wVar.D0(i10), arrayList);
                    i10++;
                }
            } else if (!D(lVar) && U.l(lVar.Q())) {
                int size = arrayList.size();
                while (i10 < size) {
                    lVar.d(arrayList.get(i10));
                    i10++;
                }
            }
        }
    }

    public void c(Object obj) {
        ((v) obj).c();
    }

    public void d(Object obj, Runnable runnable) {
        ((v) obj).k(runnable);
    }

    public void e(ViewGroup viewGroup, Object obj) {
        t.a(viewGroup, (C7026l) obj);
    }

    public boolean g(Object obj) {
        return obj instanceof C7026l;
    }

    public Object h(Object obj) {
        if (obj != null) {
            return ((C7026l) obj).clone();
        }
        return null;
    }

    public Object j(ViewGroup viewGroup, Object obj) {
        return t.b(viewGroup, (C7026l) obj);
    }

    public boolean m() {
        return true;
    }

    public boolean n(Object obj) {
        boolean W10 = ((C7026l) obj).W();
        if (!W10) {
            Log.v("FragmentManager", "Predictive back not available for AndroidX Transition " + obj + ". Please enable seeking support for the designated transition by overriding isSeekingSupported().");
        }
        return W10;
    }

    public Object o(Object obj, Object obj2, Object obj3) {
        C7026l lVar = (C7026l) obj;
        C7026l lVar2 = (C7026l) obj2;
        C7026l lVar3 = (C7026l) obj3;
        if (lVar != null && lVar2 != null) {
            lVar = new w().B0(lVar).B0(lVar2).L0(1);
        } else if (lVar == null) {
            lVar = lVar2 != null ? lVar2 : null;
        }
        if (lVar3 == null) {
            return lVar;
        }
        w wVar = new w();
        if (lVar != null) {
            wVar.B0(lVar);
        }
        wVar.B0(lVar3);
        return wVar;
    }

    public Object p(Object obj, Object obj2, Object obj3) {
        w wVar = new w();
        if (obj != null) {
            wVar.B0((C7026l) obj);
        }
        if (obj2 != null) {
            wVar.B0((C7026l) obj2);
        }
        if (obj3 != null) {
            wVar.B0((C7026l) obj3);
        }
        return wVar;
    }

    public void r(Object obj, View view, ArrayList<View> arrayList) {
        ((C7026l) obj).c(new b(view, arrayList));
    }

    public void s(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3) {
        ((C7026l) obj).c(new c(obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    public void t(Object obj, float f10) {
        v vVar = (v) obj;
        if (vVar.f()) {
            long b10 = (long) (f10 * ((float) vVar.b()));
            if (b10 == 0) {
                b10 = 1;
            }
            if (b10 == vVar.b()) {
                b10 = vVar.b() - 1;
            }
            vVar.h(b10);
        }
    }

    public void u(Object obj, Rect rect) {
        if (obj != null) {
            ((C7026l) obj).r0(new e(rect));
        }
    }

    public void v(Object obj, View view) {
        if (view != null) {
            Rect rect = new Rect();
            k(view, rect);
            ((C7026l) obj).r0(new a(rect));
        }
    }

    public void w(C5187o oVar, Object obj, D2.e eVar, Runnable runnable) {
        x(oVar, obj, eVar, (Runnable) null, runnable);
    }

    public void x(C5187o oVar, Object obj, D2.e eVar, Runnable runnable, Runnable runnable2) {
        C7026l lVar = (C7026l) obj;
        eVar.b(new C7018d(runnable, lVar, runnable2));
        lVar.c(new d(runnable2));
    }

    public void z(Object obj, View view, ArrayList<View> arrayList) {
        w wVar = (w) obj;
        List<View> Q10 = wVar.Q();
        Q10.clear();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            U.f(Q10, arrayList.get(i10));
        }
        Q10.add(view);
        arrayList.add(view);
        b(wVar, arrayList);
    }
}
