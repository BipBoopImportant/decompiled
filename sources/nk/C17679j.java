package nK;

import WK.C16762E;
import WK.C16772g;
import XH.t;
import android.content.Context;
import android.graphics.BitmapRegionDecoder;
import android.net.Uri;
import dI.C17164e;
import java.io.Closeable;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nK.C17683n;
import p1.J0;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000 \u00122\u00060\u0001j\u0002`\u0002:\u0001\u0013J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H&¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u0003H¦@¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rR\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u000e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010\u0001\u0004\u0014\u0015\u0016\u0017ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0018À\u0006\u0001"}, d2 = {"LnK/j;", "Ljava/io/Closeable;", "Lokio/Closeable;", "Landroid/content/Context;", "context", "LWK/g;", "C2", "(Landroid/content/Context;)LWK/g;", "Landroid/graphics/BitmapRegionDecoder;", "h2", "(Landroid/content/Context;LdI/e;)Ljava/lang/Object;", "LXH/N;", "close", "()V", "Lp1/J0;", "q2", "()Lp1/J0;", "preview", "v0", "a", "LnK/a;", "LnK/c;", "LnK/g;", "LnK/m;", "sub-sampling-image_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: nK.j  reason: case insensitive filesystem */
public interface C17679j extends Closeable {

    /* renamed from: v0  reason: collision with root package name */
    public static final a f144946v0 = a.f144947a;

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J5\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0010\b\u0002\u0010\n\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\tH\u0007¢\u0006\u0004\b\f\u0010\rJ%\u0010\u0010\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"LnK/j$a;", "", "<init>", "()V", "LWK/E;", "path", "Lp1/J0;", "preview", "Ljava/io/Closeable;", "Lokio/Closeable;", "onClose", "LnK/j;", "b", "(LWK/E;Lp1/J0;Ljava/io/Closeable;)LnK/j;", "Landroid/net/Uri;", "uri", "a", "(Landroid/net/Uri;Lp1/J0;)LnK/j;", "sub-sampling-image_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: nK.j$a */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f144947a = new a();

        private a() {
        }

        public final C17679j a(Uri uri, J0 j02) {
            C17679j cVar;
            C17542s.j(uri, "uri");
            C17683n b10 = C17683n.f144966a.b(uri);
            if (b10 instanceof C17683n.a) {
                cVar = new C17670a(((C17683n.a) b10).a(), j02, (DefaultConstructorMarker) null);
            } else if (b10 instanceof C17683n.d) {
                cVar = new C17672c(((C17683n.d) b10).a(), j02, (Closeable) null);
            } else if (b10 instanceof C17683n.e) {
                return new C17676g(((C17683n.e) b10).a(), j02);
            } else {
                if (b10 instanceof C17683n.c) {
                    return new C17682m(((C17683n.c) b10).a(), j02);
                }
                if (b10 == null) {
                    return null;
                }
                throw new t();
            }
            return cVar;
        }

        public final C17679j b(C16762E e10, J0 j02, Closeable closeable) {
            C17542s.j(e10, "path");
            return new C17672c(e10, j02, closeable);
        }
    }

    C16772g C2(Context context);

    void close() {
    }

    Object h2(Context context, C17164e<? super BitmapRegionDecoder> eVar);

    J0 q2();
}
