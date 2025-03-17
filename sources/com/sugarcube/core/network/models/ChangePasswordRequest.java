package com.sugarcube.core.network.models;

import com.squareup.moshi.g;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/sugarcube/core/network/models/ChangePasswordRequest;", "", "password", "", "newPassword", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getPassword", "()Ljava/lang/String;", "getNewPassword", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "network_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@g(generateAdapter = true)
public final class ChangePasswordRequest {
    private final String newPassword;
    private final String password;

    public ChangePasswordRequest(String str, String str2) {
        C17542s.j(str, "password");
        C17542s.j(str2, "newPassword");
        this.password = str;
        this.newPassword = str2;
    }

    public static /* synthetic */ ChangePasswordRequest copy$default(ChangePasswordRequest changePasswordRequest, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = changePasswordRequest.password;
        }
        if ((i10 & 2) != 0) {
            str2 = changePasswordRequest.newPassword;
        }
        return changePasswordRequest.copy(str, str2);
    }

    public final String component1() {
        return this.password;
    }

    public final String component2() {
        return this.newPassword;
    }

    public final ChangePasswordRequest copy(String str, String str2) {
        C17542s.j(str, "password");
        C17542s.j(str2, "newPassword");
        return new ChangePasswordRequest(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChangePasswordRequest)) {
            return false;
        }
        ChangePasswordRequest changePasswordRequest = (ChangePasswordRequest) obj;
        return C17542s.e(this.password, changePasswordRequest.password) && C17542s.e(this.newPassword, changePasswordRequest.newPassword);
    }

    public final String getNewPassword() {
        return this.newPassword;
    }

    public final String getPassword() {
        return this.password;
    }

    public int hashCode() {
        return (this.password.hashCode() * 31) + this.newPassword.hashCode();
    }

    public String toString() {
        String str = this.password;
        String str2 = this.newPassword;
        return "ChangePasswordRequest(password=" + str + ", newPassword=" + str2 + ")";
    }
}
