package H5;

import B5.h;
import E5.e;
import E5.r;
import E5.s;
import H5.i;
import HJ.C15854t;
import N5.m;
import S5.d;
import S5.j;
import WK.y;
import XH.C16820k;
import YH.C16877v;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.TypedValue;
import android.webkit.MimeTypeMap;
import dI.C17164e;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \u00102\u00020\u0001:\u0002\t\fB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bH@¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000f¨\u0006\u0011"}, d2 = {"LH5/l;", "LH5/i;", "Landroid/net/Uri;", "data", "LN5/m;", "options", "<init>", "(Landroid/net/Uri;LN5/m;)V", "", "b", "(Landroid/net/Uri;)Ljava/lang/Void;", "LH5/h;", "a", "(LdI/e;)Ljava/lang/Object;", "Landroid/net/Uri;", "LN5/m;", "c", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class l implements i {

    /* renamed from: c  reason: collision with root package name */
    public static final a f36437c = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final Uri f36438a;

    /* renamed from: b  reason: collision with root package name */
    private final m f36439b;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LH5/l$a;", "", "<init>", "()V", "", "MIME_TYPE_XML", "Ljava/lang/String;", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0007\u0010\bJ)\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"LH5/l$b;", "LH5/i$a;", "Landroid/net/Uri;", "<init>", "()V", "data", "", "c", "(Landroid/net/Uri;)Z", "LN5/m;", "options", "LB5/h;", "imageLoader", "LH5/i;", "b", "(Landroid/net/Uri;LN5/m;LB5/h;)LH5/i;", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b implements i.a<Uri> {
        private final boolean c(Uri uri) {
            return C17542s.e(uri.getScheme(), "android.resource");
        }

        /* renamed from: b */
        public i a(Uri uri, m mVar, h hVar) {
            if (!c(uri)) {
                return null;
            }
            return new l(uri, mVar);
        }
    }

    public l(Uri uri, m mVar) {
        this.f36438a = uri;
        this.f36439b = mVar;
    }

    private final Void b(Uri uri) {
        throw new IllegalStateException("Invalid android.resource URI: " + uri);
    }

    public Object a(C17164e<? super h> eVar) {
        Integer t10;
        String authority = this.f36438a.getAuthority();
        if (authority != null) {
            if (C15854t.v0(authority)) {
                authority = null;
            }
            if (authority != null) {
                String str = (String) C16877v.K0(this.f36438a.getPathSegments());
                if (str == null || (t10 = C15854t.t(str)) == null) {
                    b(this.f36438a);
                    throw new C16820k();
                }
                int intValue = t10.intValue();
                Context g10 = this.f36439b.g();
                Resources resources = C17542s.e(authority, g10.getPackageName()) ? g10.getResources() : g10.getPackageManager().getResourcesForApplication(authority);
                TypedValue typedValue = new TypedValue();
                resources.getValue(intValue, typedValue, true);
                CharSequence charSequence = typedValue.string;
                String k10 = j.k(MimeTypeMap.getSingleton(), charSequence.subSequence(C15854t.y0(charSequence, '/', 0, false, 6, (Object) null), charSequence.length()).toString());
                if (C17542s.e(k10, "text/xml")) {
                    Drawable a10 = C17542s.e(authority, g10.getPackageName()) ? d.a(g10, intValue) : d.d(g10, resources, intValue);
                    boolean w10 = j.w(a10);
                    if (w10) {
                        a10 = new BitmapDrawable(g10.getResources(), S5.l.f39892a.a(a10, this.f36439b.f(), this.f36439b.n(), this.f36439b.m(), this.f36439b.c()));
                    }
                    return new g(a10, w10, e.DISK);
                }
                TypedValue typedValue2 = new TypedValue();
                return new m(r.f(y.d(y.l(resources.openRawResource(intValue, typedValue2))), g10, new s(authority, intValue, typedValue2.density)), k10, e.DISK);
            }
        }
        b(this.f36438a);
        throw new C16820k();
    }
}
