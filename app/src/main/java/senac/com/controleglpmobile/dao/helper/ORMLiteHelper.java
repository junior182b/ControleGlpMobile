package senac.com.controleglpmobile.dao.helper;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.j256.ormlite.android.apptools.OrmLiteSqliteOpenHelper;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;

import java.sql.SQLException;

import senac.com.controleglpmobile.model.atributes.Funcionario;

public class ORMLiteHelper extends OrmLiteSqliteOpenHelper {
    private static final String DATABASE_NAME = "avaliacao.db";
    private static final int DATABASE_VERSION = 1;

    public ORMLiteHelper(Context c){
        super(c, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase, ConnectionSource connectionSource) {
        try {
            TableUtils.createTable(connectionSource, Funcionario.class);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, ConnectionSource connectionSource, int i, int i1) {
        try {
            TableUtils.dropTable(connectionSource, Funcionario.class, true);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
