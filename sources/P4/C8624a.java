package p4;

import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import k4.C8421e;
import k4.s;
import kb.C9967v;
import t3.B;
import t3.C5950a;
import t3.C5957h;
import t3.q;

/* renamed from: p4.a  reason: case insensitive filesystem */
public final class C8624a implements s {

    /* renamed from: d  reason: collision with root package name */
    private static final Pattern f55389d = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*");

    /* renamed from: e  reason: collision with root package name */
    private static final Pattern f55390e = Pattern.compile("\\{\\\\.*?\\}");

    /* renamed from: a  reason: collision with root package name */
    private final StringBuilder f55391a = new StringBuilder();

    /* renamed from: b  reason: collision with root package name */
    private final ArrayList<String> f55392b = new ArrayList<>();

    /* renamed from: c  reason: collision with root package name */
    private final B f55393c = new B();

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private s3.a e(android.text.Spanned r17, java.lang.String r18) {
        /*
            r16 = this;
            r0 = r18
            s3.a$b r1 = new s3.a$b
            r1.<init>()
            r2 = r17
            s3.a$b r1 = r1.o(r2)
            if (r0 != 0) goto L_0x0014
            s3.a r0 = r1.a()
            return r0
        L_0x0014:
            int r2 = r18.hashCode()
            java.lang.String r3 = "{\\an1}"
            java.lang.String r5 = "{\\an2}"
            java.lang.String r6 = "{\\an3}"
            java.lang.String r7 = "{\\an4}"
            java.lang.String r9 = "{\\an5}"
            java.lang.String r10 = "{\\an6}"
            java.lang.String r11 = "{\\an7}"
            java.lang.String r13 = "{\\an8}"
            java.lang.String r14 = "{\\an9}"
            r4 = 3
            r8 = 4
            r15 = 1
            r12 = 2
            switch(r2) {
                case -685620710: goto L_0x0073;
                case -685620679: goto L_0x006b;
                case -685620648: goto L_0x0063;
                case -685620617: goto L_0x005b;
                case -685620586: goto L_0x0053;
                case -685620555: goto L_0x004b;
                case -685620524: goto L_0x0043;
                case -685620493: goto L_0x003a;
                case -685620462: goto L_0x0032;
                default: goto L_0x0031;
            }
        L_0x0031:
            goto L_0x007b
        L_0x0032:
            boolean r2 = r0.equals(r14)
            if (r2 == 0) goto L_0x007b
            r2 = 5
            goto L_0x007c
        L_0x003a:
            boolean r2 = r0.equals(r13)
            if (r2 == 0) goto L_0x007b
            r2 = 8
            goto L_0x007c
        L_0x0043:
            boolean r2 = r0.equals(r11)
            if (r2 == 0) goto L_0x007b
            r2 = r12
            goto L_0x007c
        L_0x004b:
            boolean r2 = r0.equals(r10)
            if (r2 == 0) goto L_0x007b
            r2 = r8
            goto L_0x007c
        L_0x0053:
            boolean r2 = r0.equals(r9)
            if (r2 == 0) goto L_0x007b
            r2 = 7
            goto L_0x007c
        L_0x005b:
            boolean r2 = r0.equals(r7)
            if (r2 == 0) goto L_0x007b
            r2 = r15
            goto L_0x007c
        L_0x0063:
            boolean r2 = r0.equals(r6)
            if (r2 == 0) goto L_0x007b
            r2 = r4
            goto L_0x007c
        L_0x006b:
            boolean r2 = r0.equals(r5)
            if (r2 == 0) goto L_0x007b
            r2 = 6
            goto L_0x007c
        L_0x0073:
            boolean r2 = r0.equals(r3)
            if (r2 == 0) goto L_0x007b
            r2 = 0
            goto L_0x007c
        L_0x007b:
            r2 = -1
        L_0x007c:
            if (r2 == 0) goto L_0x0091
            if (r2 == r15) goto L_0x0091
            if (r2 == r12) goto L_0x0091
            if (r2 == r4) goto L_0x008d
            if (r2 == r8) goto L_0x008d
            r8 = 5
            if (r2 == r8) goto L_0x008d
            r1.l(r15)
            goto L_0x0095
        L_0x008d:
            r1.l(r12)
            goto L_0x0095
        L_0x0091:
            r2 = 0
            r1.l(r2)
        L_0x0095:
            int r2 = r18.hashCode()
            switch(r2) {
                case -685620710: goto L_0x00de;
                case -685620679: goto L_0x00d6;
                case -685620648: goto L_0x00ce;
                case -685620617: goto L_0x00c6;
                case -685620586: goto L_0x00be;
                case -685620555: goto L_0x00b5;
                case -685620524: goto L_0x00ad;
                case -685620493: goto L_0x00a5;
                case -685620462: goto L_0x009d;
                default: goto L_0x009c;
            }
        L_0x009c:
            goto L_0x00e6
        L_0x009d:
            boolean r0 = r0.equals(r14)
            if (r0 == 0) goto L_0x00e6
            r0 = 5
            goto L_0x00e7
        L_0x00a5:
            boolean r0 = r0.equals(r13)
            if (r0 == 0) goto L_0x00e6
            r0 = 4
            goto L_0x00e7
        L_0x00ad:
            boolean r0 = r0.equals(r11)
            if (r0 == 0) goto L_0x00e6
            r0 = r4
            goto L_0x00e7
        L_0x00b5:
            boolean r0 = r0.equals(r10)
            if (r0 == 0) goto L_0x00e6
            r0 = 8
            goto L_0x00e7
        L_0x00be:
            boolean r0 = r0.equals(r9)
            if (r0 == 0) goto L_0x00e6
            r0 = 7
            goto L_0x00e7
        L_0x00c6:
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L_0x00e6
            r0 = 6
            goto L_0x00e7
        L_0x00ce:
            boolean r0 = r0.equals(r6)
            if (r0 == 0) goto L_0x00e6
            r0 = r12
            goto L_0x00e7
        L_0x00d6:
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L_0x00e6
            r0 = r15
            goto L_0x00e7
        L_0x00de:
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x00e6
            r0 = 0
            goto L_0x00e7
        L_0x00e6:
            r0 = -1
        L_0x00e7:
            if (r0 == 0) goto L_0x00fe
            if (r0 == r15) goto L_0x00fe
            if (r0 == r12) goto L_0x00fe
            if (r0 == r4) goto L_0x00f9
            r2 = 4
            if (r0 == r2) goto L_0x00f9
            r2 = 5
            if (r0 == r2) goto L_0x00f9
            r1.i(r15)
            goto L_0x0101
        L_0x00f9:
            r0 = 0
            r1.i(r0)
            goto L_0x0101
        L_0x00fe:
            r1.i(r12)
        L_0x0101:
            int r0 = r1.d()
            float r0 = g(r0)
            s3.a$b r0 = r1.k(r0)
            int r1 = r1.c()
            float r1 = g(r1)
            r2 = 0
            s3.a$b r0 = r0.h(r1, r2)
            s3.a r0 = r0.a()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p4.C8624a.e(android.text.Spanned, java.lang.String):s3.a");
    }

    private Charset f(B b10) {
        Charset R10 = b10.R();
        return R10 != null ? R10 : StandardCharsets.UTF_8;
    }

    public static float g(int i10) {
        if (i10 == 0) {
            return 0.08f;
        }
        if (i10 == 1) {
            return 0.5f;
        }
        if (i10 == 2) {
            return 0.92f;
        }
        throw new IllegalArgumentException();
    }

    private static long h(Matcher matcher, int i10) {
        String group = matcher.group(i10 + 1);
        long parseLong = (group != null ? Long.parseLong(group) * 3600000 : 0) + (Long.parseLong((String) C5950a.e(matcher.group(i10 + 2))) * 60000) + (Long.parseLong((String) C5950a.e(matcher.group(i10 + 3))) * 1000);
        String group2 = matcher.group(i10 + 4);
        if (group2 != null) {
            parseLong += Long.parseLong(group2);
        }
        return parseLong * 1000;
    }

    private String i(String str, ArrayList<String> arrayList) {
        String trim = str.trim();
        StringBuilder sb2 = new StringBuilder(trim);
        Matcher matcher = f55390e.matcher(trim);
        int i10 = 0;
        while (matcher.find()) {
            String group = matcher.group();
            arrayList.add(group);
            int start = matcher.start() - i10;
            int length = group.length();
            sb2.replace(start, start + length, "");
            i10 += length;
        }
        return sb2.toString();
    }

    public void c(byte[] bArr, int i10, int i11, s.b bVar, C5957h<C8421e> hVar) {
        String str;
        C5957h<C8421e> hVar2;
        String str2;
        String str3;
        C5957h<C8421e> hVar3;
        int i12 = i10;
        s.b bVar2 = bVar;
        C5957h<C8421e> hVar4 = hVar;
        String str4 = "SubripParser";
        this.f55393c.U(bArr, i12 + i11);
        this.f55393c.W(i12);
        Charset f10 = f(this.f55393c);
        ArrayList<C8421e> arrayList = (bVar2.f54129a == -9223372036854775807L || !bVar2.f54130b) ? null : new ArrayList<>();
        while (true) {
            String t10 = this.f55393c.t(f10);
            if (t10 == null) {
                break;
            } else if (t10.length() != 0) {
                try {
                    Integer.parseInt(t10);
                    String t11 = this.f55393c.t(f10);
                    if (t11 == null) {
                        q.h(str4, "Unexpected end");
                        break;
                    }
                    Matcher matcher = f55389d.matcher(t11);
                    if (matcher.matches()) {
                        long h10 = h(matcher, 1);
                        long h11 = h(matcher, 6);
                        int i13 = 0;
                        this.f55391a.setLength(0);
                        this.f55392b.clear();
                        for (String t12 = this.f55393c.t(f10); !TextUtils.isEmpty(t12); t12 = this.f55393c.t(f10)) {
                            if (this.f55391a.length() > 0) {
                                this.f55391a.append("<br>");
                            }
                            this.f55391a.append(i(t12, this.f55392b));
                        }
                        Spanned fromHtml = Html.fromHtml(this.f55391a.toString());
                        while (true) {
                            if (i13 >= this.f55392b.size()) {
                                str2 = str4;
                                str3 = null;
                                break;
                            }
                            str3 = this.f55392b.get(i13);
                            if (str3.matches("\\{\\\\an[1-9]\\}")) {
                                str2 = str4;
                                break;
                            }
                            i13++;
                        }
                        long j10 = bVar2.f54129a;
                        if (j10 == -9223372036854775807L || h10 >= j10) {
                            hVar3 = hVar;
                            hVar3.accept(new C8421e(C9967v.F(e(fromHtml, str3)), h10, h11 - h10));
                        } else {
                            if (arrayList != null) {
                                arrayList.add(new C8421e(C9967v.F(e(fromHtml, str3)), h10, h11 - h10));
                            }
                            hVar3 = hVar;
                        }
                        hVar4 = hVar3;
                        str4 = str2;
                    } else {
                        String str5 = str4;
                        hVar2 = hVar4;
                        str = str5;
                        q.h(str, "Skipping invalid timing: " + t11);
                        hVar4 = hVar2;
                        str4 = str;
                    }
                } catch (NumberFormatException unused) {
                    str = str4;
                    hVar2 = hVar4;
                    q.h(str, "Skipping invalid index: " + t10);
                }
            }
        }
        C5957h<C8421e> hVar5 = hVar4;
        if (arrayList != null) {
            for (C8421e accept : arrayList) {
                hVar5.accept(accept);
            }
        }
    }

    public int d() {
        return 1;
    }
}
