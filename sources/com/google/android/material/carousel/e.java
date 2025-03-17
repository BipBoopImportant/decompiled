package com.google.android.material.carousel;

import Ea.C9070d;
import android.content.Context;
import com.google.android.material.carousel.f;

final class e {
    static float a(float f10, float f11, int i10) {
        return f10 + (((float) Math.max(0, i10 - 1)) * f11);
    }

    static float b(float f10, float f11, int i10) {
        return i10 > 0 ? f10 + (f11 / 2.0f) : f10;
    }

    static f c(Context context, float f10, float f11, a aVar) {
        float f12;
        float f13;
        float f14 = f10;
        float f15 = f11;
        a aVar2 = aVar;
        float min = Math.min(f(context) + f14, aVar2.f66310f);
        float f16 = min / 2.0f;
        float f17 = 0.0f - f16;
        float b10 = b(0.0f, aVar2.f66306b, aVar2.f66307c);
        float j10 = j(0.0f, a(b10, aVar2.f66306b, (int) Math.floor((double) (((float) aVar2.f66307c) / 2.0f))), aVar2.f66306b, aVar2.f66307c);
        float b11 = b(j10, aVar2.f66309e, aVar2.f66308d);
        float j11 = j(j10, a(b11, aVar2.f66309e, (int) Math.floor((double) (((float) aVar2.f66308d) / 2.0f))), aVar2.f66309e, aVar2.f66308d);
        float b12 = b(j11, aVar2.f66310f, aVar2.f66311g);
        float j12 = j(j11, a(b12, aVar2.f66310f, aVar2.f66311g), aVar2.f66310f, aVar2.f66311g);
        float b13 = b(j12, aVar2.f66309e, aVar2.f66308d);
        float b14 = b(j(j12, a(b13, aVar2.f66309e, (int) Math.ceil((double) (((float) aVar2.f66308d) / 2.0f))), aVar2.f66309e, aVar2.f66308d), aVar2.f66306b, aVar2.f66307c);
        float f18 = f16 + f15;
        float b15 = d.b(min, aVar2.f66310f, f14);
        float b16 = d.b(aVar2.f66306b, aVar2.f66310f, f14);
        float b17 = d.b(aVar2.f66309e, aVar2.f66310f, f14);
        f.b a10 = new f.b(aVar2.f66310f, f15).a(f17, b15, min);
        int i10 = aVar2.f66307c;
        if (i10 > 0) {
            f12 = f18;
            a10.g(b10, b16, aVar2.f66306b, (int) Math.floor((double) (((float) i10) / 2.0f)));
        } else {
            f12 = f18;
        }
        int i11 = aVar2.f66308d;
        if (i11 > 0) {
            a10.g(b11, b17, aVar2.f66309e, (int) Math.floor((double) (((float) i11) / 2.0f)));
        }
        float f19 = b16;
        a10.h(b12, 0.0f, aVar2.f66310f, aVar2.f66311g, true);
        int i12 = aVar2.f66308d;
        if (i12 > 0) {
            f13 = 2.0f;
            a10.g(b13, b17, aVar2.f66309e, (int) Math.ceil((double) (((float) i12) / 2.0f)));
        } else {
            f13 = 2.0f;
        }
        int i13 = aVar2.f66307c;
        if (i13 > 0) {
            a10.g(b14, f19, aVar2.f66306b, (int) Math.ceil((double) (((float) i13) / f13)));
        }
        a10.a(f12, b15, min);
        return a10.i();
    }

    static f d(Context context, float f10, float f11, a aVar, int i10) {
        return i10 == 1 ? c(context, f10, f11, aVar) : e(context, f10, f11, aVar);
    }

    static f e(Context context, float f10, float f11, a aVar) {
        float min = Math.min(f(context) + f10, aVar.f66310f);
        float f12 = min / 2.0f;
        float f13 = 0.0f - f12;
        float b10 = b(0.0f, aVar.f66310f, aVar.f66311g);
        float j10 = j(0.0f, a(b10, aVar.f66310f, aVar.f66311g), aVar.f66310f, aVar.f66311g);
        float b11 = b(j10, aVar.f66309e, aVar.f66308d);
        float b12 = b(j(j10, b11, aVar.f66309e, aVar.f66308d), aVar.f66306b, aVar.f66307c);
        float f14 = f12 + f11;
        float b13 = d.b(min, aVar.f66310f, f10);
        float b14 = d.b(aVar.f66306b, aVar.f66310f, f10);
        float b15 = d.b(aVar.f66309e, aVar.f66310f, f10);
        f.b h10 = new f.b(aVar.f66310f, f11).a(f13, b13, min).h(b10, 0.0f, aVar.f66310f, aVar.f66311g, true);
        if (aVar.f66308d > 0) {
            h10.b(b11, b15, aVar.f66309e);
        }
        int i10 = aVar.f66307c;
        if (i10 > 0) {
            h10.g(b12, b14, aVar.f66306b, i10);
        }
        h10.a(f14, b13, min);
        return h10.i();
    }

    static float f(Context context) {
        return context.getResources().getDimension(C9070d.f59440v);
    }

    static float g(Context context) {
        return context.getResources().getDimension(C9070d.f59442w);
    }

    static float h(Context context) {
        return context.getResources().getDimension(C9070d.f59443x);
    }

    static int i(int[] iArr) {
        int i10 = Integer.MIN_VALUE;
        for (int i11 : iArr) {
            if (i11 > i10) {
                i10 = i11;
            }
        }
        return i10;
    }

    static float j(float f10, float f11, float f12, int i10) {
        return i10 > 0 ? f11 + (f12 / 2.0f) : f10;
    }
}
