package Cr;

import Cr.a;
import XH.t;
import am.C11070a;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.core.app.z;
import androidx.core.content.FileProvider;
import jI.C17423j;
import java.io.File;
import java.io.FileOutputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J7\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0015\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0017¨\u0006\u0019"}, d2 = {"LCr/b;", "LCr/a;", "Lam/a;", "appApi", "<init>", "(Lam/a;)V", "Landroid/content/Context;", "launchingContext", "", "fileName", "LCr/a$a;", "data", "LCr/a$c;", "type", "LCr/a$b;", "intentType", "Landroid/content/Intent;", "a", "(Landroid/content/Context;Ljava/lang/String;LCr/a$a;LCr/a$c;LCr/a$b;)Landroid/content/Intent;", "context", "LXH/N;", "b", "(LCr/a$c;Landroid/content/Context;)V", "Ljava/lang/String;", "authority", "IKEA_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b implements a {

    /* renamed from: a  reason: collision with root package name */
    private final String f79668a;

    public b(C11070a aVar) {
        C17542s.j(aVar, "appApi");
        String c10 = aVar.c();
        this.f79668a = c10 + ".provider";
    }

    public Intent a(Context context, String str, a.C1481a aVar, a.c cVar, a.b bVar) {
        C17542s.j(context, "launchingContext");
        C17542s.j(str, "fileName");
        C17542s.j(aVar, "data");
        C17542s.j(cVar, "type");
        C17542s.j(bVar, "intentType");
        File a10 = c.a(cVar, context);
        if (!a10.exists()) {
            a10.mkdir();
        }
        File file = new File(a10.getPath(), str);
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        fileOutputStream.write(aVar.b());
        fileOutputStream.close();
        Uri h10 = FileProvider.h(context, this.f79668a, file);
        if (C17542s.e(bVar, a.b.C1483b.f79667a)) {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(h10, aVar.a());
            intent.setFlags(1073741825);
            return intent;
        } else if (bVar instanceof a.b.C1482a) {
            a.b.C1482a aVar2 = (a.b.C1482a) bVar;
            Intent c10 = new z.a(context).e(aVar2.a()).f(aVar2.b()).d(h10).g(aVar.a()).c();
            C17542s.i(c10, "getIntent(...)");
            c10.addFlags(1);
            return c10;
        } else {
            throw new t();
        }
    }

    public void b(a.c cVar, Context context) {
        C17542s.j(cVar, "type");
        C17542s.j(context, "context");
        File a10 = c.a(cVar, context);
        if (a10.exists()) {
            C17423j.r(a10);
        }
    }
}
