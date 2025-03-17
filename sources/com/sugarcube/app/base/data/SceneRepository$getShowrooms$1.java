package com.sugarcube.app.base.data;

import IJ.C15906b;
import IJ.C15908d;
import IJ.C15909e;
import TJ.C16533h;
import XH.C16807N;
import XH.y;
import YH.C16877v;
import com.sugarcube.core.network.models.Showroom;
import dI.C17164e;
import eI.C17187b;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import nI.p;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LTJ/h;", "", "Lcom/sugarcube/core/network/models/Showroom;", "LXH/N;", "<anonymous>", "(LTJ/h;)V"}, k = 3, mv = {2, 1, 0})
@f(c = "com.sugarcube.app.base.data.SceneRepository$getShowrooms$1", f = "SceneRepository.kt", l = {959, 960}, m = "invokeSuspend")
final class SceneRepository$getShowrooms$1 extends l implements p<C16533h<? super List<? extends Showroom>>, C17164e<? super C16807N>, Object> {
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ SceneRepository this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SceneRepository$getShowrooms$1(SceneRepository sceneRepository, C17164e<? super SceneRepository$getShowrooms$1> eVar) {
        super(2, eVar);
        this.this$0 = sceneRepository;
    }

    public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
        SceneRepository$getShowrooms$1 sceneRepository$getShowrooms$1 = new SceneRepository$getShowrooms$1(this.this$0, eVar);
        sceneRepository$getShowrooms$1.L$0 = obj;
        return sceneRepository$getShowrooms$1;
    }

    public final Object invoke(C16533h<? super List<Showroom>> hVar, C17164e<? super C16807N> eVar) {
        return ((SceneRepository$getShowrooms$1) create(hVar, eVar)).invokeSuspend(C16807N.f139792a);
    }

    /* JADX WARNING: type inference failed for: r10v3, types: [androidx.lifecycle.F, androidx.lifecycle.K] */
    public final Object invokeSuspend(Object obj) {
        C16533h hVar;
        int i10;
        Object f10 = C17187b.f();
        int i11 = this.label;
        if (i11 == 0) {
            y.b(obj);
            C16533h hVar2 = (C16533h) this.L$0;
            SceneRepository sceneRepository = this.this$0;
            C15906b.a aVar = C15906b.f135496b;
            C15906b v10 = C15906b.v(C15908d.s(5, C15909e.MINUTES));
            this.L$0 = hVar2;
            this.L$1 = aVar;
            this.I$0 = 5;
            this.label = 1;
            if (sceneRepository.m23startRefreshdnQKTGw(v10, this) == f10) {
                return f10;
            }
            hVar = hVar2;
            i10 = 5;
        } else if (i11 == 1) {
            i10 = this.I$0;
            C15906b.a aVar2 = (C15906b.a) this.L$1;
            hVar = (C16533h) this.L$0;
            y.b(obj);
        } else if (i11 == 2) {
            List list = (List) this.L$1;
            C16533h hVar3 = (C16533h) this.L$0;
            y.b(obj);
            return C16807N.f139792a;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        List list2 = (List) this.this$0.getShowrooms().getValue();
        List n10 = list2 == null ? C16877v.n() : list2;
        this.L$0 = hVar;
        this.L$1 = list2;
        this.I$0 = i10;
        this.label = 2;
        if (hVar.emit(n10, this) == f10) {
            return f10;
        }
        return C16807N.f139792a;
    }
}
