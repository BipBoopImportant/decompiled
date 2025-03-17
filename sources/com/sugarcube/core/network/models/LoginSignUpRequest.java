package com.sugarcube.core.network.models;

import com.squareup.moshi.g;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/sugarcube/core/network/models/LoginSignUpRequest;", "", "email", "", "password", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getEmail", "()Ljava/lang/String;", "getPassword", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "network_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@g(generateAdapter = true)
public final class LoginSignUpRequest {
    private final String email;
    private final String password;

    public LoginSignUpRequest(String str, String str2) {
        C17542s.j(str, "email");
        C17542s.j(str2, "password");
        this.email = str;
        this.password = str2;
    }

    public static /* synthetic */ LoginSignUpRequest copy$default(LoginSignUpRequest loginSignUpRequest, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = loginSignUpRequest.email;
        }
        if ((i10 & 2) != 0) {
            str2 = loginSignUpRequest.password;
        }
        return loginSignUpRequest.copy(str, str2);
    }

    public final String component1() {
        return this.email;
    }

    public final String component2() {
        return this.password;
    }

    public final LoginSignUpRequest copy(String str, String str2) {
        C17542s.j(str, "email");
        C17542s.j(str2, "password");
        return new LoginSignUpRequest(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LoginSignUpRequest)) {
            return false;
        }
        LoginSignUpRequest loginSignUpRequest = (LoginSignUpRequest) obj;
        return C17542s.e(this.email, loginSignUpRequest.email) && C17542s.e(this.password, loginSignUpRequest.password);
    }

    public final String getEmail() {
        return this.email;
    }

    public final String getPassword() {
        return this.password;
    }

    public int hashCode() {
        return (this.email.hashCode() * 31) + this.password.hashCode();
    }

    public String toString() {
        String str = this.email;
        String str2 = this.password;
        return "LoginSignUpRequest(email=" + str + ", password=" + str2 + ")";
    }
}
