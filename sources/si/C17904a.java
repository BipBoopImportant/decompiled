package sI;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import rI.C17851a;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\f\u001a\u00020\t8VX\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"LsI/a;", "LrI/a;", "<init>", "()V", "", "from", "until", "f", "(II)I", "Ljava/util/Random;", "g", "()Ljava/util/Random;", "impl", "kotlin-stdlib-jdk8"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: sI.a  reason: case insensitive filesystem */
public final class C17904a extends C17851a {
    public int f(int i10, int i11) {
        return ThreadLocalRandom.current().nextInt(i10, i11);
    }

    public Random g() {
        ThreadLocalRandom current = ThreadLocalRandom.current();
        C17542s.i(current, "current(...)");
        return current;
    }
}
