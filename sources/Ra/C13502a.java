package RA;

import Ma.C9140b;
import Oo.b;
import XH.t;
import android.content.Context;
import android.content.DialogInterface;
import com.oppwa.mobile.connect.checkout.uicomponent.UiComponentContainer;
import gB.j;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"LRA/a;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "error", "LXH/N;", "b", "(Landroid/content/Context;Ljava/lang/Throwable;)V", "", "a", "(Ljava/lang/Throwable;)I", "shoppinglist-datalayer_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: RA.a  reason: case insensitive filesystem */
public final class C13502a {

    /* renamed from: a  reason: collision with root package name */
    public static final C13502a f115114a = new C13502a();

    private C13502a() {
    }

    public final int a(Throwable th2) {
        C17542s.j(th2, UiComponentContainer.RESULT_ERROR);
        if (!(th2 instanceof j)) {
            return b.f84321A3;
        }
        j jVar = (j) th2;
        if (C17542s.e(jVar, j.a.f127291a)) {
            return b.f84714m4;
        }
        if (C17542s.e(jVar, j.b.f127292a)) {
            return b.f84736o4;
        }
        if (C17542s.e(jVar, j.c.f127293a)) {
            return b.f84747p4;
        }
        if (C17542s.e(jVar, j.d.f127294a)) {
            return b.f84725n4;
        }
        if (C17542s.e(jVar, j.e.f127295a)) {
            return b.f84321A3;
        }
        throw new t();
    }

    public final void b(Context context, Throwable th2) {
        C17542s.j(th2, UiComponentContainer.RESULT_ERROR);
        if (context != null) {
            int a10 = f115114a.a(th2);
            C9140b bVar = new C9140b(context);
            bVar.x(a10);
            bVar.setPositiveButton(b.f84616d5, (DialogInterface.OnClickListener) null);
            bVar.p();
        }
    }
}
