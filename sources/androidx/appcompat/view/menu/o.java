package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.view.menu.f;

public class o extends f implements SubMenu {

    /* renamed from: B  reason: collision with root package name */
    private f f15923B;

    /* renamed from: C  reason: collision with root package name */
    private h f15924C;

    public o(Context context, f fVar, h hVar) {
        super(context);
        this.f15923B = fVar;
        this.f15924C = hVar;
    }

    public f F() {
        return this.f15923B.F();
    }

    public boolean I() {
        return this.f15923B.I();
    }

    public boolean J() {
        return this.f15923B.J();
    }

    public boolean K() {
        return this.f15923B.K();
    }

    public void W(f.a aVar) {
        this.f15923B.W(aVar);
    }

    public boolean f(h hVar) {
        return this.f15923B.f(hVar);
    }

    public MenuItem getItem() {
        return this.f15924C;
    }

    /* access modifiers changed from: package-private */
    public boolean h(f fVar, MenuItem menuItem) {
        return super.h(fVar, menuItem) || this.f15923B.h(fVar, menuItem);
    }

    public Menu j0() {
        return this.f15923B;
    }

    public boolean m(h hVar) {
        return this.f15923B.m(hVar);
    }

    public void setGroupDividerEnabled(boolean z10) {
        this.f15923B.setGroupDividerEnabled(z10);
    }

    public SubMenu setHeaderIcon(Drawable drawable) {
        return (SubMenu) super.a0(drawable);
    }

    public SubMenu setHeaderTitle(CharSequence charSequence) {
        return (SubMenu) super.d0(charSequence);
    }

    public SubMenu setHeaderView(View view) {
        return (SubMenu) super.e0(view);
    }

    public SubMenu setIcon(Drawable drawable) {
        this.f15924C.setIcon(drawable);
        return this;
    }

    public void setQwertyMode(boolean z10) {
        this.f15923B.setQwertyMode(z10);
    }

    public String v() {
        h hVar = this.f15924C;
        int itemId = hVar != null ? hVar.getItemId() : 0;
        if (itemId == 0) {
            return null;
        }
        return super.v() + ":" + itemId;
    }

    public SubMenu setHeaderIcon(int i10) {
        return (SubMenu) super.Z(i10);
    }

    public SubMenu setHeaderTitle(int i10) {
        return (SubMenu) super.c0(i10);
    }

    public SubMenu setIcon(int i10) {
        this.f15924C.setIcon(i10);
        return this;
    }
}
