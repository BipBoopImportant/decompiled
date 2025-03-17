package ff;

import Bx.a;
import XH.C16814e;
import android.net.Uri;
import androidx.fragment.app.DialogFragment;
import com.ingka.ikea.app.auth.login.LoginSignupPromotionBottomSheet;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import ow.c;
import x4.C;
import x4.C8951o;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lff/a;", "LBx/a;", "<init>", "()V", "LBx/a$a;", "promotionMode", "Landroidx/fragment/app/DialogFragment;", "a", "(LBx/a$a;)Landroidx/fragment/app/DialogFragment;", "Lx4/o;", "navController", "LXH/N;", "b", "(Lx4/o;LBx/a$a;)V", "profile-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: ff.a  reason: case insensitive filesystem */
public final class C9711a implements a {
    @C16814e
    public DialogFragment a(a.C2584a aVar) {
        C17542s.j(aVar, "promotionMode");
        return LoginSignupPromotionBottomSheet.f70074T.a(aVar);
    }

    public void b(C8951o oVar, a.C2584a aVar) {
        C17542s.j(oVar, "navController");
        C17542s.j(aVar, "promotionMode");
        Uri build = c.a(Uri.parse("ikea://navigation/login_sign_up_promotion?promotion_mode={promotion_mode}")).buildUpon().appendQueryParameter("promotion_mode", aVar.name()).build();
        C17542s.g(build);
        oVar.Y(build, new C.a().d(true).a());
    }
}
