package mL;

import jL.C17492a;
import kL.C17522c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nL.C17686c;
import pL.C17770a;
import pL.C17771b;
import vL.C18207b;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b&\u0018\u0000 \n*\u0004\b\u0000\u0010\u00012\u00060\u0002j\u0002`\u0003:\u0001\fB\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00028\u00002\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00028\u00002\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"LmL/c;", "T", "", "Lorg/koin/mp/Lockable;", "LjL/a;", "beanDefinition", "<init>", "(LjL/a;)V", "LmL/b;", "context", "b", "(LmL/b;)Ljava/lang/Object;", "a", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "LjL/a;", "c", "()LjL/a;", "koin-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: mL.c  reason: case insensitive filesystem */
public abstract class C17619c<T> {

    /* renamed from: b  reason: collision with root package name */
    public static final a f144576b = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final C17492a<T> f144577a;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LmL/c$a;", "", "<init>", "()V", "", "ERROR_SEPARATOR", "Ljava/lang/String;", "koin-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: mL.c$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public C17619c(C17492a<T> aVar) {
        C17542s.j(aVar, "beanDefinition");
        this.f144577a = aVar;
    }

    public T a(C17618b bVar) {
        C17542s.j(bVar, "context");
        C17686c a10 = bVar.a();
        a10.a("| (+) '" + this.f144577a + '\'');
        try {
            C17770a b10 = bVar.b();
            if (b10 == null) {
                b10 = C17771b.a();
            }
            return this.f144577a.a().invoke(bVar.c(), b10);
        } catch (Exception e10) {
            String e11 = C18207b.f149085a.e(e10);
            C17686c a11 = bVar.a();
            a11.c("* Instance creation error : could not create instance for '" + this.f144577a + "': " + e11);
            throw new C17522c("Could not create instance for '" + this.f144577a + '\'', e10);
        }
    }

    public abstract T b(C17618b bVar);

    public final C17492a<T> c() {
        return this.f144577a;
    }

    public boolean equals(Object obj) {
        C17492a<T> aVar = null;
        C17619c cVar = obj instanceof C17619c ? (C17619c) obj : null;
        if (cVar != null) {
            aVar = cVar.f144577a;
        }
        return C17542s.e(this.f144577a, aVar);
    }

    public int hashCode() {
        return this.f144577a.hashCode();
    }
}
