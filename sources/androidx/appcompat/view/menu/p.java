package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import z2.C6277c;

class p extends m implements SubMenu {

    /* renamed from: e  reason: collision with root package name */
    private final C6277c f15925e;

    p(Context context, C6277c cVar) {
        super(context, cVar);
        this.f15925e = cVar;
    }

    public void clearHeader() {
        this.f15925e.clearHeader();
    }

    public MenuItem getItem() {
        return c(this.f15925e.getItem());
    }

    public SubMenu setHeaderIcon(int i10) {
        this.f15925e.setHeaderIcon(i10);
        return this;
    }

    public SubMenu setHeaderTitle(int i10) {
        this.f15925e.setHeaderTitle(i10);
        return this;
    }

    public SubMenu setHeaderView(View view) {
        this.f15925e.setHeaderView(view);
        return this;
    }

    public SubMenu setIcon(int i10) {
        this.f15925e.setIcon(i10);
        return this;
    }

    public SubMenu setHeaderIcon(Drawable drawable) {
        this.f15925e.setHeaderIcon(drawable);
        return this;
    }

    public SubMenu setHeaderTitle(CharSequence charSequence) {
        this.f15925e.setHeaderTitle(charSequence);
        return this;
    }

    public SubMenu setIcon(Drawable drawable) {
        this.f15925e.setIcon(drawable);
        return this;
    }
}
