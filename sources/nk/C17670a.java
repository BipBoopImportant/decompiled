package nK;

import WK.C16772g;
import WK.y;
import android.content.Context;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p1.J0;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0011\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\bH@¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0003\u001a\u00020\u00028\u0002X\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006$"}, d2 = {"LnK/a;", "LnK/j;", "LnK/b;", "asset", "Lp1/J0;", "preview", "<init>", "(Ljava/lang/String;Lp1/J0;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroid/content/Context;", "context", "Ljava/io/InputStream;", "c", "(Landroid/content/Context;)Ljava/io/InputStream;", "LWK/g;", "C2", "(Landroid/content/Context;)LWK/g;", "Landroid/graphics/BitmapRegionDecoder;", "h2", "(Landroid/content/Context;LdI/e;)Ljava/lang/Object;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Lp1/J0;", "q2", "()Lp1/J0;", "sub-sampling-image_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: nK.a  reason: case insensitive filesystem */
public final class C17670a implements C17679j {

    /* renamed from: a  reason: collision with root package name */
    private final String f144885a;

    /* renamed from: b  reason: collision with root package name */
    private final J0 f144886b;

    public /* synthetic */ C17670a(String str, J0 j02, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j02);
    }

    private final InputStream c(Context context) {
        InputStream open = context.getAssets().open(this.f144885a, 1);
        C17542s.i(open, "open(...)");
        return open;
    }

    public C16772g C2(Context context) {
        C17542s.j(context, "context");
        return y.d(y.l(c(context)));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17670a)) {
            return false;
        }
        C17670a aVar = (C17670a) obj;
        return C17671b.b(this.f144885a, aVar.f144885a) && C17542s.e(this.f144886b, aVar.f144886b);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0025, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0026, code lost:
        jI.C17416c.a(r2, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0029, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object h2(android.content.Context r2, dI.C17164e<? super android.graphics.BitmapRegionDecoder> r3) {
        /*
            r1 = this;
            java.io.InputStream r2 = r1.c(r2)
            boolean r3 = r2 instanceof android.content.res.AssetManager.AssetInputStream     // Catch:{ all -> 0x001a }
            if (r3 == 0) goto L_0x001c
            r3 = 0
            android.graphics.BitmapRegionDecoder r3 = android.graphics.BitmapRegionDecoder.newInstance(r2, r3)     // Catch:{ all -> 0x001a }
            kotlin.jvm.internal.C17542s.g(r3)     // Catch:{ all -> 0x001a }
            r0 = 0
            jI.C17416c.a(r2, r0)
            java.lang.String r2 = "use(...)"
            kotlin.jvm.internal.C17542s.i(r3, r2)
            return r3
        L_0x001a:
            r3 = move-exception
            goto L_0x0024
        L_0x001c:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException     // Catch:{ all -> 0x001a }
            java.lang.String r0 = "BitmapRegionDecoder won't be able to optimize reading of this asset"
            r3.<init>(r0)     // Catch:{ all -> 0x001a }
            throw r3     // Catch:{ all -> 0x001a }
        L_0x0024:
            throw r3     // Catch:{ all -> 0x0025 }
        L_0x0025:
            r0 = move-exception
            jI.C17416c.a(r2, r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: nK.C17670a.h2(android.content.Context, dI.e):java.lang.Object");
    }

    public int hashCode() {
        int c10 = C17671b.c(this.f144885a) * 31;
        J0 j02 = this.f144886b;
        return c10 + (j02 == null ? 0 : j02.hashCode());
    }

    public J0 q2() {
        return this.f144886b;
    }

    public String toString() {
        String d10 = C17671b.d(this.f144885a);
        J0 j02 = this.f144886b;
        return "AssetImageSource(asset=" + d10 + ", preview=" + j02 + ")";
    }

    private C17670a(String str, J0 j02) {
        C17542s.j(str, "asset");
        this.f144885a = str;
        this.f144886b = j02;
    }
}
