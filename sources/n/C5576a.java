package n;

import I2.C4599b;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import u2.C6012a;
import y2.C6260a;
import z2.C6276b;

/* renamed from: n.a  reason: case insensitive filesystem */
public class C5576a implements C6276b {

    /* renamed from: a  reason: collision with root package name */
    private final int f26283a;

    /* renamed from: b  reason: collision with root package name */
    private final int f26284b;

    /* renamed from: c  reason: collision with root package name */
    private final int f26285c;

    /* renamed from: d  reason: collision with root package name */
    private CharSequence f26286d;

    /* renamed from: e  reason: collision with root package name */
    private CharSequence f26287e;

    /* renamed from: f  reason: collision with root package name */
    private Intent f26288f;

    /* renamed from: g  reason: collision with root package name */
    private char f26289g;

    /* renamed from: h  reason: collision with root package name */
    private int f26290h = RecyclerView.n.FLAG_APPEARED_IN_PRE_LAYOUT;

    /* renamed from: i  reason: collision with root package name */
    private char f26291i;

    /* renamed from: j  reason: collision with root package name */
    private int f26292j = RecyclerView.n.FLAG_APPEARED_IN_PRE_LAYOUT;

    /* renamed from: k  reason: collision with root package name */
    private Drawable f26293k;

    /* renamed from: l  reason: collision with root package name */
    private Context f26294l;

    /* renamed from: m  reason: collision with root package name */
    private MenuItem.OnMenuItemClickListener f26295m;

    /* renamed from: n  reason: collision with root package name */
    private CharSequence f26296n;

    /* renamed from: o  reason: collision with root package name */
    private CharSequence f26297o;

    /* renamed from: p  reason: collision with root package name */
    private ColorStateList f26298p = null;

    /* renamed from: q  reason: collision with root package name */
    private PorterDuff.Mode f26299q = null;

    /* renamed from: r  reason: collision with root package name */
    private boolean f26300r = false;

    /* renamed from: s  reason: collision with root package name */
    private boolean f26301s = false;

    /* renamed from: t  reason: collision with root package name */
    private int f26302t = 16;

    public C5576a(Context context, int i10, int i11, int i12, int i13, CharSequence charSequence) {
        this.f26294l = context;
        this.f26283a = i11;
        this.f26284b = i10;
        this.f26285c = i13;
        this.f26286d = charSequence;
    }

    private void c() {
        Drawable drawable = this.f26293k;
        if (drawable == null) {
            return;
        }
        if (this.f26300r || this.f26301s) {
            Drawable r10 = C6260a.r(drawable);
            this.f26293k = r10;
            Drawable mutate = r10.mutate();
            this.f26293k = mutate;
            if (this.f26300r) {
                C6260a.o(mutate, this.f26298p);
            }
            if (this.f26301s) {
                C6260a.p(this.f26293k, this.f26299q);
            }
        }
    }

    public C4599b a() {
        return null;
    }

    public C6276b b(C4599b bVar) {
        throw new UnsupportedOperationException();
    }

    public boolean collapseActionView() {
        return false;
    }

    /* renamed from: d */
    public C6276b setActionView(int i10) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: e */
    public C6276b setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    public boolean expandActionView() {
        return false;
    }

    /* renamed from: f */
    public C6276b setShowAsActionFlags(int i10) {
        setShowAsAction(i10);
        return this;
    }

    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    public View getActionView() {
        return null;
    }

    public int getAlphabeticModifiers() {
        return this.f26292j;
    }

    public char getAlphabeticShortcut() {
        return this.f26291i;
    }

    public CharSequence getContentDescription() {
        return this.f26296n;
    }

    public int getGroupId() {
        return this.f26284b;
    }

    public Drawable getIcon() {
        return this.f26293k;
    }

    public ColorStateList getIconTintList() {
        return this.f26298p;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f26299q;
    }

    public Intent getIntent() {
        return this.f26288f;
    }

