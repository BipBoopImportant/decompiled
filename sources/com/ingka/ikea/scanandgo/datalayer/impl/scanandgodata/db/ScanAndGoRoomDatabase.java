package com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.db;

import XH.C16807N;
import android.content.ContentValues;
import android.database.Cursor;
import androidx.room.x;
import fz.C14488a;
import fz.C14490c;
import fz.C14492e;
import fz.C14494g;
import fz.C14496i;
import jI.C17416c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b!\u0018\u00002\u00020\u0001:\u0007\u000b\u0005\u0013\u000e\u0014\b\u0011B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH&¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H&¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/db/ScanAndGoRoomDatabase;", "Landroidx/room/x;", "<init>", "()V", "Lfz/g;", "d", "()Lfz/g;", "Lfz/a;", "a", "()Lfz/a;", "Lfz/c;", "c", "()Lfz/c;", "Lfz/i;", "e", "()Lfz/i;", "Lfz/e;", "b", "()Lfz/e;", "g", "f", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class ScanAndGoRoomDatabase extends x {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/db/ScanAndGoRoomDatabase$a;", "LN4/a;", "<init>", "()V", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements N4.a {
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/db/ScanAndGoRoomDatabase$b;", "LN4/a;", "<init>", "()V", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b implements N4.a {
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/db/ScanAndGoRoomDatabase$c;", "LN4/a;", "<init>", "()V", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c implements N4.a {
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/db/ScanAndGoRoomDatabase$d;", "LN4/a;", "<init>", "()V", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class d implements N4.a {
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/db/ScanAndGoRoomDatabase$e;", "LN4/a;", "<init>", "()V", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class e implements N4.a {
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/db/ScanAndGoRoomDatabase$f;", "LN4/a;", "<init>", "()V", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class f implements N4.a {
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/db/ScanAndGoRoomDatabase$g;", "LN4/a;", "<init>", "()V", "LQ4/g;", "db", "LXH/N;", "a", "(LQ4/g;)V", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class g implements N4.a {
        public void a(Q4.g gVar) {
            C17542s.j(gVar, "db");
            Cursor u22 = gVar.u2("SELECT * FROM scan_and_go_cart_discounts WHERE coupon IS NOT NULL");
            try {
                if (u22.getCount() > 0) {
                    u22.moveToFirst();
                    do {
                        String string = u22.getString(u22.getColumnIndexOrThrow("coupon"));
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("coupon", string);
                        contentValues.put("validated", 0);
                        gVar.x2("scan_and_go_coupon", 5, contentValues);
                        u22.moveToNext();
                    } while (!u22.isAfterLast());
                }
                gVar.T("DELETE FROM scan_and_go_cart_discounts WHERE coupon IS NOT NULL");
                C16807N n10 = C16807N.f139792a;
                C17416c.a(u22, (Throwable) null);
                super.a(gVar);
            } catch (Throwable th2) {
                C17416c.a(u22, th);
                throw th2;
            }
        }
    }

    public abstract C14488a a();

    public abstract C14492e b();

    public abstract C14490c c();

    public abstract C14494g d();

    public abstract C14496i e();
}
