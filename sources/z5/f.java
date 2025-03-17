package Z5;

import T5.G;
import T5.H;
import T5.I;
import T5.r;
import WK.y;
import X5.C6720e;
import X5.C6721f;
import X5.t;
import YH.C16877v;
import Z5.j;
import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.graphics.Point;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import dI.C17164e;
import k6.C8450q;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import l6.C8529a;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001:\u0001\fB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0011\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bH@¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0011\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0013¨\u0006\u0014"}, d2 = {"LZ5/f;", "LZ5/j;", "LT5/G;", "data", "Lk6/q;", "options", "<init>", "(LT5/G;Lk6/q;)V", "Landroid/os/Bundle;", "d", "()Landroid/os/Bundle;", "LZ5/i;", "a", "(LdI/e;)Ljava/lang/Object;", "", "b", "(LT5/G;)Z", "c", "LT5/G;", "Lk6/q;", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class f implements j {

    /* renamed from: a  reason: collision with root package name */
    private final G f41378a;

    /* renamed from: b  reason: collision with root package name */
    private final C8450q f41379b;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0007\u0010\bJ)\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"LZ5/f$a;", "LZ5/j$a;", "LT5/G;", "<init>", "()V", "data", "", "c", "(LT5/G;)Z", "Lk6/q;", "options", "LT5/r;", "imageLoader", "LZ5/j;", "b", "(LT5/G;Lk6/q;LT5/r;)LZ5/j;", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements j.a<G> {
        private final boolean c(G g10) {
            return C17542s.e(g10.c(), "content");
        }

        /* renamed from: b */
        public j a(G g10, C8450q qVar, r rVar) {
            if (!c(g10)) {
                return null;
            }
            return new f(g10, qVar);
        }
    }

    public f(G g10, C8450q qVar) {
        this.f41378a = g10;
        this.f41379b = qVar;
    }

    private final Bundle d() {
        C8529a b10 = this.f41379b.k().b();
        C8529a.C0868a aVar = b10 instanceof C8529a.C0868a ? (C8529a.C0868a) b10 : null;
        if (aVar == null) {
            return null;
        }
        int f10 = aVar.f();
        C8529a a10 = this.f41379b.k().a();
        C8529a.C0868a aVar2 = a10 instanceof C8529a.C0868a ? (C8529a.C0868a) a10 : null;
        if (aVar2 == null) {
            return null;
        }
        int f11 = aVar2.f();
        Bundle bundle = new Bundle(1);
        bundle.putParcelable("android.content.extra.SIZE", new Point(f10, f11));
        return bundle;
    }

    public Object a(C17164e<? super i> eVar) {
        AssetFileDescriptor assetFileDescriptor;
        Uri a10 = I.a(this.f41378a);
        ContentResolver contentResolver = this.f41379b.c().getContentResolver();
        if (b(this.f41378a)) {
            assetFileDescriptor = contentResolver.openAssetFileDescriptor(a10, "r");
            if (assetFileDescriptor == null) {
                throw new IllegalStateException(("Unable to find a contact photo associated with '" + a10 + "'.").toString());
            }
        } else if (Build.VERSION.SDK_INT < 29 || !c(this.f41378a)) {
            assetFileDescriptor = contentResolver.openAssetFileDescriptor(a10, "r");
            if (assetFileDescriptor == null) {
                throw new IllegalStateException(("Unable to open '" + a10 + "'.").toString());
            }
        } else {
            assetFileDescriptor = contentResolver.openTypedAssetFile(a10, "image/*", d(), (CancellationSignal) null);
            if (assetFileDescriptor == null) {
                throw new IllegalStateException(("Unable to find a music thumbnail associated with '" + a10 + "'.").toString());
            }
        }
        return new o(t.a(y.d(y.l(assetFileDescriptor.createInputStream())), this.f41379b.g(), new C6720e(this.f41378a, assetFileDescriptor)), contentResolver.getType(a10), C6721f.DISK);
    }

    public final boolean b(G g10) {
        return C17542s.e(g10.a(), "com.android.contacts") && C17542s.e(C16877v.K0(H.f(g10)), "display_photo");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000e, code lost:
        r5 = T5.H.f(r5);
        r0 = r5.size();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean c(T5.G r5) {
        /*
            r4 = this;
            java.lang.String r0 = r5.a()
            java.lang.String r1 = "media"
            boolean r0 = kotlin.jvm.internal.C17542s.e(r0, r1)
            r1 = 0
            if (r0 != 0) goto L_0x000e
            return r1
        L_0x000e:
            java.util.List r5 = T5.H.f(r5)
            int r0 = r5.size()
            r2 = 3
            if (r0 < r2) goto L_0x0036
            int r2 = r0 + -3
            java.lang.Object r2 = r5.get(r2)
            java.lang.String r3 = "audio"
            boolean r2 = kotlin.jvm.internal.C17542s.e(r2, r3)
            if (r2 == 0) goto L_0x0036
            int r0 = r0 + -2
            java.lang.Object r5 = r5.get(r0)
            java.lang.String r0 = "albums"
            boolean r5 = kotlin.jvm.internal.C17542s.e(r5, r0)
            if (r5 == 0) goto L_0x0036
            r1 = 1
        L_0x0036:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Z5.f.c(T5.G):boolean");
    }
}
