package Rv;

import fI.C17220a;
import fI.C17221b;
import kotlin.Metadata;
import yv.C9008m;
import zv.d;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u001b\b\u0002\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"LRv/l;", "", "", "nameResourceId", "Lzv/d;", "screenName", "<init>", "(Ljava/lang/String;IILzv/d;)V", "I", "j", "()I", "Lzv/d;", "m", "()Lzv/d;", "Overview", "YourHome", "Settings", "membership-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public enum l {
    Overview(C9008m.f58153Z, d.Overview),
    YourHome(C9008m.f58157b0, d.YourHome),
    Settings(C9008m.f58155a0, d.Settings);
    
    private final int nameResourceId;
    private final d screenName;

    static {
        l[] a10;
        $ENTRIES = C17221b.a(a10);
    }

    private l(int i10, d dVar) {
        this.nameResourceId = i10;
        this.screenName = dVar;
    }

    public static C17220a<l> b() {
        return $ENTRIES;
    }

    public final int j() {
        return this.nameResourceId;
    }

    public final d m() {
        return this.screenName;
    }
}
