package RB;

import PB.g;
import TJ.C16532g;
import XH.x;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001:\u0001\u000bJB\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b0\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006H¦\u0002¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"LRB/d;", "", "", "showOnlyScanAndGoCompatibleStores", "", "itemNo", "LTJ/g;", "includeUserLocation", "LXH/x;", "", "LPB/g;", "a", "(ZLjava/lang/String;LTJ/g;)LTJ/g;", "storepicker-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: RB.d  reason: case insensitive filesystem */
public interface C13507d {

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0002\u0007\bB\u0011\b\u0004\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006\u0001\u0002\t\n¨\u0006\u000b"}, d2 = {"LRB/d$a;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "", "message", "<init>", "(Ljava/lang/String;)V", "b", "a", "LRB/d$a$a;", "LRB/d$a$b;", "storepicker-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: RB.d$a */
    public static abstract class a extends Exception {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"LRB/d$a$a;", "LRB/d$a;", "", "message", "<init>", "(Ljava/lang/String;)V", "storepicker-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: RB.d$a$a  reason: collision with other inner class name */
        public static final class C2830a extends a {
            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C2830a(String str) {
                super(str, (DefaultConstructorMarker) null);
                C17542s.j(str, "message");
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"LRB/d$a$b;", "LRB/d$a;", "", "message", "<init>", "(Ljava/lang/String;)V", "storepicker-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: RB.d$a$b */
        public static final class b extends a {
            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public b(String str) {
                super(str, (DefaultConstructorMarker) null);
                C17542s.j(str, "message");
            }
        }

        public /* synthetic */ a(String str, DefaultConstructorMarker defaultConstructorMarker) {
            this(str);
        }

        private a(String str) {
            super(str);
        }
    }

    C16532g<x<List<g>>> a(boolean z10, String str, C16532g<Boolean> gVar);
}
