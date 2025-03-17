package com.ingka.ikea.app.uicomponents.view.progress;

import XH.C16807N;
import XH.C16824o;
import XH.C16825p;
import al.C11067a;
import al.C11068b;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.FloatEvaluator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.airbnb.lottie.LottieAnimationView;
import ip.i;
import ip.m;
import java.util.ArrayList;
import java.util.List;
import kl.C11511a;
import kl.C11512b;
import kl.C11513c;
import kl.C11514d;
import kotlin.Metadata;
import kotlin.jvm.internal.A;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.P;
import qI.C17785b;
import tI.C17978n;
import tK.C18010a;
import u2.C6012a;
import uI.C18064m;

@Metadata(d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u001f2\u00020\u0001:\u0002:>B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000e\u001a\u00020\r2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ-\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0019\u0010\u0018J\u001f\u0010\u001b\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ'\u0010\u001f\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J'\u0010!\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b!\u0010 J\u0017\u0010$\u001a\u00020\r2\u0006\u0010#\u001a\u00020\"H\u0002¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\rH\u0002¢\u0006\u0004\b&\u0010'J\u001d\u0010(\u001a\u00020\r2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002¢\u0006\u0004\b(\u0010\u000fJ\u0013\u0010)\u001a\u00020\u0012*\u00020\u0012H\u0002¢\u0006\u0004\b)\u0010\u0018J/\u0010-\u001a\u00020\r2\u0006\u0010(\u001a\u00020\u00062\u0006\u0010*\u001a\u00020\u00062\u0006\u0010+\u001a\u00020\u00062\u0006\u0010,\u001a\u00020\u0006H\u0014¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\rH\u0014¢\u0006\u0004\b/\u0010'J\u000f\u00100\u001a\u00020\rH\u0014¢\u0006\u0004\b0\u0010'J\u0017\u00103\u001a\u00020\r2\u0006\u00102\u001a\u000201H\u0014¢\u0006\u0004\b3\u00104J\u0017\u00106\u001a\u00020\r2\u0006\u00105\u001a\u00020\u0006H\u0016¢\u0006\u0004\b6\u00107J\u001d\u00108\u001a\u00020\r2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b8\u0010\u000fJ/\u00109\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00122\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b9\u0010\u0015R\u0016\u0010<\u001a\u00020\u00068\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\u001a\u0010@\u001a\b\u0012\u0004\u0012\u00020\u000b0=8\u0002X\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0018\u0010D\u001a\u00060AR\u00020\u00008\u0002X\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010H\u001a\u00020E8\u0002X\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010L\u001a\u00020I8\u0002X\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u0014\u0010O\u001a\u00020M8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010NR\u0018\u0010S\u001a\u0004\u0018\u00010P8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bQ\u0010RR\u0016\u0010U\u001a\u00020\u00128\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b*\u0010TR\u0016\u0010X\u001a\u00020\u001d8\u0002@\u0002X.¢\u0006\u0006\n\u0004\bV\u0010WR\u0014\u0010Z\u001a\u00020\u001d8\u0002X\u0004¢\u0006\u0006\n\u0004\bY\u0010WR\u0016\u0010\\\u001a\u00020\u00128\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b[\u0010TR\u0014\u0010`\u001a\u00020]8\u0002X\u0004¢\u0006\u0006\n\u0004\b^\u0010_R\u001b\u0010f\u001a\u00020a8BX\u0002¢\u0006\f\n\u0004\bb\u0010c\u001a\u0004\bd\u0010eR\u001b\u0010k\u001a\u00020g8BX\u0002¢\u0006\f\n\u0004\bh\u0010c\u001a\u0004\bi\u0010jR+\u0010p\u001a\u00020\"2\u0006\u0010l\u001a\u00020\"8B@BX\u0002¢\u0006\u0012\n\u0004\b&\u0010m\u001a\u0004\b\u001a\u0010n\"\u0004\bo\u0010%R\u0014\u0010s\u001a\u00020q8\u0002X\u0004¢\u0006\u0006\n\u0004\b)\u0010r¨\u0006t"}, d2 = {"Lcom/ingka/ikea/app/uicomponents/view/progress/FullScreenProgressView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "", "messages", "LXH/N;", "B", "(Ljava/util/List;)V", "Landroid/graphics/Rect;", "src", "", "cornerRadius", "y", "(Landroid/graphics/Rect;FLjava/util/List;)V", "f", "s", "(F)F", "E", "t", "v", "(FF)V", "Landroid/graphics/RectF;", "dst", "q", "(FLandroid/graphics/RectF;Landroid/graphics/RectF;)V", "r", "", "isEnabled", "D", "(Z)V", "o", "()V", "w", "p", "h", "oldw", "oldh", "onSizeChanged", "(IIII)V", "onAttachedToWindow", "onDetachedFromWindow", "Landroid/graphics/Canvas;", "canvas", "dispatchDraw", "(Landroid/graphics/Canvas;)V", "visibility", "setVisibility", "(I)V", "A", "x", "a", "I", "messageIndex", "", "b", "Ljava/util/List;", "feedbackMessages", "Lcom/ingka/ikea/app/uicomponents/view/progress/FullScreenProgressView$a;", "c", "Lcom/ingka/ikea/app/uicomponents/view/progress/FullScreenProgressView$a;", "changeMessageRunnable", "Landroid/animation/FloatEvaluator;", "d", "Landroid/animation/FloatEvaluator;", "distance", "Lh3/c;", "e", "Lh3/c;", "horizontalInterpolator", "Landroid/view/animation/AccelerateInterpolator;", "Landroid/view/animation/AccelerateInterpolator;", "verticalInterpolator", "Landroid/animation/ValueAnimator;", "g", "Landroid/animation/ValueAnimator;", "revealAnimator", "F", "srcRadius", "i", "Landroid/graphics/RectF;", "srcRect", "j", "currentRect", "k", "currentRadius", "Landroid/os/Handler;", "l", "Landroid/os/Handler;", "mainThreadHandler", "Lcom/airbnb/lottie/LottieAnimationView;", "m", "LXH/o;", "getBall", "()Lcom/airbnb/lottie/LottieAnimationView;", "ball", "Landroid/widget/TextView;", "n", "getText", "()Landroid/widget/TextView;", "text", "<set-?>", "LqI/b;", "()Z", "setContentAnimationRunning", "isContentAnimationRunning", "Landroid/graphics/Paint;", "Landroid/graphics/Paint;", "paint", "uicomponents_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class FullScreenProgressView extends FrameLayout {

    /* renamed from: q  reason: collision with root package name */
    public static final b f92715q = new b((DefaultConstructorMarker) null);

    /* renamed from: r  reason: collision with root package name */
    static final /* synthetic */ C18064m<Object>[] f92716r = {P.e(new A(FullScreenProgressView.class, "isContentAnimationRunning", "isContentAnimationRunning()Z", 0))};
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public int f92717a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final List<String> f92718b;

    /* renamed from: c  reason: collision with root package name */
    private final a f92719c;

    /* renamed from: d  reason: collision with root package name */
    private final FloatEvaluator f92720d;

    /* renamed from: e  reason: collision with root package name */
    private final h3.c f92721e;

    /* renamed from: f  reason: collision with root package name */
    private final AccelerateInterpolator f92722f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public ValueAnimator f92723g;

    /* renamed from: h  reason: collision with root package name */
    private float f92724h;

    /* renamed from: i  reason: collision with root package name */
    private RectF f92725i;

    /* renamed from: j  reason: collision with root package name */
    private final RectF f92726j;

    /* renamed from: k  reason: collision with root package name */
    private float f92727k;
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public final Handler f92728l;

    /* renamed from: m  reason: collision with root package name */
    private final C16824o f92729m;

    /* renamed from: n  reason: collision with root package name */
    private final C16824o f92730n;

    /* renamed from: o  reason: collision with root package name */
    private final C17785b f92731o;

    /* renamed from: p  reason: collision with root package name */
    private final Paint f92732p;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0010R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lcom/ingka/ikea/app/uicomponents/view/progress/FullScreenProgressView$a;", "Ljava/lang/Runnable;", "<init>", "(Lcom/ingka/ikea/app/uicomponents/view/progress/FullScreenProgressView;)V", "", "from", "to", "Landroid/animation/AnimatorSet;", "d", "(Ljava/lang/String;Ljava/lang/String;)Landroid/animation/AnimatorSet;", "", "delay", "e", "(J)Landroid/animation/AnimatorSet;", "LXH/N;", "run", "()V", "c", "a", "Landroid/animation/AnimatorSet;", "changeMessageAnimator", "uicomponents_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private final class a implements Runnable {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public AnimatorSet f92733a;

        @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\u0006¨\u0006\n"}, d2 = {"androidx/core/animation/AnimatorKt$addListener$listener$1", "Landroid/animation/Animator$AnimatorListener;", "Landroid/animation/Animator;", "animator", "LXH/N;", "onAnimationRepeat", "(Landroid/animation/Animator;)V", "onAnimationEnd", "onAnimationCancel", "onAnimationStart", "core-ktx_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.ingka.ikea.app.uicomponents.view.progress.FullScreenProgressView$a$a  reason: collision with other inner class name */
        public static final class C2063a implements Animator.AnimatorListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ a f92735a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ FullScreenProgressView f92736b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ String f92737c;

            public C2063a(a aVar, FullScreenProgressView fullScreenProgressView, String str) {
                this.f92735a = aVar;
                this.f92736b = fullScreenProgressView;
                this.f92737c = str;
            }

            public void onAnimationCancel(Animator animator) {
                animator.removeAllListeners();
                this.f92735a.f92733a = null;
                this.f92736b.getText().setText(this.f92737c);
                this.f92736b.getText().setAlpha(1.0f);
                this.f92736b.getText().setTranslationY(0.0f);
            }

            public void onAnimationEnd(Animator animator) {
            }

            public void onAnimationRepeat(Animator animator) {
            }

            public void onAnimationStart(Animator animator) {
            }
        }

        @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\u0006¨\u0006\n"}, d2 = {"androidx/core/animation/AnimatorKt$addListener$listener$1", "Landroid/animation/Animator$AnimatorListener;", "Landroid/animation/Animator;", "animator", "LXH/N;", "onAnimationRepeat", "(Landroid/animation/Animator;)V", "onAnimationEnd", "onAnimationCancel", "onAnimationStart", "core-ktx_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class b implements Animator.AnimatorListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ a f92738a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ FullScreenProgressView f92739b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ String f92740c;

            public b(a aVar, FullScreenProgressView fullScreenProgressView, String str) {
                this.f92738a = aVar;
                this.f92739b = fullScreenProgressView;
                this.f92740c = str;
            }

            public void onAnimationCancel(Animator animator) {
            }

            public void onAnimationEnd(Animator animator) {
                animator.removeAllListeners();
                this.f92738a.f92733a = null;
                this.f92739b.getText().setText(this.f92740c);
                FullScreenProgressView fullScreenProgressView = this.f92739b;
                if (!fullScreenProgressView.isLaidOut() || fullScreenProgressView.isLayoutRequested()) {
                    fullScreenProgressView.addOnLayoutChangeListener(new c(this.f92738a));
                    return;
                }
                a aVar = this.f92738a;
                aVar.f92733a = aVar.e(800);
            }

            public void onAnimationRepeat(Animator animator) {
            }

            public void onAnimationStart(Animator animator) {
            }
        }

        @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001JW\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"androidx/core/view/ViewKt$doOnNextLayout$1", "Landroid/view/View$OnLayoutChangeListener;", "Landroid/view/View;", "view", "", "left", "top", "right", "bottom", "oldLeft", "oldTop", "oldRight", "oldBottom", "LXH/N;", "onLayoutChange", "(Landroid/view/View;IIIIIIII)V", "core-ktx_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class c implements View.OnLayoutChangeListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ a f92741a;

            public c(a aVar) {
                this.f92741a = aVar;
            }

            public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                view.removeOnLayoutChangeListener(this);
                a aVar = this.f92741a;
                aVar.f92733a = aVar.e(800);
            }
        }

        @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\u0006¨\u0006\n"}, d2 = {"androidx/core/animation/AnimatorKt$addListener$listener$1", "Landroid/animation/Animator$AnimatorListener;", "Landroid/animation/Animator;", "animator", "LXH/N;", "onAnimationRepeat", "(Landroid/animation/Animator;)V", "onAnimationEnd", "onAnimationCancel", "onAnimationStart", "core-ktx_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class d implements Animator.AnimatorListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ a f92742a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ FullScreenProgressView f92743b;

            public d(a aVar, FullScreenProgressView fullScreenProgressView) {
                this.f92742a = aVar;
                this.f92743b = fullScreenProgressView;
            }

            public void onAnimationCancel(Animator animator) {
                animator.removeAllListeners();
                this.f92742a.f92733a = null;
                this.f92743b.getText().setAlpha(1.0f);
                this.f92743b.getText().setTranslationY(0.0f);
            }

            public void onAnimationEnd(Animator animator) {
            }

            public void onAnimationRepeat(Animator animator) {
            }

            public void onAnimationStart(Animator animator) {
            }
        }

        @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\u0006¨\u0006\n"}, d2 = {"androidx/core/animation/AnimatorKt$addListener$listener$1", "Landroid/animation/Animator$AnimatorListener;", "Landroid/animation/Animator;", "animator", "LXH/N;", "onAnimationRepeat", "(Landroid/animation/Animator;)V", "onAnimationEnd", "onAnimationCancel", "onAnimationStart", "core-ktx_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class e implements Animator.AnimatorListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ a f92744a;

            public e(a aVar) {
                this.f92744a = aVar;
            }

            public void onAnimationCancel(Animator animator) {
            }

            public void onAnimationEnd(Animator animator) {
                animator.removeAllListeners();
                this.f92744a.f92733a = null;
            }

            public void onAnimationRepeat(Animator animator) {
            }

            public void onAnimationStart(Animator animator) {
            }
        }

        public a() {
        }

        private final AnimatorSet d(String str, String str2) {
            if (str.length() == 0) {
                FullScreenProgressView.this.getText().setText(str2);
                return e(400);
            }
            AnimatorSet animatorSet = new AnimatorSet();
            FullScreenProgressView fullScreenProgressView = FullScreenProgressView.this;
            animatorSet.playTogether(new Animator[]{ObjectAnimator.ofFloat(fullScreenProgressView.getText(), View.ALPHA, new float[]{0.0f}), ObjectAnimator.ofFloat(fullScreenProgressView.getText(), View.TRANSLATION_Y, new float[]{((float) fullScreenProgressView.getText().getMeasuredHeight()) * 0.33333334f})});
            animatorSet.addListener(new C2063a(this, fullScreenProgressView, str2));
            animatorSet.addListener(new b(this, fullScreenProgressView, str2));
            animatorSet.setDuration(300);
            animatorSet.start();
            return animatorSet;
        }

        /* access modifiers changed from: private */
        public final AnimatorSet e(long j10) {
            AnimatorSet animatorSet = new AnimatorSet();
            FullScreenProgressView fullScreenProgressView = FullScreenProgressView.this;
            fullScreenProgressView.getText().setAlpha(0.0f);
            fullScreenProgressView.getText().setTranslationY(((float) fullScreenProgressView.getText().getMeasuredHeight()) * 0.33333334f);
            animatorSet.playTogether(new Animator[]{ObjectAnimator.ofFloat(fullScreenProgressView.getText(), View.ALPHA, new float[]{1.0f}), ObjectAnimator.ofFloat(fullScreenProgressView.getText(), View.TRANSLATION_Y, new float[]{0.0f})});
            animatorSet.addListener(new d(this, fullScreenProgressView));
            animatorSet.addListener(new e(this));
            animatorSet.setStartDelay(j10);
            animatorSet.setDuration(300);
            animatorSet.start();
            return animatorSet;
        }

        public final void c() {
            AnimatorSet animatorSet = this.f92733a;
            if (animatorSet != null) {
                animatorSet.cancel();
                animatorSet.removeAllListeners();
            }
            this.f92733a = null;
        }

        public void run() {
            String str;
            if (FullScreenProgressView.this.isAttachedToWindow() && !FullScreenProgressView.this.f92718b.isEmpty()) {
                FullScreenProgressView fullScreenProgressView = FullScreenProgressView.this;
                fullScreenProgressView.f92717a = fullScreenProgressView.f92717a + 1;
                fullScreenProgressView.f92717a = FullScreenProgressView.this.f92717a < FullScreenProgressView.this.f92718b.size() ? FullScreenProgressView.this.f92717a : 0;
                String str2 = (String) FullScreenProgressView.this.f92718b.get(FullScreenProgressView.this.f92717a);
                c();
                CharSequence text = FullScreenProgressView.this.getText().getText();
                if (text == null || (str = text.toString()) == null) {
                    str = "";
                }
                this.f92733a = d(str, str2);
                FullScreenProgressView.this.f92728l.postDelayed(this, 5000);
            }
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002XT¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/ingka/ikea/app/uicomponents/view/progress/FullScreenProgressView$b;", "", "<init>", "()V", "Landroid/view/View;", "view", "Landroid/graphics/Rect;", "a", "(Landroid/view/View;)Landroid/graphics/Rect;", "", "TRANSLATION_FRACTION", "F", "uicomponents_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Rect a(View view) {
            C17542s.j(view, "view");
            Rect rect = new Rect();
            Drawable background = view.getBackground();
            LayerDrawable layerDrawable = background instanceof LayerDrawable ? (LayerDrawable) background : null;
            if (layerDrawable != null) {
                int numberOfLayers = layerDrawable.getNumberOfLayers();
                for (int i10 = 0; i10 < numberOfLayers; i10++) {
                    Drawable drawable = layerDrawable.getDrawable(i10);
                    InsetDrawable insetDrawable = drawable instanceof InsetDrawable ? (InsetDrawable) drawable : null;
                    if (insetDrawable != null) {
                        insetDrawable.getPadding(rect);
                    }
                }
            }
            return new Rect(view.getLeft() + rect.left, view.getTop() + rect.top, view.getRight() - rect.right, view.getBottom() - rect.bottom);
        }

        private b() {
        }
    }

    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001JW\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"androidx/core/view/ViewKt$doOnNextLayout$1", "Landroid/view/View$OnLayoutChangeListener;", "Landroid/view/View;", "view", "", "left", "top", "right", "bottom", "oldLeft", "oldTop", "oldRight", "oldBottom", "LXH/N;", "onLayoutChange", "(Landroid/view/View;IIIIIIII)V", "core-ktx_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c implements View.OnLayoutChangeListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ FullScreenProgressView f92745a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Rect f92746b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ float f92747c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ List f92748d;

        public c(FullScreenProgressView fullScreenProgressView, Rect rect, float f10, List list) {
            this.f92745a = fullScreenProgressView;
            this.f92746b = rect;
            this.f92747c = f10;
            this.f92748d = list;
        }

        public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            view.removeOnLayoutChangeListener(this);
            this.f92745a.y(this.f92746b, this.f92747c, this.f92748d);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\u0006¨\u0006\n"}, d2 = {"androidx/core/animation/AnimatorKt$addListener$listener$1", "Landroid/animation/Animator$AnimatorListener;", "Landroid/animation/Animator;", "animator", "LXH/N;", "onAnimationRepeat", "(Landroid/animation/Animator;)V", "onAnimationEnd", "onAnimationCancel", "onAnimationStart", "core-ktx_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class d implements Animator.AnimatorListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ FullScreenProgressView f92749a;

        public d(FullScreenProgressView fullScreenProgressView) {
            this.f92749a = fullScreenProgressView;
        }

        public void onAnimationCancel(Animator animator) {
        }

        public void onAnimationEnd(Animator animator) {
            this.f92749a.setContentAnimationRunning(true);
            animator.removeAllListeners();
            ValueAnimator valueAnimator = animator instanceof ValueAnimator ? (ValueAnimator) animator : null;
            if (valueAnimator != null) {
                valueAnimator.removeAllUpdateListeners();
            }
            this.f92749a.f92723g = null;
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
        }
    }

    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001JW\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"androidx/core/view/ViewKt$doOnNextLayout$1", "Landroid/view/View$OnLayoutChangeListener;", "Landroid/view/View;", "view", "", "left", "top", "right", "bottom", "oldLeft", "oldTop", "oldRight", "oldBottom", "LXH/N;", "onLayoutChange", "(Landroid/view/View;IIIIIIII)V", "core-ktx_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class e implements View.OnLayoutChangeListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ FullScreenProgressView f92750a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f92751b;

        public e(FullScreenProgressView fullScreenProgressView, List list) {
            this.f92750a = fullScreenProgressView;
            this.f92751b = list;
        }

        public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            view.removeOnLayoutChangeListener(this);
            this.f92750a.B(this.f92751b);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public FullScreenProgressView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        C17542s.j(context, "context");
    }

    /* access modifiers changed from: private */
    public final void B(List<String> list) {
        o();
        w(list);
        setContentAnimationRunning(true);
        this.f92726j.set(0.0f, 0.0f, i.a(getMeasuredWidth()), i.a(getMeasuredHeight()));
        this.f92727k = 0.0f;
    }

    /* access modifiers changed from: private */
    public static final TextView C(FullScreenProgressView fullScreenProgressView) {
        return (TextView) fullScreenProgressView.findViewById(C11067a.f90306t);
    }

    private final void D(boolean z10) {
        if (z10) {
            getBall().setVisibility(0);
            getBall().v();
            getText().setVisibility(0);
            getText().setText((CharSequence) null);
            this.f92728l.removeCallbacks(this.f92719c);
            this.f92719c.c();
            this.f92728l.post(this.f92719c);
            return;
        }
        this.f92728l.removeCallbacks(this.f92719c);
        this.f92719c.c();
        getText().setVisibility(8);
        getText().setText((CharSequence) null);
        getBall().setVisibility(8);
        getBall().t();
    }

    private final float E(float f10) {
        return this.f92722f.getInterpolation(p((f10 - 0.4f) / 0.6f));
    }

    private final LottieAnimationView getBall() {
        Object value = this.f92729m.getValue();
        C17542s.i(value, "getValue(...)");
        return (LottieAnimationView) value;
    }

    /* access modifiers changed from: private */
    public final TextView getText() {
        Object value = this.f92730n.getValue();
        C17542s.i(value, "getValue(...)");
        return (TextView) value;
    }

    /* access modifiers changed from: private */
    public static final LottieAnimationView n(FullScreenProgressView fullScreenProgressView) {
        return (LottieAnimationView) fullScreenProgressView.findViewById(C11067a.f90289c);
    }

    private final void o() {
        ValueAnimator valueAnimator = this.f92723g;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            valueAnimator.removeAllUpdateListeners();
            valueAnimator.removeAllListeners();
            this.f92723g = null;
        }
    }

    private final float p(float f10) {
        return C17978n.l(f10, 0.0f, 1.0f);
    }

    private final void q(float f10, RectF rectF, RectF rectF2) {
        rectF2.left = this.f92720d.evaluate(f10, Float.valueOf(rectF.left), Float.valueOf(0.0f)).floatValue();
        rectF2.right = this.f92720d.evaluate(f10, Float.valueOf(rectF.right), Float.valueOf(i.a(getMeasuredWidth()))).floatValue();
    }

    private final void r(float f10, RectF rectF, RectF rectF2) {
        rectF2.top = this.f92720d.evaluate(f10, Float.valueOf(rectF.top), Float.valueOf(0.0f)).floatValue();
        rectF2.bottom = this.f92720d.evaluate(f10, Float.valueOf(rectF.bottom), Float.valueOf(i.a(getMeasuredHeight()))).floatValue();
    }

    private final float s(float f10) {
        return this.f92721e.getInterpolation(p(f10 / 0.4f));
    }

    /* access modifiers changed from: private */
    public final void setContentAnimationRunning(boolean z10) {
        this.f92731o.b(this, f92716r[0], Boolean.valueOf(z10));
    }

    private final boolean t() {
        return ((Boolean) this.f92731o.a(this, f92716r[0])).booleanValue();
    }

    /* access modifiers changed from: private */
    public static final C16807N u(FullScreenProgressView fullScreenProgressView, boolean z10) {
        if (fullScreenProgressView.isAttachedToWindow() && fullScreenProgressView.getVisibility() == 0) {
            fullScreenProgressView.D(z10);
        }
        return C16807N.f139792a;
    }

    private final void v(float f10, float f11) {
        this.f92727k = this.f92720d.evaluate(f10, Float.valueOf(f11), Float.valueOf(0.0f)).floatValue();
    }

    private final void w(List<String> list) {
        this.f92718b.clear();
        this.f92718b.addAll(list);
        this.f92717a = -1;
        getText().setText((CharSequence) null);
    }

    /* access modifiers changed from: private */
    public final void y(Rect rect, float f10, List<String> list) {
        o();
        w(list);
        setContentAnimationRunning(false);
        this.f92726j.setEmpty();
        this.f92727k = 0.0f;
        this.f92725i = new RectF(rect);
        this.f92724h = f10;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        ofFloat.addUpdateListener(new C11514d(this));
        C17542s.g(ofFloat);
        ofFloat.addListener(new d(this));
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.setDuration(400);
        ofFloat.start();
        this.f92723g = ofFloat;
    }

    /* access modifiers changed from: private */
    public static final void z(FullScreenProgressView fullScreenProgressView, ValueAnimator valueAnimator) {
        C17542s.j(valueAnimator, "it");
        Object animatedValue = valueAnimator.getAnimatedValue();
        C17542s.h(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((Float) animatedValue).floatValue();
        float s10 = fullScreenProgressView.s(floatValue);
        fullScreenProgressView.v(s10, fullScreenProgressView.f92724h);
        RectF rectF = fullScreenProgressView.f92725i;
        RectF rectF2 = null;
        if (rectF == null) {
            C17542s.z("srcRect");
            rectF = null;
        }
        fullScreenProgressView.q(s10, rectF, fullScreenProgressView.f92726j);
        float E10 = fullScreenProgressView.E(floatValue);
        RectF rectF3 = fullScreenProgressView.f92725i;
        if (rectF3 == null) {
            C17542s.z("srcRect");
        } else {
            rectF2 = rectF3;
        }
        fullScreenProgressView.r(E10, rectF2, fullScreenProgressView.f92726j);
        fullScreenProgressView.invalidate();
    }

    public final void A(List<String> list) {
        C17542s.j(list, "messages");
        if (!isLaidOut() || isLayoutRequested()) {
            addOnLayoutChangeListener(new e(this, list));
        } else {
            B(list);
        }
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        C17542s.j(canvas, "canvas");
        RectF rectF = this.f92726j;
        float f10 = this.f92727k;
        canvas.drawRoundRect(rectF, f10, f10, this.f92732p);
        super.dispatchDraw(canvas);
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        D(t());
        ValueAnimator valueAnimator = this.f92723g;
        if (valueAnimator != null) {
            valueAnimator.resume();
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        D(false);
        ValueAnimator valueAnimator = this.f92723g;
        if (valueAnimator != null) {
            valueAnimator.pause();
        }
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (this.f92723g == null) {
            this.f92726j.set(0.0f, 0.0f, i.a(i10), i.a(i11));
        }
    }

    public void setVisibility(int i10) {
        int visibility = getVisibility();
        super.setVisibility(i10);
        if (visibility != i10) {
            D(i10 == 0 && t());
        }
    }

    public final void x(Rect rect, float f10, List<String> list) {
        C17542s.j(rect, "src");
        C17542s.j(list, "messages");
        if (!isLaidOut() || isLayoutRequested()) {
            addOnLayoutChangeListener(new c(this, rect, f10, list));
        } else {
            y(rect, f10, list);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FullScreenProgressView(Context context, AttributeSet attributeSet, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FullScreenProgressView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        C17542s.j(context, "context");
        this.f92717a = -1;
        this.f92718b = new ArrayList();
        this.f92719c = new a();
        this.f92720d = new FloatEvaluator();
        this.f92721e = new h3.c();
        this.f92722f = new AccelerateInterpolator();
        this.f92726j = new RectF();
        this.f92728l = new Handler(Looper.getMainLooper());
        this.f92729m = C16825p.b(new C11511a(this));
        this.f92730n = C16825p.b(new C11512b(this));
        this.f92731o = m.a(Boolean.FALSE, new C11513c(this));
        Paint paint = new Paint(1);
        paint.setColor(C6012a.c(context, C18010a.f147420d));
        paint.setStyle(Paint.Style.FILL);
        this.f92732p = paint;
        View.inflate(context, C11068b.f90313a, this);
        LottieAnimationView ball = getBall();
        ball.setRepeatCount(-1);
        ball.setRepeatMode(1);
        ball.setVisibility(8);
        setClickable(true);
        setFocusable(true);
    }
}
