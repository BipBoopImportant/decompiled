package RH;

import HJ.C15835a;
import SH.C16416a;
import XH.C16814e;
import XH.C16820k;
import java.io.EOFException;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\u0005\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0017\u0018\u0000 22\u00020\u0001:\u0001\u000bB\u0012\u0012\u0006\u0010\u0003\u001a\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u0010\u0010\nJ\u0015\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0006¢\u0006\u0004\b\u0012\u0010\nJ\u0015\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u0006¢\u0006\u0004\b\u0014\u0010\nJ\r\u0010\u0015\u001a\u00020\b¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u0006¢\u0006\u0004\b\u0018\u0010\nJ\u000f\u0010\u0019\u001a\u00020\bH\u0000¢\u0006\u0004\b\u0019\u0010\u0016J\u000f\u0010\u001a\u001a\u00020\bH\u0000¢\u0006\u0004\b\u001a\u0010\u0016J\u0017\u0010\u001c\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u001c\u0010\nJ\u0017\u0010\u001e\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u0000H\u0014¢\u0006\u0004\b\u001e\u0010\u001fJ\r\u0010!\u001a\u00020 ¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\bH\u0016¢\u0006\u0004\b#\u0010\u0016J\u000f\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b%\u0010&R \u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u000b\u0010'\u001a\u0004\b(\u0010)R$\u0010.\u001a\u00020\u00062\u0006\u0010*\u001a\u00020\u00068\u0006@BX\u000e¢\u0006\f\n\u0004\b\u000e\u0010+\u001a\u0004\b,\u0010-R$\u00100\u001a\u00020\u00062\u0006\u0010*\u001a\u00020\u00068\u0006@BX\u000e¢\u0006\f\n\u0004\b\t\u0010+\u001a\u0004\b/\u0010-R$\u0010\u0011\u001a\u00020\u00062\u0006\u0010*\u001a\u00020\u00068\u0006@BX\u000e¢\u0006\f\n\u0004\b\u0010\u0010+\u001a\u0004\b1\u0010-R$\u0010\u0017\u001a\u00020\u00062\u0006\u0010*\u001a\u00020\u00068\u0006@BX\u000e¢\u0006\f\n\u0004\b\u001e\u0010+\u001a\u0004\b2\u0010-R\u0017\u00104\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b3\u0010+\u001a\u0004\b3\u0010-\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00065"}, d2 = {"LRH/a;", "", "LPH/c;", "memory", "<init>", "(Ljava/nio/ByteBuffer;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "count", "LXH/N;", "c", "(I)V", "a", "position", "", "b", "(I)Z", "d", "startGap", "q", "endGap", "p", "s", "()V", "limit", "t", "n", "m", "newReadPosition", "o", "copy", "e", "(LRH/a;)V", "", "l", "()B", "r", "", "toString", "()Ljava/lang/String;", "Ljava/nio/ByteBuffer;", "h", "()Ljava/nio/ByteBuffer;", "<set-?>", "I", "i", "()I", "readPosition", "k", "writePosition", "j", "g", "f", "capacity", "ktor-io"}, k = 1, mv = {1, 8, 0}, xi = 48)
@C16814e
/* renamed from: RH.a  reason: case insensitive filesystem */
public class C16368a {

    /* renamed from: g  reason: collision with root package name */
    public static final C3376a f137958g = new C3376a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final ByteBuffer f137959a;

    /* renamed from: b  reason: collision with root package name */
    private int f137960b;

    /* renamed from: c  reason: collision with root package name */
    private int f137961c;

    /* renamed from: d  reason: collision with root package name */
    private int f137962d;

    /* renamed from: e  reason: collision with root package name */
    private int f137963e;

    /* renamed from: f  reason: collision with root package name */
    private final int f137964f;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0007\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0006XT¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"LRH/a$a;", "", "<init>", "()V", "LRH/a;", "a", "()LRH/a;", "Empty", "", "ReservedSize", "I", "ktor-io"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: RH.a$a  reason: collision with other inner class name */
    public static final class C3376a {
        public /* synthetic */ C3376a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C16368a a() {
            return C16416a.f138260j.a();
        }

        private C3376a() {
        }
    }

    public /* synthetic */ C16368a(ByteBuffer byteBuffer, DefaultConstructorMarker defaultConstructorMarker) {
        this(byteBuffer);
    }

    public final void a(int i10) {
        int i11 = this.f137961c + i10;
        if (i10 < 0 || i11 > this.f137963e) {
            C16371d.a(i10, g() - k());
            throw new C16820k();
        } else {
            this.f137961c = i11;
        }
    }

