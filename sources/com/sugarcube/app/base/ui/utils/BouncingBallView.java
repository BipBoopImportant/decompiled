package com.sugarcube.app.base.ui.utils;

import OE.C13314f;
import OE.C13317i;
import OE.C13318j;
import OE.o;
import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.sugarcube.common.R;
import fI.C17221b;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import w2.C6214h;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\tB\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\b¢\u0006\u0004\b\r\u0010\fR\u0016\u0010\u0010\u001a\u00020\u000e8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00118\u0002XD¢\u0006\u0006\n\u0004\b\u000b\u0010\u0012R\u0016\u0010\u0016\u001a\u00020\u00148\u0002@\u0002X.¢\u0006\u0006\n\u0004\b\r\u0010\u0015R\u0016\u0010\u001a\u001a\u00020\u00178\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lcom/sugarcube/app/base/ui/utils/BouncingBallView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "ctx", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "LXH/N;", "a", "(Landroid/util/AttributeSet;)V", "b", "()V", "c", "Lcom/sugarcube/app/base/ui/utils/BouncingBallView$a;", "Lcom/sugarcube/app/base/ui/utils/BouncingBallView$a;", "viewType", "", "Ljava/lang/String;", "startOnCreateAttr", "Landroid/animation/AnimatorSet;", "Landroid/animation/AnimatorSet;", "animator", "", "d", "Z", "startOnCreate", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class BouncingBallView extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    private a f125724a = a.NORMAL;

    /* renamed from: b  reason: collision with root package name */
    private final String f125725b = "gmg_startOnCreate";

    /* renamed from: c  reason: collision with root package name */
    private AnimatorSet f125726c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f125727d;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/sugarcube/app/base/ui/utils/BouncingBallView$a;", "", "<init>", "(Ljava/lang/String;I)V", "NORMAL", "SMALL", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public enum a {
        NORMAL,
        SMALL;

        static {
            a[] a10;
            $ENTRIES = C17221b.a(a10);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f125728a;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.SMALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f125728a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\u0006¨\u0006\n"}, d2 = {"androidx/core/animation/AnimatorKt$addListener$listener$1", "Landroid/animation/Animator$AnimatorListener;", "Landroid/animation/Animator;", "animator", "LXH/N;", "onAnimationRepeat", "(Landroid/animation/Animator;)V", "onAnimationEnd", "onAnimationCancel", "onAnimationStart", "core-ktx_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c implements Animator.AnimatorListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ BouncingBallView f125729a;

        public c(BouncingBallView bouncingBallView) {
            this.f125729a = bouncingBallView;
        }

        public void onAnimationCancel(Animator animator) {
        }

        public void onAnimationEnd(Animator animator) {
            if (this.f125729a.getVisibility() == 0) {
                animator.start();
            }
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BouncingBallView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C17542s.j(context, "ctx");
        C17542s.j(attributeSet, "attributeSet");
        a(attributeSet);
    }

    private final void a(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, o.f113503a);
            C17542s.i(obtainStyledAttributes, "obtainStyledAttributes(...)");
            this.f125724a = obtainStyledAttributes.getInt(o.f113504b, 0) == 1 ? a.SMALL : a.NORMAL;
            obtainStyledAttributes.recycle();
        }
        View.inflate(getContext(), C13318j.f113137d, this);
        AnimatorSet animatorSet = null;
        ((ImageView) findViewById(C13317i.f112918J0)).setImageDrawable(C6214h.e(getResources(), b.f125728a[this.f125724a.ordinal()] == 1 ? R.drawable.sc_ic_ball_small : R.drawable.sc_ic_ball, (Resources.Theme) null));
        Animator loadAnimator = AnimatorInflater.loadAnimator(getContext(), C13314f.f112816a);
        C17542s.h(loadAnimator, "null cannot be cast to non-null type android.animation.AnimatorSet");
        AnimatorSet animatorSet2 = (AnimatorSet) loadAnimator;
        this.f125726c = animatorSet2;
        if (animatorSet2 == null) {
            C17542s.z("animator");
            animatorSet2 = null;
        }
        animatorSet2.setTarget(this);
        if (attributeSet != null) {
            this.f125727d = attributeSet.getAttributeBooleanValue((String) null, this.f125725b, false);
        }
        AnimatorSet animatorSet3 = this.f125726c;
        if (animatorSet3 == null) {
            C17542s.z("animator");
        } else {
            animatorSet = animatorSet3;
        }
        animatorSet.addListener(new c(this));
        if (this.f125727d) {
            b();
        } else {
            setVisibility(8);
        }
    }

    public final void b() {
        setVisibility(0);
        AnimatorSet animatorSet = this.f125726c;
        if (animatorSet == null) {
            C17542s.z("animator");
            animatorSet = null;
        }
        animatorSet.start();
    }

    public final void c() {
        AnimatorSet animatorSet = this.f125726c;
        if (animatorSet == null) {
            C17542s.z("animator");
            animatorSet = null;
        }
        animatorSet.pause();
        setVisibility(8);
    }
}
