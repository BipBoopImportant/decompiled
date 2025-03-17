package com.google.android.gms.measurement.internal;

import K9.C6620s;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.internal.measurement.A2;
import com.google.android.gms.internal.measurement.C2;
import com.google.android.gms.internal.measurement.C7297f7;
import com.google.android.gms.internal.measurement.C7427v2;
import com.google.android.gms.internal.measurement.C7443x2;
import com.google.android.gms.internal.measurement.C7459z2;
import com.google.android.gms.internal.measurement.F2;
import com.google.android.gms.internal.measurement.L4;
import com.google.android.gms.internal.measurement.N6;
import com.google.android.gms.internal.measurement.T1;
import com.google.android.gms.internal.measurement.U1;
import com.google.android.gms.internal.measurement.V1;
import com.google.android.gms.internal.measurement.X1;
import com.google.android.gms.measurement.internal.C7671q3;
import j0.C5445a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.slf4j.Marker;
import sa.G;
import sa.H;
import sa.J;
import sa.X;

/* renamed from: com.google.android.gms.measurement.internal.p  reason: case insensitive filesystem */
final class C7660p extends C7721x5 {
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public static final String[] f50262f = {"last_bundled_timestamp", "ALTER TABLE events ADD COLUMN last_bundled_timestamp INTEGER;", "last_bundled_day", "ALTER TABLE events ADD COLUMN last_bundled_day INTEGER;", "last_sampled_complex_event_id", "ALTER TABLE events ADD COLUMN last_sampled_complex_event_id INTEGER;", "last_sampling_rate", "ALTER TABLE events ADD COLUMN last_sampling_rate INTEGER;", "last_exempt_from_sampling", "ALTER TABLE events ADD COLUMN last_exempt_from_sampling INTEGER;", "current_session_count", "ALTER TABLE events ADD COLUMN current_session_count INTEGER;"};

    /* renamed from: g  reason: collision with root package name */
    static final String[] f50263g = {"associated_row_id", "ALTER TABLE upload_queue ADD COLUMN associated_row_id INTEGER;"};
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public static final String[] f50264h = {"origin", "ALTER TABLE user_attributes ADD COLUMN origin TEXT;"};
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public static final String[] f50265i = {"app_version", "ALTER TABLE apps ADD COLUMN app_version TEXT;", "app_store", "ALTER TABLE apps ADD COLUMN app_store TEXT;", "gmp_version", "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;", "dev_cert_hash", "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;", "measurement_enabled", "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;", "last_bundle_start_timestamp", "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;", "day", "ALTER TABLE apps ADD COLUMN day INTEGER;", "daily_public_events_count", "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;", "daily_events_count", "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;", "daily_conversions_count", "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;", "remote_config", "ALTER TABLE apps ADD COLUMN remote_config BLOB;", "config_fetched_time", "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;", "failed_config_fetch_time", "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;", "app_version_int", "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;", "firebase_instance_id", "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;", "daily_error_events_count", "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;", "daily_realtime_events_count", "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;", "health_monitor_sample", "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;", "android_id", "ALTER TABLE apps ADD COLUMN android_id INTEGER;", "adid_reporting_enabled", "ALTER TABLE apps ADD COLUMN adid_reporting_enabled INTEGER;", "ssaid_reporting_enabled", "ALTER TABLE apps ADD COLUMN ssaid_reporting_enabled INTEGER;", "admob_app_id", "ALTER TABLE apps ADD COLUMN admob_app_id TEXT;", "linked_admob_app_id", "ALTER TABLE apps ADD COLUMN linked_admob_app_id TEXT;", "dynamite_version", "ALTER TABLE apps ADD COLUMN dynamite_version INTEGER;", "safelisted_events", "ALTER TABLE apps ADD COLUMN safelisted_events TEXT;", "ga_app_id", "ALTER TABLE apps ADD COLUMN ga_app_id TEXT;", "config_last_modified_time", "ALTER TABLE apps ADD COLUMN config_last_modified_time TEXT;", "e_tag", "ALTER TABLE apps ADD COLUMN e_tag TEXT;", "session_stitching_token", "ALTER TABLE apps ADD COLUMN session_stitching_token TEXT;", "sgtm_upload_enabled", "ALTER TABLE apps ADD COLUMN sgtm_upload_enabled INTEGER;", "target_os_version", "ALTER TABLE apps ADD COLUMN target_os_version INTEGER;", "session_stitching_token_hash", "ALTER TABLE apps ADD COLUMN session_stitching_token_hash INTEGER;", "ad_services_version", "ALTER TABLE apps ADD COLUMN ad_services_version INTEGER;", "unmatched_first_open_without_ad_id", "ALTER TABLE apps ADD COLUMN unmatched_first_open_without_ad_id INTEGER;", "npa_metadata_value", "ALTER TABLE apps ADD COLUMN npa_metadata_value INTEGER;", "attribution_eligibility_status", "ALTER TABLE apps ADD COLUMN attribution_eligibility_status INTEGER;", "sgtm_preview_key", "ALTER TABLE apps ADD COLUMN sgtm_preview_key TEXT;", "dma_consent_state", "ALTER TABLE apps ADD COLUMN dma_consent_state INTEGER;", "daily_realtime_dcu_count", "ALTER TABLE apps ADD COLUMN daily_realtime_dcu_count INTEGER;", "bundle_delivery_index", "ALTER TABLE apps ADD COLUMN bundle_delivery_index INTEGER;", "serialized_npa_metadata", "ALTER TABLE apps ADD COLUMN serialized_npa_metadata TEXT;", "unmatched_pfo", "ALTER TABLE apps ADD COLUMN unmatched_pfo INTEGER;", "unmatched_uwa", "ALTER TABLE apps ADD COLUMN unmatched_uwa INTEGER;", "ad_campaign_info", "ALTER TABLE apps ADD COLUMN ad_campaign_info BLOB;", "daily_registered_triggers_count", "ALTER TABLE apps ADD COLUMN daily_registered_triggers_count INTEGER;", "client_upload_eligibility", "ALTER TABLE apps ADD COLUMN client_upload_eligibility INTEGER;"};
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public static final String[] f50266j = {"realtime", "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;"};
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public static final String[] f50267k = {"has_realtime", "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;", "retry_count", "ALTER TABLE queue ADD COLUMN retry_count INTEGER;"};
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public static final String[] f50268l = {"session_scoped", "ALTER TABLE event_filters ADD COLUMN session_scoped BOOLEAN;"};
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public static final String[] f50269m = {"session_scoped", "ALTER TABLE property_filters ADD COLUMN session_scoped BOOLEAN;"};
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public static final String[] f50270n = {"previous_install_count", "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;"};
    /* access modifiers changed from: private */

    /* renamed from: o  reason: collision with root package name */
    public static final String[] f50271o = {"consent_source", "ALTER TABLE consent_settings ADD COLUMN consent_source INTEGER;", "dma_consent_settings", "ALTER TABLE consent_settings ADD COLUMN dma_consent_settings TEXT;", "storage_consent_at_bundling", "ALTER TABLE consent_settings ADD COLUMN storage_consent_at_bundling TEXT;"};
    /* access modifiers changed from: private */

    /* renamed from: p  reason: collision with root package name */
    public static final String[] f50272p = {"idempotent", "CREATE INDEX IF NOT EXISTS trigger_uris_index ON trigger_uris (app_id);"};

    /* renamed from: d  reason: collision with root package name */
    private final C7715x f50273d = new C7715x(this, zza(), "google_app_measurement.db");
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final C7652n5 f50274e = new C7652n5(zzb());

    C7660p(C7728y5 y5Var) {
        super(y5Var);
    }

    private final String D0() {
        long a10 = zzb().a();
        Locale locale = Locale.US;
        X x10 = X.GOOGLE_SIGNAL;
        Integer valueOf = Integer.valueOf(x10.zza());
        Long valueOf2 = Long.valueOf(a10);
        Long a11 = K.f49718O.a(null);
        a11.longValue();
        String format = String.format(locale, "(upload_type = %d AND ABS(creation_timestamp - %d) > %d)", new Object[]{valueOf, valueOf2, a11});
        String format2 = String.format(locale, "(upload_type != %d AND ABS(creation_timestamp - %d) > %d)", new Object[]{Integer.valueOf(x10.zza()), Long.valueOf(a10), Long.valueOf(C7611i.P())});
        return "(" + format + " OR " + format2 + ")";
    }

    /* access modifiers changed from: private */
    public final long G(String str, String[] strArr, long j10) {
        Cursor cursor = null;
        try {
            Cursor rawQuery = z().rawQuery(str, strArr);
            if (rawQuery.moveToFirst()) {
                long j11 = rawQuery.getLong(0);
                rawQuery.close();
                return j11;
            }
            rawQuery.close();
            return j10;
        } catch (SQLiteException e10) {
            f().E().c("Database error", str, e10);
            throw e10;
        } catch (Throwable th2) {
            if (cursor != null) {
                cursor.close();
            }
            throw th2;
        }
    }

