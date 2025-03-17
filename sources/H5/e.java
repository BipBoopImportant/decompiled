package H5;

import B5.h;
import E5.d;
import E5.r;
import H5.i;
import N5.m;
import O5.c;
import WK.y;
import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.graphics.Point;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import dI.C17164e;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001:\u0001\fB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0011\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bH@¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0011\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0013¨\u0006\u0014"}, d2 = {"LH5/e;", "LH5/i;", "Landroid/net/Uri;", "data", "LN5/m;", "options", "<init>", "(Landroid/net/Uri;LN5/m;)V", "Landroid/os/Bundle;", "d", "()Landroid/os/Bundle;", "LH5/h;", "a", "(LdI/e;)Ljava/lang/Object;", "", "b", "(Landroid/net/Uri;)Z", "c", "Landroid/net/Uri;", "LN5/m;", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class e implements i {

    /* renamed from: a  reason: collision with root package name */
    private final Uri f36409a;

    /* renamed from: b  reason: collision with root package name */
    private final m f36410b;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0007\u0010\bJ)\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"LH5/e$a;", "LH5/i$a;", "Landroid/net/Uri;", "<init>", "()V", "data", "", "c", "(Landroid/net/Uri;)Z", "LN5/m;", "options", "LB5/h;", "imageLoader", "LH5/i;", "b", "(Landroid/net/Uri;LN5/m;LB5/h;)LH5/i;", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a implements i.a<Uri> {
        private final boolean c(Uri uri) {
            return C17542s.e(uri.getScheme(), "content");
        }

        /* renamed from: b */
        public i a(Uri uri, m mVar, h hVar) {
            if (!c(uri)) {
                return null;
            }
            return new e(uri, mVar);
        }
    }

    public e(Uri uri, m mVar) {
        this.f36409a = uri;
        this.f36410b = mVar;
    }

    private final Bundle d() {
        c b10 = this.f36410b.n().b();
        c.a aVar = b10 instanceof c.a ? (c.a) b10 : null;
        if (aVar == null) {
            return null;
        }
        int i10 = aVar.f39247a;
        c a10 = this.f36410b.n().a();
        c.a aVar2 = a10 instanceof c.a ? (c.a) a10 : null;
        if (aVar2 == null) {
            return null;
        }
        int i11 = aVar2.f39247a;
        Bundle bundle = new Bundle(1);
        bundle.putParcelable("android.content.extra.SIZE", new Point(i10, i11));
        return bundle;
    }

    public Object a(C17164e<? super h> eVar) {
        ContentResolver contentResolver = this.f36410b.g().getContentResolver();
        InputStream inputStream = null;
        if (b(this.f36409a)) {
            AssetFileDescriptor openAssetFileDescriptor = contentResolver.openAssetFileDescriptor(this.f36409a, "r");
            if (openAssetFileDescriptor != null) {
                inputStream = openAssetFileDescriptor.createInputStream();
            }
            if (inputStream == null) {
                throw new IllegalStateException(("Unable to find a contact photo associated with '" + this.f36409a + "'.").toString());
            }
        } else if (Build.VERSION.SDK_INT < 29 || !c(this.f36409a)) {
            inputStream = contentResolver.openInputStream(this.f36409a);
            if (inputStream == null) {
                throw new IllegalStateException(("Unable to open '" + this.f36409a + "'.").toString());
            }
        } else {
            AssetFileDescriptor a10 = contentResolver.openTypedAssetFile(this.f36409a, "image/*", d(), (CancellationSignal) null);
            if (a10 != null) {
                inputStream = a10.createInputStream();
            }
            if (inputStream == null) {
                throw new IllegalStateException(("Unable to find a music thumbnail associated with '" + this.f36409a + "'.").toString());
            }
        }
        return new m(r.f(y.d(y.l(inputStream)), this.f36410b.g(), new d(this.f36409a)), contentResolver.getType(this.f36409a), E5.e.DISK);
    }

    public final boolean b(Uri uri) {
        return C17542s.e(uri.getAuthority(), "com.android.contacts") && C17542s.e(uri.getLastPathSegment(), "display_photo");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000e, code lost:
        r5 = r5.getPathSegments();
        r0 = r5.size();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean c(android.net.Uri r5) {
        /*
            r4 = this;
            java.lang.String r0 = r5.getAuthority()
            java.lang.String r1 = "media"
            boolean r0 = kotlin.jvm.internal.C17542s.e(r0, r1)
            r1 = 0
            if (r0 != 0) goto L_0x000e
            return r1
        L_0x000e:
            java.util.List r5 = r5.getPathSegments()
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
        throw new UnsupportedOperationException("Method not decompiled: H5.e.c(android.net.Uri):boolean");
    }
}
