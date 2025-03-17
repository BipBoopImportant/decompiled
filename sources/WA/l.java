package WA;

import Yz.b;
import com.ingka.ikea.shoppinglist.datalayer.impl.network.model.SyncEventModel;
import com.optimizely.ab.config.FeatureVariable;
import kK.C17514c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"LWA/l;", "", "<init>", "()V", "", "json", "Lcom/ingka/ikea/shoppinglist/datalayer/impl/network/model/SyncEventModel;", "b", "(Ljava/lang/String;)Lcom/ingka/ikea/shoppinglist/datalayer/impl/network/model/SyncEventModel;", "model", "a", "(Lcom/ingka/ikea/shoppinglist/datalayer/impl/network/model/SyncEventModel;)Ljava/lang/String;", "shoppinglist-datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class l {
    public final String a(SyncEventModel syncEventModel) {
        C17542s.j(syncEventModel, "model");
        C17514c b10 = b.f118278a.b();
        b10.a();
        return b10.b(SyncEventModel.Companion.serializer(), syncEventModel);
    }

    public final SyncEventModel b(String str) {
        C17542s.j(str, FeatureVariable.JSON_TYPE);
        C17514c b10 = b.f118278a.b();
        b10.a();
        return (SyncEventModel) b10.c(SyncEventModel.Companion.serializer(), str);
    }
}
