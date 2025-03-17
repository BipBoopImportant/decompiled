package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Arrays;
import java.util.HashMap;
import p2.e;
import p2.i;

public abstract class ConstraintHelper extends View {

    /* renamed from: a  reason: collision with root package name */
    protected int[] f20147a = new int[32];

    /* renamed from: b  reason: collision with root package name */
    protected int f20148b;

    /* renamed from: c  reason: collision with root package name */
    protected Context f20149c;

    /* renamed from: d  reason: collision with root package name */
    protected i f20150d;

    /* renamed from: e  reason: collision with root package name */
    protected boolean f20151e = false;

    /* renamed from: f  reason: collision with root package name */
    protected String f20152f;

    /* renamed from: g  reason: collision with root package name */
    protected String f20153g;

    /* renamed from: h  reason: collision with root package name */
    private View[] f20154h = null;

    /* renamed from: i  reason: collision with root package name */
    protected HashMap<Integer, String> f20155i = new HashMap<>();

    public ConstraintHelper(Context context) {
        super(context);
        this.f20149c = context;
        m((AttributeSet) null);
    }

    private void d(String str) {
        if (str != null && str.length() != 0 && this.f20149c != null) {
            String trim = str.trim();
            int k10 = k(trim);
            if (k10 != 0) {
                this.f20155i.put(Integer.valueOf(k10), trim);
                e(k10);
                return;
            }
            Log.w("ConstraintHelper", "Could not find id of \"" + trim + "\"");
        }
    }

    private void e(int i10) {
        if (i10 != getId()) {
            int i11 = this.f20148b + 1;
            int[] iArr = this.f20147a;
            if (i11 > iArr.length) {
                this.f20147a = Arrays.copyOf(iArr, iArr.length * 2);
            }
            int[] iArr2 = this.f20147a;
            int i12 = this.f20148b;
            iArr2[i12] = i10;
            this.f20148b = i12 + 1;
        }
    }

