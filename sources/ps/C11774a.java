package ps;

import Es.a;
import Oo.b;
import XH.t;
import YH.C16877v;
import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"LEs/a;", "Landroid/content/Context;", "context", "", "a", "(LEs/a;Landroid/content/Context;)Ljava/lang/String;", "inbox_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: ps.a  reason: case insensitive filesystem */
public final class C11774a {
    public static final String a(a aVar, Context context) {
        C17542s.j(aVar, "<this>");
        C17542s.j(context, "context");
        String string = context.getString(b.f84593b4);
        C17542s.i(string, "getString(...)");
        if (aVar instanceof a.b) {
            return string;
        }
        if (aVar instanceof a.C1544a) {
            a.C1544a aVar2 = (a.C1544a) aVar;
            return C16877v.G0(C16877v.q(string, context.getResources().getQuantityString(Oo.a.f84312g, aVar2.a(), new Object[]{Integer.valueOf(aVar2.a())})), ", ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C17642l) null, 62, (Object) null);
        }
        throw new t();
    }
}
