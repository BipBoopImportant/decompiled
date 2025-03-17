package e;

import U0.C4908w;
import U0.C4910x;
import U0.I0;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.Metadata;
import kotlin.jvm.internal.C17544u;
import nI.C17642l;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\"\u001f\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00008\u0006¢\u0006\f\n\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0002\u0010\u0004¨\u0006\u0006"}, d2 = {"LU0/I0;", "Landroid/app/Activity;", "a", "LU0/I0;", "()LU0/I0;", "LocalActivity", "activity-compose_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: e.f  reason: case insensitive filesystem */
public final class C5283f {

    /* renamed from: a  reason: collision with root package name */
    private static final I0<Activity> f23163a = C4910x.e(a.f23164c);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LU0/w;", "Landroid/app/Activity;", "a", "(LU0/w;)Landroid/app/Activity;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: e.f$a */
    static final class a extends C17544u implements C17642l<C4908w, Activity> {

        /* renamed from: c  reason: collision with root package name */
        public static final a f23164c = new a();

        a() {
            super(1);
        }

        /* renamed from: a */
        public final Activity invoke(C4908w wVar) {
            Activity activity = (Context) wVar.j(AndroidCompositionLocals_androidKt.g());
            while (true) {
                if (!(activity instanceof ContextWrapper)) {
                    activity = null;
                    break;
                } else if (activity instanceof Activity) {
                    break;
                } else {
                    activity = ((ContextWrapper) activity).getBaseContext();
                }
            }
            return activity;
        }
    }

    public static final I0<Activity> a() {
        return f23163a;
    }
}
