package Mz;

import Nz.a;
import Nz.c;
import XH.C16807N;
import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.C5221y;
import com.ingka.ikea.scanandgo.dialog.termsandconditions.TermsAndConditionsBottomSheetDialog;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17631a;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ-\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"LMz/c;", "LMz/a;", "LNz/a;", "scanAndGoTermsAndConditionsUseCase", "<init>", "(LNz/a;)V", "Landroidx/fragment/app/FragmentManager;", "fragmentManager", "LXH/N;", "b", "(Landroidx/fragment/app/FragmentManager;)V", "Landroidx/lifecycle/y;", "lifecycleOwner", "Lkotlin/Function0;", "onComplete", "a", "(Landroidx/fragment/app/FragmentManager;Landroidx/lifecycle/y;LnI/a;)V", "LNz/a;", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c implements a {

    /* renamed from: a  reason: collision with root package name */
    private final a f112180a;

    public c(a aVar) {
        C17542s.j(aVar, "scanAndGoTermsAndConditionsUseCase");
        this.f112180a = aVar;
    }

    /* access modifiers changed from: private */
    public static final void d(FragmentManager fragmentManager, c cVar, C17631a aVar, String str, Bundle bundle) {
        C17542s.j(str, "<unused var>");
        C17542s.j(bundle, "<unused var>");
        fragmentManager.z("TACBSD_fragment_result_key");
        cVar.f112180a.a(c.a.f112748a);
        aVar.invoke();
    }

    public void a(FragmentManager fragmentManager, C5221y yVar, C17631a<C16807N> aVar) {
        C17542s.j(fragmentManager, "fragmentManager");
        C17542s.j(yVar, "lifecycleOwner");
        C17542s.j(aVar, "onComplete");
        fragmentManager.R1("TACBSD_fragment_result_key", yVar, new b(fragmentManager, this, aVar));
    }

    public void b(FragmentManager fragmentManager) {
        C17542s.j(fragmentManager, "fragmentManager");
        new TermsAndConditionsBottomSheetDialog().show(fragmentManager, (String) null);
    }
}
