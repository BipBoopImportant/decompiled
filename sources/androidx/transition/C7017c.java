package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.graphics.Paint;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.C7026l;

/* renamed from: androidx.transition.c  reason: case insensitive filesystem */
public class C7017c extends P {

    /* renamed from: androidx.transition.c$a */
    private static class a extends AnimatorListenerAdapter implements C7026l.h {

        /* renamed from: a  reason: collision with root package name */
        private final View f44665a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f44666b = false;

        a(View view) {
            this.f44665a = view;
        }

        public void d(C7026l lVar) {
            this.f44665a.setTag(C7021g.f44673d, (Object) null);
        }

        public void e(C7026l lVar) {
        }

        public void g(C7026l lVar) {
            this.f44665a.setTag(C7021g.f44673d, Float.valueOf(this.f44665a.getVisibility() == 0 ? D.b(this.f44665a) : 0.0f));
        }

        public void j(C7026l lVar) {
        }

        public void l(C7026l lVar) {
        }

        public void m(C7026l lVar, boolean z10) {
        }

        public void onAnimationCancel(Animator animator) {
            D.e(this.f44665a, 1.0f);
        }

        public void onAnimationEnd(Animator animator) {
            onAnimationEnd(animator, false);
        }

        public void onAnimationStart(Animator animator) {
            if (this.f44665a.hasOverlappingRendering() && this.f44665a.getLayerType() == 0) {
                this.f44666b = true;
                this.f44665a.setLayerType(2, (Paint) null);
            }
        }

        public void onAnimationEnd(Animator animator, boolean z10) {
            if (this.f44666b) {
                this.f44665a.setLayerType(0, (Paint) null);
            }
            if (!z10) {
                D.e(this.f44665a, 1.0f);
                D.a(this.f44665a);
            }
        }
    }

    public C7017c(int i10) {
        G0(i10);
    }

    private Animator H0(View view, float f10, float f11) {
        if (f10 == f11) {
            return null;
        }
        D.e(view, f10);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, D.f44587b, new float[]{f11});
        a aVar = new a(view);
        ofFloat.addListener(aVar);
        K().c(aVar);
        return ofFloat;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:1:0x0002, code lost:
        r1 = (java.lang.Float) r1.f44774a.get("android:fade:transitionAlpha");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static float I0(androidx.transition.y r1, float r2) {
        /*
            if (r1 == 0) goto L_0x0012
            java.util.Map<java.lang.String, java.lang.Object> r1 = r1.f44774a
            java.lang.String r0 = "android:fade:transitionAlpha"
            java.lang.Object r1 = r1.get(r0)
            java.lang.Float r1 = (java.lang.Float) r1
            if (r1 == 0) goto L_0x0012
            float r2 = r1.floatValue()
        L_0x0012:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.transition.C7017c.I0(androidx.transition.y, float):float");
    }

    public Animator B0(ViewGroup viewGroup, View view, y yVar, y yVar2) {
        D.c(view);
        return H0(view, I0(yVar, 0.0f), 1.0f);
    }

    public Animator D0(ViewGroup viewGroup, View view, y yVar, y yVar2) {
        D.c(view);
        Animator H02 = H0(view, I0(yVar, 1.0f), 0.0f);
        if (H02 == null) {
            D.e(view, I0(yVar2, 1.0f));
        }
        return H02;
    }

    public boolean W() {
        return true;
    }

    public void n(y yVar) {
        super.n(yVar);
        Float f10 = (Float) yVar.f44775b.getTag(C7021g.f44673d);
        if (f10 == null) {
            f10 = yVar.f44775b.getVisibility() == 0 ? Float.valueOf(D.b(yVar.f44775b)) : Float.valueOf(0.0f);
        }
        yVar.f44774a.put("android:fade:transitionAlpha", f10);
    }

    public C7017c() {
    }
}
