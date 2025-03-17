package H5;

import B5.h;
import E5.e;
import E5.r;
import H5.i;
import N5.m;
import S5.j;
import WK.y;
import YH.C16877v;
import android.net.Uri;
import android.webkit.MimeTypeMap;
import dI.C17164e;
import kotlin.Metadata;
import nI.C17642l;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001:\u0001\tB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH@¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"LH5/a;", "LH5/i;", "Landroid/net/Uri;", "data", "LN5/m;", "options", "<init>", "(Landroid/net/Uri;LN5/m;)V", "LH5/h;", "a", "(LdI/e;)Ljava/lang/Object;", "Landroid/net/Uri;", "b", "LN5/m;", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class a implements i {

    /* renamed from: a  reason: collision with root package name */
    private final Uri f36403a;

    /* renamed from: b  reason: collision with root package name */
    private final m f36404b;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J)\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"LH5/a$a;", "LH5/i$a;", "Landroid/net/Uri;", "<init>", "()V", "data", "LN5/m;", "options", "LB5/h;", "imageLoader", "LH5/i;", "b", "(Landroid/net/Uri;LN5/m;LB5/h;)LH5/i;", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: H5.a$a  reason: collision with other inner class name */
    public static final class C0574a implements i.a<Uri> {
        /* renamed from: b */
        public i a(Uri uri, m mVar, h hVar) {
            if (!j.s(uri)) {
                return null;
            }
            return new a(uri, mVar);
        }
    }

    public a(Uri uri, m mVar) {
        this.f36403a = uri;
        this.f36404b = mVar;
    }

    public Object a(C17164e<? super h> eVar) {
        String G02 = C16877v.G0(C16877v.n0(this.f36403a.getPathSegments(), 1), "/", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C17642l) null, 62, (Object) null);
        return new m(r.f(y.d(y.l(this.f36404b.g().getAssets().open(G02))), this.f36404b.g(), new E5.a(G02)), j.k(MimeTypeMap.getSingleton(), G02), e.DISK);
    }
}
