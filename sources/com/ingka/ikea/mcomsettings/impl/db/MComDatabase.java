package com.ingka.ikea.mcomsettings.impl.db;

import android.content.Context;
import androidx.room.w;
import androidx.room.x;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import vv.C12268a;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b!\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/mcomsettings/impl/db/MComDatabase;", "Landroidx/room/x;", "<init>", "()V", "Lvv/a;", "c", "()Lvv/a;", "a", "mcomsettings-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class MComDatabase extends x {

    /* renamed from: a  reason: collision with root package name */
    public static final a f96647a = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public static volatile MComDatabase f96648b;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0018\u0010\t\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002XT¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/ingka/ikea/mcomsettings/impl/db/MComDatabase$a;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Lcom/ingka/ikea/mcomsettings/impl/db/MComDatabase;", "a", "(Landroid/content/Context;)Lcom/ingka/ikea/mcomsettings/impl/db/MComDatabase;", "INSTANCE", "Lcom/ingka/ikea/mcomsettings/impl/db/MComDatabase;", "", "MCOMMERCE_DATABASE", "Ljava/lang/String;", "mcomsettings-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final MComDatabase a(Context context) {
            C17542s.j(context, "context");
            MComDatabase a10 = MComDatabase.f96648b;
            if (a10 == null) {
                synchronized (this) {
                    Context applicationContext = context.getApplicationContext();
                    C17542s.i(applicationContext, "getApplicationContext(...)");
                    MComDatabase e10 = w.a(applicationContext, MComDatabase.class, "mcommerce-database").f().e();
                    MComDatabase.f96648b = e10;
                    a10 = e10;
                }
            }
            return a10;
        }

        private a() {
        }
    }

    public abstract C12268a c();
}
