package tI;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\f\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u0000 \u001b2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00020\u00030\u0004:\u0001\u001cB\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\n2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00038VX\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0006\u001a\u00020\u00038VX\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0019¨\u0006\u001d"}, d2 = {"LtI/c;", "LtI/a;", "LtI/g;", "", "", "start", "endInclusive", "<init>", "(CC)V", "value", "", "t", "(C)Z", "isEmpty", "()Z", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "A", "()Ljava/lang/Character;", "x", "e", "a", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: tI.c  reason: case insensitive filesystem */
public final class C17967c extends C17965a implements C17971g<Character> {

    /* renamed from: e  reason: collision with root package name */
    public static final a f147321e = new a((DefaultConstructorMarker) null);

    /* renamed from: f  reason: collision with root package name */
    private static final C17967c f147322f = new C17967c(1, 0);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LtI/c$a;", "", "<init>", "()V", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: tI.c$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public C17967c(char c10, char c11) {
        super(c10, c11, 1);
    }

    /* renamed from: A */
    public Character i() {
        return Character.valueOf(p());
    }

    public /* bridge */ /* synthetic */ boolean b(Comparable comparable) {
        return t(((Character) comparable).charValue());
    }

    public boolean equals(Object obj) {
        if (obj instanceof C17967c) {
            if (!isEmpty() || !((C17967c) obj).isEmpty()) {
                C17967c cVar = (C17967c) obj;
                if (!(p() == cVar.p() && q() == cVar.q())) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (p() * 31) + q();
    }

    public boolean isEmpty() {
        return C17542s.l(p(), q()) > 0;
    }

    public boolean t(char c10) {
        return C17542s.l(p(), c10) <= 0 && C17542s.l(c10, q()) <= 0;
    }

    public String toString() {
        return p() + ".." + q();
    }

    /* renamed from: x */
    public Character m() {
        return Character.valueOf(q());
    }
}
