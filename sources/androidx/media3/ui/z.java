package androidx.media3.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import s3.a;
import t3.C5950a;
import t3.N;
import w4.C8911a;

final class z {

    /* renamed from: A  reason: collision with root package name */
    private int f43403A;

    /* renamed from: B  reason: collision with root package name */
    private int f43404B;

    /* renamed from: C  reason: collision with root package name */
    private int f43405C;

    /* renamed from: D  reason: collision with root package name */
    private int f43406D;

    /* renamed from: E  reason: collision with root package name */
    private StaticLayout f43407E;

    /* renamed from: F  reason: collision with root package name */
    private StaticLayout f43408F;

    /* renamed from: G  reason: collision with root package name */
    private int f43409G;

    /* renamed from: H  reason: collision with root package name */
    private int f43410H;

    /* renamed from: I  reason: collision with root package name */
    private int f43411I;

    /* renamed from: J  reason: collision with root package name */
    private Rect f43412J;

    /* renamed from: a  reason: collision with root package name */
    private final float f43413a;

    /* renamed from: b  reason: collision with root package name */
    private final float f43414b;

    /* renamed from: c  reason: collision with root package name */
    private final float f43415c;

    /* renamed from: d  reason: collision with root package name */
    private final float f43416d;

    /* renamed from: e  reason: collision with root package name */
    private final float f43417e;

    /* renamed from: f  reason: collision with root package name */
    private final TextPaint f43418f;

    /* renamed from: g  reason: collision with root package name */
    private final Paint f43419g;

    /* renamed from: h  reason: collision with root package name */
    private final Paint f43420h;

    /* renamed from: i  reason: collision with root package name */
    private CharSequence f43421i;

    /* renamed from: j  reason: collision with root package name */
    private Layout.Alignment f43422j;

    /* renamed from: k  reason: collision with root package name */
    private Bitmap f43423k;

    /* renamed from: l  reason: collision with root package name */
    private float f43424l;

    /* renamed from: m  reason: collision with root package name */
    private int f43425m;

    /* renamed from: n  reason: collision with root package name */
    private int f43426n;

    /* renamed from: o  reason: collision with root package name */
    private float f43427o;

    /* renamed from: p  reason: collision with root package name */
    private int f43428p;

    /* renamed from: q  reason: collision with root package name */
    private float f43429q;

    /* renamed from: r  reason: collision with root package name */
    private float f43430r;

    /* renamed from: s  reason: collision with root package name */
    private int f43431s;

    /* renamed from: t  reason: collision with root package name */
    private int f43432t;

    /* renamed from: u  reason: collision with root package name */
    private int f43433u;

    /* renamed from: v  reason: collision with root package name */
    private int f43434v;

    /* renamed from: w  reason: collision with root package name */
    private int f43435w;

    /* renamed from: x  reason: collision with root package name */
    private float f43436x;

    /* renamed from: y  reason: collision with root package name */
    private float f43437y;

    /* renamed from: z  reason: collision with root package name */
    private float f43438z;

