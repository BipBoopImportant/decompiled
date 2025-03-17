package com.sugarcube.app.base.data.user.privacypolicy;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ>\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\u00032\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\f\u0010\nR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\r\u0010\nR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\u000e\u0010\n¨\u0006\u001b"}, d2 = {"Lcom/sugarcube/app/base/data/user/privacypolicy/PrivacyPolicyFeatureState;", "", "showBanner", "", "showDialog", "allowUploadsAfterPrivacyPolicyFailure", "showError", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "getShowBanner", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getShowDialog", "getAllowUploadsAfterPrivacyPolicyFailure", "getShowError", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/sugarcube/app/base/data/user/privacypolicy/PrivacyPolicyFeatureState;", "equals", "other", "hashCode", "", "toString", "", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PrivacyPolicyFeatureState {
    public static final int $stable = 0;
    private final Boolean allowUploadsAfterPrivacyPolicyFailure;
    private final Boolean showBanner;
    private final Boolean showDialog;
    private final Boolean showError;

    public PrivacyPolicyFeatureState() {
        this((Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, 15, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ PrivacyPolicyFeatureState copy$default(PrivacyPolicyFeatureState privacyPolicyFeatureState, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            bool = privacyPolicyFeatureState.showBanner;
        }
        if ((i10 & 2) != 0) {
            bool2 = privacyPolicyFeatureState.showDialog;
        }
        if ((i10 & 4) != 0) {
            bool3 = privacyPolicyFeatureState.allowUploadsAfterPrivacyPolicyFailure;
        }
        if ((i10 & 8) != 0) {
            bool4 = privacyPolicyFeatureState.showError;
        }
        return privacyPolicyFeatureState.copy(bool, bool2, bool3, bool4);
    }

    public final Boolean component1() {
        return this.showBanner;
    }

    public final Boolean component2() {
        return this.showDialog;
    }

    public final Boolean component3() {
        return this.allowUploadsAfterPrivacyPolicyFailure;
    }

    public final Boolean component4() {
        return this.showError;
    }

    public final PrivacyPolicyFeatureState copy(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4) {
        return new PrivacyPolicyFeatureState(bool, bool2, bool3, bool4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PrivacyPolicyFeatureState)) {
            return false;
        }
        PrivacyPolicyFeatureState privacyPolicyFeatureState = (PrivacyPolicyFeatureState) obj;
        return C17542s.e(this.showBanner, privacyPolicyFeatureState.showBanner) && C17542s.e(this.showDialog, privacyPolicyFeatureState.showDialog) && C17542s.e(this.allowUploadsAfterPrivacyPolicyFailure, privacyPolicyFeatureState.allowUploadsAfterPrivacyPolicyFailure) && C17542s.e(this.showError, privacyPolicyFeatureState.showError);
    }

    public final Boolean getAllowUploadsAfterPrivacyPolicyFailure() {
        return this.allowUploadsAfterPrivacyPolicyFailure;
    }

    public final Boolean getShowBanner() {
        return this.showBanner;
    }

    public final Boolean getShowDialog() {
        return this.showDialog;
    }

    public final Boolean getShowError() {
        return this.showError;
    }

    public int hashCode() {
        Boolean bool = this.showBanner;
        int i10 = 0;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.showDialog;
        int hashCode2 = (hashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.allowUploadsAfterPrivacyPolicyFailure;
        int hashCode3 = (hashCode2 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.showError;
        if (bool4 != null) {
            i10 = bool4.hashCode();
        }
        return hashCode3 + i10;
    }

    public String toString() {
        Boolean bool = this.showBanner;
        Boolean bool2 = this.showDialog;
        Boolean bool3 = this.allowUploadsAfterPrivacyPolicyFailure;
        Boolean bool4 = this.showError;
        return "PrivacyPolicyFeatureState(showBanner=" + bool + ", showDialog=" + bool2 + ", allowUploadsAfterPrivacyPolicyFailure=" + bool3 + ", showError=" + bool4 + ")";
    }

    public PrivacyPolicyFeatureState(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4) {
        this.showBanner = bool;
        this.showDialog = bool2;
        this.allowUploadsAfterPrivacyPolicyFailure = bool3;
        this.showError = bool4;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PrivacyPolicyFeatureState(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? Boolean.FALSE : bool, (i10 & 2) != 0 ? Boolean.FALSE : bool2, (i10 & 4) != 0 ? Boolean.FALSE : bool3, (i10 & 8) != 0 ? Boolean.FALSE : bool4);
    }
}
