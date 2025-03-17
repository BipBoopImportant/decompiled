package me.saket.telephoto.zoomable;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import me.saket.telephoto.zoomable.o;
import t1.C5942c;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a6\u0010\u0007\u001a\u00020\u0000*\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\t"}, d2 = {"Lme/saket/telephoto/zoomable/o$d;", "Lme/saket/telephoto/zoomable/o$b;", "delegate", "LIJ/b;", "crossfadeDuration", "Lt1/c;", "placeholder", "a", "(Lme/saket/telephoto/zoomable/o$d;Lme/saket/telephoto/zoomable/o$b;JLt1/c;)Lme/saket/telephoto/zoomable/o$d;", "core_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class p {
    public static final o.d a(o.d dVar, o.b bVar, long j10, C5942c cVar) {
        C17542s.j(dVar, "$this$copy");
        return new o.d(bVar, j10, cVar, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ o.d b(o.d dVar, o.b bVar, long j10, C5942c cVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            bVar = dVar.b();
        }
        if ((i10 & 2) != 0) {
            j10 = dVar.a();
        }
        if ((i10 & 4) != 0) {
            cVar = dVar.c();
        }
        return a(dVar, bVar, j10, cVar);
    }
}
