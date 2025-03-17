package ta;

import android.net.Uri;
import com.google.android.gms.common.api.a;
import ja.d;
import ja.e;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    private static final a.g<e> f56761a;

    /* renamed from: b  reason: collision with root package name */
    private static final a.C0821a<e, a.d.c> f56762b;
    @Deprecated

    /* renamed from: c  reason: collision with root package name */
    private static final a<a.d.c> f56763c;
    @Deprecated

    /* renamed from: d  reason: collision with root package name */
    private static final i f56764d = new d();

    /* JADX WARNING: type inference failed for: r0v1, types: [ja.d, ta.i] */
    static {
        a.g<e> gVar = new a.g<>();
        f56761a = gVar;
        h hVar = new h();
        f56762b = hVar;
        f56763c = new a<>("Phenotype.API", hVar, gVar);
    }

    public static Uri a(String str) {
        String valueOf = String.valueOf(Uri.encode(str));
        return Uri.parse(valueOf.length() != 0 ? "content://com.google.android.gms.phenotype/".concat(valueOf) : new String("content://com.google.android.gms.phenotype/"));
    }
}
