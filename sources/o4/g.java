package O4;

import O4.f;
import YH.C16877v;
import YH.X;
import YH.g0;
import android.database.Cursor;
import jI.C17416c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a%\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\t\u0010\n\u001a\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010\u001a+\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0013\u0010\u0014\u001a'\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0016\u0010\n\u001a)\u0010\u001a\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"LQ4/g;", "database", "", "tableName", "LO4/f;", "f", "(LQ4/g;Ljava/lang/String;)LO4/f;", "", "LO4/f$c;", "c", "(LQ4/g;Ljava/lang/String;)Ljava/util/Set;", "Landroid/database/Cursor;", "cursor", "", "LO4/f$d;", "b", "(Landroid/database/Cursor;)Ljava/util/List;", "", "LO4/f$a;", "a", "(LQ4/g;Ljava/lang/String;)Ljava/util/Map;", "LO4/f$e;", "e", "name", "", "unique", "d", "(LQ4/g;Ljava/lang/String;Z)LO4/f$e;", "room-runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class g {
    private static final Map<String, f.a> a(Q4.g gVar, String str) {
        Throwable th2;
        Cursor u22 = gVar.u2("PRAGMA table_info(`" + str + "`)");
        try {
            if (u22.getColumnCount() <= 0) {
                Map<String, f.a> j10 = X.j();
                C17416c.a(u22, (Throwable) null);
                return j10;
            }
            int columnIndex = u22.getColumnIndex("name");
            int columnIndex2 = u22.getColumnIndex("type");
            int columnIndex3 = u22.getColumnIndex("notnull");
            int columnIndex4 = u22.getColumnIndex("pk");
            int columnIndex5 = u22.getColumnIndex("dflt_value");
            Map c10 = X.c();
            while (u22.moveToNext()) {
                String string = u22.getString(columnIndex);
                String string2 = u22.getString(columnIndex2);
                boolean z10 = u22.getInt(columnIndex3) != 0;
                int i10 = u22.getInt(columnIndex4);
                String string3 = u22.getString(columnIndex5);
                C17542s.i(string, "name");
                C17542s.i(string2, "type");
                f.a aVar = r11;
                f.a aVar2 = new f.a(string, string2, z10, i10, string3, 2);
                c10.put(string, aVar);
            }
            Map<String, f.a> b10 = X.b(c10);
            C17416c.a(u22, (Throwable) null);
            return b10;
        } catch (Throwable th3) {
            Throwable th4 = th3;
            C17416c.a(u22, th2);
            throw th4;
        }
    }

    private static final List<f.d> b(Cursor cursor) {
        int columnIndex = cursor.getColumnIndex("id");
        int columnIndex2 = cursor.getColumnIndex("seq");
        int columnIndex3 = cursor.getColumnIndex("from");
        int columnIndex4 = cursor.getColumnIndex("to");
        List c10 = C16877v.c();
        while (cursor.moveToNext()) {
            int i10 = cursor.getInt(columnIndex);
            int i11 = cursor.getInt(columnIndex2);
            String string = cursor.getString(columnIndex3);
            C17542s.i(string, "cursor.getString(fromColumnIndex)");
            String string2 = cursor.getString(columnIndex4);
            C17542s.i(string2, "cursor.getString(toColumnIndex)");
            c10.add(new f.d(i10, i11, string, string2));
        }
        return C16877v.f1(C16877v.a(c10));
    }

    private static final Set<f.c> c(Q4.g gVar, String str) {
        Cursor u22 = gVar.u2("PRAGMA foreign_key_list(`" + str + "`)");
        try {
            int columnIndex = u22.getColumnIndex("id");
            int columnIndex2 = u22.getColumnIndex("seq");
            int columnIndex3 = u22.getColumnIndex("table");
            int columnIndex4 = u22.getColumnIndex("on_delete");
            int columnIndex5 = u22.getColumnIndex("on_update");
            List<f.d> b10 = b(u22);
            u22.moveToPosition(-1);
            Set b11 = g0.b();
            while (u22.moveToNext()) {
                if (u22.getInt(columnIndex2) == 0) {
                    int i10 = u22.getInt(columnIndex);
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList<f.d> arrayList3 = new ArrayList<>();
                    for (Object next : b10) {
                        if (((f.d) next).j() == i10) {
                            arrayList3.add(next);
                        }
                    }
                    for (f.d dVar : arrayList3) {
                        arrayList.add(dVar.b());
                        arrayList2.add(dVar.m());
                    }
                    String string = u22.getString(columnIndex3);
                    C17542s.i(string, "cursor.getString(tableColumnIndex)");
                    String string2 = u22.getString(columnIndex4);
                    C17542s.i(string2, "cursor.getString(onDeleteColumnIndex)");
                    String string3 = u22.getString(columnIndex5);
                    C17542s.i(string3, "cursor.getString(onUpdateColumnIndex)");
                    b11.add(new f.c(string, string2, string3, arrayList, arrayList2));
                }
            }
            Set<f.c> a10 = g0.a(b11);
            C17416c.a(u22, (Throwable) null);
            return a10;
        } catch (Throwable th2) {
            C17416c.a(u22, th);
            throw th2;
        }
    }

    private static final f.e d(Q4.g gVar, String str, boolean z10) {
        Cursor u22 = gVar.u2("PRAGMA index_xinfo(`" + str + "`)");
        try {
            int columnIndex = u22.getColumnIndex("seqno");
            int columnIndex2 = u22.getColumnIndex("cid");
            int columnIndex3 = u22.getColumnIndex("name");
            int columnIndex4 = u22.getColumnIndex("desc");
            if (!(columnIndex == -1 || columnIndex2 == -1 || columnIndex3 == -1)) {
                if (columnIndex4 != -1) {
                    TreeMap treeMap = new TreeMap();
                    TreeMap treeMap2 = new TreeMap();
                    while (u22.moveToNext()) {
                        if (u22.getInt(columnIndex2) >= 0) {
                            int i10 = u22.getInt(columnIndex);
                            String string = u22.getString(columnIndex3);
                            String str2 = u22.getInt(columnIndex4) > 0 ? "DESC" : "ASC";
                            Integer valueOf = Integer.valueOf(i10);
                            C17542s.i(string, "columnName");
                            treeMap.put(valueOf, string);
                            treeMap2.put(Integer.valueOf(i10), str2);
                        }
                    }
                    Collection values = treeMap.values();
                    C17542s.i(values, "columnsMap.values");
                    List t12 = C16877v.t1(values);
                    Collection values2 = treeMap2.values();
                    C17542s.i(values2, "ordersMap.values");
                    f.e eVar = new f.e(str, z10, t12, C16877v.t1(values2));
                    C17416c.a(u22, (Throwable) null);
                    return eVar;
                }
            }
            C17416c.a(u22, (Throwable) null);
            return null;
        } catch (Throwable th2) {
            C17416c.a(u22, th);
            throw th2;
        }
    }

    private static final Set<f.e> e(Q4.g gVar, String str) {
        Cursor u22 = gVar.u2("PRAGMA index_list(`" + str + "`)");
        try {
            int columnIndex = u22.getColumnIndex("name");
            int columnIndex2 = u22.getColumnIndex("origin");
            int columnIndex3 = u22.getColumnIndex("unique");
            if (!(columnIndex == -1 || columnIndex2 == -1)) {
                if (columnIndex3 != -1) {
                    Set b10 = g0.b();
                    while (u22.moveToNext()) {
                        if (C17542s.e("c", u22.getString(columnIndex2))) {
                            String string = u22.getString(columnIndex);
                            boolean z10 = true;
                            if (u22.getInt(columnIndex3) != 1) {
                                z10 = false;
                            }
                            C17542s.i(string, "name");
                            f.e d10 = d(gVar, string, z10);
                            if (d10 == null) {
                                C17416c.a(u22, (Throwable) null);
                                return null;
                            }
                            b10.add(d10);
                        }
                    }
                    Set<f.e> a10 = g0.a(b10);
                    C17416c.a(u22, (Throwable) null);
                    return a10;
                }
            }
            C17416c.a(u22, (Throwable) null);
            return null;
        } catch (Throwable th2) {
            C17416c.a(u22, th);
            throw th2;
        }
    }

    public static final f f(Q4.g gVar, String str) {
        C17542s.j(gVar, "database");
        C17542s.j(str, "tableName");
        return new f(str, a(gVar, str), c(gVar, str), e(gVar, str));
    }
}
