package androidx.room;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/room/z;", "", "<init>", "()V", "", "hash", "a", "(Ljava/lang/String;)Ljava/lang/String;", "room-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class z {

    /* renamed from: a  reason: collision with root package name */
    public static final z f44451a = new z();

    private z() {
    }

    public static final String a(String str) {
        C17542s.j(str, "hash");
        return "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '" + str + "')";
    }
}
