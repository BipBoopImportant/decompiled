package ym;

import android.net.Uri;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import ow.c;
import vm.C12193d;
import x4.C8951o;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J9\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lym/f;", "Lvm/d;", "<init>", "()V", "Lx4/o;", "navController", "", "code", "title", "description", "", "showItf", "LXH/N;", "a", "(Lx4/o;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "barcode-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class f implements C12193d {
    public void a(C8951o oVar, String str, String str2, String str3, boolean z10) {
        C17542s.j(oVar, "navController");
        C17542s.j(str, "code");
        C17542s.j(str2, "title");
        Uri.Builder appendQueryParameter = c.a(Uri.parse("ikea://navigation/dataMatrix?showItf={showItf}&code={code}&title={title}&description={description}")).buildUpon().appendQueryParameter("code", str).appendQueryParameter("title", str2);
        if (str3 == null) {
            str3 = "";
        }
        Uri build = appendQueryParameter.appendQueryParameter("description", str3).appendQueryParameter("showItf", String.valueOf(z10)).build();
        C17542s.i(build, "build(...)");
        oVar.X(build);
    }
}
