package com.designer.fashion;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\'J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004H\u00a7@\u00a2\u0006\u0002\u0010\b\u00a8\u0006\t"}, d2 = {"Lcom/designer/fashion/HomeDao;", "", "getHomeDao", "Landroidx/lifecycle/LiveData;", "Lcom/designer/fashion/model/HomeData;", "insertHomeDao", "", "homeData", "(Lcom/designer/fashion/model/HomeData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
@androidx.room.Dao()
public abstract interface HomeDao {
    
    @androidx.room.Query(value = "SELECT * from HomeData")
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.lifecycle.LiveData<com.designer.fashion.model.HomeData> getHomeDao();
    
    @androidx.room.Insert()
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object insertHomeDao(@org.jetbrains.annotations.NotNull()
    com.designer.fashion.model.HomeData homeData, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
}