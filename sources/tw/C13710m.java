package Tw;

import Nn.D;
import Ow.C13323a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"LTw/m;", "", "<init>", "()V", "a", "b", "c", "LTw/m$a;", "LTw/m$b;", "LTw/m$c;", "onlinepayment-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Tw.m  reason: case insensitive filesystem */
public abstract class C13710m {

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\b\u0018\u00002\u00020\u0001B)\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0015\u0010\fR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001b\u001a\u0004\b\u0019\u0010\u001c¨\u0006\u001d"}, d2 = {"LTw/m$a;", "LTw/m;", "", "LNn/D;", "paymentOptions", "", "gatewayMerchantId", "LOw/a$a$a;", "googlePayExpressSettings", "<init>", "(Ljava/util/List;Ljava/lang/String;LOw/a$a$a;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "c", "()Ljava/util/List;", "b", "Ljava/lang/String;", "LOw/a$a$a;", "()LOw/a$a$a;", "onlinepayment-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Tw.m$a */
    public static final class a extends C13710m {

        /* renamed from: a  reason: collision with root package name */
        private final List<D> f116970a;

        /* renamed from: b  reason: collision with root package name */
        private final String f116971b;

        /* renamed from: c  reason: collision with root package name */
        private final C13323a.C2787a.C2788a f116972c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(List<? extends D> list, String str, C13323a.C2787a.C2788a aVar) {
            super((DefaultConstructorMarker) null);
            C17542s.j(list, "paymentOptions");
            this.f116970a = list;
            this.f116971b = str;
            this.f116972c = aVar;
        }

        public final String a() {
            return this.f116971b;
        }

        public final C13323a.C2787a.C2788a b() {
            return this.f116972c;
        }

        public final List<D> c() {
            return this.f116970a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return C17542s.e(this.f116970a, aVar.f116970a) && C17542s.e(this.f116971b, aVar.f116971b) && C17542s.e(this.f116972c, aVar.f116972c);
        }

        public int hashCode() {
            int hashCode = this.f116970a.hashCode() * 31;
            String str = this.f116971b;
            int i10 = 0;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            C13323a.C2787a.C2788a aVar = this.f116972c;
            if (aVar != null) {
                i10 = aVar.hashCode();
            }
            return hashCode2 + i10;
        }

        public String toString() {
            List<D> list = this.f116970a;
            String str = this.f116971b;
            C13323a.C2787a.C2788a aVar = this.f116972c;
            return "Aci(paymentOptions=" + list + ", gatewayMerchantId=" + str + ", googlePayExpressSettings=" + aVar + ")";
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, d2 = {"LTw/m$b;", "LTw/m;", "", "url", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "onlinepayment-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Tw.m$b */
    public static final class b extends C13710m {

        /* renamed from: a  reason: collision with root package name */
        private final String f116973a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(String str) {
            super((DefaultConstructorMarker) null);
            C17542s.j(str, "url");
            this.f116973a = str;
        }

        public final String a() {
            return this.f116973a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && C17542s.e(this.f116973a, ((b) obj).f116973a);
        }

        public int hashCode() {
            return this.f116973a.hashCode();
        }

        public String toString() {
            String str = this.f116973a;
            return "ExternalUrl(url=" + str + ")";
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, d2 = {"LTw/m$c;", "LTw/m;", "", "sessionIdentifier", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "onlinepayment-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Tw.m$c */
    public static final class c extends C13710m {

        /* renamed from: a  reason: collision with root package name */
        private final String f116974a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(String str) {
            super((DefaultConstructorMarker) null);
            C17542s.j(str, "sessionIdentifier");
            this.f116974a = str;
        }

        public final String a() {
            return this.f116974a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && C17542s.e(this.f116974a, ((c) obj).f116974a);
        }

        public int hashCode() {
            return this.f116974a.hashCode();
        }

        public String toString() {
            String str = this.f116974a;
            return "Swish(sessionIdentifier=" + str + ")";
        }
    }

    public /* synthetic */ C13710m(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private C13710m() {
    }
}
