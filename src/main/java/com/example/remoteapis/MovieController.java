package com.example.remoteapis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class MovieController {

    @Autowired
    RestTemplate restTemplate;
    @GetMapping("/tv/get-Info")
    public Object getTvInfo(@RequestParam ("id") int id){
        String url="https://api.themoviedb.org/3/tv/"+id+"?api_key=91c5cd0e93f10322c98c73be07f53721";
        return restTemplate.getForObject(url,Object.class);
    }
    @GetMapping("/tv/get-CustomisedInfo")
    public MovieResponse getCustomisedTvInfo(@RequestParam ("id") int id){
        String url="https://api.themoviedb.org/3/tv/"+id+"?api_key=91c5cd0e93f10322c98c73be07f53721";
        return restTemplate.getForObject(url,MovieResponse.class);
    }

    @GetMapping("/movie/get-Info")
    public Object getMovieInfo(@RequestParam ("id") int id){
        String url="https://api.themoviedb.org/3/movie/"+id+"?api_key=91c5cd0e93f10322c98c73be07f53721";
        return restTemplate.getForObject(url,Object.class);
    }
    @GetMapping("/movie/get-CustomisedInfo")
    public MovieResponse getCustomiseMovieInfo(@RequestParam ("id") int id){
        String url="https://api.themoviedb.org/3/movie/"+id+"?api_key=91c5cd0e93f10322c98c73be07f53721";
        return restTemplate.getForObject(url,MovieResponse.class);
    }

    //calling local APIs
    @GetMapping("/get-student")
    public Object getStudent(@RequestParam ("id") int regNo){
        String url="http://localhost:9999/student/get?q="+regNo;
        return restTemplate.getForObject(url,Object.class);
    }
}
