package androidx.work.impl;

import O4.b;
import O4.f;
import Q4.g;
import Q4.h;
import androidx.room.A;
import androidx.room.C7011h;
import androidx.room.r;
import androidx.room.x;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import s5.C8716B;
import s5.C8717C;
import s5.C8720b;
import s5.C8721c;
import s5.C8723e;
import s5.C8724f;
import s5.C8725g;
import s5.C8726h;
import s5.C8728j;
import s5.C8729k;
import s5.C8733o;
import s5.C8734p;
import s5.C8736r;
import s5.C8737s;
import s5.v;
import s5.y;

public final class WorkDatabase_Impl extends WorkDatabase {

    /* renamed from: b  reason: collision with root package name */
    private volatile v f45204b;

    /* renamed from: c  reason: collision with root package name */
    private volatile C8720b f45205c;

    /* renamed from: d  reason: collision with root package name */
    private volatile C8716B f45206d;

    /* renamed from: e  reason: collision with root package name */
    private volatile C8728j f45207e;

    /* renamed from: f  reason: collision with root package name */
    private volatile C8733o f45208f;

    /* renamed from: g  reason: collision with root package name */
    private volatile C8736r f45209g;

    /* renamed from: h  reason: collision with root package name */
    private volatile C8723e f45210h;

    class a extends A.b {
        a(int i10) {
            super(i10);
        }

