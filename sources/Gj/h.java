package Gj;

import Ww.u;
import XH.C16807N;
import XH.t;
import XH.x;
import XH.y;
import androidx.activity.j;
import com.ingka.ikea.app.scanandgoonlineredesign.scanner.v1.g;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\f¨\u0006\r"}, d2 = {"LGj/h;", "", "LWw/u;", "permissionStatusCheck", "<init>", "(LWw/u;)V", "Landroidx/activity/j;", "activity", "LXH/x;", "LXH/N;", "a", "(Landroidx/activity/j;)Ljava/lang/Object;", "LWw/u;", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class h {

    /* renamed from: a  reason: collision with root package name */
    private final u f81112a;

    public h(u uVar) {
        C17542s.j(uVar, "permissionStatusCheck");
        this.f81112a = uVar;
    }

    public final Object a(j jVar) {
        C17542s.j(jVar, "activity");
        u.a a10 = this.f81112a.a(jVar, "android.permission.CAMERA");
        if (C17542s.e(a10, u.a.b.f117725a)) {
            x.a aVar = x.f139812b;
            return x.b(C16807N.f139792a);
        } else if (C17542s.e(a10, u.a.C2907a.f117724a)) {
            x.a aVar2 = x.f139812b;
            return x.b(y.a(new g.a("android.permission.CAMERA")));
        } else if (C17542s.e(a10, u.a.c.f117726a)) {
            x.a aVar3 = x.f139812b;
            return x.b(y.a(new g.b("android.permission.CAMERA")));
        } else {
            throw new t();
        }
    }
}
