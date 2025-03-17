package QL;

import GK.C15774B;
import GK.C15775C;
import GK.C15800s;
import GK.C15802u;
import GK.C15803v;
import GK.C15805x;
import GK.C15806y;
import WK.C16770e;
import WK.C16771f;
import java.util.regex.Pattern;

final class v {

    /* renamed from: l  reason: collision with root package name */
    private static final char[] f137854l = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: m  reason: collision with root package name */
    private static final Pattern f137855m = Pattern.compile("(.*/)?(\\.|%2e|%2E){1,2}(/.*)?");

    /* renamed from: a  reason: collision with root package name */
    private final String f137856a;

    /* renamed from: b  reason: collision with root package name */
    private final C15803v f137857b;

    /* renamed from: c  reason: collision with root package name */
    private String f137858c;

    /* renamed from: d  reason: collision with root package name */
    private C15803v.a f137859d;

    /* renamed from: e  reason: collision with root package name */
    private final C15774B.a f137860e = new C15774B.a();

    /* renamed from: f  reason: collision with root package name */
    private final C15802u.a f137861f;

    /* renamed from: g  reason: collision with root package name */
    private C15805x f137862g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean f137863h;

    /* renamed from: i  reason: collision with root package name */
    private C15806y.a f137864i;

    /* renamed from: j  reason: collision with root package name */
    private C15800s.a f137865j;

    /* renamed from: k  reason: collision with root package name */
    private C15775C f137866k;

    private static class a extends C15775C {

        /* renamed from: b  reason: collision with root package name */
        private final C15775C f137867b;

        /* renamed from: c  reason: collision with root package name */
        private final C15805x f137868c;

        a(C15775C c10, C15805x xVar) {
            this.f137867b = c10;
            this.f137868c = xVar;
        }

        public long a() {
            return this.f137867b.a();
        }

        public C15805x b() {
            return this.f137868c;
        }

        public void h(C16771f fVar) {
            this.f137867b.h(fVar);
        }
    }

    v(String str, C15803v vVar, String str2, C15802u uVar, C15805x xVar, boolean z10, boolean z11, boolean z12) {
        this.f137856a = str;
        this.f137857b = vVar;
        this.f137858c = str2;
        this.f137862g = xVar;
        this.f137863h = z10;
        if (uVar != null) {
            this.f137861f = uVar.p();
        } else {
            this.f137861f = new C15802u.a();
        }
        if (z11) {
            this.f137865j = new C15800s.a();
        } else if (z12) {
            C15806y.a aVar = new C15806y.a();
            this.f137864i = aVar;
            aVar.d(C15806y.f135142l);
        }
    }

    private static String i(String str, boolean z10) {
        int length = str.length();
        int i10 = 0;
        while (i10 < length) {
            int codePointAt = str.codePointAt(i10);
            if (codePointAt < 32 || codePointAt >= 127 || " \"<>^`{}|\\?#".indexOf(codePointAt) != -1 || (!z10 && (codePointAt == 47 || codePointAt == 37))) {
                C16770e eVar = new C16770e();
                eVar.M0(str, 0, i10);
                j(eVar, str, i10, length, z10);
                return eVar.l0();
            }
            i10 += Character.charCount(codePointAt);
        }
        return str;
    }

    private static void j(C16770e eVar, String str, int i10, int i11, boolean z10) {
        C16770e eVar2 = null;
        while (i10 < i11) {
            int codePointAt = str.codePointAt(i10);
            if (!z10 || !(codePointAt == 9 || codePointAt == 10 || codePointAt == 12 || codePointAt == 13)) {
                if (codePointAt < 32 || codePointAt >= 127 || " \"<>^`{}|\\?#".indexOf(codePointAt) != -1 || (!z10 && (codePointAt == 47 || codePointAt == 37))) {
                    if (eVar2 == null) {
                        eVar2 = new C16770e();
                    }
                    eVar2.N1(codePointAt);
                    while (!eVar2.Y1()) {
                        byte readByte = eVar2.readByte();
                        eVar.Z1(37);
                        char[] cArr = f137854l;
                        eVar.Z1(cArr[((readByte & 255) >> 4) & 15]);
                        eVar.Z1(cArr[readByte & 15]);
                    }
                } else {
                    eVar.N1(codePointAt);
                }
            }
            i10 += Character.charCount(codePointAt);
        }
    }

