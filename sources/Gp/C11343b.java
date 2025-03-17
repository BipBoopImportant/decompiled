package gp;

import dI.C17164e;
import fI.C17221b;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0001\u0007J\u001c\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001H¦@¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\t\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lgp/b;", "", "param", "", "b", "(Ljava/lang/Object;LdI/e;)Ljava/lang/Object;", "Lgp/e;", "a", "()Lgp/e;", "taskId", "core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: gp.b  reason: case insensitive filesystem */
public interface C11343b {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\f\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lgp/b$a;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "APP_READY", "LANGUAGE_CHANGED", "REGION_CHANGED", "LOGIN", "LOGOUT", "core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: gp.b$a */
    public enum a {
        APP_READY("APP_READY"),
        LANGUAGE_CHANGED("LANGUAGE_CHANGED"),
        REGION_CHANGED("REGION_CHANGED"),
        LOGIN("LOGIN"),
        LOGOUT("LOGOUT");
        
        private final String value;

        static {
            a[] a10;
            $ENTRIES = C17221b.a(a10);
        }

        private a(String str) {
            this.value = str;
        }

        public final String b() {
            return this.value;
        }
    }

    C11346e a();

    Object b(Object obj, C17164e<? super Boolean> eVar);
}
