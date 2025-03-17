package com.google.android.material.carousel;

import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

abstract class c {

    /* renamed from: a  reason: collision with root package name */
    final int f66313a;

    class a extends c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ CarouselLayoutManager f66314b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(int i10, CarouselLayoutManager carouselLayoutManager) {
            super(i10, (a) null);
            this.f66314b = carouselLayoutManager;
        }

        public void a(RectF rectF, RectF rectF2, RectF rectF3) {
            float f10 = rectF2.top;
            float f11 = rectF3.top;
            if (f10 < f11 && rectF2.bottom > f11) {
                float f12 = f11 - f10;
                rectF.top += f12;
                rectF3.top += f12;
            }
            float f13 = rectF2.bottom;
            float f14 = rectF3.bottom;
            if (f13 > f14 && rectF2.top < f14) {
                float f15 = f13 - f14;
                rectF.bottom = Math.max(rectF.bottom - f15, rectF.top);
                rectF2.bottom = Math.max(rectF2.bottom - f15, rectF2.top);
            }
        }

        public float e(RecyclerView.r rVar) {
            return (float) (rVar.topMargin + rVar.bottomMargin);
        }

        public RectF f(float f10, float f11, float f12, float f13) {
            return new RectF(0.0f, f12, f11, f10 - f12);
        }

        /* access modifiers changed from: package-private */
        public int g() {
            return this.f66314b.y0();
        }

        /* access modifiers changed from: package-private */
        public int h() {
            return g();
        }

        /* access modifiers changed from: package-private */
        public int i() {
            return this.f66314b.t();
        }

        /* access modifiers changed from: package-private */
        public int j() {
            return this.f66314b.L0() - this.f66314b.o();
        }

        /* access modifiers changed from: package-private */
        public int k() {
            return l();
        }

        /* access modifiers changed from: package-private */
        public int l() {
            return 0;
        }

        public void m(View view, int i10, int i11) {
            int i12 = i();
            this.f66314b.Y0(view, i12, i10, i12 + p(view), i11);
        }

        public void n(RectF rectF, RectF rectF2, RectF rectF3) {
            if (rectF2.bottom <= rectF3.top) {
                float floor = ((float) Math.floor((double) rectF.bottom)) - 1.0f;
                rectF.bottom = floor;
                rectF.top = Math.min(rectF.top, floor);
            }
            if (rectF2.top >= rectF3.bottom) {
                float ceil = ((float) Math.ceil((double) rectF.top)) + 1.0f;
                rectF.top = ceil;
                rectF.bottom = Math.max(ceil, rectF.bottom);
            }
        }

        public void o(View view, Rect rect, float f10, float f11) {
            view.offsetTopAndBottom((int) (f11 - (((float) rect.top) + f10)));
        }

        /* access modifiers changed from: package-private */
        public int p(View view) {
            RecyclerView.r rVar = (RecyclerView.r) view.getLayoutParams();
            return this.f66314b.u0(view) + rVar.leftMargin + rVar.rightMargin;
        }
    }

    class b extends c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ CarouselLayoutManager f66315b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(int i10, CarouselLayoutManager carouselLayoutManager) {
            super(i10, (a) null);
            this.f66315b = carouselLayoutManager;
        }

        public void a(RectF rectF, RectF rectF2, RectF rectF3) {
            float f10 = rectF2.left;
            float f11 = rectF3.left;
            if (f10 < f11 && rectF2.right > f11) {
                float f12 = f11 - f10;
                rectF.left += f12;
                rectF2.left += f12;
            }
            float f13 = rectF2.right;
            float f14 = rectF3.right;
            if (f13 > f14 && rectF2.left < f14) {
                float f15 = f13 - f14;
                rectF.right = Math.max(rectF.right - f15, rectF.left);
                rectF2.right = Math.max(rectF2.right - f15, rectF2.left);
            }
        }

        public float e(RecyclerView.r rVar) {
            return (float) (rVar.rightMargin + rVar.leftMargin);
        }

        public RectF f(float f10, float f11, float f12, float f13) {
            return new RectF(f13, 0.0f, f11 - f13, f10);
        }

        /* access modifiers changed from: package-private */
        public int g() {
            return this.f66315b.y0() - this.f66315b.c();
        }

        /* access modifiers changed from: package-private */
        public int h() {
            return this.f66315b.b3() ? i() : j();
        }

        /* access modifiers changed from: package-private */
        public int i() {
            return 0;
        }

        /* access modifiers changed from: package-private */
        public int j() {
            return this.f66315b.L0();
        }

        /* access modifiers changed from: package-private */
        public int k() {
            return this.f66315b.b3() ? j() : i();
        }

        /* access modifiers changed from: package-private */
        public int l() {
            return this.f66315b.s();
        }

        public void m(View view, int i10, int i11) {
            int l10 = l();
            this.f66315b.Y0(view, i10, l10, i11, l10 + p(view));
        }

        public void n(RectF rectF, RectF rectF2, RectF rectF3) {
            if (rectF2.right <= rectF3.left) {
                float floor = ((float) Math.floor((double) rectF.right)) - 1.0f;
                rectF.right = floor;
                rectF.left = Math.min(rectF.left, floor);
            }
            if (rectF2.left >= rectF3.right) {
                float ceil = ((float) Math.ceil((double) rectF.left)) + 1.0f;
                rectF.left = ceil;
                rectF.right = Math.max(ceil, rectF.right);
            }
        }

        public void o(View view, Rect rect, float f10, float f11) {
            view.offsetLeftAndRight((int) (f11 - (((float) rect.left) + f10)));
        }

        /* access modifiers changed from: package-private */
        public int p(View view) {
            RecyclerView.r rVar = (RecyclerView.r) view.getLayoutParams();
            return this.f66315b.t0(view) + rVar.topMargin + rVar.bottomMargin;
        }
    }

    /* synthetic */ c(int i10, a aVar) {
        this(i10);
    }

    private static c b(CarouselLayoutManager carouselLayoutManager) {
        return new b(0, carouselLayoutManager);
    }

    static c c(CarouselLayoutManager carouselLayoutManager, int i10) {
        if (i10 == 0) {
            return b(carouselLayoutManager);
        }
        if (i10 == 1) {
            return d(carouselLayoutManager);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    private static c d(CarouselLayoutManager carouselLayoutManager) {
        return new a(1, carouselLayoutManager);
    }

    /* access modifiers changed from: package-private */
    public abstract void a(RectF rectF, RectF rectF2, RectF rectF3);

    /* access modifiers changed from: package-private */
    public abstract float e(RecyclerView.r rVar);

    /* access modifiers changed from: package-private */
    public abstract RectF f(float f10, float f11, float f12, float f13);

    /* access modifiers changed from: package-private */
    public abstract int g();

    /* access modifiers changed from: package-private */
    public abstract int h();

    /* access modifiers changed from: package-private */
    public abstract int i();

    /* access modifiers changed from: package-private */
    public abstract int j();

    /* access modifiers changed from: package-private */
    public abstract int k();

    /* access modifiers changed from: package-private */
    public abstract int l();

    /* access modifiers changed from: package-private */
    public abstract void m(View view, int i10, int i11);

    /* access modifiers changed from: package-private */
    public abstract void n(RectF rectF, RectF rectF2, RectF rectF3);

    /* access modifiers changed from: package-private */
    public abstract void o(View view, Rect rect, float f10, float f11);

    private c(int i10) {
        this.f66313a = i10;
    }
}
