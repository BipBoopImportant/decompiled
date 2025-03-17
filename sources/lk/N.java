package lK;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import tI.C17978n;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\f\n\u0002\b\n\n\u0002\u0010\u0019\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001e\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001f\u0010\u0003J\u000f\u0010 \u001a\u00020\u0007H\u0016¢\u0006\u0004\b \u0010!R\u0016\u0010$\u001a\u00020\"8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010#R\u0016\u0010&\u001a\u00020\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010%¨\u0006'"}, d2 = {"LlK/N;", "LlK/v;", "<init>", "()V", "", "firstEscapedChar", "currentSize", "", "string", "LXH/N;", "e", "(IILjava/lang/String;)V", "expected", "f", "(I)V", "oldSize", "additional", "g", "(II)I", "", "value", "c", "(J)V", "", "char", "a", "(C)V", "text", "d", "(Ljava/lang/String;)V", "b", "h", "toString", "()Ljava/lang/String;", "", "[C", "array", "I", "size", "kotlinx-serialization-json"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class N implements C17590v {

    /* renamed from: a  reason: collision with root package name */
    private char[] f144435a = C17579j.f144522c.d();

    /* renamed from: b  reason: collision with root package name */
    private int f144436b;

    private final void e(int i10, int i11, String str) {
        int i12;
        int length = str.length();
        while (i10 < length) {
            int g10 = g(i11, 2);
            char charAt = str.charAt(i10);
            if (charAt < g0.a().length) {
                byte b10 = g0.a()[charAt];
                if (b10 == 0) {
                    i12 = g10 + 1;
                    this.f144435a[g10] = (char) charAt;
                } else {
                    if (b10 == 1) {
                        String str2 = g0.b()[charAt];
                        C17542s.g(str2);
                        int g11 = g(g10, str2.length());
                        str2.getChars(0, str2.length(), this.f144435a, g11);
                        i11 = g11 + str2.length();
                        this.f144436b = i11;
                    } else {
                        char[] cArr = this.f144435a;
                        cArr[g10] = '\\';
                        cArr[g10 + 1] = (char) b10;
                        i11 = g10 + 2;
                        this.f144436b = i11;
                    }
                    i10++;
                }
            } else {
                i12 = g10 + 1;
                this.f144435a[g10] = (char) charAt;
            }
            i11 = i12;
            i10++;
        }
        int g12 = g(i11, 1);
        this.f144435a[g12] = '\"';
        this.f144436b = g12 + 1;
    }

    private final void f(int i10) {
        g(this.f144436b, i10);
    }

    private final int g(int i10, int i11) {
        int i12 = i11 + i10;
        char[] cArr = this.f144435a;
        if (cArr.length <= i12) {
            char[] copyOf = Arrays.copyOf(cArr, C17978n.e(i12, i10 * 2));
            C17542s.i(copyOf, "copyOf(...)");
            this.f144435a = copyOf;
        }
        return i10;
    }

    public void a(char c10) {
        f(1);
        char[] cArr = this.f144435a;
        int i10 = this.f144436b;
        this.f144436b = i10 + 1;
        cArr[i10] = c10;
    }

    public void b(String str) {
        C17542s.j(str, "text");
        f(str.length() + 2);
        char[] cArr = this.f144435a;
        int i10 = this.f144436b;
        int i11 = i10 + 1;
        cArr[i10] = '\"';
        int length = str.length();
        str.getChars(0, length, cArr, i11);
        int i12 = length + i11;
        int i13 = i11;
        while (i13 < i12) {
            char c10 = cArr[i13];
            if (c10 >= g0.a().length || g0.a()[c10] == 0) {
                i13++;
            } else {
                e(i13 - i11, i13, str);
                return;
            }
        }
        cArr[i12] = '\"';
        this.f144436b = i12 + 1;
    }

    public void c(long j10) {
        d(String.valueOf(j10));
    }

    public void d(String str) {
        C17542s.j(str, "text");
        int length = str.length();
        if (length != 0) {
            f(length);
            str.getChars(0, str.length(), this.f144435a, this.f144436b);
            this.f144436b += length;
        }
    }

    public void h() {
        C17579j.f144522c.c(this.f144435a);
    }

    public String toString() {
        return new String(this.f144435a, 0, this.f144436b);
    }
}
