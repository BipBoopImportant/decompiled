package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

public abstract class TwoStatePreference extends Preference {

    /* renamed from: D  reason: collision with root package name */
    protected boolean f43568D;

    /* renamed from: E  reason: collision with root package name */
    private CharSequence f43569E;

    /* renamed from: F  reason: collision with root package name */
    private CharSequence f43570F;

    /* renamed from: G  reason: collision with root package name */
    private boolean f43571G;

    /* renamed from: H  reason: collision with root package name */
    private boolean f43572H;

    public TwoStatePreference(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
    }

    /* access modifiers changed from: protected */
    public void O() {
        super.O();
        boolean z10 = !a0();
        if (a(Boolean.valueOf(z10))) {
            b0(z10);
        }
    }

    /* access modifiers changed from: protected */
    public Object Q(TypedArray typedArray, int i10) {
        return Boolean.valueOf(typedArray.getBoolean(i10, false));
    }

    public boolean Y() {
        return (this.f43572H ? this.f43568D : !this.f43568D) || super.Y();
    }

    public boolean a0() {
        return this.f43568D;
    }

    public void b0(boolean z10) {
        boolean z11 = this.f43568D != z10;
        if (z11 || !this.f43571G) {
            this.f43568D = z10;
            this.f43571G = true;
            U(z10);
            if (z11) {
                N(Y());
                M();
            }
        }
    }

    public void c0(boolean z10) {
        this.f43572H = z10;
    }

    public void d0(CharSequence charSequence) {
        this.f43570F = charSequence;
        if (!a0()) {
            M();
        }
    }

    public void e0(CharSequence charSequence) {
        this.f43569E = charSequence;
        if (a0()) {
            M();
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void f0(android.view.View r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof android.widget.TextView
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            android.widget.TextView r5 = (android.widget.TextView) r5
            boolean r0 = r4.f43568D
            r1 = 0
            if (r0 == 0) goto L_0x001b
            java.lang.CharSequence r0 = r4.f43569E
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x001b
            java.lang.CharSequence r0 = r4.f43569E
            r5.setText(r0)
        L_0x0019:
            r0 = r1
            goto L_0x002e
        L_0x001b:
            boolean r0 = r4.f43568D
            if (r0 != 0) goto L_0x002d
            java.lang.CharSequence r0 = r4.f43570F
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x002d
            java.lang.CharSequence r0 = r4.f43570F
            r5.setText(r0)
            goto L_0x0019
        L_0x002d:
            r0 = 1
        L_0x002e:
            if (r0 == 0) goto L_0x003e
            java.lang.CharSequence r2 = r4.G()
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 != 0) goto L_0x003e
            r5.setText(r2)
            r0 = r1
        L_0x003e:
            if (r0 != 0) goto L_0x0041
            goto L_0x0043
        L_0x0041:
            r1 = 8
        L_0x0043:
            int r0 = r5.getVisibility()
            if (r1 == r0) goto L_0x004c
            r5.setVisibility(r1)
        L_0x004c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.TwoStatePreference.f0(android.view.View):void");
    }

    public TwoStatePreference(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public TwoStatePreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
