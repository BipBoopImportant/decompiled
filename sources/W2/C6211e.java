package w2;

import E2.e;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.Base64;
import android.util.Xml;
import com.adjust.sdk.Constants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import t2.C5949g;

/* renamed from: w2.e  reason: case insensitive filesystem */
public class C6211e {

    /* renamed from: w2.e$a */
    static class a {
        static int a(TypedArray typedArray, int i10) {
            return typedArray.getType(i10);
        }
    }

    /* renamed from: w2.e$b */
    public interface b {
    }

    /* renamed from: w2.e$c */
    public static final class c implements b {

        /* renamed from: a  reason: collision with root package name */
        private final d[] f31350a;

        public c(d[] dVarArr) {
            this.f31350a = dVarArr;
        }

        public d[] a() {
            return this.f31350a;
        }
    }

    /* renamed from: w2.e$d */
    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        private final String f31351a;

        /* renamed from: b  reason: collision with root package name */
        private final int f31352b;

        /* renamed from: c  reason: collision with root package name */
        private final boolean f31353c;

        /* renamed from: d  reason: collision with root package name */
        private final String f31354d;

        /* renamed from: e  reason: collision with root package name */
        private final int f31355e;

        /* renamed from: f  reason: collision with root package name */
        private final int f31356f;

        public d(String str, int i10, boolean z10, String str2, int i11, int i12) {
            this.f31351a = str;
            this.f31352b = i10;
            this.f31353c = z10;
            this.f31354d = str2;
            this.f31355e = i11;
            this.f31356f = i12;
        }

        public String a() {
            return this.f31351a;
        }

        public int b() {
            return this.f31356f;
        }

        public int c() {
            return this.f31355e;
        }

        public String d() {
            return this.f31354d;
        }

        public int e() {
            return this.f31352b;
        }

