package rI;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0019\b\u0000\u0018\u0000 \u001b2\u00020\u00012\u00060\u0002j\u0002`\u0003:\u0001\u001cB9\b\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fB\u0019\b\u0010\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\u0006\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0006\u001a\u00020\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0016R\u0016\u0010\u0007\u001a\u00020\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0016R\u0016\u0010\b\u001a\u00020\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0016R\u0016\u0010\t\u001a\u00020\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u0016R\u0016\u0010\n\u001a\u00020\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u0016¨\u0006\u001d"}, d2 = {"LrI/e;", "LrI/c;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "x", "y", "z", "w", "v", "addend", "<init>", "(IIIIII)V", "seed1", "seed2", "(II)V", "d", "()I", "bitCount", "b", "(I)I", "c", "I", "e", "f", "g", "h", "i", "a", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: rI.e  reason: case insensitive filesystem */
public final class C17855e extends C17853c implements Serializable {

    /* renamed from: i  reason: collision with root package name */
    private static final a f146672i = new a((DefaultConstructorMarker) null);

    /* renamed from: c  reason: collision with root package name */
    private int f146673c;

    /* renamed from: d  reason: collision with root package name */
    private int f146674d;

    /* renamed from: e  reason: collision with root package name */
    private int f146675e;

    /* renamed from: f  reason: collision with root package name */
    private int f146676f;

    /* renamed from: g  reason: collision with root package name */
    private int f146677g;

    /* renamed from: h  reason: collision with root package name */
    private int f146678h;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LrI/e$a;", "", "<init>", "()V", "", "serialVersionUID", "J", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: rI.e$a */
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public C17855e(int i10, int i11, int i12, int i13, int i14, int i15) {
        this.f146673c = i10;
        this.f146674d = i11;
        this.f146675e = i12;
        this.f146676f = i13;
        this.f146677g = i14;
        this.f146678h = i15;
        if ((i10 | i11 | i12 | i13 | i14) != 0) {
            for (int i16 = 0; i16 < 64; i16++) {
                d();
            }
            return;
        }
        throw new IllegalArgumentException("Initial state must have at least one non-zero element.");
    }

    public int b(int i10) {
        return C17854d.f(d(), i10);
    }

    public int d() {
        int i10 = this.f146673c;
        int i11 = i10 ^ (i10 >>> 2);
        this.f146673c = this.f146674d;
        this.f146674d = this.f146675e;
        this.f146675e = this.f146676f;
        int i12 = this.f146677g;
        this.f146676f = i12;
        int i13 = ((i11 ^ (i11 << 1)) ^ i12) ^ (i12 << 4);
        this.f146677g = i13;
        int i14 = this.f146678h + 362437;
        this.f146678h = i14;
        return i13 + i14;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C17855e(int r8, int r9) {
        /*
            r7 = this;
            int r5 = ~r8
            int r0 = r8 << 10
            int r1 = r9 >>> 4
            r6 = r0 ^ r1
            r3 = 0
            r4 = 0
            r0 = r7
            r1 = r8
            r2 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: rI.C17855e.<init>(int, int):void");
    }
}
