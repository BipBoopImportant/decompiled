package EH;

import HJ.C15854t;
import YH.C16877v;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\b&\u0018\u0000 \n2\u00020\u0001:\u0001\u000eB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u0004\u0018\u00010\u00022\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0003\u001a\u00020\u00028\u0004X\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\rR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, d2 = {"LEH/j;", "", "", "content", "", "LEH/i;", "parameters", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "name", "c", "(Ljava/lang/String;)Ljava/lang/String;", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "Ljava/util/List;", "()Ljava/util/List;", "ktor-http"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: EH.j  reason: case insensitive filesystem */
public abstract class C15625j {

    /* renamed from: c  reason: collision with root package name */
    public static final a f134030c = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final String f134031a;

    /* renamed from: b  reason: collision with root package name */
    private final List<C15624i> f134032b;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LEH/j$a;", "", "<init>", "()V", "ktor-http"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: EH.j$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public C15625j(String str, List<C15624i> list) {
        C17542s.j(str, "content");
        C17542s.j(list, "parameters");
        this.f134031a = str;
        this.f134032b = list;
    }

    /* access modifiers changed from: protected */
    public final String a() {
        return this.f134031a;
    }

    public final List<C15624i> b() {
        return this.f134032b;
    }

    public final String c(String str) {
        C17542s.j(str, "name");
        int p10 = C16877v.p(this.f134032b);
        if (p10 < 0) {
            return null;
        }
        int i10 = 0;
        while (true) {
            C15624i iVar = this.f134032b.get(i10);
            if (C15854t.H(iVar.c(), str, true)) {
                return iVar.d();
            }
            if (i10 == p10) {
                return null;
            }
            i10++;
        }
    }

    public String toString() {
        if (this.f134032b.isEmpty()) {
            return this.f134031a;
        }
        int length = this.f134031a.length();
        int i10 = 0;
        int i11 = 0;
        for (C15624i iVar : this.f134032b) {
            i11 += iVar.c().length() + iVar.d().length() + 3;
        }
        StringBuilder sb2 = new StringBuilder(length + i11);
        sb2.append(this.f134031a);
        int p10 = C16877v.p(this.f134032b);
        if (p10 >= 0) {
            while (true) {
                C15624i iVar2 = this.f134032b.get(i10);
                sb2.append("; ");
                sb2.append(iVar2.c());
                sb2.append("=");
                String d10 = iVar2.d();
                if (C15626k.c(d10)) {
                    sb2.append(C15626k.d(d10));
                } else {
                    sb2.append(d10);
                }
                if (i10 == p10) {
                    break;
                }
                i10++;
            }
        }
        String sb3 = sb2.toString();
        C17542s.i(sb3, "{\n            val size =…   }.toString()\n        }");
        return sb3;
    }
}
