package com.toast.grid;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@RestController
@RequestMapping("build")
public class BuildController {

    @RequestMapping("toastList")
    public List<Map<String, String>> toastList() {
        List<Map<String, String>> list = new ArrayList<>();
        Map<String, String> map = new HashMap<>();
        map.put("name", "a");
        map.put("artist", "b");
        map.put("type", "c");
        map.put("release", "1.1.1.0");
        map.put("genre", "M");
        map.put("price", "1000");
        map.put("downloadCount", "45");
        map.put("listenCount", "1");
        list.add(map);
        list.add(map);
        list.add(map);
        list.add(map);
        list.add(map);
        list.add(map);
        list.add(map);
        list.add(map);
        list.add(map);
        list.add(map);
        list.add(map);
        return list;
    }

    @RequestMapping("toastDataList")
    public List<BuildData> toastDataList() {
        List<BuildData> list = new ArrayList<>();
        BuildData data = BuildData.builder().artist("나가수").name("노래").type("solo").release("1.1.1.0").genre("balad")
                .build();
        list.add(data);
        BuildData data1 = BuildData.builder().artist("아이유").name("낙화").type("group").release("3.5.1.3").genre("balad")
                .build();
        list.add(data1);
        BuildData data2 = BuildData.builder().artist("브라운").name("brown").type("Duo").release("5.7.9.2").genre("R&B")
                .build();
        list.add(data2);
        return list;
    }
}

@Getter
@AllArgsConstructor
@Builder
class BuildData {

    private String name;
    private String artist;
    private String type;
    private String release;
    private String genre;
    private String price;
    private String downloadCount;
    private String listenCount;

}