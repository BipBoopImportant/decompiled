package a9;

import java.io.File;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import nI.C17642l;

public final class Q6 extends C17544u implements C17642l<File, String> {

    /* renamed from: c  reason: collision with root package name */
    public static final Q6 f42231c = new Q6();

    public Q6() {
        super(1);
    }

    public final Object invoke(Object obj) {
        File file = (File) obj;
        C17542s.j(file, "it");
        String name = file.getName();
        C17542s.i(name, "it.name");
        return name;
    }
}
