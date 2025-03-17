package oH;

import XH.C16807N;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;
import oH.C17692b;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003Jq\u0010\u0011\u001a\u00020\u000f2\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u00042\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r¢\u0006\u0004\b\u0011\u0010\u0012J)\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u00132\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u0013¢\u0006\u0004\b\u0018\u0010\u0019R\"\u0010 \u001a\u00020\u001a8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"LoH/d;", "", "<init>", "()V", "", "ime", "navigationBars", "statusBars", "systemGestures", "mandatorySystemGestures", "displayCutout", "captionBar", "tappableElement", "Lkotlin/Function1;", "LoH/c;", "LXH/N;", "f", "d", "(ZZZZZZZZLnI/l;)V", "", "type", "c", "(ILnI/l;)V", "consume", "a", "(I)V", "LoH/b$a;", "LoH/b$a;", "b", "()LoH/b$a;", "setBuilder$insetter", "(LoH/b$a;)V", "builder", "insetter"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class d {

    /* renamed from: a  reason: collision with root package name */
    private C17692b.a f145274a = C17692b.f145253j.a();

    public static /* synthetic */ void e(d dVar, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, C17642l lVar, int i10, Object obj) {
        int i11 = i10;
        dVar.d((i11 & 1) != 0 ? false : z10, (i11 & 2) != 0 ? false : z11, (i11 & 4) != 0 ? false : z12, (i11 & 8) != 0 ? false : z13, (i11 & 16) != 0 ? false : z14, (i11 & 32) != 0 ? false : z15, (i11 & 64) != 0 ? false : z16, (i11 & 128) != 0 ? false : z17, lVar);
    }

    public final void a(int i10) {
        this.f145274a = this.f145274a.c(i10);
    }

    public final C17692b.a b() {
        return this.f145274a;
    }

    public final void c(int i10, C17642l<? super c, C16807N> lVar) {
        C17542s.j(lVar, "f");
        if (i10 != 0) {
            c cVar = new c(i10, this.f145274a);
            lVar.invoke(cVar);
            this.f145274a = cVar.a();
            return;
        }
        throw new IllegalArgumentException("A type is required");
    }

    public final void d(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, C17642l<? super c, C16807N> lVar) {
        C17542s.j(lVar, "f");
        c(l.a(z10, z11, z12, z13, z14, z15, z16, z17), lVar);
    }
}
