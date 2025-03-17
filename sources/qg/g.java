package qg;

import com.ingka.ikea.dynamicfields.datalayer.KeyValue;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\b\u0018\u0000 \u00152\u00020\u0001:\u0001\u0011B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0014\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0012\u001a\u0004\b\u0011\u0010\t¨\u0006\u0016"}, d2 = {"Lqg/g;", "", "", "link", "title", "body", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "d", "dynamicfields_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class g {

    /* renamed from: d  reason: collision with root package name */
    public static final a f76111d = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final String f76112a;

    /* renamed from: b  reason: collision with root package name */
    private final String f76113b;

    /* renamed from: c  reason: collision with root package name */
    private final String f76114c;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u0004\u0018\u00010\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0000¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0002XT¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\n8\u0002XT¢\u0006\u0006\n\u0004\b\r\u0010\fR\u0014\u0010\u000e\u001a\u00020\n8\u0002XT¢\u0006\u0006\n\u0004\b\u000e\u0010\f¨\u0006\u000f"}, d2 = {"Lqg/g$a;", "", "<init>", "()V", "", "Lcom/ingka/ikea/dynamicfields/datalayer/KeyValue;", "data", "Lqg/g;", "a", "(Ljava/util/List;)Lqg/g;", "", "MODAL_LINK", "Ljava/lang/String;", "MODAL_TITLE", "MODAL_BODY", "dynamicfields_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final g a(List<KeyValue> list) {
            Object obj;
            String a10;
            Object obj2;
            String a11;
            Object obj3;
            String a12;
            C17542s.j(list, "data");
            Iterable iterable = list;
            Iterator it = iterable.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (C17542s.e(((KeyValue) obj).b(), "modal.linkText")) {
                    break;
                }
            }
            KeyValue keyValue = (KeyValue) obj;
            if (keyValue == null || (a10 = keyValue.a()) == null) {
                return null;
            }
            Iterator it2 = iterable.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it2.next();
                if (C17542s.e(((KeyValue) obj2).b(), "modal.title")) {
                    break;
                }
            }
            KeyValue keyValue2 = (KeyValue) obj2;
            if (keyValue2 == null || (a11 = keyValue2.a()) == null) {
                return null;
            }
            Iterator it3 = iterable.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    obj3 = null;
                    break;
                }
                obj3 = it3.next();
                if (C17542s.e(((KeyValue) obj3).b(), "modal.body")) {
                    break;
                }
            }
            KeyValue keyValue3 = (KeyValue) obj3;
            if (keyValue3 == null || (a12 = keyValue3.a()) == null) {
                return null;
            }
            return new g(a10, a11, a12);
        }

        private a() {
        }
    }

    public g(String str, String str2, String str3) {
        C17542s.j(str, "link");
        C17542s.j(str2, "title");
        C17542s.j(str3, "body");
        this.f76112a = str;
        this.f76113b = str2;
        this.f76114c = str3;
    }

    public final String a() {
        return this.f76114c;
    }

    public final String b() {
        return this.f76112a;
    }

    public final String c() {
        return this.f76113b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return C17542s.e(this.f76112a, gVar.f76112a) && C17542s.e(this.f76113b, gVar.f76113b) && C17542s.e(this.f76114c, gVar.f76114c);
    }

    public int hashCode() {
        return (((this.f76112a.hashCode() * 31) + this.f76113b.hashCode()) * 31) + this.f76114c.hashCode();
    }

    public String toString() {
        String str = this.f76112a;
        String str2 = this.f76113b;
        String str3 = this.f76114c;
        return "DialogLinkData(link=" + str + ", title=" + str2 + ", body=" + str3 + ")";
    }
}
