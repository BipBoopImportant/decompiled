package ZK;

import YK.C16893a;
import java.util.Arrays;
import java.util.Objects;

/* renamed from: ZK.b  reason: case insensitive filesystem */
public abstract class C17020b {

    /* renamed from: h  reason: collision with root package name */
    protected static final C16893a f140893h = C16893a.LENIENT;

    /* renamed from: i  reason: collision with root package name */
    static final byte[] f140894i = {13, 10};
    @Deprecated

    /* renamed from: a  reason: collision with root package name */
    protected final byte f140895a = 61;

    /* renamed from: b  reason: collision with root package name */
    protected final byte f140896b;

    /* renamed from: c  reason: collision with root package name */
    private final int f140897c;

    /* renamed from: d  reason: collision with root package name */
    private final int f140898d;

    /* renamed from: e  reason: collision with root package name */
    protected final int f140899e;

    /* renamed from: f  reason: collision with root package name */
    private final int f140900f;

    /* renamed from: g  reason: collision with root package name */
    private final C16893a f140901g;

    /* renamed from: ZK.b$a */
    static class a {

        /* renamed from: a  reason: collision with root package name */
        int f140902a;

        /* renamed from: b  reason: collision with root package name */
        long f140903b;

        /* renamed from: c  reason: collision with root package name */
        byte[] f140904c;

        /* renamed from: d  reason: collision with root package name */
        int f140905d;

        /* renamed from: e  reason: collision with root package name */
        int f140906e;

        /* renamed from: f  reason: collision with root package name */
        boolean f140907f;

        /* renamed from: g  reason: collision with root package name */
        int f140908g;

        /* renamed from: h  reason: collision with root package name */
        int f140909h;

        a() {
        }

        public String toString() {
            return String.format("%s[buffer=%s, currentLinePos=%s, eof=%s, ibitWorkArea=%s, lbitWorkArea=%s, modulus=%s, pos=%s, readPos=%s]", new Object[]{getClass().getSimpleName(), Arrays.toString(this.f140904c), Integer.valueOf(this.f140908g), Boolean.valueOf(this.f140907f), Integer.valueOf(this.f140902a), Long.valueOf(this.f140903b), Integer.valueOf(this.f140909h), Integer.valueOf(this.f140905d), Integer.valueOf(this.f140906e)});
        }
    }

    protected C17020b(int i10, int i11, int i12, int i13, byte b10, C16893a aVar) {
        this.f140897c = i10;
        this.f140898d = i11;
        this.f140899e = (i12 <= 0 || i13 <= 0) ? 0 : (i12 / i11) * i11;
        this.f140900f = i13;
        this.f140896b = b10;
        Objects.requireNonNull(aVar, "codecPolicy");
        this.f140901g = aVar;
    }

    private static int b(int i10, int i11) {
        return Integer.compare(i10 - 2147483648, i11 - 2147483648);
    }

    private static int d(int i10) {
        if (i10 < 0) {
            throw new OutOfMemoryError("Unable to allocate array size: " + (((long) i10) & 4294967295L));
        } else if (i10 > 2147483639) {
            return i10;
        } else {
            return 2147483639;
        }
    }

    private static byte[] p(a aVar, int i10) {
        int length = aVar.f140904c.length * 2;
        if (b(length, i10) < 0) {
            length = i10;
        }
        if (b(length, 2147483639) > 0) {
            length = d(i10);
        }
        byte[] bArr = new byte[length];
        byte[] bArr2 = aVar.f140904c;
        System.arraycopy(bArr2, 0, bArr, 0, bArr2.length);
        aVar.f140904c = bArr;
        return bArr;
    }

    /* access modifiers changed from: package-private */
    public int a(a aVar) {
        if (aVar.f140904c != null) {
            return aVar.f140905d - aVar.f140906e;
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    public boolean c(byte[] bArr) {
        if (bArr == null) {
            return false;
        }
        for (byte b10 : bArr) {
            if (this.f140896b == b10 || m(b10)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public abstract void e(byte[] bArr, int i10, int i11, a aVar);

    public byte[] f(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return bArr;
        }
        a aVar = new a();
        e(bArr, 0, bArr.length, aVar);
        e(bArr, 0, -1, aVar);
        int i10 = aVar.f140905d;
        byte[] bArr2 = new byte[i10];
        o(bArr2, 0, i10, aVar);
        return bArr2;
    }

    /* access modifiers changed from: package-private */
    public abstract void g(byte[] bArr, int i10, int i11, a aVar);

    public byte[] h(byte[] bArr) {
        return (bArr == null || bArr.length == 0) ? bArr : i(bArr, 0, bArr.length);
    }

    public byte[] i(byte[] bArr, int i10, int i11) {
        if (bArr == null || bArr.length == 0) {
            return bArr;
        }
        a aVar = new a();
        g(bArr, i10, i11, aVar);
        g(bArr, i10, -1, aVar);
        int i12 = aVar.f140905d - aVar.f140906e;
        byte[] bArr2 = new byte[i12];
        o(bArr2, 0, i12, aVar);
        return bArr2;
    }

    /* access modifiers changed from: protected */
    public byte[] j(int i10, a aVar) {
        byte[] bArr = aVar.f140904c;
        if (bArr == null) {
            aVar.f140904c = new byte[Math.max(i10, k())];
            aVar.f140905d = 0;
            aVar.f140906e = 0;
        } else {
            int i11 = aVar.f140905d;
            if ((i11 + i10) - bArr.length > 0) {
                return p(aVar, i11 + i10);
            }
        }
        return aVar.f140904c;
    }

    /* access modifiers changed from: protected */
    public int k() {
        return 8192;
    }

    public long l(byte[] bArr) {
        int length = bArr.length;
        int i10 = this.f140897c;
        long j10 = ((long) (((length + i10) - 1) / i10)) * ((long) this.f140898d);
        int i11 = this.f140899e;
        return i11 > 0 ? j10 + ((((((long) i11) + j10) - 1) / ((long) i11)) * ((long) this.f140900f)) : j10;
    }

    /* access modifiers changed from: protected */
    public abstract boolean m(byte b10);

    public boolean n() {
        return this.f140901g == C16893a.STRICT;
    }

    /* access modifiers changed from: package-private */
    public int o(byte[] bArr, int i10, int i11, a aVar) {
        if (aVar.f140904c == null) {
            return aVar.f140907f ? -1 : 0;
        }
        int min = Math.min(a(aVar), i11);
        System.arraycopy(aVar.f140904c, aVar.f140906e, bArr, i10, min);
        int i12 = aVar.f140906e + min;
        aVar.f140906e = i12;
        if (i12 >= aVar.f140905d) {
            aVar.f140904c = null;
        }
        return min;
    }
}
