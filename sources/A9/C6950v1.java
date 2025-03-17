package a9;

import D8.c;
import G8.h;
import android.content.Context;
import java.io.File;
import kotlin.jvm.internal.C17542s;

/* renamed from: a9.v1  reason: case insensitive filesystem */
public final class C6950v1 {

    /* renamed from: a  reason: collision with root package name */
    public final Context f42894a;

    /* renamed from: b  reason: collision with root package name */
    public final h f42895b;

    /* renamed from: c  reason: collision with root package name */
    public final c f42896c = new c("LogStorage");

    /* renamed from: d  reason: collision with root package name */
    public final String f42897d = "logs";

    /* renamed from: e  reason: collision with root package name */
    public final String f42898e;

    public C6950v1(Context context, h hVar) {
        C17542s.j(context, "context");
        C17542s.j(hVar, "fileStorageUtil");
        this.f42894a = context;
        this.f42895b = hVar;
        StringBuilder sb2 = new StringBuilder();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(context.getFilesDir().getAbsolutePath());
        String str = File.separator;
        sb3.append(str);
        sb3.append("cs");
        sb3.append(str);
        sb3.append("logs");
        sb2.append(sb3.toString());
        sb2.append(str);
        sb2.append("logfile");
        this.f42898e = sb2.toString();
    }

    public final void a() {
        try {
            this.f42895b.b(this.f42898e);
        } catch (Throwable th2) {
            c cVar = this.f42896c;
            cVar.h("Failed to delete log file at path: " + this.f42898e + " | error message: " + th2.getMessage());
        }
    }
}
