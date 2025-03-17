package androidx.transition;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import j0.C5445a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

public class t {

    /* renamed from: a  reason: collision with root package name */
    private static C7026l f44757a = new C7015a();

    /* renamed from: b  reason: collision with root package name */
    private static ThreadLocal<WeakReference<C5445a<ViewGroup, ArrayList<C7026l>>>> f44758b = new ThreadLocal<>();

    /* renamed from: c  reason: collision with root package name */
    static ArrayList<ViewGroup> f44759c = new ArrayList<>();

    private static class a implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

        /* renamed from: a  reason: collision with root package name */
        C7026l f44760a;

        /* renamed from: b  reason: collision with root package name */
        ViewGroup f44761b;

        /* renamed from: androidx.transition.t$a$a  reason: collision with other inner class name */
        class C0770a extends s {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C5445a f44762a;

            C0770a(C5445a aVar) {
                this.f44762a = aVar;
            }

            public void j(C7026l lVar) {
                ((ArrayList) this.f44762a.get(a.this.f44761b)).remove(lVar);
                lVar.k0(this);
            }
        }

        a(C7026l lVar, ViewGroup viewGroup) {
            this.f44760a = lVar;
            this.f44761b = viewGroup;
        }

        private void a() {
            this.f44761b.getViewTreeObserver().removeOnPreDrawListener(this);
            this.f44761b.removeOnAttachStateChangeListener(this);
        }

        public boolean onPreDraw() {
            a();
            if (!t.f44759c.remove(this.f44761b)) {
                return true;
            }
            C5445a<ViewGroup, ArrayList<C7026l>> c10 = t.c();
            ArrayList arrayList = c10.get(this.f44761b);
            ArrayList arrayList2 = null;
            if (arrayList == null) {
                arrayList = new ArrayList();
                c10.put(this.f44761b, arrayList);
            } else if (arrayList.size() > 0) {
                arrayList2 = new ArrayList(arrayList);
            }
            arrayList.add(this.f44760a);
            this.f44760a.c(new C0770a(c10));
            this.f44760a.o(this.f44761b, false);
            if (arrayList2 != null) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    ((C7026l) it.next()).m0(this.f44761b);
                }
            }
            this.f44760a.i0(this.f44761b);
            return true;
        }

        public void onViewAttachedToWindow(View view) {
        }

        public void onViewDetachedFromWindow(View view) {
            a();
            t.f44759c.remove(this.f44761b);
            ArrayList arrayList = t.c().get(this.f44761b);
            if (arrayList != null && arrayList.size() > 0) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((C7026l) it.next()).m0(this.f44761b);
                }
            }
            this.f44760a.p(true);
        }
    }

    public static void a(ViewGroup viewGroup, C7026l lVar) {
        if (!f44759c.contains(viewGroup) && viewGroup.isLaidOut()) {
            f44759c.add(viewGroup);
            if (lVar == null) {
                lVar = f44757a;
            }
            C7026l r10 = lVar.clone();
            e(viewGroup, r10);
            C7023i.c(viewGroup, (C7023i) null);
            d(viewGroup, r10);
        }
    }

    public static v b(ViewGroup viewGroup, C7026l lVar) {
        if (f44759c.contains(viewGroup) || !viewGroup.isLaidOut() || Build.VERSION.SDK_INT < 34) {
            return null;
        }
        if (lVar.W()) {
            f44759c.add(viewGroup);
            C7026l r10 = lVar.clone();
            w wVar = new w();
            wVar.B0(r10);
            e(viewGroup, wVar);
            C7023i.c(viewGroup, (C7023i) null);
            d(viewGroup, wVar);
            viewGroup.invalidate();
            return wVar.w();
        }
        throw new IllegalArgumentException("The Transition must support seeking.");
    }

    static C5445a<ViewGroup, ArrayList<C7026l>> c() {
        C5445a<ViewGroup, ArrayList<C7026l>> aVar;
        WeakReference weakReference = f44758b.get();
        if (weakReference != null && (aVar = (C5445a) weakReference.get()) != null) {
            return aVar;
        }
        C5445a<ViewGroup, ArrayList<C7026l>> aVar2 = new C5445a<>();
        f44758b.set(new WeakReference(aVar2));
        return aVar2;
    }

    private static void d(ViewGroup viewGroup, C7026l lVar) {
        if (lVar != null && viewGroup != null) {
            a aVar = new a(lVar, viewGroup);
            viewGroup.addOnAttachStateChangeListener(aVar);
            viewGroup.getViewTreeObserver().addOnPreDrawListener(aVar);
        }
    }

    private static void e(ViewGroup viewGroup, C7026l lVar) {
        ArrayList arrayList = c().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((C7026l) it.next()).h0(viewGroup);
            }
        }
        if (lVar != null) {
            lVar.o(viewGroup, true);
        }
        C7023i b10 = C7023i.b(viewGroup);
        if (b10 != null) {
            b10.a();
        }
    }
}
