package com.zac.server.db.dao;

import com.zac.server.db.config.AppConfig;
import com.zac.server.db.entity.TestTbl;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Update;

/**
 */
@Dao(config = AppConfig.class)
public interface TestTblDao {

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TestTbl entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TestTbl entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TestTbl entity);
}