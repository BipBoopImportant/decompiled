package com.sugarcube.app.base.ui.hybrid;

import JF.Z;
import OE.C13316h;
import XH.C16824o;
import XH.C16825p;
import YH.C16877v;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RotateDrawable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SizeF;
import android.view.View;
import android.view.animation.LinearInterpolator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0014\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 d2\u00020\u0001:\u0001-B\u001d\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J'\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0014¢\u0006\u0004\b\u001e\u0010\u001fJ\u001d\u0010\"\u001a\u00020\b2\u0006\u0010 \u001a\u00020\u000b2\u0006\u0010!\u001a\u00020\u000b¢\u0006\u0004\b\"\u0010#J\u0015\u0010%\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020$¢\u0006\u0004\b%\u0010&J\r\u0010'\u001a\u00020\u0015¢\u0006\u0004\b'\u0010(J\u0015\u0010*\u001a\u00020\u00152\u0006\u0010)\u001a\u00020\u001a¢\u0006\u0004\b*\u0010+J\u0015\u0010,\u001a\u00020\u00152\u0006\u0010)\u001a\u00020\u001a¢\u0006\u0004\b,\u0010+R\u0018\u0010/\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u00103\u001a\u0002008\u0002X\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u001a\u00107\u001a\b\u0012\u0004\u0012\u000205048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001c\u00106R\u0016\u00109\u001a\u00020\u001a8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0016\u00108R\u0016\u0010<\u001a\u00020:8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\t\u0010;R\u0016\u0010?\u001a\u00020=8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b'\u0010>R\u0016\u0010@\u001a\u00020\u001a8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\"\u00108R\u001a\u0010C\u001a\b\u0012\u0004\u0012\u00020\u000b0A8\u0002X\u0004¢\u0006\u0006\n\u0004\b,\u0010BR\u0016\u0010\u0019\u001a\u00020D8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bE\u0010FR\u001b\u0010J\u001a\u00020\u001a8BX\u0002¢\u0006\f\n\u0004\b*\u0010G\u001a\u0004\bH\u0010IR\u001b\u0010M\u001a\u00020\u001a8BX\u0002¢\u0006\f\n\u0004\bK\u0010G\u001a\u0004\bL\u0010IR\u001c\u0010P\u001a\b\u0012\u0004\u0012\u00020N048\u0002@\u0002X.¢\u0006\u0006\n\u0004\b\u000f\u0010OR\u001c\u0010R\u001a\b\u0012\u0004\u0012\u00020N048\u0002@\u0002X.¢\u0006\u0006\n\u0004\bQ\u0010OR\u0016\u0010U\u001a\u00020N8\u0002@\u0002X.¢\u0006\u0006\n\u0004\bS\u0010TR\u0016\u0010W\u001a\u00020N8\u0002@\u0002X.¢\u0006\u0006\n\u0004\bV\u0010TR\u0016\u0010Y\u001a\u00020N8\u0002@\u0002X.¢\u0006\u0006\n\u0004\bX\u0010TR\u0016\u0010]\u001a\u00020Z8\u0002@\u0002X.¢\u0006\u0006\n\u0004\b[\u0010\\R\u001c\u0010_\u001a\b\u0012\u0004\u0012\u00020N048\u0002@\u0002X.¢\u0006\u0006\n\u0004\b^\u0010OR\u0016\u0010c\u001a\u00020`8\u0002@\u0002X.¢\u0006\u0006\n\u0004\ba\u0010b¨\u0006e"}, d2 = {"Lcom/sugarcube/app/base/ui/hybrid/PanoTargetView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "LXH/N;", "e", "()V", "", "x", "y", "z", "l", "(FFF)V", "Landroid/graphics/Canvas;", "canvas", "xOffset", "yOffset", "", "d", "(Landroid/graphics/Canvas;FF)Z", "angle", "fov", "", "size", "c", "(FFI)F", "onDraw", "(Landroid/graphics/Canvas;)V", "horizonalAngle", "verticalAngle", "g", "(FF)V", "Lcom/sugarcube/app/base/ui/hybrid/PanoTargetListener;", "setListener", "(Lcom/sugarcube/app/base/ui/hybrid/PanoTargetListener;)V", "f", "()Z", "idx", "j", "(I)Z", "h", "a", "Lcom/sugarcube/app/base/ui/hybrid/PanoTargetListener;", "listener", "", "b", "[F", "angles", "", "Lcom/sugarcube/app/base/ui/hybrid/N0;", "[Lcom/sugarcube/app/base/ui/hybrid/N0;", "states", "I", "targetIdx", "", "J", "aminateStartMs", "", "D", "targetLockThreshold", "targetLockTimeMs", "", "Ljava/util/List;", "targetAngles", "Landroid/util/SizeF;", "i", "Landroid/util/SizeF;", "LXH/o;", "getTargetSize", "()I", "targetSize", "k", "getTargetGuideSize", "targetGuideSize", "Landroid/graphics/drawable/Drawable;", "[Landroid/graphics/drawable/Drawable;", "targetActiveList", "m", "targetInactiveList", "n", "Landroid/graphics/drawable/Drawable;", "targetGuideDrawable", "o", "targetAnimateDrawable", "p", "targetAnimateShapeDrawable", "Landroid/graphics/drawable/RotateDrawable;", "q", "Landroid/graphics/drawable/RotateDrawable;", "targetAnimateRotateDrawable", "r", "targetDoneDrawable", "Landroid/animation/ObjectAnimator;", "s", "Landroid/animation/ObjectAnimator;", "rotateAnim", "t", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PanoTargetView extends View {

    /* renamed from: t  reason: collision with root package name */
    public static final a f124906t = new a((DefaultConstructorMarker) null);

    /* renamed from: u  reason: collision with root package name */
    public static final int f124907u = 8;

    /* renamed from: v  reason: collision with root package name */
    private static final List<Float> f124908v = C16877v.t(Float.valueOf(-27.4f), Float.valueOf(-13.7f), Float.valueOf(0.0f), Float.valueOf(13.7f), Float.valueOf(27.4f));

    /* renamed from: a  reason: collision with root package name */
    private PanoTargetListener f124909a;

    /* renamed from: b  reason: collision with root package name */
    private final float[] f124910b = new float[3];

    /* renamed from: c  reason: collision with root package name */
    private final N0[] f124911c;

    /* renamed from: d  reason: collision with root package name */
    private int f124912d;

    /* renamed from: e  reason: collision with root package name */
    private long f124913e;

    /* renamed from: f  reason: collision with root package name */
    private double f124914f;

    /* renamed from: g  reason: collision with root package name */
    private int f124915g;

    /* renamed from: h  reason: collision with root package name */
    private final List<Float> f124916h;

    /* renamed from: i  reason: collision with root package name */
    private SizeF f124917i;

    /* renamed from: j  reason: collision with root package name */
    private final C16824o f124918j;

    /* renamed from: k  reason: collision with root package name */
    private final C16824o f124919k;

    /* renamed from: l  reason: collision with root package name */
    private Drawable[] f124920l;

    /* renamed from: m  reason: collision with root package name */
    private Drawable[] f124921m;

    /* renamed from: n  reason: collision with root package name */
    private Drawable f124922n;

    /* renamed from: o  reason: collision with root package name */
    private Drawable f124923o;

    /* renamed from: p  reason: collision with root package name */
    private Drawable f124924p;

    /* renamed from: q  reason: collision with root package name */
    private RotateDrawable f124925q;

    /* renamed from: r  reason: collision with root package name */
    private Drawable[] f124926r;

    /* renamed from: s  reason: collision with root package name */
    private ObjectAnimator f124927s;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0006XT¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0006XT¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/sugarcube/app/base/ui/hybrid/PanoTargetView$a;", "", "<init>", "()V", "", "DEFAULT_TARGET_SIZE_DP", "F", "DEFAULT_TARGET_GUIDE_SIZE_DP", "", "DEFAULT_TARGET_LOCK_THRESHOLD", "D", "", "DEFAULT_TARGET_LOCK_TIME_MS", "I", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f124928a;

        /* JADX WARNING: Can't wrap try/catch for region: R(11:0|1|2|3|4|5|6|7|8|9|11) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        static {
            /*
                com.sugarcube.app.base.ui.hybrid.N0[] r0 = com.sugarcube.app.base.ui.hybrid.N0.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.sugarcube.app.base.ui.hybrid.N0 r1 = com.sugarcube.app.base.ui.hybrid.N0.ANIMATED     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                com.sugarcube.app.base.ui.hybrid.N0 r1 = com.sugarcube.app.base.ui.hybrid.N0.SAVING     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                com.sugarcube.app.base.ui.hybrid.N0 r1 = com.sugarcube.app.base.ui.hybrid.N0.CURRENT     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                com.sugarcube.app.base.ui.hybrid.N0 r1 = com.sugarcube.app.base.ui.hybrid.N0.DONE     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                f124928a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.ui.hybrid.PanoTargetView.b.<clinit>():void");
        }
    }

    public PanoTargetView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        N0[] n0Arr = new N0[5];
        int i10 = 0;
        while (i10 < 5) {
            n0Arr[i10] = i10 == 0 ? N0.CURRENT : N0.DEFAULT;
            i10++;
        }
        this.f124911c = n0Arr;
        this.f124914f = 2.0d;
        this.f124915g = 500;
        this.f124916h = f124908v;
        this.f124917i = new SizeF(0.0f, 0.0f);
        this.f124918j = C16825p.b(new I0(this));
        this.f124919k = C16825p.b(new J0(this));
        e();
    }

    private final float c(float f10, float f11, int i10) {
        return f10 * (((float) i10) / f11);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v6, resolved type: android.graphics.drawable.RotateDrawable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v8, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v12, resolved type: com.google.android.material.chip.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v10, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v18, resolved type: com.google.android.material.chip.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v12, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v24, resolved type: com.google.android.material.chip.a} */
    /* JADX WARNING: type inference failed for: r12v5 */
    /* JADX WARNING: type inference failed for: r12v7 */
    /* JADX WARNING: type inference failed for: r12v9 */
    /* JADX WARNING: type inference failed for: r12v11 */
    /* JADX WARNING: type inference failed for: r12v13 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean d(android.graphics.Canvas r17, float r18, float r19) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            android.graphics.Rect r2 = new android.graphics.Rect
            r3 = 0
            r2.<init>(r3, r3, r3, r3)
            android.util.SizeF r4 = r0.f124917i
            float r4 = r4.getHeight()
            int r5 = r16.getHeight()
            r6 = r19
            float r4 = r0.c(r6, r4, r5)
            int r4 = (int) r4
            int r5 = r16.getHeight()
            r6 = 2
            int r5 = r5 / r6
            int r5 = r5 + r4
            com.sugarcube.app.base.ui.hybrid.N0[] r4 = r0.f124911c
            int r7 = r4.length
            r8 = r3
        L_0x0026:
            if (r3 >= r7) goto L_0x0130
            r9 = r4[r3]
            int r10 = r16.getWidth()
            int r10 = r10 / r6
            java.util.List<java.lang.Float> r11 = r0.f124916h
            java.lang.Object r11 = r11.get(r3)
            java.lang.Number r11 = (java.lang.Number) r11
            float r11 = r11.floatValue()
            float r11 = r11 - r18
            android.util.SizeF r12 = r0.f124917i
            float r12 = r12.getWidth()
            int r13 = r16.getWidth()
            float r11 = r0.c(r11, r12, r13)
            int r11 = (int) r11
            int r10 = r10 + r11
            int r11 = r16.getTargetSize()
            int r11 = r11 / r6
            int r11 = r10 - r11
            int r12 = r16.getTargetSize()
            int r12 = r12 / r6
            int r12 = r5 - r12
            int r13 = r16.getTargetSize()
            int r13 = r13 / r6
            int r13 = r13 + r10
            int r14 = r16.getTargetSize()
            int r14 = r14 / r6
            int r14 = r14 + r5
            r2.set(r11, r12, r13, r14)
            int[] r11 = com.sugarcube.app.base.ui.hybrid.PanoTargetView.b.f124928a
            int r9 = r9.ordinal()
            r9 = r11[r9]
            r11 = 1
            r12 = 0
            if (r9 == r11) goto L_0x00da
            if (r9 == r6) goto L_0x00da
            r10 = 3
            if (r9 == r10) goto L_0x00bc
            r10 = 4
            if (r9 == r10) goto L_0x009d
            android.graphics.drawable.Drawable[] r9 = r0.f124921m
            java.lang.String r10 = "targetInactiveList"
            if (r9 != 0) goto L_0x0088
            kotlin.jvm.internal.C17542s.z(r10)
            r9 = r12
        L_0x0088:
            r9 = r9[r3]
            r9.setBounds(r2)
            android.graphics.drawable.Drawable[] r9 = r0.f124921m
            if (r9 != 0) goto L_0x0095
            kotlin.jvm.internal.C17542s.z(r10)
            goto L_0x0096
        L_0x0095:
            r12 = r9
        L_0x0096:
            r9 = r12[r3]
            r9.draw(r1)
            goto L_0x012b
        L_0x009d:
            android.graphics.drawable.Drawable[] r9 = r0.f124926r
            java.lang.String r10 = "targetDoneDrawable"
            if (r9 != 0) goto L_0x00a7
            kotlin.jvm.internal.C17542s.z(r10)
            r9 = r12
        L_0x00a7:
            r9 = r9[r3]
            r9.setBounds(r2)
            android.graphics.drawable.Drawable[] r9 = r0.f124926r
            if (r9 != 0) goto L_0x00b4
            kotlin.jvm.internal.C17542s.z(r10)
            goto L_0x00b5
        L_0x00b4:
            r12 = r9
        L_0x00b5:
            r9 = r12[r3]
            r9.draw(r1)
            goto L_0x012b
        L_0x00bc:
            android.graphics.drawable.Drawable[] r9 = r0.f124920l
            java.lang.String r10 = "targetActiveList"
            if (r9 != 0) goto L_0x00c6
            kotlin.jvm.internal.C17542s.z(r10)
            r9 = r12
        L_0x00c6:
            r9 = r9[r3]
            r9.setBounds(r2)
            android.graphics.drawable.Drawable[] r9 = r0.f124920l
            if (r9 != 0) goto L_0x00d3
            kotlin.jvm.internal.C17542s.z(r10)
            goto L_0x00d4
        L_0x00d3:
            r12 = r9
        L_0x00d4:
            r9 = r12[r3]
            r9.draw(r1)
            goto L_0x012b
        L_0x00da:
            android.graphics.drawable.Drawable r8 = r0.f124923o
            java.lang.String r9 = "targetAnimateDrawable"
            if (r8 != 0) goto L_0x00e4
            kotlin.jvm.internal.C17542s.z(r9)
            r8 = r12
        L_0x00e4:
            r8.setBounds(r2)
            android.graphics.drawable.RotateDrawable r8 = r0.f124925q
            java.lang.String r13 = "targetAnimateRotateDrawable"
            if (r8 != 0) goto L_0x00f1
            kotlin.jvm.internal.C17542s.z(r13)
            r8 = r12
        L_0x00f1:
            int r8 = r8.getIntrinsicWidth()
            int r14 = r16.getTargetSize()
            int r8 = r8 * r14
            android.graphics.drawable.Drawable r14 = r0.f124923o
            if (r14 != 0) goto L_0x0102
            kotlin.jvm.internal.C17542s.z(r9)
            r14 = r12
        L_0x0102:
            int r9 = r14.getIntrinsicWidth()
            int r8 = r8 / r9
            android.graphics.drawable.RotateDrawable r9 = r0.f124925q
            if (r9 != 0) goto L_0x010f
            kotlin.jvm.internal.C17542s.z(r13)
            r9 = r12
        L_0x010f:
            android.graphics.Rect r14 = new android.graphics.Rect
            int r8 = r8 / r6
            int r15 = r10 - r8
            int r6 = r5 - r8
            int r10 = r10 + r8
            int r8 = r8 + r5
            r14.<init>(r15, r6, r10, r8)
            r9.setBounds(r14)
            android.graphics.drawable.RotateDrawable r6 = r0.f124925q
            if (r6 != 0) goto L_0x0126
            kotlin.jvm.internal.C17542s.z(r13)
            goto L_0x0127
        L_0x0126:
            r12 = r6
        L_0x0127:
            r12.draw(r1)
            r8 = r11
        L_0x012b:
            int r3 = r3 + 1
            r6 = 2
            goto L_0x0026
        L_0x0130:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.ui.hybrid.PanoTargetView.d(android.graphics.Canvas, float, float):boolean");
    }

    private final void e() {
        ObjectAnimator objectAnimator = null;
        this.f124920l = new Drawable[]{getResources().getDrawable(C13316h.f112866l, (Resources.Theme) null), getResources().getDrawable(C13316h.f112868n, (Resources.Theme) null), getResources().getDrawable(C13316h.f112870p, (Resources.Theme) null), getResources().getDrawable(C13316h.f112872r, (Resources.Theme) null), getResources().getDrawable(C13316h.f112874t, (Resources.Theme) null)};
        this.f124921m = new Drawable[]{getResources().getDrawable(C13316h.f112867m, (Resources.Theme) null), getResources().getDrawable(C13316h.f112869o, (Resources.Theme) null), getResources().getDrawable(C13316h.f112871q, (Resources.Theme) null), getResources().getDrawable(C13316h.f112873s, (Resources.Theme) null), getResources().getDrawable(C13316h.f112875u, (Resources.Theme) null)};
        this.f124922n = getResources().getDrawable(C13316h.f112878x, (Resources.Theme) null);
        this.f124923o = getResources().getDrawable(C13316h.f112877w, (Resources.Theme) null);
        this.f124924p = getResources().getDrawable(C13316h.f112836R, (Resources.Theme) null);
        Drawable[] drawableArr = this.f124920l;
        if (drawableArr == null) {
            C17542s.z("targetActiveList");
            drawableArr = null;
        }
        int length = drawableArr.length;
        Drawable[] drawableArr2 = new Drawable[length];
        for (int i10 = 0; i10 < length; i10++) {
            Drawable drawable = getResources().getDrawable(C13316h.f112876v, (Resources.Theme) null);
            C17542s.i(drawable, "getDrawable(...)");
            drawableArr2[i10] = drawable;
        }
        this.f124926r = drawableArr2;
        RotateDrawable rotateDrawable = new RotateDrawable();
        this.f124925q = rotateDrawable;
        Drawable drawable2 = this.f124924p;
        if (drawable2 == null) {
            C17542s.z("targetAnimateShapeDrawable");
            drawable2 = null;
        }
        rotateDrawable.setDrawable(drawable2);
        RotateDrawable rotateDrawable2 = this.f124925q;
        if (rotateDrawable2 == null) {
            C17542s.z("targetAnimateRotateDrawable");
            rotateDrawable2 = null;
        }
        rotateDrawable2.setPivotX(0.5f);
        RotateDrawable rotateDrawable3 = this.f124925q;
        if (rotateDrawable3 == null) {
            C17542s.z("targetAnimateRotateDrawable");
            rotateDrawable3 = null;
        }
        rotateDrawable3.setPivotY(0.5f);
        RotateDrawable rotateDrawable4 = this.f124925q;
        if (rotateDrawable4 == null) {
            C17542s.z("targetAnimateRotateDrawable");
            rotateDrawable4 = null;
        }
        rotateDrawable4.setPivotXRelative(true);
        RotateDrawable rotateDrawable5 = this.f124925q;
        if (rotateDrawable5 == null) {
            C17542s.z("targetAnimateRotateDrawable");
            rotateDrawable5 = null;
        }
        rotateDrawable5.setPivotYRelative(true);
        RotateDrawable rotateDrawable6 = this.f124925q;
        if (rotateDrawable6 == null) {
            C17542s.z("targetAnimateRotateDrawable");
            rotateDrawable6 = null;
        }
        rotateDrawable6.setFromDegrees(0.0f);
        RotateDrawable rotateDrawable7 = this.f124925q;
        if (rotateDrawable7 == null) {
            C17542s.z("targetAnimateRotateDrawable");
            rotateDrawable7 = null;
        }
        rotateDrawable7.setToDegrees(360.0f);
        RotateDrawable rotateDrawable8 = this.f124925q;
        if (rotateDrawable8 == null) {
            C17542s.z("targetAnimateRotateDrawable");
            rotateDrawable8 = null;
        }
        ObjectAnimator ofInt = ObjectAnimator.ofInt(rotateDrawable8, "level", new int[]{0, 10000});
        this.f124927s = ofInt;
        if (ofInt == null) {
            C17542s.z("rotateAnim");
            ofInt = null;
        }
        ofInt.setRepeatCount(-1);
        ObjectAnimator objectAnimator2 = this.f124927s;
        if (objectAnimator2 == null) {
            C17542s.z("rotateAnim");
            objectAnimator2 = null;
        }
        objectAnimator2.setInterpolator(new LinearInterpolator());
        ObjectAnimator objectAnimator3 = this.f124927s;
        if (objectAnimator3 == null) {
            C17542s.z("rotateAnim");
            objectAnimator3 = null;
        }
        objectAnimator3.setDuration(1200);
        ObjectAnimator objectAnimator4 = this.f124927s;
        if (objectAnimator4 == null) {
            C17542s.z("rotateAnim");
        } else {
            objectAnimator = objectAnimator4;
        }
        objectAnimator.start();
    }

    private final int getTargetGuideSize() {
        return ((Number) this.f124919k.getValue()).intValue();
    }

    private final int getTargetSize() {
        return ((Number) this.f124918j.getValue()).intValue();
    }

    /* access modifiers changed from: private */
    public static final int i(PanoTargetView panoTargetView) {
        DisplayMetrics displayMetrics = panoTargetView.getResources().getDisplayMetrics();
        C17542s.i(displayMetrics, "getDisplayMetrics(...)");
        return (int) Z.j(70.66f, displayMetrics);
    }

    /* access modifiers changed from: private */
    public static final int k(PanoTargetView panoTargetView) {
        DisplayMetrics displayMetrics = panoTargetView.getResources().getDisplayMetrics();
        C17542s.i(displayMetrics, "getDisplayMetrics(...)");
        return (int) Z.j(66.66f, displayMetrics);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x007e, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final synchronized void l(float r5, float r6, float r7) {
        /*
            r4 = this;
            monitor-enter(r4)
            int r7 = r4.f124912d     // Catch:{ all -> 0x0040 }
            com.sugarcube.app.base.ui.hybrid.N0[] r0 = r4.f124911c     // Catch:{ all -> 0x0040 }
            int r0 = r0.length     // Catch:{ all -> 0x0040 }
            if (r7 < r0) goto L_0x000a
            monitor-exit(r4)
            return
        L_0x000a:
            java.util.List<java.lang.Float> r0 = r4.f124916h     // Catch:{ all -> 0x0040 }
            java.lang.Object r7 = r0.get(r7)     // Catch:{ all -> 0x0040 }
            java.lang.Number r7 = (java.lang.Number) r7     // Catch:{ all -> 0x0040 }
            float r7 = r7.floatValue()     // Catch:{ all -> 0x0040 }
            float r5 = r5 - r7
            float r5 = java.lang.Math.abs(r5)     // Catch:{ all -> 0x0040 }
            float r6 = java.lang.Math.abs(r6)     // Catch:{ all -> 0x0040 }
            double r0 = (double) r5     // Catch:{ all -> 0x0040 }
            double r2 = r4.f124914f     // Catch:{ all -> 0x0040 }
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 >= 0) goto L_0x0068
            double r5 = (double) r6     // Catch:{ all -> 0x0040 }
            int r5 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r5 >= 0) goto L_0x0068
            com.sugarcube.app.base.ui.hybrid.N0[] r5 = r4.f124911c     // Catch:{ all -> 0x0040 }
            int r6 = r4.f124912d     // Catch:{ all -> 0x0040 }
            r7 = r5[r6]     // Catch:{ all -> 0x0040 }
            com.sugarcube.app.base.ui.hybrid.N0 r0 = com.sugarcube.app.base.ui.hybrid.N0.CURRENT     // Catch:{ all -> 0x0040 }
            if (r7 != r0) goto L_0x0042
            com.sugarcube.app.base.ui.hybrid.N0 r7 = com.sugarcube.app.base.ui.hybrid.N0.ANIMATED     // Catch:{ all -> 0x0040 }
            r5[r6] = r7     // Catch:{ all -> 0x0040 }
            long r5 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0040 }
            r4.f124913e = r5     // Catch:{ all -> 0x0040 }
            goto L_0x007d
        L_0x0040:
            r5 = move-exception
            goto L_0x007f
        L_0x0042:
            com.sugarcube.app.base.ui.hybrid.N0 r5 = com.sugarcube.app.base.ui.hybrid.N0.ANIMATED     // Catch:{ all -> 0x0040 }
            if (r7 != r5) goto L_0x007d
            long r5 = r4.f124913e     // Catch:{ all -> 0x0040 }
            r0 = 0
            int r5 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r5 <= 0) goto L_0x007d
            long r5 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0040 }
            long r2 = r4.f124913e     // Catch:{ all -> 0x0040 }
            long r5 = r5 - r2
            int r7 = r4.f124915g     // Catch:{ all -> 0x0040 }
            long r2 = (long) r7     // Catch:{ all -> 0x0040 }
            int r5 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r5 <= 0) goto L_0x007d
            r4.f124913e = r0     // Catch:{ all -> 0x0040 }
            com.sugarcube.app.base.ui.hybrid.PanoTargetListener r5 = r4.f124909a     // Catch:{ all -> 0x0040 }
            if (r5 == 0) goto L_0x007d
            int r6 = r4.f124912d     // Catch:{ all -> 0x0040 }
            r5.targetAcquired(r6)     // Catch:{ all -> 0x0040 }
            goto L_0x007d
        L_0x0068:
            com.sugarcube.app.base.ui.hybrid.N0[] r5 = r4.f124911c     // Catch:{ all -> 0x0040 }
            int r6 = r4.f124912d     // Catch:{ all -> 0x0040 }
            r7 = r5[r6]     // Catch:{ all -> 0x0040 }
            com.sugarcube.app.base.ui.hybrid.N0 r0 = com.sugarcube.app.base.ui.hybrid.N0.ANIMATED     // Catch:{ all -> 0x0040 }
            if (r7 != r0) goto L_0x007d
            com.sugarcube.app.base.ui.hybrid.N0 r7 = com.sugarcube.app.base.ui.hybrid.N0.CURRENT     // Catch:{ all -> 0x0040 }
            r5[r6] = r7     // Catch:{ all -> 0x0040 }
            com.sugarcube.app.base.ui.hybrid.PanoTargetListener r5 = r4.f124909a     // Catch:{ all -> 0x0040 }
            if (r5 == 0) goto L_0x007d
            r5.targetLost(r6)     // Catch:{ all -> 0x0040 }
        L_0x007d:
            monitor-exit(r4)
            return
        L_0x007f:
            monitor-exit(r4)     // Catch:{ all -> 0x0040 }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.ui.hybrid.PanoTargetView.l(float, float, float):void");
    }

    public final synchronized boolean f() {
        return this.f124912d == this.f124911c.length;
    }

    public final void g(float f10, float f11) {
        this.f124917i = new SizeF(f10, f11);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0026, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0029, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean h(int r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            com.sugarcube.app.base.ui.hybrid.N0[] r0 = r3.f124911c     // Catch:{ all -> 0x0023 }
            int r1 = r0.length     // Catch:{ all -> 0x0023 }
            if (r4 >= r1) goto L_0x0028
            r1 = r0[r4]     // Catch:{ all -> 0x0023 }
            com.sugarcube.app.base.ui.hybrid.N0 r2 = com.sugarcube.app.base.ui.hybrid.N0.SAVING     // Catch:{ all -> 0x0023 }
            if (r1 != r2) goto L_0x0028
            com.sugarcube.app.base.ui.hybrid.N0 r1 = com.sugarcube.app.base.ui.hybrid.N0.DONE     // Catch:{ all -> 0x0023 }
            r0[r4] = r1     // Catch:{ all -> 0x0023 }
            int r1 = r4 + 1
            r3.f124912d = r1     // Catch:{ all -> 0x0023 }
            int r2 = r0.length     // Catch:{ all -> 0x0023 }
            if (r1 >= r2) goto L_0x0025
            com.sugarcube.app.base.ui.hybrid.N0 r2 = com.sugarcube.app.base.ui.hybrid.N0.CURRENT     // Catch:{ all -> 0x0023 }
            r0[r1] = r2     // Catch:{ all -> 0x0023 }
            com.sugarcube.app.base.ui.hybrid.PanoTargetListener r0 = r3.f124909a     // Catch:{ all -> 0x0023 }
            if (r0 == 0) goto L_0x0025
            r0.targetDone(r4)     // Catch:{ all -> 0x0023 }
            goto L_0x0025
        L_0x0023:
            r4 = move-exception
            goto L_0x002b
        L_0x0025:
            monitor-exit(r3)
            r4 = 1
            return r4
        L_0x0028:
            monitor-exit(r3)
            r4 = 0
            return r4
        L_0x002b:
            monitor-exit(r3)     // Catch:{ all -> 0x0023 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.ui.hybrid.PanoTargetView.h(int):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001b, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001e, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean j(int r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            com.sugarcube.app.base.ui.hybrid.N0[] r0 = r3.f124911c     // Catch:{ all -> 0x0018 }
            int r1 = r0.length     // Catch:{ all -> 0x0018 }
            if (r4 >= r1) goto L_0x001d
            r1 = r0[r4]     // Catch:{ all -> 0x0018 }
            com.sugarcube.app.base.ui.hybrid.N0 r2 = com.sugarcube.app.base.ui.hybrid.N0.ANIMATED     // Catch:{ all -> 0x0018 }
            if (r1 != r2) goto L_0x001d
            com.sugarcube.app.base.ui.hybrid.N0 r1 = com.sugarcube.app.base.ui.hybrid.N0.SAVING     // Catch:{ all -> 0x0018 }
            r0[r4] = r1     // Catch:{ all -> 0x0018 }
            com.sugarcube.app.base.ui.hybrid.PanoTargetListener r0 = r3.f124909a     // Catch:{ all -> 0x0018 }
            if (r0 == 0) goto L_0x001a
            r0.targetSaving(r4)     // Catch:{ all -> 0x0018 }
            goto L_0x001a
        L_0x0018:
            r4 = move-exception
            goto L_0x0020
        L_0x001a:
            monitor-exit(r3)
            r4 = 1
            return r4
        L_0x001d:
            monitor-exit(r3)
            r4 = 0
            return r4
        L_0x0020:
            monitor-exit(r3)     // Catch:{ all -> 0x0018 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.ui.hybrid.PanoTargetView.j(int):boolean");
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        C17542s.j(canvas, "canvas");
        super.onDraw(canvas);
        PanoTargetListener panoTargetListener = this.f124909a;
        if (panoTargetListener != null) {
            panoTargetListener.updateAngles(this.f124910b);
        }
        float[] fArr = this.f124910b;
        float f10 = fArr[0];
        float f11 = fArr[1];
        float f12 = fArr[2];
        l(f10, f11, f12);
        canvas.rotate(f12, (float) (getWidth() / 2), (float) (getHeight() / 2));
        boolean d10 = d(canvas, f10, f11);
        canvas.rotate(-f12, (float) (getWidth() / 2), (float) (getHeight() / 2));
        if (!d10) {
            Drawable drawable = this.f124922n;
            Drawable drawable2 = null;
            if (drawable == null) {
                C17542s.z("targetGuideDrawable");
                drawable = null;
            }
            drawable.setBounds(new Rect((getWidth() - getTargetGuideSize()) / 2, (getHeight() - getTargetGuideSize()) / 2, (getWidth() + getTargetGuideSize()) / 2, (getHeight() + getTargetGuideSize()) / 2));
            Drawable drawable3 = this.f124922n;
            if (drawable3 == null) {
                C17542s.z("targetGuideDrawable");
            } else {
                drawable2 = drawable3;
            }
            drawable2.draw(canvas);
        }
    }

    public final void setListener(PanoTargetListener panoTargetListener) {
        C17542s.j(panoTargetListener, "l");
        this.f124909a = panoTargetListener;
    }
}
