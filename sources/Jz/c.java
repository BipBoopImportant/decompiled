package Jz;

import HJ.C15854t;
import Kz.a;
import XH.C16807N;
import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.C5221y;
import com.ingka.ikea.app.scanandgoonlineredesign.dialog.EmailCollectionBottomSheetDialog;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17631a;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ-\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\n0\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"LJz/c;", "LJz/a;", "LKz/c;", "scanAndGoRequestUserEmailUseCase", "<init>", "(LKz/c;)V", "Landroidx/fragment/app/FragmentManager;", "fragmentManager", "", "hasTerms", "LXH/N;", "b", "(Landroidx/fragment/app/FragmentManager;Z)V", "Landroidx/lifecycle/y;", "lifecycleOwner", "Lkotlin/Function0;", "onComplete", "a", "(Landroidx/fragment/app/FragmentManager;Landroidx/lifecycle/y;LnI/a;)V", "LKz/c;", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c implements a {

    /* renamed from: a  reason: collision with root package name */
    private final Kz.c f111473a;

    public c(Kz.c cVar) {
        C17542s.j(cVar, "scanAndGoRequestUserEmailUseCase");
        this.f111473a = cVar;
    }

    /* access modifiers changed from: private */
    public static final void d(FragmentManager fragmentManager, c cVar, C17631a aVar, String str, Bundle bundle) {
        C17542s.j(str, "<unused var>");
        C17542s.j(bundle, "bundle");
        fragmentManager.z("REBSD_fragment_result_key");
        String string = bundle.getString("REBSD_result_email_key");
        if (string != null && !C15854t.v0(string)) {
            cVar.f111473a.a(new a.b(string));
            aVar.invoke();
        }
    }

    public void a(FragmentManager fragmentManager, C5221y yVar, C17631a<C16807N> aVar) {
        C17542s.j(fragmentManager, "fragmentManager");
        C17542s.j(yVar, "lifecycleOwner");
        C17542s.j(aVar, "onComplete");
        fragmentManager.R1("REBSD_fragment_result_key", yVar, new b(fragmentManager, this, aVar));
    }

    public void b(FragmentManager fragmentManager, boolean z10) {
        C17542s.j(fragmentManager, "fragmentManager");
        EmailCollectionBottomSheetDialog.f91323N.a(z10).show(fragmentManager, (String) null);
    }
}
