package w0;

import U0.C4889m;
import XH.C16807N;
import kotlin.Metadata;
import kotlin.jvm.internal.C17544u;
import nI.C17642l;
import nI.r;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001Jy\u0010\r\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00042\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00042\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00042\u0018\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b0\tH&¢\u0006\u0004\b\r\u0010\u000e\u0001\u0001\u000fø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0010À\u0006\u0001"}, d2 = {"Lw0/y;", "", "", "count", "Lkotlin/Function1;", "key", "contentType", "Lw0/I;", "span", "Lkotlin/Function2;", "Lw0/m;", "LXH/N;", "itemContent", "j", "(ILnI/l;LnI/l;LnI/l;LnI/r;)V", "Lw0/h;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface y {

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "", "a", "(I)Ljava/lang/Void;"}, k = 3, mv = {1, 8, 0})
    static final class a extends C17544u implements C17642l {

        /* renamed from: c  reason: collision with root package name */
        public static final a f31319c = new a();

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

    static /* synthetic */ void g(y yVar, int i10, C17642l lVar, C17642l lVar2, C17642l lVar3, r rVar, int i11, Object obj) {
        if (obj == null) {
            C17642l lVar4 = (i11 & 2) != 0 ? null : lVar;
            if ((i11 & 4) != 0) {
                lVar2 = a.f31319c;
            }
            yVar.j(i10, lVar4, lVar2, (i11 & 8) != 0 ? null : lVar3, rVar);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: items");
    }

    void j(int i10, C17642l<? super Integer, ? extends Object> lVar, C17642l<? super Integer, ? extends Object> lVar2, C17642l<? super Integer, I> lVar3, r<? super m, ? super Integer, ? super C4889m, ? super Integer, C16807N> rVar);
}
