package lK;

import HJ.C15838d;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0019\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\r8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u000e¨\u0006\u0010"}, d2 = {"LlK/w;", "LlK/u;", "Ljava/io/InputStream;", "stream", "<init>", "(Ljava/io/InputStream;)V", "", "buffer", "", "bufferOffset", "count", "a", "([CII)I", "LlK/m;", "LlK/m;", "reader", "kotlinx-serialization-json"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: lK.w  reason: case insensitive filesystem */
public final class C17591w implements C17589u {

    /* renamed from: a  reason: collision with root package name */
    private final C17582m f144542a;

    public C17591w(InputStream inputStream) {
        C17542s.j(inputStream, "stream");
        this.f144542a = new C17582m(inputStream, C15838d.f135279b);
    }

    public int a(char[] cArr, int i10, int i11) {
        C17542s.j(cArr, "buffer");
        return this.f144542a.d(cArr, i10, i11);
    }
}
