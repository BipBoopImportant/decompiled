package com.sugarcube.app.base.data.database;

import YH.g0;
import com.sugarcube.core.network.models.SceneResponseJobState;
import com.sugarcube.core.network.models.SceneResponseState;
import fI.C17220a;
import fI.C17221b;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0011\b\u0002\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0011B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0012"}, d2 = {"Lcom/sugarcube/app/base/data/database/SceneState;", "", "<init>", "(Ljava/lang/String;I)V", "NEW", "NEW_FAILED", "UPLOAD_PENDING", "UPLOADING", "UPLOADED", "UPLOAD_FAILED", "SCHEDULED", "PROCESSING", "PREVIEW", "SUCCESS", "FAILURE", "SOFT_DELETED", "DELETED", "Companion", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public enum SceneState {
    NEW,
    NEW_FAILED,
    UPLOAD_PENDING,
    UPLOADING,
    UPLOADED,
    UPLOAD_FAILED,
    SCHEDULED,
    PROCESSING,
    PREVIEW,
    SUCCESS,
    FAILURE,
    SOFT_DELETED,
    DELETED;
    
    public static final Companion Companion = null;
    /* access modifiers changed from: private */
    public static final Set<SceneState> failureStates = null;
    /* access modifiers changed from: private */
    public static final Set<SceneState> inProgressStates = null;
    /* access modifiers changed from: private */
    public static final Set<SceneState> processingStates = null;
    /* access modifiers changed from: private */
    public static final Set<SceneState> readyStates = null;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u0015R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\bR\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\bR\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\b¨\u0006\u0016"}, d2 = {"Lcom/sugarcube/app/base/data/database/SceneState$Companion;", "", "<init>", "()V", "readyStates", "", "Lcom/sugarcube/app/base/data/database/SceneState;", "getReadyStates", "()Ljava/util/Set;", "inProgressStates", "getInProgressStates", "processingStates", "getProcessingStates", "failureStates", "getFailureStates", "fromSceneResponseState", "sceneState", "Lcom/sugarcube/core/network/models/SceneResponseState;", "jobState", "Lcom/sugarcube/core/network/models/SceneResponseJobState;", "isPreviewable", "", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0 = null;
            public static final /* synthetic */ int[] $EnumSwitchMapping$1 = null;

            /* JADX WARNING: Can't wrap try/catch for region: R(18:0|(2:1|2)|3|(2:5|6)|7|9|10|11|12|(2:13|14)|15|17|18|19|20|(2:21|22)|23|25) */
            /* JADX WARNING: Can't wrap try/catch for region: R(20:0|(2:1|2)|3|(2:5|6)|7|9|10|11|12|13|14|15|17|18|19|20|21|22|23|25) */
            /* JADX WARNING: Failed to process nested try/catch */
            /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0022 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x002b */
            /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0045 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x004d */
            static {
                /*
                    com.sugarcube.core.network.models.SceneResponseJobState[] r0 = com.sugarcube.core.network.models.SceneResponseJobState.values()
                    int r0 = r0.length
                    int[] r0 = new int[r0]
                    r1 = 1
                    com.sugarcube.core.network.models.SceneResponseJobState r2 = com.sugarcube.core.network.models.SceneResponseJobState.Initialized     // Catch:{ NoSuchFieldError -> 0x0010 }
                    int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                    r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0010 }
                L_0x0010:
                    r2 = 2
                    com.sugarcube.core.network.models.SceneResponseJobState r3 = com.sugarcube.core.network.models.SceneResponseJobState.Processing     // Catch:{ NoSuchFieldError -> 0x0019 }
                    int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                    r0[r3] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
                L_0x0019:
                    r3 = 3
                    com.sugarcube.core.network.models.SceneResponseJobState r4 = com.sugarcube.core.network.models.SceneResponseJobState.Failed     // Catch:{ NoSuchFieldError -> 0x0022 }
                    int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                    r0[r4] = r3     // Catch:{ NoSuchFieldError -> 0x0022 }
                L_0x0022:
                    com.sugarcube.core.network.models.SceneResponseJobState r4 = com.sugarcube.core.network.models.SceneResponseJobState.Success     // Catch:{ NoSuchFieldError -> 0x002b }
                    int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                    r5 = 4
                    r0[r4] = r5     // Catch:{ NoSuchFieldError -> 0x002b }
                L_0x002b:
                    com.sugarcube.core.network.models.SceneResponseJobState r4 = com.sugarcube.core.network.models.SceneResponseJobState.Lost     // Catch:{ NoSuchFieldError -> 0x0034 }
                    int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                    r5 = 5
                    r0[r4] = r5     // Catch:{ NoSuchFieldError -> 0x0034 }
                L_0x0034:
                    $EnumSwitchMapping$0 = r0
                    com.sugarcube.core.network.models.SceneResponseState[] r0 = com.sugarcube.core.network.models.SceneResponseState.values()
                    int r0 = r0.length
                    int[] r0 = new int[r0]
                    com.sugarcube.core.network.models.SceneResponseState r4 = com.sugarcube.core.network.models.SceneResponseState.Uploaded     // Catch:{ NoSuchFieldError -> 0x0045 }
                    int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0045 }
                    r0[r4] = r1     // Catch:{ NoSuchFieldError -> 0x0045 }
                L_0x0045:
                    com.sugarcube.core.network.models.SceneResponseState r1 = com.sugarcube.core.network.models.SceneResponseState.Done     // Catch:{ NoSuchFieldError -> 0x004d }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004d }
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004d }
                L_0x004d:
                    com.sugarcube.core.network.models.SceneResponseState r1 = com.sugarcube.core.network.models.SceneResponseState.Deleted     // Catch:{ NoSuchFieldError -> 0x0055 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0055 }
                    r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x0055 }
                L_0x0055:
                    $EnumSwitchMapping$1 = r0
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.data.database.SceneState.Companion.WhenMappings.<clinit>():void");
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ SceneState fromSceneResponseState$default(Companion companion, SceneResponseState sceneResponseState, SceneResponseJobState sceneResponseJobState, boolean z10, int i10, Object obj) {
            if ((i10 & 4) != 0) {
                z10 = false;
            }
            return companion.fromSceneResponseState(sceneResponseState, sceneResponseJobState, z10);
        }

        public final SceneState fromSceneResponseState(SceneResponseState sceneResponseState, SceneResponseJobState sceneResponseJobState, boolean z10) {
            C17542s.j(sceneResponseState, "sceneState");
            C17542s.j(sceneResponseJobState, "jobState");
            int i10 = WhenMappings.$EnumSwitchMapping$1[sceneResponseState.ordinal()];
            if (i10 == 1) {
                int i11 = WhenMappings.$EnumSwitchMapping$0[sceneResponseJobState.ordinal()];
                return i11 != 1 ? i11 != 2 ? i11 != 3 ? SceneState.SCHEDULED : SceneState.FAILURE : z10 ? SceneState.PREVIEW : SceneState.PROCESSING : SceneState.PROCESSING;
            } else if (i10 != 2) {
                return i10 != 3 ? SceneState.SCHEDULED : SceneState.DELETED;
            } else {
                int i12 = WhenMappings.$EnumSwitchMapping$0[sceneResponseJobState.ordinal()];
                if (i12 != 3) {
                    if (i12 == 4) {
                        return SceneState.SUCCESS;
                    }
                    if (i12 != 5) {
                        return SceneState.FAILURE;
                    }
                }
                return SceneState.FAILURE;
            }
        }

        public final Set<SceneState> getFailureStates() {
            return SceneState.failureStates;
        }

        public final Set<SceneState> getInProgressStates() {
            return SceneState.inProgressStates;
        }

        public final Set<SceneState> getProcessingStates() {
            return SceneState.processingStates;
        }

        public final Set<SceneState> getReadyStates() {
            return SceneState.readyStates;
        }

        private Companion() {
        }
    }

    static {
        SceneState sceneState;
        SceneState sceneState2;
        SceneState sceneState3;
        SceneState sceneState4;
        SceneState sceneState5;
        SceneState sceneState6;
        SceneState sceneState7;
        SceneState sceneState8;
        SceneState sceneState9;
        SceneState sceneState10;
        SceneState sceneState11;
        SceneState[] $values;
        $ENTRIES = C17221b.a($values);
        Companion = new Companion((DefaultConstructorMarker) null);
        readyStates = g0.c(sceneState10);
        inProgressStates = g0.h(sceneState, sceneState2, sceneState4, sceneState3, sceneState7, sceneState8, sceneState9);
        processingStates = g0.h(sceneState5, sceneState8);
        failureStates = g0.h(sceneState11, sceneState2, sceneState6);
    }

    public static C17220a<SceneState> getEntries() {
        return $ENTRIES;
    }
}
