package androidx.appcompat.view.menu;

import I2.C4599b;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import u2.C6012a;
import z2.C6275a;

public class f implements C6275a {

    /* renamed from: A  reason: collision with root package name */
    private static final int[] f15822A = {1, 4, 5, 3, 2, 0};

    /* renamed from: a  reason: collision with root package name */
    private final Context f15823a;

    /* renamed from: b  reason: collision with root package name */
    private final Resources f15824b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f15825c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f15826d;

    /* renamed from: e  reason: collision with root package name */
    private a f15827e;

    /* renamed from: f  reason: collision with root package name */
    private ArrayList<h> f15828f;

    /* renamed from: g  reason: collision with root package name */
    private ArrayList<h> f15829g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f15830h;

    /* renamed from: i  reason: collision with root package name */
    private ArrayList<h> f15831i;

    /* renamed from: j  reason: collision with root package name */
    private ArrayList<h> f15832j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f15833k;

    /* renamed from: l  reason: collision with root package name */
    private int f15834l = 0;

    /* renamed from: m  reason: collision with root package name */
    private ContextMenu.ContextMenuInfo f15835m;

    /* renamed from: n  reason: collision with root package name */
    CharSequence f15836n;

    /* renamed from: o  reason: collision with root package name */
    Drawable f15837o;

    /* renamed from: p  reason: collision with root package name */
    View f15838p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f15839q = false;

    /* renamed from: r  reason: collision with root package name */
    private boolean f15840r = false;

    /* renamed from: s  reason: collision with root package name */
    private boolean f15841s = false;

    /* renamed from: t  reason: collision with root package name */
    private boolean f15842t = false;

    /* renamed from: u  reason: collision with root package name */
    private boolean f15843u = false;

    /* renamed from: v  reason: collision with root package name */
    private ArrayList<h> f15844v = new ArrayList<>();

    /* renamed from: w  reason: collision with root package name */
    private CopyOnWriteArrayList<WeakReference<k>> f15845w = new CopyOnWriteArrayList<>();

    /* renamed from: x  reason: collision with root package name */
    private h f15846x;

    /* renamed from: y  reason: collision with root package name */
    private boolean f15847y = false;

    /* renamed from: z  reason: collision with root package name */
    private boolean f15848z;

    public interface a {
        boolean a(f fVar, MenuItem menuItem);

        void b(f fVar);
    }

    public interface b {
        boolean d(h hVar);
    }

    public f(Context context) {
        this.f15823a = context;
        this.f15824b = context.getResources();
        this.f15828f = new ArrayList<>();
        this.f15829g = new ArrayList<>();
        this.f15830h = true;
        this.f15831i = new ArrayList<>();
        this.f15832j = new ArrayList<>();
        this.f15833k = true;
        g0(true);
    }

