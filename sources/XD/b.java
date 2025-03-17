package Xd;

import fI.C17221b;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"LXd/b;", "", "", "key", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "PROFILE_EDIT_SUCCESS", "PROFILE_EDIT_FAIL", "ADDRESS_EDIT_SUCCESS", "ADDRESS_EDIT_FAIL", "ADDRESS_CREATE_SUCCESS", "ADDRESS_CREATE_FAIL", "ADDRESS_DELETE_SUCCESS", "ADDRESS_DELETE_FAIL", "account-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public enum b {
    PROFILE_EDIT_SUCCESS("profile_edit_profile_success"),
    PROFILE_EDIT_FAIL("profile_edit_profile_fail"),
    ADDRESS_EDIT_SUCCESS("profile_edit_address_success"),
    ADDRESS_EDIT_FAIL("profile_edit_address_fail"),
    ADDRESS_CREATE_SUCCESS("profile_create_address_success"),
    ADDRESS_CREATE_FAIL("profile_create_address_fail"),
    ADDRESS_DELETE_SUCCESS("profile_delete_address_success"),
    ADDRESS_DELETE_FAIL("profile_delete_address_fail");
    
    private final String key;

    static {
        b[] a10;
        $ENTRIES = C17221b.a(a10);
    }

    private b(String str) {
        this.key = str;
    }

    public final String b() {
        return this.key;
    }
}
