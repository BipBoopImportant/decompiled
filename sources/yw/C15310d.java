package yw;

import android.net.Uri;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import ow.c;
import ww.C15192a;
import x4.C8951o;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lyw/d;", "Lww/a;", "<init>", "()V", "Lx4/o;", "navController", "LXH/N;", "a", "(Lx4/o;)V", "offerhub-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: yw.d  reason: case insensitive filesystem */
public final class C15310d implements C15192a {
    public void a(C8951o oVar) {
        C17542s.j(oVar, "navController");
        Uri parse = Uri.parse(c.b("ikea://navigation/offer_hub/screen"));
        C17542s.i(parse, "parse(...)");
        oVar.X(parse);
    }
}
