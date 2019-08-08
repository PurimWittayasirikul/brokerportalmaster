package com.example.demo.controller;

import com.example.demo.model.ClientInfo;
import com.example.demo.model.Fund;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

@RequestMapping("/ClientInfo")
@RestController
public class GreetingController {


    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();
    private List<ClientInfo> clientInfoList = new ArrayList<ClientInfo>(){
        {
            try {
                add(new ClientInfo("123","purim","witt","men","01/05/1997",new ArrayList<Fund>(){
                    {
                        add(new Fund("01","fund1","detail1",1,5,50));
                        add(new Fund("02","fund2","detail2",3,4,80));
                    }
                }));
            add(new ClientInfo("124","beaver","woo","women","02/04/2000"));
            add(new ClientInfo("125","bike","lol","men","07/12/2001"));

        } catch (ParseException e) {
            e.printStackTrace();
        }
        }
    };


//    @RequestMapping("/greeting")
//    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
//        return new Greeting(counter.incrementAndGet(),
//                String.format(template, name));
//    }

    @GetMapping("/quote")
    public ClientInfo greeting(@RequestParam(value="CliId", defaultValue="0") int id) {
        return clientInfoList.get(id);
    }



    @PostMapping
    public List<ClientInfo> addNewClientInfo(@RequestBody ClientInfo clientInfo){
        clientInfoList.add(clientInfo);
        return clientInfoList;
    }


//    @DeleteMapping
//    public List<ClientInfo> deleteClientInfo(@RequestParam(value="CliId", defaultValue="0") int id){
//        clientInfoList.remove(id);
//        return clientInfoList;
//    }
//    @GetMapping("/o/{id}")
//    public String a(@PathVariable int id){
//
//
//    }
//    @PostMapping("/t")
//    public  String t (@RequestBody ClientInfo c){
//
//
//    }
}