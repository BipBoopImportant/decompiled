package B5;

import android.content.Context;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\bR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"LB5/a;", "", "<init>", "()V", "Landroid/content/Context;", "context", "LB5/h;", "a", "(Landroid/content/Context;)LB5/h;", "b", "LB5/h;", "imageLoader", "LB5/i;", "c", "LB5/i;", "imageLoaderFactory", "coil-singleton_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f33134a = new a();

    /* renamed from: b  reason: collision with root package name */
    private static h f33135b;

    /* renamed from: c  reason: collision with root package name */
    private static i f33136c;

    private a() {
    }

    public static final h a(Context context) {
        h hVar = f33135b;
        return hVar == null ? f33134a.b(context) : hVar;
    }

    private final synchronized h b(Context context) {
        h hVar;
        try {
            h hVar2 = f33135b;
            if (hVar2 != null) {
                return hVar2;
            }
            i iVar = f33136c;
            if (iVar != null) {
                hVar = iVar.a();
                if (hVar == null) {
                }
                f33136c = null;
                f33135b = hVar;
                return hVar;
            }
            Context applicationContext = context.getApplicationContext();
            i iVar2 = applicationContext instanceof i ? (i) applicationContext : null;
            hVar = iVar2 != null ? iVar2.a() : j.a(context);
            f33136c = null;
            f33135b = hVar;
            return hVar;
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
    }
}
