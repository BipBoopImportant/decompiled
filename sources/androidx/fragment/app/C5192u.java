package androidx.fragment.app;

import I2.L;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.TypedArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;

/* renamed from: androidx.fragment.app.u  reason: case insensitive filesystem */
class C5192u {
    private static int a(C5187o oVar, boolean z10, boolean z11) {
        return z11 ? z10 ? oVar.getPopEnterAnim() : oVar.getPopExitAnim() : z10 ? oVar.getEnterAnim() : oVar.getExitAnim();
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x006b */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x006b A[SYNTHETIC, Splitter:B:31:0x006b] */
    @android.annotation.SuppressLint({"ResourceType"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static androidx.fragment.app.C5192u.a b(android.content.Context r4, androidx.fragment.app.C5187o r5, boolean r6, boolean r7) {
        /*
            int r0 = r5.getNextTransition()
            int r7 = a(r5, r6, r7)
            r1 = 0
            r5.setAnimations(r1, r1, r1, r1)
            android.view.ViewGroup r1 = r5.mContainer
            r2 = 0
            if (r1 == 0) goto L_0x0020
            int r3 = b3.b.f22953c
            java.lang.Object r1 = r1.getTag(r3)
            if (r1 == 0) goto L_0x0020
            android.view.ViewGroup r1 = r5.mContainer
            int r3 = b3.b.f22953c
            r1.setTag(r3, r2)
        L_0x0020:
            android.view.ViewGroup r1 = r5.mContainer
            if (r1 == 0) goto L_0x002b
            android.animation.LayoutTransition r1 = r1.getLayoutTransition()
            if (r1 == 0) goto L_0x002b
            return r2
        L_0x002b:
            android.view.animation.Animation r1 = r5.onCreateAnimation(r0, r6, r7)
            if (r1 == 0) goto L_0x0037
            androidx.fragment.app.u$a r4 = new androidx.fragment.app.u$a
            r4.<init>((android.view.animation.Animation) r1)
            return r4
        L_0x0037:
            android.animation.Animator r5 = r5.onCreateAnimator(r0, r6, r7)
            if (r5 == 0) goto L_0x0043
            androidx.fragment.app.u$a r4 = new androidx.fragment.app.u$a
            r4.<init>((android.animation.Animator) r5)
            return r4
        L_0x0043:
            if (r7 != 0) goto L_0x004b
            if (r0 == 0) goto L_0x004b
            int r7 = d(r4, r0, r6)
        L_0x004b:
            if (r7 == 0) goto L_0x0087
            android.content.res.Resources r5 = r4.getResources()
            java.lang.String r5 = r5.getResourceTypeName(r7)
            java.lang.String r6 = "anim"
            boolean r5 = r6.equals(r5)
            if (r5 == 0) goto L_0x006b
            android.view.animation.Animation r6 = android.view.animation.AnimationUtils.loadAnimation(r4, r7)     // Catch:{ NotFoundException -> 0x0069, RuntimeException -> 0x006b }
            if (r6 == 0) goto L_0x0087
            androidx.fragment.app.u$a r0 = new androidx.fragment.app.u$a     // Catch:{ NotFoundException -> 0x0069, RuntimeException -> 0x006b }
            r0.<init>((android.view.animation.Animation) r6)     // Catch:{ NotFoundException -> 0x0069, RuntimeException -> 0x006b }
            return r0
        L_0x0069:
            r4 = move-exception
            throw r4
        L_0x006b:
            android.animation.Animator r6 = android.animation.AnimatorInflater.loadAnimator(r4, r7)     // Catch:{ RuntimeException -> 0x0077 }
            if (r6 == 0) goto L_0x0087
            androidx.fragment.app.u$a r0 = new androidx.fragment.app.u$a     // Catch:{ RuntimeException -> 0x0077 }
            r0.<init>((android.animation.Animator) r6)     // Catch:{ RuntimeException -> 0x0077 }
            return r0
        L_0x0077:
            r6 = move-exception
            if (r5 != 0) goto L_0x0086
            android.view.animation.Animation r4 = android.view.animation.AnimationUtils.loadAnimation(r4, r7)
            if (r4 == 0) goto L_0x0087
            androidx.fragment.app.u$a r5 = new androidx.fragment.app.u$a
            r5.<init>((android.view.animation.Animation) r4)
            return r5
        L_0x0086:
            throw r6
        L_0x0087:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C5192u.b(android.content.Context, androidx.fragment.app.o, boolean, boolean):androidx.fragment.app.u$a");
    }

    private static int c(Context context, int i10) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(16973825, new int[]{i10});
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    private static int d(Context context, int i10, boolean z10) {
        if (i10 == 4097) {
            return z10 ? b3.a.f22949e : b3.a.f22950f;
        }
        if (i10 == 8194) {
            return z10 ? b3.a.f22945a : b3.a.f22946b;
        }
        if (i10 == 8197) {
            return z10 ? c(context, 16842938) : c(context, 16842939);
        }
        if (i10 == 4099) {
            return z10 ? b3.a.f22947c : b3.a.f22948d;
        }
        if (i10 != 4100) {
            return -1;
        }
        return z10 ? c(context, 16842936) : c(context, 16842937);
    }

    /* renamed from: androidx.fragment.app.u$a */
    static class a {

        /* renamed from: a  reason: collision with root package name */
        public final Animation f22114a;

        /* renamed from: b  reason: collision with root package name */
        public final AnimatorSet f22115b;

        a(Animation animation) {
            this.f22114a = animation;
            this.f22115b = null;
            if (animation == null) {
                throw new IllegalStateException("Animation cannot be null");
            }
        }

        a(Animator animator) {
            this.f22114a = null;
            AnimatorSet animatorSet = new AnimatorSet();
            this.f22115b = animatorSet;
            animatorSet.play(animator);
            if (animator == null) {
                throw new IllegalStateException("Animator cannot be null");
            }
        }
    }

    /* renamed from: androidx.fragment.app.u$b */
    static class b extends AnimationSet implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private final ViewGroup f22116a;

        /* renamed from: b  reason: collision with root package name */
        private final View f22117b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f22118c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f22119d;

        /* renamed from: e  reason: collision with root package name */
        private boolean f22120e = true;

        b(Animation animation, ViewGroup viewGroup, View view) {
            super(false);
            this.f22116a = viewGroup;
            this.f22117b = view;
            addAnimation(animation);
            viewGroup.post(this);
        }

        public boolean getTransformation(long j10, Transformation transformation) {
            this.f22120e = true;
            if (this.f22118c) {
                return !this.f22119d;
            }
            if (!super.getTransformation(j10, transformation)) {
                this.f22118c = true;
                L.a(this.f22116a, this);
            }
            return true;
        }

        public void run() {
            if (this.f22118c || !this.f22120e) {
                this.f22116a.endViewTransition(this.f22117b);
                this.f22119d = true;
                return;
            }
            this.f22120e = false;
            this.f22116a.post(this);
        }

        public boolean getTransformation(long j10, Transformation transformation, float f10) {
            this.f22120e = true;
            if (this.f22118c) {
                return !this.f22119d;
            }
            if (!super.getTransformation(j10, transformation, f10)) {
                this.f22118c = true;
                L.a(this.f22116a, this);
            }
            return true;
        }
    }
}
