package Td;

import fI.C17221b;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"LTd/b;", "", "", "key", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "UPGRADE_BEGIN", "CHANGE_PASSWORD_BEGIN", "PROFILE_EDIT_BEGIN", "ADDRESS_LIST_OPEN", "ADDRESS_EDIT_BEGIN", "ADDRESS_CREATE_BEGIN", "ADDRESS_DELETE_SUCCESS", "ADDRESS_DELETE_FAIL", "LOGOUT", "account-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public enum b {
    UPGRADE_BEGIN("profile_upgrade_begin"),
    CHANGE_PASSWORD_BEGIN("profile_change_password_begin"),
    PROFILE_EDIT_BEGIN("profile_edit_profile_begin"),
    ADDRESS_LIST_OPEN("profile_address_list_open"),
    ADDRESS_EDIT_BEGIN("profile_edit_address_begin"),
    ADDRESS_CREATE_BEGIN("profile_create_address_begin"),
    ADDRESS_DELETE_SUCCESS("profile_delete_address_success"),
    ADDRESS_DELETE_FAIL("profile_delete_address_fail"),
    LOGOUT("profile_logout");
    
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
