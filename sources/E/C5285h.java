package e;

import U0.C4889m;
import U0.C4895p;
import U0.C4910x;
import U0.I0;
import U0.o1;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import androidx.activity.C;
import androidx.activity.z;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.Metadata;
import kotlin.jvm.internal.C17544u;
import nI.C17631a;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u00058G¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Le/h;", "", "<init>", "()V", "LU0/I0;", "Landroidx/activity/z;", "b", "LU0/I0;", "LocalOnBackPressedDispatcherOwner", "a", "(LU0/m;I)Landroidx/activity/z;", "current", "activity-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: e.h  reason: case insensitive filesystem */
public final class C5285h {

    /* renamed from: a  reason: collision with root package name */
    public static final C5285h f23168a = new C5285h();

    /* renamed from: b  reason: collision with root package name */
    private static final I0<z> f23169b = C4910x.d((o1) null, a.f23170c, 1, (Object) null);

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/activity/z;", "b", "()Landroidx/activity/z;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: e.h$a */
    static final class a extends C17544u implements C17631a<z> {

        /* renamed from: c  reason: collision with root package name */
        public static final a f23170c = new a();

        a() {
            super(0);
        }

        /* renamed from: b */
        public final z invoke() {
            return null;
        }
    }

    private C5285h() {
    }

    public final z a(C4889m mVar, int i10) {
        if (C4895p.J()) {
            C4895p.S(-2068013981, i10, -1, "androidx.activity.compose.LocalOnBackPressedDispatcherOwner.<get-current> (BackHandler.kt:50)");
        }
        z zVar = (z) mVar.Q(f23169b);
        if (zVar == null) {
            mVar.W(544166745);
            zVar = C.a((View) mVar.Q(AndroidCompositionLocals_androidKt.k()));
            mVar.P();
        } else {
            mVar.W(544164296);
            mVar.P();
        }
        if (zVar == null) {
            mVar.W(544168748);
            Context context = (Context) mVar.Q(AndroidCompositionLocals_androidKt.g());
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    context = null;
                    break;
                } else if (context instanceof z) {
                    break;
                } else {
                    context = ((ContextWrapper) context).getBaseContext();
                }
            }
            zVar = (z) context;
            mVar.P();
        } else {
            mVar.W(544164377);
            mVar.P();
        }
        if (C4895p.J()) {
            C4895p.R();
        }
        return zVar;
    }
}
