package a9;

import G8.f;
import XH.C16807N;
import android.view.View;
import android.view.ViewTreeObserver;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import nI.C17642l;

public final class K5 extends H3<View> implements ViewTreeObserver.OnScrollChangedListener {

    public static final class a extends C17544u implements C17642l<View, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ K5 f42103c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(K5 k52) {
            super(1);
            this.f42103c = k52;
        }

        public final Object invoke(Object obj) {
            View view = (View) obj;
            C17542s.j(view, "$this$forView");
            view.getViewTreeObserver().removeOnScrollChangedListener(this.f42103c);
            return C16807N.f139792a;
        }
    }

    public static final class b extends C17544u implements C17642l<View, Integer> {

        /* renamed from: c  reason: collision with root package name */
        public static final b f42104c = new b();

        public b() {
            super(1);
        }

        public final Object invoke(Object obj) {
            View view = (View) obj;
            C17542s.j(view, "$this$forView");
            return Integer.valueOf(view.getScrollX());
        }
    }

    public static final class c extends C17544u implements C17642l<View, Integer> {

        /* renamed from: c  reason: collision with root package name */
        public static final c f42105c = new c();

        public c() {
            super(1);
        }

        public final Object invoke(Object obj) {
            View view = (View) obj;
            C17542s.j(view, "$this$forView");
            return Integer.valueOf(view.getScrollY());
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public K5(View view, f fVar) {
        super(view, fVar);
        C17542s.j(view, "view");
        C17542s.j(fVar, "debouncer");
        view.post(new J5(view, this));
    }

    public static final void d(View view, K5 k52) {
        C17542s.j(view, "$view");
        C17542s.j(k52, "this$0");
        view.getViewTreeObserver().addOnScrollChangedListener(k52);
        k52.getClass();
        k52.b(new B3(k52));
    }

    public final int a() {
        Integer num = (Integer) b(b.f42104c);
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public final int c() {
        Integer num = (Integer) b(c.f42105c);
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public final void clear() {
        b(new a(this));
    }

    public final void onScrollChanged() {
        b(new B3(this));
    }
}
