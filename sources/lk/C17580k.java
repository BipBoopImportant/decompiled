package lK;

import XH.C16807N;
import YH.C16869m;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0019\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0010\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0006H\u0004¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\r8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u000eR\u0016\u0010\u0011\u001a\u00020\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u0010¨\u0006\u0012"}, d2 = {"LlK/k;", "", "<init>", "()V", "", "size", "", "b", "(I)[C", "array", "LXH/N;", "a", "([C)V", "LYH/m;", "LYH/m;", "arrays", "I", "charsTotal", "kotlinx-serialization-json"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: lK.k  reason: case insensitive filesystem */
public class C17580k {

    /* renamed from: a  reason: collision with root package name */
    private final C16869m<char[]> f144523a = new C16869m<>();

    /* renamed from: b  reason: collision with root package name */
    private int f144524b;

    /* access modifiers changed from: protected */
    public final void a(char[] cArr) {
        C17542s.j(cArr, "array");
        synchronized (this) {
            try {
                if (this.f144524b + cArr.length < C17576g.f144515a) {
                    this.f144524b += cArr.length;
                    this.f144523a.addLast(cArr);
                }
                C16807N n10 = C16807N.f139792a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* access modifiers changed from: protected */
    public final char[] b(int i10) {
        char[] E10;
        synchronized (this) {
            E10 = this.f144523a.E();
            if (E10 != null) {
                this.f144524b -= E10.length;
            } else {
                E10 = null;
            }
        }
        return E10 == null ? new char[i10] : E10;
    }
}
