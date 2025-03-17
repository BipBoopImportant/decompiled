package com.sugarcube.app.base.data.source;

import QJ.C16310i;
import com.sugarcube.app.base.data.feature.ConfigRepository;
import com.sugarcube.app.base.data.user.UserRepo;
import com.sugarcube.core.network.models.CompiledComposition;
import com.sugarcube.core.network.models.Composition;
import dI.C17164e;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\"\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH@¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0012\u001a\u00020\fH@¢\u0006\u0004\b\u0014\u0010\u0011J\u001a\u0010\u0017\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0016\u001a\u00020\u0015H@¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001a\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0019\u001a\u00020\u000fH@¢\u0006\u0004\b\u001a\u0010\u001bJ\u001e\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c2\u0006\u0010\u0012\u001a\u00020\fH@¢\u0006\u0004\b\u001e\u0010\u0011J$\u0010!\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0012\u001a\u00020\f2\b\u0010 \u001a\u0004\u0018\u00010\u001fH@¢\u0006\u0004\b!\u0010\"J\u001a\u0010#\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0019\u001a\u00020\u000fH@¢\u0006\u0004\b#\u0010\u001bJ&\u0010%\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001c2\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010$\u001a\u00020\u001dH@¢\u0006\u0004\b%\u0010&J&\u0010'\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001c2\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010 \u001a\u00020\u001fH@¢\u0006\u0004\b'\u0010\"R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010(¨\u0006)"}, d2 = {"Lcom/sugarcube/app/base/data/source/CompositionRepository;", "Lcom/sugarcube/app/base/data/source/CompositionRepositorySource;", "Lcom/sugarcube/app/base/data/source/CompositionLocalDataSource;", "local", "Lcom/sugarcube/app/base/data/source/CompositionRemoteDataSource;", "remote", "Lcom/sugarcube/app/base/data/feature/ConfigRepository;", "configRepository", "Lcom/sugarcube/app/base/data/user/UserRepo;", "userRepo", "<init>", "(Lcom/sugarcube/app/base/data/source/CompositionLocalDataSource;Lcom/sugarcube/app/base/data/source/CompositionRemoteDataSource;Lcom/sugarcube/app/base/data/feature/ConfigRepository;Lcom/sugarcube/app/base/data/user/UserRepo;)V", "Ljava/util/UUID;", "sceneUuid", "", "Lcom/sugarcube/core/network/models/Composition;", "fetch", "(Ljava/util/UUID;LdI/e;)Ljava/lang/Object;", "compositionUuid", "Lcom/sugarcube/core/network/models/CompiledComposition;", "fetchCompiledComposition", "", "compositionId", "fetchComposition", "(ILdI/e;)Ljava/lang/Object;", "composition", "createComposition", "(Lcom/sugarcube/core/network/models/Composition;LdI/e;)Ljava/lang/Object;", "Lcom/sugarcube/app/base/data/Result;", "", "deleteComposition", "", "newName", "renameComposition", "(Ljava/util/UUID;Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "updateComposition", "isShared", "shareComposition", "(Ljava/util/UUID;ZLdI/e;)Ljava/lang/Object;", "cloneComposition", "Lcom/sugarcube/app/base/data/user/UserRepo;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CompositionRepository extends CompositionRepositorySource {
    public static final int $stable = 8;
    /* access modifiers changed from: private */
    public final UserRepo userRepo;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CompositionRepository(CompositionLocalDataSource compositionLocalDataSource, CompositionRemoteDataSource compositionRemoteDataSource, ConfigRepository configRepository, UserRepo userRepo2) {
        super(compositionLocalDataSource, compositionRemoteDataSource, configRepository);
        C17542s.j(compositionLocalDataSource, "local");
        C17542s.j(compositionRemoteDataSource, "remote");
        C17542s.j(configRepository, "configRepository");
        C17542s.j(userRepo2, "userRepo");
        this.userRepo = userRepo2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00f2  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0145  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0193 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0196  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x019c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0030  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object cloneComposition(java.util.UUID r37, java.lang.String r38, dI.C17164e<? super com.sugarcube.app.base.data.Result<com.sugarcube.core.network.models.Composition>> r39) {
        /*
            r36 = this;
            r0 = r36
            r1 = r37
            r2 = r38
            r3 = r39
            boolean r4 = r3 instanceof com.sugarcube.app.base.data.source.CompositionRepository$cloneComposition$1
            if (r4 == 0) goto L_0x001b
            r4 = r3
            com.sugarcube.app.base.data.source.CompositionRepository$cloneComposition$1 r4 = (com.sugarcube.app.base.data.source.CompositionRepository$cloneComposition$1) r4
            int r5 = r4.label
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = r5 & r6
            if (r7 == 0) goto L_0x001b
            int r5 = r5 - r6
            r4.label = r5
            goto L_0x0020
        L_0x001b:
            com.sugarcube.app.base.data.source.CompositionRepository$cloneComposition$1 r4 = new com.sugarcube.app.base.data.source.CompositionRepository$cloneComposition$1
            r4.<init>(r0, r3)
        L_0x0020:
            java.lang.Object r5 = r4.result
            java.lang.Object r6 = eI.C17187b.f()
            int r7 = r4.label
            r8 = 0
            r9 = 4
            r10 = 3
            r11 = 2
            r12 = 1
            r13 = 0
            if (r7 == 0) goto L_0x00d5
            if (r7 == r12) goto L_0x00bc
            if (r7 == r11) goto L_0x0099
            if (r7 == r10) goto L_0x006a
            if (r7 != r9) goto L_0x0062
            java.lang.Object r1 = r4.L$8
            com.sugarcube.core.network.models.Composition r1 = (com.sugarcube.core.network.models.Composition) r1
            java.lang.Object r1 = r4.L$7
            com.sugarcube.core.network.models.Composition r1 = (com.sugarcube.core.network.models.Composition) r1
            java.lang.Object r2 = r4.L$6
            com.sugarcube.core.network.models.Composition r2 = (com.sugarcube.core.network.models.Composition) r2
            java.lang.Object r2 = r4.L$5
            com.sugarcube.core.network.models.Composition r2 = (com.sugarcube.core.network.models.Composition) r2
            java.lang.Object r2 = r4.L$4
            com.sugarcube.core.network.models.Composition r2 = (com.sugarcube.core.network.models.Composition) r2
            java.lang.Object r2 = r4.L$3
            dI.e r2 = (dI.C17164e) r2
            java.lang.Object r2 = r4.L$2
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r2 = r4.L$1
            java.util.UUID r2 = (java.util.UUID) r2
            java.lang.Object r2 = r4.L$0
            com.sugarcube.app.base.data.source.CompositionRepository r2 = (com.sugarcube.app.base.data.source.CompositionRepository) r2
            XH.y.b(r5)
            r8 = r1
            goto L_0x0194
        L_0x0062:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x006a:
            int r1 = r4.I$0
            java.lang.Object r2 = r4.L$9
            com.sugarcube.core.network.models.Composition r2 = (com.sugarcube.core.network.models.Composition) r2
            java.lang.Object r2 = r4.L$8
            com.sugarcube.core.network.models.Composition r2 = (com.sugarcube.core.network.models.Composition) r2
            java.lang.Object r2 = r4.L$7
            com.sugarcube.core.network.models.Composition r2 = (com.sugarcube.core.network.models.Composition) r2
            java.lang.Object r2 = r4.L$6
            com.sugarcube.core.network.models.Composition r2 = (com.sugarcube.core.network.models.Composition) r2
            java.lang.Object r3 = r4.L$5
            com.sugarcube.core.network.models.Composition r3 = (com.sugarcube.core.network.models.Composition) r3
            java.lang.Object r7 = r4.L$4
            com.sugarcube.core.network.models.Composition r7 = (com.sugarcube.core.network.models.Composition) r7
            java.lang.Object r8 = r4.L$3
            dI.e r8 = (dI.C17164e) r8
            java.lang.Object r10 = r4.L$2
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r11 = r4.L$1
            java.util.UUID r11 = (java.util.UUID) r11
            java.lang.Object r12 = r4.L$0
            com.sugarcube.app.base.data.source.CompositionRepository r12 = (com.sugarcube.app.base.data.source.CompositionRepository) r12
            XH.y.b(r5)
            goto L_0x016e
        L_0x0099:
            int r1 = r4.I$0
            java.lang.Object r2 = r4.L$6
            com.sugarcube.core.network.models.Composition r2 = (com.sugarcube.core.network.models.Composition) r2
            java.lang.Object r3 = r4.L$5
            com.sugarcube.core.network.models.Composition r3 = (com.sugarcube.core.network.models.Composition) r3
            java.lang.Object r7 = r4.L$4
            com.sugarcube.core.network.models.Composition r7 = (com.sugarcube.core.network.models.Composition) r7
            java.lang.Object r11 = r4.L$3
            dI.e r11 = (dI.C17164e) r11
            java.lang.Object r12 = r4.L$2
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r14 = r4.L$1
            java.util.UUID r14 = (java.util.UUID) r14
            java.lang.Object r15 = r4.L$0
            com.sugarcube.app.base.data.source.CompositionRepository r15 = (com.sugarcube.app.base.data.source.CompositionRepository) r15
            XH.y.b(r5)
            goto L_0x0141
        L_0x00bc:
            java.lang.Object r1 = r4.L$3
            dI.e r1 = (dI.C17164e) r1
            java.lang.Object r2 = r4.L$2
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r3 = r4.L$1
            java.util.UUID r3 = (java.util.UUID) r3
            java.lang.Object r7 = r4.L$0
            com.sugarcube.app.base.data.source.CompositionRepository r7 = (com.sugarcube.app.base.data.source.CompositionRepository) r7
            XH.y.b(r5)
            r35 = r3
            r3 = r1
            r1 = r35
            goto L_0x00ee
        L_0x00d5:
            XH.y.b(r5)
            com.sugarcube.app.base.data.source.CompositionRemoteDataSource r5 = r36.getRemoteSource()
            r4.L$0 = r0
            r4.L$1 = r1
            r4.L$2 = r2
            r4.L$3 = r3
            r4.label = r12
            java.lang.Object r5 = r5.cloneComposition(r1, r2, r4)
            if (r5 != r6) goto L_0x00ed
            return r6
        L_0x00ed:
            r7 = r0
        L_0x00ee:
            com.sugarcube.core.network.models.Composition r5 = (com.sugarcube.core.network.models.Composition) r5
            if (r5 == 0) goto L_0x0194
            r33 = 262141(0x3fffd, float:3.67338E-40)
            r34 = 0
            r15 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            r32 = 0
            r14 = r5
            r16 = r2
            com.sugarcube.core.network.models.Composition r12 = com.sugarcube.core.network.models.Composition.copy$default(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34)
            r4.L$0 = r7
            r4.L$1 = r1
            r4.L$2 = r2
            r4.L$3 = r3
            r4.L$4 = r5
            r4.L$5 = r5
            r4.L$6 = r5
            r4.I$0 = r13
            r4.label = r11
            java.lang.Object r11 = r7.updateComposition(r12, r4)
            if (r11 != r6) goto L_0x0138
            return r6
        L_0x0138:
            r14 = r1
            r12 = r2
            r2 = r5
            r15 = r7
            r1 = r13
            r7 = r2
            r5 = r11
            r11 = r3
            r3 = r7
        L_0x0141:
            com.sugarcube.core.network.models.Composition r5 = (com.sugarcube.core.network.models.Composition) r5
            if (r5 == 0) goto L_0x0175
            com.sugarcube.app.base.data.source.CompositionLocalDataSource r8 = r15.getLocalSource()
            r4.L$0 = r15
            r4.L$1 = r14
            r4.L$2 = r12
            r4.L$3 = r11
            r4.L$4 = r7
            r4.L$5 = r3
            r4.L$6 = r2
            r4.L$7 = r5
            r4.L$8 = r5
            r4.L$9 = r5
            r4.I$0 = r1
            r4.I$1 = r13
            r4.label = r10
            java.lang.Object r5 = r8.cloneComposition(r5, r4)
            if (r5 != r6) goto L_0x016a
            return r6
        L_0x016a:
            r8 = r11
            r10 = r12
            r11 = r14
            r12 = r15
        L_0x016e:
            com.sugarcube.core.network.models.Composition r5 = (com.sugarcube.core.network.models.Composition) r5
            r14 = r11
            r15 = r12
            r11 = r8
            r12 = r10
            r8 = r5
        L_0x0175:
            r4.L$0 = r15
            r4.L$1 = r14
            r4.L$2 = r12
            r4.L$3 = r11
            r4.L$4 = r7
            r4.L$5 = r3
            r4.L$6 = r2
            r4.L$7 = r8
            r4.L$8 = r8
            r4.I$0 = r1
            r4.I$1 = r13
            r4.label = r9
            java.lang.Object r1 = r15.refreshCache(r4)
            if (r1 != r6) goto L_0x0194
            return r6
        L_0x0194:
            if (r8 == 0) goto L_0x019c
            com.sugarcube.app.base.data.Result$Success r1 = new com.sugarcube.app.base.data.Result$Success
            r1.<init>(r8)
            goto L_0x01a8
        L_0x019c:
            com.sugarcube.app.base.data.Result$Error r1 = new com.sugarcube.app.base.data.Result$Error
            java.lang.Exception r2 = new java.lang.Exception
            r2.<init>()
            java.lang.String r3 = "Could not clone composition"
            r1.<init>(r2, r3)
        L_0x01a8:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.data.source.CompositionRepository.cloneComposition(java.util.UUID, java.lang.String, dI.e):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v5, resolved type: dI.e<? super com.sugarcube.core.network.models.Composition>} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00d5 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00d6 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object createComposition(com.sugarcube.core.network.models.Composition r10, dI.C17164e<? super com.sugarcube.core.network.models.Composition> r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof com.sugarcube.app.base.data.source.CompositionRepository$createComposition$1
            if (r0 == 0) goto L_0x0013
            r0 = r11
            com.sugarcube.app.base.data.source.CompositionRepository$createComposition$1 r0 = (com.sugarcube.app.base.data.source.CompositionRepository$createComposition$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.sugarcube.app.base.data.source.CompositionRepository$createComposition$1 r0 = new com.sugarcube.app.base.data.source.CompositionRepository$createComposition$1
            r0.<init>(r9, r11)
        L_0x0018:
            java.lang.Object r1 = r0.result
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.label
            r4 = 3
            r5 = 2
            r6 = 1
            if (r3 == 0) goto L_0x0083
            if (r3 == r6) goto L_0x0071
            if (r3 == r5) goto L_0x0050
            if (r3 != r4) goto L_0x0048
            java.lang.Object r10 = r0.L$5
            com.sugarcube.core.network.models.Composition r10 = (com.sugarcube.core.network.models.Composition) r10
            java.lang.Object r10 = r0.L$4
            com.sugarcube.core.network.models.Composition r10 = (com.sugarcube.core.network.models.Composition) r10
            java.lang.Object r11 = r0.L$3
            com.sugarcube.core.network.models.Composition r11 = (com.sugarcube.core.network.models.Composition) r11
            java.lang.Object r11 = r0.L$2
            dI.e r11 = (dI.C17164e) r11
            java.lang.Object r11 = r0.L$1
            com.sugarcube.core.network.models.Composition r11 = (com.sugarcube.core.network.models.Composition) r11
            java.lang.Object r11 = r0.L$0
            com.sugarcube.app.base.data.source.CompositionRepository r11 = (com.sugarcube.app.base.data.source.CompositionRepository) r11
            XH.y.b(r1)
            goto L_0x00d7
        L_0x0048:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x0050:
            int r10 = r0.I$0
            java.lang.Object r11 = r0.L$5
            com.sugarcube.core.network.models.Composition r11 = (com.sugarcube.core.network.models.Composition) r11
            java.lang.Object r3 = r0.L$4
            com.sugarcube.core.network.models.Composition r3 = (com.sugarcube.core.network.models.Composition) r3
            java.lang.Object r5 = r0.L$3
            com.sugarcube.core.network.models.Composition r5 = (com.sugarcube.core.network.models.Composition) r5
            java.lang.Object r6 = r0.L$2
            dI.e r6 = (dI.C17164e) r6
            java.lang.Object r7 = r0.L$1
            com.sugarcube.core.network.models.Composition r7 = (com.sugarcube.core.network.models.Composition) r7
            java.lang.Object r8 = r0.L$0
            com.sugarcube.app.base.data.source.CompositionRepository r8 = (com.sugarcube.app.base.data.source.CompositionRepository) r8
            XH.y.b(r1)
            r1 = r6
            r6 = r10
            r10 = r3
            goto L_0x00bf
        L_0x0071:
            java.lang.Object r10 = r0.L$2
            r11 = r10
            dI.e r11 = (dI.C17164e) r11
            java.lang.Object r10 = r0.L$1
            com.sugarcube.core.network.models.Composition r10 = (com.sugarcube.core.network.models.Composition) r10
            java.lang.Object r3 = r0.L$0
            com.sugarcube.app.base.data.source.CompositionRepository r3 = (com.sugarcube.app.base.data.source.CompositionRepository) r3
            XH.y.b(r1)
            r8 = r3
            goto L_0x009a
        L_0x0083:
            XH.y.b(r1)
            com.sugarcube.app.base.data.source.CompositionRemoteDataSource r1 = r9.getRemoteSource()
            r0.L$0 = r9
            r0.L$1 = r10
            r0.L$2 = r11
            r0.label = r6
            java.lang.Object r1 = r1.createComposition(r10, r0)
            if (r1 != r2) goto L_0x0099
            return r2
        L_0x0099:
            r8 = r9
        L_0x009a:
            com.sugarcube.core.network.models.Composition r1 = (com.sugarcube.core.network.models.Composition) r1
            if (r1 == 0) goto L_0x00d6
            com.sugarcube.app.base.data.source.CompositionLocalDataSource r3 = r8.getLocalSource()
            r0.L$0 = r8
            r0.L$1 = r10
            r0.L$2 = r11
            r0.L$3 = r1
            r0.L$4 = r1
            r0.L$5 = r1
            r6 = 0
            r0.I$0 = r6
            r0.label = r5
            java.lang.Object r3 = r3.cacheComposition(r1, r0)
            if (r3 != r2) goto L_0x00ba
            return r2
        L_0x00ba:
            r7 = r10
            r10 = r1
            r5 = r10
            r1 = r11
            r11 = r5
        L_0x00bf:
            r0.L$0 = r8
            r0.L$1 = r7
            r0.L$2 = r1
            r0.L$3 = r5
            r0.L$4 = r10
            r0.L$5 = r11
            r0.I$0 = r6
            r0.label = r4
            java.lang.Object r11 = r8.refreshCache(r0)
            if (r11 != r2) goto L_0x00d7
            return r2
        L_0x00d6:
            r10 = 0
        L_0x00d7:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.data.source.CompositionRepository.createComposition(com.sugarcube.core.network.models.Composition, dI.e):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v8, resolved type: dI.e<? super com.sugarcube.app.base.data.Result<java.lang.Boolean>>} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00ac A[Catch:{ Exception -> 0x003f }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00ad A[Catch:{ Exception -> 0x003f }] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00c6 A[Catch:{ Exception -> 0x003f }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00cf A[Catch:{ Exception -> 0x003f }] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00d9 A[Catch:{ Exception -> 0x003f }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object deleteComposition(java.util.UUID r13, dI.C17164e<? super com.sugarcube.app.base.data.Result<java.lang.Boolean>> r14) {
        /*
            r12 = this;
            boolean r0 = r14 instanceof com.sugarcube.app.base.data.source.CompositionRepository$deleteComposition$1
            if (r0 == 0) goto L_0x0013
            r0 = r14
            com.sugarcube.app.base.data.source.CompositionRepository$deleteComposition$1 r0 = (com.sugarcube.app.base.data.source.CompositionRepository$deleteComposition$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.sugarcube.app.base.data.source.CompositionRepository$deleteComposition$1 r0 = new com.sugarcube.app.base.data.source.CompositionRepository$deleteComposition$1
            r0.<init>(r12, r14)
        L_0x0018:
            java.lang.Object r1 = r0.result
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.label
            r4 = 3
            r5 = 1
            r6 = 0
            r7 = 2
            if (r3 == 0) goto L_0x0075
            if (r3 == r5) goto L_0x0063
            if (r3 == r7) goto L_0x004a
            if (r3 != r4) goto L_0x0042
            java.lang.Object r13 = r0.L$3
            java.lang.Object r14 = r0.L$2
            dI.e r14 = (dI.C17164e) r14
            java.lang.Object r14 = r0.L$1
            java.util.UUID r14 = (java.util.UUID) r14
            java.lang.Object r14 = r0.L$0
            com.sugarcube.app.base.data.source.CompositionRepository r14 = (com.sugarcube.app.base.data.source.CompositionRepository) r14
            XH.y.b(r1)     // Catch:{ Exception -> 0x003f }
            goto L_0x00c7
        L_0x003f:
            r13 = move-exception
            goto L_0x00e4
        L_0x0042:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L_0x004a:
            int r13 = r0.I$0
            boolean r14 = r0.Z$0
            java.lang.Object r3 = r0.L$3
            java.lang.Object r8 = r0.L$2
            dI.e r8 = (dI.C17164e) r8
            java.lang.Object r9 = r0.L$1
            java.util.UUID r9 = (java.util.UUID) r9
            java.lang.Object r10 = r0.L$0
            com.sugarcube.app.base.data.source.CompositionRepository r10 = (com.sugarcube.app.base.data.source.CompositionRepository) r10
            XH.y.b(r1)     // Catch:{ Exception -> 0x003f }
            r1 = r9
            r9 = r13
            r13 = r3
            goto L_0x00b2
        L_0x0063:
            java.lang.Object r13 = r0.L$2
            r14 = r13
            dI.e r14 = (dI.C17164e) r14
            java.lang.Object r13 = r0.L$1
            java.util.UUID r13 = (java.util.UUID) r13
            java.lang.Object r3 = r0.L$0
            com.sugarcube.app.base.data.source.CompositionRepository r3 = (com.sugarcube.app.base.data.source.CompositionRepository) r3
            XH.y.b(r1)     // Catch:{ Exception -> 0x003f }
            r10 = r3
            goto L_0x008c
        L_0x0075:
            XH.y.b(r1)
            com.sugarcube.app.base.data.source.CompositionRemoteDataSource r1 = r12.getRemoteSource()     // Catch:{ Exception -> 0x003f }
            r0.L$0 = r12     // Catch:{ Exception -> 0x003f }
            r0.L$1 = r13     // Catch:{ Exception -> 0x003f }
            r0.L$2 = r14     // Catch:{ Exception -> 0x003f }
            r0.label = r5     // Catch:{ Exception -> 0x003f }
            java.lang.Object r1 = r1.deleteComposition(r13, r0)     // Catch:{ Exception -> 0x003f }
            if (r1 != r2) goto L_0x008b
            return r2
        L_0x008b:
            r10 = r12
        L_0x008c:
            r3 = r1
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch:{ Exception -> 0x003f }
            boolean r3 = r3.booleanValue()     // Catch:{ Exception -> 0x003f }
            com.sugarcube.app.base.data.source.CompositionLocalDataSource r8 = r10.getLocalSource()     // Catch:{ Exception -> 0x003f }
            r0.L$0 = r10     // Catch:{ Exception -> 0x003f }
            r0.L$1 = r13     // Catch:{ Exception -> 0x003f }
            r0.L$2 = r14     // Catch:{ Exception -> 0x003f }
            r0.L$3 = r1     // Catch:{ Exception -> 0x003f }
            r0.Z$0 = r3     // Catch:{ Exception -> 0x003f }
            r9 = 0
            r0.I$0 = r9     // Catch:{ Exception -> 0x003f }
            r0.label = r7     // Catch:{ Exception -> 0x003f }
            java.lang.Object r8 = r8.deleteComposition(r13, r0)     // Catch:{ Exception -> 0x003f }
            if (r8 != r2) goto L_0x00ad
            return r2
        L_0x00ad:
            r8 = r14
            r14 = r3
            r11 = r1
            r1 = r13
            r13 = r11
        L_0x00b2:
            r0.L$0 = r10     // Catch:{ Exception -> 0x003f }
            r0.L$1 = r1     // Catch:{ Exception -> 0x003f }
            r0.L$2 = r8     // Catch:{ Exception -> 0x003f }
            r0.L$3 = r13     // Catch:{ Exception -> 0x003f }
            r0.Z$0 = r14     // Catch:{ Exception -> 0x003f }
            r0.I$0 = r9     // Catch:{ Exception -> 0x003f }
            r0.label = r4     // Catch:{ Exception -> 0x003f }
            java.lang.Object r14 = r10.refreshCache(r0)     // Catch:{ Exception -> 0x003f }
            if (r14 != r2) goto L_0x00c7
            return r2
        L_0x00c7:
            java.lang.Boolean r13 = (java.lang.Boolean) r13     // Catch:{ Exception -> 0x003f }
            boolean r13 = r13.booleanValue()     // Catch:{ Exception -> 0x003f }
            if (r13 == 0) goto L_0x00d9
            com.sugarcube.app.base.data.Result$Success r13 = new com.sugarcube.app.base.data.Result$Success     // Catch:{ Exception -> 0x003f }
            java.lang.Boolean r14 = kotlin.coroutines.jvm.internal.b.a(r5)     // Catch:{ Exception -> 0x003f }
            r13.<init>(r14)     // Catch:{ Exception -> 0x003f }
            goto L_0x00ea
        L_0x00d9:
            com.sugarcube.app.base.data.Result$Error r13 = new com.sugarcube.app.base.data.Result$Error     // Catch:{ Exception -> 0x003f }
            java.lang.Exception r14 = new java.lang.Exception     // Catch:{ Exception -> 0x003f }
            r14.<init>()     // Catch:{ Exception -> 0x003f }
            r13.<init>(r14, r6, r7, r6)     // Catch:{ Exception -> 0x003f }
            goto L_0x00ea
        L_0x00e4:
            com.sugarcube.app.base.data.Result$Error r14 = new com.sugarcube.app.base.data.Result$Error
            r14.<init>(r13, r6, r7, r6)
            r13 = r14
        L_0x00ea:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.data.source.CompositionRepository.deleteComposition(java.util.UUID, dI.e):java.lang.Object");
    }

    /* access modifiers changed from: protected */
    public Object fetch(UUID uuid, C17164e<? super List<Composition>> eVar) {
        return C16310i.g(getCoroutineContext(), new CompositionRepository$fetch$2(this, uuid, (C17164e<? super CompositionRepository$fetch$2>) null), eVar);
    }

    public Object fetchCompiledComposition(UUID uuid, C17164e<? super CompiledComposition> eVar) {
        return getRemoteSource().fetchCompiledComposition(uuid, eVar);
    }

    public Object fetchComposition(int i10, C17164e<? super Composition> eVar) {
        return getRemoteSource().fetchComposition(i10, eVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object renameComposition(java.util.UUID r25, java.lang.String r26, dI.C17164e<? super com.sugarcube.core.network.models.Composition> r27) {
        /*
            r24 = this;
            r0 = r24
            r1 = r25
            r2 = r26
            r3 = r27
            boolean r4 = r3 instanceof com.sugarcube.app.base.data.source.CompositionRepository$renameComposition$1
            if (r4 == 0) goto L_0x001b
            r4 = r3
            com.sugarcube.app.base.data.source.CompositionRepository$renameComposition$1 r4 = (com.sugarcube.app.base.data.source.CompositionRepository$renameComposition$1) r4
            int r5 = r4.label
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = r5 & r6
            if (r7 == 0) goto L_0x001b
            int r5 = r5 - r6
            r4.label = r5
            goto L_0x0020
        L_0x001b:
            com.sugarcube.app.base.data.source.CompositionRepository$renameComposition$1 r4 = new com.sugarcube.app.base.data.source.CompositionRepository$renameComposition$1
            r4.<init>(r0, r3)
        L_0x0020:
            java.lang.Object r5 = r4.result
            java.lang.Object r6 = eI.C17187b.f()
            int r7 = r4.label
            r8 = 0
            r9 = 0
            r10 = 2
            r11 = 1
            if (r7 == 0) goto L_0x0092
            if (r7 == r11) goto L_0x006c
            if (r7 != r10) goto L_0x0064
            java.lang.Object r1 = r4.L$10
            com.sugarcube.core.network.models.Composition r1 = (com.sugarcube.core.network.models.Composition) r1
            java.lang.Object r1 = r4.L$9
            com.sugarcube.core.network.models.Composition r1 = (com.sugarcube.core.network.models.Composition) r1
            java.lang.Object r2 = r4.L$8
            com.sugarcube.core.network.models.Composition r2 = (com.sugarcube.core.network.models.Composition) r2
            java.lang.Object r2 = r4.L$7
            com.sugarcube.core.network.models.CompositionRequest r2 = (com.sugarcube.core.network.models.CompositionRequest) r2
            java.lang.Object r2 = r4.L$6
            com.sugarcube.core.network.models.Composition r2 = (com.sugarcube.core.network.models.Composition) r2
            java.lang.Object r2 = r4.L$5
            com.sugarcube.core.network.models.Composition r2 = (com.sugarcube.core.network.models.Composition) r2
            java.lang.Object r2 = r4.L$4
            com.sugarcube.core.network.models.Composition r2 = (com.sugarcube.core.network.models.Composition) r2
            java.lang.Object r2 = r4.L$3
            dI.e r2 = (dI.C17164e) r2
            java.lang.Object r2 = r4.L$2
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r2 = r4.L$1
            java.util.UUID r2 = (java.util.UUID) r2
            java.lang.Object r2 = r4.L$0
            com.sugarcube.app.base.data.source.CompositionRepository r2 = (com.sugarcube.app.base.data.source.CompositionRepository) r2
            XH.y.b(r5)
            r8 = r1
            goto L_0x010d
        L_0x0064:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x006c:
            int r1 = r4.I$0
            java.lang.Object r2 = r4.L$7
            com.sugarcube.core.network.models.CompositionRequest r2 = (com.sugarcube.core.network.models.CompositionRequest) r2
            java.lang.Object r3 = r4.L$6
            com.sugarcube.core.network.models.Composition r3 = (com.sugarcube.core.network.models.Composition) r3
            java.lang.Object r7 = r4.L$5
            com.sugarcube.core.network.models.Composition r7 = (com.sugarcube.core.network.models.Composition) r7
            java.lang.Object r11 = r4.L$4
            com.sugarcube.core.network.models.Composition r11 = (com.sugarcube.core.network.models.Composition) r11
            java.lang.Object r12 = r4.L$3
            dI.e r12 = (dI.C17164e) r12
            java.lang.Object r13 = r4.L$2
            java.lang.String r13 = (java.lang.String) r13
            java.lang.Object r14 = r4.L$1
            java.util.UUID r14 = (java.util.UUID) r14
            java.lang.Object r15 = r4.L$0
            com.sugarcube.app.base.data.source.CompositionRepository r15 = (com.sugarcube.app.base.data.source.CompositionRepository) r15
            XH.y.b(r5)
            goto L_0x00e5
        L_0x0092:
            XH.y.b(r5)
            com.sugarcube.core.network.models.Composition r5 = r24.getComposition((java.util.UUID) r25)
            if (r5 == 0) goto L_0x010d
            com.sugarcube.core.network.models.CompositionRequest r12 = com.sugarcube.app.base.data.source.CompositionDataSourceKt.asRequest(r5)
            if (r2 != 0) goto L_0x00a5
            java.lang.String r7 = ""
            r14 = r7
            goto L_0x00a6
        L_0x00a5:
            r14 = r2
        L_0x00a6:
            r22 = 509(0x1fd, float:7.13E-43)
            r23 = 0
            r13 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            com.sugarcube.core.network.models.CompositionRequest r7 = com.sugarcube.core.network.models.CompositionRequest.copy$default(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            com.sugarcube.app.base.data.source.CompositionRemoteDataSource r12 = r24.getRemoteSource()
            r4.L$0 = r0
            r4.L$1 = r1
            r4.L$2 = r2
            r4.L$3 = r3
            r4.L$4 = r5
            r4.L$5 = r5
            r4.L$6 = r5
            r4.L$7 = r7
            r4.I$0 = r9
            r4.label = r11
            java.lang.Object r11 = r12.updateComposition(r1, r7, r4)
            if (r11 != r6) goto L_0x00db
            return r6
        L_0x00db:
            r15 = r0
            r14 = r1
            r13 = r2
            r12 = r3
            r3 = r5
            r2 = r7
            r1 = r9
            r7 = r3
            r5 = r11
            r11 = r7
        L_0x00e5:
            com.sugarcube.core.network.models.Composition r5 = (com.sugarcube.core.network.models.Composition) r5
            if (r5 == 0) goto L_0x010d
            r4.L$0 = r15
            r4.L$1 = r14
            r4.L$2 = r13
            r4.L$3 = r12
            r4.L$4 = r11
            r4.L$5 = r7
            r4.L$6 = r3
            r4.L$7 = r2
            r4.L$8 = r5
            r4.L$9 = r5
            r4.L$10 = r5
            r4.I$0 = r1
            r4.I$1 = r9
            r4.label = r10
            java.lang.Object r1 = r15.refreshCache(r4)
            if (r1 != r6) goto L_0x010c
            return r6
        L_0x010c:
            r8 = r5
        L_0x010d:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.data.source.CompositionRepository.renameComposition(java.util.UUID, java.lang.String, dI.e):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x011b  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object shareComposition(java.util.UUID r37, boolean r38, dI.C17164e<? super com.sugarcube.app.base.data.Result<com.sugarcube.core.network.models.Composition>> r39) {
        /*
            r36 = this;
            r0 = r36
            r1 = r37
            r2 = r39
            boolean r3 = r2 instanceof com.sugarcube.app.base.data.source.CompositionRepository$shareComposition$1
            if (r3 == 0) goto L_0x0019
            r3 = r2
            com.sugarcube.app.base.data.source.CompositionRepository$shareComposition$1 r3 = (com.sugarcube.app.base.data.source.CompositionRepository$shareComposition$1) r3
            int r4 = r3.label
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x0019
            int r4 = r4 - r5
            r3.label = r4
            goto L_0x001e
        L_0x0019:
            com.sugarcube.app.base.data.source.CompositionRepository$shareComposition$1 r3 = new com.sugarcube.app.base.data.source.CompositionRepository$shareComposition$1
            r3.<init>(r0, r2)
        L_0x001e:
            java.lang.Object r4 = r3.result
            java.lang.Object r5 = eI.C17187b.f()
            int r6 = r3.label
            r7 = 0
            r8 = 2
            r9 = 1
            if (r6 == 0) goto L_0x0088
            if (r6 == r9) goto L_0x0064
            if (r6 != r8) goto L_0x005c
            java.lang.Object r1 = r3.L$9
            com.sugarcube.core.network.models.Composition r1 = (com.sugarcube.core.network.models.Composition) r1
            java.lang.Object r2 = r3.L$8
            com.sugarcube.core.network.models.Composition r2 = (com.sugarcube.core.network.models.Composition) r2
            java.lang.Object r2 = r3.L$7
            com.sugarcube.core.network.models.Composition r2 = (com.sugarcube.core.network.models.Composition) r2
            java.lang.Object r2 = r3.L$6
            com.sugarcube.core.network.models.CompositionRequest r2 = (com.sugarcube.core.network.models.CompositionRequest) r2
            java.lang.Object r2 = r3.L$5
            com.sugarcube.core.network.models.Composition r2 = (com.sugarcube.core.network.models.Composition) r2
            java.lang.Object r2 = r3.L$4
            com.sugarcube.core.network.models.Composition r2 = (com.sugarcube.core.network.models.Composition) r2
            java.lang.Object r2 = r3.L$3
            com.sugarcube.core.network.models.Composition r2 = (com.sugarcube.core.network.models.Composition) r2
            java.lang.Object r2 = r3.L$2
            dI.e r2 = (dI.C17164e) r2
            java.lang.Object r2 = r3.L$1
            java.util.UUID r2 = (java.util.UUID) r2
            java.lang.Object r2 = r3.L$0
            com.sugarcube.app.base.data.source.CompositionRepository r2 = (com.sugarcube.app.base.data.source.CompositionRepository) r2
            XH.y.b(r4)
            goto L_0x0115
        L_0x005c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0064:
            int r1 = r3.I$0
            boolean r2 = r3.Z$0
            java.lang.Object r6 = r3.L$6
            com.sugarcube.core.network.models.CompositionRequest r6 = (com.sugarcube.core.network.models.CompositionRequest) r6
            java.lang.Object r9 = r3.L$5
            com.sugarcube.core.network.models.Composition r9 = (com.sugarcube.core.network.models.Composition) r9
            java.lang.Object r10 = r3.L$4
            com.sugarcube.core.network.models.Composition r10 = (com.sugarcube.core.network.models.Composition) r10
            java.lang.Object r11 = r3.L$3
            com.sugarcube.core.network.models.Composition r11 = (com.sugarcube.core.network.models.Composition) r11
            java.lang.Object r12 = r3.L$2
            dI.e r12 = (dI.C17164e) r12
            java.lang.Object r13 = r3.L$1
            java.util.UUID r13 = (java.util.UUID) r13
            java.lang.Object r14 = r3.L$0
            com.sugarcube.app.base.data.source.CompositionRepository r14 = (com.sugarcube.app.base.data.source.CompositionRepository) r14
            XH.y.b(r4)
            goto L_0x00ed
        L_0x0088:
            XH.y.b(r4)
            com.sugarcube.core.network.models.Composition r4 = r36.getComposition((java.util.UUID) r37)
            if (r4 == 0) goto L_0x0128
            r34 = 261631(0x3fdff, float:3.66623E-40)
            r35 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 1
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            r32 = 0
            r33 = 0
            r15 = r4
            com.sugarcube.core.network.models.Composition r6 = com.sugarcube.core.network.models.Composition.copy$default(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35)
            com.sugarcube.core.network.models.CompositionRequest r6 = com.sugarcube.app.base.data.source.CompositionDataSourceKt.asRequest(r6)
            com.sugarcube.app.base.data.source.CompositionRemoteDataSource r10 = r36.getRemoteSource()
            r3.L$0 = r0
            r3.L$1 = r1
            r3.L$2 = r2
            r3.L$3 = r4
            r3.L$4 = r4
            r3.L$5 = r4
            r3.L$6 = r6
            r11 = r38
            r3.Z$0 = r11
            r3.I$0 = r7
            r3.label = r9
            java.lang.Object r9 = r10.updateComposition(r1, r6, r3)
            if (r9 != r5) goto L_0x00e4
            return r5
        L_0x00e4:
            r14 = r0
            r13 = r1
            r12 = r2
            r10 = r4
            r1 = r7
            r2 = r11
            r11 = r10
            r4 = r9
            r9 = r11
        L_0x00ed:
            com.sugarcube.core.network.models.Composition r4 = (com.sugarcube.core.network.models.Composition) r4
            if (r4 == 0) goto L_0x011b
            r3.L$0 = r14
            r3.L$1 = r13
            r3.L$2 = r12
            r3.L$3 = r11
            r3.L$4 = r10
            r3.L$5 = r9
            r3.L$6 = r6
            r3.L$7 = r4
            r3.L$8 = r4
            r3.L$9 = r4
            r3.Z$0 = r2
            r3.I$0 = r1
            r3.I$1 = r7
            r3.label = r8
            java.lang.Object r1 = r14.refreshCache(r3)
            if (r1 != r5) goto L_0x0114
            return r5
        L_0x0114:
            r1 = r4
        L_0x0115:
            com.sugarcube.app.base.data.Result$Success r2 = new com.sugarcube.app.base.data.Result$Success
            r2.<init>(r1)
            goto L_0x0134
        L_0x011b:
            com.sugarcube.app.base.data.Result$Error r2 = new com.sugarcube.app.base.data.Result$Error
            java.lang.Exception r1 = new java.lang.Exception
            r1.<init>()
            java.lang.String r3 = "Failed to share the composition: Unable to perform the request"
            r2.<init>(r1, r3)
            goto L_0x0134
        L_0x0128:
            com.sugarcube.app.base.data.Result$Error r2 = new com.sugarcube.app.base.data.Result$Error
            java.lang.Exception r1 = new java.lang.Exception
            r1.<init>()
            java.lang.String r3 = "Failed to share the composition: Unable to access the composition"
            r2.<init>(r1, r3)
        L_0x0134:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.data.source.CompositionRepository.shareComposition(java.util.UUID, boolean, dI.e):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v2, resolved type: dI.e<? super com.sugarcube.core.network.models.Composition>} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x009a A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object updateComposition(com.sugarcube.core.network.models.Composition r8, dI.C17164e<? super com.sugarcube.core.network.models.Composition> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.sugarcube.app.base.data.source.CompositionRepository$updateComposition$1
            if (r0 == 0) goto L_0x0013
            r0 = r9
            com.sugarcube.app.base.data.source.CompositionRepository$updateComposition$1 r0 = (com.sugarcube.app.base.data.source.CompositionRepository$updateComposition$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.sugarcube.app.base.data.source.CompositionRepository$updateComposition$1 r0 = new com.sugarcube.app.base.data.source.CompositionRepository$updateComposition$1
            r0.<init>(r7, r9)
        L_0x0018:
            java.lang.Object r1 = r0.result
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.label
            r4 = 2
            r5 = 1
            if (r3 == 0) goto L_0x005d
            if (r3 == r5) goto L_0x004c
            if (r3 != r4) goto L_0x0044
            java.lang.Object r8 = r0.L$5
            com.sugarcube.core.network.models.Composition r8 = (com.sugarcube.core.network.models.Composition) r8
            java.lang.Object r8 = r0.L$4
            com.sugarcube.core.network.models.Composition r8 = (com.sugarcube.core.network.models.Composition) r8
            java.lang.Object r9 = r0.L$3
            com.sugarcube.core.network.models.Composition r9 = (com.sugarcube.core.network.models.Composition) r9
            java.lang.Object r9 = r0.L$2
            dI.e r9 = (dI.C17164e) r9
            java.lang.Object r9 = r0.L$1
            com.sugarcube.core.network.models.Composition r9 = (com.sugarcube.core.network.models.Composition) r9
            java.lang.Object r9 = r0.L$0
            com.sugarcube.app.base.data.source.CompositionRepository r9 = (com.sugarcube.app.base.data.source.CompositionRepository) r9
            XH.y.b(r1)
            goto L_0x009b
        L_0x0044:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x004c:
            java.lang.Object r8 = r0.L$2
            r9 = r8
            dI.e r9 = (dI.C17164e) r9
            java.lang.Object r8 = r0.L$1
            com.sugarcube.core.network.models.Composition r8 = (com.sugarcube.core.network.models.Composition) r8
            java.lang.Object r3 = r0.L$0
            com.sugarcube.app.base.data.source.CompositionRepository r3 = (com.sugarcube.app.base.data.source.CompositionRepository) r3
            XH.y.b(r1)
            goto L_0x007c
        L_0x005d:
            XH.y.b(r1)
            com.sugarcube.app.base.data.source.CompositionRemoteDataSource r1 = r7.getRemoteSource()
            java.util.UUID r3 = r8.getCompositionUuid()
            com.sugarcube.core.network.models.CompositionRequest r6 = com.sugarcube.app.base.data.source.CompositionDataSourceKt.asRequest(r8)
            r0.L$0 = r7
            r0.L$1 = r8
            r0.L$2 = r9
            r0.label = r5
            java.lang.Object r1 = r1.updateComposition(r3, r6, r0)
            if (r1 != r2) goto L_0x007b
            return r2
        L_0x007b:
            r3 = r7
        L_0x007c:
            com.sugarcube.core.network.models.Composition r1 = (com.sugarcube.core.network.models.Composition) r1
            if (r1 == 0) goto L_0x009a
            r0.L$0 = r3
            r0.L$1 = r8
            r0.L$2 = r9
            r0.L$3 = r1
            r0.L$4 = r1
            r0.L$5 = r1
            r8 = 0
            r0.I$0 = r8
            r0.label = r4
            java.lang.Object r8 = r3.refreshCache(r0)
            if (r8 != r2) goto L_0x0098
            return r2
        L_0x0098:
            r8 = r1
            goto L_0x009b
        L_0x009a:
            r8 = 0
        L_0x009b:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.data.source.CompositionRepository.updateComposition(com.sugarcube.core.network.models.Composition, dI.e):java.lang.Object");
    }
}
