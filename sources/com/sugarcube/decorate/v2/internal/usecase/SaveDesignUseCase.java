package com.sugarcube.decorate.v2.internal.usecase;

import MG.C16033b;
import XH.v;
import XH.x;
import com.sugarcube.core.network.models.AuthType;
import dI.C17164e;
import kG.C17497c;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u00002\u00020\u0001J,\u0010\t\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0007\u0010\bJ(\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\nH¦@¢\u0006\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lcom/sugarcube/decorate/v2/internal/usecase/SaveDesignUseCase;", "", "LkG/c;", "metadata", "LXH/x;", "LXH/v;", "LMG/b$c;", "save-gIAlu-s", "(LkG/c;LdI/e;)Ljava/lang/Object;", "save", "Lcom/sugarcube/core/network/models/AuthType;", "pendingAction", "stashPendingDesign-0E7RQCE", "(LkG/c;Lcom/sugarcube/core/network/models/AuthType;LdI/e;)Ljava/lang/Object;", "stashPendingDesign", "v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface SaveDesignUseCase {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public static /* synthetic */ Object a(SaveDesignUseCase saveDesignUseCase, C17497c cVar, AuthType authType, C17164e eVar, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 2) != 0) {
                    authType = AuthType.UNKNOWN;
                }
                return saveDesignUseCase.m79stashPendingDesign0E7RQCE(cVar, authType, eVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: stashPendingDesign-0E7RQCE");
        }
    }

    /* renamed from: save-gIAlu-s  reason: not valid java name */
    Object m78savegIAlus(C17497c cVar, C17164e<? super x<v<C16033b.c, C17497c>>> eVar);

    /* renamed from: stashPendingDesign-0E7RQCE  reason: not valid java name */
    Object m79stashPendingDesign0E7RQCE(C17497c cVar, AuthType authType, C17164e<? super x<C17497c>> eVar);
}
