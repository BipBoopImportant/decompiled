package com.sugarcube.app.base.data.source;

import java.util.List;
import java.util.UUID;
import nI.C17642l;

public final /* synthetic */ class a implements C17642l {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ UUID f122945a;

    public /* synthetic */ a(UUID uuid) {
        this.f122945a = uuid;
    }

    public final Object invoke(Object obj) {
        return CompositionRepositorySource.currentSceneCompositions$lambda$2$lambda$1(this.f122945a, (List) obj);
    }
}
