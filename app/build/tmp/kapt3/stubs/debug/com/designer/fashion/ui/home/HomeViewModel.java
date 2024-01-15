package com.designer.fashion.ui.home;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068F\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00068F\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\tR\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00068F\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/designer/fashion/ui/home/HomeViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/designer/fashion/ui/home/HomeRepo;", "(Lcom/designer/fashion/ui/home/HomeRepo;)V", "bottomData", "Landroidx/lifecycle/LiveData;", "Lcom/designer/fashion/models/BottomData;", "getBottomData", "()Landroidx/lifecycle/LiveData;", "homeData", "Lcom/designer/fashion/models/HomeData;", "getHomeData", "middleData", "Lcom/designer/fashion/models/MiddleData;", "getMiddleData", "app_debug"})
public final class HomeViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.designer.fashion.ui.home.HomeRepo repository = null;
    
    public HomeViewModel(@org.jetbrains.annotations.NotNull()
    com.designer.fashion.ui.home.HomeRepo repository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.designer.fashion.models.HomeData> getHomeData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.designer.fashion.models.MiddleData> getMiddleData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.designer.fashion.models.BottomData> getBottomData() {
        return null;
    }
}