package wE;

import CE.C12696c;
import CE.C12699f;
import android.content.Context;
import com.optimizely.ab.android.event_handler.EventWorker;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import yE.f;

/* renamed from: wE.a  reason: case insensitive filesystem */
public class C15186a implements C12696c {

    /* renamed from: a  reason: collision with root package name */
    private final Context f131749a;

    /* renamed from: b  reason: collision with root package name */
    Logger f131750b = LoggerFactory.getLogger((Class<?>) C15186a.class);

    /* renamed from: c  reason: collision with root package name */
    private long f131751c = -1;

    private C15186a(Context context) {
        this.f131749a = context;
    }

    public static C15186a b(Context context) {
        return new C15186a(context);
    }

    public void a(C12699f fVar) {
        if (fVar.b() == null) {
            this.f131750b.error("Event dispatcher received a null url");
        } else if (fVar.a() == null) {
            this.f131750b.error("Event dispatcher received a null request body");
        } else {
            if (fVar.b().isEmpty()) {
                this.f131750b.error("Event dispatcher received an empty url");
            }
            Class<EventWorker> cls = EventWorker.class;
            f.b(this.f131749a, "EventWorker", cls, EventWorker.h(fVar, Long.valueOf(this.f131751c)), Long.valueOf(this.f131751c));
            if (this.f131751c < 0) {
                this.f131750b.info("Sent url {} to the event handler service", (Object) fVar.b());
            } else {
                this.f131750b.info("Sent url {} to the event handler service (with retry interval of {} seconds)", (Object) fVar.b(), (Object) Long.valueOf(this.f131751c / 1000));
            }
        }
    }

    public void c(long j10) {
        if (j10 <= 0) {
            this.f131751c = -1;
        } else {
            this.f131751c = j10;
        }
    }
}
