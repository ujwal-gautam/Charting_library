package com.example.charting_library.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author cropdata-ujwal
 * @package com.example.charting_library.controller
 * @date 28/03/22
 * @time 4:02 PM
 */
@RestController
public class ChartingController
{
    @GetMapping("/list")
    public Map<String, String> getList(){
        Map<String, String> stringMap = new HashMap<>();
        stringMap.put("1", "Ujwal");
        stringMap.put("2", "Mahesh");
        stringMap.put("3", "Ekta");

        return stringMap;
    }
}
