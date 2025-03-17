package nL;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17631a;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007H&¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\f\u001a\u00020\t2\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u000e\u001a\u00020\t2\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007¢\u0006\u0004\b\u000e\u0010\rJ\u0019\u0010\u000f\u001a\u00020\t2\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007¢\u0006\u0004\b\u000f\u0010\rJ\u0019\u0010\u0010\u001a\u00020\t2\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007¢\u0006\u0004\b\u0010\u0010\rJ\u0015\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\u0015\u0010\u000bJ#\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u00022\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u0005¨\u0006\u001d"}, d2 = {"LnL/c;", "", "LnL/b;", "level", "<init>", "(LnL/b;)V", "", "Lorg/koin/core/logger/MESSAGE;", "msg", "LXH/N;", "b", "(LnL/b;Ljava/lang/String;)V", "a", "(Ljava/lang/String;)V", "d", "h", "c", "lvl", "", "e", "(LnL/b;)Z", "f", "Lkotlin/Function0;", "g", "(LnL/b;LnI/a;)V", "LnL/b;", "getLevel", "()LnL/b;", "setLevel", "koin-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: nL.c  reason: case insensitive filesystem */
public abstract class C17686c {

    /* renamed from: a  reason: collision with root package name */
    private C17685b f144972a;

    public C17686c(C17685b bVar) {
        C17542s.j(bVar, "level");
        this.f144972a = bVar;
    }

    public final void a(String str) {
        C17542s.j(str, "msg");
        f(C17685b.DEBUG, str);
    }

    public abstract void b(C17685b bVar, String str);

    public final void c(String str) {
        C17542s.j(str, "msg");
        f(C17685b.ERROR, str);
    }

    public final void d(String str) {
        C17542s.j(str, "msg");
        f(C17685b.INFO, str);
    }

    public final boolean e(C17685b bVar) {
        C17542s.j(bVar, "lvl");
        return this.f144972a.compareTo(bVar) <= 0;
    }

    public final void f(C17685b bVar, String str) {
        C17542s.j(bVar, "lvl");
        C17542s.j(str, "msg");
        if (e(bVar)) {
            b(bVar, str);
        }
    }

    public final void g(C17685b bVar, C17631a<String> aVar) {
        C17542s.j(bVar, "lvl");
        C17542s.j(aVar, "msg");
        if (e(bVar)) {
            b(bVar, aVar.invoke());
        }
    }

    public final void h(String str) {
        C17542s.j(str, "msg");
        f(C17685b.WARNING, str);
    }
}
