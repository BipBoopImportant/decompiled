package com.sugarcube.app.base.data;

import com.sugarcube.app.base.data.database.Media;
import com.sugarcube.core.network.models.RoomType;
import dI.C17164e;
import java.time.Instant;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@f(c = "com.sugarcube.app.base.data.SceneRepository", f = "SceneRepository.kt", l = {561}, m = "addCapture")
final class SceneRepository$addCapture$1 extends d {
    int I$0;
    int I$1;
    long J$0;
    Object L$0;
    Object L$1;
    Object L$10;
    Object L$11;
    Object L$12;
    Object L$13;
    Object L$14;
    Object L$15;
    Object L$16;
    Object L$17;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    Object L$9;
    boolean Z$0;
    boolean Z$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SceneRepository this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SceneRepository$addCapture$1(SceneRepository sceneRepository, C17164e<? super SceneRepository$addCapture$1> eVar) {
        super(eVar);
        this.this$0 = sceneRepository;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.addCapture((UUID) null, (RoomType) null, (String) null, (Instant) null, (List<Media>) null, (List<com.sugarcube.app.base.data.database.Metadata>) null, false, (String) null, (String) null, (String) null, false, this);
    }
}
