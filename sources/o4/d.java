package O4;

import XH.C16807N;
import androidx.room.x;
import j0.C5445a;
import j0.C5468y;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;

@Metadata(d1 = {"\u00004\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001ay\u0010\u000b\u001a\u00020\t\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\u0004\b\u0001\u0010\u00022\"\u0010\u0005\u001a\u001e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003j\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\u00042\u0006\u0010\u0007\u001a\u00020\u00062.\u0010\n\u001a*\u0012 \u0012\u001e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003j\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\u0004\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\f\u001aC\u0010\u000e\u001a\u00020\t\"\u0004\b\u0000\u0010\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\r2\u0006\u0010\u0007\u001a\u00020\u00062\u0018\u0010\n\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\r\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000e\u0010\u000f\u001aY\u0010\u0011\u001a\u00020\t\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\u0004\b\u0001\u0010\u00022\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00102\u0006\u0010\u0007\u001a\u00020\u00062\u001e\u0010\n\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0010\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"", "K", "V", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "map", "", "isRelationCollection", "Lkotlin/Function1;", "LXH/N;", "fetchBlock", "b", "(Ljava/util/HashMap;ZLnI/l;)V", "Lj0/y;", "c", "(Lj0/y;ZLnI/l;)V", "Lj0/a;", "a", "(Lj0/a;ZLnI/l;)V", "room-runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class d {
    public static final <K, V> void a(C5445a<K, V> aVar, boolean z10, C17642l<? super C5445a<K, V>, C16807N> lVar) {
        C17542s.j(aVar, "map");
        C17542s.j(lVar, "fetchBlock");
        C5445a aVar2 = new C5445a((int) x.MAX_BIND_PARAMETER_CNT);
        int size = aVar.size();
        int i10 = 0;
        int i11 = 0;
        while (i10 < size) {
            if (z10) {
                aVar2.put(aVar.h(i10), aVar.m(i10));
            } else {
                aVar2.put(aVar.h(i10), (Object) null);
            }
            i10++;
            i11++;
            if (i11 == 999) {
                lVar.invoke(aVar2);
                if (!z10) {
                    aVar.putAll(aVar2);
                }
                aVar2.clear();
                i11 = 0;
            }
        }
        if (i11 > 0) {
            lVar.invoke(aVar2);
            if (!z10) {
                aVar.putAll(aVar2);
            }
        }
    }

    public static final <K, V> void b(HashMap<K, V> hashMap, boolean z10, C17642l<? super HashMap<K, V>, C16807N> lVar) {
        int i10;
        C17542s.j(hashMap, "map");
        C17542s.j(lVar, "fetchBlock");
        HashMap hashMap2 = new HashMap(x.MAX_BIND_PARAMETER_CNT);
        loop0:
        while (true) {
            i10 = 0;
            for (K next : hashMap.keySet()) {
                if (z10) {
                    C17542s.i(next, "key");
                    hashMap2.put(next, hashMap.get(next));
                } else {
                    C17542s.i(next, "key");
                    hashMap2.put(next, (Object) null);
                }
                i10++;
                if (i10 == 999) {
                    lVar.invoke(hashMap2);
                    if (!z10) {
                        hashMap.putAll(hashMap2);
                    }
                    hashMap2.clear();
                }
            }
            break loop0;
        }
        if (i10 > 0) {
            lVar.invoke(hashMap2);
            if (!z10) {
                hashMap.putAll(hashMap2);
            }
        }
    }

    public static final <V> void c(C5468y<V> yVar, boolean z10, C17642l<? super C5468y<V>, C16807N> lVar) {
        C17542s.j(yVar, "map");
        C17542s.j(lVar, "fetchBlock");
        C5468y yVar2 = new C5468y(x.MAX_BIND_PARAMETER_CNT);
        int o10 = yVar.o();
        int i10 = 0;
        int i11 = 0;
        while (i10 < o10) {
            if (z10) {
                yVar2.k(yVar.j(i10), yVar.p(i10));
            } else {
                yVar2.k(yVar.j(i10), null);
            }
            i10++;
            i11++;
            if (i11 == 999) {
                lVar.invoke(yVar2);
                if (!z10) {
                    yVar.l(yVar2);
                }
                yVar2.a();
                i11 = 0;
            }
        }
        if (i11 > 0) {
            lVar.invoke(yVar2);
            if (!z10) {
                yVar.l(yVar2);
            }
        }
    }
}