    private static int D(int i10) {
        int i11 = (-65536 & i10) >> 16;
        if (i11 >= 0) {
            int[] iArr = f15822A;
            if (i11 < iArr.length) {
                return (i10 & 65535) | (iArr[i11] << 16);
            }
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    private void Q(int i10, boolean z10) {
        if (i10 >= 0 && i10 < this.f15828f.size()) {
            this.f15828f.remove(i10);
            if (z10) {
                N(true);
            }
        }
    }

    private void b0(int i10, CharSequence charSequence, int i11, Drawable drawable, View view) {
        Resources E10 = E();
        if (view != null) {
            this.f15838p = view;
            this.f15836n = null;
            this.f15837o = null;
        } else {
            if (i10 > 0) {
                this.f15836n = E10.getText(i10);
            } else if (charSequence != null) {
                this.f15836n = charSequence;
            }
            if (i11 > 0) {
                this.f15837o = C6012a.e(w(), i11);
            } else if (drawable != null) {
                this.f15837o = drawable;
            }
            this.f15838p = null;
        }
        N(false);
    }

    private h g(int i10, int i11, int i12, int i13, CharSequence charSequence, int i14) {
        return new h(this, i10, i11, i12, i13, charSequence, i14);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0019, code lost:
        if (I2.C4606e0.j(android.view.ViewConfiguration.get(r2.f15823a), r2.f15823a) != false) goto L_0x001d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void g0(boolean r3) {
        /*
            r2 = this;
            if (r3 == 0) goto L_0x001c
            android.content.res.Resources r3 = r2.f15824b
            android.content.res.Configuration r3 = r3.getConfiguration()
            int r3 = r3.keyboard
            r0 = 1
            if (r3 == r0) goto L_0x001c
            android.content.Context r3 = r2.f15823a
            android.view.ViewConfiguration r3 = android.view.ViewConfiguration.get(r3)
            android.content.Context r1 = r2.f15823a
            boolean r3 = I2.C4606e0.j(r3, r1)
            if (r3 == 0) goto L_0x001c
            goto L_0x001d
        L_0x001c:
            r0 = 0
        L_0x001d:
            r2.f15826d = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.f.g0(boolean):void");
    }

    private void i(boolean z10) {
        if (!this.f15845w.isEmpty()) {
            i0();
            Iterator<WeakReference<k>> it = this.f15845w.iterator();
            while (it.hasNext()) {
                WeakReference next = it.next();
                k kVar = (k) next.get();
                if (kVar == null) {
                    this.f15845w.remove(next);
                } else {
                    kVar.i(z10);
                }
            }
            h0();
        }
    }

    private void j(Bundle bundle) {
        Parcelable parcelable;
        SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:presenters");
        if (sparseParcelableArray != null && !this.f15845w.isEmpty()) {
            Iterator<WeakReference<k>> it = this.f15845w.iterator();
            while (it.hasNext()) {
                WeakReference next = it.next();
                k kVar = (k) next.get();
                if (kVar == null) {
                    this.f15845w.remove(next);
                } else {
                    int id2 = kVar.getId();
                    if (id2 > 0 && (parcelable = (Parcelable) sparseParcelableArray.get(id2)) != null) {
                        kVar.f(parcelable);
                    }
                }
            }
        }
    }

    private void k(Bundle bundle) {
        Parcelable h10;
        if (!this.f15845w.isEmpty()) {
            SparseArray sparseArray = new SparseArray();
            Iterator<WeakReference<k>> it = this.f15845w.iterator();
            while (it.hasNext()) {
                WeakReference next = it.next();
                k kVar = (k) next.get();
                if (kVar == null) {
                    this.f15845w.remove(next);
                } else {
                    int id2 = kVar.getId();
                    if (id2 > 0 && (h10 = kVar.h()) != null) {
                        sparseArray.put(id2, h10);
                    }
                }
            }
            bundle.putSparseParcelableArray("android:menu:presenters", sparseArray);
        }
    }

    private boolean l(o oVar, k kVar) {
        boolean z10 = false;
        if (this.f15845w.isEmpty()) {
            return false;
        }
        if (kVar != null) {
            z10 = kVar.g(oVar);
        }
        Iterator<WeakReference<k>> it = this.f15845w.iterator();
        while (it.hasNext()) {
            WeakReference next = it.next();
            k kVar2 = (k) next.get();
            if (kVar2 == null) {
                this.f15845w.remove(next);
            } else if (!z10) {
                z10 = kVar2.g(oVar);
            }
        }
        return z10;
    }

    private static int p(ArrayList<h> arrayList, int i10) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size).f() <= i10) {
                return size + 1;
            }
        }
        return 0;
    }

    public View A() {
        return this.f15838p;
    }

    public ArrayList<h> B() {
        t();
        return this.f15832j;
    }

    /* access modifiers changed from: package-private */
    public boolean C() {
        return this.f15842t;
    }

    /* access modifiers changed from: package-private */
    public Resources E() {
        return this.f15824b;
    }

    public f F() {
        return this;
    }

    public ArrayList<h> G() {
        if (!this.f15830h) {
            return this.f15829g;
        }
        this.f15829g.clear();
        int size = this.f15828f.size();
        for (int i10 = 0; i10 < size; i10++) {
            h hVar = this.f15828f.get(i10);
            if (hVar.isVisible()) {
                this.f15829g.add(hVar);
            }
        }
        this.f15830h = false;
        this.f15833k = true;
        return this.f15829g;
    }

    public boolean H() {
        return !this.f15839q;
    }

    public boolean I() {
        return this.f15847y;
    }

    /* access modifiers changed from: package-private */
    public boolean J() {
        return this.f15825c;
    }

    public boolean K() {
        return this.f15826d;
    }

    /* access modifiers changed from: package-private */
    public void L(h hVar) {
        this.f15833k = true;
        N(true);
    }

    /* access modifiers changed from: package-private */
    public void M(h hVar) {
        this.f15830h = true;
        N(true);
    }

    public void N(boolean z10) {
        if (!this.f15839q) {
            if (z10) {
                this.f15830h = true;
                this.f15833k = true;
            }
            i(z10);
            return;
        }
        this.f15840r = true;
        if (z10) {
            this.f15841s = true;
        }
    }

    public boolean O(MenuItem menuItem, int i10) {
        return P(menuItem, (k) null, i10);
    }

    public boolean P(MenuItem menuItem, k kVar, int i10) {
        h hVar = (h) menuItem;
        if (hVar == null || !hVar.isEnabled()) {
            return false;
        }
        boolean k10 = hVar.k();
        C4599b a10 = hVar.a();
        boolean z10 = a10 != null && a10.a();
        if (hVar.j()) {
            k10 |= hVar.expandActionView();
            if (k10) {
                e(true);
            }
        } else if (hVar.hasSubMenu() || z10) {
            if ((i10 & 4) == 0) {
                e(false);
            }
            if (!hVar.hasSubMenu()) {
                hVar.x(new o(w(), this, hVar));
            }
            o oVar = (o) hVar.getSubMenu();
            if (z10) {
                a10.f(oVar);
            }
            k10 |= l(oVar, kVar);
            if (!k10) {
                e(true);
            }
        } else if ((i10 & 1) == 0) {
            e(true);
        }
        return k10;
    }

    public void R(k kVar) {
        Iterator<WeakReference<k>> it = this.f15845w.iterator();
        while (it.hasNext()) {
            WeakReference next = it.next();
            k kVar2 = (k) next.get();
            if (kVar2 == null || kVar2 == kVar) {
                this.f15845w.remove(next);
            }
        }
    }

    public void S(Bundle bundle) {
        MenuItem findItem;
        if (bundle != null) {
            SparseArray sparseParcelableArray = bundle.getSparseParcelableArray(v());
            int size = size();
            for (int i10 = 0; i10 < size; i10++) {
                MenuItem item = getItem(i10);
                View actionView = item.getActionView();
                if (!(actionView == null || actionView.getId() == -1)) {
                    actionView.restoreHierarchyState(sparseParcelableArray);
                }
                if (item.hasSubMenu()) {
                    ((o) item.getSubMenu()).S(bundle);
                }
            }
            int i11 = bundle.getInt("android:menu:expandedactionview");
            if (i11 > 0 && (findItem = findItem(i11)) != null) {
                findItem.expandActionView();
            }
        }
    }

    public void T(Bundle bundle) {
        j(bundle);
    }

    public void U(Bundle bundle) {
        int size = size();
        SparseArray sparseArray = null;
        for (int i10 = 0; i10 < size; i10++) {
            MenuItem item = getItem(i10);
            View actionView = item.getActionView();
            if (!(actionView == null || actionView.getId() == -1)) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((o) item.getSubMenu()).U(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(v(), sparseArray);
        }
    }

    public void V(Bundle bundle) {
        k(bundle);
    }

    public void W(a aVar) {
        this.f15827e = aVar;
    }

    public f X(int i10) {
        this.f15834l = i10;
        return this;
    }

    /* access modifiers changed from: package-private */
    public void Y(MenuItem menuItem) {
        int groupId = menuItem.getGroupId();
        int size = this.f15828f.size();
        i0();
        for (int i10 = 0; i10 < size; i10++) {
            h hVar = this.f15828f.get(i10);
            if (hVar.getGroupId() == groupId && hVar.m() && hVar.isCheckable()) {
                hVar.s(hVar == menuItem);
            }
        }
        h0();
    }

    /* access modifiers changed from: protected */
    public f Z(int i10) {
        b0(0, (CharSequence) null, i10, (Drawable) null, (View) null);
        return this;
    }

    /* access modifiers changed from: protected */
    public MenuItem a(int i10, int i11, int i12, CharSequence charSequence) {
        int D10 = D(i12);
        h g10 = g(i10, i11, i12, D10, charSequence, this.f15834l);
        ContextMenu.ContextMenuInfo contextMenuInfo = this.f15835m;
        if (contextMenuInfo != null) {
            g10.v(contextMenuInfo);
        }
        ArrayList<h> arrayList = this.f15828f;
        arrayList.add(p(arrayList, D10), g10);
        N(true);
        return g10;
    }

    /* access modifiers changed from: protected */
    public f a0(Drawable drawable) {
        b0(0, (CharSequence) null, 0, drawable, (View) null);
        return this;
    }

    public MenuItem add(CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    public int addIntentOptions(int i10, int i11, int i12, ComponentName componentName, Intent[] intentArr, Intent intent, int i13, MenuItem[] menuItemArr) {
        int i14;
        PackageManager packageManager = this.f15823a.getPackageManager();
        List<ResolveInfo> queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = queryIntentActivityOptions != null ? queryIntentActivityOptions.size() : 0;
        if ((i13 & 1) == 0) {
            removeGroup(i10);
        }
        for (int i15 = 0; i15 < size; i15++) {
            ResolveInfo resolveInfo = queryIntentActivityOptions.get(i15);
            int i16 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i16 < 0 ? intent : intentArr[i16]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            MenuItem intent3 = add(i10, i11, i12, resolveInfo.loadLabel(packageManager)).setIcon(resolveInfo.loadIcon(packageManager)).setIntent(intent2);
            if (menuItemArr != null && (i14 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i14] = intent3;
            }
        }
        return size;
    }

    public SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public void b(k kVar) {
        c(kVar, this.f15823a);
    }

    public void c(k kVar, Context context) {
        this.f15845w.add(new WeakReference(kVar));
        kVar.l(context, this);
        this.f15833k = true;
    }

    /* access modifiers changed from: protected */
    public f c0(int i10) {
        b0(i10, (CharSequence) null, 0, (Drawable) null, (View) null);
        return this;
    }

    public void clear() {
        h hVar = this.f15846x;
        if (hVar != null) {
            f(hVar);
        }
        this.f15828f.clear();
        N(true);
    }

    public void clearHeader() {
        this.f15837o = null;
        this.f15836n = null;
        this.f15838p = null;
        N(false);
    }

    public void close() {
        e(true);
    }

    public void d() {
        a aVar = this.f15827e;
        if (aVar != null) {
            aVar.b(this);
        }
    }

    /* access modifiers changed from: protected */
    public f d0(CharSequence charSequence) {
        b0(0, charSequence, 0, (Drawable) null, (View) null);
        return this;
    }

    public final void e(boolean z10) {
        if (!this.f15843u) {
            this.f15843u = true;
            Iterator<WeakReference<k>> it = this.f15845w.iterator();
            while (it.hasNext()) {
                WeakReference next = it.next();
                k kVar = (k) next.get();
                if (kVar == null) {
                    this.f15845w.remove(next);
                } else {
                    kVar.c(this, z10);
                }
            }
            this.f15843u = false;
        }
    }

    /* access modifiers changed from: protected */
    public f e0(View view) {
        b0(0, (CharSequence) null, 0, (Drawable) null, view);
        return this;
    }

    public boolean f(h hVar) {
        boolean z10 = false;
        if (!this.f15845w.isEmpty() && this.f15846x == hVar) {
            i0();
            Iterator<WeakReference<k>> it = this.f15845w.iterator();
            while (it.hasNext()) {
                WeakReference next = it.next();
                k kVar = (k) next.get();
                if (kVar == null) {
                    this.f15845w.remove(next);
                } else {
                    z10 = kVar.k(this, hVar);
                    if (z10) {
                        break;
                    }
                }
            }
            h0();
            if (z10) {
                this.f15846x = null;
            }
        }
        return z10;
    }

    public void f0(boolean z10) {
        this.f15848z = z10;
    }

    public MenuItem findItem(int i10) {
        MenuItem findItem;
        int size = size();
        for (int i11 = 0; i11 < size; i11++) {
            h hVar = this.f15828f.get(i11);
            if (hVar.getItemId() == i10) {
                return hVar;
            }
            if (hVar.hasSubMenu() && (findItem = hVar.getSubMenu().findItem(i10)) != null) {
                return findItem;
            }
        }
        return null;
    }

    public MenuItem getItem(int i10) {
        return this.f15828f.get(i10);
    }

    /* access modifiers changed from: package-private */
    public boolean h(f fVar, MenuItem menuItem) {
        a aVar = this.f15827e;
        return aVar != null && aVar.a(fVar, menuItem);
    }

    public void h0() {
        this.f15839q = false;
        if (this.f15840r) {
            this.f15840r = false;
            N(this.f15841s);
        }
    }

    public boolean hasVisibleItems() {
        if (this.f15848z) {
            return true;
        }
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.f15828f.get(i10).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public void i0() {
        if (!this.f15839q) {
            this.f15839q = true;
            this.f15840r = false;
            this.f15841s = false;
        }
    }

    public boolean isShortcutKey(int i10, KeyEvent keyEvent) {
        return r(i10, keyEvent) != null;
    }

    public boolean m(h hVar) {
        boolean z10 = false;
        if (this.f15845w.isEmpty()) {
            return false;
        }
        i0();
        Iterator<WeakReference<k>> it = this.f15845w.iterator();
        while (it.hasNext()) {
            WeakReference next = it.next();
            k kVar = (k) next.get();
            if (kVar == null) {
                this.f15845w.remove(next);
            } else {
                z10 = kVar.d(this, hVar);
                if (z10) {
                    break;
                }
            }
        }
        h0();
        if (z10) {
            this.f15846x = hVar;
        }
        return z10;
    }

    public int n(int i10) {
        return o(i10, 0);
    }

    public int o(int i10, int i11) {
        int size = size();
        if (i11 < 0) {
            i11 = 0;
        }
        while (i11 < size) {
            if (this.f15828f.get(i11).getGroupId() == i10) {
                return i11;
            }
            i11++;
        }
        return -1;
    }

    public boolean performIdentifierAction(int i10, int i11) {
        return O(findItem(i10), i11);
    }

    public boolean performShortcut(int i10, KeyEvent keyEvent, int i11) {
        h r10 = r(i10, keyEvent);
        boolean O10 = r10 != null ? O(r10, i11) : false;
        if ((i11 & 2) != 0) {
            e(true);
        }
        return O10;
    }

    public int q(int i10) {
        int size = size();
        for (int i11 = 0; i11 < size; i11++) {
            if (this.f15828f.get(i11).getItemId() == i10) {
                return i11;
            }
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    public h r(int i10, KeyEvent keyEvent) {
        ArrayList<h> arrayList = this.f15844v;
        arrayList.clear();
        s(arrayList, i10, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return arrayList.get(0);
        }
        boolean J10 = J();
        for (int i11 = 0; i11 < size; i11++) {
            h hVar = arrayList.get(i11);
            char alphabeticShortcut = J10 ? hVar.getAlphabeticShortcut() : hVar.getNumericShortcut();
            char[] cArr = keyData.meta;
            if ((alphabeticShortcut == cArr[0] && (metaState & 2) == 0) || ((alphabeticShortcut == cArr[2] && (metaState & 2) != 0) || (J10 && alphabeticShortcut == 8 && i10 == 67))) {
                return hVar;
            }
        }
        return null;
    }

    public void removeGroup(int i10) {
        int n10 = n(i10);
        if (n10 >= 0) {
            int size = this.f15828f.size() - n10;
            int i11 = 0;
            while (true) {
                int i12 = i11 + 1;
                if (i11 >= size || this.f15828f.get(n10).getGroupId() != i10) {
                    N(true);
                } else {
                    Q(n10, false);
                    i11 = i12;
                }
            }
            N(true);
        }
    }

    public void removeItem(int i10) {
        Q(q(i10), true);
    }

    /* access modifiers changed from: package-private */
    public void s(List<h> list, int i10, KeyEvent keyEvent) {
        boolean J10 = J();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i10 == 67) {
            int size = this.f15828f.size();
            for (int i11 = 0; i11 < size; i11++) {
                h hVar = this.f15828f.get(i11);
                if (hVar.hasSubMenu()) {
                    ((f) hVar.getSubMenu()).s(list, i10, keyEvent);
                }
                char alphabeticShortcut = J10 ? hVar.getAlphabeticShortcut() : hVar.getNumericShortcut();
                if ((modifiers & 69647) == ((J10 ? hVar.getAlphabeticModifiers() : hVar.getNumericModifiers()) & 69647) && alphabeticShortcut != 0) {
                    char[] cArr = keyData.meta;
                    if ((alphabeticShortcut == cArr[0] || alphabeticShortcut == cArr[2] || (J10 && alphabeticShortcut == 8 && i10 == 67)) && hVar.isEnabled()) {
                        list.add(hVar);
                    }
                }
            }
        }
    }

    public void setGroupCheckable(int i10, boolean z10, boolean z11) {
        int size = this.f15828f.size();
        for (int i11 = 0; i11 < size; i11++) {
            h hVar = this.f15828f.get(i11);
            if (hVar.getGroupId() == i10) {
                hVar.t(z11);
                hVar.setCheckable(z10);
            }
        }
    }

    public void setGroupDividerEnabled(boolean z10) {
        this.f15847y = z10;
    }

    public void setGroupEnabled(int i10, boolean z10) {
        int size = this.f15828f.size();
        for (int i11 = 0; i11 < size; i11++) {
            h hVar = this.f15828f.get(i11);
            if (hVar.getGroupId() == i10) {
                hVar.setEnabled(z10);
            }
        }
    }

    public void setGroupVisible(int i10, boolean z10) {
        int size = this.f15828f.size();
        boolean z11 = false;
        for (int i11 = 0; i11 < size; i11++) {
            h hVar = this.f15828f.get(i11);
            if (hVar.getGroupId() == i10 && hVar.y(z10)) {
                z11 = true;
            }
        }
        if (z11) {
            N(true);
        }
    }

    public void setQwertyMode(boolean z10) {
        this.f15825c = z10;
        N(false);
    }

    public int size() {
        return this.f15828f.size();
    }

    public void t() {
        ArrayList<h> G10 = G();
        if (this.f15833k) {
            Iterator<WeakReference<k>> it = this.f15845w.iterator();
            boolean z10 = false;
            while (it.hasNext()) {
                WeakReference next = it.next();
                k kVar = (k) next.get();
                if (kVar == null) {
                    this.f15845w.remove(next);
                } else {
                    z10 |= kVar.j();
                }
            }
            if (z10) {
                this.f15831i.clear();
                this.f15832j.clear();
                int size = G10.size();
                for (int i10 = 0; i10 < size; i10++) {
                    h hVar = G10.get(i10);
                    if (hVar.l()) {
                        this.f15831i.add(hVar);
                    } else {
                        this.f15832j.add(hVar);
                    }
                }
            } else {
                this.f15831i.clear();
                this.f15832j.clear();
                this.f15832j.addAll(G());
            }
            this.f15833k = false;
        }
    }

    public ArrayList<h> u() {
        t();
        return this.f15831i;
    }

    /* access modifiers changed from: protected */
    public String v() {
        return "android:menu:actionviewstates";
    }

    public Context w() {
        return this.f15823a;
    }

    public h x() {
        return this.f15846x;
    }

    public Drawable y() {
        return this.f15837o;
    }

    public CharSequence z() {
        return this.f15836n;
    }

    public MenuItem add(int i10) {
        return a(0, 0, 0, this.f15824b.getString(i10));
    }

    public SubMenu addSubMenu(int i10) {
        return addSubMenu(0, 0, 0, (CharSequence) this.f15824b.getString(i10));
    }

    public MenuItem add(int i10, int i11, int i12, CharSequence charSequence) {
        return a(i10, i11, i12, charSequence);
    }

    public SubMenu addSubMenu(int i10, int i11, int i12, CharSequence charSequence) {
        h hVar = (h) a(i10, i11, i12, charSequence);
        o oVar = new o(this.f15823a, this, hVar);
        hVar.x(oVar);
        return oVar;
    }

    public MenuItem add(int i10, int i11, int i12, int i13) {
        return a(i10, i11, i12, this.f15824b.getString(i13));
    }

    public SubMenu addSubMenu(int i10, int i11, int i12, int i13) {
        return addSubMenu(i10, i11, i12, (CharSequence) this.f15824b.getString(i13));
    }
}
