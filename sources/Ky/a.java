package Ky;

import By.C12674m;
import My.f;
import android.content.Context;
import android.net.Uri;
import androidx.fragment.app.FragmentManager;
import com.ingka.ikea.core.android.fragments.FullscreenDialogFragment;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import x4.C8951o;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LKy/a;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Landroidx/fragment/app/FragmentManager;", "parentFragmentManager", "Lx4/o;", "navController", "LMy/f$x;", "infoDialog", "LXH/N;", "a", "(Landroid/content/Context;Landroidx/fragment/app/FragmentManager;Lx4/o;LMy/f$x;)V", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a {
    public final void a(Context context, FragmentManager fragmentManager, C8951o oVar, f.x xVar) {
        C17542s.j(context, "context");
        C17542s.j(fragmentManager, "parentFragmentManager");
        C17542s.j(oVar, "navController");
        C17542s.j(xVar, "infoDialog");
        if (C17542s.e(xVar, f.x.b.f112155e)) {
            oVar.X(Uri.parse("ikea://navigation/cart/scanandgo/fullServe/info"));
            return;
        }
        FullscreenDialogFragment.a aVar = FullscreenDialogFragment.f94870N;
        String string = context.getString(xVar.c());
        String string2 = context.getString(xVar.b());
        C17542s.i(string2, "getString(...)");
        FullscreenDialogFragment.a.b(aVar, (String) null, string, string2, C12674m.f108290l0, new FullscreenDialogFragment.b(xVar.a(), FullscreenDialogFragment.b.C2117b.CENTER), 1, (Object) null).show(fragmentManager, "CartSectionInfoDialog");
    }
}
