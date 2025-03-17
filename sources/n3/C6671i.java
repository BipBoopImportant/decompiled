package N3;

import androidx.recyclerview.widget.RecyclerView;
import com.google.ar.core.ImageMetadata;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;
import q3.C5799j;
import q3.x;
import t3.N;

/* renamed from: N3.i  reason: case insensitive filesystem */
public final class C6671i implements C6679q {

    /* renamed from: a  reason: collision with root package name */
    private final byte[] f38887a = new byte[RecyclerView.n.FLAG_APPEARED_IN_PRE_LAYOUT];

    /* renamed from: b  reason: collision with root package name */
    private final C5799j f38888b;

    /* renamed from: c  reason: collision with root package name */
    private final long f38889c;

    /* renamed from: d  reason: collision with root package name */
    private long f38890d;

    /* renamed from: e  reason: collision with root package name */
    private byte[] f38891e = new byte[ImageMetadata.CONTROL_AE_ANTIBANDING_MODE];

    /* renamed from: f  reason: collision with root package name */
    private int f38892f;

    /* renamed from: g  reason: collision with root package name */
    private int f38893g;

    static {
        x.a("media3.extractor");
    }

    public C6671i(C5799j jVar, long j10, long j11) {
        this.f38888b = jVar;
        this.f38890d = j10;
        this.f38889c = j11;
    }

    private void p(int i10) {
        if (i10 != -1) {
            this.f38890d += (long) i10;
        }
    }

    private void q(int i10) {
        int i11 = this.f38892f + i10;
        byte[] bArr = this.f38891e;
        if (i11 > bArr.length) {
            this.f38891e = Arrays.copyOf(this.f38891e, N.p(bArr.length * 2, ImageMetadata.CONTROL_AE_ANTIBANDING_MODE + i11, i11 + ImageMetadata.LENS_APERTURE));
        }
    }

    private int r(byte[] bArr, int i10, int i11) {
        int i12 = this.f38893g;
        if (i12 == 0) {
            return 0;
        }
        int min = Math.min(i12, i11);
        System.arraycopy(this.f38891e, 0, bArr, i10, min);
        v(min);
        return min;
    }

    private int s(byte[] bArr, int i10, int i11, int i12, boolean z10) {
        if (!Thread.interrupted()) {
            int c10 = this.f38888b.c(bArr, i10 + i12, i11 - i12);
            if (c10 != -1) {
                return i12 + c10;
            }
            if (i12 == 0 && z10) {
                return -1;
            }
            throw new EOFException();
        }
        throw new InterruptedIOException();
    }

    private int t(int i10) {
        int min = Math.min(this.f38893g, i10);
        v(min);
        return min;
    }

    private void v(int i10) {
        int i11 = this.f38893g - i10;
        this.f38893g = i11;
        this.f38892f = 0;
        byte[] bArr = this.f38891e;
        byte[] bArr2 = i11 < bArr.length - ImageMetadata.LENS_APERTURE ? new byte[(ImageMetadata.CONTROL_AE_ANTIBANDING_MODE + i11)] : bArr;
        System.arraycopy(bArr, i10, bArr2, 0, i11);
        this.f38891e = bArr2;
    }

    public int a(int i10) {
        int t10 = t(i10);
        if (t10 == 0) {
            byte[] bArr = this.f38887a;
            t10 = s(bArr, 0, Math.min(i10, bArr.length), 0, true);
        }
        p(t10);
        return t10;
    }

    public int c(byte[] bArr, int i10, int i11) {
        int r10 = r(bArr, i10, i11);
        if (r10 == 0) {
            r10 = s(bArr, i10, i11, 0, true);
        }
        p(r10);
        return r10;
    }

    public boolean d(byte[] bArr, int i10, int i11, boolean z10) {
        if (!m(i11, z10)) {
            return false;
        }
        System.arraycopy(this.f38891e, this.f38892f - i11, bArr, i10, i11);
        return true;
    }

    public void f() {
        this.f38892f = 0;
    }

    public boolean g(byte[] bArr, int i10, int i11, boolean z10) {
        int r10 = r(bArr, i10, i11);
        while (r10 < i11 && r10 != -1) {
            r10 = s(bArr, i10, i11, r10, z10);
        }
        p(r10);
        return r10 != -1;
    }

    public long getLength() {
        return this.f38889c;
    }

    public long getPosition() {
        return this.f38890d;
    }

    public long h() {
        return this.f38890d + ((long) this.f38892f);
    }

    public void i(int i10) {
        m(i10, false);
    }

    public int j(byte[] bArr, int i10, int i11) {
        int i12;
        q(i11);
        int i13 = this.f38893g;
        int i14 = this.f38892f;
        int i15 = i13 - i14;
        if (i15 == 0) {
            i12 = s(this.f38891e, i14, i11, 0, true);
            if (i12 == -1) {
                return -1;
            }
            this.f38893g += i12;
        } else {
            i12 = Math.min(i11, i15);
        }
        System.arraycopy(this.f38891e, this.f38892f, bArr, i10, i12);
        this.f38892f += i12;
        return i12;
    }

    public void k(int i10) {
        u(i10, false);
    }

    public boolean m(int i10, boolean z10) {
        q(i10);
        int i11 = this.f38893g - this.f38892f;
        while (i11 < i10) {
            i11 = s(this.f38891e, this.f38892f, i10, i11, z10);
            if (i11 == -1) {
                return false;
            }
            this.f38893g = this.f38892f + i11;
        }
        this.f38892f += i10;
        return true;
    }

    public void o(byte[] bArr, int i10, int i11) {
        d(bArr, i10, i11, false);
    }

    public void readFully(byte[] bArr, int i10, int i11) {
        g(bArr, i10, i11, false);
    }

    public boolean u(int i10, boolean z10) {
        int t10 = t(i10);
        while (t10 < i10 && t10 != -1) {
            t10 = s(this.f38887a, -t10, Math.min(i10, this.f38887a.length + t10), t10, z10);
        }
        p(t10);
        return t10 != -1;
    }
}
