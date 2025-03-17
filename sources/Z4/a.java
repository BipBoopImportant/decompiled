package Z4;

import H2.i;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.fragment.app.C5187o;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.Q;
import androidx.lifecycle.C5218v;
import androidx.lifecycle.C5221y;
import androidx.lifecycle.r;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import j0.C5446b;
import j0.C5468y;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public abstract class a extends RecyclerView.h<b> implements c {

    /* renamed from: h  reason: collision with root package name */
    final r f41339h;

    /* renamed from: i  reason: collision with root package name */
    final FragmentManager f41340i;

    /* renamed from: j  reason: collision with root package name */
    final C5468y<C5187o> f41341j;

    /* renamed from: k  reason: collision with root package name */
    private final C5468y<C5187o.n> f41342k;

    /* renamed from: l  reason: collision with root package name */
    private final C5468y<Integer> f41343l;

    /* renamed from: m  reason: collision with root package name */
    private g f41344m;

    /* renamed from: n  reason: collision with root package name */
    f f41345n;

    /* renamed from: o  reason: collision with root package name */
    boolean f41346o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f41347p;

    /* renamed from: Z4.a$a  reason: collision with other inner class name */
    class C0724a implements C5218v {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f41348a;

        C0724a(b bVar) {
            this.f41348a = bVar;
        }

        public void e(C5221y yVar, r.a aVar) {
            if (!a.this.v()) {
                yVar.getLifecycle().g(this);
                if (this.f41348a.d().isAttachedToWindow()) {
                    a.this.r(this.f41348a);
                }
            }
        }
    }

    class b extends FragmentManager.m {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C5187o f41350b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ FrameLayout f41351c;

        b(C5187o oVar, FrameLayout frameLayout) {
            this.f41350b = oVar;
            this.f41351c = frameLayout;
        }

        public void onFragmentViewCreated(FragmentManager fragmentManager, C5187o oVar, View view, Bundle bundle) {
            if (oVar == this.f41350b) {
                fragmentManager.Y1(this);
                a.this.c(view, this.f41351c);
            }
        }
    }

    class c implements Runnable {
        c() {
        }

        public void run() {
            a aVar = a.this;
            aVar.f41346o = false;
            aVar.h();
        }
    }

    class d implements C5218v {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Handler f41354a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Runnable f41355b;

        d(Handler handler, Runnable runnable) {
            this.f41354a = handler;
            this.f41355b = runnable;
        }

        public void e(C5221y yVar, r.a aVar) {
            if (aVar == r.a.ON_DESTROY) {
                this.f41354a.removeCallbacks(this.f41355b);
                yVar.getLifecycle().g(this);
            }
        }
    }

    private static abstract class e extends RecyclerView.j {
        private e() {
        }

        public abstract void a();

        public final void b(int i10, int i11) {
            a();
        }

        public final void c(int i10, int i11, Object obj) {
            a();
        }

        public final void d(int i10, int i11) {
            a();
        }

        public final void e(int i10, int i11, int i12) {
            a();
        }

        public final void f(int i10, int i11) {
            a();
        }

        /* synthetic */ e(C0724a aVar) {
            this();
        }
    }

    static class f {

        /* renamed from: a  reason: collision with root package name */
        private List<h> f41357a = new CopyOnWriteArrayList();

        f() {
        }

        public List<h.b> a(C5187o oVar, r.b bVar) {
            ArrayList arrayList = new ArrayList();
            for (h a10 : this.f41357a) {
                arrayList.add(a10.a(oVar, bVar));
            }
            return arrayList;
        }

        public void b(List<h.b> list) {
            for (h.b a10 : list) {
                a10.a();
            }
        }

        public List<h.b> c(C5187o oVar) {
            ArrayList arrayList = new ArrayList();
            for (h b10 : this.f41357a) {
                arrayList.add(b10.b(oVar));
            }
            return arrayList;
        }

        public List<h.b> d(C5187o oVar) {
            ArrayList arrayList = new ArrayList();
            for (h c10 : this.f41357a) {
                arrayList.add(c10.c(oVar));
            }
            return arrayList;
        }

        public List<h.b> e(C5187o oVar) {
            ArrayList arrayList = new ArrayList();
            for (h d10 : this.f41357a) {
                arrayList.add(d10.d(oVar));
            }
            return arrayList;
        }
    }

    class g {

        /* renamed from: a  reason: collision with root package name */
        private ViewPager2.i f41358a;

        /* renamed from: b  reason: collision with root package name */
        private RecyclerView.j f41359b;

        /* renamed from: c  reason: collision with root package name */
        private C5218v f41360c;

        /* renamed from: d  reason: collision with root package name */
        private ViewPager2 f41361d;

        /* renamed from: e  reason: collision with root package name */
        private long f41362e = -1;

        /* renamed from: Z4.a$g$a  reason: collision with other inner class name */
        class C0725a extends ViewPager2.i {
            C0725a() {
            }

            public void a(int i10) {
                g.this.d(false);
            }

            public void c(int i10) {
                g.this.d(false);
            }
        }

        class b extends e {
            b() {
                super((C0724a) null);
            }

            public void a() {
                g.this.d(true);
            }
        }

        class c implements C5218v {
            c() {
            }

            public void e(C5221y yVar, r.a aVar) {
                g.this.d(false);
            }
        }

        g() {
        }

        private ViewPager2 a(RecyclerView recyclerView) {
            ViewParent parent = recyclerView.getParent();
            if (parent instanceof ViewPager2) {
                return (ViewPager2) parent;
            }
            throw new IllegalStateException("Expected ViewPager2 instance. Got: " + parent);
        }

        /* access modifiers changed from: package-private */
        public void b(RecyclerView recyclerView) {
            this.f41361d = a(recyclerView);
            C0725a aVar = new C0725a();
            this.f41358a = aVar;
            this.f41361d.g(aVar);
            b bVar = new b();
            this.f41359b = bVar;
            a.this.registerAdapterDataObserver(bVar);
            c cVar = new c();
            this.f41360c = cVar;
            a.this.f41339h.c(cVar);
        }

        /* access modifiers changed from: package-private */
        public void c(RecyclerView recyclerView) {
            a(recyclerView).n(this.f41358a);
            a.this.unregisterAdapterDataObserver(this.f41359b);
            a.this.f41339h.g(this.f41360c);
            this.f41361d = null;
        }

        /* access modifiers changed from: package-private */
        public void d(boolean z10) {
            int currentItem;
            C5187o d10;
            if (!a.this.v() && this.f41361d.getScrollState() == 0 && !a.this.f41341j.f() && a.this.getItemCount() != 0 && (currentItem = this.f41361d.getCurrentItem()) < a.this.getItemCount()) {
                long itemId = a.this.getItemId(currentItem);
                if ((itemId != this.f41362e || z10) && (d10 = a.this.f41341j.d(itemId)) != null && d10.isAdded()) {
                    this.f41362e = itemId;
                    Q s10 = a.this.f41340i.s();
                    ArrayList<List> arrayList = new ArrayList<>();
                    C5187o oVar = null;
                    for (int i10 = 0; i10 < a.this.f41341j.o(); i10++) {
                        long j10 = a.this.f41341j.j(i10);
                        C5187o p10 = a.this.f41341j.p(i10);
                        if (p10.isAdded()) {
                            if (j10 != this.f41362e) {
                                r.b bVar = r.b.STARTED;
                                s10.z(p10, bVar);
                                arrayList.add(a.this.f41345n.a(p10, bVar));
                            } else {
                                oVar = p10;
                            }
                            p10.setMenuVisibility(j10 == this.f41362e);
                        }
                    }
                    if (oVar != null) {
                        r.b bVar2 = r.b.RESUMED;
                        s10.z(oVar, bVar2);
                        arrayList.add(a.this.f41345n.a(oVar, bVar2));
                    }
                    if (!s10.q()) {
                        s10.l();
                        Collections.reverse(arrayList);
                        for (List b10 : arrayList) {
                            a.this.f41345n.b(b10);
                        }
                    }
                }
            }
        }
    }

    public static abstract class h {

        /* renamed from: a  reason: collision with root package name */
        private static final b f41367a = new C0726a();

        /* renamed from: Z4.a$h$a  reason: collision with other inner class name */
        class C0726a implements b {
            C0726a() {
            }

            public void a() {
            }
        }

        public interface b {
            void a();
        }

        public b a(C5187o oVar, r.b bVar) {
            return f41367a;
        }

        public b b(C5187o oVar) {
            return f41367a;
        }

        public b c(C5187o oVar) {
            return f41367a;
        }

        public b d(C5187o oVar) {
            return f41367a;
        }
    }

    public a(C5187o oVar) {
        this(oVar.getChildFragmentManager(), oVar.getLifecycle());
    }

    private static String f(String str, long j10) {
        return str + j10;
    }

    private void g(int i10) {
        long itemId = getItemId(i10);
        if (!this.f41341j.c(itemId)) {
            C5187o e10 = e(i10);
            e10.setInitialSavedState(this.f41342k.d(itemId));
            this.f41341j.k(itemId, e10);
        }
    }

    private boolean i(long j10) {
        View view;
        if (this.f41343l.c(j10)) {
            return true;
        }
        C5187o d10 = this.f41341j.d(j10);
        if (d10 == null || (view = d10.getView()) == null) {
            return false;
        }
        return view.getParent() != null;
    }

    private static boolean j(String str, String str2) {
        return str.startsWith(str2) && str.length() > str2.length();
    }

    private Long k(int i10) {
        Long l10 = null;
        for (int i11 = 0; i11 < this.f41343l.o(); i11++) {
            if (this.f41343l.p(i11).intValue() == i10) {
                if (l10 == null) {
                    l10 = Long.valueOf(this.f41343l.j(i11));
                } else {
                    throw new IllegalStateException("Design assumption violated: a ViewHolder can only be bound to one item at a time.");
                }
            }
        }
        return l10;
    }

    private static long q(String str, String str2) {
        return Long.parseLong(str.substring(str2.length()));
    }

    private void s(long j10) {
        ViewParent parent;
        C5187o d10 = this.f41341j.d(j10);
        if (d10 != null) {
            if (!(d10.getView() == null || (parent = d10.getView().getParent()) == null)) {
                ((FrameLayout) parent).removeAllViews();
            }
            if (!d(j10)) {
                this.f41342k.m(j10);
            }
            if (!d10.isAdded()) {
                this.f41341j.m(j10);
            } else if (v()) {
                this.f41347p = true;
            } else {
                if (d10.isAdded() && d(j10)) {
                    List<h.b> e10 = this.f41345n.e(d10);
                    C5187o.n M12 = this.f41340i.M1(d10);
                    this.f41345n.b(e10);
                    this.f41342k.k(j10, M12);
                }
                List<h.b> d11 = this.f41345n.d(d10);
                try {
                    this.f41340i.s().r(d10).l();
                    this.f41341j.m(j10);
                } finally {
                    this.f41345n.b(d11);
                }
            }
        }
    }

    private void t() {
        Handler handler = new Handler(Looper.getMainLooper());
        c cVar = new c();
        this.f41339h.c(new d(handler, cVar));
        handler.postDelayed(cVar, 10000);
    }

    private void u(C5187o oVar, FrameLayout frameLayout) {
        this.f41340i.A1(new b(oVar, frameLayout), false);
    }

    public final void a(Parcelable parcelable) {
        if (!this.f41342k.f() || !this.f41341j.f()) {
            throw new IllegalStateException("Expected the adapter to be 'fresh' while restoring state.");
        }
        Bundle bundle = (Bundle) parcelable;
        if (bundle.getClassLoader() == null) {
            bundle.setClassLoader(getClass().getClassLoader());
        }
        for (String next : bundle.keySet()) {
            if (j(next, "f#")) {
                this.f41341j.k(q(next, "f#"), this.f41340i.C0(bundle, next));
            } else if (j(next, "s#")) {
                long q10 = q(next, "s#");
                C5187o.n nVar = (C5187o.n) bundle.getParcelable(next);
                if (d(q10)) {
                    this.f41342k.k(q10, nVar);
                }
            } else {
                throw new IllegalArgumentException("Unexpected key in savedState: " + next);
            }
        }
        if (!this.f41341j.f()) {
            this.f41347p = true;
            this.f41346o = true;
            h();
            t();
        }
    }

    public final Parcelable b() {
        Bundle bundle = new Bundle(this.f41341j.o() + this.f41342k.o());
        for (int i10 = 0; i10 < this.f41341j.o(); i10++) {
            long j10 = this.f41341j.j(i10);
            C5187o d10 = this.f41341j.d(j10);
            if (d10 != null && d10.isAdded()) {
                this.f41340i.z1(bundle, f("f#", j10), d10);
            }
        }
        for (int i11 = 0; i11 < this.f41342k.o(); i11++) {
            long j11 = this.f41342k.j(i11);
            if (d(j11)) {
                bundle.putParcelable(f("s#", j11), this.f41342k.d(j11));
            }
        }
        return bundle;
    }

    /* access modifiers changed from: package-private */
    public void c(View view, FrameLayout frameLayout) {
        if (frameLayout.getChildCount() > 1) {
            throw new IllegalStateException("Design assumption violated.");
        } else if (view.getParent() != frameLayout) {
            if (frameLayout.getChildCount() > 0) {
                frameLayout.removeAllViews();
            }
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            frameLayout.addView(view);
        }
    }

    public abstract boolean d(long j10);

    public abstract C5187o e(int i10);

    public abstract long getItemId(int i10);

    /* access modifiers changed from: package-private */
    public void h() {
        if (this.f41347p && !v()) {
            C5446b<Long> bVar = new C5446b<>();
            for (int i10 = 0; i10 < this.f41341j.o(); i10++) {
                long j10 = this.f41341j.j(i10);
                if (!d(j10)) {
                    bVar.add(Long.valueOf(j10));
                    this.f41343l.m(j10);
                }
            }
            if (!this.f41346o) {
                this.f41347p = false;
                for (int i11 = 0; i11 < this.f41341j.o(); i11++) {
                    long j11 = this.f41341j.j(i11);
                    if (!i(j11)) {
                        bVar.add(Long.valueOf(j11));
                    }
                }
            }
            for (Long longValue : bVar) {
                s(longValue.longValue());
            }
        }
    }

    /* renamed from: l */
    public final void onBindViewHolder(b bVar, int i10) {
        long itemId = bVar.getItemId();
        int id2 = bVar.d().getId();
        Long k10 = k(id2);
        if (!(k10 == null || k10.longValue() == itemId)) {
            s(k10.longValue());
            this.f41343l.m(k10.longValue());
        }
        this.f41343l.k(itemId, Integer.valueOf(id2));
        g(i10);
        if (bVar.d().isAttachedToWindow()) {
            r(bVar);
        }
        h();
    }

    /* renamed from: m */
    public final b onCreateViewHolder(ViewGroup viewGroup, int i10) {
        return b.c(viewGroup);
    }

    /* renamed from: n */
    public final boolean onFailedToRecycleView(b bVar) {
        return true;
    }

    /* renamed from: o */
    public final void onViewAttachedToWindow(b bVar) {
        r(bVar);
        h();
    }

    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        i.a(this.f41344m == null);
        g gVar = new g();
        this.f41344m = gVar;
        gVar.b(recyclerView);
    }

    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        this.f41344m.c(recyclerView);
        this.f41344m = null;
    }

    /* renamed from: p */
    public final void onViewRecycled(b bVar) {
        Long k10 = k(bVar.d().getId());
        if (k10 != null) {
            s(k10.longValue());
            this.f41343l.m(k10.longValue());
        }
    }

    /* access modifiers changed from: package-private */
    public void r(b bVar) {
        C5187o d10 = this.f41341j.d(bVar.getItemId());
        if (d10 != null) {
            FrameLayout d11 = bVar.d();
            View view = d10.getView();
            if (!d10.isAdded() && view != null) {
                throw new IllegalStateException("Design assumption violated.");
            } else if (d10.isAdded() && view == null) {
                u(d10, d11);
            } else if (!d10.isAdded() || view.getParent() == null) {
                if (d10.isAdded()) {
                    c(view, d11);
                } else if (!v()) {
                    u(d10, d11);
                    List<h.b> c10 = this.f41345n.c(d10);
                    try {
                        d10.setMenuVisibility(false);
                        Q s10 = this.f41340i.s();
                        s10.f(d10, "f" + bVar.getItemId()).z(d10, r.b.STARTED).l();
                        this.f41344m.d(false);
                    } finally {
                        this.f41345n.b(c10);
                    }
                } else if (!this.f41340i.T0()) {
                    this.f41339h.c(new C0724a(bVar));
                }
            } else if (view.getParent() != d11) {
                c(view, d11);
            }
        } else {
            throw new IllegalStateException("Design assumption violated.");
        }
    }

    public final void setHasStableIds(boolean z10) {
        throw new UnsupportedOperationException("Stable Ids are required for the adapter to function properly, and the adapter takes care of setting the flag.");
    }

    /* access modifiers changed from: package-private */
    public boolean v() {
        return this.f41340i.b1();
    }

    public a(FragmentManager fragmentManager, r rVar) {
        this.f41341j = new C5468y<>();
        this.f41342k = new C5468y<>();
        this.f41343l = new C5468y<>();
        this.f41345n = new f();
        this.f41346o = false;
        this.f41347p = false;
        this.f41340i = fragmentManager;
        this.f41339h = rVar;
        super.setHasStableIds(true);
    }
}
