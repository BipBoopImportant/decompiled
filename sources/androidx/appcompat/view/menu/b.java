package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import j0.b0;
import z2.C6276b;
import z2.C6277c;

abstract class b {

    /* renamed from: a  reason: collision with root package name */
    final Context f15764a;

    /* renamed from: b  reason: collision with root package name */
    private b0<C6276b, MenuItem> f15765b;

    /* renamed from: c  reason: collision with root package name */
    private b0<C6277c, SubMenu> f15766c;

    b(Context context) {
        this.f15764a = context;
    }

    /* access modifiers changed from: package-private */
    public final MenuItem c(MenuItem menuItem) {
        if (!(menuItem instanceof C6276b)) {
            return menuItem;
        }
        C6276b bVar = (C6276b) menuItem;
        if (this.f15765b == null) {
            this.f15765b = new b0<>();
        }
        MenuItem menuItem2 = this.f15765b.get(bVar);
        if (menuItem2 != null) {
            return menuItem2;
        }
        MenuItemWrapperICS menuItemWrapperICS = new MenuItemWrapperICS(this.f15764a, bVar);
        this.f15765b.put(bVar, menuItemWrapperICS);
        return menuItemWrapperICS;
    }

    /* access modifiers changed from: package-private */
    public final SubMenu d(SubMenu subMenu) {
        if (!(subMenu instanceof C6277c)) {
            return subMenu;
        }
        C6277c cVar = (C6277c) subMenu;
        if (this.f15766c == null) {
            this.f15766c = new b0<>();
        }
        SubMenu subMenu2 = this.f15766c.get(cVar);
        if (subMenu2 != null) {
            return subMenu2;
        }
        p pVar = new p(this.f15764a, cVar);
        this.f15766c.put(cVar, pVar);
        return pVar;
    }

    /* access modifiers changed from: package-private */
    public final void e() {
        b0<C6276b, MenuItem> b0Var = this.f15765b;
        if (b0Var != null) {
            b0Var.clear();
        }
        b0<C6277c, SubMenu> b0Var2 = this.f15766c;
        if (b0Var2 != null) {
            b0Var2.clear();
        }
    }

    /* access modifiers changed from: package-private */
    public final void f(int i10) {
        if (this.f15765b != null) {
            int i11 = 0;
            while (i11 < this.f15765b.size()) {
                if (this.f15765b.h(i11).getGroupId() == i10) {
                    this.f15765b.k(i11);
                    i11--;
                }
                i11++;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void g(int i10) {
        if (this.f15765b != null) {
            for (int i11 = 0; i11 < this.f15765b.size(); i11++) {
                if (this.f15765b.h(i11).getItemId() == i10) {
                    this.f15765b.k(i11);
                    return;
                }
            }
        }
    }
}
