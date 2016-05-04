package com.weghst.setaria.core.repository;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.weghst.setaria.core.domain.App;
import com.weghst.setaria.core.domain.Env;

/**
 * @author Kevin Zou (kevinz@weghst.com)
 */
@Repository
public interface AppRepository {

    /**
     * @param app
     */
    int save(App app);

    /**
     * @param app
     */
    int update(App app);

    /**
     * @param id
     * @param version
     * @return
     */
    int updateVersion(@Param("id") int id, @Param("version") long version);

    /**
     * @param id
     */
    int deleteById(int id);

    /**
     * @param id
     * @return
     */
    App findById(int id);

    /**
     * @param name
     * @param env
     * @return
     */
    App findByNameAndEnv(@Param("name") String name, @Param("env") Env env);

    /**
     * @param userId
     * @return
     */
    List<App> findAppsByUserId(int userId);

    /**
     * @return
     */
    List<App> findAll();

}
