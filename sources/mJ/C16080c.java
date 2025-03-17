package MJ;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import oI.C17697e;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010'\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004B+\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00028\u0000\u0012\u0006\u0010\b\u001a\u00028\u0001¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00028\u00012\u0006\u0010\u000b\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\f\u0010\rR \u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\"\u0010\b\u001a\u00028\u00018\u0016@\u0016X\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"LMJ/c;", "K", "V", "LMJ/b;", "", "LMJ/i;", "parentIterator", "key", "value", "<init>", "(LMJ/i;Ljava/lang/Object;Ljava/lang/Object;)V", "newValue", "setValue", "(Ljava/lang/Object;)Ljava/lang/Object;", "c", "LMJ/i;", "d", "Ljava/lang/Object;", "getValue", "()Ljava/lang/Object;", "b", "(Ljava/lang/Object;)V", "kotlinx-collections-immutable"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: MJ.c  reason: case insensitive filesystem */
final class C16080c<K, V> extends C16079b<K, V> implements Map.Entry<K, V>, C17697e.a {

    /* renamed from: c  reason: collision with root package name */
    private final C16086i<K, V> f136409c;

    /* renamed from: d  reason: collision with root package name */
    private V f136410d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C16080c(C16086i<K, V> iVar, K k10, V v10) {
        super(k10, v10);
        C17542s.j(iVar, "parentIterator");
        this.f136409c = iVar;
        this.f136410d = v10;
    }

    public void b(V v10) {
        this.f136410d = v10;
    }

    public V getValue() {
        return this.f136410d;
    }

    public V setValue(V v10) {
        V value = getValue();
        b(v10);
        this.f136409c.d(getKey(), v10);
        return value;
    }
}
