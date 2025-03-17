package pz;

import QL.x;
import VL.C16704f;
import VL.s;
import com.ingka.ikea.scanandgo.datalayer.impl.settings.datasource.remote.ScanAndGoSettingsRemote;
import dI.C17164e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\"\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lpz/a;", "", "", "storeId", "LQL/x;", "Lcom/ingka/ikea/scanandgo/datalayer/impl/settings/datasource/remote/ScanAndGoSettingsRemote;", "a", "(Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: pz.a  reason: case insensitive filesystem */
public interface C14929a {
    @C16704f("scan-shop/v6/stores/{storeId}/settings")
    Object a(@s("storeId") String str, C17164e<? super x<ScanAndGoSettingsRemote>> eVar);
}
