package androidx.media3.ui;

import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.media3.ui.SubtitleView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import t3.N;
import w4.C8911a;

final class WebViewSubtitleOutput extends FrameLayout implements SubtitleView.a {

    /* renamed from: a  reason: collision with root package name */
    private final CanvasSubtitleOutput f43317a;

    /* renamed from: b  reason: collision with root package name */
    private final WebView f43318b;

    /* renamed from: c  reason: collision with root package name */
    private List<s3.a> f43319c;

    /* renamed from: d  reason: collision with root package name */
    private C8911a f43320d;

    /* renamed from: e  reason: collision with root package name */
    private float f43321e;

    /* renamed from: f  reason: collision with root package name */
    private int f43322f;

    /* renamed from: g  reason: collision with root package name */
    private float f43323g;

    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f43325a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                android.text.Layout$Alignment[] r0 = android.text.Layout.Alignment.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f43325a = r0
                android.text.Layout$Alignment r1 = android.text.Layout.Alignment.ALIGN_NORMAL     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f43325a     // Catch:{ NoSuchFieldError -> 0x001d }
                android.text.Layout$Alignment r1 = android.text.Layout.Alignment.ALIGN_OPPOSITE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f43325a     // Catch:{ NoSuchFieldError -> 0x0028 }
                android.text.Layout$Alignment r1 = android.text.Layout.Alignment.ALIGN_CENTER     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.media3.ui.WebViewSubtitleOutput.a.<clinit>():void");
        }
    }

    public WebViewSubtitleOutput(Context context) {
        this(context, (AttributeSet) null);
    }

    private static int b(int i10) {
        if (i10 != 1) {
            return i10 != 2 ? 0 : -100;
        }
        return -50;
    }

    private static String c(Layout.Alignment alignment) {
        if (alignment == null) {
            return "center";
        }
        int i10 = a.f43325a[alignment.ordinal()];
        return i10 != 1 ? i10 != 2 ? "center" : "end" : "start";
    }

    private static String d(C8911a aVar) {
        int i10 = aVar.f57088d;
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? "unset" : N.G("-0.05em -0.05em 0.15em %s", C6992a.b(aVar.f57089e)) : N.G("0.06em 0.08em 0.15em %s", C6992a.b(aVar.f57089e)) : N.G("0.1em 0.12em 0.15em %s", C6992a.b(aVar.f57089e)) : N.G("1px 1px 0 %1$s, 1px -1px 0 %1$s, -1px 1px 0 %1$s, -1px -1px 0 %1$s", C6992a.b(aVar.f57089e));
    }

    private String e(int i10, float f10) {
        float h10 = C.h(i10, f10, getHeight(), (getHeight() - getPaddingTop()) - getPaddingBottom());
        return h10 == -3.4028235E38f ? "unset" : N.G("%.2fpx", Float.valueOf(h10 / getContext().getResources().getDisplayMetrics().density));
    }

    private static String f(int i10) {
        return i10 != 1 ? i10 != 2 ? "horizontal-tb" : "vertical-lr" : "vertical-rl";
    }

    private static String h(s3.a aVar) {
        float f10 = aVar.f29057q;
        if (f10 == 0.0f) {
            return "";
        }
        int i10 = aVar.f29056p;
        return N.G("%s(%.2fdeg)", (i10 == 2 || i10 == 1) ? "skewY" : "skewX", Float.valueOf(f10));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x013b, code lost:
        if (r8 != false) goto L_0x013f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0144, code lost:
        if (r8 != false) goto L_0x013e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00ee  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00fe  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0119  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x011c  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0130  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0144  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x014d  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0152  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x017d  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x01d7  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x01f1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void i() {
        /*
            r31 = this;
            r0 = r31
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            w4.a r2 = r0.f43320d
            int r2 = r2.f57085a
            java.lang.String r2 = androidx.media3.ui.C6992a.b(r2)
            int r3 = r0.f43322f
            float r4 = r0.f43321e
            java.lang.String r3 = r0.e(r3, r4)
            r4 = 1067030938(0x3f99999a, float:1.2)
            java.lang.Float r5 = java.lang.Float.valueOf(r4)
            w4.a r6 = r0.f43320d
            java.lang.String r6 = d(r6)
            java.lang.Object[] r2 = new java.lang.Object[]{r2, r3, r5, r6}
            java.lang.String r3 = "<body><div style='-webkit-user-select:none;position:fixed;top:0;bottom:0;left:0;right:0;color:%s;font-size:%s;line-height:%.2f;text-shadow:%s;'>"
            java.lang.String r2 = t3.N.G(r3, r2)
            r1.append(r2)
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            java.lang.String r3 = "default_bg"
            java.lang.String r5 = androidx.media3.ui.C6992a.a(r3)
            w4.a r6 = r0.f43320d
            int r6 = r6.f57086b
            java.lang.String r6 = androidx.media3.ui.C6992a.b(r6)
            java.lang.Object[] r6 = new java.lang.Object[]{r6}
            java.lang.String r7 = "background-color:%s;"
            java.lang.String r6 = t3.N.G(r7, r6)
            r2.put(r5, r6)
            r6 = 0
        L_0x0052:
            java.util.List<s3.a> r7 = r0.f43319c
            int r7 = r7.size()
            r8 = 1
            if (r6 >= r7) goto L_0x0205
            java.util.List<s3.a> r7 = r0.f43319c
            java.lang.Object r7 = r7.get(r6)
            s3.a r7 = (s3.a) r7
            float r9 = r7.f29048h
            r10 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            int r11 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
            r12 = 1120403456(0x42c80000, float:100.0)
            if (r11 == 0) goto L_0x0070
            float r9 = r9 * r12
            goto L_0x0072
        L_0x0070:
            r9 = 1112014848(0x42480000, float:50.0)
        L_0x0072:
            int r11 = r7.f29049i
            int r11 = b(r11)
            float r13 = r7.f29045e
            int r14 = (r13 > r10 ? 1 : (r13 == r10 ? 0 : -1))
            r15 = 1065353216(0x3f800000, float:1.0)
            java.lang.String r5 = "%.2f%%"
            if (r14 == 0) goto L_0x00d5
            int r14 = r7.f29046f
            if (r14 == r8) goto L_0x00a9
            float r13 = r13 * r12
            java.lang.Float r13 = java.lang.Float.valueOf(r13)
            java.lang.Object[] r13 = new java.lang.Object[]{r13}
            java.lang.String r13 = t3.N.G(r5, r13)
            int r14 = r7.f29056p
            if (r14 != r8) goto L_0x009f
            int r14 = r7.f29047g
            int r14 = b(r14)
            int r14 = -r14
            goto L_0x00a5
        L_0x009f:
            int r14 = r7.f29047g
            int r14 = b(r14)
        L_0x00a5:
            r20 = r13
            r8 = 0
            goto L_0x00e8
        L_0x00a9:
            r14 = 0
            int r14 = (r13 > r14 ? 1 : (r13 == r14 ? 0 : -1))
            java.lang.String r8 = "%.2fem"
            if (r14 < 0) goto L_0x00c2
            float r13 = r13 * r4
            java.lang.Float r13 = java.lang.Float.valueOf(r13)
            java.lang.Object[] r13 = new java.lang.Object[]{r13}
            java.lang.String r13 = t3.N.G(r8, r13)
            r20 = r13
            r8 = 0
        L_0x00c0:
            r14 = 0
            goto L_0x00e8
        L_0x00c2:
            float r13 = -r13
            float r13 = r13 - r15
            float r13 = r13 * r4
            java.lang.Float r13 = java.lang.Float.valueOf(r13)
            java.lang.Object[] r13 = new java.lang.Object[]{r13}
            java.lang.String r13 = t3.N.G(r8, r13)
            r20 = r13
            r8 = 1
            goto L_0x00c0
        L_0x00d5:
            float r8 = r0.f43323g
            float r15 = r15 - r8
            float r15 = r15 * r12
            java.lang.Float r8 = java.lang.Float.valueOf(r15)
            java.lang.Object[] r8 = new java.lang.Object[]{r8}
            java.lang.String r13 = t3.N.G(r5, r8)
            r14 = -100
            goto L_0x00a5
        L_0x00e8:
            float r13 = r7.f29050j
            int r10 = (r13 > r10 ? 1 : (r13 == r10 ? 0 : -1))
            if (r10 == 0) goto L_0x00fe
            float r13 = r13 * r12
            java.lang.Float r10 = java.lang.Float.valueOf(r13)
            java.lang.Object[] r10 = new java.lang.Object[]{r10}
            java.lang.String r5 = t3.N.G(r5, r10)
        L_0x00fb:
            r22 = r5
            goto L_0x0101
        L_0x00fe:
            java.lang.String r5 = "fit-content"
            goto L_0x00fb
        L_0x0101:
            android.text.Layout$Alignment r5 = r7.f29042b
            java.lang.String r23 = c(r5)
            int r5 = r7.f29056p
            java.lang.String r24 = f(r5)
            int r5 = r7.f29054n
            float r10 = r7.f29055o
            java.lang.String r25 = r0.e(r5, r10)
            boolean r5 = r7.f29052l
            if (r5 == 0) goto L_0x011c
            int r5 = r7.f29053m
            goto L_0x0120
        L_0x011c:
            w4.a r5 = r0.f43320d
            int r5 = r5.f57087c
        L_0x0120:
            java.lang.String r26 = androidx.media3.ui.C6992a.b(r5)
            int r5 = r7.f29056p
            java.lang.String r10 = "right"
            r12 = 2
            java.lang.String r13 = "top"
            java.lang.String r15 = "left"
            r4 = 1
            if (r5 == r4) goto L_0x0144
            if (r5 == r12) goto L_0x013b
            if (r8 == 0) goto L_0x0136
            java.lang.String r13 = "bottom"
        L_0x0136:
            r19 = r13
            r17 = r15
            goto L_0x0147
        L_0x013b:
            if (r8 == 0) goto L_0x013e
            goto L_0x013f
        L_0x013e:
            r10 = r15
        L_0x013f:
            r19 = r10
            r17 = r13
            goto L_0x0147
        L_0x0144:
            if (r8 == 0) goto L_0x013f
            goto L_0x013e
        L_0x0147:
            if (r5 == r12) goto L_0x0152
            r4 = 1
            if (r5 != r4) goto L_0x014d
            goto L_0x0152
        L_0x014d:
            java.lang.String r4 = "width"
            r21 = r4
            goto L_0x015b
        L_0x0152:
            java.lang.String r4 = "height"
            r21 = r4
            r30 = r14
            r14 = r11
            r11 = r30
        L_0x015b:
            java.lang.CharSequence r4 = r7.f29041a
            android.content.Context r5 = r31.getContext()
            android.content.res.Resources r5 = r5.getResources()
            android.util.DisplayMetrics r5 = r5.getDisplayMetrics()
            float r5 = r5.density
            androidx.media3.ui.w$b r4 = androidx.media3.ui.w.a(r4, r5)
            java.util.Set r5 = r2.keySet()
            java.util.Iterator r5 = r5.iterator()
        L_0x0177:
            boolean r8 = r5.hasNext()
            if (r8 == 0) goto L_0x01a3
            java.lang.Object r8 = r5.next()
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r10 = r2.get(r8)
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r10 = r2.put(r8, r10)
            java.lang.String r10 = (java.lang.String) r10
            if (r10 == 0) goto L_0x019e
            java.lang.Object r8 = r2.get(r8)
            boolean r8 = r10.equals(r8)
            if (r8 == 0) goto L_0x019c
            goto L_0x019e
        L_0x019c:
            r8 = 0
            goto L_0x019f
        L_0x019e:
            r8 = 1
        L_0x019f:
            t3.C5950a.g(r8)
            goto L_0x0177
        L_0x01a3:
            java.lang.Integer r16 = java.lang.Integer.valueOf(r6)
            java.lang.Float r18 = java.lang.Float.valueOf(r9)
            java.lang.Integer r27 = java.lang.Integer.valueOf(r11)
            java.lang.Integer r28 = java.lang.Integer.valueOf(r14)
            java.lang.String r29 = h(r7)
            java.lang.Object[] r5 = new java.lang.Object[]{r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29}
            java.lang.String r8 = "<div style='position:absolute;z-index:%s;%s:%.2f%%;%s:%s;%s:%s;text-align:%s;writing-mode:%s;font-size:%s;background-color:%s;transform:translate(%s%%,%s%%)%s;'>"
            java.lang.String r5 = t3.N.G(r8, r5)
            r1.append(r5)
            java.lang.String r5 = "<span class='%s'>"
            java.lang.Object[] r8 = new java.lang.Object[]{r3}
            java.lang.String r5 = t3.N.G(r5, r8)
            r1.append(r5)
            android.text.Layout$Alignment r5 = r7.f29043c
            java.lang.String r7 = "</span>"
            if (r5 == 0) goto L_0x01f1
            java.lang.String r5 = c(r5)
            java.lang.Object[] r5 = new java.lang.Object[]{r5}
            java.lang.String r8 = "<span style='display:inline-block; text-align:%s;'>"
            java.lang.String r5 = t3.N.G(r8, r5)
            r1.append(r5)
            java.lang.String r4 = r4.f43393a
            r1.append(r4)
            r1.append(r7)
            goto L_0x01f6
        L_0x01f1:
            java.lang.String r4 = r4.f43393a
            r1.append(r4)
        L_0x01f6:
            r1.append(r7)
            java.lang.String r4 = "</div>"
            r1.append(r4)
            int r6 = r6 + 1
            r4 = 1067030938(0x3f99999a, float:1.2)
            goto L_0x0052
        L_0x0205:
            java.lang.String r3 = "</div></body></html>"
            r1.append(r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "<html><head><style>"
            r3.append(r4)
            java.util.Set r4 = r2.keySet()
            java.util.Iterator r4 = r4.iterator()
        L_0x021c:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x023f
            java.lang.Object r5 = r4.next()
            java.lang.String r5 = (java.lang.String) r5
            r3.append(r5)
            java.lang.String r6 = "{"
            r3.append(r6)
            java.lang.Object r5 = r2.get(r5)
            java.lang.String r5 = (java.lang.String) r5
            r3.append(r5)
            java.lang.String r5 = "}"
            r3.append(r5)
            goto L_0x021c
        L_0x023f:
            java.lang.String r2 = "</style></head>"
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r3 = 0
            r1.insert(r3, r2)
            android.webkit.WebView r2 = r0.f43318b
            java.lang.String r1 = r1.toString()
            java.nio.charset.Charset r3 = java.nio.charset.StandardCharsets.UTF_8
            byte[] r1 = r1.getBytes(r3)
            r3 = 1
            java.lang.String r1 = android.util.Base64.encodeToString(r1, r3)
            java.lang.String r3 = "text/html"
            java.lang.String r4 = "base64"
            r2.loadData(r1, r3, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.ui.WebViewSubtitleOutput.i():void");
    }

    public void a(List<s3.a> list, C8911a aVar, float f10, int i10, float f11) {
        this.f43320d = aVar;
        this.f43321e = f10;
        this.f43322f = i10;
        this.f43323g = f11;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i11 = 0; i11 < list.size(); i11++) {
            s3.a aVar2 = list.get(i11);
            if (aVar2.f29044d != null) {
                arrayList.add(aVar2);
            } else {
                arrayList2.add(aVar2);
            }
        }
        if (!this.f43319c.isEmpty() || !arrayList2.isEmpty()) {
            this.f43319c = arrayList2;
            i();
        }
        this.f43317a.a(arrayList, aVar, f10, i10, f11);
        invalidate();
    }

    public void g() {
        this.f43318b.destroy();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (z10 && !this.f43319c.isEmpty()) {
            i();
        }
    }

    public WebViewSubtitleOutput(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f43319c = Collections.emptyList();
        this.f43320d = C8911a.f57084g;
        this.f43321e = 0.0533f;
        this.f43322f = 0;
        this.f43323g = 0.08f;
        CanvasSubtitleOutput canvasSubtitleOutput = new CanvasSubtitleOutput(context, attributeSet);
        this.f43317a = canvasSubtitleOutput;
        AnonymousClass1 r22 = new WebView(context, attributeSet) {
            public boolean onTouchEvent(MotionEvent motionEvent) {
                super.onTouchEvent(motionEvent);
                return false;
            }

            public boolean performClick() {
                super.performClick();
                return false;
            }
        };
        this.f43318b = r22;
        r22.setBackgroundColor(0);
        addView(canvasSubtitleOutput);
        addView(r22);
    }
}
