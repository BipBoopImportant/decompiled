package ej;

import androidx.work.C7032a;
import androidx.work.C7036e;
import androidx.work.C7037f;
import androidx.work.C7042k;
import androidx.work.H;
import com.ingka.ikea.app.scanandgoonlineredesign.cleanup.ScanAndGoCleanupWorker;
import com.ingka.ikea.app.scanandgoonlineredesign.cleanup.ScanAndGoClearCartWorker;
import eE.C14397a;
import eE.C14400d;
import ej.C11246d;
import java.util.Calendar;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.P;
import uI.C18055d;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lej/c;", "Lej/b;", "LeE/d;", "workScheduler", "<init>", "(LeE/d;)V", "", "storeId", "LXH/N;", "b", "(Ljava/lang/String;)V", "a", "LeE/d;", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: ej.c  reason: case insensitive filesystem */
public final class C11245c implements C11244b {

    /* renamed from: a  reason: collision with root package name */
    private final C14400d f97122a;

    public C11245c(C14400d dVar) {
        C17542s.j(dVar, "workScheduler");
        this.f97122a = dVar;
    }

    public void a(String str) {
        String str2 = str;
        C17542s.j(str2, "storeId");
        C14400d.a.a(this.f97122a, P.b(ScanAndGoClearCartWorker.class), new C14397a("ScanAndGoClearCartTask", (C7032a) null, 0, (C7036e) null, 0, C11243a.a(new C7037f.a(), str2).a(), (H) null, 94, (DefaultConstructorMarker) null), (C7042k) null, 4, (Object) null);
    }

    public void b(String str) {
        String str2 = str;
        C17542s.j(str2, "storeId");
        Date date = new Date(System.currentTimeMillis());
        Calendar instance = Calendar.getInstance();
        instance.setTime(date);
        instance.setLenient(true);
        instance.add(5, 1);
        instance.set(11, 0);
        instance.set(12, 1);
        instance.set(13, 0);
        Date time = instance.getTime();
        C14400d dVar = this.f97122a;
        C18055d b10 = P.b(ScanAndGoCleanupWorker.class);
        C11246d.a aVar = C11246d.f97123c;
        C17542s.g(time);
        C14400d.a.a(dVar, b10, new C14397a("ScanAndGoCleanUpTask", (C7032a) null, 0, (C7036e) null, aVar.a(date, time).a(), C11243a.a(new C7037f.a(), str2).a(), (H) null, 78, (DefaultConstructorMarker) null), (C7042k) null, 4, (Object) null);
    }
}
