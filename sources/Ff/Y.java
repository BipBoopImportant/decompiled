package FF;

import FF.C12888e;
import NF.C13291e;
import OE.n;
import U1.d;
import YH.C16877v;
import com.oppwa.mobile.connect.checkout.dialog.CheckoutConstants;
import com.sugarcube.app.base.data.model.RoomTypeRenderer;
import com.sugarcube.core.network.models.Showroom;
import java.text.DecimalFormat;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import tF.C15091p;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a!\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/sugarcube/core/network/models/Showroom;", "", "indexInSection", "LFF/h;", "section", "LFF/e$j;", "a", "(Lcom/sugarcube/core/network/models/Showroom;ILFF/h;)LFF/e$j;", "base_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class Y {
    public static final C12888e.j a(Showroom showroom, int i10, C12891h hVar) {
        C15091p pVar;
        C17542s.j(showroom, "<this>");
        C17542s.j(hVar, "section");
        Double roomSize = showroom.getRoomSize();
        if (roomSize != null) {
            double doubleValue = roomSize.doubleValue();
            d a10 = d.f14212b.a();
            DecimalFormat decimalFormat = new DecimalFormat("#");
            if (C17542s.e(a10.b(), CheckoutConstants.DEFAULT_ACI_INSTANT_PAY_COUNTRY)) {
                pVar = new C15091p(Integer.valueOf(n.f113280S4), C16877v.e(decimalFormat.format(C13291e.e(doubleValue))), (String) null, 4, (DefaultConstructorMarker) null);
            } else {
                pVar = new C15091p(Integer.valueOf(n.f113286T4), C16877v.e(decimalFormat.format(doubleValue)), (String) null, 4, (DefaultConstructorMarker) null);
            }
        } else {
            pVar = null;
        }
        C15091p pVar2 = pVar;
        Integer valueOf = Integer.valueOf(showroom.getId());
        UUID sceneUuid = showroom.getSceneUuid();
        UUID compositionUuid = showroom.getCompositionUuid();
        String name = showroom.getName();
        if (name == null) {
            name = "";
        }
        return new C12888e.j(valueOf, sceneUuid, compositionUuid, name, showroom.getImageUri(), showroom.getCompositionCount(), showroom.getLastCreatedAt(), i10, RoomTypeRenderer.INSTANCE.toRoomType(showroom.getRoomType()), hVar, showroom.getRoomShape(), pVar2);
    }
}
