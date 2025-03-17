package Xn;

import androidx.fragment.app.FragmentManager;
import com.ingka.ikea.checkout.impl.ui.FullscreenErrorDialogFragment;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003JA\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"LXn/h;", "LXn/g;", "<init>", "()V", "Landroidx/fragment/app/FragmentManager;", "supportFragmentManager", "Lcom/ingka/ikea/checkout/impl/ui/FullscreenErrorDialogFragment$b;", "errorDialogType", "", "title", "description", "buttonText", "contactUri", "LXH/N;", "a", "(Landroidx/fragment/app/FragmentManager;Lcom/ingka/ikea/checkout/impl/ui/FullscreenErrorDialogFragment$b;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "checkout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class h implements g {
    public void a(FragmentManager fragmentManager, FullscreenErrorDialogFragment.b bVar, String str, String str2, String str3, String str4) {
        C17542s.j(fragmentManager, "supportFragmentManager");
        C17542s.j(bVar, "errorDialogType");
        C17542s.j(str, "title");
        C17542s.j(str2, "description");
        C17542s.j(str3, "buttonText");
        FullscreenErrorDialogFragment a10 = FullscreenErrorDialogFragment.f94672Q.a(bVar, str, str2, str3, str4);
        a10.setCancelable(false);
        a10.show(fragmentManager, "fullscreen_error_dialog");
    }
}
