package androidx.appcompat.view.menu;

import I2.C4599b;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.FrameLayout;
import java.lang.reflect.Method;
import z2.C6276b;

public class MenuItemWrapperICS extends b implements MenuItem {

    /* renamed from: d  reason: collision with root package name */
    private final C6276b f15744d;

    /* renamed from: e  reason: collision with root package name */
    private Method f15745e;

    static class CollapsibleActionViewWrapper extends FrameLayout implements androidx.appcompat.view.c {

        /* renamed from: a  reason: collision with root package name */
        final CollapsibleActionView f15746a;

        CollapsibleActionViewWrapper(View view) {
            super(view.getContext());
            this.f15746a = (CollapsibleActionView) view;
            addView(view);
        }

        /* access modifiers changed from: package-private */
        public View a() {
            return (View) this.f15746a;
        }

        public void b() {
            this.f15746a.onActionViewExpanded();
        }

        public void f() {
            this.f15746a.onActionViewCollapsed();
        }
    }

    private class a extends C4599b implements ActionProvider.VisibilityListener {

        /* renamed from: d  reason: collision with root package name */
        private C4599b.C0119b f15747d;
        /* access modifiers changed from: private */

        /* renamed from: e  reason: collision with root package name */
        public final ActionProvider f15748e;

        a(Context context, ActionProvider actionProvider) {
            super(context);
            this.f15748e = actionProvider;
        }

        public boolean a() {
            return this.f15748e.hasSubMenu();
        }

        public boolean b() {
            return this.f15748e.isVisible();
        }

        public View c() {
            return this.f15748e.onCreateActionView();
        }

        public View d(MenuItem menuItem) {
            return this.f15748e.onCreateActionView(menuItem);
        }

        public boolean e() {
            return this.f15748e.onPerformDefaultAction();
        }

        public void f(SubMenu subMenu) {
            this.f15748e.onPrepareSubMenu(MenuItemWrapperICS.this.d(subMenu));
        }

        public boolean g() {
            return this.f15748e.overridesItemVisibility();
        }

        public void j(C4599b.C0119b bVar) {
            this.f15747d = bVar;
            this.f15748e.setVisibilityListener(bVar != null ? this : null);
        }

        public void onActionProviderVisibilityChanged(boolean z10) {
            C4599b.C0119b bVar = this.f15747d;
            if (bVar != null) {
                bVar.onActionProviderVisibilityChanged(z10);
            }
        }
    }

    private class b implements MenuItem.OnActionExpandListener {

        /* renamed from: a  reason: collision with root package name */
        private final MenuItem.OnActionExpandListener f15750a;

        b(MenuItem.OnActionExpandListener onActionExpandListener) {
            this.f15750a = onActionExpandListener;
        }

        public boolean onMenuItemActionCollapse(MenuItem menuItem) {
            return this.f15750a.onMenuItemActionCollapse(MenuItemWrapperICS.this.c(menuItem));
        }

        public boolean onMenuItemActionExpand(MenuItem menuItem) {
            return this.f15750a.onMenuItemActionExpand(MenuItemWrapperICS.this.c(menuItem));
        }
    }

    private class c implements MenuItem.OnMenuItemClickListener {

        /* renamed from: a  reason: collision with root package name */
        private final MenuItem.OnMenuItemClickListener f15752a;

        c(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
            this.f15752a = onMenuItemClickListener;
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            return this.f15752a.onMenuItemClick(MenuItemWrapperICS.this.c(menuItem));
        }
    }

    public MenuItemWrapperICS(Context context, C6276b bVar) {
        super(context);
        if (bVar != null) {
            this.f15744d = bVar;
            return;
        }
        throw new IllegalArgumentException("Wrapped Object can not be null.");
    }

    public boolean collapseActionView() {
        return this.f15744d.collapseActionView();
    }

    public boolean expandActionView() {
        return this.f15744d.expandActionView();
    }

    public ActionProvider getActionProvider() {
        C4599b a10 = this.f15744d.a();
        if (a10 instanceof a) {
            return ((a) a10).f15748e;
        }
        return null;
    }

    public View getActionView() {
        View actionView = this.f15744d.getActionView();
        return actionView instanceof CollapsibleActionViewWrapper ? ((CollapsibleActionViewWrapper) actionView).a() : actionView;
    }

    public int getAlphabeticModifiers() {
        return this.f15744d.getAlphabeticModifiers();
    }

    public char getAlphabeticShortcut() {
        return this.f15744d.getAlphabeticShortcut();
    }

    public CharSequence getContentDescription() {
        return this.f15744d.getContentDescription();
    }

    public int getGroupId() {
        return this.f15744d.getGroupId();
    }

    public Drawable getIcon() {
        return this.f15744d.getIcon();
    }

    public ColorStateList getIconTintList() {
        return this.f15744d.getIconTintList();
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f15744d.getIconTintMode();
    }

    public Intent getIntent() {
        return this.f15744d.getIntent();
    }

