package com.designer.fashion.model;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001dB5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0016\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u00a2\u0006\u0002\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0003H\u00c6\u0003J\u0019\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\tH\u00c6\u0003J\t\u0010\u0016\u001a\u00020\tH\u00c6\u0003JA\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0018\b\u0002\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\tH\u00c6\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001b\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u001c\u001a\u00020\tH\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR!\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\n\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011\u00a8\u0006\u001e"}, d2 = {"Lcom/designer/fashion/model/HomeData;", "", "id", "", "main_sticky_menu", "Ljava/util/ArrayList;", "Lcom/designer/fashion/model/MainStickyMenu;", "Lkotlin/collections/ArrayList;", "message", "", "status", "(ILjava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()I", "getMain_sticky_menu", "()Ljava/util/ArrayList;", "getMessage", "()Ljava/lang/String;", "getStatus", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "Convertors", "app_debug"})
@androidx.annotation.Keep()
@androidx.room.Entity(tableName = "HomeData")
@androidx.room.TypeConverters(value = {com.designer.fashion.model.HomeData.Convertors.class})
public final class HomeData {
    @androidx.room.PrimaryKey(autoGenerate = true)
    private final int id = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.util.ArrayList<com.designer.fashion.model.MainStickyMenu> main_sticky_menu = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String message = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String status = null;
    
    public HomeData(int id, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.designer.fashion.model.MainStickyMenu> main_sticky_menu, @org.jetbrains.annotations.NotNull()
    java.lang.String message, @org.jetbrains.annotations.NotNull()
    java.lang.String status) {
        super();
    }
    
    public final int getId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.designer.fashion.model.MainStickyMenu> getMain_sticky_menu() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getMessage() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStatus() {
        return null;
    }
    
    public final int component1() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.designer.fashion.model.MainStickyMenu> component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.designer.fashion.model.HomeData copy(int id, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.designer.fashion.model.MainStickyMenu> main_sticky_menu, @org.jetbrains.annotations.NotNull()
    java.lang.String message, @org.jetbrains.annotations.NotNull()
    java.lang.String status) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.lang.String toString() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2 = {"Lcom/designer/fashion/model/HomeData$Convertors;", "", "()V", "Companion", "app_debug"})
    public static final class Convertors {
        @org.jetbrains.annotations.NotNull()
        public static final com.designer.fashion.model.HomeData.Convertors.Companion Companion = null;
        
        public Convertors() {
            super();
        }
        
        @kotlin.jvm.JvmStatic()
        @androidx.room.TypeConverter()
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String fromArrayList(@org.jetbrains.annotations.NotNull()
        java.util.ArrayList<com.designer.fashion.model.MainStickyMenu> list) {
            return null;
        }
        
        @kotlin.jvm.JvmStatic()
        @androidx.room.TypeConverter()
        @org.jetbrains.annotations.NotNull()
        public static final java.util.ArrayList<com.designer.fashion.model.MainStickyMenu> fromString(@org.jetbrains.annotations.NotNull()
        java.lang.String value) {
            return null;
        }
        
        @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0016\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\bH\u0007J \u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\b2\u0006\u0010\n\u001a\u00020\u0004H\u0007\u00a8\u0006\u000b"}, d2 = {"Lcom/designer/fashion/model/HomeData$Convertors$Companion;", "", "()V", "fromArrayList", "", "list", "Ljava/util/ArrayList;", "Lcom/designer/fashion/model/MainStickyMenu;", "Lkotlin/collections/ArrayList;", "fromString", "value", "app_debug"})
        public static final class Companion {
            
            private Companion() {
                super();
            }
            
            @kotlin.jvm.JvmStatic()
            @androidx.room.TypeConverter()
            @org.jetbrains.annotations.NotNull()
            public final java.util.ArrayList<com.designer.fashion.model.MainStickyMenu> fromString(@org.jetbrains.annotations.NotNull()
            java.lang.String value) {
                return null;
            }
            
            @kotlin.jvm.JvmStatic()
            @androidx.room.TypeConverter()
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String fromArrayList(@org.jetbrains.annotations.NotNull()
            java.util.ArrayList<com.designer.fashion.model.MainStickyMenu> list) {
                return null;
            }
        }
    }
}