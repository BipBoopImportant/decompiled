package t0;

import YH.C16877v;
import androidx.compose.foundation.lazy.layout.d;
import kotlin.Metadata;
import v0.K;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\f\u001a\u00020\u000b*\u00020\u00062\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u000e\u001a\u00020\u000b*\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0012\u001a\u00020\u000b*\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0014R\u0016\u0010\u0016\u001a\u00020\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u0018R\u0016\u0010\u001c\u001a\u00020\u001a8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u001b¨\u0006\u001d"}, d2 = {"Lt0/a;", "Lt0/v;", "", "nestedPrefetchItemCount", "<init>", "(I)V", "Lt0/u;", "", "delta", "Lt0/p;", "layoutInfo", "LXH/N;", "c", "(Lt0/u;FLt0/p;)V", "d", "(Lt0/u;Lt0/p;)V", "Lv0/K;", "firstVisibleItemIndex", "a", "(Lv0/K;I)V", "I", "b", "indexToPrefetch", "Landroidx/compose/foundation/lazy/layout/d$b;", "Landroidx/compose/foundation/lazy/layout/d$b;", "currentPrefetchHandle", "", "Z", "wasScrollingForward", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: t0.a  reason: case insensitive filesystem */
final class C5936a implements v {

    /* renamed from: a  reason: collision with root package name */
    private final int f29160a;

    /* renamed from: b  reason: collision with root package name */
    private int f29161b = -1;

    /* renamed from: c  reason: collision with root package name */
    private d.b f29162c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f29163d;

    public C5936a(int i10) {
        this.f29160a = i10;
    }

    public void a(K k10, int i10) {
        int i11 = this.f29160a;
        for (int i12 = 0; i12 < i11; i12++) {
            k10.a(i10 + i12);
        }
    }

    public void c(u uVar, float f10, p pVar) {
        d.b bVar;
        d.b bVar2;
        d.b bVar3;
        if (!pVar.i().isEmpty()) {
            boolean z10 = f10 < 0.0f;
            int index = z10 ? ((k) C16877v.I0(pVar.i())).getIndex() + 1 : ((k) C16877v.w0(pVar.i())).getIndex() - 1;
            if (index >= 0 && index < pVar.f()) {
                if (index != this.f29161b) {
                    if (!(this.f29163d == z10 || (bVar3 = this.f29162c) == null)) {
                        bVar3.cancel();
                    }
                    this.f29163d = z10;
                    this.f29161b = index;
                    this.f29162c = uVar.a(index);
                }
                if (z10) {
                    k kVar = (k) C16877v.I0(pVar.i());
                    if (((float) (((kVar.c() + kVar.a()) + pVar.g()) - pVar.e())) < (-f10) && (bVar2 = this.f29162c) != null) {
                        bVar2.a();
                    }
                } else if (((float) (pVar.h() - ((k) C16877v.w0(pVar.i())).c())) < f10 && (bVar = this.f29162c) != null) {
                    bVar.a();
                }
            }
        }
    }

    public void d(u uVar, p pVar) {
        if (this.f29161b != -1 && !pVar.i().isEmpty()) {
            if (this.f29161b != (this.f29163d ? ((k) C16877v.I0(pVar.i())).getIndex() + 1 : ((k) C16877v.w0(pVar.i())).getIndex() - 1)) {
                this.f29161b = -1;
                d.b bVar = this.f29162c;
                if (bVar != null) {
                    bVar.cancel();
                }
                this.f29162c = null;
            }
        }
    }
}
