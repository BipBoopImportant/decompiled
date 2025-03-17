package Cp;

import XH.C16807N;
import com.ingka.ikea.dataethics.EthicsDialogData;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0010\b\b\u0018\u00002\u00020\u0001BC\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJN\u0010\r\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t0\bHÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u0013R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0019\u001a\u0004\b\u001c\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u0019\u001a\u0004\b\u001d\u0010\u0013R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R#\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b \u0010\"\u001a\u0004\b#\u0010$¨\u0006%"}, d2 = {"LCp/c;", "", "", "image", "title", "message", "Lcom/ingka/ikea/dataethics/EthicsDialogData;", "ethicsDialogData", "Lkotlin/Function1;", "LXH/N;", "onClick", "<init>", "(IIILcom/ingka/ikea/dataethics/EthicsDialogData;LnI/l;)V", "c", "(IIILcom/ingka/ikea/dataethics/EthicsDialogData;LnI/l;)LCp/c;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "f", "b", "h", "getMessage", "d", "Lcom/ingka/ikea/dataethics/EthicsDialogData;", "e", "()Lcom/ingka/ikea/dataethics/EthicsDialogData;", "LnI/l;", "g", "()LnI/l;", "dataethics_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c {

    /* renamed from: a  reason: collision with root package name */
    private final int f79655a;

    /* renamed from: b  reason: collision with root package name */
    private final int f79656b;

    /* renamed from: c  reason: collision with root package name */
    private final int f79657c;

    /* renamed from: d  reason: collision with root package name */
    private final EthicsDialogData f79658d;

    /* renamed from: e  reason: collision with root package name */
    private final C17642l<EthicsDialogData, C16807N> f79659e;

    public c(int i10, int i11, int i12, EthicsDialogData ethicsDialogData, C17642l<? super EthicsDialogData, C16807N> lVar) {
        C17542s.j(ethicsDialogData, "ethicsDialogData");
        C17542s.j(lVar, "onClick");
        this.f79655a = i10;
        this.f79656b = i11;
        this.f79657c = i12;
        this.f79658d = ethicsDialogData;
        this.f79659e = lVar;
    }

    /* access modifiers changed from: private */
    public static final C16807N b(EthicsDialogData ethicsDialogData) {
        C17542s.j(ethicsDialogData, "it");
        return C16807N.f139792a;
    }

    public static /* synthetic */ c d(c cVar, int i10, int i11, int i12, EthicsDialogData ethicsDialogData, C17642l<EthicsDialogData, C16807N> lVar, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i10 = cVar.f79655a;
        }
        if ((i13 & 2) != 0) {
            i11 = cVar.f79656b;
        }
        int i14 = i11;
        if ((i13 & 4) != 0) {
            i12 = cVar.f79657c;
        }
        int i15 = i12;
        if ((i13 & 8) != 0) {
            ethicsDialogData = cVar.f79658d;
        }
        EthicsDialogData ethicsDialogData2 = ethicsDialogData;
        if ((i13 & 16) != 0) {
            lVar = cVar.f79659e;
        }
        return cVar.c(i10, i14, i15, ethicsDialogData2, lVar);
    }

    public final c c(int i10, int i11, int i12, EthicsDialogData ethicsDialogData, C17642l<? super EthicsDialogData, C16807N> lVar) {
        C17542s.j(ethicsDialogData, "ethicsDialogData");
        C17542s.j(lVar, "onClick");
        return new c(i10, i11, i12, ethicsDialogData, lVar);
    }

    public final EthicsDialogData e() {
        return this.f79658d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f79655a == cVar.f79655a && this.f79656b == cVar.f79656b && this.f79657c == cVar.f79657c && C17542s.e(this.f79658d, cVar.f79658d) && C17542s.e(this.f79659e, cVar.f79659e);
    }

    public final int f() {
        return this.f79655a;
    }

    public final C17642l<EthicsDialogData, C16807N> g() {
        return this.f79659e;
    }

    public final int h() {
        return this.f79656b;
    }

    public int hashCode() {
        return (((((((Integer.hashCode(this.f79655a) * 31) + Integer.hashCode(this.f79656b)) * 31) + Integer.hashCode(this.f79657c)) * 31) + this.f79658d.hashCode()) * 31) + this.f79659e.hashCode();
    }

    public String toString() {
        int i10 = this.f79655a;
        int i11 = this.f79656b;
        int i12 = this.f79657c;
        EthicsDialogData ethicsDialogData = this.f79658d;
        C17642l<EthicsDialogData, C16807N> lVar = this.f79659e;
        return "EthicsCardData(image=" + i10 + ", title=" + i11 + ", message=" + i12 + ", ethicsDialogData=" + ethicsDialogData + ", onClick=" + lVar + ")";
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ c(int r7, int r8, int r9, com.ingka.ikea.dataethics.EthicsDialogData r10, nI.C17642l r11, int r12, kotlin.jvm.internal.DefaultConstructorMarker r13) {
        /*
            r6 = this;
            r12 = r12 & 16
            if (r12 == 0) goto L_0x0009
            Cp.b r11 = new Cp.b
            r11.<init>()
        L_0x0009:
            r5 = r11
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Cp.c.<init>(int, int, int, com.ingka.ikea.dataethics.EthicsDialogData, nI.l, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
