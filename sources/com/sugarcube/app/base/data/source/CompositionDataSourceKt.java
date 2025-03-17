package com.sugarcube.app.base.data.source;

import com.sugarcube.core.network.models.Composition;
import com.sugarcube.core.network.models.CompositionRequest;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, d2 = {"asRequest", "Lcom/sugarcube/core/network/models/CompositionRequest;", "Lcom/sugarcube/core/network/models/Composition;", "base_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class CompositionDataSourceKt {
    public static final CompositionRequest asRequest(Composition composition) {
        C17542s.j(composition, "<this>");
        return new CompositionRequest(composition);
    }
}
