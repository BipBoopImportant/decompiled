package com.auth0.android.result;

import Qc.c;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0016\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\rR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000e\u001a\u0004\b\u0010\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u0011\u0010\rR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\u0012\u0010\rR\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0004¢\u0006\f\n\u0004\b\b\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\f\n\u0004\b\t\u0010\u000e\u001a\u0004\b\u0016\u0010\rR.\u0010\u0018\u001a\u0004\u0018\u00010\u00022\b\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006@@X\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u000e\u001a\u0004\b\u0019\u0010\r\"\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lcom/auth0/android/result/Credentials;", "", "", "idToken", "accessToken", "type", "refreshToken", "Ljava/util/Date;", "expiresAt", "scope", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "Ljava/lang/String;", "c", "a", "getType", "d", "Ljava/util/Date;", "b", "()Ljava/util/Date;", "getScope", "<set-?>", "recoveryCode", "getRecoveryCode", "e", "(Ljava/lang/String;)V", "auth0_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class Credentials {
    @c("access_token")
    private final String accessToken;
    @c("expires_at")
    private final Date expiresAt;
    @c("id_token")
    private final String idToken;
    @c("recovery_code")
    private String recoveryCode;
    @c("refresh_token")
    private final String refreshToken;
    @c("scope")
    private final String scope;
    @c("token_type")
    private final String type;

    public Credentials(String str, String str2, String str3, String str4, Date date, String str5) {
        C17542s.j(str, "idToken");
        C17542s.j(str2, "accessToken");
        C17542s.j(str3, "type");
        C17542s.j(date, "expiresAt");
        this.idToken = str;
        this.accessToken = str2;
        this.type = str3;
        this.refreshToken = str4;
        this.expiresAt = date;
        this.scope = str5;
    }

    public final String a() {
        return this.accessToken;
    }

    public final Date b() {
        return this.expiresAt;
    }

    public final String c() {
        return this.idToken;
    }

    public final String d() {
        return this.refreshToken;
    }

    public final void e(String str) {
        this.recoveryCode = str;
    }

    public String toString() {
        return "Credentials(idToken='xxxxx', accessToken='xxxxx', type='" + this.type + "', refreshToken='xxxxx', expiresAt='" + this.expiresAt + "', scope='" + this.scope + "')";
    }
}
