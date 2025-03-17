package F1;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005J&\u0010\t\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001c\u0010\f\u001a\u00020\u000b2\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0007H\u0002¢\u0006\u0004\b\f\u0010\rR&\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0005¨\u0006\u0012"}, d2 = {"LF1/a;", "LF1/g;", "LF1/j;", "element", "<init>", "(LF1/j;)V", "T", "LF1/c;", "key", "b", "(LF1/c;)Ljava/lang/Object;", "", "a", "(LF1/c;)Z", "LF1/j;", "getElement", "()LF1/j;", "c", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class a extends g {

    /* renamed from: a  reason: collision with root package name */
    private j<?> f6009a;

    public a(j<?> jVar) {
        super((DefaultConstructorMarker) null);
        this.f6009a = jVar;
    }

    public boolean a(c<?> cVar) {
        return cVar == this.f6009a.getKey();
    }

    public <T> T b(c<T> cVar) {
        if (!(cVar == this.f6009a.getKey())) {
            D1.a.b("Check failed.");
        }
        return this.f6009a.getValue();
    }

    public final void c(j<?> jVar) {
        this.f6009a = jVar;
    }
}
