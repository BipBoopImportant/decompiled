package Ww;

import Ww.u;
import androidx.activity.j;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"LWw/v;", "LWw/u;", "<init>", "()V", "Landroidx/activity/j;", "activity", "", "permission", "LWw/u$a;", "a", "(Landroidx/activity/j;Ljava/lang/String;)LWw/u$a;", "permissions_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class v implements u {
    public u.a a(j jVar, String str) {
        C17542s.j(jVar, "activity");
        C17542s.j(str, "permission");
        return jVar.checkSelfPermission(str) == 0 ? u.a.b.f117725a : jVar.shouldShowRequestPermissionRationale(str) ? u.a.c.f117726a : u.a.C2907a.f117724a;
    }
}
