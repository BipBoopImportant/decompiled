package T5;

import QJ.Y;
import T5.C6704h;
import T5.v;
import X5.C6718c;
import X5.E;
import X5.o;
import Z5.a;
import Z5.b;
import Z5.f;
import Z5.h;
import Z5.n;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import bK.l;
import d6.C7745a;
import e6.C7788a;
import e6.C7792e;
import k6.C8437d;
import k6.C8441h;
import k6.C8444k;
import k6.C8445l;
import k6.C8449p;
import k6.C8458y;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.P;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a%\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u001b\u0010\u000e\u001a\u00020\u000b*\u00020\u000b2\u0006\u0010\r\u001a\u00020\fH\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lk6/h;", "request", "", "d", "(Lk6/h;)Z", "LQJ/Y;", "Lk6/l;", "job", "Lk6/d;", "c", "(Lk6/h;LQJ/Y;)Lk6/d;", "LT5/h$a;", "LT5/v$a;", "options", "a", "(LT5/h$a;LT5/v$a;)LT5/h$a;", "b", "(LT5/v$a;)Z", "coil-core_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class z {
    public static final C6704h.a a(C6704h.a aVar, v.a aVar2) {
        aVar.k(new C7788a(), P.b(Uri.class));
        aVar.k(new C7792e(), P.b(Integer.class));
        Class<G> cls = G.class;
        aVar.j(new C7745a(), P.b(cls));
        aVar.h(new a.C0727a(), P.b(cls));
        aVar.h(new f.a(), P.b(cls));
        aVar.h(new n.a(), P.b(cls));
        aVar.h(new h.a(), P.b(Drawable.class));
        aVar.h(new b.a(), P.b(Bitmap.class));
        bK.h b10 = l.b(t.b(aVar2), 0, 2, (Object) null);
        if (b(aVar2)) {
            aVar.g(new E.a(b10));
        }
        aVar.g(new C6718c.C0675c(b10, t.a(aVar2)));
        return aVar;
    }

    private static final boolean b(v.a aVar) {
        if (Build.VERSION.SDK_INT >= 29 && t.c(aVar)) {
            o a10 = t.a(aVar);
            if (C17542s.e(a10, o.f40683c) || C17542s.e(a10, o.f40684d)) {
                return true;
            }
        }
        return false;
    }

    public static final C8437d c(C8441h hVar, Y<? extends C8445l> y10) {
        return hVar.y() instanceof o6.b ? C8458y.a(((o6.b) hVar.y()).c()).b(y10) : new C8449p(y10);
    }

    public static final boolean d(C8441h hVar) {
        return (hVar.y() instanceof o6.b) || (hVar.x() instanceof l6.l) || C8444k.n(hVar) != null;
    }
}
