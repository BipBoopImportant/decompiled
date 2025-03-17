package w2;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Shader;
import android.util.Log;

/* renamed from: w2.d  reason: case insensitive filesystem */
public final class C6210d {

    /* renamed from: a  reason: collision with root package name */
    private final Shader f31347a;

    /* renamed from: b  reason: collision with root package name */
    private final ColorStateList f31348b;

    /* renamed from: c  reason: collision with root package name */
    private int f31349c;

    private C6210d(Shader shader, ColorStateList colorStateList, int i10) {
        this.f31347a = shader;
        this.f31348b = colorStateList;
        this.f31349c = i10;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x0015  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static w2.C6210d a(android.content.res.Resources r4, int r5, android.content.res.Resources.Theme r6) {
        /*
            android.content.res.XmlResourceParser r5 = r4.getXml(r5)
            android.util.AttributeSet r0 = android.util.Xml.asAttributeSet(r5)
        L_0x0008:
            int r1 = r5.next()
            r2 = 2
            if (r1 == r2) goto L_0x0013
            r3 = 1
            if (r1 == r3) goto L_0x0013
            goto L_0x0008
        L_0x0013:
            if (r1 != r2) goto L_0x005c
            java.lang.String r1 = r5.getName()
            r1.hashCode()
            java.lang.String r2 = "gradient"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L_0x0053
            java.lang.String r2 = "selector"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0035
            android.content.res.ColorStateList r4 = w2.C6209c.b(r4, r5, r0, r6)
            w2.d r4 = c(r4)
            return r4
        L_0x0035:
            org.xmlpull.v1.XmlPullParserException r4 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r5 = r5.getPositionDescription()
            r6.append(r5)
            java.lang.String r5 = ": unsupported complex color tag "
            r6.append(r5)
            r6.append(r1)
            java.lang.String r5 = r6.toString()
            r4.<init>(r5)
            throw r4
        L_0x0053:
            android.graphics.Shader r4 = w2.C6212f.b(r4, r5, r0, r6)
            w2.d r4 = d(r4)
            return r4
        L_0x005c:
            org.xmlpull.v1.XmlPullParserException r4 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r5 = "No start tag found"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: w2.C6210d.a(android.content.res.Resources, int, android.content.res.Resources$Theme):w2.d");
    }

    static C6210d b(int i10) {
        return new C6210d((Shader) null, (ColorStateList) null, i10);
    }

    static C6210d c(ColorStateList colorStateList) {
        return new C6210d((Shader) null, colorStateList, colorStateList.getDefaultColor());
    }

    static C6210d d(Shader shader) {
        return new C6210d(shader, (ColorStateList) null, 0);
    }

    public static C6210d g(Resources resources, int i10, Resources.Theme theme) {
        try {
            return a(resources, i10, theme);
        } catch (Exception e10) {
            Log.e("ComplexColorCompat", "Failed to inflate ComplexColor.", e10);
            return null;
        }
    }

    public int e() {
        return this.f31349c;
    }

    public Shader f() {
        return this.f31347a;
    }

    public boolean h() {
        return this.f31347a != null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r1.f31348b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean i() {
        /*
            r1 = this;
            android.graphics.Shader r0 = r1.f31347a
            if (r0 != 0) goto L_0x0010
            android.content.res.ColorStateList r0 = r1.f31348b
            if (r0 == 0) goto L_0x0010
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L_0x0010
            r0 = 1
            goto L_0x0011
        L_0x0010:
            r0 = 0
        L_0x0011:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: w2.C6210d.i():boolean");
    }

    public boolean j(int[] iArr) {
        if (i()) {
            ColorStateList colorStateList = this.f31348b;
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (colorForState != this.f31349c) {
                this.f31349c = colorForState;
                return true;
            }
        }
        return false;
    }

    public void k(int i10) {
        this.f31349c = i10;
    }

    public boolean l() {
        return h() || this.f31349c != 0;
    }
}
