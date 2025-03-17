package wK;

import U0.C4889m;
import XH.C16807N;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.p;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"LwK/F;", "", "<init>", "()V", "a", "c", "b", "LwK/F$a;", "LwK/F$b;", "LwK/F$c;", "design_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: wK.F  reason: case insensitive filesystem */
public abstract class C18237F {

    /* renamed from: a  reason: collision with root package name */
    public static final int f149464a = 0;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LwK/F$a;", "LwK/F;", "design_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: wK.F$a */
    public static final class a extends C18237F {
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"LwK/F$b;", "LwK/F;", "Lkotlin/Function0;", "LXH/N;", "content", "<init>", "(LnI/p;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "LnI/p;", "a", "()LnI/p;", "design_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: wK.F$b */
    public static final class b extends C18237F {

        /* renamed from: b  reason: collision with root package name */
        private final p<C4889m, Integer, C16807N> f149465b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(p<? super C4889m, ? super Integer, C16807N> pVar) {
            super((DefaultConstructorMarker) null);
            C17542s.j(pVar, "content");
            this.f149465b = pVar;
        }

        public final p<C4889m, Integer, C16807N> a() {
            return this.f149465b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && C17542s.e(this.f149465b, ((b) obj).f149465b);
        }

        public int hashCode() {
            return this.f149465b.hashCode();
        }

        public String toString() {
            p<C4889m, Integer, C16807N> pVar = this.f149465b;
            return "Image(content=" + pVar + ")";
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0007¨\u0006\u0013"}, d2 = {"LwK/F$c;", "LwK/F;", "", "text", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "a", "design_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: wK.F$c */
    public static final class c extends C18237F {

        /* renamed from: b  reason: collision with root package name */
        private final String f149466b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(String str) {
            super((DefaultConstructorMarker) null);
            C17542s.j(str, "text");
            this.f149466b = str;
        }

        public final String a() {
            return this.f149466b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && C17542s.e(this.f149466b, ((c) obj).f149466b);
        }

        public int hashCode() {
            return this.f149466b.hashCode();
        }

        public String toString() {
            String str = this.f149466b;
            return "Text(text=" + str + ")";
        }
    }

    public /* synthetic */ C18237F(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private C18237F() {
    }
}