    public int getItemId() {
        return this.f26283a;
    }

    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    public int getNumericModifiers() {
        return this.f26290h;
    }

    public char getNumericShortcut() {
        return this.f26289g;
    }

    public int getOrder() {
        return this.f26285c;
    }

    public SubMenu getSubMenu() {
        return null;
    }

    public CharSequence getTitle() {
        return this.f26286d;
    }

    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f26287e;
        return charSequence != null ? charSequence : this.f26286d;
    }

    public CharSequence getTooltipText() {
        return this.f26297o;
    }

    public boolean hasSubMenu() {
        return false;
    }

    public boolean isActionViewExpanded() {
        return false;
    }

    public boolean isCheckable() {
        return (this.f26302t & 1) != 0;
    }

    public boolean isChecked() {
        return (this.f26302t & 2) != 0;
    }

    public boolean isEnabled() {
        return (this.f26302t & 16) != 0;
    }

    public boolean isVisible() {
        return (this.f26302t & 8) == 0;
    }

    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    public MenuItem setAlphabeticShortcut(char c10) {
        this.f26291i = Character.toLowerCase(c10);
        return this;
    }

    public MenuItem setCheckable(boolean z10) {
        this.f26302t = z10 | (this.f26302t & true) ? 1 : 0;
        return this;
    }

    public MenuItem setChecked(boolean z10) {
        this.f26302t = (z10 ? 2 : 0) | (this.f26302t & -3);
        return this;
    }

    public MenuItem setEnabled(boolean z10) {
        this.f26302t = (z10 ? 16 : 0) | (this.f26302t & -17);
        return this;
    }

    public MenuItem setIcon(Drawable drawable) {
        this.f26293k = drawable;
        c();
        return this;
    }

    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f26298p = colorStateList;
        this.f26300r = true;
        c();
        return this;
    }

    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f26299q = mode;
        this.f26301s = true;
        c();
        return this;
    }

    public MenuItem setIntent(Intent intent) {
        this.f26288f = intent;
        return this;
    }

    public MenuItem setNumericShortcut(char c10) {
        this.f26289g = c10;
        return this;
    }

    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f26295m = onMenuItemClickListener;
        return this;
    }

    public MenuItem setShortcut(char c10, char c11) {
        this.f26289g = c10;
        this.f26291i = Character.toLowerCase(c11);
        return this;
    }

    public void setShowAsAction(int i10) {
    }

    public MenuItem setTitle(CharSequence charSequence) {
        this.f26286d = charSequence;
        return this;
    }

    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f26287e = charSequence;
        return this;
    }

    public MenuItem setVisible(boolean z10) {
        int i10 = 8;
        int i11 = this.f26302t & 8;
        if (z10) {
            i10 = 0;
        }
        this.f26302t = i11 | i10;
        return this;
    }

    public MenuItem setAlphabeticShortcut(char c10, int i10) {
        this.f26291i = Character.toLowerCase(c10);
        this.f26292j = KeyEvent.normalizeMetaState(i10);
        return this;
    }

    public C6276b setContentDescription(CharSequence charSequence) {
        this.f26296n = charSequence;
        return this;
    }

    public MenuItem setNumericShortcut(char c10, int i10) {
        this.f26289g = c10;
        this.f26290h = KeyEvent.normalizeMetaState(i10);
        return this;
    }

    public MenuItem setTitle(int i10) {
        this.f26286d = this.f26294l.getResources().getString(i10);
        return this;
    }

    public C6276b setTooltipText(CharSequence charSequence) {
        this.f26297o = charSequence;
        return this;
    }

    public MenuItem setIcon(int i10) {
        this.f26293k = C6012a.e(this.f26294l, i10);
        c();
        return this;
    }

    public MenuItem setShortcut(char c10, char c11, int i10, int i11) {
        this.f26289g = c10;
        this.f26290h = KeyEvent.normalizeMetaState(i10);
        this.f26291i = Character.toLowerCase(c11);
        this.f26292j = KeyEvent.normalizeMetaState(i11);
        return this;
    }
}
