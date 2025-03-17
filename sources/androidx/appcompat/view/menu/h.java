package androidx.appcompat.view.menu;

import I2.C4599b;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewDebug;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.l;
import androidx.recyclerview.widget.RecyclerView;
import com.google.ar.core.ImageMetadata;
import i.C5428h;
import j.C5443a;
import y2.C6260a;
import z2.C6276b;

public final class h implements C6276b {

    /* renamed from: A  reason: collision with root package name */
    private View f15853A;

    /* renamed from: B  reason: collision with root package name */
    private C4599b f15854B;

    /* renamed from: C  reason: collision with root package name */
    private MenuItem.OnActionExpandListener f15855C;

    /* renamed from: D  reason: collision with root package name */
    private boolean f15856D = false;

    /* renamed from: E  reason: collision with root package name */
    private ContextMenu.ContextMenuInfo f15857E;

    /* renamed from: a  reason: collision with root package name */
    private final int f15858a;

    /* renamed from: b  reason: collision with root package name */
    private final int f15859b;

    /* renamed from: c  reason: collision with root package name */
    private final int f15860c;

    /* renamed from: d  reason: collision with root package name */
    private final int f15861d;

    /* renamed from: e  reason: collision with root package name */
    private CharSequence f15862e;

    /* renamed from: f  reason: collision with root package name */
    private CharSequence f15863f;

    /* renamed from: g  reason: collision with root package name */
    private Intent f15864g;

    /* renamed from: h  reason: collision with root package name */
    private char f15865h;

    /* renamed from: i  reason: collision with root package name */
    private int f15866i = RecyclerView.n.FLAG_APPEARED_IN_PRE_LAYOUT;

    /* renamed from: j  reason: collision with root package name */
    private char f15867j;

    /* renamed from: k  reason: collision with root package name */
    private int f15868k = RecyclerView.n.FLAG_APPEARED_IN_PRE_LAYOUT;

    /* renamed from: l  reason: collision with root package name */
    private Drawable f15869l;

    /* renamed from: m  reason: collision with root package name */
    private int f15870m = 0;

    /* renamed from: n  reason: collision with root package name */
    f f15871n;

    /* renamed from: o  reason: collision with root package name */
    private o f15872o;

    /* renamed from: p  reason: collision with root package name */
    private Runnable f15873p;

    /* renamed from: q  reason: collision with root package name */
    private MenuItem.OnMenuItemClickListener f15874q;

    /* renamed from: r  reason: collision with root package name */
    private CharSequence f15875r;

    /* renamed from: s  reason: collision with root package name */
    private CharSequence f15876s;

    /* renamed from: t  reason: collision with root package name */
    private ColorStateList f15877t = null;

    /* renamed from: u  reason: collision with root package name */
    private PorterDuff.Mode f15878u = null;

    /* renamed from: v  reason: collision with root package name */
    private boolean f15879v = false;

    /* renamed from: w  reason: collision with root package name */
    private boolean f15880w = false;

    /* renamed from: x  reason: collision with root package name */
    private boolean f15881x = false;

    /* renamed from: y  reason: collision with root package name */
    private int f15882y = 16;

    /* renamed from: z  reason: collision with root package name */
    private int f15883z;

    class a implements C4599b.C0119b {
        a() {
        }

        public void onActionProviderVisibilityChanged(boolean z10) {
            h hVar = h.this;
            hVar.f15871n.M(hVar);
        }
    }

    h(f fVar, int i10, int i11, int i12, int i13, CharSequence charSequence, int i14) {
        this.f15871n = fVar;
        this.f15858a = i11;
        this.f15859b = i10;
        this.f15860c = i12;
        this.f15861d = i13;
        this.f15862e = charSequence;
        this.f15883z = i14;
    }

    private static void d(StringBuilder sb2, int i10, int i11, String str) {
        if ((i10 & i11) == i11) {
            sb2.append(str);
        }
    }

    private Drawable e(Drawable drawable) {
        if (drawable != null && this.f15881x && (this.f15879v || this.f15880w)) {
            drawable = C6260a.r(drawable).mutate();
            if (this.f15879v) {
                C6260a.o(drawable, this.f15877t);
            }
            if (this.f15880w) {
                C6260a.p(drawable, this.f15878u);
            }
            this.f15881x = false;
        }
        return drawable;
    }

