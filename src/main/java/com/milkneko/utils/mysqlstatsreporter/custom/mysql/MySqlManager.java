package com.milkneko.utils.mysqlstatsreporter.custom.mysql;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MySqlManager {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<String> getTables(){
        List<String> result = new ArrayList<>();

        jdbcTemplate.query("SHOW TABLES", resultSet -> {
            result.add(resultSet.getString(1));
        });

        return result;
    }
}
