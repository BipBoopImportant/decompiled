package com.sugarcube.app.base.data.source;

import java.util.UUID;
import nI.C17642l;

public final /* synthetic */ class b implements C17642l {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ CompositionRepositorySource f122946a;

    public /* synthetic */ b(CompositionRepositorySource compositionRepositorySource) {
        this.f122946a = compositionRepositorySource;
    }

    public final Object invoke(Object obj) {
        return CompositionRepositorySource.currentSceneCompositions$lambda$2(this.f122946a, (UUID) obj);
    }
}
