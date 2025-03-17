package d5;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B'\u0012\u0006\u0010\u0004\u001a\u00028\u0000\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ1\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\r\u001a\u00020\u00052\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000f0\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0004\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0014R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Ld5/i;", "", "T", "Ld5/h;", "value", "", "tag", "Ld5/j;", "verificationMode", "Ld5/g;", "logger", "<init>", "(Ljava/lang/Object;Ljava/lang/String;Ld5/j;Ld5/g;)V", "message", "Lkotlin/Function1;", "", "condition", "c", "(Ljava/lang/String;LnI/l;)Ld5/h;", "a", "()Ljava/lang/Object;", "b", "Ljava/lang/Object;", "getValue", "Ljava/lang/String;", "getTag", "()Ljava/lang/String;", "d", "Ld5/j;", "getVerificationMode", "()Ld5/j;", "e", "Ld5/g;", "getLogger", "()Ld5/g;", "window_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class i<T> extends h<T> {

    /* renamed from: b  reason: collision with root package name */
    private final T f50746b;

    /* renamed from: c  reason: collision with root package name */
    private final String f50747c;

    /* renamed from: d  reason: collision with root package name */
    private final j f50748d;

    /* renamed from: e  reason: collision with root package name */
    private final g f50749e;

    public i(T t10, String str, j jVar, g gVar) {
        C17542s.j(t10, "value");
        C17542s.j(str, "tag");
        C17542s.j(jVar, "verificationMode");
        C17542s.j(gVar, "logger");
        this.f50746b = t10;
        this.f50747c = str;
        this.f50748d = jVar;
        this.f50749e = gVar;
    }

    public T a() {
        return this.f50746b;
    }

    public h<T> c(String str, C17642l<? super T, Boolean> lVar) {
        C17542s.j(str, "message");
        C17542s.j(lVar, "condition");
        if (lVar.invoke(this.f50746b).booleanValue()) {
            return this;
        }
        return new f(this.f50746b, this.f50747c, str, this.f50749e, this.f50748d);
    }
}
