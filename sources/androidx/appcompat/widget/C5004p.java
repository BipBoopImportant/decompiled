package androidx.appcompat.widget;

import I2.C4600b0;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.widget.TextView;
import com.google.ar.core.ImageMetadata;
import i.C5430j;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: androidx.appcompat.widget.p  reason: case insensitive filesystem */
class C5004p {

    /* renamed from: l  reason: collision with root package name */
    private static final RectF f16561l = new RectF();
    @SuppressLint({"BanConcurrentHashMap"})

    /* renamed from: m  reason: collision with root package name */
    private static ConcurrentHashMap<String, Method> f16562m = new ConcurrentHashMap<>();

    /* renamed from: a  reason: collision with root package name */
    private int f16563a = 0;

    /* renamed from: b  reason: collision with root package name */
    private boolean f16564b = false;

    /* renamed from: c  reason: collision with root package name */
    private float f16565c = -1.0f;

    /* renamed from: d  reason: collision with root package name */
    private float f16566d = -1.0f;

    /* renamed from: e  reason: collision with root package name */
    private float f16567e = -1.0f;

    /* renamed from: f  reason: collision with root package name */
    private int[] f16568f = new int[0];

    /* renamed from: g  reason: collision with root package name */
    private boolean f16569g = false;

    /* renamed from: h  reason: collision with root package name */
    private TextPaint f16570h;

    /* renamed from: i  reason: collision with root package name */
    private final TextView f16571i;

    /* renamed from: j  reason: collision with root package name */
    private final Context f16572j;

    /* renamed from: k  reason: collision with root package name */
    private final d f16573k;