        public void createAllTables(g gVar) {
            gVar.T("CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            gVar.T("CREATE INDEX IF NOT EXISTS `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)");
            gVar.T("CREATE INDEX IF NOT EXISTS `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)");
            gVar.T("CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT NOT NULL, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `last_enqueue_time` INTEGER NOT NULL DEFAULT -1, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `period_count` INTEGER NOT NULL DEFAULT 0, `generation` INTEGER NOT NULL DEFAULT 0, `next_schedule_time_override` INTEGER NOT NULL DEFAULT 9223372036854775807, `next_schedule_time_override_generation` INTEGER NOT NULL DEFAULT 0, `stop_reason` INTEGER NOT NULL DEFAULT -256, `trace_tag` TEXT, `required_network_type` INTEGER NOT NULL, `required_network_request` BLOB NOT NULL DEFAULT x'', `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB NOT NULL, PRIMARY KEY(`id`))");
            gVar.T("CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
            gVar.T("CREATE INDEX IF NOT EXISTS `index_WorkSpec_last_enqueue_time` ON `WorkSpec` (`last_enqueue_time`)");
            gVar.T("CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            gVar.T("CREATE INDEX IF NOT EXISTS `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
            gVar.T("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `generation` INTEGER NOT NULL DEFAULT 0, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`, `generation`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            gVar.T("CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            gVar.T("CREATE INDEX IF NOT EXISTS `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)");
            gVar.T("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            gVar.T("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
            gVar.T("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            gVar.T("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '86254750241babac4b8d52996a675549')");
        }

        public void dropAllTables(g gVar) {
            gVar.T("DROP TABLE IF EXISTS `Dependency`");
            gVar.T("DROP TABLE IF EXISTS `WorkSpec`");
            gVar.T("DROP TABLE IF EXISTS `WorkTag`");
            gVar.T("DROP TABLE IF EXISTS `SystemIdInfo`");
            gVar.T("DROP TABLE IF EXISTS `WorkName`");
            gVar.T("DROP TABLE IF EXISTS `WorkProgress`");
            gVar.T("DROP TABLE IF EXISTS `Preference`");
            List<x.b> h10 = WorkDatabase_Impl.this.mCallbacks;
            if (h10 != null) {
                for (x.b b10 : h10) {
                    b10.b(gVar);
                }
            }
        }

        public void onCreate(g gVar) {
            List<x.b> i10 = WorkDatabase_Impl.this.mCallbacks;
            if (i10 != null) {
                for (x.b a10 : i10) {
                    a10.a(gVar);
                }
            }
        }

        public void onOpen(g gVar) {
            g unused = WorkDatabase_Impl.this.mDatabase = gVar;
            gVar.T("PRAGMA foreign_keys = ON");
            WorkDatabase_Impl.this.internalInitInvalidationTracker(gVar);
            List<x.b> l10 = WorkDatabase_Impl.this.mCallbacks;
            if (l10 != null) {
                for (x.b c10 : l10) {
                    c10.c(gVar);
                }
            }
        }

        public void onPostMigrate(g gVar) {
        }

        public void onPreMigrate(g gVar) {
            b.b(gVar);
        }

        public A.c onValidateSchema(g gVar) {
            g gVar2 = gVar;
            HashMap hashMap = new HashMap(2);
            hashMap.put("work_spec_id", new f.a("work_spec_id", "TEXT", true, 1, (String) null, 1));
            hashMap.put("prerequisite_id", new f.a("prerequisite_id", "TEXT", true, 2, (String) null, 1));
            HashSet hashSet = new HashSet(2);
            hashSet.add(new f.c("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(new String[]{"work_spec_id"}), Arrays.asList(new String[]{"id"})));
            hashSet.add(new f.c("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(new String[]{"prerequisite_id"}), Arrays.asList(new String[]{"id"})));
            HashSet hashSet2 = new HashSet(2);
            hashSet2.add(new f.e("index_Dependency_work_spec_id", false, Arrays.asList(new String[]{"work_spec_id"}), Arrays.asList(new String[]{"ASC"})));
            hashSet2.add(new f.e("index_Dependency_prerequisite_id", false, Arrays.asList(new String[]{"prerequisite_id"}), Arrays.asList(new String[]{"ASC"})));
            f fVar = new f("Dependency", hashMap, hashSet, hashSet2);
            f a10 = f.a(gVar2, "Dependency");
            if (!fVar.equals(a10)) {
                return new A.c(false, "Dependency(androidx.work.impl.model.Dependency).\n Expected:\n" + fVar + "\n Found:\n" + a10);
            }
            HashMap hashMap2 = new HashMap(32);
            hashMap2.put("id", new f.a("id", "TEXT", true, 1, (String) null, 1));
            hashMap2.put("state", new f.a("state", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("worker_class_name", new f.a("worker_class_name", "TEXT", true, 0, (String) null, 1));
            hashMap2.put("input_merger_class_name", new f.a("input_merger_class_name", "TEXT", true, 0, (String) null, 1));
            hashMap2.put("input", new f.a("input", "BLOB", true, 0, (String) null, 1));
            hashMap2.put("output", new f.a("output", "BLOB", true, 0, (String) null, 1));
            hashMap2.put("initial_delay", new f.a("initial_delay", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("interval_duration", new f.a("interval_duration", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("flex_duration", new f.a("flex_duration", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("run_attempt_count", new f.a("run_attempt_count", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("backoff_policy", new f.a("backoff_policy", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("backoff_delay_duration", new f.a("backoff_delay_duration", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("last_enqueue_time", new f.a("last_enqueue_time", "INTEGER", true, 0, "-1", 1));
            hashMap2.put("minimum_retention_duration", new f.a("minimum_retention_duration", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("schedule_requested_at", new f.a("schedule_requested_at", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("run_in_foreground", new f.a("run_in_foreground", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("out_of_quota_policy", new f.a("out_of_quota_policy", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("period_count", new f.a("period_count", "INTEGER", true, 0, "0", 1));
            hashMap2.put("generation", new f.a("generation", "INTEGER", true, 0, "0", 1));
            hashMap2.put("next_schedule_time_override", new f.a("next_schedule_time_override", "INTEGER", true, 0, "9223372036854775807", 1));
            hashMap2.put("next_schedule_time_override_generation", new f.a("next_schedule_time_override_generation", "INTEGER", true, 0, "0", 1));
            hashMap2.put("stop_reason", new f.a("stop_reason", "INTEGER", true, 0, "-256", 1));
            hashMap2.put("trace_tag", new f.a("trace_tag", "TEXT", false, 0, (String) null, 1));
            hashMap2.put("required_network_type", new f.a("required_network_type", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("required_network_request", new f.a("required_network_request", "BLOB", true, 0, "x''", 1));
            hashMap2.put("requires_charging", new f.a("requires_charging", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("requires_device_idle", new f.a("requires_device_idle", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("requires_battery_not_low", new f.a("requires_battery_not_low", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("requires_storage_not_low", new f.a("requires_storage_not_low", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("trigger_content_update_delay", new f.a("trigger_content_update_delay", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("trigger_max_content_delay", new f.a("trigger_max_content_delay", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("content_uri_triggers", new f.a("content_uri_triggers", "BLOB", true, 0, (String) null, 1));
            HashSet hashSet3 = new HashSet(0);
            HashSet hashSet4 = new HashSet(2);
            hashSet4.add(new f.e("index_WorkSpec_schedule_requested_at", false, Arrays.asList(new String[]{"schedule_requested_at"}), Arrays.asList(new String[]{"ASC"})));
            hashSet4.add(new f.e("index_WorkSpec_last_enqueue_time", false, Arrays.asList(new String[]{"last_enqueue_time"}), Arrays.asList(new String[]{"ASC"})));
            f fVar2 = new f("WorkSpec", hashMap2, hashSet3, hashSet4);
            f a11 = f.a(gVar2, "WorkSpec");
            if (!fVar2.equals(a11)) {
                return new A.c(false, "WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n" + fVar2 + "\n Found:\n" + a11);
            }
            HashMap hashMap3 = new HashMap(2);
            hashMap3.put("tag", new f.a("tag", "TEXT", true, 1, (String) null, 1));
            hashMap3.put("work_spec_id", new f.a("work_spec_id", "TEXT", true, 2, (String) null, 1));
            HashSet hashSet5 = new HashSet(1);
            hashSet5.add(new f.c("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(new String[]{"work_spec_id"}), Arrays.asList(new String[]{"id"})));
            HashSet hashSet6 = new HashSet(1);
            hashSet6.add(new f.e("index_WorkTag_work_spec_id", false, Arrays.asList(new String[]{"work_spec_id"}), Arrays.asList(new String[]{"ASC"})));
            f fVar3 = new f("WorkTag", hashMap3, hashSet5, hashSet6);
            f a12 = f.a(gVar2, "WorkTag");
            if (!fVar3.equals(a12)) {
                return new A.c(false, "WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n" + fVar3 + "\n Found:\n" + a12);
            }
            HashMap hashMap4 = new HashMap(3);
            hashMap4.put("work_spec_id", new f.a("work_spec_id", "TEXT", true, 1, (String) null, 1));
            hashMap4.put("generation", new f.a("generation", "INTEGER", true, 2, "0", 1));
            hashMap4.put("system_id", new f.a("system_id", "INTEGER", true, 0, (String) null, 1));
            HashSet hashSet7 = new HashSet(1);
            hashSet7.add(new f.c("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(new String[]{"work_spec_id"}), Arrays.asList(new String[]{"id"})));
            f fVar4 = new f("SystemIdInfo", hashMap4, hashSet7, new HashSet(0));
            f a13 = f.a(gVar2, "SystemIdInfo");
            if (!fVar4.equals(a13)) {
                return new A.c(false, "SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n" + fVar4 + "\n Found:\n" + a13);
            }
            HashMap hashMap5 = new HashMap(2);
            hashMap5.put("name", new f.a("name", "TEXT", true, 1, (String) null, 1));
            hashMap5.put("work_spec_id", new f.a("work_spec_id", "TEXT", true, 2, (String) null, 1));
            HashSet hashSet8 = new HashSet(1);
            hashSet8.add(new f.c("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(new String[]{"work_spec_id"}), Arrays.asList(new String[]{"id"})));
            HashSet hashSet9 = new HashSet(1);
            hashSet9.add(new f.e("index_WorkName_work_spec_id", false, Arrays.asList(new String[]{"work_spec_id"}), Arrays.asList(new String[]{"ASC"})));
            f fVar5 = new f("WorkName", hashMap5, hashSet8, hashSet9);
            f a14 = f.a(gVar2, "WorkName");
            if (!fVar5.equals(a14)) {
                return new A.c(false, "WorkName(androidx.work.impl.model.WorkName).\n Expected:\n" + fVar5 + "\n Found:\n" + a14);
            }
            HashMap hashMap6 = new HashMap(2);
            hashMap6.put("work_spec_id", new f.a("work_spec_id", "TEXT", true, 1, (String) null, 1));
            hashMap6.put("progress", new f.a("progress", "BLOB", true, 0, (String) null, 1));
            HashSet hashSet10 = new HashSet(1);
            hashSet10.add(new f.c("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(new String[]{"work_spec_id"}), Arrays.asList(new String[]{"id"})));
            f fVar6 = new f("WorkProgress", hashMap6, hashSet10, new HashSet(0));
            f a15 = f.a(gVar2, "WorkProgress");
            if (!fVar6.equals(a15)) {
                return new A.c(false, "WorkProgress(androidx.work.impl.model.WorkProgress).\n Expected:\n" + fVar6 + "\n Found:\n" + a15);
            }
            HashMap hashMap7 = new HashMap(2);
            hashMap7.put("key", new f.a("key", "TEXT", true, 1, (String) null, 1));
            hashMap7.put("long_value", new f.a("long_value", "INTEGER", false, 0, (String) null, 1));
            f fVar7 = new f("Preference", hashMap7, new HashSet(0), new HashSet(0));
            f a16 = f.a(gVar2, "Preference");
            if (fVar7.equals(a16)) {
                return new A.c(true, (String) null);
            }
            return new A.c(false, "Preference(androidx.work.impl.model.Preference).\n Expected:\n" + fVar7 + "\n Found:\n" + a16);
        }
    }

    public C8720b a() {
        C8720b bVar;
        if (this.f45205c != null) {
            return this.f45205c;
        }
        synchronized (this) {
            try {
                if (this.f45205c == null) {
                    this.f45205c = new C8721c(this);
                }
                bVar = this.f45205c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return bVar;
    }

    public C8723e b() {
        C8723e eVar;
        if (this.f45210h != null) {
            return this.f45210h;
        }
        synchronized (this) {
            try {
                if (this.f45210h == null) {
                    this.f45210h = new C8724f(this);
                }
                eVar = this.f45210h;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return eVar;
    }

    public C8728j c() {
        C8728j jVar;
        if (this.f45207e != null) {
            return this.f45207e;
        }
        synchronized (this) {
            try {
                if (this.f45207e == null) {
                    this.f45207e = new C8729k(this);
                }
                jVar = this.f45207e;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return jVar;
    }

    public void clearAllTables() {
        super.assertNotMainThread();
        g writableDatabase = super.getOpenHelper().getWritableDatabase();
        try {
            super.beginTransaction();
            writableDatabase.T("PRAGMA defer_foreign_keys = TRUE");
            writableDatabase.T("DELETE FROM `Dependency`");
            writableDatabase.T("DELETE FROM `WorkSpec`");
            writableDatabase.T("DELETE FROM `WorkTag`");
            writableDatabase.T("DELETE FROM `SystemIdInfo`");
            writableDatabase.T("DELETE FROM `WorkName`");
            writableDatabase.T("DELETE FROM `WorkProgress`");
            writableDatabase.T("DELETE FROM `Preference`");
            super.setTransactionSuccessful();
        } finally {
            super.endTransaction();
            writableDatabase.u2("PRAGMA wal_checkpoint(FULL)").close();
            if (!writableDatabase.N2()) {
                writableDatabase.T("VACUUM");
            }
        }
    }

    /* access modifiers changed from: protected */
    public r createInvalidationTracker() {
        return new r(this, new HashMap(0), new HashMap(0), "Dependency", "WorkSpec", "WorkTag", "SystemIdInfo", "WorkName", "WorkProgress", "Preference");
    }

    /* access modifiers changed from: protected */
    public h createOpenHelper(C7011h hVar) {
        return hVar.f44336c.a(h.b.a(hVar.f44334a).d(hVar.f44335b).c(new A(hVar, new a(23), "86254750241babac4b8d52996a675549", "1cbd3130fa23b59692c061c594c16cc0")).b());
    }

    public C8733o d() {
        C8733o oVar;
        if (this.f45208f != null) {
            return this.f45208f;
        }
        synchronized (this) {
            try {
                if (this.f45208f == null) {
                    this.f45208f = new C8734p(this);
                }
                oVar = this.f45208f;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return oVar;
    }

    public C8736r e() {
        C8736r rVar;
        if (this.f45209g != null) {
            return this.f45209g;
        }
        synchronized (this) {
            try {
                if (this.f45209g == null) {
                    this.f45209g = new C8737s(this);
                }
                rVar = this.f45209g;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return rVar;
    }

    public v f() {
        v vVar;
        if (this.f45204b != null) {
            return this.f45204b;
        }
        synchronized (this) {
            try {
                if (this.f45204b == null) {
                    this.f45204b = new y(this);
                }
                vVar = this.f45204b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return vVar;
    }

    public C8716B g() {
        C8716B b10;
        if (this.f45206d != null) {
            return this.f45206d;
        }
        synchronized (this) {
            try {
                if (this.f45206d == null) {
                    this.f45206d = new C8717C(this);
                }
                b10 = this.f45206d;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return b10;
    }

    public List<N4.b> getAutoMigrations(Map<Class<? extends N4.a>, N4.a> map) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new b());
        arrayList.add(new c());
        arrayList.add(new d());
        arrayList.add(new e());
        arrayList.add(new f());
        arrayList.add(new g());
        arrayList.add(new h());
        arrayList.add(new i());
        return arrayList;
    }

    public Set<Class<? extends N4.a>> getRequiredAutoMigrationSpecs() {
        return new HashSet();
    }

    /* access modifiers changed from: protected */
    public Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
        HashMap hashMap = new HashMap();
        hashMap.put(v.class, y.J());
        hashMap.put(C8720b.class, C8721c.e());
        hashMap.put(C8716B.class, C8717C.e());
        hashMap.put(C8728j.class, C8729k.h());
        hashMap.put(C8733o.class, C8734p.c());
        hashMap.put(C8736r.class, C8737s.d());
        hashMap.put(C8723e.class, C8724f.c());
        hashMap.put(C8725g.class, C8726h.a());
        return hashMap;
    }
}
