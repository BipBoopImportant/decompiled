package xI;

import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0019\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\fR$\u0010\u001e\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u0011\u0010\u0005¨\u0006\u001f"}, d2 = {"LxI/k1;", "", "Ljava/lang/ClassLoader;", "classLoader", "<init>", "(Ljava/lang/ClassLoader;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/lang/ref/WeakReference;", "a", "Ljava/lang/ref/WeakReference;", "getRef", "()Ljava/lang/ref/WeakReference;", "ref", "b", "I", "getIdentityHashCode", "identityHashCode", "c", "Ljava/lang/ClassLoader;", "getTemporaryStrongRef", "()Ljava/lang/ClassLoader;", "temporaryStrongRef", "kotlin-reflection"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class k1 {

    /* renamed from: a  reason: collision with root package name */
    private final WeakReference<ClassLoader> f152434a;

    /* renamed from: b  reason: collision with root package name */
    private final int f152435b;

    /* renamed from: c  reason: collision with root package name */
    private ClassLoader f152436c;

    public k1(ClassLoader classLoader) {
        C17542s.j(classLoader, "classLoader");
        this.f152434a = new WeakReference<>(classLoader);
        this.f152435b = System.identityHashCode(classLoader);
        this.f152436c = classLoader;
    }

    public final void a(ClassLoader classLoader) {
        this.f152436c = classLoader;
    }

    public boolean equals(Object obj) {
        return (obj instanceof k1) && this.f152434a.get() == ((k1) obj).f152434a.get();
    }

    public int hashCode() {
        return this.f152435b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
        r0 = r0.toString();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
            r1 = this;
            java.lang.ref.WeakReference<java.lang.ClassLoader> r0 = r1.f152434a
            java.lang.Object r0 = r0.get()
            java.lang.ClassLoader r0 = (java.lang.ClassLoader) r0
            if (r0 == 0) goto L_0x0010
            java.lang.String r0 = r0.toString()
            if (r0 != 0) goto L_0x0012
        L_0x0010:
            java.lang.String r0 = "<null>"
        L_0x0012:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: xI.k1.toString():java.lang.String");
    }
}
