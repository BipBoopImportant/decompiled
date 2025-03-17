package androidx.appcompat.view;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.b;
import androidx.appcompat.view.menu.MenuItemWrapperICS;
import androidx.appcompat.view.menu.m;
import j0.b0;
import java.util.ArrayList;
import z2.C6275a;
import z2.C6276b;

public class f extends ActionMode {

    /* renamed from: a  reason: collision with root package name */
    final Context f15656a;

    /* renamed from: b  reason: collision with root package name */
    final b f15657b;

    public static class a implements b.a {

        /* renamed from: a  reason: collision with root package name */
        final ActionMode.Callback f15658a;

        /* renamed from: b  reason: collision with root package name */
        final Context f15659b;

        /* renamed from: c  reason: collision with root package name */
        final ArrayList<f> f15660c = new ArrayList<>();

        /* renamed from: d  reason: collision with root package name */
        final b0<Menu, Menu> f15661d = new b0<>();

        public a(Context context, ActionMode.Callback callback) {
            this.f15659b = context;
            this.f15658a = callback;
        }

        private Menu f(Menu menu) {
            Menu menu2 = this.f15661d.get(menu);
            if (menu2 != null) {
                return menu2;
            }
            m mVar = new m(this.f15659b, (C6275a) menu);
            this.f15661d.put(menu, mVar);
            return mVar;
        }

        public void a(b bVar) {
            this.f15658a.onDestroyActionMode(e(bVar));
        }

        public boolean b(b bVar, Menu menu) {
            return this.f15658a.onCreateActionMode(e(bVar), f(menu));
        }

        public boolean c(b bVar, MenuItem menuItem) {
            return this.f15658a.onActionItemClicked(e(bVar), new MenuItemWrapperICS(this.f15659b, (C6276b) menuItem));
        }

        public boolean d(b bVar, Menu menu) {
            return this.f15658a.onPrepareActionMode(e(bVar), f(menu));
        }

        public ActionMode e(b bVar) {
            int size = this.f15660c.size();
            for (int i10 = 0; i10 < size; i10++) {
                f fVar = this.f15660c.get(i10);
                if (fVar != null && fVar.f15657b == bVar) {
                    return fVar;
                }
            }
            f fVar2 = new f(this.f15659b, bVar);
            this.f15660c.add(fVar2);
            return fVar2;
        }
    }

    public f(Context context, b bVar) {
        this.f15656a = context;
        this.f15657b = bVar;
    }

    public void finish() {
        this.f15657b.c();
    }

    public View getCustomView() {
        return this.f15657b.d();
    }

    public Menu getMenu() {
        return new m(this.f15656a, (C6275a) this.f15657b.e());
    }

    public MenuInflater getMenuInflater() {
        return this.f15657b.f();
    }

    public CharSequence getSubtitle() {
        return this.f15657b.g();
    }

    public Object getTag() {
        return this.f15657b.h();
    }

    public CharSequence getTitle() {
        return this.f15657b.i();
    }

    public boolean getTitleOptionalHint() {
        return this.f15657b.j();
    }

    public void invalidate() {
        this.f15657b.k();
    }

    public boolean isTitleOptional() {
        return this.f15657b.l();
    }

    public void setCustomView(View view) {
        this.f15657b.m(view);
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f15657b.o(charSequence);
    }

    public void setTag(Object obj) {
        this.f15657b.p(obj);
    }

    public void setTitle(CharSequence charSequence) {
        this.f15657b.r(charSequence);
    }

    public void setTitleOptionalHint(boolean z10) {
        this.f15657b.s(z10);
    }

    public void setSubtitle(int i10) {
        this.f15657b.n(i10);
    }

    public void setTitle(int i10) {
        this.f15657b.q(i10);
    }
}
