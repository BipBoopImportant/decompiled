package lE;

import Ae.e;
import XH.C16796C;
import YH.X;
import fI.C17221b;
import gE.C14514a;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0007B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"LlE/d;", "LgE/a;", "LAe/e;", "analytics", "<init>", "(LAe/e;)V", "LXH/N;", "a", "()V", "b", "LAe/e;", "getAnalytics", "()LAe/e;", "zipselector-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: lE.d  reason: case insensitive filesystem */
public final class C14767d implements C14514a {

    /* renamed from: a  reason: collision with root package name */
    private final e f128947a;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\t\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"LlE/d$a;", "", "", "key", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "CHANGE_ZIP", "GPS_ZIP", "zipselector-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: lE.d$a */
    private enum a {
        CHANGE_ZIP("change_zip"),
        GPS_ZIP("gps_zip");
        
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

    public C14767d(e eVar) {
        C17542s.j(eVar, "analytics");
        this.f128947a = eVar;
    }

    public void a() {
        this.f128947a.track(a.CHANGE_ZIP.b(), (Map<String, ? extends Object>) null);
    }

    public void b() {
        this.f128947a.track(a.GPS_ZIP.b(), X.f(C16796C.a("object_type", "button")));
    }
}