        public boolean f() {
            return this.f31353c;
        }
    }

    /* renamed from: w2.e$e  reason: collision with other inner class name */
    public static final class C0484e implements b {

        /* renamed from: a  reason: collision with root package name */
        private final e f31357a;

        /* renamed from: b  reason: collision with root package name */
        private final e f31358b;

        /* renamed from: c  reason: collision with root package name */
        private final int f31359c;

        /* renamed from: d  reason: collision with root package name */
        private final int f31360d;

        /* renamed from: e  reason: collision with root package name */
        private final String f31361e;

        public C0484e(e eVar, e eVar2, int i10, int i11, String str) {
            this.f31357a = eVar;
            this.f31358b = eVar2;
            this.f31360d = i10;
            this.f31359c = i11;
            this.f31361e = str;
        }

        public e a() {
            return this.f31358b;
        }

        public int b() {
            return this.f31360d;
        }

        public e c() {
            return this.f31357a;
        }

        public String d() {
            return this.f31361e;
        }

        public int e() {
            return this.f31359c;
        }
    }

    private static int a(TypedArray typedArray, int i10) {
        return a.a(typedArray, i10);
    }

    /*  JADX ERROR: StackOverflow in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    public static w2.C6211e.b b(org.xmlpull.v1.XmlPullParser r3, android.content.res.Resources r4) {
        /*
        L_0x0000:
            int r0 = r3.next()
            r1 = 2
            if (r0 == r1) goto L_0x000b
            r2 = 1
            if (r0 == r2) goto L_0x000b
            goto L_0x0000
        L_0x000b:
            if (r0 != r1) goto L_0x0012
            w2.e$b r3 = d(r3, r4)
            return r3
        L_0x0012:
            org.xmlpull.v1.XmlPullParserException r3 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r4 = "No start tag found"
            r3.<init>(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: w2.C6211e.b(org.xmlpull.v1.XmlPullParser, android.content.res.Resources):w2.e$b");
    }

    public static List<List<byte[]>> c(Resources resources, int i10) {
        if (i10 == 0) {
            return Collections.emptyList();
        }
        TypedArray obtainTypedArray = resources.obtainTypedArray(i10);
        try {
            if (obtainTypedArray.length() == 0) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            if (a(obtainTypedArray, 0) == 1) {
                for (int i11 = 0; i11 < obtainTypedArray.length(); i11++) {
                    int resourceId = obtainTypedArray.getResourceId(i11, 0);
                    if (resourceId != 0) {
                        arrayList.add(h(resources.getStringArray(resourceId)));
                    }
                }
            } else {
                arrayList.add(h(resources.getStringArray(i10)));
            }
            obtainTypedArray.recycle();
            return arrayList;
        } finally {
            obtainTypedArray.recycle();
        }
    }

    private static b d(XmlPullParser xmlPullParser, Resources resources) {
        xmlPullParser.require(2, (String) null, "font-family");
        if (xmlPullParser.getName().equals("font-family")) {
            return e(xmlPullParser, resources);
        }
        g(xmlPullParser);
        return null;
    }

    private static b e(XmlPullParser xmlPullParser, Resources resources) {
        Resources resources2 = resources;
        TypedArray obtainAttributes = resources2.obtainAttributes(Xml.asAttributeSet(xmlPullParser), C5949g.f29415h);
        String string = obtainAttributes.getString(C5949g.f29416i);
        String string2 = obtainAttributes.getString(C5949g.f29421n);
        String string3 = obtainAttributes.getString(C5949g.f29422o);
        String string4 = obtainAttributes.getString(C5949g.f29418k);
        int resourceId = obtainAttributes.getResourceId(C5949g.f29417j, 0);
        int integer = obtainAttributes.getInteger(C5949g.f29419l, 1);
        int integer2 = obtainAttributes.getInteger(C5949g.f29420m, 500);
        String string5 = obtainAttributes.getString(C5949g.f29423p);
        obtainAttributes.recycle();
        e eVar = null;
        if (string == null || string2 == null || string3 == null) {
            ArrayList arrayList = new ArrayList();
            while (xmlPullParser.next() != 3) {
                if (xmlPullParser.getEventType() == 2) {
                    if (xmlPullParser.getName().equals("font")) {
                        arrayList.add(f(xmlPullParser, resources));
                    } else {
                        g(xmlPullParser);
                    }
                }
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            return new c((d[]) arrayList.toArray(new d[0]));
        }
        while (xmlPullParser.next() != 3) {
            g(xmlPullParser);
        }
        List<List<byte[]>> c10 = c(resources2, resourceId);
        if (string4 != null) {
            eVar = new e(string, string2, string4, c10);
        }
        return new C0484e(new e(string, string2, string3, c10), eVar, integer, integer2, string5);
    }

    private static d f(XmlPullParser xmlPullParser, Resources resources) {
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), C5949g.f29424q);
        int i10 = obtainAttributes.getInt(obtainAttributes.hasValue(C5949g.f29433z) ? C5949g.f29433z : C5949g.f29426s, Constants.MINIMAL_ERROR_STATUS_CODE);
        boolean z10 = 1 == obtainAttributes.getInt(obtainAttributes.hasValue(C5949g.f29431x) ? C5949g.f29431x : C5949g.f29427t, 0);
        int i11 = obtainAttributes.hasValue(C5949g.f29391A) ? C5949g.f29391A : C5949g.f29428u;
        String string = obtainAttributes.getString(obtainAttributes.hasValue(C5949g.f29432y) ? C5949g.f29432y : C5949g.f29429v);
        int i12 = obtainAttributes.getInt(i11, 0);
        int i13 = obtainAttributes.hasValue(C5949g.f29430w) ? C5949g.f29430w : C5949g.f29425r;
        int resourceId = obtainAttributes.getResourceId(i13, 0);
        String string2 = obtainAttributes.getString(i13);
        obtainAttributes.recycle();
        while (xmlPullParser.next() != 3) {
            g(xmlPullParser);
        }
        return new d(string2, i10, z10, string, i12, resourceId);
    }

    private static void g(XmlPullParser xmlPullParser) {
        int i10 = 1;
        while (i10 > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i10++;
            } else if (next == 3) {
                i10--;
            }
        }
    }

    private static List<byte[]> h(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String decode : strArr) {
            arrayList.add(Base64.decode(decode, 0));
        }
        return arrayList;
    }
}
