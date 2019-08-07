package com.example.demo;

import com.example.demo.model.ClientInfo;
import com.example.demo.model.Fund;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@RequestMapping("/greet")
@RestController
public class GreetingController {


    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();
    private List<ClientInfo> clientInfoList = new ArrayList<ClientInfo>(){
        {
            add(new ClientInfo("123","purim","witt",new ArrayList<Fund>(){
                {
                    add(new Fund("01","fund1",5,50));
                    add(new Fund("02","fund2",4,80));
                }
            }));
            add(new ClientInfo("124","beaver","woo"));
            add(new ClientInfo("125","bike","lol"));
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