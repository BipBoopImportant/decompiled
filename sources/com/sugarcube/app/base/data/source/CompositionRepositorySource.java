package com.sugarcube.app.base.data.source;

import QJ.C16310i;
import QJ.C16311i0;
import QJ.M;
import TJ.C16532g;
import XH.C16807N;
import android.util.Log;
import androidx.lifecycle.C5210m;
import androidx.lifecycle.F;
import androidx.lifecycle.K;
import androidx.lifecycle.e0;
import com.sugarcube.app.base.data.Result;
import com.sugarcube.app.base.data.feature.ConfigRepository;
import com.sugarcube.app.base.data.model.PendingComposition;
import com.sugarcube.core.logger.AnyKt;
import com.sugarcube.core.network.models.CompiledComposition;
import com.sugarcube.core.network.models.Composition;
import dI.C17164e;
import eI.C17187b;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\b'\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\r\u0010\u0011J\u001e\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\f0\u00142\u0006\u0010\u0013\u001a\u00020\u0012H@¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\n¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u001bH@¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u001bH@¢\u0006\u0004\b \u0010\u001fJ$\u0010#\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\"2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\nH¤@¢\u0006\u0004\b#\u0010$J\u001a\u0010&\u001a\u0004\u0018\u00010\f2\u0006\u0010%\u001a\u00020\fH¦@¢\u0006\u0004\b&\u0010'J\u001e\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00170\u00142\u0006\u0010\u000b\u001a\u00020\nH¦@¢\u0006\u0004\b(\u0010$J$\u0010+\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010*\u001a\u0004\u0018\u00010)H¦@¢\u0006\u0004\b+\u0010,J\u001a\u0010-\u001a\u0004\u0018\u00010\f2\u0006\u0010%\u001a\u00020\fH¦@¢\u0006\u0004\b-\u0010'J(\u0010/\u001a\b\u0012\u0004\u0012\u00020\f0\u00142\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010.\u001a\u00020\u0017H¦@¢\u0006\u0004\b/\u00100J&\u00101\u001a\b\u0012\u0004\u0012\u00020\f0\u00142\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010*\u001a\u00020)H¦@¢\u0006\u0004\b1\u0010,J\u001a\u00103\u001a\u0004\u0018\u0001022\u0006\u0010\u000b\u001a\u00020\nH¦@¢\u0006\u0004\b3\u0010$J\u001a\u00104\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0010\u001a\u00020\u000fH¦@¢\u0006\u0004\b4\u00105R\u001a\u0010\u0003\u001a\u00020\u00028\u0004X\u0004¢\u0006\f\n\u0004\b\u0003\u00106\u001a\u0004\b7\u00108R\u001a\u0010\u0005\u001a\u00020\u00048\u0004X\u0004¢\u0006\f\n\u0004\b\u0005\u00109\u001a\u0004\b:\u0010;R\u001a\u0010\u0007\u001a\u00020\u00068\u0004X\u0004¢\u0006\f\n\u0004\b\u0007\u0010<\u001a\u0004\b=\u0010>R\u001a\u0010@\u001a\u00020?8\u0004X\u0004¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010CR\u001a\u0010E\u001a\b\u0012\u0004\u0012\u00020\u00170D8\u0002X\u0004¢\u0006\u0006\n\u0004\bE\u0010FR \u0010H\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0G0D8\u0002X\u0004¢\u0006\u0006\n\u0004\bH\u0010FR#\u0010J\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0G0I8\u0006¢\u0006\f\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010MR\"\u0010O\u001a\u0010\u0012\f\u0012\n N*\u0004\u0018\u00010\n0\n0D8\u0002X\u0004¢\u0006\u0006\n\u0004\bO\u0010FR#\u0010Q\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\"0P8\u0006¢\u0006\f\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010TR$\u0010V\u001a\u0004\u0018\u00010U8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bV\u0010W\u001a\u0004\bX\u0010Y\"\u0004\bZ\u0010[R$\u0010\\\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\\\u0010]\u001a\u0004\b^\u0010_\"\u0004\b`\u0010\u001dR\u0017\u0010a\u001a\b\u0012\u0004\u0012\u00020\u00170P8F¢\u0006\u0006\u001a\u0004\ba\u0010TR\u001d\u0010c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0G0P8F¢\u0006\u0006\u001a\u0004\bb\u0010T¨\u0006d"}, d2 = {"Lcom/sugarcube/app/base/data/source/CompositionRepositorySource;", "", "Lcom/sugarcube/app/base/data/source/CompositionLocalDataSource;", "localSource", "Lcom/sugarcube/app/base/data/source/CompositionRemoteDataSource;", "remoteSource", "Lcom/sugarcube/app/base/data/feature/ConfigRepository;", "configRepository", "<init>", "(Lcom/sugarcube/app/base/data/source/CompositionLocalDataSource;Lcom/sugarcube/app/base/data/source/CompositionRemoteDataSource;Lcom/sugarcube/app/base/data/feature/ConfigRepository;)V", "Ljava/util/UUID;", "compositionUuid", "Lcom/sugarcube/core/network/models/Composition;", "getComposition", "(Ljava/util/UUID;)Lcom/sugarcube/core/network/models/Composition;", "", "compositionId", "(I)Lcom/sugarcube/core/network/models/Composition;", "LOE/q;", "sugarcube", "Lcom/sugarcube/app/base/data/Result;", "savePendingComposition", "(LOE/q;LdI/e;)Ljava/lang/Object;", "", "isPendingComposition", "(Ljava/util/UUID;)Z", "sceneUUID", "LXH/N;", "selectScene", "(Ljava/util/UUID;)V", "refreshCache", "(LdI/e;)Ljava/lang/Object;", "clearCache", "sceneUuid", "", "fetch", "(Ljava/util/UUID;LdI/e;)Ljava/lang/Object;", "composition", "createComposition", "(Lcom/sugarcube/core/network/models/Composition;LdI/e;)Ljava/lang/Object;", "deleteComposition", "", "newName", "renameComposition", "(Ljava/util/UUID;Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "updateComposition", "isShared", "shareComposition", "(Ljava/util/UUID;ZLdI/e;)Ljava/lang/Object;", "cloneComposition", "Lcom/sugarcube/core/network/models/CompiledComposition;", "fetchCompiledComposition", "fetchComposition", "(ILdI/e;)Ljava/lang/Object;", "Lcom/sugarcube/app/base/data/source/CompositionLocalDataSource;", "getLocalSource", "()Lcom/sugarcube/app/base/data/source/CompositionLocalDataSource;", "Lcom/sugarcube/app/base/data/source/CompositionRemoteDataSource;", "getRemoteSource", "()Lcom/sugarcube/app/base/data/source/CompositionRemoteDataSource;", "Lcom/sugarcube/app/base/data/feature/ConfigRepository;", "getConfigRepository", "()Lcom/sugarcube/app/base/data/feature/ConfigRepository;", "LQJ/M;", "coroutineContext", "LQJ/M;", "getCoroutineContext", "()LQJ/M;", "Landroidx/lifecycle/K;", "_isRefreshing", "Landroidx/lifecycle/K;", "", "_allCompositions", "LTJ/g;", "allCompositionsFlow", "LTJ/g;", "getAllCompositionsFlow", "()LTJ/g;", "kotlin.jvm.PlatformType", "currentSceneUuid", "Landroidx/lifecycle/F;", "currentSceneCompositions", "Landroidx/lifecycle/F;", "getCurrentSceneCompositions", "()Landroidx/lifecycle/F;", "Lcom/sugarcube/app/base/data/model/PendingComposition;", "pendingComposition", "Lcom/sugarcube/app/base/data/model/PendingComposition;", "getPendingComposition", "()Lcom/sugarcube/app/base/data/model/PendingComposition;", "setPendingComposition", "(Lcom/sugarcube/app/base/data/model/PendingComposition;)V", "explicitlySavedComposition", "Ljava/util/UUID;", "getExplicitlySavedComposition", "()Ljava/util/UUID;", "setExplicitlySavedComposition", "isRefreshing", "getAllCompositions", "allCompositions", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class CompositionRepositorySource {
    public static final int $stable = 8;
    /* access modifiers changed from: private */
    public final K<List<Composition>> _allCompositions = new K<>(new ArrayList());
    private final K<Boolean> _isRefreshing = new K<>();
    private final C16532g<List<Composition>> allCompositionsFlow = C5210m.a(getAllCompositions());
    private final ConfigRepository configRepository;
    private final M coroutineContext = C16311i0.a();
    private final F<List<Composition>> currentSceneCompositions;
    private final K<UUID> currentSceneUuid;
    private UUID explicitlySavedComposition;
    private final CompositionLocalDataSource localSource;
    private PendingComposition pendingComposition;
    private final CompositionRemoteDataSource remoteSource;

    public CompositionRepositorySource(CompositionLocalDataSource compositionLocalDataSource, CompositionRemoteDataSource compositionRemoteDataSource, ConfigRepository configRepository2) {
        C17542s.j(compositionLocalDataSource, "localSource");
        C17542s.j(compositionRemoteDataSource, "remoteSource");
        C17542s.j(configRepository2, "configRepository");
        this.localSource = compositionLocalDataSource;
        this.remoteSource = compositionRemoteDataSource;
        this.configRepository = configRepository2;
        K<UUID> k10 = new K<>(UUID.randomUUID());
        this.currentSceneUuid = k10;
        this.currentSceneCompositions = e0.c(k10, new b(this));
    }

    /* access modifiers changed from: private */
    public static final F currentSceneCompositions$lambda$2(CompositionRepositorySource compositionRepositorySource, UUID uuid) {
        return e0.b(compositionRepositorySource._allCompositions, new a(uuid));
    }

    /* access modifiers changed from: private */
    public static final List currentSceneCompositions$lambda$2$lambda$1(UUID uuid, List list) {
        C17542s.g(list);
        ArrayList arrayList = new ArrayList();
        for (Object next : list) {
            if (C17542s.e(((Composition) next).getSceneUuid(), uuid)) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public static /* synthetic */ Object fetch$default(CompositionRepositorySource compositionRepositorySource, UUID uuid, C17164e eVar, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 1) != 0) {
                uuid = null;
            }
            return compositionRepositorySource.fetch(uuid, eVar);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fetch");
    }

    public static /* synthetic */ Object shareComposition$default(CompositionRepositorySource compositionRepositorySource, UUID uuid, boolean z10, C17164e eVar, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 2) != 0) {
                z10 = true;
            }
            return compositionRepositorySource.shareComposition(uuid, z10, eVar);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: shareComposition");
    }

    public final Object clearCache(C17164e<? super C16807N> eVar) {
        Log.d(AnyKt.SUGARCUBE_TAG, "CompositionRepositorySource::clearCache");
        Object g10 = C16310i.g(this.coroutineContext, new CompositionRepositorySource$clearCache$2(this, (C17164e<? super CompositionRepositorySource$clearCache$2>) null), eVar);
        return g10 == C17187b.f() ? g10 : C16807N.f139792a;
    }

    public abstract Object cloneComposition(UUID uuid, String str, C17164e<? super Result<Composition>> eVar);

    public abstract Object createComposition(Composition composition, C17164e<? super Composition> eVar);

    public abstract Object deleteComposition(UUID uuid, C17164e<? super Result<Boolean>> eVar);

    /* access modifiers changed from: protected */
    public abstract Object fetch(UUID uuid, C17164e<? super List<Composition>> eVar);

    public abstract Object fetchCompiledComposition(UUID uuid, C17164e<? super CompiledComposition> eVar);

    public abstract Object fetchComposition(int i10, C17164e<? super Composition> eVar);

    public final F<List<Composition>> getAllCompositions() {
        return this._allCompositions;
    }

    public final C16532g<List<Composition>> getAllCompositionsFlow() {
        return this.allCompositionsFlow;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: com.sugarcube.core.network.models.Composition} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: com.sugarcube.core.network.models.Composition} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: com.sugarcube.core.network.models.Composition} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: com.sugarcube.core.network.models.Composition} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: com.sugarcube.core.network.models.Composition} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.sugarcube.core.network.models.Composition getComposition(java.util.UUID r6) {
        /*
            r5 = this;
            java.lang.String r0 = "compositionUuid"
            kotlin.jvm.internal.C17542s.j(r6, r0)
            com.sugarcube.app.base.data.model.PendingComposition r0 = r5.pendingComposition
            if (r0 == 0) goto L_0x001a
            com.sugarcube.core.network.models.Composition r0 = r0.getComposition()
            if (r0 == 0) goto L_0x001a
            java.util.UUID r1 = r0.getCompositionUuid()
            boolean r1 = kotlin.jvm.internal.C17542s.e(r1, r6)
            if (r1 == 0) goto L_0x001a
            return r0
        L_0x001a:
            androidx.lifecycle.K<java.util.List<com.sugarcube.core.network.models.Composition>> r0 = r5._allCompositions
            monitor-enter(r0)
            androidx.lifecycle.K<java.util.List<com.sugarcube.core.network.models.Composition>> r1 = r5._allCompositions     // Catch:{ all -> 0x0047 }
            java.lang.Object r1 = r1.getValue()     // Catch:{ all -> 0x0047 }
            java.util.List r1 = (java.util.List) r1     // Catch:{ all -> 0x0047 }
            r2 = 0
            if (r1 == 0) goto L_0x004b
            java.lang.Iterable r1 = (java.lang.Iterable) r1     // Catch:{ all -> 0x0047 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x0047 }
        L_0x002e:
            boolean r3 = r1.hasNext()     // Catch:{ all -> 0x0047 }
            if (r3 == 0) goto L_0x0049
            java.lang.Object r3 = r1.next()     // Catch:{ all -> 0x0047 }
            r4 = r3
            com.sugarcube.core.network.models.Composition r4 = (com.sugarcube.core.network.models.Composition) r4     // Catch:{ all -> 0x0047 }
            java.util.UUID r4 = r4.getCompositionUuid()     // Catch:{ all -> 0x0047 }
            boolean r4 = kotlin.jvm.internal.C17542s.e(r4, r6)     // Catch:{ all -> 0x0047 }
            if (r4 == 0) goto L_0x002e
            r2 = r3
            goto L_0x0049
        L_0x0047:
            r6 = move-exception
            goto L_0x004d
        L_0x0049:
            com.sugarcube.core.network.models.Composition r2 = (com.sugarcube.core.network.models.Composition) r2     // Catch:{ all -> 0x0047 }
        L_0x004b:
            monitor-exit(r0)
            return r2
        L_0x004d:
            monitor-exit(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.data.source.CompositionRepositorySource.getComposition(java.util.UUID):com.sugarcube.core.network.models.Composition");
    }

    /* access modifiers changed from: protected */
    public final ConfigRepository getConfigRepository() {
        return this.configRepository;
    }

    /* access modifiers changed from: protected */
    public final M getCoroutineContext() {
        return this.coroutineContext;
    }

    public final F<List<Composition>> getCurrentSceneCompositions() {
        return this.currentSceneCompositions;
    }

    public final UUID getExplicitlySavedComposition() {
        return this.explicitlySavedComposition;
    }

    /* access modifiers changed from: protected */
    public final CompositionLocalDataSource getLocalSource() {
        return this.localSource;
    }

    public final PendingComposition getPendingComposition() {
        return this.pendingComposition;
    }

    /* access modifiers changed from: protected */
    public final CompositionRemoteDataSource getRemoteSource() {
        return this.remoteSource;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0009, code lost:
        r0 = r0.getComposition();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean isPendingComposition(java.util.UUID r2) {
        /*
            r1 = this;
            java.lang.String r0 = "compositionUuid"
            kotlin.jvm.internal.C17542s.j(r2, r0)
            com.sugarcube.app.base.data.model.PendingComposition r0 = r1.pendingComposition
            if (r0 == 0) goto L_0x0014
            com.sugarcube.core.network.models.Composition r0 = r0.getComposition()
            if (r0 == 0) goto L_0x0014
            java.util.UUID r0 = r0.getCompositionUuid()
            goto L_0x0015
        L_0x0014:
            r0 = 0
        L_0x0015:
            boolean r2 = kotlin.jvm.internal.C17542s.e(r0, r2)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.data.source.CompositionRepositorySource.isPendingComposition(java.util.UUID):boolean");
    }

    public final F<Boolean> isRefreshing() {
        return this._isRefreshing;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0098 A[Catch:{ all -> 0x005b }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object refreshCache(dI.C17164e<? super XH.C16807N> r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof com.sugarcube.app.base.data.source.CompositionRepositorySource$refreshCache$1
            if (r0 == 0) goto L_0x0013
            r0 = r11
            com.sugarcube.app.base.data.source.CompositionRepositorySource$refreshCache$1 r0 = (com.sugarcube.app.base.data.source.CompositionRepositorySource$refreshCache$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.sugarcube.app.base.data.source.CompositionRepositorySource$refreshCache$1 r0 = new com.sugarcube.app.base.data.source.CompositionRepositorySource$refreshCache$1
            r0.<init>(r10, r11)
        L_0x0018:
            java.lang.Object r1 = r0.result
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.label
            r4 = 2
            r5 = 0
            java.lang.String r6 = "Sugarcube"
            r7 = 1
            if (r3 == 0) goto L_0x005f
            if (r3 == r7) goto L_0x004f
            if (r3 != r4) goto L_0x0047
            java.lang.Object r11 = r0.L$4
            java.util.List r11 = (java.util.List) r11
            java.lang.Object r2 = r0.L$3
            java.util.List r2 = (java.util.List) r2
            java.lang.Object r2 = r0.L$2
            java.util.List r2 = (java.util.List) r2
            java.lang.Object r2 = r0.L$1
            dI.e r2 = (dI.C17164e) r2
            java.lang.Object r0 = r0.L$0
            com.sugarcube.app.base.data.source.CompositionRepositorySource r0 = (com.sugarcube.app.base.data.source.CompositionRepositorySource) r0
            XH.y.b(r1)     // Catch:{ all -> 0x0044 }
            goto L_0x00c0
        L_0x0044:
            r11 = move-exception
            goto L_0x00f9
        L_0x0047:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L_0x004f:
            java.lang.Object r11 = r0.L$1
            dI.e r11 = (dI.C17164e) r11
            java.lang.Object r3 = r0.L$0
            com.sugarcube.app.base.data.source.CompositionRepositorySource r3 = (com.sugarcube.app.base.data.source.CompositionRepositorySource) r3
            XH.y.b(r1)     // Catch:{ all -> 0x005b }
            goto L_0x0094
        L_0x005b:
            r11 = move-exception
            r0 = r3
            goto L_0x00f9
        L_0x005f:
            XH.y.b(r1)
            java.lang.String r1 = "CompositionRepositorySource::refreshCache"
            android.util.Log.d(r6, r1)
            androidx.lifecycle.K<java.lang.Boolean> r1 = r10._isRefreshing
            java.lang.Object r1 = r1.getValue()
            java.lang.Boolean r3 = kotlin.coroutines.jvm.internal.b.a(r7)
            boolean r1 = kotlin.jvm.internal.C17542s.e(r1, r3)
            if (r1 != 0) goto L_0x0110
            java.lang.String r1 = "Starting refresh..."
            android.util.Log.d(r6, r1)
            androidx.lifecycle.K<java.lang.Boolean> r1 = r10._isRefreshing     // Catch:{ all -> 0x00f7 }
            java.lang.Boolean r3 = kotlin.coroutines.jvm.internal.b.a(r7)     // Catch:{ all -> 0x00f7 }
            r1.postValue(r3)     // Catch:{ all -> 0x00f7 }
            r0.L$0 = r10     // Catch:{ all -> 0x00f7 }
            r0.L$1 = r11     // Catch:{ all -> 0x00f7 }
            r0.label = r7     // Catch:{ all -> 0x00f7 }
            r1 = 0
            java.lang.Object r1 = fetch$default(r10, r1, r0, r7, r1)     // Catch:{ all -> 0x00f7 }
            if (r1 != r2) goto L_0x0093
            return r2
        L_0x0093:
            r3 = r10
        L_0x0094:
            java.util.List r1 = (java.util.List) r1     // Catch:{ all -> 0x005b }
            if (r1 == 0) goto L_0x00ed
            r8 = r1
            java.util.Collection r8 = (java.util.Collection) r8     // Catch:{ all -> 0x005b }
            boolean r8 = r8.isEmpty()     // Catch:{ all -> 0x005b }
            if (r8 != 0) goto L_0x00c2
            com.sugarcube.app.base.data.feature.ConfigRepository r8 = r3.configRepository     // Catch:{ all -> 0x005b }
            com.sugarcube.app.base.data.feature.ConfigItems$UserHasPlacedItem r9 = com.sugarcube.app.base.data.feature.ConfigItems.UserHasPlacedItem.INSTANCE     // Catch:{ all -> 0x005b }
            java.lang.Boolean r7 = kotlin.coroutines.jvm.internal.b.a(r7)     // Catch:{ all -> 0x005b }
            r0.L$0 = r3     // Catch:{ all -> 0x005b }
            r0.L$1 = r11     // Catch:{ all -> 0x005b }
            r0.L$2 = r1     // Catch:{ all -> 0x005b }
            r0.L$3 = r1     // Catch:{ all -> 0x005b }
            r0.L$4 = r1     // Catch:{ all -> 0x005b }
            r0.I$0 = r5     // Catch:{ all -> 0x005b }
            r0.label = r4     // Catch:{ all -> 0x005b }
            java.lang.Object r11 = r8.override(r9, r7, r0)     // Catch:{ all -> 0x005b }
            if (r11 != r2) goto L_0x00be
            return r2
        L_0x00be:
            r11 = r1
            r0 = r3
        L_0x00c0:
            r1 = r11
            goto L_0x00c3
        L_0x00c2:
            r0 = r3
        L_0x00c3:
            androidx.lifecycle.K<java.util.List<com.sugarcube.core.network.models.Composition>> r11 = r0._allCompositions     // Catch:{ all -> 0x0044 }
            r2 = r1
            java.util.Collection r2 = (java.util.Collection) r2     // Catch:{ all -> 0x0044 }
            java.util.List r2 = YH.C16877v.w1(r2)     // Catch:{ all -> 0x0044 }
            r11.postValue(r2)     // Catch:{ all -> 0x0044 }
            int r11 = r1.size()     // Catch:{ all -> 0x0044 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0044 }
            r1.<init>()     // Catch:{ all -> 0x0044 }
            java.lang.String r2 = "Fetched all compositions ("
            r1.append(r2)     // Catch:{ all -> 0x0044 }
            r1.append(r11)     // Catch:{ all -> 0x0044 }
            java.lang.String r11 = " compositions)"
            r1.append(r11)     // Catch:{ all -> 0x0044 }
            java.lang.String r11 = r1.toString()     // Catch:{ all -> 0x0044 }
            android.util.Log.d(r6, r11)     // Catch:{ all -> 0x0044 }
            r3 = r0
        L_0x00ed:
            androidx.lifecycle.K<java.lang.Boolean> r11 = r3._isRefreshing
        L_0x00ef:
            java.lang.Boolean r0 = kotlin.coroutines.jvm.internal.b.a(r5)
            r11.postValue(r0)
            goto L_0x0119
        L_0x00f7:
            r11 = move-exception
            r0 = r10
        L_0x00f9:
            java.lang.String r1 = "refreshCache(): Could not fetch compositions"
            int r11 = android.util.Log.e(r6, r1, r11)     // Catch:{ all -> 0x0105 }
            kotlin.coroutines.jvm.internal.b.e(r11)     // Catch:{ all -> 0x0105 }
            androidx.lifecycle.K<java.lang.Boolean> r11 = r0._isRefreshing
            goto L_0x00ef
        L_0x0105:
            r11 = move-exception
            androidx.lifecycle.K<java.lang.Boolean> r0 = r0._isRefreshing
            java.lang.Boolean r1 = kotlin.coroutines.jvm.internal.b.a(r5)
            r0.postValue(r1)
            throw r11
        L_0x0110:
            java.lang.String r11 = "Already refreshing, refreshCache ignored"
            int r11 = android.util.Log.d(r6, r11)
            kotlin.coroutines.jvm.internal.b.e(r11)
        L_0x0119:
            XH.N r11 = XH.C16807N.f139792a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.data.source.CompositionRepositorySource.refreshCache(dI.e):java.lang.Object");
    }

    public abstract Object renameComposition(UUID uuid, String str, C17164e<? super Composition> eVar);

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x005e, code lost:
        r1 = r1.getComposition();
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object savePendingComposition(OE.q r7, dI.C17164e<? super com.sugarcube.app.base.data.Result<com.sugarcube.core.network.models.Composition>> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.sugarcube.app.base.data.source.CompositionRepositorySource$savePendingComposition$1
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.sugarcube.app.base.data.source.CompositionRepositorySource$savePendingComposition$1 r0 = (com.sugarcube.app.base.data.source.CompositionRepositorySource$savePendingComposition$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.sugarcube.app.base.data.source.CompositionRepositorySource$savePendingComposition$1 r0 = new com.sugarcube.app.base.data.source.CompositionRepositorySource$savePendingComposition$1
            r0.<init>(r6, r8)
        L_0x0018:
            java.lang.Object r1 = r0.result
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.label
            r4 = 0
            r5 = 1
            if (r3 == 0) goto L_0x0050
            if (r3 != r5) goto L_0x0048
            java.lang.Object r7 = r0.L$6
            com.sugarcube.core.network.models.Composition r7 = (com.sugarcube.core.network.models.Composition) r7
            java.lang.Object r8 = r0.L$5
            com.sugarcube.core.network.models.Composition r8 = (com.sugarcube.core.network.models.Composition) r8
            java.lang.Object r8 = r0.L$4
            com.sugarcube.core.network.models.Composition r8 = (com.sugarcube.core.network.models.Composition) r8
            java.lang.Object r8 = r0.L$3
            com.sugarcube.app.base.data.model.PendingComposition r8 = (com.sugarcube.app.base.data.model.PendingComposition) r8
            java.lang.Object r8 = r0.L$2
            dI.e r8 = (dI.C17164e) r8
            java.lang.Object r8 = r0.L$1
            OE.q r8 = (OE.q) r8
            java.lang.Object r0 = r0.L$0
            com.sugarcube.app.base.data.source.CompositionRepositorySource r0 = (com.sugarcube.app.base.data.source.CompositionRepositorySource) r0
            XH.y.b(r1)
            r3 = r7
            r7 = r8
            goto L_0x009a
        L_0x0048:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0050:
            XH.y.b(r1)
            java.lang.String r1 = "Sugarcube"
            java.lang.String r3 = "CompositionRepositorySource::savePendingComposition"
            android.util.Log.d(r1, r3)
            com.sugarcube.app.base.data.model.PendingComposition r1 = r6.pendingComposition
            if (r1 == 0) goto L_0x0069
            com.sugarcube.core.network.models.Composition r1 = r1.getComposition()
            if (r1 == 0) goto L_0x0069
            java.util.List r1 = r1.getPlacedFurnitureSet()
            goto L_0x006a
        L_0x0069:
            r1 = r4
        L_0x006a:
            java.util.Collection r1 = (java.util.Collection) r1
            if (r1 == 0) goto L_0x00cb
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x0075
            goto L_0x00cb
        L_0x0075:
            com.sugarcube.app.base.data.model.PendingComposition r1 = r6.pendingComposition
            if (r1 == 0) goto L_0x00be
            com.sugarcube.core.network.models.Composition r3 = r1.getComposition()
            if (r3 == 0) goto L_0x00be
            r0.L$0 = r6
            r0.L$1 = r7
            r0.L$2 = r8
            r0.L$3 = r1
            r0.L$4 = r3
            r0.L$5 = r3
            r0.L$6 = r3
            r8 = 0
            r0.I$0 = r8
            r0.label = r5
            java.lang.Object r1 = r6.createComposition(r3, r0)
            if (r1 != r2) goto L_0x0099
            return r2
        L_0x0099:
            r0 = r6
        L_0x009a:
            com.sugarcube.core.network.models.Composition r1 = (com.sugarcube.core.network.models.Composition) r1
            if (r1 == 0) goto L_0x00b1
            com.squareup.picasso.t r7 = r7.c()
            android.net.Uri r8 = r3.getThumbnailUrl()
            r7.j(r8)
            r0.pendingComposition = r4
            com.sugarcube.app.base.data.Result$Success r7 = new com.sugarcube.app.base.data.Result$Success
            r7.<init>(r3)
            return r7
        L_0x00b1:
            com.sugarcube.app.base.data.Result$Error r7 = new com.sugarcube.app.base.data.Result$Error
            java.lang.Exception r8 = new java.lang.Exception
            r8.<init>()
            java.lang.String r0 = "Failed to save the composition: Unable to create the composition"
            r7.<init>(r8, r0)
            return r7
        L_0x00be:
            com.sugarcube.app.base.data.Result$Error r7 = new com.sugarcube.app.base.data.Result$Error
            java.lang.Exception r8 = new java.lang.Exception
            r8.<init>()
            java.lang.String r0 = "Failed to save the composition: Unable to access the composition"
            r7.<init>(r8, r0)
            return r7
        L_0x00cb:
            com.sugarcube.app.base.data.Result$Error r7 = new com.sugarcube.app.base.data.Result$Error
            java.lang.Exception r8 = new java.lang.Exception
            r8.<init>()
            java.lang.String r0 = "Could not save an empty composition"
            r7.<init>(r8, r0)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.data.source.CompositionRepositorySource.savePendingComposition(OE.q, dI.e):java.lang.Object");
    }

    public final void selectScene(UUID uuid) {
        C17542s.j(uuid, "sceneUUID");
        this.currentSceneUuid.postValue(uuid);
    }

    public final void setExplicitlySavedComposition(UUID uuid) {
        this.explicitlySavedComposition = uuid;
    }

    public final void setPendingComposition(PendingComposition pendingComposition2) {
        this.pendingComposition = pendingComposition2;
    }

    public abstract Object shareComposition(UUID uuid, boolean z10, C17164e<? super Result<Composition>> eVar);

    public abstract Object updateComposition(Composition composition, C17164e<? super Composition> eVar);

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: com.sugarcube.core.network.models.Composition} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: com.sugarcube.core.network.models.Composition} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: com.sugarcube.core.network.models.Composition} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: com.sugarcube.core.network.models.Composition} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: com.sugarcube.core.network.models.Composition} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.sugarcube.core.network.models.Composition getComposition(int r6) {
        /*
            r5 = this;
            androidx.lifecycle.K<java.util.List<com.sugarcube.core.network.models.Composition>> r0 = r5._allCompositions
            monitor-enter(r0)
            androidx.lifecycle.K<java.util.List<com.sugarcube.core.network.models.Composition>> r1 = r5._allCompositions     // Catch:{ all -> 0x0029 }
            java.lang.Object r1 = r1.getValue()     // Catch:{ all -> 0x0029 }
            java.util.List r1 = (java.util.List) r1     // Catch:{ all -> 0x0029 }
            r2 = 0
            if (r1 == 0) goto L_0x002d
            java.lang.Iterable r1 = (java.lang.Iterable) r1     // Catch:{ all -> 0x0029 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x0029 }
        L_0x0014:
            boolean r3 = r1.hasNext()     // Catch:{ all -> 0x0029 }
            if (r3 == 0) goto L_0x002b
            java.lang.Object r3 = r1.next()     // Catch:{ all -> 0x0029 }
            r4 = r3
            com.sugarcube.core.network.models.Composition r4 = (com.sugarcube.core.network.models.Composition) r4     // Catch:{ all -> 0x0029 }
            int r4 = r4.getCompositionId()     // Catch:{ all -> 0x0029 }
            if (r4 != r6) goto L_0x0014
            r2 = r3
            goto L_0x002b
        L_0x0029:
            r6 = move-exception
            goto L_0x002f
        L_0x002b:
            com.sugarcube.core.network.models.Composition r2 = (com.sugarcube.core.network.models.Composition) r2     // Catch:{ all -> 0x0029 }
        L_0x002d:
            monitor-exit(r0)
            return r2
        L_0x002f:
            monitor-exit(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.data.source.CompositionRepositorySource.getComposition(int):com.sugarcube.core.network.models.Composition");
    }
}
