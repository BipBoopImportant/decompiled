package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.Log;
import android.util.SparseArray;
import android.util.Xml;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

public class b {

    /* renamed from: a  reason: collision with root package name */
    private final ConstraintLayout f20294a;

    /* renamed from: b  reason: collision with root package name */
    c f20295b;

    /* renamed from: c  reason: collision with root package name */
    int f20296c = -1;

    /* renamed from: d  reason: collision with root package name */
    int f20297d = -1;

    /* renamed from: e  reason: collision with root package name */
    private SparseArray<a> f20298e = new SparseArray<>();

    /* renamed from: f  reason: collision with root package name */
    private SparseArray<c> f20299f = new SparseArray<>();

    static class a {

        /* renamed from: a  reason: collision with root package name */
        int f20300a;

        /* renamed from: b  reason: collision with root package name */
        ArrayList<C0322b> f20301b = new ArrayList<>();

        /* renamed from: c  reason: collision with root package name */
        int f20302c = -1;

        /* renamed from: d  reason: collision with root package name */
        c f20303d;

        a(Context context, XmlPullParser xmlPullParser) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), f.f20681c7);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == f.f20690d7) {
                    this.f20300a = obtainStyledAttributes.getResourceId(index, this.f20300a);
                } else if (index == f.f20699e7) {
                    this.f20302c = obtainStyledAttributes.getResourceId(index, this.f20302c);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f20302c);
                    context.getResources().getResourceName(this.f20302c);
                    if ("layout".equals(resourceTypeName)) {
                        c cVar = new c();
                        this.f20303d = cVar;
                        cVar.f(context, this.f20302c);
                    }
                }
            }
            obtainStyledAttributes.recycle();
        }

        /* access modifiers changed from: package-private */
        public void a(C0322b bVar) {
            this.f20301b.add(bVar);
        }

        public int b(float f10, float f11) {
            for (int i10 = 0; i10 < this.f20301b.size(); i10++) {
                if (this.f20301b.get(i10).a(f10, f11)) {
                    return i10;
                }
            }
            return -1;
        }
    }

    /* renamed from: androidx.constraintlayout.widget.b$b  reason: collision with other inner class name */
    static class C0322b {

        /* renamed from: a  reason: collision with root package name */
        float f20304a = Float.NaN;

        /* renamed from: b  reason: collision with root package name */
        float f20305b = Float.NaN;

        /* renamed from: c  reason: collision with root package name */
        float f20306c = Float.NaN;

        /* renamed from: d  reason: collision with root package name */
        float f20307d = Float.NaN;

        /* renamed from: e  reason: collision with root package name */
        int f20308e = -1;

        /* renamed from: f  reason: collision with root package name */
        c f20309f;

        C0322b(Context context, XmlPullParser xmlPullParser) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), f.f20852v7);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == f.f20861w7) {
                    this.f20308e = obtainStyledAttributes.getResourceId(index, this.f20308e);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f20308e);
                    context.getResources().getResourceName(this.f20308e);
                    if ("layout".equals(resourceTypeName)) {
                        c cVar = new c();
                        this.f20309f = cVar;
                        cVar.f(context, this.f20308e);
                    }
                } else if (index == f.f20870x7) {
                    this.f20307d = obtainStyledAttributes.getDimension(index, this.f20307d);
                } else if (index == f.f20879y7) {
                    this.f20305b = obtainStyledAttributes.getDimension(index, this.f20305b);
                } else if (index == f.f20888z7) {
                    this.f20306c = obtainStyledAttributes.getDimension(index, this.f20306c);
                } else if (index == f.f20452A7) {
                    this.f20304a = obtainStyledAttributes.getDimension(index, this.f20304a);
                } else {
                    Log.v("ConstraintLayoutStates", "Unknown tag");
                }
            }
            obtainStyledAttributes.recycle();
        }

        /* access modifiers changed from: package-private */
        public boolean a(float f10, float f11) {
            if (!Float.isNaN(this.f20304a) && f10 < this.f20304a) {
                return false;
            }
            if (!Float.isNaN(this.f20305b) && f11 < this.f20305b) {
                return false;
            }
            if (Float.isNaN(this.f20306c) || f10 <= this.f20306c) {
                return Float.isNaN(this.f20307d) || f11 <= this.f20307d;
            }
            return false;
        }
    }

    b(Context context, ConstraintLayout constraintLayout, int i10) {
        this.f20294a = constraintLayout;
        a(context, i10);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(android.content.Context r11, int r12) {
        /*
            r10 = this;
            java.lang.String r0 = "Error parsing resource: "
            java.lang.String r1 = "ConstraintLayoutStates"
            android.content.res.Resources r2 = r11.getResources()
            android.content.res.XmlResourceParser r2 = r2.getXml(r12)
            int r3 = r2.getEventType()     // Catch:{ XmlPullParserException -> 0x0033, IOException -> 0x0031 }
            r4 = 0
        L_0x0011:
            r5 = 1
            if (r3 == r5) goto L_0x00ab
            r6 = 2
            if (r3 == r6) goto L_0x0019
            goto L_0x0081
        L_0x0019:
            java.lang.String r3 = r2.getName()     // Catch:{ XmlPullParserException -> 0x0033, IOException -> 0x0031 }
            int r7 = r3.hashCode()     // Catch:{ XmlPullParserException -> 0x0033, IOException -> 0x0031 }
            r8 = 4
            r9 = 3
            switch(r7) {
                case -1349929691: goto L_0x0053;
                case 80204913: goto L_0x0049;
                case 1382829617: goto L_0x0040;
                case 1657696882: goto L_0x0036;
                case 1901439077: goto L_0x0027;
                default: goto L_0x0026;
            }     // Catch:{ XmlPullParserException -> 0x0033, IOException -> 0x0031 }
        L_0x0026:
            goto L_0x005d
        L_0x0027:
            java.lang.String r5 = "Variant"
            boolean r3 = r3.equals(r5)     // Catch:{ XmlPullParserException -> 0x0033, IOException -> 0x0031 }
            if (r3 == 0) goto L_0x005d
            r5 = r9
            goto L_0x005e
        L_0x0031:
            r11 = move-exception
            goto L_0x0086
        L_0x0033:
            r11 = move-exception
            goto L_0x0099
        L_0x0036:
            java.lang.String r5 = "layoutDescription"
            boolean r3 = r3.equals(r5)     // Catch:{ XmlPullParserException -> 0x0033, IOException -> 0x0031 }
            if (r3 == 0) goto L_0x005d
            r5 = 0
            goto L_0x005e
        L_0x0040:
            java.lang.String r7 = "StateSet"
            boolean r3 = r3.equals(r7)     // Catch:{ XmlPullParserException -> 0x0033, IOException -> 0x0031 }
            if (r3 == 0) goto L_0x005d
            goto L_0x005e
        L_0x0049:
            java.lang.String r5 = "State"
            boolean r3 = r3.equals(r5)     // Catch:{ XmlPullParserException -> 0x0033, IOException -> 0x0031 }
            if (r3 == 0) goto L_0x005d
            r5 = r6
            goto L_0x005e
        L_0x0053:
            java.lang.String r5 = "ConstraintSet"
            boolean r3 = r3.equals(r5)     // Catch:{ XmlPullParserException -> 0x0033, IOException -> 0x0031 }
            if (r3 == 0) goto L_0x005d
            r5 = r8
            goto L_0x005e
        L_0x005d:
            r5 = -1
        L_0x005e:
            if (r5 == r6) goto L_0x0074
            if (r5 == r9) goto L_0x0069
            if (r5 == r8) goto L_0x0065
            goto L_0x0081
        L_0x0065:
            r10.b(r11, r2)     // Catch:{ XmlPullParserException -> 0x0033, IOException -> 0x0031 }
            goto L_0x0081
        L_0x0069:
            androidx.constraintlayout.widget.b$b r3 = new androidx.constraintlayout.widget.b$b     // Catch:{ XmlPullParserException -> 0x0033, IOException -> 0x0031 }
            r3.<init>(r11, r2)     // Catch:{ XmlPullParserException -> 0x0033, IOException -> 0x0031 }
            if (r4 == 0) goto L_0x0081
            r4.a(r3)     // Catch:{ XmlPullParserException -> 0x0033, IOException -> 0x0031 }
            goto L_0x0081
        L_0x0074:
            androidx.constraintlayout.widget.b$a r3 = new androidx.constraintlayout.widget.b$a     // Catch:{ XmlPullParserException -> 0x0033, IOException -> 0x0031 }
            r3.<init>(r11, r2)     // Catch:{ XmlPullParserException -> 0x0033, IOException -> 0x0031 }
            android.util.SparseArray<androidx.constraintlayout.widget.b$a> r4 = r10.f20298e     // Catch:{ XmlPullParserException -> 0x0033, IOException -> 0x0031 }
            int r5 = r3.f20300a     // Catch:{ XmlPullParserException -> 0x0033, IOException -> 0x0031 }
            r4.put(r5, r3)     // Catch:{ XmlPullParserException -> 0x0033, IOException -> 0x0031 }
            r4 = r3
        L_0x0081:
            int r3 = r2.next()     // Catch:{ XmlPullParserException -> 0x0033, IOException -> 0x0031 }
            goto L_0x0011
        L_0x0086:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            r2.append(r12)
            java.lang.String r12 = r2.toString()
            android.util.Log.e(r1, r12, r11)
            goto L_0x00ab
        L_0x0099:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            r2.append(r12)
            java.lang.String r12 = r2.toString()
            android.util.Log.e(r1, r12, r11)
        L_0x00ab:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.b.a(android.content.Context, int):void");
    }

    private void b(Context context, XmlPullParser xmlPullParser) {
        int i10;
        c cVar = new c();
        int attributeCount = xmlPullParser.getAttributeCount();
        int i11 = 0;
        while (i11 < attributeCount) {
            String attributeName = xmlPullParser.getAttributeName(i11);
            String attributeValue = xmlPullParser.getAttributeValue(i11);
            if (attributeName == null || attributeValue == null || !"id".equals(attributeName)) {
                i11++;
            } else {
                if (attributeValue.contains("/")) {
                    i10 = context.getResources().getIdentifier(attributeValue.substring(attributeValue.indexOf(47) + 1), "id", context.getPackageName());
                } else {
                    i10 = -1;
                }
                if (i10 == -1) {
                    if (attributeValue.length() > 1) {
                        i10 = Integer.parseInt(attributeValue.substring(1));
                    } else {
                        Log.e("ConstraintLayoutStates", "error in parsing id");
                    }
                }
                cVar.o(context, xmlPullParser);
                this.f20299f.put(i10, cVar);
                return;
            }
        }
    }

    public void c(d dVar) {
    }

    public void d(int i10, float f10, float f11) {
        int b10;
        int i11 = this.f20296c;
        if (i11 == i10) {
            a valueAt = i10 == -1 ? this.f20298e.valueAt(0) : this.f20298e.get(i11);
            int i12 = this.f20297d;
            if ((i12 == -1 || !valueAt.f20301b.get(i12).a(f10, f11)) && this.f20297d != (b10 = valueAt.b(f10, f11))) {
                c cVar = b10 == -1 ? this.f20295b : valueAt.f20301b.get(b10).f20309f;
                if (b10 != -1) {
                    int i13 = valueAt.f20301b.get(b10).f20308e;
                }
                if (cVar != null) {
                    this.f20297d = b10;
                    cVar.c(this.f20294a);
                    return;
                }
                return;
            }
            return;
        }
        this.f20296c = i10;
        a aVar = this.f20298e.get(i10);
        int b11 = aVar.b(f10, f11);
        c cVar2 = b11 == -1 ? aVar.f20303d : aVar.f20301b.get(b11).f20309f;
        if (b11 != -1) {
            int i14 = aVar.f20301b.get(b11).f20308e;
        }
        if (cVar2 == null) {
            Log.v("ConstraintLayoutStates", "NO Constraint set found ! id=" + i10 + ", dim =" + f10 + ", " + f11);
            return;
        }
        this.f20297d = b11;
        cVar2.c(this.f20294a);
    }
}
