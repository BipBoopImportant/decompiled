package e;

import U0.C4889m;
import U0.C4895p;
import U0.C4910x;
import U0.I0;
import U0.o1;
import android.content.Context;
import android.content.ContextWrapper;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import g.C5317f;
import kotlin.Metadata;
import kotlin.jvm.internal.C17544u;
import nI.C17631a;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u00058G¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Le/g;", "", "<init>", "()V", "LU0/I0;", "Lg/f;", "b", "LU0/I0;", "LocalComposition", "a", "(LU0/m;I)Lg/f;", "current", "activity-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: e.g  reason: case insensitive filesystem */
public final class C5284g {

    /* renamed from: a  reason: collision with root package name */
    public static final C5284g f23165a = new C5284g();

    /* renamed from: b  reason: collision with root package name */
    private static final I0<C5317f> f23166b = C4910x.d((o1) null, a.f23167c, 1, (Object) null);

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lg/f;", "b", "()Lg/f;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: e.g$a */
    static final class a extends C17544u implements C17631a<C5317f> {

        /* renamed from: c  reason: collision with root package name */
        public static final a f23167c = new a();

        a() {
            super(0);
        }

        /* renamed from: b */
        public final C5317f invoke() {
            return null;
        }
    }

    private C5284g() {
    }

    public final C5317f a(C4889m mVar, int i10) {
        if (C4895p.J()) {
            C4895p.S(1418020823, i10, -1, "androidx.activity.compose.LocalActivityResultRegistryOwner.<get-current> (ActivityResultRegistry.kt:48)");
        }
        C5317f fVar = (C5317f) mVar.Q(f23166b);
        if (fVar == null) {
            mVar.W(1006590171);
            Context context = (Context) mVar.Q(AndroidCompositionLocals_androidKt.g());
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    context = null;
                    break;
                } else if (context instanceof C5317f) {
                    break;
                } else {
                    context = ((ContextWrapper) context).getBaseContext();
                }
            }
            fVar = (C5317f) context;
        } else {
            mVar.W(1006589303);
        }
        mVar.P();
        if (C4895p.J()) {
            C4895p.R();
        }
        return fVar;
    }
}
