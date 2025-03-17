package o4;

import android.graphics.PointF;
import android.text.Layout;
import android.text.SpannableString;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import jb.C9892c;
import k4.C8421e;
import k4.s;
import o4.C8599c;
import s3.a;
import t3.B;
import t3.C5950a;
import t3.C5957h;
import t3.N;
import t3.q;

/* renamed from: o4.b  reason: case insensitive filesystem */
public final class C8598b implements s {

    /* renamed from: g  reason: collision with root package name */
    private static final Pattern f55181g = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");

    /* renamed from: a  reason: collision with root package name */
    private final boolean f55182a;

    /* renamed from: b  reason: collision with root package name */
    private final C8597a f55183b;

    /* renamed from: c  reason: collision with root package name */
    private final B f55184c = new B();

    /* renamed from: d  reason: collision with root package name */
    private Map<String, C8599c> f55185d;

    /* renamed from: e  reason: collision with root package name */
    private float f55186e = -3.4028235E38f;

    /* renamed from: f  reason: collision with root package name */
    private float f55187f = -3.4028235E38f;

    public C8598b(List<byte[]> list) {
        if (list == null || list.isEmpty()) {
            this.f55182a = false;
            this.f55183b = null;
            return;
        }
        this.f55182a = true;
        String H10 = N.H(list.get(0));
        C5950a.a(H10.startsWith("Format:"));
        this.f55183b = (C8597a) C5950a.e(C8597a.a(H10));
        k(new B(list.get(1)), StandardCharsets.UTF_8);
    }

    private static int e(long j10, List<Long> list, List<List<a>> list2) {
        int i10;
        ArrayList arrayList;
        int size = list.size() - 1;
        while (true) {
            if (size < 0) {
                i10 = 0;
                break;
            } else if (list.get(size).longValue() == j10) {
                return size;
            } else {
                if (list.get(size).longValue() < j10) {
                    i10 = size + 1;
                    break;
                }
                size--;
            }
        }
        list.add(i10, Long.valueOf(j10));
        if (i10 != 0) {
            arrayList = new ArrayList(list2.get(i10 - 1));
        }
        list2.add(i10, arrayList);
        return i10;
    }

    private static float f(int i10) {
        if (i10 == 0) {
            return 0.05f;
        }
        if (i10 != 1) {
            return i10 != 2 ? -3.4028235E38f : 0.95f;
        }
        return 0.5f;
    }

