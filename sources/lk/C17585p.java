package lK;

import XH.C16797D;
import XH.C16799F;
import XH.C16801H;
import XH.C16804K;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"LlK/p;", "LlK/n;", "LlK/v;", "writer", "", "forceQuoting", "<init>", "(LlK/v;Z)V", "", "v", "LXH/N;", "i", "(I)V", "", "j", "(J)V", "", "e", "(B)V", "", "l", "(S)V", "c", "Z", "kotlinx-serialization-json"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: lK.p  reason: case insensitive filesystem */
public final class C17585p extends C17583n {

    /* renamed from: c  reason: collision with root package name */
    private final boolean f144537c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C17585p(C17590v vVar, boolean z10) {
        super(vVar);
        C17542s.j(vVar, "writer");
        this.f144537c = z10;
    }

    public void e(byte b10) {
        boolean z10 = this.f144537c;
        String n10 = C16797D.n(C16797D.b(b10));
        if (z10) {
            n(n10);
        } else {
            k(n10);
        }
    }

    public void i(int i10) {
        boolean z10 = this.f144537c;
        String unsignedString = Integer.toUnsignedString(C16799F.b(i10));
        if (z10) {
            n(unsignedString);
        } else {
            k(unsignedString);
        }
    }

    public void j(long j10) {
        boolean z10 = this.f144537c;
        String unsignedString = Long.toUnsignedString(C16801H.b(j10));
        if (z10) {
            n(unsignedString);
        } else {
            k(unsignedString);
        }
    }

    public void l(short s10) {
        boolean z10 = this.f144537c;
        String n10 = C16804K.n(C16804K.b(s10));
        if (z10) {
            n(n10);
        } else {
            k(n10);
        }
    }
}
