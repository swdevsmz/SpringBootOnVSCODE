package com.example.demo;

import org.springframework.http.MediaType;
//import org.springframework.http.StreamingHttpOutputMessage.Body;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Validated
public class SampleRestController {

    @RequestMapping(value = "/json",
            consumes = MediaType.APPLICATION_JSON_VALUE, //Jsonをリクエストにする設定
            produces = MediaType.APPLICATION_JSON_VALUE) 
    public Response json(@Validated @RequestBody String body) {
        Nest nest = new Nest();
        //nest.setKey1(body.getBody());
        nest.setKey1(body);
        nest.setKey2(1);
 
        Response response = new Response();
        response.setNest(nest);
         
        return response;
    }
}