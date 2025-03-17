package bx;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import nI.C17642l;

public final /* synthetic */ class c implements C17642l {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ LocalDateTime f118986a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ DateTimeFormatter f118987b;

    public /* synthetic */ c(LocalDateTime localDateTime, DateTimeFormatter dateTimeFormatter) {
        this.f118986a = localDateTime;
        this.f118987b = dateTimeFormatter;
    }

    public final Object invoke(Object obj) {
        return d.l(this.f118986a, this.f118987b, ((Integer) obj).intValue());
    }
}
