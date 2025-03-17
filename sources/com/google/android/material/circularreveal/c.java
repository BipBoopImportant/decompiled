package com.google.android.material.circularreveal;

import Pa.C9233a;
import android.animation.TypeEvaluator;
import android.graphics.drawable.Drawable;
import android.util.Property;

public interface c {

    public static class b implements TypeEvaluator<e> {

        /* renamed from: b  reason: collision with root package name */
        public static final TypeEvaluator<e> f66479b = new b();

        /* renamed from: a  reason: collision with root package name */
        private final e f66480a = new e();

        /* renamed from: a */
        public e evaluate(float f10, e eVar, e eVar2) {
            this.f66480a.a(C9233a.c(eVar.f66483a, eVar2.f66483a, f10), C9233a.c(eVar.f66484b, eVar2.f66484b, f10), C9233a.c(eVar.f66485c, eVar2.f66485c, f10));
            return this.f66480a;
        }
    }

    /* renamed from: com.google.android.material.circularreveal.c$c  reason: collision with other inner class name */
    public static class C1164c extends Property<c, e> {

        /* renamed from: a  reason: collision with root package name */
        public static final Property<c, e> f66481a = new C1164c("circularReveal");

        private C1164c(String str) {
            super(e.class, str);
        }

        /* renamed from: a */
        public e get(c cVar) {
            return cVar.getRevealInfo();
        }

        /* renamed from: b */
        public void set(c cVar, e eVar) {
            cVar.setRevealInfo(eVar);
        }
    }

    public static class d extends Property<c, Integer> {

        /* renamed from: a  reason: collision with root package name */
        public static final Property<c, Integer> f66482a = new d("circularRevealScrimColor");

        private d(String str) {
            super(Integer.class, str);
        }

        /* renamed from: a */
        public Integer get(c cVar) {
            return Integer.valueOf(cVar.getCircularRevealScrimColor());
        }

        /* renamed from: b */
        public void set(c cVar, Integer num) {
            cVar.setCircularRevealScrimColor(num.intValue());
        }
    }

    public static class e {

        /* renamed from: a  reason: collision with root package name */
        public float f66483a;

        /* renamed from: b  reason: collision with root package name */
        public float f66484b;

        /* renamed from: c  reason: collision with root package name */
        public float f66485c;

        public void a(float f10, float f11, float f12) {
            this.f66483a = f10;
            this.f66484b = f11;
            this.f66485c = f12;
        }

        private e() {
        }

        public e(float f10, float f11, float f12) {
            this.f66483a = f10;
            this.f66484b = f11;
            this.f66485c = f12;
        }
    }

    void a();

    void b();

    int getCircularRevealScrimColor();

    e getRevealInfo();

    void setCircularRevealOverlayDrawable(Drawable drawable);

    void setCircularRevealScrimColor(int i10);

    void setRevealInfo(e eVar);
}
