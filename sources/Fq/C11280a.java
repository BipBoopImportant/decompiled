package fq;

import HJ.C15854t;
import android.net.Uri;
import cc.C9450a;
import cc.C9451b;
import com.sugarcube.core.logger.DslKt;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.d;
import qv.e;
import xa.C8974o;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lfq/a;", "Lfq/b;", "<init>", "()V", "Landroid/net/Uri;", "uri", "", "versionCode", "a", "(Landroid/net/Uri;I)Landroid/net/Uri;", "dynamiclink-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: fq.a  reason: case insensitive filesystem */
public final class C11280a implements b {

    /* renamed from: a  reason: collision with root package name */
    public static final C11280a f97503a = new C11280a();

    private C11280a() {
    }

    public Uri a(Uri uri, int i10) {
        C17542s.j(uri, "uri");
        C9451b bVar = (C9451b) C8974o.a(C9450a.b().a(uri));
        Integer valueOf = bVar != null ? Integer.valueOf(bVar.b()) : null;
        e eVar = e.DEBUG;
        ArrayList<C11819b> arrayList = new ArrayList<>();
        for (Object next : d.f102012a.a()) {
            if (((C11819b) next).b(eVar, false)) {
                arrayList.add(next);
            }
        }
        String str = null;
        String str2 = null;
        for (C11819b bVar2 : arrayList) {
            if (str == null) {
                String a10 = C11818a.a("Check min version. app: " + i10 + ", minVersionCode: " + valueOf, (Throwable) null);
                if (a10 == null) {
                    break;
                }
                str = C11820c.a(a10);
            }
            String str3 = str;
            if (str2 == null) {
                String name = C11280a.class.getName();
                C17542s.g(name);
                String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o12.length() != 0) {
                    name = C15854t.P0(o12, "Kt");
                }
                str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
            }
            String str4 = str2;
            bVar2.a(eVar, str4, false, (Throwable) null, str3);
            str = str3;
            str2 = str4;
        }
        if (valueOf != null && i10 < valueOf.intValue()) {
            throw new c();
        } else if (bVar != null) {
            return bVar.a();
        } else {
            return null;
        }
    }
}
