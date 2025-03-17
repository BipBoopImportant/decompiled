package qC;

import Ae.e;
import XH.C16796C;
import YH.X;
import fI.C17221b;
import gp.C11343b;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0002\t\fB\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000b¨\u0006\r"}, d2 = {"LqC/b;", "LqC/a;", "LAe/e;", "analytics", "<init>", "(LAe/e;)V", "Lgp/b$a;", "type", "LXH/N;", "a", "(Lgp/b$a;)V", "LAe/e;", "b", "taskscheduler-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: qC.b  reason: case insensitive filesystem */
public final class C14938b implements C14937a {

    /* renamed from: a  reason: collision with root package name */
    private final e f130400a;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\b\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\t¨\u0006\n"}, d2 = {"LqC/b$a;", "", "", "key", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "TASK_DISPATCHED", "taskscheduler-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: qC.b$a */
    private enum a {
        TASK_DISPATCHED("dev_only_task_dispatched");
        
        private final String key;

        static {
            a[] a10;
            $ENTRIES = C17221b.a(a10);
        }

        private a(String str) {
            this.key = str;
        }

        public final String b() {
            return this.key;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\b\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\t¨\u0006\n"}, d2 = {"LqC/b$b;", "", "", "key", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "EVENT_TYPE", "taskscheduler-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: qC.b$b  reason: collision with other inner class name */
    private enum C3224b {
        EVENT_TYPE("event_type");
        
        private final String key;

        static {
            C3224b[] a10;
            $ENTRIES = C17221b.a(a10);
        }

        private C3224b(String str) {
            this.key = str;
        }

        public final String b() {
            return this.key;
        }
    }

    public C14938b(e eVar) {
        C17542s.j(eVar, "analytics");
        this.f130400a = eVar;
    }

    public void a(C11343b.a aVar) {
        C17542s.j(aVar, "type");
        this.f130400a.track(a.TASK_DISPATCHED.b(), X.f(C16796C.a(C3224b.EVENT_TYPE.b(), aVar.b())));
    }
}
