package rd;

import java.nio.charset.StandardCharsets;
import ld.C10009b;

final class h {

    /* renamed from: a  reason: collision with root package name */
    private final String f76385a;

    /* renamed from: b  reason: collision with root package name */
    private m f76386b;

    /* renamed from: c  reason: collision with root package name */
    private C10009b f76387c;

    /* renamed from: d  reason: collision with root package name */
    private C10009b f76388d;

    /* renamed from: e  reason: collision with root package name */
    private final StringBuilder f76389e;

    /* renamed from: f  reason: collision with root package name */
    int f76390f;

    /* renamed from: g  reason: collision with root package name */
    private int f76391g;

    /* renamed from: h  reason: collision with root package name */
    private l f76392h;

    /* renamed from: i  reason: collision with root package name */
    private int f76393i;

    h(String str) {
        byte[] bytes = str.getBytes(StandardCharsets.ISO_8859_1);
        StringBuilder sb2 = new StringBuilder(bytes.length);
        int length = bytes.length;
        int i10 = 0;
        while (i10 < length) {
            char c10 = (char) (bytes[i10] & 255);
            if (c10 != '?' || str.charAt(i10) == '?') {
                sb2.append(c10);
                i10++;
            } else {
                throw new IllegalArgumentException("Message contains characters outside ISO-8859-1 encoding.");
            }
        }
        this.f76385a = sb2.toString();
        this.f76386b = m.FORCE_NONE;
        this.f76389e = new StringBuilder(str.length());
        this.f76391g = -1;
    }

    private int h() {
        return this.f76385a.length() - this.f76393i;
    }

    public int a() {
        return this.f76389e.length();
    }

    public StringBuilder b() {
        return this.f76389e;
    }

    public char c() {
        return this.f76385a.charAt(this.f76390f);
    }

    public String d() {
        return this.f76385a;
    }

    public int e() {
        return this.f76391g;
    }

    public int f() {
        return h() - this.f76390f;
    }

    public l g() {
        return this.f76392h;
    }

    public boolean i() {
        return this.f76390f < h();
    }

    public void j() {
        this.f76391g = -1;
    }

    public void k() {
        this.f76392h = null;
    }

    public void l(C10009b bVar, C10009b bVar2) {
        this.f76387c = bVar;
        this.f76388d = bVar2;
    }

    public void m(int i10) {
        this.f76393i = i10;
    }

    public void n(m mVar) {
        this.f76386b = mVar;
    }

    public void o(int i10) {
        this.f76391g = i10;
    }

    public void p() {
        q(a());
    }

    public void q(int i10) {
        l lVar = this.f76392h;
        if (lVar == null || i10 > lVar.a()) {
            this.f76392h = l.l(i10, this.f76386b, this.f76387c, this.f76388d, true);
        }
    }

    public void r(char c10) {
        this.f76389e.append(c10);
    }

    public void s(String str) {
        this.f76389e.append(str);
    }
}