    public z(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, new int[]{16843287, 16843288}, 0, 0);
        this.f43417e = (float) obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f43416d = obtainStyledAttributes.getFloat(1, 1.0f);
        obtainStyledAttributes.recycle();
        float round = (float) Math.round((((float) context.getResources().getDisplayMetrics().densityDpi) * 2.0f) / 160.0f);
        this.f43413a = round;
        this.f43414b = round;
        this.f43415c = round;
        TextPaint textPaint = new TextPaint();
        this.f43418f = textPaint;
        textPaint.setAntiAlias(true);
        textPaint.setSubpixelText(true);
        Paint paint = new Paint();
        this.f43419g = paint;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint();
        this.f43420h = paint2;
        paint2.setAntiAlias(true);
        paint2.setFilterBitmap(true);
    }

    private static boolean a(CharSequence charSequence, CharSequence charSequence2) {
        return charSequence == charSequence2 || (charSequence != null && charSequence.equals(charSequence2));
    }

    private void c(Canvas canvas) {
        canvas.drawBitmap(this.f43423k, (Rect) null, this.f43412J, this.f43420h);
    }

    private void d(Canvas canvas, boolean z10) {
        if (z10) {
            e(canvas);
            return;
        }
        C5950a.e(this.f43412J);
        C5950a.e(this.f43423k);
        c(canvas);
    }

    private void e(Canvas canvas) {
        StaticLayout staticLayout = this.f43407E;
        StaticLayout staticLayout2 = this.f43408F;
        if (staticLayout != null && staticLayout2 != null) {
            int save = canvas.save();
            canvas.translate((float) this.f43409G, (float) this.f43410H);
            if (Color.alpha(this.f43433u) > 0) {
                this.f43419g.setColor(this.f43433u);
                canvas.drawRect((float) (-this.f43411I), 0.0f, (float) (staticLayout.getWidth() + this.f43411I), (float) staticLayout.getHeight(), this.f43419g);
            }
            int i10 = this.f43435w;
            boolean z10 = true;
            if (i10 == 1) {
                this.f43418f.setStrokeJoin(Paint.Join.ROUND);
                this.f43418f.setStrokeWidth(this.f43413a);
                this.f43418f.setColor(this.f43434v);
                this.f43418f.setStyle(Paint.Style.FILL_AND_STROKE);
                staticLayout2.draw(canvas);
            } else if (i10 == 2) {
                TextPaint textPaint = this.f43418f;
                float f10 = this.f43414b;
                float f11 = this.f43415c;
                textPaint.setShadowLayer(f10, f11, f11, this.f43434v);
            } else if (i10 == 3 || i10 == 4) {
                if (i10 != 3) {
                    z10 = false;
                }
                int i11 = -1;
                int i12 = z10 ? -1 : this.f43434v;
                if (z10) {
                    i11 = this.f43434v;
                }
                float f12 = this.f43414b / 2.0f;
                this.f43418f.setColor(this.f43431s);
                this.f43418f.setStyle(Paint.Style.FILL);
                float f13 = -f12;
                this.f43418f.setShadowLayer(this.f43414b, f13, f13, i12);
                staticLayout2.draw(canvas);
                this.f43418f.setShadowLayer(this.f43414b, f12, f12, i11);
            }
            this.f43418f.setColor(this.f43431s);
            this.f43418f.setStyle(Paint.Style.FILL);
            staticLayout.draw(canvas);
            this.f43418f.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
            canvas.restoreToCount(save);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0059  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void f() {
        /*
            r7 = this;
            android.graphics.Bitmap r0 = r7.f43423k
            int r1 = r7.f43405C
            int r2 = r7.f43403A
            int r1 = r1 - r2
            int r3 = r7.f43406D
            int r4 = r7.f43404B
            int r3 = r3 - r4
            float r2 = (float) r2
            float r1 = (float) r1
            float r5 = r7.f43427o
            float r5 = r5 * r1
            float r2 = r2 + r5
            float r4 = (float) r4
            float r3 = (float) r3
            float r5 = r7.f43424l
            float r5 = r5 * r3
            float r4 = r4 + r5
            float r5 = r7.f43429q
            float r1 = r1 * r5
            int r1 = java.lang.Math.round(r1)
            float r5 = r7.f43430r
            r6 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            int r6 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r6 == 0) goto L_0x002e
            float r3 = r3 * r5
            int r0 = java.lang.Math.round(r3)
            goto L_0x003f
        L_0x002e:
            float r3 = (float) r1
            int r5 = r0.getHeight()
            float r5 = (float) r5
            int r0 = r0.getWidth()
            float r0 = (float) r0
            float r5 = r5 / r0
            float r3 = r3 * r5
            int r0 = java.lang.Math.round(r3)
        L_0x003f:
            int r3 = r7.f43428p
            r5 = 1
            r6 = 2
            if (r3 != r6) goto L_0x0048
            float r3 = (float) r1
        L_0x0046:
            float r2 = r2 - r3
            goto L_0x004e
        L_0x0048:
            if (r3 != r5) goto L_0x004e
            int r3 = r1 / 2
            float r3 = (float) r3
            goto L_0x0046
        L_0x004e:
            int r2 = java.lang.Math.round(r2)
            int r3 = r7.f43426n
            if (r3 != r6) goto L_0x0059
            float r3 = (float) r0
        L_0x0057:
            float r4 = r4 - r3
            goto L_0x005f
        L_0x0059:
            if (r3 != r5) goto L_0x005f
            int r3 = r0 / 2
            float r3 = (float) r3
            goto L_0x0057
        L_0x005f:
            int r3 = java.lang.Math.round(r4)
            android.graphics.Rect r4 = new android.graphics.Rect
            int r1 = r1 + r2
            int r0 = r0 + r3
            r4.<init>(r2, r3, r1, r0)
            r7.f43412J = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.ui.z.f():void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:65:0x019f  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x01a3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void g() {
        /*
            r26 = this;
            r0 = r26
            java.lang.CharSequence r1 = r0.f43421i
            boolean r2 = r1 instanceof android.text.SpannableStringBuilder
            if (r2 == 0) goto L_0x000b
            android.text.SpannableStringBuilder r1 = (android.text.SpannableStringBuilder) r1
            goto L_0x0012
        L_0x000b:
            android.text.SpannableStringBuilder r1 = new android.text.SpannableStringBuilder
            java.lang.CharSequence r2 = r0.f43421i
            r1.<init>(r2)
        L_0x0012:
            int r2 = r0.f43405C
            int r3 = r0.f43403A
            int r2 = r2 - r3
            int r3 = r0.f43406D
            int r4 = r0.f43404B
            int r11 = r3 - r4
            android.text.TextPaint r3 = r0.f43418f
            float r4 = r0.f43436x
            r3.setTextSize(r4)
            float r3 = r0.f43436x
            r4 = 1040187392(0x3e000000, float:0.125)
            float r3 = r3 * r4
            r4 = 1056964608(0x3f000000, float:0.5)
            float r3 = r3 + r4
            int r12 = (int) r3
            int r13 = r12 * 2
            int r3 = r2 - r13
            float r4 = r0.f43429q
            r14 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            int r5 = (r4 > r14 ? 1 : (r4 == r14 ? 0 : -1))
            if (r5 == 0) goto L_0x003d
            float r3 = (float) r3
            float r3 = r3 * r4
            int r3 = (int) r3
        L_0x003d:
            r15 = r3
            java.lang.String r10 = "SubtitlePainter"
            if (r15 > 0) goto L_0x0048
            java.lang.String r1 = "Skipped drawing subtitle cue (insufficient space)"
            t3.q.h(r10, r1)
            return
        L_0x0048:
            float r3 = r0.f43437y
            r16 = 0
            int r3 = (r3 > r16 ? 1 : (r3 == r16 ? 0 : -1))
            r4 = 16711680(0xff0000, float:2.3418052E-38)
            r9 = 0
            if (r3 <= 0) goto L_0x0062
            android.text.style.AbsoluteSizeSpan r3 = new android.text.style.AbsoluteSizeSpan
            float r5 = r0.f43437y
            int r5 = (int) r5
            r3.<init>(r5)
            int r5 = r1.length()
            r1.setSpan(r3, r9, r5, r4)
        L_0x0062:
            android.text.SpannableStringBuilder r8 = new android.text.SpannableStringBuilder
            r8.<init>(r1)
            int r3 = r0.f43435w
            r7 = 1
            if (r3 != r7) goto L_0x0085
            int r3 = r8.length()
            java.lang.Class<android.text.style.ForegroundColorSpan> r5 = android.text.style.ForegroundColorSpan.class
            java.lang.Object[] r3 = r8.getSpans(r9, r3, r5)
            android.text.style.ForegroundColorSpan[] r3 = (android.text.style.ForegroundColorSpan[]) r3
            int r5 = r3.length
            r6 = r9
        L_0x007a:
            if (r6 >= r5) goto L_0x0085
            r7 = r3[r6]
            r8.removeSpan(r7)
            int r6 = r6 + 1
            r7 = 1
            goto L_0x007a
        L_0x0085:
            int r3 = r0.f43432t
            int r3 = android.graphics.Color.alpha(r3)
            r7 = 2
            if (r3 <= 0) goto L_0x00b2
            int r3 = r0.f43435w
            if (r3 == 0) goto L_0x00a4
            if (r3 != r7) goto L_0x0095
            goto L_0x00a4
        L_0x0095:
            android.text.style.BackgroundColorSpan r3 = new android.text.style.BackgroundColorSpan
            int r5 = r0.f43432t
            r3.<init>(r5)
            int r5 = r8.length()
            r8.setSpan(r3, r9, r5, r4)
            goto L_0x00b2
        L_0x00a4:
            android.text.style.BackgroundColorSpan r3 = new android.text.style.BackgroundColorSpan
            int r5 = r0.f43432t
            r3.<init>(r5)
            int r5 = r1.length()
            r1.setSpan(r3, r9, r5, r4)
        L_0x00b2:
            android.text.Layout$Alignment r3 = r0.f43422j
            if (r3 != 0) goto L_0x00b8
            android.text.Layout$Alignment r3 = android.text.Layout.Alignment.ALIGN_CENTER
        L_0x00b8:
            r21 = r3
            android.text.StaticLayout r6 = new android.text.StaticLayout
            android.text.TextPaint r5 = r0.f43418f
            float r4 = r0.f43416d
            float r3 = r0.f43417e
            r18 = 1
            r19 = r3
            r3 = r6
            r20 = r4
            r4 = r1
            r14 = r6
            r6 = r15
            r7 = r21
            r23 = r8
            r8 = r20
            r25 = r12
            r12 = r9
            r9 = r19
            r12 = r10
            r10 = r18
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            r0.f43407E = r14
            int r3 = r14.getHeight()
            android.text.StaticLayout r4 = r0.f43407E
            int r4 = r4.getLineCount()
            r5 = 0
            r9 = 0
        L_0x00eb:
            if (r9 >= r4) goto L_0x0100
            android.text.StaticLayout r6 = r0.f43407E
            float r6 = r6.getLineWidth(r9)
            double r6 = (double) r6
            double r6 = java.lang.Math.ceil(r6)
            int r6 = (int) r6
            int r5 = java.lang.Math.max(r6, r5)
            int r9 = r9 + 1
            goto L_0x00eb
        L_0x0100:
            float r4 = r0.f43429q
            r6 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 == 0) goto L_0x010c
            if (r5 >= r15) goto L_0x010c
            goto L_0x010d
        L_0x010c:
            r15 = r5
        L_0x010d:
            int r15 = r15 + r13
            float r4 = r0.f43427o
            int r5 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r5 == 0) goto L_0x0139
            float r2 = (float) r2
            float r2 = r2 * r4
            int r2 = java.lang.Math.round(r2)
            int r4 = r0.f43403A
            int r2 = r2 + r4
            int r5 = r0.f43428p
            r6 = 1
            if (r5 == r6) goto L_0x0128
            r7 = 2
            if (r5 == r7) goto L_0x0126
            goto L_0x012d
        L_0x0126:
            int r2 = r2 - r15
            goto L_0x012d
        L_0x0128:
            r7 = 2
            int r2 = r2 * 2
            int r2 = r2 - r15
            int r2 = r2 / r7
        L_0x012d:
            int r2 = java.lang.Math.max(r2, r4)
            int r15 = r15 + r2
            int r4 = r0.f43405C
            int r4 = java.lang.Math.min(r15, r4)
            goto L_0x0142
        L_0x0139:
            r6 = 1
            r7 = 2
            int r2 = r2 - r15
            int r2 = r2 / r7
            int r4 = r0.f43403A
            int r2 = r2 + r4
            int r4 = r2 + r15
        L_0x0142:
            int r20 = r4 - r2
            if (r20 > 0) goto L_0x014c
            java.lang.String r1 = "Skipped drawing subtitle cue (invalid horizontal positioning)"
            t3.q.h(r12, r1)
            return
        L_0x014c:
            float r4 = r0.f43424l
            r5 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            int r5 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r5 == 0) goto L_0x01a9
            int r5 = r0.f43425m
            if (r5 != 0) goto L_0x016e
            float r5 = (float) r11
            float r5 = r5 * r4
            int r4 = java.lang.Math.round(r5)
            int r5 = r0.f43404B
            int r4 = r4 + r5
            int r5 = r0.f43426n
            if (r5 != r7) goto L_0x0167
            goto L_0x0198
        L_0x0167:
            if (r5 != r6) goto L_0x0199
            int r4 = r4 * 2
            int r4 = r4 - r3
            int r4 = r4 / r7
            goto L_0x0199
        L_0x016e:
            android.text.StaticLayout r4 = r0.f43407E
            r5 = 0
            int r4 = r4.getLineBottom(r5)
            android.text.StaticLayout r6 = r0.f43407E
            int r5 = r6.getLineTop(r5)
            int r4 = r4 - r5
            float r5 = r0.f43424l
            int r6 = (r5 > r16 ? 1 : (r5 == r16 ? 0 : -1))
            if (r6 < 0) goto L_0x018c
            float r4 = (float) r4
            float r5 = r5 * r4
            int r4 = java.lang.Math.round(r5)
            int r5 = r0.f43404B
            int r4 = r4 + r5
            goto L_0x0199
        L_0x018c:
            r6 = 1065353216(0x3f800000, float:1.0)
            float r5 = r5 + r6
            float r4 = (float) r4
            float r5 = r5 * r4
            int r4 = java.lang.Math.round(r5)
            int r5 = r0.f43406D
            int r4 = r4 + r5
        L_0x0198:
            int r4 = r4 - r3
        L_0x0199:
            int r5 = r4 + r3
            int r6 = r0.f43406D
            if (r5 <= r6) goto L_0x01a3
            int r4 = r6 - r3
        L_0x01a1:
            r11 = r4
            goto L_0x01b3
        L_0x01a3:
            int r3 = r0.f43404B
            if (r4 >= r3) goto L_0x01a1
            r11 = r3
            goto L_0x01b3
        L_0x01a9:
            int r4 = r0.f43406D
            int r4 = r4 - r3
            float r3 = (float) r11
            float r5 = r0.f43438z
            float r3 = r3 * r5
            int r3 = (int) r3
            int r4 = r4 - r3
            goto L_0x01a1
        L_0x01b3:
            android.text.StaticLayout r12 = new android.text.StaticLayout
            android.text.TextPaint r5 = r0.f43418f
            float r8 = r0.f43416d
            float r9 = r0.f43417e
            r10 = 1
            r3 = r12
            r4 = r1
            r6 = r20
            r7 = r21
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            r0.f43407E = r12
            android.text.StaticLayout r1 = new android.text.StaticLayout
            android.text.TextPaint r3 = r0.f43418f
            float r4 = r0.f43416d
            float r5 = r0.f43417e
            r24 = 1
            r17 = r1
            r18 = r23
            r19 = r3
            r22 = r4
            r23 = r5
            r17.<init>(r18, r19, r20, r21, r22, r23, r24)
            r0.f43408F = r1
            r0.f43409G = r2
            r0.f43410H = r11
            r1 = r25
            r0.f43411I = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.ui.z.g():void");
    }

    public void b(a aVar, C8911a aVar2, float f10, float f11, float f12, Canvas canvas, int i10, int i11, int i12, int i13) {
        int i14;
        boolean z10 = aVar.f29044d == null;
        if (!z10) {
            i14 = -16777216;
        } else if (!TextUtils.isEmpty(aVar.f29041a)) {
            i14 = aVar.f29052l ? aVar.f29053m : aVar2.f57087c;
        } else {
            return;
        }
        if (a(this.f43421i, aVar.f29041a) && N.d(this.f43422j, aVar.f29042b) && this.f43423k == aVar.f29044d && this.f43424l == aVar.f29045e && this.f43425m == aVar.f29046f && N.d(Integer.valueOf(this.f43426n), Integer.valueOf(aVar.f29047g)) && this.f43427o == aVar.f29048h && N.d(Integer.valueOf(this.f43428p), Integer.valueOf(aVar.f29049i)) && this.f43429q == aVar.f29050j && this.f43430r == aVar.f29051k && this.f43431s == aVar2.f57085a && this.f43432t == aVar2.f57086b && this.f43433u == i14 && this.f43435w == aVar2.f57088d && this.f43434v == aVar2.f57089e && N.d(this.f43418f.getTypeface(), aVar2.f57090f) && this.f43436x == f10 && this.f43437y == f11 && this.f43438z == f12 && this.f43403A == i10 && this.f43404B == i11 && this.f43405C == i12 && this.f43406D == i13) {
            d(canvas, z10);
            return;
        }
        this.f43421i = aVar.f29041a;
        this.f43422j = aVar.f29042b;
        this.f43423k = aVar.f29044d;
        this.f43424l = aVar.f29045e;
        this.f43425m = aVar.f29046f;
        this.f43426n = aVar.f29047g;
        this.f43427o = aVar.f29048h;
        this.f43428p = aVar.f29049i;
        this.f43429q = aVar.f29050j;
        this.f43430r = aVar.f29051k;
        this.f43431s = aVar2.f57085a;
        this.f43432t = aVar2.f57086b;
        this.f43433u = i14;
        this.f43435w = aVar2.f57088d;
        this.f43434v = aVar2.f57089e;
        this.f43418f.setTypeface(aVar2.f57090f);
        this.f43436x = f10;
        this.f43437y = f11;
        this.f43438z = f12;
        this.f43403A = i10;
        this.f43404B = i11;
        this.f43405C = i12;
        this.f43406D = i13;
        if (z10) {
            C5950a.e(this.f43421i);
            g();
        } else {
            C5950a.e(this.f43423k);
            f();
        }
        d(canvas, z10);
    }
}
