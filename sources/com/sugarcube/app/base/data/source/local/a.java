package com.sugarcube.app.base.data.source.local;

import com.sugarcube.core.network.models.Composition;
import java.util.UUID;
import nI.C17642l;

public final /* synthetic */ class a implements C17642l {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ UUID f122947a;

    public /* synthetic */ a(UUID uuid) {
        this.f122947a = uuid;
    }

    public final Object invoke(Object obj) {
        return Boolean.valueOf(CompositionLocalDataSourceImpl.deleteComposition$lambda$0(this.f122947a, (Composition) obj));
    }
}
