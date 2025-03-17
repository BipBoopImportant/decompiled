package com.sugarcube.app.base.data;

import androidx.lifecycle.F;
import androidx.lifecycle.K;
import com.sugarcube.app.base.data.Item;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0017\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B\u0011\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00028\u0000¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u000e\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000b2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0010\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000b2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0010\u0010\u000fJ\r\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0014R&\u0010\u0017\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00160\u00158\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R$\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00048\u0006@BX\u000e¢\u0006\f\n\u0004\b\u001a\u0010\u0014\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lcom/sugarcube/app/base/data/Cache;", "Lcom/sugarcube/app/base/data/Item;", "T", "", "", "maxSize", "<init>", "(J)V", "", "key", "newItem", "Landroidx/lifecycle/F;", "put", "(Ljava/lang/String;Lcom/sugarcube/app/base/data/Item;)Landroidx/lifecycle/F;", "get", "(Ljava/lang/String;)Landroidx/lifecycle/F;", "remove", "LXH/N;", "limitCheck", "()V", "J", "", "Landroidx/lifecycle/K;", "items", "Ljava/util/Map;", "value", "size", "getSize", "()J", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class Cache<T extends Item> {
    public static final int $stable = 8;
    private final Map<String, K<T>> items;
    private final long maxSize;
    private long size;

    public Cache() {
        this(0, 1, (DefaultConstructorMarker) null);
    }

    public final F<T> get(String str) {
        Item item;
        C17542s.j(str, "key");
        K<T> k10 = this.items.get(str);
        K k11 = k10;
        if (!(k11 == null || (item = (Item) k11.getValue()) == null)) {
            item.touch();
        }
        return k10;
    }

    public final long getSize() {
        return this.size;
    }

    public final void limitCheck() {
        long j10 = this.maxSize;
        if (j10 > 0 && this.size > j10) {
            this.items.isEmpty();
        }
    }

    public final F<T> put(String str, T t10) {
        C17542s.j(str, "key");
        C17542s.j(t10, "newItem");
        K k10 = this.items.get(str);
        if (k10 != null) {
            Item item = (Item) k10.getValue();
            if (item != null) {
                C17542s.g(item);
                this.size -= item.size();
                item.release();
            }
            k10.postValue(t10);
            this.size += t10.size();
            return k10;
        }
        K k11 = new K(t10);
        this.items.put(str, k11);
        this.size += t10.size();
        return k11;
    }

    public final F<T> remove(String str) {
        Item item;
        C17542s.j(str, "key");
        K<T> remove = this.items.remove(str);
        K k10 = remove;
        if (!(k10 == null || (item = (Item) k10.getValue()) == null)) {
            this.size -= item.size();
            item.release();
        }
        return remove;
    }

    public Cache(long j10) {
        this.maxSize = j10;
        this.items = new LinkedHashMap();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Cache(long j10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? 0 : j10);
    }
}
