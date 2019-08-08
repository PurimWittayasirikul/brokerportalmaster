package com.example.demo;

import com.example.demo.model.ClientInfo;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import net.minidev.json.JSONObject;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;

import static org.junit.Assert.assertNotNull;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc


public class GreetingControllerTests {
    @Autowired
    private MockMvc mockMvc;
//    private final ObjectMapper objectMapper = new ObjectMapper();
//    private static RestTemplate restTemplate;
//    private static HttpHeaders headers;
//    private static JSONObject clientInfoJsonObject;
//    private static String addNewClientInfo;

//    @BeforeClass
//    public static void runBeforeAllTestMethods() {
//        addNewClientInfo = "http://localhost:8080/greet/addNewClientInfo";
//
//
//        restTemplate = new RestTemplate();
//        headers = new HttpHeaders();
//        headers.setContentType(MediaType.APPLICATION_JSON);
//        clientInfoJsonObject = new JSONObject();
//        clientInfoJsonObject.put("CliId",99);
//        clientInfoJsonObject.put("firstName","bonus");
//        clientInfoJsonObject.put("gender","men");
//        clientInfoJsonObject.put("LastName","lour");
//        clientInfoJsonObject.put("dateBirth","bonus");
//
//    }

//    @Test
//    public void defaultpostmethod() throws IOException{
//        HttpEntity<String> request = new HttpEntity<String>(clientInfoJsonObject.toString(), headers);
//        System.out.println();;
//        String ClientInfoResultAsJsonStr = restTemplate.postForObject(addNewClientInfo, request, String.class);
//        JsonNode root = objectMapper.readTree(ClientInfoResultAsJsonStr);
//
//        assertNotNull(ClientInfoResultAsJsonStr);
//        assertNotNull(root);
//        assertNotNull(root.path("name").asText());
//    }

    @Test
    public void noParamGreetingShouldReturnDefaultMessage() throws Exception {

        this.mockMvc.perform(get("/greeting")).andDo(print()).andExpect(status().isOk())
                .andExpect(jsonPath("$.content").value("Hello, World!"));
    }

    @Test
    public void paramGreetingShouldReturnTailoredMessage() throws Exception {

        this.mockMvc.perform(get("/greeting").param("name", "Spring Community"))
                .andDo(print()).andExpect(status().isOk())
                .andExpect(jsonPath("$.content").value("Hello, Spring Community!"));
    }

//    @Test
//    public void postDefaultTest() throws IOException {
//        HttpEntity<String> request = new HttpEntity<String>(personJsonObject.toString(), headers);
//    }

}
