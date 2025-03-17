package androidx.browser.customtabs;

import android.os.Bundle;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final Integer f16585a;

    /* renamed from: b  reason: collision with root package name */
    public final Integer f16586b;

    /* renamed from: c  reason: collision with root package name */
    public final Integer f16587c;

    /* renamed from: d  reason: collision with root package name */
    public final Integer f16588d;

    /* renamed from: androidx.browser.customtabs.a$a  reason: collision with other inner class name */
    public static final class C0229a {

        /* renamed from: a  reason: collision with root package name */
        private Integer f16589a;

        /* renamed from: b  reason: collision with root package name */
        private Integer f16590b;

        /* renamed from: c  reason: collision with root package name */
        private Integer f16591c;

        /* renamed from: d  reason: collision with root package name */
        private Integer f16592d;

        public a a() {
            return new a(this.f16589a, this.f16590b, this.f16591c, this.f16592d);
        }

        public C0229a b(int i10) {
            this.f16589a = Integer.valueOf(i10 | -16777216);
            return this;
        }
    }

    a(Integer num, Integer num2, Integer num3, Integer num4) {
        this.f16585a = num;
        this.f16586b = num2;
        this.f16587c = num3;
        this.f16588d = num4;
    }

    /* access modifiers changed from: package-private */
    public Bundle a() {
        Bundle bundle = new Bundle();
        Integer num = this.f16585a;
        if (num != null) {
            bundle.putInt("android.support.customtabs.extra.TOOLBAR_COLOR", num.intValue());
        }
        Integer num2 = this.f16586b;
        if (num2 != null) {
            bundle.putInt("android.support.customtabs.extra.SECONDARY_TOOLBAR_COLOR", num2.intValue());
        }
        Integer num3 = this.f16587c;
        if (num3 != null) {
            bundle.putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_COLOR", num3.intValue());
        }
        Integer num4 = this.f16588d;
        if (num4 != null) {
            bundle.putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_DIVIDER_COLOR", num4.intValue());
        }
        return bundle;
    }
}
