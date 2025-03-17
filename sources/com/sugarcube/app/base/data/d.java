package com.sugarcube.app.base.data;

import androidx.lifecycle.F;
import com.sugarcube.app.base.data.database.ScenesDatabase;
import com.sugarcube.core.network.models.LoggedInUser;
import java.util.List;
import nI.C17642l;

public final /* synthetic */ class d implements C17642l {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ScenesDatabase f122931a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ List f122932b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ F f122933c;

    public /* synthetic */ d(ScenesDatabase scenesDatabase, List list, F f10) {
        this.f122931a = scenesDatabase;
        this.f122932b = list;
        this.f122933c = f10;
    }

    public final Object invoke(Object obj) {
        return SceneRepositoryKt.getLiveScenes$lambda$4$lambda$3(this.f122931a, this.f122932b, this.f122933c, (LoggedInUser) obj);
    }
}
