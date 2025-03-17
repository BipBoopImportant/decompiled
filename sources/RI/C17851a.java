package rI;

import java.util.Random;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b \u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\u0007J\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u000f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"LrI/a;", "LrI/c;", "<init>", "()V", "", "bitCount", "b", "(I)I", "d", "()I", "until", "e", "", "c", "()F", "Ljava/util/Random;", "g", "()Ljava/util/Random;", "impl", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: rI.a  reason: case insensitive filesystem */
public abstract class C17851a extends C17853c {
    public int b(int i10) {
        return C17854d.f(g().nextInt(), i10);
    }

    public float c() {
        return g().nextFloat();
    }

    public int d() {
        return g().nextInt();
    }

    public int e(int i10) {
        return g().nextInt(i10);
    }

    public abstract Random g();
}
