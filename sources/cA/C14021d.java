package cA;

import Ae.h;
import aA.C13910b;
import fI.C17221b;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0006J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H&¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"LcA/d;", "LAe/h;", "LcA/d$a;", "LaA/b;", "userState", "LXH/N;", "a", "(LaA/b;)V", "usersession-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: cA.d  reason: case insensitive filesystem */
public interface C14021d extends h<a> {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\n\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"LcA/d$a;", "", "", "key", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "REFRESH_SUCCESS", "REFRESH_FAIL", "REFRESH_INVALID_CREDENTIALS", "usersession-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: cA.d$a */
    public enum a {
        REFRESH_SUCCESS("dev_only_profile_refresh_session_success"),
        REFRESH_FAIL("profile_refresh_session_fail"),
        REFRESH_INVALID_CREDENTIALS("profile_refresh_session_invalid_credentials");
        
        private final String key;

        static {
            a[] a10;
            $ENTRIES = C17221b.a(a10);
        }

        private a(String str) {
            this.key = str;
        }

        public final String b() {
            return this.key;
        }
    }

    void a(C13910b bVar);
}