    private final long G0(String str, String[] strArr) {
        Cursor cursor = null;
        try {
            cursor = z().rawQuery(str, strArr);
            if (cursor.moveToFirst()) {
                long j10 = cursor.getLong(0);
                cursor.close();
                return j10;
            }
            throw new SQLiteException("Database returned empty set");
        } catch (SQLiteException e10) {
            f().E().c("Database error", str, e10);
            throw e10;
        } catch (Throwable th2) {
            if (cursor != null) {
                cursor.close();
            }
            throw th2;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x003d, code lost:
        r0 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0040, code lost:
        r14 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0041, code lost:
        r0 = r13;
        r13 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x003c, code lost:
        r12 = th;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x003c A[ExcHandler: all (th java.lang.Throwable), Splitter:B:3:0x0021] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.android.gms.internal.measurement.A2 H0(java.lang.String r12, long r13) {
        /*
            r11 = this;
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r11.z()     // Catch:{ SQLiteException -> 0x0099 }
            java.lang.String r2 = "raw_events_metadata"
            java.lang.String r3 = "metadata"
            java.lang.String[] r3 = new java.lang.String[]{r3}     // Catch:{ SQLiteException -> 0x0099 }
            java.lang.String r4 = "app_id = ? and metadata_fingerprint = ?"
            java.lang.String r13 = java.lang.Long.toString(r13)     // Catch:{ SQLiteException -> 0x0099 }
            java.lang.String[] r5 = new java.lang.String[]{r12, r13}     // Catch:{ SQLiteException -> 0x0099 }
            java.lang.String r8 = "rowid"
            java.lang.String r9 = "2"
            r6 = 0
            r7 = 0
            android.database.Cursor r13 = r1.query(r2, r3, r4, r5, r6, r7, r8, r9)     // Catch:{ SQLiteException -> 0x0099 }
            boolean r14 = r13.moveToFirst()     // Catch:{ SQLiteException -> 0x0040, all -> 0x003c }
            if (r14 != 0) goto L_0x0045
            com.google.android.gms.measurement.internal.h2 r14 = r11.f()     // Catch:{ SQLiteException -> 0x0040, all -> 0x003c }
            com.google.android.gms.measurement.internal.i2 r14 = r14.E()     // Catch:{ SQLiteException -> 0x0040, all -> 0x003c }
            java.lang.String r1 = "Raw event metadata record is missing. appId"
            java.lang.Object r2 = com.google.android.gms.measurement.internal.C7607h2.t(r12)     // Catch:{ SQLiteException -> 0x0040, all -> 0x003c }
            r14.b(r1, r2)     // Catch:{ SQLiteException -> 0x0040, all -> 0x003c }
            r13.close()
            return r0
        L_0x003c:
            r12 = move-exception
            r0 = r13
            goto L_0x00b3
        L_0x0040:
            r14 = move-exception
            r10 = r0
            r0 = r13
            r13 = r10
            goto L_0x009b
        L_0x0045:
            r14 = 0
            byte[] r14 = r13.getBlob(r14)     // Catch:{ SQLiteException -> 0x0040, all -> 0x003c }
            com.google.android.gms.internal.measurement.A2$a r1 = com.google.android.gms.internal.measurement.A2.H2()     // Catch:{ IOException -> 0x0081 }
            com.google.android.gms.internal.measurement.v5 r14 = com.google.android.gms.measurement.internal.N5.E(r1, r14)     // Catch:{ IOException -> 0x0081 }
            com.google.android.gms.internal.measurement.A2$a r14 = (com.google.android.gms.internal.measurement.A2.a) r14     // Catch:{ IOException -> 0x0081 }
            com.google.android.gms.internal.measurement.s5 r14 = r14.s()     // Catch:{ IOException -> 0x0081 }
            com.google.android.gms.internal.measurement.L4 r14 = (com.google.android.gms.internal.measurement.L4) r14     // Catch:{ IOException -> 0x0081 }
            com.google.android.gms.internal.measurement.A2 r14 = (com.google.android.gms.internal.measurement.A2) r14     // Catch:{ IOException -> 0x0081 }
            boolean r0 = r13.moveToNext()     // Catch:{ SQLiteException -> 0x0074, all -> 0x003c }
            if (r0 == 0) goto L_0x007a
            com.google.android.gms.measurement.internal.h2 r0 = r11.f()     // Catch:{ SQLiteException -> 0x0074, all -> 0x003c }
            com.google.android.gms.measurement.internal.i2 r0 = r0.J()     // Catch:{ SQLiteException -> 0x0074, all -> 0x003c }
            java.lang.String r1 = "Get multiple raw event metadata records, expected one. appId"
            java.lang.Object r2 = com.google.android.gms.measurement.internal.C7607h2.t(r12)     // Catch:{ SQLiteException -> 0x0074, all -> 0x003c }
            r0.b(r1, r2)     // Catch:{ SQLiteException -> 0x0074, all -> 0x003c }
            goto L_0x007a
        L_0x0074:
            r0 = move-exception
            r10 = r0
            r0 = r13
            r13 = r14
            r14 = r10
            goto L_0x009b
        L_0x007a:
            r13.close()     // Catch:{ SQLiteException -> 0x0074, all -> 0x003c }
            r13.close()
            goto L_0x00b2
        L_0x0081:
            r14 = move-exception
            com.google.android.gms.measurement.internal.h2 r1 = r11.f()     // Catch:{ SQLiteException -> 0x0040, all -> 0x003c }
            com.google.android.gms.measurement.internal.i2 r1 = r1.E()     // Catch:{ SQLiteException -> 0x0040, all -> 0x003c }
            java.lang.String r2 = "Data loss. Failed to merge raw event metadata. appId"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.C7607h2.t(r12)     // Catch:{ SQLiteException -> 0x0040, all -> 0x003c }
            r1.c(r2, r3, r14)     // Catch:{ SQLiteException -> 0x0040, all -> 0x003c }
            r13.close()
            return r0
        L_0x0097:
            r12 = move-exception
            goto L_0x00b3
        L_0x0099:
            r14 = move-exception
            r13 = r0
        L_0x009b:
            com.google.android.gms.measurement.internal.h2 r1 = r11.f()     // Catch:{ all -> 0x0097 }
            com.google.android.gms.measurement.internal.i2 r1 = r1.E()     // Catch:{ all -> 0x0097 }
            java.lang.String r2 = "Data loss. Error selecting raw event. appId"
            java.lang.Object r12 = com.google.android.gms.measurement.internal.C7607h2.t(r12)     // Catch:{ all -> 0x0097 }
            r1.c(r2, r12, r14)     // Catch:{ all -> 0x0097 }
            if (r0 == 0) goto L_0x00b1
            r0.close()
        L_0x00b1:
            r14 = r13
        L_0x00b2:
            return r14
        L_0x00b3:
            if (r0 == 0) goto L_0x00b8
            r0.close()
        L_0x00b8:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C7660p.H0(java.lang.String, long):com.google.android.gms.internal.measurement.A2");
    }

    private static String J0(List<Integer> list) {
        return list.isEmpty() ? "" : String.format(" AND (upload_type IN (%s))", new Object[]{TextUtils.join(", ", list)});
    }

    private final M5 N(String str, long j10, byte[] bArr, String str2, String str3, int i10, int i11, long j11, long j12) {
        X x10;
        String str4 = str3;
        int i12 = i11;
        if (TextUtils.isEmpty(str2)) {
            f().D().a("Upload uri is null or empty. Destination is unknown. Dropping batch. ");
            return null;
        }
        try {
            C7459z2.b bVar = (C7459z2.b) N5.E(C7459z2.P(), bArr);
            X[] values = X.values();
            int length = values.length;
            int i13 = 0;
            while (true) {
                if (i13 >= length) {
                    x10 = X.UNKNOWN;
                    break;
                }
                x10 = values[i13];
                if (x10.zza() == i10) {
                    break;
                }
                i13++;
            }
            if (!(x10 == X.GOOGLE_SIGNAL || x10 == X.GOOGLE_SIGNAL_PENDING || i12 <= 0)) {
                ArrayList arrayList = new ArrayList();
                for (A2 A10 : bVar.L()) {
                    A2.a aVar = (A2.a) A10.A();
                    aVar.L0(i12);
                    arrayList.add((A2) ((L4) aVar.s()));
                }
                bVar.H();
                bVar.D(arrayList);
            }
            HashMap hashMap = new HashMap();
            if (str4 != null) {
                String[] split = str4.split("\r\n");
                int length2 = split.length;
                int i14 = 0;
                while (true) {
                    if (i14 >= length2) {
                        break;
                    }
                    String str5 = split[i14];
                    if (str5.isEmpty()) {
                        break;
                    }
                    String[] split2 = str5.split("=", 2);
                    if (split2.length != 2) {
                        f().E().b("Invalid upload header: ", str5);
                        break;
                    }
                    hashMap.put(split2[0], split2[1]);
                    i14++;
                }
            }
            long j13 = j10;
            return new L5().h(j10).b((C7459z2) ((L4) bVar.s())).c(str2).d(hashMap).e(x10).g(j11).a(j12).f();
        } catch (IOException e10) {
            String str6 = str;
            f().E().c("Failed to queued MeasurementBatch from upload_queue. appId", str, e10);
            return null;
        }
    }

    private final boolean N0(String str, List<Integer> list) {
        C6620s.f(str);
        s();
        k();
        SQLiteDatabase z10 = z();
        try {
            long G02 = G0("select count(1) from audience_filter_values where app_id=?", new String[]{str});
            int max = Math.max(0, Math.min(2000, a().w(str, K.f49722Q)));
            if (G02 <= ((long) max)) {
                return false;
            }
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < list.size(); i10++) {
                Integer num = list.get(i10);
                if (num == null) {
                    return false;
                }
                arrayList.add(Integer.toString(num.intValue()));
            }
            StringBuilder sb2 = new StringBuilder("audience_id in (select audience_id from audience_filter_values where app_id=? and audience_id not in ");
            sb2.append("(" + TextUtils.join(",", arrayList) + ")");
            sb2.append(" order by rowid desc limit -1 offset ?)");
            return z10.delete("audience_filter_values", sb2.toString(), new String[]{str, Integer.toString(max)}) > 0;
        } catch (SQLiteException e10) {
            f().E().c("Database error querying filters. appId", C7607h2.t(str), e10);
            return false;
        }
    }

    private final Object O(Cursor cursor, int i10) {
        int type = cursor.getType(i10);
        if (type == 0) {
            f().E().a("Loaded invalid null value from database");
            return null;
        } else if (type == 1) {
            return Long.valueOf(cursor.getLong(i10));
        } else {
            if (type == 2) {
                return Double.valueOf(cursor.getDouble(i10));
            }
            if (type == 3) {
                return cursor.getString(i10);
            }
            if (type != 4) {
                f().E().b("Loaded invalid unknown value type, ignoring it", Integer.valueOf(type));
                return null;
            }
            f().E().a("Loaded invalid blob type value, ignoring it");
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0046  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final <T> T P(java.lang.String r3, java.lang.String[] r4, com.google.android.gms.measurement.internal.C7694u<T> r5) {
        /*
            r2 = this;
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r2.z()     // Catch:{ SQLiteException -> 0x002f, all -> 0x002d }
            android.database.Cursor r3 = r1.rawQuery(r3, r4)     // Catch:{ SQLiteException -> 0x002f, all -> 0x002d }
            boolean r4 = r3.moveToFirst()     // Catch:{ SQLiteException -> 0x0023 }
            if (r4 != 0) goto L_0x0025
            com.google.android.gms.measurement.internal.h2 r4 = r2.f()     // Catch:{ SQLiteException -> 0x0023 }
            com.google.android.gms.measurement.internal.i2 r4 = r4.I()     // Catch:{ SQLiteException -> 0x0023 }
            java.lang.String r5 = "No data found"
            r4.a(r5)     // Catch:{ SQLiteException -> 0x0023 }
            r3.close()
            return r0
        L_0x0020:
            r4 = move-exception
            r0 = r3
            goto L_0x0044
        L_0x0023:
            r4 = move-exception
            goto L_0x0031
        L_0x0025:
            java.lang.Object r4 = r5.a(r3)     // Catch:{ SQLiteException -> 0x0023 }
            r3.close()
            return r4
        L_0x002d:
            r4 = move-exception
            goto L_0x0044
        L_0x002f:
            r4 = move-exception
            r3 = r0
        L_0x0031:
            com.google.android.gms.measurement.internal.h2 r5 = r2.f()     // Catch:{ all -> 0x0020 }
            com.google.android.gms.measurement.internal.i2 r5 = r5.E()     // Catch:{ all -> 0x0020 }
            java.lang.String r1 = "Error querying database."
            r5.b(r1, r4)     // Catch:{ all -> 0x0020 }
            if (r3 == 0) goto L_0x0043
            r3.close()
        L_0x0043:
            return r0
        L_0x0044:
            if (r0 == 0) goto L_0x0049
            r0.close()
        L_0x0049:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C7660p.P(java.lang.String, java.lang.String[], com.google.android.gms.measurement.internal.u):java.lang.Object");
    }

    private final String Q(String str, String[] strArr, String str2) {
        Cursor cursor = null;
        try {
            Cursor rawQuery = z().rawQuery(str, strArr);
            if (rawQuery.moveToFirst()) {
                String string = rawQuery.getString(0);
                rawQuery.close();
                return string;
            }
            rawQuery.close();
            return str2;
        } catch (SQLiteException e10) {
            f().E().c("Database error", str, e10);
            throw e10;
        } catch (Throwable th2) {
            if (cursor != null) {
                cursor.close();
            }
            throw th2;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:51:0x0126  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x012c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.android.gms.measurement.internal.G Q0(java.lang.String r29, java.lang.String r30, java.lang.String r31) {
        /*
            r28 = this;
            K9.C6620s.f(r30)
            K9.C6620s.f(r31)
            r28.k()
            r28.s()
            java.util.ArrayList r0 = new java.util.ArrayList
            java.lang.String r8 = "last_exempt_from_sampling"
            java.lang.String r9 = "current_session_count"
            java.lang.String r1 = "lifetime_count"
            java.lang.String r2 = "current_bundle_count"
            java.lang.String r3 = "last_fire_timestamp"
            java.lang.String r4 = "last_bundled_timestamp"
            java.lang.String r5 = "last_bundled_day"
            java.lang.String r6 = "last_sampled_complex_event_id"
            java.lang.String r7 = "last_sampling_rate"
            java.lang.String[] r1 = new java.lang.String[]{r1, r2, r3, r4, r5, r6, r7, r8, r9}
            java.util.List r1 = java.util.Arrays.asList(r1)
            r0.<init>(r1)
            r1 = 0
            android.database.sqlite.SQLiteDatabase r2 = r28.z()     // Catch:{ SQLiteException -> 0x0107, all -> 0x0105 }
            r10 = 0
            java.lang.String[] r3 = new java.lang.String[r10]     // Catch:{ SQLiteException -> 0x0107, all -> 0x0105 }
            java.lang.Object[] r0 = r0.toArray(r3)     // Catch:{ SQLiteException -> 0x0107, all -> 0x0105 }
            r4 = r0
            java.lang.String[] r4 = (java.lang.String[]) r4     // Catch:{ SQLiteException -> 0x0107, all -> 0x0105 }
            java.lang.String r5 = "app_id=? and name=?"
            java.lang.String[] r6 = new java.lang.String[]{r30, r31}     // Catch:{ SQLiteException -> 0x0107, all -> 0x0105 }
            r8 = 0
            r9 = 0
            r7 = 0
            r3 = r29
            android.database.Cursor r2 = r2.query(r3, r4, r5, r6, r7, r8, r9)     // Catch:{ SQLiteException -> 0x0107, all -> 0x0105 }
            boolean r0 = r2.moveToFirst()     // Catch:{ SQLiteException -> 0x00cb }
            if (r0 != 0) goto L_0x0053
            r2.close()
            return r1
        L_0x0053:
            long r14 = r2.getLong(r10)     // Catch:{ SQLiteException -> 0x00cb }
            r0 = 1
            long r16 = r2.getLong(r0)     // Catch:{ SQLiteException -> 0x00cb }
            r3 = 2
            long r20 = r2.getLong(r3)     // Catch:{ SQLiteException -> 0x00cb }
            r3 = 3
            boolean r4 = r2.isNull(r3)     // Catch:{ SQLiteException -> 0x00cb }
            r5 = 0
            if (r4 == 0) goto L_0x006d
            r22 = r5
            goto L_0x0073
        L_0x006d:
            long r3 = r2.getLong(r3)     // Catch:{ SQLiteException -> 0x00cb }
            r22 = r3
        L_0x0073:
            r3 = 4
            boolean r4 = r2.isNull(r3)     // Catch:{ SQLiteException -> 0x00cb }
            if (r4 == 0) goto L_0x007d
            r24 = r1
            goto L_0x0087
        L_0x007d:
            long r3 = r2.getLong(r3)     // Catch:{ SQLiteException -> 0x00cb }
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch:{ SQLiteException -> 0x00cb }
            r24 = r3
        L_0x0087:
            r3 = 5
            boolean r4 = r2.isNull(r3)     // Catch:{ SQLiteException -> 0x00cb }
            if (r4 == 0) goto L_0x0091
            r25 = r1
            goto L_0x009b
        L_0x0091:
            long r3 = r2.getLong(r3)     // Catch:{ SQLiteException -> 0x00cb }
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch:{ SQLiteException -> 0x00cb }
            r25 = r3
        L_0x009b:
            r3 = 6
            boolean r4 = r2.isNull(r3)     // Catch:{ SQLiteException -> 0x00cb }
            if (r4 == 0) goto L_0x00a5
            r26 = r1
            goto L_0x00af
        L_0x00a5:
            long r3 = r2.getLong(r3)     // Catch:{ SQLiteException -> 0x00cb }
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch:{ SQLiteException -> 0x00cb }
            r26 = r3
        L_0x00af:
            r3 = 7
            boolean r4 = r2.isNull(r3)     // Catch:{ SQLiteException -> 0x00cb }
            if (r4 != 0) goto L_0x00cd
            long r3 = r2.getLong(r3)     // Catch:{ SQLiteException -> 0x00cb }
            r7 = 1
            int r3 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r3 != 0) goto L_0x00c1
            r10 = r0
        L_0x00c1:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r10)     // Catch:{ SQLiteException -> 0x00cb }
            r27 = r0
            goto L_0x00cf
        L_0x00c8:
            r0 = move-exception
            r1 = r2
            goto L_0x012a
        L_0x00cb:
            r0 = move-exception
            goto L_0x0109
        L_0x00cd:
            r27 = r1
        L_0x00cf:
            r0 = 8
            boolean r3 = r2.isNull(r0)     // Catch:{ SQLiteException -> 0x00cb }
            if (r3 == 0) goto L_0x00da
            r18 = r5
            goto L_0x00e0
        L_0x00da:
            long r3 = r2.getLong(r0)     // Catch:{ SQLiteException -> 0x00cb }
            r18 = r3
        L_0x00e0:
            com.google.android.gms.measurement.internal.G r0 = new com.google.android.gms.measurement.internal.G     // Catch:{ SQLiteException -> 0x00cb }
            r11 = r0
            r12 = r30
            r13 = r31
            r11.<init>(r12, r13, r14, r16, r18, r20, r22, r24, r25, r26, r27)     // Catch:{ SQLiteException -> 0x00cb }
            boolean r3 = r2.moveToNext()     // Catch:{ SQLiteException -> 0x00cb }
            if (r3 == 0) goto L_0x0101
            com.google.android.gms.measurement.internal.h2 r3 = r28.f()     // Catch:{ SQLiteException -> 0x00cb }
            com.google.android.gms.measurement.internal.i2 r3 = r3.E()     // Catch:{ SQLiteException -> 0x00cb }
            java.lang.String r4 = "Got multiple records for event aggregates, expected one. appId"
            java.lang.Object r5 = com.google.android.gms.measurement.internal.C7607h2.t(r30)     // Catch:{ SQLiteException -> 0x00cb }
            r3.b(r4, r5)     // Catch:{ SQLiteException -> 0x00cb }
        L_0x0101:
            r2.close()
            return r0
        L_0x0105:
            r0 = move-exception
            goto L_0x012a
        L_0x0107:
            r0 = move-exception
            r2 = r1
        L_0x0109:
            com.google.android.gms.measurement.internal.h2 r3 = r28.f()     // Catch:{ all -> 0x00c8 }
            com.google.android.gms.measurement.internal.i2 r3 = r3.E()     // Catch:{ all -> 0x00c8 }
            java.lang.String r4 = "Error querying events. appId"
            java.lang.Object r5 = com.google.android.gms.measurement.internal.C7607h2.t(r30)     // Catch:{ all -> 0x00c8 }
            com.google.android.gms.measurement.internal.e2 r6 = r28.d()     // Catch:{ all -> 0x00c8 }
            r7 = r31
            java.lang.String r6 = r6.c(r7)     // Catch:{ all -> 0x00c8 }
            r3.d(r4, r5, r6, r0)     // Catch:{ all -> 0x00c8 }
            if (r2 == 0) goto L_0x0129
            r2.close()
        L_0x0129:
            return r1
        L_0x012a:
            if (r1 == 0) goto L_0x012f
            r1.close()
        L_0x012f:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C7660p.Q0(java.lang.String, java.lang.String, java.lang.String):com.google.android.gms.measurement.internal.G");
    }

    private static void V(ContentValues contentValues, String str, Object obj) {
        C6620s.f(str);
        C6620s.l(obj);
        if (obj instanceof String) {
            contentValues.put(str, (String) obj);
        } else if (obj instanceof Long) {
            contentValues.put(str, (Long) obj);
        } else if (obj instanceof Double) {
            contentValues.put(str, (Double) obj);
        } else {
            throw new IllegalArgumentException("Invalid value type");
        }
    }

    private final void a0(String str, G g10) {
        C6620s.l(g10);
        k();
        s();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", g10.f49628a);
        contentValues.put("name", g10.f49629b);
        contentValues.put("lifetime_count", Long.valueOf(g10.f49630c));
        contentValues.put("current_bundle_count", Long.valueOf(g10.f49631d));
        contentValues.put("last_fire_timestamp", Long.valueOf(g10.f49633f));
        contentValues.put("last_bundled_timestamp", Long.valueOf(g10.f49634g));
        contentValues.put("last_bundled_day", g10.f49635h);
        contentValues.put("last_sampled_complex_event_id", g10.f49636i);
        contentValues.put("last_sampling_rate", g10.f49637j);
        contentValues.put("current_session_count", Long.valueOf(g10.f49632e));
        Boolean bool = g10.f49638k;
        contentValues.put("last_exempt_from_sampling", (bool == null || !bool.booleanValue()) ? null : 1L);
        try {
            if (z().insertWithOnConflict(str, (String) null, contentValues, 5) == -1) {
                f().E().b("Failed to insert/update event aggregates (got -1). appId", C7607h2.t(g10.f49628a));
            }
        } catch (SQLiteException e10) {
            f().E().c("Error storing event aggregates. appId", C7607h2.t(g10.f49628a), e10);
        }
    }

    private final void d0(String str, String str2, ContentValues contentValues) {
        try {
            SQLiteDatabase z10 = z();
            String asString = contentValues.getAsString(str2);
            if (asString == null) {
                f().F().b("Value of the primary key is not set.", C7607h2.t(str2));
                return;
            }
            if (((long) z10.update(str, contentValues, str2 + " = ?", new String[]{asString})) == 0 && z10.insertWithOnConflict(str, (String) null, contentValues, 5) == -1) {
                f().E().c("Failed to insert/update table (got -1). key", C7607h2.t(str), C7607h2.t(str2));
            }
        } catch (SQLiteException e10) {
            f().E().d("Error storing into table. key", C7607h2.t(str), C7607h2.t(str2), e10);
        }
    }

    private final void e1(String str, String str2) {
        C6620s.f(str2);
        k();
        s();
        try {
            z().delete(str, "app_id=?", new String[]{str2});
        } catch (SQLiteException e10) {
            f().E().c("Error deleting snapshot. appId", C7607h2.t(str2), e10);
        }
    }

    private final boolean g0(long j10, D d10, long j11, boolean z10) {
        k();
        s();
        C6620s.l(d10);
        C6620s.f(d10.f49566a);
        byte[] l10 = l().C(d10).l();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", d10.f49566a);
        contentValues.put("name", d10.f49567b);
        contentValues.put("timestamp", Long.valueOf(d10.f49569d));
        contentValues.put("metadata_fingerprint", Long.valueOf(j11));
        contentValues.put("data", l10);
        contentValues.put("realtime", Integer.valueOf(z10 ? 1 : 0));
        try {
            long update = (long) z().update("raw_events", contentValues, "rowid = ?", new String[]{String.valueOf(j10)});
            if (update == 1) {
                return true;
            }
            f().E().c("Failed to update raw event. appId, updatedRows", C7607h2.t(d10.f49566a), Long.valueOf(update));
            return false;
        } catch (SQLiteException e10) {
            f().E().c("Error updating raw event. appId", C7607h2.t(d10.f49566a), e10);
            return false;
        }
    }

    private final boolean l0(String str, int i10, U1 u12) {
        s();
        k();
        C6620s.f(str);
        C6620s.l(u12);
        Integer num = null;
        if (u12.Q().isEmpty()) {
            C7614i2 J10 = f().J();
            Object t10 = C7607h2.t(str);
            Integer valueOf = Integer.valueOf(i10);
            if (u12.W()) {
                num = Integer.valueOf(u12.M());
            }
            J10.d("Event filter had no event name. Audience definition ignored. appId, audienceId, filterId", t10, valueOf, String.valueOf(num));
            return false;
        }
        byte[] l10 = u12.l();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("audience_id", Integer.valueOf(i10));
        contentValues.put("filter_id", u12.W() ? Integer.valueOf(u12.M()) : null);
        contentValues.put("event_name", u12.Q());
        contentValues.put("session_scoped", u12.X() ? Boolean.valueOf(u12.U()) : null);
        contentValues.put("data", l10);
        try {
            if (z().insertWithOnConflict("event_filters", (String) null, contentValues, 5) != -1) {
                return true;
            }
            f().E().b("Failed to insert event filter (got -1). appId", C7607h2.t(str));
            return true;
        } catch (SQLiteException e10) {
            f().E().c("Error storing event filter. appId", C7607h2.t(str), e10);
            return false;
        }
    }

    private final boolean m0(String str, int i10, X1 x12) {
        s();
        k();
        C6620s.f(str);
        C6620s.l(x12);
        Integer num = null;
        if (x12.N().isEmpty()) {
            C7614i2 J10 = f().J();
            Object t10 = C7607h2.t(str);
            Integer valueOf = Integer.valueOf(i10);
            if (x12.R()) {
                num = Integer.valueOf(x12.m());
            }
            J10.d("Property filter had no property name. Audience definition ignored. appId, audienceId, filterId", t10, valueOf, String.valueOf(num));
            return false;
        }
        byte[] l10 = x12.l();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("audience_id", Integer.valueOf(i10));
        contentValues.put("filter_id", x12.R() ? Integer.valueOf(x12.m()) : null);
        contentValues.put("property_name", x12.N());
        contentValues.put("session_scoped", x12.S() ? Boolean.valueOf(x12.Q()) : null);
        contentValues.put("data", l10);
        try {
            if (z().insertWithOnConflict("property_filters", (String) null, contentValues, 5) != -1) {
                return true;
            }
            f().E().b("Failed to insert property filter (got -1). appId", C7607h2.t(str));
            return false;
        } catch (SQLiteException e10) {
            f().E().c("Error storing property filter. appId", C7607h2.t(str), e10);
            return false;
        }
    }

    private final int n1(String str) {
        C6620s.f(str);
        k();
        s();
        try {
            int w10 = a().w(str, K.f49792w);
            if (w10 <= 0) {
                return 0;
            }
            return z().delete("upload_queue", "rowid in (SELECT rowid FROM upload_queue WHERE app_id=? ORDER BY rowid DESC LIMIT -1 OFFSET ?)", new String[]{str, String.valueOf(w10)});
        } catch (SQLiteException e10) {
            f().E().c("Error deleting over the limit queued batches. appId", C7607h2.t(str), e10);
            return 0;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x003e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String A() {
        /*
            r6 = this;
            android.database.sqlite.SQLiteDatabase r0 = r6.z()
            r1 = 0
            java.lang.String r2 = "select app_id from queue order by has_realtime desc, rowid asc limit 1;"
            android.database.Cursor r0 = r0.rawQuery(r2, r1)     // Catch:{ SQLiteException -> 0x0027, all -> 0x0022 }
            boolean r2 = r0.moveToFirst()     // Catch:{ SQLiteException -> 0x001c }
            if (r2 == 0) goto L_0x001e
            r2 = 0
            java.lang.String r1 = r0.getString(r2)     // Catch:{ SQLiteException -> 0x001c }
            r0.close()
            return r1
        L_0x001a:
            r1 = move-exception
            goto L_0x003c
        L_0x001c:
            r2 = move-exception
            goto L_0x0029
        L_0x001e:
            r0.close()
            return r1
        L_0x0022:
            r0 = move-exception
            r5 = r1
            r1 = r0
            r0 = r5
            goto L_0x003c
        L_0x0027:
            r2 = move-exception
            r0 = r1
        L_0x0029:
            com.google.android.gms.measurement.internal.h2 r3 = r6.f()     // Catch:{ all -> 0x001a }
            com.google.android.gms.measurement.internal.i2 r3 = r3.E()     // Catch:{ all -> 0x001a }
            java.lang.String r4 = "Database error getting next bundle app id"
            r3.b(r4, r2)     // Catch:{ all -> 0x001a }
            if (r0 == 0) goto L_0x003b
            r0.close()
        L_0x003b:
            return r1
        L_0x003c:
            if (r0 == 0) goto L_0x0041
            r0.close()
        L_0x0041:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C7660p.A():java.lang.String");
    }

    public final int B(String str, String str2) {
        C6620s.f(str);
        C6620s.f(str2);
        k();
        s();
        try {
            return z().delete("conditional_properties", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e10) {
            f().E().d("Error deleting conditional property", C7607h2.t(str), d().g(str2), e10);
            return 0;
        }
    }

    public final long C(A2 a22) {
        k();
        s();
        C6620s.l(a22);
        C6620s.f(a22.a0());
        byte[] l10 = a22.l();
        long y10 = l().y(l10);
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", a22.a0());
        contentValues.put("metadata_fingerprint", Long.valueOf(y10));
        contentValues.put("metadata", l10);
        try {
            z().insertWithOnConflict("raw_events_metadata", (String) null, contentValues, 4);
            return y10;
        } catch (SQLiteException e10) {
            f().E().c("Error storing raw event metadata. appId", C7607h2.t(a22.a0()), e10);
            throw e10;
        }
    }

    public final long E(String str) {
        C6620s.f(str);
        k();
        s();
        try {
            return (long) z().delete("raw_events", "rowid in (select rowid from raw_events where app_id=? order by rowid desc limit -1 offset ?)", new String[]{str, String.valueOf(Math.max(0, Math.min(1000000, a().w(str, K.f49780q))))});
        } catch (SQLiteException e10) {
            f().E().c("Error deleting over the limit events. appId", C7607h2.t(str), e10);
            return 0;
        }
    }

    public final long E0(String str) {
        C6620s.f(str);
        return G("select count(1) from events where app_id=? and name not like '!_%' escape '!'", new String[]{str}, 0);
    }

    public final long F(String str, C7459z2 z2Var, String str2, Map<String, String> map, X x10, Long l10) {
        int delete;
        String str3 = str;
        Long l11 = l10;
        k();
        s();
        C6620s.l(z2Var);
        C6620s.f(str);
        if (!a().r(K.f49707I0)) {
            return -1;
        }
        k();
        s();
        if (s0()) {
            long a10 = p().f50012f.a();
            long c10 = zzb().c();
            if (Math.abs(c10 - a10) > C7611i.Q()) {
                p().f50012f.b(c10);
                k();
                s();
                if (s0() && (delete = z().delete("upload_queue", D0(), new String[0])) > 0) {
                    f().I().b("Deleted stale MeasurementBatch rows from upload_queue. rowsDeleted", Integer.valueOf(delete));
                }
                if (a().r(K.f49711K0)) {
                    n1(str);
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry next : map.entrySet()) {
            arrayList.add(((String) next.getKey()) + "=" + ((String) next.getValue()));
        }
        byte[] l12 = z2Var.l();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("measurement_batch", l12);
        contentValues.put("upload_uri", str2);
        StringBuilder sb2 = new StringBuilder();
        int size = arrayList.size();
        if (size > 0) {
            sb2.append((CharSequence) arrayList.get(0));
            int i10 = 1;
            while (i10 < size) {
                sb2.append("\r\n");
                Object obj = arrayList.get(i10);
                i10++;
                sb2.append((CharSequence) obj);
            }
        }
        contentValues.put("upload_headers", sb2.toString());
        contentValues.put("upload_type", Integer.valueOf(x10.zza()));
        contentValues.put("creation_timestamp", Long.valueOf(zzb().a()));
        contentValues.put("retry_count", 0);
        if (l11 != null) {
            contentValues.put("associated_row_id", l11);
        }
        try {
            long insert = z().insert("upload_queue", (String) null, contentValues);
            if (insert == -1) {
                f().E().b("Failed to insert MeasurementBatch (got -1) to upload_queue. appId", str);
            }
            return insert;
        } catch (SQLiteException e10) {
            f().E().c("Error storing MeasurementBatch to upload_queue. appId", str, e10);
            return -1;
        }
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: protected */
    public final long F0(String str, String str2) {
        C6620s.f(str);
        C6620s.f(str2);
        k();
        s();
        SQLiteDatabase z10 = z();
        z10.beginTransaction();
        long j10 = 0;
        try {
            long G10 = G("select " + str2 + " from app2 where app_id=?", new String[]{str}, -1);
            if (G10 == -1) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("app_id", str);
                contentValues.put("first_open_count", 0);
                contentValues.put("previous_install_count", 0);
                if (z10.insertWithOnConflict("app2", (String) null, contentValues, 5) == -1) {
                    f().E().c("Failed to insert column (got -1). appId", C7607h2.t(str), str2);
                    z10.endTransaction();
                    return -1;
                }
                G10 = 0;
            }
            try {
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("app_id", str);
                contentValues2.put(str2, Long.valueOf(1 + G10));
                if (((long) z10.update("app2", contentValues2, "app_id = ?", new String[]{str})) == 0) {
                    f().E().c("Failed to update column (got 0). appId", C7607h2.t(str), str2);
                    z10.endTransaction();
                    return -1;
                }
                z10.setTransactionSuccessful();
                z10.endTransaction();
                return G10;
            } catch (SQLiteException e10) {
                long j11 = G10;
                e = e10;
                j10 = j11;
                try {
                    f().E().d("Error inserting column. appId", C7607h2.t(str), str2, e);
                    z10.endTransaction();
                    return j10;
                } catch (Throwable th2) {
                    z10.endTransaction();
                    throw th2;
                }
            }
        } catch (SQLiteException e11) {
            e = e11;
            f().E().d("Error inserting column. appId", C7607h2.t(str), str2, e);
            z10.endTransaction();
            return j10;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x008c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.util.Pair<com.google.android.gms.internal.measurement.C7427v2, java.lang.Long> H(java.lang.String r6, java.lang.Long r7) {
        /*
            r5 = this;
            r5.k()
            r5.s()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r5.z()     // Catch:{ SQLiteException -> 0x0075, all -> 0x0073 }
            java.lang.String r2 = "select main_event, children_to_process from main_event_params where app_id=? and event_id=?"
            java.lang.String r3 = java.lang.String.valueOf(r7)     // Catch:{ SQLiteException -> 0x0075, all -> 0x0073 }
            java.lang.String[] r3 = new java.lang.String[]{r6, r3}     // Catch:{ SQLiteException -> 0x0075, all -> 0x0073 }
            android.database.Cursor r1 = r1.rawQuery(r2, r3)     // Catch:{ SQLiteException -> 0x0075, all -> 0x0073 }
            boolean r2 = r1.moveToFirst()     // Catch:{ SQLiteException -> 0x0033 }
            if (r2 != 0) goto L_0x0035
            com.google.android.gms.measurement.internal.h2 r6 = r5.f()     // Catch:{ SQLiteException -> 0x0033 }
            com.google.android.gms.measurement.internal.i2 r6 = r6.I()     // Catch:{ SQLiteException -> 0x0033 }
            java.lang.String r7 = "Main event not found"
            r6.a(r7)     // Catch:{ SQLiteException -> 0x0033 }
            r1.close()
            return r0
        L_0x0030:
            r6 = move-exception
            r0 = r1
            goto L_0x008a
        L_0x0033:
            r6 = move-exception
            goto L_0x0077
        L_0x0035:
            r2 = 0
            byte[] r2 = r1.getBlob(r2)     // Catch:{ SQLiteException -> 0x0033 }
            r3 = 1
            long r3 = r1.getLong(r3)     // Catch:{ SQLiteException -> 0x0033 }
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch:{ SQLiteException -> 0x0033 }
            com.google.android.gms.internal.measurement.v2$a r4 = com.google.android.gms.internal.measurement.C7427v2.V()     // Catch:{ IOException -> 0x005d }
            com.google.android.gms.internal.measurement.v5 r2 = com.google.android.gms.measurement.internal.N5.E(r4, r2)     // Catch:{ IOException -> 0x005d }
            com.google.android.gms.internal.measurement.v2$a r2 = (com.google.android.gms.internal.measurement.C7427v2.a) r2     // Catch:{ IOException -> 0x005d }
            com.google.android.gms.internal.measurement.s5 r2 = r2.s()     // Catch:{ IOException -> 0x005d }
            com.google.android.gms.internal.measurement.L4 r2 = (com.google.android.gms.internal.measurement.L4) r2     // Catch:{ IOException -> 0x005d }
            com.google.android.gms.internal.measurement.v2 r2 = (com.google.android.gms.internal.measurement.C7427v2) r2     // Catch:{ IOException -> 0x005d }
            android.util.Pair r6 = android.util.Pair.create(r2, r3)     // Catch:{ SQLiteException -> 0x0033 }
            r1.close()
            return r6
        L_0x005d:
            r2 = move-exception
            com.google.android.gms.measurement.internal.h2 r3 = r5.f()     // Catch:{ SQLiteException -> 0x0033 }
            com.google.android.gms.measurement.internal.i2 r3 = r3.E()     // Catch:{ SQLiteException -> 0x0033 }
            java.lang.String r4 = "Failed to merge main event. appId, eventId"
            java.lang.Object r6 = com.google.android.gms.measurement.internal.C7607h2.t(r6)     // Catch:{ SQLiteException -> 0x0033 }
            r3.d(r4, r6, r7, r2)     // Catch:{ SQLiteException -> 0x0033 }
            r1.close()
            return r0
        L_0x0073:
            r6 = move-exception
            goto L_0x008a
        L_0x0075:
            r6 = move-exception
            r1 = r0
        L_0x0077:
            com.google.android.gms.measurement.internal.h2 r7 = r5.f()     // Catch:{ all -> 0x0030 }
            com.google.android.gms.measurement.internal.i2 r7 = r7.E()     // Catch:{ all -> 0x0030 }
            java.lang.String r2 = "Error selecting main event"
            r7.b(r2, r6)     // Catch:{ all -> 0x0030 }
            if (r1 == 0) goto L_0x0089
            r1.close()
        L_0x0089:
            return r0
        L_0x008a:
            if (r0 == 0) goto L_0x008f
            r0.close()
        L_0x008f:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C7660p.H(java.lang.String, java.lang.Long):android.util.Pair");
    }

    public final C7667q I(long j10, String str, long j11, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16) {
        C6620s.f(str);
        k();
        s();
        String[] strArr = {str};
        C7667q qVar = new C7667q();
        Cursor cursor = null;
        try {
            SQLiteDatabase z17 = z();
            cursor = z17.query("apps", new String[]{"day", "daily_events_count", "daily_public_events_count", "daily_conversions_count", "daily_error_events_count", "daily_realtime_events_count", "daily_realtime_dcu_count", "daily_registered_triggers_count"}, "app_id=?", new String[]{str}, (String) null, (String) null, (String) null);
            if (!cursor.moveToFirst()) {
                f().J().b("Not updating daily counts, app is not known. appId", C7607h2.t(str));
                cursor.close();
                return qVar;
            }
            if (cursor.getLong(0) == j10) {
                qVar.f50288b = cursor.getLong(1);
                qVar.f50287a = cursor.getLong(2);
                qVar.f50289c = cursor.getLong(3);
                qVar.f50290d = cursor.getLong(4);
                qVar.f50291e = cursor.getLong(5);
                qVar.f50292f = cursor.getLong(6);
                qVar.f50293g = cursor.getLong(7);
            }
            if (z10) {
                qVar.f50288b += j11;
            }
            if (z11) {
                qVar.f50287a += j11;
            }
            if (z12) {
                qVar.f50289c += j11;
            }
            if (z13) {
                qVar.f50290d += j11;
            }
            if (z14) {
                qVar.f50291e += j11;
            }
            if (z15) {
                qVar.f50292f += j11;
            }
            if (z16) {
                qVar.f50293g += j11;
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("day", Long.valueOf(j10));
            contentValues.put("daily_public_events_count", Long.valueOf(qVar.f50287a));
            contentValues.put("daily_events_count", Long.valueOf(qVar.f50288b));
            contentValues.put("daily_conversions_count", Long.valueOf(qVar.f50289c));
            contentValues.put("daily_error_events_count", Long.valueOf(qVar.f50290d));
            contentValues.put("daily_realtime_events_count", Long.valueOf(qVar.f50291e));
            contentValues.put("daily_realtime_dcu_count", Long.valueOf(qVar.f50292f));
            contentValues.put("daily_registered_triggers_count", Long.valueOf(qVar.f50293g));
            z17.update("apps", contentValues, "app_id=?", strArr);
            cursor.close();
            return qVar;
        } catch (SQLiteException e10) {
            f().E().c("Error updating daily counts. appId", C7607h2.t(str), e10);
            if (cursor != null) {
                cursor.close();
            }
            return qVar;
        } catch (Throwable th2) {
            if (cursor != null) {
                cursor.close();
            }
            throw th2;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0057  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String I0(long r4) {
        /*
            r3 = this;
            r3.k()
            r3.s()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r3.z()     // Catch:{ SQLiteException -> 0x0040, all -> 0x003e }
            java.lang.String r2 = "select app_id from apps where app_id in (select distinct app_id from raw_events) and config_fetched_time < ? order by failed_config_fetch_time limit 1;"
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ SQLiteException -> 0x0040, all -> 0x003e }
            java.lang.String[] r4 = new java.lang.String[]{r4}     // Catch:{ SQLiteException -> 0x0040, all -> 0x003e }
            android.database.Cursor r4 = r1.rawQuery(r2, r4)     // Catch:{ SQLiteException -> 0x0040, all -> 0x003e }
            boolean r5 = r4.moveToFirst()     // Catch:{ SQLiteException -> 0x0033 }
            if (r5 != 0) goto L_0x0035
            com.google.android.gms.measurement.internal.h2 r5 = r3.f()     // Catch:{ SQLiteException -> 0x0033 }
            com.google.android.gms.measurement.internal.i2 r5 = r5.I()     // Catch:{ SQLiteException -> 0x0033 }
            java.lang.String r1 = "No expired configs for apps with pending events"
            r5.a(r1)     // Catch:{ SQLiteException -> 0x0033 }
            r4.close()
            return r0
        L_0x0030:
            r5 = move-exception
            r0 = r4
            goto L_0x0055
        L_0x0033:
            r5 = move-exception
            goto L_0x0042
        L_0x0035:
            r5 = 0
            java.lang.String r5 = r4.getString(r5)     // Catch:{ SQLiteException -> 0x0033 }
            r4.close()
            return r5
        L_0x003e:
            r5 = move-exception
            goto L_0x0055
        L_0x0040:
            r5 = move-exception
            r4 = r0
        L_0x0042:
            com.google.android.gms.measurement.internal.h2 r1 = r3.f()     // Catch:{ all -> 0x0030 }
            com.google.android.gms.measurement.internal.i2 r1 = r1.E()     // Catch:{ all -> 0x0030 }
            java.lang.String r2 = "Error selecting expired configs"
            r1.b(r2, r5)     // Catch:{ all -> 0x0030 }
            if (r4 == 0) goto L_0x0054
            r4.close()
        L_0x0054:
            return r0
        L_0x0055:
            if (r0 == 0) goto L_0x005a
            r0.close()
        L_0x005a:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C7660p.I0(long):java.lang.String");
    }

    public final C7667q J(long j10, String str, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16) {
        return I(j10, str, 1, false, false, z12, false, z14, z15, z16);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0034, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0035, code lost:
        r13 = r22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0039, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003a, code lost:
        r13 = r22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0103, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0104, code lost:
        r13 = r22;
        r12 = r23;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0120, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0126, code lost:
        r2.close();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0034 A[Catch:{ SQLiteException -> 0x0039, all -> 0x0034 }, ExcHandler: all (th java.lang.Throwable), PHI: r2 
      PHI: (r2v4 android.database.Cursor) = (r2v0 android.database.Cursor), (r2v0 android.database.Cursor), (r2v0 android.database.Cursor), (r2v5 android.database.Cursor), (r2v0 android.database.Cursor) binds: [B:1:0x0011, B:2:?, B:4:0x0019, B:22:0x0099, B:8:0x002b] A[DONT_GENERATE, DONT_INLINE], Splitter:B:1:0x0011] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0120  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0126  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<com.google.android.gms.measurement.internal.R5> K0(java.lang.String r23, java.lang.String r24, java.lang.String r25) {
        /*
            r22 = this;
            r0 = r25
            K9.C6620s.f(r23)
            r22.k()
            r22.s()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r2 = 0
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x0103, all -> 0x0034 }
            r4 = 3
            r3.<init>(r4)     // Catch:{ SQLiteException -> 0x0103, all -> 0x0034 }
            r12 = r23
            r3.add(r12)     // Catch:{ SQLiteException -> 0x00fd, all -> 0x0034 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x00fd, all -> 0x0034 }
            java.lang.String r6 = "app_id=?"
            r5.<init>(r6)     // Catch:{ SQLiteException -> 0x00fd, all -> 0x0034 }
            boolean r6 = android.text.TextUtils.isEmpty(r24)     // Catch:{ SQLiteException -> 0x00fd, all -> 0x0034 }
            if (r6 != 0) goto L_0x003e
            r6 = r24
            r3.add(r6)     // Catch:{ SQLiteException -> 0x0039, all -> 0x0034 }
            java.lang.String r7 = " and origin=?"
            r5.append(r7)     // Catch:{ SQLiteException -> 0x0039, all -> 0x0034 }
            goto L_0x0040
        L_0x0034:
            r0 = move-exception
            r13 = r22
            goto L_0x0124
        L_0x0039:
            r0 = move-exception
            r13 = r22
            goto L_0x0109
        L_0x003e:
            r6 = r24
        L_0x0040:
            boolean r7 = android.text.TextUtils.isEmpty(r25)     // Catch:{ SQLiteException -> 0x0039, all -> 0x0034 }
            if (r7 != 0) goto L_0x005f
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x0039, all -> 0x0034 }
            r7.<init>()     // Catch:{ SQLiteException -> 0x0039, all -> 0x0034 }
            r7.append(r0)     // Catch:{ SQLiteException -> 0x0039, all -> 0x0034 }
            java.lang.String r8 = "*"
            r7.append(r8)     // Catch:{ SQLiteException -> 0x0039, all -> 0x0034 }
            java.lang.String r7 = r7.toString()     // Catch:{ SQLiteException -> 0x0039, all -> 0x0034 }
            r3.add(r7)     // Catch:{ SQLiteException -> 0x0039, all -> 0x0034 }
            java.lang.String r7 = " and name glob ?"
            r5.append(r7)     // Catch:{ SQLiteException -> 0x0039, all -> 0x0034 }
        L_0x005f:
            int r7 = r3.size()     // Catch:{ SQLiteException -> 0x0039, all -> 0x0034 }
            java.lang.String[] r7 = new java.lang.String[r7]     // Catch:{ SQLiteException -> 0x0039, all -> 0x0034 }
            java.lang.Object[] r3 = r3.toArray(r7)     // Catch:{ SQLiteException -> 0x0039, all -> 0x0034 }
            r17 = r3
            java.lang.String[] r17 = (java.lang.String[]) r17     // Catch:{ SQLiteException -> 0x0039, all -> 0x0034 }
            android.database.sqlite.SQLiteDatabase r13 = r22.z()     // Catch:{ SQLiteException -> 0x0039, all -> 0x0034 }
            java.lang.String r14 = "user_attributes"
            java.lang.String r3 = "name"
            java.lang.String r7 = "set_timestamp"
            java.lang.String r8 = "value"
            java.lang.String r9 = "origin"
            java.lang.String[] r15 = new java.lang.String[]{r3, r7, r8, r9}     // Catch:{ SQLiteException -> 0x0039, all -> 0x0034 }
            java.lang.String r16 = r5.toString()     // Catch:{ SQLiteException -> 0x0039, all -> 0x0034 }
            java.lang.String r20 = "rowid"
            java.lang.String r21 = "1001"
            r18 = 0
            r19 = 0
            android.database.Cursor r2 = r13.query(r14, r15, r16, r17, r18, r19, r20, r21)     // Catch:{ SQLiteException -> 0x0039, all -> 0x0034 }
            boolean r3 = r2.moveToFirst()     // Catch:{ SQLiteException -> 0x0039, all -> 0x0034 }
            if (r3 != 0) goto L_0x0099
            r2.close()
            return r1
        L_0x0099:
            int r3 = r1.size()     // Catch:{ SQLiteException -> 0x0039, all -> 0x0034 }
            r5 = 1000(0x3e8, float:1.401E-42)
            if (r3 < r5) goto L_0x00b5
            com.google.android.gms.measurement.internal.h2 r0 = r22.f()     // Catch:{ SQLiteException -> 0x0039, all -> 0x0034 }
            com.google.android.gms.measurement.internal.i2 r0 = r0.E()     // Catch:{ SQLiteException -> 0x0039, all -> 0x0034 }
            java.lang.String r3 = "Read more than the max allowed user properties, ignoring excess"
            java.lang.Integer r4 = java.lang.Integer.valueOf(r5)     // Catch:{ SQLiteException -> 0x0039, all -> 0x0034 }
            r0.b(r3, r4)     // Catch:{ SQLiteException -> 0x0039, all -> 0x0034 }
            r13 = r22
            goto L_0x00f5
        L_0x00b5:
            r3 = 0
            java.lang.String r8 = r2.getString(r3)     // Catch:{ SQLiteException -> 0x0039, all -> 0x0034 }
            r3 = 1
            long r9 = r2.getLong(r3)     // Catch:{ SQLiteException -> 0x0039, all -> 0x0034 }
            r3 = 2
            r13 = r22
            java.lang.Object r11 = r13.O(r2, r3)     // Catch:{ SQLiteException -> 0x00fb }
            java.lang.String r3 = r2.getString(r4)     // Catch:{ SQLiteException -> 0x00fb }
            if (r11 != 0) goto L_0x00e3
            com.google.android.gms.measurement.internal.h2 r5 = r22.f()     // Catch:{ SQLiteException -> 0x00e0 }
            com.google.android.gms.measurement.internal.i2 r5 = r5.E()     // Catch:{ SQLiteException -> 0x00e0 }
            java.lang.String r6 = "(2)Read invalid user property value, ignoring it"
            java.lang.Object r7 = com.google.android.gms.measurement.internal.C7607h2.t(r23)     // Catch:{ SQLiteException -> 0x00e0 }
            r5.d(r6, r7, r3, r0)     // Catch:{ SQLiteException -> 0x00e0 }
            goto L_0x00ef
        L_0x00de:
            r0 = move-exception
            goto L_0x0124
        L_0x00e0:
            r0 = move-exception
            r6 = r3
            goto L_0x0109
        L_0x00e3:
            com.google.android.gms.measurement.internal.R5 r14 = new com.google.android.gms.measurement.internal.R5     // Catch:{ SQLiteException -> 0x00e0 }
            r5 = r14
            r6 = r23
            r7 = r3
            r5.<init>(r6, r7, r8, r9, r11)     // Catch:{ SQLiteException -> 0x00e0 }
            r1.add(r14)     // Catch:{ SQLiteException -> 0x00e0 }
        L_0x00ef:
            boolean r5 = r2.moveToNext()     // Catch:{ SQLiteException -> 0x00e0 }
            if (r5 != 0) goto L_0x00f9
        L_0x00f5:
            r2.close()
            return r1
        L_0x00f9:
            r6 = r3
            goto L_0x0099
        L_0x00fb:
            r0 = move-exception
            goto L_0x0109
        L_0x00fd:
            r0 = move-exception
            r13 = r22
        L_0x0100:
            r6 = r24
            goto L_0x0109
        L_0x0103:
            r0 = move-exception
            r13 = r22
            r12 = r23
            goto L_0x0100
        L_0x0109:
            com.google.android.gms.measurement.internal.h2 r1 = r22.f()     // Catch:{ all -> 0x00de }
            com.google.android.gms.measurement.internal.i2 r1 = r1.E()     // Catch:{ all -> 0x00de }
            java.lang.String r3 = "(2)Error querying user properties"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C7607h2.t(r23)     // Catch:{ all -> 0x00de }
            r1.d(r3, r4, r6, r0)     // Catch:{ all -> 0x00de }
            java.util.List r0 = java.util.Collections.emptyList()     // Catch:{ all -> 0x00de }
            if (r2 == 0) goto L_0x0123
            r2.close()
        L_0x0123:
            return r0
        L_0x0124:
            if (r2 == 0) goto L_0x0129
            r2.close()
        L_0x0129:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C7660p.K0(java.lang.String, java.lang.String, java.lang.String):java.util.List");
    }

    /* access modifiers changed from: package-private */
    public final void L0(Long l10) {
        k();
        s();
        C6620s.l(l10);
        if (a().r(K.f49707I0) && s0()) {
            if (G0("SELECT COUNT(1) FROM upload_queue WHERE rowid = " + l10 + " AND retry_count =  2147483647 LIMIT 1", (String[]) null) > 0) {
                f().J().a("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                SQLiteDatabase z10 = z();
                z10.execSQL("UPDATE upload_queue SET retry_count = retry_count + 1 WHERE rowid = " + l10 + " AND retry_count < 2147483647");
            } catch (SQLiteException e10) {
                f().E().b("Error incrementing retry count. error", e10);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00ab  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.measurement.internal.M5 M(long r17) {
        /*
            r16 = this;
            com.google.android.gms.measurement.internal.i r0 = r16.a()
            com.google.android.gms.measurement.internal.Y1<java.lang.Boolean> r1 = com.google.android.gms.measurement.internal.K.f49711K0
            boolean r0 = r0.r(r1)
            r1 = 0
            if (r0 != 0) goto L_0x000e
            return r1
        L_0x000e:
            r16.k()
            r16.s()
            android.database.sqlite.SQLiteDatabase r2 = r16.z()     // Catch:{ SQLiteException -> 0x0090, all -> 0x008e }
            java.lang.String r3 = "upload_queue"
            java.lang.String r4 = "rowId"
            java.lang.String r5 = "app_id"
            java.lang.String r6 = "measurement_batch"
            java.lang.String r7 = "upload_uri"
            java.lang.String r8 = "upload_headers"
            java.lang.String r9 = "upload_type"
            java.lang.String r10 = "retry_count"
            java.lang.String r11 = "creation_timestamp"
            java.lang.String r12 = "associated_row_id"
            java.lang.String[] r4 = new java.lang.String[]{r4, r5, r6, r7, r8, r9, r10, r11, r12}     // Catch:{ SQLiteException -> 0x0090, all -> 0x008e }
            java.lang.String r5 = "rowId=?"
            java.lang.String r0 = java.lang.String.valueOf(r17)     // Catch:{ SQLiteException -> 0x0090, all -> 0x008e }
            java.lang.String[] r6 = new java.lang.String[]{r0}     // Catch:{ SQLiteException -> 0x0090, all -> 0x008e }
            java.lang.String r10 = "1"
            r7 = 0
            r8 = 0
            r9 = 0
            android.database.Cursor r2 = r2.query(r3, r4, r5, r6, r7, r8, r9, r10)     // Catch:{ SQLiteException -> 0x0090, all -> 0x008e }
            boolean r0 = r2.moveToFirst()     // Catch:{ SQLiteException -> 0x008c }
            if (r0 != 0) goto L_0x004d
            r2.close()
            return r1
        L_0x004d:
            r0 = 1
            java.lang.String r0 = r2.getString(r0)     // Catch:{ SQLiteException -> 0x008c }
            java.lang.Object r0 = K9.C6620s.l(r0)     // Catch:{ SQLiteException -> 0x008c }
            r4 = r0
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ SQLiteException -> 0x008c }
            r0 = 2
            byte[] r7 = r2.getBlob(r0)     // Catch:{ SQLiteException -> 0x008c }
            r0 = 3
            java.lang.String r8 = r2.getString(r0)     // Catch:{ SQLiteException -> 0x008c }
            r0 = 4
            java.lang.String r9 = r2.getString(r0)     // Catch:{ SQLiteException -> 0x008c }
            r0 = 5
            int r10 = r2.getInt(r0)     // Catch:{ SQLiteException -> 0x008c }
            r0 = 6
            int r11 = r2.getInt(r0)     // Catch:{ SQLiteException -> 0x008c }
            r0 = 7
            long r12 = r2.getLong(r0)     // Catch:{ SQLiteException -> 0x008c }
            r0 = 8
            long r14 = r2.getLong(r0)     // Catch:{ SQLiteException -> 0x008c }
            r3 = r16
            r5 = r17
            com.google.android.gms.measurement.internal.M5 r0 = r3.N(r4, r5, r7, r8, r9, r10, r11, r12, r14)     // Catch:{ SQLiteException -> 0x008c }
            r2.close()
            return r0
        L_0x0089:
            r0 = move-exception
            r1 = r2
            goto L_0x00a9
        L_0x008c:
            r0 = move-exception
            goto L_0x0092
        L_0x008e:
            r0 = move-exception
            goto L_0x00a9
        L_0x0090:
            r0 = move-exception
            r2 = r1
        L_0x0092:
            com.google.android.gms.measurement.internal.h2 r3 = r16.f()     // Catch:{ all -> 0x0089 }
            com.google.android.gms.measurement.internal.i2 r3 = r3.E()     // Catch:{ all -> 0x0089 }
            java.lang.String r4 = "Error to querying MeasurementBatch from upload_queue. rowId"
            java.lang.Long r5 = java.lang.Long.valueOf(r17)     // Catch:{ all -> 0x0089 }
            r3.c(r4, r5, r0)     // Catch:{ all -> 0x0089 }
            if (r2 == 0) goto L_0x00a8
            r2.close()
        L_0x00a8:
            return r1
        L_0x00a9:
            if (r1 == 0) goto L_0x00ae
            r1.close()
        L_0x00ae:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C7660p.M(long):com.google.android.gms.measurement.internal.M5");
    }

    public final void M0(String str, C7671q3 q3Var) {
        C6620s.l(str);
        C6620s.l(q3Var);
        k();
        s();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("consent_state", q3Var.v());
        contentValues.put("consent_source", Integer.valueOf(q3Var.b()));
        d0("consent_settings", "app_id", contentValues);
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0086  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.os.Bundle O0(java.lang.String r6) {
        /*
            r5 = this;
            r5.k()
            r5.s()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r5.z()     // Catch:{ SQLiteException -> 0x006f, all -> 0x006d }
            java.lang.String r2 = "select parameters from default_event_params where app_id=?"
            java.lang.String[] r3 = new java.lang.String[]{r6}     // Catch:{ SQLiteException -> 0x006f, all -> 0x006d }
            android.database.Cursor r1 = r1.rawQuery(r2, r3)     // Catch:{ SQLiteException -> 0x006f, all -> 0x006d }
            boolean r2 = r1.moveToFirst()     // Catch:{ SQLiteException -> 0x002f }
            if (r2 != 0) goto L_0x0031
            com.google.android.gms.measurement.internal.h2 r6 = r5.f()     // Catch:{ SQLiteException -> 0x002f }
            com.google.android.gms.measurement.internal.i2 r6 = r6.I()     // Catch:{ SQLiteException -> 0x002f }
            java.lang.String r2 = "Default event parameters not found"
            r6.a(r2)     // Catch:{ SQLiteException -> 0x002f }
            r1.close()
            return r0
        L_0x002c:
            r6 = move-exception
            r0 = r1
            goto L_0x0084
        L_0x002f:
            r6 = move-exception
            goto L_0x0071
        L_0x0031:
            r2 = 0
            byte[] r2 = r1.getBlob(r2)     // Catch:{ SQLiteException -> 0x002f }
            com.google.android.gms.internal.measurement.v2$a r3 = com.google.android.gms.internal.measurement.C7427v2.V()     // Catch:{ IOException -> 0x0057 }
            com.google.android.gms.internal.measurement.v5 r2 = com.google.android.gms.measurement.internal.N5.E(r3, r2)     // Catch:{ IOException -> 0x0057 }
            com.google.android.gms.internal.measurement.v2$a r2 = (com.google.android.gms.internal.measurement.C7427v2.a) r2     // Catch:{ IOException -> 0x0057 }
            com.google.android.gms.internal.measurement.s5 r2 = r2.s()     // Catch:{ IOException -> 0x0057 }
            com.google.android.gms.internal.measurement.L4 r2 = (com.google.android.gms.internal.measurement.L4) r2     // Catch:{ IOException -> 0x0057 }
            com.google.android.gms.internal.measurement.v2 r2 = (com.google.android.gms.internal.measurement.C7427v2) r2     // Catch:{ IOException -> 0x0057 }
            r5.l()     // Catch:{ SQLiteException -> 0x002f }
            java.util.List r6 = r2.Y()     // Catch:{ SQLiteException -> 0x002f }
            android.os.Bundle r6 = com.google.android.gms.measurement.internal.N5.z(r6)     // Catch:{ SQLiteException -> 0x002f }
            r1.close()
            return r6
        L_0x0057:
            r2 = move-exception
            com.google.android.gms.measurement.internal.h2 r3 = r5.f()     // Catch:{ SQLiteException -> 0x002f }
            com.google.android.gms.measurement.internal.i2 r3 = r3.E()     // Catch:{ SQLiteException -> 0x002f }
            java.lang.String r4 = "Failed to retrieve default event parameters. appId"
            java.lang.Object r6 = com.google.android.gms.measurement.internal.C7607h2.t(r6)     // Catch:{ SQLiteException -> 0x002f }
            r3.c(r4, r6, r2)     // Catch:{ SQLiteException -> 0x002f }
            r1.close()
            return r0
        L_0x006d:
            r6 = move-exception
            goto L_0x0084
        L_0x006f:
            r6 = move-exception
            r1 = r0
        L_0x0071:
            com.google.android.gms.measurement.internal.h2 r2 = r5.f()     // Catch:{ all -> 0x002c }
            com.google.android.gms.measurement.internal.i2 r2 = r2.E()     // Catch:{ all -> 0x002c }
            java.lang.String r3 = "Error selecting default event parameters"
            r2.b(r3, r6)     // Catch:{ all -> 0x002c }
            if (r1 == 0) goto L_0x0083
            r1.close()
        L_0x0083:
            return r0
        L_0x0084:
            if (r0 == 0) goto L_0x0089
            r0.close()
        L_0x0089:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C7660p.O0(java.lang.String):android.os.Bundle");
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x0116  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x011c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.measurement.internal.C7597g P0(java.lang.String r27, java.lang.String r28) {
        /*
            r26 = this;
            r7 = r28
            K9.C6620s.f(r27)
            K9.C6620s.f(r28)
            r26.k()
            r26.s()
            r8 = 0
            android.database.sqlite.SQLiteDatabase r9 = r26.z()     // Catch:{ SQLiteException -> 0x00f9, all -> 0x00f7 }
            java.lang.String r10 = "conditional_properties"
            java.lang.String r11 = "origin"
            java.lang.String r12 = "value"
            java.lang.String r13 = "active"
            java.lang.String r14 = "trigger_event_name"
            java.lang.String r15 = "trigger_timeout"
            java.lang.String r16 = "timed_out_event"
            java.lang.String r17 = "creation_timestamp"
            java.lang.String r18 = "triggered_event"
            java.lang.String r19 = "triggered_timestamp"
            java.lang.String r20 = "time_to_live"
            java.lang.String r21 = "expired_event"
            java.lang.String[] r11 = new java.lang.String[]{r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21}     // Catch:{ SQLiteException -> 0x00f9, all -> 0x00f7 }
            java.lang.String r12 = "app_id=? and name=?"
            java.lang.String[] r13 = new java.lang.String[]{r27, r28}     // Catch:{ SQLiteException -> 0x00f9, all -> 0x00f7 }
            r15 = 0
            r16 = 0
            r14 = 0
            android.database.Cursor r9 = r9.query(r10, r11, r12, r13, r14, r15, r16)     // Catch:{ SQLiteException -> 0x00f9, all -> 0x00f7 }
            boolean r0 = r9.moveToFirst()     // Catch:{ SQLiteException -> 0x0056 }
            if (r0 != 0) goto L_0x0047
            r9.close()
            return r8
        L_0x0047:
            r0 = 0
            java.lang.String r1 = r9.getString(r0)     // Catch:{ SQLiteException -> 0x0056 }
            if (r1 != 0) goto L_0x0050
            java.lang.String r1 = ""
        L_0x0050:
            r12 = r1
            goto L_0x0059
        L_0x0052:
            r0 = move-exception
            r8 = r9
            goto L_0x011a
        L_0x0056:
            r0 = move-exception
            goto L_0x00fb
        L_0x0059:
            r1 = 1
            r14 = r26
            java.lang.Object r5 = r14.O(r9, r1)     // Catch:{ SQLiteException -> 0x0056 }
            r2 = 2
            int r2 = r9.getInt(r2)     // Catch:{ SQLiteException -> 0x0056 }
            if (r2 == 0) goto L_0x006a
            r16 = r1
            goto L_0x006c
        L_0x006a:
            r16 = r0
        L_0x006c:
            r0 = 3
            java.lang.String r17 = r9.getString(r0)     // Catch:{ SQLiteException -> 0x0056 }
            r0 = 4
            long r19 = r9.getLong(r0)     // Catch:{ SQLiteException -> 0x0056 }
            com.google.android.gms.measurement.internal.N5 r0 = r26.l()     // Catch:{ SQLiteException -> 0x0056 }
            r1 = 5
            byte[] r1 = r9.getBlob(r1)     // Catch:{ SQLiteException -> 0x0056 }
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.J> r2 = com.google.android.gms.measurement.internal.J.CREATOR     // Catch:{ SQLiteException -> 0x0056 }
            android.os.Parcelable r0 = r0.B(r1, r2)     // Catch:{ SQLiteException -> 0x0056 }
            r18 = r0
            com.google.android.gms.measurement.internal.J r18 = (com.google.android.gms.measurement.internal.J) r18     // Catch:{ SQLiteException -> 0x0056 }
            r0 = 6
            long r21 = r9.getLong(r0)     // Catch:{ SQLiteException -> 0x0056 }
            com.google.android.gms.measurement.internal.N5 r0 = r26.l()     // Catch:{ SQLiteException -> 0x0056 }
            r1 = 7
            byte[] r1 = r9.getBlob(r1)     // Catch:{ SQLiteException -> 0x0056 }
            android.os.Parcelable r0 = r0.B(r1, r2)     // Catch:{ SQLiteException -> 0x0056 }
            com.google.android.gms.measurement.internal.J r0 = (com.google.android.gms.measurement.internal.J) r0     // Catch:{ SQLiteException -> 0x0056 }
            r1 = 8
            long r3 = r9.getLong(r1)     // Catch:{ SQLiteException -> 0x0056 }
            r1 = 9
            long r23 = r9.getLong(r1)     // Catch:{ SQLiteException -> 0x0056 }
            com.google.android.gms.measurement.internal.N5 r1 = r26.l()     // Catch:{ SQLiteException -> 0x0056 }
            r6 = 10
            byte[] r6 = r9.getBlob(r6)     // Catch:{ SQLiteException -> 0x0056 }
            android.os.Parcelable r1 = r1.B(r6, r2)     // Catch:{ SQLiteException -> 0x0056 }
            r25 = r1
            com.google.android.gms.measurement.internal.J r25 = (com.google.android.gms.measurement.internal.J) r25     // Catch:{ SQLiteException -> 0x0056 }
            com.google.android.gms.measurement.internal.P5 r13 = new com.google.android.gms.measurement.internal.P5     // Catch:{ SQLiteException -> 0x0056 }
            r1 = r13
            r2 = r28
            r6 = r12
            r1.<init>(r2, r3, r5, r6)     // Catch:{ SQLiteException -> 0x0056 }
            com.google.android.gms.measurement.internal.g r1 = new com.google.android.gms.measurement.internal.g     // Catch:{ SQLiteException -> 0x0056 }
            r10 = r1
            r11 = r27
            r14 = r21
            r21 = r0
            r22 = r23
            r24 = r25
            r10.<init>(r11, r12, r13, r14, r16, r17, r18, r19, r21, r22, r24)     // Catch:{ SQLiteException -> 0x0056 }
            boolean r0 = r9.moveToNext()     // Catch:{ SQLiteException -> 0x0056 }
            if (r0 == 0) goto L_0x00f3
            com.google.android.gms.measurement.internal.h2 r0 = r26.f()     // Catch:{ SQLiteException -> 0x0056 }
            com.google.android.gms.measurement.internal.i2 r0 = r0.E()     // Catch:{ SQLiteException -> 0x0056 }
            java.lang.String r2 = "Got multiple records for conditional property, expected one"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.C7607h2.t(r27)     // Catch:{ SQLiteException -> 0x0056 }
            com.google.android.gms.measurement.internal.e2 r4 = r26.d()     // Catch:{ SQLiteException -> 0x0056 }
            java.lang.String r4 = r4.g(r7)     // Catch:{ SQLiteException -> 0x0056 }
            r0.c(r2, r3, r4)     // Catch:{ SQLiteException -> 0x0056 }
        L_0x00f3:
            r9.close()
            return r1
        L_0x00f7:
            r0 = move-exception
            goto L_0x011a
        L_0x00f9:
            r0 = move-exception
            r9 = r8
        L_0x00fb:
            com.google.android.gms.measurement.internal.h2 r1 = r26.f()     // Catch:{ all -> 0x0052 }
            com.google.android.gms.measurement.internal.i2 r1 = r1.E()     // Catch:{ all -> 0x0052 }
            java.lang.String r2 = "Error querying conditional property"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.C7607h2.t(r27)     // Catch:{ all -> 0x0052 }
            com.google.android.gms.measurement.internal.e2 r4 = r26.d()     // Catch:{ all -> 0x0052 }
            java.lang.String r4 = r4.g(r7)     // Catch:{ all -> 0x0052 }
            r1.d(r2, r3, r4, r0)     // Catch:{ all -> 0x0052 }
            if (r9 == 0) goto L_0x0119
            r9.close()
        L_0x0119:
            return r8
        L_0x011a:
            if (r8 == 0) goto L_0x011f
            r8.close()
        L_0x011f:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C7660p.P0(java.lang.String, java.lang.String):com.google.android.gms.measurement.internal.g");
    }

    public final List<Pair<A2, Long>> R(String str, int i10, int i11) {
        long j10;
        long j11;
        int i12 = i11;
        k();
        s();
        int i13 = 1;
        C6620s.a(i10 > 0);
        C6620s.a(i12 > 0);
        C6620s.f(str);
        Cursor cursor = null;
        try {
            cursor = z().query("queue", new String[]{"rowid", "data", "retry_count"}, "app_id=?", new String[]{str}, (String) null, (String) null, "rowid", String.valueOf(i10));
            if (!cursor.moveToFirst()) {
                List<Pair<A2, Long>> emptyList = Collections.emptyList();
                cursor.close();
                return emptyList;
            }
            ArrayList arrayList = new ArrayList();
            int i14 = 0;
            while (true) {
                long j12 = cursor.getLong(0);
                try {
                    byte[] h02 = l().h0(cursor.getBlob(i13));
                    if (!arrayList.isEmpty() && h02.length + i14 > i12) {
                        break;
                    }
                    try {
                        A2.a aVar = (A2.a) N5.E(A2.H2(), h02);
                        if (!arrayList.isEmpty()) {
                            A2 a22 = (A2) ((Pair) arrayList.get(0)).first;
                            A2 a23 = (A2) ((L4) aVar.s());
                            if (!a22.f0().equals(a23.f0()) || !a22.e0().equals(a23.e0()) || a22.v0() != a23.v0() || !a22.g0().equals(a23.g0())) {
                                break;
                            }
                            Iterator<F2> it = a22.s0().iterator();
                            while (true) {
                                j10 = -1;
                                if (!it.hasNext()) {
                                    j11 = -1;
                                    break;
                                }
                                F2 next = it.next();
                                if ("_npa".equals(next.X())) {
                                    j11 = next.S();
                                    break;
                                }
                            }
                            Iterator<F2> it2 = a23.s0().iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    break;
                                }
                                F2 next2 = it2.next();
                                if ("_npa".equals(next2.X())) {
                                    j10 = next2.S();
                                    break;
                                }
                            }
                            if (j11 != j10) {
                                break;
                            }
                        }
                        if (!cursor.isNull(2)) {
                            aVar.L0(cursor.getInt(2));
                        }
                        i14 += h02.length;
                        arrayList.add(Pair.create((A2) ((L4) aVar.s()), Long.valueOf(j12)));
                    } catch (IOException e10) {
                        f().E().c("Failed to merge queued bundle. appId", C7607h2.t(str), e10);
                    }
                    if (!cursor.moveToNext() || i14 > i12) {
                        break;
                    }
                    i13 = 1;
                } catch (IOException e11) {
                    f().E().c("Failed to unzip queued bundle. appId", C7607h2.t(str), e11);
                }
            }
            cursor.close();
            return arrayList;
        } catch (SQLiteException e12) {
            f().E().c("Error querying bundles. appId", C7607h2.t(str), e12);
            List<Pair<A2, Long>> emptyList2 = Collections.emptyList();
            if (cursor != null) {
                cursor.close();
            }
            return emptyList2;
        } catch (Throwable th2) {
            if (cursor != null) {
                cursor.close();
            }
            throw th2;
        }
    }

    public final G R0(String str, String str2) {
        return Q0("events", str, str2);
    }

    public final List<C7597g> S(String str, String str2, String str3) {
        C6620s.f(str);
        k();
        s();
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(str);
        StringBuilder sb2 = new StringBuilder("app_id=?");
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(str2);
            sb2.append(" and origin=?");
        }
        if (!TextUtils.isEmpty(str3)) {
            arrayList.add(str3 + Marker.ANY_MARKER);
            sb2.append(" and name glob ?");
        }
        return U(sb2.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x0323  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x015d A[Catch:{ SQLiteException -> 0x00af }] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0161 A[Catch:{ SQLiteException -> 0x00af }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0195 A[Catch:{ SQLiteException -> 0x00af }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x01b3 A[Catch:{ SQLiteException -> 0x00af }] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x01b6 A[Catch:{ SQLiteException -> 0x00af }] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x01c5 A[Catch:{ SQLiteException -> 0x00af }] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x01e3 A[Catch:{ SQLiteException -> 0x00af }] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x01fa A[Catch:{ SQLiteException -> 0x00af }] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x01fc A[Catch:{ SQLiteException -> 0x00af }] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0256 A[Catch:{ SQLiteException -> 0x00af }] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0258 A[Catch:{ SQLiteException -> 0x00af }] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0264 A[Catch:{ SQLiteException -> 0x00af }] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0266 A[Catch:{ SQLiteException -> 0x00af }] */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x028e A[Catch:{ SQLiteException -> 0x00af }] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0291 A[Catch:{ SQLiteException -> 0x00af }] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x02a6 A[Catch:{ SQLiteException -> 0x00af }] */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x02b9 A[Catch:{ SQLiteException -> 0x00af }] */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x02f1 A[Catch:{ SQLiteException -> 0x00af }] */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x031d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.measurement.internal.C7676r2 S0(java.lang.String r52) {
        /*
            r51 = this;
            r1 = r51
            r2 = r52
            K9.C6620s.f(r52)
            r51.k()
            r51.s()
            r3 = 0
            android.database.sqlite.SQLiteDatabase r4 = r51.z()     // Catch:{ SQLiteException -> 0x0308, all -> 0x0306 }
            java.lang.String r5 = "apps"
            java.lang.String r6 = "app_instance_id"
            java.lang.String r7 = "gmp_app_id"
            java.lang.String r8 = "resettable_device_id_hash"
            java.lang.String r9 = "last_bundle_index"
            java.lang.String r10 = "last_bundle_start_timestamp"
            java.lang.String r11 = "last_bundle_end_timestamp"
            java.lang.String r12 = "app_version"
            java.lang.String r13 = "app_store"
            java.lang.String r14 = "gmp_version"
            java.lang.String r15 = "dev_cert_hash"
            java.lang.String r16 = "measurement_enabled"
            java.lang.String r17 = "day"
            java.lang.String r18 = "daily_public_events_count"
            java.lang.String r19 = "daily_events_count"
            java.lang.String r20 = "daily_conversions_count"
            java.lang.String r21 = "config_fetched_time"
            java.lang.String r22 = "failed_config_fetch_time"
            java.lang.String r23 = "app_version_int"
            java.lang.String r24 = "firebase_instance_id"
            java.lang.String r25 = "daily_error_events_count"
            java.lang.String r26 = "daily_realtime_events_count"
            java.lang.String r27 = "health_monitor_sample"
            java.lang.String r28 = "android_id"
            java.lang.String r29 = "adid_reporting_enabled"
            java.lang.String r30 = "admob_app_id"
            java.lang.String r31 = "dynamite_version"
            java.lang.String r32 = "safelisted_events"
            java.lang.String r33 = "ga_app_id"
            java.lang.String r34 = "session_stitching_token"
            java.lang.String r35 = "sgtm_upload_enabled"
            java.lang.String r36 = "target_os_version"
            java.lang.String r37 = "session_stitching_token_hash"
            java.lang.String r38 = "ad_services_version"
            java.lang.String r39 = "unmatched_first_open_without_ad_id"
            java.lang.String r40 = "npa_metadata_value"
            java.lang.String r41 = "attribution_eligibility_status"
            java.lang.String r42 = "sgtm_preview_key"
            java.lang.String r43 = "dma_consent_state"
            java.lang.String r44 = "daily_realtime_dcu_count"
            java.lang.String r45 = "bundle_delivery_index"
            java.lang.String r46 = "serialized_npa_metadata"
            java.lang.String r47 = "unmatched_pfo"
            java.lang.String r48 = "unmatched_uwa"
            java.lang.String r49 = "ad_campaign_info"
            java.lang.String r50 = "client_upload_eligibility"
            java.lang.String[] r6 = new java.lang.String[]{r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50}     // Catch:{ SQLiteException -> 0x0308, all -> 0x0306 }
            java.lang.String r7 = "app_id=?"
            java.lang.String[] r8 = new java.lang.String[]{r52}     // Catch:{ SQLiteException -> 0x0308, all -> 0x0306 }
            r10 = 0
            r11 = 0
            r9 = 0
            android.database.Cursor r4 = r4.query(r5, r6, r7, r8, r9, r10, r11)     // Catch:{ SQLiteException -> 0x0308, all -> 0x0306 }
            boolean r0 = r4.moveToFirst()     // Catch:{ SQLiteException -> 0x00af }
            if (r0 != 0) goto L_0x0089
            r4.close()
            return r3
        L_0x0089:
            com.google.android.gms.measurement.internal.r2 r0 = new com.google.android.gms.measurement.internal.r2     // Catch:{ SQLiteException -> 0x00af }
            com.google.android.gms.measurement.internal.y5 r5 = r1.f50303b     // Catch:{ SQLiteException -> 0x00af }
            com.google.android.gms.measurement.internal.P2 r5 = r5.D0()     // Catch:{ SQLiteException -> 0x00af }
            r0.<init>(r5, r2)     // Catch:{ SQLiteException -> 0x00af }
            com.google.android.gms.measurement.internal.y5 r5 = r1.f50303b     // Catch:{ SQLiteException -> 0x00af }
            com.google.android.gms.measurement.internal.q3 r5 = r5.b0(r2)     // Catch:{ SQLiteException -> 0x00af }
            com.google.android.gms.measurement.internal.q3$a r6 = com.google.android.gms.measurement.internal.C7671q3.a.ANALYTICS_STORAGE     // Catch:{ SQLiteException -> 0x00af }
            boolean r5 = r5.m(r6)     // Catch:{ SQLiteException -> 0x00af }
            r7 = 0
            if (r5 == 0) goto L_0x00b2
            java.lang.String r5 = r4.getString(r7)     // Catch:{ SQLiteException -> 0x00af }
            r0.J(r5)     // Catch:{ SQLiteException -> 0x00af }
            goto L_0x00b2
        L_0x00ab:
            r0 = move-exception
            r3 = r4
            goto L_0x0321
        L_0x00af:
            r0 = move-exception
            goto L_0x030a
        L_0x00b2:
            r5 = 1
            java.lang.String r8 = r4.getString(r5)     // Catch:{ SQLiteException -> 0x00af }
            r0.a0(r8)     // Catch:{ SQLiteException -> 0x00af }
            com.google.android.gms.measurement.internal.y5 r8 = r1.f50303b     // Catch:{ SQLiteException -> 0x00af }
            com.google.android.gms.measurement.internal.q3 r8 = r8.b0(r2)     // Catch:{ SQLiteException -> 0x00af }
            com.google.android.gms.measurement.internal.q3$a r9 = com.google.android.gms.measurement.internal.C7671q3.a.AD_STORAGE     // Catch:{ SQLiteException -> 0x00af }
            boolean r8 = r8.m(r9)     // Catch:{ SQLiteException -> 0x00af }
            if (r8 == 0) goto L_0x00d0
            r8 = 2
            java.lang.String r8 = r4.getString(r8)     // Catch:{ SQLiteException -> 0x00af }
            r0.g0(r8)     // Catch:{ SQLiteException -> 0x00af }
        L_0x00d0:
            r8 = 3
            long r8 = r4.getLong(r8)     // Catch:{ SQLiteException -> 0x00af }
            r0.B0(r8)     // Catch:{ SQLiteException -> 0x00af }
            r8 = 4
            long r8 = r4.getLong(r8)     // Catch:{ SQLiteException -> 0x00af }
            r0.D0(r8)     // Catch:{ SQLiteException -> 0x00af }
            r8 = 5
            long r8 = r4.getLong(r8)     // Catch:{ SQLiteException -> 0x00af }
            r0.z0(r8)     // Catch:{ SQLiteException -> 0x00af }
            r8 = 6
            java.lang.String r8 = r4.getString(r8)     // Catch:{ SQLiteException -> 0x00af }
            r0.T(r8)     // Catch:{ SQLiteException -> 0x00af }
            r8 = 7
            java.lang.String r8 = r4.getString(r8)     // Catch:{ SQLiteException -> 0x00af }
            r0.O(r8)     // Catch:{ SQLiteException -> 0x00af }
            r8 = 8
            long r8 = r4.getLong(r8)     // Catch:{ SQLiteException -> 0x00af }
            r0.v0(r8)     // Catch:{ SQLiteException -> 0x00af }
            r8 = 9
            long r8 = r4.getLong(r8)     // Catch:{ SQLiteException -> 0x00af }
            r0.o0(r8)     // Catch:{ SQLiteException -> 0x00af }
            r8 = 10
            boolean r9 = r4.isNull(r8)     // Catch:{ SQLiteException -> 0x00af }
            if (r9 != 0) goto L_0x011b
            int r8 = r4.getInt(r8)     // Catch:{ SQLiteException -> 0x00af }
            if (r8 == 0) goto L_0x0119
            goto L_0x011b
        L_0x0119:
            r8 = r7
            goto L_0x011c
        L_0x011b:
            r8 = r5
        L_0x011c:
            r0.K(r8)     // Catch:{ SQLiteException -> 0x00af }
            r8 = 11
            long r8 = r4.getLong(r8)     // Catch:{ SQLiteException -> 0x00af }
            r0.l0(r8)     // Catch:{ SQLiteException -> 0x00af }
            r8 = 12
            long r8 = r4.getLong(r8)     // Catch:{ SQLiteException -> 0x00af }
            r0.f0(r8)     // Catch:{ SQLiteException -> 0x00af }
            r8 = 13
            long r8 = r4.getLong(r8)     // Catch:{ SQLiteException -> 0x00af }
            r0.c0(r8)     // Catch:{ SQLiteException -> 0x00af }
            r8 = 14
            long r8 = r4.getLong(r8)     // Catch:{ SQLiteException -> 0x00af }
            r0.W(r8)     // Catch:{ SQLiteException -> 0x00af }
            r8 = 15
            long r8 = r4.getLong(r8)     // Catch:{ SQLiteException -> 0x00af }
            r0.S(r8)     // Catch:{ SQLiteException -> 0x00af }
            r8 = 16
            long r8 = r4.getLong(r8)     // Catch:{ SQLiteException -> 0x00af }
            r0.t0(r8)     // Catch:{ SQLiteException -> 0x00af }
            r8 = 17
            boolean r9 = r4.isNull(r8)     // Catch:{ SQLiteException -> 0x00af }
            if (r9 == 0) goto L_0x0161
            r8 = -2147483648(0xffffffff80000000, double:NaN)
            goto L_0x0166
        L_0x0161:
            int r8 = r4.getInt(r8)     // Catch:{ SQLiteException -> 0x00af }
            long r8 = (long) r8     // Catch:{ SQLiteException -> 0x00af }
        L_0x0166:
            r0.H(r8)     // Catch:{ SQLiteException -> 0x00af }
            r8 = 18
            java.lang.String r8 = r4.getString(r8)     // Catch:{ SQLiteException -> 0x00af }
            r0.X(r8)     // Catch:{ SQLiteException -> 0x00af }
            r8 = 19
            long r8 = r4.getLong(r8)     // Catch:{ SQLiteException -> 0x00af }
            r0.Z(r8)     // Catch:{ SQLiteException -> 0x00af }
            r8 = 20
            long r8 = r4.getLong(r8)     // Catch:{ SQLiteException -> 0x00af }
            r0.i0(r8)     // Catch:{ SQLiteException -> 0x00af }
            r8 = 21
            java.lang.String r8 = r4.getString(r8)     // Catch:{ SQLiteException -> 0x00af }
            r0.d0(r8)     // Catch:{ SQLiteException -> 0x00af }
            r8 = 23
            boolean r9 = r4.isNull(r8)     // Catch:{ SQLiteException -> 0x00af }
            if (r9 != 0) goto L_0x019e
            int r8 = r4.getInt(r8)     // Catch:{ SQLiteException -> 0x00af }
            if (r8 == 0) goto L_0x019c
            goto L_0x019e
        L_0x019c:
            r8 = r7
            goto L_0x019f
        L_0x019e:
            r8 = r5
        L_0x019f:
            r0.h(r8)     // Catch:{ SQLiteException -> 0x00af }
            r8 = 24
            java.lang.String r8 = r4.getString(r8)     // Catch:{ SQLiteException -> 0x00af }
            r0.f(r8)     // Catch:{ SQLiteException -> 0x00af }
            r8 = 25
            boolean r9 = r4.isNull(r8)     // Catch:{ SQLiteException -> 0x00af }
            if (r9 == 0) goto L_0x01b6
            r8 = 0
            goto L_0x01ba
        L_0x01b6:
            long r8 = r4.getLong(r8)     // Catch:{ SQLiteException -> 0x00af }
        L_0x01ba:
            r0.r0(r8)     // Catch:{ SQLiteException -> 0x00af }
            r8 = 26
            boolean r9 = r4.isNull(r8)     // Catch:{ SQLiteException -> 0x00af }
            if (r9 != 0) goto L_0x01d7
            java.lang.String r8 = r4.getString(r8)     // Catch:{ SQLiteException -> 0x00af }
            java.lang.String r9 = ","
            r10 = -1
            java.lang.String[] r8 = r8.split(r9, r10)     // Catch:{ SQLiteException -> 0x00af }
            java.util.List r8 = java.util.Arrays.asList(r8)     // Catch:{ SQLiteException -> 0x00af }
            r0.g(r8)     // Catch:{ SQLiteException -> 0x00af }
        L_0x01d7:
            com.google.android.gms.measurement.internal.y5 r8 = r1.f50303b     // Catch:{ SQLiteException -> 0x00af }
            com.google.android.gms.measurement.internal.q3 r8 = r8.b0(r2)     // Catch:{ SQLiteException -> 0x00af }
            boolean r6 = r8.m(r6)     // Catch:{ SQLiteException -> 0x00af }
            if (r6 == 0) goto L_0x01ec
            r6 = 28
            java.lang.String r6 = r4.getString(r6)     // Catch:{ SQLiteException -> 0x00af }
            r0.m0(r6)     // Catch:{ SQLiteException -> 0x00af }
        L_0x01ec:
            r6 = 29
            boolean r8 = r4.isNull(r6)     // Catch:{ SQLiteException -> 0x00af }
            if (r8 != 0) goto L_0x01fc
            int r6 = r4.getInt(r6)     // Catch:{ SQLiteException -> 0x00af }
            if (r6 == 0) goto L_0x01fc
            r6 = r5
            goto L_0x01fd
        L_0x01fc:
            r6 = r7
        L_0x01fd:
            r0.P(r6)     // Catch:{ SQLiteException -> 0x00af }
            r6 = 39
            long r8 = r4.getLong(r6)     // Catch:{ SQLiteException -> 0x00af }
            r0.x0(r8)     // Catch:{ SQLiteException -> 0x00af }
            r6 = 36
            java.lang.String r6 = r4.getString(r6)     // Catch:{ SQLiteException -> 0x00af }
            r0.p0(r6)     // Catch:{ SQLiteException -> 0x00af }
            r6 = 30
            long r8 = r4.getLong(r6)     // Catch:{ SQLiteException -> 0x00af }
            r0.H0(r8)     // Catch:{ SQLiteException -> 0x00af }
            r6 = 31
            long r8 = r4.getLong(r6)     // Catch:{ SQLiteException -> 0x00af }
            r0.F0(r8)     // Catch:{ SQLiteException -> 0x00af }
            boolean r6 = com.google.android.gms.internal.measurement.C7297f7.a()     // Catch:{ SQLiteException -> 0x00af }
            if (r6 == 0) goto L_0x0248
            com.google.android.gms.measurement.internal.i r6 = r51.a()     // Catch:{ SQLiteException -> 0x00af }
            com.google.android.gms.measurement.internal.Y1<java.lang.Boolean> r8 = com.google.android.gms.measurement.internal.K.f49723Q0     // Catch:{ SQLiteException -> 0x00af }
            boolean r6 = r6.F(r2, r8)     // Catch:{ SQLiteException -> 0x00af }
            if (r6 == 0) goto L_0x0248
            r6 = 32
            int r6 = r4.getInt(r6)     // Catch:{ SQLiteException -> 0x00af }
            r0.b(r6)     // Catch:{ SQLiteException -> 0x00af }
            r6 = 35
            long r8 = r4.getLong(r6)     // Catch:{ SQLiteException -> 0x00af }
            r0.N(r8)     // Catch:{ SQLiteException -> 0x00af }
        L_0x0248:
            r6 = 33
            boolean r8 = r4.isNull(r6)     // Catch:{ SQLiteException -> 0x00af }
            if (r8 != 0) goto L_0x0258
            int r6 = r4.getInt(r6)     // Catch:{ SQLiteException -> 0x00af }
            if (r6 == 0) goto L_0x0258
            r6 = r5
            goto L_0x0259
        L_0x0258:
            r6 = r7
        L_0x0259:
            r0.U(r6)     // Catch:{ SQLiteException -> 0x00af }
            r6 = 34
            boolean r8 = r4.isNull(r6)     // Catch:{ SQLiteException -> 0x00af }
            if (r8 == 0) goto L_0x0266
            r5 = r3
            goto L_0x0271
        L_0x0266:
            int r6 = r4.getInt(r6)     // Catch:{ SQLiteException -> 0x00af }
            if (r6 == 0) goto L_0x026d
            r7 = r5
        L_0x026d:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r7)     // Catch:{ SQLiteException -> 0x00af }
        L_0x0271:
            r0.d(r5)     // Catch:{ SQLiteException -> 0x00af }
            r5 = 37
            int r5 = r4.getInt(r5)     // Catch:{ SQLiteException -> 0x00af }
            r0.R(r5)     // Catch:{ SQLiteException -> 0x00af }
            r5 = 38
            int r5 = r4.getInt(r5)     // Catch:{ SQLiteException -> 0x00af }
            r0.M(r5)     // Catch:{ SQLiteException -> 0x00af }
            r5 = 40
            boolean r6 = r4.isNull(r5)     // Catch:{ SQLiteException -> 0x00af }
            if (r6 == 0) goto L_0x0291
            java.lang.String r5 = ""
            goto L_0x029b
        L_0x0291:
            java.lang.String r5 = r4.getString(r5)     // Catch:{ SQLiteException -> 0x00af }
            java.lang.Object r5 = K9.C6620s.l(r5)     // Catch:{ SQLiteException -> 0x00af }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ SQLiteException -> 0x00af }
        L_0x029b:
            r0.j0(r5)     // Catch:{ SQLiteException -> 0x00af }
            r5 = 41
            boolean r6 = r4.isNull(r5)     // Catch:{ SQLiteException -> 0x00af }
            if (r6 != 0) goto L_0x02b1
            long r5 = r4.getLong(r5)     // Catch:{ SQLiteException -> 0x00af }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ SQLiteException -> 0x00af }
            r0.e(r5)     // Catch:{ SQLiteException -> 0x00af }
        L_0x02b1:
            r5 = 42
            boolean r6 = r4.isNull(r5)     // Catch:{ SQLiteException -> 0x00af }
            if (r6 != 0) goto L_0x02c4
            long r5 = r4.getLong(r5)     // Catch:{ SQLiteException -> 0x00af }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ SQLiteException -> 0x00af }
            r0.I(r5)     // Catch:{ SQLiteException -> 0x00af }
        L_0x02c4:
            r5 = 43
            byte[] r5 = r4.getBlob(r5)     // Catch:{ SQLiteException -> 0x00af }
            r0.i(r5)     // Catch:{ SQLiteException -> 0x00af }
            com.google.android.gms.measurement.internal.i r5 = r51.a()     // Catch:{ SQLiteException -> 0x00af }
            com.google.android.gms.measurement.internal.Y1<java.lang.Boolean> r6 = com.google.android.gms.measurement.internal.K.f49711K0     // Catch:{ SQLiteException -> 0x00af }
            boolean r5 = r5.F(r2, r6)     // Catch:{ SQLiteException -> 0x00af }
            if (r5 == 0) goto L_0x02e8
            r5 = 44
            boolean r6 = r4.isNull(r5)     // Catch:{ SQLiteException -> 0x00af }
            if (r6 != 0) goto L_0x02e8
            int r5 = r4.getInt(r5)     // Catch:{ SQLiteException -> 0x00af }
            r0.G(r5)     // Catch:{ SQLiteException -> 0x00af }
        L_0x02e8:
            r0.x()     // Catch:{ SQLiteException -> 0x00af }
            boolean r5 = r4.moveToNext()     // Catch:{ SQLiteException -> 0x00af }
            if (r5 == 0) goto L_0x0302
            com.google.android.gms.measurement.internal.h2 r5 = r51.f()     // Catch:{ SQLiteException -> 0x00af }
            com.google.android.gms.measurement.internal.i2 r5 = r5.E()     // Catch:{ SQLiteException -> 0x00af }
            java.lang.String r6 = "Got multiple records for app, expected one. appId"
            java.lang.Object r7 = com.google.android.gms.measurement.internal.C7607h2.t(r52)     // Catch:{ SQLiteException -> 0x00af }
            r5.b(r6, r7)     // Catch:{ SQLiteException -> 0x00af }
        L_0x0302:
            r4.close()
            return r0
        L_0x0306:
            r0 = move-exception
            goto L_0x0321
        L_0x0308:
            r0 = move-exception
            r4 = r3
        L_0x030a:
            com.google.android.gms.measurement.internal.h2 r5 = r51.f()     // Catch:{ all -> 0x00ab }
            com.google.android.gms.measurement.internal.i2 r5 = r5.E()     // Catch:{ all -> 0x00ab }
            java.lang.String r6 = "Error querying app. appId"
            java.lang.Object r2 = com.google.android.gms.measurement.internal.C7607h2.t(r52)     // Catch:{ all -> 0x00ab }
            r5.c(r6, r2, r0)     // Catch:{ all -> 0x00ab }
            if (r4 == 0) goto L_0x0320
            r4.close()
        L_0x0320:
            return r3
        L_0x0321:
            if (r3 == 0) goto L_0x0326
            r3.close()
        L_0x0326:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C7660p.S0(java.lang.String):com.google.android.gms.measurement.internal.r2");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: android.database.Cursor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v4, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<com.google.android.gms.measurement.internal.M5> T(java.lang.String r17, sa.k0 r18, int r19) {
        /*
            r16 = this;
            com.google.android.gms.measurement.internal.i r0 = r16.a()
            com.google.android.gms.measurement.internal.Y1<java.lang.Boolean> r1 = com.google.android.gms.measurement.internal.K.f49711K0
            boolean r0 = r0.r(r1)
            if (r0 != 0) goto L_0x0011
            java.util.List r0 = java.util.Collections.emptyList()
            return r0
        L_0x0011:
            K9.C6620s.f(r17)
            r16.k()
            r16.s()
            r1 = 0
            android.database.sqlite.SQLiteDatabase r2 = r16.z()     // Catch:{ SQLiteException -> 0x0069 }
            java.lang.String r3 = "upload_queue"
            java.lang.String r4 = "rowId"
            java.lang.String r5 = "app_id"
            java.lang.String r6 = "measurement_batch"
            java.lang.String r7 = "upload_uri"
            java.lang.String r8 = "upload_headers"
            java.lang.String r9 = "upload_type"
            java.lang.String r10 = "retry_count"
            java.lang.String r11 = "creation_timestamp"
            java.lang.String r12 = "associated_row_id"
            java.lang.String[] r4 = new java.lang.String[]{r4, r5, r6, r7, r8, r9, r10, r11, r12}     // Catch:{ SQLiteException -> 0x0069 }
            r0 = r18
            java.util.List<java.lang.Integer> r0 = r0.f56129a     // Catch:{ SQLiteException -> 0x0069 }
            java.lang.String r0 = J0(r0)     // Catch:{ SQLiteException -> 0x0069 }
            java.lang.String r5 = r16.D0()     // Catch:{ SQLiteException -> 0x0069 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x0069 }
            java.lang.String r7 = "app_id=?"
            r6.<init>(r7)     // Catch:{ SQLiteException -> 0x0069 }
            r6.append(r0)     // Catch:{ SQLiteException -> 0x0069 }
            java.lang.String r0 = " AND NOT "
            r6.append(r0)     // Catch:{ SQLiteException -> 0x0069 }
            r6.append(r5)     // Catch:{ SQLiteException -> 0x0069 }
            java.lang.String r5 = r6.toString()     // Catch:{ SQLiteException -> 0x0069 }
            java.lang.String[] r6 = new java.lang.String[]{r17}     // Catch:{ SQLiteException -> 0x0069 }
            java.lang.String r9 = "creation_timestamp ASC"
            if (r19 <= 0) goto L_0x006b
            java.lang.String r0 = java.lang.String.valueOf(r19)     // Catch:{ SQLiteException -> 0x0069 }
            r10 = r0
            goto L_0x006c
        L_0x0067:
            r0 = move-exception
            goto L_0x00d1
        L_0x0069:
            r0 = move-exception
            goto L_0x00b8
        L_0x006b:
            r10 = r1
        L_0x006c:
            r7 = 0
            r8 = 0
            android.database.Cursor r1 = r2.query(r3, r4, r5, r6, r7, r8, r9, r10)     // Catch:{ SQLiteException -> 0x0069 }
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x0069 }
            r0.<init>()     // Catch:{ SQLiteException -> 0x0069 }
        L_0x0077:
            boolean r2 = r1.moveToNext()     // Catch:{ SQLiteException -> 0x0069 }
            if (r2 == 0) goto L_0x00b4
            r2 = 0
            long r5 = r1.getLong(r2)     // Catch:{ SQLiteException -> 0x0069 }
            r2 = 2
            byte[] r7 = r1.getBlob(r2)     // Catch:{ SQLiteException -> 0x0069 }
            r2 = 3
            java.lang.String r8 = r1.getString(r2)     // Catch:{ SQLiteException -> 0x0069 }
            r2 = 4
            java.lang.String r9 = r1.getString(r2)     // Catch:{ SQLiteException -> 0x0069 }
            r2 = 5
            int r10 = r1.getInt(r2)     // Catch:{ SQLiteException -> 0x0069 }
            r2 = 6
            int r11 = r1.getInt(r2)     // Catch:{ SQLiteException -> 0x0069 }
            r2 = 7
            long r12 = r1.getLong(r2)     // Catch:{ SQLiteException -> 0x0069 }
            r2 = 8
            long r14 = r1.getLong(r2)     // Catch:{ SQLiteException -> 0x0069 }
            r3 = r16
            r4 = r17
            com.google.android.gms.measurement.internal.M5 r2 = r3.N(r4, r5, r7, r8, r9, r10, r11, r12, r14)     // Catch:{ SQLiteException -> 0x0069 }
            if (r2 == 0) goto L_0x0077
            r0.add(r2)     // Catch:{ SQLiteException -> 0x0069 }
            goto L_0x0077
        L_0x00b4:
            r1.close()
            return r0
        L_0x00b8:
            com.google.android.gms.measurement.internal.h2 r2 = r16.f()     // Catch:{ all -> 0x0067 }
            com.google.android.gms.measurement.internal.i2 r2 = r2.E()     // Catch:{ all -> 0x0067 }
            java.lang.String r3 = "Error to querying MeasurementBatch from upload_queue. appId"
            r4 = r17
            r2.c(r3, r4, r0)     // Catch:{ all -> 0x0067 }
            java.util.List r0 = java.util.Collections.emptyList()     // Catch:{ all -> 0x0067 }
            if (r1 == 0) goto L_0x00d0
            r1.close()
        L_0x00d0:
            return r0
        L_0x00d1:
            if (r1 == 0) goto L_0x00d6
            r1.close()
        L_0x00d6:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C7660p.T(java.lang.String, sa.k0, int):java.util.List");
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0089  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.measurement.internal.r T0(java.lang.String r10) {
        /*
            r9 = this;
            K9.C6620s.f(r10)
            r9.k()
            r9.s()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r9.z()     // Catch:{ SQLiteException -> 0x006e, all -> 0x006c }
            java.lang.String r2 = "apps"
            java.lang.String r3 = "remote_config"
            java.lang.String r4 = "config_last_modified_time"
            java.lang.String r5 = "e_tag"
            java.lang.String[] r3 = new java.lang.String[]{r3, r4, r5}     // Catch:{ SQLiteException -> 0x006e, all -> 0x006c }
            java.lang.String r4 = "app_id=?"
            java.lang.String[] r5 = new java.lang.String[]{r10}     // Catch:{ SQLiteException -> 0x006e, all -> 0x006c }
            r7 = 0
            r8 = 0
            r6 = 0
            android.database.Cursor r1 = r1.query(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ SQLiteException -> 0x006e, all -> 0x006c }
            boolean r2 = r1.moveToFirst()     // Catch:{ SQLiteException -> 0x005b }
            if (r2 != 0) goto L_0x0031
            r1.close()
            return r0
        L_0x0031:
            r2 = 0
            byte[] r2 = r1.getBlob(r2)     // Catch:{ SQLiteException -> 0x005b }
            r3 = 1
            java.lang.String r3 = r1.getString(r3)     // Catch:{ SQLiteException -> 0x005b }
            r4 = 2
            java.lang.String r4 = r1.getString(r4)     // Catch:{ SQLiteException -> 0x005b }
            boolean r5 = r1.moveToNext()     // Catch:{ SQLiteException -> 0x005b }
            if (r5 == 0) goto L_0x005d
            com.google.android.gms.measurement.internal.h2 r5 = r9.f()     // Catch:{ SQLiteException -> 0x005b }
            com.google.android.gms.measurement.internal.i2 r5 = r5.E()     // Catch:{ SQLiteException -> 0x005b }
            java.lang.String r6 = "Got multiple records for app config, expected one. appId"
            java.lang.Object r7 = com.google.android.gms.measurement.internal.C7607h2.t(r10)     // Catch:{ SQLiteException -> 0x005b }
            r5.b(r6, r7)     // Catch:{ SQLiteException -> 0x005b }
            goto L_0x005d
        L_0x0058:
            r10 = move-exception
            r0 = r1
            goto L_0x0087
        L_0x005b:
            r2 = move-exception
            goto L_0x0070
        L_0x005d:
            if (r2 != 0) goto L_0x0063
            r1.close()
            return r0
        L_0x0063:
            com.google.android.gms.measurement.internal.r r5 = new com.google.android.gms.measurement.internal.r     // Catch:{ SQLiteException -> 0x005b }
            r5.<init>(r2, r3, r4)     // Catch:{ SQLiteException -> 0x005b }
            r1.close()
            return r5
        L_0x006c:
            r10 = move-exception
            goto L_0x0087
        L_0x006e:
            r2 = move-exception
            r1 = r0
        L_0x0070:
            com.google.android.gms.measurement.internal.h2 r3 = r9.f()     // Catch:{ all -> 0x0058 }
            com.google.android.gms.measurement.internal.i2 r3 = r3.E()     // Catch:{ all -> 0x0058 }
            java.lang.String r4 = "Error querying remote config. appId"
            java.lang.Object r10 = com.google.android.gms.measurement.internal.C7607h2.t(r10)     // Catch:{ all -> 0x0058 }
            r3.c(r4, r10, r2)     // Catch:{ all -> 0x0058 }
            if (r1 == 0) goto L_0x0086
            r1.close()
        L_0x0086:
            return r0
        L_0x0087:
            if (r0 == 0) goto L_0x008c
            r0.close()
        L_0x008c:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C7660p.T0(java.lang.String):com.google.android.gms.measurement.internal.r");
    }

    public final List<C7597g> U(String str, String[] strArr) {
        k();
        s();
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            cursor = z().query("conditional_properties", new String[]{"app_id", "origin", "name", "value", "active", "trigger_event_name", "trigger_timeout", "timed_out_event", "creation_timestamp", "triggered_event", "triggered_timestamp", "time_to_live", "expired_event"}, str, strArr, (String) null, (String) null, "rowid", "1001");
            if (!cursor.moveToFirst()) {
                cursor.close();
                return arrayList;
            }
            while (true) {
                if (arrayList.size() < 1000) {
                    boolean z10 = false;
                    String string = cursor.getString(0);
                    String string2 = cursor.getString(1);
                    String string3 = cursor.getString(2);
                    Object O10 = O(cursor, 3);
                    if (cursor.getInt(4) != 0) {
                        z10 = true;
                    }
                    String string4 = cursor.getString(5);
                    long j10 = cursor.getLong(6);
                    N5 l10 = l();
                    byte[] blob = cursor.getBlob(7);
                    Parcelable.Creator creator = J.CREATOR;
                    boolean z11 = z10;
                    C7597g gVar = r3;
                    C7597g gVar2 = new C7597g(string, string2, new P5(string3, cursor.getLong(10), O10, string2), cursor.getLong(8), z11, string4, (J) l10.B(blob, creator), j10, (J) l().B(cursor.getBlob(9), creator), cursor.getLong(11), (J) l().B(cursor.getBlob(12), creator));
                    arrayList.add(gVar);
                    if (!cursor.moveToNext()) {
                        break;
                    }
                } else {
                    f().E().b("Read more than the max allowed conditional properties, ignoring extra", 1000);
                    break;
                }
            }
            cursor.close();
            return arrayList;
        } catch (SQLiteException e10) {
            f().E().b("Error querying conditional user property value", e10);
            List<C7597g> emptyList = Collections.emptyList();
            if (cursor != null) {
                cursor.close();
            }
            return emptyList;
        } catch (Throwable th2) {
            if (cursor != null) {
                cursor.close();
            }
            throw th2;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0097  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.measurement.internal.R5 U0(java.lang.String r11, java.lang.String r12) {
        /*
            r10 = this;
            K9.C6620s.f(r11)
            K9.C6620s.f(r12)
            r10.k()
            r10.s()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r10.z()     // Catch:{ SQLiteException -> 0x0074, all -> 0x0072 }
            java.lang.String r2 = "user_attributes"
            java.lang.String r3 = "set_timestamp"
            java.lang.String r4 = "value"
            java.lang.String r5 = "origin"
            java.lang.String[] r3 = new java.lang.String[]{r3, r4, r5}     // Catch:{ SQLiteException -> 0x0074, all -> 0x0072 }
            java.lang.String r4 = "app_id=? and name=?"
            java.lang.String[] r5 = new java.lang.String[]{r11, r12}     // Catch:{ SQLiteException -> 0x0074, all -> 0x0072 }
            r7 = 0
            r8 = 0
            r6 = 0
            android.database.Cursor r1 = r1.query(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ SQLiteException -> 0x0074, all -> 0x0072 }
            boolean r2 = r1.moveToFirst()     // Catch:{ SQLiteException -> 0x006c }
            if (r2 != 0) goto L_0x0034
            r1.close()
            return r0
        L_0x0034:
            r2 = 0
            long r7 = r1.getLong(r2)     // Catch:{ SQLiteException -> 0x006c }
            r2 = 1
            java.lang.Object r9 = r10.O(r1, r2)     // Catch:{ SQLiteException -> 0x006c }
            if (r9 != 0) goto L_0x0044
            r1.close()
            return r0
        L_0x0044:
            r2 = 2
            java.lang.String r5 = r1.getString(r2)     // Catch:{ SQLiteException -> 0x006c }
            com.google.android.gms.measurement.internal.R5 r2 = new com.google.android.gms.measurement.internal.R5     // Catch:{ SQLiteException -> 0x006c }
            r3 = r2
            r4 = r11
            r6 = r12
            r3.<init>(r4, r5, r6, r7, r9)     // Catch:{ SQLiteException -> 0x006c }
            boolean r3 = r1.moveToNext()     // Catch:{ SQLiteException -> 0x006c }
            if (r3 == 0) goto L_0x006e
            com.google.android.gms.measurement.internal.h2 r3 = r10.f()     // Catch:{ SQLiteException -> 0x006c }
            com.google.android.gms.measurement.internal.i2 r3 = r3.E()     // Catch:{ SQLiteException -> 0x006c }
            java.lang.String r4 = "Got multiple records for user property, expected one. appId"
            java.lang.Object r5 = com.google.android.gms.measurement.internal.C7607h2.t(r11)     // Catch:{ SQLiteException -> 0x006c }
            r3.b(r4, r5)     // Catch:{ SQLiteException -> 0x006c }
            goto L_0x006e
        L_0x0069:
            r11 = move-exception
            r0 = r1
            goto L_0x0095
        L_0x006c:
            r2 = move-exception
            goto L_0x0076
        L_0x006e:
            r1.close()
            return r2
        L_0x0072:
            r11 = move-exception
            goto L_0x0095
        L_0x0074:
            r2 = move-exception
            r1 = r0
        L_0x0076:
            com.google.android.gms.measurement.internal.h2 r3 = r10.f()     // Catch:{ all -> 0x0069 }
            com.google.android.gms.measurement.internal.i2 r3 = r3.E()     // Catch:{ all -> 0x0069 }
            java.lang.String r4 = "Error querying user property. appId"
            java.lang.Object r11 = com.google.android.gms.measurement.internal.C7607h2.t(r11)     // Catch:{ all -> 0x0069 }
            com.google.android.gms.measurement.internal.e2 r5 = r10.d()     // Catch:{ all -> 0x0069 }
            java.lang.String r12 = r5.g(r12)     // Catch:{ all -> 0x0069 }
            r3.d(r4, r11, r12, r2)     // Catch:{ all -> 0x0069 }
            if (r1 == 0) goto L_0x0094
            r1.close()
        L_0x0094:
            return r0
        L_0x0095:
            if (r0 == 0) goto L_0x009a
            r0.close()
        L_0x009a:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C7660p.U0(java.lang.String, java.lang.String):com.google.android.gms.measurement.internal.R5");
    }

    public final C V0(String str) {
        C6620s.l(str);
        k();
        s();
        return C.c(Q("select dma_consent_settings from consent_settings where app_id=? limit 1;", new String[]{str}, ""));
    }

    public final void W(G g10) {
        a0("events", g10);
    }

    /* access modifiers changed from: package-private */
    public final Map<Integer, List<U1>> W0(String str, String str2) {
        s();
        k();
        C6620s.f(str);
        C6620s.f(str2);
        C5445a aVar = new C5445a();
        Cursor cursor = null;
        try {
            cursor = z().query("event_filters", new String[]{"audience_id", "data"}, "app_id=? AND event_name=?", new String[]{str, str2}, (String) null, (String) null, (String) null);
            if (!cursor.moveToFirst()) {
                Map<Integer, List<U1>> emptyMap = Collections.emptyMap();
                cursor.close();
                return emptyMap;
            }
            do {
                try {
                    U1 u12 = (U1) ((L4) ((U1.a) N5.E(U1.N(), cursor.getBlob(1))).s());
                    int i10 = cursor.getInt(0);
                    List list = (List) aVar.get(Integer.valueOf(i10));
                    if (list == null) {
                        list = new ArrayList();
                        aVar.put(Integer.valueOf(i10), list);
                    }
                    list.add(u12);
                } catch (IOException e10) {
                    f().E().c("Failed to merge filter. appId", C7607h2.t(str), e10);
                }
            } while (cursor.moveToNext());
            cursor.close();
            return aVar;
        } catch (SQLiteException e11) {
            f().E().c("Database error querying filters. appId", C7607h2.t(str), e11);
            Map<Integer, List<U1>> emptyMap2 = Collections.emptyMap();
            if (cursor != null) {
                cursor.close();
            }
            return emptyMap2;
        } catch (Throwable th2) {
            if (cursor != null) {
                cursor.close();
            }
            throw th2;
        }
    }

    public final void X(C7676r2 r2Var, boolean z10, boolean z11) {
        C6620s.l(r2Var);
        k();
        s();
        String l10 = r2Var.l();
        C6620s.l(l10);
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", l10);
        if (z10) {
            contentValues.put("app_instance_id", (String) null);
        } else if (this.f50303b.b0(l10).m(C7671q3.a.ANALYTICS_STORAGE)) {
            contentValues.put("app_instance_id", r2Var.m());
        }
        contentValues.put("gmp_app_id", r2Var.q());
        if (this.f50303b.b0(l10).m(C7671q3.a.AD_STORAGE)) {
            contentValues.put("resettable_device_id_hash", r2Var.s());
        }
        contentValues.put("last_bundle_index", Long.valueOf(r2Var.G0()));
        contentValues.put("last_bundle_start_timestamp", Long.valueOf(r2Var.I0()));
        contentValues.put("last_bundle_end_timestamp", Long.valueOf(r2Var.E0()));
        contentValues.put("app_version", r2Var.o());
        contentValues.put("app_store", r2Var.n());
        contentValues.put("gmp_version", Long.valueOf(r2Var.A0()));
        contentValues.put("dev_cert_hash", Long.valueOf(r2Var.u0()));
        contentValues.put("measurement_enabled", Boolean.valueOf(r2Var.A()));
        contentValues.put("day", Long.valueOf(r2Var.s0()));
        contentValues.put("daily_public_events_count", Long.valueOf(r2Var.n0()));
        contentValues.put("daily_events_count", Long.valueOf(r2Var.k0()));
        contentValues.put("daily_conversions_count", Long.valueOf(r2Var.e0()));
        contentValues.put("config_fetched_time", Long.valueOf(r2Var.b0()));
        contentValues.put("failed_config_fetch_time", Long.valueOf(r2Var.y0()));
        contentValues.put("app_version_int", Long.valueOf(r2Var.V()));
        contentValues.put("firebase_instance_id", r2Var.p());
        contentValues.put("daily_error_events_count", Long.valueOf(r2Var.h0()));
        contentValues.put("daily_realtime_events_count", Long.valueOf(r2Var.q0()));
        contentValues.put("health_monitor_sample", r2Var.r());
        contentValues.put("android_id", 0L);
        contentValues.put("adid_reporting_enabled", Boolean.valueOf(r2Var.z()));
        contentValues.put("admob_app_id", r2Var.j());
        contentValues.put("dynamite_version", Long.valueOf(r2Var.w0()));
        if (this.f50303b.b0(l10).m(C7671q3.a.ANALYTICS_STORAGE)) {
            contentValues.put("session_stitching_token", r2Var.u());
        }
        contentValues.put("sgtm_upload_enabled", Boolean.valueOf(r2Var.C()));
        contentValues.put("target_os_version", Long.valueOf(r2Var.K0()));
        contentValues.put("session_stitching_token_hash", Long.valueOf(r2Var.J0()));
        if (C7297f7.a() && a().F(l10, K.f49723Q0)) {
            contentValues.put("ad_services_version", Integer.valueOf(r2Var.a()));
            contentValues.put("attribution_eligibility_status", Long.valueOf(r2Var.Y()));
        }
        contentValues.put("unmatched_first_open_without_ad_id", Boolean.valueOf(r2Var.D()));
        contentValues.put("npa_metadata_value", r2Var.L0());
        contentValues.put("bundle_delivery_index", Long.valueOf(r2Var.C0()));
        contentValues.put("sgtm_preview_key", r2Var.v());
        contentValues.put("dma_consent_state", Integer.valueOf(r2Var.Q()));
        contentValues.put("daily_realtime_dcu_count", Integer.valueOf(r2Var.L()));
        contentValues.put("serialized_npa_metadata", r2Var.t());
        if (a().F(l10, K.f49711K0)) {
            contentValues.put("client_upload_eligibility", Integer.valueOf(r2Var.F()));
        }
        List<String> w10 = r2Var.w();
        if (w10 != null) {
            if (w10.isEmpty()) {
                f().J().b("Safelisted events should not be an empty list. appId", l10);
            } else {
                contentValues.put("safelisted_events", TextUtils.join(",", w10));
            }
        }
        if (N6.a() && a().r(K.f49701F0) && !contentValues.containsKey("safelisted_events")) {
            contentValues.put("safelisted_events", (String) null);
        }
        contentValues.put("unmatched_pfo", r2Var.M0());
        contentValues.put("unmatched_uwa", r2Var.N0());
        contentValues.put("ad_campaign_info", r2Var.E());
        try {
            SQLiteDatabase z12 = z();
            if (((long) z12.update("apps", contentValues, "app_id = ?", new String[]{l10})) == 0 && z12.insertWithOnConflict("apps", (String) null, contentValues, 5) == -1) {
                f().E().b("Failed to insert/update app (got -1). appId", C7607h2.t(l10));
            }
        } catch (SQLiteException e10) {
            f().E().c("Error storing app. appId", C7607h2.t(l10), e10);
        }
    }

    public final C7671q3 X0(String str) {
        C6620s.l(str);
        k();
        s();
        return C7671q3.p(Q("select storage_consent_at_bundling from consent_settings where app_id=? limit 1;", new String[]{str}, ""));
    }

    public final void Y(Long l10) {
        k();
        s();
        C6620s.l(l10);
        if (a().r(K.f49707I0)) {
            try {
                if (z().delete("upload_queue", "rowid=?", new String[]{String.valueOf(l10)}) != 1) {
                    f().J().a("Deleted fewer rows from upload_queue than expected");
                }
            } catch (SQLiteException e10) {
                f().E().b("Failed to delete a MeasurementBatch in a upload_queue table", e10);
                throw e10;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final Map<Integer, List<X1>> Y0(String str, String str2) {
        s();
        k();
        C6620s.f(str);
        C6620s.f(str2);
        C5445a aVar = new C5445a();
        Cursor cursor = null;
        try {
            cursor = z().query("property_filters", new String[]{"audience_id", "data"}, "app_id=? AND property_name=?", new String[]{str, str2}, (String) null, (String) null, (String) null);
            if (!cursor.moveToFirst()) {
                Map<Integer, List<X1>> emptyMap = Collections.emptyMap();
                cursor.close();
                return emptyMap;
            }
            do {
                try {
                    X1 x12 = (X1) ((L4) ((X1.a) N5.E(X1.L(), cursor.getBlob(1))).s());
                    int i10 = cursor.getInt(0);
                    List list = (List) aVar.get(Integer.valueOf(i10));
                    if (list == null) {
                        list = new ArrayList();
                        aVar.put(Integer.valueOf(i10), list);
                    }
                    list.add(x12);
                } catch (IOException e10) {
                    f().E().c("Failed to merge filter", C7607h2.t(str), e10);
                }
            } while (cursor.moveToNext());
            cursor.close();
            return aVar;
        } catch (SQLiteException e11) {
            f().E().c("Database error querying filters. appId", C7607h2.t(str), e11);
            Map<Integer, List<X1>> emptyMap2 = Collections.emptyMap();
            if (cursor != null) {
                cursor.close();
            }
            return emptyMap2;
        } catch (Throwable th2) {
            if (cursor != null) {
                cursor.close();
            }
            throw th2;
        }
    }

    public final void Z(String str, C c10) {
        C6620s.l(str);
        C6620s.l(c10);
        k();
        s();
        C7671q3 Z02 = Z0(str);
        C7671q3 q3Var = C7671q3.f50297c;
        if (Z02 == q3Var) {
            M0(str, q3Var);
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("dma_consent_settings", c10.j());
        d0("consent_settings", "app_id", contentValues);
    }

    public final C7671q3 Z0(String str) {
        C6620s.l(str);
        k();
        s();
        C7671q3 q3Var = (C7671q3) P("select consent_state, consent_source from consent_settings where app_id=? limit 1;", new String[]{str}, new C7653o());
        return q3Var == null ? C7671q3.f50297c : q3Var;
    }

    public final void a1(String str, String str2) {
        C6620s.f(str);
        C6620s.f(str2);
        k();
        s();
        try {
            z().delete("user_attributes", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e10) {
            f().E().d("Error deleting user property. appId", C7607h2.t(str), d().g(str2), e10);
        }
    }

    public final void b0(String str, C7671q3 q3Var) {
        C6620s.l(str);
        C6620s.l(q3Var);
        k();
        s();
        M0(str, Z0(str));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("storage_consent_at_bundling", q3Var.v());
        d0("consent_settings", "app_id", contentValues);
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x00e8  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00f0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.measurement.internal.M5 b1(java.lang.String r26) {
        /*
            r25 = this;
            r14 = r26
            K9.C6620s.f(r26)
            r25.k()
            r25.s()
            com.google.android.gms.measurement.internal.i r0 = r25.a()
            com.google.android.gms.measurement.internal.Y1<java.lang.Boolean> r1 = com.google.android.gms.measurement.internal.K.f49707I0
            boolean r0 = r0.r(r1)
            r15 = 0
            if (r0 != 0) goto L_0x0019
            return r15
        L_0x0019:
            com.google.android.gms.measurement.internal.i r0 = r25.a()
            com.google.android.gms.measurement.internal.Y1<java.lang.Boolean> r1 = com.google.android.gms.measurement.internal.K.f49711K0
            boolean r0 = r0.r(r1)
            r1 = 0
            if (r0 == 0) goto L_0x0045
            sa.X r0 = sa.X.GOOGLE_SIGNAL
            sa.X[] r0 = new sa.X[]{r0}
            sa.k0 r0 = sa.k0.x(r0)
            r2 = 1
            r12 = r25
            java.util.List r0 = r12.T(r14, r0, r2)
            boolean r2 = r0.isEmpty()
            if (r2 == 0) goto L_0x003e
            return r15
        L_0x003e:
            java.lang.Object r0 = r0.get(r1)
            com.google.android.gms.measurement.internal.M5 r0 = (com.google.android.gms.measurement.internal.M5) r0
            return r0
        L_0x0045:
            r12 = r25
            android.database.sqlite.SQLiteDatabase r2 = r25.z()     // Catch:{ SQLiteException -> 0x00d7, all -> 0x00d5 }
            java.lang.String r3 = "upload_queue"
            java.lang.String r16 = "rowId"
            java.lang.String r17 = "app_id"
            java.lang.String r18 = "measurement_batch"
            java.lang.String r19 = "upload_uri"
            java.lang.String r20 = "upload_headers"
            java.lang.String r21 = "upload_type"
            java.lang.String r22 = "retry_count"
            java.lang.String r23 = "creation_timestamp"
            java.lang.String r24 = "associated_row_id"
            java.lang.String[] r4 = new java.lang.String[]{r16, r17, r18, r19, r20, r21, r22, r23, r24}     // Catch:{ SQLiteException -> 0x00d7, all -> 0x00d5 }
            java.lang.String r0 = r25.D0()     // Catch:{ SQLiteException -> 0x00d7, all -> 0x00d5 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x00d7, all -> 0x00d5 }
            java.lang.String r6 = "app_id=? AND NOT "
            r5.<init>(r6)     // Catch:{ SQLiteException -> 0x00d7, all -> 0x00d5 }
            r5.append(r0)     // Catch:{ SQLiteException -> 0x00d7, all -> 0x00d5 }
            java.lang.String r5 = r5.toString()     // Catch:{ SQLiteException -> 0x00d7, all -> 0x00d5 }
            java.lang.String[] r6 = new java.lang.String[]{r26}     // Catch:{ SQLiteException -> 0x00d7, all -> 0x00d5 }
            java.lang.String r9 = "creation_timestamp ASC"
            java.lang.String r10 = "1"
            r7 = 0
            r8 = 0
            android.database.Cursor r13 = r2.query(r3, r4, r5, r6, r7, r8, r9, r10)     // Catch:{ SQLiteException -> 0x00d7, all -> 0x00d5 }
            boolean r0 = r13.moveToFirst()     // Catch:{ SQLiteException -> 0x00d1, all -> 0x00cd }
            if (r0 != 0) goto L_0x008d
            r13.close()
            return r15
        L_0x008d:
            long r3 = r13.getLong(r1)     // Catch:{ SQLiteException -> 0x00d1, all -> 0x00cd }
            r0 = 2
            byte[] r5 = r13.getBlob(r0)     // Catch:{ SQLiteException -> 0x00d1, all -> 0x00cd }
            r0 = 3
            java.lang.String r6 = r13.getString(r0)     // Catch:{ SQLiteException -> 0x00d1, all -> 0x00cd }
            r0 = 4
            java.lang.String r7 = r13.getString(r0)     // Catch:{ SQLiteException -> 0x00d1, all -> 0x00cd }
            r0 = 5
            int r8 = r13.getInt(r0)     // Catch:{ SQLiteException -> 0x00d1, all -> 0x00cd }
            r0 = 6
            int r9 = r13.getInt(r0)     // Catch:{ SQLiteException -> 0x00d1, all -> 0x00cd }
            r0 = 7
            long r10 = r13.getLong(r0)     // Catch:{ SQLiteException -> 0x00d1, all -> 0x00cd }
            r0 = 8
            long r16 = r13.getLong(r0)     // Catch:{ SQLiteException -> 0x00d1, all -> 0x00cd }
            r1 = r25
            r2 = r26
            r18 = r13
            r12 = r16
            com.google.android.gms.measurement.internal.M5 r0 = r1.N(r2, r3, r5, r6, r7, r8, r9, r10, r12)     // Catch:{ SQLiteException -> 0x00c9, all -> 0x00c5 }
            r18.close()
            return r0
        L_0x00c5:
            r0 = move-exception
        L_0x00c6:
            r15 = r18
            goto L_0x00ee
        L_0x00c9:
            r0 = move-exception
            r13 = r18
            goto L_0x00d9
        L_0x00cd:
            r0 = move-exception
            r18 = r13
            goto L_0x00c6
        L_0x00d1:
            r0 = move-exception
            r18 = r13
            goto L_0x00d9
        L_0x00d5:
            r0 = move-exception
            goto L_0x00ee
        L_0x00d7:
            r0 = move-exception
            r13 = r15
        L_0x00d9:
            com.google.android.gms.measurement.internal.h2 r1 = r25.f()     // Catch:{ all -> 0x00ec }
            com.google.android.gms.measurement.internal.i2 r1 = r1.E()     // Catch:{ all -> 0x00ec }
            java.lang.String r2 = "Error to querying MeasurementBatch from upload_queue. appId"
            r1.c(r2, r14, r0)     // Catch:{ all -> 0x00ec }
            if (r13 == 0) goto L_0x00eb
            r13.close()
        L_0x00eb:
            return r15
        L_0x00ec:
            r0 = move-exception
            r15 = r13
        L_0x00ee:
            if (r15 == 0) goto L_0x00f3
            r15.close()
        L_0x00f3:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C7660p.b1(java.lang.String):com.google.android.gms.measurement.internal.M5");
    }

    public final void c0(String str, Long l10, String str2, Bundle bundle) {
        A2 H02;
        String str3 = str;
        C6620s.l(bundle);
        k();
        s();
        C7701v vVar = (!a().r(K.f49744a1) || l10 == null) ? new C7701v(this, str3) : new C7701v(this, str3, l10.longValue());
        List<C7687t> a10 = vVar.a();
        while (!a10.isEmpty()) {
            for (C7687t next : a10) {
                if (!TextUtils.isEmpty(str2) && (H02 = H0(str3, next.f50400b)) != null) {
                    Iterator<F2> it = H02.s0().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (it.next().X().equals(str2)) {
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
                String str4 = str2;
                N5 l11 = l();
                C7427v2 v2Var = next.f50402d;
                Bundle bundle2 = new Bundle();
                for (C7443x2 next2 : v2Var.Y()) {
                    if (next2.c0()) {
                        bundle2.putDouble(next2.Z(), next2.J());
                    } else if (next2.d0()) {
                        bundle2.putFloat(next2.Z(), next2.Q());
                    } else if (next2.e0()) {
                        bundle2.putLong(next2.Z(), next2.V());
                    } else if (next2.g0()) {
                        bundle2.putString(next2.Z(), next2.a0());
                    } else if (!next2.b0().isEmpty()) {
                        bundle2.putParcelableArray(next2.Z(), N5.g0(next2.b0()));
                    } else {
                        l11.f().E().b("Unexpected parameter type for parameter", next2);
                    }
                }
                String string = bundle2.getString("_o");
                bundle2.remove("_o");
                String X10 = v2Var.X();
                if (string == null) {
                    string = "";
                }
                C7628k2 k2Var = new C7628k2(X10, string, bundle2, v2Var.U());
                h().L(k2Var.f50206d, bundle);
                g0(next.f50399a, new D(this.f50228a, k2Var.f50204b, str, next.f50402d.X(), next.f50402d.U(), next.f50402d.T(), k2Var.f50206d), next.f50400b, next.f50401c);
                str3 = str;
            }
            a10 = vVar.a();
            str3 = str;
        }
    }

    public final boolean c1(String str, String str2) {
        return G0("select count(1) from raw_events where app_id = ? and name = ?", new String[]{str, str2}) > 0;
    }

    public final List<C7645m5> d1(String str) {
        C6620s.f(str);
        k();
        s();
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            cursor = z().query("trigger_uris", new String[]{"trigger_uri", "timestamp_millis", "source"}, "app_id=?", new String[]{str}, (String) null, (String) null, "rowid", (String) null);
            if (!cursor.moveToFirst()) {
                cursor.close();
                return arrayList;
            }
            do {
                String string = cursor.getString(0);
                if (string == null) {
                    string = "";
                }
                arrayList.add(new C7645m5(string, cursor.getLong(1), cursor.getInt(2)));
            } while (cursor.moveToNext());
            cursor.close();
            return arrayList;
        } catch (SQLiteException e10) {
            f().E().c("Error querying trigger uris. appId", C7607h2.t(str), e10);
            List<C7645m5> emptyList = Collections.emptyList();
            if (cursor != null) {
                cursor.close();
            }
            return emptyList;
        } catch (Throwable th2) {
            if (cursor != null) {
                cursor.close();
            }
            throw th2;
        }
    }

    /* access modifiers changed from: package-private */
    public final void e0(String str, List<T1> list) {
        boolean z10;
        boolean z11;
        String str2 = str;
        List<T1> list2 = list;
        C6620s.l(list);
        for (int i10 = 0; i10 < list.size(); i10++) {
            T1.a aVar = (T1.a) list2.get(i10).A();
            if (aVar.z() != 0) {
                for (int i11 = 0; i11 < aVar.z(); i11++) {
                    U1.a aVar2 = (U1.a) aVar.D(i11).A();
                    U1.a aVar3 = (U1.a) ((L4.a) aVar2.clone());
                    String b10 = H.b(aVar2.E());
                    if (b10 != null) {
                        aVar3.C(b10);
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    for (int i12 = 0; i12 < aVar2.z(); i12++) {
                        V1 D10 = aVar2.D(i12);
                        String a10 = G.a(D10.O());
                        if (a10 != null) {
                            aVar3.A(i12, (V1) ((L4) ((V1.a) D10.A()).z(a10).s()));
                            z11 = true;
                        }
                    }
                    if (z11) {
                        T1.a A10 = aVar.A(i11, aVar3);
                        list2.set(i10, (T1) ((L4) A10.s()));
                        aVar = A10;
                    }
                }
            }
            if (aVar.E() != 0) {
                for (int i13 = 0; i13 < aVar.E(); i13++) {
                    X1 G10 = aVar.G(i13);
                    String a11 = J.a(G10.N());
                    if (a11 != null) {
                        aVar = aVar.C(i13, ((X1.a) G10.A()).z(a11));
                        list2.set(i10, (T1) ((L4) aVar.s()));
                    }
                }
            }
        }
        s();
        k();
        C6620s.f(str);
        C6620s.l(list);
        SQLiteDatabase z12 = z();
        z12.beginTransaction();
        try {
            s();
            k();
            C6620s.f(str);
            SQLiteDatabase z13 = z();
            z13.delete("property_filters", "app_id=?", new String[]{str});
            z13.delete("event_filters", "app_id=?", new String[]{str});
            for (T1 next : list) {
                s();
                k();
                C6620s.f(str);
                C6620s.l(next);
                if (!next.S()) {
                    f().J().b("Audience with no ID. appId", C7607h2.t(str));
                } else {
                    int m10 = next.m();
                    Iterator<U1> it = next.Q().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (!it.next().W()) {
                                f().J().c("Event filter with no ID. Audience definition ignored. appId, audienceId", C7607h2.t(str), Integer.valueOf(m10));
                                break;
                            }
                        } else {
                            Iterator<X1> it2 = next.R().iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    if (!it2.next().R()) {
                                        f().J().c("Property filter with no ID. Audience definition ignored. appId, audienceId", C7607h2.t(str), Integer.valueOf(m10));
                                        break;
                                    }
                                } else {
                                    Iterator<U1> it3 = next.Q().iterator();
                                    while (true) {
                                        if (it3.hasNext()) {
                                            if (!l0(str2, m10, it3.next())) {
                                                z10 = false;
                                                break;
                                            }
                                        } else {
                                            z10 = true;
                                            break;
                                        }
                                    }
                                    if (z10) {
                                        Iterator<X1> it4 = next.R().iterator();
                                        while (true) {
                                            if (it4.hasNext()) {
                                                if (!m0(str2, m10, it4.next())) {
                                                    z10 = false;
                                                    break;
                                                }
                                            } else {
                                                break;
                                            }
                                        }
                                    }
                                    if (!z10) {
                                        s();
                                        k();
                                        C6620s.f(str);
                                        SQLiteDatabase z14 = z();
                                        z14.delete("property_filters", "app_id=? and audience_id=?", new String[]{str2, String.valueOf(m10)});
                                        z14.delete("event_filters", "app_id=? and audience_id=?", new String[]{str2, String.valueOf(m10)});
                                    }
                                }
                            }
                        }
                    }
                }
            }
            ArrayList arrayList = new ArrayList();
            for (T1 next2 : list) {
                arrayList.add(next2.S() ? Integer.valueOf(next2.m()) : null);
            }
            N0(str2, arrayList);
            z12.setTransactionSuccessful();
            z12.endTransaction();
        } catch (Throwable th2) {
            z12.endTransaction();
            throw th2;
        }
    }

    /* access modifiers changed from: package-private */
    public final void f0(List<Long> list) {
        k();
        s();
        C6620s.l(list);
        C6620s.n(list.size());
        if (s0()) {
            String str = "(" + TextUtils.join(",", list) + ")";
            if (G0("SELECT COUNT(1) FROM queue WHERE rowid IN " + str + " AND retry_count =  2147483647 LIMIT 1", (String[]) null) > 0) {
                f().J().a("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                z().execSQL("UPDATE queue SET retry_count = IFNULL(retry_count, 0) + 1 WHERE rowid IN " + str + " AND (retry_count IS NULL OR retry_count < 2147483647)");
            } catch (SQLiteException e10) {
                f().E().b("Error incrementing retry count. error", e10);
            }
        }
    }

    public final List<R5> f1(String str) {
        C6620s.f(str);
        k();
        s();
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            cursor = z().query("user_attributes", new String[]{"name", "origin", "set_timestamp", "value"}, "app_id=?", new String[]{str}, (String) null, (String) null, "rowid", "1000");
            if (!cursor.moveToFirst()) {
                cursor.close();
                return arrayList;
            }
            do {
                String string = cursor.getString(0);
                String string2 = cursor.getString(1);
                if (string2 == null) {
                    string2 = "";
                }
                String str2 = string2;
                long j10 = cursor.getLong(2);
                Object O10 = O(cursor, 3);
                if (O10 == null) {
                    f().E().b("Read invalid user property value, ignoring it. appId", C7607h2.t(str));
                } else {
                    arrayList.add(new R5(str, str2, string, j10, O10));
                }
            } while (cursor.moveToNext());
            cursor.close();
            return arrayList;
        } catch (SQLiteException e10) {
            f().E().c("Error querying user properties. appId", C7607h2.t(str), e10);
            List<R5> emptyList = Collections.emptyList();
            if (cursor != null) {
                cursor.close();
            }
            return emptyList;
        } catch (Throwable th2) {
            if (cursor != null) {
                cursor.close();
            }
            throw th2;
        }
    }

    /* access modifiers changed from: package-private */
    public final Map<Integer, C2> g1(String str) {
        s();
        k();
        C6620s.f(str);
        Cursor cursor = null;
        try {
            cursor = z().query("audience_filter_values", new String[]{"audience_id", "current_results"}, "app_id=?", new String[]{str}, (String) null, (String) null, (String) null);
            if (!cursor.moveToFirst()) {
                Map<Integer, C2> emptyMap = Collections.emptyMap();
                cursor.close();
                return emptyMap;
            }
            C5445a aVar = new C5445a();
            do {
                int i10 = cursor.getInt(0);
                try {
                    aVar.put(Integer.valueOf(i10), (C2) ((L4) ((C2.a) N5.E(C2.U(), cursor.getBlob(1))).s()));
                } catch (IOException e10) {
                    f().E().d("Failed to merge filter results. appId, audienceId, error", C7607h2.t(str), Integer.valueOf(i10), e10);
                }
            } while (cursor.moveToNext());
            cursor.close();
            return aVar;
        } catch (SQLiteException e11) {
            f().E().c("Database error querying filter results. appId", C7607h2.t(str), e11);
            Map<Integer, C2> emptyMap2 = Collections.emptyMap();
            if (cursor != null) {
                cursor.close();
            }
            return emptyMap2;
        } catch (Throwable th2) {
            if (cursor != null) {
                cursor.close();
            }
            throw th2;
        }
    }

    public final boolean h0(A2 a22, boolean z10) {
        k();
        s();
        C6620s.l(a22);
        C6620s.f(a22.a0());
        C6620s.p(a22.T0());
        p1();
        long a10 = zzb().a();
        if (a22.q2() < a10 - C7611i.P() || a22.q2() > C7611i.P() + a10) {
            f().J().d("Storing bundle outside of the max uploading time span. appId, now, timestamp", C7607h2.t(a22.a0()), Long.valueOf(a10), Long.valueOf(a22.q2()));
        }
        try {
            byte[] f02 = l().f0(a22.l());
            f().I().b("Saving bundle, size", Integer.valueOf(f02.length));
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", a22.a0());
            contentValues.put("bundle_end_timestamp", Long.valueOf(a22.q2()));
            contentValues.put("data", f02);
            contentValues.put("has_realtime", Integer.valueOf(z10 ? 1 : 0));
            if (a22.a1()) {
                contentValues.put("retry_count", Integer.valueOf(a22.K1()));
            }
            try {
                if (z().insert("queue", (String) null, contentValues) != -1) {
                    return true;
                }
                f().E().b("Failed to insert bundle (got -1). appId", C7607h2.t(a22.a0()));
                return false;
            } catch (SQLiteException e10) {
                f().E().c("Error storing bundle. appId", C7607h2.t(a22.a0()), e10);
                return false;
            }
        } catch (IOException e11) {
            f().E().c("Data loss. Failed to serialize bundle. appId", C7607h2.t(a22.a0()), e11);
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    public final Map<Integer, List<U1>> h1(String str) {
        C6620s.f(str);
        C5445a aVar = new C5445a();
        Cursor cursor = null;
        try {
            cursor = z().query("event_filters", new String[]{"audience_id", "data"}, "app_id=?", new String[]{str}, (String) null, (String) null, (String) null);
            if (!cursor.moveToFirst()) {
                Map<Integer, List<U1>> emptyMap = Collections.emptyMap();
                cursor.close();
                return emptyMap;
            }
            do {
                try {
                    U1 u12 = (U1) ((L4) ((U1.a) N5.E(U1.N(), cursor.getBlob(1))).s());
                    if (u12.V()) {
                        int i10 = cursor.getInt(0);
                        List list = (List) aVar.get(Integer.valueOf(i10));
                        if (list == null) {
                            list = new ArrayList();
                            aVar.put(Integer.valueOf(i10), list);
                        }
                        list.add(u12);
                    }
                } catch (IOException e10) {
                    f().E().c("Failed to merge filter. appId", C7607h2.t(str), e10);
                }
            } while (cursor.moveToNext());
            cursor.close();
            return aVar;
        } catch (SQLiteException e11) {
            f().E().c("Database error querying filters. appId", C7607h2.t(str), e11);
            Map<Integer, List<U1>> emptyMap2 = Collections.emptyMap();
            if (cursor != null) {
                cursor.close();
            }
            return emptyMap2;
        } catch (Throwable th2) {
            if (cursor != null) {
                cursor.close();
            }
            throw th2;
        }
    }

    public final boolean i0(C7597g gVar) {
        C6620s.l(gVar);
        k();
        s();
        String str = gVar.f50134a;
        C6620s.l(str);
        if (U0(str, gVar.f50136c.f49912b) == null && G0("SELECT COUNT(1) FROM conditional_properties WHERE app_id=?", new String[]{str}) >= 1000) {
            return false;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("origin", gVar.f50135b);
        contentValues.put("name", gVar.f50136c.f49912b);
        V(contentValues, "value", C6620s.l(gVar.f50136c.x()));
        contentValues.put("active", Boolean.valueOf(gVar.f50138e));
        contentValues.put("trigger_event_name", gVar.f50139f);
        contentValues.put("trigger_timeout", Long.valueOf(gVar.f50141h));
        h();
        contentValues.put("timed_out_event", Q5.o0(gVar.f50140g));
        contentValues.put("creation_timestamp", Long.valueOf(gVar.f50137d));
        h();
        contentValues.put("triggered_event", Q5.o0(gVar.f50142i));
        contentValues.put("triggered_timestamp", Long.valueOf(gVar.f50136c.f49913c));
        contentValues.put("time_to_live", Long.valueOf(gVar.f50143j));
        h();
        contentValues.put("expired_event", Q5.o0(gVar.f50144k));
        try {
            if (z().insertWithOnConflict("conditional_properties", (String) null, contentValues, 5) != -1) {
                return true;
            }
            f().E().b("Failed to insert/update conditional user property (got -1)", C7607h2.t(str));
            return true;
        } catch (SQLiteException e10) {
            f().E().c("Error storing conditional user property", C7607h2.t(str), e10);
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    public final Map<Integer, List<Integer>> i1(String str) {
        s();
        k();
        C6620s.f(str);
        C5445a aVar = new C5445a();
        Cursor cursor = null;
        try {
            cursor = z().rawQuery("select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;", new String[]{str, str});
            if (!cursor.moveToFirst()) {
                Map<Integer, List<Integer>> emptyMap = Collections.emptyMap();
                cursor.close();
                return emptyMap;
            }
            do {
                int i10 = cursor.getInt(0);
                List list = (List) aVar.get(Integer.valueOf(i10));
                if (list == null) {
                    list = new ArrayList();
                    aVar.put(Integer.valueOf(i10), list);
                }
                list.add(Integer.valueOf(cursor.getInt(1)));
            } while (cursor.moveToNext());
            cursor.close();
            return aVar;
        } catch (SQLiteException e10) {
            f().E().c("Database error querying scoped filters. appId", C7607h2.t(str), e10);
            Map<Integer, List<Integer>> emptyMap2 = Collections.emptyMap();
            if (cursor != null) {
                cursor.close();
            }
            return emptyMap2;
        } catch (Throwable th2) {
            if (cursor != null) {
                cursor.close();
            }
            throw th2;
        }
    }

    public final boolean j0(D d10, long j10, boolean z10) {
        k();
        s();
        C6620s.l(d10);
        C6620s.f(d10.f49566a);
        byte[] l10 = l().C(d10).l();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", d10.f49566a);
        contentValues.put("name", d10.f49567b);
        contentValues.put("timestamp", Long.valueOf(d10.f49569d));
        contentValues.put("metadata_fingerprint", Long.valueOf(j10));
        contentValues.put("data", l10);
        contentValues.put("realtime", Integer.valueOf(z10 ? 1 : 0));
        try {
            if (z().insert("raw_events", (String) null, contentValues) != -1) {
                return true;
            }
            f().E().b("Failed to insert raw event (got -1). appId", C7607h2.t(d10.f49566a));
            return false;
        } catch (SQLiteException e10) {
            f().E().c("Error storing raw event. appId", C7607h2.t(d10.f49566a), e10);
            return false;
        }
    }

    public final void j1(String str) {
        G R02;
        e1("events_snapshot", str);
        Cursor cursor = null;
        try {
            cursor = z().query("events", (String[]) Collections.singletonList("name").toArray(new String[0]), "app_id=?", new String[]{str}, (String) null, (String) null, (String) null);
            if (!cursor.moveToFirst()) {
                cursor.close();
                return;
            }
            do {
                String string = cursor.getString(0);
                if (!(string == null || (R02 = R0(str, string)) == null)) {
                    a0("events_snapshot", R02);
                }
            } while (cursor.moveToNext());
            cursor.close();
        } catch (SQLiteException e10) {
            f().E().c("Error creating snapshot. appId", C7607h2.t(str), e10);
            if (cursor != null) {
                cursor.close();
            }
        } catch (Throwable th2) {
            if (cursor != null) {
                cursor.close();
            }
            throw th2;
        }
    }

    public final boolean k0(R5 r52) {
        C6620s.l(r52);
        k();
        s();
        if (U0(r52.f49942a, r52.f49944c) == null) {
            if (Q5.G0(r52.f49944c)) {
                if (G0("select count(1) from user_attributes where app_id=? and name not like '!_%' escape '!'", new String[]{r52.f49942a}) >= ((long) a().n(r52.f49942a, K.f49724R, 25, 100))) {
                    return false;
                }
            } else if (!"_npa".equals(r52.f49944c) && G0("select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'", new String[]{r52.f49942a, r52.f49943b}) >= 25) {
                return false;
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", r52.f49942a);
        contentValues.put("origin", r52.f49943b);
        contentValues.put("name", r52.f49944c);
        contentValues.put("set_timestamp", Long.valueOf(r52.f49945d));
        V(contentValues, "value", r52.f49946e);
        try {
            if (z().insertWithOnConflict("user_attributes", (String) null, contentValues, 5) != -1) {
                return true;
            }
            f().E().b("Failed to insert/update user property (got -1). appId", C7607h2.t(r52.f49942a));
            return true;
        } catch (SQLiteException e10) {
            f().E().c("Error storing user property. appId", C7607h2.t(r52.f49942a), e10);
            return true;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:47:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00e5 A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void k1(java.lang.String r20) {
        /*
            r19 = this;
            r1 = r19
            r2 = r20
            java.lang.String r3 = "events_snapshot"
            java.util.ArrayList r0 = new java.util.ArrayList
            java.lang.String r4 = "name"
            java.lang.String r5 = "lifetime_count"
            java.lang.String[] r4 = new java.lang.String[]{r4, r5}
            java.util.List r4 = java.util.Arrays.asList(r4)
            r0.<init>(r4)
            java.lang.String r4 = "_f"
            com.google.android.gms.measurement.internal.G r5 = r1.R0(r2, r4)
            java.lang.String r6 = "_v"
            com.google.android.gms.measurement.internal.G r7 = r1.R0(r2, r6)
            java.lang.String r8 = "events"
            r1.e1(r8, r2)
            r9 = 0
            r10 = 0
            android.database.sqlite.SQLiteDatabase r11 = r19.z()     // Catch:{ SQLiteException -> 0x00b2, all -> 0x00af }
            java.lang.String r12 = "events_snapshot"
            java.lang.String[] r13 = new java.lang.String[r9]     // Catch:{ SQLiteException -> 0x00b2, all -> 0x00af }
            java.lang.Object[] r0 = r0.toArray(r13)     // Catch:{ SQLiteException -> 0x00b2, all -> 0x00af }
            r13 = r0
            java.lang.String[] r13 = (java.lang.String[]) r13     // Catch:{ SQLiteException -> 0x00b2, all -> 0x00af }
            java.lang.String r14 = "app_id=?"
            java.lang.String[] r15 = new java.lang.String[]{r20}     // Catch:{ SQLiteException -> 0x00b2, all -> 0x00af }
            r17 = 0
            r18 = 0
            r16 = 0
            android.database.Cursor r10 = r11.query(r12, r13, r14, r15, r16, r17, r18)     // Catch:{ SQLiteException -> 0x00b2, all -> 0x00af }
            boolean r0 = r10.moveToFirst()     // Catch:{ SQLiteException -> 0x00b2, all -> 0x00af }
            if (r0 != 0) goto L_0x0061
            r10.close()
            if (r5 == 0) goto L_0x0058
            r1.a0(r8, r5)
            goto L_0x005d
        L_0x0058:
            if (r7 == 0) goto L_0x005d
            r1.a0(r8, r7)
        L_0x005d:
            r1.e1(r3, r2)
            return
        L_0x0061:
            r11 = r9
            r12 = r11
        L_0x0063:
            java.lang.String r0 = r10.getString(r9)     // Catch:{ SQLiteException -> 0x0085, all -> 0x0082 }
            r13 = 1
            long r14 = r10.getLong(r13)     // Catch:{ SQLiteException -> 0x0085, all -> 0x0082 }
            r16 = 1
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 < 0) goto L_0x0088
            boolean r14 = r4.equals(r0)     // Catch:{ SQLiteException -> 0x0085, all -> 0x0082 }
            if (r14 == 0) goto L_0x007a
            r11 = r13
            goto L_0x0088
        L_0x007a:
            boolean r14 = r6.equals(r0)     // Catch:{ SQLiteException -> 0x0085, all -> 0x0082 }
            if (r14 == 0) goto L_0x0088
            r12 = r13
            goto L_0x0088
        L_0x0082:
            r0 = move-exception
            r9 = r11
            goto L_0x00de
        L_0x0085:
            r0 = move-exception
            r9 = r11
            goto L_0x00b4
        L_0x0088:
            if (r0 == 0) goto L_0x0093
            com.google.android.gms.measurement.internal.G r0 = r1.Q0(r3, r2, r0)     // Catch:{ SQLiteException -> 0x0085, all -> 0x0082 }
            if (r0 == 0) goto L_0x0093
            r1.a0(r8, r0)     // Catch:{ SQLiteException -> 0x0085, all -> 0x0082 }
        L_0x0093:
            boolean r0 = r10.moveToNext()     // Catch:{ SQLiteException -> 0x0085, all -> 0x0082 }
            if (r0 != 0) goto L_0x0063
            r10.close()
            if (r11 != 0) goto L_0x00a4
            if (r5 == 0) goto L_0x00a4
            r1.a0(r8, r5)
            goto L_0x00ab
        L_0x00a4:
            if (r12 != 0) goto L_0x00ab
            if (r7 == 0) goto L_0x00ab
            r1.a0(r8, r7)
        L_0x00ab:
            r1.e1(r3, r2)
            return
        L_0x00af:
            r0 = move-exception
            r12 = r9
            goto L_0x00de
        L_0x00b2:
            r0 = move-exception
            r12 = r9
        L_0x00b4:
            com.google.android.gms.measurement.internal.h2 r4 = r19.f()     // Catch:{ all -> 0x00dd }
            com.google.android.gms.measurement.internal.i2 r4 = r4.E()     // Catch:{ all -> 0x00dd }
            java.lang.String r6 = "Error querying snapshot. appId"
            java.lang.Object r11 = com.google.android.gms.measurement.internal.C7607h2.t(r20)     // Catch:{ all -> 0x00dd }
            r4.c(r6, r11, r0)     // Catch:{ all -> 0x00dd }
            if (r10 == 0) goto L_0x00ca
            r10.close()
        L_0x00ca:
            if (r9 != 0) goto L_0x00d2
            if (r5 == 0) goto L_0x00d2
            r1.a0(r8, r5)
            goto L_0x00d9
        L_0x00d2:
            if (r12 != 0) goto L_0x00d9
            if (r7 == 0) goto L_0x00d9
            r1.a0(r8, r7)
        L_0x00d9:
            r1.e1(r3, r2)
            return
        L_0x00dd:
            r0 = move-exception
        L_0x00de:
            if (r10 == 0) goto L_0x00e3
            r10.close()
        L_0x00e3:
            if (r9 != 0) goto L_0x00ec
            if (r5 != 0) goto L_0x00e8
            goto L_0x00ec
        L_0x00e8:
            r1.a0(r8, r5)
            goto L_0x00f3
        L_0x00ec:
            if (r12 != 0) goto L_0x00f3
            if (r7 == 0) goto L_0x00f3
            r1.a0(r8, r7)
        L_0x00f3:
            r1.e1(r3, r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C7660p.k1(java.lang.String):void");
    }

    public final void l1() {
        s();
        z().beginTransaction();
    }

    public final boolean m1(String str) {
        if (!a().r(K.f49707I0)) {
            return false;
        }
        if (a().r(K.f49711K0)) {
            X[] xArr = {X.GOOGLE_SIGNAL};
            ArrayList arrayList = new ArrayList(1);
            for (int i10 = 0; i10 <= 0; i10++) {
                arrayList.add(Integer.valueOf(xArr[0].zza()));
            }
            String J02 = J0(arrayList);
            String D02 = D0();
            StringBuilder sb2 = new StringBuilder("SELECT COUNT(1) > 0 FROM upload_queue WHERE app_id=?");
            sb2.append(J02);
            sb2.append(" AND NOT ");
            sb2.append(D02);
            return G0(sb2.toString(), new String[]{str}) != 0;
        }
        String D03 = D0();
        StringBuilder sb3 = new StringBuilder("SELECT COUNT(1) > 0 FROM upload_queue WHERE app_id=? AND NOT ");
        sb3.append(D03);
        return G0(sb3.toString(), new String[]{str}) != 0;
    }

    /* access modifiers changed from: package-private */
    public final boolean n0(String str, long j10) {
        if (!a().r(K.f49744a1) && zzb().a() > 15000 + j10) {
            return false;
        }
        try {
            return G("select count(*) from raw_events where app_id=? and timestamp >= ? and name not like '!_%' escape '!' limit 1;", new String[]{str, String.valueOf(j10)}, 0) <= 0 && G("select count(*) from raw_events where app_id=? and timestamp >= ? and name like '!_%' escape '!' limit 1;", new String[]{str, String.valueOf(j10)}, 0) > 0;
        } catch (SQLiteException e10) {
            f().E().b("Error checking backfill conditions", e10);
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean o0(String str, Bundle bundle) {
        k();
        s();
        byte[] l10 = l().C(new D(this.f50228a, "", str, "dep", 0, 0, bundle)).l();
        f().I().c("Saving default event parameters, appId, data size", d().c(str), Integer.valueOf(l10.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("parameters", l10);
        try {
            if (z().insertWithOnConflict("default_event_params", (String) null, contentValues, 5) != -1) {
                return true;
            }
            f().E().b("Failed to insert default event parameters (got -1). appId", C7607h2.t(str));
            return false;
        } catch (SQLiteException e10) {
            f().E().c("Error storing default event parameters. appId", C7607h2.t(str), e10);
            return false;
        }
    }

    public final void o1() {
        s();
        z().endTransaction();
    }

    public final boolean p0(String str, C7645m5 m5Var) {
        k();
        s();
        C6620s.l(m5Var);
        C6620s.f(str);
        long a10 = zzb().a();
        long j10 = m5Var.f50240b;
        Y1<Long> y12 = K.f49781q0;
        if (j10 < a10 - y12.a(null).longValue() || m5Var.f50240b > y12.a(null).longValue() + a10) {
            f().J().d("Storing trigger URI outside of the max retention time span. appId, now, timestamp", C7607h2.t(str), Long.valueOf(a10), Long.valueOf(m5Var.f50240b));
        }
        f().I().a("Saving trigger URI");
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("trigger_uri", m5Var.f50239a);
        contentValues.put("source", Integer.valueOf(m5Var.f50241c));
        contentValues.put("timestamp_millis", Long.valueOf(m5Var.f50240b));
        try {
            if (z().insert("trigger_uris", (String) null, contentValues) != -1) {
                return true;
            }
            f().E().b("Failed to insert trigger URI (got -1). appId", C7607h2.t(str));
            return false;
        } catch (SQLiteException e10) {
            f().E().c("Error storing trigger URI. appId", C7607h2.t(str), e10);
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    public final void p1() {
        int delete;
        k();
        s();
        if (s0()) {
            long a10 = p().f50011e.a();
            long c10 = zzb().c();
            if (Math.abs(c10 - a10) > C7611i.Q()) {
                p().f50011e.b(c10);
                k();
                s();
                if (s0() && (delete = z().delete("queue", "abs(bundle_end_timestamp - ?) > cast(? as integer)", new String[]{String.valueOf(zzb().a()), String.valueOf(C7611i.P())})) > 0) {
                    f().I().b("Deleted stale rows. rowsDeleted", Integer.valueOf(delete));
                }
            }
        }
    }

    public final boolean q0(String str, Long l10, long j10, C7427v2 v2Var) {
        k();
        s();
        C6620s.l(v2Var);
        C6620s.f(str);
        C6620s.l(l10);
        byte[] l11 = v2Var.l();
        f().I().c("Saving complex main event, appId, data size", d().c(str), Integer.valueOf(l11.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("event_id", l10);
        contentValues.put("children_to_process", Long.valueOf(j10));
        contentValues.put("main_event", l11);
        try {
            if (z().insertWithOnConflict("main_event_params", (String) null, contentValues, 5) != -1) {
                return true;
            }
            f().E().b("Failed to insert complex main event (got -1). appId", C7607h2.t(str));
            return false;
        } catch (SQLiteException e10) {
            f().E().c("Error storing complex main event. appId", C7607h2.t(str), e10);
            return false;
        }
    }

    public final void q1() {
        s();
        z().setTransactionSuccessful();
    }

    public final boolean r0() {
        return G0("select count(1) > 0 from raw_events where realtime = 1", (String[]) null) != 0;
    }

    public final boolean r1() {
        return G0("select count(1) > 0 from raw_events", (String[]) null) != 0;
    }

    /* access modifiers changed from: protected */
    public final boolean s0() {
        return zza().getDatabasePath("google_app_measurement.db").exists();
    }

    public final boolean s1() {
        return G0("select count(1) > 0 from queue where has_realtime = 1", (String[]) null) != 0;
    }

    /* access modifiers changed from: protected */
    public final boolean v() {
        return false;
    }

    public final long w() {
        Cursor cursor = null;
        try {
            cursor = z().rawQuery("select rowid from raw_events order by rowid desc limit 1;", (String[]) null);
            if (!cursor.moveToFirst()) {
                cursor.close();
                return -1;
            }
            long j10 = cursor.getLong(0);
            cursor.close();
            return j10;
        } catch (SQLiteException e10) {
            f().E().b("Error querying raw events", e10);
            if (cursor != null) {
                cursor.close();
            }
            return -1;
        } catch (Throwable th2) {
            if (cursor != null) {
                cursor.close();
            }
            throw th2;
        }
    }

    public final long x() {
        return G("select max(bundle_end_timestamp) from queue", (String[]) null, 0);
    }

    public final long y() {
        return G("select max(timestamp) from raw_events", (String[]) null, 0);
    }

    /* access modifiers changed from: package-private */
    public final SQLiteDatabase z() {
        k();
        try {
            return this.f50273d.getWritableDatabase();
        } catch (SQLiteException e10) {
            f().J().b("Error opening database", e10);
            throw e10;
        }
    }
}
