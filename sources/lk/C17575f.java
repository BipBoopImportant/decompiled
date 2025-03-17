package lK;

import HJ.C15854t;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\u0010\u0019\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\f\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\r\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0006¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0004¢\u0006\f\n\u0004\b\t\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\"\u0010\u001f\u001a\u00020\u00068\u0016@\u0016X\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u0015¨\u0006 "}, d2 = {"LlK/f;", "", "", "buffer", "<init>", "([C)V", "", "index", "", "a", "(I)C", "startIndex", "endIndex", "subSequence", "(II)Ljava/lang/CharSequence;", "", "e", "(II)Ljava/lang/String;", "newSize", "LXH/N;", "f", "(I)V", "toString", "()Ljava/lang/String;", "[C", "b", "()[C", "I", "c", "()I", "d", "length", "kotlinx-serialization-json"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: lK.f  reason: case insensitive filesystem */
public final class C17575f implements CharSequence {

    /* renamed from: a  reason: collision with root package name */
    private final char[] f144513a;

    /* renamed from: b  reason: collision with root package name */
    private int f144514b;

    public C17575f(char[] cArr) {
        C17542s.j(cArr, "buffer");
        this.f144513a = cArr;
        this.f144514b = cArr.length;
    }

    public char a(int i10) {
        return this.f144513a[i10];
    }

    public final char[] b() {
        return this.f144513a;
    }

    public int c() {
        return this.f144514b;
    }

    public final /* bridge */ char charAt(int i10) {
        return a(i10);
    }

    public void d(int i10) {
        this.f144514b = i10;
    }

    public final String e(int i10, int i11) {
        return C15854t.y(this.f144513a, i10, Math.min(i11, length()));
    }

    public final void f(int i10) {
        d(Math.min(this.f144513a.length, i10));
    }

    public final /* bridge */ int length() {
        return c();
    }

    public CharSequence subSequence(int i10, int i11) {
        return C15854t.y(this.f144513a, i10, Math.min(i11, length()));
    }

    public String toString() {
        return e(0, length());
    }
}
