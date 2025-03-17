package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.CompoundButton;
import androidx.core.widget.c;
import y2.C6260a;

/* renamed from: androidx.appcompat.widget.d  reason: case insensitive filesystem */
class C4992d {

    /* renamed from: a  reason: collision with root package name */
    private final CompoundButton f16503a;

    /* renamed from: b  reason: collision with root package name */
    private ColorStateList f16504b = null;

    /* renamed from: c  reason: collision with root package name */
    private PorterDuff.Mode f16505c = null;

    /* renamed from: d  reason: collision with root package name */
    private boolean f16506d = false;

    /* renamed from: e  reason: collision with root package name */
    private boolean f16507e = false;

    /* renamed from: f  reason: collision with root package name */
    private boolean f16508f;

    C4992d(CompoundButton compoundButton) {
        this.f16503a = compoundButton;
    }

    /* access modifiers changed from: package-private */
    public void a() {
        Drawable a10 = c.a(this.f16503a);
        if (a10 == null) {
            return;
        }
        if (this.f16506d || this.f16507e) {
            Drawable mutate = C6260a.r(a10).mutate();
            if (this.f16506d) {
                C6260a.o(mutate, this.f16504b);
            }
            if (this.f16507e) {
                C6260a.p(mutate, this.f16505c);
            }
            if (mutate.isStateful()) {
                mutate.setState(this.f16503a.getDrawableState());
            }
            this.f16503a.setButtonDrawable(mutate);
        }
    }

    /* access modifiers changed from: package-private */
    public ColorStateList b() {
        return this.f16504b;
    }

    /* access modifiers changed from: package-private */
    public PorterDuff.Mode c() {
        return this.f16505c;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Can't wrap try/catch for region: R(13:0|1|2|(2:6|7)|9|10|(1:14)|15|(1:17)|18|(1:20)|21|22) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x003f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void d(android.util.AttributeSet r11, int r12) {
        /*
            r10 = this;
            android.widget.CompoundButton r0 = r10.f16503a
            android.content.Context r0 = r0.getContext()
            int[] r1 = i.C5430j.f24122U0
            r2 = 0
            androidx.appcompat.widget.M r0 = androidx.appcompat.widget.M.v(r0, r11, r1, r12, r2)
            android.widget.CompoundButton r3 = r10.f16503a
            android.content.Context r4 = r3.getContext()
            int[] r5 = i.C5430j.f24122U0
            android.content.res.TypedArray r7 = r0.r()
            r9 = 0
            r6 = r11
            r8 = r12
            I2.C4600b0.n0(r3, r4, r5, r6, r7, r8, r9)
            int r11 = i.C5430j.f24130W0     // Catch:{ all -> 0x003d }
            boolean r11 = r0.s(r11)     // Catch:{ all -> 0x003d }
            if (r11 == 0) goto L_0x003f
            int r11 = i.C5430j.f24130W0     // Catch:{ all -> 0x003d }
            int r11 = r0.n(r11, r2)     // Catch:{ all -> 0x003d }
            if (r11 == 0) goto L_0x003f
            android.widget.CompoundButton r12 = r10.f16503a     // Catch:{ NotFoundException -> 0x003f }
            android.content.Context r1 = r12.getContext()     // Catch:{ NotFoundException -> 0x003f }
            android.graphics.drawable.Drawable r11 = j.C5443a.b(r1, r11)     // Catch:{ NotFoundException -> 0x003f }
            r12.setButtonDrawable(r11)     // Catch:{ NotFoundException -> 0x003f }
            goto L_0x005c
        L_0x003d:
            r11 = move-exception
            goto L_0x008c
        L_0x003f:
            int r11 = i.C5430j.f24126V0     // Catch:{ all -> 0x003d }
            boolean r11 = r0.s(r11)     // Catch:{ all -> 0x003d }
            if (r11 == 0) goto L_0x005c
            int r11 = i.C5430j.f24126V0     // Catch:{ all -> 0x003d }
            int r11 = r0.n(r11, r2)     // Catch:{ all -> 0x003d }
            if (r11 == 0) goto L_0x005c
            android.widget.CompoundButton r12 = r10.f16503a     // Catch:{ all -> 0x003d }
            android.content.Context r1 = r12.getContext()     // Catch:{ all -> 0x003d }
            android.graphics.drawable.Drawable r11 = j.C5443a.b(r1, r11)     // Catch:{ all -> 0x003d }
            r12.setButtonDrawable(r11)     // Catch:{ all -> 0x003d }
        L_0x005c:
            int r11 = i.C5430j.f24134X0     // Catch:{ all -> 0x003d }
            boolean r11 = r0.s(r11)     // Catch:{ all -> 0x003d }
            if (r11 == 0) goto L_0x006f
            android.widget.CompoundButton r11 = r10.f16503a     // Catch:{ all -> 0x003d }
            int r12 = i.C5430j.f24134X0     // Catch:{ all -> 0x003d }
            android.content.res.ColorStateList r12 = r0.c(r12)     // Catch:{ all -> 0x003d }
            androidx.core.widget.c.d(r11, r12)     // Catch:{ all -> 0x003d }
        L_0x006f:
            int r11 = i.C5430j.f24138Y0     // Catch:{ all -> 0x003d }
            boolean r11 = r0.s(r11)     // Catch:{ all -> 0x003d }
            if (r11 == 0) goto L_0x0088
            android.widget.CompoundButton r11 = r10.f16503a     // Catch:{ all -> 0x003d }
            int r12 = i.C5430j.f24138Y0     // Catch:{ all -> 0x003d }
            r1 = -1
            int r12 = r0.k(r12, r1)     // Catch:{ all -> 0x003d }
            r1 = 0
            android.graphics.PorterDuff$Mode r12 = androidx.appcompat.widget.y.e(r12, r1)     // Catch:{ all -> 0x003d }
            androidx.core.widget.c.e(r11, r12)     // Catch:{ all -> 0x003d }
        L_0x0088:
            r0.x()
            return
        L_0x008c:
            r0.x()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C4992d.d(android.util.AttributeSet, int):void");
    }

    /* access modifiers changed from: package-private */
    public void e() {
        if (this.f16508f) {
            this.f16508f = false;
            return;
        }
        this.f16508f = true;
        a();
    }

    /* access modifiers changed from: package-private */
    public void f(ColorStateList colorStateList) {
        this.f16504b = colorStateList;
        this.f16506d = true;
        a();
    }

    /* access modifiers changed from: package-private */
    public void g(PorterDuff.Mode mode) {
        this.f16505c = mode;
        this.f16507e = true;
        a();
    }
}