    /* access modifiers changed from: package-private */
    public boolean A() {
        return this.f15871n.K() && g() != 0;
    }

    public boolean B() {
        return (this.f15883z & 4) == 4;
    }

    public C4599b a() {
        return this.f15854B;
    }

    public C6276b b(C4599b bVar) {
        C4599b bVar2 = this.f15854B;
        if (bVar2 != null) {
            bVar2.h();
        }
        this.f15853A = null;
        this.f15854B = bVar;
        this.f15871n.N(true);
        C4599b bVar3 = this.f15854B;
        if (bVar3 != null) {
            bVar3.j(new a());
        }
        return this;
    }

    public void c() {
        this.f15871n.L(this);
    }

    public boolean collapseActionView() {
        if ((this.f15883z & 8) == 0) {
            return false;
        }
        if (this.f15853A == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f15855C;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f15871n.f(this);
        }
        return false;
    }

    public boolean expandActionView() {
        if (!j()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f15855C;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f15871n.m(this);
        }
        return false;
    }

    public int f() {
        return this.f15861d;
    }

    /* access modifiers changed from: package-private */
    public char g() {
        return this.f15871n.J() ? this.f15867j : this.f15865h;
    }

    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    public View getActionView() {
        View view = this.f15853A;
        if (view != null) {
            return view;
        }
        C4599b bVar = this.f15854B;
        if (bVar == null) {
            return null;
        }
        View d10 = bVar.d(this);
        this.f15853A = d10;
        return d10;
    }

    public int getAlphabeticModifiers() {
        return this.f15868k;
    }

    public char getAlphabeticShortcut() {
        return this.f15867j;
    }

    public CharSequence getContentDescription() {
        return this.f15875r;
    }

    public int getGroupId() {
        return this.f15859b;
    }

    public Drawable getIcon() {
        Drawable drawable = this.f15869l;
        if (drawable != null) {
            return e(drawable);
        }
        if (this.f15870m == 0) {
            return null;
        }
        Drawable b10 = C5443a.b(this.f15871n.w(), this.f15870m);
        this.f15870m = 0;
        this.f15869l = b10;
        return e(b10);
    }

    public ColorStateList getIconTintList() {
        return this.f15877t;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f15878u;
    }

    public Intent getIntent() {
        return this.f15864g;
    }

