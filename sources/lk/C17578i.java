package lK;

import YH.C16869m;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0010\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\t8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\nR\u0016\u0010\u000e\u001a\u00020\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"LlK/i;", "", "<init>", "()V", "", "size", "", "a", "(I)[B", "LYH/m;", "LYH/m;", "arrays", "b", "I", "bytesTotal", "kotlinx-serialization-json"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: lK.i  reason: case insensitive filesystem */
public class C17578i {

    /* renamed from: a  reason: collision with root package name */
    private final C16869m<byte[]> f144519a = new C16869m<>();

    /* renamed from: b  reason: collision with root package name */
    private int f144520b;

    /* access modifiers changed from: protected */
    public final byte[] a(int i10) {
        byte[] E10;
        synchronized (this) {
            E10 = this.f144519a.E();
            if (E10 != null) {
                this.f144520b -= E10.length / 2;
            } else {
                E10 = null;
            }
        }
        return E10 == null ? new byte[i10] : E10;
    }
}