    public final boolean b(int i10) {
        int i11 = this.f137963e;
        int i12 = this.f137961c;
        if (i10 < i12) {
            C16371d.a(i10 - i12, g() - k());
            throw new C16820k();
        } else if (i10 < i11) {
            this.f137961c = i10;
            return true;
        } else if (i10 == i11) {
            this.f137961c = i10;
            return false;
        } else {
            C16371d.a(i10 - i12, g() - k());
            throw new C16820k();
        }
    }

    public final void c(int i10) {
        if (i10 != 0) {
            int i11 = this.f137960b + i10;
            if (i10 < 0 || i11 > this.f137961c) {
                C16371d.b(i10, k() - i());
                throw new C16820k();
            } else {
                this.f137960b = i11;
            }
        }
    }

    public final void d(int i10) {
        if (i10 < 0 || i10 > this.f137961c) {
            C16371d.b(i10 - this.f137960b, k() - i());
            throw new C16820k();
        } else if (this.f137960b != i10) {
            this.f137960b = i10;
        }
    }

    /* access modifiers changed from: protected */
    public void e(C16368a aVar) {
        C17542s.j(aVar, "copy");
        aVar.f137963e = this.f137963e;
        aVar.f137962d = this.f137962d;
        aVar.f137960b = this.f137960b;
        aVar.f137961c = this.f137961c;
    }

    public final int f() {
        return this.f137964f;
    }

    public final int g() {
        return this.f137963e;
    }

    public final ByteBuffer h() {
        return this.f137959a;
    }

    public final int i() {
        return this.f137960b;
    }

    public final int j() {
        return this.f137962d;
    }

    public final int k() {
        return this.f137961c;
    }

    public final byte l() {
        int i10 = this.f137960b;
        if (i10 != this.f137961c) {
            this.f137960b = i10 + 1;
            return this.f137959a.get(i10);
        }
        throw new EOFException("No readable bytes available.");
    }

    public final void m() {
        this.f137963e = this.f137964f;
    }

    public final void n() {
        o(0);
        m();
    }

    public final void o(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException(("newReadPosition shouldn't be negative: " + i10).toString());
        } else if (i10 <= this.f137960b) {
            this.f137960b = i10;
            if (this.f137962d > i10) {
                this.f137962d = i10;
            }
        } else {
            throw new IllegalArgumentException(("newReadPosition shouldn't be ahead of the read position: " + i10 + " > " + this.f137960b).toString());
        }
    }

    public final void p(int i10) {
        if (i10 >= 0) {
            int i11 = this.f137964f - i10;
            if (i11 >= this.f137961c) {
                this.f137963e = i11;
                return;
            }
            if (i11 < 0) {
                C16371d.c(this, i10);
            }
            if (i11 < this.f137962d) {
                C16371d.e(this, i10);
            }
            if (this.f137960b == this.f137961c) {
                this.f137963e = i11;
                this.f137960b = i11;
                this.f137961c = i11;
                return;
            }
            C16371d.d(this, i10);
            return;
        }
        throw new IllegalArgumentException(("endGap shouldn't be negative: " + i10).toString());
    }

    public final void q(int i10) {
        if (i10 >= 0) {
            int i11 = this.f137960b;
            if (i11 >= i10) {
                this.f137962d = i10;
            } else if (i11 != this.f137961c) {
                C16371d.g(this, i10);
                throw new C16820k();
            } else if (i10 <= this.f137963e) {
                this.f137961c = i10;
                this.f137960b = i10;
                this.f137962d = i10;
            } else {
                C16371d.h(this, i10);
                throw new C16820k();
            }
        } else {
            throw new IllegalArgumentException(("startGap shouldn't be negative: " + i10).toString());
        }
    }

    public void r() {
        n();
        s();
    }

    public final void s() {
        t(this.f137964f - this.f137962d);
    }

    public final void t(int i10) {
        int i11 = this.f137962d;
        this.f137960b = i11;
        this.f137961c = i11;
        this.f137963e = i10;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Buffer[0x");
        String num = Integer.toString(hashCode(), C15835a.a(16));
        C17542s.i(num, "toString(this, checkRadix(radix))");
        sb2.append(num);
        sb2.append("](");
        sb2.append(k() - i());
        sb2.append(" used, ");
        sb2.append(g() - k());
        sb2.append(" free, ");
        sb2.append(this.f137962d + (f() - g()));
        sb2.append(" reserved of ");
        sb2.append(this.f137964f);
        sb2.append(')');
        return sb2.toString();
    }

    private C16368a(ByteBuffer byteBuffer) {
        C17542s.j(byteBuffer, "memory");
        this.f137959a = byteBuffer;
        this.f137963e = byteBuffer.limit();
        this.f137964f = byteBuffer.limit();
    }
}
