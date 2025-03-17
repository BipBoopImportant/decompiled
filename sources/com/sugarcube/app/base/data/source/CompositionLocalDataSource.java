package com.sugarcube.app.base.data.source;

import XH.C16807N;
import com.sugarcube.core.network.models.Composition;
import dI.C17164e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/sugarcube/app/base/data/source/CompositionLocalDataSource;", "Lcom/sugarcube/app/base/data/source/CompositionDataSource;", "Lcom/sugarcube/core/network/models/Composition;", "composition", "LXH/N;", "cacheComposition", "(Lcom/sugarcube/core/network/models/Composition;LdI/e;)Ljava/lang/Object;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface CompositionLocalDataSource extends CompositionDataSource {
    Object cacheComposition(Composition composition, C17164e<? super C16807N> eVar);
}
