package a9;

import D8.c;
import I2.C4610g0;
import XH.C16807N;
import YH.C16877v;
import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.widget.HorizontalScrollView;
import android.widget.ScrollView;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import b8.m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import nI.q;

/* renamed from: a9.l6  reason: case insensitive filesystem */
public final class C6876l6 implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: e  reason: collision with root package name */
    public static final c f42693e = new c("ScrollWatcherController");

    /* renamed from: a  reason: collision with root package name */
    public final C6923r6 f42694a;

    /* renamed from: b  reason: collision with root package name */
    public q<? super Integer, ? super Integer, ? super Long, C16807N> f42695b = a.f42698c;

    /* renamed from: c  reason: collision with root package name */
    public final WeakHashMap<Activity, WeakHashMap<View, R5>> f42696c = new WeakHashMap<>();

    /* renamed from: d  reason: collision with root package name */
    public Activity f42697d;

    /* renamed from: a9.l6$a */
    public static final class a extends C17544u implements q<Integer, Integer, Long, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        public static final a f42698c = new a();

        public a() {
            super(3);
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            ((Number) obj).intValue();
            ((Number) obj2).intValue();
            ((Number) obj3).longValue();
            return C16807N.f139792a;
        }
    }

    public C6876l6(C6923r6 r6Var) {
        C17542s.j(r6Var, "scrollWatcherFactory");
        this.f42694a = r6Var;
    }

    public static void b(View view, Y5 y52, C6812d6 d6Var) {
        if (((Boolean) d6Var.invoke(view)).booleanValue()) {
            y52.invoke(view);
        }
        if (view instanceof ViewGroup) {
            for (View b10 : C4610g0.b((ViewGroup) view)) {
                b(b10, y52, d6Var);
            }
        }
    }

    public static boolean d(View view) {
        C17542s.j(view, "view");
        return view.getTag(m.f45562g) != null;
    }

    public static boolean e(View view) {
        C17542s.j(view, "view");
        return (view instanceof RecyclerView) || (view instanceof ScrollView) || (view instanceof HorizontalScrollView) || (view instanceof NestedScrollView);
    }

    public final void a(Activity activity) {
        View decorView;
        ViewTreeObserver viewTreeObserver;
        C17542s.j(activity, "activity");
        WeakHashMap<Activity, WeakHashMap<View, R5>> weakHashMap = this.f42696c;
        if (weakHashMap.get(activity) == null) {
            weakHashMap.put(activity, new WeakHashMap());
        }
        c(activity);
        Window window = activity.getWindow();
        if (!(window == null || (decorView = window.getDecorView()) == null || (viewTreeObserver = decorView.getViewTreeObserver()) == null)) {
            viewTreeObserver.addOnGlobalLayoutListener(this);
        }
        Activity activity2 = this.f42697d;
        if (activity2 != null) {
            View decorView2 = activity2.getWindow().getDecorView();
            C17542s.i(decorView2, "activity.window.decorView");
            decorView2.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
        this.f42697d = activity;
    }

    public final void c(Activity activity) {
        View decorView;
        Window window = activity.getWindow();
        if (window != null && (decorView = window.getDecorView()) != null) {
            ArrayList arrayList = new ArrayList();
            b(decorView, new Y5(arrayList), new C6812d6(this));
            View view = (View) C16877v.y0(arrayList);
            if (view != null) {
                ArrayList arrayList2 = new ArrayList();
                b(view, new Y5(arrayList2), new C6812d6(this));
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    View view2 = (View) it.next();
                    WeakHashMap weakHashMap = this.f42696c.get(activity);
                    if (weakHashMap != null) {
                        C17542s.i(weakHashMap, "activitiesWatchers[activity]");
                        Object obj = weakHashMap.get(view2);
                        H3 h32 = obj;
                        if (obj == null) {
                            C6923r6 r6Var = this.f42694a;
                            r6Var.getClass();
                            C17542s.j(view2, "view");
                            C6893o oVar = view2 instanceof RecyclerView ? new C6893o((RecyclerView) view2, r6Var.f42837a) : new K5(view2, r6Var.f42837a);
                            q<? super Integer, ? super Integer, ? super Long, C16807N> qVar = this.f42695b;
                            C17542s.j(qVar, "listener");
                            oVar.f42037f = qVar;
                            oVar.b(new B3(oVar));
                            weakHashMap.put(view2, oVar);
                            h32 = oVar;
                        }
                        R5 r52 = (R5) h32;
                    }
                }
            }
        }
    }

    public final void onGlobalLayout() {
        Activity activity = this.f42697d;
        if (activity != null) {
            c(activity);
        }
    }
}
