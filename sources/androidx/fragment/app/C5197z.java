package androidx.fragment.app;

import XH.C16807N;
import android.os.Bundle;
import kotlin.Metadata;
import nI.p;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a!\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007\u001a3\u0010\n\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0018\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00050\b¢\u0006\u0004\b\n\u0010\u000b\u001a\u0019\u0010\f\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Landroidx/fragment/app/o;", "", "requestKey", "Landroid/os/Bundle;", "result", "LXH/N;", "c", "(Landroidx/fragment/app/o;Ljava/lang/String;Landroid/os/Bundle;)V", "Lkotlin/Function2;", "listener", "d", "(Landroidx/fragment/app/o;Ljava/lang/String;LnI/p;)V", "b", "(Landroidx/fragment/app/o;Ljava/lang/String;)V", "fragment-ktx_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.fragment.app.z  reason: case insensitive filesystem */
public final class C5197z {
    public static final void b(C5187o oVar, String str) {
        oVar.getParentFragmentManager().z(str);
    }

    public static final void c(C5187o oVar, String str, Bundle bundle) {
        oVar.getParentFragmentManager().Q1(str, bundle);
    }

    public static final void d(C5187o oVar, String str, p<? super String, ? super Bundle, C16807N> pVar) {
        oVar.getParentFragmentManager().R1(str, oVar, new C5196y(pVar));
    }

    /* access modifiers changed from: private */
    public static final void e(p pVar, String str, Bundle bundle) {
        pVar.invoke(str, bundle);
    }
}
