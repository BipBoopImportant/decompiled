package rI;

import gI.C17268b;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u0007\n\u0002\b\u0004\b'\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\u0007J\u001f\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"LrI/c;", "", "<init>", "()V", "", "bitCount", "b", "(I)I", "d", "()I", "until", "e", "from", "f", "(II)I", "", "c", "()F", "a", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: rI.c  reason: case insensitive filesystem */
public abstract class C17853c {

    /* renamed from: a  reason: collision with root package name */
    public static final a f146670a = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public static final C17853c f146671b = C17268b.f143295a.b();

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\tJ\u001f\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"LrI/c$a;", "LrI/c;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "<init>", "()V", "", "bitCount", "b", "(I)I", "d", "()I", "until", "e", "from", "f", "(II)I", "", "c", "()F", "defaultRandom", "LrI/c;", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: rI.c$a */
    public static final class a extends C17853c implements Serializable {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public int b(int i10) {
            return C17853c.f146671b.b(i10);
        }

        public float c() {
            return C17853c.f146671b.c();
        }

        public int d() {
            return C17853c.f146671b.d();
        }

        public int e(int i10) {
            return C17853c.f146671b.e(i10);
        }

        public int f(int i10, int i11) {
            return C17853c.f146671b.f(i10, i11);
        }

        private a() {
        }
    }

    public abstract int b(int i10);

    public float c() {
        return ((float) b(24)) / 1.6777216E7f;
    }

    public int d() {
        return b(32);
    }

    public int e(int i10) {
        return f(0, i10);
    }

    public int f(int i10, int i11) {
        int i12;
        int d10;
        int i13;
        C17854d.c(i10, i11);
        int i14 = i11 - i10;
        if (i14 > 0 || i14 == Integer.MIN_VALUE) {
            if (((-i14) & i14) == i14) {
                i12 = b(C17854d.d(i14));
            } else {
                do {
                    d10 = d() >>> 1;
                    i13 = d10 % i14;
                } while ((d10 - i13) + (i14 - 1) < 0);
                i12 = i13;
            }
            return i10 + i12;
        }
        while (true) {
            int d11 = d();
            if (i10 <= d11 && d11 < i11) {
                return d11;
            }
        }
    }
}
