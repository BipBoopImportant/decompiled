package tI;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u0000 \u001a2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00020\u00030\u0004:\u0001\u001bB\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\n2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00038VX\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0006\u001a\u00020\u00038VX\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0018¨\u0006\u001c"}, d2 = {"LtI/j;", "LtI/h;", "LtI/g;", "", "", "start", "endInclusive", "<init>", "(II)V", "value", "", "A", "(I)Z", "isEmpty", "()Z", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "C", "()Ljava/lang/Integer;", "B", "e", "a", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: tI.j  reason: case insensitive filesystem */
public final class C17974j extends C17972h implements C17971g<Integer> {

    /* renamed from: e  reason: collision with root package name */
    public static final a f147335e = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public static final C17974j f147336f = new C17974j(1, 0);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"LtI/j$a;", "", "<init>", "()V", "LtI/j;", "EMPTY", "LtI/j;", "a", "()LtI/j;", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: tI.j$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C17974j a() {
            return C17974j.f147336f;
        }

        private a() {
        }
    }

    public C17974j(int i10, int i11) {
        super(i10, i11, 1);
    }

    public boolean A(int i10) {
        return p() <= i10 && i10 <= q();
    }

    /* renamed from: B */
    public Integer m() {
        return Integer.valueOf(q());
    }

    /* renamed from: C */
    public Integer i() {
        return Integer.valueOf(p());
    }

    public /* bridge */ /* synthetic */ boolean b(Comparable comparable) {
        return A(((Number) comparable).intValue());
    }

    public boolean equals(Object obj) {
        if (obj instanceof C17974j) {
            if (!isEmpty() || !((C17974j) obj).isEmpty()) {
                C17974j jVar = (C17974j) obj;
                if (!(p() == jVar.p() && q() == jVar.q())) {
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
        return p() > q();
    }

    public String toString() {
        return p() + ".." + q();
    }
}
