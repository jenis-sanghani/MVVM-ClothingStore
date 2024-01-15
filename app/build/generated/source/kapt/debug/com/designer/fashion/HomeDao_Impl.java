package com.designer.fashion;

import android.database.Cursor;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.LiveData;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.designer.fashion.model.HomeData;
import com.designer.fashion.model.MainStickyMenu;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@SuppressWarnings({"unchecked", "deprecation"})
public final class HomeDao_Impl implements HomeDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<HomeData> __insertionAdapterOfHomeData;

  public HomeDao_Impl(@NonNull final RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfHomeData = new EntityInsertionAdapter<HomeData>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "INSERT OR ABORT INTO `HomeData` (`id`,`main_sticky_menu`,`message`,`status`) VALUES (nullif(?, 0),?,?,?)";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final HomeData entity) {
        statement.bindLong(1, entity.getId());
        final String _tmp = HomeData.Convertors.fromArrayList(entity.getMain_sticky_menu());
        if (_tmp == null) {
          statement.bindNull(2);
        } else {
          statement.bindString(2, _tmp);
        }
        if (entity.getMessage() == null) {
          statement.bindNull(3);
        } else {
          statement.bindString(3, entity.getMessage());
        }
        if (entity.getStatus() == null) {
          statement.bindNull(4);
        } else {
          statement.bindString(4, entity.getStatus());
        }
      }
    };
  }

  @Override
  public Object insertHomeDao(final HomeData homeData,
      final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfHomeData.insert(homeData);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public LiveData<HomeData> getHomeDao() {
    final String _sql = "SELECT * from HomeData";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[] {"HomeData"}, false, new Callable<HomeData>() {
      @Override
      @Nullable
      public HomeData call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfMainStickyMenu = CursorUtil.getColumnIndexOrThrow(_cursor, "main_sticky_menu");
          final int _cursorIndexOfMessage = CursorUtil.getColumnIndexOrThrow(_cursor, "message");
          final int _cursorIndexOfStatus = CursorUtil.getColumnIndexOrThrow(_cursor, "status");
          final HomeData _result;
          if (_cursor.moveToFirst()) {
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final ArrayList<MainStickyMenu> _tmpMain_sticky_menu;
            final String _tmp;
            if (_cursor.isNull(_cursorIndexOfMainStickyMenu)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getString(_cursorIndexOfMainStickyMenu);
            }
            _tmpMain_sticky_menu = HomeData.Convertors.fromString(_tmp);
            final String _tmpMessage;
            if (_cursor.isNull(_cursorIndexOfMessage)) {
              _tmpMessage = null;
            } else {
              _tmpMessage = _cursor.getString(_cursorIndexOfMessage);
            }
            final String _tmpStatus;
            if (_cursor.isNull(_cursorIndexOfStatus)) {
              _tmpStatus = null;
            } else {
              _tmpStatus = _cursor.getString(_cursorIndexOfStatus);
            }
            _result = new HomeData(_tmpId,_tmpMain_sticky_menu,_tmpMessage,_tmpStatus);
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @NonNull
  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
