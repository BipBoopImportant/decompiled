package tI;

import YH.C16876u;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u000fR\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u0014R\u0016\u0010\u0016\u001a\u00020\u00058\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u000f¨\u0006\u0017"}, d2 = {"LtI/b;", "LYH/u;", "", "first", "last", "", "step", "<init>", "(CCI)V", "", "hasNext", "()Z", "c", "()C", "a", "I", "getStep", "()I", "b", "finalElement", "Z", "d", "next", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: tI.b  reason: case insensitive filesystem */
public final class C17966b extends C16876u {

    /* renamed from: a  reason: collision with root package name */
    private final int f147317a;

    /* renamed from: b  reason: collision with root package name */
    private final int f147318b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f147319c;

    /* renamed from: d  reason: collision with root package name */
    private int f147320d;

    public C17966b(char c10, char c11, int i10) {
        this.f147317a = i10;
        this.f147318b = c11;
        boolean z10 = false;
        if (i10 <= 0 ? C17542s.l(c10, c11) >= 0 : C17542s.l(c10, c11) <= 0) {
            z10 = true;
        }
        this.f147319c = z10;
        this.f147320d = !z10 ? c11 : c10;
    }

    public char c() {
        int i10 = this.f147320d;
        if (i10 != this.f147318b) {
            this.f147320d = this.f147317a + i10;
        } else if (this.f147319c) {
            this.f147319c = false;
        } else {
            throw new NoSuchElementException();
        }
        return (char) i10;
    }

    public boolean hasNext() {
        return this.f147319c;
    }
}
