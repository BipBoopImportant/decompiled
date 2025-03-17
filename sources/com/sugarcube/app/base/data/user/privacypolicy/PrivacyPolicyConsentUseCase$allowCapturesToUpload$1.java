package com.sugarcube.app.base.data.user.privacypolicy;

import dI.C17164e;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@f(c = "com.sugarcube.app.base.data.user.privacypolicy.PrivacyPolicyConsentUseCase", f = "PrivacyPolicyConsentUseCase.kt", l = {122, 122}, m = "allowCapturesToUpload")
final class PrivacyPolicyConsentUseCase$allowCapturesToUpload$1 extends d {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ PrivacyPolicyConsentUseCase this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    PrivacyPolicyConsentUseCase$allowCapturesToUpload$1(PrivacyPolicyConsentUseCase privacyPolicyConsentUseCase, C17164e<? super PrivacyPolicyConsentUseCase$allowCapturesToUpload$1> eVar) {
        super(eVar);
        this.this$0 = privacyPolicyConsentUseCase;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.allowCapturesToUpload(this);
    }
}
