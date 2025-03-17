package Iz;

import android.net.Uri;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import ow.c;
import x4.C8951o;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"LIz/p;", "LIz/o;", "<init>", "()V", "Lx4/o;", "navController", "", "format", "", "rawValue", "LXH/N;", "a", "(Lx4/o;ILjava/lang/String;)V", "barcode", "b", "(Lx4/o;Ljava/lang/String;)V", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Iz.p  reason: case insensitive filesystem */
public final class C13050p implements C13049o {
    public void a(C8951o oVar, int i10, String str) {
        C17542s.j(oVar, "navController");
        C17542s.j(str, "rawValue");
        Uri build = Uri.parse(c.b("ikea://navigation/scanandgo/productInfoPage?rawValue={rawValue}&format={format}")).buildUpon().appendQueryParameter("format", String.valueOf(i10)).appendQueryParameter("rawValue", str).build();
        C17542s.i(build, "build(...)");
        oVar.Y(build, rw.c.f28698a.c().a());
    }

    public void b(C8951o oVar, String str) {
        C17542s.j(oVar, "navController");
        C17542s.j(str, "barcode");
        Uri build = Uri.parse(c.b("ikea://navigation/scanandgo/productInfoPage?barcode={barcode}")).buildUpon().appendQueryParameter("barcode", str).build();
        C17542s.i(build, "build(...)");
        oVar.Y(build, rw.c.f28698a.c().a());
    }
}
