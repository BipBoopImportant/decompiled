package HJ;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import tI.C17974j;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0001\u0011J\u0011\u0010\u0002\u001a\u0004\u0018\u00010\u0000H&¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000f\u001a\u00020\f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u00108&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148VX\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"LHJ/l;", "", "next", "()LHJ/l;", "LtI/j;", "c", "()LtI/j;", "range", "", "getValue", "()Ljava/lang/String;", "value", "LHJ/k;", "getGroups", "()LHJ/k;", "groups", "", "b", "()Ljava/util/List;", "groupValues", "LHJ/l$b;", "a", "()LHJ/l$b;", "destructured", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: HJ.l  reason: case insensitive filesystem */
public interface C15846l {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: HJ.l$a */
    public static final class a {
        public static b a(C15846l lVar) {
            return new b(lVar);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, d2 = {"LHJ/l$b;", "", "LHJ/l;", "match", "<init>", "(LHJ/l;)V", "a", "LHJ/l;", "()LHJ/l;", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: HJ.l$b */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final C15846l f135335a;

        public b(C15846l lVar) {
            C17542s.j(lVar, "match");
            this.f135335a = lVar;
        }

        public final C15846l a() {
            return this.f135335a;
        }
    }

    b a();

    List<String> b();

    C17974j c();

    C15845k getGroups();

    String getValue();

    C15846l next();
}
