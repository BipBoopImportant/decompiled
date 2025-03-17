package androidx.compose.foundation.layout;

import E1.C4468a;
import E1.L;
import E1.a0;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17642l;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0002\u0007\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\b\u0001\u0002\n\u000b¨\u0006\f"}, d2 = {"Landroidx/compose/foundation/layout/c;", "", "<init>", "()V", "LE1/a0;", "placeable", "", "a", "(LE1/a0;)I", "b", "Landroidx/compose/foundation/layout/c$a;", "Landroidx/compose/foundation/layout/c$b;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.compose.foundation.layout.c  reason: case insensitive filesystem */
public abstract class C5072c {

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Landroidx/compose/foundation/layout/c$a;", "Landroidx/compose/foundation/layout/c;", "Lkotlin/Function1;", "LE1/L;", "", "lineProviderBlock", "<init>", "(LnI/l;)V", "LE1/a0;", "placeable", "a", "(LE1/a0;)I", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "LnI/l;", "getLineProviderBlock", "()LnI/l;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.layout.c$a */
    public static final class a extends C5072c {

        /* renamed from: a  reason: collision with root package name */
        private final C17642l<L, Integer> f18066a;

        public a(C17642l<? super L, Integer> lVar) {
            super((DefaultConstructorMarker) null);
            this.f18066a = lVar;
        }

        public int a(a0 a0Var) {
            return this.f18066a.invoke(a0Var).intValue();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && C17542s.e(this.f18066a, ((a) obj).f18066a);
        }

        public int hashCode() {
            return this.f18066a.hashCode();
        }

        public String toString() {
            return "Block(lineProviderBlock=" + this.f18066a + ')';
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Landroidx/compose/foundation/layout/c$b;", "Landroidx/compose/foundation/layout/c;", "LE1/a;", "alignmentLine", "<init>", "(LE1/a;)V", "LE1/a0;", "placeable", "", "a", "(LE1/a0;)I", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "LE1/a;", "getAlignmentLine", "()LE1/a;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.layout.c$b */
    public static final class b extends C5072c {

        /* renamed from: a  reason: collision with root package name */
        private final C4468a f18067a;

        public b(C4468a aVar) {
            super((DefaultConstructorMarker) null);
            this.f18067a = aVar;
        }

        public int a(a0 a0Var) {
            return a0Var.n0(this.f18067a);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && C17542s.e(this.f18067a, ((b) obj).f18067a);
        }

        public int hashCode() {
            return this.f18067a.hashCode();
        }

        public String toString() {
            return "Value(alignmentLine=" + this.f18067a + ')';
        }
    }

    public /* synthetic */ C5072c(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract int a(a0 a0Var);

    private C5072c() {
    }
}
