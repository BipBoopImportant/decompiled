package WK;

import YH.C16870n;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u0000 \"2\u00020\u0001:\u0001\u0018B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003B1\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\u0002\u0010\fJ\r\u0010\r\u001a\u00020\u0000¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\u0000¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0010\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0010\u0010\u000eJ\u0015\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0006¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0018\u0010\u0003J\u001d\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0006¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u001cR\u0016\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u001dR\u0016\u0010\b\u001a\u00020\u00068\u0006@\u0006X\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u001dR\u0016\u0010\n\u001a\u00020\t8\u0006@\u0006X\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u001eR\u0016\u0010\u000b\u001a\u00020\t8\u0006@\u0006X\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u001eR\u0018\u0010 \u001a\u0004\u0018\u00010\u00008\u0006@\u0006X\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u001fR\u0018\u0010!\u001a\u0004\u0018\u00010\u00008\u0006@\u0006X\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001f¨\u0006#"}, d2 = {"LWK/I;", "", "<init>", "()V", "", "data", "", "pos", "limit", "", "shared", "owner", "([BIIZZ)V", "d", "()LWK/I;", "f", "b", "segment", "c", "(LWK/I;)LWK/I;", "byteCount", "e", "(I)LWK/I;", "LXH/N;", "a", "sink", "g", "(LWK/I;I)V", "[B", "I", "Z", "LWK/I;", "next", "prev", "h", "okio"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class I {

    /* renamed from: h  reason: collision with root package name */
    public static final a f139609h = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f139610a;

    /* renamed from: b  reason: collision with root package name */
    public int f139611b;

    /* renamed from: c  reason: collision with root package name */
    public int f139612c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f139613d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f139614e;

    /* renamed from: f  reason: collision with root package name */
    public I f139615f;

    /* renamed from: g  reason: collision with root package name */
    public I f139616g;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"LWK/I$a;", "", "<init>", "()V", "", "SIZE", "I", "SHARE_MINIMUM", "okio"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public I() {
        this.f139610a = new byte[8192];
        this.f139614e = true;
        this.f139613d = false;
    }

    public final void a() {
        int i10;
        I i11 = this.f139616g;
        if (i11 != this) {
            C17542s.g(i11);
            if (i11.f139614e) {
                int i12 = this.f139612c - this.f139611b;
                I i13 = this.f139616g;
                C17542s.g(i13);
                int i14 = 8192 - i13.f139612c;
                I i15 = this.f139616g;
                C17542s.g(i15);
                if (i15.f139613d) {
                    i10 = 0;
                } else {
                    I i16 = this.f139616g;
                    C17542s.g(i16);
                    i10 = i16.f139611b;
                }
                if (i12 <= i14 + i10) {
                    I i17 = this.f139616g;
                    C17542s.g(i17);
                    g(i17, i12);
                    b();
                    J.b(this);
                    return;
                }
                return;
            }
            return;
        }
        throw new IllegalStateException("cannot compact");
    }

    public final I b() {
        I i10 = this.f139615f;
        if (i10 == this) {
            i10 = null;
        }
        I i11 = this.f139616g;
        C17542s.g(i11);
        i11.f139615f = this.f139615f;
        I i12 = this.f139615f;
        C17542s.g(i12);
        i12.f139616g = this.f139616g;
        this.f139615f = null;
        this.f139616g = null;
        return i10;
    }

    public final I c(I i10) {
        C17542s.j(i10, "segment");
        i10.f139616g = this;
        i10.f139615f = this.f139615f;
        I i11 = this.f139615f;
        C17542s.g(i11);
        i11.f139616g = i10;
        this.f139615f = i10;
        return i10;
    }

    public final I d() {
        this.f139613d = true;
        return new I(this.f139610a, this.f139611b, this.f139612c, true, false);
    }

    public final I e(int i10) {
        I i11;
        if (i10 <= 0 || i10 > this.f139612c - this.f139611b) {
            throw new IllegalArgumentException("byteCount out of range");
        }
        if (i10 >= 1024) {
            i11 = d();
        } else {
            i11 = J.c();
            byte[] bArr = this.f139610a;
            byte[] bArr2 = i11.f139610a;
            int i12 = this.f139611b;
            C16870n.o(bArr, bArr2, 0, i12, i12 + i10, 2, (Object) null);
        }
        i11.f139612c = i11.f139611b + i10;
        this.f139611b += i10;
        I i13 = this.f139616g;
        C17542s.g(i13);
        i13.c(i11);
        return i11;
    }

    public final I f() {
        byte[] bArr = this.f139610a;
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        C17542s.i(copyOf, "copyOf(...)");
        return new I(copyOf, this.f139611b, this.f139612c, false, true);
    }

    public final void g(I i10, int i11) {
        C17542s.j(i10, "sink");
        if (i10.f139614e) {
            int i12 = i10.f139612c;
            if (i12 + i11 > 8192) {
                if (!i10.f139613d) {
                    int i13 = i10.f139611b;
                    if ((i12 + i11) - i13 <= 8192) {
                        byte[] bArr = i10.f139610a;
                        C16870n.o(bArr, bArr, 0, i13, i12, 2, (Object) null);
                        i10.f139612c -= i10.f139611b;
                        i10.f139611b = 0;
                    } else {
                        throw new IllegalArgumentException();
                    }
                } else {
                    throw new IllegalArgumentException();
                }
            }
            byte[] bArr2 = this.f139610a;
            byte[] bArr3 = i10.f139610a;
            int i14 = i10.f139612c;
            int i15 = this.f139611b;
            C16870n.i(bArr2, bArr3, i14, i15, i15 + i11);
            i10.f139612c += i11;
            this.f139611b += i11;
            return;
        }
        throw new IllegalStateException("only owner can write");
    }

    public I(byte[] bArr, int i10, int i11, boolean z10, boolean z11) {
        C17542s.j(bArr, "data");
        this.f139610a = bArr;
        this.f139611b = i10;
        this.f139612c = i11;
        this.f139613d = z10;
        this.f139614e = z11;
    }
}
