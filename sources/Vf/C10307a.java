package vf;

import fI.C17221b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lvf/a;", "", "", "rawValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Companion", "a", "SPR", "ART", "model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: vf.a  reason: case insensitive filesystem */
public enum C10307a {
    SPR("SPR"),
    ART("ART");
    
    public static final C1428a Companion = null;
    private final String rawValue;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lvf/a$a;", "", "<init>", "()V", "model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: vf.a$a  reason: collision with other inner class name */
    public static final class C1428a {
        public /* synthetic */ C1428a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C1428a() {
        }
    }

    static {
        C10307a[] a10;
        $ENTRIES = C17221b.a(a10);
        Companion = new C1428a((DefaultConstructorMarker) null);
    }

    private C10307a(String str) {
        this.rawValue = str;
    }

    public final String b() {
        return this.rawValue;
    }
}
