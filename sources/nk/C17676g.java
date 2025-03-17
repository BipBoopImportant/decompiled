package nK;

import WK.C16772g;
import WK.y;
import android.annotation.SuppressLint;
import android.content.Context;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import p1.J0;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0011\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\bH@¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\u0017R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#¨\u0006$"}, d2 = {"LnK/g;", "LnK/j;", "", "id", "Lp1/J0;", "preview", "<init>", "(ILp1/J0;)V", "Landroid/content/Context;", "context", "Ljava/io/InputStream;", "d", "(Landroid/content/Context;)Ljava/io/InputStream;", "LWK/g;", "C2", "(Landroid/content/Context;)LWK/g;", "Landroid/graphics/BitmapRegionDecoder;", "h2", "(Landroid/content/Context;LdI/e;)Ljava/lang/Object;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "c", "b", "Lp1/J0;", "q2", "()Lp1/J0;", "sub-sampling-image_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: nK.g  reason: case insensitive filesystem */
public final class C17676g implements C17679j {

    /* renamed from: a  reason: collision with root package name */
    private final int f144926a;

    /* renamed from: b  reason: collision with root package name */
    private final J0 f144927b;

    public C17676g(int i10, J0 j02) {
        this.f144926a = i10;
        this.f144927b = j02;
    }

    @SuppressLint({"ResourceType"})
    private final InputStream d(Context context) {
        InputStream openRawResource = context.getResources().openRawResource(this.f144926a);
        C17542s.i(openRawResource, "openRawResource(...)");
        return openRawResource;
    }

    public C16772g C2(Context context) {
        C17542s.j(context, "context");
        return y.d(y.l(d(context)));
    }

    public final int c() {
        return this.f144926a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17676g)) {
            return false;
        }
        C17676g gVar = (C17676g) obj;
        return this.f144926a == gVar.f144926a && C17542s.e(this.f144927b, gVar.f144927b);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001c, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0018, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0019, code lost:
        jI.C17416c.a(r2, r3);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object h2(android.content.Context r2, dI.C17164e<? super android.graphics.BitmapRegionDecoder> r3) {
        /*
            r1 = this;
            java.io.InputStream r2 = r1.d(r2)
            r3 = 0
            android.graphics.BitmapRegionDecoder r3 = android.graphics.BitmapRegionDecoder.newInstance(r2, r3)     // Catch:{ all -> 0x0016 }
            kotlin.jvm.internal.C17542s.g(r3)     // Catch:{ all -> 0x0016 }
            r0 = 0
            jI.C17416c.a(r2, r0)
            java.lang.String r2 = "use(...)"
            kotlin.jvm.internal.C17542s.i(r3, r2)
            return r3
        L_0x0016:
            r3 = move-exception
            throw r3     // Catch:{ all -> 0x0018 }
        L_0x0018:
            r0 = move-exception
            jI.C17416c.a(r2, r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: nK.C17676g.h2(android.content.Context, dI.e):java.lang.Object");
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.f144926a) * 31;
        J0 j02 = this.f144927b;
        return hashCode + (j02 == null ? 0 : j02.hashCode());
    }

    public J0 q2() {
        return this.f144927b;
    }

    public String toString() {
        int i10 = this.f144926a;
        J0 j02 = this.f144927b;
        return "ResourceImageSource(id=" + i10 + ", preview=" + j02 + ")";
    }
}
