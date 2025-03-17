package nts;

import java.util.Enumeration;

/* renamed from: nts.ᇠ  reason: contains not printable characters */
public class C3805 implements Enumeration {

    /* renamed from: ϴ  reason: contains not printable characters */
    public String f1423;

    /* renamed from: ࡏ  reason: contains not printable characters */
    public char f1424;

    /* renamed from: ગ  reason: contains not printable characters */
    public int f1425;

    /* renamed from: ഇ  reason: contains not printable characters */
    public int f1426;

    /* renamed from: ᐳ  reason: contains not printable characters */
    public int f1427;

    /* renamed from: ⶊ  reason: contains not printable characters */
    public String f1428;

    /* renamed from: ⶏ  reason: contains not printable characters */
    public boolean f1429 = true;

    public C3805() {
        m1454();
    }

    public boolean hasMoreElements() {
        return m1452();
    }

    public Object nextElement() {
        return m1456();
    }

    /* renamed from: ગ  reason: contains not printable characters */
    public boolean m1452() {
        int r02 = m1453(this.f1426);
        this.f1425 = r02;
        return r02 < this.f1427;
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public void m1454() {
        this.f1423 = "";
        this.f1426 = 0;
        this.f1425 = -1;
        this.f1427 = 0;
        this.f1428 = C3727.m1052("Wy\u000b##%#", 0, 5, 114);
        this.f1429 = true;
    }

    /* renamed from: ᐳ  reason: contains not printable characters */
    public String m1456() {
        int i10 = this.f1425;
        if (i10 < 0) {
            i10 = m1453(this.f1426);
        }
        this.f1426 = i10;
        this.f1425 = -1;
        if (i10 >= this.f1427) {
            return "";
        }
        int i11 = i10;
        while (i11 < this.f1427 && ((r2 = this.f1423.charAt(i11)) > this.f1424 || this.f1428.indexOf(r2) < 0)) {
            i11++;
        }
        this.f1426 = i11;
        if (this.f1429) {
            return this.f1423.substring(i10, i11);
        }
        this.f1426 = i11 + 1;
        return this.f1423.substring(i10, i11);
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public void m1455(String str, String str2) {
        this.f1426 = 0;
        this.f1425 = -1;
        this.f1423 = str;
        this.f1427 = str.length();
        this.f1428 = str2;
        char c10 = 0;
        for (int i10 = 0; i10 < this.f1428.length(); i10++) {
            char charAt = this.f1428.charAt(i10);
            if (c10 < charAt) {
                c10 = charAt;
            }
        }
        this.f1424 = c10;
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public final int m1453(int i10) {
        if (this.f1428 == null) {
            this.f1428 = "";
        }
        if (!this.f1429) {
            return i10;
        }
        while (i10 < this.f1427 && (r0 = this.f1423.charAt(i10)) <= this.f1424 && this.f1428.indexOf(r0) >= 0) {
            i10++;
        }
        return i10;
    }
}