    /* access modifiers changed from: package-private */
    public void a(String str, String str2, boolean z10) {
        if (z10) {
            this.f137865j.b(str, str2);
        } else {
            this.f137865j.a(str, str2);
        }
    }

    /* access modifiers changed from: package-private */
    public void b(String str, String str2, boolean z10) {
        if ("Content-Type".equalsIgnoreCase(str)) {
            try {
                this.f137862g = C15805x.e(str2);
            } catch (IllegalArgumentException e10) {
                throw new IllegalArgumentException("Malformed content type: " + str2, e10);
            }
        } else if (z10) {
            this.f137861f.e(str, str2);
        } else {
            this.f137861f.a(str, str2);
        }
    }

    /* access modifiers changed from: package-private */
    public void c(C15802u uVar) {
        this.f137861f.b(uVar);
    }

    /* access modifiers changed from: package-private */
    public void d(C15802u uVar, C15775C c10) {
        this.f137864i.a(uVar, c10);
    }

    /* access modifiers changed from: package-private */
    public void e(C15806y.c cVar) {
        this.f137864i.b(cVar);
    }

    /* access modifiers changed from: package-private */
    public void f(String str, String str2, boolean z10) {
        if (this.f137858c != null) {
            String i10 = i(str2, z10);
            String str3 = this.f137858c;
            String replace = str3.replace("{" + str + "}", i10);
            if (!f137855m.matcher(replace).matches()) {
                this.f137858c = replace;
                return;
            }
            throw new IllegalArgumentException("@Path parameters shouldn't perform path traversal ('.' or '..'): " + str2);
        }
        throw new AssertionError();
    }

    /* access modifiers changed from: package-private */
    public void g(String str, String str2, boolean z10) {
        String str3 = this.f137858c;
        if (str3 != null) {
            C15803v.a l10 = this.f137857b.l(str3);
            this.f137859d = l10;
            if (l10 != null) {
                this.f137858c = null;
            } else {
                throw new IllegalArgumentException("Malformed URL. Base: " + this.f137857b + ", Relative: " + this.f137858c);
            }
        }
        if (z10) {
            this.f137859d.b(str, str2);
        } else {
            this.f137859d.d(str, str2);
        }
    }

    /* access modifiers changed from: package-private */
    public <T> void h(Class<T> cls, T t10) {
        this.f137860e.k(cls, t10);
    }

    /* access modifiers changed from: package-private */
    public C15774B.a k() {
        C15803v vVar;
        C15803v.a aVar = this.f137859d;
        if (aVar != null) {
            vVar = aVar.e();
        } else {
            vVar = this.f137857b.s(this.f137858c);
            if (vVar == null) {
                throw new IllegalArgumentException("Malformed URL. Base: " + this.f137857b + ", Relative: " + this.f137858c);
            }
        }
        a aVar2 = this.f137866k;
        if (aVar2 == null) {
            C15800s.a aVar3 = this.f137865j;
            if (aVar3 != null) {
                aVar2 = aVar3.c();
            } else {
                C15806y.a aVar4 = this.f137864i;
                if (aVar4 != null) {
                    aVar2 = aVar4.c();
                } else if (this.f137863h) {
                    aVar2 = C15775C.e((C15805x) null, new byte[0]);
                }
            }
        }
        C15805x xVar = this.f137862g;
        if (xVar != null) {
            if (aVar2 != null) {
                aVar2 = new a(aVar2, xVar);
            } else {
                this.f137861f.a("Content-Type", xVar.toString());
            }
        }
        return this.f137860e.m(vVar).f(this.f137861f.f()).g(this.f137856a, aVar2);
    }

    /* access modifiers changed from: package-private */
    public void l(C15775C c10) {
        this.f137866k = c10;
    }

    /* access modifiers changed from: package-private */
    public void m(Object obj) {
        this.f137858c = obj.toString();
    }
}
