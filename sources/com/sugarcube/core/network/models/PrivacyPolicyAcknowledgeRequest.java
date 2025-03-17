package com.sugarcube.core.network.models;

import com.squareup.moshi.e;
import com.squareup.moshi.g;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0003\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/sugarcube/core/network/models/PrivacyPolicyAcknowledgeRequest;", "", "consentCode", "", "<init>", "(Ljava/lang/String;)V", "getConsentCode", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "network_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@g(generateAdapter = true)
public final class PrivacyPolicyAcknowledgeRequest {
    private final String consentCode;

    public PrivacyPolicyAcknowledgeRequest() {
        this((String) null, 1, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ PrivacyPolicyAcknowledgeRequest copy$default(PrivacyPolicyAcknowledgeRequest privacyPolicyAcknowledgeRequest, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = privacyPolicyAcknowledgeRequest.consentCode;
        }
        return privacyPolicyAcknowledgeRequest.copy(str);
    }

    public final String component1() {
        return this.consentCode;
    }

    public final PrivacyPolicyAcknowledgeRequest copy(@e(name = "consent_code") String str) {
        C17542s.j(str, "consentCode");
        return new PrivacyPolicyAcknowledgeRequest(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PrivacyPolicyAcknowledgeRequest) && C17542s.e(this.consentCode, ((PrivacyPolicyAcknowledgeRequest) obj).consentCode);
    }

    public final String getConsentCode() {
        return this.consentCode;
    }

    public int hashCode() {
        return this.consentCode.hashCode();
    }

    public String toString() {
        String str = this.consentCode;
        return "PrivacyPolicyAcknowledgeRequest(consentCode=" + str + ")";
    }

    public PrivacyPolicyAcknowledgeRequest(@e(name = "consent_code") String str) {
        C17542s.j(str, "consentCode");
        this.consentCode = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PrivacyPolicyAcknowledgeRequest(String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? "YES" : str);
    }
}
