package jb;

import java.io.IOException;
import java.util.Iterator;
import java.util.Objects;

public class g {

    /* renamed from: a  reason: collision with root package name */
    private final String f74786a;

    private g(String str) {
        this.f74786a = (String) l.j(str);
    }

    public static g f(char c10) {
        return new g(String.valueOf(c10));
    }

    public static g g(String str) {
        return new g(str);
    }

    public <A extends Appendable> A a(A a10, Iterator<? extends Object> it) {
        l.j(a10);
        if (it.hasNext()) {
            a10.append(h(it.next()));
            while (it.hasNext()) {
                a10.append(this.f74786a);
                a10.append(h(it.next()));
            }
        }
        return a10;
    }

    public final StringBuilder b(StringBuilder sb2, Iterable<? extends Object> iterable) {
        return c(sb2, iterable.iterator());
    }

    public final StringBuilder c(StringBuilder sb2, Iterator<? extends Object> it) {
        try {
            a(sb2, it);
            return sb2;
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }

    public final String d(Iterable<? extends Object> iterable) {
        return e(iterable.iterator());
    }

    public final String e(Iterator<? extends Object> it) {
        return c(new StringBuilder(), it).toString();
    }

    /* access modifiers changed from: package-private */
    public CharSequence h(Object obj) {
        Objects.requireNonNull(obj);
        return obj instanceof CharSequence ? (CharSequence) obj : obj.toString();
    }
}
