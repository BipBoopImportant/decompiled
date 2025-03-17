package nts;

import java.io.InputStream;

/* renamed from: nts.ذ  reason: contains not printable characters */
public abstract class C3638 implements C4193 {

    /* renamed from: ગ  reason: contains not printable characters */
    public byte[] f624 = new byte[0];

    /* renamed from: ഇ  reason: contains not printable characters */
    public int f625 = 0;

    static {
        C3727.m1052("em\u001fSIC2(28JJH\u0014\u000e\u0004vqvBXR!- qka\u0014\u0017\u0015", 0, 3, 43);
        C3727.m1052("em\u001fSIC2(28JJH\u0014\u000e\u0004vqvBXR!- qka\u0014\u0017\u0015", 3, 4, 7);
        C3727.m1052("em\u001fSIC2(28JJH\u0014\u000e\u0004vqvBXR!- qka\u0014\u0017\u0015", 7, 6, 122);
        C3727.m1052("em\u001fSIC2(28JJH\u0014\u000e\u0004vqvBXR!- qka\u0014\u0017\u0015", 13, 6, 76);
        C3727.m1052("em\u001fSIC2(28JJH\u0014\u000e\u0004vqvBXR!- qka\u0014\u0017\u0015", 19, 6, 4);
        C3727.m1052("em\u001fSIC2(28JJH\u0014\u000e\u0004vqvBXR!- qka\u0014\u0017\u0015", 25, 6, 61);
    }

    /* renamed from: ϴ  reason: contains not printable characters */
    public abstract void m617();

    /* renamed from: ગ  reason: contains not printable characters */
    public abstract void m618(byte[] bArr, int i10, int i11);

    /* renamed from: ગ  reason: contains not printable characters */
    public boolean m619() {
        return true;
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public int m621(byte[] bArr, int i10, int i11, byte[] bArr2, int i12) {
        m618(bArr, i10, i11);
        if (bArr2 != null) {
            System.arraycopy(bArr, i10, bArr2, i12, i11);
        }
        return i11;
    }

    /* renamed from: ᐳ  reason: contains not printable characters */
    public abstract byte[] m624();

    /* renamed from: ગ  reason: contains not printable characters */
    public byte[] m620(byte[] bArr) {
        int length = bArr.length;
        m617();
        m618(bArr, 0, length);
        byte[] r32 = m624();
        this.f624 = r32;
        return (byte[]) r32.clone();
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public byte[] m623(byte[] bArr, int i10, int i11) {
        m618(bArr, i10, i11);
        this.f624 = m624();
        byte[] bArr2 = new byte[i11];
        System.arraycopy(bArr, i10, bArr2, 0, i11);
        return bArr2;
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public byte[] m622(InputStream inputStream) {
        m617();
        byte[] bArr = new byte[32768];
        while (true) {
            int read = inputStream.read(bArr, 0, 32768);
            if (read > 0) {
                m618(bArr, 0, read);
            } else {
                byte[] r52 = m624();
                this.f624 = r52;
                return (byte[]) r52.clone();
            }
        }
    }
}
