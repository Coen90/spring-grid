package com.toast.grid;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@RestController
@RequestMapping("ajax")
public class AjaxController {

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
    public List<Data> toastDataList() {
        List<Data> list = new ArrayList<>();
        Data data = new Data("a", "b", "c", "1.1.1.0", "Pop", "1000won", "23", "451");
        list.add(data);
        data = new Data("나가수", "노래", "솔로", "3.3.3.0", "Remix", "1500won", "24", "2362");
        list.add(data);
        data = new Data("아이유", "낙화", "그룹", "1.1.1.1", "K-Pop", "1300won", "65", "543");
        list.add(data);
        data = new Data("Christian", "let's go", "Duet", "1.1.1.5", "J-Pop", "1100won", "324", "2346");
        list.add(data);
        data = new Data("I won't give up", "Jason Mraz", "Deluxe", "2.1.0.9", "Ballad", "1700won", "4", "5435");
        list.add(data);
        return list;
    }
}

@Getter
@Setter
@AllArgsConstructor
class Data {

    private String name;
    private String artist;
    private String type;
    private String release;
    private String genre;
    private String price;
    private String downloadCount;
    private String listenCount;

}