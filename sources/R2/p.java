package R2;

import QJ.C16339x;
import dI.C17164e;
import dI.C17168i;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b0\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u0005B\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004\u0001\u0001\u0006¨\u0006\u0007"}, d2 = {"LR2/p;", "T", "", "<init>", "()V", "a", "LR2/p$a;", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class p<T> {

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002BQ\u0012\"\u0010\u0006\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0003\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0007\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eR3\u0010\u0006\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00038\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u000f\u0010\u0015R\"\u0010\n\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\t8\u0016X\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0019\u001a\u0004\b\u0013\u0010\u001a¨\u0006\u001b"}, d2 = {"LR2/p$a;", "T", "LR2/p;", "Lkotlin/Function2;", "LdI/e;", "", "transform", "LQJ/x;", "ack", "LR2/v;", "lastState", "LdI/i;", "callerContext", "<init>", "(LnI/p;LQJ/x;LR2/v;LdI/i;)V", "a", "LnI/p;", "d", "()LnI/p;", "b", "LQJ/x;", "()LQJ/x;", "c", "LR2/v;", "()LR2/v;", "LdI/i;", "()LdI/i;", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a<T> extends p<T> {

        /* renamed from: a  reason: collision with root package name */
        private final nI.p<T, C17164e<? super T>, Object> f12469a;

        /* renamed from: b  reason: collision with root package name */
        private final C16339x<T> f12470b;

        /* renamed from: c  reason: collision with root package name */
        private final v<T> f12471c;

        /* renamed from: d  reason: collision with root package name */
        private final C17168i f12472d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(nI.p<? super T, ? super C17164e<? super T>, ? extends Object> pVar, C16339x<T> xVar, v<T> vVar, C17168i iVar) {
            super((DefaultConstructorMarker) null);
            C17542s.j(pVar, "transform");
            C17542s.j(xVar, "ack");
            C17542s.j(iVar, "callerContext");
            this.f12469a = pVar;
            this.f12470b = xVar;
            this.f12471c = vVar;
            this.f12472d = iVar;
        }

        public final C16339x<T> a() {
            return this.f12470b;
        }

        public final C17168i b() {
            return this.f12472d;
        }

        public v<T> c() {
            return this.f12471c;
        }

        public final nI.p<T, C17164e<? super T>, Object> d() {
            return this.f12469a;
        }
    }

    public /* synthetic */ p(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private p() {
    }
}
