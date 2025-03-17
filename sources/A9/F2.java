package a9;

import D8.c;
import G8.h;
import java.io.File;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.C17542s;

public final class F2 {

    /* renamed from: a  reason: collision with root package name */
    public final h f41991a;

    /* renamed from: b  reason: collision with root package name */
    public final long f41992b = 20971520;

    /* renamed from: c  reason: collision with root package name */
    public final c f41993c = new c("BatchWriterReader");

    /* renamed from: d  reason: collision with root package name */
    public final AtomicInteger f41994d = new AtomicInteger(0);

    /* renamed from: e  reason: collision with root package name */
    public final String f41995e;

    public F2(String str) {
        h hVar = new h();
        C17542s.j(str, "appFilesLocation");
        C17542s.j(hVar, "storageUtil");
        this.f41991a = hVar;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        String str2 = File.separator;
        sb2.append(str2);
        sb2.append("cs");
        sb2.append(str2);
        sb2.append("replay");
        this.f41995e = sb2.toString();
    }
}
