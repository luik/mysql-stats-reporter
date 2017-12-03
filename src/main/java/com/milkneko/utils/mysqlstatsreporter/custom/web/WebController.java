package com.milkneko.utils.mysqlstatsreporter.custom.web;

import com.milkneko.utils.mysqlstatsreporter.custom.mysql.MySqlManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {
    @Autowired
    private MySqlManager mySqlManager;

    @GetMapping("/get-tables")
    public ResponseEntity<?> getTables(){
        return new ResponseEntity<>(mySqlManager.getTables(), HttpStatus.OK);
    }
}
