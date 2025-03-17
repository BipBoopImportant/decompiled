package nts;

import androidx.recyclerview.widget.RecyclerView;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.zip.GZIPOutputStream;

/* renamed from: nts.ᙄ  reason: contains not printable characters */
public class C3941 extends InputStream {

    /* renamed from: ϴ  reason: contains not printable characters */
    public byte[] f2244 = C3596.f365;

    /* renamed from: ࡏ  reason: contains not printable characters */
    public GZIPOutputStream f2245 = null;

    /* renamed from: ગ  reason: contains not printable characters */
    public boolean f2246 = false;

    /* renamed from: ഇ  reason: contains not printable characters */
    public InputStream f2247 = null;

    /* renamed from: ᐳ  reason: contains not printable characters */
    public ByteArrayOutputStream f2248 = new ByteArrayOutputStream();

    /* renamed from: ⶊ  reason: contains not printable characters */
    public int f2249 = 0;

    /* renamed from: ⶏ  reason: contains not printable characters */
    public int f2250 = 0;

    public C3941(byte[] bArr, InputStream inputStream) {
        this.f2247 = inputStream;
        try {
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(this.f2248);
            this.f2245 = gZIPOutputStream;
            if (bArr != null && bArr.length > 0) {
                gZIPOutputStream.write(bArr, 0, bArr.length);
            }
        } catch (Exception unused) {
        }
    }

    public int available() {
        int r02 = m2108() + this.f2247.available();
        if (r02 > 0) {
            return r02;
        }
        return 0;
    }

    public void close() {
        this.f2247.close();
        this.f2247 = null;
    }

    public int read() {
        if (m2108() == 0) {
            m2107();
            if (m2108() == 0) {
                return -1;
            }
        }
        byte[] bArr = this.f2244;
        int i10 = this.f2250;
        this.f2250 = i10 + 1;
        return bArr[i10];
    }

    /* renamed from: ગ  reason: contains not printable characters */
    public final void m2107() {
        if (!this.f2246) {
            while (m2108() == 0) {
                byte[] bArr = new byte[RecyclerView.n.FLAG_APPEARED_IN_PRE_LAYOUT];
                int read = this.f2247.read(bArr, 0, RecyclerView.n.FLAG_APPEARED_IN_PRE_LAYOUT);
                if (read > 0) {
                    this.f2245.write(bArr, 0, read);
                    if (this.f2248.size() > 0) {
                        byte[] byteArray = this.f2248.toByteArray();
                        this.f2244 = byteArray;
                        this.f2250 = 0;
                        this.f2249 = byteArray.length;
                        this.f2248.reset();
                        this.f2245 = new GZIPOutputStream(this.f2248);
                    }
                } else {
                    this.f2245.finish();
                    this.f2245.close();
                    this.f2246 = true;
                    return;
                }
            }
        }
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public final int m2108() {
        return this.f2249 - this.f2250;
    }

    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    public int read(byte[] bArr, int i10, int i11) {
        int i12 = 0;
        while (i12 < i11) {
            if (m2108() == 0) {
                m2107();
            }
            if (m2108() == 0) {
                break;
            }
            int min = Math.min(i11 - i12, m2108());
            System.arraycopy(this.f2244, this.f2250, bArr, i10 + i12, min);
            i12 += min;
            this.f2250 += min;
        }
        return i12;
    }
}