    public int getItemId() {
        return this.f15744d.getItemId();
    }

    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f15744d.getMenuInfo();
    }

    public int getNumericModifiers() {
        return this.f15744d.getNumericModifiers();
    }

    public char getNumericShortcut() {
        return this.f15744d.getNumericShortcut();
    }

    public int getOrder() {
        return this.f15744d.getOrder();
    }

    public SubMenu getSubMenu() {
        return d(this.f15744d.getSubMenu());
    }

    public CharSequence getTitle() {
        return this.f15744d.getTitle();
    }

    public CharSequence getTitleCondensed() {
        return this.f15744d.getTitleCondensed();
    }

    public CharSequence getTooltipText() {
        return this.f15744d.getTooltipText();
    }

    public void h(boolean z10) {
        try {
            if (this.f15745e == null) {
                this.f15745e = this.f15744d.getClass().getDeclaredMethod("setExclusiveCheckable", new Class[]{Boolean.TYPE});
            }
            this.f15745e.invoke(this.f15744d, new Object[]{Boolean.valueOf(z10)});
        } catch (Exception e10) {
            Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e10);
        }
    }

    public boolean hasSubMenu() {
        return this.f15744d.hasSubMenu();
    }

    public boolean isActionViewExpanded() {
        return this.f15744d.isActionViewExpanded();
    }

    public boolean isCheckable() {
        return this.f15744d.isCheckable();
    }

    public boolean isChecked() {
        return this.f15744d.isChecked();
    }

    public boolean isEnabled() {
        return this.f15744d.isEnabled();
    }

    public boolean isVisible() {
        return this.f15744d.isVisible();
    }

    public MenuItem setActionProvider(ActionProvider actionProvider) {
        a aVar = new a(this.f15764a, actionProvider);
        C6276b bVar = this.f15744d;
        if (actionProvider == null) {
            aVar = null;
        }
        bVar.b(aVar);
        return this;
    }

    public MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new CollapsibleActionViewWrapper(view);
        }
        this.f15744d.setActionView(view);
        return this;
    }

    public MenuItem setAlphabeticShortcut(char c10) {
        this.f15744d.setAlphabeticShortcut(c10);
        return this;
    }

    public MenuItem setCheckable(boolean z10) {
        this.f15744d.setCheckable(z10);
        return this;
    }

    public MenuItem setChecked(boolean z10) {
        this.f15744d.setChecked(z10);
        return this;
    }

    public MenuItem setContentDescription(CharSequence charSequence) {
        this.f15744d.setContentDescription(charSequence);
        return this;
    }

    public MenuItem setEnabled(boolean z10) {
        this.f15744d.setEnabled(z10);
        return this;
    }

    public MenuItem setIcon(Drawable drawable) {
        this.f15744d.setIcon(drawable);
        return this;
    }

    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f15744d.setIconTintList(colorStateList);
        return this;
    }

    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f15744d.setIconTintMode(mode);
        return this;
    }

    public MenuItem setIntent(Intent intent) {
        this.f15744d.setIntent(intent);
        return this;
    }

    public MenuItem setNumericShortcut(char c10) {
        this.f15744d.setNumericShortcut(c10);
        return this;
    }

    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f15744d.setOnActionExpandListener(onActionExpandListener != null ? new b(onActionExpandListener) : null);
        return this;
    }

    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f15744d.setOnMenuItemClickListener(onMenuItemClickListener != null ? new c(onMenuItemClickListener) : null);
        return this;
    }

    public MenuItem setShortcut(char c10, char c11) {
        this.f15744d.setShortcut(c10, c11);
        return this;
    }

    public void setShowAsAction(int i10) {
        this.f15744d.setShowAsAction(i10);
    }

    public MenuItem setShowAsActionFlags(int i10) {
        this.f15744d.setShowAsActionFlags(i10);
        return this;
    }

    public MenuItem setTitle(CharSequence charSequence) {
        this.f15744d.setTitle(charSequence);
        return this;
    }

    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f15744d.setTitleCondensed(charSequence);
        return this;
    }

    public MenuItem setTooltipText(CharSequence charSequence) {
        this.f15744d.setTooltipText(charSequence);
        return this;
    }

    public MenuItem setVisible(boolean z10) {
        return this.f15744d.setVisible(z10);
    }

    public MenuItem setAlphabeticShortcut(char c10, int i10) {
        this.f15744d.setAlphabeticShortcut(c10, i10);
        return this;
    }

    public MenuItem setIcon(int i10) {
        this.f15744d.setIcon(i10);
        return this;
    }

    public MenuItem setNumericShortcut(char c10, int i10) {
        this.f15744d.setNumericShortcut(c10, i10);
        return this;
    }

    public MenuItem setShortcut(char c10, char c11, int i10, int i11) {
        this.f15744d.setShortcut(c10, c11, i10, i11);
        return this;
    }

    public MenuItem setTitle(int i10) {
        this.f15744d.setTitle(i10);
        return this;
    }

    public MenuItem setActionView(int i10) {
        this.f15744d.setActionView(i10);
        View actionView = this.f15744d.getActionView();
        if (actionView instanceof CollapsibleActionView) {
            this.f15744d.setActionView((View) new CollapsibleActionViewWrapper(actionView));
        }
        return this;
    }
}
