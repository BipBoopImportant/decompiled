package nK;

import WK.C16762E;
import WK.C16772g;
import WK.C16777l;
import WK.y;
import android.content.Context;
import java.io.Closeable;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import p1.J0;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0011\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u000bH@¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u001f\u0010\b\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u00078\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,¨\u0006-"}, d2 = {"LnK/c;", "LnK/j;", "LWK/E;", "path", "Lp1/J0;", "preview", "Ljava/io/Closeable;", "Lokio/Closeable;", "onClose", "<init>", "(LWK/E;Lp1/J0;Ljava/io/Closeable;)V", "Landroid/content/Context;", "context", "LWK/g;", "C2", "(Landroid/content/Context;)LWK/g;", "Landroid/graphics/BitmapRegionDecoder;", "h2", "(Landroid/content/Context;LdI/e;)Ljava/lang/Object;", "LXH/N;", "close", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LWK/E;", "getPath", "()LWK/E;", "b", "Lp1/J0;", "q2", "()Lp1/J0;", "c", "Ljava/io/Closeable;", "getOnClose", "()Ljava/io/Closeable;", "sub-sampling-image_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: nK.c  reason: case insensitive filesystem */
public final class C17672c implements C17679j {

    /* renamed from: a  reason: collision with root package name */
    private final C16762E f144887a;

    /* renamed from: b  reason: collision with root package name */
    private final J0 f144888b;

    /* renamed from: c  reason: collision with root package name */
    private final Closeable f144889c;

    public C17672c(C16762E e10, J0 j02, Closeable closeable) {
        C17542s.j(e10, "path");
        this.f144887a = e10;
        this.f144888b = j02;
        this.f144889c = closeable;
        if (!e10.n()) {
            throw new IllegalStateException("Check failed.");
        }
    }

    public C16772g C2(Context context) {
        C17542s.j(context, "context");
        return y.d(C16777l.f139691b.B(this.f144887a));
    }

    public void close() {
        Closeable closeable = this.f144889c;
        if (closeable != null) {
            closeable.close();
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17672c)) {
            return false;
        }
        C17672c cVar = (C17672c) obj;
        return C17542s.e(this.f144887a, cVar.f144887a) && C17542s.e(this.f144888b, cVar.f144888b) && C17542s.e(this.f144889c, cVar.f144889c);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0025, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0021, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0022, code lost:
        jI.C17416c.a(r2, r3);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object h2(android.content.Context r2, dI.C17164e<? super android.graphics.BitmapRegionDecoder> r3) {
        /*
            r1 = this;
            WK.E r2 = r1.f144887a
            java.io.File r2 = r2.I()
            r3 = 268435456(0x10000000, float:2.5243549E-29)
            android.os.ParcelFileDescriptor r2 = android.os.ParcelFileDescriptor.open(r2, r3)
            java.io.FileDescriptor r3 = r2.getFileDescriptor()     // Catch:{ all -> 0x001f }
            r0 = 0
            android.graphics.BitmapRegionDecoder r3 = android.graphics.BitmapRegionDecoder.newInstance(r3, r0)     // Catch:{ all -> 0x001f }
            r0 = 0
            jI.C17416c.a(r2, r0)
            java.lang.String r2 = "use(...)"
            kotlin.jvm.internal.C17542s.i(r3, r2)
            return r3
        L_0x001f:
            r3 = move-exception
            throw r3     // Catch:{ all -> 0x0021 }
        L_0x0021:
            r0 = move-exception
            jI.C17416c.a(r2, r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: nK.C17672c.h2(android.content.Context, dI.e):java.lang.Object");
    }

    public int hashCode() {
        int hashCode = this.f144887a.hashCode() * 31;
        J0 j02 = this.f144888b;
        int i10 = 0;
        int hashCode2 = (hashCode + (j02 == null ? 0 : j02.hashCode())) * 31;
        Closeable closeable = this.f144889c;
        if (closeable != null) {
            i10 = closeable.hashCode();
        }
        return hashCode2 + i10;
    }

    public J0 q2() {
        return this.f144888b;
    }

    public String toString() {
        C16762E e10 = this.f144887a;
        J0 j02 = this.f144888b;
        Closeable closeable = this.f144889c;
        return "FileImageSource(path=" + e10 + ", preview=" + j02 + ", onClose=" + closeable + ")";
    }
}
