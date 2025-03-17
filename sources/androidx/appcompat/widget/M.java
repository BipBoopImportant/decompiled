package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import w2.C6214h;

public class M {

    /* renamed from: a  reason: collision with root package name */
    private final Context f16270a;

    /* renamed from: b  reason: collision with root package name */
    private final TypedArray f16271b;

    /* renamed from: c  reason: collision with root package name */
    private TypedValue f16272c;

    private M(Context context, TypedArray typedArray) {
        this.f16270a = context;
        this.f16271b = typedArray;
    }

    public static M t(Context context, int i10, int[] iArr) {
        return new M(context, context.obtainStyledAttributes(i10, iArr));
    }

    public static M u(Context context, AttributeSet attributeSet, int[] iArr) {
        return new M(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    public static M v(Context context, AttributeSet attributeSet, int[] iArr, int i10, int i11) {
        return new M(context, context.obtainStyledAttributes(attributeSet, iArr, i10, i11));
    }

    public boolean a(int i10, boolean z10) {
        return this.f16271b.getBoolean(i10, z10);
    }

    public int b(int i10, int i11) {
        return this.f16271b.getColor(i10, i11);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0011, code lost:
        r0 = j.C5443a.a(r2.f16270a, (r0 = r2.f16271b.getResourceId(r3, 0)));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.content.res.ColorStateList c(int r3) {
        /*
            r2 = this;
            android.content.res.TypedArray r0 = r2.f16271b
            boolean r0 = r0.hasValue(r3)
            if (r0 == 0) goto L_0x001a
            android.content.res.TypedArray r0 = r2.f16271b
            r1 = 0
            int r0 = r0.getResourceId(r3, r1)
            if (r0 == 0) goto L_0x001a
            android.content.Context r1 = r2.f16270a
            android.content.res.ColorStateList r0 = j.C5443a.a(r1, r0)
            if (r0 == 0) goto L_0x001a
            return r0
        L_0x001a:
            android.content.res.TypedArray r0 = r2.f16271b
            android.content.res.ColorStateList r3 = r0.getColorStateList(r3)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.M.c(int):android.content.res.ColorStateList");
    }

    public float d(int i10, float f10) {
        return this.f16271b.getDimension(i10, f10);
    }

    public int e(int i10, int i11) {
        return this.f16271b.getDimensionPixelOffset(i10, i11);
    }

    public int f(int i10, int i11) {
        return this.f16271b.getDimensionPixelSize(i10, i11);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r0 = r2.f16271b.getResourceId(r3, 0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.drawable.Drawable g(int r3) {
        /*
            r2 = this;
            android.content.res.TypedArray r0 = r2.f16271b
            boolean r0 = r0.hasValue(r3)
            if (r0 == 0) goto L_0x0018
            android.content.res.TypedArray r0 = r2.f16271b
            r1 = 0
            int r0 = r0.getResourceId(r3, r1)
            if (r0 == 0) goto L_0x0018
            android.content.Context r3 = r2.f16270a
            android.graphics.drawable.Drawable r3 = j.C5443a.b(r3, r0)
            return r3
        L_0x0018:
            android.content.res.TypedArray r0 = r2.f16271b
            android.graphics.drawable.Drawable r3 = r0.getDrawable(r3)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.M.g(int):android.graphics.drawable.Drawable");
    }

    public Drawable h(int i10) {
        int resourceId;
        if (!this.f16271b.hasValue(i10) || (resourceId = this.f16271b.getResourceId(i10, 0)) == 0) {
            return null;
        }
        return C4993e.b().d(this.f16270a, resourceId, true);
    }

    public float i(int i10, float f10) {
        return this.f16271b.getFloat(i10, f10);
    }

    public Typeface j(int i10, int i11, C6214h.e eVar) {
        int resourceId = this.f16271b.getResourceId(i10, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.f16272c == null) {
            this.f16272c = new TypedValue();
        }
        return C6214h.h(this.f16270a, resourceId, this.f16272c, i11, eVar);
    }

    public int k(int i10, int i11) {
        return this.f16271b.getInt(i10, i11);
    }

    public int l(int i10, int i11) {
        return this.f16271b.getInteger(i10, i11);
    }

    public int m(int i10, int i11) {
        return this.f16271b.getLayoutDimension(i10, i11);
    }

    public int n(int i10, int i11) {
        return this.f16271b.getResourceId(i10, i11);
    }

    public String o(int i10) {
        return this.f16271b.getString(i10);
    }

    public CharSequence p(int i10) {
        return this.f16271b.getText(i10);
    }

    public CharSequence[] q(int i10) {
        return this.f16271b.getTextArray(i10);
    }

    public TypedArray r() {
        return this.f16271b;
    }

    public boolean s(int i10) {
        return this.f16271b.hasValue(i10);
    }

    public TypedValue w(int i10) {
        return this.f16271b.peekValue(i10);
    }

    public void x() {
        this.f16271b.recycle();
    }
}
