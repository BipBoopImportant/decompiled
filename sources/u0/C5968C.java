package u0;

import U0.C4889m;
import XH.C16807N;
import kotlin.Metadata;
import kotlin.jvm.internal.C17544u;
import nI.C17642l;
import nI.p;
import nI.q;
import nI.r;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001JS\u0010\u000b\u001a\u00020\t2\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0003H&¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0011\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\r2\u0016\b\u0002\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00032\u001c\b\u0002\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000f2\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00032\u0018\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\t0\u000fH&¢\u0006\u0004\b\u0011\u0010\u0012\u0001\u0001\u0013ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0014À\u0006\u0001"}, d2 = {"Lu0/C;", "", "key", "Lkotlin/Function1;", "Lu0/q;", "Lu0/c;", "span", "contentType", "Lu0/o;", "LXH/N;", "content", "d", "(Ljava/lang/Object;LnI/l;Ljava/lang/Object;LnI/q;)V", "", "count", "Lkotlin/Function2;", "itemContent", "h", "(ILnI/l;LnI/p;LnI/l;LnI/r;)V", "Lu0/j;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: u0.C  reason: case insensitive filesystem */
public interface C5968C {

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "", "a", "(I)Ljava/lang/Void;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: u0.C$a */
    static final class a extends C17544u implements C17642l {

        /* renamed from: c  reason: collision with root package name */
        public static final a f29567c = new a();

        a() {
            super(1);
        }

        public final Void a(int i10) {
            return null;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).intValue());
        }
    }

    static /* synthetic */ void c(C5968C c10, int i10, C17642l lVar, p pVar, C17642l lVar2, r rVar, int i11, Object obj) {
        if (obj == null) {
            C17642l lVar3 = (i11 & 2) != 0 ? null : lVar;
            p pVar2 = (i11 & 4) != 0 ? null : pVar;
            if ((i11 & 8) != 0) {
                lVar2 = a.f29567c;
            }
            c10.h(i10, lVar3, pVar2, lVar2, rVar);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: items");
    }

    static /* synthetic */ void f(C5968C c10, Object obj, C17642l lVar, Object obj2, q qVar, int i10, Object obj3) {
        if (obj3 == null) {
            if ((i10 & 1) != 0) {
                obj = null;
            }
            if ((i10 & 2) != 0) {
                lVar = null;
            }
            if ((i10 & 4) != 0) {
                obj2 = null;
            }
            c10.d(obj, lVar, obj2, qVar);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: item");
    }

    void d(Object obj, C17642l<? super C5993q, C5979c> lVar, Object obj2, q<? super C5991o, ? super C4889m, ? super Integer, C16807N> qVar);

    void h(int i10, C17642l<? super Integer, ? extends Object> lVar, p<? super C5993q, ? super Integer, C5979c> pVar, C17642l<? super Integer, ? extends Object> lVar2, r<? super C5991o, ? super Integer, ? super C4889m, ? super Integer, C16807N> rVar);
}
