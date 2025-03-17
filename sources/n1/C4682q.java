package N1;

import XH.C16807N;
import YH.C16877v;
import java.util.List;
import kotlin.Metadata;
import nI.C17642l;

@Metadata(d1 = {"\u0000,\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a%\u0010\u0005\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a%\u0010\t\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\t\u0010\n\u001a<\u0010\u0010\u001a\u00020\u000e2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\f\u001a\u00020\u000b2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u000e0\rH\u0000ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a%\u0010\u0013\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0012\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0013\u0010\u0006\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0014"}, d2 = {"", "LN1/t;", "paragraphInfoList", "", "index", "a", "(Ljava/util/List;I)I", "", "y", "c", "(Ljava/util/List;F)I", "LN1/W;", "range", "Lkotlin/Function1;", "LXH/N;", "action", "d", "(Ljava/util/List;JLnI/l;)V", "lineIndex", "b", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: N1.q  reason: case insensitive filesystem */
public final class C4682q {
    public static final int a(List<C4684t> list, int i10) {
        int b10 = ((C4684t) C16877v.I0(list)).b();
        if (i10 <= ((C4684t) C16877v.I0(list)).b()) {
            int size = list.size() - 1;
            int i11 = 0;
            while (i11 <= size) {
                int i12 = (i11 + size) >>> 1;
                C4684t tVar = list.get(i12);
                char c10 = tVar.f() > i10 ? 1 : tVar.b() <= i10 ? (char) 65535 : 0;
                if (c10 < 0) {
                    i11 = i12 + 1;
                } else if (c10 <= 0) {
                    return i12;
                } else {
                    size = i12 - 1;
                }
            }
            return -(i11 + 1);
        }
        throw new IllegalArgumentException(("Index " + i10 + " should be less or equal than last line's end " + b10).toString());
    }

    public static final int b(List<C4684t> list, int i10) {
        int size = list.size() - 1;
        int i11 = 0;
        while (i11 <= size) {
            int i12 = (i11 + size) >>> 1;
            C4684t tVar = list.get(i12);
            char c10 = tVar.g() > i10 ? 1 : tVar.c() <= i10 ? (char) 65535 : 0;
            if (c10 < 0) {
                i11 = i12 + 1;
            } else if (c10 <= 0) {
                return i12;
            } else {
                size = i12 - 1;
            }
        }
        return -(i11 + 1);
    }

    public static final int c(List<C4684t> list, float f10) {
        if (f10 <= 0.0f) {
            return 0;
        }
        if (f10 >= ((C4684t) C16877v.I0(list)).a()) {
            return C16877v.p(list);
        }
        int size = list.size() - 1;
        int i10 = 0;
        while (i10 <= size) {
            int i11 = (i10 + size) >>> 1;
            C4684t tVar = list.get(i11);
            char c10 = tVar.h() > f10 ? 1 : tVar.a() <= f10 ? (char) 65535 : 0;
            if (c10 < 0) {
                i10 = i11 + 1;
            } else if (c10 <= 0) {
                return i11;
            } else {
                size = i11 - 1;
            }
        }
        return -(i10 + 1);
    }

    public static final void d(List<C4684t> list, long j10, C17642l<? super C4684t, C16807N> lVar) {
        int a10 = a(list, W.l(j10));
        int size = list.size();
        while (a10 < size) {
            C4684t tVar = list.get(a10);
            if (tVar.f() < W.k(j10)) {
                if (tVar.f() != tVar.b()) {
                    lVar.invoke(tVar);
                }
                a10++;
            } else {
                return;
            }
        }
    }
}
