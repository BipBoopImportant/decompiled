package kE;

import android.net.Uri;
import gE.C14516c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import ow.c;
import x4.C8951o;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"LkE/d;", "LgE/c;", "<init>", "()V", "Lx4/o;", "navController", "", "allowSamePostalCode", "", "interactionValue", "LXH/N;", "a", "(Lx4/o;ZLjava/lang/String;)V", "zipselector-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: kE.d  reason: case insensitive filesystem */
public final class C14679d implements C14516c {
    public void a(C8951o oVar, boolean z10, String str) {
        C17542s.j(oVar, "navController");
        C17542s.j(str, "interactionValue");
        Uri build = Uri.parse(c.b("ikea://navigation/manualPostalCodeInput?allowSamePostalCode={allowSamePostalCode}&interactionValue={interactionValue}")).buildUpon().appendQueryParameter("allowSamePostalCode", String.valueOf(z10)).appendQueryParameter("interactionValue", str).build();
        C17542s.i(build, "build(...)");
        oVar.X(build);
    }
}
