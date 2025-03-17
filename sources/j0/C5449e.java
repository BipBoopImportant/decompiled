package j0;

import YH.C16870n;
import k0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0013\b\u0007\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u0005J\r\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\bJ\r\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0013\u001a\u00020\u00118\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u0012R\u0016\u0010\u0015\u001a\u00020\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u0014R\u0016\u0010\u0016\u001a\u00020\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u0014R\u0016\u0010\u0017\u001a\u00020\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0014¨\u0006\u0018"}, d2 = {"Lj0/e;", "", "", "minCapacity", "<init>", "(I)V", "LXH/N;", "c", "()V", "element", "a", "e", "()I", "b", "", "d", "()Z", "", "[I", "elements", "I", "head", "tail", "capacityBitmask", "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: j0.e  reason: case insensitive filesystem */
public final class C5449e {

    /* renamed from: a  reason: collision with root package name */
    private int[] f24606a;

    /* renamed from: b  reason: collision with root package name */
    private int f24607b;

    /* renamed from: c  reason: collision with root package name */
    private int f24608c;

    /* renamed from: d  reason: collision with root package name */
    private int f24609d;

    public C5449e() {
        this(0, 1, (DefaultConstructorMarker) null);
    }

    private final void c() {
        int[] iArr = this.f24606a;
        int length = iArr.length;
        int i10 = this.f24607b;
        int i11 = length - i10;
        int i12 = length << 1;
        if (i12 >= 0) {
            int[] iArr2 = new int[i12];
            C16870n.l(iArr, iArr2, 0, i10, length);
            C16870n.l(this.f24606a, iArr2, i11, 0, this.f24607b);
            this.f24606a = iArr2;
            this.f24607b = 0;
            this.f24608c = length;
            this.f24609d = i12 - 1;
            return;
        }
        throw new RuntimeException("Max array capacity exceeded");
    }

    public final void a(int i10) {
        int[] iArr = this.f24606a;
        int i11 = this.f24608c;
        iArr[i11] = i10;
        int i12 = this.f24609d & (i11 + 1);
        this.f24608c = i12;
        if (i12 == this.f24607b) {
            c();
        }
    }

    public final void b() {
        this.f24608c = this.f24607b;
    }

    public final boolean d() {
        return this.f24607b == this.f24608c;
    }

    public final int e() {
        int i10 = this.f24607b;
        if (i10 != this.f24608c) {
            int i11 = this.f24606a[i10];
            this.f24607b = (i10 + 1) & this.f24609d;
            return i11;
        }
        C5450f fVar = C5450f.f24614a;
        throw new ArrayIndexOutOfBoundsException();
    }

    public C5449e(int i10) {
        boolean z10 = false;
        if (!(i10 >= 1)) {
            d.a("capacity must be >= 1");
        }
        if (!(i10 <= 1073741824 ? true : z10)) {
            d.a("capacity must be <= 2^30");
        }
        i10 = Integer.bitCount(i10) != 1 ? Integer.highestOneBit(i10 - 1) << 1 : i10;
        this.f24609d = i10 - 1;
        this.f24606a = new int[i10];
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5449e(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 8 : i10);
    }
}
