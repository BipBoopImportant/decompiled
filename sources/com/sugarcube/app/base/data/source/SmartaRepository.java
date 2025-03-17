package com.sugarcube.app.base.data.source;

import com.sugarcube.app.base.data.Result;
import com.sugarcube.core.network.models.SmartaPlacementRequest;
import com.sugarcube.core.network.models.SmartaPlacementResponse;
import dI.C17164e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/sugarcube/app/base/data/source/SmartaRepository;", "", "Lcom/sugarcube/core/network/models/SmartaPlacementRequest;", "smartaPlacementRequest", "Lcom/sugarcube/app/base/data/Result;", "Lcom/sugarcube/core/network/models/SmartaPlacementResponse;", "postSmartaPlacement", "(Lcom/sugarcube/core/network/models/SmartaPlacementRequest;LdI/e;)Ljava/lang/Object;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface SmartaRepository {
    Object postSmartaPlacement(SmartaPlacementRequest smartaPlacementRequest, C17164e<? super Result<SmartaPlacementResponse>> eVar);
}
