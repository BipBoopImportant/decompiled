package D4;

import YH.C16877v;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import nI.C17631a;
import nI.C17642l;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0001B!\u0012\u0018\u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001c\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005H\u0002¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rR&\u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00050\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000eR2\u0010\u0014\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00050\u000f8\u0000X\u0004¢\u0006\u0012\n\u0004\b\t\u0010\u0010\u0012\u0004\b\u0013\u0010\r\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"LD4/s;", "", "Key", "Value", "Lkotlin/Function0;", "LD4/P;", "pagingSourceFactory", "<init>", "(LnI/a;)V", "b", "()LD4/P;", "LXH/N;", "a", "()V", "LnI/a;", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Ljava/util/concurrent/CopyOnWriteArrayList;", "getPagingSources$paging_common", "()Ljava/util/concurrent/CopyOnWriteArrayList;", "getPagingSources$paging_common$annotations", "pagingSources", "paging-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: D4.s  reason: case insensitive filesystem */
public final class C6444s<Key, Value> implements C17631a {

    /* renamed from: a  reason: collision with root package name */
    private final C17631a<P<Key, Value>> f34441a;

    /* renamed from: b  reason: collision with root package name */
    private final CopyOnWriteArrayList<P<Key, Value>> f34442b = new CopyOnWriteArrayList<>();

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0006\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00002&\u0010\u0005\u001a\"\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001 \u0004*\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "Key", "Value", "LD4/P;", "kotlin.jvm.PlatformType", "it", "", "a", "(LD4/P;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: D4.s$a */
    static final class a extends C17544u implements C17642l<P<Key, Value>, Boolean> {

        /* renamed from: c  reason: collision with root package name */
        public static final a f34443c = new a();

        a() {
            super(1);
        }

        /* renamed from: a */
        public final Boolean invoke(P<Key, Value> p10) {
            return Boolean.valueOf(p10.a());
        }
    }

    public C6444s(C17631a<? extends P<Key, Value>> aVar) {
        C17542s.j(aVar, "pagingSourceFactory");
        this.f34441a = aVar;
    }

    public final void a() {
        Iterator<P<Key, Value>> it = this.f34442b.iterator();
        while (it.hasNext()) {
            P next = it.next();
            if (!next.a()) {
                next.e();
            }
        }
        C16877v.L(this.f34442b, a.f34443c);
    }

    /* renamed from: b */
    public P<Key, Value> invoke() {
        P<Key, Value> invoke = this.f34441a.invoke();
        this.f34442b.add(invoke);
        return invoke;
    }
}
