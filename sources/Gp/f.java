package Gp;

import Cp.a;
import android.net.Uri;
import com.ingka.ikea.dataethics.EthicsDialogData;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import ow.c;
import x4.C8951o;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"LGp/f;", "LCp/a;", "<init>", "()V", "Lx4/o;", "navController", "Lcom/ingka/ikea/dataethics/EthicsDialogData;", "data", "LXH/N;", "a", "(Lx4/o;Lcom/ingka/ikea/dataethics/EthicsDialogData;)V", "dataethics-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class f implements a {
    public void a(C8951o oVar, EthicsDialogData ethicsDialogData) {
        C17542s.j(oVar, "navController");
        C17542s.j(ethicsDialogData, "data");
        Uri build = Uri.parse(c.b("ikea://navigation/profile/dataEthics?image={image}&title={title}&message={message}&privacyPolicyLink={privacyPolicyLink}")).buildUpon().appendQueryParameter("image", String.valueOf(ethicsDialogData.getImage())).appendQueryParameter("title", String.valueOf(ethicsDialogData.getTitle())).appendQueryParameter("message", String.valueOf(ethicsDialogData.getMessage())).appendQueryParameter("privacyPolicyLink", Uri.encode(ethicsDialogData.getPrivacyPolicyLink())).build();
        C17542s.i(build, "build(...)");
        oVar.X(build);
    }
}
