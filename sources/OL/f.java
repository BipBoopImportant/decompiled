package ol;

import U0.C4889m;
import U0.C4895p;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import tK.C18030v;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lol/f;", "", "<init>", "()V", "Lp1/v0;", "containerColor", "scrolledContainerColor", "Lol/e;", "a", "(JJLU0/m;II)Lol/e;", "uicomposables_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static final f f100525a = new f();

    private f() {
    }

    public final e a(long j10, long j11, C4889m mVar, int i10, int i11) {
        mVar.W(1698846460);
        if ((i11 & 1) != 0) {
            j10 = C18030v.f147664a.a(mVar, C18030v.f147665b).k0();
        }
        long j12 = j10;
        if ((i11 & 2) != 0) {
            j11 = C18030v.f147664a.a(mVar, C18030v.f147665b).k0();
        }
        long j13 = j11;
        if (C4895p.J()) {
            C4895p.S(1698846460, i10, -1, "com.ingka.ikea.app.uicomposables.FlexibleTopBarDefaults.topAppBarColors (FlexibleTopBar.kt:241)");
        }
        e eVar = new e(j12, j13, (DefaultConstructorMarker) null);
        if (C4895p.J()) {
            C4895p.R();
        }
        mVar.P();
        return eVar;
    }
}
