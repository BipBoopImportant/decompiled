package a9;

import D8.c;
import G8.h;
import G8.t;
import java.io.File;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.C17542s;

public final class Z6 {

    /* renamed from: f  reason: collision with root package name */
    public static final String f42423f = ("srm" + File.separator + "files");

    /* renamed from: a  reason: collision with root package name */
    public final h f42424a;

    /* renamed from: b  reason: collision with root package name */
    public final t f42425b;

    /* renamed from: c  reason: collision with root package name */
    public final c f42426c;

    /* renamed from: d  reason: collision with root package name */
    public final AtomicInteger f42427d = new AtomicInteger(0);

    /* renamed from: e  reason: collision with root package name */
    public final String f42428e;

    public Z6(h hVar, String str) {
        C17542s.j(hVar, "fileStorageUtil");
        C17542s.j(str, "filesLocation");
        t tVar = new t();
        c cVar = new c("SrmFileStorage");
        C17542s.j(hVar, "fileStorageUtil");
        C17542s.j(str, "filesLocation");
        C17542s.j(tVar, "systemInstantiable");
        C17542s.j(cVar, "logger");
        this.f42424a = hVar;
        this.f42425b = tVar;
        this.f42426c = cVar;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        String str2 = File.separator;
        sb2.append(str2);
        sb2.append("cs");
        sb2.append(str2);
        sb2.append(f42423f);
        this.f42428e = sb2.toString();
    }
}
