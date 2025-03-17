package jI;

import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0011\u0010\u0006\u001a\u00020\u0003*\u00020\u0000¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ljava/io/File;", "LjI/i;", "direction", "LjI/h;", "n", "(Ljava/io/File;LjI/i;)LjI/h;", "o", "(Ljava/io/File;)LjI/h;", "kotlin-stdlib"}, k = 5, mv = {2, 1, 0}, xi = 49, xs = "kotlin/io/FilesKt")
/* renamed from: jI.m  reason: case insensitive filesystem */
class C17426m extends C17425l {
    public static final C17421h n(File file, C17422i iVar) {
        C17542s.j(file, "<this>");
        C17542s.j(iVar, "direction");
        return new C17421h(file, iVar);
    }

    public static final C17421h o(File file) {
        C17542s.j(file, "<this>");
        return n(file, C17422i.BOTTOM_UP);
    }
}
