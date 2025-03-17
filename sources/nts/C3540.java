package nts;

import java.util.Locale;
import java.util.Vector;

/* renamed from: nts.Ǵ  reason: contains not printable characters */
public class C3540 extends C3823 {

    /* renamed from: ᅯ  reason: contains not printable characters */
    public static Vector f24;

    /* renamed from: и  reason: contains not printable characters */
    public String f25;

    /* renamed from: ࡑ  reason: contains not printable characters */
    public int f26;

    /* renamed from: ᖑ  reason: contains not printable characters */
    public String f27;

    /* renamed from: ᘺ  reason: contains not printable characters */
    public Vector f28 = new Vector();

    static {
        Vector vector = new Vector();
        f24 = vector;
        vector.addElement("");
        f24.addElement(C3823.f1545);
    }

    public C3540(boolean z10) {
        if (z10) {
            Locale locale = Locale.getDefault();
            if (locale.equals(Locale.JAPAN) || locale.equals(Locale.JAPANESE)) {
                m94(1);
            } else {
                m94(0);
            }
        }
    }

    /* renamed from: ϴ  reason: contains not printable characters */
    public void m94(int i10) {
        if (i10 < 0 || i10 >= 2) {
            i10 = 0;
        }
        this.f26 = i10;
        Vector vector = new Vector();
        this.f28 = vector;
        int i11 = this.f26;
        if (i11 == 0) {
            this.f25 = null;
            this.f27 = null;
            vector.addElement("");
            this.f28.addElement(C3823.f1545);
        } else if (i11 == 1) {
            String str = C3823.f1542;
            this.f27 = str;
            this.f25 = "";
            vector.addElement("");
            this.f28.addElement(C3823.f1545);
            this.f28.addElement(str);
        }
    }

    /* renamed from: ગ  reason: contains not printable characters */
    public String m95() {
        String str = this.f25;
        return str == null ? "" : str;
    }

    /* renamed from: ᅯ  reason: contains not printable characters */
    public String m96(byte[] bArr) {
        String str = this.f25;
        if (str == null || str.length() <= 0) {
            return new String(bArr);
        }
        return C3823.m1613(bArr, 0, bArr.length, this.f25);
    }

    /* renamed from: ᘺ  reason: contains not printable characters */
    public void m98(String str) {
        if (str == null) {
            str = "";
        }
        int indexOf = str.indexOf("/");
        this.f25 = indexOf == -1 ? str : str.substring(0, indexOf);
        if (indexOf != -1) {
            str = str.substring(indexOf + 1);
        }
        this.f27 = str;
    }

    /* renamed from: ᅯ  reason: contains not printable characters */
    public byte[] m97(String str) {
        String str2 = this.f27;
        if (str2 == null || str2.length() <= 0) {
            return str.getBytes();
        }
        return C3823.m1621(str, this.f27);
    }
}
