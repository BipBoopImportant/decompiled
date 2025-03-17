package dl;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\b\u0018\u00002\u00020\u0001:\u0001\u0012B!\u0012\u000e\b\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\n¨\u0006\u0017"}, d2 = {"Ldl/h;", "", "", "Ldl/h$a;", "items", "", "selectorTitle", "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "b", "Ljava/lang/String;", "uicomponents_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: dl.h  reason: case insensitive filesystem */
public final class C11203h {

    /* renamed from: a  reason: collision with root package name */
    private final List<a> f96910a;

    /* renamed from: b  reason: collision with root package name */
    private final String f96911b;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\f\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0013\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016¨\u0006\u0017"}, d2 = {"Ldl/h$a;", "", "", "displayText", "value", "", "isSelected", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "Z", "()Z", "uicomponents_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: dl.h$a */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final String f96912a;

        /* renamed from: b  reason: collision with root package name */
        private final String f96913b;

        /* renamed from: c  reason: collision with root package name */
        private final boolean f96914c;

        public a(String str, String str2, boolean z10) {
            C17542s.j(str, "displayText");
            C17542s.j(str2, "value");
            this.f96912a = str;
            this.f96913b = str2;
            this.f96914c = z10;
        }

        public final String a() {
            return this.f96912a;
        }

        public final String b() {
            return this.f96913b;
        }

        public final boolean c() {
            return this.f96914c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return C17542s.e(this.f96912a, aVar.f96912a) && C17542s.e(this.f96913b, aVar.f96913b) && this.f96914c == aVar.f96914c;
        }

        public int hashCode() {
            return (((this.f96912a.hashCode() * 31) + this.f96913b.hashCode()) * 31) + Boolean.hashCode(this.f96914c);
        }

        public String toString() {
            String str = this.f96912a;
            String str2 = this.f96913b;
            boolean z10 = this.f96914c;
            return "SelectableItem(displayText=" + str + ", value=" + str2 + ", isSelected=" + z10 + ")";
        }
    }

    public C11203h(List<a> list, String str) {
        C17542s.j(list, "items");
        this.f96910a = list;
        this.f96911b = str;
    }

    public final List<a> a() {
        return this.f96910a;
    }

    public final String b() {
        return this.f96911b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11203h)) {
            return false;
        }
        C11203h hVar = (C11203h) obj;
        return C17542s.e(this.f96910a, hVar.f96910a) && C17542s.e(this.f96911b, hVar.f96911b);
    }

    public int hashCode() {
        int hashCode = this.f96910a.hashCode() * 31;
        String str = this.f96911b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        List<a> list = this.f96910a;
        String str = this.f96911b;
        return "DropdownDelegateModel(items=" + list + ", selectorTitle=" + str + ")";
    }
}
