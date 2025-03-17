package Wd;

import HJ.C15854t;
import XH.C16807N;
import android.content.DialogInterface;
import androidx.fragment.app.FragmentManager;
import com.google.android.material.datepicker.MaterialDatePicker;
import com.google.android.material.datepicker.a;
import com.google.android.material.datepicker.k;
import com.sugarcube.core.logger.DslKt;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.d;
import qv.e;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J;\u0010\r\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0014\u0010\f\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LWd/L;", "", "<init>", "()V", "Landroidx/fragment/app/FragmentManager;", "fragmentManager", "Ljava/util/Date;", "initialDate", "", "minAge", "Lkotlin/Function1;", "LXH/N;", "callback", "d", "(Landroidx/fragment/app/FragmentManager;Ljava/util/Date;ILnI/l;)V", "account-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class L {

    /* renamed from: a  reason: collision with root package name */
    public static final L f64653a = new L();

    private L() {
    }

    /* access modifiers changed from: private */
    public static final C16807N e(C17642l lVar, TimeZone timeZone, Long l10) {
        long longValue = l10.longValue();
        C17542s.g(l10);
        lVar.invoke(new Date(longValue - ((long) timeZone.getOffset(l10.longValue()))));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final void f(C17642l lVar, Object obj) {
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    public static final void g(C17642l lVar, DialogInterface dialogInterface) {
        lVar.invoke(null);
    }

    public final void d(FragmentManager fragmentManager, Date date, int i10, C17642l<? super Date, C16807N> lVar) {
        FragmentManager fragmentManager2 = fragmentManager;
        int i11 = i10;
        C17642l<? super Date, C16807N> lVar2 = lVar;
        C17542s.j(fragmentManager2, "fragmentManager");
        C17542s.j(date, "initialDate");
        C17542s.j(lVar2, "callback");
        ZoneId systemDefault = ZoneId.systemDefault();
        ZonedDateTime atZone = LocalDateTime.of(1900, Month.JANUARY, 1, 0, 0).atZone(systemDefault);
        ZonedDateTime atZone2 = LocalDateTime.now().minusYears((long) i11).atZone(systemDefault);
        ZonedDateTime atZone3 = Instant.ofEpochMilli(date.getTime()).atZone(systemDefault);
        try {
            a a10 = new a.b().d(atZone.toInstant().toEpochMilli()).c((atZone3.isAfter(atZone2) ? atZone2 : atZone3.isBefore(atZone) ? atZone : atZone3).toInstant().toEpochMilli()).b(atZone2.toInstant().toEpochMilli()).e(k.a(atZone2.toInstant().toEpochMilli())).a();
            C17542s.g(a10);
            TimeZone timeZone = TimeZone.getDefault();
            MaterialDatePicker.e<Long> e10 = MaterialDatePicker.e.c().f(Long.valueOf(date.getTime() + ((long) timeZone.getOffset(date.getTime())))).e(a10);
            C17542s.i(e10, "setCalendarConstraints(...)");
            MaterialDatePicker<Long> a11 = e10.a();
            a11.w(new J(new I(lVar2, timeZone)));
            a11.v(new K(lVar2));
            a11.show(fragmentManager2, (String) null);
        } catch (IllegalArgumentException e11) {
            String str = "Unable to create calendar constraints, openAt: " + date.getTime() + " (" + atZone3 + "), start:" + atZone + ", end: " + atZone2 + ", minAge:" + i11;
            e eVar = e.ERROR;
            ArrayList<C11819b> arrayList = new ArrayList<>();
            for (Object next : d.f102012a.a()) {
                if (((C11819b) next).b(eVar, false)) {
                    arrayList.add(next);
                }
            }
            String str2 = null;
            String str3 = null;
            for (C11819b bVar : arrayList) {
                if (str2 == null) {
                    String a12 = C11818a.a(str, e11);
                    if (a12 == null) {
                        break;
                    }
                    str2 = C11820c.a(a12);
                }
                if (str3 == null) {
                    String name = L.class.getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str3 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                }
                bVar.a(eVar, str3, false, e11, str2);
            }
            throw e11;
        }
    }
}
