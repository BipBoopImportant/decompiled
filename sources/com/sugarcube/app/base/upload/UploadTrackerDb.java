package com.sugarcube.app.base.upload;

import androidx.room.x;
import androidx.room.y;
import dI.C17164e;
import kotlin.Metadata;
import nI.C17642l;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\b\u0010\tJ4\u0010\u000f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\n2\u001c\u0010\u000e\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\f\u0012\u0006\u0012\u0004\u0018\u00010\r0\u000bH@¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/sugarcube/app/base/upload/UploadTrackerDb;", "Landroidx/room/x;", "<init>", "()V", "Lcom/sugarcube/app/base/upload/UploadSetDao;", "b", "()Lcom/sugarcube/app/base/upload/UploadSetDao;", "Lcom/sugarcube/app/base/upload/UploadFileDao;", "a", "()Lcom/sugarcube/app/base/upload/UploadFileDao;", "R", "Lkotlin/Function1;", "LdI/e;", "", "block", "c", "(LnI/l;LdI/e;)Ljava/lang/Object;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class UploadTrackerDb extends x {
    public abstract UploadFileDao a();

    public abstract UploadSetDao b();

    public final <R> Object c(C17642l<? super C17164e<? super R>, ? extends Object> lVar, C17164e<? super R> eVar) {
        return y.d(this, lVar, eVar);
    }
}
