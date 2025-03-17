package com.google.android.material.tabs;

import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import java.lang.ref.WeakReference;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    private final TabLayout f67319a;

    /* renamed from: b  reason: collision with root package name */
    private final ViewPager2 f67320b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f67321c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f67322d;

    /* renamed from: e  reason: collision with root package name */
    private final b f67323e;

    /* renamed from: f  reason: collision with root package name */
    private RecyclerView.h<?> f67324f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f67325g;

    /* renamed from: h  reason: collision with root package name */
    private c f67326h;

    /* renamed from: i  reason: collision with root package name */
    private TabLayout.d f67327i;

    /* renamed from: j  reason: collision with root package name */
    private RecyclerView.j f67328j;

    private class a extends RecyclerView.j {
        a() {
        }

        public void a() {
            d.this.b();
        }

        public void b(int i10, int i11) {
            d.this.b();
        }

        public void c(int i10, int i11, Object obj) {
            d.this.b();
        }

        public void d(int i10, int i11) {
            d.this.b();
        }

        public void e(int i10, int i11, int i12) {
            d.this.b();
        }

        public void f(int i10, int i11) {
            d.this.b();
        }
    }

    public interface b {
        void a(TabLayout.e eVar, int i10);
    }

    private static class c extends ViewPager2.i {

        /* renamed from: a  reason: collision with root package name */
        private final WeakReference<TabLayout> f67330a;

        /* renamed from: b  reason: collision with root package name */
        private int f67331b;

        /* renamed from: c  reason: collision with root package name */
        private int f67332c;

        c(TabLayout tabLayout) {
            this.f67330a = new WeakReference<>(tabLayout);
            d();
        }

        public void a(int i10) {
            this.f67331b = this.f67332c;
            this.f67332c = i10;
            TabLayout tabLayout = this.f67330a.get();
            if (tabLayout != null) {
                tabLayout.V(this.f67332c);
            }
        }

        public void b(int i10, float f10, int i11) {
            TabLayout tabLayout = this.f67330a.get();
            if (tabLayout != null) {
                int i12 = this.f67332c;
                tabLayout.P(i10, f10, i12 != 2 || this.f67331b == 1, (i12 == 2 && this.f67331b == 0) ? false : true, false);
            }
        }

        public void c(int i10) {
            TabLayout tabLayout = this.f67330a.get();
            if (tabLayout != null && tabLayout.getSelectedTabPosition() != i10 && i10 < tabLayout.getTabCount()) {
                int i11 = this.f67332c;
                tabLayout.L(tabLayout.B(i10), i11 == 0 || (i11 == 2 && this.f67331b == 0));
            }
        }

        /* access modifiers changed from: package-private */
        public void d() {
            this.f67332c = 0;
            this.f67331b = 0;
        }
    }

    /* renamed from: com.google.android.material.tabs.d$d  reason: collision with other inner class name */
    private static class C1172d implements TabLayout.d {

        /* renamed from: a  reason: collision with root package name */
        private final ViewPager2 f67333a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f67334b;

        C1172d(ViewPager2 viewPager2, boolean z10) {
            this.f67333a = viewPager2;
            this.f67334b = z10;
        }

        public void a(TabLayout.e eVar) {
            this.f67333a.j(eVar.i(), this.f67334b);
        }

        public void b(TabLayout.e eVar) {
        }

        public void c(TabLayout.e eVar) {
        }
    }

    public d(TabLayout tabLayout, ViewPager2 viewPager2, boolean z10, boolean z11, b bVar) {
        this.f67319a = tabLayout;
        this.f67320b = viewPager2;
        this.f67321c = z10;
        this.f67322d = z11;
        this.f67323e = bVar;
    }

    public void a() {
        if (!this.f67325g) {
            RecyclerView.h<?> adapter = this.f67320b.getAdapter();
            this.f67324f = adapter;
            if (adapter != null) {
                this.f67325g = true;
                c cVar = new c(this.f67319a);
                this.f67326h = cVar;
                this.f67320b.g(cVar);
                C1172d dVar = new C1172d(this.f67320b, this.f67322d);
                this.f67327i = dVar;
                this.f67319a.h(dVar);
                if (this.f67321c) {
                    a aVar = new a();
                    this.f67328j = aVar;
                    this.f67324f.registerAdapterDataObserver(aVar);
                }
                b();
                this.f67319a.N(this.f67320b.getCurrentItem(), 0.0f, true);
                return;
            }
            throw new IllegalStateException("TabLayoutMediator attached before ViewPager2 has an adapter");
        }
        throw new IllegalStateException("TabLayoutMediator is already attached");
    }

    /* access modifiers changed from: package-private */
    public void b() {
        int min;
        this.f67319a.H();
        RecyclerView.h<?> hVar = this.f67324f;
        if (hVar != null) {
            int itemCount = hVar.getItemCount();
            for (int i10 = 0; i10 < itemCount; i10++) {
                TabLayout.e E10 = this.f67319a.E();
                this.f67323e.a(E10, i10);
                this.f67319a.k(E10, false);
            }
            if (itemCount > 0 && (min = Math.min(this.f67320b.getCurrentItem(), this.f67319a.getTabCount() - 1)) != this.f67319a.getSelectedTabPosition()) {
                TabLayout tabLayout = this.f67319a;
                tabLayout.K(tabLayout.B(min));
            }
        }
    }
}
