package com.ingka.ikea.app.uicomponents.view;

import I2.C4610g0;
import XH.C16807N;
import XH.t;
import al.C11067a;
import al.C11068b;
import al.C11069c;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.airbnb.lottie.o;
import com.google.android.material.button.MaterialButton;
import fI.C17221b;
import ip.m;
import jl.C11427a;
import jl.C11428b;
import kotlin.Metadata;
import kotlin.jvm.internal.A;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.P;
import lg.C10028e;
import qI.C17785b;
import u2.C6012a;
import uI.C18064m;
import w6.C8927i;
import w6.r;

@Metadata(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 g2\u00020\u0001:\u0003:A=B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0019\u001a\u00020\u000e2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001d\u001a\u00020\u000e2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b \u0010!J\u0011\u0010#\u001a\u0004\u0018\u00010\"H\u0002¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u0013H\u0016¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u000eH\u0014¢\u0006\u0004\b'\u0010(J\u0019\u0010*\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010)H\u0016¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\u000eH\u0014¢\u0006\u0004\b,\u0010(J\u000f\u0010-\u001a\u00020\u000eH\u0014¢\u0006\u0004\b-\u0010(J\u0017\u0010/\u001a\u00020\u000e2\u0006\u0010.\u001a\u00020\u0013H\u0016¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020\u0013H\u0016¢\u0006\u0004\b1\u0010&J\u0017\u00103\u001a\u00020\u000e2\u0006\u00102\u001a\u00020\u0013H\u0016¢\u0006\u0004\b3\u00100J\u0017\u00105\u001a\u00020\u000e2\b\b\u0001\u00104\u001a\u00020\u0006¢\u0006\u0004\b5\u00106J\r\u00107\u001a\u00020\u000e¢\u0006\u0004\b7\u0010(J\u0017\u00108\u001a\u00020\u000e2\b\b\u0002\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b8\u00100R\u0014\u0010<\u001a\u0002098\u0002X\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0016\u0010?\u001a\u00020\n8\u0002@\u0002X.¢\u0006\u0006\n\u0004\b=\u0010>R\u0016\u0010C\u001a\u00020@8\u0002@\u0002X.¢\u0006\u0006\n\u0004\bA\u0010BR\u0016\u0010G\u001a\u00020D8\u0002@\u0002X.¢\u0006\u0006\n\u0004\bE\u0010FR\u0016\u0010K\u001a\u00020H8\u0002@\u0002X.¢\u0006\u0006\n\u0004\bI\u0010JR\u0018\u0010N\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bL\u0010MR\u0016\u0010Q\u001a\u00020\u00118\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bO\u0010PR\u0016\u00102\u001a\u00020\u00138\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b \u0010RR+\u0010\u001c\u001a\u00020\u001b2\u0006\u0010S\u001a\u00020\u001b8F@FX\u0002¢\u0006\u0012\n\u0004\b\u000b\u0010T\u001a\u0004\bU\u0010V\"\u0004\bW\u0010\u001eR\"\u0010\\\u001a\u00020\u001b8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010V\"\u0004\b[\u0010\u001eR$\u0010b\u001a\u0004\u0018\u00010\u00178\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b]\u0010^\u001a\u0004\b_\u0010`\"\u0004\ba\u0010\u001aR\u0018\u0010e\u001a\u0004\u0018\u00010c8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010dR\u0011\u0010f\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\bX\u0010&¨\u0006h"}, d2 = {"Lcom/ingka/ikea/app/uicomponents/view/LoadingMaterialButton;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lcom/google/android/material/button/MaterialButton;", "i", "()Lcom/google/android/material/button/MaterialButton;", "materialButton", "LXH/N;", "l", "(Lcom/google/android/material/button/MaterialButton;)V", "Lcom/ingka/ikea/app/uicomponents/view/LoadingMaterialButton$c;", "nextState", "", "showSuccess", "s", "(Lcom/ingka/ikea/app/uicomponents/view/LoadingMaterialButton$c;Z)V", "Landroid/graphics/drawable/Drawable;", "drawable", "setButtonDrawable", "(Landroid/graphics/drawable/Drawable;)V", "", "text", "setButtonText", "(Ljava/lang/String;)V", "Landroid/animation/AnimatorSet;", "h", "()Landroid/animation/AnimatorSet;", "Landroid/animation/Animator;", "n", "()Landroid/animation/Animator;", "isImportantForAccessibility", "()Z", "onFinishInflate", "()V", "Landroid/view/View$OnClickListener;", "setOnClickListener", "(Landroid/view/View$OnClickListener;)V", "onAttachedToWindow", "onDetachedFromWindow", "enabled", "setEnabled", "(Z)V", "isClickable", "clickable", "setClickable", "resId", "setTextColorResource", "(I)V", "o", "p", "Lcom/airbnb/lottie/o;", "a", "Lcom/airbnb/lottie/o;", "loadingDrawable", "b", "Lcom/google/android/material/button/MaterialButton;", "button", "Landroid/widget/ImageView;", "c", "Landroid/widget/ImageView;", "buttonIcon", "Landroid/widget/TextView;", "d", "Landroid/widget/TextView;", "buttonText", "Landroid/view/View;", "e", "Landroid/view/View;", "textContainer", "f", "Landroid/animation/Animator;", "animator", "g", "Lcom/ingka/ikea/app/uicomponents/view/LoadingMaterialButton$c;", "currentState", "Z", "<set-?>", "LqI/b;", "getText", "()Ljava/lang/String;", "setText", "j", "Ljava/lang/String;", "getSuccessText", "setSuccessText", "successText", "k", "Landroid/graphics/drawable/Drawable;", "getSuccessDrawable", "()Landroid/graphics/drawable/Drawable;", "setSuccessDrawable", "successDrawable", "Lcom/ingka/ikea/app/uicomponents/view/LoadingMaterialButton$a;", "Lcom/ingka/ikea/app/uicomponents/view/LoadingMaterialButton$a;", "attributes", "isLoading", "m", "uicomponents_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class LoadingMaterialButton extends FrameLayout {

    /* renamed from: m  reason: collision with root package name */
    public static final b f92694m = new b((DefaultConstructorMarker) null);

    /* renamed from: n  reason: collision with root package name */
    static final /* synthetic */ C18064m<Object>[] f92695n = {P.e(new A(LoadingMaterialButton.class, "text", "getText()Ljava/lang/String;", 0))};

    /* renamed from: a  reason: collision with root package name */
    private final o f92696a;

    /* renamed from: b  reason: collision with root package name */
    private MaterialButton f92697b;

    /* renamed from: c  reason: collision with root package name */
    private ImageView f92698c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public TextView f92699d;

    /* renamed from: e  reason: collision with root package name */
    private View f92700e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public Animator f92701f;

    /* renamed from: g  reason: collision with root package name */
    private c f92702g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f92703h;

    /* renamed from: i  reason: collision with root package name */
    private final C17785b f92704i;

    /* renamed from: j  reason: collision with root package name */
    private String f92705j;

    /* renamed from: k  reason: collision with root package name */
    private Drawable f92706k;

    /* renamed from: l  reason: collision with root package name */
    private a f92707l;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0015\u0010\nR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/ingka/ikea/app/uicomponents/view/LoadingMaterialButton$a;", "", "", "text", "successText", "Landroid/graphics/drawable/Drawable;", "successDrawable", "<init>", "(Ljava/lang/String;Ljava/lang/String;Landroid/graphics/drawable/Drawable;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "Landroid/graphics/drawable/Drawable;", "()Landroid/graphics/drawable/Drawable;", "uicomponents_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final String f92708a;

        /* renamed from: b  reason: collision with root package name */
        private final String f92709b;

        /* renamed from: c  reason: collision with root package name */
        private final Drawable f92710c;

        public a(String str, String str2, Drawable drawable) {
            C17542s.j(str, "text");
            C17542s.j(str2, "successText");
            this.f92708a = str;
            this.f92709b = str2;
            this.f92710c = drawable;
        }

        public final Drawable a() {
            return this.f92710c;
        }

        public final String b() {
            return this.f92709b;
        }

        public final String c() {
            return this.f92708a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return C17542s.e(this.f92708a, aVar.f92708a) && C17542s.e(this.f92709b, aVar.f92709b) && C17542s.e(this.f92710c, aVar.f92710c);
        }

        public int hashCode() {
            int hashCode = ((this.f92708a.hashCode() * 31) + this.f92709b.hashCode()) * 31;
            Drawable drawable = this.f92710c;
            return hashCode + (drawable == null ? 0 : drawable.hashCode());
        }

        public String toString() {
            String str = this.f92708a;
            String str2 = this.f92709b;
            Drawable drawable = this.f92710c;
            return "Attributes(text=" + str + ", successText=" + str2 + ", successDrawable=" + drawable + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/ingka/ikea/app/uicomponents/view/LoadingMaterialButton$b;", "", "<init>", "()V", "", "SUCCESS_ANIMATION_DELAY", "J", "uicomponents_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/ingka/ikea/app/uicomponents/view/LoadingMaterialButton$c;", "", "<init>", "(Ljava/lang/String;I)V", "IDLE", "LOADING", "uicomponents_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private enum c {
        IDLE,
        LOADING;

        static {
            c[] a10;
            $ENTRIES = C17221b.a(a10);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class d {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f92711a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                com.ingka.ikea.app.uicomponents.view.LoadingMaterialButton$c[] r0 = com.ingka.ikea.app.uicomponents.view.LoadingMaterialButton.c.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ingka.ikea.app.uicomponents.view.LoadingMaterialButton$c r1 = com.ingka.ikea.app.uicomponents.view.LoadingMaterialButton.c.IDLE     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                com.ingka.ikea.app.uicomponents.view.LoadingMaterialButton$c r1 = com.ingka.ikea.app.uicomponents.view.LoadingMaterialButton.c.LOADING     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                f92711a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.app.uicomponents.view.LoadingMaterialButton.d.<clinit>():void");
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\u0006¨\u0006\n"}, d2 = {"androidx/core/animation/AnimatorKt$addListener$listener$1", "Landroid/animation/Animator$AnimatorListener;", "Landroid/animation/Animator;", "animator", "LXH/N;", "onAnimationRepeat", "(Landroid/animation/Animator;)V", "onAnimationEnd", "onAnimationCancel", "onAnimationStart", "core-ktx_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class e implements Animator.AnimatorListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ LoadingMaterialButton f92712a;

        public e(LoadingMaterialButton loadingMaterialButton) {
            this.f92712a = loadingMaterialButton;
        }

        public void onAnimationCancel(Animator animator) {
        }

        public void onAnimationEnd(Animator animator) {
            animator.removeAllListeners();
            this.f92712a.f92701f = null;
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\u0006¨\u0006\n"}, d2 = {"androidx/core/animation/AnimatorKt$addListener$listener$1", "Landroid/animation/Animator$AnimatorListener;", "Landroid/animation/Animator;", "animator", "LXH/N;", "onAnimationRepeat", "(Landroid/animation/Animator;)V", "onAnimationEnd", "onAnimationCancel", "onAnimationStart", "core-ktx_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class f implements Animator.AnimatorListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ LoadingMaterialButton f92713a;

        public f(LoadingMaterialButton loadingMaterialButton) {
            this.f92713a = loadingMaterialButton;
        }

        public void onAnimationCancel(Animator animator) {
        }

        public void onAnimationEnd(Animator animator) {
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
            TextView d10 = this.f92713a.f92699d;
            if (d10 == null) {
                C17542s.z("buttonText");
                d10 = null;
            }
            Object systemService = d10.getContext().getSystemService("accessibility");
            C17542s.h(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
            AccessibilityManager accessibilityManager = (AccessibilityManager) systemService;
            if (accessibilityManager.isEnabled()) {
                AccessibilityEvent obtain = AccessibilityEvent.obtain(16384);
                this.f92713a.onInitializeAccessibilityEvent(obtain);
                obtain.getText().add(this.f92713a.getSuccessText());
                obtain.setContentDescription((CharSequence) null);
                accessibilityManager.sendAccessibilityEvent(obtain);
            }
            LoadingMaterialButton loadingMaterialButton = this.f92713a;
            loadingMaterialButton.setButtonText(loadingMaterialButton.getSuccessText());
            LoadingMaterialButton loadingMaterialButton2 = this.f92713a;
            loadingMaterialButton2.setButtonDrawable(loadingMaterialButton2.getSuccessDrawable());
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\u0006¨\u0006\n"}, d2 = {"androidx/core/animation/AnimatorKt$addListener$listener$1", "Landroid/animation/Animator$AnimatorListener;", "Landroid/animation/Animator;", "animator", "LXH/N;", "onAnimationRepeat", "(Landroid/animation/Animator;)V", "onAnimationEnd", "onAnimationCancel", "onAnimationStart", "core-ktx_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class g implements Animator.AnimatorListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ LoadingMaterialButton f92714a;

        public g(LoadingMaterialButton loadingMaterialButton) {
            this.f92714a = loadingMaterialButton;
        }

        public void onAnimationCancel(Animator animator) {
        }

        public void onAnimationEnd(Animator animator) {
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
            LoadingMaterialButton loadingMaterialButton = this.f92714a;
            loadingMaterialButton.setButtonText(loadingMaterialButton.getText());
            this.f92714a.setButtonDrawable((Drawable) null);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public LoadingMaterialButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        C17542s.j(context, "context");
    }

    private final AnimatorSet h() {
        AnimatorSet animatorSet = new AnimatorSet();
        AnimatorSet animatorSet2 = new AnimatorSet();
        View view = this.f92700e;
        if (view == null) {
            C17542s.z("textContainer");
            view = null;
        }
        float measuredHeight = ((float) view.getMeasuredHeight()) / 2.0f;
        View view2 = this.f92700e;
        if (view2 == null) {
            C17542s.z("textContainer");
            view2 = null;
        }
        Property property = View.ALPHA;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view2, property, new float[]{0.0f, 1.0f});
        View view3 = this.f92700e;
        if (view3 == null) {
            C17542s.z("textContainer");
            view3 = null;
        }
        Property property2 = View.TRANSLATION_Y;
        animatorSet2.playTogether(new Animator[]{ofFloat, ObjectAnimator.ofFloat(view3, property2, new float[]{measuredHeight, 0.0f})});
        animatorSet2.addListener(new f(this));
        AnimatorSet animatorSet3 = new AnimatorSet();
        View view4 = this.f92700e;
        if (view4 == null) {
            C17542s.z("textContainer");
            view4 = null;
        }
        float f10 = ((float) (-view4.getMeasuredHeight())) / 2.0f;
        View view5 = this.f92700e;
        if (view5 == null) {
            C17542s.z("textContainer");
            view5 = null;
        }
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view5, property, new float[]{1.0f, 0.0f});
        View view6 = this.f92700e;
        if (view6 == null) {
            C17542s.z("textContainer");
            view6 = null;
        }
        animatorSet3.playTogether(new Animator[]{ofFloat2, ObjectAnimator.ofFloat(view6, property2, new float[]{0.0f, f10})});
        animatorSet3.setStartDelay(2000);
        AnimatorSet animatorSet4 = new AnimatorSet();
        View view7 = this.f92700e;
        if (view7 == null) {
            C17542s.z("textContainer");
            view7 = null;
        }
        float measuredHeight2 = ((float) view7.getMeasuredHeight()) / 2.0f;
        View view8 = this.f92700e;
        if (view8 == null) {
            C17542s.z("textContainer");
            view8 = null;
        }
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(view8, property, new float[]{0.0f, 1.0f});
        View view9 = this.f92700e;
        if (view9 == null) {
            C17542s.z("textContainer");
            view9 = null;
        }
        animatorSet4.playTogether(new Animator[]{ofFloat3, ObjectAnimator.ofFloat(view9, property2, new float[]{measuredHeight2, 0.0f})});
        animatorSet4.addListener(new g(this));
        animatorSet.playSequentially(new Animator[]{animatorSet2, animatorSet3, animatorSet4});
        animatorSet.addListener(new e(this));
        return animatorSet;
    }

    private final MaterialButton i() {
        View.inflate(getContext(), C11068b.f90314b, this);
        View findViewById = findViewById(C11067a.f90290d);
        C17542s.i(findViewById, "findViewById(...)");
        return (MaterialButton) findViewById;
    }

    /* access modifiers changed from: private */
    public static final void k(o oVar, C8927i iVar) {
        oVar.C0(iVar);
    }

    private final void l(MaterialButton materialButton) {
        View.inflate(getContext(), C11068b.f90315c, this);
        this.f92697b = materialButton;
        this.f92700e = findViewById(C11067a.f90310x);
        this.f92699d = (TextView) findViewById(C11067a.f90294h);
        ImageView imageView = (ImageView) findViewById(C11067a.f90293g);
        this.f92696a.setCallback(imageView);
        this.f92698c = imageView;
        a aVar = this.f92707l;
        if (aVar != null) {
            setText(aVar.c());
            this.f92705j = aVar.b();
            this.f92706k = aVar.a();
        }
        this.f92707l = null;
    }

    /* access modifiers changed from: private */
    public static final void m(LoadingMaterialButton loadingMaterialButton, View.OnClickListener onClickListener, View view) {
        if (loadingMaterialButton.f92703h && onClickListener != null) {
            MaterialButton materialButton = loadingMaterialButton.f92697b;
            if (materialButton == null) {
                C17542s.z("button");
                materialButton = null;
            }
            onClickListener.onClick(materialButton);
        }
    }

    private final Animator n() {
        Animator animator = this.f92701f;
        if (animator == null) {
            return null;
        }
        animator.cancel();
        animator.removeAllListeners();
        this.f92701f = null;
        return animator;
    }

    public static /* synthetic */ void q(LoadingMaterialButton loadingMaterialButton, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        loadingMaterialButton.p(z10);
    }

    /* access modifiers changed from: private */
    public static final C16807N r(LoadingMaterialButton loadingMaterialButton, String str) {
        C17542s.j(str, "it");
        if (loadingMaterialButton.f92702g == c.IDLE) {
            loadingMaterialButton.setButtonText(str);
        }
        MaterialButton materialButton = loadingMaterialButton.f92697b;
        if (materialButton == null) {
            C17542s.z("button");
            materialButton = null;
        }
        materialButton.setContentDescription(str);
        return C16807N.f139792a;
    }

    private final void s(c cVar, boolean z10) {
        c cVar2;
        c cVar3 = this.f92702g;
        int i10 = d.f92711a[cVar3.ordinal()];
        if (cVar3 != cVar) {
            if (i10 == 1) {
                n();
                o oVar = this.f92696a;
                oVar.start();
                C16807N n10 = C16807N.f139792a;
                setButtonDrawable(oVar);
                setButtonText((String) null);
                announceForAccessibility(getContext().getString(Oo.b.f84808v));
                cVar2 = c.LOADING;
            } else if (i10 == 2) {
                n();
                this.f92696a.stop();
                if (z10) {
                    AnimatorSet h10 = h();
                    h10.start();
                    C16807N n11 = C16807N.f139792a;
                    this.f92701f = h10;
                } else {
                    setButtonDrawable((Drawable) null);
                    setButtonText(getText());
                }
                announceForAccessibility(getContext().getString(Oo.b.f84775s));
                cVar2 = c.IDLE;
            } else {
                throw new t();
            }
            this.f92702g = cVar2;
        }
    }

    /* access modifiers changed from: private */
    public final void setButtonDrawable(Drawable drawable) {
        ImageView imageView = this.f92698c;
        ImageView imageView2 = null;
        if (imageView == null) {
            C17542s.z("buttonIcon");
            imageView = null;
        }
        int i10 = 0;
        if (!(drawable != null)) {
            i10 = 8;
        }
        imageView.setVisibility(i10);
        ImageView imageView3 = this.f92698c;
        if (imageView3 == null) {
            C17542s.z("buttonIcon");
        } else {
            imageView2 = imageView3;
        }
        imageView2.setImageDrawable(drawable);
    }

    /* access modifiers changed from: private */
    public final void setButtonText(String str) {
        TextView textView = this.f92699d;
        TextView textView2 = null;
        if (textView == null) {
            C17542s.z("buttonText");
            textView = null;
        }
        int i10 = 0;
        if (str == null || str.length() == 0) {
            i10 = 8;
        }
        textView.setVisibility(i10);
        TextView textView3 = this.f92699d;
        if (textView3 == null) {
            C17542s.z("buttonText");
        } else {
            textView2 = textView3;
        }
        textView2.setText(str);
    }

    static /* synthetic */ void t(LoadingMaterialButton loadingMaterialButton, c cVar, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        loadingMaterialButton.s(cVar, z10);
    }

    public final Drawable getSuccessDrawable() {
        return this.f92706k;
    }

    public final String getSuccessText() {
        return this.f92705j;
    }

    public final String getText() {
        return (String) this.f92704i.a(this, f92695n[0]);
    }

    public boolean isClickable() {
        return this.f92703h;
    }

    public boolean isImportantForAccessibility() {
        return false;
    }

    public final boolean j() {
        return this.f92702g == c.LOADING;
    }

    public final void o() {
        c cVar = this.f92702g;
        c cVar2 = c.LOADING;
        if (cVar != cVar2) {
            t(this, cVar2, false, 2, (Object) null);
        }
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f92702g == c.LOADING) {
            setButtonText((String) null);
            o oVar = this.f92696a;
            oVar.start();
            setButtonDrawable(oVar);
            return;
        }
        setButtonText(getText());
        setButtonDrawable((Drawable) null);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        n();
        this.f92696a.stop();
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        MaterialButton materialButton;
        super.onFinishInflate();
        int childCount = getChildCount();
        if (childCount == 0) {
            materialButton = i();
        } else if (childCount == 1) {
            View a10 = C4610g0.a(this, 0);
            if (a10 instanceof MaterialButton) {
                materialButton = (MaterialButton) a10;
            } else {
                throw new IllegalStateException("Only MaterialButton is supported");
            }
        } else {
            throw new IllegalStateException("Only supports a single MaterialButton");
        }
        l(materialButton);
    }

    public final void p(boolean z10) {
        if (this.f92702g == c.LOADING) {
            s(c.IDLE, z10);
        }
    }

    public void setClickable(boolean z10) {
        this.f92703h = z10;
    }

    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        MaterialButton materialButton = this.f92697b;
        TextView textView = null;
        if (materialButton == null) {
            C17542s.z("button");
            materialButton = null;
        }
        materialButton.setEnabled(z10);
        ImageView imageView = this.f92698c;
        if (imageView == null) {
            C17542s.z("buttonIcon");
            imageView = null;
        }
        imageView.setEnabled(z10);
        TextView textView2 = this.f92699d;
        if (textView2 == null) {
            C17542s.z("buttonText");
        } else {
            textView = textView2;
        }
        textView.setEnabled(z10);
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        MaterialButton materialButton = this.f92697b;
        if (materialButton == null) {
            C17542s.z("button");
            materialButton = null;
        }
        materialButton.setOnClickListener(new C11427a(this, onClickListener));
    }

    public final void setSuccessDrawable(Drawable drawable) {
        this.f92706k = drawable;
    }

    public final void setSuccessText(String str) {
        C17542s.j(str, "<set-?>");
        this.f92705j = str;
    }

    public final void setText(String str) {
        C17542s.j(str, "<set-?>");
        this.f92704i.b(this, f92695n[0], str);
    }

    public final void setTextColorResource(int i10) {
        TextView textView = this.f92699d;
        if (textView == null) {
            C17542s.z("buttonText");
            textView = null;
        }
        textView.setTextColor(C6012a.c(getContext(), i10));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ LoadingMaterialButton(Context context, AttributeSet attributeSet, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LoadingMaterialButton(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        C17542s.j(context, "context");
        o oVar = new o();
        r.t(context, C10028e.f75288a).d(new C11428b(oVar));
        oVar.X0(-1);
        oVar.Y0(1);
        this.f92696a = oVar;
        this.f92702g = c.IDLE;
        this.f92703h = true;
        this.f92704i = m.a("", new jl.c(this));
        this.f92705j = "";
        if (attributeSet == null) {
            l(i());
            return;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C11069c.f90332a);
        C17542s.i(obtainStyledAttributes, "obtainStyledAttributes(...)");
        String string = obtainStyledAttributes.getString(C11069c.f90333b);
        string = string == null ? getText() : string;
        String string2 = obtainStyledAttributes.getString(C11069c.f90335d);
        string2 = string2 == null ? this.f92705j : string2;
        Drawable drawable = obtainStyledAttributes.getDrawable(C11069c.f90334c);
        this.f92707l = new a(string, string2, drawable == null ? this.f92706k : drawable);
        C16807N n10 = C16807N.f139792a;
        obtainStyledAttributes.recycle();
    }
}