    /* renamed from: androidx.appcompat.widget.p$a */
    private static final class a {
        static StaticLayout a(CharSequence charSequence, Layout.Alignment alignment, int i10, int i11, TextView textView, TextPaint textPaint, d dVar) {
            StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i10);
            StaticLayout.Builder hyphenationFrequency = obtain.setAlignment(alignment).setLineSpacing(textView.getLineSpacingExtra(), textView.getLineSpacingMultiplier()).setIncludePad(textView.getIncludeFontPadding()).setBreakStrategy(textView.getBreakStrategy()).setHyphenationFrequency(textView.getHyphenationFrequency());
            if (i11 == -1) {
                i11 = Integer.MAX_VALUE;
            }
            hyphenationFrequency.setMaxLines(i11);
            try {
                dVar.a(obtain, textView);
            } catch (ClassCastException unused) {
                Log.w("ACTVAutoSizeHelper", "Failed to obtain TextDirectionHeuristic, auto size may be incorrect");
            }
            return obtain.build();
        }
    }

    /* renamed from: androidx.appcompat.widget.p$b */
    private static class b extends d {
        b() {
        }

        /* access modifiers changed from: package-private */
        public void a(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection((TextDirectionHeuristic) C5004p.m(textView, "getTextDirectionHeuristic", TextDirectionHeuristics.FIRSTSTRONG_LTR));
        }
    }

    /* renamed from: androidx.appcompat.widget.p$c */
    private static class c extends b {
        c() {
        }

        /* access modifiers changed from: package-private */
        public void a(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection(textView.getTextDirectionHeuristic());
        }

        /* access modifiers changed from: package-private */
        public boolean b(TextView textView) {
            return textView.isHorizontallyScrollable();
        }
    }

    /* renamed from: androidx.appcompat.widget.p$d */
    private static class d {
        d() {
        }

        /* access modifiers changed from: package-private */
        public void a(StaticLayout.Builder builder, TextView textView) {
            throw null;
        }

        /* access modifiers changed from: package-private */
        public boolean b(TextView textView) {
            return ((Boolean) C5004p.m(textView, "getHorizontallyScrolling", Boolean.FALSE)).booleanValue();
        }
    }

    C5004p(TextView textView) {
        this.f16571i = textView;
        this.f16572j = textView.getContext();
        if (Build.VERSION.SDK_INT >= 29) {
            this.f16573k = new c();
        } else {
            this.f16573k = new b();
        }
    }

    private int[] b(int[] iArr) {
        if (r0 == 0) {
            return iArr;
        }
        Arrays.sort(iArr);
        ArrayList arrayList = new ArrayList();
        for (int i10 : iArr) {
            if (i10 > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i10)) < 0) {
                arrayList.add(Integer.valueOf(i10));
            }
        }
        if (r0 == arrayList.size()) {
            return iArr;
        }
        int size = arrayList.size();
        int[] iArr2 = new int[size];
        for (int i11 = 0; i11 < size; i11++) {
            iArr2[i11] = ((Integer) arrayList.get(i11)).intValue();
        }
        return iArr2;
    }

    private void c() {
        this.f16563a = 0;
        this.f16566d = -1.0f;
        this.f16567e = -1.0f;
        this.f16565c = -1.0f;
        this.f16568f = new int[0];
        this.f16564b = false;
    }

    private int e(RectF rectF) {
        int length = this.f16568f.length;
        if (length != 0) {
            int i10 = 1;
            int i11 = length - 1;
            int i12 = 0;
            while (i10 <= i11) {
                int i13 = (i10 + i11) / 2;
                if (x(this.f16568f[i13], rectF)) {
                    int i14 = i13 + 1;
                    i12 = i10;
                    i10 = i14;
                } else {
                    i12 = i13 - 1;
                    i11 = i12;
                }
            }
            return this.f16568f[i12];
        }
        throw new IllegalStateException("No available text sizes to choose from.");
    }

    private static Method k(String str) {
        try {
            Method method = f16562m.get(str);
            if (method == null && (method = TextView.class.getDeclaredMethod(str, (Class[]) null)) != null) {
                method.setAccessible(true);
                f16562m.put(str, method);
            }
            return method;
        } catch (Exception e10) {
            Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e10);
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000c, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000f, code lost:
        android.util.Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + r4 + "() method", r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:?, code lost:
        return r5;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    @android.annotation.SuppressLint({"BanUncheckedReflection"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static <T> T m(java.lang.Object r3, java.lang.String r4, T r5) {
        /*
            java.lang.reflect.Method r0 = k(r4)     // Catch:{ Exception -> 0x000c, all -> 0x000a }
            r1 = 0
            java.lang.Object r5 = r0.invoke(r3, r1)     // Catch:{ Exception -> 0x000c, all -> 0x000a }
            goto L_0x002a
        L_0x000a:
            r3 = move-exception
            goto L_0x000e
        L_0x000c:
            r3 = move-exception
            goto L_0x000f
        L_0x000e:
            throw r3
        L_0x000f:
            java.lang.String r0 = "ACTVAutoSizeHelper"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Failed to invoke TextView#"
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = "() method"
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            android.util.Log.w(r0, r4, r3)
        L_0x002a:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C5004p.m(java.lang.Object, java.lang.String, java.lang.Object):java.lang.Object");
    }

    @SuppressLint({"BanUncheckedReflection"})
    private void s(float f10) {
        if (f10 != this.f16571i.getPaint().getTextSize()) {
            this.f16571i.getPaint().setTextSize(f10);
            boolean isInLayout = this.f16571i.isInLayout();
            if (this.f16571i.getLayout() != null) {
                this.f16564b = false;
                try {
                    Method k10 = k("nullLayouts");
                    if (k10 != null) {
                        k10.invoke(this.f16571i, (Object[]) null);
                    }
                } catch (Exception e10) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e10);
                }
                if (!isInLayout) {
                    this.f16571i.requestLayout();
                } else {
                    this.f16571i.forceLayout();
                }
                this.f16571i.invalidate();
            }
        }
    }

    private boolean u() {
        if (!y() || this.f16563a != 1) {
            this.f16564b = false;
        } else {
            if (!this.f16569g || this.f16568f.length == 0) {
                int floor = ((int) Math.floor((double) ((this.f16567e - this.f16566d) / this.f16565c))) + 1;
                int[] iArr = new int[floor];
                for (int i10 = 0; i10 < floor; i10++) {
                    iArr[i10] = Math.round(this.f16566d + (((float) i10) * this.f16565c));
                }
                this.f16568f = b(iArr);
            }
            this.f16564b = true;
        }
        return this.f16564b;
    }

    private void v(TypedArray typedArray) {
        int length = typedArray.length();
        int[] iArr = new int[length];
        if (length > 0) {
            for (int i10 = 0; i10 < length; i10++) {
                iArr[i10] = typedArray.getDimensionPixelSize(i10, -1);
            }
            this.f16568f = b(iArr);
            w();
        }
    }

    private boolean w() {
        int[] iArr = this.f16568f;
        int length = iArr.length;
        boolean z10 = length > 0;
        this.f16569g = z10;
        if (z10) {
            this.f16563a = 1;
            this.f16566d = (float) iArr[0];
            this.f16567e = (float) iArr[length - 1];
            this.f16565c = -1.0f;
        }
        return z10;
    }

    private boolean x(int i10, RectF rectF) {
        CharSequence transformation;
        CharSequence text = this.f16571i.getText();
        TransformationMethod transformationMethod = this.f16571i.getTransformationMethod();
        if (!(transformationMethod == null || (transformation = transformationMethod.getTransformation(text, this.f16571i)) == null)) {
            text = transformation;
        }
        int maxLines = this.f16571i.getMaxLines();
        l(i10);
        StaticLayout d10 = d(text, (Layout.Alignment) m(this.f16571i, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL), Math.round(rectF.right), maxLines);
        return (maxLines == -1 || (d10.getLineCount() <= maxLines && d10.getLineEnd(d10.getLineCount() - 1) == text.length())) && ((float) d10.getHeight()) <= rectF.bottom;
    }

    private boolean y() {
        return !(this.f16571i instanceof AppCompatEditText);
    }

    private void z(float f10, float f11, float f12) {
        if (f10 <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f10 + "px) is less or equal to (0px)");
        } else if (f11 <= f10) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f11 + "px) is less or equal to minimum auto-size text size (" + f10 + "px)");
        } else if (f12 > 0.0f) {
            this.f16563a = 1;
            this.f16566d = f10;
            this.f16567e = f11;
            this.f16565c = f12;
            this.f16569g = false;
        } else {
            throw new IllegalArgumentException("The auto-size step granularity (" + f12 + "px) is less or equal to (0px)");
        }
    }

    /* access modifiers changed from: package-private */
    public void a() {
        if (n()) {
            if (this.f16564b) {
                if (this.f16571i.getMeasuredHeight() > 0 && this.f16571i.getMeasuredWidth() > 0) {
                    int measuredWidth = this.f16573k.b(this.f16571i) ? ImageMetadata.SHADING_MODE : (this.f16571i.getMeasuredWidth() - this.f16571i.getTotalPaddingLeft()) - this.f16571i.getTotalPaddingRight();
                    int height = (this.f16571i.getHeight() - this.f16571i.getCompoundPaddingBottom()) - this.f16571i.getCompoundPaddingTop();
                    if (measuredWidth > 0 && height > 0) {
                        RectF rectF = f16561l;
                        synchronized (rectF) {
                            try {
                                rectF.setEmpty();
                                rectF.right = (float) measuredWidth;
                                rectF.bottom = (float) height;
                                float e10 = (float) e(rectF);
                                if (e10 != this.f16571i.getTextSize()) {
                                    t(0, e10);
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
            this.f16564b = true;
        }
    }

    /* access modifiers changed from: package-private */
    public StaticLayout d(CharSequence charSequence, Layout.Alignment alignment, int i10, int i11) {
        return a.a(charSequence, alignment, i10, i11, this.f16571i, this.f16570h, this.f16573k);
    }

    /* access modifiers changed from: package-private */
    public int f() {
        return Math.round(this.f16567e);
    }

    /* access modifiers changed from: package-private */
    public int g() {
        return Math.round(this.f16566d);
    }

    /* access modifiers changed from: package-private */
    public int h() {
        return Math.round(this.f16565c);
    }

    /* access modifiers changed from: package-private */
    public int[] i() {
        return this.f16568f;
    }

    /* access modifiers changed from: package-private */
    public int j() {
        return this.f16563a;
    }

    /* access modifiers changed from: package-private */
    public void l(int i10) {
        TextPaint textPaint = this.f16570h;
        if (textPaint == null) {
            this.f16570h = new TextPaint();
        } else {
            textPaint.reset();
        }
        this.f16570h.set(this.f16571i.getPaint());
        this.f16570h.setTextSize((float) i10);
    }

    /* access modifiers changed from: package-private */
    public boolean n() {
        return y() && this.f16563a != 0;
    }

    /* access modifiers changed from: package-private */
    public void o(AttributeSet attributeSet, int i10) {
        int resourceId;
        TypedArray obtainStyledAttributes = this.f16572j.obtainStyledAttributes(attributeSet, C5430j.f24176g0, i10, 0);
        TextView textView = this.f16571i;
        C4600b0.n0(textView, textView.getContext(), C5430j.f24176g0, attributeSet, obtainStyledAttributes, i10, 0);
        if (obtainStyledAttributes.hasValue(C5430j.f24201l0)) {
            this.f16563a = obtainStyledAttributes.getInt(C5430j.f24201l0, 0);
        }
        float dimension = obtainStyledAttributes.hasValue(C5430j.f24196k0) ? obtainStyledAttributes.getDimension(C5430j.f24196k0, -1.0f) : -1.0f;
        float dimension2 = obtainStyledAttributes.hasValue(C5430j.f24186i0) ? obtainStyledAttributes.getDimension(C5430j.f24186i0, -1.0f) : -1.0f;
        float dimension3 = obtainStyledAttributes.hasValue(C5430j.f24181h0) ? obtainStyledAttributes.getDimension(C5430j.f24181h0, -1.0f) : -1.0f;
        if (obtainStyledAttributes.hasValue(C5430j.f24191j0) && (resourceId = obtainStyledAttributes.getResourceId(C5430j.f24191j0, 0)) > 0) {
            TypedArray obtainTypedArray = obtainStyledAttributes.getResources().obtainTypedArray(resourceId);
            v(obtainTypedArray);
            obtainTypedArray.recycle();
        }
        obtainStyledAttributes.recycle();
        if (!y()) {
            this.f16563a = 0;
        } else if (this.f16563a == 1) {
            if (!this.f16569g) {
                DisplayMetrics displayMetrics = this.f16572j.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(2, 112.0f, displayMetrics);
                }
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                z(dimension2, dimension3, dimension);
            }
            u();
        }
    }

    /* access modifiers changed from: package-private */
    public void p(int i10, int i11, int i12, int i13) {
        if (y()) {
            DisplayMetrics displayMetrics = this.f16572j.getResources().getDisplayMetrics();
            z(TypedValue.applyDimension(i13, (float) i10, displayMetrics), TypedValue.applyDimension(i13, (float) i11, displayMetrics), TypedValue.applyDimension(i13, (float) i12, displayMetrics));
            if (u()) {
                a();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void q(int[] iArr, int i10) {
        if (y()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i10 == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = this.f16572j.getResources().getDisplayMetrics();
                    for (int i11 = 0; i11 < length; i11++) {
                        iArr2[i11] = Math.round(TypedValue.applyDimension(i10, (float) iArr[i11], displayMetrics));
                    }
                }
                this.f16568f = b(iArr2);
                if (!w()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                this.f16569g = false;
            }
            if (u()) {
                a();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void r(int i10) {
        if (!y()) {
            return;
        }
        if (i10 == 0) {
            c();
        } else if (i10 == 1) {
            DisplayMetrics displayMetrics = this.f16572j.getResources().getDisplayMetrics();
            z(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (u()) {
                a();
            }
        } else {
            throw new IllegalArgumentException("Unknown auto-size text type: " + i10);
        }
    }

    /* access modifiers changed from: package-private */
    public void t(int i10, float f10) {
        Context context = this.f16572j;
        s(TypedValue.applyDimension(i10, f10, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics()));
    }
}
