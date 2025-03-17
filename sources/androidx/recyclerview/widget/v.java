package androidx.recyclerview.widget;

import I2.C4597a;
import I2.C4600b0;
import J2.t;
import J2.u;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import java.util.Map;
import java.util.WeakHashMap;

public class v extends C4597a {

    /* renamed from: d  reason: collision with root package name */
    final RecyclerView f44185d;

    /* renamed from: e  reason: collision with root package name */
    private final a f44186e;

    public static class a extends C4597a {

        /* renamed from: d  reason: collision with root package name */
        final v f44187d;

        /* renamed from: e  reason: collision with root package name */
        private Map<View, C4597a> f44188e = new WeakHashMap();

        public a(v vVar) {
            this.f44187d = vVar;
        }

        public boolean a(View view, AccessibilityEvent accessibilityEvent) {
            C4597a aVar = this.f44188e.get(view);
            return aVar != null ? aVar.a(view, accessibilityEvent) : super.a(view, accessibilityEvent);
        }

        public u b(View view) {
            C4597a aVar = this.f44188e.get(view);
            return aVar != null ? aVar.b(view) : super.b(view);
        }

        public void f(View view, AccessibilityEvent accessibilityEvent) {
            C4597a aVar = this.f44188e.get(view);
            if (aVar != null) {
                aVar.f(view, accessibilityEvent);
            } else {
                super.f(view, accessibilityEvent);
            }
        }

        public void g(@SuppressLint({"InvalidNullabilityOverride"}) View view, @SuppressLint({"InvalidNullabilityOverride"}) t tVar) {
            if (this.f44187d.o() || this.f44187d.f44185d.getLayoutManager() == null) {
                super.g(view, tVar);
                return;
            }
            this.f44187d.f44185d.getLayoutManager().n1(view, tVar);
            C4597a aVar = this.f44188e.get(view);
            if (aVar != null) {
                aVar.g(view, tVar);
            } else {
                super.g(view, tVar);
            }
        }

        public void h(View view, AccessibilityEvent accessibilityEvent) {
            C4597a aVar = this.f44188e.get(view);
            if (aVar != null) {
                aVar.h(view, accessibilityEvent);
            } else {
                super.h(view, accessibilityEvent);
            }
        }

        public boolean i(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            C4597a aVar = this.f44188e.get(viewGroup);
            return aVar != null ? aVar.i(viewGroup, view, accessibilityEvent) : super.i(viewGroup, view, accessibilityEvent);
        }

        public boolean j(@SuppressLint({"InvalidNullabilityOverride"}) View view, int i10, @SuppressLint({"InvalidNullabilityOverride"}) Bundle bundle) {
            if (this.f44187d.o() || this.f44187d.f44185d.getLayoutManager() == null) {
                return super.j(view, i10, bundle);
            }
            C4597a aVar = this.f44188e.get(view);
            if (aVar != null) {
                if (aVar.j(view, i10, bundle)) {
                    return true;
                }
            } else if (super.j(view, i10, bundle)) {
                return true;
            }
            return this.f44187d.f44185d.getLayoutManager().H1(view, i10, bundle);
        }

        public void l(View view, int i10) {
            C4597a aVar = this.f44188e.get(view);
            if (aVar != null) {
                aVar.l(view, i10);
            } else {
                super.l(view, i10);
            }
        }

        public void m(View view, AccessibilityEvent accessibilityEvent) {
            C4597a aVar = this.f44188e.get(view);
            if (aVar != null) {
                aVar.m(view, accessibilityEvent);
            } else {
                super.m(view, accessibilityEvent);
            }
        }

        /* access modifiers changed from: package-private */
        public C4597a n(View view) {
            return this.f44188e.remove(view);
        }

        /* access modifiers changed from: package-private */
        public void o(View view) {
            C4597a l10 = C4600b0.l(view);
            if (l10 != null && l10 != this) {
                this.f44188e.put(view, l10);
            }
        }
    }

    public v(RecyclerView recyclerView) {
        this.f44185d = recyclerView;
        C4597a n10 = n();
        if (n10 == null || !(n10 instanceof a)) {
            this.f44186e = new a(this);
        } else {
            this.f44186e = (a) n10;
        }
    }

    public void f(@SuppressLint({"InvalidNullabilityOverride"}) View view, @SuppressLint({"InvalidNullabilityOverride"}) AccessibilityEvent accessibilityEvent) {
        super.f(view, accessibilityEvent);
        if ((view instanceof RecyclerView) && !o()) {
            RecyclerView recyclerView = (RecyclerView) view;
            if (recyclerView.getLayoutManager() != null) {
                recyclerView.getLayoutManager().j1(accessibilityEvent);
            }
        }
    }

    public void g(@SuppressLint({"InvalidNullabilityOverride"}) View view, @SuppressLint({"InvalidNullabilityOverride"}) t tVar) {
        super.g(view, tVar);
        if (!o() && this.f44185d.getLayoutManager() != null) {
            this.f44185d.getLayoutManager().l1(tVar);
        }
    }

    public boolean j(@SuppressLint({"InvalidNullabilityOverride"}) View view, int i10, @SuppressLint({"InvalidNullabilityOverride"}) Bundle bundle) {
        if (super.j(view, i10, bundle)) {
            return true;
        }
        if (o() || this.f44185d.getLayoutManager() == null) {
            return false;
        }
        return this.f44185d.getLayoutManager().F1(i10, bundle);
    }

    public C4597a n() {
        return this.f44186e;
    }

    /* access modifiers changed from: package-private */
    public boolean o() {
        return this.f44185d.x0();
    }
}