    private static a g(String str, C8599c cVar, C8599c.b bVar, float f10, float f11) {
        SpannableString spannableString = new SpannableString(str);
        a.b o10 = new a.b().o(spannableString);
        if (cVar != null) {
            if (cVar.f55190c != null) {
                spannableString.setSpan(new ForegroundColorSpan(cVar.f55190c.intValue()), 0, spannableString.length(), 33);
            }
            if (cVar.f55197j == 3 && cVar.f55191d != null) {
                spannableString.setSpan(new BackgroundColorSpan(cVar.f55191d.intValue()), 0, spannableString.length(), 33);
            }
            float f12 = cVar.f55192e;
            if (!(f12 == -3.4028235E38f || f11 == -3.4028235E38f)) {
                o10.q(f12 / f11, 1);
            }
            boolean z10 = cVar.f55193f;
            if (z10 && cVar.f55194g) {
                spannableString.setSpan(new StyleSpan(3), 0, spannableString.length(), 33);
            } else if (z10) {
                spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 33);
            } else if (cVar.f55194g) {
                spannableString.setSpan(new StyleSpan(2), 0, spannableString.length(), 33);
            }
            if (cVar.f55195h) {
                spannableString.setSpan(new UnderlineSpan(), 0, spannableString.length(), 33);
            }
            if (cVar.f55196i) {
                spannableString.setSpan(new StrikethroughSpan(), 0, spannableString.length(), 33);
            }
        }
        int i10 = bVar.f55213a;
        if (i10 == -1) {
            i10 = cVar != null ? cVar.f55189b : -1;
        }
        o10.p(q(i10)).l(p(i10)).i(o(i10));
        PointF pointF = bVar.f55214b;
        if (pointF == null || f11 == -3.4028235E38f || f10 == -3.4028235E38f) {
            o10.k(f(o10.d()));
            o10.h(f(o10.c()), 0);
        } else {
            o10.k(pointF.x / f10);
            o10.h(bVar.f55214b.y / f11, 0);
        }
        return o10.a();
    }

    private Charset h(B b10) {
        Charset R10 = b10.R();
        return R10 != null ? R10 : StandardCharsets.UTF_8;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x007c, code lost:
        r3 = r12.f55178c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void i(java.lang.String r11, o4.C8597a r12, java.util.List<java.util.List<s3.a>> r13, java.util.List<java.lang.Long> r14) {
        /*
            r10 = this;
            java.lang.String r0 = "Dialogue:"
            boolean r0 = r11.startsWith(r0)
            t3.C5950a.a(r0)
            r0 = 9
            java.lang.String r0 = r11.substring(r0)
            int r1 = r12.f55180e
            java.lang.String r2 = ","
            java.lang.String[] r0 = r0.split(r2, r1)
            int r1 = r0.length
            int r2 = r12.f55180e
            java.lang.String r3 = "SsaParser"
            if (r1 == r2) goto L_0x0033
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = "Skipping dialogue line with fewer columns than format: "
            r12.append(r13)
            r12.append(r11)
            java.lang.String r11 = r12.toString()
            t3.q.h(r3, r11)
            return
        L_0x0033:
            int r1 = r12.f55176a
            r1 = r0[r1]
            long r1 = n(r1)
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r6 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            java.lang.String r7 = "Skipping invalid timing: "
            if (r6 != 0) goto L_0x0059
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r7)
            r12.append(r11)
            java.lang.String r11 = r12.toString()
            t3.q.h(r3, r11)
            return
        L_0x0059:
            int r6 = r12.f55177b
            r6 = r0[r6]
            long r8 = n(r6)
            int r4 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r4 != 0) goto L_0x0078
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r7)
            r12.append(r11)
            java.lang.String r11 = r12.toString()
            t3.q.h(r3, r11)
            return
        L_0x0078:
            java.util.Map<java.lang.String, o4.c> r11 = r10.f55185d
            if (r11 == 0) goto L_0x008e
            int r3 = r12.f55178c
            r4 = -1
            if (r3 == r4) goto L_0x008e
            r3 = r0[r3]
            java.lang.String r3 = r3.trim()
            java.lang.Object r11 = r11.get(r3)
            o4.c r11 = (o4.C8599c) r11
            goto L_0x008f
        L_0x008e:
            r11 = 0
        L_0x008f:
            int r12 = r12.f55179d
            r12 = r0[r12]
            o4.c$b r0 = o4.C8599c.b.b(r12)
            java.lang.String r12 = o4.C8599c.b.d(r12)
            java.lang.String r3 = "\\N"
            java.lang.String r4 = "\n"
            java.lang.String r12 = r12.replace(r3, r4)
            java.lang.String r3 = "\\n"
            java.lang.String r12 = r12.replace(r3, r4)
            java.lang.String r3 = "\\h"
            java.lang.String r4 = " "
            java.lang.String r12 = r12.replace(r3, r4)
            float r3 = r10.f55186e
            float r4 = r10.f55187f
            s3.a r11 = g(r12, r11, r0, r3, r4)
            int r12 = e(r1, r14, r13)
            int r14 = e(r8, r14, r13)
        L_0x00c1:
            if (r12 >= r14) goto L_0x00cf
            java.lang.Object r0 = r13.get(r12)
            java.util.List r0 = (java.util.List) r0
            r0.add(r11)
            int r12 = r12 + 1
            goto L_0x00c1
        L_0x00cf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o4.C8598b.i(java.lang.String, o4.a, java.util.List, java.util.List):void");
    }

    private void j(B b10, List<List<a>> list, List<Long> list2, Charset charset) {
        C8597a aVar = this.f55182a ? this.f55183b : null;
        while (true) {
            String t10 = b10.t(charset);
            if (t10 == null) {
                return;
            }
            if (t10.startsWith("Format:")) {
                aVar = C8597a.a(t10);
            } else if (t10.startsWith("Dialogue:")) {
                if (aVar == null) {
                    q.h("SsaParser", "Skipping dialogue line before complete format: " + t10);
                } else {
                    i(t10, aVar, list, list2);
                }
            }
        }
    }

    private void k(B b10, Charset charset) {
        while (true) {
            String t10 = b10.t(charset);
            if (t10 == null) {
                return;
            }
            if ("[Script Info]".equalsIgnoreCase(t10)) {
                l(b10, charset);
            } else if ("[V4+ Styles]".equalsIgnoreCase(t10)) {
                this.f55185d = m(b10, charset);
            } else if ("[V4 Styles]".equalsIgnoreCase(t10)) {
                q.f("SsaParser", "[V4 Styles] are not supported");
            } else if ("[Events]".equalsIgnoreCase(t10)) {
                return;
            }
        }
    }

    private void l(B b10, Charset charset) {
        while (true) {
            String t10 = b10.t(charset);
            if (t10 == null) {
                return;
            }
            if (b10.a() == 0 || b10.h(charset) != '[') {
                String[] split = t10.split(":");
                if (split.length == 2) {
                    String e10 = C9892c.e(split[0].trim());
                    e10.hashCode();
                    if (e10.equals("playresx")) {
                        this.f55186e = Float.parseFloat(split[1].trim());
                    } else if (e10.equals("playresy")) {
                        try {
                            this.f55187f = Float.parseFloat(split[1].trim());
                        } catch (NumberFormatException unused) {
                        }
                    }
                }
            } else {
                return;
            }
        }
    }

    private static Map<String, C8599c> m(B b10, Charset charset) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C8599c.a aVar = null;
        while (true) {
            String t10 = b10.t(charset);
            if (t10 == null || (b10.a() != 0 && b10.h(charset) == '[')) {
                return linkedHashMap;
            }
            if (t10.startsWith("Format:")) {
                aVar = C8599c.a.a(t10);
            } else if (t10.startsWith("Style:")) {
                if (aVar == null) {
                    q.h("SsaParser", "Skipping 'Style:' line before 'Format:' line: " + t10);
                } else {
                    C8599c b11 = C8599c.b(t10, aVar);
                    if (b11 != null) {
                        linkedHashMap.put(b11.f55188a, b11);
                    }
                }
            }
        }
        return linkedHashMap;
    }

    private static long n(String str) {
        Matcher matcher = f55181g.matcher(str.trim());
        if (!matcher.matches()) {
            return -9223372036854775807L;
        }
        return (Long.parseLong((String) N.i(matcher.group(1))) * 3600000000L) + (Long.parseLong((String) N.i(matcher.group(2))) * 60000000) + (Long.parseLong((String) N.i(matcher.group(3))) * 1000000) + (Long.parseLong((String) N.i(matcher.group(4))) * 10000);
    }

    private static int o(int i10) {
        switch (i10) {
            case -1:
                return Integer.MIN_VALUE;
            case 1:
            case 2:
            case 3:
                return 2;
            case 4:
            case 5:
            case 6:
                return 1;
            case 7:
            case 8:
            case 9:
                return 0;
            default:
                q.h("SsaParser", "Unknown alignment: " + i10);
                return Integer.MIN_VALUE;
        }
    }

    private static int p(int i10) {
        switch (i10) {
            case -1:
                return Integer.MIN_VALUE;
            case 1:
            case 4:
            case 7:
                return 0;
            case 2:
            case 5:
            case 8:
                return 1;
            case 3:
            case 6:
            case 9:
                return 2;
            default:
                q.h("SsaParser", "Unknown alignment: " + i10);
                return Integer.MIN_VALUE;
        }
    }

    private static Layout.Alignment q(int i10) {
        switch (i10) {
            case -1:
                return null;
            case 1:
            case 4:
            case 7:
                return Layout.Alignment.ALIGN_NORMAL;
            case 2:
            case 5:
            case 8:
                return Layout.Alignment.ALIGN_CENTER;
            case 3:
            case 6:
            case 9:
                return Layout.Alignment.ALIGN_OPPOSITE;
            default:
                q.h("SsaParser", "Unknown alignment: " + i10);
                return null;
        }
    }

    public void c(byte[] bArr, int i10, int i11, s.b bVar, C5957h<C8421e> hVar) {
        ArrayList arrayList;
        ArrayList arrayList2;
        int i12 = i10;
        s.b bVar2 = bVar;
        C5957h<C8421e> hVar2 = hVar;
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        this.f55184c.U(bArr, i12 + i11);
        this.f55184c.W(i12);
        Charset h10 = h(this.f55184c);
        if (!this.f55182a) {
            k(this.f55184c, h10);
        }
        j(this.f55184c, arrayList3, arrayList4, h10);
        ArrayList<C8421e> arrayList5 = (bVar2.f54129a == -9223372036854775807L || !bVar2.f54130b) ? null : new ArrayList<>();
        int i13 = 0;
        while (i13 < arrayList3.size()) {
            List list = (List) arrayList3.get(i13);
            if (list.isEmpty() && i13 != 0) {
                arrayList2 = arrayList3;
                arrayList = arrayList4;
            } else if (i13 != arrayList3.size() - 1) {
                long longValue = ((Long) arrayList4.get(i13)).longValue();
                long longValue2 = ((Long) arrayList4.get(i13 + 1)).longValue() - ((Long) arrayList4.get(i13)).longValue();
                arrayList2 = arrayList3;
                arrayList = arrayList4;
                long j10 = bVar2.f54129a;
                if (j10 == -9223372036854775807L || longValue >= j10) {
                    hVar2.accept(new C8421e(list, longValue, longValue2));
                } else if (arrayList5 != null) {
                    arrayList5.add(new C8421e(list, longValue, longValue2));
                }
            } else {
                throw new IllegalStateException();
            }
            i13++;
            arrayList3 = arrayList2;
            arrayList4 = arrayList;
        }
        if (arrayList5 != null) {
            for (C8421e accept : arrayList5) {
                hVar2.accept(accept);
            }
        }
    }

    public int d() {
        return 1;
    }
}
