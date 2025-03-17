package q4;

import android.text.Layout;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import jb.C9892c;
import k4.C8421e;
import k4.C8425i;
import k4.C8427k;
import k4.C8429m;
import k4.s;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import t3.C5950a;
import t3.C5957h;
import t3.N;
import t3.O;
import t3.q;

/* renamed from: q4.d  reason: case insensitive filesystem */
public final class C8668d implements s {

    /* renamed from: b  reason: collision with root package name */
    private static final Pattern f55467b = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");

    /* renamed from: c  reason: collision with root package name */
    private static final Pattern f55468c = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");

    /* renamed from: d  reason: collision with root package name */
    private static final Pattern f55469d = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");

    /* renamed from: e  reason: collision with root package name */
    static final Pattern f55470e = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");

    /* renamed from: f  reason: collision with root package name */
    static final Pattern f55471f = Pattern.compile("^([-+]?\\d+\\.?\\d*?)% ([-+]?\\d+\\.?\\d*?)%$");

    /* renamed from: g  reason: collision with root package name */
    private static final Pattern f55472g = Pattern.compile("^([-+]?\\d+\\.?\\d*?)px ([-+]?\\d+\\.?\\d*?)px$");

    /* renamed from: h  reason: collision with root package name */
    private static final Pattern f55473h = Pattern.compile("^(\\d+) (\\d+)$");

    /* renamed from: i  reason: collision with root package name */
    private static final a f55474i = new a(30.0f, 1, 1);

    /* renamed from: a  reason: collision with root package name */
    private final XmlPullParserFactory f55475a;

    /* renamed from: q4.d$a */
    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        final float f55476a;

        /* renamed from: b  reason: collision with root package name */
        final int f55477b;

        /* renamed from: c  reason: collision with root package name */
        final int f55478c;

