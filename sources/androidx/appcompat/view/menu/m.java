package androidx.appcompat.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import z2.C6275a;

public class m extends b implements Menu {

    /* renamed from: d  reason: collision with root package name */
    private final C6275a f15899d;

    public m(Context context, C6275a aVar) {
        super(context);
        if (aVar != null) {
            this.f15899d = aVar;
            return;
        }
        throw new IllegalArgumentException("Wrapped Object can not be null.");
    }

    public MenuItem add(CharSequence charSequence) {
        return c(this.f15899d.add(charSequence));
    }

    public int addIntentOptions(int i10, int i11, int i12, ComponentName componentName, Intent[] intentArr, Intent intent, int i13, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2 = menuItemArr;
        MenuItem[] menuItemArr3 = menuItemArr2 != null ? new MenuItem[menuItemArr2.length] : null;
        int addIntentOptions = this.f15899d.addIntentOptions(i10, i11, i12, componentName, intentArr, intent, i13, menuItemArr3);
        if (menuItemArr3 != null) {
            int length = menuItemArr3.length;
            for (int i14 = 0; i14 < length; i14++) {
                menuItemArr2[i14] = c(menuItemArr3[i14]);
            }
        }
        return addIntentOptions;
    }

    public SubMenu addSubMenu(CharSequence charSequence) {
        return d(this.f15899d.addSubMenu(charSequence));
    }

    public void clear() {
        e();
        this.f15899d.clear();
    }

    public void close() {
        this.f15899d.close();
    }

    public MenuItem findItem(int i10) {
        return c(this.f15899d.findItem(i10));
    }

    public MenuItem getItem(int i10) {
        return c(this.f15899d.getItem(i10));
    }

    public boolean hasVisibleItems() {
        return this.f15899d.hasVisibleItems();
    }

    public boolean isShortcutKey(int i10, KeyEvent keyEvent) {
        return this.f15899d.isShortcutKey(i10, keyEvent);
    }

    public boolean performIdentifierAction(int i10, int i11) {
        return this.f15899d.performIdentifierAction(i10, i11);
    }

    public boolean performShortcut(int i10, KeyEvent keyEvent, int i11) {
        return this.f15899d.performShortcut(i10, keyEvent, i11);
    }

    public void removeGroup(int i10) {
        f(i10);
        this.f15899d.removeGroup(i10);
    }

    public void removeItem(int i10) {
        g(i10);
        this.f15899d.removeItem(i10);
    }

    public void setGroupCheckable(int i10, boolean z10, boolean z11) {
        this.f15899d.setGroupCheckable(i10, z10, z11);
    }

    public void setGroupEnabled(int i10, boolean z10) {
        this.f15899d.setGroupEnabled(i10, z10);
    }

    public void setGroupVisible(int i10, boolean z10) {
        this.f15899d.setGroupVisible(i10, z10);
    }

    public void setQwertyMode(boolean z10) {
        this.f15899d.setQwertyMode(z10);
    }

    public int size() {
        return this.f15899d.size();
    }

    public MenuItem add(int i10) {
        return c(this.f15899d.add(i10));
    }

    public SubMenu addSubMenu(int i10) {
        return d(this.f15899d.addSubMenu(i10));
    }

    public MenuItem add(int i10, int i11, int i12, CharSequence charSequence) {
        return c(this.f15899d.add(i10, i11, i12, charSequence));
    }

    public SubMenu addSubMenu(int i10, int i11, int i12, CharSequence charSequence) {
        return d(this.f15899d.addSubMenu(i10, i11, i12, charSequence));
    }

    public MenuItem add(int i10, int i11, int i12, int i13) {
        return c(this.f15899d.add(i10, i11, i12, i13));
    }

    public SubMenu addSubMenu(int i10, int i11, int i12, int i13) {
        return d(this.f15899d.addSubMenu(i10, i11, i12, i13));
    }
}
