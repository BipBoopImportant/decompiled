package com.sugarcube.app.base.data.source.remote;

import QJ.C16310i;
import com.sugarcube.app.base.data.feature.ConfigRepository;
import com.sugarcube.app.base.data.source.CompositionRemoteDataSource;
import com.sugarcube.app.base.network.NetworkClient;
import com.sugarcube.core.network.api.NetworkAPIs;
import com.sugarcube.core.network.models.Composition;
import com.sugarcube.core.network.models.CompositionRequest;
import dI.C17164e;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH@¢\u0006\u0004\b\u000b\u0010\fJ\"\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\rH@¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0012\u001a\u00020\u000fH@¢\u0006\u0004\b\u0010\u0010\u0013J\u001a\u0010\u0014\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0012\u001a\u00020\u000fH@¢\u0006\u0004\b\u0014\u0010\u0013J$\u0010\u0017\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H@¢\u0006\u0004\b\u0017\u0010\u0018J\"\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\bH@¢\u0006\u0004\b\u001b\u0010\fJ\u001a\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\t\u001a\u00020\bH@¢\u0006\u0004\b\u001d\u0010\fJ\u001a\u0010 \u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u001f\u001a\u00020\u001eH@¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b&\u0010'R\u0014\u0010+\u001a\u00020(8BX\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*¨\u0006,"}, d2 = {"Lcom/sugarcube/app/base/data/source/remote/CompositionRemoteDataSourceImpl;", "Lcom/sugarcube/app/base/data/source/CompositionRemoteDataSource;", "Lcom/sugarcube/app/base/network/NetworkClient;", "networkClient", "Lcom/sugarcube/app/base/data/feature/ConfigRepository;", "configRepository", "<init>", "(Lcom/sugarcube/app/base/network/NetworkClient;Lcom/sugarcube/app/base/data/feature/ConfigRepository;)V", "Ljava/util/UUID;", "compositionUuid", "", "deleteComposition", "(Ljava/util/UUID;LdI/e;)Ljava/lang/Object;", "", "newName", "Lcom/sugarcube/core/network/models/Composition;", "cloneComposition", "(Ljava/util/UUID;Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "composition", "(Lcom/sugarcube/core/network/models/Composition;LdI/e;)Ljava/lang/Object;", "createComposition", "Lcom/sugarcube/core/network/models/CompositionRequest;", "request", "updateComposition", "(Ljava/util/UUID;Lcom/sugarcube/core/network/models/CompositionRequest;LdI/e;)Ljava/lang/Object;", "sceneUuid", "", "fetchCompositions", "Lcom/sugarcube/core/network/models/CompiledComposition;", "fetchCompiledComposition", "", "compositionId", "fetchComposition", "(ILdI/e;)Ljava/lang/Object;", "Lcom/sugarcube/app/base/network/NetworkClient;", "getNetworkClient", "()Lcom/sugarcube/app/base/network/NetworkClient;", "Lcom/sugarcube/app/base/data/feature/ConfigRepository;", "getConfigRepository", "()Lcom/sugarcube/app/base/data/feature/ConfigRepository;", "Lcom/sugarcube/core/network/api/NetworkAPIs;", "getNetworkAPIs", "()Lcom/sugarcube/core/network/api/NetworkAPIs;", "networkAPIs", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CompositionRemoteDataSourceImpl implements CompositionRemoteDataSource {
    public static final int $stable = 0;
    private final ConfigRepository configRepository;
    private final NetworkClient networkClient;

    public CompositionRemoteDataSourceImpl(NetworkClient networkClient2, ConfigRepository configRepository2) {
        C17542s.j(networkClient2, "networkClient");
        C17542s.j(configRepository2, "configRepository");
        this.networkClient = networkClient2;
        this.configRepository = configRepository2;
    }

    /* access modifiers changed from: private */
    public final NetworkAPIs getNetworkAPIs() {
        return this.networkClient.api();
    }

    public Object cloneComposition(UUID uuid, String str, C17164e<? super Composition> eVar) {
        return C16310i.g(eVar.getContext(), new CompositionRemoteDataSourceImpl$cloneComposition$2(this, uuid, str, (C17164e<? super CompositionRemoteDataSourceImpl$cloneComposition$2>) null), eVar);
    }

    public Object createComposition(Composition composition, C17164e<? super Composition> eVar) {
        return C16310i.g(eVar.getContext(), new CompositionRemoteDataSourceImpl$createComposition$2(composition, this, (C17164e<? super CompositionRemoteDataSourceImpl$createComposition$2>) null), eVar);
    }

    public Object deleteComposition(UUID uuid, C17164e<? super Boolean> eVar) {
        return C16310i.g(eVar.getContext(), new CompositionRemoteDataSourceImpl$deleteComposition$2(this, uuid, (C17164e<? super CompositionRemoteDataSourceImpl$deleteComposition$2>) null), eVar);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v13, resolved type: dI.e<? super com.sugarcube.core.network.models.CompiledComposition>} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x010c A[Catch:{ all -> 0x00d5 }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0129 A[Catch:{ all -> 0x00d5 }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x012a A[Catch:{ all -> 0x00d5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0158 A[Catch:{ all -> 0x00d5 }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0163 A[Catch:{ all -> 0x00d5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x019e A[Catch:{ all -> 0x00d5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x01a7 A[Catch:{ all -> 0x00d5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x01af A[Catch:{ all -> 0x00d5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object fetchCompiledComposition(java.util.UUID r14, dI.C17164e<? super com.sugarcube.core.network.models.CompiledComposition> r15) {
        /*
            r13 = this;
            boolean r0 = r15 instanceof com.sugarcube.app.base.data.source.remote.CompositionRemoteDataSourceImpl$fetchCompiledComposition$1
            if (r0 == 0) goto L_0x0013
            r0 = r15
            com.sugarcube.app.base.data.source.remote.CompositionRemoteDataSourceImpl$fetchCompiledComposition$1 r0 = (com.sugarcube.app.base.data.source.remote.CompositionRemoteDataSourceImpl$fetchCompiledComposition$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.sugarcube.app.base.data.source.remote.CompositionRemoteDataSourceImpl$fetchCompiledComposition$1 r0 = new com.sugarcube.app.base.data.source.remote.CompositionRemoteDataSourceImpl$fetchCompiledComposition$1
            r0.<init>(r13, r15)
        L_0x0018:
            java.lang.Object r1 = r0.result
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.label
            r4 = 5
            r5 = 4
            r6 = 3
            r7 = 2
            r8 = 1
            if (r3 == 0) goto L_0x00db
            if (r3 == r8) goto L_0x00c4
            if (r3 == r7) goto L_0x00a9
            if (r3 == r6) goto L_0x008b
            if (r3 == r5) goto L_0x0063
            if (r3 != r4) goto L_0x005b
            java.lang.Object r14 = r0.L$7
            com.sugarcube.core.network.models.CompiledComposition r14 = (com.sugarcube.core.network.models.CompiledComposition) r14
            java.lang.Object r15 = r0.L$6
            java.lang.String r15 = (java.lang.String) r15
            java.lang.Object r15 = r0.L$5
            com.sugarcube.core.network.api.NetworkAPIs r15 = (com.sugarcube.core.network.api.NetworkAPIs) r15
            java.lang.Object r15 = r0.L$4
            com.sugarcube.core.network.models.CompiledComposition r15 = (com.sugarcube.core.network.models.CompiledComposition) r15
            java.lang.Object r15 = r0.L$3
            com.sugarcube.core.network.models.CompiledComposition r15 = (com.sugarcube.core.network.models.CompiledComposition) r15
            java.lang.Object r15 = r0.L$2
            dI.e r15 = (dI.C17164e) r15
            java.lang.Object r15 = r0.L$1
            java.util.UUID r15 = (java.util.UUID) r15
            java.lang.Object r0 = r0.L$0
            com.sugarcube.app.base.data.source.remote.CompositionRemoteDataSourceImpl r0 = (com.sugarcube.app.base.data.source.remote.CompositionRemoteDataSourceImpl) r0
            XH.y.b(r1)     // Catch:{ all -> 0x0058 }
            r6 = r14
            r14 = r15
            goto L_0x0193
        L_0x0058:
            r14 = move-exception
            goto L_0x01b7
        L_0x005b:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r15)
            throw r14
        L_0x0063:
            boolean r14 = r0.Z$2
            boolean r15 = r0.Z$1
            boolean r3 = r0.Z$0
            java.lang.Object r5 = r0.L$4
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r6 = r0.L$3
            com.sugarcube.core.network.api.NetworkAPIs r6 = (com.sugarcube.core.network.api.NetworkAPIs) r6
            java.lang.Object r7 = r0.L$2
            dI.e r7 = (dI.C17164e) r7
            java.lang.Object r8 = r0.L$1
            java.util.UUID r8 = (java.util.UUID) r8
            java.lang.Object r9 = r0.L$0
            com.sugarcube.app.base.data.source.remote.CompositionRemoteDataSourceImpl r9 = (com.sugarcube.app.base.data.source.remote.CompositionRemoteDataSourceImpl) r9
            XH.y.b(r1)     // Catch:{ all -> 0x0087 }
            r12 = r1
            r1 = r14
            r14 = r8
            r8 = r5
            r5 = r12
            goto L_0x0159
        L_0x0087:
            r14 = move-exception
            r15 = r8
            goto L_0x01b7
        L_0x008b:
            boolean r14 = r0.Z$1
            boolean r15 = r0.Z$0
            java.lang.Object r3 = r0.L$2
            dI.e r3 = (dI.C17164e) r3
            java.lang.Object r6 = r0.L$1
            java.util.UUID r6 = (java.util.UUID) r6
            java.lang.Object r7 = r0.L$0
            com.sugarcube.app.base.data.source.remote.CompositionRemoteDataSourceImpl r7 = (com.sugarcube.app.base.data.source.remote.CompositionRemoteDataSourceImpl) r7
            XH.y.b(r1)     // Catch:{ all -> 0x00a5 }
            r9 = r7
            r7 = r3
            r3 = r15
            r15 = r14
            r14 = r6
            goto L_0x0130
        L_0x00a5:
            r14 = move-exception
            r15 = r6
            goto L_0x01b7
        L_0x00a9:
            boolean r14 = r0.Z$0
            java.lang.Object r15 = r0.L$2
            dI.e r15 = (dI.C17164e) r15
            java.lang.Object r3 = r0.L$1
            java.util.UUID r3 = (java.util.UUID) r3
            java.lang.Object r7 = r0.L$0
            com.sugarcube.app.base.data.source.remote.CompositionRemoteDataSourceImpl r7 = (com.sugarcube.app.base.data.source.remote.CompositionRemoteDataSourceImpl) r7
            XH.y.b(r1)     // Catch:{ all -> 0x00c0 }
            r12 = r1
            r1 = r14
            r14 = r3
            r3 = r7
            r7 = r12
            goto L_0x010d
        L_0x00c0:
            r14 = move-exception
            r15 = r3
            goto L_0x01b7
        L_0x00c4:
            java.lang.Object r14 = r0.L$2
            r15 = r14
            dI.e r15 = (dI.C17164e) r15
            java.lang.Object r14 = r0.L$1
            java.util.UUID r14 = (java.util.UUID) r14
            java.lang.Object r3 = r0.L$0
            com.sugarcube.app.base.data.source.remote.CompositionRemoteDataSourceImpl r3 = (com.sugarcube.app.base.data.source.remote.CompositionRemoteDataSourceImpl) r3
            XH.y.b(r1)     // Catch:{ all -> 0x00d5 }
            goto L_0x00f2
        L_0x00d5:
            r15 = move-exception
            r12 = r15
            r15 = r14
            r14 = r12
            goto L_0x01b7
        L_0x00db:
            XH.y.b(r1)
            com.sugarcube.app.base.data.feature.ConfigRepository r1 = r13.configRepository     // Catch:{ all -> 0x00d5 }
            com.sugarcube.app.base.data.feature.FeatureFlags$EnableSmartProductRecommendations r3 = com.sugarcube.app.base.data.feature.FeatureFlags.EnableSmartProductRecommendations.INSTANCE     // Catch:{ all -> 0x00d5 }
            r0.L$0 = r13     // Catch:{ all -> 0x00d5 }
            r0.L$1 = r14     // Catch:{ all -> 0x00d5 }
            r0.L$2 = r15     // Catch:{ all -> 0x00d5 }
            r0.label = r8     // Catch:{ all -> 0x00d5 }
            java.lang.Object r1 = r1.get(r3, r0)     // Catch:{ all -> 0x00d5 }
            if (r1 != r2) goto L_0x00f1
            return r2
        L_0x00f1:
            r3 = r13
        L_0x00f2:
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch:{ all -> 0x00d5 }
            boolean r1 = r1.booleanValue()     // Catch:{ all -> 0x00d5 }
            com.sugarcube.app.base.data.feature.ConfigRepository r8 = r3.configRepository     // Catch:{ all -> 0x00d5 }
            com.sugarcube.app.base.data.feature.FeatureFlags$EnableGLTFScenes r9 = com.sugarcube.app.base.data.feature.FeatureFlags.EnableGLTFScenes.INSTANCE     // Catch:{ all -> 0x00d5 }
            r0.L$0 = r3     // Catch:{ all -> 0x00d5 }
            r0.L$1 = r14     // Catch:{ all -> 0x00d5 }
            r0.L$2 = r15     // Catch:{ all -> 0x00d5 }
            r0.Z$0 = r1     // Catch:{ all -> 0x00d5 }
            r0.label = r7     // Catch:{ all -> 0x00d5 }
            java.lang.Object r7 = r8.get(r9, r0)     // Catch:{ all -> 0x00d5 }
            if (r7 != r2) goto L_0x010d
            return r2
        L_0x010d:
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch:{ all -> 0x00d5 }
            boolean r7 = r7.booleanValue()     // Catch:{ all -> 0x00d5 }
            com.sugarcube.app.base.data.feature.ConfigRepository r8 = r3.configRepository     // Catch:{ all -> 0x00d5 }
            com.sugarcube.app.base.data.feature.FeatureFlags$EnableGLTFCompositions r9 = com.sugarcube.app.base.data.feature.FeatureFlags.EnableGLTFCompositions.INSTANCE     // Catch:{ all -> 0x00d5 }
            r0.L$0 = r3     // Catch:{ all -> 0x00d5 }
            r0.L$1 = r14     // Catch:{ all -> 0x00d5 }
            r0.L$2 = r15     // Catch:{ all -> 0x00d5 }
            r0.Z$0 = r1     // Catch:{ all -> 0x00d5 }
            r0.Z$1 = r7     // Catch:{ all -> 0x00d5 }
            r0.label = r6     // Catch:{ all -> 0x00d5 }
            java.lang.Object r6 = r8.get(r9, r0)     // Catch:{ all -> 0x00d5 }
            if (r6 != r2) goto L_0x012a
            return r2
        L_0x012a:
            r9 = r3
            r3 = r1
            r1 = r6
            r12 = r7
            r7 = r15
            r15 = r12
        L_0x0130:
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch:{ all -> 0x00d5 }
            boolean r1 = r1.booleanValue()     // Catch:{ all -> 0x00d5 }
            com.sugarcube.core.network.api.NetworkAPIs r6 = r9.getNetworkAPIs()     // Catch:{ all -> 0x00d5 }
            com.sugarcube.core.network.api.NetworkAPIs$ManifestMode$Companion r8 = com.sugarcube.core.network.api.NetworkAPIs.ManifestMode.Companion     // Catch:{ all -> 0x00d5 }
            java.lang.String r8 = r8.forComposition(r15, r1)     // Catch:{ all -> 0x00d5 }
            r0.L$0 = r9     // Catch:{ all -> 0x00d5 }
            r0.L$1 = r14     // Catch:{ all -> 0x00d5 }
            r0.L$2 = r7     // Catch:{ all -> 0x00d5 }
            r0.L$3 = r6     // Catch:{ all -> 0x00d5 }
            r0.L$4 = r8     // Catch:{ all -> 0x00d5 }
            r0.Z$0 = r3     // Catch:{ all -> 0x00d5 }
            r0.Z$1 = r15     // Catch:{ all -> 0x00d5 }
            r0.Z$2 = r1     // Catch:{ all -> 0x00d5 }
            r0.label = r5     // Catch:{ all -> 0x00d5 }
            java.lang.Object r5 = r6.fetchCompiledComposition(r14, r3, r8, r0)     // Catch:{ all -> 0x00d5 }
            if (r5 != r2) goto L_0x0159
            return r2
        L_0x0159:
            QL.x r5 = (QL.x) r5     // Catch:{ all -> 0x00d5 }
            java.lang.Object r5 = r5.a()     // Catch:{ all -> 0x00d5 }
            com.sugarcube.core.network.models.CompiledComposition r5 = (com.sugarcube.core.network.models.CompiledComposition) r5     // Catch:{ all -> 0x00d5 }
            if (r5 == 0) goto L_0x01af
            boolean r10 = r5.getHasGltfScene()     // Catch:{ all -> 0x00d5 }
            if (r10 == 0) goto L_0x01ce
            boolean r10 = r5.getHasGltfComposition()     // Catch:{ all -> 0x00d5 }
            if (r10 != 0) goto L_0x01ce
            com.sugarcube.core.network.api.NetworkAPIs r10 = r9.getNetworkAPIs()     // Catch:{ all -> 0x00d5 }
            r0.L$0 = r9     // Catch:{ all -> 0x00d5 }
            r0.L$1 = r14     // Catch:{ all -> 0x00d5 }
            r0.L$2 = r7     // Catch:{ all -> 0x00d5 }
            r0.L$3 = r5     // Catch:{ all -> 0x00d5 }
            r0.L$4 = r5     // Catch:{ all -> 0x00d5 }
            r0.L$5 = r6     // Catch:{ all -> 0x00d5 }
            r0.L$6 = r8     // Catch:{ all -> 0x00d5 }
            r0.L$7 = r5     // Catch:{ all -> 0x00d5 }
            r0.Z$0 = r3     // Catch:{ all -> 0x00d5 }
            r0.Z$1 = r15     // Catch:{ all -> 0x00d5 }
            r0.Z$2 = r1     // Catch:{ all -> 0x00d5 }
            r0.label = r4     // Catch:{ all -> 0x00d5 }
            java.lang.Object r1 = r10.fetchLegacy2DComposition(r14, r0)     // Catch:{ all -> 0x00d5 }
            if (r1 != r2) goto L_0x0192
            return r2
        L_0x0192:
            r6 = r5
        L_0x0193:
            QL.x r1 = (QL.x) r1     // Catch:{ all -> 0x00d5 }
            java.lang.Object r15 = r1.a()     // Catch:{ all -> 0x00d5 }
            r7 = r15
            com.sugarcube.core.network.models.Composition r7 = (com.sugarcube.core.network.models.Composition) r7     // Catch:{ all -> 0x00d5 }
            if (r7 == 0) goto L_0x01a7
            r10 = 6
            r11 = 0
            r8 = 0
            r9 = 0
            com.sugarcube.core.network.models.CompiledComposition r5 = com.sugarcube.core.network.models.CompiledComposition.copy$default(r6, r7, r8, r9, r10, r11)     // Catch:{ all -> 0x00d5 }
            goto L_0x01ce
        L_0x01a7:
            java.lang.IllegalArgumentException r15 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x00d5 }
            java.lang.String r0 = "Composition response body was null."
            r15.<init>(r0)     // Catch:{ all -> 0x00d5 }
            throw r15     // Catch:{ all -> 0x00d5 }
        L_0x01af:
            java.lang.IllegalArgumentException r15 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x00d5 }
            java.lang.String r0 = "CompiledComposition response body was null."
            r15.<init>(r0)     // Catch:{ all -> 0x00d5 }
            throw r15     // Catch:{ all -> 0x00d5 }
        L_0x01b7:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Could not fetch compiled composition for "
            r0.append(r1)
            r0.append(r15)
            java.lang.String r15 = r0.toString()
            java.lang.String r0 = "Sugarcube"
            android.util.Log.e(r0, r15, r14)
            r5 = 0
        L_0x01ce:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.data.source.remote.CompositionRemoteDataSourceImpl.fetchCompiledComposition(java.util.UUID, dI.e):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object fetchComposition(int r6, dI.C17164e<? super com.sugarcube.core.network.models.Composition> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.sugarcube.app.base.data.source.remote.CompositionRemoteDataSourceImpl$fetchComposition$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.sugarcube.app.base.data.source.remote.CompositionRemoteDataSourceImpl$fetchComposition$1 r0 = (com.sugarcube.app.base.data.source.remote.CompositionRemoteDataSourceImpl$fetchComposition$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.sugarcube.app.base.data.source.remote.CompositionRemoteDataSourceImpl$fetchComposition$1 r0 = new com.sugarcube.app.base.data.source.remote.CompositionRemoteDataSourceImpl$fetchComposition$1
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r1 = r0.result
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.label
            r4 = 1
            if (r3 == 0) goto L_0x003d
            if (r3 != r4) goto L_0x0035
            int r6 = r0.I$0
            java.lang.Object r7 = r0.L$1
            dI.e r7 = (dI.C17164e) r7
            java.lang.Object r7 = r0.L$0
            com.sugarcube.app.base.data.source.remote.CompositionRemoteDataSourceImpl r7 = (com.sugarcube.app.base.data.source.remote.CompositionRemoteDataSourceImpl) r7
            XH.y.b(r1)     // Catch:{ all -> 0x0033 }
            goto L_0x0053
        L_0x0033:
            r7 = move-exception
            goto L_0x005c
        L_0x0035:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x003d:
            XH.y.b(r1)
            com.sugarcube.core.network.api.NetworkAPIs r1 = r5.getNetworkAPIs()     // Catch:{ all -> 0x0033 }
            r0.L$0 = r5     // Catch:{ all -> 0x0033 }
            r0.L$1 = r7     // Catch:{ all -> 0x0033 }
            r0.I$0 = r6     // Catch:{ all -> 0x0033 }
            r0.label = r4     // Catch:{ all -> 0x0033 }
            java.lang.Object r1 = r1.getComposition(r6, r0)     // Catch:{ all -> 0x0033 }
            if (r1 != r2) goto L_0x0053
            return r2
        L_0x0053:
            QL.x r1 = (QL.x) r1     // Catch:{ all -> 0x0033 }
            java.lang.Object r7 = r1.a()     // Catch:{ all -> 0x0033 }
            com.sugarcube.core.network.models.Composition r7 = (com.sugarcube.core.network.models.Composition) r7     // Catch:{ all -> 0x0033 }
            goto L_0x0073
        L_0x005c:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Could not fetch composition for "
            r0.append(r1)
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            java.lang.String r0 = "Sugarcube"
            android.util.Log.e(r0, r6, r7)
            r7 = 0
        L_0x0073:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.data.source.remote.CompositionRemoteDataSourceImpl.fetchComposition(int, dI.e):java.lang.Object");
    }

    public Object fetchCompositions(UUID uuid, C17164e<? super List<Composition>> eVar) {
        return C16310i.g(eVar.getContext(), new CompositionRemoteDataSourceImpl$fetchCompositions$2(this, uuid, (C17164e<? super CompositionRemoteDataSourceImpl$fetchCompositions$2>) null), eVar);
    }

    public final ConfigRepository getConfigRepository() {
        return this.configRepository;
    }

    public final NetworkClient getNetworkClient() {
        return this.networkClient;
    }

    public Object updateComposition(UUID uuid, CompositionRequest compositionRequest, C17164e<? super Composition> eVar) {
        return C16310i.g(eVar.getContext(), new CompositionRemoteDataSourceImpl$updateComposition$2(compositionRequest, this, uuid, (C17164e<? super CompositionRemoteDataSourceImpl$updateComposition$2>) null), eVar);
    }

    public Object cloneComposition(Composition composition, C17164e<? super Composition> eVar) {
        return C16310i.g(eVar.getContext(), new CompositionRemoteDataSourceImpl$cloneComposition$4(this, composition, (C17164e<? super CompositionRemoteDataSourceImpl$cloneComposition$4>) null), eVar);
    }
}