        a(float f10, int i10, int i11) {
            this.f55476a = f10;
            this.f55477b = i10;
            this.f55478c = i11;
        }
    }

    /* renamed from: q4.d$b */
    private static final class b {

        /* renamed from: a  reason: collision with root package name */
        final int f55479a;

        /* renamed from: b  reason: collision with root package name */
        final int f55480b;

        b(int i10, int i11) {
            this.f55479a = i10;
            this.f55480b = i11;
        }
    }

    public C8668d() {
        try {
            XmlPullParserFactory newInstance = XmlPullParserFactory.newInstance();
            this.f55475a = newInstance;
            newInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e10) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e10);
        }
    }

    private static C8671g e(C8671g gVar) {
        return gVar == null ? new C8671g() : gVar;
    }

    private static boolean f(String str) {
        return str.equals("tt") || str.equals("head") || str.equals("body") || str.equals("div") || str.equals("p") || str.equals("span") || str.equals("br") || str.equals("style") || str.equals("styling") || str.equals("layout") || str.equals("region") || str.equals("metadata") || str.equals("image") || str.equals("data") || str.equals("information");
    }

    private static Layout.Alignment g(String str) {
        String e10 = C9892c.e(str);
        e10.hashCode();
        char c10 = 65535;
        switch (e10.hashCode()) {
            case -1364013995:
                if (e10.equals("center")) {
                    c10 = 0;
                    break;
                }
                break;
            case 100571:
                if (e10.equals("end")) {
                    c10 = 1;
                    break;
                }
                break;
            case 3317767:
                if (e10.equals("left")) {
                    c10 = 2;
                    break;
                }
                break;
            case 108511772:
                if (e10.equals("right")) {
                    c10 = 3;
                    break;
                }
                break;
            case 109757538:
                if (e10.equals("start")) {
                    c10 = 4;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                return Layout.Alignment.ALIGN_CENTER;
            case 1:
            case 3:
                return Layout.Alignment.ALIGN_OPPOSITE;
            case 2:
            case 4:
                return Layout.Alignment.ALIGN_NORMAL;
            default:
                return null;
        }
    }

    private static int h(XmlPullParser xmlPullParser, int i10) {
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "cellResolution");
        if (attributeValue == null) {
            return i10;
        }
        Matcher matcher = f55473h.matcher(attributeValue);
        if (!matcher.matches()) {
            q.h("TtmlParser", "Ignoring malformed cell resolution: " + attributeValue);
            return i10;
        }
        boolean z10 = true;
        try {
            int parseInt = Integer.parseInt((String) C5950a.e(matcher.group(1)));
            int parseInt2 = Integer.parseInt((String) C5950a.e(matcher.group(2)));
            if (parseInt == 0 || parseInt2 == 0) {
                z10 = false;
            }
            C5950a.b(z10, "Invalid cell resolution " + parseInt + " " + parseInt2);
            return parseInt2;
        } catch (NumberFormatException unused) {
            q.h("TtmlParser", "Ignoring malformed cell resolution: " + attributeValue);
            return i10;
        }
    }

    private static void i(String str, C8671g gVar) {
        Matcher matcher;
        String[] h12 = N.h1(str, "\\s+");
        if (h12.length == 1) {
            matcher = f55469d.matcher(str);
        } else if (h12.length == 2) {
            matcher = f55469d.matcher(h12[1]);
            q.h("TtmlParser", "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
        } else {
            throw new C8429m("Invalid number of entries for fontSize: " + h12.length + ".");
        }
        if (matcher.matches()) {
            String str2 = (String) C5950a.e(matcher.group(3));
            str2.hashCode();
            char c10 = 65535;
            switch (str2.hashCode()) {
                case 37:
                    if (str2.equals("%")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case 3240:
                    if (str2.equals("em")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 3592:
                    if (str2.equals("px")) {
                        c10 = 2;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    gVar.z(3);
                    break;
                case 1:
                    gVar.z(2);
                    break;
                case 2:
                    gVar.z(1);
                    break;
                default:
                    throw new C8429m("Invalid unit for fontSize: '" + str2 + "'.");
            }
            gVar.y(Float.parseFloat((String) C5950a.e(matcher.group(1))));
            return;
        }
        throw new C8429m("Invalid expression for fontSize: '" + str + "'.");
    }

    private static a j(XmlPullParser xmlPullParser) {
        float f10;
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRate");
        int parseInt = attributeValue != null ? Integer.parseInt(attributeValue) : 30;
        String attributeValue2 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRateMultiplier");
        if (attributeValue2 != null) {
            String[] h12 = N.h1(attributeValue2, " ");
            C5950a.b(h12.length == 2, "frameRateMultiplier doesn't have 2 parts");
            f10 = ((float) Integer.parseInt(h12[0])) / ((float) Integer.parseInt(h12[1]));
        } else {
            f10 = 1.0f;
        }
        a aVar = f55474i;
        int i10 = aVar.f55477b;
        String attributeValue3 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "subFrameRate");
        if (attributeValue3 != null) {
            i10 = Integer.parseInt(attributeValue3);
        }
        int i11 = aVar.f55478c;
        String attributeValue4 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "tickRate");
        if (attributeValue4 != null) {
            i11 = Integer.parseInt(attributeValue4);
        }
        return new a(((float) parseInt) * f10, i10, i11);
    }

    private static Map<String, C8671g> k(XmlPullParser xmlPullParser, Map<String, C8671g> map, int i10, b bVar, Map<String, C8669e> map2, Map<String, String> map3) {
        do {
            xmlPullParser.next();
            if (O.e(xmlPullParser, "style")) {
                String a10 = O.a(xmlPullParser, "style");
                C8671g p10 = p(xmlPullParser, new C8671g());
                if (a10 != null) {
                    for (String str : q(a10)) {
                        p10.a(map.get(str));
                    }
                }
                String g10 = p10.g();
                if (g10 != null) {
                    map.put(g10, p10);
                }
            } else if (O.e(xmlPullParser, "region")) {
                C8669e n10 = n(xmlPullParser, i10, bVar);
                if (n10 != null) {
                    map2.put(n10.f55481a, n10);
                }
            } else if (O.e(xmlPullParser, "metadata")) {
                l(xmlPullParser, map3);
            }
        } while (!O.c(xmlPullParser, "head"));
        return map;
    }

    private static void l(XmlPullParser xmlPullParser, Map<String, String> map) {
        String a10;
        do {
            xmlPullParser.next();
            if (O.e(xmlPullParser, "image") && (a10 = O.a(xmlPullParser, "id")) != null) {
                map.put(a10, xmlPullParser.nextText());
            }
        } while (!O.c(xmlPullParser, "metadata"));
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static q4.C8667c m(org.xmlpull.v1.XmlPullParser r20, q4.C8667c r21, java.util.Map<java.lang.String, q4.C8669e> r22, q4.C8668d.a r23) {
        /*
            r0 = r20
            r9 = r21
            r1 = r23
            r2 = 1
            int r3 = r20.getAttributeCount()
            r4 = 0
            q4.g r5 = p(r0, r4)
            java.lang.String r8 = ""
            r12 = r4
            r11 = r8
            r13 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r15 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r17 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r8 = r12
            r4 = 0
        L_0x0025:
            if (r4 >= r3) goto L_0x00b5
            java.lang.String r10 = r0.getAttributeName(r4)
            java.lang.String r6 = r0.getAttributeValue(r4)
            r10.hashCode()
            int r19 = r10.hashCode()
            switch(r19) {
                case -934795532: goto L_0x0072;
                case 99841: goto L_0x0067;
                case 100571: goto L_0x005c;
                case 93616297: goto L_0x0051;
                case 109780401: goto L_0x0046;
                case 1292595405: goto L_0x003b;
                default: goto L_0x0039;
            }
        L_0x0039:
            r7 = -1
            goto L_0x007c
        L_0x003b:
            java.lang.String r7 = "backgroundImage"
            boolean r7 = r10.equals(r7)
            if (r7 != 0) goto L_0x0044
            goto L_0x0039
        L_0x0044:
            r7 = 5
            goto L_0x007c
        L_0x0046:
            java.lang.String r7 = "style"
            boolean r7 = r10.equals(r7)
            if (r7 != 0) goto L_0x004f
            goto L_0x0039
        L_0x004f:
            r7 = 4
            goto L_0x007c
        L_0x0051:
            java.lang.String r7 = "begin"
            boolean r7 = r10.equals(r7)
            if (r7 != 0) goto L_0x005a
            goto L_0x0039
        L_0x005a:
            r7 = 3
            goto L_0x007c
        L_0x005c:
            java.lang.String r7 = "end"
            boolean r7 = r10.equals(r7)
            if (r7 != 0) goto L_0x0065
            goto L_0x0039
        L_0x0065:
            r7 = 2
            goto L_0x007c
        L_0x0067:
            java.lang.String r7 = "dur"
            boolean r7 = r10.equals(r7)
            if (r7 != 0) goto L_0x0070
            goto L_0x0039
        L_0x0070:
            r7 = r2
            goto L_0x007c
        L_0x0072:
            java.lang.String r7 = "region"
            boolean r7 = r10.equals(r7)
            if (r7 != 0) goto L_0x007b
            goto L_0x0039
        L_0x007b:
            r7 = 0
        L_0x007c:
            switch(r7) {
                case 0: goto L_0x00a9;
                case 1: goto L_0x00a4;
                case 2: goto L_0x009f;
                case 3: goto L_0x009a;
                case 4: goto L_0x008f;
                case 5: goto L_0x0080;
                default: goto L_0x007f;
            }
        L_0x007f:
            goto L_0x008c
        L_0x0080:
            java.lang.String r7 = "#"
            boolean r7 = r6.startsWith(r7)
            if (r7 == 0) goto L_0x008c
            java.lang.String r12 = r6.substring(r2)
        L_0x008c:
            r7 = r22
            goto L_0x00b2
        L_0x008f:
            java.lang.String[] r6 = q(r6)
            int r7 = r6.length
            if (r7 <= 0) goto L_0x008c
            r7 = r22
            r8 = r6
            goto L_0x00b2
        L_0x009a:
            long r13 = r(r6, r1)
            goto L_0x008c
        L_0x009f:
            long r15 = r(r6, r1)
            goto L_0x008c
        L_0x00a4:
            long r17 = r(r6, r1)
            goto L_0x008c
        L_0x00a9:
            r7 = r22
            boolean r10 = r7.containsKey(r6)
            if (r10 == 0) goto L_0x00b2
            r11 = r6
        L_0x00b2:
            int r4 = r4 + r2
            goto L_0x0025
        L_0x00b5:
            if (r9 == 0) goto L_0x00ce
            long r1 = r9.f55457d
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r6 == 0) goto L_0x00cc
            int r6 = (r13 > r3 ? 1 : (r13 == r3 ? 0 : -1))
            if (r6 == 0) goto L_0x00c7
            long r13 = r13 + r1
        L_0x00c7:
            int r6 = (r15 > r3 ? 1 : (r15 == r3 ? 0 : -1))
            if (r6 == 0) goto L_0x00cc
            long r15 = r15 + r1
        L_0x00cc:
            r1 = r13
            goto L_0x00d4
        L_0x00ce:
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L_0x00cc
        L_0x00d4:
            int r6 = (r15 > r3 ? 1 : (r15 == r3 ? 0 : -1))
            if (r6 != 0) goto L_0x00eb
            int r6 = (r17 > r3 ? 1 : (r17 == r3 ? 0 : -1))
            if (r6 == 0) goto L_0x00e1
            long r17 = r1 + r17
            r3 = r17
            goto L_0x00ec
        L_0x00e1:
            if (r9 == 0) goto L_0x00eb
            long r6 = r9.f55458e
            int r3 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r3 == 0) goto L_0x00eb
            r3 = r6
            goto L_0x00ec
        L_0x00eb:
            r3 = r15
        L_0x00ec:
            java.lang.String r0 = r20.getName()
            r6 = r8
            r7 = r11
            r8 = r12
            r9 = r21
            q4.c r0 = q4.C8667c.c(r0, r1, r3, r5, r6, r7, r8, r9)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: q4.C8668d.m(org.xmlpull.v1.XmlPullParser, q4.c, java.util.Map, q4.d$a):q4.c");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x01a6, code lost:
        if (r0.equals("tb") == false) goto L_0x0188;
     */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0179  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static q4.C8669e n(org.xmlpull.v1.XmlPullParser r18, int r19, q4.C8668d.b r20) {
        /*
            r0 = r18
            r1 = r20
            r2 = 0
            r3 = 1
            r4 = 2
            java.lang.String r5 = "id"
            java.lang.String r7 = t3.O.a(r0, r5)
            r5 = 0
            if (r7 != 0) goto L_0x0011
            return r5
        L_0x0011:
            java.lang.String r6 = "origin"
            java.lang.String r6 = t3.O.a(r0, r6)
            java.lang.String r8 = "TtmlParser"
            if (r6 == 0) goto L_0x0218
            java.util.regex.Pattern r9 = f55471f
            java.util.regex.Matcher r10 = r9.matcher(r6)
            java.util.regex.Pattern r11 = f55472g
            java.util.regex.Matcher r12 = r11.matcher(r6)
            boolean r13 = r10.matches()
            java.lang.String r14 = "Ignoring region with missing tts:extent: "
            java.lang.String r15 = "Ignoring region with malformed origin: "
            r16 = 1120403456(0x42c80000, float:100.0)
            if (r13 == 0) goto L_0x006c
            java.lang.String r12 = r10.group(r3)     // Catch:{ NumberFormatException -> 0x0059 }
            java.lang.Object r12 = t3.C5950a.e(r12)     // Catch:{ NumberFormatException -> 0x0059 }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ NumberFormatException -> 0x0059 }
            float r12 = java.lang.Float.parseFloat(r12)     // Catch:{ NumberFormatException -> 0x0059 }
            float r12 = r12 / r16
            java.lang.String r10 = r10.group(r4)     // Catch:{ NumberFormatException -> 0x0059 }
            java.lang.Object r10 = t3.C5950a.e(r10)     // Catch:{ NumberFormatException -> 0x0059 }
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ NumberFormatException -> 0x0059 }
            float r10 = java.lang.Float.parseFloat(r10)     // Catch:{ NumberFormatException -> 0x0059 }
            float r10 = r10 / r16
            r17 = r12
            r12 = r10
            r10 = r17
            goto L_0x00ad
        L_0x0059:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r15)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            t3.q.h(r8, r0)
            return r5
        L_0x006c:
            boolean r10 = r12.matches()
            if (r10 == 0) goto L_0x0203
            if (r1 != 0) goto L_0x0087
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r14)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            t3.q.h(r8, r0)
            return r5
        L_0x0087:
            java.lang.String r10 = r12.group(r3)     // Catch:{ NumberFormatException -> 0x01f0 }
            java.lang.Object r10 = t3.C5950a.e(r10)     // Catch:{ NumberFormatException -> 0x01f0 }
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ NumberFormatException -> 0x01f0 }
            int r10 = java.lang.Integer.parseInt(r10)     // Catch:{ NumberFormatException -> 0x01f0 }
            java.lang.String r12 = r12.group(r4)     // Catch:{ NumberFormatException -> 0x01f0 }
            java.lang.Object r12 = t3.C5950a.e(r12)     // Catch:{ NumberFormatException -> 0x01f0 }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ NumberFormatException -> 0x01f0 }
            int r12 = java.lang.Integer.parseInt(r12)     // Catch:{ NumberFormatException -> 0x01f0 }
            float r10 = (float) r10     // Catch:{ NumberFormatException -> 0x01f0 }
            int r13 = r1.f55479a     // Catch:{ NumberFormatException -> 0x01f0 }
            float r13 = (float) r13     // Catch:{ NumberFormatException -> 0x01f0 }
            float r10 = r10 / r13
            float r12 = (float) r12     // Catch:{ NumberFormatException -> 0x01f0 }
            int r13 = r1.f55480b     // Catch:{ NumberFormatException -> 0x01f0 }
            float r13 = (float) r13
            float r12 = r12 / r13
        L_0x00ad:
            java.lang.String r13 = "extent"
            java.lang.String r13 = t3.O.a(r0, r13)
            if (r13 == 0) goto L_0x01ea
            java.util.regex.Matcher r9 = r9.matcher(r13)
            java.util.regex.Matcher r11 = r11.matcher(r13)
            boolean r13 = r9.matches()
            java.lang.String r15 = "Ignoring region with malformed extent: "
            if (r13 == 0) goto L_0x00fa
            java.lang.String r1 = r9.group(r3)     // Catch:{ NumberFormatException -> 0x00e7 }
            java.lang.Object r1 = t3.C5950a.e(r1)     // Catch:{ NumberFormatException -> 0x00e7 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ NumberFormatException -> 0x00e7 }
            float r1 = java.lang.Float.parseFloat(r1)     // Catch:{ NumberFormatException -> 0x00e7 }
            float r1 = r1 / r16
            java.lang.String r9 = r9.group(r4)     // Catch:{ NumberFormatException -> 0x00e7 }
            java.lang.Object r9 = t3.C5950a.e(r9)     // Catch:{ NumberFormatException -> 0x00e7 }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ NumberFormatException -> 0x00e7 }
            float r5 = java.lang.Float.parseFloat(r9)     // Catch:{ NumberFormatException -> 0x00e7 }
            float r5 = r5 / r16
            r13 = r5
            goto L_0x013d
        L_0x00e7:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r15)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            t3.q.h(r8, r0)
            return r5
        L_0x00fa:
            boolean r9 = r11.matches()
            if (r9 == 0) goto L_0x01d5
            if (r1 != 0) goto L_0x0115
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r14)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            t3.q.h(r8, r0)
            return r5
        L_0x0115:
            java.lang.String r9 = r11.group(r3)     // Catch:{ NumberFormatException -> 0x01c2 }
            java.lang.Object r9 = t3.C5950a.e(r9)     // Catch:{ NumberFormatException -> 0x01c2 }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ NumberFormatException -> 0x01c2 }
            int r9 = java.lang.Integer.parseInt(r9)     // Catch:{ NumberFormatException -> 0x01c2 }
            java.lang.String r11 = r11.group(r4)     // Catch:{ NumberFormatException -> 0x01c2 }
            java.lang.Object r11 = t3.C5950a.e(r11)     // Catch:{ NumberFormatException -> 0x01c2 }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ NumberFormatException -> 0x01c2 }
            int r11 = java.lang.Integer.parseInt(r11)     // Catch:{ NumberFormatException -> 0x01c2 }
            float r9 = (float) r9     // Catch:{ NumberFormatException -> 0x01c2 }
            int r13 = r1.f55479a     // Catch:{ NumberFormatException -> 0x01c2 }
            float r13 = (float) r13     // Catch:{ NumberFormatException -> 0x01c2 }
            float r9 = r9 / r13
            float r11 = (float) r11     // Catch:{ NumberFormatException -> 0x01c2 }
            int r1 = r1.f55480b     // Catch:{ NumberFormatException -> 0x01c2 }
            float r1 = (float) r1
            float r11 = r11 / r1
            r1 = r9
            r13 = r11
        L_0x013d:
            java.lang.String r5 = "displayAlign"
            java.lang.String r5 = t3.O.a(r0, r5)
            if (r5 == 0) goto L_0x0168
            java.lang.String r5 = jb.C9892c.e(r5)
            r5.hashCode()
            java.lang.String r6 = "center"
            boolean r6 = r5.equals(r6)
            if (r6 != 0) goto L_0x0161
            java.lang.String r6 = "after"
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L_0x015d
            goto L_0x0168
        L_0x015d:
            float r12 = r12 + r13
            r11 = r4
        L_0x015f:
            r9 = r12
            goto L_0x016a
        L_0x0161:
            r5 = 1073741824(0x40000000, float:2.0)
            float r5 = r13 / r5
            float r12 = r12 + r5
            r11 = r3
            goto L_0x015f
        L_0x0168:
            r11 = r2
            goto L_0x015f
        L_0x016a:
            r5 = 1065353216(0x3f800000, float:1.0)
            r6 = r19
            float r6 = (float) r6
            float r15 = r5 / r6
            java.lang.String r5 = "writingMode"
            java.lang.String r0 = t3.O.a(r0, r5)
            if (r0 == 0) goto L_0x01b3
            java.lang.String r0 = jb.C9892c.e(r0)
            r0.hashCode()
            r5 = -1
            int r6 = r0.hashCode()
            switch(r6) {
                case 3694: goto L_0x01a0;
                case 3553396: goto L_0x0195;
                case 3553576: goto L_0x018a;
                default: goto L_0x0188;
            }
        L_0x0188:
            r2 = r5
            goto L_0x01a9
        L_0x018a:
            java.lang.String r2 = "tbrl"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x0193
            goto L_0x0188
        L_0x0193:
            r2 = r4
            goto L_0x01a9
        L_0x0195:
            java.lang.String r2 = "tblr"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x019e
            goto L_0x0188
        L_0x019e:
            r2 = r3
            goto L_0x01a9
        L_0x01a0:
            java.lang.String r6 = "tb"
            boolean r0 = r0.equals(r6)
            if (r0 != 0) goto L_0x01a9
            goto L_0x0188
        L_0x01a9:
            switch(r2) {
                case 0: goto L_0x01b0;
                case 1: goto L_0x01b0;
                case 2: goto L_0x01ad;
                default: goto L_0x01ac;
            }
        L_0x01ac:
            goto L_0x01b3
        L_0x01ad:
            r16 = r3
            goto L_0x01b6
        L_0x01b0:
            r16 = r4
            goto L_0x01b6
        L_0x01b3:
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L_0x01ad
        L_0x01b6:
            q4.e r0 = new q4.e
            r2 = 0
            r14 = 1
            r6 = r0
            r8 = r10
            r10 = r2
            r12 = r1
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            return r0
        L_0x01c2:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r15)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            t3.q.h(r8, r0)
            return r5
        L_0x01d5:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Ignoring region with unsupported extent: "
            r0.append(r1)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            t3.q.h(r8, r0)
            return r5
        L_0x01ea:
            java.lang.String r0 = "Ignoring region without an extent"
            t3.q.h(r8, r0)
            return r5
        L_0x01f0:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r15)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            t3.q.h(r8, r0)
            return r5
        L_0x0203:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Ignoring region with unsupported origin: "
            r0.append(r1)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            t3.q.h(r8, r0)
            return r5
        L_0x0218:
            java.lang.String r0 = "Ignoring region without an origin"
            t3.q.h(r8, r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: q4.C8668d.n(org.xmlpull.v1.XmlPullParser, int, q4.d$b):q4.e");
    }

    private static float o(String str) {
        Matcher matcher = f55470e.matcher(str);
        if (!matcher.matches()) {
            q.h("TtmlParser", "Invalid value for shear: " + str);
            return Float.MAX_VALUE;
        }
        try {
            return Math.min(100.0f, Math.max(-100.0f, Float.parseFloat((String) C5950a.e(matcher.group(1)))));
        } catch (NumberFormatException e10) {
            q.i("TtmlParser", "Failed to parse shear: " + str, e10);
            return Float.MAX_VALUE;
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static q4.C8671g p(org.xmlpull.v1.XmlPullParser r13, q4.C8671g r14) {
        /*
            r0 = 5
            r1 = 4
            r2 = -1
            r3 = 3
            r4 = 2
            r5 = 1
            int r6 = r13.getAttributeCount()
            r7 = 0
            r8 = r7
        L_0x000c:
            if (r8 >= r6) goto L_0x02f8
            java.lang.String r9 = r13.getAttributeValue(r8)
            java.lang.String r10 = r13.getAttributeName(r8)
            r10.hashCode()
            java.lang.String r11 = "TtmlParser"
            int r12 = r10.hashCode()
            switch(r12) {
                case -1550943582: goto L_0x00d1;
                case -1224696685: goto L_0x00c5;
                case -1065511464: goto L_0x00b9;
                case -879295043: goto L_0x00ad;
                case -734428249: goto L_0x00a1;
                case 3355: goto L_0x0096;
                case 3511770: goto L_0x008b;
                case 94842723: goto L_0x0080;
                case 109403361: goto L_0x0073;
                case 110138194: goto L_0x0066;
                case 365601008: goto L_0x0059;
                case 921125321: goto L_0x004c;
                case 1115953443: goto L_0x003f;
                case 1287124693: goto L_0x0032;
                case 1754920356: goto L_0x0025;
                default: goto L_0x0022;
            }
        L_0x0022:
            r10 = r2
            goto L_0x00dc
        L_0x0025:
            java.lang.String r12 = "multiRowAlign"
            boolean r10 = r10.equals(r12)
            if (r10 != 0) goto L_0x002e
            goto L_0x0022
        L_0x002e:
            r10 = 14
            goto L_0x00dc
        L_0x0032:
            java.lang.String r12 = "backgroundColor"
            boolean r10 = r10.equals(r12)
            if (r10 != 0) goto L_0x003b
            goto L_0x0022
        L_0x003b:
            r10 = 13
            goto L_0x00dc
        L_0x003f:
            java.lang.String r12 = "rubyPosition"
            boolean r10 = r10.equals(r12)
            if (r10 != 0) goto L_0x0048
            goto L_0x0022
        L_0x0048:
            r10 = 12
            goto L_0x00dc
        L_0x004c:
            java.lang.String r12 = "textEmphasis"
            boolean r10 = r10.equals(r12)
            if (r10 != 0) goto L_0x0055
            goto L_0x0022
        L_0x0055:
            r10 = 11
            goto L_0x00dc
        L_0x0059:
            java.lang.String r12 = "fontSize"
            boolean r10 = r10.equals(r12)
            if (r10 != 0) goto L_0x0062
            goto L_0x0022
        L_0x0062:
            r10 = 10
            goto L_0x00dc
        L_0x0066:
            java.lang.String r12 = "textCombine"
            boolean r10 = r10.equals(r12)
            if (r10 != 0) goto L_0x006f
            goto L_0x0022
        L_0x006f:
            r10 = 9
            goto L_0x00dc
        L_0x0073:
            java.lang.String r12 = "shear"
            boolean r10 = r10.equals(r12)
            if (r10 != 0) goto L_0x007c
            goto L_0x0022
        L_0x007c:
            r10 = 8
            goto L_0x00dc
        L_0x0080:
            java.lang.String r12 = "color"
            boolean r10 = r10.equals(r12)
            if (r10 != 0) goto L_0x0089
            goto L_0x0022
        L_0x0089:
            r10 = 7
            goto L_0x00dc
        L_0x008b:
            java.lang.String r12 = "ruby"
            boolean r10 = r10.equals(r12)
            if (r10 != 0) goto L_0x0094
            goto L_0x0022
        L_0x0094:
            r10 = 6
            goto L_0x00dc
        L_0x0096:
            java.lang.String r12 = "id"
            boolean r10 = r10.equals(r12)
            if (r10 != 0) goto L_0x009f
            goto L_0x0022
        L_0x009f:
            r10 = r0
            goto L_0x00dc
        L_0x00a1:
            java.lang.String r12 = "fontWeight"
            boolean r10 = r10.equals(r12)
            if (r10 != 0) goto L_0x00ab
            goto L_0x0022
        L_0x00ab:
            r10 = r1
            goto L_0x00dc
        L_0x00ad:
            java.lang.String r12 = "textDecoration"
            boolean r10 = r10.equals(r12)
            if (r10 != 0) goto L_0x00b7
            goto L_0x0022
        L_0x00b7:
            r10 = r3
            goto L_0x00dc
        L_0x00b9:
            java.lang.String r12 = "textAlign"
            boolean r10 = r10.equals(r12)
            if (r10 != 0) goto L_0x00c3
            goto L_0x0022
        L_0x00c3:
            r10 = r4
            goto L_0x00dc
        L_0x00c5:
            java.lang.String r12 = "fontFamily"
            boolean r10 = r10.equals(r12)
            if (r10 != 0) goto L_0x00cf
            goto L_0x0022
        L_0x00cf:
            r10 = r5
            goto L_0x00dc
        L_0x00d1:
            java.lang.String r12 = "fontStyle"
            boolean r10 = r10.equals(r12)
            if (r10 != 0) goto L_0x00db
            goto L_0x0022
        L_0x00db:
            r10 = r7
        L_0x00dc:
            switch(r10) {
                case 0: goto L_0x02e7;
                case 1: goto L_0x02de;
                case 2: goto L_0x02d1;
                case 3: goto L_0x026e;
                case 4: goto L_0x025e;
                case 5: goto L_0x0248;
                case 6: goto L_0x01ca;
                case 7: goto L_0x01a7;
                case 8: goto L_0x0199;
                case 9: goto L_0x016c;
                case 10: goto L_0x014d;
                case 11: goto L_0x013f;
                case 12: goto L_0x0112;
                case 13: goto L_0x00ef;
                case 14: goto L_0x00e1;
                default: goto L_0x00df;
            }
        L_0x00df:
            goto L_0x02f5
        L_0x00e1:
            q4.g r14 = e(r14)
            android.text.Layout$Alignment r9 = g(r9)
            q4.g r14 = r14.D(r9)
            goto L_0x02f5
        L_0x00ef:
            q4.g r14 = e(r14)
            int r10 = t3.C5955f.c(r9)     // Catch:{ IllegalArgumentException -> 0x00fc }
            r14.u(r10)     // Catch:{ IllegalArgumentException -> 0x00fc }
            goto L_0x02f5
        L_0x00fc:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r12 = "Failed parsing background value: "
            r10.append(r12)
            r10.append(r9)
            java.lang.String r9 = r10.toString()
            t3.q.h(r11, r9)
            goto L_0x02f5
        L_0x0112:
            java.lang.String r9 = jb.C9892c.e(r9)
            r9.hashCode()
            java.lang.String r10 = "before"
            boolean r10 = r9.equals(r10)
            if (r10 != 0) goto L_0x0135
            java.lang.String r10 = "after"
            boolean r9 = r9.equals(r10)
            if (r9 != 0) goto L_0x012b
            goto L_0x02f5
        L_0x012b:
            q4.g r14 = e(r14)
            q4.g r14 = r14.E(r4)
            goto L_0x02f5
        L_0x0135:
            q4.g r14 = e(r14)
            q4.g r14 = r14.E(r5)
            goto L_0x02f5
        L_0x013f:
            q4.g r14 = e(r14)
            q4.b r9 = q4.C8666b.a(r9)
            q4.g r14 = r14.J(r9)
            goto L_0x02f5
        L_0x014d:
            q4.g r14 = e(r14)     // Catch:{ m -> 0x0156 }
            i(r9, r14)     // Catch:{ m -> 0x0156 }
            goto L_0x02f5
        L_0x0156:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r12 = "Failed parsing fontSize value: "
            r10.append(r12)
            r10.append(r9)
            java.lang.String r9 = r10.toString()
            t3.q.h(r11, r9)
            goto L_0x02f5
        L_0x016c:
            java.lang.String r9 = jb.C9892c.e(r9)
            r9.hashCode()
            java.lang.String r10 = "all"
            boolean r10 = r9.equals(r10)
            if (r10 != 0) goto L_0x018f
            java.lang.String r10 = "none"
            boolean r9 = r9.equals(r10)
            if (r9 != 0) goto L_0x0185
            goto L_0x02f5
        L_0x0185:
            q4.g r14 = e(r14)
            q4.g r14 = r14.I(r7)
            goto L_0x02f5
        L_0x018f:
            q4.g r14 = e(r14)
            q4.g r14 = r14.I(r5)
            goto L_0x02f5
        L_0x0199:
            q4.g r14 = e(r14)
            float r9 = o(r9)
            q4.g r14 = r14.G(r9)
            goto L_0x02f5
        L_0x01a7:
            q4.g r14 = e(r14)
            int r10 = t3.C5955f.c(r9)     // Catch:{ IllegalArgumentException -> 0x01b4 }
            r14.w(r10)     // Catch:{ IllegalArgumentException -> 0x01b4 }
            goto L_0x02f5
        L_0x01b4:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r12 = "Failed parsing color value: "
            r10.append(r12)
            r10.append(r9)
            java.lang.String r9 = r10.toString()
            t3.q.h(r11, r9)
            goto L_0x02f5
        L_0x01ca:
            java.lang.String r9 = jb.C9892c.e(r9)
            r9.hashCode()
            int r10 = r9.hashCode()
            switch(r10) {
                case -618561360: goto L_0x0211;
                case -410956671: goto L_0x0206;
                case -250518009: goto L_0x01fb;
                case -136074796: goto L_0x01f0;
                case 3016401: goto L_0x01e5;
                case 3556653: goto L_0x01da;
                default: goto L_0x01d8;
            }
        L_0x01d8:
            r9 = r2
            goto L_0x021b
        L_0x01da:
            java.lang.String r10 = "text"
            boolean r9 = r9.equals(r10)
            if (r9 != 0) goto L_0x01e3
            goto L_0x01d8
        L_0x01e3:
            r9 = r0
            goto L_0x021b
        L_0x01e5:
            java.lang.String r10 = "base"
            boolean r9 = r9.equals(r10)
            if (r9 != 0) goto L_0x01ee
            goto L_0x01d8
        L_0x01ee:
            r9 = r1
            goto L_0x021b
        L_0x01f0:
            java.lang.String r10 = "textContainer"
            boolean r9 = r9.equals(r10)
            if (r9 != 0) goto L_0x01f9
            goto L_0x01d8
        L_0x01f9:
            r9 = r3
            goto L_0x021b
        L_0x01fb:
            java.lang.String r10 = "delimiter"
            boolean r9 = r9.equals(r10)
            if (r9 != 0) goto L_0x0204
            goto L_0x01d8
        L_0x0204:
            r9 = r4
            goto L_0x021b
        L_0x0206:
            java.lang.String r10 = "container"
            boolean r9 = r9.equals(r10)
            if (r9 != 0) goto L_0x020f
            goto L_0x01d8
        L_0x020f:
            r9 = r5
            goto L_0x021b
        L_0x0211:
            java.lang.String r10 = "baseContainer"
            boolean r9 = r9.equals(r10)
            if (r9 != 0) goto L_0x021a
            goto L_0x01d8
        L_0x021a:
            r9 = r7
        L_0x021b:
            switch(r9) {
                case 0: goto L_0x023e;
                case 1: goto L_0x0234;
                case 2: goto L_0x022a;
                case 3: goto L_0x0220;
                case 4: goto L_0x023e;
                case 5: goto L_0x0220;
                default: goto L_0x021e;
            }
        L_0x021e:
            goto L_0x02f5
        L_0x0220:
            q4.g r14 = e(r14)
            q4.g r14 = r14.F(r3)
            goto L_0x02f5
        L_0x022a:
            q4.g r14 = e(r14)
            q4.g r14 = r14.F(r1)
            goto L_0x02f5
        L_0x0234:
            q4.g r14 = e(r14)
            q4.g r14 = r14.F(r5)
            goto L_0x02f5
        L_0x023e:
            q4.g r14 = e(r14)
            q4.g r14 = r14.F(r4)
            goto L_0x02f5
        L_0x0248:
            java.lang.String r10 = "style"
            java.lang.String r11 = r13.getName()
            boolean r10 = r10.equals(r11)
            if (r10 == 0) goto L_0x02f5
            q4.g r14 = e(r14)
            q4.g r14 = r14.A(r9)
            goto L_0x02f5
        L_0x025e:
            q4.g r14 = e(r14)
            java.lang.String r10 = "bold"
            boolean r9 = r10.equalsIgnoreCase(r9)
            q4.g r14 = r14.v(r9)
            goto L_0x02f5
        L_0x026e:
            java.lang.String r9 = jb.C9892c.e(r9)
            r9.hashCode()
            int r10 = r9.hashCode()
            switch(r10) {
                case -1461280213: goto L_0x029f;
                case -1026963764: goto L_0x0294;
                case 913457136: goto L_0x0289;
                case 1679736913: goto L_0x027e;
                default: goto L_0x027c;
            }
        L_0x027c:
            r9 = r2
            goto L_0x02a9
        L_0x027e:
            java.lang.String r10 = "linethrough"
            boolean r9 = r9.equals(r10)
            if (r9 != 0) goto L_0x0287
            goto L_0x027c
        L_0x0287:
            r9 = r3
            goto L_0x02a9
        L_0x0289:
            java.lang.String r10 = "nolinethrough"
            boolean r9 = r9.equals(r10)
            if (r9 != 0) goto L_0x0292
            goto L_0x027c
        L_0x0292:
            r9 = r4
            goto L_0x02a9
        L_0x0294:
            java.lang.String r10 = "underline"
            boolean r9 = r9.equals(r10)
            if (r9 != 0) goto L_0x029d
            goto L_0x027c
        L_0x029d:
            r9 = r5
            goto L_0x02a9
        L_0x029f:
            java.lang.String r10 = "nounderline"
            boolean r9 = r9.equals(r10)
            if (r9 != 0) goto L_0x02a8
            goto L_0x027c
        L_0x02a8:
            r9 = r7
        L_0x02a9:
            switch(r9) {
                case 0: goto L_0x02c8;
                case 1: goto L_0x02bf;
                case 2: goto L_0x02b6;
                case 3: goto L_0x02ad;
                default: goto L_0x02ac;
            }
        L_0x02ac:
            goto L_0x02f5
        L_0x02ad:
            q4.g r14 = e(r14)
            q4.g r14 = r14.C(r5)
            goto L_0x02f5
        L_0x02b6:
            q4.g r14 = e(r14)
            q4.g r14 = r14.C(r7)
            goto L_0x02f5
        L_0x02bf:
            q4.g r14 = e(r14)
            q4.g r14 = r14.K(r5)
            goto L_0x02f5
        L_0x02c8:
            q4.g r14 = e(r14)
            q4.g r14 = r14.K(r7)
            goto L_0x02f5
        L_0x02d1:
            q4.g r14 = e(r14)
            android.text.Layout$Alignment r9 = g(r9)
            q4.g r14 = r14.H(r9)
            goto L_0x02f5
        L_0x02de:
            q4.g r14 = e(r14)
            q4.g r14 = r14.x(r9)
            goto L_0x02f5
        L_0x02e7:
            q4.g r14 = e(r14)
            java.lang.String r10 = "italic"
            boolean r9 = r10.equalsIgnoreCase(r9)
            q4.g r14 = r14.B(r9)
        L_0x02f5:
            int r8 = r8 + r5
            goto L_0x000c
        L_0x02f8:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: q4.C8668d.p(org.xmlpull.v1.XmlPullParser, q4.g):q4.g");
    }

    private static String[] q(String str) {
        String trim = str.trim();
        return trim.isEmpty() ? new String[0] : N.h1(trim, "\\s+");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00bb, code lost:
        if (r13.equals("ms") == false) goto L_0x00b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00f2, code lost:
        r8 = r8 / r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00fa, code lost:
        r8 = r8 * r13;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static long r(java.lang.String r13, q4.C8668d.a r14) {
        /*
            r0 = 4
            r1 = 3
            java.util.regex.Pattern r2 = f55467b
            java.util.regex.Matcher r2 = r2.matcher(r13)
            boolean r3 = r2.matches()
            r4 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            r6 = 2
            r7 = 1
            if (r3 == 0) goto L_0x0084
            java.lang.String r13 = r2.group(r7)
            java.lang.Object r13 = t3.C5950a.e(r13)
            java.lang.String r13 = (java.lang.String) r13
            long r7 = java.lang.Long.parseLong(r13)
            r9 = 3600(0xe10, double:1.7786E-320)
            long r7 = r7 * r9
            double r7 = (double) r7
            java.lang.String r13 = r2.group(r6)
            java.lang.Object r13 = t3.C5950a.e(r13)
            java.lang.String r13 = (java.lang.String) r13
            long r9 = java.lang.Long.parseLong(r13)
            r11 = 60
            long r9 = r9 * r11
            double r9 = (double) r9
            double r7 = r7 + r9
            java.lang.String r13 = r2.group(r1)
            java.lang.Object r13 = t3.C5950a.e(r13)
            java.lang.String r13 = (java.lang.String) r13
            long r9 = java.lang.Long.parseLong(r13)
            double r9 = (double) r9
            double r7 = r7 + r9
            java.lang.String r13 = r2.group(r0)
            r0 = 0
            if (r13 == 0) goto L_0x0057
            double r9 = java.lang.Double.parseDouble(r13)
            goto L_0x0058
        L_0x0057:
            r9 = r0
        L_0x0058:
            double r7 = r7 + r9
            r13 = 5
            java.lang.String r13 = r2.group(r13)
            if (r13 == 0) goto L_0x006a
            long r9 = java.lang.Long.parseLong(r13)
            float r13 = (float) r9
            float r3 = r14.f55476a
            float r13 = r13 / r3
            double r9 = (double) r13
            goto L_0x006b
        L_0x006a:
            r9 = r0
        L_0x006b:
            double r7 = r7 + r9
            r13 = 6
            java.lang.String r13 = r2.group(r13)
            if (r13 == 0) goto L_0x0080
            long r0 = java.lang.Long.parseLong(r13)
            double r0 = (double) r0
            int r13 = r14.f55477b
            double r2 = (double) r13
            double r0 = r0 / r2
            float r13 = r14.f55476a
            double r13 = (double) r13
            double r0 = r0 / r13
        L_0x0080:
            double r7 = r7 + r0
            double r7 = r7 * r4
            long r13 = (long) r7
            return r13
        L_0x0084:
            java.util.regex.Pattern r2 = f55468c
            java.util.regex.Matcher r2 = r2.matcher(r13)
            boolean r3 = r2.matches()
            if (r3 == 0) goto L_0x0109
            java.lang.String r13 = r2.group(r7)
            java.lang.Object r13 = t3.C5950a.e(r13)
            java.lang.String r13 = (java.lang.String) r13
            double r8 = java.lang.Double.parseDouble(r13)
            java.lang.String r13 = r2.group(r6)
            java.lang.Object r13 = t3.C5950a.e(r13)
            java.lang.String r13 = (java.lang.String) r13
            r13.hashCode()
            r2 = -1
            int r3 = r13.hashCode()
            switch(r3) {
                case 102: goto L_0x00df;
                case 104: goto L_0x00d4;
                case 109: goto L_0x00c9;
                case 116: goto L_0x00be;
                case 3494: goto L_0x00b5;
                default: goto L_0x00b3;
            }
        L_0x00b3:
            r0 = r2
            goto L_0x00e9
        L_0x00b5:
            java.lang.String r1 = "ms"
            boolean r13 = r13.equals(r1)
            if (r13 != 0) goto L_0x00e9
            goto L_0x00b3
        L_0x00be:
            java.lang.String r0 = "t"
            boolean r13 = r13.equals(r0)
            if (r13 != 0) goto L_0x00c7
            goto L_0x00b3
        L_0x00c7:
            r0 = r1
            goto L_0x00e9
        L_0x00c9:
            java.lang.String r0 = "m"
            boolean r13 = r13.equals(r0)
            if (r13 != 0) goto L_0x00d2
            goto L_0x00b3
        L_0x00d2:
            r0 = r6
            goto L_0x00e9
        L_0x00d4:
            java.lang.String r0 = "h"
            boolean r13 = r13.equals(r0)
            if (r13 != 0) goto L_0x00dd
            goto L_0x00b3
        L_0x00dd:
            r0 = r7
            goto L_0x00e9
        L_0x00df:
            java.lang.String r0 = "f"
            boolean r13 = r13.equals(r0)
            if (r13 != 0) goto L_0x00e8
            goto L_0x00b3
        L_0x00e8:
            r0 = 0
        L_0x00e9:
            switch(r0) {
                case 0: goto L_0x0102;
                case 1: goto L_0x00fc;
                case 2: goto L_0x00f8;
                case 3: goto L_0x00f4;
                case 4: goto L_0x00ed;
                default: goto L_0x00ec;
            }
        L_0x00ec:
            goto L_0x0106
        L_0x00ed:
            r13 = 4652007308841189376(0x408f400000000000, double:1000.0)
        L_0x00f2:
            double r8 = r8 / r13
            goto L_0x0106
        L_0x00f4:
            int r13 = r14.f55478c
            double r13 = (double) r13
            goto L_0x00f2
        L_0x00f8:
            r13 = 4633641066610819072(0x404e000000000000, double:60.0)
        L_0x00fa:
            double r8 = r8 * r13
            goto L_0x0106
        L_0x00fc:
            r13 = 4660134898793709568(0x40ac200000000000, double:3600.0)
            goto L_0x00fa
        L_0x0102:
            float r13 = r14.f55476a
            double r13 = (double) r13
            goto L_0x00f2
        L_0x0106:
            double r8 = r8 * r4
            long r13 = (long) r8
            return r13
        L_0x0109:
            k4.m r14 = new k4.m
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Malformed time expression: "
            r0.append(r1)
            r0.append(r13)
            java.lang.String r13 = r0.toString()
            r14.<init>(r13)
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: q4.C8668d.r(java.lang.String, q4.d$a):long");
    }

    private static b s(XmlPullParser xmlPullParser) {
        String a10 = O.a(xmlPullParser, "extent");
        if (a10 == null) {
            return null;
        }
        Matcher matcher = f55472g.matcher(a10);
        if (!matcher.matches()) {
            q.h("TtmlParser", "Ignoring non-pixel tts extent: " + a10);
            return null;
        }
        try {
            return new b(Integer.parseInt((String) C5950a.e(matcher.group(1))), Integer.parseInt((String) C5950a.e(matcher.group(2))));
        } catch (NumberFormatException unused) {
            q.h("TtmlParser", "Ignoring malformed tts extent: " + a10);
            return null;
        }
    }

    public C8427k b(byte[] bArr, int i10, int i11) {
        char c10;
        a aVar;
        try {
            XmlPullParser newPullParser = this.f55475a.newPullParser();
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            HashMap hashMap3 = new HashMap();
            hashMap2.put("", new C8669e(""));
            b bVar = null;
            newPullParser.setInput(new ByteArrayInputStream(bArr, i10, i11), (String) null);
            ArrayDeque arrayDeque = new ArrayDeque();
            a aVar2 = f55474i;
            C8672h hVar = null;
            int i12 = 0;
            int i13 = 15;
            for (int eventType = newPullParser.getEventType(); eventType != 1; eventType = newPullParser.getEventType()) {
                C8667c cVar = (C8667c) arrayDeque.peek();
                if (i12 == 0) {
                    String name = newPullParser.getName();
                    if (eventType == 2) {
                        if ("tt".equals(name)) {
                            aVar2 = j(newPullParser);
                            c10 = 15;
                            i13 = h(newPullParser, 15);
                            bVar = s(newPullParser);
                        } else {
                            c10 = 15;
                        }
                        b bVar2 = bVar;
                        a aVar3 = aVar2;
                        int i14 = i13;
                        if (!f(name)) {
                            q.f("TtmlParser", "Ignoring unsupported tag: " + newPullParser.getName());
                            i12++;
                            aVar2 = aVar3;
                            char c11 = c10;
                            bVar = bVar2;
                            i13 = i14;
                        } else {
                            if ("head".equals(name)) {
                                aVar = aVar3;
                                k(newPullParser, hashMap, i14, bVar2, hashMap2, hashMap3);
                            } else {
                                aVar = aVar3;
                                try {
                                    C8667c m10 = m(newPullParser, cVar, hashMap2, aVar);
                                    arrayDeque.push(m10);
                                    if (cVar != null) {
                                        cVar.a(m10);
                                    }
                                } catch (C8429m e10) {
                                    q.i("TtmlParser", "Suppressing parser error", e10);
                                    i12++;
                                }
                            }
                            aVar2 = aVar;
                            bVar = bVar2;
                            i13 = i14;
                        }
                    } else if (eventType == 4) {
                        ((C8667c) C5950a.e(cVar)).a(C8667c.d(newPullParser.getText()));
                    } else if (eventType == 3) {
                        if (newPullParser.getName().equals("tt")) {
                            hVar = new C8672h((C8667c) C5950a.e((C8667c) arrayDeque.peek()), hashMap, hashMap2, hashMap3);
                        }
                        arrayDeque.pop();
                    }
                } else if (eventType == 2) {
                    i12++;
                } else if (eventType == 3) {
                    i12--;
                }
                newPullParser.next();
            }
            return (C8427k) C5950a.e(hVar);
        } catch (XmlPullParserException e11) {
            throw new IllegalStateException("Unable to decode source", e11);
        } catch (IOException e12) {
            throw new IllegalStateException("Unexpected error when reading input.", e12);
        }
    }

    public void c(byte[] bArr, int i10, int i11, s.b bVar, C5957h<C8421e> hVar) {
        C8425i.c(b(bArr, i10, i11), bVar, hVar);
    }

    public int d() {
        return 1;
    }
}