    private void f(String str) {
        if (str != null && str.length() != 0 && this.f20149c != null) {
            String trim = str.trim();
            ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
            if (constraintLayout == null) {
                Log.w("ConstraintHelper", "Parent not a ConstraintLayout");
                return;
            }
            int childCount = constraintLayout.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = constraintLayout.getChildAt(i10);
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if ((layoutParams instanceof ConstraintLayout.b) && trim.equals(((ConstraintLayout.b) layoutParams).f20213c0)) {
                    if (childAt.getId() == -1) {
                        Log.w("ConstraintHelper", "to use ConstraintTag view " + childAt.getClass().getSimpleName() + " must have an ID");
                    } else {
                        e(childAt.getId());
                    }
                }
            }
        }
    }

    private int j(ConstraintLayout constraintLayout, String str) {
        Resources resources;
        String str2;
        if (str == null || constraintLayout == null || (resources = this.f20149c.getResources()) == null) {
            return 0;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = constraintLayout.getChildAt(i10);
            if (childAt.getId() != -1) {
                try {
                    str2 = resources.getResourceEntryName(childAt.getId());
                } catch (Resources.NotFoundException unused) {
                    str2 = null;
                }
                if (str.equals(str2)) {
                    return childAt.getId();
                }
            }
        }
        return 0;
    }

    private int k(String str) {
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        int i10 = 0;
        if (isInEditMode() && constraintLayout != null) {
            Object l10 = constraintLayout.l(0, str);
            if (l10 instanceof Integer) {
                i10 = ((Integer) l10).intValue();
            }
        }
        if (i10 == 0 && constraintLayout != null) {
            i10 = j(constraintLayout, str);
        }
        if (i10 == 0) {
            try {
                i10 = e.class.getField(str).getInt((Object) null);
            } catch (Exception unused) {
            }
        }
        return i10 == 0 ? this.f20149c.getResources().getIdentifier(str, "id", this.f20149c.getPackageName()) : i10;
    }

    /* access modifiers changed from: protected */
    public void g() {
        ViewParent parent = getParent();
        if (parent != null && (parent instanceof ConstraintLayout)) {
            h((ConstraintLayout) parent);
        }
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.f20147a, this.f20148b);
    }

    /* access modifiers changed from: protected */
    public void h(ConstraintLayout constraintLayout) {
        int visibility = getVisibility();
        float elevation = getElevation();
        for (int i10 = 0; i10 < this.f20148b; i10++) {
            View q10 = constraintLayout.q(this.f20147a[i10]);
            if (q10 != null) {
                q10.setVisibility(visibility);
                if (elevation > 0.0f) {
                    q10.setTranslationZ(q10.getTranslationZ() + elevation);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void i(ConstraintLayout constraintLayout) {
    }

    /* access modifiers changed from: protected */
    public View[] l(ConstraintLayout constraintLayout) {
        View[] viewArr = this.f20154h;
        if (viewArr == null || viewArr.length != this.f20148b) {
            this.f20154h = new View[this.f20148b];
        }
        for (int i10 = 0; i10 < this.f20148b; i10++) {
            this.f20154h[i10] = constraintLayout.q(this.f20147a[i10]);
        }
        return this.f20154h;
    }

    /* access modifiers changed from: protected */
    public void m(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, f.f20616V0);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == f.f20783o1) {
                    String string = obtainStyledAttributes.getString(index);
                    this.f20152f = string;
                    setIds(string);
                } else if (index == f.f20792p1) {
                    String string2 = obtainStyledAttributes.getString(index);
                    this.f20153g = string2;
                    setReferenceTags(string2);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public void n(e eVar, boolean z10) {
    }

    public void o(ConstraintLayout constraintLayout) {
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.f20152f;
        if (str != null) {
            setIds(str);
        }
        String str2 = this.f20153g;
        if (str2 != null) {
            setReferenceTags(str2);
        }
    }

    public void onDraw(Canvas canvas) {
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i10, int i11) {
        if (this.f20151e) {
            super.onMeasure(i10, i11);
        } else {
            setMeasuredDimension(0, 0);
        }
    }

    public void p(ConstraintLayout constraintLayout) {
    }

    public void q(ConstraintLayout constraintLayout) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0022, code lost:
        r1 = r5.f20155i.get(java.lang.Integer.valueOf(r1));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void r(androidx.constraintlayout.widget.ConstraintLayout r6) {
        /*
            r5 = this;
            boolean r0 = r5.isInEditMode()
            if (r0 == 0) goto L_0x000b
            java.lang.String r0 = r5.f20152f
            r5.setIds(r0)
        L_0x000b:
            p2.i r0 = r5.f20150d
            if (r0 != 0) goto L_0x0010
            return
        L_0x0010:
            r0.c()
            r0 = 0
        L_0x0014:
            int r1 = r5.f20148b
            if (r0 >= r1) goto L_0x0053
            int[] r1 = r5.f20147a
            r1 = r1[r0]
            android.view.View r2 = r6.q(r1)
            if (r2 != 0) goto L_0x0045
            java.util.HashMap<java.lang.Integer, java.lang.String> r3 = r5.f20155i
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object r1 = r3.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            int r3 = r5.j(r6, r1)
            if (r3 == 0) goto L_0x0045
            int[] r2 = r5.f20147a
            r2[r0] = r3
            java.util.HashMap<java.lang.Integer, java.lang.String> r2 = r5.f20155i
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            r2.put(r4, r1)
            android.view.View r2 = r6.q(r3)
        L_0x0045:
            if (r2 == 0) goto L_0x0050
            p2.i r1 = r5.f20150d
            p2.e r2 = r6.r(r2)
            r1.a(r2)
        L_0x0050:
            int r0 = r0 + 1
            goto L_0x0014
        L_0x0053:
            p2.i r0 = r5.f20150d
            p2.f r6 = r6.f20159c
            r0.b(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintHelper.r(androidx.constraintlayout.widget.ConstraintLayout):void");
    }

    public void s() {
        if (this.f20150d != null) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams instanceof ConstraintLayout.b) {
                ((ConstraintLayout.b) layoutParams).f20251v0 = (e) this.f20150d;
            }
        }
    }

    /* access modifiers changed from: protected */
    public void setIds(String str) {
        this.f20152f = str;
        if (str != null) {
            int i10 = 0;
            this.f20148b = 0;
            while (true) {
                int indexOf = str.indexOf(44, i10);
                if (indexOf == -1) {
                    d(str.substring(i10));
                    return;
                } else {
                    d(str.substring(i10, indexOf));
                    i10 = indexOf + 1;
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void setReferenceTags(String str) {
        this.f20153g = str;
        if (str != null) {
            int i10 = 0;
            this.f20148b = 0;
            while (true) {
                int indexOf = str.indexOf(44, i10);
                if (indexOf == -1) {
                    f(str.substring(i10));
                    return;
                } else {
                    f(str.substring(i10, indexOf));
                    i10 = indexOf + 1;
                }
            }
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.f20152f = null;
        this.f20148b = 0;
        for (int e10 : iArr) {
            e(e10);
        }
    }

    public void setTag(int i10, Object obj) {
        super.setTag(i10, obj);
        if (obj == null && this.f20152f == null) {
            e(i10);
        }
    }

    public ConstraintHelper(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f20149c = context;
        m(attributeSet);
    }
}
