package com.sugarcube.app.base.ui.ultrawide;

import androidx.compose.ui.platform.ComposeView;
import com.sugarcube.app.base.ui.ultrawide.UltrawideRoomFragment;
import com.sugarcube.core.network.models.RoomType;
import nI.C17642l;

/* renamed from: com.sugarcube.app.base.ui.ultrawide.f0  reason: case insensitive filesystem */
public final /* synthetic */ class C14297f0 implements C17642l {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ UltrawideRoomFragment f125609a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ComposeView f125610b;

    public /* synthetic */ C14297f0(UltrawideRoomFragment ultrawideRoomFragment, ComposeView composeView) {
        this.f125609a = ultrawideRoomFragment;
        this.f125610b = composeView;
    }

    public final Object invoke(Object obj) {
        return UltrawideRoomFragment.b.f(this.f125609a, this.f125610b, (RoomType) obj);
    }
}
