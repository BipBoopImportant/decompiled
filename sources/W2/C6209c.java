package w2;

import B2.a;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: w2.c  reason: case insensitive filesystem */
public final class C6209c {

    /* renamed from: a  reason: collision with root package name */
    private static final ThreadLocal<TypedValue> f31346a = new ThreadLocal<>();

    /* JADX WARNING: Removed duplicated region for block: B:6:0x0011  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0016  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.content.res.ColorStateList a(android.content.res.Resources r4, org.xmlpull.v1.XmlPullParser r5, android.content.res.Resources.Theme r6) {
        /*
            android.util.AttributeSet r0 = android.util.Xml.asAttributeSet(r5)
        L_0x0004:
            int r1 = r5.next()
            r2 = 2
            if (r1 == r2) goto L_0x000f
            r3 = 1
            if (r1 == r3) goto L_0x000f
            goto L_0x0004
        L_0x000f:
            if (r1 != r2) goto L_0x0016
            android.content.res.ColorStateList r4 = b(r4, r5, r0, r6)
            return r4
        L_0x0016:
            org.xmlpull.v1.XmlPullParserException r4 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r5 = "No start tag found"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: w2.C6209c.a(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.content.res.Resources$Theme):android.content.res.ColorStateList");
    }

    public static ColorStateList b(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        String name = xmlPullParser.getName();
        if (name.equals("selector")) {
            return e(resources, xmlPullParser, attributeSet, theme);
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid color state list tag " + name);
    }

    private static TypedValue c() {
        ThreadLocal<TypedValue> threadLocal = f31346a;
        TypedValue typedValue = threadLocal.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        threadLocal.set(typedValue2);
        return typedValue2;
    }

    public static ColorStateList d(Resources resources, int i10, Resources.Theme theme) {
        try {
            return a(resources, resources.getXml(i10), theme);
        } catch (Exception e10) {
            Log.e("CSLCompat", "Failed to inflate ColorStateList.", e10);
            return null;
        }
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [java.lang.Object[]] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.content.res.ColorStateList e(android.content.res.Resources r17, org.xmlpull.v1.XmlPullParser r18, android.util.AttributeSet r19, android.content.res.Resources.Theme r20) {
        /*
            r0 = r17
            r1 = r19
            r2 = r20
            int r3 = r18.getDepth()
            r4 = 1
            int r3 = r3 + r4
            r5 = 20
            int[][] r6 = new int[r5][]
            int[] r5 = new int[r5]
            r8 = 0
        L_0x0013:
            int r9 = r18.next()
            if (r9 == r4) goto L_0x00f4
            int r10 = r18.getDepth()
            if (r10 >= r3) goto L_0x0022
            r11 = 3
            if (r9 == r11) goto L_0x00f4
        L_0x0022:
            r11 = 2
            if (r9 != r11) goto L_0x00ef
            if (r10 > r3) goto L_0x00ef
            java.lang.String r9 = r18.getName()
            java.lang.String r10 = "item"
            boolean r9 = r9.equals(r10)
            if (r9 != 0) goto L_0x0035
            goto L_0x00ef
        L_0x0035:
            int[] r9 = t2.C5949g.f29409b
            android.content.res.TypedArray r9 = h(r0, r2, r1, r9)
            int r10 = t2.C5949g.f29410c
            r11 = -1
            int r10 = r9.getResourceId(r10, r11)
            r12 = -65281(0xffffffffffff00ff, float:NaN)
            if (r10 == r11) goto L_0x0061
            boolean r11 = f(r0, r10)
            if (r11 != 0) goto L_0x0061
            android.content.res.XmlResourceParser r10 = r0.getXml(r10)     // Catch:{ Exception -> 0x005a }
            android.content.res.ColorStateList r10 = a(r0, r10, r2)     // Catch:{ Exception -> 0x005a }
            int r10 = r10.getDefaultColor()     // Catch:{ Exception -> 0x005a }
            goto L_0x0067
        L_0x005a:
            int r10 = t2.C5949g.f29410c
            int r10 = r9.getColor(r10, r12)
            goto L_0x0067
        L_0x0061:
            int r10 = t2.C5949g.f29410c
            int r10 = r9.getColor(r10, r12)
        L_0x0067:
            int r11 = t2.C5949g.f29411d
            boolean r11 = r9.hasValue(r11)
            r12 = 1065353216(0x3f800000, float:1.0)
            if (r11 == 0) goto L_0x0078
            int r11 = t2.C5949g.f29411d
            float r12 = r9.getFloat(r11, r12)
            goto L_0x0086
        L_0x0078:
            int r11 = t2.C5949g.f29413f
            boolean r11 = r9.hasValue(r11)
            if (r11 == 0) goto L_0x0086
            int r11 = t2.C5949g.f29413f
            float r12 = r9.getFloat(r11, r12)
        L_0x0086:
            int r11 = android.os.Build.VERSION.SDK_INT
            r13 = 31
            r14 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r11 < r13) goto L_0x009d
            int r11 = t2.C5949g.f29412e
            boolean r11 = r9.hasValue(r11)
            if (r11 == 0) goto L_0x009d
            int r11 = t2.C5949g.f29412e
            float r11 = r9.getFloat(r11, r14)
            goto L_0x00a3
        L_0x009d:
            int r11 = t2.C5949g.f29414g
            float r11 = r9.getFloat(r11, r14)
        L_0x00a3:
            r9.recycle()
            int r9 = r19.getAttributeCount()
            int[] r13 = new int[r9]
            r14 = 0
            r15 = 0
        L_0x00ae:
            if (r14 >= r9) goto L_0x00da
            int r4 = r1.getAttributeNameResource(r14)
            r7 = 16843173(0x10101a5, float:2.3694738E-38)
            if (r4 == r7) goto L_0x00d4
            r7 = 16843551(0x101031f, float:2.3695797E-38)
            if (r4 == r7) goto L_0x00d4
            int r7 = t2.C5943a.f29329a
            if (r4 == r7) goto L_0x00d4
            int r7 = t2.C5943a.f29330b
            if (r4 == r7) goto L_0x00d4
            int r7 = r15 + 1
            r0 = 0
            boolean r16 = r1.getAttributeBooleanValue(r14, r0)
            if (r16 == 0) goto L_0x00d0
            goto L_0x00d1
        L_0x00d0:
            int r4 = -r4
        L_0x00d1:
            r13[r15] = r4
            r15 = r7
        L_0x00d4:
            int r14 = r14 + 1
            r4 = 1
            r0 = r17
            goto L_0x00ae
        L_0x00da:
            int[] r0 = android.util.StateSet.trimStateSet(r13, r15)
            int r4 = g(r10, r12, r11)
            int[] r5 = w2.C6213g.a(r5, r8, r4)
            java.lang.Object[] r0 = w2.C6213g.b(r6, r8, r0)
            r6 = r0
            int[][] r6 = (int[][]) r6
            int r8 = r8 + 1
        L_0x00ef:
            r4 = 1
            r0 = r17
            goto L_0x0013
        L_0x00f4:
            int[] r0 = new int[r8]
            int[][] r1 = new int[r8][]
            r2 = 0
            java.lang.System.arraycopy(r5, r2, r0, r2, r8)
            java.lang.System.arraycopy(r6, r2, r1, r2, r8)
            android.content.res.ColorStateList r2 = new android.content.res.ColorStateList
            r2.<init>(r1, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: w2.C6209c.e(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):android.content.res.ColorStateList");
    }

    private static boolean f(Resources resources, int i10) {
        TypedValue c10 = c();
        resources.getValue(i10, c10, true);
        int i11 = c10.type;
        return i11 >= 28 && i11 <= 31;
    }

    private static int g(int i10, float f10, float f11) {
        boolean z10 = f11 >= 0.0f && f11 <= 100.0f;
        if (f10 == 1.0f && !z10) {
            return i10;
        }
        int c10 = a.c((int) ((((float) Color.alpha(i10)) * f10) + 0.5f), 0, 255);
        if (z10) {
            C6207a c11 = C6207a.c(i10);
            i10 = C6207a.m(c11.j(), c11.i(), f11);
        }
        return (i10 & 16777215) | (c10 << 24);
    }

    private static TypedArray h(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }
}
