package tI;

import YH.U;
import java.util.NoSuchElementException;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\fR\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u000eR\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u0012R\u0016\u0010\u0014\u001a\u00020\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u000e¨\u0006\u0015"}, d2 = {"LtI/i;", "LYH/U;", "", "first", "last", "step", "<init>", "(III)V", "", "hasNext", "()Z", "c", "()I", "a", "I", "getStep", "b", "finalElement", "Z", "d", "next", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: tI.i  reason: case insensitive filesystem */
public final class C17973i extends U {

    /* renamed from: a  reason: collision with root package name */
    private final int f147331a;

    /* renamed from: b  reason: collision with root package name */
    private final int f147332b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f147333c;

    /* renamed from: d  reason: collision with root package name */
    private int f147334d;

    public C17973i(int i10, int i11, int i12) {
        this.f147331a = i12;
        this.f147332b = i11;
        boolean z10 = false;
        if (i12 <= 0 ? i10 >= i11 : i10 <= i11) {
            z10 = true;
        }
        this.f147333c = z10;
        this.f147334d = !z10 ? i11 : i10;
    }

    public int c() {
        int i10 = this.f147334d;
        if (i10 != this.f147332b) {
            this.f147334d = this.f147331a + i10;
        } else if (this.f147333c) {
            this.f147333c = false;
        } else {
            throw new NoSuchElementException();
        }
        return i10;
    }

    public boolean hasNext() {
        return this.f147333c;
    }
}
