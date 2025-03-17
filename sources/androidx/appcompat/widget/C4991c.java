package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.CheckedTextView;
import androidx.core.widget.b;
import y2.C6260a;

/* renamed from: androidx.appcompat.widget.c  reason: case insensitive filesystem */
class C4991c {

    /* renamed from: a  reason: collision with root package name */
    private final CheckedTextView f16497a;

    /* renamed from: b  reason: collision with root package name */
    private ColorStateList f16498b = null;

    /* renamed from: c  reason: collision with root package name */
    private PorterDuff.Mode f16499c = null;

    /* renamed from: d  reason: collision with root package name */
    private boolean f16500d = false;

    /* renamed from: e  reason: collision with root package name */
    private boolean f16501e = false;

    /* renamed from: f  reason: collision with root package name */
    private boolean f16502f;

    C4991c(CheckedTextView checkedTextView) {
        this.f16497a = checkedTextView;
    }

    /* access modifiers changed from: package-private */
    public void a() {
        Drawable a10 = b.a(this.f16497a);
        if (a10 == null) {
            return;
        }
        if (this.f16500d || this.f16501e) {
            Drawable mutate = C6260a.r(a10).mutate();
            if (this.f16500d) {
                C6260a.o(mutate, this.f16498b);
            }
            if (this.f16501e) {
                C6260a.p(mutate, this.f16499c);
            }
            if (mutate.isStateful()) {
                mutate.setState(this.f16497a.getDrawableState());
            }
            this.f16497a.setCheckMarkDrawable(mutate);
        }
    }

    /* access modifiers changed from: package-private */
    public ColorStateList b() {
        return this.f16498b;
    }

    /* access modifiers changed from: package-private */
    public PorterDuff.Mode c() {
        return this.f16499c;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Can't wrap try/catch for region: R(13:0|1|2|(2:6|7)|9|10|(1:14)|15|(1:17)|18|(1:20)|21|22) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x003f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void d(android.util.AttributeSet r11, int r12) {
        /*
            r10 = this;
            android.widget.CheckedTextView r0 = r10.f16497a
            android.content.Context r0 = r0.getContext()
            int[] r1 = i.C5430j.f24102P0
            r2 = 0
            androidx.appcompat.widget.M r0 = androidx.appcompat.widget.M.v(r0, r11, r1, r12, r2)
            android.widget.CheckedTextView r3 = r10.f16497a
            android.content.Context r4 = r3.getContext()
            int[] r5 = i.C5430j.f24102P0
            android.content.res.TypedArray r7 = r0.r()
            r9 = 0
            r6 = r11
            r8 = r12
            I2.C4600b0.n0(r3, r4, r5, r6, r7, r8, r9)
            int r11 = i.C5430j.f24110R0     // Catch:{ all -> 0x003d }
            boolean r11 = r0.s(r11)     // Catch:{ all -> 0x003d }
            if (r11 == 0) goto L_0x003f
            int r11 = i.C5430j.f24110R0     // Catch:{ all -> 0x003d }
            int r11 = r0.n(r11, r2)     // Catch:{ all -> 0x003d }
            if (r11 == 0) goto L_0x003f
            android.widget.CheckedTextView r12 = r10.f16497a     // Catch:{ NotFoundException -> 0x003f }
            android.content.Context r1 = r12.getContext()     // Catch:{ NotFoundException -> 0x003f }
            android.graphics.drawable.Drawable r11 = j.C5443a.b(r1, r11)     // Catch:{ NotFoundException -> 0x003f }
            r12.setCheckMarkDrawable(r11)     // Catch:{ NotFoundException -> 0x003f }
            goto L_0x005c
        L_0x003d:
            r11 = move-exception
            goto L_0x008c
        L_0x003f:
            int r11 = i.C5430j.f24106Q0     // Catch:{ all -> 0x003d }
            boolean r11 = r0.s(r11)     // Catch:{ all -> 0x003d }
            if (r11 == 0) goto L_0x005c
            int r11 = i.C5430j.f24106Q0     // Catch:{ all -> 0x003d }
            int r11 = r0.n(r11, r2)     // Catch:{ all -> 0x003d }
            if (r11 == 0) goto L_0x005c
            android.widget.CheckedTextView r12 = r10.f16497a     // Catch:{ all -> 0x003d }
            android.content.Context r1 = r12.getContext()     // Catch:{ all -> 0x003d }
            android.graphics.drawable.Drawable r11 = j.C5443a.b(r1, r11)     // Catch:{ all -> 0x003d }
            r12.setCheckMarkDrawable(r11)     // Catch:{ all -> 0x003d }
        L_0x005c:
            int r11 = i.C5430j.f24114S0     // Catch:{ all -> 0x003d }
            boolean r11 = r0.s(r11)     // Catch:{ all -> 0x003d }
            if (r11 == 0) goto L_0x006f
            android.widget.CheckedTextView r11 = r10.f16497a     // Catch:{ all -> 0x003d }
            int r12 = i.C5430j.f24114S0     // Catch:{ all -> 0x003d }
            android.content.res.ColorStateList r12 = r0.c(r12)     // Catch:{ all -> 0x003d }
            androidx.core.widget.b.b(r11, r12)     // Catch:{ all -> 0x003d }
        L_0x006f:
            int r11 = i.C5430j.f24118T0     // Catch:{ all -> 0x003d }
            boolean r11 = r0.s(r11)     // Catch:{ all -> 0x003d }
            if (r11 == 0) goto L_0x0088
            android.widget.CheckedTextView r11 = r10.f16497a     // Catch:{ all -> 0x003d }
            int r12 = i.C5430j.f24118T0     // Catch:{ all -> 0x003d }
            r1 = -1
            int r12 = r0.k(r12, r1)     // Catch:{ all -> 0x003d }
            r1 = 0
            android.graphics.PorterDuff$Mode r12 = androidx.appcompat.widget.y.e(r12, r1)     // Catch:{ all -> 0x003d }
            androidx.core.widget.b.c(r11, r12)     // Catch:{ all -> 0x003d }
        L_0x0088:
            r0.x()
            return
        L_0x008c:
            r0.x()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C4991c.d(android.util.AttributeSet, int):void");
    }

    /* access modifiers changed from: package-private */
    public void e() {
        if (this.f16502f) {
            this.f16502f = false;
            return;
        }
        this.f16502f = true;
        a();
    }

    /* access modifiers changed from: package-private */
    public void f(ColorStateList colorStateList) {
        this.f16498b = colorStateList;
        this.f16500d = true;
        a();
    }

    /* access modifiers changed from: package-private */
    public void g(PorterDuff.Mode mode) {
        this.f16499c = mode;
        this.f16501e = true;
        a();
    }
}
