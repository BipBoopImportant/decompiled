package com.sugarcube.decorate.v2.internal.di;

import NG.C16092a;
import QJ.Q;
import ZG.C16994a;
import ZG.C16995b;
import com.sugarcube.decorate.v2.internal.manager.CompositionUpdater;
import com.sugarcube.decorate.v2.internal.manager.DecorationScope;
import com.sugarcube.decorate.v2.internal.manager.engine.EngineManager;
import com.sugarcube.decorate.v2.internal.manager.engine.EngineManagerImpl;
import com.sugarcube.decorate.v2.internal.manager.model.ModelManager;
import com.sugarcube.decorate.v2.internal.manager.model.ModelRepository;
import com.sugarcube.decorate.v2.internal.manager.scene.SceneLoadingManager;
import com.sugarcube.decorate.v2.internal.manager.touch.TouchManager;
import com.sugarcube.decorate.v2.internal.ui.catalog.domain.CartUseCase;
import com.sugarcube.decorate.v2.internal.ui.surface.ArgumentParser;
import com.sugarcube.decorate.v2.internal.usecase.SaveDesignUseCase;
import com.sugarcube.decorate.v2.internal.usecase.ShareDesignUseCase;
import dH.C17159c;
import hG.C17297a;
import hG.C17321y;
import jG.C17400b;
import jG.C17401c;
import kG.C17496b;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import lG.C17550a;

@Metadata(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\ba\u0018\u0000 +2\u00020\u0001:\u0001,J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0007H'¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u000bH'¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u000fH'¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u0013H'¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0003\u001a\u00020\u0017H'¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0003\u001a\u00020\u001bH'¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010!\u001a\u00020 2\u0006\u0010\u0003\u001a\u00020\u001fH'¢\u0006\u0004\b!\u0010\"J\u0017\u0010%\u001a\u00020$2\u0006\u0010\u0003\u001a\u00020#H'¢\u0006\u0004\b%\u0010&J\u0017\u0010)\u001a\u00020(2\u0006\u0010\u0003\u001a\u00020'H'¢\u0006\u0004\b)\u0010*¨\u0006-"}, d2 = {"Lcom/sugarcube/decorate/v2/internal/di/DecorateV2Module;", "", "LjG/b;", "impl", "Lcom/sugarcube/decorate/v2/internal/manager/model/ModelManager;", "bindModelManager", "(LjG/b;)Lcom/sugarcube/decorate/v2/internal/manager/model/ModelManager;", "LkG/b;", "Lcom/sugarcube/decorate/v2/internal/manager/scene/SceneLoadingManager;", "bindSceneLoadingManager", "(LkG/b;)Lcom/sugarcube/decorate/v2/internal/manager/scene/SceneLoadingManager;", "Lcom/sugarcube/decorate/v2/internal/manager/engine/EngineManagerImpl;", "Lcom/sugarcube/decorate/v2/internal/manager/engine/EngineManager;", "bindEngineManager", "(Lcom/sugarcube/decorate/v2/internal/manager/engine/EngineManagerImpl;)Lcom/sugarcube/decorate/v2/internal/manager/engine/EngineManager;", "LlG/a;", "Lcom/sugarcube/decorate/v2/internal/manager/touch/TouchManager;", "bindTouchManager", "(LlG/a;)Lcom/sugarcube/decorate/v2/internal/manager/touch/TouchManager;", "LhG/a;", "Lcom/sugarcube/decorate/v2/internal/manager/CompositionUpdater;", "bindCompositionUpdater", "(LhG/a;)Lcom/sugarcube/decorate/v2/internal/manager/CompositionUpdater;", "Lcom/sugarcube/decorate/v2/internal/ui/catalog/domain/a;", "Lcom/sugarcube/decorate/v2/internal/ui/catalog/domain/CartUseCase;", "bindCartUseCase", "(Lcom/sugarcube/decorate/v2/internal/ui/catalog/domain/a;)Lcom/sugarcube/decorate/v2/internal/ui/catalog/domain/CartUseCase;", "LZG/b;", "Lcom/sugarcube/decorate/v2/internal/usecase/ShareDesignUseCase;", "bindShareDesignUseCase", "(LZG/b;)Lcom/sugarcube/decorate/v2/internal/usecase/ShareDesignUseCase;", "LZG/a;", "Lcom/sugarcube/decorate/v2/internal/usecase/SaveDesignUseCase;", "bindSaveDesignUseCase", "(LZG/a;)Lcom/sugarcube/decorate/v2/internal/usecase/SaveDesignUseCase;", "LNG/a;", "Lcom/sugarcube/decorate/v2/internal/ui/surface/ArgumentParser;", "bindArgumentParser", "(LNG/a;)Lcom/sugarcube/decorate/v2/internal/ui/surface/ArgumentParser;", "LjG/c;", "Lcom/sugarcube/decorate/v2/internal/manager/model/ModelRepository;", "bindModelRepository", "(LjG/c;)Lcom/sugarcube/decorate/v2/internal/manager/model/ModelRepository;", "Companion", "a", "v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface DecorateV2Module {
    public static final a Companion = a.f142312a;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/sugarcube/decorate/v2/internal/di/DecorateV2Module$a;", "", "<init>", "()V", "LdH/c;", "lifecycle", "LQJ/Q;", "a", "(LdH/c;)LQJ/Q;", "v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f142312a = new a();

        private a() {
        }

        @DecorationScope
        public final Q a(C17159c cVar) {
            C17542s.j(cVar, "lifecycle");
            return new C17321y(cVar);
        }
    }

    ArgumentParser bindArgumentParser(C16092a aVar);

    CartUseCase bindCartUseCase(com.sugarcube.decorate.v2.internal.ui.catalog.domain.a aVar);

    CompositionUpdater bindCompositionUpdater(C17297a aVar);

    EngineManager bindEngineManager(EngineManagerImpl engineManagerImpl);

    ModelManager bindModelManager(C17400b bVar);

    ModelRepository bindModelRepository(C17401c cVar);

    SaveDesignUseCase bindSaveDesignUseCase(C16994a aVar);

    SceneLoadingManager bindSceneLoadingManager(C17496b bVar);

    ShareDesignUseCase bindShareDesignUseCase(C16995b bVar);

    TouchManager bindTouchManager(C17550a aVar);
}