    @ViewDebug.CapturedViewProperty
    public int getItemId() {
        return this.f15858a;
    }

    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f15857E;
    }

    public int getNumericModifiers() {
        return this.f15866i;
    }

    public char getNumericShortcut() {
        return this.f15865h;
    }

    public int getOrder() {
        return this.f15860c;
    }

    public SubMenu getSubMenu() {
        return this.f15872o;
    }

    @ViewDebug.CapturedViewProperty
    public CharSequence getTitle() {
        return this.f15862e;
    }

    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f15863f;
        return charSequence != null ? charSequence : this.f15862e;
    }

    public CharSequence getTooltipText() {
        return this.f15876s;
    }

    /* access modifiers changed from: package-private */
    public String h() {
        char g10 = g();
        if (g10 == 0) {
            return "";
        }
        Resources resources = this.f15871n.w().getResources();
        StringBuilder sb2 = new StringBuilder();
        if (ViewConfiguration.get(this.f15871n.w()).hasPermanentMenuKey()) {
            sb2.append(resources.getString(C5428h.f24036m));
        }
        int i10 = this.f15871n.J() ? this.f15868k : this.f15866i;
        d(sb2, i10, ImageMetadata.CONTROL_AE_ANTIBANDING_MODE, resources.getString(C5428h.f24032i));
        d(sb2, i10, RecyclerView.n.FLAG_APPEARED_IN_PRE_LAYOUT, resources.getString(C5428h.f24028e));
        d(sb2, i10, 2, resources.getString(C5428h.f24027d));
        d(sb2, i10, 1, resources.getString(C5428h.f24033j));
        d(sb2, i10, 4, resources.getString(C5428h.f24035l));
        d(sb2, i10, 8, resources.getString(C5428h.f24031h));
        if (g10 == 8) {
            sb2.append(resources.getString(C5428h.f24029f));
        } else if (g10 == 10) {
            sb2.append(resources.getString(C5428h.f24030g));
        } else if (g10 != ' ') {
            sb2.append(g10);
        } else {
            sb2.append(resources.getString(C5428h.f24034k));
        }
        return sb2.toString();
    }

    public boolean hasSubMenu() {
        return this.f15872o != null;
    }

    /* access modifiers changed from: package-private */
    public CharSequence i(l.a aVar) {
        return (aVar == null || !aVar.e()) ? getTitle() : getTitleCondensed();
    }

    public boolean isActionViewExpanded() {
        return this.f15856D;
    }

    public boolean isCheckable() {
        return (this.f15882y & 1) == 1;
    }

    public boolean isChecked() {
        return (this.f15882y & 2) == 2;
    }

    public boolean isEnabled() {
        return (this.f15882y & 16) != 0;
    }

    public boolean isVisible() {
        C4599b bVar = this.f15854B;
        return (bVar == null || !bVar.g()) ? (this.f15882y & 8) == 0 : (this.f15882y & 8) == 0 && this.f15854B.b();
    }

    public boolean j() {
        C4599b bVar;
        if ((this.f15883z & 8) == 0) {
            return false;
        }
        if (this.f15853A == null && (bVar = this.f15854B) != null) {
            this.f15853A = bVar.d(this);
        }
        return this.f15853A != null;
    }

    public boolean k() {
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.f15874q;
        if (onMenuItemClickListener != null && onMenuItemClickListener.onMenuItemClick(this)) {
            return true;
        }
        f fVar = this.f15871n;
        if (fVar.h(fVar, this)) {
            return true;
        }
        Runnable runnable = this.f15873p;
        if (runnable != null) {
            runnable.run();
            return true;
        }
        if (this.f15864g != null) {
            try {
                this.f15871n.w().startActivity(this.f15864g);
                return true;
            } catch (ActivityNotFoundException e10) {
                Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e10);
            }
        }
        C4599b bVar = this.f15854B;
        return bVar != null && bVar.e();
    }

    public boolean l() {
        return (this.f15882y & 32) == 32;
    }

    public boolean m() {
        return (this.f15882y & 4) != 0;
    }

    public boolean n() {
        return (this.f15883z & 1) == 1;
    }

    public boolean o() {
        return (this.f15883z & 2) == 2;
    }

    /* renamed from: p */
    public C6276b setActionView(int i10) {
        Context w10 = this.f15871n.w();
        setActionView(LayoutInflater.from(w10).inflate(i10, new LinearLayout(w10), false));
        return this;
    }

    /* renamed from: q */
    public C6276b setActionView(View view) {
        int i10;
        this.f15853A = view;
        this.f15854B = null;
        if (view != null && view.getId() == -1 && (i10 = this.f15858a) > 0) {
            view.setId(i10);
        }
        this.f15871n.L(this);
        return this;
    }

    public void r(boolean z10) {
        this.f15856D = z10;
        this.f15871n.N(false);
    }

    /* access modifiers changed from: package-private */
    public void s(boolean z10) {
        int i10 = this.f15882y;
        int i11 = (z10 ? 2 : 0) | (i10 & -3);
        this.f15882y = i11;
        if (i10 != i11) {
            this.f15871n.N(false);
        }
    }

    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    public MenuItem setAlphabeticShortcut(char c10) {
        if (this.f15867j == c10) {
            return this;
        }
        this.f15867j = Character.toLowerCase(c10);
        this.f15871n.N(false);
        return this;
    }

    public MenuItem setCheckable(boolean z10) {
        int i10 = this.f15882y;
        boolean z11 = z10 | (i10 & true);
        this.f15882y = z11 ? 1 : 0;
        if (i10 != z11) {
            this.f15871n.N(false);
        }
        return this;
    }

    public MenuItem setChecked(boolean z10) {
        if ((this.f15882y & 4) != 0) {
            this.f15871n.Y(this);
        } else {
            s(z10);
        }
        return this;
    }

    public MenuItem setEnabled(boolean z10) {
        if (z10) {
            this.f15882y |= 16;
        } else {
            this.f15882y &= -17;
        }
        this.f15871n.N(false);
        return this;
    }

    public MenuItem setIcon(Drawable drawable) {
        this.f15870m = 0;
        this.f15869l = drawable;
        this.f15881x = true;
        this.f15871n.N(false);
        return this;
    }

    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f15877t = colorStateList;
        this.f15879v = true;
        this.f15881x = true;
        this.f15871n.N(false);
        return this;
    }

    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f15878u = mode;
        this.f15880w = true;
        this.f15881x = true;
        this.f15871n.N(false);
        return this;
    }

    public MenuItem setIntent(Intent intent) {
        this.f15864g = intent;
        return this;
    }

    public MenuItem setNumericShortcut(char c10) {
        if (this.f15865h == c10) {
            return this;
        }
        this.f15865h = c10;
        this.f15871n.N(false);
        return this;
    }

    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f15855C = onActionExpandListener;
        return this;
    }

    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f15874q = onMenuItemClickListener;
        return this;
    }

    public MenuItem setShortcut(char c10, char c11) {
        this.f15865h = c10;
        this.f15867j = Character.toLowerCase(c11);
        this.f15871n.N(false);
        return this;
    }

    public void setShowAsAction(int i10) {
        int i11 = i10 & 3;
        if (i11 == 0 || i11 == 1 || i11 == 2) {
            this.f15883z = i10;
            this.f15871n.L(this);
            return;
        }
        throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
    }

    public MenuItem setTitle(CharSequence charSequence) {
        this.f15862e = charSequence;
        this.f15871n.N(false);
        o oVar = this.f15872o;
        if (oVar != null) {
            oVar.setHeaderTitle(charSequence);
        }
        return this;
    }

    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f15863f = charSequence;
        this.f15871n.N(false);
        return this;
    }

    public MenuItem setVisible(boolean z10) {
        if (y(z10)) {
            this.f15871n.M(this);
        }
        return this;
    }

    public void t(boolean z10) {
        this.f15882y = (z10 ? 4 : 0) | (this.f15882y & -5);
    }

    public String toString() {
        CharSequence charSequence = this.f15862e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    public void u(boolean z10) {
        if (z10) {
            this.f15882y |= 32;
        } else {
            this.f15882y &= -33;
        }
    }

    /* access modifiers changed from: package-private */
    public void v(ContextMenu.ContextMenuInfo contextMenuInfo) {
        this.f15857E = contextMenuInfo;
    }

    /* renamed from: w */
    public C6276b setShowAsActionFlags(int i10) {
        setShowAsAction(i10);
        return this;
    }

    public void x(o oVar) {
        this.f15872o = oVar;
        oVar.setHeaderTitle(getTitle());
    }

    /* access modifiers changed from: package-private */
    public boolean y(boolean z10) {
        int i10 = this.f15882y;
        int i11 = (z10 ? 0 : 8) | (i10 & -9);
        this.f15882y = i11;
        return i10 != i11;
    }

    public boolean z() {
        return this.f15871n.C();
    }

    public C6276b setContentDescription(CharSequence charSequence) {
        this.f15875r = charSequence;
        this.f15871n.N(false);
        return this;
    }

    public C6276b setTooltipText(CharSequence charSequence) {
        this.f15876s = charSequence;
        this.f15871n.N(false);
        return this;
    }

    public MenuItem setAlphabeticShortcut(char c10, int i10) {
        if (this.f15867j == c10 && this.f15868k == i10) {
            return this;
        }
        this.f15867j = Character.toLowerCase(c10);
        this.f15868k = KeyEvent.normalizeMetaState(i10);
        this.f15871n.N(false);
        return this;
    }

    public MenuItem setNumericShortcut(char c10, int i10) {
        if (this.f15865h == c10 && this.f15866i == i10) {
            return this;
        }
        this.f15865h = c10;
        this.f15866i = KeyEvent.normalizeMetaState(i10);
        this.f15871n.N(false);
        return this;
    }

    public MenuItem setShortcut(char c10, char c11, int i10, int i11) {
        this.f15865h = c10;
        this.f15866i = KeyEvent.normalizeMetaState(i10);
        this.f15867j = Character.toLowerCase(c11);
        this.f15868k = KeyEvent.normalizeMetaState(i11);
        this.f15871n.N(false);
        return this;
    }

    public MenuItem setIcon(int i10) {
        this.f15869l = null;
        this.f15870m = i10;
        this.f15881x = true;
        this.f15871n.N(false);
        return this;
    }

    public MenuItem setTitle(int i10) {
        return setTitle((CharSequence) this.f15871n.w().getString(i10));
    }
}
