package w2;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import t2.C5949g;

/* renamed from: w2.f  reason: case insensitive filesystem */
final class C6212f {
    private static a a(a aVar, int i10, int i11, boolean z10, int i12) {
        return aVar != null ? aVar : z10 ? new a(i10, i12, i11) : new a(i10, i11);
    }

    static Shader b(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        XmlPullParser xmlPullParser2 = xmlPullParser;
        String name = xmlPullParser.getName();
        if (name.equals("gradient")) {
            Resources.Theme theme2 = theme;
            TypedArray q10 = l.q(resources, theme2, attributeSet, C5949g.f29392B);
            float j10 = l.j(q10, xmlPullParser2, "startX", C5949g.f29401K, 0.0f);
            float j11 = l.j(q10, xmlPullParser2, "startY", C5949g.f29402L, 0.0f);
            float j12 = l.j(q10, xmlPullParser2, "endX", C5949g.f29403M, 0.0f);
            float j13 = l.j(q10, xmlPullParser2, "endY", C5949g.f29404N, 0.0f);
            float j14 = l.j(q10, xmlPullParser2, "centerX", C5949g.f29396F, 0.0f);
            float j15 = l.j(q10, xmlPullParser2, "centerY", C5949g.f29397G, 0.0f);
            int k10 = l.k(q10, xmlPullParser2, "type", C5949g.f29395E, 0);
            int f10 = l.f(q10, xmlPullParser2, "startColor", C5949g.f29393C, 0);
            boolean p10 = l.p(xmlPullParser2, "centerColor");
            int f11 = l.f(q10, xmlPullParser2, "centerColor", C5949g.f29400J, 0);
            int f12 = l.f(q10, xmlPullParser2, "endColor", C5949g.f29394D, 0);
            int k11 = l.k(q10, xmlPullParser2, "tileMode", C5949g.f29399I, 0);
            float f13 = j14;
            float j16 = l.j(q10, xmlPullParser2, "gradientRadius", C5949g.f29398H, 0.0f);
            q10.recycle();
            a a10 = a(c(resources, xmlPullParser, attributeSet, theme), f10, f12, p10, f11);
            if (k10 == 1) {
                float f14 = f13;
                if (j16 > 0.0f) {
                    int[] iArr = a10.f31362a;
                    return new RadialGradient(f14, j15, j16, iArr, a10.f31363b, d(k11));
                }
                throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
            } else if (k10 != 2) {
                return new LinearGradient(j10, j11, j12, j13, a10.f31362a, a10.f31363b, d(k11));
            } else {
                return new SweepGradient(f13, j15, a10.f31362a, a10.f31363b);
            }
        } else {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid gradient color tag " + name);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0084, code lost:
        throw new org.xmlpull.v1.XmlPullParserException(r9.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static w2.C6212f.a c(android.content.res.Resources r8, org.xmlpull.v1.XmlPullParser r9, android.util.AttributeSet r10, android.content.res.Resources.Theme r11) {
        /*
            int r0 = r9.getDepth()
            r1 = 1
            int r0 = r0 + r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 20
            r2.<init>(r3)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r3)
        L_0x0012:
            int r3 = r9.next()
            if (r3 == r1) goto L_0x0085
            int r5 = r9.getDepth()
            if (r5 >= r0) goto L_0x0021
            r6 = 3
            if (r3 == r6) goto L_0x0085
        L_0x0021:
            r6 = 2
            if (r3 == r6) goto L_0x0025
            goto L_0x0012
        L_0x0025:
            if (r5 > r0) goto L_0x0012
            java.lang.String r3 = r9.getName()
            java.lang.String r5 = "item"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L_0x0034
            goto L_0x0012
        L_0x0034:
            int[] r3 = t2.C5949g.f29405O
            android.content.res.TypedArray r3 = w2.l.q(r8, r11, r10, r3)
            int r5 = t2.C5949g.f29406P
            boolean r5 = r3.hasValue(r5)
            int r6 = t2.C5949g.f29407Q
            boolean r6 = r3.hasValue(r6)
            if (r5 == 0) goto L_0x006a
            if (r6 == 0) goto L_0x006a
            int r5 = t2.C5949g.f29406P
            r6 = 0
            int r5 = r3.getColor(r5, r6)
            int r6 = t2.C5949g.f29407Q
            r7 = 0
            float r6 = r3.getFloat(r6, r7)
            r3.recycle()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
            r4.add(r3)
            java.lang.Float r3 = java.lang.Float.valueOf(r6)
            r2.add(r3)
            goto L_0x0012
        L_0x006a:
            org.xmlpull.v1.XmlPullParserException r8 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r9 = r9.getPositionDescription()
            r10.append(r9)
            java.lang.String r9 = ": <item> tag requires a 'color' attribute and a 'offset' attribute!"
            r10.append(r9)
            java.lang.String r9 = r10.toString()
            r8.<init>(r9)
            throw r8
        L_0x0085:
            int r8 = r4.size()
            if (r8 <= 0) goto L_0x0091
            w2.f$a r8 = new w2.f$a
            r8.<init>((java.util.List<java.lang.Integer>) r4, (java.util.List<java.lang.Float>) r2)
            return r8
        L_0x0091:
            r8 = 0
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: w2.C6212f.c(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):w2.f$a");
    }

    private static Shader.TileMode d(int i10) {
        return i10 != 1 ? i10 != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR : Shader.TileMode.REPEAT;
    }

    /* renamed from: w2.f$a */
    static final class a {

        /* renamed from: a  reason: collision with root package name */
        final int[] f31362a;

        /* renamed from: b  reason: collision with root package name */
        final float[] f31363b;

        a(List<Integer> list, List<Float> list2) {
            int size = list.size();
            this.f31362a = new int[size];
            this.f31363b = new float[size];
            for (int i10 = 0; i10 < size; i10++) {
                this.f31362a[i10] = list.get(i10).intValue();
                this.f31363b[i10] = list2.get(i10).floatValue();
            }
        }

        a(int i10, int i11) {
            this.f31362a = new int[]{i10, i11};
            this.f31363b = new float[]{0.0f, 1.0f};
        }

        a(int i10, int i11, int i12) {
            this.f31362a = new int[]{i10, i11, i12};
            this.f31363b = new float[]{0.0f, 0.5f, 1.0f};
        }
    }
}
